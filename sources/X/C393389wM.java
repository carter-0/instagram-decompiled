package X;

import com.instagram.api.schemas.LyricsIntf;
import com.instagram.api.schemas.PhraseIntf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.9wM  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C393389wM {
    public static Map A00(LyricsIntf lyricsIntf) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (lyricsIntf.BcI() != null) {
            List<PhraseIntf> BcI = lyricsIntf.BcI();
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (PhraseIntf phraseIntf : BcI) {
                if (phraseIntf != null) {
                    A1C.add(phraseIntf.FHC());
                }
            }
            A1H.put("phrases", A1C);
        }
        return 0Yt.A0B(A1H);
    }
}
