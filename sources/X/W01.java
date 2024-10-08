package X;

import android.content.Context;
import android.content.DialogInterface;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

public final class W01 {
    public final Context A00;
    public final 1Ng A01;
    public final UserSession A02;
    public final 1Xj A03;
    public final C255773uh A04;
    public final 0hq A05;

    public final void A02(DialogInterface.OnDismissListener onDismissListener, C17589Vah vah, boolean z, boolean z2) {
        String str;
        C17589Vah vah2 = vah;
        if (vah != null) {
            str = vah.A01;
        } else {
            str = "";
        }
        1NY A0a = AnonymousClass7TG.A0a(this.A02);
        1Xj r3 = this.A03;
        DbU.A1P(A0a, AnonymousClass000.A00(320), new Object[]{r3.getId(), r3.BR7()});
        JTO.A1W(A0a, r3.getId());
        A0a.A9m("deep_delete_waterfall", str);
        A0a.A0Q(C15246UXg.class, C18236Vo3.class);
        A0a.A0R = true;
        boolean z3 = z;
        if (z) {
            A0a.A9m("delete_fb_story", "true");
        }
        1OC A0M = A0a.A0M();
        A0M.A00 = new C15617Ufj(1, this, vah2, new F3H(onDismissListener, this.A05, AnonymousClass05K.A00), z3, z2);
        1ES.A03(A0M);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (X.182.A06(X.0Tu.A05, r8.A02, 36319939967524664L) == false) goto L_0x001a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C17589Vah r6, X.C15246UXg r7, X.W01 r8, boolean r9, boolean r10) {
        /*
            boolean r0 = r7.A00
            r2 = 1
            if (r0 != 0) goto L_0x0079
            boolean r0 = r7.isOk()
            if (r0 == 0) goto L_0x001a
            com.instagram.common.session.UserSession r4 = r8.A02
            X.0Tu r3 = X.0Tu.A05
            r0 = 36319939967524664(0x8108cb00071f38, double:3.032214511897557E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 != 0) goto L_0x0079
        L_0x001a:
            r1 = 1
        L_0x001b:
            if (r9 == 0) goto L_0x007b
            boolean r0 = r7.A01
            if (r0 != 0) goto L_0x007b
            boolean r0 = r7.A02
            r0 = r0 ^ 1
            if (r1 == 0) goto L_0x006b
            if (r0 == 0) goto L_0x005f
            r0 = 2131957502(0x7f1316fe, float:1.955159E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "deep_delete_failed_instagram_and_facebook"
            java.lang.String r5 = "ig_deletion_failure_fb_deletion_failure"
        L_0x0034:
            android.content.Context r4 = r8.A00
            int r3 = r1.intValue()
            X.C59689JTv.A01(r4, r0, r3, r2)
            if (r10 == 0) goto L_0x0048
            if (r6 == 0) goto L_0x0048
            java.lang.String r1 = "view"
            java.lang.String r0 = "failure_toast"
            X.VFY.A00(r6, r1, r0, r5, r9)
        L_0x0048:
            com.instagram.common.session.UserSession r2 = r8.A02
            X.Vkw r1 = X.C49089EpE.A00(r2)
            java.lang.String r0 = "failure_reason"
            r1.A03(r0, r5)
            X.Vkw r1 = X.C49089EpE.A00(r2)
            java.lang.String r0 = r4.getString(r3)
            r1.A04(r5, r0)
            return
        L_0x005f:
            r0 = 2131957503(0x7f1316ff, float:1.9551592E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "deep_delete_failed_instagram_only"
            java.lang.String r5 = "ig_deletion_failure_fb_deletion_success"
            goto L_0x0034
        L_0x006b:
            if (r0 == 0) goto L_0x0081
            r0 = 2131957501(0x7f1316fd, float:1.9551588E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "deep_delete_failed_facebook_only"
            java.lang.String r5 = "ig_deletion_success_fb_deletion_failure"
            goto L_0x0034
        L_0x0079:
            r1 = 0
            goto L_0x001b
        L_0x007b:
            if (r1 == 0) goto L_0x0081
            A01(r6, r8, r9, r10, r2)
            return
        L_0x0081:
            com.instagram.common.session.UserSession r0 = r8.A02
            X.Vkw r0 = X.C49089EpE.A00(r0)
            X.1QP r2 = r0.A01
            long r0 = r0.A00
            r2.flowEndSuccess(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W01.A00(X.Vah, X.UXg, X.W01, boolean, boolean):void");
    }

    public static final void A01(C17589Vah vah, W01 w01, boolean z, boolean z2, boolean z3) {
        int i;
        String str;
        if (w01.A03.CeS()) {
            i = 2131957573;
            str = "delete_media_video_failed";
        } else {
            i = 2131957570;
            str = "delete_media_photo_failed";
        }
        if (z3) {
            C59689JTv.A0F(w01.A00, str, i);
        }
        UserSession userSession = w01.A02;
        C49089EpE.A00(userSession).A03(TraceFieldType.FailureReason, "soft_deletion_failure");
        C49089EpE.A00(userSession).A04("soft_deletion_failure", w01.A00.getString(i));
        if (z2 && vah != null) {
            VFY.A00(vah, "view", "failure_toast", "ig_generic_failure", z);
        }
    }

    public final void A03(DialogInterface.OnDismissListener onDismissListener, String str) {
        1NY A0a = AnonymousClass7TG.A0a(this.A02);
        A0a.A0A("stories/prompt_stickers/delete_story_template/");
        A0a.A9m("prompt_id", str);
        A0a.A0Q(C15246UXg.class, C18236Vo3.class);
        1OC A0K = DbW.A0K(A0a);
        C15619Ufl.A00(A0K, new F3H(onDismissListener, this.A05, AnonymousClass05K.A00), this, 18);
        1ES.A03(A0K);
    }

    public W01(Context context, 0hq r3, UserSession userSession, C255773uh r5) {
        C51972G9s.A1C(r3, userSession);
        this.A00 = context;
        this.A05 = r3;
        this.A04 = r5;
        this.A02 = userSession;
        1Xj r0 = r5.A0b;
        if (r0 != null) {
            this.A03 = r0;
            this.A01 = AnonymousClass1Nd.A00(userSession);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
