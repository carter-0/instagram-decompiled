package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.Ebc  reason: case insensitive filesystem */
public abstract class C48257Ebc {
    public final C249703kE A00(ViewGroup viewGroup) {
        if (this instanceof C47814EIa) {
            return new C46956DoA(DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.value_props_list_item, false));
        }
        if (this instanceof EIZ) {
            return new C46980DoY(DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.value_props_product_specific_section, false));
        }
        if (this instanceof EIY) {
            LayoutInflater A0F = DbX.A0F(viewGroup, 0);
            int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            return new C46937Dnr(DbT.A0D(A0F, viewGroup, R.layout.value_props_page_header, false));
        } else if (this instanceof EIX) {
            LayoutInflater A0F2 = DbX.A0F(viewGroup, 0);
            int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            return new C46955Do9(DbT.A0D(A0F2, viewGroup, R.layout.value_props_inspiration_section, false));
        } else if (this instanceof C47815EIb) {
            return new C46954Do8(DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.value_props_hscroll_row, false));
        } else {
            if (this instanceof EIW) {
                return new C46936Dnq(DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.value_props_eligibility_criteria_section, false));
            }
            if (this instanceof EIV) {
                return new C46935Dnp(DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.value_props_criteria_list_item, false));
            }
            if (this instanceof EIU) {
                return C49804F7q.A00(viewGroup.getContext(), viewGroup);
            }
            if (this instanceof EIT) {
                return FCV.A00(viewGroup.getContext(), viewGroup, false);
            }
            return new C46906DnM(DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.value_props_error_row, false));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x027c A[LOOP:0: B:83:0x0276->B:85:0x027c, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C249703kE r9, X.AnonymousClass0iw r10, com.instagram.common.session.UserSession r11, java.util.List r12, int r13) {
        /*
            r8 = this;
            boolean r0 = r8 instanceof X.C47814EIa
            if (r0 == 0) goto L_0x0032
            X.AnonymousClass7TG.A1N(r9, r12)
            X.DoA r9 = (X.C46956DoA) r9
            java.lang.Object r2 = r12.get(r13)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creatortools.api.schemas.ValueProp"
            X.0qQ.A0C(r2, r0)
            X.Jvb r2 = (X.C61037Jvb) r2
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.String r0 = r2.A00
            int r1 = X.F5O.A00(r0)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r9.A00
            r0.setImageResource(r1)
            com.instagram.common.ui.base.IgTextView r1 = r9.A02
            java.lang.String r0 = r2.A02
            r1.setText(r0)
            com.instagram.common.ui.base.IgTextView r1 = r9.A01
            java.lang.String r0 = r2.A01
            r1.setText(r0)
        L_0x0031:
            return
        L_0x0032:
            boolean r0 = r8 instanceof X.EIZ
            if (r0 == 0) goto L_0x00ac
            r4 = 1
            X.AnonymousClass7TG.A0w(r4, r12, r11, r10)
            X.DoY r9 = (X.C46980DoY) r9
            java.lang.Object r5 = r12.get(r13)
            r0 = 3657(0xe49, float:5.125E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r5, r0)
            X.JwM r5 = (X.C61084JwM) r5
            r6 = 0
            X.0qQ.A0B(r5, r6)
            android.widget.TextView r2 = r9.A01
            java.lang.Object r3 = r5.A00
            X.Jvb r3 = (X.C61037Jvb) r3
            r1 = 0
            if (r3 == 0) goto L_0x00aa
            java.lang.String r0 = r3.A02
        L_0x005a:
            r2.setText(r0)
            android.widget.TextView r2 = r9.A00
            if (r3 == 0) goto L_0x00a8
            java.lang.String r0 = r3.A01
        L_0x0063:
            r2.setText(r0)
            android.content.Context r0 = X.DbS.A07(r9)
            boolean r2 = X.AnonymousClass3HA.A00(r0)
            java.lang.Object r0 = r5.A01
            X.N49 r0 = (X.N49) r0
            if (r2 == 0) goto L_0x00a3
            if (r0 == 0) goto L_0x0078
            java.lang.String r1 = r0.A00
        L_0x0078:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r9.A03
            X.DbV.A1P(r10, r0, r1)
            java.lang.Object r5 = r5.A02
            java.util.List r5 = (java.util.List) r5
            X.DmE r3 = new X.DmE
            r3.<init>(r10, r11)
            androidx.recyclerview.widget.RecyclerView r1 = r9.A02
            r1.setAdapter(r3)
            android.content.Context r0 = r1.getContext()
            X.DbU.A15(r0, r1, r4, r6)
            X.0qQ.A0B(r5, r6)
        L_0x0095:
            java.util.List r0 = r3.A00
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0031
            r3.A00 = r5
        L_0x009f:
            r3.notifyDataSetChanged()
            return
        L_0x00a3:
            if (r0 == 0) goto L_0x0078
            java.lang.String r1 = r0.A01
            goto L_0x0078
        L_0x00a8:
            r0 = r1
            goto L_0x0063
        L_0x00aa:
            r0 = r1
            goto L_0x005a
        L_0x00ac:
            boolean r0 = r8 instanceof X.EIY
            if (r0 == 0) goto L_0x00f7
            X.AnonymousClass7TG.A1N(r9, r12)
            r0 = 4
            X.0qQ.A0B(r10, r0)
            X.Dnr r9 = (X.C46937Dnr) r9
            java.lang.Object r2 = r12.get(r13)
            r0 = 3655(0xe47, float:5.122E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r2, r0)
            X.JV7 r2 = (X.JV7) r2
            r0 = 0
            X.0qQ.A0B(r2, r0)
            android.content.Context r0 = X.DbS.A07(r9)
            boolean r1 = X.AnonymousClass3HA.A00(r0)
            java.lang.Object r0 = r2.A00
            X.N49 r0 = (X.N49) r0
            if (r1 == 0) goto L_0x00f1
            java.lang.String r1 = r0.A00
        L_0x00dc:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r9.A01
            X.DbV.A1P(r10, r0, r1)
            java.lang.String r1 = r2.A01
            if (r1 == 0) goto L_0x00f4
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00f4
            android.widget.TextView r0 = r9.A00
            r0.setText(r1)
            return
        L_0x00f1:
            java.lang.String r1 = r0.A01
            goto L_0x00dc
        L_0x00f4:
            android.widget.TextView r1 = r9.A00
            goto L_0x0135
        L_0x00f7:
            boolean r0 = r8 instanceof X.EIX
            if (r0 == 0) goto L_0x013b
            X.AnonymousClass7TG.A1N(r9, r12)
            r0 = 4
            X.0qQ.A0B(r10, r0)
            X.Do9 r9 = (X.C46955Do9) r9
            java.lang.Object r4 = r12.get(r13)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creatortools.api.schemas.InspirationComponent"
            X.0qQ.A0C(r4, r0)
            X.Drz r4 = (X.C47184Drz) r4
            r3 = 0
            X.0qQ.A0B(r4, r3)
            android.widget.TextView r1 = r9.A01
            java.lang.String r0 = r4.A04
            r1.setText(r0)
            android.widget.TextView r1 = r9.A00
            java.lang.String r0 = r4.A02
            r1.setText(r0)
            android.content.Context r0 = X.DbS.A07(r9)
            boolean r2 = X.AnonymousClass3HA.A00(r0)
            java.lang.Object r1 = r4.A01
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x01fb
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r9.A02
        L_0x0135:
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x013b:
            boolean r0 = r8 instanceof X.C47815EIb
            if (r0 == 0) goto L_0x01bd
            r1 = r8
            X.EIb r1 = (X.C47815EIb) r1
            X.AnonymousClass7TG.A1N(r9, r12)
            r0 = 4
            X.0qQ.A0B(r10, r0)
            X.Do8 r9 = (X.C46954Do8) r9
            java.lang.Object r3 = r12.get(r13)
            java.lang.String r4 = r1.A00
            r0 = 0
            X.AnonymousClass7TF.A1B(r3, r0, r4)
            X.0sn r2 = X.0sn.A00
            java.lang.String r0 = "insights"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0181
            android.widget.TextView r1 = r9.A01
            X.Drz r3 = (X.C47184Drz) r3
            java.lang.String r0 = r3.A04
            r1.setText(r0)
            android.widget.TextView r1 = r9.A00
            java.lang.String r0 = r3.A02
            r1.setText(r0)
            java.lang.Object r2 = r3.A01
            java.util.List r2 = (java.util.List) r2
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.instagram.creatortools.api.schemas.ThemedImageURL>"
        L_0x0175:
            X.0qQ.A0C(r2, r0)
        L_0x0178:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x01a0
            androidx.recyclerview.widget.RecyclerView r1 = r9.A02
            goto L_0x0135
        L_0x0181:
            java.lang.String r0 = "monetization"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0178
            android.widget.TextView r1 = r9.A01
            X.Drz r3 = (X.C47184Drz) r3
            java.lang.String r0 = r3.A04
            r1.setText(r0)
            android.widget.TextView r1 = r9.A00
            java.lang.String r0 = r3.A02
            r1.setText(r0)
            java.lang.Object r2 = r3.A01
            java.util.List r2 = (java.util.List) r2
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.instagram.creatortools.api.schemas.ImageInfo>"
            goto L_0x0175
        L_0x01a0:
            X.Dlx r3 = new X.Dlx
            r3.<init>(r4, r10)
            androidx.recyclerview.widget.RecyclerView r1 = r9.A02
            r1.setAdapter(r3)
            android.content.Context r0 = r1.getContext()
            X.DbV.A1A(r0, r1)
            java.util.List r0 = r3.A00
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0031
            r3.A00 = r2
            goto L_0x009f
        L_0x01bd:
            boolean r0 = r8 instanceof X.EIW
            if (r0 == 0) goto L_0x020e
            r4 = 1
            X.AnonymousClass7TG.A0w(r4, r12, r11, r10)
            X.Dnq r9 = (X.C46936Dnq) r9
            java.lang.Object r3 = r12.get(r13)
            r0 = 3656(0xe48, float:5.123E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r3, r0)
            X.JV7 r3 = (X.JV7) r3
            r2 = 0
            X.0qQ.A0B(r3, r2)
            android.widget.TextView r1 = r9.A00
            java.lang.String r0 = r3.A02
            r1.setText(r0)
            java.lang.Object r5 = r3.A00
            java.util.List r5 = (java.util.List) r5
            X.DmE r3 = new X.DmE
            r3.<init>(r10, r11)
            androidx.recyclerview.widget.RecyclerView r1 = r9.A01
            r1.setAdapter(r3)
            android.content.Context r0 = r1.getContext()
            X.DbU.A15(r0, r1, r4, r2)
            X.0qQ.A0B(r5, r2)
            goto L_0x0095
        L_0x01fb:
            java.lang.Object r0 = r1.get(r3)
            X.N49 r0 = (X.N49) r0
            if (r2 == 0) goto L_0x020b
            java.lang.String r1 = r0.A00
        L_0x0205:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r9.A02
            X.DbV.A1P(r10, r0, r1)
            return
        L_0x020b:
            java.lang.String r1 = r0.A01
            goto L_0x0205
        L_0x020e:
            boolean r0 = r8 instanceof X.EIV
            if (r0 == 0) goto L_0x02b0
            X.AnonymousClass7TG.A1N(r9, r12)
            r0 = 3
            X.0qQ.A0B(r11, r0)
            X.Dnp r9 = (X.C46935Dnp) r9
            java.lang.Object r3 = r12.get(r13)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creatortools.api.schemas.EligibilityCriteriaInfo"
            X.0qQ.A0C(r3, r0)
            X.GnV r3 = (X.C53398GnV) r3
            r0 = 1
            X.0qQ.A0B(r3, r0)
            com.instagram.common.ui.base.IgSimpleImageView r5 = r9.A00
            android.content.Context r4 = X.AnonymousClass7TE.A0S(r5)
            java.lang.String r6 = r3.A03
            X.0qQ.A0B(r6, r0)
            java.lang.String r0 = "circle-x-pano"
            boolean r0 = r6.equals(r0)
            r2 = 0
            if (r0 == 0) goto L_0x0291
            int r0 = X.F5O.A00(r6)
            android.graphics.drawable.Drawable r1 = r4.getDrawable(r0)
            if (r1 == 0) goto L_0x0253
            r0 = 2130970306(0x7f0406c2, float:1.7549318E38)
        L_0x024b:
            int r0 = X.2Yu.A0H(r4, r0)
            X.DbX.A11(r4, r1, r0)
        L_0x0252:
            r2 = r1
        L_0x0253:
            r5.setImageDrawable(r2)
            com.instagram.common.ui.base.IgTextView r7 = r9.A01
            android.content.Context r6 = X.AnonymousClass7TE.A0S(r7)
            java.lang.String r2 = r3.A04
            java.lang.Object r1 = r3.A02
            java.util.List r1 = (java.util.List) r1
            r0 = 2
            X.0qQ.A0B(r2, r0)
            android.text.SpannableStringBuilder r5 = X.DbS.A0C(r2)
            if (r1 == 0) goto L_0x02ac
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x02ac
            java.util.Iterator r4 = r1.iterator()
        L_0x0276:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x02ac
            java.lang.Object r3 = r4.next()
            X.N49 r3 = (X.N49) r3
            java.lang.String r2 = r3.A00
            int r1 = X.DbV.A02(r6)
            X.ESt r0 = new X.ESt
            r0.<init>((android.content.Context) r6, (X.N49) r3, (com.instagram.common.session.UserSession) r11, (int) r1)
            X.AnonymousClass7AV.A05(r5, r0, r2)
            goto L_0x0276
        L_0x0291:
            java.lang.String r0 = "circle-check-pano"
            boolean r1 = r6.equals(r0)
            int r0 = X.F5O.A00(r6)
            if (r1 == 0) goto L_0x02a7
            android.graphics.drawable.Drawable r1 = r4.getDrawable(r0)
            if (r1 == 0) goto L_0x0253
            r0 = 2130970331(0x7f0406db, float:1.754937E38)
            goto L_0x024b
        L_0x02a7:
            android.graphics.drawable.Drawable r1 = r4.getDrawable(r0)
            goto L_0x0252
        L_0x02ac:
            X.DbX.A1G(r7, r5)
            return
        L_0x02b0:
            boolean r0 = r8 instanceof X.EIU
            if (r0 == 0) goto L_0x02d8
            r5 = 0
            boolean r0 = X.AnonymousClass7TF.A1U(r5, r9, r12)
            X.DnA r9 = (X.C46894DnA) r9
            java.lang.Object r1 = r12.get(r13)
            X.Fmc r1 = (X.C50989Fmc) r1
            boolean r3 = X.AnonymousClass7TF.A1Q(r13)
            int r0 = X.DbT.A02(r12, r0)
            boolean r4 = X.AnonymousClass7TF.A1S(r13, r0)
            X.FAT r2 = new X.FAT
            r6 = r5
            r7 = r5
            r2.<init>(r3, r4, r5, r6, r7)
            X.C49804F7q.A01(r1, r2, r9)
            return
        L_0x02d8:
            boolean r0 = r8 instanceof X.EIT
            if (r0 == 0) goto L_0x02ec
            r1 = 0
            X.AnonymousClass7TF.A1H(r9, r12)
            X.DnC r9 = (X.C46896DnC) r9
            java.lang.Object r0 = r12.get(r13)
            X.DfA r0 = (X.C46448DfA) r0
            X.FCV.A02(r0, r9, r1, r1)
            return
        L_0x02ec:
            X.AnonymousClass7TG.A1N(r9, r12)
            X.DnM r9 = (X.C46906DnM) r9
            java.lang.Object r2 = r12.get(r13)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creatortools.util.ErrorRowComponent"
            X.0qQ.A0C(r2, r0)
            X.Etf r2 = (X.C49324Etf) r2
            r0 = 0
            X.0qQ.A0B(r2, r0)
            android.widget.TextView r1 = r9.A00
            int r0 = r2.A00
            r1.setText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48257Ebc.A01(X.3kE, X.0iw, com.instagram.common.session.UserSession, java.util.List, int):void");
    }
}
