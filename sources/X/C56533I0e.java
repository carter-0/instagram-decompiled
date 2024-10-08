package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.I0e  reason: case insensitive filesystem */
public final class C56533I0e {
    public static final AnonymousClass0iw A02 = DbS.A0O("ig_feed_item_media_notice");
    public final UserSession A00;
    public final Context A01;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C61045Jvj r12, X.C55729HmQ r13, X.C55807Hnn r14, java.lang.String r15) {
        /*
            r11 = this;
            r5 = 0
            r7 = r12
            boolean r10 = X.AnonymousClass7TF.A1U(r5, r14, r12)
            r4 = 2
            r6 = r13
            X.0qQ.A0B(r13, r4)
            android.widget.TextView r1 = r14.A04
            java.lang.String r0 = r12.A06
            r1.setText(r0)
            java.lang.String r2 = r12.A05
            r3 = 0
            r1 = 8
            android.widget.TextView r0 = r14.A03
            if (r2 == 0) goto L_0x0078
            r0.setText(r2)
            r0.setVisibility(r5)
        L_0x0021:
            java.lang.Object r0 = r12.A01
            com.instagram.api.schemas.MediaNoticeIcon r0 = (com.instagram.api.schemas.MediaNoticeIcon) r0
            r8 = r11
            if (r0 == 0) goto L_0x0072
            android.widget.ImageView r2 = r14.A02
            r2.setVisibility(r5)
            int r0 = r0.ordinal()
            if (r0 == r10) goto L_0x0066
            if (r0 != r4) goto L_0x0072
            r0 = 2131238715(0x7f081f3b, float:1.8093717E38)
            r2.setImageResource(r0)
            android.content.Context r1 = r11.A01
            r0 = 2130970215(0x7f040667, float:1.7549134E38)
        L_0x0040:
            int r0 = X.AnonymousClass7TF.A03(r1, r0)
            r2.setColorFilter(r0)
        L_0x0047:
            android.widget.ImageView r1 = r14.A01
            java.lang.String r0 = r12.A07
            if (r0 != 0) goto L_0x004f
            r3 = 8
        L_0x004f:
            r1.setVisibility(r3)
            android.view.View r1 = r14.A00
            X.ICC r5 = new X.ICC
            r9 = r15
            r5.<init>(r6, r7, r8, r9, r10)
            X.AnonymousClass0fU.A00(r5, r1)
            X.I9v r0 = new X.I9v
            r0.<init>(r11, r15)
            r1.addOnAttachStateChangeListener(r0)
            return
        L_0x0066:
            r0 = 2131237822(0x7f081bbe, float:1.8091905E38)
            r2.setImageResource(r0)
            android.content.Context r1 = r11.A01
            r0 = 2130970306(0x7f0406c2, float:1.7549318E38)
            goto L_0x0040
        L_0x0072:
            android.widget.ImageView r0 = r14.A02
            r0.setVisibility(r1)
            goto L_0x0047
        L_0x0078:
            r0.setVisibility(r1)
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56533I0e.A00(X.Jvj, X.HmQ, X.Hnn, java.lang.String):void");
    }

    public C56533I0e(Context context, UserSession userSession) {
        AnonymousClass7TG.A1O(context, userSession);
        this.A01 = context;
        this.A00 = userSession;
    }
}
