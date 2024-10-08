package X;

import android.content.DialogInterface;
import androidx.core.app.ComponentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.Of9  reason: case insensitive filesystem */
public final class C71190Of9 implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public C71190Of9(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj3;
        this.A03 = obj2;
        this.A04 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C16236Uqz uqz;
        String str;
        int i2;
        C68282N8v n8v;
        boolean z;
        switch (this.A00) {
            case 0:
                C15328Uac uac = (C15328Uac) this.A03;
                C18662VwK vwK = uac.A07;
                if (vwK == null) {
                    0qQ.A0F("adsManagerLogger");
                    throw AnonymousClass00P.createAndThrow();
                }
                vwK.A0A("ads_manager_highlights_hub", W3M.A01((C16680UzG) this.A02), this.A04, (String) null);
                C15328Uac.A0A(uac, (C19176WOi) this.A01, "ads_manager_highlights_hub");
                return;
            case 1:
                2Eq r3 = (2Eq) this.A02;
                String str2 = r3.BJy().A00;
                if (str2 != null) {
                    C70150Ny4.A00(((C66664MaX) this.A03).A03, str2, this.A04);
                }
                ((C74385Pu1) this.A01).AJk(r3.BJy(), 2);
                return;
            case 2:
                0qQ.A0B(dialogInterface, 0);
                C69497Nmf nmf = C69497Nmf.CANCEL;
                String str3 = this.A04;
                P9R.A05(nmf, (C70846ONz) this.A02, (C333517Zg) this.A01, str3);
                dialogInterface.dismiss();
                return;
            case 3:
                AnonymousClass7TE.A1Z(new C66174MGl(this.A03, this.A02, this.A04, (AnonymousClass4D7) null, 38), AnonymousClass07a.A00((ComponentActivity) this.A01));
                return;
            case 4:
                uqz = (C16236Uqz) this.A03;
                str = this.A04;
                i2 = ((C68172N3n) this.A01).A00;
                n8v = (C68282N8v) this.A02;
                z = true;
                break;
            case 5:
                uqz = (C16236Uqz) this.A03;
                str = this.A04;
                i2 = ((C68172N3n) this.A01).A00;
                n8v = (C68282N8v) this.A02;
                z = false;
                break;
            default:
                ReelDashboardFragment reelDashboardFragment = (ReelDashboardFragment) this.A01;
                String str4 = this.A04;
                User user = (User) this.A02;
                UserSession userSession = reelDashboardFragment.A06;
                0qQ.A0B(userSession, 0);
                C66671Mae.A0J(userSession, str4, user.getId());
                C14629Tzb tzb = (C14629Tzb) reelDashboardFragment.mListAdapter.A0C.get(((C255773uh) this.A03).A0j);
                if (tzb != null) {
                    C14176TrF trF = tzb.A0j;
                    C255773uh r0 = trF.A03;
                    r0.getClass();
                    OLT olt = r0.A04;
                    if (olt != null) {
                        olt.A00(user);
                        trF.A07();
                        return;
                    }
                    return;
                }
                return;
        }
        C16236Uqz.A01(n8v, uqz, str, i2, z);
    }
}
