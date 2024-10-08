package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AdMetadataType;

/* renamed from: X.3kt  reason: invalid class name and case insensitive filesystem */
public final class C250093kt extends AnonymousClass0T0 implements C250103ku {
    public final AdMetadataType A00;
    public final String A01;

    public C250093kt(AdMetadataType adMetadataType, String str) {
        0qQ.A0B(adMetadataType, 1);
        0qQ.A0B(str, 2);
        this.A00 = adMetadataType;
        this.A01 = str;
    }

    public final C250093kt F0F() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C250093kt) {
                C250093kt r5 = (C250093kt) obj;
                if (this.A00 != r5.A00 || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final AdMetadataType CAK() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAdMetadata", C41921B6x.A00(this));
    }

    public final String getValue() {
        return this.A01;
    }
}
