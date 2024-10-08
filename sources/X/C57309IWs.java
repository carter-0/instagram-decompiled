package X;

import android.graphics.RectF;

/* renamed from: X.IWs  reason: case insensitive filesystem */
public final class C57309IWs implements XC0 {
    public final /* synthetic */ RectF A00;
    public final /* synthetic */ C55497Hif A01;

    public final void CLk() {
    }

    public final void Ev3() {
    }

    public C57309IWs(RectF rectF, C55497Hif hif) {
        this.A00 = rectF;
        this.A01 = hif;
    }

    public final /* synthetic */ RectF AhX() {
        return this.A00;
    }

    public final RectF Beu() {
        return this.A00;
    }

    public final void Eui(boolean z) {
        AnonymousClass3W1 r2;
        boolean z2;
        C55497Hif hif = this.A01;
        if (z) {
            if (hif != null) {
                r2 = hif.A00;
                z2 = true;
            } else {
                return;
            }
        } else if (hif != null) {
            r2 = hif.A00;
            z2 = false;
        } else {
            return;
        }
        if (r2.A1t != z2) {
            r2.A1t = z2;
            AnonymousClass3W1.A00(r2, 64);
        }
    }
}
