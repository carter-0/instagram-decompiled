package X;

import android.widget.Adapter;
import androidx.fragment.app.Fragment;
import java.util.Set;

/* renamed from: X.71d  reason: invalid class name and case insensitive filesystem */
public final class C3251271d extends C249383je {
    public final AnonymousClass343 A00;
    public final Fragment A01;
    public final AnonymousClass71P A02;

    public C3251271d(Fragment fragment, C3251171c r4, AnonymousClass71P r5, Set set) {
        this.A01 = fragment;
        this.A02 = r5;
        this.A00 = new AnonymousClass343((Adapter) r5, (AnonymousClass4DV) fragment, new C3251371e(r4, r5, set), new C3251471f(r4, r5, set));
    }

    public final void onScroll(C238133Ar r3, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int A03 = AnonymousClass0fD.A03(-1547958063);
        if (!this.A01.isResumed()) {
            i6 = 1308880662;
        } else {
            this.A00.A01();
            i6 = -816583881;
        }
        AnonymousClass0fD.A0A(i6, A03);
    }

    public final void onScrollStateChanged(C238133Ar r3, int i) {
        AnonymousClass0fD.A0A(-1257678141, AnonymousClass0fD.A03(-1154911985));
    }
}
