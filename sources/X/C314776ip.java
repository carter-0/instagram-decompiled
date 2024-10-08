package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.6ip  reason: invalid class name and case insensitive filesystem */
public final class C314776ip {
    public C275794rx A00;
    public boolean A01;
    public final Activity A02;
    public final View A03;
    public final UserSession A04;
    public final C273384mU A05;
    public final AnonymousClass4DH A06;

    public C314776ip(Activity activity, View view, AnonymousClass4DH r4, UserSession userSession, C273384mU r6) {
        0qQ.A0B(userSession, 3);
        0qQ.A0B(view, 4);
        this.A02 = activity;
        this.A06 = r4;
        this.A04 = userSession;
        this.A03 = view;
        this.A05 = r6;
    }

    public final void A00(Context context, C255773uh r12) {
        String str;
        String str2;
        User user;
        C270104gC r1 = r12.A0B;
        17k.A07(r1, "Share comment to story netego unit is missing comment share model.");
        if (r1 != null) {
            AnonymousClass3II r2 = r1.A00;
            1Xj BPf = r2.BPf();
            DU7 ApN = r2.ApN();
            if (ApN != null) {
                str = ApN.getOriginalCommentId();
            } else {
                str = null;
            }
            DU7 ApN2 = r2.ApN();
            if (ApN2 != null) {
                str2 = ApN2.getOriginalCommentText();
            } else {
                str2 = null;
            }
            if (BPf != null && str != null && str2 != null) {
                this.A05.EHY("dialog");
                Activity activity = this.A02;
                UserSession userSession = this.A04;
                AnonymousClass4DH r3 = this.A06;
                DU7 ApN3 = r2.ApN();
                if (ApN3 != null) {
                    user = ApN3.BZ1();
                } else {
                    user = null;
                }
                I5a.A00(activity, context, r3, 28D.A4o, userSession, BPf, user, str, str2);
            }
        }
    }

    public final void A01(C255773uh r8) {
        C255773uh Au5 = this.A05.Au5();
        if (Au5 != null) {
            C270104gC r1 = Au5.A0B;
            17k.A07(r1, "Share comment to story netego unit is missing comment share model.");
            if (r1 != null) {
                String C9L = r1.A00.C9L();
                if (C9L == null) {
                    C9L = "";
                }
                UserSession userSession = this.A04;
                String str = r8.A0j;
                0qQ.A07(str);
                AnonymousClass3PI.A05(this.A06, userSession, (Long) null, "share_comment_to_story_netego", str, "cta_primary_click", C9L);
            }
        }
    }
}
