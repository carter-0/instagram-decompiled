package X;

import android.content.Context;
import android.os.Looper;
import java.util.List;

/* renamed from: X.KuK  reason: case insensitive filesystem */
public abstract class C63275KuK {
    public static final AnonymousClass2U7 A00(Context context, List list, int i, int i2) {
        Context context2 = context;
        List list2 = list;
        AnonymousClass7TF.A1C(context, 0, list);
        if (0qQ.A0K(Looper.myLooper(), Looper.getMainLooper())) {
            throw AnonymousClass7TE.A0z("SuggestionsMediaRepository: Cannot call loadMedia on main thread");
        } else if (!C2604245p.A03(context)) {
            return C66104MBm.A00;
        } else {
            AnonymousClass8XR r4 = new AnonymousClass8XR(context);
            0rm A11 = C51965G9l.A11();
            A11.A00 = 0sn.A00;
            return C242173Sx.A0C(2YX.A01(new C58185Inp(34, new C58231IoZ(A11, r4, new Object(), AnonymousClass8XO.PHOTO_AND_VIDEO, list2, context2, i2, 0), A11)), i);
        }
    }
}
