package X;

import androidx.fragment.app.FragmentActivity;

public final /* synthetic */ class TPU implements 0sP {
    public final /* synthetic */ 1MD A00;
    public final /* synthetic */ 1MD A01;
    public final /* synthetic */ AnonymousClass2Fj A02;
    public final /* synthetic */ C10440RsH A03;
    public final /* synthetic */ SSY A04;
    public final /* synthetic */ Object A05;
    public final /* synthetic */ String A06;

    public /* synthetic */ TPU(1MD r1, 1MD r2, AnonymousClass2Fj r3, C10440RsH rsH, SSY ssy, Object obj, String str) {
        this.A04 = ssy;
        this.A00 = r1;
        this.A02 = r3;
        this.A06 = str;
        this.A05 = obj;
        this.A03 = rsH;
        this.A01 = r2;
    }

    public final Object invoke(Object obj) {
        SSY ssy = this.A04;
        1MD r1 = this.A00;
        AnonymousClass2Fj r3 = this.A02;
        String str = this.A06;
        Object obj2 = this.A05;
        C10440RsH rsH = this.A03;
        1MD r4 = this.A01;
        SUj sUj = (SUj) obj;
        if (SUj.A0T(sUj) || SUj.A0S(sUj)) {
            return new 2Fk(SUj.A06(sUj, (Object) null));
        }
        Object apply = r1.apply(SUj.A0D(sUj));
        apply.getClass();
        2Fk r12 = (2Fk) apply;
        FragmentActivity fragmentActivity = ssy.A01;
        if (fragmentActivity == null) {
            fragmentActivity = ssy.A02;
            fragmentActivity.getClass();
        }
        SUj.A0F(fragmentActivity, r12, new C11644Sdm(r3, r4, rsH, ssy, obj2, str, 1));
        return r12;
    }
}
