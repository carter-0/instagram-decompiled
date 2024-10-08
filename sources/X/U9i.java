package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class U9i extends 2Rw {
    public C229382nI A00;
    public UserSession A01;
    public VOG A02;
    public UZ2 A03;
    public C16725V3i A04;
    public Integer A05;
    public String A06;
    public List A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r2.isEmpty() != false) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C45411Cvr A00(int r4) {
        /*
            r3 = this;
            java.util.List r2 = r3.A07
            boolean r0 = r3.A08
            if (r0 != 0) goto L_0x000d
            boolean r1 = r2.isEmpty()
            r0 = 2
            if (r1 == 0) goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            int r4 = r4 - r0
            java.lang.Object r0 = r2.get(r4)
            X.Cvr r0 = (X.C45411Cvr) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U9i.A00(int):X.Cvr");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(X.C249703kE r31, int r32) {
        /*
            r30 = this;
            r8 = r31
            int r1 = r8.mItemViewType
            r24 = 1
            r9 = r30
            r29 = r32
            r0 = r24
            if (r1 == r0) goto L_0x02e2
            r0 = 2
            if (r1 == r0) goto L_0x00c3
            r0 = 3
            if (r1 != r0) goto L_0x003a
            r6 = r8
            X.UBy r6 = (X.C14844UBy) r6
            X.3uy r1 = X.C255943uy.FAILED
            r5 = 0
        L_0x001a:
            X.UZ2 r4 = r9.A03
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r6.A00
            r0.setLoadingStatus(r1)
            int r3 = r1.ordinal()
            r2 = 0
            r1 = 0
            android.view.View r0 = r6.itemView
            if (r3 == r2) goto L_0x00b8
            r0.setVisibility(r2)
            android.view.View r2 = r6.itemView
            r1 = 36
            X.WB9 r0 = new X.WB9
            r0.<init>((X.UZ2) r4, (int) r1)
        L_0x0037:
            X.AnonymousClass0fU.A00(r0, r2)
        L_0x003a:
            int r1 = r8.mItemViewType
            if (r1 == 0) goto L_0x007e
            r23 = 4
            r0 = r23
            if (r1 == r0) goto L_0x00f7
            r0 = 5
            if (r1 != r0) goto L_0x005c
            X.UDQ r8 = (X.UDQ) r8
            java.lang.String r6 = r9.A06
            boolean r2 = r9.A0A
            X.UZ2 r5 = r9.A03
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r4 = 8
            if (r0 == 0) goto L_0x005d
            android.view.View r0 = r8.A00
        L_0x0059:
            r0.setVisibility(r4)
        L_0x005c:
            return
        L_0x005d:
            android.view.View r0 = r8.A00
            r3 = 0
            r0.setVisibility(r3)
            android.view.View r1 = r8.itemView
            if (r2 == 0) goto L_0x00cc
            r1.setClickable(r3)
            android.view.View r2 = r8.itemView
            android.content.res.Resources r1 = X.DbU.A05(r2)
            r0 = 2131965491(0x7f133633, float:1.9567793E38)
            X.DbT.A1A(r1, r2, r0)
            android.view.View r0 = r8.A01
            r0.setVisibility(r3)
            android.view.View r0 = r8.A02
            goto L_0x0059
        L_0x007e:
            X.UEZ r8 = (X.UEZ) r8
            X.V3i r3 = r9.A04
            if (r3 != 0) goto L_0x008b
            android.view.ViewGroup r1 = r8.A01
            r0 = 4
            r1.setVisibility(r0)
            return
        L_0x008b:
            android.view.ViewGroup r2 = r8.A01
            r0 = 0
            r2.setVisibility(r0)
            android.widget.TextView r1 = r8.A03
            java.lang.String r0 = r3.A02
            r1.setText(r0)
            android.widget.TextView r1 = r8.A02
            java.lang.String r0 = r3.A01
            r1.setText(r0)
            android.content.Context r0 = r2.getContext()
            X.UEZ.A00(r0, r8, r3)
            long r3 = r3.A00
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x005c
            X.NQs r1 = r8.A04
            java.util.Date r0 = X.C13989Tnp.A0t(r3)
            r1.A0A(r0)
            return
        L_0x00b8:
            if (r5 == 0) goto L_0x00bb
            r1 = 4
        L_0x00bb:
            r0.setVisibility(r1)
            android.view.View r2 = r6.itemView
            r0 = 0
            goto L_0x0037
        L_0x00c3:
            r6 = r8
            X.UBy r6 = (X.C14844UBy) r6
            X.3uy r1 = X.C255943uy.LOADING
            boolean r5 = r9.A09
            goto L_0x001a
        L_0x00cc:
            r0 = r24
            r1.setClickable(r0)
            android.view.View r0 = r8.itemView
            r0.setContentDescription(r6)
            android.view.View r0 = r8.A01
            r0.setVisibility(r4)
            android.view.View r0 = r8.A02
            r0.setVisibility(r3)
            android.view.View r0 = r8.itemView
            r0.setVisibility(r3)
            android.widget.TextView r0 = r8.A03
            r0.setText(r6)
            android.view.View r2 = r8.itemView
            r1 = 43
            X.WB9 r0 = new X.WB9
            r0.<init>((X.UZ2) r5, (int) r1)
            X.AnonymousClass0fU.A00(r0, r2)
            return
        L_0x00f7:
            r0 = r29
            X.Cvr r1 = r9.A00(r0)
            r10 = r8
            X.UDP r10 = (X.UDP) r10
            X.V4V r7 = r1.A03
            r7.getClass()
            int r0 = r1.A01
            r28 = r0
            int r0 = r1.A00
            r27 = r0
            X.UZ2 r0 = r9.A03
            r26 = r0
            X.V4V r0 = r10.A00
            boolean r0 = r7.equals(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x02f9
            r10.A00 = r7
            android.widget.TextView r1 = r10.A03
            java.lang.String r0 = r7.A01
            r1.setText(r0)
            java.lang.String r0 = r7.A00
            r6 = 0
            android.widget.TextView r1 = r10.A02
            if (r0 != 0) goto L_0x02a8
            r0 = 8
            r1.setVisibility(r0)
        L_0x0130:
            android.widget.LinearLayout r0 = r10.A01
            r25 = r0
            r25.removeAllViews()
            r5 = 0
        L_0x0138:
            java.util.List r2 = r7.A02
            int r0 = r2.size()
            if (r5 >= r0) goto L_0x02bc
            int r0 = X.C51966G9m.A06(r2)
            r22 = 20
            if (r5 != r0) goto L_0x014a
            r22 = 0
        L_0x014a:
            android.view.LayoutInflater r3 = X.DbV.A0D(r25)
            r1 = 2131629866(0x7f0e172a, float:1.8887065E38)
            r0 = r25
            android.view.View r11 = r3.inflate(r1, r0, r6)
            if (r11 == 0) goto L_0x02b0
            r0 = 2131441767(0x7f0b3867, float:1.8505555E38)
            android.view.View r21 = r11.requireViewById(r0)
            r0 = 2131441768(0x7f0b3868, float:1.8505557E38)
            android.view.View r3 = r11.requireViewById(r0)
            r0 = 2131428839(0x7f0b05e7, float:1.8479334E38)
            android.widget.TextView r4 = X.DbU.A0G(r11, r0)
            r0 = 2131431131(0x7f0b0edb, float:1.8483983E38)
            android.widget.TextView r1 = X.DbU.A0G(r11, r0)
            r0 = 2131441780(0x7f0b3874, float:1.8505581E38)
            android.widget.ImageView r20 = X.DbU.A0F(r11, r0)
            r0 = r25
            r0.addView(r11)
            java.lang.Object r2 = r2.get(r5)
            X.Cwr r2 = (X.C45460Cwr) r2
            java.lang.String r0 = r2.A03
            r4.setText(r0)
            java.lang.String r0 = r2.A04
            r1.setText(r0)
            r1 = 42
            r0 = r26
            X.WBG.A01(r3, r1, r2, r0)
            java.lang.String r1 = r2.A05
            java.lang.String r0 = "register_to_vote"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0288
            android.content.Context r11 = r20.getContext()
            android.content.res.Resources r1 = r11.getResources()
            r0 = 2131976724(0x7f136214, float:1.9590577E38)
            java.lang.String r2 = r1.getString(r0)
            android.text.Spannable r0 = X.C306386Ly.A0d
            java.util.List r1 = java.util.Collections.singletonList(r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            X.8vG r4 = new X.8vG
            r4.<init>(r11, r0)
            android.content.res.Resources r1 = r11.getResources()
            r0 = 2131165503(0x7f07013f, float:1.7945225E38)
            int r0 = r1.getDimensionPixelSize(r0)
            float r1 = (float) r0
            r0 = 2131165204(0x7f070014, float:1.7944619E38)
            android.text.SpannableStringBuilder r0 = X.C39819AAq.A00(r11, r2, r6, r0)
            r3 = 0
            X.AJB.A08(r11, r4, r1, r3, r3)
            r4.A0L(r0)
            r0 = 1091567616(0x41100000, float:9.0)
            float r0 = X.0nA.A00(r11, r0)
            int r0 = (int) r0
            float r0 = (float) r0
            r19 = r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = X.0nA.A00(r11, r1)
            int r0 = (int) r0
            float r2 = (float) r0
            r12 = 1092616192(0x41200000, float:10.0)
            float r0 = X.0nA.A00(r11, r12)
            int r0 = (int) r0
            float r0 = (float) r0
            r18 = r0
            float r0 = X.0nA.A00(r11, r12)
            int r0 = (int) r0
            float r12 = (float) r0
            int r0 = r4.A0A
            float r14 = (float) r0
            float r14 = r14 + r18
            float r14 = r14 + r12
            int r0 = r4.A06
            float r13 = (float) r0
            float r13 = r13 + r19
            float r13 = r13 + r2
            r0 = 5
            float r12 = X.0nA.A04(r11, r0)
            float r2 = X.0nA.A04(r11, r0)
            float r1 = r1 * r2
            float r0 = r14 + r1
            int r0 = (int) r0
            r15 = r0
            float r1 = r1 + r13
            int r0 = (int) r1
            r1 = r0
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r17 = android.graphics.Bitmap.createBitmap(r15, r1, r0)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r0 = r17
            r1.<init>(r0)
            android.graphics.Path r16 = new android.graphics.Path
            r16.<init>()
            android.graphics.RectF r15 = new android.graphics.RectF
            r15.<init>(r3, r3, r14, r13)
            r0 = 8
            float[] r14 = new float[r0]
            r14[r6] = r12
            X.C13989Tnp.A1U(r14, r12)
            r14[r23] = r12
            X.C51975G9x.A1L(r14, r12)
            android.graphics.Path$Direction r13 = android.graphics.Path.Direction.CW
            r0 = r16
            r0.addRoundRect(r15, r14, r13)
            android.graphics.Paint r12 = new android.graphics.Paint
            r0 = r24
            r12.<init>(r0)
            X.AnonymousClass7TE.A1Q(r12)
            r0 = 2131099782(0x7f060086, float:1.7811927E38)
            X.AnonymousClass7TE.A1N(r11, r12, r0)
            int r0 = r11.getColor(r0)
            r12.setShadowLayer(r2, r3, r3, r0)
            r1.translate(r2, r2)
            r0 = r16
            r1.drawPath(r0, r12)
            r0 = 2131100036(0x7f060184, float:1.7812442E38)
            X.AnonymousClass7TE.A1N(r11, r12, r0)
            int r0 = r11.getColor(r0)
            r12.setShadowLayer(r3, r3, r3, r0)
            r0 = r16
            r1.drawPath(r0, r12)
            r2 = r18
            r0 = r19
            r1.translate(r2, r0)
            r4.draw(r1)
            r1 = r20
            r0 = r17
            r1.setImageBitmap(r0)
        L_0x0288:
            android.content.Context r3 = r21.getContext()
            android.view.ViewGroup$MarginLayoutParams r2 = X.DbS.A0D(r21)
            float r0 = X.0nA.A04(r3, r6)
            int r1 = (int) r0
            r0 = r22
            float r0 = X.0nA.A04(r3, r0)
            int r0 = (int) r0
            r2.setMargins(r6, r1, r6, r0)
            r0 = r21
            r0.setLayoutParams(r2)
            int r5 = r5 + 1
            goto L_0x0138
        L_0x02a8:
            r1.setVisibility(r6)
            r1.setText(r0)
            goto L_0x0130
        L_0x02b0:
            r0 = 3474(0xd92, float:4.868E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x02bc:
            android.view.View r5 = r10.itemView
            android.content.Context r4 = r5.getContext()
            android.content.res.Resources r0 = r4.getResources()
            r1 = 2131165184(0x7f070000, float:1.7944578E38)
            int r3 = r0.getDimensionPixelSize(r1)
            r0 = r28
            float r0 = X.0nA.A04(r4, r0)
            int r2 = (int) r0
            int r1 = X.AnonymousClass7TF.A02(r4, r1)
            r0 = r27
            float r0 = X.0nA.A04(r4, r0)
            int r0 = (int) r0
            r5.setPadding(r3, r2, r1, r0)
            goto L_0x02f9
        L_0x02e2:
            r0 = r29
            X.Cvr r0 = r9.A00(r0)
            r4 = r8
            X.Gj0 r4 = (X.C53128Gj0) r4
            X.4g6 r3 = r0.A02
            r3.getClass()
            X.2nI r2 = r9.A00
            int r1 = r0.A01
            int r0 = r0.A00
            X.C56311HwO.A01(r2, r3, r4, r1, r0)
        L_0x02f9:
            android.view.View r2 = r8.itemView
            r0 = r29
            X.Cvr r1 = r9.A00(r0)
            r0 = r24
            X.Dba.A0j(r0, r2, r1)
            r1 = 0
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.Void"
            X.0qQ.A0C(r1, r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U9i.onBindViewHolder(X.3kE, int):void");
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new UEZ(DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.voting_info_center_header), this.A01);
        } else if (i == 4) {
            return new UDP(DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.voting_info_center_share_with_friends));
        } else {
            if (i == 5) {
                return new UDQ(DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.voting_info_center_state_selector));
            }
            if (i == 1) {
                return (C249703kE) DbT.A0o(C56311HwO.A00(viewGroup));
            }
            if (i == 2 || i == 3) {
                return new C14844UBy(DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.info_center_loading_spinner));
            }
            int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            return new C249703kE(new View(viewGroup.getContext()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        if (r4.A07.isEmpty() != false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        if (r4.A07.isEmpty() != false) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getItemCount() {
        /*
            r4 = this;
            r0 = 123022233(0x7552b99, float:1.6037151E-34)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Integer r0 = r4.A05
            int r1 = r0.intValue()
            r0 = 1
            if (r1 == r0) goto L_0x0038
            r0 = 2
            if (r1 == r0) goto L_0x0024
            r0 = 0
            if (r1 == r0) goto L_0x0024
            java.lang.String r0 = "Unrecognized state when calculating item count"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            r0 = 1750476359(0x68562647, float:4.04517E24)
            X.AnonymousClass0fD.A0A(r0, r3)
            throw r1
        L_0x0024:
            boolean r0 = r4.A08
            if (r0 != 0) goto L_0x0031
            java.util.List r0 = r4.A07
            boolean r1 = r0.isEmpty()
            r0 = 2
            if (r1 == 0) goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            int r2 = r0 + 1
            r0 = -702227581(0xffffffffd624db83, float:-4.5315676E13)
            goto L_0x0050
        L_0x0038:
            java.util.List r0 = r4.A07
            int r2 = r0.size()
            boolean r0 = r4.A08
            if (r0 != 0) goto L_0x004b
            java.util.List r0 = r4.A07
            boolean r1 = r0.isEmpty()
            r0 = 2
            if (r1 == 0) goto L_0x004c
        L_0x004b:
            r0 = 0
        L_0x004c:
            int r2 = r2 + r0
            r0 = -770436863(0xffffffffd2141101, float:-1.5898511E11)
        L_0x0050:
            X.AnonymousClass0fD.A0A(r0, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U9i.getItemCount():int");
    }

    public final int getItemViewType(int i) {
        int i2;
        int i3;
        int A032 = AnonymousClass0fD.A03(-1224578953);
        if (!this.A08 && !this.A07.isEmpty()) {
            if (i == 0) {
                i2 = 0;
                i3 = 1355883291;
            } else if (i == 1) {
                i2 = 5;
                i3 = -1589293864;
            }
            AnonymousClass0fD.A0A(i3, A032);
            return i2;
        }
        Integer num = this.A05;
        Integer num2 = AnonymousClass05K.A01;
        if (num == num2 && A00(i).A04 == AnonymousClass05K.A0C) {
            i2 = 4;
            i3 = 418775074;
            AnonymousClass0fD.A0A(i3, A032);
            return i2;
        }
        int A033 = AnonymousClass0fD.A03(-99946725);
        int intValue = this.A05.intValue();
        i2 = 3;
        if (intValue == 1) {
            i2 = -1;
            if (A00(i).A04 == num2) {
                i2 = 1;
            }
        } else if (intValue != 2) {
            if (intValue == 0) {
                i2 = 2;
            } else {
                IllegalStateException A0c = DbW.A0c(C273654mx.A00(115), "LOADING");
                AnonymousClass0fD.A0A(1071285006, A033);
                throw A0c;
            }
        }
        AnonymousClass0fD.A0A(-125698560, A033);
        i3 = -2019032825;
        AnonymousClass0fD.A0A(i3, A032);
        return i2;
    }
}
