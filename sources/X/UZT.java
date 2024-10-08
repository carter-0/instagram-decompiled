package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.api.schemas.AdvantageAudienceData;
import com.instagram.api.schemas.TargetingRelaxationConstants;
import com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus;
import com.instagram.business.promote.model.AudienceGender;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.checkbox.IgdsCheckBox;
import com.instagram.ui.widget.rangeseekbar.RangeSeekBar;
import java.util.ArrayList;
import java.util.List;

public final class UZT extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "PromoteAgeGenderFragmentV2";
    public int A00 = 65;
    public int A01 = 13;
    public C18620VvD A02;
    public IgTextView A03;
    public IgTextView A04;
    public IgdsCheckBox A05;
    public IgdsCheckBox A06;
    public C21001X8y A07;
    public RangeSeekBar A08;
    public C18643Vvl A09;
    public final AnonymousClass0eM A0A = C20703Wxa.A00(this, 48);
    public final AnonymousClass0eM A0B = C227642jf.A02(this);
    public final AnonymousClass0eM A0C = new C227862kA(new C20703Wxa(this, 49), new C20694WxQ(this, 0), new C41566AwY(13, (Object) null, this), new 0Yh(U92.class));

    public final void configureActionBar(2da r5) {
        0qQ.A0B(r5, 0);
        r5.Eom(2131970186);
        Dbc.A0k(r5);
        C18643Vvl A002 = C18643Vvl.A00(this, r5);
        this.A09 = A002;
        A002.A01(new C18887WAz(this, 53), AnonymousClass05K.A1F);
        C18643Vvl vvl = this.A09;
        if (vvl == null) {
            0qQ.A0F("actionBarController");
            throw AnonymousClass00P.createAndThrow();
        } else {
            vvl.A02(true);
        }
    }

    public final String getModuleName() {
        return "promote_age_gender";
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.07Z, X.UZT, androidx.fragment.app.Fragment, java.lang.Object, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        Integer BT2;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsCheckBox igdsCheckBox = (IgdsCheckBox) view.findViewById(R.id.male_gender_option);
        XFBTargetingAutomationAdvantageAudienceStatus xFBTargetingAutomationAdvantageAudienceStatus = null;
        if (igdsCheckBox != null) {
            View A0G = AnonymousClass7TF.A0G(view, R.id.male_gender_row);
            igdsCheckBox.setButtonDrawable((Drawable) null);
            WBH.A01(A0G, 36, igdsCheckBox, this);
        } else {
            igdsCheckBox = null;
        }
        this.A06 = igdsCheckBox;
        IgdsCheckBox igdsCheckBox2 = (IgdsCheckBox) view.findViewById(R.id.female_gender_option);
        if (igdsCheckBox2 != null) {
            View A0G2 = AnonymousClass7TF.A0G(view, R.id.female_gender_row);
            igdsCheckBox2.setButtonDrawable((Drawable) null);
            WBH.A01(A0G2, 36, igdsCheckBox2, this);
        } else {
            igdsCheckBox2 = null;
        }
        this.A05 = igdsCheckBox2;
        this.A08 = (RangeSeekBar) view.findViewById(R.id.age_range_seekbar);
        this.A04 = DbT.A0a(view, R.id.age_min_text);
        this.A03 = DbT.A0a(view, R.id.age_max_text);
        AnonymousClass0eM r4 = this.A0C;
        float A002 = (float) W3x.A00(((U92) r4.getValue()).A00, 13);
        AdvantageAudienceData advantageAudienceData = U92.A00(r4).A02;
        if (!(advantageAudienceData == null || (BT2 = advantageAudienceData.BT2()) == null)) {
            int intValue = BT2.intValue();
            AdvantageAudienceData advantageAudienceData2 = U92.A00(r4).A02;
            if (advantageAudienceData2 != null) {
                xFBTargetingAutomationAdvantageAudienceStatus = advantageAudienceData2.Aa9();
            }
            if (xFBTargetingAutomationAdvantageAudienceStatus == XFBTargetingAutomationAdvantageAudienceStatus.ON) {
                A002 = (float) intValue;
            }
        }
        RangeSeekBar rangeSeekBar = this.A08;
        if (rangeSeekBar != null) {
            rangeSeekBar.A04 = 3;
            rangeSeekBar.A02(A002, 65.0f);
        }
        IgdsCheckBox igdsCheckBox3 = this.A06;
        if (igdsCheckBox3 != null) {
            igdsCheckBox3.setChecked(false);
        }
        IgdsCheckBox igdsCheckBox4 = this.A05;
        if (igdsCheckBox4 != null) {
            igdsCheckBox4.setChecked(false);
        }
        C15053ULv A003 = U92.A00(r4);
        List list = A003.A06;
        if (list != null) {
            IgdsCheckBox igdsCheckBox5 = this.A06;
            if (igdsCheckBox5 != null) {
                igdsCheckBox5.setChecked(list.contains(AudienceGender.MALE));
            }
            IgdsCheckBox igdsCheckBox6 = this.A05;
            if (igdsCheckBox6 != null) {
                igdsCheckBox6.setChecked(list.contains(AudienceGender.FEMALE));
            }
        }
        int A004 = W3x.A00(((U92) r4.getValue()).A00, A003.A01);
        this.A01 = A004;
        int i = A003.A00;
        this.A00 = i;
        RangeSeekBar rangeSeekBar2 = this.A08;
        if (rangeSeekBar2 != null) {
            rangeSeekBar2.setStartingRangeValue((float) A004);
            rangeSeekBar2.setEndingRangeValue((float) i);
        }
        IgTextView igTextView = this.A04;
        if (igTextView != null) {
            C13988Tno.A15(igTextView, this.A01);
        }
        IgTextView igTextView2 = this.A03;
        if (igTextView2 != null) {
            C13988Tno.A15(igTextView2, this.A00);
        }
        this.A07 = new C19759Wf0(this);
        WBX.A00(view, 4, this);
        RangeSeekBar rangeSeekBar3 = this.A08;
        if (rangeSeekBar3 != null) {
            rangeSeekBar3.A06 = new C19756Wex(this);
        }
        View findViewById = view.findViewById(R.id.audience_potential_reach_view);
        if (findViewById != null) {
            this.A02 = new C18620VvD(AnonymousClass7TE.A0l(this.A0B), getActivity(), findViewById);
        }
        MG7.A01(this, AnonymousClass07a.A00(this), 2);
        A01(this);
        C13988Tno.A1J(C13990Tnq.A0M(this.A0A), C16678UzE.AGE_AND_GENDER_SELECTION);
    }

    public static final ImmutableList A00(UZT uzt) {
        ArrayList arrayList = new ArrayList();
        IgdsCheckBox igdsCheckBox = uzt.A06;
        if (igdsCheckBox != null && igdsCheckBox.isChecked()) {
            arrayList.add(AudienceGender.MALE);
        }
        IgdsCheckBox igdsCheckBox2 = uzt.A05;
        if (igdsCheckBox2 != null && igdsCheckBox2.isChecked()) {
            arrayList.add(AudienceGender.FEMALE);
        }
        return DbU.A0K(arrayList);
    }

    public static final void A01(UZT uzt) {
        AnonymousClass0eM r0 = uzt.A0C;
        ((U92) r0.getValue()).A0E(C15053ULv.A00((AdvantageAudienceData) null, (TargetingRelaxationConstants) null, U92.A00(r0), (String) null, 00k.A0U(A00(uzt)), (List) null, (List) null, uzt.A01, uzt.A00, 995, false));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0B);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1021510607);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_age_gender_main_view, viewGroup, false);
        AnonymousClass0fD.A09(1221384828, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(2084997693);
        super.onDestroyView();
        this.A08 = null;
        this.A06 = null;
        this.A05 = null;
        this.A04 = null;
        this.A03 = null;
        C18620VvD vvD = this.A02;
        if (vvD != null) {
            vvD.A01();
        }
        this.A02 = null;
        AnonymousClass0fD.A09(1939065852, A022);
    }
}
