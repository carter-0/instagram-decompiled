package X;

import java.util.List;

/* renamed from: X.8Kp  reason: invalid class name and case insensitive filesystem */
public final class C354088Kp implements C354078Ko {
    public C366578pK A00;
    public List A01;
    public final C354098Kq A02 = new Object();
    public final C354038Kk A03;

    public final synchronized void A00(List list) {
        0qQ.A0B(list, 0);
        this.A01 = list;
    }

    public final synchronized void DYe() {
        Throwable th;
        if (this.A00 != null) {
            C354038Kk r0 = this.A03;
            C354098Kq r1 = this.A02;
            r0.AKm(r1);
            int i = r1.A01;
            int i2 = r1.A02;
            float f = r1.A00;
            0qQ.A0A(this.A00);
            Integer num = r1.A03;
            if (num != null) {
                int intValue = num.intValue();
                if (intValue == 0) {
                    C366578pK r02 = this.A00;
                    0qQ.A0A(r02);
                    r02.A01(i, i2, f);
                    C366578pK r12 = this.A00;
                    0qQ.A0A(r12);
                    r12.A02(this.A01, i, i2);
                } else if (intValue == 1) {
                    C366578pK r03 = this.A00;
                    0qQ.A0A(r03);
                    r03.A01(i2, i, f);
                    C366578pK r13 = this.A00;
                    0qQ.A0A(r13);
                    r13.A02(this.A01, i2, i);
                } else if (intValue == 3 || intValue == 2) {
                    C366578pK r04 = this.A00;
                    0qQ.A0A(r04);
                    r04.A01(i, i, f);
                    C366578pK r14 = this.A00;
                    0qQ.A0A(r14);
                    r14.A02(this.A01, i, i);
                } else {
                    th = new RuntimeException();
                }
            } else {
                0qQ.A0F("swipeMode");
                th = AnonymousClass00P.createAndThrow();
            }
            throw th;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.8Kq, java.lang.Object] */
    public C354088Kp(C354038Kk r2) {
        this.A03 = r2;
    }
}
