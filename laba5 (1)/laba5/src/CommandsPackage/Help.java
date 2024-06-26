package CommandsPackage;


public class Help extends Invoker{
    public void help(){
        System.out.println("info : вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)\n"+
        "show : вывести в стандартный поток вывода все элементы коллекции в строковом представлении\n"+
        "add {element} : добавить новый элемент в коллекцию\n"+
        "update id {element} : обновить значение элемента коллекции, id которого равен заданному\n"+
        "remove_by_id id : удалить элемент из коллекции по его id\n"+
        "clear : очистить коллекцию\n"+
        "save : сохранить коллекцию в файл\n"+
        "execute_script file_name : считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.\n"+
        "exit : завершить программу (без сохранения в файл)\n"+
        "add_if_max {element} : добавить новый элемент в коллекцию, если его значение превышает значение наибольшего элемента этой коллекции\n"+
        "remove_greater {element} : удалить из коллекции все элементы, превышающие заданный\n"+
        "history : вывести последние 12 команд (без их аргументов)\n"+
        "average_of_height : вывести среднее значение поля height для всех элементов коллекции\n"+
        "group_counting_by_area : сгруппировать элементы коллекции по значению поля area, вывести количество элементов в каждой группе\n"+
        "print_unique_house : вывести уникальные значения поля house всех элементов в коллекции");
    }
    @Override
    public void invoke(){
        help();
    }
    
}
