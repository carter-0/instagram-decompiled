package X;

import com.instagram.api.schemas.LeadGenEntryPoint;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Unl  reason: case insensitive filesystem */
public final class C16058Unl extends C14773U8j {
    public final LeadGenEntryPoint A00;
    public final UserSession A01;
    public final WYZ A02;
    public final Long A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final User A08;
    public final String A09;
    public final List A0A;

    public C16058Unl(C319836rJ r13, UserSession userSession, WYZ wyz) {
        this.A01 = userSession;
        this.A02 = wyz;
        this.A09 = (String) r13.A00(AnonymousClass000.A00(2650));
        Object A002 = r13.A00("args_form_data");
        if (A002 != null) {
            List list = (List) A002;
            this.A0A = list;
            Object A003 = r13.A00(AnonymousClass000.A00(1106));
            if (A003 != null) {
                this.A06 = AnonymousClass7TE.A1a(A003);
                Object A004 = r13.A00("args_entry_point");
                if (A004 != null) {
                    this.A04 = (String) A004;
                    User A012 = AnonymousClass0t1.A01.A01(this.A01);
                    this.A08 = A012;
                    this.A03 = C51972G9s.A0j(A012.A03.getFbidV2());
                    this.A07 = true;
                    String BaI = A012.A03.BaI();
                    this.A05 = BaI == null ? A012.getUsername() : BaI;
                    this.A00 = C16602Uxw.valueOf(AnonymousClass7TF.A0k(this.A04)).A01;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C13991Tnr.A1O(arrayList, it);
                    }
                    this.A0C.Epw(arrayList);
                    05G r4 = this.A0D;
                    List list2 = this.A0A;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        C13991Tnr.A1N(arrayList2, it2);
                    }
                    r4.Epw(arrayList2);
                    String username = this.A08.getUsername();
                    this.A0G.Epw(new C15027UKg(W33.A01(this.A09), this.A08.Bh3(), (ImageUrl) null, AnonymousClass05K.A00, username, 0sn.A00, DbX.A01(this.A08.A03.B6v()), arrayList.size(), true));
                    this.A0E.Epw(new N4R((C266444Yx) null, (Integer) 2131964787, 1));
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
