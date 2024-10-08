package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

public final class K7V extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "ClipsAudienceControlFragment";
    public C252063oV A00;
    public KHW A01;
    public IgdsBottomButtonLayout A02;
    public C331157Pu A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final AnonymousClass0eM A05 = DbS.A0I(C66303MMm.A01(this, 46), C66303MMm.A01(this, 47), MMY.A00(this, (Object) null, 21), DbS.A0z(C60259JiG.class));

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0eM r3 = this.A04;
        KHW khw = new KHW(this, AnonymousClass7TE.A0l(r3));
        this.A01 = khw;
        khw.A00();
        KHW khw2 = this.A01;
        String str = "radioButtonsView";
        if (khw2 != null) {
            if (khw2.A01 == null) {
                khw2.A01 = this.A03;
            }
            ViewGroup A0E = DbS.A0E(view, R.id.radio_buttons_container);
            KHW khw3 = this.A01;
            if (khw3 != null) {
                A0E.addView(khw3);
                this.A00 = DbV.A0T(view, R.id.tooltip_close_friends, false);
                TextView A0R = AnonymousClass7TG.A0R(view, R.id.clips_audience_control_subtitle);
                IgdsBottomButtonLayout A0c = DbT.A0c(view, R.id.bottom_action_button);
                this.A02 = A0c;
                if (A0c == null) {
                    str = "bottomButton";
                } else {
                    A0c.setPrimaryAction(getString(2131960992), new LYF((Object) this, 61));
                    AnonymousClass0eM r2 = this.A05;
                    int A0M = AnonymousClass7TE.A0M(JTT.A0P(r2).A01.A04);
                    if (A0M == 0) {
                        i = 2131969683;
                    } else if (A0M == 1) {
                        i = 2131955215;
                    } else {
                        throw AnonymousClass7TE.A1K();
                    }
                    A0R.setText(i);
                    JTT.A0P(r2).A06.Epw(C62483KgY.AUDIENCE_CONTROL_SELECTOR_V1);
                    27r A0g = C51971G9r.A0g(r3);
                    0Aj A0e = AnonymousClass7TE.A0e(A0g.A01, "ig_camera_share_sheet_entity_impression");
                    if (A0e.isSampled()) {
                        AnonymousClass283 r32 = A0g.A04;
                        String str2 = r32.A0L;
                        C59725JVj jVj = r32.A0C;
                        if (!(A0g.A0J() == null || jVj == null || str2 == null)) {
                            AnonymousClass7TH.A0W(A0e, A0g);
                            JTO.A1S(A0e, str2);
                            AnonymousClass7TE.A1W(A0e, "entity_type", 10);
                            DbS.A1K(A0e, __redex_internal_original_name);
                            JTS.A19(A0e, r32);
                            C51965G9l.A1A(jVj, A0e);
                            AnonymousClass7TH.A0V(A0e);
                        }
                    }
                    07U r4 = 07U.A05;
                    AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
                    AnonymousClass0xx A002 = AnonymousClass07a.A00(viewLifecycleOwner);
                    MHO A032 = MHO.A03(viewLifecycleOwner, r4, this, (AnonymousClass4D7) null, 8);
                    19B r33 = 19B.A00;
                    AnonymousClass07Z A0I = JTP.A0I(this, r33, A032, A002);
                    1Eo.A05(r33, MHO.A03(A0I, r4, this, (AnonymousClass4D7) null, 9), AnonymousClass07a.A00(A0I));
                    return;
                }
            }
        }
        0qQ.A0F(str);
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

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 2002) {
            JTT.A0P(this.A05).A00(intent);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1248827546);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_clips_audience_control_fragment, false);
        AnonymousClass0fD.A09(1108628214, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-533642741);
        super.onDestroyView();
        this.A03 = null;
        AnonymousClass0fD.A09(1540064130, A022);
    }
}
