package X;

import android.view.View;

/* renamed from: X.Ohl  reason: case insensitive filesystem */
public final class C71289Ohl implements View.OnClickListener {
    public final /* synthetic */ C66762Mc7 A00;

    public C71289Ohl(C66762Mc7 mc7) {
        this.A00 = mc7;
    }

    public final void onClick(View view) {
        String str;
        int A05 = AnonymousClass0fD.A05(841105422);
        C66762Mc7 mc7 = this.A00;
        C3725791l r4 = mc7.A07;
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
                    r4.A01(str2, str3, "BOOST_AGAIN", str4);
                    C66762Mc7.A01(mc7);
                    1Yh A002 = C18138VmE.A00();
                    1Yg A003 = VA4.A00();
                    N3P n3p = mc7.A08;
                    if (n3p == null) {
                        str = "activeAdModel";
                    } else {
                        String str5 = n3p.A0D;
                        A002.A0B(A003.A00(mc7.A0E, mc7.A0G, str5, "in_thread_ad_banner"));
                        AnonymousClass0fD.A0C(2130665914, A05);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
