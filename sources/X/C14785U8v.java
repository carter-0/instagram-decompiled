package X;

import android.os.Bundle;
import com.instagram.api.schemas.LeadGenEntryPoint;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.common.session.UserSession;
import com.instagram.leadgen.core.api.LeadForm;
import com.instagram.leadgen.core.model.LeadGenBaseFormList;

/* renamed from: X.U8v  reason: case insensitive filesystem */
public abstract class C14785U8v extends 2YL {
    public XIGIGBoostCallToAction A00;
    public LeadForm A01;
    public boolean A02;
    public final 2Fk A03;
    public final 2Fk A04;
    public final C18028Vk6 A05;
    public final C249513ju A06;
    public final AnonymousClass0r6 A07;
    public final 05G A08;
    public final 05G A09;

    public C14785U8v(C18028Vk6 vk6) {
        this.A05 = vk6;
        1HR A0f = C13990Tnq.A0f();
        this.A06 = A0f;
        this.A07 = 0u9.A04(A0f);
        02z A10 = C51970G9q.A10(true);
        this.A08 = A10;
        19B r1 = 19B.A00;
        this.A03 = C226292g8.A00(r1, A10);
        02z A012 = 106.A01(0sn.A00);
        this.A09 = A012;
        this.A04 = C226292g8.A00(r1, A012);
    }

    public final UserSession A01() {
        if (this instanceof C16060Unn) {
            return ((C16060Unn) this).A02;
        }
        return ((C16059Unm) this).A02;
    }

    public final LeadGenBaseFormList A02() {
        if (this instanceof C16060Unn) {
            return ((C16060Unn) this).A03;
        }
        return ((C16059Unm) this).A03;
    }

    public final String A03() {
        if (this instanceof C16060Unn) {
            return ((C16060Unn) this).A07;
        }
        return ((C16059Unm) this).A04;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: X.Unm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: X.Unn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: X.Unm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: X.Unm} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04() {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.C16060Unn
            if (r0 == 0) goto L_0x0028
            r4 = r5
            X.Unn r4 = (X.C16060Unn) r4
            com.instagram.leadgen.core.model.LeadGenBaseFormList r3 = r4.A03
            java.util.List r0 = r3.A04
            java.util.Iterator r2 = r0.iterator()
        L_0x000f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r1 = r2.next()
            com.instagram.leadgen.core.api.LeadForm r1 = (com.instagram.leadgen.core.api.LeadForm) r1
            java.lang.Boolean r0 = r1.A01
            boolean r0 = X.DbX.A1a(r0)
            if (r0 == 0) goto L_0x000f
        L_0x0023:
            r3.A01 = r1
            r4.A01 = r1
        L_0x0027:
            return
        L_0x0028:
            r4 = r5
            X.Unm r4 = (X.C16059Unm) r4
            com.instagram.leadgen.core.model.LeadGenBaseFormList r3 = r4.A03
            com.instagram.business.promote.model.PromoteData r0 = r4.A01
            com.instagram.leadgen.core.api.LeadForm r1 = r0.A16
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14785U8v.A04():void");
    }

    public final void A05() {
        C18028Vk6 vk6 = this.A05;
        String A032 = A03();
        String A0p = C13989Tnp.A0p(A02());
        0qQ.A0B(A032, 0);
        XB6 xb6 = vk6.A00;
        Bundle bundle = new Bundle();
        bundle.putString("form_id", A0p);
        XB6.A00(bundle, xb6, A032, "lead_gen_manage_lead_forms_and_cta", "done");
    }

    public final void A06(boolean z) {
        if (this instanceof C16060Unn) {
            C16060Unn unn = (C16060Unn) this;
            unn.A04.A08(unn.A06, unn.A07, z);
        }
    }

    public static final void A00(C14785U8v u8v, String str) {
        LeadGenEntryPoint leadGenEntryPoint;
        u8v.A02().A03 = str;
        C18059Vki vki = new C18059Vki(u8v.A01());
        if (u8v instanceof C16060Unn) {
            leadGenEntryPoint = ((C16060Unn) u8v).A01;
        } else {
            leadGenEntryPoint = ((C16059Unm) u8v).A00;
        }
        DbY.A19(u8v, new MH3(u8v, (AnonymousClass4D7) null, 0), vki.A00(leadGenEntryPoint, str, (String) null));
    }
}
