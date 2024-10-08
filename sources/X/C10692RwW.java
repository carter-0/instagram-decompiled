package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.RwW  reason: case insensitive filesystem */
public final class C10692RwW {
    public C8134QhS A00;
    public final 0hq A01;
    public final Fragment A02;
    public final FragmentActivity A03;

    public C10692RwW(Fragment fragment, FragmentActivity fragmentActivity) {
        0hq r0;
        this.A02 = fragment;
        this.A03 = fragmentActivity;
        if ((fragment == null || (r0 = fragment.getChildFragmentManager()) == null) && (r0 = fragmentActivity.getSupportFragmentManager()) == null) {
            throw AnonymousClass7TE.A0w("Input fragment or fragmentActivity cannot be null");
        }
        this.A01 = r0;
    }
}
