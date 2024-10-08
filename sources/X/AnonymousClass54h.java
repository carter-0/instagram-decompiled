package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.54h  reason: invalid class name */
public final class AnonymousClass54h extends AnonymousClass0T0 implements C279794zK {
    public final Integer A00;
    public final String A01;
    public final List A02;

    public final AnonymousClass54h F4L() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass54h) {
                AnonymousClass54h r5 = (AnonymousClass54h) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A01;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.A02;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.A00;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode2 + i;
    }

    public final String BKL() {
        return this.A01;
    }

    public final List BYc() {
        return this.A02;
    }

    public final Integer Bio() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGLeadGenQuestionCardInfoDict", CZ0.A00(this));
    }

    public AnonymousClass54h(Integer num, String str, List list) {
        this.A01 = str;
        this.A02 = list;
        this.A00 = num;
    }
}
