package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.824  reason: invalid class name */
public final class AnonymousClass824 implements 2YM {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C3497481o A02;

    public final /* synthetic */ 2YL create(C62230ry r2, AnonymousClass2YQ r3) {
        return 2YT.A00(this, r3, r2);
    }

    public final /* synthetic */ 2YL create(Class cls, AnonymousClass2YQ r3) {
        0qQ.A0B(cls, 1);
        return create(cls);
    }

    public AnonymousClass824(Context context, UserSession userSession, C3497481o r3) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = r3;
    }

    public final 2YL create(Class cls) {
        return new AnonymousClass825(this.A00, this.A01, this.A02);
    }
}
