package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.igds.components.gradient.IGGradientView;

public final class UEA extends C249703kE {
    public TextView A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public final RecyclerView A04;
    public final C252063oV A05;
    public final IGGradientView A06;
    public final IGGradientView A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UEA(View view) {
        super(view);
        0qQ.A0B(view, 1);
        C252063oV A002 = 2b1.A00(view.requireViewById(R.id.hscroll_header));
        this.A05 = A002;
        A002.EeU(new C19296WTe(this, 3));
        this.A04 = DbX.A0K(view);
        this.A07 = (IGGradientView) view.requireViewById(R.id.fade_gradient_top);
        this.A06 = (IGGradientView) view.requireViewById(R.id.fade_gradient_bottom);
    }
}
