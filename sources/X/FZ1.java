package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.instagram.challenge.activity.ChallengeActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import java.util.Iterator;
import java.util.Map;

public final class FZ1 implements 0lm, AnonymousClass0lh {
    public 0wc A00;
    public String A01;
    public boolean A02 = false;
    public boolean A03 = true;
    public boolean A04 = false;
    public boolean A05 = false;
    public final 0lg A06;
    public final 0lT A07;

    public final synchronized void A01() {
        this.A04 = false;
    }

    /* JADX WARNING: type inference failed for: r0v18, types: [X.1qK, java.lang.Object] */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0010: MOVE  (r0v17 com.instagram.common.session.UserSession) = (r8v0 com.instagram.common.session.UserSession)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final synchronized void A02(android.content.Context r13, X.F0A r14) {
        /*
            r12 = this;
            monitor-enter(r12)
            boolean r0 = r12.A02     // Catch:{ all -> 0x006e }
            if (r0 != 0) goto L_0x006c
            boolean r0 = r12.A04     // Catch:{ all -> 0x006e }
            if (r0 != 0) goto L_0x006c
            X.0lg r8 = r12.A06     // Catch:{ all -> 0x006e }
            boolean r0 = r8 instanceof com.instagram.common.session.UserSession     // Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x0020
            r0 = r8
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0     // Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x0020
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r0)     // Catch:{ all -> 0x006e }
            X.36e r0 = new X.36e     // Catch:{ all -> 0x006e }
            r0.<init>()     // Catch:{ all -> 0x006e }
            r1.A00(r0)     // Catch:{ all -> 0x006e }
        L_0x0020:
            r4 = 1
            r12.A02 = r4     // Catch:{ all -> 0x006e }
            r3 = 2
            X.EDb r7 = new X.EDb     // Catch:{ all -> 0x006e }
            r6 = r13
            r7.<init>((int) r3, (java.lang.Object) r14, (java.lang.Object) r13, (java.lang.Object) r12)     // Catch:{ all -> 0x006e }
            java.lang.String r0 = r14.A01     // Catch:{ all -> 0x006e }
            X.C49317Et0.A02 = r0     // Catch:{ all -> 0x006e }
            java.lang.String r0 = r14.A00     // Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x005f
            r5 = 0
            android.net.Uri r1 = X.0cp.A03(r0)     // Catch:{ all -> 0x006e }
            java.lang.String r0 = "challenge_node_id"
            java.lang.String r0 = r1.getQueryParameter(r0)     // Catch:{ all -> 0x006e }
            X.C49317Et0.A03 = r0     // Catch:{ all -> 0x006e }
            java.lang.String r1 = r14.A00     // Catch:{ all -> 0x006e }
            java.lang.String r0 = "challenge/"
            int r0 = r1.indexOf(r0)     // Catch:{ all -> 0x006e }
            if (r0 < 0) goto L_0x005f
            java.lang.String r1 = r1.substring(r0)     // Catch:{ all -> 0x006e }
            java.lang.String r0 = "/"
            java.lang.String[] r2 = r1.split(r0)     // Catch:{ all -> 0x006e }
            int r1 = r2.length     // Catch:{ all -> 0x006e }
            r0 = 3
            if (r1 < r0) goto L_0x0068
            r0 = r2[r4]     // Catch:{ all -> 0x006e }
            X.C49317Et0.A01 = r0     // Catch:{ all -> 0x006e }
            r0 = r2[r3]     // Catch:{ all -> 0x006e }
        L_0x005d:
            X.C49317Et0.A00 = r0     // Catch:{ all -> 0x006e }
        L_0x005f:
            java.lang.Integer r9 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x006e }
            java.lang.String r10 = "challenge/"
            r11 = 0
            X.C49317Et0.A00(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x006e }
            goto L_0x006c
        L_0x0068:
            r0 = 0
            X.C49317Et0.A01 = r5     // Catch:{ all -> 0x006e }
            goto L_0x005d
        L_0x006c:
            monitor-exit(r12)
            return
        L_0x006e:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FZ1.A02(android.content.Context, X.F0A):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(android.content.Context r7, X.F0A r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, boolean r14) {
        /*
            r6 = this;
            r0 = 1
            r6.A02 = r0
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x0012
            java.lang.String r0 = "user_id"
            r2.put(r0, r10)
        L_0x0012:
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto L_0x001d
            java.lang.String r0 = "nonce_code"
            r2.put(r0, r11)
        L_0x001d:
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x0028
            java.lang.String r0 = "cni"
            r2.put(r0, r12)
        L_0x0028:
            if (r14 == 0) goto L_0x0077
            X.FV8 r0 = X.FV8.A00()
            X.0lg r5 = r6.A06
            java.lang.String r4 = "igwb_identity_safety_FX_access_safety_security_integrity"
            java.lang.String r3 = "CheckpointManagerImpl"
            boolean r0 = r0.A04(r5, r4, r3)
            if (r0 == 0) goto L_0x0077
            java.lang.String r1 = "choice"
            java.lang.String r0 = "3"
            r2.put(r1, r0)
            X.FV8 r0 = X.FV8.A00()
            java.lang.String r1 = r0.A02(r5, r4, r3)
            java.lang.String r0 = "big_blue_token"
            r2.put(r0, r1)
        L_0x004e:
            if (r13 == 0) goto L_0x0055
            java.lang.String r0 = "challenge_context"
            r2.put(r0, r13)
        L_0x0055:
            X.0lg r3 = r6.A06
            X.0jh r1 = X.DbT.A0P(r3)
            X.19f r0 = X.19f.A1T
            java.lang.String r1 = r1.A02(r0)
            java.lang.String r0 = "fb_family_device_id"
            r2.put(r0, r1)
            r0 = 2
            X.E85 r1 = new X.E85
            r1.<init>(r0, r6, r8, r7)
            X.8ey r0 = X.C359988do.A04(r3, r9, r2)
            r0.A00(r1)
            X.1ES.A03(r0)
            return
        L_0x0077:
            java.lang.String r1 = "get_challenge"
            java.lang.String r0 = "true"
            r2.put(r1, r0)
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FZ1.A03(android.content.Context, X.F0A, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public final synchronized void A04(Context context, String str, String str2, Map map) {
        Integer A002 = C48766Ejp.A00(str);
        if (this.A03) {
            Bundle A0a = AnonymousClass7TE.A0a();
            Iterator A0u = AnonymousClass7TF.A0u(map);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                A0a.putString(DbT.A13(A1J), DbS.A0s(A1J));
            }
            this.A04 = true;
            this.A05 = false;
            if (A002 != AnonymousClass05K.A1F) {
                if (str2 != null) {
                    C49317Et0.A02 = str2;
                }
                0qQ.A0B(A002, 0);
                String token = this.A06.getToken();
                0qQ.A0B(token, 0);
                0qQ.A0B(context, 0);
                Intent intent = new Intent(context, ChallengeActivity.class);
                intent.addFlags(805306368);
                Bundle A0a2 = AnonymousClass7TE.A0a();
                A0a2.putString("ChallengeFragment.challengeType", C48767Ejq.A00(A002));
                DbS.A1A(A0a, token);
                A0a2.putBundle("ChallengeFragment.arguments", A0a);
                intent.putExtras(A0a2);
                try {
                    0kR.A0B(context, intent);
                } catch (IllegalStateException e) {
                    0wb.A07(AnonymousClass000.A00(422), e);
                }
            } else {
                this.A04 = false;
                0wb.A03("Challenge", 002.A0R("Challenge Type Invalid: ", str));
            }
        }
    }

    public static void A00(Context context, FZ1 fz1, F0A f0a) {
        FZ1 fz12 = fz1;
        if (fz12.A03 && !fz12.A04) {
            F0A f0a2 = f0a;
            if (!TextUtils.isEmpty(f0a2.A02)) {
                fz12.A04 = true;
                Context context2 = context;
                String A022 = SQU.A02(context2, f0a2.A02);
                Intent A002 = C49906FEe.A00(context2, fz12.A06, new SimpleWebViewConfig((String) null, (String) null, false, false, false, false, f0a2.A03, true, false, false, !f0a2.A05, true, false, false, (String) null, A022));
                A002.addFlags(335544320);
                0kR.A0B(context2, A002);
            }
        }
    }

    public final void onSessionWillEnd() {
        0lU.A08(this.A07);
        this.A00 = null;
        this.A01 = null;
        A01();
    }

    public final void onUserSessionWillEnd(boolean z) {
        0lU.A08(this.A07);
    }

    public FZ1(0lg r2) {
        this.A06 = r2;
        this.A00 = AnonymousClass0kN.A02(r2);
        this.A01 = AnonymousClass7TF.A0b();
        EEV eev = new EEV(this);
        this.A07 = eev;
        0lU.A07(eev);
    }
}
