package com.instagram.genai.promptservice.service;

import X.AnonymousClass000;
import X.AnonymousClass62O;
import X.AnonymousClass62Q;
import X.AnonymousClass7TE;
import X.BqL;
import X.BqN;
import X.BqO;
import X.C250663lr;
import X.C41845B3m;
import X.C61038Jvc;
import X.C61079JwH;
import X.C62615Kim;
import X.Dbq;
import X.N49;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class GenAISuggestedPromptsService {
    public static final GenAISuggestedPromptsService A00 = new Object();

    public static final ArrayList A00(List list) {
        AnonymousClass62O r5;
        C250663lr optionalTreeField;
        String A07;
        ImmutableList requiredCompactedStringListField;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C250663lr A0V = C41845B3m.A0V(it);
            String A072 = A0V.A07("text");
            boolean z = true;
            if (!(A072 == null || A072.length() == 0)) {
                String str = null;
                String A09 = A0V.A09("thumbnail_uri");
                if (A0V.getOptionalEnumField(3, AnonymousClass000.A00(356), C62615Kim.UNSET_OR_UNRECOGNIZED_ENUM_VALUE) != C62615Kim.TRENDING) {
                    z = false;
                }
                String A0B = A0V.A0B(AnonymousClass000.A00(617));
                Class<BqO> cls = BqO.class;
                C250663lr optionalTreeField2 = A0V.getOptionalTreeField(6, "metadata", cls, 1938749531);
                if (optionalTreeField2 == null || (requiredCompactedStringListField = optionalTreeField2.getRequiredCompactedStringListField(0, AnonymousClass000.A00(5303))) == null) {
                    r5 = null;
                } else {
                    r5 = AnonymousClass62Q.A03(requiredCompactedStringListField);
                }
                C250663lr optionalTreeField3 = A0V.getOptionalTreeField(6, "metadata", cls, 1938749531);
                N49 n49 = null;
                if (!(optionalTreeField3 == null || (optionalTreeField = optionalTreeField3.getOptionalTreeField(1, "author", BqN.class, 2095970621)) == null || (A07 = optionalTreeField.A07("instagram_user_id")) == null)) {
                    n49 = new N49(A07, optionalTreeField.getOptionalStringField(1, Dbq.A03()), 47);
                }
                C250663lr optionalTreeField4 = A0V.getOptionalTreeField(5, AnonymousClass000.A00(616), BqL.class, -1052619497);
                if (optionalTreeField4 != null) {
                    str = optionalTreeField4.A07(AnonymousClass000.A00(152));
                }
                A1C.add(new C61038Jvc(new C61079JwH((Object) r5, (Object) n49, str, 17), A072, A09, A0B, z));
            }
        }
        return A1C;
    }
}
