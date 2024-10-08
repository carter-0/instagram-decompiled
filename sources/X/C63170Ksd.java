package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.Ksd  reason: case insensitive filesystem */
public abstract class C63170Ksd {
    public static final K6x A00(UserSession userSession, C3516289p r2, AudioOverlayTrack audioOverlayTrack, boolean z) {
        Bundle A09 = DbY.A09(userSession);
        A09.putBoolean("is_existing_track", z);
        A09.putParcelable("selected_audio_track", audioOverlayTrack);
        K6x k6x = new K6x();
        k6x.setArguments(A09);
        k6x.A00 = r2;
        return k6x;
    }
}
