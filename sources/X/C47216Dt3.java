package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.Dt3  reason: case insensitive filesystem */
public final class C47216Dt3 extends AnonymousClass0T0 implements C51954G8x {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final C47216Dt3 FC1() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47216Dt3) {
                C47216Dt3 dt3 = (C47216Dt3) obj;
                if (!0qQ.A0K(this.A00, dt3.A00) || !0qQ.A0K(this.A01, dt3.A01) || !0qQ.A0K(this.A02, dt3.A02) || !0qQ.A0K(this.A03, dt3.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String B6N() {
        return this.A01;
    }

    public final String BGL() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTSubInterestResponse", C48351Ed8.A00(this));
    }

    public final String getEmoji() {
        return this.A00;
    }

    public final String getName() {
        return this.A03;
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0E(this.A00) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + C41845B3m.A00(this.A03);
    }

    public C47216Dt3(String str, String str2, String str3, String str4) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }
}
