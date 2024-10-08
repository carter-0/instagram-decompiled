package X;

import com.facebook.common.time.RealtimeSinceBootClock;

/* renamed from: X.I0n  reason: case insensitive filesystem */
public final class C56538I0n {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public 1bK A04;
    public String A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public C247733gp A0B;

    public C56538I0n(C247733gp r4, String str, String str2, int i, int i2, int i3, boolean z, boolean z2) {
        this.A08 = false;
        this.A03 = RealtimeSinceBootClock.A00.now();
        this.A0B = r4;
        this.A05 = str;
        this.A06 = str2;
        this.A07 = z;
        this.A09 = z2;
        this.A0A = false;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = i3;
    }

    public final C247733gp A00() {
        1bK r1 = this.A04;
        C247733gp r0 = this.A0B;
        if (r0 != null || r1 == null) {
            return r0;
        }
        C247733gp r02 = new C247733gp(r1);
        this.A0B = r02;
        return r02;
    }

    public C56538I0n() {
        this.A08 = false;
    }
}
