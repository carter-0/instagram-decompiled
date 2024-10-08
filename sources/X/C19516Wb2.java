package X;

import android.graphics.RectF;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.Wb2  reason: case insensitive filesystem */
public final class C19516Wb2 implements XC0 {
    public final View A00;
    public final VWP A01;
    public final C17535VZo A02;
    public final VTR A03;
    public final VYY A04;

    public C19516Wb2(View view) {
        0qQ.A0B(view, 1);
        this.A02 = new C17535VZo(view, R.id.content);
        this.A03 = new VTR(view);
        this.A04 = new VYY(view);
        this.A01 = new VWP(view, R.id.content);
        this.A00 = view;
    }

    public final /* synthetic */ void Eui(boolean z) {
    }

    public final /* synthetic */ RectF AhX() {
        return 0nA.A0F(this.A00);
    }

    public final RectF Beu() {
        return 0nA.A0F(this.A00);
    }

    public final void CLk() {
        this.A00.setVisibility(4);
    }

    public final void Ev3() {
        this.A00.setVisibility(0);
    }
}
