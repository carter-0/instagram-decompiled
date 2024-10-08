package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fvc  reason: case insensitive filesystem */
public final class C51530Fvc implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ FragmentActivity A02;
    public final /* synthetic */ UserSession A03;

    public C51530Fvc(View view, FragmentActivity fragmentActivity, UserSession userSession, int i) {
        this.A02 = fragmentActivity;
        this.A00 = i;
        this.A01 = view;
        this.A03 = userSession;
    }

    public final void run() {
        AnonymousClass5Gt A0V = DbZ.A0V(this.A02, this.A00);
        A0V.A03(this.A01);
        A0V.A01();
        A0V.A0B = true;
        A0V.A0A = true;
        UserSession userSession = this.A03;
        C47898ELs.A00(A0V, userSession, 15).A07(userSession);
    }
}
