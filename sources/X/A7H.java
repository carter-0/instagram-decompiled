package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.HashSet;

public final class A7H {
    public final C353768Iz A00;
    public final Context A01;
    public final UserSession A02;
    public final C353668Ip A03;
    public final HashSet A04 = AnonymousClass7TE.A1F();

    public A7H(Context context, UserSession userSession) {
        this.A01 = context;
        this.A02 = userSession;
        C353668Ip r4 = new C353668Ip(userSession);
        this.A03 = r4;
        this.A00 = new C353768Iz(new C40159ATz(new C353698Is(context, new C40158ATy(2), new AnonymousClass84N(context, userSession)), new AnonymousClass84N(context, userSession)), r4);
    }
}
