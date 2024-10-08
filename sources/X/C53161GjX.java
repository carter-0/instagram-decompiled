package X;

import com.instagram.feed.ui.state.IntentAwareAdPivotState;

/* renamed from: X.GjX  reason: case insensitive filesystem */
public final class C53161GjX extends C14072TpM {
    public final /* synthetic */ IntentAwareAdPivotState A00;
    public final /* synthetic */ C53109Gih A01;
    public final /* synthetic */ C57286IVv A02;

    public C53161GjX(IntentAwareAdPivotState intentAwareAdPivotState, C53109Gih gih, C57286IVv iVv) {
        this.A00 = intentAwareAdPivotState;
        this.A02 = iVv;
        this.A01 = gih;
    }

    public final void A00(int i) {
        if (i == 0) {
            this.A00.A01 = this.A02.A03.A00;
        }
    }

    public final void A01(int i) {
        C255913uv r0 = this.A01.A00;
        if (r0 != null) {
            r0.setCurrentPage(i);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
