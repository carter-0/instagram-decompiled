package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.TextPostAppSuggestionCardProfileContextIdentifier;

/* renamed from: X.4zo  reason: invalid class name and case insensitive filesystem */
public final class C279984zo extends AnonymousClass0T0 implements C279994zp {
    public final TextPostAppSuggestionCardProfileContextIdentifier A00;
    public final String A01;

    public C279984zo(TextPostAppSuggestionCardProfileContextIdentifier textPostAppSuggestionCardProfileContextIdentifier, String str) {
        0qQ.A0B(str, 1);
        0qQ.A0B(textPostAppSuggestionCardProfileContextIdentifier, 2);
        this.A01 = str;
        this.A00 = textPostAppSuggestionCardProfileContextIdentifier;
    }

    public final C279984zo FCg() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C279984zo) {
                C279984zo r5 = (C279984zo) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00.hashCode();
    }

    public final String AyB() {
        return this.A01;
    }

    public final TextPostAppSuggestionCardProfileContextIdentifier BEe() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTTextPostAppSuggestionCardProfileContext", C44523CgJ.A00(this));
    }
}
