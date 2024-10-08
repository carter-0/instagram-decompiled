package X;

import com.instagram.model.keyword.Keyword;
import com.instagram.model.keyword.KeywordRecommendations;
import java.io.IOException;
import java.util.ArrayList;

public abstract class O1C {
    public static KeywordRecommendations parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            KeywordRecommendations keywordRecommendations = new KeywordRecommendations();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                ArrayList arrayList = null;
                if (C41846B3n.A1Y(r5, A0q)) {
                    String A0l = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l, 0);
                    keywordRecommendations.A00 = A0l;
                } else if (C41845B3m.A1E(A0q)) {
                    String A0l2 = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l2, 0);
                    keywordRecommendations.A01 = A0l2;
                } else if ("keywords".equals(A0q)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            Keyword parseFromJson = C67385Mn1.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    keywordRecommendations.A02 = arrayList;
                }
                r5.A0z();
            }
            return keywordRecommendations;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
