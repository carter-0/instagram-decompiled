package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public final class Q2K extends C249403jg {
    public static final ViewGroup.MarginLayoutParams A01;
    public C10923S1b A00;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        marginLayoutParams.setMargins(0, 0, 0, 0);
        A01 = marginLayoutParams;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        AnonymousClass0fD.A0A(-1288031156, AnonymousClass0fD.A03(-200646024));
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        View A1D;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int height;
        int top;
        int i3;
        float f;
        int A03 = AnonymousClass0fD.A03(692404252);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.A0D;
        int A1a = linearLayoutManager.A1a();
        if (!(A1a == -1 || (A1D = linearLayoutManager.A1D(A1a)) == null)) {
            if (A1D.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) A1D.getLayoutParams();
            } else {
                marginLayoutParams = A01;
            }
            if (linearLayoutManager.A01 == 0) {
                height = A1D.getWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                if (linearLayoutManager.A07.getLayoutDirection() == 0) {
                    top = A1D.getLeft();
                    i3 = marginLayoutParams.leftMargin;
                } else {
                    top = height - A1D.getRight();
                    i3 = marginLayoutParams.rightMargin;
                }
            } else {
                height = marginLayoutParams.bottomMargin + A1D.getHeight() + marginLayoutParams.topMargin;
                top = A1D.getTop();
                i3 = marginLayoutParams.topMargin;
            }
            int i4 = -(top - i3);
            if (height == 0) {
                f = 0.0f;
            } else {
                f = ((float) i4) / ((float) height);
            }
            C10923S1b s1b = this.A00;
            C308276Tl A0P = DbS.A0P();
            C307786Rm r4 = s1b.A00;
            A0P.A01(r4);
            A0P.A02(Integer.valueOf(A1a));
            A0P.A03(Q0A.A00((double) f), 2);
            A0P.A03(Integer.valueOf(i4), 3);
            C307886Rw.A03(r4, s1b.A01, A0P.A00(), s1b.A02);
        }
        AnonymousClass0fD.A0A(-1546697251, A03);
    }
}
