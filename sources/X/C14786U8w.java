package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;
import com.instagram.leadgen.core.api.LeadForm;
import com.instagram.leadgen.core.api.LeadGenInfoFieldData;
import com.instagram.leadgen.core.api.LeadGenInfoFieldTypes;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.leadgen.organic.model.LeadGenFormData;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.U8w  reason: case insensitive filesystem */
public abstract class C14786U8w extends 2YL {
    public final 2Fk A00;
    public final C59732JVq A01 = new C59732JVq(7, 6, false, false);
    public final C249513ju A02;
    public final AnonymousClass0r6 A03;
    public final 05G A04;
    public final 05G A05;
    public final 05G A06;
    public final 05G A07;
    public final C18059Vki A08;

    public final void A0A(Context context, C16534Uwe uwe, int i, boolean z) {
        String str;
        String str2;
        if (!DbX.A1b(this.A06)) {
            C16534Uwe uwe2 = uwe;
            if (z) {
                if (this instanceof C16045UnY) {
                    C16045UnY unY = (C16045UnY) this;
                    if (uwe.ordinal() != 0) {
                        str2 = "add_custom_multiple_choice_question";
                    } else {
                        str2 = "add_custom_short_answer_question";
                    }
                    WYZ.A02(unY.A02, unY.A05, "lead_gen_create_form", str2, A00(unY));
                } else {
                    C16046UnZ unZ = (C16046UnZ) this;
                    if (uwe.ordinal() != 0) {
                        str = "add_custom_multiple_choice_question";
                    } else {
                        str = "add_custom_short_answer_question";
                    }
                    WYX.A01(unZ.A00, unZ.A04, "lead_gen_create_form", str);
                }
            }
            A09(context);
            AnonymousClass7TE.A1Z(new JTZ(this, uwe2, (AnonymousClass4D7) null, i, 15), C318116oQ.A00(this));
        }
    }

    public static String A00(C16045UnY unY) {
        String str = unY.A06;
        0qQ.A0B(str, 1);
        return str;
    }

    public final int A01() {
        if (this instanceof C16045UnY) {
            return ((C16045UnY) this).A04.A06.size();
        }
        return ((C16046UnZ) this).A02.A1t.size();
    }

    public final UserSession A02() {
        if (this instanceof C16045UnY) {
            return ((C16045UnY) this).A00;
        }
        return ((C16046UnZ) this).A03;
    }

