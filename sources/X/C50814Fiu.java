package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fiu  reason: case insensitive filesystem */
public final class C50814Fiu implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public C50814Fiu(FragmentActivity fragmentActivity, UserSession userSession) {
        AnonymousClass7TG.A1O(fragmentActivity, userSession);
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    public final void CI0(Uri uri, Bundle bundle) {
        Bundle A0A = DbY.A0A(uri);
        DbU.A1B(uri, A0A, "media_id");
        FHB.A0B(A0A, this.A00, this.A01);
    }
}
