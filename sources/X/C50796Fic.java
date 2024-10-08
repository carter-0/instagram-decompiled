package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;

/* renamed from: X.Fic  reason: case insensitive filesystem */
public final class C50796Fic implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        Bundle A0a = AnonymousClass7TE.A0a();
        DbU.A0x(this.A00, A0a, this.A01, TransparentModalActivity.class, C273654mx.A00(3230));
    }

    public C50796Fic(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
