package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.JqE  reason: case insensitive filesystem */
public final class C60725JqE extends C14191TrW {
    public final UserSession A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60725JqE(UserSession userSession, C61421K6s k6s) {
        super(k6s);
        0qQ.A0B(userSession, 2);
        this.A00 = userSession;
    }

    public final Fragment A03(int i) {
        Fragment k7p;
        Bundle A0a = AnonymousClass7TE.A0a();
        DbU.A1D(A0a, this.A00);
        if (i == C62547Khd.FILTER.A00) {
            k7p = new C61405K6b();
        } else if (i == C62547Khd.TRIM.A00) {
            k7p = new C61440K7p();
        } else {
            throw AnonymousClass7TE.A0w(002.A0c("Tab position ", " is not supported", i));
        }
        k7p.setArguments(A0a);
        return k7p;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(17202552);
        int length = C62547Khd.values().length;
        AnonymousClass0fD.A0A(-1227172056, A03);
        return length;
    }
}
