package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.Achievement;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.IQa  reason: case insensitive filesystem */
public final class C57137IQa implements JO1 {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ 1ZT A02;
    public final /* synthetic */ C331157Pu A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public final void Ct8(Achievement achievement) {
        1ZT r3 = this.A02;
        C331127Pr A012 = C64006LIm.A01(this.A00, this.A01);
        r3.A00();
        this.A03.A0F(C54925HYh.A00(String.valueOf(achievement.A01), this.A05, this.A04, (List) null, (List) null, false, false), A012);
    }

    public C57137IQa(FragmentActivity fragmentActivity, UserSession userSession, 1ZT r3, C331157Pu r4, String str, String str2) {
        this.A02 = r3;
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A05 = str;
        this.A04 = str2;
        this.A03 = r4;
    }
}
