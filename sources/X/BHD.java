package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class BHD extends AnonymousClass0T0 implements DUS {
    public final Boolean A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public final BHD FB3(1E9 r1) {
        return this;
    }

    public final BHD FB4(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BHD) {
                BHD bhd = (BHD) obj;
                if (!0qQ.A0K(this.A01, bhd.A01) || !0qQ.A0K(this.A00, bhd.A00) || !0qQ.A0K(this.A03, bhd.A03) || !0qQ.A0K(this.A02, bhd.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String BP8() {
        return this.A01;
    }

    public final Boolean BU7() {
        return this.A00;
    }

    public final List Bal() {
        return this.A03;
    }

    public final String Biw() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTStoryQuizParticipantInfoDict", C44431Cep.A00(this));
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + C41845B3m.A00(this.A02);
    }

    public BHD(Boolean bool, String str, String str2, List list) {
        this.A01 = str;
        this.A00 = bool;
        this.A03 = list;
        this.A02 = str2;
    }

    public final DUS E8y(1E9 r1) {
        return this;
    }
}
