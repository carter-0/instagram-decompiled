package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class NOG extends C232222tE {
    public final C70492O8r A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C68026Mys(DbT.A0D(layoutInflater, viewGroup, R.layout.pending_threads_story_replies_row, false), this.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r8, X.C249703kE r9) {
        /*
            r7 = this;
            X.Ou1 r8 = (X.C71976Ou1) r8
            X.Mys r9 = (X.C68026Mys) r9
            r3 = 0
            boolean r4 = X.AnonymousClass7TF.A1U(r3, r8, r9)
            int r6 = r8.A00
            boolean r0 = r8.A01
            r5 = 0
            android.widget.TextView r2 = r9.A03
            if (r6 <= 0) goto L_0x0056
            android.content.Context r0 = r9.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131820670(0x7f11007e, float:1.9274061E38)
            java.lang.String r0 = X.DbY.A0d(r1, r6, r0)
        L_0x001f:
            r2.setText(r0)
            r5 = 1
        L_0x0023:
            android.widget.TextView r1 = r9.A04
            android.graphics.Typeface r0 = r1.getTypeface()
            r1.setTypeface(r0, r5)
            android.graphics.Typeface r0 = r1.getTypeface()
            r2.setTypeface(r0, r5)
            boolean r0 = r8.A02
            android.view.View r2 = r9.A01
            if (r0 == 0) goto L_0x0049
            r0 = 1050253722(0x3e99999a, float:0.3)
            r2.setAlpha(r0)
            r1 = 0
            r2.setClickable(r3)
            X.3oV r0 = r9.A05
        L_0x0045:
            r0.setVisibility(r1)
            return
        L_0x0049:
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.setAlpha(r0)
            r2.setClickable(r4)
            X.3oV r0 = r9.A05
            r1 = 8
            goto L_0x0045
        L_0x0056:
            android.content.Context r1 = r9.A00
            if (r0 == 0) goto L_0x0062
            r0 = 2131959990(0x7f1320b6, float:1.9556636E38)
            java.lang.String r0 = r1.getString(r0)
            goto L_0x001f
        L_0x0062:
            r0 = 2131959989(0x7f1320b5, float:1.9556634E38)
            X.DbT.A18(r1, r2, r0)
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NOG.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return C71976Ou1.class;
    }

    public NOG(C70492O8r o8r) {
        this.A00 = o8r;
    }
}
