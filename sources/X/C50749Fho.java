package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.Fho  reason: case insensitive filesystem */
public final class C50749Fho implements G6H {
    public final Fragment A00;

    public C50749Fho(Fragment fragment) {
        this.A00 = fragment;
    }

    public final void CI0(Uri uri, Bundle bundle) {
        C322576w3.A00();
        Fragment fragment = this.A00;
        Context context = fragment.getContext();
        0qQ.A0A(context);
        0qQ.A0B(context, 0);
        Intent A04 = DbU.A04(context);
        Bundle requireArguments = fragment.requireArguments();
        requireArguments.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "megaphone");
        requireArguments.putString("target_page_id", (String) null);
        DbV.A1C(A04, 7, requireArguments);
        0kR.A05(fragment, A04, 12);
    }
}
