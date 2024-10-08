package X;

/* renamed from: X.NLw  reason: case insensitive filesystem */
public final class C68525NLw extends 1P0 {
    public final /* synthetic */ NKT A00;

    public C68525NLw(NKT nkt) {
        this.A00 = nkt;
    }

    public final void onFail(C268654dm r5) {
        boolean z;
        int A0D = AnonymousClass7TG.A0D(r5, 1902225499);
        C68525NLw.super.onFail(r5);
        AnonymousClass1XT r0 = (AnonymousClass1XT) r5.A00();
        if (r0 != null) {
            z = "login_required".equals(r0.getErrorMessage());
        } else {
            z = false;
        }
        NKT nkt = this.A00;
        if (nkt.isResumed() && !z && nkt.getContext() != null) {
            C49952FGh.A01(nkt.getContext());
        }
        AnonymousClass0fD.A0A(1338904579, A0D);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1163856806);
        NHD nhd = (NHD) obj;
        int A0D = AnonymousClass7TG.A0D(nhd, 714701979);
        NKT nkt = this.A00;
        if (nkt.isResumed()) {
            NL2 nl2 = nkt.A01;
            if (nl2 == null) {
                0qQ.A0F("loginHistoryAdapter");
                throw AnonymousClass00P.createAndThrow();
            }
            nl2.A0C(nhd);
        }
        AnonymousClass0fD.A0A(-607867247, A0D);
        AnonymousClass0fD.A0A(-427555063, A03);
    }
}
