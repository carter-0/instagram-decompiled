package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

public final class W5T implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public W5T(Activity activity, DialogInterface.OnDismissListener onDismissListener, 0hq r3, UserSession userSession, C255773uh r5, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A03 = r5;
            this.A01 = activity;
            this.A02 = r3;
            this.A05 = userSession;
            this.A04 = onDismissListener;
        } else {
            this.A04 = r5;
            this.A01 = activity;
            this.A03 = r3;
            this.A05 = userSession;
            this.A02 = onDismissListener;
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context;
        int i2;
        String str;
        1Xj r5;
        1Xj r52;
        switch (this.A00) {
            case 0:
                C255773uh r2 = (C255773uh) this.A04;
                if (r2.A0e != C250963mL.MEDIA || (r5 = r2.A0b) == null) {
                    context = (Context) this.A01;
                    i2 = 2131971554;
                    str = "reel_media_hard_delete_failed";
                    break;
                } else {
                    new C18070Vkx((Context) this.A01, (0hq) this.A03, (UserSession) this.A05, r5).A04((DialogInterface.OnDismissListener) this.A02);
                    return;
                }
            case 1:
                C255773uh r22 = (C255773uh) this.A03;
                if (r22.A0e != C250963mL.MEDIA || (r52 = r22.A0b) == null) {
                    context = (Context) this.A01;
                    i2 = 2131971555;
                    str = "reel_media_recover_failed";
                    break;
                } else {
                    new C18070Vkx((Context) this.A01, (0hq) this.A02, (UserSession) this.A05, r52).A04((DialogInterface.OnDismissListener) this.A04);
                    return;
                }
            default:
                1Xj r10 = (1Xj) this.A04;
                String A2w = r10.A2w();
                if (A2w != null) {
                    String A30 = r10.A30();
                    if (A30 != null) {
                        0lg r9 = (0lg) this.A05;
                        Context context2 = (Context) this.A01;
                        AnonymousClass07i r23 = (AnonymousClass07i) this.A03;
                        H4N h4n = new H4N(3, context2, this.A02, r9, r10);
                        0qQ.A0B(r23, 4);
                        1NY A0a = AnonymousClass7TG.A0a(r9);
                        A0a.A0A("fundraiser/untag_fundraiser_in_feed_media/");
                        A0a.A9m("medium_igid", A30);
                        DbX.A1M(A0a, "fundraiser_id", A2w);
                        1OC A0M = A0a.A0M();
                        A0M.A00 = h4n;
                        1ES.A00(context2, r23, A0M);
                        return;
                    }
                    throw AnonymousClass7TE.A0y();
                }
                return;
        }
        C59689JTv.A0F(context, str, i2);
    }

    public W5T(Activity activity, AnonymousClass07i r3, C53290Glc glc, UserSession userSession, 1Xj r6) {
        this.A00 = 2;
        this.A04 = r6;
        this.A05 = userSession;
        this.A01 = activity;
        this.A03 = r3;
        this.A02 = glc;
    }
}
