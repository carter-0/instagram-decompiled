package X;

import java.io.IOException;

/* renamed from: X.Cig  reason: case insensitive filesystem */
public abstract class C44662Cig {
    public static C61065Jw3 parseFromJson(16F r8) {
        String A00;
        String A002;
        0qQ.A0B(r8, 0);
        try {
            Integer num = null;
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            Integer num2 = null;
            Integer num3 = null;
            while (true) {
                16L A1J = r8.A1J();
                16L r3 = 16L.A09;
                A00 = C273654mx.A00(3308);
                A002 = C273654mx.A00(3309);
                if (A1J == r3) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r8);
                if (A002.equals(A17)) {
                    num = AnonymousClass7TF.A0X(r8);
                } else if (A00.equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r8);
                } else {
                    num3 = C41847B3o.A13(r8, num3, A17, "reaction");
                }
                r8.A0z();
            }
            if (num == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A002, r8, "DirectBotMessageMetadata.SentimentData");
            } else if (num2 != null || !(r8 instanceof 0c9)) {
                return new C61065Jw3((Object) num3, num2.intValue(), num.intValue(), 8);
            } else {
                AnonymousClass7TF.A1L(A00, r8, "DirectBotMessageMetadata.SentimentData");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
