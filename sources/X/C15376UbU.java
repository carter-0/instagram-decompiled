package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import java.util.Map;

/* renamed from: X.UbU  reason: case insensitive filesystem */
public final class C15376UbU extends AnonymousClass4DH implements C273494mf, C273414mX, X37 {
    public static final /* synthetic */ AnonymousClass0YZ[] A0I = {new 015(C15376UbU.class, "startTimeInSeconds", "getStartTimeInSeconds()J", 0)};
    public static final String __redex_internal_original_name = "AdsConsentGrowthBottomSheetFragment";
    public IgdsBottomButtonLayout A00;
    public View A01;
    public RecyclerView A02;
    public boolean A03 = true;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07 = A00(this, 33);
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09 = A00(this, 35);
    public final AnonymousClass0eM A0A = A00(this, 36);
    public final AnonymousClass0eM A0B = A00(this, 37);
    public final AnonymousClass0eM A0C = A00(this, 38);
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0eM A0G;
    public final 0s0 A0H;

    public final void Cyf() {
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return AnonymousClass000.A00(2920);
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Dba.A16(getViewLifecycleOwner(), ((U93) this.A0E.getValue()).A01, new C66308MMr(this, 15), 36);
    }

    public static AnonymousClass0eM A00(Object obj, int i) {
        return AnonymousClass1YB.A00(new C13346TVt(obj, i));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0008: MOVE  (r1v2 com.instagram.igds.components.bottomsheet.BottomSheetFragment) = 
          (r1v1 com.instagram.igds.components.bottomsheet.BottomSheetFragment)
        
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public static final void A01(androidx.fragment.app.Fragment r0, X.C15376UbU r1, boolean r2) {
        /*
            r1.A03 = r2
            androidx.fragment.app.Fragment r1 = r0.mParentFragment
            boolean r0 = r1 instanceof com.instagram.igds.components.bottomsheet.BottomSheetFragment
            if (r0 == 0) goto L_0x0011
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r1 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r1
            if (r1 == 0) goto L_0x0011
            X.7Pu r0 = r1.A02
            X.DbW.A1K(r0)
        L_0x0011:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15376UbU.A01(androidx.fragment.app.Fragment, X.UbU, boolean):void");
    }

    public static final void A02(C15376UbU ubU) {
        ((Map) ubU.A08.getValue()).put(C273654mx.A00(675), String.valueOf(AnonymousClass7TG.A0I() - AnonymousClass7TE.A0R(Pxe.A0s(ubU, ubU.A0H, A0I, 0))));
    }

    public final void Cyc() {
        if (this.A03) {
            C2356630s r2 = new C2356630s(this, AnonymousClass7TE.A0l(this.A0D));
            A02(this);
            r2.A00("ig_cg_bottomsheet_dismiss", (Map) this.A08.getValue());
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

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0D);
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
        RecyclerView recyclerView = this.A02;
        if (recyclerView != null) {
            return !JTP.A1Y(recyclerView);
        }
        C66580MXl.A19();
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v30, types: [java.lang.Object, X.0s0] */
    public C15376UbU() {
        C13346TVt tVt = new C13346TVt(this, 42);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C13346TVt(new C13346TVt(this, 39), 40));
        this.A0E = new C227862kA(new C13346TVt(A002, 41), tVt, new MMV(0, (Object) null, A002), new 0Yh(U93.class));
        this.A08 = A00(this, 34);
        this.A04 = A00(this, 30);
        this.A06 = A00(this, 32);
        this.A05 = A00(this, 31);
        this.A0F = A00(this, 43);
        this.A0G = AnonymousClass1YB.A00(C20638WwW.A00);
        this.A0H = new Object();
        this.A0D = C227642jf.A02(this);
    }

    public final void DJX(String str) {
        String str2;
        A02(this);
        A01(this, this, false);
        C18732VzB vzB = (C18732VzB) this.A05.getValue();
        vzB.A00.A00("ig_cg_bottomsheet_learn_more_click", vzB.A02);
        if (0qQ.A0K(str, "activity_feed_notification_3PD_content")) {
            str2 = "ig_activity_feed_notification";
        } else {
            str2 = "ig_3pd_trial_30_day_megaphone";
        }
        C18732VzB.A00(vzB, str2);
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1615376363);
        C15376UbU.super.onCreate(bundle);
        ((U93) this.A0E.getValue()).A00 = this;
        AnonymousClass0fD.A09(-2018605993, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        C266444Yx A002;
        int i;
        C266444Yx A003;
        int i2;
        int A022 = AnonymousClass0fD.A02(1255363179);
        0qQ.A0B(layoutInflater, 0);
        this.A03 = true;
        View inflate = layoutInflater.inflate(R.layout.layout_ads_consent_growth_bottomsheet, viewGroup, false);
        0qQ.A0C(inflate, AnonymousClass000.A00(0));
        Dba.A0z(inflate, (2el) this.A0G.getValue(), this);
        long A0I2 = AnonymousClass7TG.A0I();
        this.A0H.Epx(this, Long.valueOf(A0I2), A0I[0]);
        VRB vrb = (VRB) this.A0F.getValue();
        Map map = (Map) this.A08.getValue();
        AnonymousClass7TF.A1B(inflate, 0, map);
        2el r5 = vrb.A01;
        C2354830a A004 = AnonymousClass30Y.A00(new C61081JwJ("ig_cg_bottomsheet_impression", map, 5), C60340gF.A00, "ig_cg_bottomsheet_impression");
        A004.A00(vrb.A00);
        C51967G9n.A0z(inflate, A004, r5);
        RecyclerView A0G2 = C13990Tnq.A0G(inflate);
        this.A02 = A0G2;
        if (A0G2 == null) {
            str = "recyclerView";
        } else {
            DbU.A15(A0G2.getContext(), A0G2, 1, false);
            Dba.A17(A0G2, this.A04);
            A0G2.setItemAnimator((AnonymousClass3AS) null);
            A0G2.setClipToPadding(false);
            View findViewById = inflate.findViewById(R.id.button_container);
            this.A01 = findViewById;
            if (findViewById == null) {
                str = "buttonContainer";
            } else {
                this.A00 = (IgdsBottomButtonLayout) findViewById.findViewById(R.id.bottom_button);
                String A0t = DbS.A0t(this.A0B);
                str = "button";
                if (A0t != null) {
                    IgdsBottomButtonLayout igdsBottomButtonLayout = this.A00;
                    if (igdsBottomButtonLayout != null) {
                        Context requireContext = requireContext();
                        String str2 = ((U93) this.A0E.getValue()).A03;
                        if (0qQ.A0K(str2, "3pd_trial_open_setting_screen")) {
                            i2 = 2131952489;
                        } else if (0qQ.A0K(str2, "3pd_trial_inline_opt_in")) {
                            i2 = 2131952490;
                        } else if (0qQ.A0K(str2, "3pd_trial_inline_opt_out")) {
                            i2 = 2131952488;
                        } else if (0qQ.A0K(str2, "fewer_ads_test_group_cta")) {
                            i2 = 2131962403;
                        } else if (0qQ.A0K(str2, "fewer_ads_control_group_cta")) {
                            i2 = 2131962396;
                        } else if (0qQ.A0K(str2, "activity_feed_notification_3PD_inline_opt_in")) {
                            i2 = 2131952198;
                        } else {
                            A003 = JUH.A00("");
                            igdsBottomButtonLayout.setPrimaryAction(C66909Mes.A00(requireContext, A003), new W9h(A0t, this, 0));
                        }
                        A003 = JTP.A0Q(i2);
                        igdsBottomButtonLayout.setPrimaryAction(C66909Mes.A00(requireContext, A003), new W9h(A0t, this, 0));
                    }
                }
                if (this.A0C.getValue() != null) {
                    IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A00;
                    if (igdsBottomButtonLayout2 != null) {
                        Context requireContext2 = requireContext();
                        String str3 = ((U93) this.A0E.getValue()).A04;
                        if (0qQ.A0K(str3, "3pd_trial_not_now")) {
                            i = 2131952492;
                        } else if (0qQ.A0K(str3, "3pd_trial_cancel")) {
                            i = 2131952491;
                        } else if (0qQ.A0K(str3, "activity_feed_notification_not_now")) {
                            i = 2131952203;
                        } else {
                            A002 = JUH.A00("");
                            igdsBottomButtonLayout2.setSecondaryAction(C66909Mes.A00(requireContext2, A002), new C18887WAz(this, 12));
                        }
                        A002 = JTP.A0Q(i);
                        igdsBottomButtonLayout2.setSecondaryAction(C66909Mes.A00(requireContext2, A002), new C18887WAz(this, 12));
                    }
                }
                AnonymousClass0fD.A09(-671069711, A022);
                return inflate;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-716663230);
        super.onDestroy();
        ((U93) this.A0E.getValue()).A00 = null;
        AnonymousClass0fD.A09(621993729, A022);
    }
}
