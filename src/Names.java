class Names {
    String line;

    Integer length() {

        int k = 0;
        String[] sarr = line.split("-");
        for (String s : sarr) {

            k++;

        }
        return k;

    }
}
