package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.4q1  reason: invalid class name */
public final class AnonymousClass4q1 extends AnonymousClass0T0 implements C274374oC {
    public final Boolean A00;
    public final Boolean A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final List A06;

    public final AnonymousClass4q1 F31() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4q1) {
                AnonymousClass4q1 r5 = (AnonymousClass4q1) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A06, r5.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.A00;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.A02;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.A03;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool2 = this.A01;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num3 = this.A04;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.A05;
        int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List list = this.A06;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode6 + i;
    }

    public final Boolean B1o() {
        return this.A00;
    }

    public final Integer B50() {
        return this.A02;
    }

    public final Integer B52() {
        return this.A03;
    }

    public final Integer BMb() {
        return this.A04;
    }

    public final Integer BmL() {
        return this.A05;
    }

    public final List BmR() {
        return this.A06;
    }

    public final Boolean CTS() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTTextPostAppMediaFediverseInfo", C54795HTc.A00(this));
    }

    public AnonymousClass4q1(Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, Integer num4, List list) {
        this.A00 = bool;
        this.A02 = num;
        this.A03 = num2;
        this.A01 = bool2;
        this.A04 = num3;
        this.A05 = num4;
        this.A06 = list;
    }
}
