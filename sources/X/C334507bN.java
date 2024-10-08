package X;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: X.7bN  reason: invalid class name and case insensitive filesystem */
public final class C334507bN implements TextView.OnEditorActionListener {
    public final /* synthetic */ C334397bC A00;
    public final /* synthetic */ C53335GmL A01;
    public final /* synthetic */ C52971GgO A02;
    public final /* synthetic */ 0lr A03;

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        String str;
        boolean z;
        C335417cv r1;
        TextView textView2 = textView;
        0qQ.A0B(textView, 0);
        if (i == 0) {
            return false;
        }
        if (i == 4) {
            C52971GgO ggO = this.A02;
            Object value = ggO.A0V.getValue();
            C381459bn r5 = null;
            if (!(value instanceof C335417cv) || (r1 = (C335417cv) value) == null) {
                str = null;
                z = false;
            } else {
                str = r1.A06;
                z = r1.A0F;
                r5 = C334337b6.A01(r1);
            }
            C334337b6.A04(textView2, r5, this.A00, this.A01, ggO, this.A03, str, z);
            ggO.A0B.A01(new J6I(ggO, 18));
        }
        if (textView.getResources().getConfiguration().orientation != 2) {
            return true;
        }
        return false;
    }

    public C334507bN(C334397bC r1, C53335GmL gmL, C52971GgO ggO, 0lr r4) {
        this.A02 = ggO;
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = gmL;
    }
}
