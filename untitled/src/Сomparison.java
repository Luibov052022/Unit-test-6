import java.util.List;

public class Сomparison {
private Middle middle;
private List list1;
private List list2;

    public Сomparison(Middle middle) {
        this.middle = middle;
    }

public String compare(List list1, List list2) {
    if (middle.countMiddle(list1) > middle.countMiddle(list2)) {
        return "Первый список имеет большее среднее значение";
    }
    if (middle.countMiddle(list1) < middle.countMiddle(list2)) {
        return "Второй список имеет большее среднее значение";
    }
    if (middle.countMiddle(list1) == middle.countMiddle(list2)) {
        return "Средние значения равны";
    }

    return null;
}
}
