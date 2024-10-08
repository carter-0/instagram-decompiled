package X;

import java.util.Map;

public final class I4T {
    public static final AnonymousClass0eM A0A = AnonymousClass0eN.A00(0eO.A02, C66275MLk.A00);
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;

    public I4T(AnonymousClass0eM r2, AnonymousClass0eM r3, AnonymousClass0eM r4, AnonymousClass0eM r5, AnonymousClass0eM r6, AnonymousClass0eM r7, AnonymousClass0eM r8, AnonymousClass0eM r9, AnonymousClass0eM r10, AnonymousClass0eM r11) {
        0qQ.A0B(r2, 1);
        C51974G9v.A1S(r3, r4, r5, r6, r7);
        C51974G9v.A1Q(r8, r9, r10, r11);
        this.A02 = r2;
        this.A09 = r3;
        this.A05 = r4;
        this.A01 = r5;
        this.A03 = r6;
        this.A07 = r7;
        this.A08 = r8;
        this.A00 = r9;
        this.A04 = r10;
        this.A06 = r11;
    }

    public final C53400GnX A00(XRY xry) {
        0qQ.A0B(xry, 0);
        C53400GnX gnX = (C53400GnX) ((Map) this.A09.getValue()).get(xry);
        if (gnX != null) {
            return gnX;
        }
        throw C51973G9u.A0g(xry, "No section model found for ID ", AnonymousClass7TE.A1A());
    }

    public final C60894JtE A01(XRZ xrz) {
        0qQ.A0B(xrz, 0);
        C60894JtE jtE = (C60894JtE) ((Map) this.A01.getValue()).get(xrz);
        if (jtE != null || (jtE = (C60894JtE) ((Map) this.A03.getValue()).get(xrz)) != null) {
            return jtE;
        }
        throw C51973G9u.A0g(xrz, "No navigation row model found for ID ", AnonymousClass7TE.A1A());
    }

    public I4T() {
        this(AnonymousClass0eN.A01(C58497Iss.A00), AnonymousClass0eN.A01(C58498Ist.A00), AnonymousClass0eN.A01(C58499Isu.A00), AnonymousClass0eN.A01(C58500Isv.A00), AnonymousClass0eN.A01(C58501Isw.A00), AnonymousClass0eN.A01(C58502Isx.A00), AnonymousClass0eN.A01(C58503Isy.A00), AnonymousClass0eN.A01(C58504Isz.A00), AnonymousClass0eN.A01(C58505It0.A00), AnonymousClass0eN.A01(C58496Isr.A00));
    }
}
