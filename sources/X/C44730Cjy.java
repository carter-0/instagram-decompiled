package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.DirectAudioFallbackUrl;
import com.instagram.feed.audio.AudioIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cjy  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44730Cjy {
    public static Map A00(AudioIntf audioIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (audioIntf.Adp() != null) {
            A1H.put("audio_src", audioIntf.Adp());
        }
        if (audioIntf.Adq() != null) {
            A1H.put("audio_src_expiration_timestamp_us", audioIntf.Adq());
        }
        if (audioIntf.AzI() != null) {
            A1H.put(TraceFieldType.Duration, audioIntf.AzI());
        }
        ArrayList arrayList = null;
        if (audioIntf.B3k() != null) {
            DirectAudioFallbackUrl B3k = audioIntf.B3k();
            if (B3k != null) {
                treeUpdaterJNI = B3k.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("fallback", treeUpdaterJNI);
        }
        if (audioIntf.CGD() != null) {
            List CGD = audioIntf.CGD();
            if (CGD != null) {
                arrayList = AnonymousClass7TE.A1C();
                Iterator it = CGD.iterator();
                while (it.hasNext()) {
                    C41847B3o.A1Y(arrayList, it);
                }
            }
            A1H.put(AnonymousClass000.A00(1932), arrayList);
        }
        if (audioIntf.CGE() != null) {
            A1H.put(AnonymousClass000.A00(1933), audioIntf.CGE());
        }
        return 0Yt.A0B(A1H);
    }
}
