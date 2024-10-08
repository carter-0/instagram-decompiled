package X;

/* renamed from: X.Wvx  reason: case insensitive filesystem */
public final class C20616Wvx extends 0Yg implements C62320sa {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20616Wvx(int i, long j, Object obj, Object obj2, Object obj3, Object obj4) {
        super(0);
        this.A00 = i;
        this.A04 = obj;
        this.A02 = obj2;
        this.A05 = obj3;
        this.A03 = obj4;
        this.A01 = j;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 != 0) {
            ((0sJ) this.A04).invoke(Long.valueOf(this.A01), this.A02, this.A03, this.A05);
            return C60340gF.A00;
        }
        C308006Si r1 = C307996Sh.A04;
        C244943c0 r0 = (C244943c0) this.A02;
        Object obj = r0.A05;
        return r1.A03(r1.A01(r0.A04, (C307996Sh) this.A04, obj, C307806Ro.A00((C307786Rm) obj), r0.A03), (C276544tV) this.A05, ((C276694tk) this.A03).A03, this.A01);
    }
}
