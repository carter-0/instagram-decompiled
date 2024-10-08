package X;

import android.content.Context;

/* renamed from: X.IcY  reason: case insensitive filesystem */
public final class C57546IcY implements C59561JOh {
    public static final C57551Icd A06;
    public static final C57551Icd A07;
    public static final Integer A08 = AnonymousClass05K.A06;
    public static final Integer A09 = AnonymousClass05K.A01;
    public final int A00;
    public final C59582JPc A01;
    public final HNO A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;

    public C57546IcY(C59582JPc jPc, HNO hno, Integer num, Integer num2, Integer num3, int i) {
        0qQ.A0B(hno, 3);
        C51973G9u.A0s(5, num, num2, num3);
        this.A00 = i;
        this.A02 = hno;
        this.A05 = num;
        this.A01 = jPc;
        this.A03 = num2;
        this.A04 = num3;
    }

    static {
        Integer num = AnonymousClass05K.A0B;
        A06 = new C57551Icd(HNO.A0Y, num);
        A07 = new C57551Icd(HNO.A0h, num);
    }

    public final /* bridge */ /* synthetic */ Object EIh(Context context, C59535JNh jNh) {
        C59535JNh jNh2 = jNh;
        AnonymousClass7TG.A1N(context, jNh2);
        JSK A002 = I41.A00(jNh2);
        boolean CRB = jNh2.CRB();
        int EIY = A002.EIY(HNO.A0Y, CRB);
        int EIY2 = A002.EIY(HNO.A0n, CRB);
        int EIY3 = A002.EIY(this.A02, CRB);
        int EIZ = A002.EIZ(AnonymousClass05K.A1I);
        C56083HsW hsW = new C56083HsW(EIZ, EIY2);
        C56083HsW hsW2 = new C56083HsW(EIZ, EIY2);
        int EIY4 = A002.EIY(HNO.A0h, CRB);
        int EIZ2 = A002.EIZ(AnonymousClass05K.A05);
        C57551Icd icd = A06;
        C57551Icd icd2 = A07;
        int i = this.A00;
        Integer num = AnonymousClass05K.A01;
        int EIZ3 = A002.EIZ(AnonymousClass05K.A02);
        int EIZ4 = A002.EIZ(AnonymousClass05K.A03);
        int EIZ5 = A002.EIZ(AnonymousClass05K.A04);
        int EIZ6 = A002.EIZ(this.A05);
        C59582JPc jPc = this.A01;
        int EIZ7 = A002.EIZ(this.A03);
        return new C56149Htb(icd, icd2, hsW, hsW2, hsW2, jPc, Integer.valueOf(EIY4), num, this.A04, i, EIY, EIZ3, EIZ4, EIZ2, EIZ5, EIZ2, EIY2, EIY2, EIY3, EIZ6, EIZ7);
    }
}
