package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class NR3 extends C310586bI {
    public int A00;
    public C254783t2 A01;
    public String A02 = "";
    public boolean A03;
    public boolean A04 = true;
    public boolean A05;
    public final Activity A06;
    public final AnonymousClass0iw A07;
    public final UserSession A08;
    public final 2el A09;
    public final C55804Hnk A0A;
    public final AnonymousClass7H8 A0B;
    public final C332937Xa A0C;
    public final List A0D = AnonymousClass7TE.A1C();
    public final AnonymousClass0eK A0E;
    public final AnonymousClass0eK A0F;
    public final AnonymousClass0eK A0G;

    public final int getItemViewType(int i) {
        return 0;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final boolean hasStableIds() {
        return true;
    }

    public /* synthetic */ NR3(Activity activity, AnonymousClass0iw r4, UserSession userSession, 2el r6, C55804Hnk hnk, C332937Xa r8, AnonymousClass0eK r9, AnonymousClass0eK r10, AnonymousClass0eK r11) {
        AnonymousClass7H8 r0 = new AnonymousClass7H8(userSession);
        this.A06 = activity;
        this.A08 = userSession;
        this.A07 = r4;
        this.A0A = hnk;
        this.A09 = r6;
        this.A0G = r9;
        this.A0E = r10;
        this.A0F = r11;
        this.A0C = r8;
        this.A0B = r0;
    }

    public final int getCount() {
        return this.A0D.size();
    }

    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A0D.get(i);
    }

    public final long getItemId(int i) {
        Long A10;
        List list = this.A0D;
        String str = ((AnonymousClass77B) list.get(i)).A0S;
        if (str == null || (A10 = AnonymousClass7TE.A10(str)) == null) {
            return (long) list.get(i).hashCode();
        }
        return A10.longValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007d, code lost:
        if (X.0qQ.A0K(r14.getId(), r11.A02) != false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0086, code lost:
        if (r1 == false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0052, code lost:
        if (r0 == false) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r32, android.view.View r33, android.view.ViewGroup r34) {
        /*
            r31 = this;
            r10 = r33
            r13 = 2
            r5 = r34
            X.0qQ.A0B(r5, r13)
            r11 = r31
            if (r33 != 0) goto L_0x0031
            android.app.Activity r0 = r11.A06
            X.0eK r4 = r11.A0F
            X.7Xa r3 = r11.A0C
            r2 = 0
            X.AnonymousClass7TF.A1C(r0, r2, r3)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131628170(0x7f0e108a, float:1.8883625E38)
            android.view.View r10 = X.DbU.A0A(r1, r5, r0, r2)
            X.OIL r1 = new X.OIL
            r1.<init>(r10, r3, r4)
            r10.setTag(r1)
            X.I9u r0 = new X.I9u
            r0.<init>(r1, r13)
            r10.addOnAttachStateChangeListener(r0)
        L_0x0031:
            java.lang.Object r0 = r10.getTag()
            java.lang.String r2 = "null cannot be cast to non-null type com.instagram.direct.fragment.permanentmedia.aggregatedmedia.DirectAggregatedMediaViewerBinder.Holder<*>"
            X.0qQ.A0C(r0, r2)
            X.OIL r0 = (X.OIL) r0
            java.lang.String r1 = r0.A01
            r9 = 0
            r3 = r32
            if (r1 == 0) goto L_0x0054
            java.util.List r0 = r11.A0D
            java.lang.Object r0 = r0.get(r3)
            X.77B r0 = (X.AnonymousClass77B) r0
            java.lang.String r0 = r0.A0S
            boolean r0 = r1.equals(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0055
        L_0x0054:
            r1 = 0
        L_0x0055:
            int r0 = r11.A00
            if (r3 != r0) goto L_0x0066
            boolean r0 = r11.A03
            if (r0 != 0) goto L_0x0061
            boolean r0 = r11.A05
            if (r0 == 0) goto L_0x0066
        L_0x0061:
            if (r1 == 0) goto L_0x0066
            r11.A05 = r9
        L_0x0065:
            return r10
        L_0x0066:
            java.util.List r0 = r11.A0D
            java.lang.Object r12 = r0.get(r3)
            X.77B r12 = (X.AnonymousClass77B) r12
            X.1Xj r14 = r12.A0E
            if (r14 == 0) goto L_0x007f
            java.lang.String r1 = r14.getId()
            java.lang.String r0 = r11.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            r1 = 0
            if (r0 == 0) goto L_0x0080
        L_0x007f:
            r1 = 1
        L_0x0080:
            boolean r0 = r11.A04
            if (r0 == 0) goto L_0x0088
            r24 = 1
            if (r1 != 0) goto L_0x008a
        L_0x0088:
            r24 = 0
        L_0x008a:
            java.lang.Object r8 = r10.getTag()
            X.0qQ.A0C(r8, r2)
            X.OIL r8 = (X.OIL) r8
            X.7H8 r7 = r11.A0B
            com.instagram.common.session.UserSession r0 = r11.A08
            r30 = r0
            X.0iw r6 = r11.A07
            android.app.Activity r0 = r11.A06
            r29 = r0
            X.0eK r0 = r11.A0E
            r25 = r0
            X.0eK r15 = r11.A0F
            X.3t2 r0 = r11.A01
            r28 = r0
            X.2el r5 = r11.A09
            r0 = r30
            X.AnonymousClass7TF.A1H(r0, r6)
            r0 = r29
            X.AnonymousClass7TF.A1D(r8, r13, r0)
            r18 = 9
            r0 = r18
            X.0qQ.A0B(r5, r0)
            X.1a8 r4 = r8.A04
            r4.A01()
            X.3oV r0 = r8.A06
            r27 = r0
            int r1 = r12.A03
            r0.setVisibility(r1)
            X.0eM r0 = r7.A04
            java.lang.Object r1 = r0.getValue()
            X.OJV r1 = (X.OJV) r1
            X.3oV r0 = r8.A05
            r1.A00(r0, r12, r15)
            java.lang.String r0 = r12.A0S
            r8.A01 = r0
            boolean r26 = r7.A02(r6, r8, r12, r15)
            X.MdB r0 = r8.A00
            if (r0 == 0) goto L_0x00e6
            r0.Dds()
        L_0x00e6:
            boolean r0 = r12.A0s
            r17 = r0
            java.lang.Integer r1 = X.C51967G9n.A0l(r17)
            X.7HA r0 = r7.A01
            r2 = r0
            boolean r0 = r12.A0d
            r16 = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r3 = r1
            r1 = r16
            X.MdB r2 = r2.A00(r6, r3, r0, r1)
            if (r17 == 0) goto L_0x01dc
            boolean r0 = X.AnonymousClass3OC.A02()
            if (r0 != 0) goto L_0x01dc
            android.view.View r0 = r27.getView()
            com.instagram.feed.widget.IgProgressImageView r0 = (com.instagram.feed.widget.IgProgressImageView) r0
            r0.A04()
            X.3oV r1 = r8.A09
            int r0 = r12.A06
            r1.setVisibility(r0)
            X.3oV r13 = r8.A07
            int r0 = r12.A05
            r13.setVisibility(r0)
            android.view.View r3 = r8.A03
            android.content.Context r1 = r8.A02
            r0 = 2131976403(0x7f1360d3, float:1.9589926E38)
            X.DbU.A12(r1, r3, r0)
            r1 = 1
            if (r15 == 0) goto L_0x01d3
            java.lang.Object r0 = r15.get()
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r1)
            if (r0 == 0) goto L_0x01d3
            X.Nhg r0 = r8.A0A
            r1 = 8
            android.view.View r0 = r0.A09
            r0.setVisibility(r1)
        L_0x013d:
            android.view.View r9 = r13.getView()
            r5.A04(r9)
            java.util.List r3 = r7.A03
            r3.remove(r9)
            java.lang.String r0 = r12.A0T
            if (r0 != 0) goto L_0x014f
            java.lang.String r0 = ""
        L_0x014f:
            X.30a r1 = X.AnonymousClass30Y.A00(r12, r6, r0)
            X.OzU r0 = new X.OzU
            r0.<init>(r2)
            r1.A00(r0)
            X.C51967G9n.A0z(r9, r1, r5)
            r3.add(r9)
            X.1aU r3 = r12.A0C
            r0 = 36
            X.PqQ r1 = new X.PqQ
            r1.<init>(r12, r0)
            r0 = 21
            X.1aU r0 = X.C72120Owf.A03(r3, r1, r0)
            X.1aU r1 = r0.A0H()
            r0 = r28
            r2.Ddv(r0)
            X.PSi r0 = new X.PSi
            r21 = r12
            r22 = r2
            r23 = r28
            r17 = r6
            r18 = r30
            r19 = r8
            r20 = r7
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            r4.A02(r1, r0)
            r8.A00 = r2
            float r0 = r12.A02
            r20 = r29
            r21 = r8
            r22 = r12
            r23 = r25
            r24 = r15
            r25 = r0
            X.AnonymousClass7H8.A00(r20, r21, r22, r23, r24, r25, r26)
        L_0x01a4:
            X.Hnk r4 = r11.A0A
            X.0eK r0 = r11.A0G
            if (r0 == 0) goto L_0x0065
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0065
            if (r14 == 0) goto L_0x0065
            X.2el r3 = r4.A00
            X.JwJ r2 = new X.JwJ
            r2.<init>((X.1Xj) r14, (java.lang.String) r0)
            X.0gF r1 = X.C60340gF.A00
            java.lang.String r0 = r14.getId()
            X.30a r1 = X.AnonymousClass30Y.A00(r2, r1, r0)
            X.IPA r0 = r4.A01
            r1.A00(r0)
            X.C51967G9n.A0z(r10, r1, r3)
            java.util.List r0 = r4.A02
            r0.add(r10)
            return r10
        L_0x01d3:
            X.Nhg r0 = r8.A0A
            android.view.View r0 = r0.A09
            r0.setVisibility(r9)
            goto L_0x013d
        L_0x01dc:
            X.Pmk r16 = new X.Pmk
            r19 = r16
            r20 = r29
            r21 = r8
            r22 = r7
            r23 = r12
            r24 = r25
            r25 = r15
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            android.view.View r3 = r27.getView()
            com.instagram.feed.widget.IgProgressImageView r3 = (com.instagram.feed.widget.IgProgressImageView) r3
            r3.A04()
            r5.A04(r3)
            java.util.List r7 = r7.A03
            r7.remove(r3)
            java.lang.String r0 = r12.A0T
            if (r0 != 0) goto L_0x0206
            java.lang.String r0 = ""
        L_0x0206:
            X.30a r1 = X.AnonymousClass30Y.A00(r12, r6, r0)
            X.OzU r0 = new X.OzU
            r0.<init>(r2)
            r1.A00(r0)
            X.C51967G9n.A0z(r3, r1, r5)
            r7.add(r3)
            X.PGJ r0 = new X.PGJ
            r0.<init>(r2)
            r3.A04 = r0
            r0 = r28
            r2.Ddv(r0)
            X.1aU r7 = r12.A08
            X.PUC r5 = new X.PUC
            r1 = r18
            r0 = r16
            r5.<init>((int) r1, (java.lang.Object) r3, (java.lang.Object) r2, (java.lang.Object) r0)
            r4.A02(r7, r5)
            X.1aU r5 = r12.A09
            X.Po4 r0 = X.C74039Po4.A00
            X.1aU r0 = X.C66789Mca.A00(r5, r0, r9)
            X.1aU r1 = r0.A0H()
            X.PSd r0 = new X.PSd
            r18 = r0
            r19 = r6
            r20 = r30
            r21 = r12
            r22 = r2
            r23 = r3
            r24 = r16
            r18.<init>(r19, r20, r21, r22, r23, r24)
            r4.A02(r1, r0)
            r8.A00 = r2
            boolean r0 = X.AnonymousClass3OC.A03()
            if (r0 == 0) goto L_0x0282
            if (r17 == 0) goto L_0x02ff
            android.content.Context r7 = X.AnonymousClass7TE.A0S(r3)
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r7)
            r1 = 2131629906(0x7f0e1752, float:1.8887146E38)
            r0 = 0
            android.view.View r6 = r2.inflate(r1, r0, r9)
            r0 = 2131444095(0x7f0b417f, float:1.8510277E38)
            android.view.View r2 = r6.findViewById(r0)
            r1 = 64
            X.ID1 r0 = new X.ID1
            r0.<init>((java.lang.Object) r7, (int) r1)
            X.AnonymousClass0fU.A00(r0, r2)
            r3.addView(r6)
        L_0x0282:
            X.0eM r0 = r8.A0G
            java.lang.Object r6 = r0.getValue()
            X.3oV r6 = (X.C252063oV) r6
            X.0qQ.A0B(r6, r13)
            java.lang.String r3 = r12.A0P
            if (r3 == 0) goto L_0x02f9
            X.0Tu r7 = X.0Tu.A05
            r0 = 36323689473846664(0x810c3400052d88, double:3.03458571479364E-306)
            r2 = r30
            boolean r0 = X.182.A06(r7, r2, r0)
            if (r0 == 0) goto L_0x02f9
            r6.setVisibility(r9)
            if (r14 == 0) goto L_0x02f3
            com.instagram.common.typedurl.ImageUrl r0 = r14.A1Q()
            if (r0 == 0) goto L_0x02f3
            android.view.View r1 = r6.getView()
            com.instagram.xme.threed.view.IgGltfSceneLayoutView r1 = (com.instagram.xme.threed.view.IgGltfSceneLayoutView) r1
            com.instagram.common.typedurl.ImageUrl r0 = r14.A1Q()
            r1.setPreviewUrl(r0)
        L_0x02b8:
            android.view.View r2 = r6.getView()
            com.instagram.xme.threed.view.IgGltfSceneLayoutView r2 = (com.instagram.xme.threed.view.IgGltfSceneLayoutView) r2
            X.6WO r1 = X.AnonymousClass6WO.DIRECT
            r0 = r30
            r2.setUrl(r3, r0, r1)
        L_0x02c5:
            X.3oV r0 = r8.A09
            r2 = 8
            r0.setVisibility(r2)
            X.3oV r0 = r8.A07
            r0.setVisibility(r2)
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r8.A0F
            r0.setVisibility(r2)
            X.Nhg r1 = r8.A0A
            android.view.View r0 = r1.A09
            r0.setVisibility(r2)
            X.Tol r2 = r1.A01
            if (r2 == 0) goto L_0x02e7
            r1 = 1
            java.lang.String r0 = "finished"
            r2.A0D(r0, r1)
        L_0x02e7:
            android.view.View r2 = r8.A03
            android.content.Context r1 = r8.A02
            r0 = 2131969399(0x7f134577, float:1.957572E38)
            X.DbU.A12(r1, r2, r0)
            goto L_0x01a4
        L_0x02f3:
            r0 = 15
            X.PU8.A00(r5, r4, r6, r0)
            goto L_0x02b8
        L_0x02f9:
            r0 = 8
            r6.setVisibility(r0)
            goto L_0x02c5
        L_0x02ff:
            r0 = 2131444111(0x7f0b418f, float:1.851031E38)
            android.view.View r0 = r3.findViewById(r0)
            if (r0 == 0) goto L_0x0282
            r3.removeView(r0)
            goto L_0x0282
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NR3.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
