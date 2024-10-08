package X;

import android.view.View;

public final /* synthetic */ class IDE implements View.OnLayoutChangeListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C255783ui A01;
    public final /* synthetic */ C265844Wn A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ IDE(C255783ui r1, C265844Wn r2, float f, boolean z) {
        this.A02 = r2;
        this.A00 = f;
        this.A01 = r1;
        this.A03 = z;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C265884Wr.A02(this.A01, this.A02, this.A00, this.A03);
    }
}
