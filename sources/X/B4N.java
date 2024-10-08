package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class B4N {
    public static Map A00(C67061rp r3) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.getAdditionalAudioUsername() != null) {
            A1H.put("additional_audio_username", r3.getAdditionalAudioUsername());
        }
        if (r3.Adm() != null) {
            C67051rn Adm = r3.Adm();
            if (Adm != null) {
                treeUpdaterJNI = Adm.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("audio_reattribution_info", treeUpdaterJNI);
        }
        return 0Yt.A0B(A1H);
    }
}
