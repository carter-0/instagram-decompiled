package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fli  reason: case insensitive filesystem */
public final class C50955Fli implements G6O {
    public final AnonymousClass4DH A00;
    public final AnonymousClass0iw A01;

    public final void Cqa(Context context, FragmentActivity fragmentActivity, UserSession userSession) {
        AnonymousClass7TG.A1O(userSession, fragmentActivity);
        AnonymousClass4DH r2 = this.A00;
        new FH4(r2, fragmentActivity, r2.getParentFragmentManager(), AnonymousClass07i.A00(fragmentActivity), this.A01, userSession).A0C(EVP.ALL);
    }

    public C50955Fli(AnonymousClass4DH r1, AnonymousClass0iw r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
