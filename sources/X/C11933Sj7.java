package X;

import android.content.Context;
import android.net.Uri;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.Sj7  reason: case insensitive filesystem */
public final class C11933Sj7 implements C13698TfG {
    public final Context A00;

    public final /* bridge */ /* synthetic */ C10528Rth AEZ(C11856Shi shi, Object obj, int i, int i2) {
        Number number;
        Uri uri = (Uri) obj;
        if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384 || (number = (Number) shi.A00(Si6.A04)) == null || number.longValue() != -1) {
            return null;
        }
        C11853Shf shf = new C11853Shf(uri);
        Context context = this.A00;
        return new C10528Rth(shf, C11890SiP.A00(context, uri, new C11903Sic(context.getContentResolver())));
    }

    public final /* bridge */ /* synthetic */ boolean CJT(Object obj) {
        Uri uri = (Uri) obj;
        if (!C9206RTj.A00(uri) || !uri.getPathSegments().contains(MediaStreamTrack.VIDEO_TRACK_KIND)) {
            return false;
        }
        return true;
    }

    public C11933Sj7(Context context) {
        this.A00 = context.getApplicationContext();
    }
}
