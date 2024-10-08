package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* renamed from: X.IBi  reason: case insensitive filesystem */
public final class C56759IBi implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AnonymousClass6Z5 A01;
    public final /* synthetic */ 0r1 A02;

    public C56759IBi(FragmentActivity fragmentActivity, AnonymousClass6Z5 r2, 0r1 r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = fragmentActivity;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(2132346222);
        I6J i6j = I6J.A00;
        UserSession userSession = this.A01.A09;
        if (userSession == null) {
            DbS.A17();
            throw AnonymousClass00P.createAndThrow();
        }
        i6j.A08(userSession, C273654mx.A00(1425), "primary_button", (String) null, (String) null, (List) null, (List) null, (List) null, (Map) null);
        this.A02.A00 = true;
        DbX.A10(this.A00, AnonymousClass37D.A00);
        AnonymousClass0fD.A0C(-1344653439, A05);
    }
}
