package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;

/* renamed from: X.3Wp  reason: invalid class name and case insensitive filesystem */
public final class C242893Wp implements C242903Wq {
    public final Fragment A00;
    public final AnonymousClass311 A01;
    public final AnonymousClass2xI A02;
    public final AnonymousClass4DV A03;

    public C242893Wp(Fragment fragment, AnonymousClass311 r3, AnonymousClass2xI r4, AnonymousClass4DV r5) {
        0qQ.A0B(r5, 3);
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A00 = fragment;
    }

    public final void Cy8(View view) {
        Fragment fragment = this.A00;
        Context context = fragment.getContext();
        AnonymousClass2xI r2 = this.A02;
        if (r2 != null && fragment.mView != null && context != null) {
            ViewParent parent = this.A03.getScrollingViewProxy().getParent();
            0qQ.A0C(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            String string = context.getString(2131972990);
            0qQ.A07(string);
            r2.A00((ViewGroup) parent, string, new C377219Kz(view, 18), 1000, true);
        }
    }

    public final C2360732i BD7() {
        throw AnonymousClass00P.createAndThrow();
    }
}
