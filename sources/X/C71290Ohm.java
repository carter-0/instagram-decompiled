package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ohm  reason: case insensitive filesystem */
public final class C71290Ohm implements View.OnClickListener {
    public final /* synthetic */ C66762Mc7 A00;

    public C71290Ohm(C66762Mc7 mc7) {
        this.A00 = mc7;
    }

    public final void onClick(View view) {
        String str;
        int A05 = AnonymousClass0fD.A05(223934005);
        C66762Mc7 mc7 = this.A00;
        C3725791l r5 = mc7.A07;
        String str2 = mc7.A0D;
        if (str2 == null) {
            str = "threadIdV2";
        } else {
            String str3 = mc7.A0C;
            if (str3 == null) {
                str = "participantId";
            } else {
                String str4 = mc7.A0B;
                if (str4 == null) {
                    str = "adMediaId";
                } else {
                    r5.A01(str2, str3, "EXTEND_AD", str4);
                    C66762Mc7.A01(mc7);
                    1Yh A002 = C18138VmE.A00();
                    UserSession userSession = mc7.A0G;
                    FragmentActivity fragmentActivity = mc7.A0E;
                    N3P n3p = mc7.A08;
                    str = "activeAdModel";
                    if (n3p != null) {
                        A002.A05(fragmentActivity, userSession, n3p.A0D, "in_thread_ad_banner", String.valueOf(n3p.A02), String.valueOf(n3p.A03), String.valueOf(n3p.A00), (String) null, n3p.A05, n3p.A06, n3p.A01, n3p.A07, n3p.A04);
                        AnonymousClass0fD.A0C(894044996, A05);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
