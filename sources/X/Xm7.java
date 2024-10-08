package X;

import android.content.Context;
import org.webrtc.PeerConnectionFactory;

public final class Xm7 {
    public static boolean A00;

    /* JADX WARNING: type inference failed for: r0v6, types: [org.webrtc.NativeLibraryLoader, java.lang.Object] */
    public static final synchronized void A00(Context context, 02m r8, OWf oWf) {
        synchronized (Xm7.class) {
            0qQ.A0B(oWf, 2);
            if (!A00) {
                oWf.A02(6);
                r8.markerStart(29239048);
                0dV.A0C("jniperflogger");
                r8.markerPoint(29239048, "webrtc_load_start");
                0dV.A0C("webrtcLatest");
                PeerConnectionFactory.InitializationOptions.Builder builder = new PeerConnectionFactory.InitializationOptions.Builder(context);
                builder.nativeLibraryName = "webrtcLatest";
                builder.nativeLibraryLoader = new Object();
                PeerConnectionFactory.initialize(builder.createInitializationOptions());
                r8.markerPoint(29239048, "webrtc_load_end");
                r8.markerPoint(29239048, "igrtcjni_load_start");
                0dV.A0C("igrtcjniLatest");
                r8.markerPoint(29239048, "igrtcjni_load_end");
                r8.markerEnd(29239048, 2);
                oWf.A02(7);
                A00 = true;
            }
        }
    }
}
