package X;

import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;

/* renamed from: X.Qh2  reason: case insensitive filesystem */
public final class C8110Qh2 extends C7465QEu {
    public S4V A00;
    public S4V A01;
    public S4V A02;
    public final ViewStub A03;
    public final ViewStub A04;
    public final ViewStub A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8110Qh2(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A03 = JTR.A0X(view, R.id.leftView);
        this.A04 = JTR.A0X(view, R.id.middleView);
        this.A05 = JTR.A0X(view, R.id.rightView);
    }
}
