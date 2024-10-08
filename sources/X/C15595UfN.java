package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.UfN  reason: case insensitive filesystem */
public final class C15595UfN extends 1P0 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-2005211653);
        C15630Ufw ufw = (C15630Ufw) obj;
        int A032 = AnonymousClass0fD.A03(1011951174);
        0qQ.A0B(ufw, 0);
        C18798W2k.A00.A04(this.A00, this.A01, ufw, this.A02, false);
        AnonymousClass0fD.A0A(596243409, A032);
        AnonymousClass0fD.A0A(-1072905256, A03);
    }

    public C15595UfN(UserSession userSession, Activity activity, String str) {
        this.A01 = userSession;
        this.A00 = activity;
        this.A02 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002f, code lost:
        if (r1 != null) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFail(X.C268654dm r5) {
        /*
            r4 = this;
            r0 = 692374195(0x2944cab3, float:4.3696556E-14)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r2 = 0
            X.0qQ.A0B(r5, r2)
            X.C15595UfN.super.onFail(r5)
            java.lang.Throwable r1 = r5.A01()
            boolean r0 = r1 instanceof X.C16693V1w
            if (r0 == 0) goto L_0x003d
            r0 = 91
            java.lang.String r0 = X.Pxd.A00(r0)
            X.0qQ.A0C(r1, r0)
            X.V1w r1 = (X.C16693V1w) r1
            com.google.common.collect.ImmutableList r0 = r1.A00
            java.lang.Object r0 = r0.get(r2)
            X.ThL r0 = (X.C13802ThL) r0
            if (r0 == 0) goto L_0x003d
            java.lang.String r1 = r0.getDescription()
            if (r1 == 0) goto L_0x003d
        L_0x0031:
            java.lang.String r0 = "rapid_feedback_controller"
            X.0wb.A03(r0, r1)
            r0 = -1385392468(0xffffffffad6c96ac, float:-1.3448503E-11)
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        L_0x003d:
            java.lang.String r1 = "Survey fetch failed."
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15595UfN.onFail(X.4dm):void");
    }
}
