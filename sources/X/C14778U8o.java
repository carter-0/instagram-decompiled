package X;

import com.instagram.api.schemas.LeadGenEntryPoint;
import com.instagram.common.session.UserSession;
import com.instagram.leadgen.core.api.LeadForm;
import com.instagram.leadgen.core.api.LeadFormIntf;
import com.instagram.leadgen.core.model.LeadGenBaseFormList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.U8o  reason: case insensitive filesystem */
public final class C14778U8o extends 2YL {
    public int A00;
    public LeadForm A01;
    public String A02;
    public String A03;
    public boolean A04;
    public boolean A05 = true;
    public boolean A06;
    public final LeadGenEntryPoint A07;
    public final UserSession A08;
    public final C17777Vfo A09;
    public final LeadGenBaseFormList A0A;
    public final C16602Uxw A0B;
    public final String A0C;
    public final ArrayList A0D = new ArrayList();
    public final C249513ju A0E;
    public final AnonymousClass0r6 A0F;

    public C14778U8o(C319836rJ r4, UserSession userSession, WYZ wyz) {
        this.A09 = new C17777Vfo(wyz);
        1HR A0f = C13990Tnq.A0f();
        this.A0E = A0f;
        this.A0F = 0u9.A04(A0f);
        this.A08 = userSession;
        Object A002 = r4.A00("args_entry_point");
        if (A002 != null) {
            C16602Uxw valueOf = C16602Uxw.valueOf((String) A002);
            this.A0B = valueOf;
            this.A07 = valueOf.A01;
            Object A003 = r4.A00("args_form_list_data");
            if (A003 != null) {
                LeadGenBaseFormList leadGenBaseFormList = (LeadGenBaseFormList) A003;
                this.A0A = leadGenBaseFormList;
                this.A02 = leadGenBaseFormList.A03;
                this.A0C = C13989Tnp.A0s(valueOf);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A00(C14778U8o u8o, List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                LeadFormIntf leadFormIntf = (LeadFormIntf) it.next();
                boolean A0K = 0qQ.A0K(leadFormIntf.B7N(), C13989Tnp.A0p(u8o.A0A));
                ArrayList arrayList = u8o.A0D;
                if (A0K) {
                    arrayList.add(0, leadFormIntf.FEQ());
                } else {
                    arrayList.add(leadFormIntf.FEQ());
                }
            }
        }
    }
}
