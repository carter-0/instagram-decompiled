package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.TwO  reason: case insensitive filesystem */
public final class C14440TwO {
    public int A00;
    public final int A01;
    public final UserSession A02;
    public final C363288jT A03;

    public final ArrayList A00(String str) {
        ArrayList arrayList = new ArrayList();
        if (this.A00 != 0) {
            List A002 = C14491TxD.A00(this.A02, this.A03, str);
            int i = this.A00;
            if (i != -1) {
                C14492TxE.A00(A002, i);
            }
            arrayList.addAll(A002);
        }
        return arrayList;
    }

    public C14440TwO(UserSession userSession, int i) {
        this.A02 = userSession;
        this.A01 = i;
        C363288jT A002 = C363288jT.A00(userSession);
        0qQ.A07(A002);
        this.A03 = A002;
        this.A00 = i;
    }
}
