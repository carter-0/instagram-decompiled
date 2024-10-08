package X;

import android.text.TextWatcher;
import com.instagram.common.session.UserSession;

/* renamed from: X.6iL  reason: invalid class name and case insensitive filesystem */
public final class C314486iL implements TextWatcher {
    public final /* synthetic */ C314436iG A00;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        if (X.0qQ.A0K(r2, r1) == false) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void afterTextChanged(android.text.Editable r13) {
        /*
            r12 = this;
            r0 = 0
            X.0qQ.A0B(r13, r0)
            X.6iG r3 = r12.A00
            r5 = 1
            X.C314436iG.A03(r3)
            X.6iF r4 = r3.A0o
            X.6hr r2 = r4.A06
            java.lang.String r0 = r13.toString()
            java.lang.CharSequence r0 = X.00l.A0B(r0)
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            r1 = 1
            if (r0 != 0) goto L_0x00a8
            boolean r0 = r4.A00
            if (r0 == 0) goto L_0x00a8
        L_0x0025:
            r2.A0M(r1)
            boolean r1 = r3.A0E
            r0 = 0
            if (r1 == 0) goto L_0x003b
            com.instagram.user.model.User r2 = r3.A0B
            X.3uh r1 = r3.A07
            if (r1 == 0) goto L_0x00a6
            com.instagram.user.model.User r1 = r1.A0i
        L_0x0035:
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 != 0) goto L_0x0072
        L_0x003b:
            com.instagram.common.session.UserSession r6 = r3.A0e
            X.0Tu r4 = X.0Tu.A06
            r1 = 36320970759414768(0x8109bb000323f0, double:3.0328663888395246E-306)
            boolean r1 = X.182.A06(r4, r6, r1)
            if (r1 == 0) goto L_0x0072
            r3.A0E = r5
            X.3uh r1 = r3.A07
            if (r1 == 0) goto L_0x0052
            com.instagram.user.model.User r0 = r1.A0i
        L_0x0052:
            r3.A0B = r0
            X.1Av r8 = X.1Au.A00(r6)
            X.3uh r0 = r3.A07
            if (r0 == 0) goto L_0x00a3
            com.instagram.user.model.User r0 = r0.A0i
            if (r0 == 0) goto L_0x00a3
            java.lang.String r0 = r0.getId()
        L_0x0064:
            long r10 = java.lang.Long.parseLong(r0)
            X.PFf r7 = new X.PFf
            r7.<init>(r3)
            java.lang.String r9 = ""
            X.C66832MdQ.A01(r6, r7, r8, r9, r10)
        L_0x0072:
            java.lang.Long r0 = r3.A0D
            if (r0 != 0) goto L_0x00a2
            int r0 = r13.length()
            if (r0 <= 0) goto L_0x00a2
            com.instagram.common.session.UserSession r4 = r3.A0e
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320824730919814(0x81099900092386, double:3.032774039831306E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 != 0) goto L_0x0098
            X.3U9 r1 = X.C314436iG.A00(r3)
            if (r1 == 0) goto L_0x0098
            X.6oB r0 = r3.A0m
            if (r0 == 0) goto L_0x0098
            r0.A01(r1)
        L_0x0098:
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A0D = r0
        L_0x00a2:
            return
        L_0x00a3:
            java.lang.String r0 = "-1"
            goto L_0x0064
        L_0x00a6:
            r1 = r0
            goto L_0x0035
        L_0x00a8:
            r1 = 0
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C314486iL.afterTextChanged(android.text.Editable):void");
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C314486iL(C314436iG r1) {
        this.A00 = r1;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        1Xj r7;
        C314436iG r3 = this.A00;
        C255773uh r0 = r3.A07;
        if (r0 != null && (r7 = r0.A0b) != null && i == 0 && i2 == 0 && i3 == 1 && !r3.A0F && !r3.A0G) {
            UserSession userSession = r3.A0e;
            if (182.A06(0Tu.A05, userSession, 36323758192995785L)) {
                C72986PRt pRt = new C72986PRt(r3);
                0h9 r4 = r3.A0c.mLifecycleRegistry;
                0qQ.A07(r4);
                Integer num = AnonymousClass05K.A0C;
                C335747dT.A02(r3.A0V, r4, AnonymousClass0kN.A02(userSession), userSession, r7, pRt, num, 0sn.A00);
            }
        }
    }
}
