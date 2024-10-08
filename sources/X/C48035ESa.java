package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Set;

/* renamed from: X.ESa  reason: case insensitive filesystem */
public final class C48035ESa extends AnonymousClass7AK {
    public final /* synthetic */ C323316xI A00;
    public final /* synthetic */ String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48035ESa(C323316xI r2, String str, int i) {
        super(Integer.valueOf(i));
        this.A00 = r2;
        this.A01 = str;
    }

    public final void onClick(View view) {
        C323316xI r0 = this.A00;
        String str = this.A01;
        1Yy A012 = FC8.A01();
        FragmentActivity fragmentActivity = r0.A00;
        UserSession userSession = r0.A01;
        Set set = C49280EsP.A00;
        A012.A04(fragmentActivity, userSession, (Boolean) null, (Boolean) null, str, "profile_upsell");
    }
}
