package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.modal.ModalActivity;

/* renamed from: X.EhA  reason: case insensitive filesystem */
public abstract class C48601EhA {
    public static final Object A00(C307896Rx r5) {
        AnonymousClass2ZW r0;
        FragmentActivity A04 = C308206Td.A04(r5);
        boolean z = false;
        if (A04 instanceof AnonymousClass2ZW) {
            r0 = (AnonymousClass2ZW) A04;
        } else {
            if ((A04 instanceof ModalActivity) && C71172bH.A00() != null) {
                r0 = (AnonymousClass2ZW) C71172bH.A00();
                z = true;
            }
            return null;
        }
        if (r0 != null) {
            r0.Alb().Ewb(EXF.A0J, AnonymousClass36W.FOLLOWERS_SHARE);
            if (z) {
                A04.finish();
            }
        }
        return null;
    }
}
