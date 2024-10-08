package X;

import com.instagram.api.schemas.AudioNoteResponseInfoIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CUj  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44066CUj {
    public static Map A00(AudioNoteResponseInfoIntf audioNoteResponseInfoIntf) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (audioNoteResponseInfoIntf.Adh() != null) {
            A1H.put("audio_info", audioNoteResponseInfoIntf.Adh().FHC());
        }
        if (audioNoteResponseInfoIntf.BOB() != null) {
            A1H.put("logging_id", audioNoteResponseInfoIntf.BOB());
        }
        return 0Yt.A0B(A1H);
    }
}
