package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.60F  reason: invalid class name */
public final class AnonymousClass60F extends AnonymousClass0T0 implements AnonymousClass60G {
    public final Boolean A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public AnonymousClass60F(Boolean bool, Integer num, String str, String str2, List list) {
        0qQ.A0B(str, 3);
        0qQ.A0B(str2, 4);
        this.A04 = list;
        this.A01 = num;
        this.A02 = str;
        this.A03 = str2;
        this.A00 = bool;
    }

    public final AnonymousClass60F F8G(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass60F) {
                AnonymousClass60F r5 = (AnonymousClass60F) obj;
                if (!0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A04;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.A01;
        int hashCode2 = (((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode()) * 31;
        Boolean bool = this.A00;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode2 + i;
    }

    public final List B3g() {
        return this.A04;
    }

    public final Integer BWw() {
        return this.A01;
    }

    public final String Bhp() {
        return this.A02;
    }

    public final String Bhu() {
        return this.A03;
    }

    public final Boolean Bup() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTPromptPogResponseInfo", C44287CcV.A00(this));
    }
}
