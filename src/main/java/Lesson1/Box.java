package Lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box <B extends Fruit> {
    List<B> list;

    public Box(B... list) {
        this.list = new ArrayList<>(Arrays.asList(list));
    }

    public List<B> getList() {
        return list;
    }

    public void add(B fruit) {
        this.list.add(fruit);
    }

    public float getWeight() {
        if (list.isEmpty()) {
            return 0.0F;
        } else {
            return (this.list.size() * this.list.get(0).getWeight());
        }
    }

    public boolean compare(Box<?> box) {
        return this.getWeight() == box.getWeight();
    }

    public void putInBox(Box <? super B> box) {
        if(this == box) return;
        box.getList().addAll(list);
        list.clear();
    }
}

