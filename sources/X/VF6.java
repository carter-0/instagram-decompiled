package X;

import com.instagram.music.common.model.LyricsPhrase;
import com.instagram.music.common.model.WordOffset;
import java.io.IOException;
import java.util.ArrayList;

public abstract class VF6 {
    public static LyricsPhrase parseFromJson(16F r7) {
        int i = 0;
        0qQ.A0B(r7, 0);
        try {
            LyricsPhrase lyricsPhrase = new LyricsPhrase();
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("start_time_in_ms".equals(A17)) {
                    lyricsPhrase.A00 = r7.A1D();
                } else {
                    ArrayList arrayList = null;
                    if ("phrase".equals(A17)) {
                        String A0l = AnonymousClass7TG.A0l(r7);
                        0qQ.A0B(A0l, 0);
                        lyricsPhrase.A01 = A0l;
                    } else if ("word_offsets".equals(A17)) {
                        if (r7.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r7.A1J() != 16L.A08) {
                                WordOffset parseFromJson = VF7.parseFromJson(r7);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        lyricsPhrase.A02 = arrayList;
                    }
                }
                r7.A0z();
            }
            String str = lyricsPhrase.A01;
            int length = str.length() - 1;
            boolean z = false;
            while (i <= length) {
                int i2 = length;
                if (!z) {
                    i2 = i;
                }
                boolean A1U = Dba.A1U(0qQ.A00(str.charAt(i2), 32));
                if (!z) {
                    if (!A1U) {
                        z = true;
                    } else {
                        i++;
                    }
                } else if (A1U) {
                    length--;
                }
            }
            lyricsPhrase.A01 = Dba.A0c(str, length, i);
            return lyricsPhrase;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
