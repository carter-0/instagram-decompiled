package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.business.promote.model.AudienceGender;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.checkbox.IgdsCheckBox;
import com.instagram.ui.widget.rangeseekbar.RangeSeekBar;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.UZf  reason: case insensitive filesystem */
public final class C15277UZf extends AnonymousClass4DH implements AnonymousClass4DS, X3S {
    public static final String __redex_internal_original_name = "PromoteAgeGenderFragment";
    public int A00 = 65;
    public int A01 = 13;
    public WGU A02;
    public PromoteData A03;
    public PromoteState A04;
    public UserSession A05;
    public IgTextView A06;
    public IgTextView A07;
    public IgdsCheckBox A08;
    public IgdsCheckBox A09;
    public C21001X8y A0A;
    public RangeSeekBar A0B;
    public List A0C;
    public C18784W1k A0D;
    public C18643Vvl A0E;
    public C18761Vzw A0F;

    public final void Dab(PromoteState promoteState, Integer num) {
    }

    public final void configureActionBar(2da r5) {
        0qQ.A0B(r5, 0);
        r5.Eom(2131970186);
        Dbc.A0k(r5);
        C18643Vvl A002 = C18643Vvl.A00(this, r5);
        this.A0E = A002;
        A002.A01(new C18887WAz(this, 52), AnonymousClass05K.A1F);
        C18643Vvl vvl = this.A0E;
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

    public final void onAttach(Context context) {
        String str;
        0qQ.A0B(context, 0);
        C15277UZf.super.onAttach(context);
        this.A03 = ((XAI) context).Bhh();
        PromoteState Bhj = ((XA9) context).Bhj();
        this.A04 = Bhj;
        Bhj.A0A(this);
        PromoteData promoteData = this.A03;
        if (promoteData == null) {
            str = "promoteData";
        } else {
            UserSession userSession = promoteData.A0y;
            this.A05 = userSession;
            if (userSession != null) {
                this.A0D = C18784W1k.A01(this, userSession);
                ((BaseFragmentActivity) context).A0a();
                UserSession userSession2 = this.A05;
                if (userSession2 != null) {
                    this.A02 = WGU.A00(userSession2);
                    return;
                }
            }
            str = "session";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00bd, code lost:
        if (r1.contains(com.instagram.business.promote.model.AudienceGender.MALE) != true) goto L_0x00bf;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r10, android.os.Bundle r11) {
        /*
            r9 = this;
            r0 = 0
            X.0qQ.A0B(r10, r0)
            super.onViewCreated(r10, r11)
            r0 = 2131435813(0x7f0b2125, float:1.8493479E38)
            android.view.View r0 = r10.requireViewById(r0)
            com.instagram.igds.components.checkbox.IgdsCheckBox r0 = (com.instagram.igds.components.checkbox.IgdsCheckBox) r0
            r9.A09 = r0
            r0 = 2131432817(0x7f0b1571, float:1.8487402E38)
            android.view.View r0 = r10.requireViewById(r0)
            com.instagram.igds.components.checkbox.IgdsCheckBox r0 = (com.instagram.igds.components.checkbox.IgdsCheckBox) r0
            r9.A08 = r0
            com.instagram.igds.components.checkbox.IgdsCheckBox r1 = r9.A09
            java.lang.String r4 = "maleCheckable"
            r3 = 0
            if (r1 == 0) goto L_0x015e
            r0 = 2131435814(0x7f0b2126, float:1.849348E38)
            android.view.View r0 = X.AnonymousClass7TF.A0G(r10, r0)
            r1.setButtonDrawable(r3)
            r2 = 35
            X.WBH.A01(r0, r2, r1, r9)
            com.instagram.igds.components.checkbox.IgdsCheckBox r1 = r9.A08
            java.lang.String r8 = "femaleCheckable"
            if (r1 == 0) goto L_0x015a
            r0 = 2131432818(0x7f0b1572, float:1.8487404E38)
            android.view.View r0 = X.AnonymousClass7TF.A0G(r10, r0)
            r1.setButtonDrawable(r3)
            X.WBH.A01(r0, r2, r1, r9)
            r0 = 2131427853(0x7f0b020d, float:1.8477334E38)
            android.view.View r0 = r10.requireViewById(r0)
            com.instagram.ui.widget.rangeseekbar.RangeSeekBar r0 = (com.instagram.ui.widget.rangeseekbar.RangeSeekBar) r0
            r9.A0B = r0
            r0 = 2131427852(0x7f0b020c, float:1.8477332E38)
            com.instagram.common.ui.base.IgTextView r0 = X.DbT.A0a(r10, r0)
            r9.A07 = r0
            r0 = 2131427851(0x7f0b020b, float:1.847733E38)
            com.instagram.common.ui.base.IgTextView r0 = X.DbT.A0a(r10, r0)
            r9.A06 = r0
            com.instagram.business.promote.model.PromoteData r0 = r9.A03
            java.lang.String r7 = "promoteData"
            if (r0 == 0) goto L_0x00fa
            com.instagram.business.promote.model.PromoteAudienceInfo r5 = r0.A0q
            r1 = 13
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r0.A0i
            int r0 = X.W3x.A00(r0, r1)
            float r2 = (float) r0
            com.instagram.api.schemas.AdvantageAudienceData r0 = r5.A02
            if (r0 == 0) goto L_0x0157
            java.lang.Integer r1 = r0.BT2()
        L_0x007c:
            com.instagram.business.promote.model.PromoteData r0 = r9.A03
            if (r0 == 0) goto L_0x00fa
            com.instagram.business.promote.model.PromoteAudienceInfo r0 = r0.A0q
            com.instagram.api.schemas.AdvantageAudienceData r0 = r0.A02
            if (r0 == 0) goto L_0x008a
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r3 = r0.Aa9()
        L_0x008a:
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r0 = com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus.ON
            if (r3 != r0) goto L_0x0095
            if (r1 == 0) goto L_0x0095
            int r0 = r1.intValue()
            float r2 = (float) r0
        L_0x0095:
            com.instagram.ui.widget.rangeseekbar.RangeSeekBar r1 = r9.A0B
            java.lang.String r6 = "ageRangeSeekBar"
            if (r1 == 0) goto L_0x0153
            r3 = 3
            r1.A04 = r3
            r0 = 1115815936(0x42820000, float:65.0)
            r1.A02(r2, r0)
            java.util.List r1 = r5.A06
            r9.A0C = r1
            if (r1 != 0) goto L_0x00af
            com.instagram.business.promote.model.PromoteAudienceInfo r0 = com.instagram.business.promote.model.PromoteAudienceInfo.A09
            java.util.List r1 = r0.A06
            r9.A0C = r1
        L_0x00af:
            com.instagram.igds.components.checkbox.IgdsCheckBox r2 = r9.A09
            if (r2 == 0) goto L_0x015e
            r4 = 1
            if (r1 == 0) goto L_0x00bf
            com.instagram.business.promote.model.AudienceGender r0 = com.instagram.business.promote.model.AudienceGender.MALE
            boolean r1 = r1.contains(r0)
            r0 = 1
            if (r1 == r4) goto L_0x00c0
        L_0x00bf:
            r0 = 0
        L_0x00c0:
            r2.setChecked(r0)
            com.instagram.igds.components.checkbox.IgdsCheckBox r2 = r9.A08
            if (r2 == 0) goto L_0x015a
            java.util.List r1 = r9.A0C
            if (r1 == 0) goto L_0x0151
            com.instagram.business.promote.model.AudienceGender r0 = com.instagram.business.promote.model.AudienceGender.FEMALE
            boolean r0 = r1.contains(r0)
            if (r0 != r4) goto L_0x0151
        L_0x00d3:
            r2.setChecked(r4)
            int r1 = r5.A01
            com.instagram.business.promote.model.PromoteData r0 = r9.A03
            if (r0 == 0) goto L_0x00fa
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r0.A0i
            int r1 = X.W3x.A00(r0, r1)
            r9.A01 = r1
            int r0 = r5.A00
            r9.A00 = r0
            com.instagram.ui.widget.rangeseekbar.RangeSeekBar r2 = r9.A0B
            if (r2 == 0) goto L_0x0153
            float r1 = (float) r1
            float r0 = (float) r0
            r2.setStartingRangeValue(r1)
            r2.setEndingRangeValue(r0)
            com.instagram.common.ui.base.IgTextView r1 = r9.A07
            if (r1 != 0) goto L_0x0102
            java.lang.String r7 = "ageMinText"
        L_0x00fa:
            X.0qQ.A0F(r7)
        L_0x00fd:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0102:
            int r0 = r9.A01
            X.C13988Tno.A15(r1, r0)
            com.instagram.common.ui.base.IgTextView r1 = r9.A06
            if (r1 != 0) goto L_0x010e
            java.lang.String r7 = "ageMaxText"
            goto L_0x00fa
        L_0x010e:
            int r0 = r9.A00
            X.C13988Tno.A15(r1, r0)
            X.Wez r0 = new X.Wez
            r0.<init>(r9)
            r9.A0A = r0
            X.WBX.A00(r10, r3, r9)
            com.instagram.ui.widget.rangeseekbar.RangeSeekBar r1 = r9.A0B
            if (r1 == 0) goto L_0x0153
            X.Wew r0 = new X.Wew
            r0.<init>(r9)
            r1.A06 = r0
            X.UzE r3 = X.C16678UzE.AGE_AND_GENDER_SELECTION
            r0 = 2131428240(0x7f0b0390, float:1.8478119E38)
            android.view.View r1 = X.AnonymousClass7TE.A0b(r10, r0)
            androidx.fragment.app.FragmentActivity r2 = r9.requireActivity()
            com.instagram.business.promote.model.PromoteData r5 = r9.A03
            if (r5 == 0) goto L_0x00fa
            X.W1k r4 = r9.A0D
            if (r4 != 0) goto L_0x0140
            java.lang.String r7 = "dataFetcher"
            goto L_0x00fa
        L_0x0140:
            X.Vzw r0 = new X.Vzw
            r0.<init>(r1, r2, r3, r4, r5)
            r9.A0F = r0
            A01(r9)
            X.WGU r0 = r9.A02
            if (r0 != 0) goto L_0x0162
            java.lang.String r7 = "promoteLogger"
            goto L_0x00fa
        L_0x0151:
            r4 = 0
            goto L_0x00d3
        L_0x0153:
            X.0qQ.A0F(r6)
            goto L_0x00fd
        L_0x0157:
            r1 = r3
            goto L_0x007c
        L_0x015a:
            X.0qQ.A0F(r8)
            goto L_0x00fd
        L_0x015e:
            X.0qQ.A0F(r4)
            goto L_0x00fd
        L_0x0162:
            X.C13988Tno.A1J(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15277UZf.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final ImmutableList A00(C15277UZf uZf) {
        String str;
        ArrayList arrayList = new ArrayList();
        IgdsCheckBox igdsCheckBox = uZf.A09;
        if (igdsCheckBox == null) {
            str = "maleCheckable";
        } else {
            if (igdsCheckBox.isChecked()) {
                arrayList.add(AudienceGender.MALE);
            }
            IgdsCheckBox igdsCheckBox2 = uZf.A08;
            if (igdsCheckBox2 == null) {
                str = "femaleCheckable";
            } else {
                if (igdsCheckBox2.isChecked()) {
                    arrayList.add(AudienceGender.FEMALE);
                }
                return DbU.A0K(arrayList);
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A01(C15277UZf uZf) {
        String str;
        C18761Vzw vzw = uZf.A0F;
        if (vzw == null) {
            str = "audiencePotentialReachController";
        } else {
            PromoteData promoteData = uZf.A03;
            if (promoteData == null) {
                str = "promoteData";
            } else {
                C18578VuU A012 = C18167Vmh.A01(promoteData);
                A012.A01 = uZf.A01;
                A012.A00 = uZf.A00;
                A012.A06 = 00k.A0U(A00(uZf));
                vzw.A02(A012.A01());
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        UserSession userSession = this.A05;
        if (userSession != null) {
            return userSession;
        }
        DbS.A14();
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1708360662);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_age_gender_main_view, viewGroup, false);
        AnonymousClass0fD.A09(-460178680, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-115834760);
        super.onDestroyView();
        C18761Vzw vzw = this.A0F;
        if (vzw == null) {
            0qQ.A0F("audiencePotentialReachController");
            throw AnonymousClass00P.createAndThrow();
        }
        vzw.A0A.A00();
        vzw.A00 = C18598Vup.A01;
        AnonymousClass0fD.A09(359690573, A022);
    }
}
