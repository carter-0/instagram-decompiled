package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.privacy.zone.policy.ZonePolicy;
import com.instagram.common.session.UserSession;
import com.instagram.inappbrowser.expandablefooter.IGExpandableFooterManager$fetchFromGraphQL$1;
import com.instagram.inappbrowser.extensions.IgIABFooterExtensionModuleManager$fetchActiveExtensionsFromGraphQL$1;
import com.instagram.inappbrowser.extensions.IgIABPixelHandlerExtensionModuleManager$fetchActiveExtensionsFromGraphQL$1;
import com.instagram.inappbrowser.extensions.IgIABPreExitHandlerExtensionModuleManager$fetchActiveExtensionsFromGraphQL$1;
import java.util.HashMap;

/* renamed from: X.7kY  reason: invalid class name and case insensitive filesystem */
public final class C340017kY extends BrowserLiteFragment implements AnonymousClass0iw, AnonymousClass4DR, C273494mf {
    public static final String __redex_internal_original_name = "IgBrowserLiteFragment";
    public 2YM A00;
    public A6w A01;
    public AnonymousClass9YF A02;
    public A7G A03;
    public A85 A04;
    public C273494mf A05;
    public boolean A06;
    public final String A07 = "; IABMV/1";
    public final AnonymousClass0eM A08 = C227642jf.A02(this);
    public final 1wn A09 = new AY9(this);
    public final C11235SGv A0A = new C11235SGv();

    public final void A0X(Bundle bundle, IABEvent iABEvent, ZonePolicy zonePolicy, boolean z) {
        Integer num;
        ZonePolicy zonePolicy2 = zonePolicy;
        0qQ.A0B(zonePolicy2, 2);
        UserSession userSession = this.A0P.A00;
        0qQ.A0B(userSession, 1);
        0Tu r3 = 0Tu.A05;
        Bundle bundle2 = bundle;
        IABEvent iABEvent2 = iABEvent;
        if (!182.A06(r3, userSession, 36313579124033685L)) {
            super.A0X(bundle2, iABEvent2, zonePolicy2, z);
        } else if (bundle == null || bundle2.getBoolean(Pxd.A00(17), true)) {
            C7572QKn qKn = new C7572QKn(bundle2);
            String string = qKn.A00.getString(Pxd.A00(172));
            String string2 = qKn.A00.getString(Pxd.A00(175));
            AnonymousClass0eM r4 = this.A08;
            1Xj A022 = 1E7.A00((UserSession) r4.getValue()).A02(string);
            String A023 = A02(qKn);
            String string3 = qKn.A00.getString(Pxd.A00(171));
            if (string3 == null && A022 != null) {
                string3 = C231122qu.A07((UserSession) r4.getValue(), A022);
            }
            String string4 = qKn.A00.getString(Pxd.A00(581));
            double d = (double) iABEvent2.A01;
            C11235SGv sGv = this.A0A;
            UserSession userSession2 = (UserSession) r4.getValue();
            String A0S = A0S();
            0qQ.A07(A0S);
            0lg r5 = (0lg) r4.getValue();
            0qQ.A0B(r5, 0);
            boolean A062 = 182.A06(r3, r5, 36316843295707823L);
            boolean A002 = C9837Rhz.A00((UserSession) r4.getValue());
            C11423SSz A003 = Ri1.A00((UserSession) r4.getValue());
            if (!A003.A03.contains(Pxd.A00(656))) {
                num = AnonymousClass05K.A00;
            } else {
                Boolean A052 = A003.A05();
                if (A052 == null) {
                    num = AnonymousClass05K.A01;
                } else if (A052.booleanValue()) {
                    num = AnonymousClass05K.A0C;
                } else {
                    num = AnonymousClass05K.A0N;
                }
            }
            sGv.A01(iABEvent2, this, userSession2, num, A0S, A023, string, string3, string2, qKn.A00.getString(Pxd.A00(582)), qKn.A00.getString(Pxd.A00(584)), qKn.A00.getString(Pxd.A00(173)), qKn.A00.getString(Pxd.A00(580)), string4, d, A062, A002);
        }
    }

