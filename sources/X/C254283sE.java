package X;

/* renamed from: X.3sE  reason: invalid class name and case insensitive filesystem */
public final class C254283sE implements C254293sF {
    public final AnonymousClass4DU A00;
    public final Integer A01;
    public final String A02;
    public final boolean A03;
    public final /* synthetic */ C229852oR A04;

    public C254283sE(AnonymousClass4DU r1, C229852oR r2, Integer num, String str, boolean z) {
        this.A04 = r2;
        this.A00 = r1;
        this.A02 = str;
        this.A01 = num;
        this.A03 = z;
    }

    public final void DzO(C254353sL r10, Boolean bool, String str) {
        boolean z;
        C229852oR r5 = this.A04;
        AnonymousClass4DU r4 = this.A00;
        String str2 = this.A02;
        Integer num = this.A01;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = this.A03;
        }
        if (z) {
            0nY.A00().ATE(new C292945jm(new C292935jl(r10, r4, r5, num, str2, z)));
        }
    }
}
