package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.7H4  reason: invalid class name */
public final class AnonymousClass7H4 {
    public ArrayList A00 = new ArrayList();
    public final UserSession A01;
    public final Activity A02;
    public final C328967Gz A03;
    public final C62320sa A04;

    /* JADX WARNING: type inference failed for: r8v2, types: [X.78U, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v4, types: [X.78U, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r13v4, types: [X.78U, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C329757Kc r16, X.2Er r17, java.util.List r18, boolean r19, boolean r20) {
        /*
            r15 = this;
            r1 = 1
            r5 = r18
            X.0qQ.A0B(r5, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r15.A00 = r0
            r0 = r17
            if (r17 == 0) goto L_0x0155
            int r2 = r0.BHS()
            if (r2 != 0) goto L_0x0155
            if (r19 == 0) goto L_0x0021
            if (r16 == 0) goto L_0x0155
            boolean r2 = r16.CQJ()
            if (r2 != r1) goto L_0x0155
        L_0x0021:
            if (r20 != 0) goto L_0x0155
            com.instagram.common.session.UserSession r7 = r15.A01
            X.3sy r2 = r0.BJz()
            boolean r2 = r2 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            if (r2 == 0) goto L_0x003a
            X.0Tu r4 = X.0Tu.A05
            r2 = 36319308607593595(0x810838000b1c7b, double:3.0318152373348667E-306)
            boolean r2 = X.182.A06(r4, r7, r2)
            if (r2 == 0) goto L_0x0046
        L_0x003a:
            java.util.ArrayList r4 = r15.A00
            X.7Gz r3 = r15.A03
            X.78M r2 = new X.78M
            r2.<init>(r7, r3, r5)
            r4.add(r2)
        L_0x0046:
            boolean r2 = X.AnonymousClass78O.A00(r7, r0)
            if (r2 == 0) goto L_0x006d
            java.util.ArrayList r3 = r15.A00
            android.app.Activity r6 = r15.A02
            X.7OR r8 = X.AnonymousClass7OR.MENTION
            X.7OS r10 = X.AnonymousClass7OS.EVERYONE
            r2 = 2131960551(0x7f1322e7, float:1.9557774E38)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            r12 = 2131238965(0x7f082035, float:1.8094224E38)
            X.78T r13 = new X.78T
            r13.<init>()
            java.lang.String r9 = "everyone"
            X.Nc0 r5 = new X.Nc0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r3.add(r5)
        L_0x006d:
            X.78S r2 = X.AnonymousClass78P.A00
            boolean r2 = r2.A00(r7, r0)
            if (r2 == 0) goto L_0x00a1
            java.util.ArrayList r4 = r15.A00
            android.app.Activity r6 = r15.A02
            int r3 = r0.C6a()
            X.7OR r10 = X.AnonymousClass7OR.ACTION
            X.7OS r9 = X.AnonymousClass7OS.SILENT
            r2 = 29
            r13 = 2131960571(0x7f1322fb, float:1.9557814E38)
            if (r3 != r2) goto L_0x008b
            r13 = 2131960572(0x7f1322fc, float:1.9557816E38)
        L_0x008b:
            X.78T r8 = new X.78T
            r8.<init>()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            java.lang.String r12 = "silent"
            r14 = 2131237867(0x7f081beb, float:1.8091997E38)
            X.78P r5 = new X.78P
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r4.add(r5)
        L_0x00a1:
            boolean r1 = X.AnonymousClass78V.A00(r7, r0)
            if (r1 == 0) goto L_0x00b3
            java.util.ArrayList r3 = r15.A00
            android.app.Activity r2 = r15.A02
            X.78X r1 = new X.78X
            r1.<init>(r2, r7)
            r3.add(r1)
        L_0x00b3:
            boolean r1 = X.AnonymousClass78V.A00(r7, r0)
            if (r1 == 0) goto L_0x00c5
            java.util.ArrayList r3 = r15.A00
            android.app.Activity r2 = r15.A02
            X.78b r1 = new X.78b
            r1.<init>(r2, r7)
            r3.add(r1)
        L_0x00c5:
            r8 = 0
            boolean r1 = X.AnonymousClass78V.A00(r7, r0)
            if (r1 == 0) goto L_0x00da
            android.app.Activity r2 = r15.A02
            X.0sa r1 = r15.A04
            X.78d r8 = new X.78d
            r8.<init>(r2, r7, r1)
            java.util.ArrayList r1 = r15.A00
            r1.add(r8)
        L_0x00da:
            com.instagram.user.model.User r3 = r0.BZK()
            int r2 = r0.C6a()
            r1 = 1012(0x3f4, float:1.418E-42)
            if (r2 != r1) goto L_0x015a
            if (r3 == 0) goto L_0x0158
            X.4Cl r1 = r3.A03
            com.instagram.api.schemas.IGAIAgentType r2 = r1.AaX()
        L_0x00ee:
            com.instagram.api.schemas.IGAIAgentType r1 = com.instagram.api.schemas.IGAIAgentType.A06
            if (r2 != r1) goto L_0x015a
            boolean r1 = X.AnonymousClass9B8.A08(r7)
            if (r1 == 0) goto L_0x015a
            java.util.ArrayList r2 = r15.A00
            android.app.Activity r1 = r15.A02
            X.78f r5 = new X.78f
            r5.<init>(r1, r7)
        L_0x0101:
            r2.add(r5)
        L_0x0104:
            com.instagram.user.model.User r2 = r0.BZK()
            int r1 = r0.C6a()
            r0 = 1012(0x3f4, float:1.418E-42)
            if (r1 != r0) goto L_0x0155
            if (r2 == 0) goto L_0x0156
            X.4Cl r0 = r2.A03
            com.instagram.api.schemas.IGAIAgentType r1 = r0.AaX()
        L_0x0118:
            com.instagram.api.schemas.IGAIAgentType r0 = com.instagram.api.schemas.IGAIAgentType.A06
            if (r1 != r0) goto L_0x0155
            boolean r0 = X.AnonymousClass9B8.A08(r7)
            if (r0 == 0) goto L_0x0155
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319398807936278(0x81084d00671d16, double:3.031872280394787E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x0155
            java.util.ArrayList r1 = r15.A00
            android.app.Activity r6 = r15.A02
            X.7OR r10 = X.AnonymousClass7OR.ACTION
            X.7OS r9 = X.AnonymousClass7OS.IMAGINE_ME
            X.AnonymousClass9B9.A00()
            X.78T r8 = new X.78T
            r8.<init>()
            r0 = 102(0x66, float:1.43E-43)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            java.lang.String r12 = "imagine me"
            r13 = 2131960536(0x7f1322d8, float:1.9557743E38)
            r14 = 2131238672(0x7f081f10, float:1.809363E38)
            X.Nc2 r5 = new X.Nc2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1.add(r5)
        L_0x0155:
            return
        L_0x0156:
            r1 = 0
            goto L_0x0118
        L_0x0158:
            r2 = 0
            goto L_0x00ee
        L_0x015a:
            if (r8 == 0) goto L_0x0104
            X.78W r2 = X.AnonymousClass78W.A00
            r1 = 0
            boolean r1 = r2.A00(r0, r1)
            if (r1 == 0) goto L_0x0104
            boolean r1 = X.AnonymousClass9B8.A08(r7)
            if (r1 == 0) goto L_0x0104
            android.app.Activity r6 = r15.A02
            X.78f r9 = new X.78f
            r9.<init>(r6, r7)
            java.util.ArrayList r2 = r15.A00
            java.lang.Integer r10 = r9.A00
            X.78g r5 = new X.78g
            r5.<init>(r6, r7, r8, r9, r10)
            goto L_0x0101
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7H4.A00(X.7Kc, X.2Er, java.util.List, boolean, boolean):void");
    }

    public AnonymousClass7H4(Activity activity, UserSession userSession, C328967Gz r4, C62320sa r5) {
        this.A02 = activity;
        this.A01 = userSession;
        this.A03 = r4;
        this.A04 = r5;
    }
}
