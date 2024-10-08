package X;

/* renamed from: X.Otp  reason: case insensitive filesystem */
public final class C71964Otp implements C232262tL {
    public final C2609247o A00;
    public final boolean A01;

    public final /* bridge */ /* synthetic */ Object getKey() {
        String C6E = this.A00.C6E();
        if (C6E == null) {
            return "";
        }
        return C6E;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C2609247o r0;
        C71964Otp otp = (C71964Otp) obj;
        C2609247o r1 = this.A00;
        if (otp != null) {
            r0 = otp.A00;
        } else {
            r0 = null;
        }
        return 2PP.A00(r1, r0);
    }

    public C71964Otp(C2609247o r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }
}
