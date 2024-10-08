package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class UA7 extends 2Rw {
    public final C384859i0 A00;
    public final UserSession A01;
    public final List A02;

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context A0C = JTP.A0C(viewGroup, 0);
        return new C14902UEh(A0C, LayoutInflater.from(A0C).inflate(i, viewGroup, false), this.A01);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x00f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(X.C249703kE r27, int r28) {
        /*
            r26 = this;
            r8 = r27
            r7 = 0
            X.0qQ.A0B(r8, r7)
            r2 = r26
            java.util.List r0 = r2.A02
            r1 = r28
            X.1Xj r6 = X.DbZ.A0T(r0, r1)
            X.UEh r8 = (X.C14902UEh) r8
            r0 = 5
            X.WB3 r5 = new X.WB3
            r5.<init>(r1, r0, r6, r2)
            boolean r0 = r6.CeS()
            r8.A01 = r0
            com.instagram.common.session.UserSession r0 = r8.A0B
            com.instagram.user.model.User r16 = r6.A2A(r0)
            r16.getClass()
            android.content.Context r0 = r8.A08
            r25 = r0
            java.lang.String r18 = r6.getId()
            r4 = 0
            r9 = 1
            X.0qQ.A0B(r0, r9)
            android.content.res.Resources r1 = r25.getResources()
            r0 = 2131165193(0x7f070009, float:1.7944596E38)
            r1.getDimensionPixelSize(r0)
            r0 = 2131165572(0x7f070184, float:1.7945365E38)
            r1.getDimensionPixelSize(r0)
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            r1.getDimensionPixelSize(r0)
            int r10 = r8.A04
            int r3 = r8.A05
            int r2 = r8.A03
            int r1 = r8.A07
            int r0 = r8.A06
            X.8vQ r12 = new X.8vQ
            r15 = r4
            r17 = r4
            r19 = r2
            r20 = r10
            r21 = r3
            r22 = r0
            r23 = r1
            r24 = r7
            r13 = r25
            r14 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            com.instagram.common.ui.widget.imageview.IgImageView r11 = r8.A0F
            android.graphics.drawable.Drawable r0 = r8.A0A
            r11.setImageDrawable(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r10 = r8.A0G
            r10.setImageDrawable(r12)
            com.instagram.common.ui.base.IgTextView r12 = r8.A0C
            long r0 = r6.A17()
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r2
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r2 = r13.toMinutes(r0)
            long r0 = r13.toHours(r0)
            r14 = 0
            int r13 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r13 >= 0) goto L_0x0107
            r2 = 0
        L_0x0094:
            android.content.res.Resources r15 = r8.A09
            r14 = 2131820791(0x7f1100f7, float:1.9274307E38)
            int r13 = (int) r2
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
        L_0x00a0:
            r9[r7] = r0
            java.lang.String r0 = r15.getQuantityString(r14, r13, r9)
        L_0x00a6:
            r12.setText(r0)
            r1 = 4
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r8.A0E
            r0.setVisibility(r1)
            r12.setVisibility(r1)
            r10.setVisibility(r1)
            r11.setVisibility(r1)
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r8.A0H
            X.DbS.A1T(r0)
            int r0 = r8.A02
            float r1 = (float) r0
            r11 = 1043207291(0x3e2e147b, float:0.17)
            r12 = 1050253722(0x3e99999a, float:0.3)
            X.JdE r0 = new X.JdE
            r9 = r0
            r10 = r25
            r13 = r1
            r14 = r11
            r15 = r12
            r16 = r7
            r17 = r7
            r18 = r7
            r19 = r7
            r20 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r8.A00 = r0
            android.view.View r1 = r8.itemView
            r0 = 11
            X.WC3.A00(r1, r0, r8)
            android.view.View r0 = r8.itemView
            X.AnonymousClass0fU.A00(r5, r0)
            X.JdE r1 = r8.A00
            r1.A02 = r8
            android.graphics.Bitmap r0 = r1.A01
            if (r0 == 0) goto L_0x00f4
            r8.CyJ(r0, r1)
        L_0x00f4:
            com.instagram.common.typedurl.ImageUrl r1 = r6.A1Q()
            if (r1 != 0) goto L_0x0101
            java.lang.String r0 = ""
            com.instagram.common.typedurl.SimpleImageUrl r1 = new com.instagram.common.typedurl.SimpleImageUrl
            r1.<init>(r0)
        L_0x0101:
            X.JdE r0 = r8.A00
            r0.A02(r1, r4)
            return
        L_0x0107:
            r14 = 60
            int r13 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r13 < 0) goto L_0x0094
            r13 = 24
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 > 0) goto L_0x0120
            android.content.res.Resources r15 = r8.A09
            r14 = 2131820790(0x7f1100f6, float:1.9274305E38)
            int r13 = (int) r0
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x00a0
        L_0x0120:
            java.lang.String r0 = ""
            goto L_0x00a6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UA7.onBindViewHolder(X.3kE, int):void");
    }

    public UA7(UserSession userSession, C384859i0 r2, List list) {
        AnonymousClass7TG.A1O(userSession, list);
        this.A01 = userSession;
        this.A02 = list;
        this.A00 = r2;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-1529711364);
        int size = this.A02.size();
        AnonymousClass0fD.A0A(153468416, A03);
        return size;
    }

    public final int getItemViewType(int i) {
        AnonymousClass0fD.A0A(604943483, AnonymousClass0fD.A03(-1546420355));
        return R.layout.mention_card;
    }
}
