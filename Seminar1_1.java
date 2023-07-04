public class Seminar1_1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int min_length = 8;
        int element = 2;
        int result = searchElement(arr, min_length, element);
        System.out.println(result);
        translateResult(result);

    }
    public static int searchElement(int[] arr, int min_length, int element) {
        //РµСЃР»Рё РІРјРµСЃС‚Рѕ РјР°СЃСЃРёРІР° РїСЂРёС€РµР» null, РјРµС‚РѕРґ РІРµСЂРЅРµС‚ -3
        if (arr == null) {
            return -3;
        }
        //РµСЃР»Рё РґР»РёРЅР° РјР°СЃСЃРёРІР° РјРµРЅСЊС€Рµ РЅРµРєРѕС‚РѕСЂРѕРіРѕ Р·Р°РґР°РЅРЅРѕРіРѕ РјРёРЅРёРјСѓРјР°, РјРµС‚РѕРґ РІРѕР·РІСЂР°С‰Р°РµС‚ -1 РІ РєР°С‡РµСЃС‚РІРµ РєРѕРґР° РѕС€РёР±РєРё.
         if (arr.length < min_length) {
            return -1;
        }
        //РІРѕР·РІСЂР°С‰Р°РµС‚ РµРіРѕ РёРЅРґРµРєСЃ
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        //РµСЃР»Рё РёСЃРєРѕРјС‹Р№ СЌР»РµРјРµРЅС‚ РЅРµ РЅР°Р№РґРµРЅ, РјРµС‚РѕРґ РІРµСЂРЅРµС‚ -2 РІ РєР°С‡РµСЃС‚РІРµ РєРѕРґР° РѕС€РёР±РєРё.
        return -2;
    }
    public static void translateResult(int result){
        if (result == -1){
            System.out.println("Р”Р»РёРЅР° РјР°СЃСЃРёРІР° РјРµРЅСЊС€Рµ РЅРµРєРѕС‚РѕСЂРѕРіРѕ Р·Р°РґР°РЅРЅРѕРіРѕ РјРёРЅРёРјСѓРјР°");
        } else if (result == -2){
            System.out.println("РСЃРєРѕРјС‹Р№ СЌР»РµРјРµРЅС‚ РЅРµ РЅР°Р№РґРµРЅ");
        }
        else if (result == -3){
            System.out.println("Р’РјРµСЃС‚Рѕ РјР°СЃСЃРёРІР° РїСЂРёС€РµР» null");
        }
        else {
            System.out.printf("РРЅРґРµРєСЃ РёСЃРєРѕРјРѕРіРѕ СЌР»РµРјРµРЅС‚Р° %d", result);
        }

    }

}