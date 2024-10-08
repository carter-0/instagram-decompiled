package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4ET  reason: invalid class name */
public final class AnonymousClass4ET extends AnonymousClass0T0 implements AnonymousClass4EU {
    public final Integer A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public AnonymousClass4ET(Integer num, Integer num2, String str, String str2, String str3, boolean z) {
        0qQ.A0B(str, 2);
        0qQ.A0B(str2, 5);
        this.A00 = num;
        this.A02 = str;
        this.A05 = z;
        this.A01 = num2;
        this.A03 = str2;
        this.A04 = str3;
    }

    public final AnonymousClass4ET F5T() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4ET) {
                AnonymousClass4ET r5 = (AnonymousClass4ET) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A02, r5.A02) || this.A05 != r5.A05 || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Integer B42() {
        return this.A00;
    }

    public final Integer BMr() {
        return this.A01;
    }

    public final String BhK() {
        return this.A04;
    }

    public final boolean CHk() {
        return this.A05;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTLinkedFBUser", B6H.A00(this));
    }

    public final String getId() {
        return this.A02;
    }

    public final String getName() {
        return this.A03;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        Integer num = this.A00;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode3 = ((hashCode * 31) + this.A02.hashCode()) * 31;
        int i2 = 1237;
        if (this.A05) {
            i2 = 1231;
        }
        int i3 = (hashCode3 + i2) * 31;
        Integer num2 = this.A01;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int hashCode4 = (((i3 + hashCode2) * 31) + this.A03.hashCode()) * 31;
        String str = this.A04;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode4 + i;
    }
}
