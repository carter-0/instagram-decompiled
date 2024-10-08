package X;

import android.content.Context;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.WKk  reason: case insensitive filesystem */
public final class C19080WKk implements C263544Mk {
    public W8D A00;
    public final AnonymousClass4ND A01;
    public final XBl A02;

    public final /* synthetic */ void ACD(AnonymousClass4OL r1) {
    }

    public final /* synthetic */ void Dd6() {
    }

    public final /* synthetic */ void DyH(int i, int i2, float f) {
    }

    public final View AMc(Context context, C263624Ms r7, C263624Ms r8) {
        XBl xBl = this.A02;
        AnonymousClass4ND r3 = this.A01;
        UU6 uu6 = new UU6(context);
        uu6.setZOrderOnTop(false);
        W8D w8d = new W8D(r7, r3, xBl);
        this.A00 = w8d;
        uu6.getHolder().addCallback(w8d);
        return uu6;
    }

    public final Surface B9s() {
        W8D w8d = this.A00;
        if (w8d != null) {
            return w8d.A00;
        }
        return null;
    }

    public final /* synthetic */ AnonymousClass6KA BdH() {
        return AnonymousClass6KA.A00;
    }

    public final void D8W(ViewGroup viewGroup) {
    }

    public C19080WKk(AnonymousClass4ND r1, XBl xBl) {
        this.A01 = r1;
        this.A02 = xBl;
    }
}
