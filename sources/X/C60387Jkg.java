package X;

import android.view.ViewGroup;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.Jkg  reason: case insensitive filesystem */
public final class C60387Jkg extends 2Rw {
    public List A00 = AnonymousClass7TE.A1C();
    public final AnonymousClass8MH A01;

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C60587Jnw(DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.pencilheart_sticker_card, false));
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(X.C249703kE r20, int r21) {
        /*
            r19 = this;
            r6 = r20
            r5 = 0
            X.0qQ.A0B(r6, r5)
            r1 = r19
            java.util.List r0 = r1.A00
            r11 = r21
            java.lang.Object r4 = r0.get(r11)
            X.Jtl r4 = (X.C60927Jtl) r4
            if (r4 == 0) goto L_0x0044
            X.Jnw r6 = (X.C60587Jnw) r6
            X.8MH r15 = r1.A01
            r14 = 1
            android.widget.GridLayout r8 = r6.A00
            r8.removeAllViews()
            java.util.List r10 = r4.A03
            java.util.Iterator r2 = r10.iterator()
            r1 = 1
        L_0x0025:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x003b
            java.lang.Object r0 = r2.next()
            X.6nz r0 = (X.C317876nz) r0
            java.util.List r0 = r0.A0O
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x0025
            r1 = 0
            goto L_0x0025
        L_0x003b:
            if (r1 == 0) goto L_0x0045
            android.view.View r1 = r6.itemView
            r0 = 8
            r1.setVisibility(r0)
        L_0x0044:
            return
        L_0x0045:
            android.view.View r1 = r6.itemView
            r0 = 2131431319(0x7f0b0f97, float:1.8484364E38)
            android.widget.TextView r9 = X.AnonymousClass7TG.A0R(r1, r0)
            long r0 = r4.A01
            java.util.Locale r3 = X.AnonymousClass1Q2.A02()
            java.lang.String r2 = "MMMM dd"
            java.text.SimpleDateFormat r7 = new java.text.SimpleDateFormat
            r7.<init>(r2, r3)
            boolean r2 = android.text.format.DateUtils.isToday(r0)
            if (r2 == 0) goto L_0x0116
            android.content.Context r1 = X.DbS.A07(r6)
            r0 = 2131957435(0x7f1316bb, float:1.9551454E38)
        L_0x0068:
            java.lang.String r0 = r1.getString(r0)
        L_0x006c:
            X.0qQ.A0A(r0)
            r9.setText(r0)
            if (r21 != 0) goto L_0x0096
            android.view.View r1 = r6.itemView
            r0 = 2131443459(0x7f0b3f03, float:1.8508987E38)
            android.widget.TextView r7 = X.AnonymousClass7TG.A0R(r1, r0)
            long r0 = r4.A00
            android.content.Context r13 = X.DbS.A07(r6)
            long r2 = X.AnonymousClass7TG.A0I()
            long r2 = r2 - r0
            r11 = 0
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x00e2
            java.lang.String r0 = ""
        L_0x0090:
            r7.setText(r0)
            r7.setVisibility(r5)
        L_0x0096:
            java.util.Iterator r9 = r10.iterator()
        L_0x009a:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0044
            java.lang.Object r7 = r9.next()
            X.6nz r7 = (X.C317876nz) r7
            java.util.List r0 = r7.A0O
            java.lang.Object r5 = X.00k.A0J(r0)
            X.6o8 r5 = (X.C317966o8) r5
            if (r5 == 0) goto L_0x009a
            android.view.View r0 = r6.itemView
            android.view.LayoutInflater r1 = X.DbV.A0D(r0)
            r0 = 2131628146(0x7f0e1072, float:1.8883576E38)
            android.view.View r3 = X.DbU.A08(r1, r0)
            r0 = 2131437553(0x7f0b27f1, float:1.8497008E38)
            com.instagram.common.ui.widget.imageview.IgImageView r2 = X.DbX.A0b(r3, r0)
            com.instagram.common.typedurl.ImageUrl r0 = r5.A0H
            com.instagram.common.typedurl.SimpleImageUrl r1 = new com.instagram.common.typedurl.SimpleImageUrl
            r1.<init>(r0)
            X.0iw r0 = r6.A01
            r2.setUrl(r1, r0)
            r8.addView(r3)
            X.LXb r13 = new X.LXb
            r17 = r7
            r18 = r4
            r16 = r5
            r13.<init>(r14, r15, r16, r17, r18)
            X.AnonymousClass0fU.A00(r13, r2)
            goto L_0x009a
        L_0x00e2:
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r11.toDays(r2)
            int r9 = (int) r0
            if (r9 <= 0) goto L_0x00fa
            android.content.res.Resources r1 = r13.getResources()
            r0 = 2131820994(0x7f1101c2, float:1.9274719E38)
        L_0x00f2:
            java.lang.String r0 = X.DbY.A0d(r1, r9, r0)
            X.0qQ.A07(r0)
            goto L_0x0090
        L_0x00fa:
            long r0 = r11.toHours(r2)
            int r9 = (int) r0
            if (r9 <= 0) goto L_0x0109
            android.content.res.Resources r1 = r13.getResources()
            r0 = 2131820995(0x7f1101c3, float:1.927472E38)
            goto L_0x00f2
        L_0x0109:
            long r0 = r11.toMinutes(r2)
            int r9 = (int) r0
            android.content.res.Resources r1 = r13.getResources()
            r0 = 2131820996(0x7f1101c4, float:1.9274723E38)
            goto L_0x00f2
        L_0x0116:
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 + r0
            boolean r2 = android.text.format.DateUtils.isToday(r2)
            if (r2 == 0) goto L_0x0129
            android.content.Context r1 = X.DbS.A07(r6)
            r0 = 2131957436(0x7f1316bc, float:1.9551456E38)
            goto L_0x0068
        L_0x0129:
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            java.util.Date r2 = new java.util.Date
            r2.<init>(r0)
            java.lang.String r0 = r7.format(r2)
            goto L_0x006c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60387Jkg.onBindViewHolder(X.3kE, int):void");
    }

    public C60387Jkg(AnonymousClass8MH r2) {
        this.A01 = r2;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-368610761);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(1615604995, A03);
        return size;
    }
}
