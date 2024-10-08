package X;

/* renamed from: X.Ugr  reason: case insensitive filesystem */
public final class C15686Ugr extends C252233om {
    public long A00;
    public long A01;

    public final void onPause() {
        this.A01 += System.currentTimeMillis() - this.A00;
    }

    public final void onResume() {
        this.A00 = System.currentTimeMillis();
    }
}
