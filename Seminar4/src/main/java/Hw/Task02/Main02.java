package Hw.Task02;

import java.util.Stack;

/**Учитывая строку s, содержащую только символы '(', ')', '{', и , определите '}', допустима ли входная строка.'['']'
 Входная строка действительна, если:
 Открытые скобки должны быть закрыты однотипными скобками.
 Открытые скобки должны быть закрыты в правильном порядке.
 Каждой закрывающей скобке соответствует открытая скобка того же типа.
 Пример 1:

 Ввод: s = "()"
 Вывод: правда
 Пример 2:

 Ввод: s = "()[]{}"
 Вывод: правда
 *
 */


public class Main02 {
    public static void main(String[] args) {
        String text = "( { } [ ])";
        System.out.println(Valid(text));
    }

    public static boolean Valid(String s){
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            switch (ch) {
                case '(':
                case '{':
                case '[':
                    stack.push(ch);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }
}