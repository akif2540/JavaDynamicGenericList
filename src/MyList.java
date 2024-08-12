public class MyList<T> {
    private T[] array;
    private int size = 0;

    @SuppressWarnings("unchecked")
    public MyList() {
        this.array = (T[]) new Object[10];
    }
    @SuppressWarnings("unchecked")
    public MyList(int capacity) {
        this.array = (T[]) new Object[capacity];
    }

    public int size() {
        return size;
    }

    public int getCapacity() {
        return array.length;
    }

    @SuppressWarnings("unchecked")
    public void add(T data) {
        if (size == array.length) {
            T[] newArray = (T[]) new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size++] = data;
    }

    public T get(int index) {
        if (index >= size || index < 0) {
            return null;
        }
        return array[index];
    }

    public T remove(int index) {
        if (index >= size || index < 0) {
            return null;
        }
        T removedData = array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[--size] = null; // son elemanı null yap
        return removedData;
    }

    public void set(int index, T data) {
        if (index >= size || index < 0) {
            return;
        }
        array[index] = data;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public int indexOf(T data) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        for (int i = size - 1; i >= 0; i--) {
            if (array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @SuppressWarnings("unchecked")
    public T[] toArray() {
        T[] newArray = (T[]) new Object[size];
        System.arraycopy(array, 0, newArray, 0, size);
        return newArray;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    public MyList<T> subList(int start, int finish) {
        if (start < 0 || finish >= size || start > finish) {
            return null;
        }
        MyList<T> sublist = new MyList<>(finish - start + 1);
        for (int i = start; i <= finish; i++) {
            sublist.add(array[i]);
        }
        return sublist;
    }

    public boolean contains(T data) {
        return indexOf(data) != -1;
    }
}
