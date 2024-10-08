package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Set;

public final class KIA extends AnonymousClass4HF {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C3499582p A02;
    public final /* synthetic */ L47 A03;
    public final /* synthetic */ C267834cI A04;
    public final /* synthetic */ Set A05;

    public KIA(Context context, UserSession userSession, C3499582p r3, L47 l47, C267834cI r5, Set set) {
        this.A03 = l47;
        this.A05 = set;
        this.A02 = r3;
        this.A01 = userSession;
        this.A00 = context;
        this.A04 = r5;
    }

    public final void DVx(int i, int i2) {
        L47 l47 = this.A03;
        Set set = this.A05;
        C378369Pn r0 = l47.A01;
        if (r0 != null) {
            set.remove(r0);
            r0.A00();
        }
        C3499582p r2 = this.A02;
        L47.A00(this.A00, this.A01, r2, l47, this.A04, set, i);
    }
}
