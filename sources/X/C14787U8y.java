package X;

import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.common.session.UserSession;
import com.instagram.leadgen.core.api.LeadForm;
import com.instagram.leadgen.core.model.LeadGenBaseFormList;
import com.instagram.leadgen.organic.model.LeadGenFormData;
import java.util.ArrayList;

/* renamed from: X.U8y  reason: case insensitive filesystem */
public final class C14787U8y extends 2YL {
    public final 2Fk A00;
    public final C59732JVq A01;
    public final UserSession A02;
    public final LeadGenBaseFormList A03;
    public final WYZ A04;
    public final C16602Uxw A05;
    public final LeadGenFormData A06;
    public final Long A07;
    public final String A08;
    public final C249513ju A09;
    public final AnonymousClass0r6 A0A;
    public final 05G A0B;
    public final boolean A0C;
    public final C18059Vki A0D;

    public final void A04(C16534Uwe uwe, int i, boolean z) {
        String str;
        if (!DbX.A1b(this.A0B)) {
            C16534Uwe uwe2 = uwe;
            if (z) {
                if (uwe.ordinal() != 0) {
                    str = "add_custom_multiple_choice_question";
                } else {
                    str = "add_custom_short_answer_question";
                }
                WYZ wyz = this.A04;
                Long l = this.A07;
                String str2 = this.A08;
                0qQ.A0B(str2, 1);
                WYZ.A02(wyz, l, "lead_gen_create_form", str, str2);
            }
            A01(this);
            AnonymousClass7TE.A1Z(new JTZ(this, uwe2, (AnonymousClass4D7) null, i, 16), C318116oQ.A00(this));
        }
    }

    public static final void A01(C14787U8y u8y) {
        LeadGenFormData leadGenFormData = u8y.A06;
        C59732JVq jVq = u8y.A01;
        leadGenFormData.A09 = jVq.A01;
        leadGenFormData.A07 = jVq.A00;
        leadGenFormData.A0A = jVq.A02;
    }

    public final void A02() {
        LeadGenFormData leadGenFormData = this.A06;
        leadGenFormData.A05 = "";
        leadGenFormData.A02 = null;
        leadGenFormData.A00 = null;
        leadGenFormData.A07 = false;
        leadGenFormData.A09 = false;
        leadGenFormData.A0A = false;
        leadGenFormData.A00("");
        leadGenFormData.A06.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r14.A05 == X.C16602Uxw.A06) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(android.content.Context r15, java.lang.String r16, boolean r17) {
        /*
            r14 = this;
            com.instagram.common.session.UserSession r0 = r14.A02
            com.instagram.user.model.User r4 = X.AnonymousClass7TF.A0Q(r0)
            com.instagram.leadgen.organic.model.LeadGenFormData r3 = r14.A06
            java.lang.String r6 = X.W3L.A02(r15, r3)
            boolean r0 = r14.A0C
            if (r0 == 0) goto L_0x0017
            X.Uxw r2 = r14.A05
            X.Uxw r0 = X.C16602Uxw.A06
            r1 = 1
            if (r2 != r0) goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            X.4Cl r0 = r4.A03
            r0.BaE()
            java.lang.String r4 = r3.A03
            java.lang.String r5 = r3.A04
            X.Uxw r0 = r14.A05
            com.instagram.api.schemas.LeadGenEntryPoint r3 = r0.A01
            r13 = r1 ^ 1
            r8 = 0
            java.lang.String r7 = ""
            X.AnonymousClass7TG.A1Q(r4, r5)
            r0 = 6
            X.0qQ.A0B(r3, r0)
            X.Vki r2 = r14.A0D
            r10 = r16
            r12 = r17
            r9 = r8
            r11 = r8
            X.MCA r2 = r2.A01(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1 = 32
            X.MfO r0 = new X.MfO
            r0.<init>(r14, r15, r8, r1)
            X.DbY.A19(r14, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14787U8y.A03(android.content.Context, java.lang.String, boolean):void");
    }

    public C14787U8y(C319836rJ r8, UserSession userSession, WYZ wyz) {
        this.A02 = userSession;
        this.A04 = wyz;
        Object A002 = r8.A00("args_form_data");
        if (A002 != null) {
            LeadGenFormData leadGenFormData = (LeadGenFormData) A002;
            this.A06 = leadGenFormData;
            C16602Uxw uxw = leadGenFormData.A01;
            this.A05 = uxw;
            this.A08 = C13989Tnp.A0s(uxw);
            this.A07 = C51972G9s.A0j(C13991Tnr.A0h(userSession));
            LeadGenBaseFormList leadGenBaseFormList = (LeadGenBaseFormList) r8.A00("args_form_list_data");
            this.A03 = leadGenBaseFormList == null ? new LeadGenBaseFormList((XIGIGBoostCallToAction) null, (LeadForm) null, (String) null, "", new ArrayList(), false) : leadGenBaseFormList;
            this.A0C = AnonymousClass7TG.A1X((Boolean) r8.A00(AnonymousClass000.A00(1108)));
            this.A0D = new C18059Vki(userSession);
            this.A01 = new C59732JVq(7, 6, false, false);
            02z A10 = C51970G9q.A10(false);
            this.A0B = A10;
            this.A00 = DbT.A0G(A10);
            1HR A0f = C13990Tnq.A0f();
            this.A09 = A0f;
            this.A0A = 0u9.A04(A0f);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static LeadGenFormData A00(AnonymousClass0eM r0) {
        return ((C14787U8y) r0.getValue()).A06;
    }
}
