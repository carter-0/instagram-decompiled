package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.leadgen.core.model.LeadGenConditionalAnswerInfo;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.leadgen.core.model.disqualifyingscreen.LeadGenDisqualifyingScreenData;
import com.instagram.leadgen.core.model.privacypolicy.LeadGenPrivacyPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Vl6  reason: case insensitive filesystem */
public final class C18077Vl6 {
    public final /* synthetic */ C15998Umf A00;

    public final void A02(LeadGenFormBaseQuestion leadGenFormBaseQuestion) {
        0qQ.A0B(leadGenFormBaseQuestion, 0);
        C15998Umf umf = this.A00;
        C18462VsB A002 = C16039UnS.A00(umf);
        String A02 = C15998Umf.A02(umf);
        String A06 = W33.A00.A06(leadGenFormBaseQuestion);
        A002.A00.Cgq(C18462VsB.A00(A002, A02, A06), A002.A01, "lead_gen_multi_step_consumer_questions", "answer_empty", "impression");
    }

    public final void A04(LeadGenFormBaseQuestion leadGenFormBaseQuestion, C20979X7s x7s, boolean z) {
        0qQ.A0B(leadGenFormBaseQuestion, 0);
        C15998Umf umf = this.A00;
        C18462VsB A002 = C16039UnS.A00(umf);
        W33 w33 = W33.A00;
        String A07 = w33.A07(leadGenFormBaseQuestion);
        String A06 = w33.A06(leadGenFormBaseQuestion);
        0qQ.A0B(A07, 0);
        XB6.A00(C18462VsB.A00(A002, A07, A06), A002.A00, A002.A01, "lead_gen_multi_step_consumer_questions", "open_country_picker_click");
        C13992Tns.A0c(C13991Tnr.A06(umf), umf);
        C15262UYc uYc = new C15262UYc();
        0eP r7 = new 0eP("IgSessionManager.SESSION_TOKEN_KEY", C13990Tnq.A0R(umf).A0H.A05);
        0eP r6 = new 0eP(AnonymousClass000.A00(1102), Boolean.valueOf(z));
        uYc.setArguments(DbY.A0C(AnonymousClass000.A00(1107), Boolean.valueOf(C13990Tnq.A0R(umf).A09), r7, r6));
        uYc.A01 = new C74188PqU(49, (Object) leadGenFormBaseQuestion, (Object) x7s, (Object) umf);
        if (C13990Tnq.A0R(umf).A09) {
            uYc.A0B(umf.getParentFragmentManager(), "lead_gen_multi_step_form");
            return;
        }
        C331137Ps A0h = C51971G9r.A0h(0);
        A0h.A02 = R.drawable.instagram_arrow_back_24;
        A0h.A05 = new WBA(umf, 14);
        C331147Pt A003 = A0h.A00();
        C331127Pr r2 = new C331127Pr(C13990Tnq.A0R(umf).A0H);
        r2.A0d = umf.getString(2131964715);
        DbS.A1S(r2, true);
        r2.A03 = 1.0f;
        r2.A06(A003);
        r2.A0T = new C19678Wdg(uYc, 4);
        DbY.A13(umf, uYc, r2);
    }

