package X;

import java.util.List;

public final class UOC extends AnonymousClass0T0 implements C2802350v, X8Z {
    public int A00;
    public int A01;
    public C16609Uy5 A02;
    public C306576Mr A03;
    public Integer A04;
    public Integer A05;
    public String A06;
    public List A07;
    public boolean A08;
    public transient Integer A09;

    public final String BcG(int i) {
        return "";
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UOC) {
                UOC uoc = (UOC) obj;
                if (!0qQ.A0K(this.A07, uoc.A07) || this.A01 != uoc.A01 || this.A02 != uoc.A02 || this.A00 != uoc.A00 || this.A03 != uoc.A03 || !0qQ.A0K(this.A09, uoc.A09) || !0qQ.A0K(this.A06, uoc.A06) || this.A08 != uoc.A08 || !0qQ.A0K(this.A05, uoc.A05) || !0qQ.A0K(this.A04, uoc.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static int A00(UOC uoc, int i) {
        C15092UOk uOk = (C15092UOk) uoc.A07.get(i - 1);
        return ((int) (((float) uOk.A02) / uOk.A01)) + uOk.A03;
    }

    public final /* synthetic */ List B5h() {
        return 0sn.A00;
    }

    public final int BcH() {
        return this.A07.size();
    }

    public final C273914nO BkW() {
        C273914nO r1 = new C273914nO();
        r1.A01 = C273924nP.ANIMATED_STICKERS;
        String str = this.A06;
        0qQ.A0A(str);
        r1.A06 = AnonymousClass7TE.A1I(str);
        return r1;
    }

    public final Integer CAk() {
        return AnonymousClass05K.A08;
    }

    public final int hashCode() {
        C16609Uy5 uy5 = this.A02;
        C306576Mr r0 = this.A03;
        return ((AnonymousClass7TF.A09(this.A08, (((AnonymousClass7TF.A07(r0, (AnonymousClass7TF.A07(uy5, (AnonymousClass7TE.A0K(this.A07) + this.A01) * 31) + this.A00) * 31) + AnonymousClass7TG.A0C(this.A09)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TE.A0L(this.A04);
    }

    public UOC(C16609Uy5 uy5, C306576Mr r2, Integer num, Integer num2, Integer num3, String str, List list, int i, int i2, boolean z) {
        AnonymousClass7TG.A1P(list, uy5);
        this.A07 = list;
        this.A01 = i;
        this.A02 = uy5;
        this.A00 = i2;
        this.A03 = r2;
        this.A09 = num;
        this.A06 = str;
        this.A08 = z;
        this.A05 = num2;
        this.A04 = num3;
    }

    public final int AYh(int i) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final int Byp(int i) {
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public UOC() {
        /*
            r11 = this;
            r3 = 0
            X.0sn r7 = X.0sn.A00
            r8 = 0
            X.Uy5 r1 = X.C17153VKf.A01
            int r9 = X.C17153VKf.A00
            X.6Mr r2 = X.C306576Mr.DISABLED
            r0 = r11
            r4 = r3
            r5 = r3
            r6 = r3
            r10 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UOC.<init>():void");
    }
}
