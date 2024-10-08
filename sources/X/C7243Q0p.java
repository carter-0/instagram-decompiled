package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.instagram.common.session.UserSession;
import java.nio.ByteBuffer;

/* renamed from: X.Q0p  reason: case insensitive filesystem */
public final class C7243Q0p {
    public MediaFormat A00;
    public ByteBuffer[] A01;
    public ByteBuffer[] A02;
    public final MediaCodec A03;
    public final UserSession A04;
    public final boolean A05;

    public static void A00(Throwable th) {
        if (th instanceof IllegalStateException) {
            throw new IllegalStateException(th.getMessage(), th);
        } else if (th instanceof IllegalArgumentException) {
            throw new IllegalArgumentException(th.getMessage(), th);
        } else {
            throw th;
        }
    }

    public C7243Q0p(MediaCodec mediaCodec, UserSession userSession, boolean z) {
        this.A04 = userSession;
        this.A03 = mediaCodec;
        this.A05 = z;
    }
}
