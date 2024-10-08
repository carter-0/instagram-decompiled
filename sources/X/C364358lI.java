package X;

import androidx.media.AudioAttributesCompat;

/* renamed from: X.8lI  reason: invalid class name and case insensitive filesystem */
public final class C364358lI implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C3730893y A01;

    public C364358lI(C3730893y r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.9uV, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v5, types: [X.9uV, java.lang.Object] */
    public final void run() {
        C392279uV r1;
        C341427mr r4 = this.A01.A00;
        int i = this.A00;
        if (i == 0) {
            C39894ADw aDw = r4.A00;
            if (aDw != null) {
                r4.A0J.A00(aDw);
                r4.A00 = null;
            }
        } else if (i != 3) {
            if (i == 1) {
                ? obj = new Object();
                obj.A03 = C39894ADw.A05;
                obj.A00 = 2;
                r1 = obj;
            } else if (i == 2) {
                ? obj2 = new Object();
                obj2.A03 = C39894ADw.A05;
                obj2.A00 = 3;
                r1 = obj2;
            } else {
                return;
            }
            AudioAttributesCompat audioAttributesCompat = r4.A0D;
            if (audioAttributesCompat != null) {
                r1.A03 = audioAttributesCompat;
                r1.A01(r4.A0H);
                C39894ADw A002 = r1.A00();
                r4.A00 = A002;
                r4.A0J.A01(A002);
                return;
            }
            throw new NullPointerException("Illegal null AudioAttributes");
        }
    }
}
