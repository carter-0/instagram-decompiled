package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.ESc  reason: case insensitive filesystem */
public final class C48037ESc extends AnonymousClass7AK {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48037ESc(FragmentActivity fragmentActivity, UserSession userSession, String str, int i) {
        super(Integer.valueOf(i));
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A02 = str;
    }

    public final void onClick(View view) {
        SUL A0J = Dba.A0J(this.A00, this.A01, 2EG.A34, this.A02);
        A0J.A0S = "promote";
        A0J.A0A();
    }
}
