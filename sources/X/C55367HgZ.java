package X;

/* renamed from: X.HgZ  reason: case insensitive filesystem */
public abstract class C55367HgZ {
    public static final ThreadLocal[] A00;

    static {
        int i = 0;
        ThreadLocal[] threadLocalArr = new ThreadLocal[4];
        do {
            threadLocalArr[i] = new ThreadLocal();
            i++;
        } while (i < 4);
        A00 = threadLocalArr;
    }
}
