package X;

import android.os.Bundle;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.KtV  reason: case insensitive filesystem */
public abstract class C63224KtV {
    public static final K51 A00(String str) {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        K51 k51 = new K51();
        k51.setArguments(A0a);
        return k51;
    }
}
