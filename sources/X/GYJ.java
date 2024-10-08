package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class GYJ {
    public static final ArrayList A00(C267324bN r6) {
        ImmutableList copyOf;
        C250953mK r1;
        HashMap A01;
        C247733gp A1T;
        String str;
        C247733gp A1T2;
        C250953mK r0;
        List list = r6.A06().A0k;
        if (list == null) {
            copyOf = null;
        } else {
            copyOf = ImmutableList.copyOf((Collection) list);
        }
        Map A0L = C231122qu.A0L(copyOf);
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator A0u = AnonymousClass7TF.A0u(A0L);
        while (A0u.hasNext()) {
            Map.Entry entry = (Map.Entry) A0u.next();
            C250953mK r4 = (C250953mK) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            int ordinal = r4.ordinal();
            if (ordinal == 9) {
                r1 = C250953mK.CAPTION_LENGTH_OPTIMIZATION_TYPE;
                1Xj r02 = r6.A06().A0K;
                if (r02 == null || (A1T = r02.A1T()) == null || (str = A1T.A0d) == null || str.length() == 0) {
                    intValue = 840001;
                }
                A01 = A01(r1, intValue);
            } else if (ordinal != 16) {
                if (ordinal == 11) {
                    r0 = C250953mK.TEXT_FONT_SIZE_TYPE;
                } else if (ordinal != 12) {
                    A01 = A01(r4, intValue);
                } else {
                    r0 = C250953mK.TEXT_FONT_STYLE_TYPE;
                }
                A01 = A01(r0, intValue);
            } else {
                r1 = C250953mK.TEXT_FONT_COLOR_TYPE;
                1Xj r03 = r6.A06().A0K;
                if (r03 == null || (A1T2 = r03.A1T()) == null || A1T2.A0e == null) {
                    intValue = 1250001;
                }
                A01 = A01(r1, intValue);
            }
            A1C.add(A01);
        }
        return A1C;
    }

    public static final HashMap A01(C250953mK r3, int i) {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("optimization_type", String.valueOf(r3.A00));
        A1E.put("option_value", String.valueOf(i));
        return A1E;
    }
}
