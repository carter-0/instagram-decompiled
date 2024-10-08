package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.Vwu  reason: case insensitive filesystem */
public abstract class C18696Vwu {
    public static final View A00(Context context, ViewGroup viewGroup, boolean z) {
        View A09 = DbU.A09(DbT.A0B(context), viewGroup, R.layout.layout_product_pivots, false);
        C14890UDs uDs = new C14890UDs(A09);
        A09.setTag(uDs);
        if (z) {
            DbT.A16(context, A09, 2Yu.A0H(context, R.attr.igds_color_secondary_background));
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        linearLayoutManager.A0v(true);
        RecyclerView recyclerView = uDs.A04;
        recyclerView.setLayoutManager(linearLayoutManager);
        JTP.A1D(recyclerView, AnonymousClass7TH.A01(context), C51972G9s.A08(context));
        return A09;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004e, code lost:
        if (r0 != 1) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.content.Context r10, X.AnonymousClass0iw r11, com.instagram.common.session.UserSession r12, X.C268374dH r13, X.C17524VZd r14, X.C231032ql r15, X.C14890UDs r16, java.lang.Integer r17) {
        /*
            r4 = 0
            X.0qQ.A0B(r10, r4)
            r7 = 1
            r1 = 2
            X.0qQ.A0B(r12, r7)
            X.0qQ.A0B(r11, r1)
            r0 = 3
            r8 = r16
            X.C51973G9u.A0r(r0, r8, r15, r13)
            r0 = 7
            r3 = r14
            X.0qQ.A0B(r14, r0)
            androidx.recyclerview.widget.RecyclerView r2 = r8.A04
            r2.A0b()
            r0 = 25
            X.UB1.A00(r2, r14, r0)
            X.3pI r5 = r2.A0D
            if (r5 == 0) goto L_0x0193
            android.os.Parcelable r0 = r14.A00
            r5.A1P(r0)
            android.widget.TextView r9 = r8.A03
            java.lang.String r0 = r13.getTitle()
            r9.setText(r0)
            boolean r0 = r13.Esx(r12)
            android.widget.TextView r5 = r8.A00
            if (r0 == 0) goto L_0x0152
            r5.setVisibility(r4)
            X.X9B r0 = r13.Aif()
            if (r0 == 0) goto L_0x0050
            java.lang.Integer r0 = r0.Awk()
            int r0 = r0.intValue()
            if (r0 == r1) goto L_0x00f4
            if (r0 == r7) goto L_0x0145
        L_0x0050:
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131165220(0x7f070024, float:1.794465E38)
            int r0 = r1.getDimensionPixelSize(r0)
            float r0 = (float) r0
            r7 = 0
            r9.setTextSize(r4, r0)
            android.widget.TextView r0 = r8.A02
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r8.A01
            r0.setVisibility(r1)
            java.lang.CharSequence r0 = r5.getText()
            boolean r0 = X.0mp.A0B(r0)
            if (r0 == 0) goto L_0x0078
            r7 = 8
        L_0x0078:
            r5.setVisibility(r7)
            X.X9B r0 = r13.Aif()
            r1 = 0
            if (r0 == 0) goto L_0x00f2
            java.lang.String r0 = r0.getText()
        L_0x0086:
            r5.setText(r0)
            r5.setCompoundDrawables(r1, r1, r1, r1)
            r0 = 63
            X.WB4.A00(r5, r15, r8, r13, r0)
        L_0x0091:
            X.2Rw r5 = r2.A0A
            X.UAV r5 = (X.UAV) r5
            if (r5 != 0) goto L_0x0159
            X.XC9 r14 = r15.BgB()
            boolean r0 = r13 instanceof X.C268364dG
            if (r0 == 0) goto L_0x00c5
            r0 = r13
            X.4dG r0 = (X.C268364dG) r0
            java.lang.String r16 = r0.A00()
        L_0x00a6:
            X.UAV r9 = new X.UAV
            r15 = r17
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            com.instagram.model.shopping.productfeed.ProductFeedResponse r0 = r13.Bg7()
            java.util.List r0 = r0.A03
            java.util.List r1 = X.C51966G9m.A1J(r0)
            java.util.List r0 = r9.A08
            X.DbW.A0z(r9, r1, r0)
            r9.A01 = r3
            r9.notifyDataSetChanged()
            r2.setAdapter(r9)
            return
        L_0x00c5:
            X.UzB r0 = r13.B5W()
            r16 = 0
            if (r0 == 0) goto L_0x00a6
            int r1 = r0.ordinal()
            r0 = 9
            if (r1 == r0) goto L_0x00ef
            r0 = 11
            if (r1 == r0) goto L_0x00ec
            r0 = 10
            if (r1 == r0) goto L_0x00e9
            r0 = 16
            if (r1 == r0) goto L_0x00e6
            if (r1 != r4) goto L_0x00a6
            java.lang.String r16 = "shopping_bag_product_collection"
            goto L_0x00a6
        L_0x00e6:
            java.lang.String r16 = "incentive_products"
            goto L_0x00a6
        L_0x00e9:
            java.lang.String r16 = "products_from_saved_media_hscroll"
            goto L_0x00a6
        L_0x00ec:
            java.lang.String r16 = "products_from_liked_media_hscroll"
            goto L_0x00a6
        L_0x00ef:
            java.lang.String r16 = "products_from_followed_brands_hscroll"
            goto L_0x00a6
        L_0x00f2:
            r0 = r1
            goto L_0x0086
        L_0x00f4:
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131165216(0x7f070020, float:1.7944643E38)
            X.C13990Tnq.A0o(r1, r9, r0)
            X.X9B r0 = r13.Aif()
            r7 = 0
            if (r0 == 0) goto L_0x0145
            java.lang.String r0 = r0.getText()
            if (r0 == 0) goto L_0x0145
            android.widget.TextView r0 = r8.A02
            r0.setVisibility(r4)
            android.widget.TextView r1 = r8.A01
            r1.setVisibility(r4)
            X.X9B r0 = r13.Aif()
            if (r0 == 0) goto L_0x011f
            java.lang.String r7 = r0.getText()
        L_0x011f:
            r1.setText(r7)
            r0 = 15
            X.WBE.A00(r1, r0, r15, r13)
        L_0x0127:
            X.DbS.A1C(r5)
            r0 = 2131239023(0x7f08206f, float:1.8094341E38)
            android.graphics.drawable.Drawable r1 = r10.getDrawable(r0)
            if (r1 == 0) goto L_0x013a
            int r0 = X.2Yu.A09(r10)
            X.DbX.A11(r10, r1, r0)
        L_0x013a:
            r0 = 0
            r5.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r0, r0, r0)
            r0 = 62
            X.WB4.A00(r5, r15, r13, r14, r0)
            goto L_0x0091
        L_0x0145:
            android.widget.TextView r0 = r8.A02
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r8.A01
            r0.setVisibility(r1)
            goto L_0x0127
        L_0x0152:
            r0 = 8
            r5.setVisibility(r0)
            goto L_0x0091
        L_0x0159:
            com.instagram.model.shopping.productfeed.ProductFeedResponse r0 = r13.Bg7()
            java.util.List r0 = r0.A03
            java.util.List r0 = X.C51966G9m.A1J(r0)
            java.util.List r6 = r5.A08
            boolean r0 = X.C51966G9m.A1a(r6, r0)
            if (r0 == 0) goto L_0x018f
            X.4dH r0 = r5.A00
            X.UzB r1 = r0.B5W()
            X.UzB r0 = r13.B5W()
            if (r1 == r0) goto L_0x0179
            r5.A00 = r13
        L_0x0179:
            com.instagram.model.shopping.productfeed.ProductFeedResponse r0 = r13.Bg7()
            java.util.List r0 = r0.A03
            java.util.List r0 = X.C51966G9m.A1J(r0)
            X.DbW.A0z(r5, r0, r6)
            r5.A01 = r14
            r5.notifyDataSetChanged()
            r2.A0o(r4)
            return
        L_0x018f:
            r5.notifyDataSetChanged()
            return
        L_0x0193:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18696Vwu.A01(android.content.Context, X.0iw, com.instagram.common.session.UserSession, X.4dH, X.VZd, X.2ql, X.UDs, java.lang.Integer):void");
    }

    public static final void A02(Context context, AnonymousClass0iw r13, UserSession userSession, C231032ql r15, C14890UDs uDs, String str) {
        Context context2 = context;
        0qQ.A0B(context, 0);
        AnonymousClass0iw r5 = r13;
        UserSession userSession2 = userSession;
        C231032ql r9 = r15;
        C14890UDs uDs2 = uDs;
        C51974G9v.A1P(userSession, r13, uDs2, r15);
        C268344dE A00 = C268334dD.A00(userSession);
        C268364dG r7 = (C268364dG) A00.A00.get(str);
        if (r7 != null) {
            Map map = A00.A01;
            String Bxn = r7.Bxn();
            C17524VZd vZd = (C17524VZd) map.get(Bxn);
            if (vZd == null) {
                vZd = new C17524VZd(r7, 0);
                map.put(Bxn, vZd);
            }
            A01(context2, r5, userSession2, r7, vZd, r9, uDs2, (Integer) null);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
