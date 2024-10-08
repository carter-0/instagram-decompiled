package X;

import android.util.SparseArray;
import com.instagram.common.session.UserSession;

public final class TwA implements AnonymousClass32I {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C14137TqX A01;

    public final void D33(SparseArray sparseArray, Integer num) {
    }

    public final void D34() {
    }

    public final void D35() {
    }

    public final void D37(SparseArray sparseArray) {
    }

    public TwA(UserSession userSession, C14137TqX tqX) {
        this.A01 = tqX;
        this.A00 = userSession;
    }

    public final void D36() {
        C14137TqX tqX = this.A01;
        Dc2 dc2 = tqX.A03;
        if (dc2 != null) {
            DbX.A1R(dc2);
        }
        String str = tqX.A09;
        if (str == null) {
            str = "";
        }
        new C14437TwL(tqX.requireActivity(), new WPQ(), this.A00, str, 112, false).A02();
    }
}
