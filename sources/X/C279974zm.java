package X;

import com.instagram.api.schemas.TextPostAppSuggestionCardProfileContextIdentifier;
import java.io.IOException;

/* renamed from: X.4zm  reason: invalid class name and case insensitive filesystem */
public abstract class C279974zm {
    public static C279984zo parseFromJson(16F r8) {
        String str;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str2 = null;
            TextPostAppSuggestionCardProfileContextIdentifier textPostAppSuggestionCardProfileContextIdentifier = null;
            while (r8.A1J() != 16L.A09) {
                String A0q = r8.A0q();
                r8.A1J();
                if ("display_string".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                } else if ("identifier".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    textPostAppSuggestionCardProfileContextIdentifier = (TextPostAppSuggestionCardProfileContextIdentifier) TextPostAppSuggestionCardProfileContextIdentifier.A01.get(str);
                    if (textPostAppSuggestionCardProfileContextIdentifier == null) {
                        textPostAppSuggestionCardProfileContextIdentifier = TextPostAppSuggestionCardProfileContextIdentifier.UNRECOGNIZED;
                    }
                }
                r8.A0z();
            }
            if (str2 == null && (r8 instanceof 0c9)) {
                ((0c9) r8).A03.A00("display_string", "TextPostAppSuggestionCardProfileContextImpl");
            } else if (textPostAppSuggestionCardProfileContextIdentifier != null || !(r8 instanceof 0c9)) {
                return new C279984zo(textPostAppSuggestionCardProfileContextIdentifier, str2);
            } else {
                ((0c9) r8).A03.A00("identifier", "TextPostAppSuggestionCardProfileContextImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
