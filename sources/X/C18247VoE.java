package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.instagram.android.R;

/* renamed from: X.VoE  reason: case insensitive filesystem */
public abstract class C18247VoE {
    public static final LinearLayout A00(Context context) {
        0qQ.A0B(context, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        DbY.A0z(linearLayout);
        int A01 = DbY.A01(context);
        C14856UCk uCk = new C14856UCk(linearLayout);
        0nA.A0h(linearLayout, A01, A01);
        UE5[] ue5Arr = uCk.A00;
        int i = 0;
        do {
            View A09 = DbW.A09(LayoutInflater.from(context), linearLayout, R.layout.product_feed_grid_item_layout, false);
            A09.setTag(new UE5(A09));
            linearLayout.addView(A09);
            Object tag = A09.getTag();
            Object obj = null;
            if (tag instanceof UE5) {
                obj = tag;
            }
            ue5Arr[i] = obj;
            i++;
        } while (i < 2);
        linearLayout.setTag(uCk);
        return linearLayout;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x00d0: MOVE  (r4v2 int) = (r45v0 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public static final void A01(android.content.Context r36, X.AnonymousClass0iw r37, com.instagram.common.session.UserSession r38, X.C14856UCk r39, X.XC8 r40, X.C15683Ugo r41, X.C19278WSl r42, java.lang.Integer r43, java.lang.String r44, int r45, boolean r46) {
        /*
            r28 = 0
            r35 = r37
            r34 = r38
            r33 = r40
            r3 = r36
            r2 = r34
            r1 = r35
            r0 = r33
            X.C51974G9v.A1P(r3, r2, r1, r0)
            r12 = r42
            X.71g r14 = r12.A05
            X.Vz5 r11 = r12.A03
            r0 = r39
            X.UE5[] r13 = r0.A00
            r10 = 2
            r9 = 0
        L_0x001f:
            int r0 = r14.A01()
            if (r9 >= r0) goto L_0x00f7
            java.lang.Object r8 = r14.A02(r9)
            com.instagram.model.shopping.productfeed.ProductFeedItem r8 = (com.instagram.model.shopping.productfeed.ProductFeedItem) r8
            if (r8 == 0) goto L_0x00f8
            com.instagram.user.model.Product r0 = r8.A02()
            if (r0 == 0) goto L_0x00f8
            java.util.Set r1 = r12.A0A
            if (r1 == 0) goto L_0x00f8
            java.lang.String r0 = r0.A0H
            boolean r0 = r1.contains(r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L_0x0041:
            r7 = r13[r9]
            if (r7 == 0) goto L_0x00f0
            X.UzB r6 = r12.A02
            X.ULC r0 = r12.A04
            java.lang.String r5 = r0.A04
            X.6u8 r0 = r11.A00
            int r0 = r0.A00
            r16 = r0
            X.0xF r4 = new X.0xF
            r4.<init>()
            java.lang.String r1 = r12.A07
            java.lang.String r0 = "product_collection_id"
            X.0xF.A00(r4, r1, r0)
            java.lang.String r1 = r12.A08
            java.lang.String r0 = "product_collection_type"
            X.0xF.A00(r4, r1, r0)
            com.instagram.api.schemas.ProductCardSubtitleType r15 = r12.A01
            r0 = 0
            r3 = r0
            X.UzB r1 = X.C16675UzB.RECENTLY_VIEWED
            boolean r29 = X.AnonymousClass7TF.A1W(r6, r1)
            boolean r31 = X.C51972G9s.A1Z(r2)
            java.util.List r2 = r12.A09
            int r1 = r2.size()
            if (r9 >= r1) goto L_0x0080
            java.lang.Object r0 = r2.get(r9)
            X.Uw7 r0 = (X.Uw7) r0
        L_0x0080:
            X.UKw r1 = new X.UKw
            r22 = r43
            r24 = r44
            r32 = r46
            r26 = r16
            r27 = r9
            r30 = r28
            r18 = r4
            r19 = r8
            r20 = r6
            r21 = r0
            r23 = r5
            r25 = r3
            r16 = r1
            r17 = r15
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            if (r8 == 0) goto L_0x00f5
            java.lang.String r2 = r8.getId()
            X.0qQ.A07(r2)
            java.util.Map r0 = r11.A01
            java.lang.Object r0 = r0.get(r2)
            X.Vj5 r0 = (X.C17969Vj5) r0
        L_0x00b2:
            X.VWz r2 = new X.VWz
            r4 = r41
            r2.<init>(r0, r4, r3)
            X.UNs r0 = new X.UNs
            r0.<init>(r1, r2)
            r15 = r36
            r16 = r35
            r17 = r34
            r18 = r33
            r19 = r0
            r20 = r7
            X.C17096VHs.A00(r15, r16, r17, r18, r19, r20)
            if (r8 == 0) goto L_0x00f0
            r0 = -1
            r4 = r45
            if (r4 == r0) goto L_0x00f0
            android.view.View r2 = r7.A03
            if (r5 != 0) goto L_0x00da
            java.lang.String r5 = ""
        L_0x00da:
            r1 = 2029(0x7ed, float:2.843E-42)
            X.ULV r0 = new X.ULV
            r0.<init>(r3, r5, r3, r1)
            r15 = r33
            r16 = r2
            r17 = r0
            r18 = r8
            r19 = r4
            r20 = r9
            r15.DZZ(r16, r17, r18, r19, r20)
        L_0x00f0:
            int r9 = r9 + 1
            if (r9 < r10) goto L_0x001f
            return
        L_0x00f5:
            r0 = 0
            goto L_0x00b2
        L_0x00f7:
            r8 = 0
        L_0x00f8:
            r2 = 0
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18247VoE.A01(android.content.Context, X.0iw, com.instagram.common.session.UserSession, X.UCk, X.XC8, X.Ugo, X.WSl, java.lang.Integer, java.lang.String, int, boolean):void");
    }
}
