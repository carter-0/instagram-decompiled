package X;

import android.view.View;

/* renamed from: X.Aon  reason: case insensitive filesystem */
public final class C41127Aon implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass3Y5 A01;
    public final /* synthetic */ C338047hK A02;

    public C41127Aon(View view, AnonymousClass3Y5 r2, C338047hK r3) {
        this.A01 = r2;
        this.A00 = view;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004f, code lost:
        if (r9 != null) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r20 = this;
            r1 = r20
            X.3Y5 r0 = r1.A01
            android.content.Context r13 = X.C243803a8.A00(r0)
            android.view.View r4 = r1.A00
            X.7hK r0 = r1.A02
            com.instagram.common.session.UserSession r14 = r0.A03
            X.7a7 r7 = r0.A01
            X.7dj r0 = r0.A00
            X.7fs r10 = r0.A03
            X.571 r9 = r0.A08
            r0 = 2
            X.0qQ.A0B(r14, r0)
            r3 = 1
            X.1Av r2 = X.1Au.A00(r14)
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = java.lang.System.currentTimeMillis()
            long r11 = r6.toSeconds(r0)
            X.0xa r2 = r2.A01
            java.lang.String r5 = "seen_comment_create_barcelona_post_nux_time_seconds"
            r0 = 0
            long r0 = r2.getLong(r5, r0)
            long r11 = r11 - r0
            boolean r1 = X.0oI.A0A(r13)
            r0 = 0
            if (r1 == 0) goto L_0x00a0
            java.lang.String r8 = "seen_comment_create_barcelona_post_nux_count"
            int r1 = r2.getInt(r8, r0)
            r0 = 3
            if (r1 >= r0) goto L_0x00a0
            r1 = 86400(0x15180, double:4.26873E-319)
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a0
            if (r10 != 0) goto L_0x0051
            r19 = 0
            if (r9 == 0) goto L_0x0053
        L_0x0051:
            r19 = 1
        L_0x0053:
            r0 = 0
            if (r7 == 0) goto L_0x00a1
            com.instagram.user.model.User r2 = r7.A0A
            X.3QO r1 = r7.A04
            com.instagram.model.mediatype.ProductType r0 = r7.A07
        L_0x005c:
            r17 = r2
            r18 = r3
            r16 = r0
            r15 = r1
            boolean r0 = X.C393849x6.A00(r14, r15, r16, r17, r18, r19)
            if (r0 == 0) goto L_0x00a0
            X.0xa r0 = X.AnonymousClass7TE.A0q(r14)
            X.0xY r0 = X.AnonymousClass7TG.A0g(r0, r8)
            r0.apply()
            X.0xY r2 = X.AnonymousClass7TF.A0N(r14)
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r6.toSeconds(r0)
            r2.E5c(r5, r0)
            r2.apply()
            r1 = 2131956361(0x7f131289, float:1.9549276E38)
            android.app.Activity r0 = X.C61270mF.A00(r13)
            X.5Gt r0 = X.AnonymousClass7TG.A0e(r0, r1)
            r0.A03(r4)
            r0.A02()
            r0.A0A = r3
            X.5Gv r0 = r0.A00()
            r0.A06()
        L_0x00a0:
            return
        L_0x00a1:
            r2 = r0
            r1 = r0
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41127Aon.run():void");
    }
}
