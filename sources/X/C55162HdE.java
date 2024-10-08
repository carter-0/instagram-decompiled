package X;

import android.net.Uri;
import com.instagram.music.common.model.AudioType;
import com.instagram.music.common.model.MusicDataSource;

/* renamed from: X.HdE  reason: case insensitive filesystem */
public abstract class C55162HdE {
    public static final MusicDataSource A00(XB5 xb5) {
        return new MusicDataSource((Uri) null, AudioType.MUSIC, "", xb5.getDashManifest(), xb5.getId(), (String) null);
    }
}
