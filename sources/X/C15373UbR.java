package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* renamed from: X.UbR  reason: case insensitive filesystem */
public final class C15373UbR extends AnonymousClass4DH implements C273494mf, XBO, C240433Kw, C20942X5l {
    public static final String __redex_internal_original_name = "IgBloksScreenQueryBottomSheetFragment";
    public C14608TzE A00;
    public FRI A01;
    public 2el A02;
    public Integer A03;
    public final AnonymousClass0eM A04 = C227642jf.A01(this);

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* renamed from: A00 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D5Q(X.FRI r11) {
        /*
            r10 = this;
            r5 = 0
            X.0qQ.A0B(r11, r5)
            androidx.fragment.app.FragmentActivity r9 = r10.getActivity()
            if (r9 == 0) goto L_0x0096
            X.TzE r0 = r10.A00
            if (r0 == 0) goto L_0x0096
            X.6NS r0 = r0.A04
            X.6Rm r6 = r0.A02()
            X.0qQ.A07(r6)
            X.37D r0 = X.DbT.A0i(r9)
            X.7Pu r4 = X.C48943Emh.A00(r0)
            if (r4 == 0) goto L_0x0096
            X.UKI r0 = r11.A01
            r3 = 0
            if (r0 == 0) goto L_0x00be
            java.lang.String r1 = r0.A01
            X.UKS r3 = r0.A00
            if (r1 == 0) goto L_0x00be
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00be
            r4.A0M(r1)
        L_0x0035:
            if (r3 == 0) goto L_0x00ba
            X.7Ps r2 = X.C51971G9r.A0h(r5)
            boolean r0 = r3.A05
            r2.A0A = r0
            java.lang.String r8 = r3.A03
            if (r8 == 0) goto L_0x00a2
            java.lang.Integer r7 = X.C46616Dhw.A03(r8)
            if (r7 == 0) goto L_0x0097
            int r0 = X.Tt3.A01(r7)
            r2.A02 = r0
            android.content.res.Resources r1 = r9.getResources()
            int r0 = X.Tt3.A00(r7)
            java.lang.String r1 = X.AnonymousClass7TF.A0d(r1, r0)
        L_0x005b:
            r2.A07 = r1
        L_0x005d:
            r1 = 22
            X.WBH r0 = new X.WBH
            r0.<init>((int) r1, (java.lang.Object) r6, (java.lang.Object) r3)
            r2.A05 = r0
            X.7Pt r0 = r2.A00()
            r4.A0K(r0, r5)
        L_0x006d:
            java.lang.Integer r0 = r11.A04
            if (r0 == 0) goto L_0x0096
            int r2 = r0.intValue()
            android.app.Activity r0 = r10.getRootActivity()
            if (r0 == 0) goto L_0x0096
            android.view.Window r1 = r0.getWindow()
            if (r1 == 0) goto L_0x0096
            java.lang.Integer r0 = r10.A03
            if (r0 != 0) goto L_0x0091
            android.view.WindowManager$LayoutParams r0 = r1.getAttributes()
            int r0 = r0.softInputMode
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.A03 = r0
        L_0x0091:
            r0 = r2 | 2
            r1.setSoftInputMode(r0)
        L_0x0096:
            return
        L_0x0097:
            X.GOf r1 = X.C52337GOf.OUTLINE
            X.GOg r0 = X.GOg.SIZE_24
            android.graphics.drawable.Drawable r0 = X.C14091Tpi.A01(r9, r0, r1, r8)
            r2.A04 = r0
            goto L_0x00a8
        L_0x00a2:
            java.lang.String r0 = r3.A04
            if (r0 == 0) goto L_0x005d
            r2.A06 = r0
        L_0x00a8:
            java.lang.String r1 = r3.A02
            if (r1 == 0) goto L_0x00b2
            int r0 = r1.length()
            if (r0 != 0) goto L_0x005b
        L_0x00b2:
            java.lang.String r1 = "bk.data.screen.navbar.bottomsheet.ig.TrailingButton"
            java.lang.String r0 = "Trailing header buttons must have an accessibility label"
            X.1Kn.A02(r1, r0)
            goto L_0x005d
        L_0x00ba:
            r4.A0O(r5)
            goto L_0x006d
        L_0x00be:
            r4.A06()
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15373UbR.D5Q(X.FRI):void");
    }

    public final void DDJ(Integer num) {
        Integer num2;
        int A032 = C51967G9n.A03(num, 0);
        C14608TzE tzE = this.A00;
        if (A032 != 1) {
            if (tzE != null) {
                num2 = AnonymousClass05K.A0C;
            } else {
                return;
            }
        } else if (tzE != null) {
            num2 = AnonymousClass05K.A01;
        } else {
            return;
        }
        tzE.A02(num2);
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final void onSaveInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        C14608TzE tzE = this.A00;
        if (tzE != null) {
            tzE.A01(bundle);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        2el r0 = this.A02;
        if (r0 != null) {
            Dba.A0z(view, r0, this);
        }
        FRI fri = this.A01;
        if (fri != null) {
            D5Q(fri);
        }
    }

    public final String BTx() {
        String str;
        C14608TzE tzE = this.A00;
        if (tzE != null) {
            str = tzE.A03.A05;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            str = "bloks_unknown_class";
        }
        0qQ.A07(str);
        return str;
    }

    public final void DCH() {
        C14608TzE tzE = this.A00;
        if (tzE != null) {
            tzE.A00();
        }
    }

    public final void Ee0(C14644Tzq tzq) {
        C14608TzE tzE = this.A00;
        if (tzE != null) {
            tzE.A00 = tzq;
            if (tzq != null) {
                tzE.A00();
            }
        }
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

    public final String getModuleName() {
        Bundle bundle;
        String string;
        String str;
        C14608TzE tzE = this.A00;
        Bundle bundle2 = this.mArguments;
        if (tzE != null && (str = tzE.A03.A04) != null) {
            return str;
        }
        if (bundle2 == null || (bundle = bundle2.getBundle("key_screen_container_props_bundle")) == null || (string = bundle.getString("key_analytics_module")) == null) {
            return "bloks_unknown";
        }
        return string;
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
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

    public final boolean isScrolledToTop() {
        C14608TzE tzE = this.A00;
        if (tzE == null) {
            return true;
        }
        C307786Rm A022 = tzE.A04.A02();
        0qQ.A07(A022);
        return RhN.A00(A022);
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
        C14608TzE tzE = this.A00;
        if (tzE != null) {
            tzE.A04.A06();
        }
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

    public final void onCreate(Bundle bundle) {
        int i;
        int A022 = AnonymousClass0fD.A02(-996342539);
        C15373UbR.super.onCreate(bundle);
        if (bundle != null) {
            DbX.A10(getActivity(), AnonymousClass37D.A00);
            i = 1012528636;
        } else {
            Bundle requireArguments = requireArguments();
            this.A02 = C71682ef.A01((0lg) null, C18425VrU.A01.A00);
            C229382nI A023 = C229382nI.A02(this, this, getSession(), this.A02);
            C13690Tf8 tf8 = C18972WEz.A0A.A01(requireArguments).A01;
            0qQ.A0C(tf8, AnonymousClass000.A00(1627));
            this.A01 = (FRI) tf8;
            this.A00 = C14608TzE.A05.A01(requireContext(), requireArguments, this, A023);
            new C18505Vt2(this, this);
            i = -1369484277;
        }
        AnonymousClass0fD.A09(i, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C273694n2 r1;
        int A022 = AnonymousClass0fD.A02(-1772612011);
        C14608TzE tzE = this.A00;
        if (tzE != null) {
            Context context = tzE.A02;
            AnonymousClass6NS r2 = tzE.A04;
            0qQ.A0B(r2, 1);
            r1 = new C273694n2(context);
            C51968G9o.A1D(r1, -1);
            r2.A07(r1);
        } else {
            r1 = null;
        }
        AnonymousClass0fD.A09(561177663, A022);
        return r1;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-2093518053);
        super.onDestroyView();
        C14608TzE tzE = this.A00;
        if (tzE != null) {
            tzE.A04.A04();
        }
        AnonymousClass0fD.A09(-1004865925, A022);
    }

    public final void onPause() {
        Window window;
        int A022 = AnonymousClass0fD.A02(1602117466);
        C15373UbR.super.onPause();
        Integer num = this.A03;
        if (num != null) {
            int intValue = num.intValue();
            Activity rootActivity = getRootActivity();
            if (!(rootActivity == null || (window = rootActivity.getWindow()) == null)) {
                window.setSoftInputMode(intValue);
            }
        }
        AnonymousClass0fD.A09(-1650435592, A022);
    }
}
