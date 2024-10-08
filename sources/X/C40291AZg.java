package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.AZg  reason: case insensitive filesystem */
public final class C40291AZg implements C317466nJ, Comparable {
    public long A00;
    public ImageUrl A01;
    public C317476nK A02;
    public C317876nz A03;
    public C317486nL A04;

    public final boolean CKf() {
        return false;
    }

    public final ArrayList A00() {
        int ordinal = this.A02.ordinal();
        if (ordinal == 0) {
            C317876nz r0 = this.A03;
            r0.getClass();
            return r0.A01();
        } else if (ordinal == 1) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            int i = 0;
            while (true) {
                C317486nL r02 = this.A04;
                r02.getClass();
                if (i < r02.A02.length()) {
                    A1A.append("\\u");
                    A1A.append(Integer.toHexString(this.A04.A02.charAt(i)));
                    i++;
                } else {
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    A1C.add(A1A.toString());
                    return A1C;
                }
            }
        } else {
            throw AnonymousClass7TE.A1B("Unknown recent item type.");
        }
    }

    public final C317486nL B0p() {
        return this.A04;
    }

    public final C317876nz BzU() {
        return this.A03;
    }

    public final C317476nK CAW() {
        return this.A02;
    }

    public final ImageUrl CCI() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return -Long.signum(this.A00 - ((C40291AZg) obj).A00);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C40291AZg) {
            C40291AZg aZg = (C40291AZg) obj;
            if (!2PP.A00(aZg.A00(), A00()) || !2PP.A00(aZg.A01, this.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C40291AZg(C317486nL r3, long j) {
        this.A02 = C317476nK.EMOJI;
        this.A01 = new SimpleImageUrl(C336957fS.A00(r3.A01, r3.A02));
        this.A04 = r3;
        this.A00 = j;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{A00(), this.A01});
    }

    public C40291AZg() {
    }
}
