public class TestingCA {
    public int max(int A, int B, int C) {
        if (A==B || A==C)
            throw new IllegalArgumentException("the inputs must not be equal");
        if (A > B) {
            if (B > C) return A;
            else {
                if (A > C) return A;
                else return B;
            }
        } else {
            if (B > C) return B;
        }
        if (A < B) return B;
        else return C;
    }
}
