package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2xD  reason: invalid class name and case insensitive filesystem */
public final class C234172xD extends C249383je implements C252243on {
    public boolean A00;
    public boolean A01;
    public int A02;
    public int A03;
    public final C227762js A04;
    public final C231332rR A05;
    public final Map A06;
    public final Fragment A07;
    public final C228172ku A08;
    public final boolean A09;

    public C234172xD(Fragment fragment, C227762js r8, C228172ku r9, C231332rR r10) {
        this(fragment, r8, r9, r10, false);
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onCreate() {
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

    public final void A00() {
        if (this.A00) {
            AnonymousClass4DV r1 = this.A07;
            if (r1.mView != null) {
                C238133Ar scrollingViewProxy = r1.getScrollingViewProxy();
                scrollingViewProxy.Ehv(new IE9(this, scrollingViewProxy));
            }
        }
    }

    public final void A01(1Xj r3) {
        AnonymousClass3WA r1;
        AnonymousClass3W1 BQr = this.A05.BQr(r3);
        if (BQr == null || !((r1 = BQr.A0m) == AnonymousClass3WA.ORGANIC_SHOW_LESS || r1 == AnonymousClass3WA.ORGANIC_SHOW_LESS_CONNECTED || r1 == AnonymousClass3WA.ORGANIC_SHOW_LESS_HIDE_POST_ONLY || r1 == AnonymousClass3WA.ORGANIC_SHOW_LESS_NOT_INTERESTED || r1 == AnonymousClass3WA.ORGANIC_SHOW_LESS_HIDE_POSTS_FROM_ACCOUNT)) {
            this.A00 = true;
        }
    }

    public final void D6z(View view) {
        this.A08.A01(this);
    }

    public final void onDestroy() {
        if (this.A00) {
            Map map = this.A06;
            if (!map.isEmpty()) {
                for (AnonymousClass1Xn r1 : map.keySet()) {
                    Object obj = map.get(r1);
                    obj.getClass();
                    ((JOD) obj).Ds4(r1);
                }
            }
        }
    }

    public final void onDestroyView() {
        this.A08.A00.remove(this);
    }

    public final void onPause() {
        if (this.A00) {
            this.A07.getScrollingViewProxy().Ehv((IE9) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        if (r1 > r0) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onScroll(X.C238133Ar r6, int r7, int r8, int r9, int r10, int r11) {
        /*
            r5 = this;
            r0 = -1396279062(0xffffffffacc678ea, float:-5.6409226E-12)
            int r4 = X.AnonymousClass0fD.A03(r0)
            boolean r0 = r5.A00
            if (r0 == 0) goto L_0x003c
            boolean r0 = r6.CWN()
            r3 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0023
            boolean r0 = r5.A09
            if (r0 == 0) goto L_0x0023
            if (r11 > 0) goto L_0x001a
            r3 = 0
        L_0x001a:
            r5.A01 = r3
            r0 = -232165251(0xfffffffff229707d, float:-3.3560932E30)
        L_0x001f:
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        L_0x0023:
            android.view.View r0 = r6.AnC(r2)
            if (r0 != 0) goto L_0x0043
            r1 = 0
        L_0x002a:
            int r0 = r5.A02
            if (r7 > r0) goto L_0x0040
            if (r7 < r0) goto L_0x0036
            int r0 = r5.A03
            if (r1 < r0) goto L_0x0040
            if (r1 <= r0) goto L_0x0038
        L_0x0036:
            r5.A01 = r2
        L_0x0038:
            r5.A02 = r7
            r5.A03 = r1
        L_0x003c:
            r0 = -863294036(0xffffffffcc8b2dac, float:-7.2969568E7)
            goto L_0x001f
        L_0x0040:
            r5.A01 = r3
            goto L_0x0038
        L_0x0043:
            android.view.View r0 = r6.AnC(r2)
            int r1 = r0.getTop()
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C234172xD.onScroll(X.3Ar, int, int, int, int, int):void");
    }

    public final void onScrollStateChanged(C238133Ar r3, int i) {
        AnonymousClass0fD.A0A(1635983874, AnonymousClass0fD.A03(1889708787));
    }

    public final void onResume() {
        A00();
    }

    public C234172xD(Fragment fragment, C227762js r3, C228172ku r4, C231332rR r5, boolean z) {
        this.A06 = new HashMap();
        this.A07 = fragment;
        this.A04 = r3;
        this.A05 = r5;
        this.A08 = r4;
        this.A09 = z;
    }
}
