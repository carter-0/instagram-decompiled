package X;

import android.app.Activity;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Egn  reason: case insensitive filesystem */
public abstract class C48578Egn {
    public static final Boolean A00(C307896Rx r4) {
        C307786Rm r0 = r4.A03;
        boolean z = true;
        if (r0 == null) {
            return true;
        }
        Activity A00 = C61190ls.A00((Activity) r0.A00);
        if (A00 instanceof AnonymousClass2ZP) {
            if (((AnonymousClass2ZP) A00).C3p() != 0) {
                z = false;
            }
            return Boolean.valueOf(z);
        } else if (A00 instanceof ModalActivity) {
            return false;
        } else {
            return true;
        }
    }
}