    public final void A05(LeadGenFormBaseQuestion leadGenFormBaseQuestion, String str, boolean z) {
        LeadGenConditionalAnswerInfo leadGenConditionalAnswerInfo;
        LeadGenFormBaseQuestion leadGenFormBaseQuestion2;
        List list;
        Object obj;
        String str2 = str;
        0qQ.A0B(str2, 1);
        C15998Umf umf = this.A00;
        ViewPager2 viewPager2 = umf.A00;
        if (viewPager2 != null) {
            C16039UnS A0R = C13990Tnq.A0R(umf);
            int i = viewPager2.A00;
            if (!z) {
                A0R.A08 = true;
            }
            LeadGenFormBaseQuestion leadGenFormBaseQuestion3 = leadGenFormBaseQuestion;
            String str3 = leadGenFormBaseQuestion3.A09;
            05G r6 = A0R.A0a;
            C15045UKy A0Q = C13991Tnr.A0Q(r6, i);
            if (!(A0Q == null || (list = A0Q.A08) == null)) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (0qQ.A0K(((LeadGenFormBaseQuestion) obj).A09, str3)) {
                        break;
                    }
                }
                LeadGenFormBaseQuestion leadGenFormBaseQuestion4 = (LeadGenFormBaseQuestion) obj;
                if (leadGenFormBaseQuestion4 != null) {
                    leadGenFormBaseQuestion4.A00 = str2;
                }
            }
            Map map = leadGenFormBaseQuestion3.A0G;
            if ((!map.isEmpty()) && (leadGenConditionalAnswerInfo = (LeadGenConditionalAnswerInfo) map.get(str2)) != null) {
                List list2 = leadGenConditionalAnswerInfo.A00;
                if (!list2.isEmpty()) {
                    Map map2 = leadGenConditionalAnswerInfo.A01;
                    if (!map2.isEmpty()) {
                        int i2 = i + 1;
                        C15045UKy uKy = (C15045UKy) 00k.A0O(JTO.A16(r6), i2);
                        if (uKy != null && (leadGenFormBaseQuestion2 = (LeadGenFormBaseQuestion) 00k.A0O(uKy.A08, 0)) != null) {
                            String str4 = leadGenFormBaseQuestion2.A06;
                            String str5 = leadGenFormBaseQuestion2.A0A;
                            C16595Uxp uxp = leadGenFormBaseQuestion2.A03;
                            String str6 = leadGenFormBaseQuestion2.A09;
                            String str7 = str6;
                            String str8 = str5;
                            String str9 = str4;
                            LeadGenFormBaseQuestion leadGenFormBaseQuestion5 = new LeadGenFormBaseQuestion(uxp, (Integer) null, str9, str8, str7, "", leadGenFormBaseQuestion2.A05, leadGenFormBaseQuestion2.A08, (String) null, (String) null, (String) null, list2, (List) null, (List) null, (List) null, map2, 0, false, true, false, false);
                            List subList = JTO.A16(r6).subList(0, i2);
                            List A1I = AnonymousClass7TE.A1I(leadGenFormBaseQuestion5);
                            C16527UwW uwW = C16527UwW.CONDITIONAL_ANSWER;
                            N4R n4r = uKy.A00;
                            boolean z2 = A0R.A09;
                            List list3 = 0sn.A00;
                            ArrayList A0T = 00k.A0T(new C15045UKy(n4r, (ImageUrl) null, (C15027UKg) null, uwW, (LeadGenDisqualifyingScreenData) null, (LeadGenPrivacyPolicy) null, (String) null, A1I, list3, list3, false, false, z2, false, false, false, false, false, false), subList);
                            if (JTO.A16(r6).size() > i2) {
                                A0T = 00k.A0S(JTO.A16(r6).subList(i + 2, JTO.A16(r6).size()), A0T);
                            }
                            r6.Epw(A0T);
                        }
                    }
                }
            }
        }
    }

    public C18077Vl6(C15998Umf umf) {
        this.A00 = umf;
    }

    public final void A00() {
        C15998Umf umf = this.A00;
        ViewPager2 viewPager2 = umf.A00;
        if (viewPager2 != null) {
            int i = viewPager2.A00;
            C18462VsB A002 = C16039UnS.A00(umf);
            String A01 = C13990Tnq.A0R(umf).A01(i);
            XB6.A00(C18462VsB.A00(A002, A01, (String) null), A002.A00, A002.A01, "lead_gen_multi_step_consumer_questions", "consumer_question_multi_step_page_next_click_error");
        }
    }

    public final void A01() {
        C18462VsB A002 = C16039UnS.A00(this.A00);
        XB6.A00(DbY.A0B("form_id", A002.A02), A002.A00, A002.A01, "lead_gen_multi_step_consumer_questions", "scroll_to_bottom_for_privacy_view");
    }

    public final void A03(LeadGenFormBaseQuestion leadGenFormBaseQuestion) {
        C15998Umf umf = this.A00;
        C18462VsB A002 = C16039UnS.A00(umf);
        String A02 = C15998Umf.A02(umf);
        String A06 = W33.A00.A06(leadGenFormBaseQuestion);
        A002.A00.Cgq(C18462VsB.A00(A002, A02, A06), A002.A01, "lead_gen_multi_step_consumer_questions", "answer_error", "impression");
    }

    public final void A06(boolean z) {
        String str;
        String str2;
        String str3;
        Bundle bundle;
        XB6 xb6;
        String str4;
        String str5;
        C14792U9h u9h;
        String str6;
        String A0z;
        int i;
        Object obj;
        0sn r11;
        C15998Umf umf = this.A00;
        if (z) {
            ViewPager2 viewPager2 = umf.A00;
            if (viewPager2 != null && (u9h = umf.A04) != null) {
                if (viewPager2.A00 < u9h.getItemCount() - 1) {
                    C18462VsB A002 = C16039UnS.A00(umf);
                    XB6.A00(C18462VsB.A00(A002, C13990Tnq.A0R(umf).A01(viewPager2.A00), (String) null), A002.A00, A002.A01, "lead_gen_multi_step_consumer_questions", "consumer_question_multi_step_page_next_click_success");
                    U8P A07 = umf.A07();
                    AnonymousClass7TE.A1Z(new C66164MGb(A07, (AnonymousClass4D7) null, viewPager2.A00, 24), C318116oQ.A00(A07));
                    return;
                }
                boolean z2 = C13990Tnq.A0R(umf).A0E;
                C18462VsB A003 = C16039UnS.A00(umf);
                if (z2) {
                    str2 = "lead_gen_multi_step_consumer_questions";
                    XB6.A00(DbY.A0B("form_id", A003.A02), A003.A00, A003.A01, str2, "continue_button_click");
                    C13992Tns.A0c(C13991Tnr.A06(umf), umf);
                    UZ0 uz0 = new UZ0();
                    0eP r10 = new 0eP("IgSessionManager.SESSION_TOKEN_KEY", C13990Tnq.A0R(umf).A0H.A05);
                    0eP r9 = new 0eP("privacy_policy", C13990Tnq.A0R(umf).A02);
                    0eP r8 = new 0eP("custom_disclaimer", C13990Tnq.A0R(umf).A00);
                    C16039UnS A0R = C13990Tnq.A0R(umf);
                    if (A0R.A0A) {
                        Iterator it = ((Iterable) A0R.A0a.getValue()).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (((C15045UKy) obj).A03 == C16527UwW.CUSTOMER_INFO) {
                                break;
                            }
                        }
                        C15045UKy uKy = (C15045UKy) obj;
                        if (uKy == null || (r11 = uKy.A08) == null) {
                            r11 = 0sn.A00;
                        }
                        Object value = A0R.A0J.A0N.getValue();
                        if (value != null) {
                            r11 = 00k.A0T(value, r11);
                        }
                        str6 = 00k.A0P("\n", "", "", r11, C20745WyI.A00);
                    } else {
                        str6 = "";
                    }
                    uz0.setArguments(Q21.A00(AnonymousClass7TH.A0h("personal_info_to_review", str6, r10, r9, r8)));
                    if (C13990Tnq.A0R(umf).A0A) {
                        i = 2131964731;
                    } else if (C13990Tnq.A0R(umf).A00 != null) {
                        i = 2131964721;
                    } else {
                        A0z = DbV.A0z(umf, C13990Tnq.A0R(umf).A03, 2131964733);
                        0qQ.A0A(A0z);
                        C331127Pr r7 = new C331127Pr(C13990Tnq.A0R(umf).A0H);
                        r7.A0d = A0z;
                        r7.A0T = new C19678Wdg(uz0, 5);
                        r7.A0g = umf.getString(umf.A0A);
                        r7.A0K = new WBG(47, umf, uz0);
                        r7.A1J = true;
                        r7.A0h = umf.getString(2131964732);
                        r7.A0L = new WBA(umf, 17);
                        r7.A1N = true;
                        r7.A0U = new C19686Wdo(umf, 4);
                        DbY.A13(umf, uz0, r7);
                        C18462VsB A004 = C16039UnS.A00(umf);
                        xb6 = A004.A00;
                        str3 = A004.A01;
                        bundle = DbY.A0B("form_id", A004.A02);
                        str = "privacy_policy_bottom_sheet_impression";
                    }
                    A0z = umf.getString(i);
                    0qQ.A0A(A0z);
                    C331127Pr r72 = new C331127Pr(C13990Tnq.A0R(umf).A0H);
                    r72.A0d = A0z;
                    r72.A0T = new C19678Wdg(uz0, 5);
                    r72.A0g = umf.getString(umf.A0A);
                    r72.A0K = new WBG(47, umf, uz0);
                    r72.A1J = true;
                    r72.A0h = umf.getString(2131964732);
                    r72.A0L = new WBA(umf, 17);
                    r72.A1N = true;
                    r72.A0U = new C19686Wdo(umf, 4);
                    DbY.A13(umf, uz0, r72);
                    C18462VsB A0042 = C16039UnS.A00(umf);
                    xb6 = A0042.A00;
                    str3 = A0042.A01;
                    bundle = DbY.A0B("form_id", A0042.A02);
                    str = "privacy_policy_bottom_sheet_impression";
                } else {
                    XB6.A00(DbY.A0B("form_id", A003.A02), A003.A00, A003.A01, "lead_gen_multi_step_consumer_questions", "submit_button_click");
                    C15998Umf.A05(umf, (List) null);
                    return;
                }
            } else {
                return;
            }
        } else {
            LeadGenDisqualifyingScreenData leadGenDisqualifyingScreenData = C13990Tnq.A0R(umf).A01;
            C331127Pr r6 = new C331127Pr(C13990Tnq.A0R(umf).A0H);
            LeadGenDisqualifyingScreenData leadGenDisqualifyingScreenData2 = C13990Tnq.A0R(umf).A01;
            String str7 = null;
            if (leadGenDisqualifyingScreenData2 != null) {
                str4 = leadGenDisqualifyingScreenData2.A02;
            } else {
                str4 = null;
            }
            r6.A0g = str4;
            r6.A1J = true;
            str2 = "lead_gen_disqualifying_bottom_sheet";
            r6.A0K = new WBA(umf, 15);
            r6.A0h = umf.getString(2131960992);
            r6.A1N = true;
            r6.A0L = new WBA(umf, 16);
            r6.A0U = new C19686Wdo(umf, 3);
            C331157Pu A005 = r6.A00();
            FragmentActivity requireActivity = umf.requireActivity();
            if (leadGenDisqualifyingScreenData != null) {
                str5 = leadGenDisqualifyingScreenData.A01;
                str7 = leadGenDisqualifyingScreenData.A00;
            } else {
                str5 = null;
            }
            A005.A02(requireActivity, C15998Umf.A01(umf, str5, str7));
            C18461VsA vsA = C13990Tnq.A0R(umf).A0L;
            String A02 = C15998Umf.A02(umf);
            xb6 = vsA.A00;
            str3 = vsA.A01;
            bundle = C18461VsA.A00(vsA, A02);
            str = C66579MXk.A00(264);
        }
        xb6.Cgq(bundle, str3, str2, str, "impression");
    }
}
