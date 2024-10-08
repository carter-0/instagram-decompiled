package X;

import android.util.SparseArray;
import com.instagram.common.session.UserSession;

/* renamed from: X.2sc  reason: invalid class name and case insensitive filesystem */
public final class C231912sc {
    public final SparseArray A00;
    public final C231932se A01;

    public C231912sc(AnonymousClass0iw r6, UserSession userSession) {
        SparseArray sparseArray = new SparseArray();
        this.A00 = sparseArray;
        C231922sd r2 = new C231922sd(r6, userSession);
        sparseArray.append(0, r2);
        sparseArray.append(1, new C231942sf(r6));
        sparseArray.append(2, new C231952sg(userSession));
        sparseArray.append(3, new Object());
        this.A01 = r2;
    }
}
