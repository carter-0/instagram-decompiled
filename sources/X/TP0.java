package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class TP0 implements AnonymousClass0eK {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass0eK A02;

    public TP0(Context context, UserSession userSession, AnonymousClass0eK r3) {
        this.A02 = r3;
        this.A00 = context;
        this.A01 = userSession;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return new Qmf(this.A00, this.A01, this.A02);
    }
}
