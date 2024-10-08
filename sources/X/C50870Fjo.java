package X;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fjo  reason: case insensitive filesystem */
public final class C50870Fjo implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final Handler A02 = AnonymousClass7TF.A0D();

    public final void CI0(Uri uri, Bundle bundle) {
        this.A02.post(new C51264FrJ(this));
    }

    public C50870Fjo(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
