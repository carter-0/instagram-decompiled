package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ACRType;
import com.instagram.model.reels.ReelType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CmK  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44868CmK {
    public static Map A00(C239583Ha r5) {
        String str;
        String str2;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (r5.AY6() != null) {
            ACRType AY6 = r5.AY6();
            if (AY6 != null) {
                str2 = AY6.A00;
            } else {
                str2 = null;
            }
            A1H.put(AnonymousClass000.A00(493), str2);
        }
        if (r5.AY9() != null) {
            A1H.put("acr_metadata_id", r5.AY9());
        }
        if (r5.AYU() != null) {
            A1H.put("action_text", r5.AYU());
        }
        if (r5.getAudioClusterId() != null) {
            A1H.put("audio_cluster_id", r5.getAudioClusterId());
        }
        if (r5.AqW() != null) {
            A1H.put(AnonymousClass000.A00(1218), r5.AqW());
        }
        if (r5.Aqd() != null) {
            A1H.put(AnonymousClass000.A00(1219), r5.Aqd());
        }
        if (r5.BEY() != null) {
            C41845B3m.A0x(r5.BEY(), A1H);
        }
        1Xj Bf4 = r5.Bf4();
        if (Bf4 != null) {
            A1H.put("preview_media", Bf4.A1C());
        }
        if (r5.Bl4() != null) {
            A1H.put(AnonymousClass000.A00(756), r5.Bl4());
        }
        if (r5.Bl5() != null) {
            ReelType Bl5 = r5.Bl5();
            if (Bl5 != null) {
                str = Bl5.A00;
            } else {
                str = null;
            }
            A1H.put(AnonymousClass000.A00(757), str);
        }
        List Bxo = r5.Bxo();
        if (Bxo != null) {
            ArrayList A0r = AnonymousClass7TG.A0r(Bxo);
            Iterator it = Bxo.iterator();
            while (it.hasNext()) {
                C41846B3n.A1U(A0r, it);
            }
            A1H.put(AnonymousClass000.A00(1833), A0r);
        }
        if (r5.getTitle() != null) {
            C41845B3m.A12(r5.getTitle(), A1H);
        }
        if (r5.C9A() != null) {
            DT1 C9A = r5.C9A();
            if (C9A != null) {
                treeUpdaterJNI = C9A.FHC();
            }
            A1H.put("track_schema", treeUpdaterJNI);
        }
        if (r5.C9L() != null) {
            A1H.put("tracking_token", r5.C9L());
        }
        return 0Yt.A0B(A1H);
    }
}
