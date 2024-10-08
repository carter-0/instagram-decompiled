package X;

import com.instagram.api.schemas.LeadGenEntryPoint;
import com.instagram.common.session.UserSession;
import com.instagram.leadgen.core.api.LeadForm;
import com.instagram.leadgen.core.api.LeadFormIntf;
import com.instagram.leadgen.core.model.LeadGenBaseFormList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.U8p  reason: case insensitive filesystem */
public final class C14779U8p extends 2YL {
    public int A00;
    public LeadForm A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final LeadGenEntryPoint A06;
    public final UserSession A07;
    public final C17777Vfo A08;
    public final LeadGenBaseFormList A09;
    public final C16602Uxw A0A;
    public final String A0B;
    public final String A0C;
    public final ArrayList A0D;
    public final C249513ju A0E;
    public final AnonymousClass0r6 A0F;

    public C14779U8p(C319836rJ r5, UserSession userSession, WYZ wyz) {
        this.A07 = userSession;
        Object A002 = r5.A00("args_entry_point");
        if (A002 != null) {
            C16602Uxw valueOf = C16602Uxw.valueOf((String) A002);
            this.A0A = valueOf;
            this.A06 = valueOf.A01;
            Object A003 = r5.A00("args_form_list_data");
            if (A003 != null) {
                LeadGenBaseFormList leadGenBaseFormList = (LeadGenBaseFormList) A003;
                this.A09 = leadGenBaseFormList;
                this.A0C = leadGenBaseFormList.A03;
                this.A0B = C13989Tnp.A0s(valueOf);
                this.A08 = new C17777Vfo(wyz);
                this.A04 = true;
                this.A0D = new ArrayList();
                1HR A0f = C13990Tnq.A0f();
                this.A0E = A0f;
                this.A0F = 0u9.A04(A0f);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A00(C14779U8p u8p, List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                LeadFormIntf leadFormIntf = (LeadFormIntf) it.next();
                boolean A0K = 0qQ.A0K(leadFormIntf.B7N(), C13989Tnp.A0p(u8p.A09));
                ArrayList arrayList = u8p.A0D;
                if (A0K) {
                    arrayList.add(0, leadFormIntf.FEQ());
                } else {
                    arrayList.add(leadFormIntf.FEQ());
                }
            }
        }
    }
}
