package X;

import android.content.DialogInterface;

/* renamed from: X.W5n  reason: case insensitive filesystem */
public final class C18844W5n implements DialogInterface.OnShowListener {
    public final int A00;
    public final Object A01;

    public C18844W5n(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00c7, code lost:
        r3.E5c(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ca, code lost:
        r3.apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00cd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ce, code lost:
        r5 = "userPreferences";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00d0, code lost:
        X.0qQ.A0F(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d7, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onShow(android.content.DialogInterface r7) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x00a3;
                case 1: goto L_0x0090;
                case 2: goto L_0x0071;
                case 3: goto L_0x004e;
                case 4: goto L_0x0017;
                case 5: goto L_0x000f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r6.A01
            X.X8Y r0 = (X.X8Y) r0
            if (r0 == 0) goto L_0x000e
            r0.onShow()
        L_0x000e:
            return
        L_0x000f:
            java.lang.Object r0 = r6.A01
            X.X8T r0 = (X.X8T) r0
            r0.onShow()
            return
        L_0x0017:
            r0 = 818(0x332, float:1.146E-42)
            java.lang.String r0 = X.Pxd.A00(r0)
            X.0qQ.A0C(r7, r0)
            X.0lB r7 = (X.AnonymousClass0lB) r7
            r0 = 2131431442(0x7f0b1012, float:1.8484613E38)
            android.view.View r1 = r7.findViewById(r0)
            r0 = 2
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r1, r0)
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.A01(r1)
            X.0qQ.A07(r1)
            r0 = 3
            r1.A0W(r0)
            r3 = 1
            r1.A0N = r3
            X.00N r2 = r7.A01
            java.lang.Object r1 = r6.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            X.Wyx r0 = new X.Wyx
            r0.<init>(r1, r3)
            X.AnonymousClass00O.A00(r2, r1, r0)
            return
        L_0x004e:
            java.lang.Object r3 = r6.A01
            X.ALf r3 = (X.C39963ALf) r3
            com.instagram.common.session.UserSession r0 = r3.A0K
            X.1Am r2 = X.1Al.A01(r0)
            X.1An r1 = X.1An.A34
            java.lang.Class r0 = r3.getClass()
            X.0xa r0 = r2.A04(r1, r0)
            X.0xY r3 = r0.AR4()
            r0 = 3228(0xc9c, float:4.523E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 1
            r3.E5T(r1, r0)
            goto L_0x00ca
        L_0x0071:
            java.lang.Object r0 = r6.A01
            X.Uac r0 = (X.C15328Uac) r0
            X.1Av r0 = r0.A0I
            if (r0 == 0) goto L_0x00ce
            long r1 = java.lang.System.currentTimeMillis()
            X.0xa r5 = r0.A01
            X.0xY r4 = r5.AR4()
            java.lang.String r3 = "promote_outcome_upsell_education_dialog_impression_count"
            r0 = 0
            X.AnonymousClass7TG.A1L(r4, r5, r3, r0)
            X.0xY r3 = r5.AR4()
            java.lang.String r0 = "promote_outcome_upsell_education_dialog_last_seen_timestamp"
            goto L_0x00c7
        L_0x0090:
            java.lang.Object r0 = r6.A01
            X.Uac r0 = (X.C15328Uac) r0
            X.1Av r0 = r0.A0I
            if (r0 == 0) goto L_0x00ce
            r1 = 1
            X.0xY r3 = X.AnonymousClass7TE.A0p(r0)
            java.lang.String r0 = "has_seen_promote_direct_inbox_entrypoint_education_dialog"
            r3.E5T(r0, r1)
            goto L_0x00ca
        L_0x00a3:
            java.lang.Object r4 = r6.A01
            X.Uac r4 = (X.C15328Uac) r4
            X.1Av r0 = r4.A0I
            java.lang.String r5 = "userPreferences"
            if (r0 == 0) goto L_0x00d0
            X.0xa r3 = r0.A01
            X.0xY r2 = r3.AR4()
            java.lang.String r1 = "promote_direct_inbox_entered_education_dialog_impression_count"
            r0 = 0
            X.AnonymousClass7TG.A1L(r2, r3, r1, r0)
            X.1Av r0 = r4.A0I
            if (r0 == 0) goto L_0x00d0
            long r1 = java.lang.System.currentTimeMillis()
            X.0xY r3 = X.AnonymousClass7TE.A0p(r0)
            java.lang.String r0 = "promote_direct_inbox_entered_education_dialog_last_seen_timestamp"
        L_0x00c7:
            r3.E5c(r0, r1)
        L_0x00ca:
            r3.apply()
            return
        L_0x00ce:
            java.lang.String r5 = "userPreferences"
        L_0x00d0:
            X.0qQ.A0F(r5)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18844W5n.onShow(android.content.DialogInterface):void");
    }
}
