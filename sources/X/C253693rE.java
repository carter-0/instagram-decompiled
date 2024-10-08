package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.3rE  reason: invalid class name and case insensitive filesystem */
public final class C253693rE extends AnonymousClass0T0 implements C253703rF {
    public final Integer A00;
    public final Integer A01;
    public final String A02;
    public final List A03;

    public final C253693rE F8S() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C253693rE) {
                C253693rE r5 = (C253693rE) obj;
                if (!0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A03;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.A00;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.A02;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.A01;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode3 + i;
    }

    public final List AvS() {
        return this.A03;
    }

    public final Integer B1c() {
        return this.A00;
    }

    public final String BKL() {
        return this.A02;
    }

    public final Integer Bym() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTQuietTimeWindowResponse", C48349Ed6.A00(this));
    }

    public C253693rE(Integer num, Integer num2, String str, List list) {
        this.A03 = list;
        this.A00 = num;
        this.A02 = str;
        this.A01 = num2;
    }
}
