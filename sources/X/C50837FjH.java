package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.FjH  reason: case insensitive filesystem */
public final class C50837FjH implements G6H {
    public final FragmentActivity A00;
    public final 0lg A01;

    public C50837FjH(FragmentActivity fragmentActivity, 0lg r2) {
        this.A00 = fragmentActivity;
        this.A01 = r2;
    }

    public final void CI0(Uri uri, Bundle bundle) {
        DbY.A0s();
        DbU.A0v();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "megaphone");
        A0a.putString("edit_profile_entry", "megaphone");
        C227812jx r2 = new C227812jx();
        r2.setArguments(A0a);
        DbY.A14(r2, this.A00, this.A01);
    }
}
