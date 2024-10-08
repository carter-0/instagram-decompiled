package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.R9c  reason: case insensitive filesystem */
public final class C8776R9c extends C252233om {
    public List A00;
    public final Context A01;
    public final UserSession A02;
    public final C13676Tel A03;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.R9k, X.11X] */
    public final void D6z(View view) {
        1ES.A03(new C8783R9k(this, 3));
    }

    public C8776R9c(Context context, UserSession userSession, C13676Tel tel) {
        this.A01 = context;
        this.A03 = tel;
        this.A02 = userSession;
    }
}
