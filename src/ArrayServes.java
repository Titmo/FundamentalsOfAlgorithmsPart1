public class ArrayServes implements StringList {
    int size = 0;
    int sizeArrays = 10;
    Array[] arrays = new Array[sizeArrays];

    public void all() {
        for (int i = 0; i < size; i++) {
            System.out.println(arrays[i].toString());
        }
    }

    @Override
    public String add(String item) {
        arrays[size] = new Array(size + 1, item);
        size++;
        return arrays[(size - 1)].toString();
    }

    @Override
    public String add(int index, String item) {
        if (index < sizeArrays) {
            if (index >= size) {
                arrays[size] = new Array(index, item);
                size++;
                return arrays[index - 1].toString();
            } else {
                arrays[index - 1].setArray(item);
                return arrays[index - 1].toString();

            }
        } else {
            return "size меньше";
        }

    }

    @Override
    public String set(int index, String item) {
        if (index < sizeArrays || index > size) {
            arrays[index - 1].setArray(item);
            return arrays[index - 1].toString();
        } else {
            return "size меньше";
        }
    }

    @Override
    public String remove(String item) {
        for (int i = 0; i < size; i++) {
            if (arrays[i].getArray().equals(item)) {
                for (int j = i; j < size; j++) {
                    if (size != j + 1) {
                        arrays[j + 1].setId((arrays[j + 1].getId() - 1));
                        arrays[j] = arrays[j + 1];
                    } else {
                        arrays[j] = null;
                        size--;
                    }
                }
                return arrays[i].toString();
            } else {
                return "нет такого";
            }
        }

        return "нет такого";
    }

    @Override
    public String remove(int index) {
        if (index < sizeArrays || index > size) {
            arrays[index - 1] = null;
            for (int j = index - 1; j < size; j++) {
                if (size != j + 1) {
                    arrays[j + 1].setId((arrays[j + 1].getId() - 1));
                    arrays[j] = arrays[j + 1];
                } else {
                    arrays[j] = null;
                    size--;
                }
            }
            return arrays[index - 1].toString();

        } else {
            return "нет такого";
        }
    }

    @Override
    public boolean contains(String item) {
        for (int i = 0; i < size; i++) {
            if (arrays[i].getArray().equals(item)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(String item) {
        for (int i = 0; i < size; i++) {
            if (arrays[i].getArray().equals(item)) {
                return arrays[i].getId();
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(String item) {
        for (int i = size - 1; i >= 0; i--) {
            if (arrays[i].getArray().equals(item)) {
                return arrays[i].getId();
            }
        }
        return -1;
    }

    @Override
    public String get(int index) {
        if (index<=size) {
            return arrays[index - 1].toString();
        }
        return "нет такого";
    }

    @Override
    public boolean equals(StringList otherList) {
        return arrays.equals(otherList);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            arrays[i]=null;
        }
        size=0;
    }

    @Override
    public String[] toArray() {
        return new String[0];
    }
}
