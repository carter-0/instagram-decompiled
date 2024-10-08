package X;

import com.instagram.api.schemas.LeadGenEntryPoint;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.common.session.UserSession;
import com.instagram.leadgen.core.api.LeadForm;
import com.instagram.leadgen.core.model.LeadGenBaseFormList;

/* renamed from: X.U8t  reason: case insensitive filesystem */
public final class C14783U8t extends 2YL {
    public XIGIGBoostCallToAction A00;
    public LeadForm A01;
    public String A02;
    public boolean A03;
    public final 2Fk A04;
    public final 2Fk A05;
    public final UserSession A06;
    public final C18028Vk6 A07;
    public final LeadGenBaseFormList A08;
    public final WYZ A09;
    public final C16602Uxw A0A;
    public final Long A0B;
    public final String A0C;
    public final C249513ju A0D;
    public final AnonymousClass0r6 A0E;
    public final 05G A0F;
    public final 05G A0G;
    public final boolean A0H;
    public final LeadGenEntryPoint A0I;
    public final Object A0J;

    public C14783U8t(C319836rJ r5, UserSession userSession, WYZ wyz) {
        C16602Uxw uxw;
        this.A06 = userSession;
        this.A09 = wyz;
        Object A002 = r5.A00("args_entry_point");
        if (A002 != null) {
            this.A0J = A002;
            boolean equals = A002.equals(AnonymousClass000.A00(169));
            this.A0H = equals;
            if (equals) {
                uxw = C16602Uxw.A05;
            } else {
                uxw = C16602Uxw.A04;
            }
            this.A0A = uxw;
            this.A0C = C13989Tnp.A0s(uxw);
            this.A0B = C51972G9s.A0j(C13991Tnr.A0h(userSession));
            this.A0I = uxw.A01;
            Object A003 = r5.A00("args_form_list_data");
            if (A003 != null) {
                this.A08 = (LeadGenBaseFormList) A003;
                this.A07 = new C18028Vk6(wyz);
                1HR A0f = C13990Tnq.A0f();
                this.A0D = A0f;
                this.A0E = 0u9.A04(A0f);
                02z A10 = C51970G9q.A10(true);
                this.A0F = A10;
                19B r1 = 19B.A00;
                this.A04 = C226292g8.A00(r1, A10);
                02z A012 = 106.A01(0sn.A00);
                this.A0G = A012;
                this.A05 = C226292g8.A00(r1, A012);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A00(C14783U8t u8t, String str) {
        u8t.A08.A03 = str;
        DbY.A19(u8t, new MH3(u8t, (AnonymousClass4D7) null, 4), new C18059Vki(u8t.A06).A00(u8t.A0I, str, (String) null));
    }

    public final void A01(boolean z, boolean z2) {
        this.A09.A05(this.A0B, C13989Tnp.A0p(this.A08), this.A0C, z, z2);
    }
}
