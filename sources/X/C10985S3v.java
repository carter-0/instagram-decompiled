package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.smartcapture.view.SelfieReviewActivity;

/* renamed from: X.S3v  reason: case insensitive filesystem */
public final class C10985S3v {
    public final /* synthetic */ C7929Qd0 A00;

    public C10985S3v(C7929Qd0 qd0) {
        this.A00 = qd0;
    }

    public final void A00() {
        Fragment fragment;
        C7929Qd0 qd0 = this.A00;
        0hq r1 = qd0.A04;
        if (r1 != null) {
            fragment = r1.A0R("progressDialog");
        } else {
            fragment = null;
        }
        0SM r0 = (0SM) fragment;
        if (r0 != null) {
            r0.A08();
        }
        if (qd0.isAdded()) {
            C358248ab r12 = new C358248ab((Context) new C251383n1(qd0.requireContext(), 2132018368));
            r12.A09(2131973073);
            r12.A06();
            r12.A0r(true);
            DbT.A1V(r12);
        }
        T6A t6a = qd0.A08;
        if (t6a != null) {
            t6a.A00(RDG.A03, RDI.A05, qd0.A0B);
        }
    }

    public final void A01(String str) {
        Fragment fragment;
        C7929Qd0 qd0 = this.A00;
        0hq r1 = qd0.A04;
        if (r1 != null) {
            fragment = r1.A0R("progressDialog");
        } else {
            fragment = null;
        }
        0SM r0 = (0SM) fragment;
        if (r0 != null) {
            r0.A08();
        }
        C13446TaZ taZ = (C13446TaZ) qd0.A00.get();
        if (taZ != null) {
            SelfieReviewActivity selfieReviewActivity = (SelfieReviewActivity) taZ;
            selfieReviewActivity.A04(selfieReviewActivity.A00, str);
        }
    }
}
