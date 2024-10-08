package X;

import com.instagram.api.schemas.LeadGenEntryPoint;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.U8a  reason: case insensitive filesystem */
public final class C14764U8a extends 2YL {
    public final 2Fk A00;
    public final 2Fk A01;
    public final 2Fk A02;
    public final 2Fk A03;
    public final 2Fk A04;
    public final 2Fk A05;
    public final LeadGenEntryPoint A06;
    public final UserSession A07;
    public final WYZ A08;
    public final Long A09;
    public final String A0A;
    public final String A0B;
    public final C249513ju A0C;
    public final AnonymousClass0r6 A0D;
    public final 05G A0E;
    public final 05G A0F;
    public final boolean A0G;
    public final User A0H;
    public final List A0I;
    public final 05G A0J;
    public final 05G A0K;
    public final 05G A0L;
    public final 05G A0M;

    public C14764U8a(C319836rJ r13, UserSession userSession, WYZ wyz) {
        this.A07 = userSession;
        this.A08 = wyz;
        Object A002 = r13.A00("args_form_data");
        if (A002 != null) {
            List list = (List) A002;
            this.A0I = list;
            Object A003 = r13.A00(AnonymousClass000.A00(1106));
            if (A003 != null) {
                this.A0G = AnonymousClass7TE.A1a(A003);
                Object A004 = r13.A00("args_entry_point");
                if (A004 != null) {
                    String str = (String) A004;
                    this.A0A = str;
                    User A0Q = AnonymousClass7TF.A0Q(userSession);
                    this.A0H = A0Q;
                    this.A09 = C51972G9s.A0j(A0Q.A03.getFbidV2());
                    String BaI = A0Q.A03.BaI();
                    this.A0B = BaI == null ? A0Q.getUsername() : BaI;
                    this.A06 = C16602Uxw.valueOf(AnonymousClass7TF.A0k(str)).A01;
                    Integer num = AnonymousClass05K.A00;
                    1HR A0f = C13990Tnq.A0f();
                    this.A0C = A0f;
                    this.A0D = 0u9.A04(A0f);
                    0sn r8 = 0sn.A00;
                    02z A012 = 106.A01(r8);
                    this.A0J = A012;
                    19B r2 = 19B.A00;
                    this.A00 = C226292g8.A00(r2, A012);
                    02z A013 = 106.A01(r8);
                    this.A0K = A013;
                    this.A01 = C226292g8.A00(r2, A013);
                    02z A014 = 106.A01((Object) null);
                    this.A0M = A014;
                    this.A03 = C226292g8.A00(r2, A014);
                    02z A015 = 106.A01((Object) null);
                    this.A0L = A015;
                    this.A02 = C226292g8.A00(r2, A015);
                    02z A10 = C51970G9q.A10(false);
                    this.A0E = A10;
                    this.A04 = C226292g8.A00(r2, A10);
                    02z A016 = 106.A01((Object) null);
                    this.A0F = A016;
                    this.A05 = C226292g8.A00(r2, A016);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C13991Tnr.A1O(arrayList, it);
                    }
                    this.A0J.Epw(arrayList);
                    05G r4 = this.A0K;
                    List list2 = this.A0I;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        C13991Tnr.A1N(arrayList2, it2);
                    }
                    r4.Epw(arrayList2);
                    this.A0M.Epw(new C15027UKg(W33.A01(""), this.A0H.Bh3(), (ImageUrl) null, num, this.A0H.getUsername(), r8, DbX.A01(this.A0H.A03.B6v()), arrayList.size(), true));
                    this.A0L.Epw(new N4R((C266444Yx) null, (Integer) 2131964787, 1));
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
