package X;

import java.lang.ref.WeakReference;

/* renamed from: X.IIq  reason: case insensitive filesystem */
public final class C56946IIq implements C252203oj {
    public static final C71392co A0B = C71392co.A04(120.0d, 3.0d);
    public static final C71392co A0C = C71392co.A04(60.0d, 5.0d);
    public static final C71392co A0D = C71392co.A04(61.69d, 15.71d);
    public static final C71392co A0E = C71392co.A04(322.27d, 30.52d);
    public int A00;
    public int A01;
    public GQ0 A02;
    public WeakReference A03;
    public WeakReference A04;
    public float A05;
    public float A06;
    public final 2cs A07;
    public final 2cs A08;
    public final 2cs A09;
    public final 2cs A0A;

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r5) {
        0qQ.A0B(r5, 0);
        2cs r3 = this.A09;
        if (r5 == r3 && r3.A05 == A0D && r3.A0E(1.0d)) {
            r3.A09(A0E);
            r3.A06 = true;
            r3.A08(1.0d, true);
            r3.A04();
            this.A00 = C51972G9s.A05(-10, 10);
        }
    }

    public final void DmD(2cs r1) {
    }

    public final void DmE(2cs r11) {
        AnonymousClass3TL r4;
        float A022;
        AnonymousClass3TL r3;
        0qQ.A0B(r11, 0);
        2cs r32 = this.A09;
        if (r11 == r32) {
            float f = (float) r32.A09.A00;
            float f2 = (float) this.A08.A09.A00;
            float f3 = (float) this.A07.A09.A00;
            if (r32.A05 == A0D) {
                A022 = C229632nm.A02(f2, this.A05, 1.0f);
            } else {
                A022 = C229632nm.A02(f, 0.0f, this.A05);
            }
            this.A05 = A022;
            WeakReference weakReference = this.A03;
            if (!(weakReference == null || (r3 = (AnonymousClass3TL) weakReference.get()) == null)) {
                r3.CvS(this.A02, f2, f, f3, A022);
            }
        }
        2cs r33 = this.A0A;
        if (r11.equals(r33)) {
            float f4 = (float) r33.A09.A00;
            WeakReference weakReference2 = this.A04;
            if (weakReference2 != null && (r4 = (AnonymousClass3TL) weakReference2.get()) != null) {
                if (r33.A05 == A0C) {
                    this.A06 = C229632nm.A02(f4, this.A06, 1.0f);
                }
                if (r11.A05 == C300835xz.A04) {
                    f4 = (Math.abs(f4) * -2.25f) + 1.2f;
                }
                r4.CvS((GQ0) null, f4, 0.0f, 0.0f, this.A06);
            }
        }
    }

    public C56946IIq() {
        2cp A002 = C61340me.A00();
        2cs A022 = A002.A02();
        A022.A0A(this);
        this.A09 = A022;
        this.A08 = A002.A02();
        this.A07 = A002.A02();
        2cs A023 = A002.A02();
        A023.A0A(this);
        this.A0A = A023;
    }
}
