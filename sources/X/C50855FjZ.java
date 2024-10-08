package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.FjZ  reason: case insensitive filesystem */
public final class C50855FjZ implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public C50855FjZ(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    public final void CI0(Uri uri, Bundle bundle) {
        FC8.A01().A02(this.A00, this.A01);
    }
}
