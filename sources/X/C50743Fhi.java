package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Fhi  reason: case insensitive filesystem */
public final class C50743Fhi implements G6H {
    public final Fragment A00;

    public final void CI0(Uri uri, Bundle bundle) {
        String str;
        0qQ.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        if (queryParameter == null || queryParameter.length() == 0) {
            str = "megaphone";
        } else {
            str = uri.getQueryParameter(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            0qQ.A0A(str);
        }
        DbY.A0s();
        Bundle A0C = DbV.A0C(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        A0C.putString("edit_profile_entry", str);
        AnonymousClass6W8.A06(this.A00.requireContext(), A0C, ModalActivity.class, C273654mx.A00(242));
    }

    public C50743Fhi(Fragment fragment) {
        this.A00 = fragment;
    }
}
