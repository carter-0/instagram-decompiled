package X;

import com.facebook.spm.SentencePieceModel;
import com.instagram.common.session.UserSession;

public final class SGd {
    public final UserSession A00;

    /* JADX WARNING: type inference failed for: r8v0, types: [X.RzY, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v1, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass40G A01(X.C258993zy r14, X.C258743zZ r15, X.C258743zZ r16) {
        /*
            r13 = this;
            r5 = 0
            r9 = r15
            r10 = r16
            boolean r2 = X.AnonymousClass7TF.A1U(r5, r15, r10)
            r1 = 2
            com.instagram.common.session.UserSession r3 = r13.A00
            X.950 r4 = X.C3733194w.A00(r3)
            X.3zZ[] r0 = new X.C258743zZ[]{r15, r10}
            java.util.List r0 = X.0sr.A1P(r0)
            X.40G r6 = r4.A01(r0)
            java.lang.String r0 = "pytorch_download_models_end"
            r14.A01(r0)
            boolean r0 = r6.A02
            r4 = 0
            if (r0 == 0) goto L_0x00a3
            X.1US r6 = X.1US.A1F
            X.1RH r0 = X.1RH.A00()
            boolean r0 = r0.A06(r6)
            if (r0 != 0) goto L_0x00a6
            X.1RH r0 = X.1RH.A00()
            boolean r0 = r0.A05(r6)
            if (r0 == 0) goto L_0x0046
            X.1RH r0 = X.1RH.A00()
            boolean r0 = r0.A07(r6)
            if (r0 != 0) goto L_0x00a6
        L_0x0046:
            java.lang.String r7 = ""
            com.google.common.util.concurrent.SettableFuture r8 = new com.google.common.util.concurrent.SettableFuture     // Catch:{ Exception -> 0x008d }
            r8.<init>()     // Catch:{ Exception -> 0x008d }
            X.1US[] r0 = new X.1US[]{r6}     // Catch:{ Exception -> 0x008d }
            X.PyC r6 = new X.PyC     // Catch:{ Exception -> 0x008d }
            r6.<init>(r0)     // Catch:{ Exception -> 0x008d }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ Exception -> 0x008d }
            r6.A03 = r0     // Catch:{ Exception -> 0x008d }
            X.T82 r0 = new X.T82     // Catch:{ Exception -> 0x008d }
            r0.<init>(r8, r1)     // Catch:{ Exception -> 0x008d }
            r6.A02 = r0     // Catch:{ Exception -> 0x008d }
            X.1RH r1 = X.1RH.A00()     // Catch:{ Exception -> 0x008d }
            X.PyB r0 = new X.PyB     // Catch:{ Exception -> 0x008d }
            r0.<init>(r6)     // Catch:{ Exception -> 0x008d }
            r1.A03(r3, r0)     // Catch:{ Exception -> 0x008d }
            java.lang.Object r0 = r8.get()     // Catch:{ Exception -> 0x008d }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x008d }
            X.0qQ.A0A(r0)     // Catch:{ Exception -> 0x008d }
            boolean r6 = r0.booleanValue()     // Catch:{ Exception -> 0x008d }
            if (r6 == 0) goto L_0x007e
            r0 = r7
            goto L_0x0087
        L_0x007e:
            java.lang.String r1 = "spm"
            java.lang.String r0 = " voltron module not loaded"
            java.lang.String r0 = X.002.A0R(r1, r0)     // Catch:{ Exception -> 0x008d }
        L_0x0087:
            X.40G r1 = new X.40G     // Catch:{ Exception -> 0x008d }
            r1.<init>(r7, r0, r6)     // Catch:{ Exception -> 0x008d }
            goto L_0x0097
        L_0x008d:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            X.40G r1 = new X.40G
            r1.<init>(r7, r0, r5)
        L_0x0097:
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x00a6
            java.lang.String r0 = r1.A01
            X.40G r1 = new X.40G
            r1.<init>(r4, r0, r5)
            goto L_0x00ab
        L_0x00a3:
            java.lang.String r0 = r6.A01
            goto L_0x00b1
        L_0x00a6:
            X.40G r1 = new X.40G
            r1.<init>(r4, r4, r2)
        L_0x00ab:
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x00b7
            java.lang.String r0 = "Failed to load SPM Voltron module"
        L_0x00b1:
            X.40G r1 = new X.40G
            r1.<init>(r4, r0, r5)
            return r1
        L_0x00b7:
            java.lang.String r0 = "voltron_load_end"
            r14.A01(r0)
            X.S4A r3 = X.C9265RVq.A00(r3)
            X.40G r1 = A00(r3, r10)
            java.lang.String r0 = "spm_load_end"
            r14.A01(r0)
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x00d2
            java.lang.String r0 = r1.A01
            goto L_0x00b1
        L_0x00d2:
            X.40G r6 = r3.A00(r15)
            java.lang.String r0 = "pytorch_model_load_end"
            r14.A01(r0)
            boolean r0 = r6.A02
            if (r0 == 0) goto L_0x00a3
            java.lang.Object r12 = r6.A00
            java.lang.String r0 = "Required value was null."
            if (r12 == 0) goto L_0x0105
            X.7xm r12 = (X.C348037xm) r12
            java.lang.Object r11 = r1.A00
            if (r11 == 0) goto L_0x0100
            com.facebook.spm.SentencePieceModel r11 = (com.facebook.spm.SentencePieceModel) r11
            X.RzY r8 = new X.RzY
            r8.<init>()
            X.SoA r7 = new X.SoA
            r7.<init>(r8, r9, r10, r11, r12)
            java.lang.String r0 = ""
            X.40G r1 = new X.40G
            r1.<init>(r7, r0, r2)
            return r1
        L_0x0100:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0105:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SGd.A01(X.3zy, X.3zZ, X.3zZ):X.40G");
    }

    public SGd(UserSession userSession) {
        this.A00 = userSession;
    }

    public static final AnonymousClass40G A00(S4A s4a, C258743zZ r3) {
        try {
            return Pxf.A0M(new SentencePieceModel(s4a.A01(r3)));
        } catch (Throwable th) {
            return new AnonymousClass40G((Object) null, th.getMessage(), false);
        }
    }
}
