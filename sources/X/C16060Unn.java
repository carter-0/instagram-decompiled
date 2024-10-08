package X;

import com.instagram.api.schemas.LeadGenEntryPoint;
import com.instagram.common.session.UserSession;
import com.instagram.leadgen.core.model.LeadGenBaseFormList;

/* renamed from: X.Unn  reason: case insensitive filesystem */
public final class C16060Unn extends C14785U8v {
    public String A00;
    public final LeadGenEntryPoint A01;
    public final UserSession A02;
    public final LeadGenBaseFormList A03;
    public final WYZ A04;
    public final C16602Uxw A05;
    public final Long A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final Object A0A;

    public C16060Unn(C319836rJ r5, UserSession userSession, WYZ wyz) {
        super(new C18028Vk6(wyz));
        C16602Uxw uxw;
        this.A02 = userSession;
        this.A04 = wyz;
        Object A002 = r5.A00("args_entry_point");
        if (A002 != null) {
            this.A0A = A002;
            boolean equals = A002.equals(AnonymousClass000.A00(169));
            this.A08 = equals;
            if (equals) {
                uxw = C16602Uxw.A05;
            } else {
                uxw = C16602Uxw.A04;
            }
            this.A05 = uxw;
            this.A07 = C13989Tnp.A0s(uxw);
            this.A06 = DbZ.A0d(C13991Tnr.A0h(this.A02));
            this.A01 = uxw.A01;
            Object A003 = r5.A00("args_form_list_data");
            if (A003 != null) {
                this.A03 = (LeadGenBaseFormList) A003;
                this.A09 = true;
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A07(boolean z, boolean z2) {
        this.A04.A05(this.A06, C13989Tnp.A0p(this.A03), this.A07, z, z2);
    }

    public final boolean A08() {
        return this.A09;
    }
}
