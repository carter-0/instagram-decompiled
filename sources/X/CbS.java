package X;

import com.instagram.api.schemas.PhraseIntf;
import com.instagram.api.schemas.WordOffset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class CbS {
    public static Map A00(PhraseIntf phraseIntf) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (phraseIntf.B1f() != null) {
            A1H.put("end_time_in_ms", phraseIntf.B1f());
        }
        if (phraseIntf.BcF() != null) {
            A1H.put("phrase", phraseIntf.BcF());
        }
        if (phraseIntf.Byo() != null) {
            A1H.put("start_time_in_ms", phraseIntf.Byo());
        }
        if (phraseIntf.CGh() != null) {
            List<WordOffset> CGh = phraseIntf.CGh();
            ArrayList arrayList = null;
            if (CGh != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (WordOffset wordOffset : CGh) {
                    if (wordOffset != null) {
                        arrayList.add(wordOffset.FHC());
                    }
                }
            }
            A1H.put("word_offsets", arrayList);
        }
        return 0Yt.A0B(A1H);
    }
}
