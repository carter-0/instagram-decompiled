package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class KG8 extends C232222tE {
    public final 0sP A00;

    public KG8(0sP r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C60628Job(DbT.A0D(layoutInflater, viewGroup, R.layout.iglive_bottom_sheet_title_description, false));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r3.length() == 0) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r6, X.C249703kE r7) {
        /*
            r5 = this;
            X.LiY r6 = (X.C64813LiY) r6
            X.Job r7 = (X.C60628Job) r7
            r4 = 0
            X.AnonymousClass7TF.A1H(r6, r7)
            java.lang.String r3 = r6.A02
            if (r3 == 0) goto L_0x0013
            int r0 = r3.length()
            r1 = 0
            if (r0 != 0) goto L_0x0014
        L_0x0013:
            r1 = 1
        L_0x0014:
            r2 = 8
            android.widget.TextView r0 = r7.A02
            if (r1 == 0) goto L_0x0035
            r0.setVisibility(r2)
        L_0x001d:
            android.widget.TextView r0 = r7.A00
            r0.setVisibility(r2)
            java.lang.String r1 = r6.A00
            if (r1 == 0) goto L_0x003c
            int r0 = r1.length()
            if (r0 == 0) goto L_0x003c
            android.widget.TextView r0 = r7.A01
            r0.setText(r1)
            r0.setVisibility(r4)
            return
        L_0x0035:
            r0.setText(r3)
            r0.setVisibility(r4)
            goto L_0x001d
        L_0x003c:
            android.widget.TextView r0 = r7.A01
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KG8.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return C64813LiY.class;
    }

    public KG8() {
        this(C66365MOw.A00);
    }
}
