package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.mediapicker.Folder;
import java.util.List;

/* renamed from: X.Lzj  reason: case insensitive filesystem */
public final class C65791Lzj implements AnonymousClass8XT {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C227382jA A02;

    public final boolean AFR(Folder folder, List list) {
        return true;
    }

    public final void DpR(List list) {
    }

    public C65791Lzj(Context context, UserSession userSession, C227382jA r3) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = r3;
    }

    public final List C2u(Integer num) {
        Context context = this.A00;
        UserSession userSession = this.A01;
        C227382jA r0 = this.A02;
        AnonymousClass7TG.A1T(context, userSession, r0);
        JY0 A0Q = JTS.A0Q(context, userSession, r0);
        AnonymousClass9IE r2 = new AnonymousClass9IE(AnonymousClass7TE.A1I(C390879rz.SMART_ALBUMS), 25);
        19E.A02(JTP.A0U(AnonymousClass12T.A00, 281480192));
        return A0Q.A00(r2);
    }
}
