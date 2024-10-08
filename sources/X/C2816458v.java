package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.58v  reason: invalid class name and case insensitive filesystem */
public final class C2816458v extends AnonymousClass0T0 implements C2816558w {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public C2816458v(String str, String str2, String str3, String str4, String str5) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        0qQ.A0B(str3, 3);
        0qQ.A0B(str4, 4);
        0qQ.A0B(str5, 5);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
    }

    public final C2816458v F5X() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2816458v) {
                C2816458v r5 = (C2816458v) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((this.A00.hashCode() * 31) + this.A01.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A04.hashCode();
    }

    public final String Bfj() {
        return this.A01;
    }

    public final String Bfk() {
        return this.A02;
    }

    public final String Bfl() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTLiveUserPayConsumptionSheetConfig", Kq9.A00(this));
    }

    public final String getDescription() {
        return this.A00;
    }

    public final String getTitle() {
        return this.A04;
    }
}
