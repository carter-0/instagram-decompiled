package X;

import com.instagram.api.schemas.Lyrics;
import com.instagram.api.schemas.Phrase;
import com.instagram.api.schemas.WordOffset;
import com.instagram.api.schemas.WordOffsetImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4DC  reason: invalid class name */
public abstract class AnonymousClass4DC {
    public static Lyrics parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            ArrayList arrayList = null;
            while (r6.A1J() != 16L.A09) {
                String A0q = r6.A0q();
                r6.A1J();
                if ("phrases".equals(A0q)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r6.A1J() != 16L.A08) {
                            Phrase parseFromJson = CbT.parseFromJson(r6);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r6.A0z();
            }
            if (arrayList != null || !(r6 instanceof 0c9)) {
                return new Lyrics(arrayList);
            }
            ((0c9) r6).A03.A00("phrases", "Lyrics");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r5, Lyrics lyrics) {
        r5.A0c();
        List<Phrase> list = lyrics.A00;
        if (list != null) {
            16P.A03(r5, "phrases");
            for (Phrase phrase : list) {
                if (phrase != null) {
                    r5.A0c();
                    Integer num = phrase.A00;
                    if (num != null) {
                        r5.A0P(AnonymousClass000.A00(1308), num.intValue());
                    }
                    String str = phrase.A02;
                    if (str != null) {
                        r5.A0R("phrase", str);
                    }
                    Integer num2 = phrase.A01;
                    if (num2 != null) {
                        r5.A0P(AnonymousClass000.A00(4036), num2.intValue());
                    }
                    List<WordOffset> list2 = phrase.A03;
                    if (list2 != null) {
                        16P.A03(r5, C273654mx.A00(3491));
                        for (WordOffset wordOffset : list2) {
                            if (wordOffset != null) {
                                WordOffsetImpl FDS = wordOffset.FDS();
                                r5.A0c();
                                r5.A0P("end_index", FDS.A00);
                                r5.A0P(C273654mx.A00(2314), FDS.A01);
                                r5.A0P("start_index", FDS.A02);
                                r5.A0P(C273654mx.A00(3361), FDS.A03);
                                r5.A0S(C273654mx.A00(3435), FDS.A04);
                                r5.A0Z();
                            }
                        }
                        r5.A0Y();
                    }
                    r5.A0Z();
                }
            }
            r5.A0Y();
        }
        r5.A0Z();
    }
}