    public final String A03() {
        if (this instanceof C16045UnY) {
            return ((C16045UnY) this).A04.A05;
        }
        String str = ((C16046UnZ) this).A02.A1O;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final void A04() {
        if (this instanceof C16045UnY) {
            LeadGenFormData leadGenFormData = ((C16045UnY) this).A04;
            leadGenFormData.A05 = "";
            leadGenFormData.A02 = null;
            leadGenFormData.A00 = null;
            leadGenFormData.A07 = false;
            leadGenFormData.A09 = false;
            leadGenFormData.A0A = false;
            leadGenFormData.A00("");
            leadGenFormData.A06.clear();
            return;
        }
        PromoteData promoteData = ((C16046UnZ) this).A02;
        promoteData.A1t.clear();
        promoteData.A1s.clear();
        promoteData.A1O = null;
        promoteData.A1M = null;
        promoteData.A0z = null;
        promoteData.A1N = null;
    }

    public final void A05() {
        if (this instanceof C16045UnY) {
            C16045UnY unY = (C16045UnY) this;
            C59732JVq jVq = unY.A01;
            LeadGenFormData leadGenFormData = unY.A04;
            jVq.A01 = leadGenFormData.A09;
            jVq.A00 = leadGenFormData.A07;
            jVq.A02 = leadGenFormData.A0A;
            return;
        }
        C16046UnZ unZ = (C16046UnZ) this;
        C59732JVq jVq2 = unZ.A01;
        jVq2.A00 = false;
        jVq2.A01 = false;
        jVq2.A02 = false;
        List<GSY> list = unZ.A02.A1s;
        0qQ.A06(list);
        for (GSY gsy : list) {
            W33.A04(jVq2, (LeadGenInfoFieldTypes) gsy.A01, true);
        }
    }

    public final void A06() {
        if (this instanceof C16045UnY) {
            C16045UnY unY = (C16045UnY) this;
            unY.A02.A07(unY.A05, unY.A06, false);
            return;
        }
        C16046UnZ unZ = (C16046UnZ) this;
        WYX wyx = unZ.A00;
        Long l = unZ.A04;
        String str = unZ.A06;
        0qQ.A0B(str, 1);
        WYX.A00(wyx, l, str, "create_form_mutation", RealtimeConstants.SEND_FAIL).Cgf();
    }

    public final void A07() {
        if (this instanceof C16045UnY) {
            C16045UnY unY = (C16045UnY) this;
            unY.A02.A07(unY.A05, unY.A06, true);
            return;
        }
        C16046UnZ unZ = (C16046UnZ) this;
        WYX wyx = unZ.A00;
        Long l = unZ.A04;
        String str = unZ.A06;
        0qQ.A0B(str, 1);
        WYX.A00(wyx, l, str, "create_form_mutation", RealtimeConstants.SEND_SUCCESS).Cgf();
    }

    public final void A08() {
        if (this instanceof C16045UnY) {
            C16045UnY unY = (C16045UnY) this;
            WYZ.A02(unY.A02, unY.A05, "lead_gen_create_form", "require_welcome_message_error", A00(unY));
            return;
        }
        C16046UnZ unZ = (C16046UnZ) this;
        WYX.A01(unZ.A00, unZ.A04, "lead_gen_create_form", "require_welcome_message_error");
    }

    public final void A09(Context context) {
        if (this instanceof C16045UnY) {
            C16045UnY unY = (C16045UnY) this;
            LeadGenFormData leadGenFormData = unY.A04;
            C59732JVq jVq = unY.A01;
            leadGenFormData.A09 = jVq.A01;
            leadGenFormData.A07 = jVq.A00;
            leadGenFormData.A0A = jVq.A02;
            return;
        }
        C16046UnZ unZ = (C16046UnZ) this;
        PromoteData promoteData = unZ.A02;
        ArrayList A1M = 0sr.A1M(new GSY[]{VEP.A00(context, C16604Uxy.A05)});
        C59732JVq jVq2 = unZ.A01;
        if (jVq2.A01) {
            A1M.add(VEP.A00(context, C16604Uxy.A06));
        }
        if (jVq2.A00) {
            A1M.add(VEP.A00(context, C16604Uxy.A04));
        }
        if (jVq2.A02) {
            A1M.add(VEP.A00(context, C16604Uxy.A07));
        }
        List list = promoteData.A1t;
        0qQ.A06(list);
        A1M.addAll(list);
        promoteData.A1s = A1M;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ab, code lost:
        if (r12 == null) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (r7.A03 == X.C16602Uxw.A06) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(android.content.Context r22, java.lang.String r23, boolean r24) {
        /*
            r21 = this;
            r0 = r21
            r7 = r0
            boolean r2 = r0 instanceof X.C16045UnY
            r1 = r22
            if (r2 == 0) goto L_0x0071
            X.UnY r7 = (X.C16045UnY) r7
            com.instagram.common.session.UserSession r2 = r7.A00
            com.instagram.user.model.User r4 = X.AnonymousClass7TF.A0Q(r2)
            com.instagram.leadgen.organic.model.LeadGenFormData r8 = r7.A04
            java.lang.String r15 = X.W3L.A02(r1, r8)
            boolean r2 = r7.A07
            if (r2 == 0) goto L_0x0022
            X.Uxw r3 = r7.A03
            X.Uxw r2 = X.C16602Uxw.A06
            r6 = 1
            if (r3 != r2) goto L_0x0023
        L_0x0022:
            r6 = 0
        L_0x0023:
            X.4Cl r2 = r4.A03
            java.lang.String r12 = r2.BaE()
            if (r12 != 0) goto L_0x002d
            java.lang.String r12 = ""
        L_0x002d:
            java.lang.String r13 = r8.A03
            java.lang.String r5 = r8.A04
            java.lang.String r4 = r8.A05
            java.lang.String r3 = r8.A02
            X.Uxw r2 = r7.A03
            com.instagram.api.schemas.LeadGenEntryPoint r11 = r2.A01
            r20 = r6 ^ 1
            r19 = 0
            java.lang.String r16 = ""
            X.UKn r10 = new X.UKn
            r14 = r5
            r17 = r4
            r18 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x0049:
            X.Vki r2 = r0.A08
            java.lang.String r4 = r10.A02
            java.lang.String r5 = r10.A05
            java.lang.String r6 = r10.A06
            java.lang.String r7 = r10.A01
            java.lang.String r8 = r10.A07
            java.lang.String r9 = r10.A03
            com.instagram.api.schemas.LeadGenEntryPoint r3 = r10.A00
            boolean r13 = r10.A08
            java.lang.String r11 = r10.A04
            r10 = r23
            r12 = r24
            X.MCA r5 = r2.A01(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r4 = 0
            r3 = 31
            X.MfO r2 = new X.MfO
            r2.<init>(r0, r1, r4, r3)
            X.DbY.A19(r0, r2, r5)
            return
        L_0x0071:
            X.UnZ r7 = (X.C16046UnZ) r7
            X.W1k r8 = r7.A01
            if (r8 == 0) goto L_0x00ad
            X.UzE r2 = X.C16678UzE.CREATE_LEAD_FORM
            java.lang.String r6 = r2.toString()
            java.lang.String r5 = "create_lead_form_button"
            com.instagram.common.session.UserSession r4 = r8.A08
            X.9F4 r2 = X.AnonymousClass9F3.A00(r4)
            X.9F7 r3 = X.AnonymousClass9F4.A00(r2)
            X.9JK r2 = X.C18784W1k.A00(r8, r6, r5)
            java.lang.Object r2 = r3.Au3(r2)
            X.Dfh r2 = (X.C46478Dfh) r2
            if (r2 == 0) goto L_0x0110
            X.9Gd r3 = r2.A00
            if (r3 == 0) goto L_0x0110
            X.9JK r2 = X.C18784W1k.A00(r8, r6, r5)
            java.lang.String r2 = r3.A00(r2, r4)
            if (r2 == 0) goto L_0x0110
            X.9JK r2 = X.C18784W1k.A00(r8, r6, r5)
            java.lang.String r12 = r3.A00(r2, r4)
        L_0x00ab:
            if (r12 != 0) goto L_0x00b1
        L_0x00ad:
            com.instagram.business.promote.model.PromoteData r2 = r7.A02
            java.lang.String r12 = r2.A1Q
        L_0x00b1:
            X.0qQ.A0A(r12)
            com.instagram.business.promote.model.PromoteData r8 = r7.A02
            java.lang.String r13 = r8.A1A
            X.0qQ.A06(r13)
            java.lang.String r6 = r8.A1N
            X.0qQ.A06(r6)
            java.util.List r2 = r8.A1s
            X.0qQ.A06(r2)
            org.json.JSONArray r9 = new org.json.JSONArray
            r9.<init>()
            java.util.Iterator r10 = r2.iterator()
        L_0x00ce:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x0113
            java.lang.Object r4 = r10.next()
            X.GSY r4 = (X.GSY) r4
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.lang.String r3 = r4.A03
            java.lang.String r2 = "label"
            r5.put(r2, r3)
            java.lang.Object r3 = r4.A01
            java.lang.String r2 = "type_"
            r5.put(r2, r3)
            java.lang.String r3 = r4.A02
            if (r3 == 0) goto L_0x00f6
            java.lang.String r2 = "key"
            r5.put(r2, r3)
        L_0x00f6:
            java.lang.Object r4 = r4.A00
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L_0x010c
            boolean r2 = r4.isEmpty()
            if (r2 != 0) goto L_0x010c
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>(r4)
            java.lang.String r2 = "options"
            r5.put(r2, r3)
        L_0x010c:
            r9.put(r5)
            goto L_0x00ce
        L_0x0110:
            java.lang.String r12 = ""
            goto L_0x00ab
        L_0x0113:
            java.lang.String r15 = X.DbT.A10(r9)
            java.lang.String r5 = r8.A1L
            X.0qQ.A06(r5)
            java.lang.String r2 = r8.A1O
            if (r2 == 0) goto L_0x0146
            boolean r2 = X.00l.A0W(r2)
            if (r2 != 0) goto L_0x0146
            java.lang.String r4 = r8.A1O
        L_0x0128:
            java.lang.String r3 = r8.A1M
            com.instagram.api.schemas.LeadGenEntryPoint r11 = com.instagram.api.schemas.LeadGenEntryPoint.PROMOTE
            com.instagram.common.session.UserSession r2 = r7.A03
            X.WGU r2 = X.WGU.A00(r2)
            java.lang.String r2 = r2.A03
            r20 = 1
            X.UKn r10 = new X.UKn
            r14 = r6
            r16 = r5
            r17 = r4
            r18 = r3
            r19 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x0049
        L_0x0146:
            r4 = 0
            goto L_0x0128
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14786U8w.A0B(android.content.Context, java.lang.String, boolean):void");
    }

    public final void A0C(Resources resources, LeadForm leadForm) {
        if (this instanceof C16045UnY) {
            C16045UnY unY = (C16045UnY) this;
            LeadGenFormData leadGenFormData = unY.A04;
            ArrayList A042 = W3L.A04(resources, leadGenFormData);
            String str = leadForm.A02;
            String str2 = leadForm.A03;
            Boolean bool = leadForm.A01;
            String str3 = leadForm.A04;
            ArrayList A0r = AnonymousClass7TG.A0r(A042);
            Iterator it = A042.iterator();
            while (it.hasNext()) {
                LeadGenFormBaseQuestion leadGenFormBaseQuestion = (LeadGenFormBaseQuestion) it.next();
                A0r.add(new LeadGenInfoFieldData(leadGenFormBaseQuestion.A0A, leadGenFormBaseQuestion.A0D, AnonymousClass7TF.A1W(leadGenFormBaseQuestion.A03, C16595Uxp.A06)));
            }
            LeadForm A002 = VEO.A00(leadGenFormData.A00, bool, str, str2, str3, A0r);
            unY.A01.A01 = A002.FEQ();
            return;
        }
        String str4 = leadForm.A02;
        String str5 = leadForm.A03;
        Boolean bool2 = leadForm.A01;
        String str6 = leadForm.A04;
        PromoteData promoteData = ((C16046UnZ) this).A02;
        List list = promoteData.A1s;
        0qQ.A06(list);
        ArrayList A0r2 = AnonymousClass7TG.A0r(list);
        Iterator it2 = list.iterator();
        while (true) {
            boolean z = false;
            if (it2.hasNext()) {
                GSY gsy = (GSY) it2.next();
                if (gsy.A01 == LeadGenInfoFieldTypes.CUSTOM) {
                    z = true;
                }
                A0r2.add(new LeadGenInfoFieldData(gsy.A03, (List) gsy.A00, z));
            } else {
                LeadForm A003 = VEO.A00(promoteData.A0z, bool2, str4, str5, str6, A0r2);
                promoteData.A16 = A003;
                promoteData.A1u.add(0, A003);
                return;
            }
        }
    }

    public C14786U8w(C18059Vki vki) {
        this.A08 = vki;
        02z r7 = new 02z(false);
        this.A06 = r7;
        02z r6 = new 02z(false);
        this.A05 = r6;
        02z A012 = 106.A01((Object) null);
        this.A04 = A012;
        02z r3 = new 02z(false);
        this.A07 = r3;
        this.A00 = DbT.A0G(AnonymousClass10H.A01(new C73571Pfz(0, (AnonymousClass4D7) null), r7, r6, A012, r3));
        1HR A0f = C13990Tnq.A0f();
        this.A02 = A0f;
        this.A03 = 0u9.A04(A0f);
    }
}
