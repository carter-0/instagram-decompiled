package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fba  reason: case insensitive filesystem */
public final class C50427Fba implements G70 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;

    public C50427Fba(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }

    public final void onFailure() {
        C59689JTv.A0D(this.A00, "request_error");
    }

    public final void onSuccess() {
        C49761F5n.A00(this.A00, this.A01);
    }
}
