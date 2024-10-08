package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.InstagramMediaProductType;
import com.instagram.common.session.UserSession;

/* renamed from: X.Oho  reason: case insensitive filesystem */
public final class C71292Oho implements View.OnClickListener {
    public final /* synthetic */ C66762Mc7 A00;

    public C71292Oho(C66762Mc7 mc7) {
        this.A00 = mc7;
    }

    public final void onClick(View view) {
        String str;
        int A05 = AnonymousClass0fD.A05(538210256);
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
                    r5.A01(str2, str3, "VIEW_INSIGHTS", str4);
                    UserSession userSession = mc7.A0G;
                    FragmentActivity fragmentActivity = mc7.A0E;
                    N3P n3p = mc7.A08;
                    str = "activeAdModel";
                    if (n3p != null) {
                        String str5 = n3p.A0D;
                        InstagramMediaProductType instagramMediaProductType = n3p.A0A;
                        W3M.A05(fragmentActivity, (C19176WOi) null, userSession, str5, "in_thread_ad_banner", AnonymousClass7TE.A1E(), AnonymousClass7TF.A1W(instagramMediaProductType, InstagramMediaProductType.STORY), AnonymousClass7TF.A1W(instagramMediaProductType, InstagramMediaProductType.IGTV), AnonymousClass7TF.A1W(instagramMediaProductType, InstagramMediaProductType.CLIPS));
                        AnonymousClass0fD.A0C(314338341, A05);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
