public class ExcuseLetterStack13 {
    ExcuseLetter13[] letters;
    int top;
    int size;

    public ExcuseLetterStack13(int size) {
        this.size = size;
        this.letters = new ExcuseLetter13[size];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(ExcuseLetter13 letter) {
        if (!isFull()) {
            letters[++top] = letter;
            System.out.println("Letter from " + letter.name + " submitted.");
        } else {
            System.out.println("Stack is full! Cannot submit more letters.");
        }
    }

    public ExcuseLetter13 pop() {
        if (!isEmpty()) {
            return letters[top--];
        }
        return null;
    }

    public ExcuseLetter13 peek() {
        if (!isEmpty()) {
            return letters[top];
        }
        return null;
    }

    
    public void searchByName(String searchName) {
        boolean found = false;
        for (int i = top; i >= 0; i--) {
            if (letters[i].name.equalsIgnoreCase(searchName)) {
                System.out.println("Found! Letter from " + searchName + " is at position " + (top - i + 1) + " from top.");
                System.out.println("ID: " + letters[i].id + ", Type: " + letters[i].typeOfExcuse + ", Duration: " + letters[i].duration + " days.");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Letter from student '" + searchName + "' not found.");
        }
    }
}