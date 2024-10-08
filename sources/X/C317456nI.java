package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.Arrays;

/* renamed from: X.6nI  reason: invalid class name and case insensitive filesystem */
public class C317456nI implements C317466nJ {
    public final C317876nz A00;
    public final ImageUrl A01;
    public final C317476nK A02;
    public final C317486nL A03;

    public C317456nI(C317486nL r3) {
        0qQ.A0B(r3, 1);
        this.A02 = C317476nK.EMOJI;
        this.A03 = r3;
        this.A00 = null;
        this.A01 = new SimpleImageUrl(C336957fS.A00(r3.A01, r3.A02));
    }

    public final C317486nL B0p() {
        return this.A03;
    }

    public final C317876nz BzU() {
        return this.A00;
    }

    public final C317476nK CAW() {
        return this.A02;
    }

    public final ImageUrl CCI() {
        return this.A01;
    }

    public final boolean CKf() {
        C317486nL r0 = this.A03;
        if (r0 == null || !C337097fg.A00(r0)) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        C317876nz BzU;
        Object obj2;
        Object obj3;
        if (obj instanceof C317466nJ) {
            if (obj == this) {
                return true;
            }
            if (this.A02 == C317476nK.EMOJI) {
                obj2 = this.A03;
                if (obj2 != null) {
                    obj3 = ((C317466nJ) obj).B0p();
                }
            } else {
                C317876nz r1 = this.A00;
                if (!(r1 == null || (BzU = ((C317466nJ) obj).BzU()) == null)) {
                    obj2 = r1.A0Z;
                    obj3 = BzU.A0Z;
                }
            }
            if (0qQ.A0K(obj2, obj3)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Object obj;
        C317476nK r1 = this.A02;
        if (r1 == C317476nK.EMOJI) {
            obj = this.A03;
        } else {
            C317876nz r0 = this.A00;
            if (r0 != null) {
                obj = r0.A0Z;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return Arrays.hashCode(new Object[]{r1, obj});
    }

    public C317456nI(C317876nz r3) {
        0qQ.A0B(r3, 1);
        this.A02 = C317476nK.STICKER;
        this.A03 = null;
        this.A00 = r3;
        this.A01 = ((C317966o8) r3.A0O.get(0)).A0H;
    }

    public C317456nI() {
        this.A02 = C317476nK.PLUS_BUTTON;
        this.A03 = null;
        this.A00 = null;
        this.A01 = null;
    }
}
