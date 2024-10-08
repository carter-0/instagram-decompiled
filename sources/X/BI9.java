package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class BI9 extends AnonymousClass0T0 implements C51948G8r {
    public final boolean A00;

    public final BI9 FDB() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof BI9) && this.A00 == ((BI9) obj).A00);
    }

    public final boolean CRv() {
        return this.A00;
    }

    public final int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public BI9(boolean z) {
        this.A00 = z;
    }

    public final TreeUpdaterJNI FHC() {
        return C41845B3m.A0T("XDTUserSettingBundlesInfo", C41845B3m.A0u("is_eligible_for_creator_settings_review", Boolean.valueOf(this.A00), C41845B3m.A0t()));
    }
}
