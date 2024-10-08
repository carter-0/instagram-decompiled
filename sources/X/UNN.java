package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class UNN extends AnonymousClass0T0 implements C21032XAl {
    public final Float A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;

    public final UNN F6k() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UNN) {
                UNN unn = (UNN) obj;
                if (!0qQ.A0K(this.A01, unn.A01) || !0qQ.A0K(this.A02, unn.A02) || !0qQ.A0K(this.A03, unn.A03) || !0qQ.A0K(this.A04, unn.A04) || !0qQ.A0K(this.A00, unn.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Integer BEG() {
        return this.A01;
    }

    public final Integer BEN() {
        return this.A02;
    }

    public final Float C58() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTNativeInfoCardText", C16841V7w.A00(this));
    }

    public final String getText() {
        return this.A03;
    }

    public final String getTextColor() {
        return this.A04;
    }

    public final int hashCode() {
        return (((((((AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public UNN(Float f, Integer num, Integer num2, String str, String str2) {
        this.A01 = num;
        this.A02 = num2;
        this.A03 = str;
        this.A04 = str2;
        this.A00 = f;
    }
}
