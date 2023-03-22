public class DNA {
    /** Program to determine if a strain of DNA is protein or not
     * 1. Must begin with a 'start codon' : ATG
     * 2. Must end with a 'stop codon': TGA
     * 3 In between, each aditional codon is a sequence of three nucleotides */

    public void checkProtein(String dna) {
        int start = dna.indexOf("ATG");
        int stop = dna.indexOf("TGA");

        if (start >= 0 && stop >= 0 && (stop - start) % 3 == 0) {
            String protein = dna.substring(start, stop + 3);
            System.out.println("Protein: " + protein);
        } else {
            System.out.println("No protein");
        }
    }
    public static void main(String[] args) {

        //  -. .-.   .-. .-.   .
        //    \   \ /   \   \ /
        //   / \   \   / \   \
        //  ~   `-~ `-`   `-~ `-

        // declare and assigned 3 Sting variables for dna strings and one to combine all 3.
        String dna1 ="ATGCGATACGCTTGA", dna2 = "ATGCGATACGTGA", dna3 = "ATTAATATGTACTGA", dna = dna1 + dna2 + dna3;

        DNA newDNA = new DNA();
        newDNA.checkProtein(dna1);
        newDNA.checkProtein(dna2);
        newDNA.checkProtein(dna3);










    }
}
