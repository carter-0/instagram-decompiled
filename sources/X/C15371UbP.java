package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.stepperheader.IgdsStepperHeader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.UbP  reason: case insensitive filesystem */
public final class C15371UbP extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "SurveyQuestionFragment";
    public int A00;
    public UserSession A01;
    public C17983VjL A02;
    public C17997VjZ A03;
    public C331157Pu A04;
    public C15257UXr A05;
    public String A06;
    public HashMap A07;
    public IgdsStepperHeader A08;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final boolean isScrolledToTop() {
        return false;
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public static C15371UbP A00(UserSession userSession, C15257UXr uXr, HashMap hashMap, int i) {
        Fragment r3 = new AnonymousClass4DH();
        Bundle A09 = DbY.A09(userSession);
        A09.putSerializable("ARG_CONTEXT_DATA_MAP", hashMap);
        A09.putInt("ARG_QUESTION_INDEX", i);
        try {
            A09.putSerializable("ARG_SERIALIZED_SURVEY_DATA", DDj.A00(uXr));
            r3.setArguments(A09);
            return r3;
        } catch (IOException e) {
            throw new RuntimeException(e);
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
        String str = this.A05.A05;
        str.getClass();
        return str;
    }

    public final AnonymousClass0wW getSession() {
        return this.A01;
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

    public final void onBottomSheetClosed() {
        String str = this.A05.A05;
        str.getClass();
        if (str.equals(AnonymousClass000.A00(683))) {
            UserSession userSession = this.A01;
            String str2 = this.A06;
            String str3 = this.A03.A03.A03;
            str3.getClass();
            HashMap hashMap = this.A07;
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(this, userSession), "instagram_landing_page_quality_survey_exit");
            if (A0e.isSampled() && hashMap != null) {
                VI2.A00(A0e, userSession, str2, hashMap);
                A0e.AAJ("question_id", str3);
                A0e.Cgf();
            }
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
        C42107BHk bHk;
        int A022 = AnonymousClass0fD.A02(1024898942);
        C15371UbP.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = DbX.A0U(this);
        this.A07 = (HashMap) requireArguments.getSerializable("ARG_CONTEXT_DATA_MAP");
        this.A00 = requireArguments.getInt("ARG_QUESTION_INDEX");
        String string = requireArguments.getString("ARG_SERIALIZED_SURVEY_DATA");
        try {
            string.getClass();
            C15257UXr parseFromJson = DDj.parseFromJson(16P.A00(string));
            this.A05 = parseFromJson;
            List list = parseFromJson.A06;
            list.getClass();
            C17371VSy vSy = (C17371VSy) list.get(0);
            String str = vSy.A00;
            str.getClass();
            this.A06 = str;
            vSy.A01.getClass();
            vSy.A01.get(0).getClass();
            C17926ViH viH = (C17926ViH) vSy.A01.get(0);
            C17983VjL vjL = viH.A05;
            if (vjL == null && (bHk = viH.A01) != null) {
                vjL = new C17983VjL(bHk);
                viH.A05 = vjL;
            }
            vjL.getClass();
            this.A02 = vjL;
            this.A03 = vjL.A01(this.A00);
            AnonymousClass0fD.A09(-2119741063, A022);
        } catch (IOException e) {
            RuntimeException runtimeException = new RuntimeException(e);
            AnonymousClass0fD.A09(-891580813, A022);
            throw runtimeException;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1624853661);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.survey_question_bottom_sheet_fragment);
        AnonymousClass0fD.A09(26895136, A022);
        return A0C;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TextView A0G = DbU.A0G(view, R.id.question_title);
        TextView A0G2 = DbU.A0G(view, R.id.question_disclaimer_text);
        A0G.setText(this.A03.A03.A07);
        String str = this.A03.A03.A02;
        if (str == null || str.trim().isEmpty()) {
            A0G2.setVisibility(8);
        } else {
            A0G2.setVisibility(0);
            A0G2.setText(this.A03.A03.A02);
        }
        DbT.A0I(view, R.id.question_answer_recycler_view).setAdapter(new C14801U9w(requireContext(), this, JTO.A15(this.A03.A04)));
        IgdsStepperHeader igdsStepperHeader = (IgdsStepperHeader) view.requireViewById(R.id.stepper_header);
        this.A08 = igdsStepperHeader;
        int i = 1;
        if (this.A00 == 0) {
            i = 0;
        }
        igdsStepperHeader.A03(i, 2, true, true);
        this.A08.A01();
        String str2 = this.A05.A05;
        str2.getClass();
        if (str2.equals(AnonymousClass000.A00(683)) && this.A00 == 0) {
            UserSession userSession = this.A01;
            String str3 = this.A06;
            HashMap hashMap = this.A07;
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(this, userSession), "instagram_landing_page_quality_survey_invitation_impression");
            if (A0e.isSampled() && hashMap != null) {
                VI2.A00(A0e, userSession, str3, hashMap);
                A0e.Cgf();
            }
        }
    }
}
