public class AddRadicals {

    char[][] AddRad(char[][] arr,int length, int offset){
            for (int j = 0; j < arr[0].length; j++){
                arr[offset][j] = SetRadical(length)[1][j];
            }
        return arr;
    }

    String AddName(String name,int length){
        StringBuilder nameredux = new StringBuilder(name);
        nameredux = nameredux.insert(0,SetName(length));
        name = nameredux.toString();
        return name;
    }

    String SetName(int length){
        switch (length){

            case 0:{
                return "метил";
            }
            case 1:{
                return "этил";
            }
            default:return null;
        }
    }

    char[][] SetRadical(int length){
        char[][] arr = new char[1][2];
        int i;
        for (i = 1; i > 1-length; i--){
            arr[0][i] = 'C';
        }
        return arr;
    }

}
