package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* renamed from: X.9nI  reason: invalid class name and case insensitive filesystem */
public final class C388109nI extends AnonymousClass8D8 {
    public final Context A00;
    public final N49 A01;
    public final UserSession A02;
    public final List A03 = C317876nz.A13.A01();

    public C388109nI(Context context, N49 n49, UserSession userSession, AnonymousClass8BA r12) {
        super(r12, (AnonymousClass8BH) null, (Integer) null, 111, false, false);
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = n49;
    }

    public final Integer A05() {
        return AnonymousClass05K.A02;
    }

    public final Map A06() {
        Context context = this.A00;
        UserSession userSession = this.A02;
        N49 n49 = this.A01;
        return AnonymousClass7TF.A0w(AAU.A00(context, userSession, n49.A01, n49.A00, 0nA.A09(context)), this.A03);
    }
}
