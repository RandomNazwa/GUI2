package zad2;

import java.util.Iterator;

public class Hailstone implements Iterator<Integer>, Iterable<Integer> {

    private int number;
    private int last = 0;

    public Hailstone(int number) {
        this.number = number;
    }

    @Override
    public boolean hasNext() {
        if(number != 1){
            return true;
        }
        else {
            number++; last++;
            if(last == 1){
                return true;
            }
        }
        return false;
    }

    @Override
    public Integer next() {
         return (number%2 == 0)? number /= 2 : (number%2 != 0)? number = 3*number+1 : null;
    }

    @Override
    public Iterator<Integer> iterator() {
        return this;
    }

}