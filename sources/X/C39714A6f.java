package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;

/* renamed from: X.A6f  reason: case insensitive filesystem */
public final class C39714A6f {
    public boolean A00;
    public final Context A01;
    public final UserSession A02;
    public final 1Xj A03;

    public C39714A6f(Context context, UserSession userSession, 1Xj r5) {
        AnonymousClass7TG.A1O(context, userSession);
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = r5;
        r5.A0C.Egw(ProductType.MEMORY.A00);
    }
}
