package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class RUV {
    public static final C270254gR A00(Context context, RF6 rf6, UserSession userSession, String str, String str2, Set set, Set set2) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        1yd r3 = new 1yd(userSession2);
        C61038Jvc jvc = new C61038Jvc(str, str2);
        C59721JVf jVf = new C59721JVf(set, set2);
        C59721JVf jVf2 = jVf;
        C10860RzL rzL = new C10860RzL(context, jVf2, new JV5(rf6), new QP6((String) null, (String) null, (Map) null, (Set) null, (Set) null, (Set) null, (Set) null, (DefaultConstructorMarker) null, 127, 1), jvc);
        return new C270254gR(new C11290SJq(rzL, r3), rzL, new C11288SJh(r3, C51965G9l.A0l()), new C10188Ro4(userSession2), r3);
    }
}
