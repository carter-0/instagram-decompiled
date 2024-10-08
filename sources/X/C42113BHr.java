package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.TextEntityType;

/* renamed from: X.BHr  reason: case insensitive filesystem */
public final class C42113BHr extends AnonymousClass0T0 implements C46290DTt {
    public final TextEntityType A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final C42113BHr FCc() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42113BHr) {
                C42113BHr bHr = (C42113BHr) obj;
                if (!0qQ.A0K(this.A01, bHr.A01) || this.A00 != bHr.A00 || !0qQ.A0K(this.A02, bHr.A02) || !0qQ.A0K(this.A03, bHr.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String AyC() {
        return this.A01;
    }

    public final TextEntityType B1t() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTTextEntity", C44519CgF.A00(this));
    }

    public final String getId() {
        return this.A02;
    }

    public final String getUrl() {
        return this.A03;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0O(this.A01)) + AnonymousClass7TG.A0E(this.A02)) * 31) + C41845B3m.A00(this.A03);
    }

    public C42113BHr(TextEntityType textEntityType, String str, String str2, String str3) {
        AnonymousClass7TG.A1O(str, textEntityType);
        this.A01 = str;
        this.A00 = textEntityType;
        this.A02 = str2;
        this.A03 = str3;
    }
}
