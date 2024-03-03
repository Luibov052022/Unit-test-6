import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MiddleTest {

    @Test
    void countMiddle() {
        List list = new ArrayList<>(Arrays.asList(1, 2, 3));
        Middle m = new Middle();

        assertThat(m.countMiddle(list)).isEqualTo(2);
    }

    @Test
    void compareTestList2(){
        Middle m = new Middle();
        Сomparison c = new Сomparison(m);
        List list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List list2 = new ArrayList<>(Arrays.asList(4, 5, 6));

        assertThat(c.compare(list1, list2)).isEqualTo("Второй список имеет большее среднее значение");
    }

    @Test
    void compareTestList1(){
        Middle m = new Middle();
        Сomparison c = new Сomparison(m);
        List list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List list2 = new ArrayList<>(Arrays.asList(4, 5, 6));

        assertThat(c.compare(list2, list1)).isEqualTo("Первый список имеет большее среднее значение");
    }
    @Test
    void compareTestLists(){
        Middle m = new Middle();
        Сomparison c = new Сomparison(m);
        List list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List list2 = new ArrayList<>(Arrays.asList(1, 2, 3));

        assertThat(c.compare(list1, list2)).isEqualTo("Средние значения равны");
    }

}