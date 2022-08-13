import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ProteinTranslator {

    final private String STOP_NAME = "STOP";

    List<String> translate(String rnaSequence) {
        // split the rna string into sequences of 3 (codons)
        List<String> codons = new ArrayList<String>();
        int curPos = 0;
        while ( curPos + 3 <= rnaSequence.length() ) {
            codons.add(rnaSequence.substring(curPos, curPos + 3));
            curPos += 3;
        }

        // get the protein names from the codons until a stop is reached
        List<String> proteins = new ArrayList<String>();
        for ( String codon : codons ) {
            String protein = translateCodon(codon);
            if ( protein.equals(STOP_NAME) ) {
                break;
            }
            proteins.add(protein);
        }
        return proteins;
    }

    private String translateCodon(String codon) {
        String protein = STOP_NAME;
        switch (codon) {
            case "AUG":
                protein = "Methionine";
                break;

            case "UUU":
            case "UUC":
                protein = "Phenylalanine";
                break;

            case "UUA":
            case "UUG":
                protein = "Leucine";
                break;

            case "UCU":
            case "UCC":
            case "UCA":
            case "UCG":
                protein = "Serine";
                break;

            case "UAU":
            case "UAC":
                protein = "Tyrosine";
                break;

            case "UGU":
            case "UGC":
                protein = "Cysteine";
                break;

            case "UGG":
                protein = "Tryptophan";
                break;

        }

        return protein;
    }

}
