package X;

import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.U9g  reason: case insensitive filesystem */
public final class C14791U9g extends C322136vJ {
    public static final U9R A02 = new U9R(0);
    public final AnonymousClass0iw A00;
    public final C17779Vfq A01;

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        switch (DbU.A02(C16518UwN.values()[i], 1)) {
            case 0:
                return new C16023UnC(DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.lead_gen_view_holder_creatives_header, false));
            case 1:
                return new C16020Un9(DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.lead_gen_view_holder_creatives_collapsable_section, false));
            case 2:
                return new C16019Un8(DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.lead_gen_view_holder_creatives_incentives, false));
            case 3:
                return new C16018Un7(DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.lead_gen_view_holder_creatives_collapsable_section, false));
            case 4:
                return new C16021UnA(DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.lead_gen_view_holder_creatives_collapsable_section, false));
            case 5:
                return new C16022UnB(DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.lead_gen_view_holder_creatives_collapsable_section, false));
            default:
                throw new RuntimeException();
        }
    }

    public C14791U9g(AnonymousClass0iw r2, C17779Vfq vfq) {
        super((C252303ot) A02);
        this.A00 = r2;
        this.A01 = vfq;
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004f, code lost:
        if (((java.util.List) r6.A01).size() <= 2) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0101, code lost:
        if (((java.util.List) r6.A01).size() <= 2) goto L_0x0103;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(X.C249703kE r12, int r13) {
        /*
            r11 = this;
            X.UBE r12 = (X.UBE) r12
            r8 = 0
            X.0qQ.A0B(r12, r8)
            java.lang.Object r7 = r11.getItem(r13)
            X.0qQ.A07(r7)
            X.Jvy r7 = (X.C61060Jvy) r7
            X.0iw r5 = r11.A00
            X.Vfq r9 = r11.A01
            boolean r0 = r12 instanceof X.C16022UnB
            if (r0 == 0) goto L_0x00c4
            X.UnB r12 = (X.C16022UnB) r12
            X.AnonymousClass7TG.A1N(r7, r5)
            r4 = 2
            X.0qQ.A0B(r9, r4)
            java.lang.Object r6 = r7.A01
            X.X4H r6 = (X.X4H) r6
            boolean r0 = r6 instanceof X.UO6
            if (r0 == 0) goto L_0x039b
            X.UO6 r6 = (X.UO6) r6
            int r0 = r6.A00
            if (r0 != r4) goto L_0x039b
            com.instagram.leadgen.core.ui.LeadGenCreativesSectionHeaderRow r10 = r12.A02
            java.lang.String r2 = r6.A03
            boolean r3 = r7.A03
            r1 = 4
            X.Wvt r0 = new X.Wvt
            r0.<init>(r1, r9, r7)
            r10.A0D(r2, r0, r3)
            com.instagram.igds.components.button.IgdsButton r10 = r12.A01
            r2 = 0
            if (r3 == 0) goto L_0x0051
            boolean r0 = r7.A04
            if (r0 == 0) goto L_0x0051
            java.lang.Object r0 = r6.A01
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            r0 = 0
            if (r1 > r4) goto L_0x0053
        L_0x0051:
            r0 = 8
        L_0x0053:
            r10.setVisibility(r0)
            r0 = 53
            X.WBG.A01(r10, r0, r7, r9)
            boolean r1 = r7.A04
            java.lang.Object r0 = r6.A01
            java.util.List r0 = (java.util.List) r0
            if (r1 == 0) goto L_0x0067
            java.util.List r0 = X.00k.A0d(r0, r4)
        L_0x0067:
            com.instagram.common.ui.base.IgLinearLayout r4 = r12.A00
            if (r3 != 0) goto L_0x006d
            r2 = 8
        L_0x006d:
            r4.setVisibility(r2)
            r4.removeAllViews()
            if (r3 == 0) goto L_0x039b
            java.util.Iterator r9 = r0.iterator()
        L_0x0079:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x039b
            java.lang.Object r6 = r9.next()
            X.JV7 r6 = (X.JV7) r6
            android.content.Context r7 = X.JTQ.A06(r12)
            X.U6k r3 = new X.U6k
            r3.<init>(r7)
            X.JTS.A0x(r3)
            r2 = 10
            float r0 = X.0nA.A04(r7, r2)
            int r1 = (int) r0
            float r0 = X.0nA.A04(r7, r2)
            int r0 = (int) r0
            r3.setPadding(r8, r1, r8, r0)
            X.0qQ.A0B(r6, r8)
            com.instagram.common.ui.base.IgTextView r1 = r3.A01
            java.lang.String r0 = r6.A02
            r1.setText(r0)
            com.instagram.common.ui.base.IgTextView r2 = r3.A00
            r1 = 34
            java.lang.String r0 = r6.A01
            java.lang.String r0 = X.002.A0E(r0, r1, r1)
            r2.setText(r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r3.A02
            java.lang.Object r0 = r6.A00
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            r1.setUrl(r0, r5)
            r4.addView(r3)
            goto L_0x0079
        L_0x00c4:
            boolean r0 = r12 instanceof X.C16021UnA
            if (r0 == 0) goto L_0x01a0
            X.UnA r12 = (X.C16021UnA) r12
            boolean r1 = X.AnonymousClass7TF.A1U(r8, r7, r5)
            r4 = 2
            X.0qQ.A0B(r9, r4)
            java.lang.Object r6 = r7.A01
            X.X4H r6 = (X.X4H) r6
            boolean r0 = r6 instanceof X.UO6
            if (r0 == 0) goto L_0x039b
            X.UO6 r6 = (X.UO6) r6
            int r0 = r6.A00
            if (r0 != r1) goto L_0x039b
            com.instagram.leadgen.core.ui.LeadGenCreativesSectionHeaderRow r10 = r12.A02
            java.lang.String r2 = r6.A03
            boolean r3 = r7.A03
            r1 = 3
            X.Wvt r0 = new X.Wvt
            r0.<init>(r1, r9, r7)
            r10.A0D(r2, r0, r3)
            com.instagram.igds.components.button.IgdsButton r10 = r12.A01
            r2 = 0
            if (r3 == 0) goto L_0x0103
            boolean r0 = r7.A04
            if (r0 == 0) goto L_0x0103
            java.lang.Object r0 = r6.A01
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            r0 = 0
            if (r1 > r4) goto L_0x0105
        L_0x0103:
            r0 = 8
        L_0x0105:
            r10.setVisibility(r0)
            r0 = 52
            X.WBG.A01(r10, r0, r7, r9)
            boolean r1 = r7.A04
            java.lang.Object r0 = r6.A01
            java.util.List r0 = (java.util.List) r0
            if (r1 == 0) goto L_0x0119
            java.util.List r0 = X.00k.A0d(r0, r4)
        L_0x0119:
            com.instagram.common.ui.base.IgLinearLayout r4 = r12.A00
            if (r3 != 0) goto L_0x011f
            r2 = 8
        L_0x011f:
            r4.setVisibility(r2)
            r4.removeAllViews()
            if (r3 == 0) goto L_0x039b
            java.util.Iterator r9 = r0.iterator()
        L_0x012b:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x039b
            java.lang.Object r2 = r9.next()
            X.GSY r2 = (X.GSY) r2
            android.content.Context r0 = X.JTQ.A06(r12)
            r7 = 0
            X.U6l r3 = new X.U6l
            r3.<init>(r0)
            X.JTS.A0x(r3)
            X.0qQ.A0B(r2, r8)
            com.instagram.common.ui.base.IgTextView r1 = r3.A03
            java.lang.String r0 = r2.A03
            r1.setText(r0)
            com.instagram.common.ui.base.IgTextView r1 = r3.A02
            java.lang.String r0 = r2.A02
            r1.setText(r0)
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r1 = r3.A04
            java.lang.Object r0 = r2.A01
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            r1.setUrl(r0, r5)
            com.instagram.common.ui.base.IgLinearLayout r6 = r3.A01
            r6.removeAllViews()
            java.lang.Object r1 = r2.A00
            java.util.List r1 = (java.util.List) r1
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            int r0 = X.DbW.A01(r0)
            r6.setVisibility(r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x0176:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x018f
            java.lang.String r1 = X.AnonymousClass7TE.A18(r2)
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r3)
            X.U6m r0 = X.VER.A00(r0)
            r0.A0D(r7, r1)
            r6.addView(r0)
            goto L_0x0176
        L_0x018f:
            int r0 = r6.getVisibility()
            if (r0 != 0) goto L_0x019d
            r0 = 0
        L_0x0196:
            r3.setPadding(r8, r8, r8, r0)
            r4.addView(r3)
            goto L_0x012b
        L_0x019d:
            int r0 = r3.A00
            goto L_0x0196
        L_0x01a0:
            boolean r0 = r12 instanceof X.C16020Un9
            if (r0 == 0) goto L_0x0209
            X.Un9 r12 = (X.C16020Un9) r12
            int r3 = X.DbW.A02(r8, r7, r9)
            java.lang.Object r6 = r7.A01
            X.X4H r6 = (X.X4H) r6
            boolean r0 = r6 instanceof X.UO8
            r4 = 0
            if (r0 == 0) goto L_0x039b
            X.UO8 r6 = (X.UO8) r6
            if (r6 == 0) goto L_0x039b
            com.instagram.leadgen.core.ui.LeadGenCreativesSectionHeaderRow r2 = r12.A02
            java.lang.String r1 = r6.A01
            boolean r5 = r7.A03
            X.Wvt r0 = new X.Wvt
            r0.<init>(r3, r9, r7)
            r2.A0D(r1, r0, r5)
            com.instagram.common.ui.base.IgTextView r2 = r12.A01
            r1 = 8
            int r0 = X.DbW.A01(r5)
            r2.setVisibility(r0)
            com.instagram.common.ui.base.IgLinearLayout r3 = r12.A00
            if (r5 == 0) goto L_0x01dd
            java.util.List r0 = r6.A02
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x01dd
            r1 = 0
        L_0x01dd:
            r3.setVisibility(r1)
            r3.removeAllViews()
            if (r5 == 0) goto L_0x039b
            java.lang.String r0 = r6.A00
            r2.setText(r0)
            java.util.List r0 = r6.A02
            java.util.Iterator r2 = r0.iterator()
        L_0x01f0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x039b
            java.lang.String r1 = X.AnonymousClass7TE.A18(r2)
            android.content.Context r0 = X.JTQ.A06(r12)
            X.U6m r0 = X.VER.A00(r0)
            r0.A0D(r4, r1)
            r3.addView(r0)
            goto L_0x01f0
        L_0x0209:
            boolean r0 = r12 instanceof X.C16019Un8
            if (r0 == 0) goto L_0x02a3
            X.Un8 r12 = (X.C16019Un8) r12
            X.0qQ.A0B(r7, r8)
            java.lang.Object r4 = r7.A01
            X.X4H r4 = (X.X4H) r4
            boolean r0 = r4 instanceof X.UO7
            if (r0 == 0) goto L_0x039b
            X.UO7 r4 = (X.UO7) r4
            if (r4 == 0) goto L_0x039b
            com.instagram.igds.components.bulletcell.IgdsBulletCell r5 = r12.A01
            boolean r2 = r7.A02
            r1 = 0
            int r0 = X.DbW.A01(r2)
            r5.setVisibility(r0)
            com.instagram.common.ui.base.IgTextView r6 = r12.A00
            r0 = r2 ^ 1
            if (r0 != 0) goto L_0x0232
            r1 = 8
        L_0x0232:
            r6.setVisibility(r1)
            if (r2 == 0) goto L_0x0274
            java.lang.String r7 = r4.A00
            int r0 = r7.length()
            r1 = 0
            r6 = 1
            if (r0 <= 0) goto L_0x024a
            java.lang.String r0 = r4.A01
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x024a
            r1 = 1
        L_0x024a:
            java.lang.String r3 = r4.A02
            if (r1 == 0) goto L_0x026b
            android.content.Context r2 = X.DbS.A07(r12)
            r1 = 2131954368(0x7f130ac0, float:1.9545233E38)
            java.lang.String r0 = r4.A01
            java.lang.String r0 = X.DbV.A0u(r2, r7, r0, r1)
            X.0qQ.A07(r0)
        L_0x025e:
            r5.setText((java.lang.CharSequence) r3, (java.lang.CharSequence) r0)
            r0 = 2131238326(0x7f081db6, float:1.8092928E38)
            r5.setIcon((int) r0)
            r5.setExcludeHorizontalPadding(r6)
            return
        L_0x026b:
            r1 = 32
            java.lang.String r0 = r4.A01
            java.lang.String r0 = X.002.A0T(r7, r0, r1)
            goto L_0x025e
        L_0x0274:
            java.lang.String r0 = r4.A02
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>(r0)
            android.content.Context r0 = X.JTQ.A06(r12)
            android.graphics.Typeface r1 = X.AnonymousClass7TG.A0N(r0)
            if (r1 == 0) goto L_0x028d
            com.instagram.common.ui.text.CustomTypefaceSpan r0 = new com.instagram.common.ui.text.CustomTypefaceSpan
            r0.<init>(r1)
            X.C66582MXn.A12(r3, r0, r8)
        L_0x028d:
            java.lang.String r0 = " "
            r3.append(r0)
            java.lang.String r2 = r4.A00
            r1 = 32
            java.lang.String r0 = r4.A01
            java.lang.String r0 = X.002.A0T(r2, r0, r1)
            r3.append(r0)
            r6.setText(r3)
            return
        L_0x02a3:
            boolean r0 = r12 instanceof X.C16018Un7
            if (r0 == 0) goto L_0x030a
            X.Un7 r12 = (X.C16018Un7) r12
            X.AnonymousClass7TF.A1B(r7, r8, r9)
            java.lang.Object r6 = r7.A01
            X.X4H r6 = (X.X4H) r6
            boolean r0 = r6 instanceof X.UO6
            if (r0 == 0) goto L_0x039b
            X.UO6 r6 = (X.UO6) r6
            int r0 = r6.A00
            if (r0 != r8) goto L_0x039b
            com.instagram.leadgen.core.ui.LeadGenCreativesSectionHeaderRow r4 = r12.A01
            java.lang.String r3 = r6.A03
            boolean r2 = r7.A03
            r1 = 1
            X.Wvt r0 = new X.Wvt
            r0.<init>(r1, r9, r7)
            r4.A0D(r3, r0, r2)
            com.instagram.common.ui.base.IgLinearLayout r5 = r12.A00
            r1 = 0
            if (r2 == 0) goto L_0x0307
            java.lang.Object r0 = r6.A01
            java.util.List r0 = (java.util.List) r0
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x0307
        L_0x02d8:
            r5.setVisibility(r1)
            r5.removeAllViews()
            if (r2 == 0) goto L_0x039b
            java.lang.Object r0 = r6.A01
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r4 = r0.iterator()
        L_0x02e8:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x039b
            java.lang.Object r3 = r4.next()
            X.ULg r3 = (X.C15050ULg) r3
            android.content.Context r0 = X.JTQ.A06(r12)
            X.U6m r2 = X.VER.A00(r0)
            java.lang.String r1 = r3.A01
            java.lang.String r0 = r3.A00
            r2.A0D(r1, r0)
            r5.addView(r2)
            goto L_0x02e8
        L_0x0307:
            r1 = 8
            goto L_0x02d8
        L_0x030a:
            X.UnC r12 = (X.C16023UnC) r12
            X.AnonymousClass7TF.A1H(r7, r5)
            java.lang.Object r4 = r7.A01
            X.X4H r4 = (X.X4H) r4
            boolean r0 = r4 instanceof X.UO9
            r2 = 0
            if (r0 == 0) goto L_0x039b
            X.UO9 r4 = (X.UO9) r4
            if (r4 == 0) goto L_0x039b
            boolean r0 = r7.A02
            com.instagram.common.ui.base.IgTextView r3 = r12.A02
            com.instagram.common.ui.base.IgTextView r1 = r12.A01
            if (r0 == 0) goto L_0x0327
            r0 = r1
            r1 = r3
            r3 = r0
        L_0x0327:
            java.lang.String r0 = r4.A05
            r3.setText(r0)
            r3.setVisibility(r8)
            r0 = 8
            r1.setVisibility(r0)
            X.3aa r0 = X.C244063aa.TITLE
            X.C244083ac.A05(r3, r0)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r12.A05
            com.instagram.common.typedurl.ImageUrl r0 = r4.A03
            r1.setUrl(r0, r5)
            com.instagram.common.typedurl.ImageUrl r1 = r4.A01
            if (r1 != 0) goto L_0x0348
            com.instagram.common.typedurl.ImageUrl r1 = r4.A04
            if (r1 == 0) goto L_0x034d
        L_0x0348:
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r12.A04
            r0.setUrl(r1, r5)
        L_0x034d:
            com.instagram.common.ui.base.IgTextView r1 = r12.A03
            java.lang.String r0 = r4.A06
            r1.setText(r0)
            java.lang.String r1 = r4.A02
            r3 = 0
            if (r1 == 0) goto L_0x037a
            int r0 = r1.length()
            if (r0 == 0) goto L_0x037a
            r2 = r1
        L_0x0360:
            com.instagram.common.ui.base.IgTextView r1 = r12.A00
            r1.setText(r2)
            if (r2 == 0) goto L_0x036d
            int r0 = r2.length()
            if (r0 != 0) goto L_0x036f
        L_0x036d:
            r3 = 8
        L_0x036f:
            r1.setVisibility(r3)
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r12.A04
            X.3aa r0 = X.C244063aa.PROFILE_IMAGE
            X.C244083ac.A05(r1, r0)
            return
        L_0x037a:
            int r0 = r4.A00
            if (r0 <= 0) goto L_0x0360
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            android.view.View r0 = r12.itemView
            android.content.res.Resources r0 = X.DbU.A05(r0)
            X.0qQ.A07(r0)
            java.lang.String r2 = X.C253673rC.A03(r0, r1)
            android.content.Context r1 = X.DbS.A07(r12)
            r0 = 2131964825(0x7f133399, float:1.9566443E38)
            java.lang.String r2 = X.DbW.A0h(r1, r2, r0)
            goto L_0x0360
        L_0x039b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14791U9g.onBindViewHolder(X.3kE, int):void");
    }

    public final int getItemViewType(int i) {
        int A03 = AnonymousClass0fD.A03(1886588025);
        int ordinal = ((X4H) ((C61060Jvy) getItem(i)).A01).CAZ().ordinal();
        AnonymousClass0fD.A0A(816382675, A03);
        return ordinal;
    }
}
