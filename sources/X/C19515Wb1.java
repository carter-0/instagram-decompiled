package X;

import android.graphics.RectF;
import android.view.View;
import com.instagram.android.R;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.Wb1  reason: case insensitive filesystem */
public final class C19515Wb1 implements XC0 {
    public final View A00;
    public final IgProgressImageView A01;
    public final VWP A02;
    public final C17535VZo A03;
    public final VTR A04;

    public C19515Wb1(View view) {
        0qQ.A0B(view, 1);
        this.A00 = view;
        this.A03 = new C17535VZo(view, R.id.content);
        this.A04 = new VTR(view);
        this.A02 = new VWP(view, R.id.content);
        this.A01 = (IgProgressImageView) AnonymousClass7TE.A0b(view, R.id.photo);
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
