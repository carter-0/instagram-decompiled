package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Mc9  reason: case insensitive filesystem */
public final class C66764Mc9 extends C392289uY {
    public AnonymousClass2Ep A00;
    public C70958OTf A01;
    public final FragmentActivity A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final C370918xH A05;

    public final View A06(Context context) {
        0qQ.A0B(context, 0);
        View inflate = View.inflate(context, R.layout.condensed_generic_v3_megaphone, (ViewGroup) null);
        int[] iArr = C70958OTf.A05;
        int i = 0;
        do {
            0nA.A0O(inflate.findViewById(iArr[i]));
            i++;
        } while (i < 4);
        0qQ.A0A(inflate);
        C70958OTf oTf = new C70958OTf(inflate, this);
        this.A01 = oTf;
        return oTf.A00;
    }

    public final void A07(C39761A8b a8b, C74401PuH puH, AnonymousClass2Ep r7, boolean z) {
        0qQ.A0B(puH, 1);
        if (r7 == null || !r7.Etj()) {
            puH.onFailure();
            return;
        }
        this.A05.A00("tags_cn_thread_read_success", C66582MXn.A0y("read_value", String.valueOf(r7.Etj())), r7.C6C());
        this.A00 = r7;
        puH.DoM(this);
    }

    public final void A04(boolean z) {
        String C6C;
        AnonymousClass2Ep r0 = this.A00;
        if (r0 != null && (C6C = r0.C6C()) != null) {
            this.A05.A00("tags_cn_nudge_render_success", AnonymousClass7TE.A1H(), C6C);
            AnonymousClass7TE.A1Z(new MFW(this, C6C, (AnonymousClass4D7) null, 39), DbY.A0r(AnonymousClass12T.A00, 1750566679));
        }
    }

    public C66764Mc9(FragmentActivity fragmentActivity, AnonymousClass0iw r3, UserSession userSession) {
        this.A02 = fragmentActivity;
        this.A04 = userSession;
        this.A03 = r3;
        this.A05 = new C370918xH(r3, userSession);
    }
}
