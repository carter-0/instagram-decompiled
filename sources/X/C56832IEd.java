package X;

import android.view.View;
import android.widget.Magnifier;

/* renamed from: X.IEd  reason: case insensitive filesystem */
public final class C56832IEd implements JS1 {
    public static final C56832IEd A00 = new Object();

    public final /* bridge */ /* synthetic */ JNN ALP(View view, C268024cd r10, float f, float f2, float f3, long j, boolean z, boolean z2) {
        Magnifier build;
        if (z) {
            build = new Magnifier(view);
        } else {
            long FH8 = r10.FH8(j);
            float F06 = r10.F06(f);
            float F062 = r10.F06(f2);
            Magnifier.Builder builder = new Magnifier.Builder(view);
            if (FH8 != 9205357640488583168L) {
                builder.setSize(AnonymousClass1GB.A01(C288025bF.A02(FH8)), AnonymousClass1GB.A01(C288025bF.A00(FH8)));
            }
            if (!Float.isNaN(F06)) {
                builder.setCornerRadius(F06);
            }
            if (!Float.isNaN(F062)) {
                builder.setElevation(F062);
            }
            if (!Float.isNaN(f3)) {
                builder.setInitialZoom(f3);
            }
            builder.setClippingEnabled(z2);
            build = builder.build();
        }
        return new C56830IEb(build);
    }

    public final boolean Akr() {
        return true;
    }
}
