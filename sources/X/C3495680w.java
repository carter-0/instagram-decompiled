package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.80w  reason: invalid class name and case insensitive filesystem */
public final class C3495680w implements 2YM {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;

    public final /* synthetic */ 2YL create(C62230ry r2, AnonymousClass2YQ r3) {
        return 2YT.A00(this, r3, r2);
    }

    public final /* synthetic */ 2YL create(Class cls, AnonymousClass2YQ r3) {
        0qQ.A0B(cls, 1);
        return create(cls);
    }

    public C3495680w(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }

    public final 2YL create(Class cls) {
        0qQ.A0B(cls, 0);
        if (cls.isAssignableFrom(C3495780x.class)) {
            return new C3495780x(this.A00, this.A01);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Pxd.A00(72));
        sb.append(cls);
        throw new IllegalArgumentException(sb.toString());
    }
}
