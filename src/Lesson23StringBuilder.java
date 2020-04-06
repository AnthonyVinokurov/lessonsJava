//StringBuilder
public class Lesson23StringBuilder {
    public static void main(String[] args){
        //Строка в Java не изменяемый объект
        String x = "Hello";
        x.toLowerCase();
        System.out.println(x);
        x = x.toLowerCase();
        System.out.println(x);

        String str1 = "Hello ";
        String str2 = " my ";
        String str3 = "friend";
        //Создаются 2 дополнительные строки
        String str0 = str1 + str2 + str3;

        System.out.println(str0);
        //==============================================
        StringBuilder sb = new StringBuilder("Hello!");
        System.out.println(sb.toString());
        sb.append(" My friend;");
        sb.append(" pls");
        System.out.println(sb.toString());

        //На той же строке
        System.out.print(sb.toString());
        //Форматированный вывод
        System.out.printf("Hello %d", 10);

    }
}
