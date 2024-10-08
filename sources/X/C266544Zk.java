package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.4Zk  reason: invalid class name and case insensitive filesystem */
public final class C266544Zk extends AnonymousClass0T0 implements C266554Zl {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;

    public C266544Zk(String str, String str2, String str3, String str4, String str5, List list) {
        0qQ.A0B(str, 2);
        0qQ.A0B(str2, 3);
        0qQ.A0B(str3, 4);
        0qQ.A0B(str4, 5);
        0qQ.A0B(str5, 6);
        this.A05 = list;
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
    }

    public final C266544Zk F3P(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C266544Zk) {
                C266544Zk r5 = (C266544Zk) obj;
                if (!0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A05;
        return ((((((((((list == null ? 0 : list.hashCode()) * 31) + this.A00.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A04.hashCode();
    }

    public final List B3g() {
        return this.A05;
    }

    public final String BfT() {
        return this.A01;
    }

    public final String CAh() {
        return this.A04;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTGenericSuggestionCard", CY6.A00(this));
    }

    public final String getId() {
        return this.A00;
    }

    public final String getSubtitle() {
        return this.A02;
    }

    public final String getTitle() {
        return this.A03;
    }

    public final C266554Zl E7S(1E9 r1) {
        return this;
    }
}
