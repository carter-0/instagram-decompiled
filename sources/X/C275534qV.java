package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.4qV  reason: invalid class name and case insensitive filesystem */
public final class C275534qV extends AnonymousClass0T0 implements C275544qW {
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public C275534qV(String str, String str2, String str3, List list) {
        0qQ.A0B(list, 1);
        0qQ.A0B(str, 2);
        0qQ.A0B(str3, 4);
        this.A03 = list;
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    public final C275534qV F0H() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C275534qV) {
                C275534qV r5 = (C275534qV) obj;
                if (!0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((this.A03.hashCode() * 31) + this.A00.hashCode()) * 31;
        String str = this.A01;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.A02.hashCode();
    }

    public final List Abw() {
        return this.A03;
    }

    public final String Bid() {
        return this.A00;
    }

    public final String C2B() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAdsFeedbackInterfaceQuestion", HTE.A00(this));
    }

    public final String getText() {
        return this.A02;
    }
}
