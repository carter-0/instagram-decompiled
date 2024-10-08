package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.user.model.User;

/* renamed from: X.OiT  reason: case insensitive filesystem */
public final class C71322OiT implements View.OnClickListener {
    public final /* synthetic */ 2Er A00;
    public final /* synthetic */ C70968OTp A01;

    public C71322OiT(2Er r1, C70968OTp oTp) {
        this.A01 = oTp;
        this.A00 = r1;
    }

    public final void onClick(View view) {
        String[] strArr;
        int A05 = AnonymousClass0fD.A05(1756307308);
        C70968OTp oTp = this.A01;
        User BSJ = this.A00.BSJ();
        FragmentActivity fragmentActivity = oTp.A02;
        String A16 = AnonymousClass7TE.A16(fragmentActivity, 2131958650);
        String A162 = AnonymousClass7TE.A16(fragmentActivity, 2131960226);
        if (oTp.A05.A00(C376179Gx.REPORT_USER)) {
            strArr = new String[]{A16, A162};
        } else {
            strArr = new String[]{A16};
        }
        C358248ab A0Y = DbS.A0Y(fragmentActivity);
        A0Y.A0m(oTp.A03);
        A0Y.A0e(new C71193OfE(BSJ, strArr, oTp, A162, A16, 0), strArr);
        AnonymousClass7TH.A0a(A0Y, true);
        AnonymousClass0fD.A0C(257826928, A05);
    }
}
