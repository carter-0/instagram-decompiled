package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;

public final class AVB implements C340467lJ {
    public int A00;
    public int A01;
    public Context A02;
    public View A03;
    public C340547lR A04;

    public final void Bet(AnonymousClass8GD r1, int i, int i2) {
    }

    public final Bitmap Bex() {
        return null;
    }

    public final boolean CVc() {
        return true;
    }

    public final void Eea(C340337l6 r1) {
    }

    public final void Ep8(Matrix matrix) {
    }

    public final void EpA(boolean z) {
    }

    public final void release() {
    }

    public final int Ajr() {
        return this.A00;
    }

    public final int Ajs() {
        return this.A01;
    }

    public final boolean CPC() {
        View view = this.A03;
        if (view != null) {
            int width = view.getWidth();
            int height = this.A03.getHeight();
            if (width > 0 && height > 0) {
                this.A01 = width;
                this.A00 = height;
            }
        }
        if (this.A01 <= 0 || this.A00 <= 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r2.A00 <= 0) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EQY(int r3, int r4) {
        /*
            r2 = this;
            int r0 = r2.A01
            if (r0 <= 0) goto L_0x0009
            int r1 = r2.A00
            r0 = 1
            if (r1 > 0) goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            r2.A01 = r3
            r2.A00 = r4
            if (r0 != 0) goto L_0x0019
            X.7lR r1 = r2.A04
            boolean r0 = r1.A0G
            if (r0 != 0) goto L_0x0019
            r1.A03()
        L_0x0019:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AVB.EQY(int, int):void");
    }

    public final Context getContext() {
        View view = this.A03;
        if (view != null) {
            return view.getContext();
        }
        return this.A02;
    }

    public final int getHeight() {
        View view = this.A03;
        if (view == null || view.getHeight() <= 0) {
            return this.A00;
        }
        return this.A03.getHeight();
    }

    public final View getView() {
        return this.A03;
    }

    public final int getWidth() {
        View view = this.A03;
        if (view == null || view.getWidth() <= 0) {
            return this.A01;
        }
        return this.A03.getWidth();
    }

    public final void EQX(C340547lR r1) {
        this.A04 = r1;
    }

    public final void EqU(View view) {
        this.A03 = view;
    }
}
