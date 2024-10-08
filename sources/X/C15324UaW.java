package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;
import com.instagram.leadgen.core.api.LeadForm;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;

/* renamed from: X.UaW  reason: case insensitive filesystem */
public final class C15324UaW extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS, X3S {
    public static final String __redex_internal_original_name = "PromoteLeadGenFragment";
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public TextView A04;
    public XIGIGBoostCallToAction A05;
    public WYX A06;
    public WGU A07;
    public C18643Vvl A08;
    public PromoteData A09;
    public LeadForm A0A;
    public Long A0B = C51971G9r.A0m();
    public boolean A0C;
    public boolean A0D;
    public PromoteState A0E;
    public UserSession A0F;
    public IgRadioGroup A0G;
    public boolean A0H;
    public final AnonymousClass0eM A0I;

    public final void Dab(PromoteState promoteState, Integer num) {
        0qQ.A0B(num, 1);
        if (num == AnonymousClass05K.A07) {
            A01(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0033, code lost:
        if (r4.A05 == null) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.2da r5) {
        /*
            r4 = this;
            r0 = 0
            X.0qQ.A0B(r5, r0)
            r0 = 2131970571(0x7f134a0b, float:1.9578097E38)
            r5.Eom(r0)
            X.3JR r2 = X.DbV.A0K()
            r1 = 5
            X.ICx r0 = new X.ICx
            r0.<init>(r4, r1)
            X.DbX.A1A(r0, r2, r5)
            X.Vvl r3 = X.C18643Vvl.A00(r4, r5)
            r4.A08 = r3
            java.lang.Integer r2 = X.AnonymousClass05K.A1F
            r1 = 6
            X.ICx r0 = new X.ICx
            r0.<init>(r4, r1)
            r3.A01(r0, r2)
            X.Vvl r2 = r4.A08
            if (r2 == 0) goto L_0x003a
            com.instagram.leadgen.core.api.LeadForm r0 = r4.A0A
            if (r0 == 0) goto L_0x0035
            com.instagram.api.schemas.XIGIGBoostCallToAction r1 = r4.A05
            r0 = 1
            if (r1 != 0) goto L_0x0036
        L_0x0035:
            r0 = 0
        L_0x0036:
            r2.A02(r0)
            return
        L_0x003a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15324UaW.configureActionBar(X.2da):void");
    }

    public final String getModuleName() {
        return "manage_lead_ads";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = view.requireViewById(R.id.lead_form_list_loading_spinner);
        this.A00 = view.requireViewById(R.id.lead_gen_fragment_content);
        this.A0G = (IgRadioGroup) view.requireViewById(R.id.lead_form_radio_group);
        this.A03 = view.requireViewById(R.id.see_all_row);
        PromoteData promoteData = this.A09;
        if (promoteData == null) {
            0qQ.A0F("promoteData");
            throw AnonymousClass00P.createAndThrow();
        }
        this.A0A = promoteData.A16;
        this.A05 = promoteData.A0d;
        Bundle bundle2 = this.mArguments;
        boolean z2 = false;
        if (bundle2 != null) {
            z = bundle2.getBoolean("is_from_one_tap_onboarding");
        } else {
            z = false;
        }
        this.A0D = z;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            z2 = bundle3.getBoolean("is_profile_visit_secondary_cta");
        }
        this.A0H = z2;
        ((C52990Ggh) this.A0I.getValue()).A01.A06(getViewLifecycleOwner(), new C64320LZv(new C59101J6j(20, (Object) this, (Object) view), 12));
    }

    public static final void A00(C15324UaW uaW) {
        XIGIGBoostCallToAction xIGIGBoostCallToAction;
        LeadForm leadForm = uaW.A0A;
        if (leadForm != null && (xIGIGBoostCallToAction = uaW.A05) != null) {
            PromoteData promoteData = uaW.A09;
            String str = "promoteData";
            if (promoteData != null) {
                promoteData.A16 = leadForm;
                promoteData.A0d = xIGIGBoostCallToAction;
                if (!uaW.A0H) {
                    PromoteState promoteState = uaW.A0E;
                    if (promoteState == null) {
                        str = "promoteState";
                    } else {
                        promoteState.A04(XIGIGBoostDestination.LEAD_GENERATION, promoteData);
                        return;
                    }
                } else {
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        if (r10.A05 == null) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C15324UaW r10) {
        /*
            com.instagram.business.promote.model.PromoteData r0 = r10.A09
            java.lang.String r3 = "promoteData"
            if (r0 == 0) goto L_0x0046
            java.util.List r0 = r0.A1u
            if (r0 == 0) goto L_0x0040
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x0040
            com.instagram.business.promote.model.PromoteData r2 = r10.A09
            if (r2 == 0) goto L_0x0046
            com.instagram.leadgen.core.api.LeadForm r0 = r2.A16
            if (r0 != 0) goto L_0x0040
            java.util.List r0 = r2.A1u
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.instagram.leadgen.core.api.LeadForm r0 = (com.instagram.leadgen.core.api.LeadForm) r0
            r2.A16 = r0
            com.instagram.business.promote.model.PromoteData r0 = r10.A09
            if (r0 == 0) goto L_0x0046
            java.util.List r0 = r0.A1u
            java.lang.Object r0 = r0.get(r1)
            com.instagram.leadgen.core.api.LeadForm r0 = (com.instagram.leadgen.core.api.LeadForm) r0
            r10.A0A = r0
            X.Vvl r2 = r10.A08
            if (r2 == 0) goto L_0x0040
            if (r0 == 0) goto L_0x003c
            com.instagram.api.schemas.XIGIGBoostCallToAction r1 = r10.A05
            r0 = 1
            if (r1 != 0) goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            r2.A02(r0)
        L_0x0040:
            com.instagram.ui.widget.radiogroup.IgRadioGroup r8 = r10.A0G
            if (r8 != 0) goto L_0x004e
            java.lang.String r3 = "formRadioGroup"
        L_0x0046:
            X.0qQ.A0F(r3)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x004e:
            com.instagram.business.promote.model.PromoteData r6 = r10.A09
            if (r6 == 0) goto L_0x0046
            com.instagram.business.promote.model.PromoteState r7 = r10.A0E
            if (r7 != 0) goto L_0x0059
            java.lang.String r3 = "promoteState"
            goto L_0x0046
        L_0x0059:
            androidx.fragment.app.FragmentActivity r4 = r10.requireActivity()
            X.WYX r5 = r10.A06
            if (r5 != 0) goto L_0x0064
            java.lang.String r3 = "leadAdsLogger"
            goto L_0x0046
        L_0x0064:
            java.lang.Long r9 = r10.A0B
            X.VaM r3 = new X.VaM
            r3.<init>(r4, r5, r6, r7, r8, r9)
            com.instagram.common.session.UserSession r6 = r10.getSession()
            com.instagram.ui.widget.radiogroup.IgRadioGroup r2 = r3.A03
            r2.removeAllViews()
            com.instagram.business.promote.model.PromoteData r0 = r3.A02
            com.instagram.leadgen.core.api.LeadForm r8 = r0.A16
            if (r8 == 0) goto L_0x00b2
            androidx.fragment.app.FragmentActivity r1 = r3.A00
            X.U5O r7 = new X.U5O
            r7.<init>(r1)
            java.lang.String r0 = r8.A02
            r7.setPrimaryText((java.lang.CharSequence) r0)
            java.lang.String r0 = X.C18376Vqc.A00(r1, r8)
            r7.setSecondaryText((java.lang.String) r0)
            java.lang.String r0 = r8.A03
            r7.setTag(r0)
            r0 = 2131970404(0x7f134964, float:1.9577758E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r1, r0)
            r5 = 0
            X.ICB r4 = new X.ICB
            r9 = r3
            r4.<init>(r5, r6, r7, r8, r9)
            r7.setActionLabel(r0, r6, r4)
            r1 = 1
            X.Wem r0 = new X.Wem
            r0.<init>(r7, r1)
            r7.A9W(r0)
            r7.setChecked(r1)
            r2.addView(r7)
        L_0x00b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15324UaW.A01(X.UaW):void");
    }

    /* renamed from: A02 */
    public final UserSession getSession() {
        UserSession userSession = this.A0F;
        if (userSession != null) {
            return userSession;
        }
        DbS.A14();
        throw AnonymousClass00P.createAndThrow();
    }

    public C15324UaW() {
        C20690WxM wxM = new C20690WxM(this, 31);
        AnonymousClass0eM A002 = C20690WxM.A00(new C20690WxM(this, 28), 0eO.A02, 29);
        this.A0I = new C227862kA(new C20690WxM(A002, 30), wxM, new C41566AwY(36, (Object) null, A002), new 0Yh(C52990Ggh.class));
    }

    public final boolean onBackPressed() {
        String str;
        A00(this);
        WGU wgu = this.A07;
        if (wgu == null) {
            str = "promoteLogger";
        } else {
            wgu.A0F(C16678UzE.MANAGE_LEAD_ADS, "back_button");
            WYX wyx = this.A06;
            if (wyx == null) {
                str = "leadAdsLogger";
            } else {
                WYX.A01(wyx, this.A0B, "lead_gen_manage_lead_forms", "cancel");
                PromoteData promoteData = this.A09;
                if (promoteData != null) {
                    if (promoteData.A16 != null) {
                        0hq parentFragmentManager = getParentFragmentManager();
                        String A002 = AnonymousClass000.A00(1722);
                        if (parentFragmentManager.A0R(A002) != null) {
                            FragmentActivity requireActivity = requireActivity();
                            PromoteData promoteData2 = this.A09;
                            if (promoteData2 != null) {
                                new C309516Yo(requireActivity, promoteData2.A0y).A0G(A002, 1);
                                return true;
                            }
                        }
                    }
                    DbT.A1I(this);
                    return true;
                }
                0qQ.A0F("promoteData");
                throw AnonymousClass00P.createAndThrow();
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-322266433);
        C15324UaW.super.onCreate(bundle);
        this.A09 = XAI.A00(this);
        this.A0E = XA9.A00(this);
        PromoteData promoteData = this.A09;
        if (promoteData != null) {
            this.A0F = promoteData.A0y;
            this.A07 = WGU.A00(getSession());
            PromoteData promoteData2 = this.A09;
            if (promoteData2 != null) {
                this.A06 = new WYX(promoteData2, this);
                this.A0B = C51972G9s.A0i(C13991Tnr.A0h(getSession()));
                AnonymousClass0fD.A09(-742891648, A022);
                return;
            }
        }
        0qQ.A0F("promoteData");
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2084471165);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_leadgen_view, viewGroup, false);
        AnonymousClass0fD.A09(-768550363, A022);
        return inflate;
    }

    public final void onDestroyView() {
        String str;
        int A022 = AnonymousClass0fD.A02(-1398382421);
        super.onDestroyView();
        WGU wgu = this.A07;
        if (wgu == null) {
            str = "promoteLogger";
        } else {
            PromoteData promoteData = this.A09;
            if (promoteData == null) {
                str = "promoteData";
            } else {
                wgu.A0B(C16678UzE.MANAGE_LEAD_ADS, promoteData);
                AnonymousClass0fD.A09(-1236172875, A022);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
