package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Fcc  reason: case insensitive filesystem */
public final class C50490Fcc implements C367608rH {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ C62320sa A04;

    public C50490Fcc(Context context, AnonymousClass0iw r2, UserSession userSession, User user, C62320sa r5) {
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = r2;
        this.A03 = user;
        this.A04 = r5;
    }

    public final void onClick() {
        Context context = this.A00;
        UserSession userSession = this.A02;
        AnonymousClass0iw r0 = this.A01;
        User user = this.A03;
        C62320sa r1 = this.A04;
        1Z4.A00.A00(context, (FragmentActivity) null, userSession, user, new C51051Fnh(r1, 6), r0.getModuleName(), (String) null, user.getUsername());
    }
}
