package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.archive.fragment.ArchiveHomeFragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lvm  reason: case insensitive filesystem */
public final class C65562Lvm implements G6H {
    public final Fragment A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        FragmentActivity requireActivity = this.A00.requireActivity();
        UserSession userSession = this.A01;
        1Av A002 = 1Au.A00(userSession);
        DbS.A1a(A002, C62589KiM.POSTS.A01, A002.A85, 1Av.A8a, 211);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putBoolean(C273654mx.A00(81), true);
        C309516Yo A0M = DbS.A0M(requireActivity, userSession);
        A0M.A0B(A0a, new ArchiveHomeFragment());
        A0M.A04();
    }

    public C65562Lvm(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
