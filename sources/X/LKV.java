package X;

import android.os.Bundle;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

public abstract class LKV {
    public static final K5Q A00(Integer num, String str, String str2) {
        0qQ.A0B(str, 0);
        K5Q k5q = new K5Q();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("file_path", str);
        A0a.putString("source_media_id", str2);
        A0a.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, C63131Krz.A00(num));
        A0a.putBoolean("from_create_btn", false);
        k5q.setArguments(A0a);
        return k5q;
    }

    public static final boolean A01(28D r3) {
        if (00l.A0d(r3.toString(), "REMIX", false) || r3 == 28D.A17) {
            return false;
        }
        return true;
    }
}
