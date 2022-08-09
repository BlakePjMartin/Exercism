
class Matrix {

    private int[][] matrixData;
    private int numRows = 0;
    private int numCols = 0;

    Matrix(String matrixAsString) {
        // split the string at newline characters
        // from that we can count the rows
        String[] rows = matrixAsString.split("\\R");
        numRows = rows.length;

        // a boolean to initialize the matrixData module member
        boolean isInitialized = false;

        // iterate over each row string and populate the matrix data
        String[] curRowVals;
        for (int i = 0; i < numRows; i++) {
            curRowVals = rows[i].split(" ");
            if ( !isInitialized ) {
                numCols = curRowVals.length;
                matrixData = new int[numRows][numCols];
                isInitialized = true;
            }

            for (int j = 0; j < numCols; j++) {
                matrixData[i][j] = Integer.parseInt(curRowVals[j]);
            }
        }
    }

    int[] getRow(int rowNumber) {
        return matrixData[rowNumber - 1].clone();
    }

    int[] getColumn(int columnNumber) {
        int[] res = new int[numRows];
        for (int i = 0; i < numRows; i++) {
            res[i] = matrixData[i][columnNumber - 1];
        }
        return res;
    }

}
