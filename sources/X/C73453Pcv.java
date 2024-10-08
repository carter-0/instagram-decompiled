package X;

import com.instagram.direct.inbox.DirectInviteContactViewModel;
import com.instagram.model.direct.DirectShareTarget;
import java.util.function.Predicate;

/* renamed from: X.Pcv  reason: case insensitive filesystem */
public final class C73453Pcv implements Predicate {
    public final int A00;
    public final Object A01;

    public C73453Pcv(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* synthetic */ boolean test(Object obj) {
        switch (this.A00) {
            case 1:
                DirectInviteContactViewModel directInviteContactViewModel = (DirectInviteContactViewModel) this.A01;
                DirectShareTarget directShareTarget = (DirectShareTarget) obj;
                if (!directShareTarget.A0S || !directShareTarget.A0K.equals(directInviteContactViewModel.A06)) {
                    return false;
                }
                return true;
            case 3:
                return ((C69415Nkv) obj).A00((AnonymousClass2Ep) this.A01);
            default:
                return C51971G9r.A1a(obj, (0sP) this.A01);
        }
    }
}
