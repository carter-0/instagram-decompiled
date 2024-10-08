package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fj2  reason: case insensitive filesystem */
public final class C50822Fj2 implements G6H {
    public final Fragment A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        C46649DiU A04 = C46649DiU.A04(C273654mx.A00(74), AnonymousClass7TE.A1E());
        Fragment fragment = this.A00;
        FragmentActivity requireActivity = fragment.requireActivity();
        IgBloksScreenConfig A0N = DbS.A0N(this.A01);
        DbS.A18(fragment.requireActivity(), A0N, 2131969883);
        A0N.A0i = true;
        A04.A0D(requireActivity, A0N);
    }

    public C50822Fj2(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
