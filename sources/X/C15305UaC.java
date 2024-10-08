package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;
import com.instagram.leadgen.core.api.LeadForm;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.UaC  reason: case insensitive filesystem */
public final class C15305UaC extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "PromoteLeadGenFormListFragment";
    public RecyclerView A00;
    public WYX A01;
    public WGU A02;
    public PromoteData A03;
    public UserSession A04;
    public Boolean A05;
    public Long A06 = C51971G9r.A0m();
    public boolean A07;
    public boolean A08 = true;
    public boolean A09;
    public C18643Vvl A0A;
    public PromoteState A0B;
    public final AnonymousClass0eM A0C;

    public final void configureActionBar(2da r5) {
        0qQ.A0B(r5, 0);
        C13992Tns.A0r(r5, 2131970397);
        C18643Vvl A002 = C18643Vvl.A00(this, r5);
        this.A0A = A002;
        A002.A01(new C56800ICx(this, 4), AnonymousClass05K.A1F);
        C18643Vvl vvl = this.A0A;
        if (vvl != null) {
            vvl.A02(true);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final String getModuleName() {
        return "promote_lead_gen_form_list";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        AnonymousClass3AR r1;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C13991Tnr.A0w(this);
        this.A08 = true;
        RecyclerView A0K = DbX.A0K(view);
        this.A00 = A0K;
        AnonymousClass3AS r12 = null;
        if (A0K != null) {
            r12 = A0K.A0C;
        }
        if ((r12 instanceof AnonymousClass3AR) && (r1 = (AnonymousClass3AR) r12) != null) {
            r1.A00 = false;
        }
        WGU wgu = this.A02;
        if (wgu == null) {
            str = "promoteLogger";
        } else {
            C13988Tno.A1J(wgu, C16678UzE.LEAD_FORM_LIST);
            WYX wyx = this.A01;
            if (wyx == null) {
                str = "leadAdsLogger";
            } else {
                WYX.A02(wyx, this.A06, "lead_gen_form_list", "form_list_impression");
                ((C52990Ggh) this.A0C.getValue()).A01.A06(getViewLifecycleOwner(), new C64320LZv(new C58728Iwb(this, 49), 11));
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        UserSession userSession = this.A04;
        if (userSession != null) {
            return userSession;
        }
        DbS.A14();
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean onBackPressed() {
        if (this.A07) {
            return false;
        }
        WYX wyx = this.A01;
        if (wyx == null) {
            0qQ.A0F("leadAdsLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        WYX.A01(wyx, this.A06, "lead_gen_form_list", "cancel");
        return false;
    }

    public C15305UaC() {
        C20690WxM wxM = new C20690WxM(this, 23);
        AnonymousClass0eM A002 = C20690WxM.A00(new C20690WxM(this, 20), 0eO.A02, 21);
        this.A0C = new C227862kA(new C20690WxM(A002, 22), wxM, new C41566AwY(34, (Object) null, A002), new 0Yh(C52990Ggh.class));
    }

    public static final void A00(C15305UaC uaC, List list) {
        UA1 ua1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LeadForm leadForm = (LeadForm) it.next();
            PromoteData promoteData = uaC.A03;
            String str = null;
            if (promoteData != null) {
                List list2 = promoteData.A1u;
                0qQ.A06(list2);
                0qQ.A0B(leadForm, 1);
                Iterator it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (0qQ.A0K(((LeadForm) it2.next()).A03, leadForm.A03)) {
                            break;
                        }
                    } else {
                        String str2 = leadForm.A03;
                        PromoteData promoteData2 = uaC.A03;
                        if (promoteData2 != null) {
                            LeadForm leadForm2 = promoteData2.A16;
                            if (leadForm2 != null) {
                                str = leadForm2.A03;
                            }
                            boolean A0K = 0qQ.A0K(str2, str);
                            PromoteData promoteData3 = uaC.A03;
                            if (A0K) {
                                if (promoteData3 != null) {
                                    promoteData3.A1u.add(0, leadForm);
                                    RecyclerView recyclerView = uaC.A00;
                                    if (recyclerView != null && (ua1 = recyclerView.A0A) != null) {
                                        ua1.A00 = 0;
                                    }
                                }
                            } else if (promoteData3 != null) {
                                promoteData3.A1u.add(leadForm);
                            }
                        }
                    }
                }
            }
            0qQ.A0F("promoteData");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-686552328);
        C15305UaC.super.onCreate(bundle);
        this.A03 = XAI.A00(this);
        this.A0B = XA9.A00(this);
        PromoteData promoteData = this.A03;
        String str = "promoteData";
        if (promoteData != null) {
            UserSession userSession = promoteData.A0y;
            this.A04 = userSession;
            if (userSession != null) {
                this.A02 = WGU.A00(userSession);
                PromoteData promoteData2 = this.A03;
                if (promoteData2 != null) {
                    this.A01 = new WYX(promoteData2, this);
                    UserSession userSession2 = this.A04;
                    if (userSession2 != null) {
                        this.A06 = C51972G9s.A0i(C13991Tnr.A0h(userSession2));
                        AnonymousClass0fD.A09(-1698889632, A022);
                        return;
                    }
                }
            }
            str = "session";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(489094401);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_leadgen_form_list, viewGroup, false);
        AnonymousClass0fD.A09(2098659530, A022);
        return inflate;
    }

    public final void onDestroyView() {
        String str;
        int A022 = AnonymousClass0fD.A02(1232160263);
        super.onDestroyView();
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.setAdapter((2Rw) null);
        }
        this.A00 = null;
        WGU wgu = this.A02;
        if (wgu == null) {
            str = "promoteLogger";
        } else {
            PromoteData promoteData = this.A03;
            if (promoteData == null) {
                str = "promoteData";
            } else {
                wgu.A0B(C16678UzE.LEAD_FORM_LIST, promoteData);
                AnonymousClass0fD.A09(-16786096, A022);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
