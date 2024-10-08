package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* renamed from: X.Olg  reason: case insensitive filesystem */
public final class C71491Olg implements AnonymousClass03Q {
    public final /* synthetic */ double A00;
    public final /* synthetic */ ViewGroup.LayoutParams A01;
    public final /* synthetic */ ViewGroup A02;
    public final /* synthetic */ Fragment A03;

    public final 04k Cvn(View view, 04k r7) {
        0qQ.A0B(r7, 1);
        02M A05 = r7.A00.A05(3);
        0qQ.A07(A05);
        ViewGroup.LayoutParams layoutParams = this.A01;
        layoutParams.height = (int) (((double) ((DbV.A05(this.A03).getDisplayMetrics().heightPixels - A05.A03) - A05.A00)) * this.A00);
        this.A02.setLayoutParams(layoutParams);
        return r7;
    }

    public C71491Olg(ViewGroup.LayoutParams layoutParams, ViewGroup viewGroup, Fragment fragment, double d) {
        this.A03 = fragment;
        this.A01 = layoutParams;
        this.A00 = d;
        this.A02 = viewGroup;
    }
}