    public final void AIE(int i, String str) {
        EVS backPressDestination;
        C273494mf r0 = this.A05;
        if (r0 != null && (backPressDestination = r0.backPressDestination()) != null) {
            if (backPressDestination != EVS.CLOSED_STATE) {
                super.AIE(1, str);
                AnonymousClass37D A012 = AnonymousClass37D.A00.A01(getActivity());
                if (A012 != null && A012.A0Z(backPressDestination, AnonymousClass05K.A00)) {
                    return;
                }
            }
            AI4(1, str);
        }
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "in_app_browser_v2";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    private final Bundle A00() {
        Bundle bundle;
        Intent intent = this.A06;
        if (intent == null) {
            return bundle;
        }
        bundle = new Bundle();
        bundle.putString(Pxd.A00(253), intent.getStringExtra("offerid"));
        boolean z = false;
        bundle.putBoolean(Pxd.A00(793), intent.getBooleanExtra("IN_WATCH_AND_MORE_OVERLAY", false));
        if (0oI.A0G(this.A05) || 0oI.A0I(this.A05.getPackageManager(), AnonymousClass000.A00(561))) {
            z = true;
        }
        bundle.putBoolean(Pxd.A00(235), z);
        return bundle;
    }

    public static final 1Xj A01(C340017kY r2, C7572QKn qKn) {
        return 1E7.A00((UserSession) r2.A08.getValue()).A02(qKn.A00.getString(Pxd.A00(172)));
    }

    private final String A02(C7572QKn qKn) {
        String string = qKn.A00.getString(Pxd.A00(174));
        if (string != null) {
            return string;
        }
        1Xj A012 = A01(this, qKn);
        if (A012 != null) {
            return A012.C9L();
        }
        return null;
    }

    public final void A0Y(View view, C391769tc r21, boolean z, boolean z2) {
        View view2;
        String str;
        View view3;
        String str2;
        Intent intent = this.A06;
        if (intent != null) {
            if (intent.getBooleanExtra(Pxd.A00(425), false)) {
                C7572QKn qKn = new C7572QKn(this.A08);
                String A022 = A02(qKn);
                1Xj A012 = A01(this, qKn);
                FragmentActivity activity = getActivity();
                if (!(activity == null || (view3 = this.A0B) == null || (str2 = this.A0l) == null)) {
                    String A0T = A0T();
                    String A0S = A0S();
                    0qQ.A07(A0S);
                    String A002 = qKn.A00();
                    SlK slK = new SlK(A00(), view3, activity, this, (UserSession) this.A08.getValue(), A012, str2, A0S, A0T, A022, A002);
                    this.A0R = slK;
                    TTF ttf = new TTF(slK);
                    SRY A003 = SRY.A00();
                    SRY.A02(new AnonymousClass9ZW(slK.A09, A003, new IgIABFooterExtensionModuleManager$fetchActiveExtensionsFromGraphQL$1(slK, ttf), slK.A0H, slK.A0G, slK.A0F, slK.A0J), A003, false);
                }
            } else if (intent.getBooleanExtra(Pxd.A00(424), false)) {
                C7572QKn qKn2 = new C7572QKn(this.A08);
                String A023 = A02(qKn2);
                1Xj A013 = A01(this, qKn2);
                FragmentActivity activity2 = getActivity();
                SlJ slJ = null;
                if (!(activity2 == null || (view2 = this.A0B) == null || (str = this.A0l) == null)) {
                    String A0T2 = A0T();
                    String A0S2 = A0S();
                    0qQ.A07(A0S2);
                    String A004 = qKn2.A00();
                    slJ = new SlJ(A00(), view2, activity2, this, (UserSession) this.A08.getValue(), A013, str, A0S2, A0T2, A023, A004);
                    this.A0R = slJ;
                    SRY A005 = SRY.A00();
                    SRY.A02(new AnonymousClass9ZW(slJ.A07, A005, new IGExpandableFooterManager$fetchFromGraphQL$1(slJ), slJ.A0G, slJ.A0F, slJ.A0E, slJ.A0I), A005, false);
                }
                this.A0R = slJ;
            }
            super.A0Y(view, r21, z, z2);
        }
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
    }

    public final boolean doNotDismissOnDraggingDown() {
        C273494mf r0 = this.A05;
        if (r0 != null) {
            return r0.doNotDismissOnDraggingDown();
        }
        return false;
    }

    public final boolean doNotDragWhenDismissLocked() {
        C273494mf r0 = this.A05;
        if (r0 != null) {
            return r0.doNotDragWhenDismissLocked();
        }
        return false;
    }

    public final boolean doNotFlingWhenDismissLocked() {
        C273494mf r0 = this.A05;
        if (r0 != null) {
            return r0.doNotFlingWhenDismissLocked();
        }
        return false;
    }

    public final int dragLockBouncePx() {
        C273494mf r0 = this.A05;
        if (r0 != null) {
            return r0.dragLockBouncePx();
        }
        return 0;
    }

    public final double getDragUpReleaseRatio() {
        C273494mf r0 = this.A05;
        if (r0 != null) {
            return r0.getDragUpReleaseRatio();
        }
        return 0.5d;
    }

    public final int getExtraDragSpace() {
        int i;
        C273494mf r0 = this.A05;
        if (r0 != null) {
            i = r0.getExtraDragSpace();
        } else {
            i = 0;
        }
        C273494mf r02 = this.A05;
        int i2 = 0;
        if (r02 == null || !r02.includeFragmentDragSpace()) {
            return i;
        }
        View view = this.A09;
        if (view != null) {
            i2 = view.getHeight();
        }
        return i + i2;
    }

    public final double getSwipeDownDistanceAdjustment() {
        C273494mf r0 = this.A05;
        if (r0 != null) {
            return r0.getSwipeDownDistanceAdjustment();
        }
        return 0.5d;
    }

    public final float getSwipeDownFlingVelocity() {
        C273494mf r0 = this.A05;
        if (r0 != null) {
            return r0.getSwipeDownFlingVelocity();
        }
        return 3500.0f;
    }

    public final double getSwipeUpDistanceAdjustment() {
        C273494mf r0 = this.A05;
        if (r0 != null) {
            return r0.getSwipeUpDistanceAdjustment();
        }
        return 0.0d;
    }

    public final float getSwipeUpFlingVelocity() {
        C273494mf r0 = this.A05;
        if (r0 != null) {
            return r0.getSwipeUpFlingVelocity();
        }
        return 3500.0f;
    }

    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        if (X.0qQ.A0K(r1, true) != false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onBackPressed() {
        /*
            r5 = this;
            int r1 = r5.A02
            r0 = 1
            if (r1 == r0) goto L_0x0006
            r0 = 0
        L_0x0006:
            r4 = 0
            if (r0 != 0) goto L_0x0047
            r3 = 1
            boolean r0 = r5.DIV(r3)
            if (r0 != 0) goto L_0x003e
            X.4mf r0 = r5.A05
            if (r0 == 0) goto L_0x0041
            X.EVS r2 = r0.backPressDestination()
            if (r2 == 0) goto L_0x0041
            X.EVS r0 = X.EVS.CLOSED_STATE
            if (r2 == r0) goto L_0x0041
            X.37E r1 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            X.37D r1 = r1.A01(r0)
            if (r1 == 0) goto L_0x003f
            java.lang.Integer r0 = X.AnonymousClass05K.A03
            boolean r0 = r1.A0Z(r2, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L_0x0034:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0041
        L_0x003e:
            return r3
        L_0x003f:
            r1 = 0
            goto L_0x0034
        L_0x0041:
            r1 = 2
            java.lang.String r0 = r5.A0l
            r5.AI4(r1, r0)
        L_0x0047:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C340017kY.onBackPressed():boolean");
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public final HashMap A0V(QLA qla) {
        HashMap A0V = super.A0V(qla);
        0qQ.A07(A0V);
        AnonymousClass9YF r0 = this.A02;
        if (r0 != null) {
            A0V.put("iab_context", r0.A01.toString());
            AnonymousClass9YF r02 = this.A02;
            if (r02 != null) {
                A0V.put(Pxd.A00(775), r02.A02.toString());
                return A0V;
            }
        }
        0qQ.A0F("viewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:6|7|(4:10|(2:14|45)|42|8)|15|16|(2:17|(3:19|(3:25|(1:27)(1:28)|(2:47|30)(1:52))|46)(2:48|31))|32|(3:34|35|(1:56)(2:39|53))(1:59)) */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        return false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0030 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003c A[Catch:{ Exception -> 0x0091 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007e A[SYNTHETIC, Splitter:B:34:0x007e] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0077 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0d() {
        /*
            r8 = this;
            boolean r0 = super.A0d()
            if (r0 == 0) goto L_0x0008
            r0 = 1
            return r0
        L_0x0008:
            X.A85 r6 = r8.A04     // Catch:{  }
            if (r6 == 0) goto L_0x0091
            java.util.List r0 = r6.A09     // Catch:{ Exception -> 0x0030 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ Exception -> 0x0030 }
        L_0x0012:
            boolean r0 = r2.hasNext()     // Catch:{ Exception -> 0x0030 }
            if (r0 == 0) goto L_0x0030
            java.lang.Object r0 = r2.next()     // Catch:{ Exception -> 0x0030 }
            X.RAq r0 = (X.C8814RAq) r0     // Catch:{ Exception -> 0x0030 }
            X.2nI r1 = r0.A01     // Catch:{ Exception -> 0x0030 }
            if (r1 == 0) goto L_0x0012
            java.util.concurrent.atomic.AtomicReference r0 = r0.A04     // Catch:{ Exception -> 0x0030 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0030 }
            X.Di0 r0 = (X.C46620Di0) r0     // Catch:{ Exception -> 0x0030 }
            if (r0 == 0) goto L_0x0012
            X.C48382Edd.A00(r1, r0)     // Catch:{ Exception -> 0x0030 }
            goto L_0x0012
        L_0x0030:
            java.util.List r0 = r6.A09     // Catch:{ Exception -> 0x0091 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ Exception -> 0x0091 }
        L_0x0036:
            boolean r0 = r7.hasNext()     // Catch:{ Exception -> 0x0091 }
            if (r0 == 0) goto L_0x0077
            java.lang.Object r5 = r7.next()     // Catch:{ Exception -> 0x0091 }
            r0 = r5
            X.RAq r0 = (X.C8814RAq) r0     // Catch:{ Exception -> 0x0091 }
            X.2nI r4 = r0.A01     // Catch:{ Exception -> 0x0091 }
            if (r4 == 0) goto L_0x0036
            java.util.concurrent.atomic.AtomicReference r0 = r0.A06     // Catch:{ Exception -> 0x0091 }
            java.lang.Object r3 = r0.get()     // Catch:{ Exception -> 0x0091 }
            X.Di0 r3 = (X.C46620Di0) r3     // Catch:{ Exception -> 0x0091 }
            if (r3 == 0) goto L_0x0036
            androidx.fragment.app.FragmentActivity r2 = r4.A03     // Catch:{ Exception -> 0x0091 }
            X.6Tm r1 = X.AnonymousClass6Tm.A01     // Catch:{ Exception -> 0x0091 }
            X.0sm r0 = X.0Yt.A0E()     // Catch:{ Exception -> 0x0091 }
            java.lang.Object r1 = X.C307886Rw.A02(r2, r3, r4, r1, r0)     // Catch:{ Exception -> 0x0091 }
            if (r1 == 0) goto L_0x0036
            boolean r0 = r1 instanceof java.lang.Boolean     // Catch:{ Exception -> 0x0091 }
            if (r0 == 0) goto L_0x006a
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ Exception -> 0x0091 }
            boolean r0 = r1.booleanValue()     // Catch:{ Exception -> 0x0091 }
            goto L_0x0074
        L_0x006a:
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r0 = "true"
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ Exception -> 0x0091 }
        L_0x0074:
            if (r0 == 0) goto L_0x0036
            goto L_0x0078
        L_0x0077:
            r5 = 0
        L_0x0078:
            X.RAq r5 = (X.C8814RAq) r5     // Catch:{ Exception -> 0x0091 }
            r6.A00 = r5     // Catch:{ Exception -> 0x0091 }
            if (r5 == 0) goto L_0x0091
            X.2nI r1 = r5.A01     // Catch:{ Exception -> 0x008f }
            if (r1 == 0) goto L_0x008f
            java.util.concurrent.atomic.AtomicReference r0 = r5.A05     // Catch:{ Exception -> 0x008f }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x008f }
            X.Di0 r0 = (X.C46620Di0) r0     // Catch:{ Exception -> 0x008f }
            if (r0 == 0) goto L_0x008f
            X.C48382Edd.A00(r1, r0)     // Catch:{ Exception -> 0x008f }
        L_0x008f:
            r0 = 1
            return r0
        L_0x0091:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C340017kY.A0d():boolean");
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        int A022 = AnonymousClass0fD.A02(-744423896);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            z = bundle2.getBoolean(Pxd.A00(642));
        } else {
            z = false;
        }
        this.A06 = z;
        AnonymousClass1Nd.A00((0lg) this.A08.getValue()).A01(this.A09, C40260AXz.class);
        if (!(getContext() instanceof C41785B0o)) {
            this.A0K = new AQA(this);
        }
        AnonymousClass0fD.A09(-1475541678, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FragmentActivity activity;
        int A022 = AnonymousClass0fD.A02(1544252383);
        LayoutInflater layoutInflater2 = layoutInflater;
        0qQ.A0B(layoutInflater2, 0);
        super.onCreateView(layoutInflater2, viewGroup, bundle);
        String A023 = A02(new C7572QKn(this.A08));
        AnonymousClass0eM r6 = this.A08;
        0lg r2 = (0lg) r6.getValue();
        0qQ.A0B(r2, 0);
        0Tu r9 = 0Tu.A05;
        if (182.A06(r9, r2, 36313579124557981L)) {
            String A0S = A0S();
            0qQ.A07(A0S);
            A7G a7g = new A7G(A00(), A0S, A0T(), A023);
            C73666Phf phf = new C73666Phf(24, a7g, this);
            SRY A002 = SRY.A00();
            String str = a7g.A02;
            String str2 = a7g.A01;
            String str3 = a7g.A03;
            SRY.A02(new C7564QJs(a7g.A00, A002, new IgIABPixelHandlerExtensionModuleManager$fetchActiveExtensionsFromGraphQL$1(a7g, phf), str, str2, str3), A002, false);
            this.A03 = a7g;
        }
        0lg r22 = (0lg) r6.getValue();
        0qQ.A0B(r22, 0);
        if (182.A06(r9, r22, 36313579124361370L) && (activity = getActivity()) != null) {
            String A0S2 = A0S();
            0qQ.A07(A0S2);
            String A0T = A0T();
            A85 a85 = new A85(A00(), activity, AnonymousClass07a.A00(getViewLifecycleOwner()), this, (UserSession) r6.getValue(), A0S2, A0T, A023);
            C41630Axi axi = C41630Axi.A00;
            0qQ.A0B(axi, 0);
            SRY A003 = SRY.A00();
            String str4 = a85.A07;
            String str5 = a85.A06;
            String str6 = a85.A08;
            IgIABPreExitHandlerExtensionModuleManager$fetchActiveExtensionsFromGraphQL$1 igIABPreExitHandlerExtensionModuleManager$fetchActiveExtensionsFromGraphQL$1 = new IgIABPreExitHandlerExtensionModuleManager$fetchActiveExtensionsFromGraphQL$1(a85, axi);
            SRY sry = A003;
            SRY.A02(new C7565QJt(a85.A01, sry, igIABPreExitHandlerExtensionModuleManager$fetchActiveExtensionsFromGraphQL$1, str4, str5, str6), A003, false);
            this.A04 = a85;
        }
        View view = this.A0B;
        AnonymousClass0fD.A09(-2024765321, A022);
        return view;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1496731826);
        C13906Tl6 tl6 = this.A0R;
        if (tl6 != null && (tl6 instanceof SlJ)) {
            SlJ slJ = (SlJ) tl6;
            C13822Ths ths = slJ.A01;
            if (ths != null) {
                ths.onDestroyView();
            }
            slJ.A01 = null;
        }
        AnonymousClass1Nd.A00((0lg) this.A08.getValue()).A02(this.A09, C40260AXz.class);
        super.onDestroyView();
        AnonymousClass0fD.A09(-1201199586, A022);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0018: MOVE  (r1v1 X.2ZP) = (r1v0 X.2ZP)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void onResume() {
        /*
            r4 = this;
            r0 = -1562967825(0xffffffffa2d700ef, float:-5.8276855E-18)
            int r3 = X.AnonymousClass0fD.A02(r0)
            super.onResume()
            boolean r0 = r4.A06
            if (r0 == 0) goto L_0x001f
            r2 = 8
            androidx.fragment.app.FragmentActivity r1 = r4.getActivity()
            boolean r0 = r1 instanceof X.AnonymousClass2ZP
            if (r0 == 0) goto L_0x001f
            X.2ZP r1 = (X.AnonymousClass2ZP) r1
            if (r1 == 0) goto L_0x001f
            r1.Enj(r2)
        L_0x001f:
            r0 = -930681964(0xffffffffc886eb94, float:-276316.62)
            X.AnonymousClass0fD.A09(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C340017kY.onResume():void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0017: MOVE  (r1v1 X.2ZP) = (r1v0 X.2ZP)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void onStop() {
        /*
            r4 = this;
            r0 = -1968348790(0xffffffff8aad618a, float:-1.6695984E-32)
            int r3 = X.AnonymousClass0fD.A02(r0)
            X.C340017kY.super.onStop()
            boolean r0 = r4.A06
            if (r0 == 0) goto L_0x001e
            r2 = 0
            androidx.fragment.app.FragmentActivity r1 = r4.getActivity()
            boolean r0 = r1 instanceof X.AnonymousClass2ZP
            if (r0 == 0) goto L_0x001e
            X.2ZP r1 = (X.AnonymousClass2ZP) r1
            if (r1 == 0) goto L_0x001e
            r1.Enj(r2)
        L_0x001e:
            r0 = 1273957168(0x4bef0b30, float:3.1331936E7)
            X.AnonymousClass0fD.A09(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C340017kY.onStop():void");
    }
}
