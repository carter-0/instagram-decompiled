package X;

/* renamed from: X.Lma  reason: case insensitive filesystem */
public final class C65056Lma implements C41820B2a {
    public final /* synthetic */ C59767JXi A00;

    public C65056Lma(C59767JXi jXi) {
        this.A00 = jXi;
    }

    public final void DCZ() {
        AnonymousClass85O r0 = this.A00.A0T;
        if (r0 != null) {
            JTR.A1W(r0.A0B);
        }
    }

    public final void DYy() {
        C59767JXi jXi = this.A00;
        if (jXi.A0H) {
            if (jXi.A07 == null) {
                0kD.A07(C59767JXi.__redex_internal_original_name, "textureView is null while showing", (Throwable) null);
            } else {
                jXi.A0e.setLoadingStatus(JY5.SUCCESS);
                JTT.A13(jXi.A07);
                jXi.A0R.setVisibility(8);
            }
            jXi.A0N.postOnAnimation(jXi.A0g);
        }
        AnonymousClass85O r0 = jXi.A0T;
        if (r0 != null) {
            JTR.A1W(r0.A0B);
        }
    }

    public final void onCompletion() {
        C59767JXi jXi = this.A00;
        C66567MWv mWv = jXi.A0B;
        if (mWv != null) {
            mWv.seekTo(jXi.A02);
            C66567MWv mWv2 = jXi.A0B;
            if (mWv2 != null) {
                mWv2.start();
            }
        }
    }
}
