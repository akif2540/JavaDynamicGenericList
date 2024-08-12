# MyList: Custom Generic List Class in Java

This project implements a custom generic list class in Java that simulates the functionality of an array-based list. The class dynamically adjusts its size as elements are added, mimicking a basic version of an ArrayList without using Java's built-in `Collection` framework.

## Class Features

- **Dynamic Array Resizing:** The list starts with a default size of 10, but if the array becomes full, its size doubles automatically.
- **Generic Support:** The class is designed to handle any data type using Java's generic type `<T>`.
- **Basic List Operations:** The class supports basic operations such as adding, removing, getting, setting, and searching for elements.

## Constructors

- **`MyList()`:** Initializes the list with a default capacity of 10.
- **`MyList(int capacity)`:** Initializes the list with a specified capacity.

## Methods

### Basic Methods

- **`size()`:** Returns the number of elements currently in the list.
- **`getCapacity()`:** Returns the current capacity of the list.
- **`add(T data)`:** Adds a new element to the list. If the list is full, it doubles the array's capacity.

### Accessor and Mutator Methods

- **`get(int index)`:** Returns the element at the specified index. Returns `null` if the index is invalid.
- **`remove(int index)`:** Removes the element at the specified index and shifts the subsequent elements to the left. Returns the removed element or `null` if the index is invalid.
- **`set(int index, T data)`:** Replaces the element at the specified index with a new value.

### Utility Methods

- **`indexOf(T data)`:** Returns the index of the first occurrence of the specified element. Returns `-1` if the element is not found.
- **`lastIndexOf(T data)`:** Returns the index of the last occurrence of the specified element. Returns `-1` if the element is not found.
- **`isEmpty()`:** Returns `true` if the list is empty, otherwise `false`.
- **`toArray()`:** Converts the list to an array.
- **`clear()`:** Clears the list, resetting it to an empty state.
- **`subList(int start, int finish)`:** Returns a sublist from the specified start to finish indices.
- **`contains(T data)`:** Checks if the list contains the specified element.
- **`toString()`:** Returns a string representation of the list.

## Example Usage

```java
public class Ata {
    public static void main(String[] args) {
        MyList<Integer> liste = new MyList<>();
        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
        
        liste.add(10);
        liste.add(20);
        liste.add(30);
        liste.add(40);
        
        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
        
        liste.add(50);
        liste.add(60);
        liste.add(70);
        liste.add(80);
        liste.add(90);
        liste.add(100);
        liste.add(110);
        
        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
    }
}
