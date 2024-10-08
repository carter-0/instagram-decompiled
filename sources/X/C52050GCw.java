package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: X.GCw  reason: case insensitive filesystem */
public abstract class C52050GCw implements C252243on {
    public SwipeRefreshLayout A00;
    public C56042Hrp A01;
    public C52012GBj A02;
    public C56043Hrq A03;

    public final void A0B(SwipeRefreshLayout swipeRefreshLayout, C56043Hrq hrq, C56042Hrp hrp, C52012GBj gBj) {
        0qQ.A0B(hrq, 3);
        this.A02 = gBj;
        this.A00 = swipeRefreshLayout;
        this.A01 = hrp;
        this.A03 = hrq;
        A0A();
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

    /* JADX WARNING: type inference failed for: r2v2, types: [X.HK8] */
    /* JADX WARNING: type inference failed for: r2v3, types: [X.HKA] */
    /* JADX WARNING: type inference failed for: r2v4, types: [X.HK9] */
    /* JADX WARNING: type inference failed for: r2v5, types: [X.GNH] */
    /* JADX WARNING: type inference failed for: r2v9, types: [X.GCO] */
    /* JADX WARNING: type inference failed for: r2v11, types: [X.GCD] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroyView() {
        /*
            r4 = this;
            r2 = r4
            boolean r0 = r4 instanceof X.GCC
            if (r0 == 0) goto L_0x003b
            X.GCC r2 = (X.GCC) r2
            X.GBj r0 = r2.A02
            if (r0 == 0) goto L_0x000e
            r0.A0K(r2)
        L_0x000e:
            android.widget.FrameLayout r1 = r2.A03
            if (r1 == 0) goto L_0x0017
            android.view.View r0 = r2.A01
            r1.removeView(r0)
        L_0x0017:
            r3 = 0
            r2.A03 = r3
            r2.A02 = r3
            r2.A01 = r3
            com.instagram.ui.mediaactions.ScrubberPreviewThumbnailView r0 = r2.A05
            if (r0 == 0) goto L_0x0024
            r0.A03 = r3
        L_0x0024:
            com.instagram.common.ui.base.IgTextView r1 = r2.A04
            if (r1 == 0) goto L_0x002d
            r0 = 8
            r1.setVisibility(r0)
        L_0x002d:
            r2.A05 = r3
            r2.A04 = r3
        L_0x0031:
            r0 = 0
            r4.A02 = r0
            r4.A00 = r0
            r4.A01 = r0
            r4.A03 = r0
            return
        L_0x003b:
            boolean r0 = r4 instanceof X.GCD
            if (r0 == 0) goto L_0x0049
            X.GCD r2 = (X.GCD) r2
        L_0x0041:
            X.GBj r0 = r2.A02
            if (r0 == 0) goto L_0x0031
            r0.A0K(r2)
            goto L_0x0031
        L_0x0049:
            boolean r0 = r4 instanceof X.GCO
            if (r0 == 0) goto L_0x0050
            X.GCO r2 = (X.GCO) r2
            goto L_0x0041
        L_0x0050:
            boolean r0 = r4 instanceof X.C52179GHv
            if (r0 == 0) goto L_0x0061
            X.GHv r2 = (X.C52179GHv) r2
            X.GBj r0 = r2.A02
            if (r0 == 0) goto L_0x005d
            r0.A0K(r2)
        L_0x005d:
            r0 = 0
            r2.A00 = r0
            goto L_0x0031
        L_0x0061:
            boolean r0 = r4 instanceof X.GD0
            if (r0 == 0) goto L_0x007d
            X.GD0 r2 = (X.GD0) r2
            X.GBj r1 = r2.A02
            if (r1 == 0) goto L_0x0070
            X.IMo r0 = r2.A03
            r1.A0K(r0)
        L_0x0070:
            android.os.Handler r1 = r2.A02
            java.lang.Runnable r0 = r2.A06
            r1.removeCallbacks(r0)
            java.lang.Runnable r0 = r2.A07
            r1.removeCallbacks(r0)
            goto L_0x0031
        L_0x007d:
            boolean r0 = r4 instanceof X.C52185GIb
            if (r0 == 0) goto L_0x008d
            X.GIb r2 = (X.C52185GIb) r2
            X.GBj r1 = r2.A02
            if (r1 == 0) goto L_0x0031
            X.IMo r0 = r2.A02
            r1.A0K(r0)
            goto L_0x0031
        L_0x008d:
            boolean r0 = r4 instanceof X.GNH
            if (r0 == 0) goto L_0x0094
            X.GNH r2 = (X.GNH) r2
            goto L_0x0041
        L_0x0094:
            boolean r0 = r4 instanceof X.HK9
            if (r0 == 0) goto L_0x009b
            X.HK9 r2 = (X.HK9) r2
            goto L_0x0041
        L_0x009b:
            boolean r0 = r4 instanceof X.HKA
            if (r0 == 0) goto L_0x00a2
            X.HKA r2 = (X.HKA) r2
            goto L_0x0041
        L_0x00a2:
            boolean r0 = r4 instanceof X.HK6
            if (r0 == 0) goto L_0x00a9
            X.HK8 r2 = (X.HK8) r2
            goto L_0x0041
        L_0x00a9:
            boolean r0 = r4 instanceof X.HKB
            if (r0 == 0) goto L_0x0031
            X.HKB r2 = (X.HKB) r2
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52050GCw.onDestroyView():void");
    }

    public final void onSaveInstanceState(Bundle bundle) {
    }

    public final void onStart() {
    }

    public final void onStop() {
    }

    public final void onViewStateRestored(Bundle bundle) {
    }

    public static C52012GBj A07(GBE gbe) {
        return (C52012GBj) gbe.A1v.invoke();
    }

    public static Integer A08(C52050GCw gCw) {
        C52012GBj gBj = gCw.A02;
        if (gBj != null) {
            return Integer.valueOf(gBj.A06());
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: android.view.ViewGroup} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: android.view.ViewGroup} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: X.GHv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: X.HKC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: X.GCE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: X.HK9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: X.GCp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v37, resolved type: X.HKC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: X.HK9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: X.HK9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: android.view.ViewGroup} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: X.HK9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v38, resolved type: X.HKC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: X.HK9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: X.HK9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: X.HK9} */
    /* JADX WARNING: type inference failed for: r5v3, types: [X.GCD] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A() {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.C52196GIn
            if (r0 == 0) goto L_0x0011
            r0 = r6
            X.GIn r0 = (X.C52196GIn) r0
            X.GBj r3 = r0.A02
            if (r3 == 0) goto L_0x0010
            X.IMo r2 = r0.A05
        L_0x000d:
            r3.A0J(r2)
        L_0x0010:
            return
        L_0x0011:
            boolean r0 = r6 instanceof X.GC7
            if (r0 == 0) goto L_0x0029
            r1 = r6
            X.GC7 r1 = (X.GC7) r1
            com.instagram.clips.intf.ClipsViewerConfig r0 = r1.A05
            com.instagram.clips.intf.ClipsWatchAndBrowseData r0 = r0.A0K
            if (r0 == 0) goto L_0x0010
            X.GBj r3 = r1.A02
            if (r3 == 0) goto L_0x0010
            r0 = 5
            X.IMo r2 = new X.IMo
            r2.<init>(r1, r0)
            goto L_0x000d
        L_0x0029:
            boolean r0 = r6 instanceof X.GIN
            if (r0 == 0) goto L_0x005c
            r1 = r6
            X.GIN r1 = (X.GIN) r1
            X.GBj r0 = r1.A02
            if (r0 == 0) goto L_0x0037
            r0.A0J(r1)
        L_0x0037:
            X.Jgx r4 = r1.A07
            if (r4 == 0) goto L_0x0010
            X.2Fj r3 = r4.A02
            X.4DH r0 = r1.A04
            X.07Z r2 = r0.getViewLifecycleOwner()
            r0 = 45
            X.J6J r1 = X.J6J.A00(r1, r0)
            r0 = 26
            X.C51969G9p.A15(r2, r3, r1, r0)
            X.6oS r2 = X.C318116oQ.A00(r4)
            r1 = 0
            X.JUE r0 = new X.JUE
            r0.<init>(r4, r1)
            X.AnonymousClass7TE.A1Z(r0, r2)
            return
        L_0x005c:
            boolean r0 = r6 instanceof X.C52043GCp
            if (r0 == 0) goto L_0x009e
            r5 = r6
            X.GCp r5 = (X.C52043GCp) r5
            X.GBj r0 = r5.A02
            if (r0 == 0) goto L_0x009c
            androidx.recyclerview.widget.RecyclerView r0 = X.C52012GBj.A03(r0)
            if (r0 == 0) goto L_0x009c
            X.3Aq r4 = new X.3Aq
            r4.<init>(r0)
        L_0x0072:
            r5.A00 = r4
            if (r4 == 0) goto L_0x008c
            X.2js r2 = r5.A03
            r4.AAD(r2)
            boolean r0 = r5.A07
            if (r0 == 0) goto L_0x0094
            X.2ff r3 = X.C226112fe.A0B
            android.app.Activity r2 = r5.A02
            r1 = 1
            X.IaX r0 = new X.IaX
            r0.<init>(r4, r5)
            r3.A04(r2, r0, r1)
        L_0x008c:
            X.GBj r0 = r5.A02
            if (r0 == 0) goto L_0x0010
            r0.A0J(r5)
            return
        L_0x0094:
            X.GDX r1 = r5.A04
            int r0 = r5.A01
            r2.A06(r1, r4, r0)
            goto L_0x008c
        L_0x009c:
            r4 = 0
            goto L_0x0072
        L_0x009e:
            boolean r0 = r6 instanceof X.GCO
            if (r0 == 0) goto L_0x00b0
            r1 = r6
            X.GCO r1 = (X.GCO) r1
            X.GBj r0 = r1.A02
            if (r0 == 0) goto L_0x00ac
            r0.A0J(r1)
        L_0x00ac:
            X.GCO.A00(r1)
            return
        L_0x00b0:
            boolean r0 = r6 instanceof X.GCE
            if (r0 == 0) goto L_0x00bd
            r1 = r6
            X.GCE r1 = (X.GCE) r1
            X.GBn r0 = r1.A00
        L_0x00b9:
            r0.A94(r1)
            return
        L_0x00bd:
            boolean r0 = r6 instanceof X.C52179GHv
            if (r0 == 0) goto L_0x00ca
            r5 = r6
            X.GHv r5 = (X.C52179GHv) r5
            X.GBn r0 = r5.A07
            r0.A94(r5)
            goto L_0x008c
        L_0x00ca:
            boolean r0 = r6 instanceof X.GCC
            if (r0 == 0) goto L_0x012b
            r2 = r6
            X.GCC r2 = (X.GCC) r2
            X.GBj r0 = r2.A02
            if (r0 == 0) goto L_0x00d8
            r0.A0J(r2)
        L_0x00d8:
            X.GBn r0 = r2.A09
            r0.A94(r2)
            X.GBj r0 = r2.A02
            if (r0 == 0) goto L_0x0128
            int r0 = r0.A06()
        L_0x00e5:
            r2.A00 = r0
            com.instagram.common.session.UserSession r4 = r2.A08
            X.0Tu r3 = X.AnonymousClass7TF.A0H(r4)
            r0 = 36317646455313829(0x8106b5000c15a5, double:3.0307640855401926E-306)
            boolean r0 = X.C51965G9l.A1a(r3, r4, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0010
            android.view.View r0 = r2.A02
            if (r0 == 0) goto L_0x0010
            r4 = 0
            android.view.ViewParent r3 = r0.getParent()
            boolean r0 = r2.A0B
            if (r0 != 0) goto L_0x0243
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0126
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
        L_0x010d:
            r1 = 0
            if (r3 == 0) goto L_0x0242
            r0 = 2131442398(0x7f0b3ade, float:1.8506835E38)
            android.view.View r0 = r3.findViewById(r0)
            if (r0 != 0) goto L_0x0243
            android.view.ViewParent r3 = r3.getParent()
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0124
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            goto L_0x010d
        L_0x0124:
            r3 = r1
            goto L_0x010d
        L_0x0126:
            r3 = r4
            goto L_0x010d
        L_0x0128:
            int r0 = r2.A00
            goto L_0x00e5
        L_0x012b:
            boolean r0 = r6 instanceof X.GD0
            if (r0 == 0) goto L_0x0157
            r2 = r6
            X.GD0 r2 = (X.GD0) r2
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.A00 = r0
            com.instagram.clips.intf.ClipsViewerConfig r0 = r2.A04
            X.4h4 r1 = r0.A0H
            X.4h4 r0 = X.C270644h4.SKIP
            if (r1 != r0) goto L_0x0148
            X.GBj r1 = r2.A02
            if (r1 == 0) goto L_0x0148
            r0 = 0
            r1.A0L(r0)
        L_0x0148:
            r2.A0C()
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x0010
            X.GBj r3 = r2.A02
            if (r3 == 0) goto L_0x0010
            X.IMo r2 = r2.A03
            goto L_0x000d
        L_0x0157:
            boolean r0 = r6 instanceof X.GCD
            if (r0 == 0) goto L_0x0160
            r5 = r6
            X.GCD r5 = (X.GCD) r5
            goto L_0x008c
        L_0x0160:
            boolean r0 = r6 instanceof X.C52028GCa
            if (r0 == 0) goto L_0x0181
            r1 = r6
            X.GCa r1 = (X.C52028GCa) r1
            X.GBj r0 = r1.A02
            if (r0 == 0) goto L_0x016e
            r0.A0J(r1)
        L_0x016e:
            X.GBn r0 = r1.A02
            r0.A94(r1)
            X.GBj r0 = r1.A02
            if (r0 == 0) goto L_0x017e
            int r0 = r0.A06()
        L_0x017b:
            r1.A00 = r0
            return
        L_0x017e:
            int r0 = r1.A00
            goto L_0x017b
        L_0x0181:
            boolean r0 = r6 instanceof X.GKU
            if (r0 == 0) goto L_0x01af
            r3 = r6
            X.GKU r3 = (X.GKU) r3
            X.GBj r1 = r3.A02
            if (r1 == 0) goto L_0x0010
            r1.A0J(r3)
            boolean r0 = r3.A07
            if (r0 == 0) goto L_0x0010
            int r2 = r1.A06()
            X.GBj r0 = r3.A02
            if (r0 == 0) goto L_0x0010
            X.GD6 r0 = r0.A09
            int r1 = X.GD6.A00(r0)
            r0 = 1
            int r1 = r1 - r0
            if (r2 != r1) goto L_0x0010
            r2 = 2131955876(0x7f1310a4, float:1.9548292E38)
            X.Idr r1 = r3.A04
            r0 = 0
            X.GKU.A00(r3, r1, r2, r0)
            return
        L_0x01af:
            boolean r0 = r6 instanceof X.C52185GIb
            if (r0 == 0) goto L_0x01be
            r0 = r6
            X.GIb r0 = (X.C52185GIb) r0
            X.GBj r3 = r0.A02
            if (r3 == 0) goto L_0x0010
            X.IMo r2 = r0.A02
            goto L_0x000d
        L_0x01be:
            boolean r0 = r6 instanceof X.GNH
            if (r0 == 0) goto L_0x01d0
            r1 = r6
            X.GNH r1 = (X.GNH) r1
            X.GBj r0 = r1.A02
            if (r0 == 0) goto L_0x01cc
            r0.A0J(r1)
        L_0x01cc:
            r1.A0D()
            return
        L_0x01d0:
            boolean r0 = r6 instanceof X.HK7
            if (r0 == 0) goto L_0x01e2
            r1 = r6
            X.HK7 r1 = (X.HK7) r1
            X.GBj r0 = r1.A02
            if (r0 == 0) goto L_0x01de
            r0.A0J(r1)
        L_0x01de:
            X.HK7.A03(r1)
            return
        L_0x01e2:
            boolean r0 = r6 instanceof X.GPN
            if (r0 == 0) goto L_0x01fb
            r1 = r6
            X.GPN r1 = (X.GPN) r1
            X.GBj r0 = r1.A02
            if (r0 == 0) goto L_0x01f0
            r0.A0J(r1)
        L_0x01f0:
            X.HJk r0 = r1.A08
            java.util.List r0 = r0.A02
            r0.add(r1)
            X.GPN.A02(r1)
            return
        L_0x01fb:
            boolean r0 = r6 instanceof X.HK9
            if (r0 == 0) goto L_0x0204
            r5 = r6
            X.HK9 r5 = (X.HK9) r5
            goto L_0x008c
        L_0x0204:
            boolean r0 = r6 instanceof X.HK4
            if (r0 == 0) goto L_0x0225
            r3 = r6
            X.HK4 r3 = (X.HK4) r3
            X.GBj r1 = r3.A02
            if (r1 == 0) goto L_0x0214
            X.IMo r0 = r3.A02
            r1.A0J(r0)
        L_0x0214:
            X.GBj r0 = r3.A02
            if (r0 == 0) goto L_0x0010
            int r2 = r0.A06()
            if (r2 <= 0) goto L_0x0010
            X.IMo r1 = r3.A02
            r0 = -1
            r1.DWA(r2, r0)
            return
        L_0x0225:
            boolean r0 = r6 instanceof X.HK6
            if (r0 == 0) goto L_0x0237
            r1 = r6
            X.HK6 r1 = (X.HK6) r1
            X.GBj r0 = r1.A02
            if (r0 == 0) goto L_0x0233
            r0.A0J(r1)
        L_0x0233:
            X.HK6.A00(r1)
            return
        L_0x0237:
            boolean r0 = r6 instanceof X.HKC
            if (r0 == 0) goto L_0x0010
            r1 = r6
            X.HKC r1 = (X.HKC) r1
            X.GBn r0 = r1.A01
            goto L_0x00b9
        L_0x0242:
            r3 = r1
        L_0x0243:
            boolean r0 = r3 instanceof android.widget.FrameLayout
            if (r0 == 0) goto L_0x025d
            r4 = r3
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
        L_0x024a:
            r2.A03 = r4
            X.GBj r0 = r2.A02
            if (r0 == 0) goto L_0x0010
            androidx.viewpager2.widget.ViewPager2 r1 = r0.A00
            if (r1 == 0) goto L_0x0010
            X.GDJ r0 = new X.GDJ
            r0.<init>(r2)
            r1.post(r0)
            return
        L_0x025d:
            java.lang.String r1 = "Failed to find parent FrameLayout to attach to! "
            if (r3 == 0) goto L_0x0267
            java.lang.String r0 = r3.toString()
            if (r0 != 0) goto L_0x0269
        L_0x0267:
            java.lang.String r0 = ""
        L_0x0269:
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.String r0 = "ClipsScrubberExpandedTouchViewError"
            X.0wb.A03(r0, r1)
            goto L_0x024a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52050GCw.A0A():void");
    }

    public void onPause() {
        View view;
        if (this instanceof C52043GCp) {
            C52043GCp gCp = (C52043GCp) this;
            C227762js r2 = gCp.A03;
            C238133Ar r1 = gCp.A00;
            int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
            r2.A09(r1);
        } else if ((this instanceof GCC) && (view = ((GCC) this).A01) != null) {
            view.setVisibility(8);
        }
    }

    public void onResume() {
        int i;
        if (this instanceof C52043GCp) {
            C52043GCp gCp = (C52043GCp) this;
            if (gCp.A07) {
                C226112fe.A0B.A04(gCp.A02, new C57426IaW(gCp, 1), true);
                return;
            }
            gCp.A03.A05(gCp.A05, 0sn.A00, gCp.A06, (float) gCp.A01, true);
        } else if (this instanceof GCC) {
            GCC gcc = (GCC) this;
            C52012GBj gBj = gcc.A02;
            if (gBj != null) {
                i = gBj.A06();
            } else {
                i = gcc.A00;
            }
            gcc.A00 = i;
            GCC.A00(gcc);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008c, code lost:
        if (X.182.A06(X.0Tu.A05, r2.A0A, 36316916310741706L) != false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c6, code lost:
        if (X.182.A06(X.0Tu.A05, r2.A0A, 36318217685243900L) != false) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e3, code lost:
        if (X.182.A06(X.0Tu.A05, r2.A0A, 36318217685374974L) != false) goto L_0x00c8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r10, android.os.Bundle r11) {
        /*
            r9 = this;
            boolean r0 = r9 instanceof X.GCC
            if (r0 == 0) goto L_0x000a
            r0 = r9
            X.GCC r0 = (X.GCC) r0
            r0.A02 = r10
        L_0x0009:
            return
        L_0x000a:
            boolean r0 = r9 instanceof X.C52052GCy
            if (r0 == 0) goto L_0x002b
            r1 = r9
            X.GCy r1 = (X.C52052GCy) r1
            if (r10 == 0) goto L_0x0009
            r0 = 2131430252(0x7f0b0b6c, float:1.84822E38)
            android.view.View r0 = r10.requireViewById(r0)
            r1.A00 = r0
            r0 = 2131430301(0x7f0b0b9d, float:1.84823E38)
            android.view.View r0 = r10.requireViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            r1.A02 = r0
            X.C52052GCy.A00(r1)
            return
        L_0x002b:
            boolean r0 = r9 instanceof X.GCB
            if (r0 == 0) goto L_0x0045
            r1 = r9
            X.GCB r1 = (X.GCB) r1
            if (r10 == 0) goto L_0x0009
            r0 = 2131432316(0x7f0b137c, float:1.8486386E38)
            android.view.View r0 = r10.requireViewById(r0)
            X.0qQ.A07(r0)
            X.3oV r0 = X.2b1.A00(r0)
            r1.A00 = r0
            return
        L_0x0045:
            boolean r0 = r9 instanceof X.GNH
            if (r0 == 0) goto L_0x0138
            r2 = r9
            X.GNH r2 = (X.GNH) r2
            if (r10 == 0) goto L_0x0009
            r0 = 2131430053(0x7f0b0aa5, float:1.8481796E38)
            android.view.View r0 = r10.requireViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r1 = r0.inflate()
            if (r1 == 0) goto L_0x0116
            r0 = 2131430486(0x7f0b0c56, float:1.8482674E38)
            android.view.View r0 = r1.requireViewById(r0)
            r2.A01 = r0
        L_0x0066:
            r2.A02 = r1
            android.view.View r3 = r2.A01
            if (r3 == 0) goto L_0x0079
            r1 = 54
            X.ICy r0 = new X.ICy
            r0.<init>(r2, r1)
            X.AnonymousClass0fU.A00(r0, r3)
            X.2eS.A01(r3)
        L_0x0079:
            com.instagram.clips.intf.ClipsViewerSource r5 = r2.A08
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.CAMERA_INSPIRATION_HUB
            if (r5 == r0) goto L_0x008e
            com.instagram.common.session.UserSession r4 = r2.A0A
            X.0Tu r3 = X.0Tu.A05
            r0 = 36316916310741706(0x81060b000a12ca, double:3.030302339172726E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x0096
        L_0x008e:
            android.view.View r1 = r2.A01
            if (r1 == 0) goto L_0x0096
            r0 = 4
            r1.setVisibility(r0)
        L_0x0096:
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Handler r6 = new android.os.Handler
            r6.<init>(r0)
            X.GNi r4 = new X.GNi
            r4.<init>(r2)
            r0 = 500(0x1f4, double:2.47E-321)
            X.0mM r3 = new X.0mM
            r3.<init>(r6, r4, r0)
            r0 = 2131430298(0x7f0b0b9a, float:1.8482293E38)
            android.view.View r4 = r10.requireViewById(r0)
            com.instagram.igds.components.mediabutton.IgdsMediaButton r4 = (com.instagram.igds.components.mediabutton.IgdsMediaButton) r4
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.REEL_FEED_TIMELINE
            r6 = 0
            if (r5 != r0) goto L_0x00ce
            com.instagram.common.session.UserSession r8 = r2.A0A
            X.0Tu r7 = X.0Tu.A05
            r0 = 36318217685243900(0x81073a000117fc, double:3.031125333648128E-306)
            boolean r0 = X.182.A06(r7, r8, r0)
            if (r0 == 0) goto L_0x00ce
        L_0x00c8:
            r0 = 8
            r4.setVisibility(r0)
            return
        L_0x00ce:
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.DIRECT
            if (r5 == r0) goto L_0x00d6
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.DIRECT_AD_FEED_OF_ADS
            if (r5 != r0) goto L_0x00e6
        L_0x00d6:
            com.instagram.common.session.UserSession r8 = r2.A0A
            X.0Tu r7 = X.0Tu.A05
            r0 = 36318217685374974(0x81073a000317fe, double:3.0311253337310196E-306)
            boolean r0 = X.182.A06(r7, r8, r0)
            if (r0 == 0) goto L_0x00e6
            goto L_0x00c8
        L_0x00e6:
            com.instagram.common.session.UserSession r8 = r2.A0A
            X.0Tu r7 = X.0Tu.A05
            r0 = 36324187689725820(0x810ca800002f7c, double:3.0349007885217726E-306)
            boolean r0 = X.182.A06(r7, r8, r0)
            if (r0 != 0) goto L_0x00c8
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.THIRD_PARTY_URL
            if (r5 != r0) goto L_0x0105
            r0 = 36324728855605544(0x810d2600003128, double:3.03524302400321E-306)
            boolean r0 = X.182.A06(r7, r8, r0)
            if (r0 == 0) goto L_0x0105
            goto L_0x00c8
        L_0x0105:
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.AR_EFFECT
            if (r5 != r0) goto L_0x0119
            java.lang.Boolean r1 = r2.A0E
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0119
            goto L_0x00c8
        L_0x0116:
            r1 = 0
            goto L_0x0066
        L_0x0119:
            r4.setVisibility(r6)
            X.2eS.A01(r4)
            r2.A03 = r4
            r1 = 12
            X.ID3 r0 = new X.ID3
            r0.<init>((int) r1, (java.lang.Object) r3, (java.lang.Object) r2)
            X.AnonymousClass0fU.A00(r0, r4)
            X.GNH.A00(r2)
            boolean r0 = r2.A0I
            if (r0 == 0) goto L_0x0009
            android.view.View r0 = r2.A02
            X.AnonymousClass7TH.A0R(r0)
            return
        L_0x0138:
            boolean r0 = r9 instanceof X.HK7
            if (r0 == 0) goto L_0x01df
            r2 = r9
            X.HK7 r2 = (X.HK7) r2
            if (r10 == 0) goto L_0x0009
            r0 = 2131430143(0x7f0b0aff, float:1.8481979E38)
            android.view.View r0 = r10.requireViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r1 = r0.inflate()
            if (r1 == 0) goto L_0x01dd
            r0 = 2131430486(0x7f0b0c56, float:1.8482674E38)
            android.view.View r0 = r1.requireViewById(r0)
            com.instagram.common.ui.base.IgTextView r0 = (com.instagram.common.ui.base.IgTextView) r0
            r2.A03 = r0
            r0 = 2131427725(0x7f0b018d, float:1.8477074E38)
            android.view.View r0 = r1.requireViewById(r0)
            com.instagram.igds.components.mediabutton.IgdsMediaButton r0 = (com.instagram.igds.components.mediabutton.IgdsMediaButton) r0
            r2.A04 = r0
            r0 = 2131439038(0x7f0b2dbe, float:1.850002E38)
            android.view.View r0 = r1.requireViewById(r0)
            com.instagram.common.ui.base.IgLinearLayout r0 = (com.instagram.common.ui.base.IgLinearLayout) r0
            r2.A01 = r0
            r0 = 2131436165(0x7f0b2285, float:1.8494193E38)
            android.view.View r0 = r1.requireViewById(r0)
            com.instagram.common.ui.base.IgLinearLayout r0 = (com.instagram.common.ui.base.IgLinearLayout) r0
            r2.A02 = r0
        L_0x017c:
            r2.A00 = r1
            com.instagram.common.ui.base.IgTextView r3 = r2.A03
            if (r3 == 0) goto L_0x018f
            r1 = 55
            X.ICy r0 = new X.ICy
            r0.<init>(r2, r1)
            X.AnonymousClass0fU.A00(r0, r3)
            X.2eS.A01(r3)
        L_0x018f:
            com.instagram.igds.components.mediabutton.IgdsMediaButton r3 = r2.A04
            if (r3 == 0) goto L_0x01a0
            r1 = 56
            X.ICy r0 = new X.ICy
            r0.<init>(r2, r1)
            X.AnonymousClass0fU.A00(r0, r3)
            X.2eS.A01(r3)
        L_0x01a0:
            com.instagram.common.ui.base.IgLinearLayout r3 = r2.A01
            if (r3 == 0) goto L_0x0009
            com.instagram.common.session.UserSession r5 = r2.A07
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L_0x0009
            android.content.res.Resources r1 = r0.getResources()
            if (r1 == 0) goto L_0x0009
            r0 = 2131165287(0x7f070067, float:1.7944787E38)
            int r7 = r1.getDimensionPixelSize(r0)
            X.0iw r4 = r2.A06
            com.instagram.common.ui.base.IgLinearLayout r0 = r2.A01
            if (r0 == 0) goto L_0x0009
            android.content.Context r0 = r0.getContext()
            if (r0 == 0) goto L_0x0009
            android.content.res.Resources r1 = r0.getResources()
            if (r1 == 0) goto L_0x0009
            r0 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r8 = r1.getDimensionPixelSize(r0)
            r0 = 35
            X.InR r6 = new X.InR
            r6.<init>(r2, r0)
            X.C71100Oca.A03(r3, r4, r5, r6, r7, r8)
            return
        L_0x01dd:
            r1 = 0
            goto L_0x017c
        L_0x01df:
            boolean r0 = r9 instanceof X.GPN
            if (r0 == 0) goto L_0x0231
            r3 = r9
            X.GPN r3 = (X.GPN) r3
            if (r10 == 0) goto L_0x0009
            r0 = 2131430059(0x7f0b0aab, float:1.8481808E38)
            android.view.View r0 = r10.requireViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r1 = r0.inflate()
            if (r1 == 0) goto L_0x022f
            r0 = 2131431430(0x7f0b1006, float:1.8484589E38)
            android.view.View r0 = r1.requireViewById(r0)
            r3.A01 = r0
        L_0x0200:
            r3.A00 = r1
            r0 = 2131430298(0x7f0b0b9a, float:1.8482293E38)
            android.view.View r2 = r10.requireViewById(r0)
            com.instagram.igds.components.mediabutton.IgdsMediaButton r2 = (com.instagram.igds.components.mediabutton.IgdsMediaButton) r2
            X.2eS.A01(r2)
            r1 = 57
            X.ICy r0 = new X.ICy
            r0.<init>(r3, r1)
            X.AnonymousClass0fU.A00(r0, r2)
            r3.A03 = r2
            r0 = 24
            X.IO4 r2 = new X.IO4
            r2.<init>((java.lang.Object) r3, (int) r0)
            com.instagram.common.session.UserSession r0 = r3.A07
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Class<X.1qJ> r0 = X.1qJ.class
            r1.A01(r2, r0)
            r3.A02 = r2
            return
        L_0x022f:
            r1 = 0
            goto L_0x0200
        L_0x0231:
            boolean r0 = r9 instanceof X.HK4
            if (r0 == 0) goto L_0x028b
            r6 = r9
            X.HK4 r6 = (X.HK4) r6
            if (r10 == 0) goto L_0x0009
            r0 = 2131430299(0x7f0b0b9b, float:1.8482295E38)
            android.view.View r0 = r10.requireViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r5 = r0.inflate()
            r0 = 4
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r5, r0)
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            android.content.Context r1 = r6.A01
            r4 = 1
            r3 = 0
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            r0.<init>(r1, r4, r3)
            r5.setLayoutManager(r0)
            X.GD6 r0 = r6.A03
            X.GBg r2 = r0.A0A
            java.util.List r1 = r2.A0I()
            X.0qQ.A0B(r1, r4)
            X.Gi0 r0 = new X.Gi0
            r0.<init>()
            r0.A01 = r1
            r0.A00 = r3
            r6.A00 = r0
            X.Idk r1 = r6.A04
            X.0qQ.A0B(r1, r3)
            java.util.List r0 = r2.A02
            r0.add(r1)
            X.Gi0 r0 = r6.A00
            if (r0 != 0) goto L_0x0389
            java.lang.String r0 = "clipsViewerDebugOverlayAdapter"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x028b:
            boolean r0 = r9 instanceof X.HKA
            if (r0 == 0) goto L_0x0342
            r4 = r9
            X.HKA r4 = (X.HKA) r4
            if (r10 == 0) goto L_0x0009
            r0 = 2131430105(0x7f0b0ad9, float:1.8481902E38)
            android.view.View r0 = r10.requireViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r1 = r0.inflate()
            r6 = 0
            if (r1 == 0) goto L_0x0340
            r0 = 2131441139(0x7f0b35f3, float:1.8504281E38)
            android.view.View r0 = r1.requireViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.A01 = r0
            r0 = 2131441141(0x7f0b35f5, float:1.8504285E38)
            android.view.View r0 = r1.requireViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.A02 = r0
            r0 = 2131441136(0x7f0b35f0, float:1.8504275E38)
            android.view.View r0 = r1.requireViewById(r0)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = (com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView) r0
            r4.A03 = r0
            r0 = 2131432988(0x7f0b161c, float:1.8487749E38)
            android.view.View r0 = r1.requireViewById(r0)
            com.instagram.user.follow.FollowButton r0 = (com.instagram.user.follow.FollowButton) r0
            r4.A04 = r0
        L_0x02d0:
            r4.A00 = r1
            com.instagram.user.model.User r5 = r4.A08
            if (r5 == 0) goto L_0x033e
            java.lang.String r0 = r5.getUsername()
        L_0x02da:
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>(r0)
            r2 = 1
            r1 = 0
            if (r5 == 0) goto L_0x02ee
            boolean r0 = r5.isVerified()
            if (r0 != r2) goto L_0x02ee
            android.content.Context r0 = r4.A05
            X.C244273av.A08(r0, r3, r1)
        L_0x02ee:
            com.instagram.user.follow.FollowButton r0 = r4.A04
            if (r0 == 0) goto L_0x02fd
            X.4at r2 = r0.A0J
            if (r2 == 0) goto L_0x02fd
            com.instagram.common.session.UserSession r1 = r4.A07
            X.0iw r0 = r4.A06
            r2.A03(r0, r1, r5)
        L_0x02fd:
            android.widget.TextView r0 = r4.A01
            if (r0 == 0) goto L_0x0304
            r0.setText(r3)
        L_0x0304:
            android.widget.TextView r3 = r4.A01
            if (r3 == 0) goto L_0x0318
            r0 = 5
            X.H7i r2 = new X.H7i
            r2.<init>(r0, r5, r4)
            r1 = 58
            X.ICy r0 = new X.ICy
            r0.<init>(r2, r1)
            X.AnonymousClass0fU.A00(r0, r3)
        L_0x0318:
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r2 = r4.A03
            if (r2 == 0) goto L_0x0327
            if (r5 == 0) goto L_0x033c
            com.instagram.common.typedurl.ImageUrl r1 = r5.Bh3()
        L_0x0322:
            X.0iw r0 = r4.A06
            r2.A0F(r6, r0, r1)
        L_0x0327:
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r3 = r4.A03
            if (r3 == 0) goto L_0x0009
            r0 = 5
            X.H7i r2 = new X.H7i
            r2.<init>(r0, r5, r4)
            r1 = 58
            X.ICy r0 = new X.ICy
            r0.<init>(r2, r1)
            X.AnonymousClass0fU.A00(r0, r3)
            return
        L_0x033c:
            r1 = r6
            goto L_0x0322
        L_0x033e:
            r0 = r6
            goto L_0x02da
        L_0x0340:
            r1 = r6
            goto L_0x02d0
        L_0x0342:
            boolean r0 = r9 instanceof X.HK6
            if (r0 == 0) goto L_0x0009
            r3 = r9
            X.HK6 r3 = (X.HK6) r3
            if (r10 == 0) goto L_0x0009
            r0 = 2131430053(0x7f0b0aa5, float:1.8481796E38)
            android.view.View r0 = r10.requireViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r1 = r0.inflate()
            if (r1 == 0) goto L_0x0387
            r0 = 2131430486(0x7f0b0c56, float:1.8482674E38)
            android.view.View r0 = r1.requireViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.A01 = r0
        L_0x0365:
            r3.A00 = r1
            android.widget.TextView r2 = r3.A01
            if (r2 == 0) goto L_0x0009
            android.content.Context r1 = r2.getContext()
            r0 = 2131956095(0x7f13117f, float:1.9548736E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setText(r0)
            r1 = 53
            X.ICy r0 = new X.ICy
            r0.<init>(r3, r1)
            X.AnonymousClass0fU.A00(r0, r2)
            X.2eS.A01(r2)
            return
        L_0x0387:
            r1 = 0
            goto L_0x0365
        L_0x0389:
            r5.setAdapter(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52050GCw.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
