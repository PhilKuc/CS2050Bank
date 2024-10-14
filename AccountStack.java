import java.util.ArrayList;

public class AccountStack<T> {
    private ArrayList<T> stack;

    public AccountStack() {
        stack = new ArrayList<>();
    }

    public void push(T account) {
        stack.add(account);
    }

    public T pop() {
        if (!stack.isEmpty()) {
            return stack.remove(stack.size() - 1);
        }
        return null;  // Handle empty stack case
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public ArrayList<T> getStack() {
        return stack;
    }
}