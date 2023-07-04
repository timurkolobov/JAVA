
public class Seminar1_2 {
    public static void main(String[] args) {
        int[][] matrix = {{0,1,1},{0,0,0},{0,0,0}};
        int result = sumElements(matrix);
        System.out.println(result);

    }
    public static int sumElements(int[][] matrix) {
        
        for (int[] row: matrix){
            if (matrix.length != row.length) {
                throw new RuntimeException("РњР°СЃСЃРёРІ РЅРµ РєРІР°РґСЂР°С‚РЅС‹Р№");
            }
        }
        
        for (int[] row: matrix) {
            for (int element : row) {
                if (element != 0 && element != 1) {
                    throw new RuntimeException("РњРѕРіСѓС‚ Р±С‹С‚СЊ С‚РѕР»СЊРєРѕ Р·РЅР°С‡РµРЅРёРµ 0 РёР»Рё 1");
                }
            }
        }

        int sum = 0;
        for (int[] row: matrix) {
            for (int element : row) {
                sum += element;
            }
        }

    return sum;
    }

}