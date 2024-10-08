package X;

import android.app.Activity;

/* renamed from: X.Fdy  reason: case insensitive filesystem */
public final class C50538Fdy implements G79 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C51912G7g A01;
    public final /* synthetic */ FBJ A02;
    public final /* synthetic */ Boolean A03;

    public C50538Fdy(Activity activity, C51912G7g g7g, FBJ fbj, Boolean bool) {
        this.A02 = fbj;
        this.A00 = activity;
        this.A03 = bool;
        this.A01 = g7g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Doe(java.lang.String r5) {
        /*
            r4 = this;
            X.FBJ r1 = r4.A02
            X.G7g r0 = r1.A01
            if (r0 == 0) goto L_0x005a
            r2 = 0
            android.app.Activity r0 = r4.A00
            boolean r0 = X.SMf.A00(r0)
            if (r0 == 0) goto L_0x005b
            X.0qQ.A0B(r5, r2)
            java.util.regex.Pattern r0 = X.FES.A01
            X.0qQ.A08(r0)
            java.lang.String r3 = X.FES.A00(r5, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x0033
            java.lang.Boolean r0 = r4.A03
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0033
            java.util.regex.Pattern r0 = X.FES.A02
            X.0qQ.A08(r0)
            java.lang.String r3 = X.FES.A00(r5, r0)
            r2 = 1
        L_0x0033:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x0042
            java.util.regex.Pattern r0 = X.FES.A05
        L_0x003b:
            X.0qQ.A08(r0)
            java.lang.String r3 = X.FES.A00(r5, r0)
        L_0x0042:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0088
            java.lang.Boolean r0 = r4.A03
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0055
            X.G7g r0 = r1.A01
            r0.DgR(r3, r2)
        L_0x0055:
            X.G7g r0 = r1.A01
            r0.DgQ(r3)
        L_0x005a:
            return
        L_0x005b:
            X.0qQ.A0B(r5, r2)
            java.util.regex.Pattern r0 = X.FES.A03
            X.0qQ.A08(r0)
            java.lang.String r3 = X.FES.A00(r5, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x007f
            java.lang.Boolean r0 = r4.A03
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x007f
            java.util.regex.Pattern r0 = X.FES.A04
            X.0qQ.A08(r0)
            java.lang.String r3 = X.FES.A00(r5, r0)
            r2 = 1
        L_0x007f:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x0042
            java.util.regex.Pattern r0 = X.FES.A06
            goto L_0x003b
        L_0x0088:
            X.G7g r1 = r1.A01
            java.lang.String r0 = "parse_error"
            r1.DgS(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50538Fdy.Doe(java.lang.String):void");
    }

    public final void onFail(C268654dm r3) {
        String str;
        Throwable A012 = r3.A01();
        if (A012 != null) {
            str = A012.getMessage();
        } else {
            str = "unknown";
        }
        this.A01.DgS(str);
    }
}
