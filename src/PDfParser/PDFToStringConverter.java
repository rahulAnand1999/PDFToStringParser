package PDfParser;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

public class PDFToStringConverter {

    public static void main(String[] args) {

        try (PDDocument document = Loader.loadPDF(new File("src/PDfParser/doc.pdf"))) {
            PDFTextStripper textStripper = new PDFTextStripper();
            String text = textStripper.getText(document);
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
