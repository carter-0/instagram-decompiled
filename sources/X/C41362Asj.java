package X;

import android.content.Context;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.Asj  reason: case insensitive filesystem */
public final class C41362Asj implements Callable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ CameraSpec A02;
    public final /* synthetic */ C39653A3t A03;
    public final /* synthetic */ 2Nn A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;

    public C41362Asj(Context context, UserSession userSession, CameraSpec cameraSpec, C39653A3t a3t, 2Nn r5, String str, List list) {
        this.A06 = list;
        this.A00 = context;
        this.A01 = userSession;
        this.A04 = r5;
        this.A05 = str;
        this.A02 = cameraSpec;
        this.A03 = a3t;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C349307zv r2;
        String str;
        String str2;
        String str3;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Medium medium : this.A06) {
            Callable A002 = C39810AAh.A00(this.A00, medium, this.A01, this.A02, this.A04, this.A05, false);
            if (A002 != null) {
                boolean CeS = medium.CeS();
                C39653A3t a3t = this.A03;
                if (a3t != null) {
                    C353498Hw r0 = a3t.A00;
                    AnonymousClass8A2 r11 = r0.A1h;
                    28D r12 = r0.A16;
                    boolean CVJ = r0.CVJ();
                    if (CeS) {
                        str3 = MediaStreamTrack.VIDEO_TRACK_KIND;
                    } else {
                        str3 = "photo";
                    }
                    r11.A06(r12, str3, 0, false, CVJ);
                }
                try {
                    r2 = (C349307zv) A002.call();
                } catch (Throwable th) {
                    r2 = new 0eQ(th);
                }
                if (!(r2 instanceof 0eQ)) {
                    if (a3t != null) {
                        AnonymousClass8A2 r1 = a3t.A00.A1h;
                        if (CeS) {
                            str2 = "video_import_success";
                        } else {
                            str2 = "photo_import_success";
                        }
                        r1.A0I(str2);
                    }
                    0qQ.A0A(r2);
                    A1C.add(r2);
                }
                Throwable A003 = 0eR.A00(r2);
                if (A003 != null) {
                    if (a3t != null) {
                        AnonymousClass8A2 r13 = a3t.A00.A1h;
                        if (CeS) {
                            str = "load video from medium failed";
                        } else {
                            str = "photo import failed";
                        }
                        r13.A0H(str);
                    }
                    throw new Exception(A003);
                }
            }
        }
        return A1C;
    }
}
