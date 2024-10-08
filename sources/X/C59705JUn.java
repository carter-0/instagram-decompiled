package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.JUn  reason: case insensitive filesystem */
public abstract class C59705JUn {
    public static final List A00(String str) {
        Jv8 jv8;
        0qQ.A0B(str, 0);
        List<String> A18 = DbV.A18(str, "␞");
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (String A00 : A18) {
            try {
                jv8 = C59706JUo.parseFromJson(16P.A00(A00));
            } catch (IOException e) {
                0kD.A06("UnschematizedCompositionListConverter", "Failed to deserialize UnschematizedUnifiedComposition from Clips draft", e);
                jv8 = null;
            }
            if (jv8 != null) {
                A1C.add(jv8);
            }
        }
        return A1C;
    }
}
