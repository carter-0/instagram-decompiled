package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.Dt1  reason: case insensitive filesystem */
public final class C47214Dt1 extends AnonymousClass0T0 implements C51953G8w {
    public final Integer A00;
    public final Integer A01;
    public final String A02;
    public final List A03;

    public final C47214Dt1 F8R() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47214Dt1) {
                C47214Dt1 dt1 = (C47214Dt1) obj;
                if (!0qQ.A0K(this.A03, dt1.A03) || !0qQ.A0K(this.A00, dt1.A00) || !0qQ.A0K(this.A02, dt1.A02) || !0qQ.A0K(this.A01, dt1.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
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
        return new TreeUpdaterJNI("XDTQuietTimeInterval", C48347Ed4.A00(this));
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0C(this.A03) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public C47214Dt1(Integer num, Integer num2, String str, List list) {
        this.A03 = list;
        this.A00 = num;
        this.A02 = str;
        this.A01 = num2;
    }
}
