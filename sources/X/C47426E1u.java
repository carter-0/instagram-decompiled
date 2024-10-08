package X;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.android.R;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.E1u  reason: case insensitive filesystem */
public final class C47426E1u extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "NuxSurveyFragment";
    public LinearLayout A00;
    public C51950G8t A01;
    public ProgressButton A02;
    public List A03;
    public boolean A04 = true;
    public long A05;
    public final AnonymousClass0eM A06 = C227642jf.A02(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public static final void A00(C47426E1u e1u, boolean z) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(DbT.A0X(e1u.A06)), "ig_nux_survey_event");
        if (A0e.isSampled()) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            LinearLayout linearLayout = e1u.A00;
            if (linearLayout != null) {
                0kx r4 = new 0kx(linearLayout);
                while (r4.hasNext()) {
                    View view = (View) r4.next();
                    if (view instanceof IgdsListCell) {
                        IgdsListCell igdsListCell = (IgdsListCell) view;
                        if (igdsListCell.A0H) {
                            DbU.A1X(igdsListCell.getTag(), A1C);
                        }
                    }
                }
            }
            A0e.AAJ("survey_id", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            A0e.AAJ("question_id", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            A0e.AAJ(AnonymousClass000.A00(5160), e1u.getString(2131968729));
            List list = e1u.A03;
            if (list == null) {
                0qQ.A0F("surveyOptions");
                throw AnonymousClass00P.createAndThrow();
            }
            A0e.AAe("answer_options_array", list);
            A0e.A9F(TraceFieldType.StartTime, Long.valueOf(e1u.A05));
            A0e.A9F("end_time", Long.valueOf(System.currentTimeMillis()));
            A0e.AAe("user_answers_array", A1C);
            A0e.A7p("user_skipped", Boolean.valueOf(z));
            A0e.AAJ("screen_name", __redex_internal_original_name);
            A0e.Cgf();
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1776537817);
        this.A01 = C49047EoR.A00(this);
        this.A03 = 0sr.A1P(new String[]{getString(2131974827), getString(2131974828), getString(2131974829), getString(2131974830), getString(2131974831), getString(2131974832), getString(2131974833), getString(2131974834)});
        C47426E1u.super.onCreate(bundle);
        AnonymousClass0fD.A09(-940042679, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1495759243);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.nux_survey_fragment, viewGroup, false);
        AnonymousClass0eM r4 = this.A06;
        this.A04 = 182.A06(0Tu.A05, DbT.A0X(r4), 36330217823814158L);
        0qQ.A0A(inflate);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass7TF.A0F(inflate, R.id.nux_survey_title);
        igdsHeadline.setHeadline(2131968729);
        if (this.A04) {
            igdsHeadline.setBody(2131968728);
        } else {
            igdsHeadline.setBody((CharSequence) null);
        }
        this.A00 = (LinearLayout) inflate.requireViewById(R.id.options_container);
        List list = this.A03;
        if (list != null) {
            int size = list.size();
            int i = 0;
            while (i < size) {
                List list2 = this.A03;
                if (list2 != null) {
                    String str = (String) 00k.A0O(list2, i);
                    if (!(str == null || str.length() == 0)) {
                        IgdsListCell igdsListCell = new IgdsListCell(requireContext(), (AttributeSet) null);
                        igdsListCell.A0I(str);
                        igdsListCell.setTag(002.A0O("option", i));
                        if (this.A04) {
                            igdsListCell.setTextCellType(C69349Njo.TYPE_CHECKBOX);
                            igdsListCell.setCheckBoxAlignmentContrib(C69258NiK.START);
                        } else {
                            igdsListCell.setTextCellType(C69349Njo.TYPE_RADIO);
                        }
                        igdsListCell.A0C(new FPH(38, (Object) igdsListCell, (Object) this, (Object) igdsListCell));
                        LinearLayout linearLayout = this.A00;
                        if (linearLayout != null) {
                            linearLayout.addView(igdsListCell);
                        }
                    }
                    i++;
                }
            }
            ProgressButton A0O = Dba.A0O(inflate);
            FPD.A00(A0O, 30, this);
            this.A02 = A0O;
            FPD.A00(AnonymousClass7TF.A0G(inflate, R.id.skip_button), 31, this);
            C49938FFr.A01(DbT.A0X(r4), "nux_uxr_survey");
            this.A05 = System.currentTimeMillis();
            AnonymousClass0fD.A09(-1376168241, A022);
            return inflate;
        }
        0qQ.A0F("surveyOptions");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1250085247);
        super.onDestroyView();
        this.A00 = null;
        this.A02 = null;
        AnonymousClass0fD.A09(-123610608, A022);
    }
}
