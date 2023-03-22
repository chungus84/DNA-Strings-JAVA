public class DNA {
    /** Program to determine if a strain of DNA is protein or not
     * 1. Must begin with a 'start codon' : ATG
     * 2. Must end with a 'stop codon': TGA
     * 3 In between, each aditional codon is a sequence of three nucleotides */
    public static void main(String[] args) {

        //  -. .-.   .-. .-.   .
        //    \   \ /   \   \ /
        //   / \   \   / \   \
        //  ~   `-~ `-`   `-~ `-

        // declare and assigned 3 Sting variables for dna strings and one to combine all 3.
        String dna1 ="ATGCGATACGCTTGA", dna2 = "ATGCGATACGTGA", dna3 = "ATTAATATGTACTGA", dna = dna1 + dna2 + dna3;

        System.out.println(dna.length());
        int condonStart = dna.indexOf("ATG");
        int condonEnd = dna.indexOf("TGA");

        if (condonStart != -1 && condonEnd != -1 && (condonEnd - condonStart) % 3 == 0) {
            String protein = dna.substring(condonStart, condonEnd + 3);
            System.out.println("Protein: " + protein);
        }




    }
}
