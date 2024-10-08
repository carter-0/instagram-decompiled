package X;

import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Afo  reason: case insensitive filesystem */
public final class C40626Afo implements C66572MXc {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C353398Hl A01;

    public final /* bridge */ /* synthetic */ void Dbb(Object obj) {
        C66532MVm mVm = (C66532MVm) obj;
        0qQ.A0B(mVm, 0);
        C353398Hl r2 = this.A01;
        AnonymousClass4DH r5 = r2.A08;
        if (!r5.mDetached && r5.mView != null) {
            UserSession userSession = r2.A09;
            r2.A01 = mVm.CrO((ViewStub) AnonymousClass7TF.A0G(this.A00, R.id.pre_capture_sup_toggle_stub), r5, userSession, (Boolean) null, new MIW(r2, 59));
            r2.A03 = mVm.CrL((ViewStub) null, r5, new MIW(r2, 60));
            r2.A02 = mVm.CrJ(r5, userSession, new MIW(r2, 61));
            r2.A04 = mVm.CrN(r5, userSession, r2.A0A, new MIW(r2, 62));
            C279284yO r0 = r2.A00;
            if (r0 != null) {
                r2.A00 = null;
                C353398Hl.A03((C279284yO) null, r2);
                C353398Hl.A02(r0, r2);
            }
        }
    }

    public C40626Afo(View view, C353398Hl r2) {
        this.A01 = r2;
        this.A00 = view;
    }
}
