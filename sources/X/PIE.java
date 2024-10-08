package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

public final class PIE implements C231272rL {
    public final AnonymousClass2t9 A00;

    /* JADX WARNING: type inference failed for: r0v2, types: [X.2tF, java.lang.Object] */
    public PIE(Activity activity, AnonymousClass4DH r4, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        AnonymousClass2tC A002 = AnonymousClass2t9.A00(activity);
        A002.A01(new C68627NPx(activity, r4, userSession));
        this.A00 = DbU.A0U(A002, new Object());
    }

    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this.A00;
    }

    public final int getCount() {
        return this.A00.getItemCount();
    }

    public final Object getItem(int i) {
        Object A04 = this.A00.A04(i);
        0qQ.A07(A04);
        return A04;
    }
}
