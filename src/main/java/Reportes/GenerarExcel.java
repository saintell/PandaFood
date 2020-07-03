package Reportes;

import DAO.IngresoDAO;
import DAO.SalidasDAO;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GenerarExcel {

    ResultSet rs;
    IngresoDAO iDao = new IngresoDAO();
    SalidasDAO sDao = new SalidasDAO();
    public String fechaInicio = "";
    public String fechaFin = "";

    public static String fechaActual() {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(fecha);
    }

    public XSSFCellStyle estiloCeldas(XSSFWorkbook book) {

        XSSFCellStyle estiloCeldas = book.createCellStyle();

        Font fontCells = book.createFont();
        fontCells.setFontHeightInPoints((short) 11);
        fontCells.setFontName("Calibri");

        estiloCeldas.setFillBackgroundColor(new XSSFColor(Color.decode("#d9e1f2")));
        estiloCeldas.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        estiloCeldas.setFillForegroundColor(new XSSFColor(Color.decode("#d9e1f2")));
        estiloCeldas.setFont(fontCells);
        estiloCeldas.setBorderTop(BorderStyle.THIN);
        estiloCeldas.setBorderBottom(BorderStyle.THIN);
        estiloCeldas.setBorderRight(BorderStyle.THIN);
        estiloCeldas.setBorderLeft(BorderStyle.THIN);

        return estiloCeldas;
    }

    public XSSFCellStyle estiloCabecera(XSSFWorkbook book) {

        XSSFCellStyle estiloCabecera = book.createCellStyle();

        Font header = book.createFont();
        header.setFontHeightInPoints((short) 14);
        header.setFontName("Calibri");
        header.setColor(IndexedColors.WHITE.getIndex());
        header.setBold(true);

        estiloCabecera.setFillBackgroundColor(new XSSFColor(Color.decode("#305496")));
        estiloCabecera.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        estiloCabecera.setFillForegroundColor(new XSSFColor(Color.decode("#305496")));
        estiloCabecera.setAlignment(HorizontalAlignment.CENTER);
        estiloCabecera.setFont(header);
        estiloCabecera.setBorderTop(BorderStyle.THIN);
        estiloCabecera.setBorderBottom(BorderStyle.THIN);
        estiloCabecera.setBorderRight(BorderStyle.THIN);
        estiloCabecera.setBorderLeft(BorderStyle.THIN);

        return estiloCabecera;
    }

    public XSSFCellStyle estiloSubCabecera(XSSFWorkbook book) {

        XSSFCellStyle estiloSubCabecera = book.createCellStyle();

        Font header = book.createFont();
        header.setFontHeightInPoints((short) 11);
        header.setFontName("Calibri");
        header.setBold(true);

        estiloSubCabecera.setFillBackgroundColor(new XSSFColor(Color.decode("#d9e1f2")));
        estiloSubCabecera.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        estiloSubCabecera.setFillForegroundColor(new XSSFColor(Color.decode("#d9e1f2")));
        estiloSubCabecera.setAlignment(HorizontalAlignment.CENTER);
        estiloSubCabecera.setFont(header);
        estiloSubCabecera.setBorderTop(BorderStyle.THIN);
        estiloSubCabecera.setBorderBottom(BorderStyle.THIN);
        estiloSubCabecera.setBorderRight(BorderStyle.THIN);
        estiloSubCabecera.setBorderLeft(BorderStyle.THIN);

        return estiloSubCabecera;
    }

    public void crearExcelDisponibles(String ruta) throws SQLException {

        XSSFWorkbook book = new XSSFWorkbook();
        XSSFSheet sheet = book.createSheet("Especies Disponibles");

        Row row = sheet.createRow(2);
        row.createCell(1).setCellValue("Nombre común");
        row.createCell(2).setCellValue("Nombre científico");
        row.createCell(3).setCellValue("Familia");
        row.createCell(4).setCellValue("msnm");
        row.createCell(5).setCellValue("Tamaño de Bolsa");
        row.createCell(6).setCellValue("Rango de Altura");
        row.createCell(7).setCellValue("Costo");
        row.createCell(8).setCellValue("Disponibles");

        for (int i = 1; i <= 8; i++) {
            row.getCell(i).setCellStyle(estiloTitulos(book));
        }

        Row cabecera = sheet.createRow(0);
        sheet.addMergedRegion(new CellRangeAddress(0, 0, 1, 8));
        cabecera.createCell(1).setCellValue("LISTA DE MATERIAL VEGETAL DISPONIBLE");
        for (int j = 2; j <= 8; j++) {
            cabecera.createCell(j).setCellValue("");
        }

        for (int j = 1; j <= 8; j++) {
            cabecera.getCell(j).setCellStyle(estiloCabecera(book));
        }

        Row subCabecera = sheet.createRow(1);
        sheet.addMergedRegion(new CellRangeAddress(1, 1, 1, 8));

        rs = iDao.buscarDisponibles();
        int i = 3;

        while (rs.next()) {

            Row rows = sheet.createRow((short) i);
            rows.createCell((short) 1).setCellValue(rs.getString("nombre_vulgar"));
            rows.createCell((short) 2).setCellValue(rs.getString("nombre_cientifico"));
            rows.createCell((short) 3).setCellValue(rs.getString("familia"));
            rows.createCell((short) 4).setCellValue(rs.getString("msnm"));
            rows.createCell((short) 5).setCellValue(rs.getString("tamaño_bolsa"));
            rows.createCell((short) 6).setCellValue(rs.getString("rango"));
            rows.createCell((short) 7).setCellValue(rs.getInt("costo"));
            rows.createCell((short) 8).setCellValue(rs.getInt("disponibles"));

            for (int j = 1; j <= 8; j++) {
                rows.getCell(j).setCellStyle(estiloCeldas(book));
            }

            i++;
        }

        subCabecera.createCell(1).setCellValue("Fecha: " + fechaActual());

        for (int j = 2; j <= 8; j++) {
            subCabecera.createCell(j).setCellValue("");
        }

        for (int j = 1; j <= 8; j++) {
            subCabecera.getCell(j).setCellStyle(estiloSubCabecera(book));
        }
        for (int j = 0; j <= 8; j++) {
            book.getSheetAt(0).autoSizeColumn(j);
        }

        try {
            FileOutputStream fileout = new FileOutputStream(ruta);
            book.write(fileout);
            fileout.close();
            Runtime.getRuntime().exec("rundll32 SHELL32.DLL,ShellExec_RunDLL " + ruta);

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    public void crearExcelDisponiblesDetallado(String ruta) throws SQLException {

        XSSFWorkbook book = new XSSFWorkbook();
        XSSFSheet sheet = book.createSheet("Especies Disponibles");

        Row row = sheet.createRow(2);
        row.createCell(1).setCellValue("Código de ingreso");
        row.createCell(2).setCellValue("Nombre común");
        row.createCell(3).setCellValue("Nombre científico");
        row.createCell(4).setCellValue("Familia");
        row.createCell(5).setCellValue("msnm");
        row.createCell(6).setCellValue("Tamaño de Bolsa");
        row.createCell(7).setCellValue("Rango de Altura");
        row.createCell(8).setCellValue("Costo");
        row.createCell(9).setCellValue("Stock");
        row.createCell(10).setCellValue("Reservadas");
        row.createCell(11).setCellValue("Disponibles");

        for (int i = 1; i <= 11; i++) {
            row.getCell(i).setCellStyle(estiloTitulos(book));
        }

        Row cabecera = sheet.createRow(0);
        sheet.addMergedRegion(new CellRangeAddress(0, 0, 1, 11));
        cabecera.createCell(1).setCellValue("LISTA DE MATERIAL VEGETAL DISPONIBLE DETALLADO");
        for (int j = 2; j <= 11; j++) {
            cabecera.createCell(j).setCellValue("");
        }

        for (int j = 1; j <= 11; j++) {
            cabecera.getCell(j).setCellStyle(estiloCabecera(book));
        }

        Row subCabecera = sheet.createRow(1);
        sheet.addMergedRegion(new CellRangeAddress(1, 1, 1, 11));

        rs = iDao.buscarDisponibles();
        int i = 3;

        while (rs.next()) {

            Row rows = sheet.createRow((short) i);
            rows.createCell((short) 1).setCellValue(rs.getInt("codigo_ingreso"));
            rows.createCell((short) 2).setCellValue(rs.getString("nombre_vulgar"));
            rows.createCell((short) 3).setCellValue(rs.getString("nombre_cientifico"));
            rows.createCell((short) 4).setCellValue(rs.getString("familia"));
            rows.createCell((short) 5).setCellValue(rs.getString("msnm"));
            rows.createCell((short) 6).setCellValue(rs.getString("tamaño_bolsa"));
            rows.createCell((short) 7).setCellValue(rs.getString("rango"));
            rows.createCell((short) 8).setCellValue(rs.getInt("costo"));
            rows.createCell((short) 9).setCellValue(rs.getInt("stock"));
            rows.createCell((short) 10).setCellValue(rs.getInt("reservas"));
            rows.createCell((short) 11).setCellValue(rs.getInt("disponibles"));

            for (int j = 1; j <= 11; j++) {
                rows.getCell(j).setCellStyle(estiloCeldas(book));
            }

            i++;
        }

        subCabecera.createCell(1).setCellValue("Fecha: " + fechaActual());

        for (int j = 2; j <= 11; j++) {
            subCabecera.createCell(j).setCellValue("");
        }

        for (int j = 1; j <= 11; j++) {
            subCabecera.getCell(j).setCellStyle(estiloSubCabecera(book));
        }
        for (int j = 0; j <= 11; j++) {
            book.getSheetAt(0).autoSizeColumn(j);
        }

        try {
            FileOutputStream fileout = new FileOutputStream(ruta);
            book.write(fileout);
            fileout.close();
            Runtime.getRuntime().exec("rundll32 SHELL32.DLL,ShellExec_RunDLL " + ruta);

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    public XSSFCellStyle estiloTitulos(XSSFWorkbook book) {

        XSSFCellStyle estiloTitulo = book.createCellStyle();

        Font font = book.createFont();
        font.setFontHeightInPoints((short) 11);
        font.setFontName("Calibri");
        font.setColor(IndexedColors.WHITE.getIndex());
        font.setBold(true);

        estiloTitulo.setFillBackgroundColor(new XSSFColor(Color.decode("#2f75b5")));
        estiloTitulo.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        estiloTitulo.setFillForegroundColor(new XSSFColor(Color.decode("#2f75b5")));
        estiloTitulo.setAlignment(HorizontalAlignment.CENTER);
        estiloTitulo.setFont(font);
        estiloTitulo.setBorderTop(BorderStyle.THIN);
        estiloTitulo.setBorderBottom(BorderStyle.THIN);
        estiloTitulo.setBorderRight(BorderStyle.THIN);
        estiloTitulo.setBorderLeft(BorderStyle.THIN);

        return estiloTitulo;
    }

    public void crearExcelTodas(String ruta) throws SQLException {

        XSSFWorkbook book = new XSSFWorkbook();
        XSSFSheet sheet = book.createSheet("Todas las especies");

        Row row = sheet.createRow(2);
        row.createCell(1).setCellValue("Código de ingreso");
        row.createCell(2).setCellValue("Nombre común");
        row.createCell(3).setCellValue("Nombre científico");
        row.createCell(4).setCellValue("Familia");
        row.createCell(5).setCellValue("msnm");
        row.createCell(6).setCellValue("Tamaño de Bolsa");
        row.createCell(7).setCellValue("Rango de Altura");
        row.createCell(8).setCellValue("Costo");
        row.createCell(9).setCellValue("Stock");
        row.createCell(10).setCellValue("Reservadas");
        row.createCell(11).setCellValue("Disponibles");

        for (int i = 1; i <= 11; i++) {

            row.getCell(i).setCellStyle(estiloTitulos(book));
        }

        Row cabecera = sheet.createRow(0);
        sheet.addMergedRegion(new CellRangeAddress(0, 0, 1, 11));
        cabecera.createCell(1).setCellValue("LISTA DE TODAS LAS ESPECIES");
        for (int i = 2; i <= 11; i++) {
            cabecera.createCell(i).setCellValue("");
        }

        for (int i = 1; i <= 11; i++) {
            cabecera.getCell(i).setCellStyle(estiloCabecera(book));
        }

        Row subCabecera = sheet.createRow(1);
        sheet.addMergedRegion(new CellRangeAddress(1, 1, 1, 11));
        subCabecera.createCell(1).setCellValue("Fecha: " + fechaActual());
        for (int i = 2; i <= 11; i++) {
            subCabecera.createCell(i).setCellValue("Fecha: ");
        }
        for (int i = 1; i <= 11; i++) {
            subCabecera.getCell(i).setCellStyle(estiloSubCabecera(book));
        }

        rs = iDao.buscarTodas();
        int i = 3;

        while (rs.next()) {

            Row rows = sheet.createRow((short) i);
            rows.createCell((short) 1).setCellValue(rs.getInt("codigo_ingreso"));
            rows.createCell((short) 2).setCellValue(rs.getString("nombre_vulgar"));
            rows.createCell((short) 3).setCellValue(rs.getString("nombre_cientifico"));
            rows.createCell((short) 4).setCellValue(rs.getString("familia"));
            rows.createCell((short) 5).setCellValue(rs.getString("msnm"));
            rows.createCell((short) 6).setCellValue(rs.getString("tamaño_bolsa"));
            rows.createCell((short) 7).setCellValue(rs.getString("rango"));
            rows.createCell((short) 8).setCellValue(rs.getInt("costo"));
            rows.createCell((short) 9).setCellValue(rs.getInt("stock"));
            rows.createCell((short) 10).setCellValue(rs.getInt("reservas"));
            rows.createCell((short) 11).setCellValue(rs.getInt("disponibles"));
            i++;

            for (int j = 1; j <= 11; j++) {
                rows.getCell(j).setCellStyle(estiloCeldas(book));
            }
        }

        for (int j = 0; j <= 11; j++) {

            book.getSheetAt(0).autoSizeColumn(j);
        }

        try {
            FileOutputStream fileout = new FileOutputStream(ruta);
            book.write(fileout);
            fileout.close();
            Runtime.getRuntime().exec("rundll32 SHELL32.DLL,ShellExec_RunDLL " + ruta);

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    public void crearExcelSalidas(String ruta, String motivo, String desde, String hasta) throws SQLException {

        XSSFWorkbook book = new XSSFWorkbook();
        XSSFSheet sheet = book.createSheet("Salidas en un rango de tiempo");

        Row row = sheet.createRow(2);
        row.createCell(1).setCellValue("Fecha");
        row.createCell(2).setCellValue("Código de salida");
        row.createCell(3).setCellValue("Motivo");
        row.createCell(4).setCellValue("Municipio");
        row.createCell(5).setCellValue("Predio");
        row.createCell(6).setCellValue("Total material vegetal");
        row.createCell(7).setCellValue("Cédula/NIT Cliente");
        row.createCell(8).setCellValue("Nombre Cliente");
        row.createCell(9).setCellValue("Celular Cliente");
        row.createCell(10).setCellValue("Cédula Conductor");
        row.createCell(11).setCellValue("Nombre Conductor");
        row.createCell(12).setCellValue("Celular Conductor");

        for (int i = 1; i <= 12; i++) {
            row.getCell(i).setCellStyle(estiloTitulos(book));

        }

        Row cabecera = sheet.createRow(0);
        sheet.addMergedRegion(new CellRangeAddress(0, 0, 1, 12));
        cabecera.createCell(1).setCellValue("SALIDAS ENTRE " + fechaInicio + " Y " + fechaFin);
        for (int j = 2; j <= 12; j++) {
            cabecera.createCell(j).setCellValue("");
        }

        for (int j = 1; j <= 12; j++) {
            cabecera.getCell(j).setCellStyle(estiloCabecera(book));
        }

        Row subCabecera = sheet.createRow(1);
        sheet.addMergedRegion(new CellRangeAddress(1, 1, 1, 12));

        rs = sDao.buscarExcelSalida(motivo, desde, hasta);

        int i = 3;
        int totalMaterial = 0;
        int cantidad = 0;

        while (rs.next()) {

            Row rows = sheet.createRow((short) i);
            rows.createCell((short) 1).setCellValue(rs.getString("fecha"));
            rows.createCell((short) 2).setCellValue(rs.getInt("codigo_salida"));
            rows.createCell((short) 3).setCellValue(rs.getString("motivo"));
            rows.createCell((short) 4).setCellValue(rs.getString("destino"));
            rows.createCell((short) 5).setCellValue(rs.getString("predio"));
            rows.createCell((short) 6).setCellValue(rs.getInt("ctotal"));
            rows.createCell((short) 7).setCellValue(rs.getString("id_cliente"));
            rows.createCell((short) 8).setCellValue(rs.getString("nombre"));
            rows.createCell((short) 9).setCellValue(rs.getString("celular"));
            rows.createCell((short) 10).setCellValue(rs.getInt("id_conductor"));
            rows.createCell((short) 11).setCellValue(rs.getString("nombreco"));
            rows.createCell((short) 12).setCellValue(rs.getString("celularco"));

            totalMaterial += rs.getInt("ctotal");
            cantidad += 1;

            for (int j = 1; j <= 12; j++) {
                rows.getCell(j).setCellStyle(estiloCeldas(book));
            }

//
            i++;
        }

        subCabecera.createCell(1).setCellValue("Fecha: " + fechaActual() + " / N° de salidas en este rango de tiempo: " + cantidad + " / Salieron " + totalMaterial + " especies en total");

        for (int j = 2; j <= 12; j++) {
            subCabecera.createCell(j).setCellValue("");
        }

        for (int j = 1; j <= 12; j++) {
            subCabecera.getCell(j).setCellStyle(estiloSubCabecera(book));
        }
        for (int j = 0; j <= 12; j++) {
            book.getSheetAt(0).autoSizeColumn(j);
        }

        try {
            FileOutputStream fileout = new FileOutputStream(ruta);
            book.write(fileout);
            fileout.close();
            Runtime.getRuntime().exec("rundll32 SHELL32.DLL,ShellExec_RunDLL " + ruta);

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    public void crearExcelSalidasDetallado(String ruta, String motivo, String desde, String hasta, String cedula) throws SQLException {

        XSSFWorkbook book = new XSSFWorkbook();
        XSSFSheet sheet = book.createSheet("Salidas de un cliente en específico");

        Row row = sheet.createRow(2);
        row.createCell(1).setCellValue("Fecha");
        row.createCell(2).setCellValue("Código de salida");
        row.createCell(3).setCellValue("Motivo");
        row.createCell(4).setCellValue("Municipio");
        row.createCell(5).setCellValue("Predio");
        row.createCell(6).setCellValue("Total material vegetal");
        row.createCell(7).setCellValue("Cédula/NIT Cliente");
        row.createCell(8).setCellValue("Nombre Cliente");
        row.createCell(9).setCellValue("Celular Cliente");
        row.createCell(10).setCellValue("Cédula Conductor");
        row.createCell(11).setCellValue("Nombre Conductor");
        row.createCell(12).setCellValue("Celular Conductor");

        for (int i = 1; i <= 12; i++) {
            row.getCell(i).setCellStyle(estiloTitulos(book));
        }

        Row cabecera = sheet.createRow(0);
        sheet.addMergedRegion(new CellRangeAddress(0, 0, 1, 12));

        Row subCabecera = sheet.createRow(1);
        sheet.addMergedRegion(new CellRangeAddress(1, 1, 1, 12));

        rs = sDao.buscarExcelSalidaDetallado(motivo, desde, hasta, cedula);
        int i = 3;
        int totalMaterial = 0;
        int cantidad = 0;
        String nombre = "";

        while (rs.next()) {

            Row rows = sheet.createRow((short) i);
            rows.createCell((short) 1).setCellValue(rs.getString("fecha"));
            rows.createCell((short) 2).setCellValue(rs.getInt("codigo_salida"));
            rows.createCell((short) 3).setCellValue(rs.getString("motivo"));
            rows.createCell((short) 4).setCellValue(rs.getString("destino"));
            rows.createCell((short) 5).setCellValue(rs.getString("predio"));
            rows.createCell((short) 6).setCellValue(rs.getInt("ctotal"));
            rows.createCell((short) 7).setCellValue(rs.getString("id_cliente"));
            rows.createCell((short) 8).setCellValue(rs.getString("nombre"));
            rows.createCell((short) 9).setCellValue(rs.getString("celular"));
            rows.createCell((short) 10).setCellValue(rs.getInt("id_conductor"));
            rows.createCell((short) 11).setCellValue(rs.getString("nombreco"));
            rows.createCell((short) 12).setCellValue(rs.getString("celularco"));

            totalMaterial += rs.getInt("ctotal");
            cantidad += 1;
            nombre = rs.getString("nombre");

            for (int j = 1; j <= 12; j++) {
                rows.getCell(j).setCellStyle(estiloCeldas(book));
            }

//
            i++;
        }

        cabecera.createCell(1).setCellValue("SALIDAS PARA EL CLIENTE " + nombre + " ID: " + cedula);
        for (int j = 2; j <= 12; j++) {
            cabecera.createCell(j).setCellValue("");
        }

        for (int j = 1; j <= 12; j++) {
            cabecera.getCell(j).setCellStyle(estiloCabecera(book));
        }

        subCabecera.createCell(1).setCellValue("Fecha: " + fechaActual() + " / N° de salidas para el cliente: " + cantidad + " / Salieron " + totalMaterial + " especies en total");

        for (int j = 2; j <= 12; j++) {
            subCabecera.createCell(j).setCellValue("");
        }

        for (int j = 1; j <= 12; j++) {
            subCabecera.getCell(j).setCellStyle(estiloSubCabecera(book));
        }
        for (int j = 0; j <= 12; j++) {
            book.getSheetAt(0).autoSizeColumn(j);
        }

        try {
            FileOutputStream fileout = new FileOutputStream(ruta);
            book.write(fileout);
            fileout.close();
            Runtime.getRuntime().exec("rundll32 SHELL32.DLL,ShellExec_RunDLL " + ruta);

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    public void crearExcelSalidasEspecifico(String ruta, String codigo) throws SQLException {

        XSSFWorkbook book = new XSSFWorkbook();
        XSSFSheet sheet = book.createSheet("Salida detallada");

        Row row = sheet.createRow(2);
        row.createCell(1).setCellValue("Fecha");
        row.createCell(2).setCellValue("Código de salida");
        row.createCell(3).setCellValue("Motivo");
        row.createCell(4).setCellValue("Municipio");
        row.createCell(5).setCellValue("Predio");
        row.createCell(6).setCellValue("Cédula/NIT Cliente");
        row.createCell(7).setCellValue("Nombre Cliente");
        row.createCell(8).setCellValue("Celular Cliente");
        row.createCell(9).setCellValue("Cédula Conductor");
        row.createCell(10).setCellValue("Nombre Conductor");
        row.createCell(11).setCellValue("Celular Conductor");

        for (int i = 1; i <= 11; i++) {
            row.getCell(i).setCellStyle(estiloTitulos(book));
        }

        Row cabecera = sheet.createRow(0);
        sheet.addMergedRegion(new CellRangeAddress(0, 0, 1, 11));

        Row subCabecera = sheet.createRow(1);
        sheet.addMergedRegion(new CellRangeAddress(1, 1, 1, 11));

        Row cabecera2 = sheet.createRow(4);
        sheet.addMergedRegion(new CellRangeAddress(4, 4, 1, 11));

        rs = sDao.buscarExcelSalidaEspecifico(codigo);
        ResultSet rs1 = sDao.buscarExcelInfoSalida(codigo);
        int totalMaterial = 0;
        int i = 6;

        if (rs1.next()) {

            Row rows = sheet.createRow((short) 3);
            rows.createCell((short) 1).setCellValue(rs1.getString("fecha"));
            rows.createCell((short) 2).setCellValue(rs1.getInt("codigo_salida"));
            rows.createCell((short) 3).setCellValue(rs1.getString("motivo"));
            rows.createCell((short) 4).setCellValue(rs1.getString("destino"));
            rows.createCell((short) 5).setCellValue(rs1.getString("predio"));
            rows.createCell((short) 6).setCellValue(rs1.getString("id_cliente"));
            rows.createCell((short) 7).setCellValue(rs1.getString("nombre"));
            rows.createCell((short) 8).setCellValue(rs1.getString("celular"));
            rows.createCell((short) 9).setCellValue(rs1.getInt("id_conductor"));
            rows.createCell((short) 10).setCellValue(rs1.getString("nombreco"));
            rows.createCell((short) 11).setCellValue(rs1.getString("celularco"));

            for (int j = 1; j <= 11; j++) {

                rows.getCell(j).setCellStyle(estiloCeldas(book));
            }
        }

        Row titulos = sheet.createRow((short) 5);
        titulos.createCell(1).setCellValue("Código");
        titulos.createCell(2).setCellValue("Nombre común");
        titulos.createCell(3).setCellValue("Nombre científico");
        titulos.createCell(4).setCellValue("Familia");
        titulos.createCell(5).setCellValue("msnm");
        titulos.createCell(6).setCellValue("Tamaño de bolsa");
        titulos.createCell(7).setCellValue("Rango de altura");
        titulos.createCell(8).setCellValue("Cantidad");
        titulos.createCell(9).setCellValue("En stock");
        titulos.createCell(10).setCellValue("Reservadas");
        titulos.createCell(11).setCellValue("Disponibles");

        for (int j = 1; j <= 11; j++) {
            titulos.getCell(j).setCellStyle(estiloTitulos(book));
        }
//
        while (rs.next()) {

            Row plants = sheet.createRow((short) i);
            plants.createCell((short) 1).setCellValue(rs.getInt("codigo_ingreso"));
            plants.createCell((short) 2).setCellValue(rs.getString("nombre_vulgar"));
            plants.createCell((short) 3).setCellValue(rs.getString("nombre_cientifico"));
            plants.createCell((short) 4).setCellValue(rs.getString("familia"));
            plants.createCell((short) 5).setCellValue(rs.getString("msnm"));
            plants.createCell((short) 6).setCellValue(rs.getString("tamaño_bolsa"));
            plants.createCell((short) 7).setCellValue(rs.getString("rango"));
            plants.createCell((short) 8).setCellValue(rs.getInt("cantidad"));
            plants.createCell((short) 9).setCellValue(rs.getInt("stock"));
            plants.createCell((short) 10).setCellValue(rs.getInt("reservas"));
            plants.createCell((short) 11).setCellValue(rs.getInt("disponibles"));
            totalMaterial += rs.getInt("cantidad");

            for (int j = 1; j <= 11; j++) {
                plants.getCell(j).setCellStyle(estiloCeldas(book));
            }
            i++;
        }

        cabecera.createCell(1).setCellValue("SALIDA DETALLADA");
        for (int j = 2; j <= 11; j++) {
            cabecera.createCell(j).setCellValue("");
        }

        for (int j = 1; j <= 11; j++) {
            cabecera.getCell(j).setCellStyle(estiloCabecera(book));
        }

        subCabecera.createCell(1).setCellValue("Fecha actual: " + fechaActual() + " / Salieron " + totalMaterial + " especies en total");

        for (int j = 2; j <= 11; j++) {
            subCabecera.createCell(j).setCellValue("");
        }

        for (int j = 1; j <= 11; j++) {
            subCabecera.getCell(j).setCellStyle(estiloSubCabecera(book));
        }

        cabecera2.createCell(1).setCellValue("MATERIAL VEGETAL DE LA SALIDA");
        for (int j = 2; j <= 11; j++) {
            cabecera2.createCell(j).setCellValue("");
        }

        for (int j = 1; j <= 11; j++) {
            cabecera2.getCell(j).setCellStyle(estiloCabecera(book));
        }

        for (int j = 0; j <= 11; j++) {
            book.getSheetAt(0).autoSizeColumn(j);
        }

        try {
            FileOutputStream fileout = new FileOutputStream(ruta);
            book.write(fileout);
            fileout.close();
            Runtime.getRuntime().exec("rundll32 SHELL32.DLL,ShellExec_RunDLL " + ruta);

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

}
