package X;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.VuY  reason: case insensitive filesystem */
public final class C18582VuY {
    public ImageView A00;
    public 2da A01;
    public C230132oy A02;
    public Hashtag A03;
    public final Activity A04;
    public final Context A05;
    public final AnonymousClass07i A06;
    public final AnonymousClass0iw A07;
    public final UserSession A08;
    public final C230152p2 A09;
    public final String A0A;

    public C18582VuY(Activity activity, Context context, AnonymousClass07i r5, AnonymousClass0iw r6, UserSession userSession, String str) {
        0qQ.A0B(userSession, 5);
        this.A03 = C281965Ag.A00(00R.A02(str, 1));
        this.A05 = context;
        this.A04 = activity;
        this.A07 = r6;
        this.A08 = userSession;
        this.A0A = str;
        this.A06 = r5;
        this.A09 = new C19384WXb(context, this);
    }

    public static final void A00(C18582VuY vuY, boolean z) {
        ImageView imageView = vuY.A00;
        if (imageView == null) {
            0qQ.A0F("followButton");
            throw AnonymousClass00P.createAndThrow();
        }
        Context context = vuY.A05;
        int i = R.drawable.instagram_circle_add_pano_outline_24;
        if (z) {
            i = R.drawable.instagram_circle_check_pano_outline_24;
        }
        DbU.A13(context, imageView, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007d, code lost:
        if (r0 != 1) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.2da r8) {
        /*
            r7 = this;
            r7.A01 = r8
            com.instagram.common.session.UserSession r5 = r7.A08
            X.0Tu r3 = X.0Tu.A05
            r0 = 36323234206985235(0x810bca00002c13, double:3.03429780219726E-306)
            boolean r0 = X.182.A06(r3, r5, r0)
            if (r0 == 0) goto L_0x00ee
            java.lang.String r0 = r7.A0A
            boolean r0 = X.C253063q9.A02(r0)
            if (r0 == 0) goto L_0x00ee
            com.instagram.model.hashtag.Hashtag r0 = r7.A03
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto L_0x00ee
            X.3JR r2 = new X.3JR
            r2.<init>()
            r0 = 2131238564(0x7f081ea4, float:1.809341E38)
            r2.A06 = r0
            r0 = 2131973125(0x7f135405, float:1.9583277E38)
            r2.A05 = r0
            r1 = 22
            X.WBC r0 = new X.WBC
            r0.<init>(r7, r1)
            X.DbX.A19(r0, r2, r8)
            com.instagram.model.hashtag.Hashtag r0 = r7.A03
            java.lang.String r0 = r0.getId()
            r4 = 0
            if (r0 == 0) goto L_0x00ee
            r0 = 36330041730154918(0x8111fb000041a6, double:3.038602907261463E-306)
            boolean r0 = X.182.A06(r3, r5, r0)
            if (r0 != 0) goto L_0x00ee
            com.instagram.model.hashtag.Hashtag r0 = r7.A03
            java.lang.Boolean r0 = r0.Ab5()
            r1 = 1
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r1)
            if (r0 != 0) goto L_0x0069
            com.instagram.model.hashtag.Hashtag r0 = r7.A03
            java.lang.Integer r0 = r0.B6z()
            if (r0 == 0) goto L_0x0069
            int r0 = r0.intValue()
            if (r0 == r4) goto L_0x00ee
        L_0x0069:
            X.3JR r6 = new X.3JR
            r6.<init>()
            com.instagram.model.hashtag.Hashtag r0 = r7.A03
            java.lang.Integer r0 = r0.B6z()
            if (r0 == 0) goto L_0x007f
            int r0 = r0.intValue()
            r2 = 2131238110(0x7f081cde, float:1.809249E38)
            if (r0 == r1) goto L_0x0082
        L_0x007f:
            r2 = 2131238101(0x7f081cd5, float:1.8092471E38)
        L_0x0082:
            r6.A06 = r2
            r2 = 2131962589(0x7f132add, float:1.9561907E38)
            r6.A05 = r2
            r3 = 23
            X.WBC r0 = new X.WBC
            r0.<init>(r7, r3)
            r6.A0G = r0
            android.view.View r6 = X.C51970G9q.A0P(r6, r8)
            r0 = 86
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r6, r0)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r7.A00 = r6
            if (r6 != 0) goto L_0x00af
            java.lang.String r0 = "followButton"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00af:
            com.instagram.model.hashtag.Hashtag r0 = r7.A03
            java.lang.Integer r0 = r0.B6z()
            if (r0 == 0) goto L_0x00bd
            int r0 = r0.intValue()
            if (r0 == r1) goto L_0x00ee
        L_0x00bd:
            X.0xa r0 = X.AnonymousClass7TE.A0q(r5)
            java.lang.String r3 = "hashtag_serp_follow_tooltip_shown_count"
            int r0 = r0.getInt(r3, r4)
            if (r0 >= r1) goto L_0x00ee
            android.app.Activity r0 = r7.A04
            X.5Gt r0 = X.AnonymousClass7TG.A0e(r0, r2)
            r0.A03(r6)
            r0.A01()
            r0.A0A = r1
            r0.A0B = r1
            X.5Gv r0 = r0.A00()
            X.Wni r2 = new X.Wni
            r2.<init>(r0, r7)
            r0 = 500(0x1f4, double:2.47E-321)
            r6.postDelayed(r2, r0)
            X.0xa r0 = X.AnonymousClass7TE.A0q(r5)
            X.JTS.A1S(r0, r3, r4)
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18582VuY.A01(X.2da):void");
    }
}
