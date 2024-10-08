package X;

import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.EPk  reason: case insensitive filesystem */
public class C47978EPk extends C231002qi {
    public IgTextView A00;

    /* JADX WARNING: type inference failed for: r6v0, types: [X.2br, java.lang.Object] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C47978EPk(X.AnonymousClass4DH r10, X.AnonymousClass0iw r11, com.instagram.common.session.UserSession r12, com.instagram.quickpromotion.intf.QuickPromotionSlot r13) {
        /*
            r9 = this;
            r0 = 3
            r4 = r12
            r7 = r13
            X.AnonymousClass7TF.A1D(r12, r0, r13)
            r2 = 0
            X.AnonymousClass2bO.A00()
            X.2qh r8 = new X.2qh
            r1 = r10
            r8.<init>(r10, r11, r12)
            X.Fhd r5 = X.C50738Fhd.A00
            X.Fhg r6 = new X.Fhg
            r6.<init>()
            r0 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.FJx()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47978EPk.<init>(X.4DH, X.0iw, com.instagram.common.session.UserSession, com.instagram.quickpromotion.intf.QuickPromotionSlot):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
        if (r0 != null) goto L_0x0022;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void DbI(X.AnonymousClass4UE r5, java.lang.Integer r6, java.util.Map r7) {
        /*
            r4 = this;
            r0 = 0
            X.0qQ.A0B(r5, r0)
            r0 = 1
            X.4UC r5 = (X.AnonymousClass4UC) r5
            int r3 = r6.intValue()
            if (r3 == r0) goto L_0x0047
            r0 = 2
            if (r3 == r0) goto L_0x004c
            java.lang.String r2 = "QuickPromotionDebugHelper"
            switch(r3) {
                case 1: goto L_0x0044;
                case 2: goto L_0x0015;
                case 3: goto L_0x0044;
                default: goto L_0x0015;
            }
        L_0x0015:
            java.lang.String r0 = "view"
        L_0x0017:
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "%s ActionType should not be handled in onQuickPromotionClick"
            X.0KC.A0O(r2, r0, r1)
        L_0x0020:
            java.lang.String r0 = "action not set"
        L_0x0022:
            switch(r3) {
                case 1: goto L_0x003b;
                case 2: goto L_0x003e;
                case 3: goto L_0x0041;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.String r2 = "VIEW"
        L_0x0027:
            java.lang.String r1 = " action url: "
            java.lang.String r1 = X.002.A0g(r2, r1, r0)
            com.instagram.common.ui.base.IgTextView r0 = r4.A00
            if (r0 != 0) goto L_0x0057
            java.lang.String r0 = "actionDescriptionView"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x003b:
            java.lang.String r2 = "PRIMARY"
            goto L_0x0027
        L_0x003e:
            java.lang.String r2 = "SECONDARY"
            goto L_0x0027
        L_0x0041:
            java.lang.String r2 = "DISMISS"
            goto L_0x0027
        L_0x0044:
            java.lang.String r0 = "click"
            goto L_0x0017
        L_0x0047:
            X.4V7 r0 = r5.A08
            X.4VG r0 = r0.A01
            goto L_0x0050
        L_0x004c:
            X.4V7 r0 = r5.A08
            X.4VG r0 = r0.A02
        L_0x0050:
            if (r0 == 0) goto L_0x0020
            java.lang.String r0 = r0.A03
            if (r0 == 0) goto L_0x0020
            goto L_0x0022
        L_0x0057:
            r0.setText(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47978EPk.DbI(X.4UE, java.lang.Integer, java.util.Map):void");
    }

    public final void DbK(AnonymousClass4UE r1) {
    }

    public final void Dh3() {
    }

    public void DbJ(AnonymousClass4UE r3) {
        IgTextView igTextView = this.A00;
        if (igTextView == null) {
            0qQ.A0F("actionDescriptionView");
            throw AnonymousClass00P.createAndThrow();
        } else {
            igTextView.setText("DISMISS action");
        }
    }
}
