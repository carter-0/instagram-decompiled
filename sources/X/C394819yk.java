package X;

import android.text.Spannable;
import com.instagram.api.schemas.ClipsTextEmphasisMode;

/* renamed from: X.9yk  reason: invalid class name and case insensitive filesystem */
public abstract class C394819yk {
    public static final ClipsTextEmphasisMode A00(Spannable spannable, C358868bb r6) {
        C360708f1 r0;
        int i;
        Object obj;
        C306576Mr r02;
        Object obj2;
        if (!(r6 == null || (r0 = r6.A04) == null)) {
            Class A01 = r0.A01();
            String obj3 = spannable.toString();
            if (obj3 != null) {
                i = obj3.length();
            } else {
                i = 0;
            }
            Object[] spans = spannable.getSpans(0, i, A01);
            Object[] spans2 = spannable.getSpans(0, i, AnonymousClass91R.class);
            0qQ.A0B(spans, 0);
            if (spans.length == 0) {
                obj = null;
            } else {
                obj = spans[0];
            }
            AnonymousClass6MP r03 = (AnonymousClass6MP) obj;
            if (r03 == null || (r02 = r03.C57()) == null) {
                0qQ.A0B(spans2, 0);
                if (spans2.length == 0) {
                    obj2 = null;
                } else {
                    obj2 = spans2[0];
                }
                AnonymousClass6MP r04 = (AnonymousClass6MP) obj2;
                if (r04 != null) {
                    r02 = r04.C57();
                } else {
                    r02 = C306576Mr.DISABLED;
                }
            }
            int ordinal = r02.ordinal();
            if (ordinal == 1) {
                return ClipsTextEmphasisMode.DEFAULT;
            }
            if (ordinal == 2) {
                return ClipsTextEmphasisMode.INVERTED;
            }
            if (ordinal == 3) {
                return ClipsTextEmphasisMode.DEFAULT_OUTLINES;
            }
            if (ordinal == 4) {
                return ClipsTextEmphasisMode.INVERTED_OUTLINES;
            }
        }
        return ClipsTextEmphasisMode.DISABLED;
    }
}
