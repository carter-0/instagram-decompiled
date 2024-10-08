package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class KFF extends C232222tE {
    public final AnonymousClass0iw A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C60671JpI(DbT.A0D(layoutInflater, viewGroup, R.layout.layout_leaderboard_user, false));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0042, code lost:
        if (r1 == 0) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r7, X.C249703kE r8) {
        /*
            r6 = this;
            X.JyG r7 = (X.C61164JyG) r7
            X.JpI r8 = (X.C60671JpI) r8
            X.AnonymousClass7TG.A1N(r7, r8)
            android.widget.TextView r1 = r8.A05
            int r0 = r7.A00
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.setText(r0)
            android.widget.TextView r1 = r8.A04
            int r0 = r7.A01
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.setText(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r8.A07
            com.instagram.direct.emojipong.data.EmojiPongUser r5 = r7.A02
            java.lang.String r0 = r5.A02
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.DbS.A0V(r0)
            X.0iw r0 = r6.A00
            r2.setUrl(r1, r0)
            android.widget.TextView r1 = r8.A06
            java.lang.String r0 = r5.A04
            r1.setText(r0)
            android.widget.TextView r2 = r8.A02
            java.lang.String r0 = r5.A01
            r2.setText(r0)
            r4 = 0
            if (r0 == 0) goto L_0x0044
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0046
        L_0x0044:
            r0 = 8
        L_0x0046:
            r2.setVisibility(r0)
            android.widget.TextView r3 = r8.A03
            android.content.Context r0 = r8.A00
            android.content.res.Resources r2 = r0.getResources()
            r1 = 2131820699(0x7f11009b, float:1.927412E38)
            int r0 = r5.A00
            java.lang.String r0 = X.DbY.A0d(r2, r0, r1)
            r3.setText(r0)
            android.widget.TextView r1 = r8.A01
            boolean r0 = r7.A03
            if (r0 != 0) goto L_0x0065
            r4 = 8
        L_0x0065:
            r1.setVisibility(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KFF.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return C61164JyG.class;
    }

    public KFF(AnonymousClass0iw r1) {
        this.A00 = r1;
    }
}
