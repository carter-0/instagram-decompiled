package X;

import com.instagram.api.schemas.Phrase;
import com.instagram.api.schemas.WordOffsetImpl;
import java.io.IOException;
import java.util.ArrayList;

public abstract class CbT {
    public static Phrase parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            Integer num2 = null;
            ArrayList arrayList = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("end_time_in_ms".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r7);
                } else if ("phrase".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                } else if ("start_time_in_ms".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r7);
                } else if ("word_offsets".equals(A17)) {
                    if (r7.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r7.A1J() != 16L.A08) {
                            WordOffsetImpl parseFromJson = C44585ChJ.parseFromJson(r7);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r7.A0z();
            }
            return new Phrase(num, num2, str, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
