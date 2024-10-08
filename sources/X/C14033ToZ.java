package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.ToZ  reason: case insensitive filesystem */
public final class C14033ToZ {
    public static final View A00(Context context, View view, ViewGroup viewGroup, boolean z, boolean z2, boolean z3) {
        View A09 = DbU.A09(DbT.A0B(context), viewGroup, R.layout.similar_accounts_carousel, false);
        A09.setTag(new C14144Tqg(context, A09, view, z2, z3, z));
        return A09;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e6, code lost:
        if (r20 != null) goto L_0x00e8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x00ff A[EDGE_INSN: B:97:0x00ff->B:44:0x00ff ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(android.content.Context r19, android.os.Parcelable r20, androidx.fragment.app.FragmentActivity r21, X.AnonymousClass0iw r22, X.0xF r23, com.instagram.common.session.UserSession r24, X.C320216s0 r25, X.C14029ToV r26, X.C14144Tqg r27, X.AnonymousClass713 r28, X.C14034Toa r29, X.AnonymousClass714 r30, com.instagram.user.model.User r31, boolean r32, boolean r33) {
        /*
            r18 = this;
            r11 = r19
            r14 = r24
            X.AnonymousClass7TG.A1N(r11, r14)
            r0 = 4
            r13 = r22
            X.0qQ.A0B(r13, r0)
            r6 = 5
            r4 = r27
            X.0qQ.A0B(r4, r6)
            r2 = r32
            if (r32 == 0) goto L_0x01ee
            com.instagram.ui.widget.nestablescrollingview.NestableRecyclerView r3 = r4.A06
        L_0x0019:
            r5 = r28
            if (r28 != 0) goto L_0x01e5
            r1 = 0
        L_0x001e:
            r3.A0G = r1
            r5 = r26
            boolean r0 = r5.A00()
            r3 = r31
            if (r0 == 0) goto L_0x019b
            r6 = 2131971407(0x7f134d4f, float:1.9579792E38)
            r1 = 0
            boolean r0 = r5.A00()
            if (r0 == 0) goto L_0x01f2
            java.util.List r0 = r5.A00
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.follow.chaining.RecommendAccountsHeader"
            X.0qQ.A0C(r1, r0)
            X.PG7 r1 = (X.PG7) r1
            com.instagram.user.model.User r0 = r1.A00
            java.lang.String r0 = X.DbY.A0b(r11, r0, r6)
        L_0x0047:
            android.widget.TextView r1 = r4.A04
            r1.setText(r0)
            android.widget.TextView r1 = r4.A03
            int r0 = X.DbW.A01(r33)
            r1.setVisibility(r0)
            boolean r0 = r5.A01()
            if (r0 == 0) goto L_0x0191
            X.0Tu r6 = X.0Tu.A06
            r0 = 36312363645273147(0x8101e70008043b, double:3.027423215198297E-306)
            boolean r10 = X.182.A06(r6, r14, r0)
        L_0x0066:
            boolean r9 = r5.A01()
            android.widget.TextView r6 = r4.A02
            r0 = 2131972971(0x7f13536b, float:1.9582965E38)
            X.DbT.A18(r11, r6, r0)
            int r1 = X.1QE.A01(r11)
            android.content.res.Resources r0 = r11.getResources()
            int r0 = r0.getColor(r1)
            r6.setTextColor(r0)
            r7 = 0
            X.WB2 r0 = new X.WB2
            r8 = r25
            r0.<init>((int) r7, (java.lang.Object) r8, (boolean) r9)
            X.AnonymousClass0fU.A00(r0, r6)
            X.2eS.A01(r6)
            r0 = 0
            if (r33 == 0) goto L_0x0095
            r6.setPadding(r7, r7, r7, r7)
        L_0x0095:
            if (r10 != 0) goto L_0x0098
            r0 = 4
        L_0x0098:
            r6.setVisibility(r0)
            if (r32 == 0) goto L_0x018d
            com.instagram.ui.widget.nestablescrollingview.NestableRecyclerView r0 = r4.A06
        L_0x009f:
            if (r10 == 0) goto L_0x00aa
            X.2Rw r0 = r0.A0A
            if (r0 != 0) goto L_0x00aa
            java.lang.String r0 = "see_all_in_header"
            r8.A0F(r0)
        L_0x00aa:
            android.view.View r1 = r4.A01
            if (r1 == 0) goto L_0x00b3
            r0 = 25
            X.WB9.A00(r1, r0, r8)
        L_0x00b3:
            if (r32 == 0) goto L_0x0189
            com.instagram.ui.widget.nestablescrollingview.NestableRecyclerView r1 = r4.A06
        L_0x00b7:
            X.2Rw r10 = r1.A0A
            r9 = r20
            if (r10 != 0) goto L_0x0158
            r8.A03()
            X.Tqh r0 = new X.Tqh
            r0.<init>(r1, r2)
            X.ToX r10 = new X.ToX
            r12 = r21
            r15 = r29
            r17 = r0
            r16 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r10.A03 = r8
            r10.A04 = r5
            r10.notifyDataSetChanged()
            r1.setAdapter(r10)
            if (r29 != 0) goto L_0x00e6
            X.Tqm r0 = new X.Tqm
            r0.<init>(r1, r8, r10)
            r1.A15(r0)
        L_0x00e6:
            if (r20 == 0) goto L_0x00ef
        L_0x00e8:
            X.3pI r0 = r1.A0D
            if (r0 == 0) goto L_0x00ef
            r0.A1P(r9)
        L_0x00ef:
            r0 = r23
            r10.A01 = r0
            java.util.List r1 = r5.A00
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0134
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0134
        L_0x00ff:
            r3 = r30
            if (r30 == 0) goto L_0x0133
            if (r32 == 0) goto L_0x0133
            X.UB0 r0 = r4.A00
            if (r0 != 0) goto L_0x0133
            boolean r0 = r5.A01()
            if (r0 == 0) goto L_0x0133
            X.0Tu r2 = X.0Tu.A06
            r0 = 36312363645273147(0x8101e70008043b, double:3.027423215198297E-306)
            boolean r0 = X.182.A06(r2, r14, r0)
            if (r0 == 0) goto L_0x0133
            r0 = 36312363645338684(0x8101e70009043c, double:3.0274232152397426E-306)
            boolean r0 = X.182.A06(r2, r14, r0)
            if (r0 == 0) goto L_0x0133
            X.UB0 r1 = new X.UB0
            r1.<init>(r6, r3)
            r4.A00 = r1
            com.instagram.ui.widget.nestablescrollingview.NestableRecyclerView r0 = r4.A06
            r0.A15(r1)
        L_0x0133:
            return
        L_0x0134:
            java.util.Iterator r1 = r1.iterator()
        L_0x0138:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ff
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof X.VNJ
            if (r0 == 0) goto L_0x0138
            r0 = 2
            X.WQU r3 = new X.WQU
            r3.<init>(r10, r0)
            r4.onContactImportCardRemovalListener = r3
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r14)
            java.lang.Class<X.36d> r0 = X.C2370536d.class
            r1.A01(r3, r0)
            goto L_0x00ff
        L_0x0158:
            X.ToX r10 = (X.C14031ToX) r10
            X.ToV r0 = r10.A04
            java.util.List r3 = r0.A00
            java.util.List r0 = r5.A00
            boolean r0 = X.C51966G9m.A1a(r3, r0)
            r10.A03 = r8
            if (r0 == 0) goto L_0x0174
            r10.A04 = r5
            r10.notifyDataSetChanged()
            if (r20 != 0) goto L_0x00e8
            r1.A0o(r7)
            goto L_0x00ef
        L_0x0174:
            boolean r0 = r1.A1E()
            if (r0 == 0) goto L_0x0184
            X.Wjp r0 = new X.Wjp
            r0.<init>(r10)
            r1.post(r0)
            goto L_0x00ef
        L_0x0184:
            r10.notifyDataSetChanged()
            goto L_0x00ef
        L_0x0189:
            com.instagram.ui.widget.nestablescrollingview.NestableHorizontalRecyclerPager r1 = r4.A05
            goto L_0x00b7
        L_0x018d:
            com.instagram.ui.widget.nestablescrollingview.NestableHorizontalRecyclerPager r0 = r4.A05
            goto L_0x009f
        L_0x0191:
            boolean r0 = r5.A00()
            boolean r10 = X.AnonymousClass7TF.A1Q(r0)
            goto L_0x0066
        L_0x019b:
            if (r31 == 0) goto L_0x01c7
            X.4Cl r0 = r3.A03
            java.lang.Integer r1 = r0.B6v()
            boolean r0 = r3.A1Y()
            if (r0 == 0) goto L_0x01c7
            if (r1 == 0) goto L_0x01c7
            int r0 = r1.intValue()
            if (r0 >= r6) goto L_0x01c7
            X.0Tu r6 = X.0Tu.A05
            r0 = 36318136081061765(0x81072700041785, double:3.031073726834752E-306)
            boolean r0 = X.182.A06(r6, r14, r0)
            if (r0 == 0) goto L_0x01c7
            r0 = 2131962582(0x7f132ad6, float:1.9561893E38)
        L_0x01c1:
            java.lang.String r0 = r11.getString(r0)
            goto L_0x0047
        L_0x01c7:
            boolean r0 = r5.A01()
            if (r0 == 0) goto L_0x01d1
            r0 = 2131960850(0x7f132412, float:1.955838E38)
            goto L_0x01c1
        L_0x01d1:
            if (r31 == 0) goto L_0x01dc
            boolean r0 = r3.A2L()
            if (r0 == 0) goto L_0x01dc
            r13.getModuleName()
        L_0x01dc:
            r0 = 2131974682(0x7f135a1a, float:1.9586435E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r11, r0)
            goto L_0x0047
        L_0x01e5:
            r0 = 8
            X.UB1 r1 = new X.UB1
            r1.<init>(r5, r0)
            goto L_0x001e
        L_0x01ee:
            com.instagram.ui.widget.nestablescrollingview.NestableHorizontalRecyclerPager r3 = r4.A05
            goto L_0x0019
        L_0x01f2:
            java.lang.IllegalStateException r0 = X.DbT.A0m()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14033ToZ.A01(android.content.Context, android.os.Parcelable, androidx.fragment.app.FragmentActivity, X.0iw, X.0xF, com.instagram.common.session.UserSession, X.6s0, X.ToV, X.Tqg, X.713, X.Toa, X.714, com.instagram.user.model.User, boolean, boolean):void");
    }
}
