package com.instagram.debug.devoptions.direct.burner;

import X.0sP;
import X.1P0;
import X.AnonymousClass0fD;
import X.C268654dm;
import X.C320136rp;

public final class BurnerSendSettingsHelper$Companion$isFollowing$task$1 extends 1P0 {
    public final /* synthetic */ 0sP $callback;

    public BurnerSendSettingsHelper$Companion$isFollowing$task$1(0sP r1) {
        this.$callback = r1;
    }

    public void onFail(C268654dm r4) {
        int A03 = AnonymousClass0fD.A03(1733619832);
        this.$callback.invoke((Object) null);
        AnonymousClass0fD.A0A(-1885729891, A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r5.A0E == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSuccess(X.C320136rp r5) {
        /*
            r4 = this;
            r0 = -762786643(0xffffffffd288ccad, float:-2.93774721E11)
            int r3 = X.AnonymousClass7TG.A0D(r5, r0)
            X.0sP r2 = r4.$callback
            java.lang.Boolean r0 = r5.A02
            if (r0 == 0) goto L_0x0018
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0018
            boolean r1 = r5.A0E
            r0 = 1
            if (r1 != 0) goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.invoke(r0)
            r0 = -1921792206(0xffffffff8d73c732, float:-7.511993E-31)
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper$Companion$isFollowing$task$1.onSuccess(X.6rp):void");
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1931276532);
        onSuccess((C320136rp) obj);
        AnonymousClass0fD.A0A(-794579605, A03);
    }
}
