package X;

import java.util.List;

/* renamed from: X.9N9  reason: invalid class name */
public final class AnonymousClass9N9 extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9N9(Object obj, Object obj2, String str, String str2, String str3, String str4, String str5, int i) {
        super(0);
        this.A00 = i;
        this.A02 = obj;
        this.A05 = str;
        this.A07 = str2;
        this.A06 = str3;
        this.A04 = str4;
        this.A03 = str5;
        this.A01 = obj2;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 != 0) {
            ((C299665vd) this.A02).DYP(this.A04, this.A05, this.A07, (String) null, this.A06, this.A03, (List) this.A01);
            return C60340gF.A00;
        }
        C250663lr r1 = (C250663lr) this.A02;
        if (r1.doesFulfillSpread(this.A05, this.A07, this.A06, this.A04, this.A03)) {
            return r1.reinterpret((Class) this.A01);
        }
        return null;
    }
}
