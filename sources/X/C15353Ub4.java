package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModel;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;

/* renamed from: X.Ub4  reason: case insensitive filesystem */
public final class C15353Ub4 extends AnonymousClass4DH implements AnonymousClass4DU, C273494mf, C252293os {
    public static final String __redex_internal_original_name = "QuestionResponseBottomSheetFragment";
    public View A00;
    public View A01;
    public UserSession A02;
    public ReboundViewPager A03;
    public C14177TrG A04;
    public C234462xu A05;
    public U49 A06;

    public final void DW9(int i, int i2, boolean z) {
    }

    public final void DhK(AnonymousClass3TF r1, float f, float f2) {
    }

    public final void DhS(AnonymousClass3TF r1, AnonymousClass3TF r2) {
    }

    public final void Dpz(int i, int i2) {
    }

    public final /* synthetic */ void Dwb(int i, float f) {
    }

    public final void DzE(View view) {
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "question_response_bottom_sheet_fragment";
    }

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isScrolledToTop() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = DbX.A0U(this);
        int i = requireArguments.getInt("starting_position", 0);
        C234462xu r9 = new C234462xu(requireContext(), this.A02);
        this.A05 = r9;
        UserSession userSession = this.A02;
        this.A06 = new U49(requireActivity(), userSession, this, r9, this);
        ReboundViewPager reboundViewPager = (ReboundViewPager) view.requireViewById(R.id.response_view_pager);
        this.A03 = reboundViewPager;
        reboundViewPager.A0N(this.A06, (float) i);
        A01(i);
        this.A03.A0P(this);
        View requireViewById = view.requireViewById(R.id.left_arrow);
        this.A00 = requireViewById;
        WBC.A00(requireViewById, 12, this);
        View requireViewById2 = view.requireViewById(R.id.right_arrow);
        this.A01 = requireViewById2;
        WBC.A00(requireViewById2, 13, this);
        int count = this.A06.getCount();
        boolean z = false;
        boolean A1R = AnonymousClass7TF.A1R(i);
        if (i < count - 1) {
            z = true;
        }
        this.A00.setEnabled(A1R);
        this.A01.setEnabled(z);
    }

    private WZE A00(int i) {
        View A0D = this.A03.A0D(i);
        if (A0D == null || !(A0D.getTag() instanceof WZE)) {
            return null;
        }
        return (WZE) A0D.getTag();
    }

    private void A01(int i) {
        C17712Vch vch;
        View A0D = this.A03.A0D(i);
        if (A0D != null && (A0D.getTag() instanceof C17712Vch) && (vch = (C17712Vch) A0D.getTag()) != null) {
            QuestionMediaResponseModel questionMediaResponseModel = vch.A00;
            if (questionMediaResponseModel != null) {
                if (C13988Tno.A0D(questionMediaResponseModel.A04) == 1iA.A0a.A00) {
                    Context A0S = AnonymousClass7TE.A0S(vch.A02);
                    UserSession userSession = vch.A03;
                    String str = vch.A04;
                    QuestionMediaResponseModel questionMediaResponseModel2 = vch.A00;
                    if (questionMediaResponseModel2 != null) {
                        C16385Uu2 uu2 = new C16385Uu2(A0S, userSession, questionMediaResponseModel2, str);
                        vch.A01 = uu2;
                        SimpleVideoLayout simpleVideoLayout = (SimpleVideoLayout) AnonymousClass7TE.A14(vch.A0C);
                        QuestionMediaResponseModel questionMediaResponseModel3 = vch.A00;
                        if (questionMediaResponseModel3 != null) {
                            AnonymousClass3WR A012 = C18240Vo7.A01(questionMediaResponseModel3);
                            if (A012 != null) {
                                View A062 = AnonymousClass7TH.A06(vch.A09);
                                0qQ.A0B(simpleVideoLayout, 0);
                                boolean A1Y = DbW.A1Y(A062);
                                C263754Nf r9 = new C263754Nf((Object) uu2.A01, 0);
                                AnonymousClass4M3 r3 = uu2.A02;
                                r3.Ech(A1Y);
                                AnonymousClass4M1 r0 = (AnonymousClass4M1) r3;
                                r0.A0N = uu2;
                                r0.A0X = A1Y;
                                r0.A0Z = A1Y;
                                String str2 = uu2.A03;
                                0qQ.A0B(str2, 6);
                                r3.E4H(new C263794Nj(simpleVideoLayout, new C263414Lx(false, false, false, false), A012, r9, (String) null, str2, 1.0f, -1, r3.getCurrentPositionMs(), false));
                                simpleVideoLayout.setVisibility(0);
                                A062.setVisibility(0);
                                WBD.A00(simpleVideoLayout, 31, uu2, A062);
                                return;
                            }
                            throw AnonymousClass7TE.A0y();
                        }
                    }
                } else {
                    return;
                }
            }
            0qQ.A0F("mediaResponseModel");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    private void A02(int i) {
        C17712Vch vch;
        View A0D = this.A03.A0D(i);
        if (A0D != null && (A0D.getTag() instanceof C17712Vch) && (vch = (C17712Vch) A0D.getTag()) != null) {
            QuestionMediaResponseModel questionMediaResponseModel = vch.A00;
            if (questionMediaResponseModel == null) {
                0qQ.A0F("mediaResponseModel");
                throw AnonymousClass00P.createAndThrow();
            } else if (C13988Tno.A0D(questionMediaResponseModel.A04) == 1iA.A0a.A00) {
                C16385Uu2 uu2 = vch.A01;
                if (uu2 != null) {
                    uu2.A02.ECP("fragment_paused");
                }
                DbU.A13(vch.A02.getContext(), (ImageView) AnonymousClass7TE.A14(vch.A09), R.drawable.instagram_play_pano_filled_24);
            }
        }
    }

    public final /* synthetic */ boolean CsC() {
        return false;
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

    public final AnonymousClass0wW getSession() {
        return this.A02;
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

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public final void DVx(int i, int i2) {
        boolean z;
        WZE A002;
        WZE A003 = A00(i2);
        if (A003 != null) {
            C65505LuT luT = A003.A08;
            z = luT.A0B.isPlaying();
            luT.A07.setProgress(0);
        } else {
            z = false;
        }
        WZE A004 = A00(i2);
        if (A004 != null) {
            A004.A08.A0B.release();
        }
        this.A04.A0B.CHw(i);
        if (z && (A002 = A00(i)) != null) {
            C65505LuT luT2 = A002.A08;
            if (luT2.A05.getVisibility() == 0) {
                luT2.A09.Dqe(luT2.A06);
            }
        }
        A02(i2);
        A01(i);
        int count = this.A06.getCount();
        boolean z2 = false;
        boolean A1R = AnonymousClass7TF.A1R(i);
        if (i < count - 1) {
            z2 = true;
        }
        this.A00.setEnabled(A1R);
        this.A01.setEnabled(z2);
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(744051207);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.fragment_question_response_bottom_sheet);
        AnonymousClass0fD.A09(1049741300, A022);
        return A0C;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1443696366);
        C15353Ub4.super.onPause();
        A02(this.A03.A07);
        WZE A002 = A00(this.A03.A07);
        if (A002 != null) {
            A002.A08.A0B.release();
        }
        this.A05.A00();
        AnonymousClass0fD.A09(-372693507, A022);
    }
}
