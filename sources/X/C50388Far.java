package X;

import com.instagram.model.direct.DirectShareTarget;
import java.util.List;

/* renamed from: X.Far  reason: case insensitive filesystem */
public final class C50388Far implements C74498Pvs {
    public final /* synthetic */ EEP A00;

    public final C16744V4b DLe() {
        return new EKF(this, 0);
    }

    public C50388Far(EEP eep) {
        this.A00 = eep;
    }

    public final List Brr() {
        return Dba.A0e(this.A00.A0r);
    }

    public final boolean CKe() {
        if (this.A00.A0r.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean CQi() {
        if (!this.A00.A0U) {
            return false;
        }
        return true;
    }

    public final boolean CbU(DirectShareTarget directShareTarget) {
        return this.A00.A0r.containsKey(directShareTarget.A09());
    }

    public final boolean Cdg(DirectShareTarget directShareTarget) {
        return this.A00.A0l.Cdh(directShareTarget);
    }

    public final boolean Es4(DirectShareTarget directShareTarget) {
        return EEP.A0L(this.A00, directShareTarget);
    }

    public final boolean CW2(DirectShareTarget directShareTarget) {
        return directShareTarget.A0I();
    }
}
