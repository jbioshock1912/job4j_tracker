package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        Item[] result = new Item[items.length];
        int size = 0;
        for (Item itemForCheck : items) {
            if (itemForCheck != null) {
                result[size] = itemForCheck;
                size++;
            }
        }
        result = Arrays.copyOf(result, size);
        return result;
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[items.length];
        int size = 0;
        for (Item itemForCheck : items) {
            if (itemForCheck != null && key.equals(itemForCheck.getName())) {
                result[size] = itemForCheck;
                size++;
            }
        }
        result = Arrays.copyOf(result, size);
        return result;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            int idOldItem = items[index].getId();
            item.setId(idOldItem);
            items[index] = item;
        }
        return rsl;
    }

    public void delete(int id) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            System.arraycopy(items, index + 1, items, index, size - index - 1);
            items[size - 1] = null;
            size--;
        }
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }
}