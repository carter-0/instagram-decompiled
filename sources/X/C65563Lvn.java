package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lvn  reason: case insensitive filesystem */
public final class C65563Lvn implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public C65563Lvn(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    public final void CI0(Uri uri, Bundle bundle) {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putParcelable(C273654mx.A00(22), C358098aM.A00(AnonymousClass80L.A00, new C358088aL[0]));
        A0a.putSerializable("camera_entry_point", 28D.A4U);
        Dba.A0l(this.A00, A0a, this.A01, "attribution_quick_camera_fragment");
    }
}
