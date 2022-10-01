//1
int[] array = 
        Arrays
        .asList(strings) // формирует список на основе массива
        .stream() //позволяет обернуть наш массив и получить из него стрим
        .mapToInt(Integer::parseInt) // mapToInt промежуточная операциия, которая возвращает IntStream, состоящий из результатов применения данной функции к элементам этого потока.
        .toArray(); // toArray() - преобразуем список элементов в массив
        
        
//2        
private void processLine(String[] strings) { // метод принимающий массив строк
    Integer[] intarray=new Integer[strings.length]; // новый массив целых чисел 
    int i=0;
    for(String str:strings){ // перебираем строки в масиве строк
        try { // проверяем 
            intarray[i]=Integer.parseInt(str);// если строку нельзя преобразовать в число, сработоет исключение и элемент не добавиться 
            i++;
        } catch (NumberFormatException e) { // исключение сообщит
            throw new IllegalArgumentException("Not a number: " + str + " at index " + i, e);// сообщат какая строка 
        }
    }
}
