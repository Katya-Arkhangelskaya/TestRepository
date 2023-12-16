package lesson7.tech.skelar.TestRepository;

public class ResultResponse implements Comparable<ResultResponse> {

    private int count;

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    @Override
    public int compareTo(ResultResponse o) {
        if (this.count > o.count) {
            return 1;
        }
        else if (this.count < o.count) {
            return -1;
        }
        return 0;
    }
}
