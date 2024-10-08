package X;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2qT  reason: invalid class name and case insensitive filesystem */
public final class C230882qT implements C252243on {
    public Activity A00;
    public C234222xL A01;
    public C300555xO A02;
    public Runnable A03;
    public boolean A04;
    public final Handler A05 = new Handler(Looper.getMainLooper());
    public final UserSession A06;
    public final HashMap A07 = new HashMap();
    public final Map A08;

    public final void A02(C300555xO r4, String str) {
        String str2;
        0qQ.A0B(r4, 0);
        AnonymousClass2bO.A00();
        DcZ A002 = DcY.A00(this.A06);
        0wc A012 = AnonymousClass0kN.A01(A002, A002.A00);
        0Aj A003 = A012.A00(A012.A00, "ig_qp_tooltip_clash");
        QPTooltipAnchor qPTooltipAnchor = r4.A00;
        if (A003.isSampled()) {
            if (qPTooltipAnchor == null || (str2 = qPTooltipAnchor.A00) == null) {
                str2 = "unknown";
            }
            A003.AAJ(AnonymousClass000.A00(3826), str2);
            A003.AAJ(AnonymousClass000.A00(3827), r4.A0D);
            A003.AAJ("native_anchor_id", str);
            A003.Cgf();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r1 = (android.view.View) r0.get();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(X.AnonymousClass4UE r4) {
        /*
            r3 = this;
            r2 = 0
            if (r4 == 0) goto L_0x0026
            X.5xO r4 = (X.C300555xO) r4
            com.instagram.quickpromotion.intf.QPTooltipAnchor r1 = r4.A00
            java.util.HashMap r0 = r3.A07
            java.lang.Object r0 = r0.get(r1)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L_0x0026
            java.lang.Object r1 = r0.get()
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x0026
            boolean r0 = r1.isAttachedToWindow()
            if (r0 == 0) goto L_0x0026
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0026
            r2 = 1
        L_0x0026:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C230882qT.A03(X.4UE):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r0 = r4.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A04(X.AnonymousClass4UE r4) {
        /*
            r3 = this;
            r2 = 0
            if (r4 == 0) goto L_0x001a
            X.5xO r4 = (X.C300555xO) r4
            com.instagram.quickpromotion.intf.QPTooltipAnchor r1 = r4.A00
            java.util.Map r0 = r3.A08
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x001a
            java.lang.String r0 = r4.A02
            if (r0 == 0) goto L_0x001a
            int r0 = r0.length()
            if (r0 == 0) goto L_0x001a
            r2 = 1
        L_0x001a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C230882qT.A04(X.4UE):boolean");
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final void D6z(View view) {
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onCreate() {
    }

    public final void onDestroy() {
    }

    public final void onResume() {
    }

    public final void onSaveInstanceState(Bundle bundle) {
    }

    public final void onStart() {
    }

    public final void onStop() {
    }

    public final void onViewCreated(View view, Bundle bundle) {
    }

    public final void onViewStateRestored(Bundle bundle) {
    }

    public final void A00(View view, QPTooltipAnchor qPTooltipAnchor, 2bv r5) {
        if (view != null) {
            this.A07.put(qPTooltipAnchor, new WeakReference(view));
            C300555xO r1 = this.A02;
            if (!this.A04 && r1 != null && A04(r1) && A03(r1)) {
                A01(r5, r1);
            }
        }
    }

    public final void A01(2bv r5, C300555xO r6) {
        if (r6 == null || !A04(r6) || !A03(r6)) {
            throw new IllegalStateException("showQuickPromotion() should not be called unless it is eligible and has an anchor view.");
        }
        C230842qN r1 = (C230842qN) this.A08.get(r6.A00);
        if (r1 != null) {
            this.A04 = true;
            C51526FvY fvY = new C51526FvY(r1, r5, r6, this);
            this.A03 = fvY;
            this.A05.postDelayed(fvY, r1.EKO());
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void onDestroyView() {
        this.A07.clear();
        this.A02 = null;
        Runnable runnable = this.A03;
        if (runnable != null) {
            this.A05.removeCallbacks(runnable);
            this.A03 = null;
            this.A04 = false;
        }
    }

    public final void onPause() {
        Runnable runnable = this.A03;
        if (runnable != null) {
            this.A05.removeCallbacks(runnable);
            this.A03 = null;
            this.A04 = false;
        }
    }

    public C230882qT(UserSession userSession, Map map) {
        this.A06 = userSession;
        this.A08 = map;
    }
}
