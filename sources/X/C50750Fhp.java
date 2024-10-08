package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.Fhp  reason: case insensitive filesystem */
public final class C50750Fhp implements G6H {
    public final Fragment A00;

    public C50750Fhp(Fragment fragment) {
        this.A00 = fragment;
    }

    public final void CI0(Uri uri, Bundle bundle) {
        C48729EjE.A00();
        Fragment fragment = this.A00;
        Intent A04 = DbU.A04(fragment.requireContext());
        Bundle requireArguments = fragment.requireArguments();
        requireArguments.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, Pxd.A00(784));
        DbV.A1C(A04, 2, requireArguments);
        0kR.A05(fragment, A04, 11);
    }
}
