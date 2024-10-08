package X;

import android.os.Handler;
import androidx.fragment.app.Fragment;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.controller.datamodel.PageSelectionOverrideData;
import java.util.Map;

/* renamed from: X.F2v  reason: case insensitive filesystem */
public final class C49710F2v {
    public Fragment A00;
    public BusinessFlowAnalyticsLogger A01;
    public G8D A02;
    public PageSelectionOverrideData A03;
    public EEJ A04;
    public 0lg A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final Handler A0C = AnonymousClass7TF.A0D();

    public final void A00(String str) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A01;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Ckp(new C22030Xtl("page_selection", this.A06, str, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        if (r2 != X.C319586qr.SERVICE_ONBOARDING_FLOW) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0083, code lost:
        if (X.182.A06(X.AnonymousClass7TF.A0H(r3), r3, 36310271995805697L) != false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        if (r8.B6a() != X.C319586qr.SHOPPING_IN_APP_SIGNUP_FLOW) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C49710F2v(androidx.fragment.app.Fragment r6, com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r7, X.G8D r8, X.0lg r9) {
        /*
            r5 = this;
            r5.<init>()
            android.os.Handler r0 = X.AnonymousClass7TF.A0D()
            r5.A0C = r0
            boolean r0 = r6 instanceof X.AnonymousClass32G
            if (r0 != 0) goto L_0x0018
            boolean r0 = r6 instanceof X.AnonymousClass4DH
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = "Invalid fragment type passed in the constructor. The fragment type must be either IgListFragment or IgFragment"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0018:
            r5.A05 = r9
            r5.A00 = r6
            r5.A02 = r8
            r5.A01 = r7
            if (r8 == 0) goto L_0x002b
            X.6qr r2 = r8.B6a()
            X.6qr r1 = X.C319586qr.SHOPPING_IN_APP_SIGNUP_FLOW
            r0 = 1
            if (r2 == r1) goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            r5.A09 = r0
            X.G8D r0 = r5.A02
            if (r0 == 0) goto L_0x003b
            X.6qr r2 = r0.B6a()
            X.6qr r1 = X.C319586qr.SERVICE_ONBOARDING_FLOW
            r0 = 1
            if (r2 == r1) goto L_0x003c
        L_0x003b:
            r0 = 0
        L_0x003c:
            r5.A08 = r0
            X.G8D r0 = r5.A02
            boolean r0 = X.FG1.A02(r0)
            r5.A07 = r0
            X.G8D r0 = r5.A02
            X.FG1.A04(r0)
            X.G8D r0 = r5.A02
            boolean r0 = X.FG1.A03(r0)
            r5.A0B = r0
            r4 = 1
            if (r0 != 0) goto L_0x006a
            boolean r0 = r5.A07
            if (r0 == 0) goto L_0x006a
            X.0lg r3 = r5.A05
            com.facebook.common.callercontext.CallerContext r0 = X.FRZ.A00
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r3)
            r0 = 36310271995740160(0x81000000010000, double:3.026100447611239E-306)
            X.182.A06(r2, r3, r0)
        L_0x006a:
            boolean r0 = r5.A0B
            if (r0 != 0) goto L_0x0088
            boolean r0 = r5.A07
            if (r0 == 0) goto L_0x0088
            X.0lg r3 = r5.A05
            com.facebook.common.callercontext.CallerContext r0 = X.FRZ.A00
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r3)
            r0 = 36310271995805697(0x81000000020001, double:3.026100447652685E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0088
        L_0x0085:
            r5.A0A = r4
            return
        L_0x0088:
            r4 = 0
            goto L_0x0085
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49710F2v.<init>(androidx.fragment.app.Fragment, com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger, X.G8D, X.0lg):void");
    }
}
