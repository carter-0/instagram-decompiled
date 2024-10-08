package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.quicksnap.capture.viewmodel.QuickSnapArchiveViewModel;

public final class EH9 extends C232232tF {
    public final AnonymousClass0iw A00;
    public final QuickSnapArchiveViewModel A01;

    public EH9(AnonymousClass0iw r2, QuickSnapArchiveViewModel quickSnapArchiveViewModel) {
        0qQ.A0B(quickSnapArchiveViewModel, 2);
        this.A00 = r2;
        this.A01 = quickSnapArchiveViewModel;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C47033DpP(DbT.A0D(layoutInflater, viewGroup, R.layout.layout_quick_snap_archive_item, false), this.A00, this.A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x011d, code lost:
        if (r6 == X.AnonymousClass05K.A01) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0039, code lost:
        if (((X.C61082JwK) r14.A0A.A0G.getValue()).A01 != false) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r13, X.C249703kE r14) {
        /*
            r12 = this;
            X.FYS r13 = (X.FYS) r13
            X.DpP r14 = (X.C47033DpP) r14
            r4 = 0
            X.AnonymousClass7TF.A1H(r13, r14)
            X.L9x r2 = r13.A00
            com.instagram.common.ui.widget.imageview.IgImageView r5 = r14.A09
            int r3 = r5.getWidth()
            com.instagram.model.mediasize.ImageInfo r1 = r2.A02
            if (r1 == 0) goto L_0x0072
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            com.instagram.model.mediasize.ExtendedImageUrl r1 = X.1iI.A05(r1, r0, r3)
            if (r1 == 0) goto L_0x0072
        L_0x001c:
            X.0iw r0 = r14.A05
            r5.setUrl(r1, r0)
        L_0x0021:
            android.view.View r3 = r14.A04
            java.util.List r9 = r2.A05
            boolean r0 = X.AnonymousClass7TE.A1b(r9)
            r11 = 0
            if (r0 == 0) goto L_0x003b
            com.instagram.quicksnap.capture.viewmodel.QuickSnapArchiveViewModel r0 = r14.A0A
            X.05G r0 = r0.A0G
            java.lang.Object r0 = r0.getValue()
            X.JwK r0 = (X.C61082JwK) r0
            boolean r1 = r0.A01
            r0 = 0
            if (r1 == 0) goto L_0x003d
        L_0x003b:
            r0 = 8
        L_0x003d:
            r3.setVisibility(r0)
            boolean r0 = X.AnonymousClass7TE.A1b(r9)
            if (r0 == 0) goto L_0x00ec
            com.instagram.common.ui.base.IgTextView r8 = r14.A06
            java.util.LinkedHashMap r7 = X.AnonymousClass7TE.A1H()
            java.util.Iterator r6 = r9.iterator()
        L_0x0050:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0077
            java.lang.Object r3 = r6.next()
            r0 = r3
            X.Ewp r0 = (X.C49510Ewp) r0
            java.lang.String r1 = r0.A01
            java.lang.Object r0 = r7.get(r1)
            if (r0 != 0) goto L_0x006c
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r7.put(r1, r0)
        L_0x006c:
            java.util.List r0 = (java.util.List) r0
            r0.add(r3)
            goto L_0x0050
        L_0x0072:
            com.instagram.common.typedurl.ImageUrl r1 = r2.A01
            if (r1 == 0) goto L_0x0021
            goto L_0x001c
        L_0x0077:
            java.util.Iterator r10 = X.AnonymousClass7TF.A0s(r7)
            boolean r0 = r10.hasNext()
            r6 = 0
            if (r0 != 0) goto L_0x00a6
            r7 = r6
        L_0x0083:
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            if (r7 == 0) goto L_0x008d
            java.lang.Object r6 = r7.getKey()
            java.lang.String r6 = (java.lang.String) r6
        L_0x008d:
            r8.setText(r6)
            com.instagram.common.ui.base.IgTextView r6 = r14.A08
            java.util.Iterator r1 = r9.iterator()
        L_0x0096:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00d5
            java.lang.Object r0 = r1.next()
            X.Ewp r0 = (X.C49510Ewp) r0
            int r0 = r0.A00
            int r11 = r11 + r0
            goto L_0x0096
        L_0x00a6:
            java.lang.Object r7 = r10.next()
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0083
            r0 = r7
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            int r3 = X.DbS.A05(r0)
        L_0x00bb:
            java.lang.Object r1 = r10.next()
            r0 = r1
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            int r0 = X.DbS.A05(r0)
            if (r3 >= r0) goto L_0x00ce
            r7 = r1
            r3 = r0
        L_0x00ce:
            boolean r0 = r10.hasNext()
            if (r0 != 0) goto L_0x00bb
            goto L_0x0083
        L_0x00d5:
            android.view.View r0 = r14.itemView
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            android.content.res.Resources r1 = X.AnonymousClass7TF.A0A(r0)
            r0 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r0 = X.C253673rC.A04(r1, r3, r0, r4, r4)
            r6.setText(r0)
        L_0x00ec:
            boolean r0 = r14.A00
            if (r0 != 0) goto L_0x00f8
            X.FrO r0 = new X.FrO
            r0.<init>(r14)
            r5.post(r0)
        L_0x00f8:
            java.lang.Integer r6 = r2.A03
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            android.view.View r0 = r14.itemView
            X.0qQ.A06(r0)
            X.3NG r3 = new X.3NG
            r3.<init>(r0)
            r3.A06 = r4
            if (r6 == r1) goto L_0x018d
            X.EHc r1 = new X.EHc
            r1.<init>()
        L_0x010f:
            r3.A04 = r1
            r3.A00()
            android.view.View r5 = r14.A02
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            if (r6 == r4) goto L_0x011f
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r1 = 0
            if (r6 != r0) goto L_0x0120
        L_0x011f:
            r1 = 1
        L_0x0120:
            r3 = 0
            r0 = 8
            if (r1 == 0) goto L_0x0126
            r0 = 0
        L_0x0126:
            r5.setVisibility(r0)
            android.view.View r1 = r14.A03
            r0 = 8
            if (r6 != r4) goto L_0x0130
            r0 = 0
        L_0x0130:
            r1.setVisibility(r0)
            android.view.View r1 = r14.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r6 == r0) goto L_0x013b
            r3 = 8
        L_0x013b:
            r1.setVisibility(r3)
            com.instagram.common.ui.base.IgTextView r3 = r14.A07
            com.instagram.quicksnap.capture.viewmodel.QuickSnapArchiveViewModel r0 = r14.A0A
            X.05G r5 = r0.A0G
            java.lang.Object r0 = r5.getValue()
            X.JwK r0 = (X.C61082JwK) r0
            boolean r0 = r0.A01
            r0 = r0 ^ 1
            int r0 = X.DbW.A00(r0)
            r3.setVisibility(r0)
            java.lang.Object r0 = r5.getValue()
            X.JwK r0 = (X.C61082JwK) r0
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x01ca
            java.lang.String r4 = r2.A04
            java.lang.Object r0 = r5.getValue()
            X.JwK r0 = (X.C61082JwK) r0
            java.lang.Object r0 = r0.A00
            java.util.LinkedHashSet r0 = (java.util.LinkedHashSet) r0
            java.util.Iterator r2 = r0.iterator()
            r1 = 0
        L_0x0170:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0195
            java.lang.Object r0 = r2.next()
            if (r1 >= 0) goto L_0x0184
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0184:
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0196
            int r1 = r1 + 1
            goto L_0x0170
        L_0x018d:
            r0 = 3
            X.EHe r1 = new X.EHe
            r1.<init>(r0, r14, r2)
            goto L_0x010f
        L_0x0195:
            r1 = -1
        L_0x0196:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            int r1 = r0.intValue()
            if (r1 < 0) goto L_0x01c6
            java.lang.Object r0 = r5.getValue()
            X.JwK r0 = (X.C61082JwK) r0
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x01c6
            int r0 = r1 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = r0.toString()
            if (r1 == 0) goto L_0x01c7
            r0 = r1
        L_0x01b7:
            r3.setText(r0)
            r0 = 2131239658(0x7f0822ea, float:1.809563E38)
            if (r1 == 0) goto L_0x01c2
            r0 = 2131239659(0x7f0822eb, float:1.8095631E38)
        L_0x01c2:
            r3.setBackgroundResource(r0)
            return
        L_0x01c6:
            r1 = 0
        L_0x01c7:
            java.lang.String r0 = ""
            goto L_0x01b7
        L_0x01ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EH9.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return FYS.class;
    }
}
