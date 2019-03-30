public interface PriorityQueue<E extends Commparable<E>> {
    public E getFirst();
    // pre: !isEmpty()
    // post: returns the minimum value in priority que
    public E remove();
    public E add(E value);
    public E isEmpty();
    public E size();
    public E clear();

}
