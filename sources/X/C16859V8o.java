package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.V8o  reason: case insensitive filesystem */
public abstract class C16859V8o {
    public static final 2dZ A00(FragmentActivity fragmentActivity, C307786Rm r3) {
        AnonymousClass7TG.A1N(r3, fragmentActivity);
        for (Fragment A00 = C308206Td.A00(r3); A00 != null; A00 = A00.mParentFragment) {
            if (A00 instanceof C249453jo) {
                return ((C249453jo) A00).AYJ();
            }
        }
        return DbT.A0K(fragmentActivity);
    }
}
