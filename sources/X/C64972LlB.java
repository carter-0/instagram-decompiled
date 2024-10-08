package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LlB  reason: case insensitive filesystem */
public final class C64972LlB implements C74308Psi {
    public String A00 = "";
    public final 0mM A01;
    public final C67691MsV A02;
    public final MSK A03;

    public final void Dfc(String str, List list) {
        ArrayList arrayList;
        0qQ.A0B(str, 0);
        if (str.equals(this.A00)) {
            if (list != null) {
                arrayList = AnonymousClass7TE.A1C();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C317486nL B0p = ((C317466nJ) it.next()).B0p();
                    if (B0p != null) {
                        arrayList.add(B0p);
                    }
                }
            } else {
                arrayList = 0sn.A00;
            }
            this.A03.Dhp(str, 00k.A0U(arrayList));
        }
    }

    public C64972LlB(UserSession userSession, MSK msk) {
        this.A03 = msk;
        this.A02 = new C67691MsV(userSession, this);
        this.A01 = new 0mM(AnonymousClass7TF.A0D(), new C64889Ljp(this, 8), 300);
    }
}
