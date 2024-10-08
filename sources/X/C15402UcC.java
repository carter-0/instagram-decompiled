package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.UcC  reason: case insensitive filesystem */
public final class C15402UcC extends C273374mT implements AnonymousClass4DU, C273494mf {
    public static final String __redex_internal_original_name = "MiniPDPFragment";
    public LDY A00;
    public UA3 A01 = new UA3(this);
    public long A02 = System.currentTimeMillis();
    public final L76 A03 = new L76(new C20701WxY(this, 13), new C20701WxY(this, 14), new C20785Wyw(this, 0));
    public final AnonymousClass0eM A04 = C20701WxY.A01(this, 15);
    public final AnonymousClass0eM A05 = C20701WxY.A01(this, 16);
    public final AnonymousClass0eM A06 = C20701WxY.A01(this, 17);
    public final 1wn A07 = new C19221WQb(this, 69);

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "shops_mini_pdp";
    }

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return true;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = new LDY(view, this);
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C59845JaL(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 11), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
    }

    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
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

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.0r1, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0090, code lost:
        if (r5 != null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009a, code lost:
        if (r11 != null) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0040, code lost:
        if (r3.A25() == X.C16560UxC.SHOPLESS_IN_APP_BROWSER) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            r0 = -1422075071(0xffffffffab3cdb41, float:-6.7095293E-13)
            int r0 = X.AnonymousClass0fD.A02(r0)
            X.C15402UcC.super.onCreate(r13)
            X.0eM r1 = r12.A04
            java.lang.Object r1 = r1.getValue()
            X.1Xj r1 = (X.1Xj) r1
            if (r1 == 0) goto L_0x00bc
            java.util.ArrayList r1 = r1.A3B()
            java.lang.Object r5 = X.00k.A0J(r1)
            com.instagram.user.model.Product r5 = (com.instagram.user.model.Product) r5
            if (r5 == 0) goto L_0x005d
            X.0eM r1 = r12.A06
            java.lang.Object r6 = r1.getValue()
            X.Jgb r6 = (X.C60156Jgb) r6
            X.0r1 r4 = new X.0r1
            r4.<init>()
            X.1Xj r3 = r6.A00
            if (r3 == 0) goto L_0x0045
            X.UxC r2 = r3.A25()
            X.UxC r1 = X.C16560UxC.ADS_PRODUCT_PAGE
            if (r2 == r1) goto L_0x0042
            X.UxC r3 = r3.A25()
            X.UxC r2 = X.C16560UxC.SHOPLESS_IN_APP_BROWSER
            r1 = 1
            if (r3 != r2) goto L_0x0043
        L_0x0042:
            r1 = 0
        L_0x0043:
            r4.A00 = r1
        L_0x0045:
            X.3Ym r2 = r5.BpO()
            X.3Ym r1 = X.C243373Ym.SAVED
            boolean r9 = X.AnonymousClass7TF.A1W(r2, r1)
            X.6oS r1 = X.C318116oQ.A00(r6)
            r7 = 0
            r8 = 4
            X.MGG r3 = new X.MGG
            r3.<init>(r4, r5, r6, r7, r8, r9)
            X.AnonymousClass7TE.A1Z(r3, r1)
        L_0x005d:
            androidx.fragment.app.FragmentActivity r4 = r12.getActivity()
            if (r4 == 0) goto L_0x00a6
            android.content.Context r6 = r12.getContext()
            if (r6 == 0) goto L_0x00a6
            X.LDY r1 = r12.A00
            if (r1 == 0) goto L_0x007f
            X.LB8 r3 = r1.A01
            com.facebook.shimmer.ShimmerFrameLayout r2 = r3.A03
            r1 = 0
            r2.setVisibility(r1)
            r2.A02()
            androidx.constraintlayout.widget.ConstraintLayout r2 = r3.A01
            r1 = 8
            r2.setVisibility(r1)
        L_0x007f:
            X.0gy r7 = X.AnonymousClass07i.A00(r4)
            com.instagram.common.session.UserSession r8 = r12.getSession()
            java.lang.String r2 = ""
            if (r5 == 0) goto L_0x008f
            java.lang.String r10 = r5.A0H
            if (r10 != 0) goto L_0x0092
        L_0x008f:
            r10 = r2
            if (r5 == 0) goto L_0x009c
        L_0x0092:
            com.instagram.user.model.User r1 = r5.A0B
            if (r1 == 0) goto L_0x009c
            java.lang.String r11 = X.AnonymousClass3ZA.A00(r1)
            if (r11 != 0) goto L_0x009d
        L_0x009c:
            r11 = r2
        L_0x009d:
            r1 = 0
            X.WcJ r9 = new X.WcJ
            r9.<init>(r1, r12, r5)
            X.C18262VoT.A01(r6, r7, r8, r9, r10, r11)
        L_0x00a6:
            com.instagram.common.session.UserSession r1 = r12.getSession()
            X.1Ng r3 = X.AnonymousClass1Nd.A00(r1)
            java.lang.Class<X.3DT> r2 = X.AnonymousClass3DT.class
            X.1wn r1 = r12.A07
            r3.A01(r1, r2)
            r1 = -1145443606(0xffffffffbbb9eaea, float:-0.005673756)
            X.AnonymousClass0fD.A09(r1, r0)
            return
        L_0x00bc:
            r5 = 0
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15402UcC.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1388900122);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_mini_pdp_fragment, false);
        AnonymousClass0fD.A09(1040539611, A022);
        return A0D;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1882716654);
        super.onDestroy();
        AnonymousClass1Nd.A00(getSession()).A02(this.A07, AnonymousClass3DT.class);
        AnonymousClass0fD.A09(1488311028, A022);
    }

    public final void onPause() {
        ArrayList arrayList;
        int A022 = AnonymousClass0fD.A02(-1215206822);
        C15402UcC.super.onPause();
        AnonymousClass0eM r2 = this.A04;
        1Xj r5 = (1Xj) r2.getValue();
        long currentTimeMillis = System.currentTimeMillis() - this.A02;
        UserSession session = getSession();
        1Xj r0 = (1Xj) r2.getValue();
        if (r0 != null) {
            arrayList = r0.A3B();
        } else {
            arrayList = null;
        }
        C18694Vws.A02(session, r5, this, arrayList, currentTimeMillis);
        AnonymousClass0fD.A09(1875300650, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1914672776);
        super.onResume();
        this.A02 = System.currentTimeMillis();
        AnonymousClass0fD.A09(-532913934, A022);
    }
}
