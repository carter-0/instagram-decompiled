package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class IKK implements AnonymousClass2WK {
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public final 2WL Cfk(2WI r8, long j) {
        0qQ.A0B(r8, 0);
        LayoutInflater from = LayoutInflater.from(r8.A00.A04);
        View inflate = from.inflate(R.layout.comment_poll_consumption, (ViewGroup) null);
        if (this.A03) {
            C51967G9n.A0x(inflate, R.id.header_section, 0);
        }
        if (this.A01) {
            boolean z = this.A02;
            int i = R.id.creator_view_footer_text_aligned_right;
            if (z) {
                i = R.id.creator_view_footer_text_aligned_left;
            }
            C51967G9n.A0x(inflate, i, 0);
            C51967G9n.A0x(inflate, R.id.footer_nux, 0);
        }
        ViewGroup A0I = DbX.A0I(inflate, R.id.option_rows);
        int i2 = this.A00;
        for (int i3 = 0; i3 < i2; i3++) {
            A0I.addView(from.inflate(R.layout.comment_poll_consumption_option_row, A0I, false));
        }
        return G9w.A0T(inflate, j);
    }

    public IKK(int i, boolean z, boolean z2, boolean z3) {
        this.A00 = i;
        this.A02 = z;
        this.A03 = z2;
        this.A01 = z3;
    }

    public final /* bridge */ /* synthetic */ boolean CSo(Object obj) {
        return C51975G9x.A1Y(obj, this);
    }
}
