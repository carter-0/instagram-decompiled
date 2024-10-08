package X;

import com.google.common.collect.ImmutableList;
import com.instagram.music.common.model.LyricsPhrase;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.9SD  reason: invalid class name */
public abstract class AnonymousClass9SD {
    public static AnonymousClass9SE parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            AnonymousClass9SE r3 = new AnonymousClass9SE();
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            while (r7.A1J() != 16L.A09) {
                String A0q = r7.A0q();
                r7.A1J();
                if ("phrases".equals(A0q)) {
                    ArrayList arrayList = null;
                    if (r7.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r7.A1J() != 16L.A08) {
                            LyricsPhrase parseFromJson = VF6.parseFromJson(r7);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    r3.A00 = arrayList;
                }
                r7.A0z();
            }
            if (r3.A00.isEmpty()) {
                return r3;
            }
            List<LyricsPhrase> list = r3.A00;
            ArrayList arrayList2 = new ArrayList(list.size() + 1);
            arrayList2.add(0, new LyricsPhrase((List) null, 0, "…"));
            for (LyricsPhrase lyricsPhrase : list) {
                String str = lyricsPhrase.A01;
                if (str == null || str.length() == 0) {
                    arrayList2.add(new LyricsPhrase((List) null, lyricsPhrase.A00, "…"));
                } else {
                    arrayList2.add(lyricsPhrase);
                }
            }
            int size = arrayList2.size() - 1;
            if (!0qQ.A0K(((LyricsPhrase) arrayList2.get(size)).A01, "…")) {
                Object obj = arrayList2.get(size);
                0qQ.A07(obj);
                arrayList2.add(new LyricsPhrase((List) null, ((LyricsPhrase) obj).A00 + 3000, "…"));
            }
            r3.A00 = ImmutableList.copyOf((Collection) arrayList2);
            return r3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
