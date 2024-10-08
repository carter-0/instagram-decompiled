package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.8WD  reason: invalid class name */
public abstract class AnonymousClass8WD {
    public static final 1Er A00(Fragment fragment, 07U r9, 0sL r10) {
        if (fragment.mView == null) {
            return null;
        }
        AnonymousClass07Z viewLifecycleOwner = fragment.getViewLifecycleOwner();
        AnonymousClass0xx A00 = AnonymousClass07a.A00(viewLifecycleOwner);
        AnonymousClass9KF r3 = new AnonymousClass9KF(viewLifecycleOwner, r9, r10, (AnonymousClass4D7) null, 27);
        return 1Eo.A03(AnonymousClass05K.A00, 19B.A00, r3, A00);
    }
}
