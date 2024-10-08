package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.EHa  reason: case insensitive filesystem */
public final class C47789EHa extends 2Cl {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;

    public final int getRunnableId() {
        return 260;
    }

    public C47789EHa(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        Context context = this.A00;
        UserSession userSession = this.A01;
        AnonymousClass7TG.A1N(context, userSession);
        return FH1.A01(context, (AnonymousClass0iw) null, userSession, (G5M) null, (String) null);
    }

    public final void onFail(Exception exc) {
        FER.A00(this.A00, this.A01, (List) null);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        List list = (List) obj;
        0qQ.A0B(list, 0);
        FER.A00(this.A00, this.A01, list);
    }
}
