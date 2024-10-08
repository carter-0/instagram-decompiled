package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.util.ArrayList;

/* renamed from: X.Lgf  reason: case insensitive filesystem */
public final class C64707Lgf implements C252243on {
    public long A00;
    public Integer A01;
    public final UserSession A02;
    public final ClipsCreationViewModel A03;
    public final C60109Jfp A04;
    public final AnonymousClass8RL A05;
    public final AnonymousClass8RF A06;
    public final C61806KMu A07;
    public final ClipsStackedTimelineViewController A08;
    public final AnonymousClass861 A09;

    public C64707Lgf(UserSession userSession, ClipsStackedTimelineViewController clipsStackedTimelineViewController, ClipsCreationViewModel clipsCreationViewModel, C60109Jfp jfp, AnonymousClass8RL r6, AnonymousClass8RF r7, C61806KMu kMu, AnonymousClass861 r9) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A08 = clipsStackedTimelineViewController;
        this.A03 = clipsCreationViewModel;
        this.A06 = r7;
        this.A05 = r6;
        this.A04 = jfp;
        this.A07 = kMu;
        this.A09 = r9;
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onDestroyView() {
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public static final int A00(C64707Lgf lgf) {
        ClipsStackedTimelineViewController clipsStackedTimelineViewController = lgf.A08;
        ViewGroup viewGroup = clipsStackedTimelineViewController.container;
        if (viewGroup != null) {
            return (int) (((float) clipsStackedTimelineViewController.A00) / JTS.A01(AnonymousClass7TE.A0S(viewGroup), LQO.A00));
        }
        0qQ.A0F("container");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Integer A02(X.C64707Lgf r7) {
        /*
            X.8RF r2 = r7.A06
            X.8RH r3 = r2.A0E()
            boolean r0 = r3 instanceof X.C355868Rr
            r6 = 0
            if (r0 == 0) goto L_0x00c2
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r7.A03
            X.2gB r1 = r0.A0G
            X.831 r0 = X.JTO.A0h(r1)
            if (r0 == 0) goto L_0x00d4
            X.8Rr r3 = (X.C355868Rr) r3
            int r3 = r3.A00
            X.51O r0 = r0.A04(r3)
            if (r0 == 0) goto L_0x00d4
            X.831 r0 = X.JTO.A0h(r1)
            if (r0 == 0) goto L_0x00d4
            java.util.List r1 = r0.A01
            int r0 = X.C51966G9m.A06(r1)
            if (r3 <= r0) goto L_0x002e
            r3 = r0
        L_0x002e:
            java.lang.Object r0 = r1.get(r3)
            X.9IM r0 = (X.AnonymousClass9IM) r0
            int r0 = r0.A00
        L_0x0036:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
        L_0x003a:
            X.8RH r1 = r2.A0E()
            boolean r0 = r1 instanceof X.C355868Rr
            if (r0 == 0) goto L_0x00a8
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r7.A03
            X.2gB r3 = r0.A0G
            X.831 r0 = X.JTO.A0h(r3)
            if (r0 == 0) goto L_0x00c0
            X.8Rr r1 = (X.C355868Rr) r1
            int r1 = r1.A00
            X.51O r0 = r0.A04(r1)
            if (r0 == 0) goto L_0x00c0
            X.831 r0 = X.JTO.A0h(r3)
            if (r0 == 0) goto L_0x00c0
            int r0 = r0.A00(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0064:
            if (r5 == 0) goto L_0x0093
            if (r0 == 0) goto L_0x0093
            X.8RH r1 = r2.A0E()
            boolean r4 = r1 instanceof X.C355858Rq
            int r3 = A00(r7)
            int r1 = r5.intValue()
            int r3 = r3 - r1
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r1 = r7.A08
            android.view.ViewGroup r1 = r1.container
            if (r1 == 0) goto L_0x00e2
            android.content.Context r2 = X.AnonymousClass7TE.A0S(r1)
            r1 = 2
            float r2 = X.0nA.A04(r2, r1)
            int r1 = java.lang.Math.abs(r3)
            float r1 = (float) r1
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0094
            java.lang.Integer r6 = X.C51967G9n.A0l(r4)
        L_0x0093:
            return r6
        L_0x0094:
            if (r3 < 0) goto L_0x00da
            int r1 = r0.intValue()
            if (r3 > r1) goto L_0x00da
            r0 = 100
            if (r3 < r0) goto L_0x00a3
            int r1 = r1 - r0
            if (r3 <= r1) goto L_0x0093
        L_0x00a3:
            if (r4 == 0) goto L_0x00d7
            java.lang.Integer r6 = X.AnonymousClass05K.A0j
            return r6
        L_0x00a8:
            boolean r0 = r1 instanceof X.C355858Rq
            if (r0 == 0) goto L_0x00c0
            X.KMu r0 = r7.A07
            X.LTY r0 = r0.A01
            X.Jyn r0 = r0.A0F()
            if (r0 == 0) goto L_0x00c0
            int r1 = r0.A02
            int r0 = r0.A05
            int r1 = r1 - r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x0064
        L_0x00c0:
            r0 = r6
            goto L_0x0064
        L_0x00c2:
            boolean r0 = r3 instanceof X.C355858Rq
            if (r0 == 0) goto L_0x00d4
            X.KMu r0 = r7.A07
            X.LTY r0 = r0.A01
            X.Jyn r0 = r0.A0F()
            if (r0 == 0) goto L_0x00d4
            int r0 = r0.A05
            goto L_0x0036
        L_0x00d4:
            r5 = r6
            goto L_0x003a
        L_0x00d7:
            java.lang.Integer r6 = X.AnonymousClass05K.A0Y
            return r6
        L_0x00da:
            if (r4 == 0) goto L_0x00df
            java.lang.Integer r6 = X.AnonymousClass05K.A0N
            return r6
        L_0x00df:
            java.lang.Integer r6 = X.AnonymousClass05K.A0C
            return r6
        L_0x00e2:
            java.lang.String r0 = "container"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64707Lgf.A02(X.Lgf):java.lang.Integer");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        ClipsStackedTimelineViewController clipsStackedTimelineViewController = this.A08;
        LY4 A002 = LY4.A00(this, 60);
        ClipsTimelineActionBarViewController clipsTimelineActionBarViewController = clipsStackedTimelineViewController.A0C;
        ClipsTimelineActionBarViewController.A01(A002, C62636KjH.A0Z, clipsTimelineActionBarViewController);
        ClipsTimelineActionBarViewController.A01(LY4.A00(this, 61), C62636KjH.A0a, clipsTimelineActionBarViewController);
    }

    public static final int A01(Integer num) {
        switch (num.intValue()) {
            case 0:
                return 2131955927;
            case 1:
                return 2131955929;
            case 2:
                return 2131955924;
            case 3:
                return 2131955925;
            case 4:
                return 2131955926;
            case 5:
                return 2131955928;
            default:
                throw AnonymousClass7TE.A1K();
        }
    }

    public static final void A03(C64707Lgf lgf) {
        boolean z;
        Integer valueOf;
        Integer A022 = A02(lgf);
        C60109Jfp jfp = lgf.A04;
        if (A022 == null) {
            z = true;
            valueOf = null;
        } else {
            z = false;
            valueOf = Integer.valueOf(A01(A022));
        }
        jfp.A01 = z;
        jfp.A00 = valueOf;
        05G r4 = jfp.A0C;
        ArrayList A0U = 00k.A0U(JTO.A13(r4));
        0qQ.A0C(A0U, "null cannot be cast to non-null type java.util.ArrayList<com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsTimelineActionBarViewModel.ButtonState>");
        int size = A0U.size();
        for (int i = 0; i < size; i++) {
            if (((C61263Jzw) A0U.get(i)).A00 == C62636KjH.A0Z || ((C61263Jzw) A0U.get(i)).A00 == C62636KjH.A0a) {
                C61263Jzw jzw = (C61263Jzw) A0U.get(i);
                C62636KjH kjH = jzw.A00;
                boolean z2 = jzw.A06;
                boolean z3 = jzw.A05;
                boolean z4 = jzw.A07;
                String str = jzw.A02;
                boolean z5 = jzw.A03;
                0qQ.A0B(kjH, 0);
                A0U.set(i, new C61263Jzw(kjH, valueOf, str, z2, z3, z, z4, z5));
            }
        }
        r4.Epw(A0U);
    }

    public static final void A04(C64707Lgf lgf, Integer num) {
        if (System.currentTimeMillis() - lgf.A00 > 1000 || lgf.A01 != num) {
            ClipsStackedTimelineViewController clipsStackedTimelineViewController = lgf.A08;
            int A012 = A01(num);
            Context context = clipsStackedTimelineViewController.A09.getContext();
            if (context != null) {
                LRJ.A02.A01(context, A012);
            }
            lgf.A01 = num;
            lgf.A00 = System.currentTimeMillis();
        }
    }
}
