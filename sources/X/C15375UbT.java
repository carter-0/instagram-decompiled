package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ScrollView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.SpecialRequirementCategory;
import com.instagram.common.session.UserSession;

/* renamed from: X.UbT  reason: case insensitive filesystem */
public final class C15375UbT extends AnonymousClass4DH implements C273494mf, C273414mX {
    public static final String __redex_internal_original_name = "PromoteSpecialRequirementsBottomSheetFragment";
    public UserSession A00;
    public View A01;
    public ScrollView A02;
    public PromoteData A03;
    public final AnonymousClass0eM A04;

    public final void Cyc() {
    }

    public final void Cyf() {
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "promote_special_requirements_bottom_sheet";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.07Z, androidx.fragment.app.Fragment, java.lang.Object, X.UbT, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        ViewStub viewStub;
        0qQ.A0B(view, 0);
        UserSession userSession = this.A00;
        if (userSession != null) {
            C13988Tno.A1J(WGU.A00(userSession), C16678UzE.REGULATED_CATEGORY_SELECTION);
            if (this.A01 == null && (viewStub = (ViewStub) view.findViewById(R.id.main_container_stub_with_political_ads)) != null) {
                this.A01 = viewStub.inflate();
            }
            View view2 = this.A01;
            if (view2 != null) {
                this.A02 = (ScrollView) view2.findViewById(R.id.special_requirement_scroll_view);
                TextView A0d = AnonymousClass7TE.A0d(view2, R.id.special_requirement_header_text);
                if (A0d != null) {
                    A0d.setText(2131970771);
                }
                View findViewById = view2.findViewById(R.id.special_requirement_done_text);
                if (findViewById != null) {
                    WBB.A01(findViewById, 56, this);
                }
                TextView A0d2 = AnonymousClass7TE.A0d(view2, R.id.normal_flow_text_view);
                if (A0d2 != null) {
                    Bundle bundle2 = this.mArguments;
                    int i = 0;
                    if (bundle2 == null || !bundle2.getBoolean("should_show_boost_package_text", false)) {
                        i = 8;
                    } else {
                        Context context = A0d2.getContext();
                        if (context != null) {
                            str = context.getString(2131954014);
                        } else {
                            str = null;
                        }
                        A0d2.setText(str);
                    }
                    A0d2.setVisibility(i);
                }
                AnonymousClass7TE.A1Z(new C66188MGz((Object) view2, (Object) this, (AnonymousClass4D7) null, 5), AnonymousClass07a.A00(this));
            }
            Context context2 = getContext();
            if (context2 != null) {
                C14775U8l u8l = (C14775U8l) this.A04.getValue();
                05G r5 = u8l.A03;
                do {
                } while (!r5.AIY(r5.getValue(), new C61074JwC(C14775U8l.A00(context2, SpecialRequirementCategory.A08, u8l), C14775U8l.A00(context2, SpecialRequirementCategory.A06, u8l), C14775U8l.A00(context2, SpecialRequirementCategory.A05, u8l), C14775U8l.A00(context2, SpecialRequirementCategory.A04, u8l))));
            }
            super.onViewCreated(view, bundle);
            return;
        }
        DbS.A14();
        throw AnonymousClass00P.createAndThrow();
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
        UserSession userSession = this.A00;
        if (userSession != null) {
            return userSession;
        }
        DbS.A14();
        throw AnonymousClass00P.createAndThrow();
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
        ScrollView scrollView = this.A02;
        if (scrollView == null || JTP.A1Y(scrollView)) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public C15375UbT() {
        C20702WxZ wxZ = new C20702WxZ(this, 45);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C20702WxZ(new C20702WxZ(this, 42), 43));
        this.A04 = new C227862kA(new C20702WxZ(A002, 44), wxZ, new C41566AwY(27, (Object) null, A002), new 0Yh(C14775U8l.class));
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0012: MOVE  (r1v2 X.XAI) = (r1v0 X.XAI)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void onCreate(android.os.Bundle r4) {
        /*
            r3 = this;
            r0 = -1107351681(0xffffffffbdff277f, float:-0.12458705)
            int r2 = X.AnonymousClass0fD.A02(r0)
            X.C15375UbT.super.onCreate(r4)
            androidx.fragment.app.FragmentActivity r1 = r3.getActivity()
            boolean r0 = r1 instanceof X.XAI
            if (r0 == 0) goto L_0x0027
            X.XAI r1 = (X.XAI) r1
            if (r1 == 0) goto L_0x0027
            com.instagram.business.promote.model.PromoteData r0 = r1.Bhh()
            r3.A03 = r0
            com.instagram.common.session.UserSession r0 = r0.A0y
            r3.A00 = r0
            r0 = 1319603491(0x4ea78d23, float:1.4055223E9)
            X.AnonymousClass0fD.A09(r0, r2)
            return
        L_0x0027:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = 1768014592(0x6961c300, float:1.7058073E25)
            X.AnonymousClass0fD.A09(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15375UbT.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-353574716);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.promote_special_requirements_view, false);
        AnonymousClass0fD.A09(882184691, A022);
        return A0D;
    }

    public final void onDestroyView() {
        String str;
        int A022 = AnonymousClass0fD.A02(-1335595193);
        super.onDestroyView();
        UserSession userSession = this.A00;
        if (userSession != null) {
            WGU A002 = WGU.A00(userSession);
            PromoteData promoteData = this.A03;
            if (promoteData == null) {
                str = "promoteData";
            } else {
                A002.A0B(C16678UzE.REGULATED_CATEGORY_SELECTION, promoteData);
                this.A01 = null;
                this.A02 = null;
                AnonymousClass0fD.A09(1986125452, A022);
                return;
            }
        } else {
            str = "session";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
