package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.util.recyclerview.LinearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1;

/* renamed from: X.2sF  reason: invalid class name and case insensitive filesystem */
public final class C231742sF extends C231632rz {
    public C2363633l A00;
    public C2357130x A01;
    public boolean A02;
    public LinearLayoutManager A03;
    public final AnonymousClass2p0 A04;
    public final Context A05;
    public final AnonymousClass0iw A06;
    public final UserSession A07;
    public final C230162p3 A08;
    public final AnonymousClass2sG A09;
    public final Integer A0A;
    public final String A0B = "netego_interests";

    public final String getBinderGroupName() {
        return "InterestRecommendations";
    }

    public final int getViewTypeCount() {
        return 3;
    }

    public C231742sF(Context context, AnonymousClass0iw r4, UserSession userSession, AnonymousClass2p0 r6, C230162p3 r7, Integer num) {
        this.A05 = context;
        this.A04 = r6;
        this.A07 = userSession;
        this.A09 = new AnonymousClass2sG(context, r4);
        this.A06 = r4;
        this.A08 = r7;
        this.A0A = num;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008d, code lost:
        if (r5.A0B != false) goto L_0x008f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r24, android.view.View r25, java.lang.Object r26, java.lang.Object r27) {
        /*
            r23 = this;
            r5 = r27
            r4 = r26
            r0 = -981747924(0xffffffffc57bb72c, float:-4027.4482)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.3UH r4 = (X.AnonymousClass3UH) r4
            X.4aa r5 = (X.C266934aa) r5
            r9 = r23
            r1 = r24
            r22 = r25
            if (r24 == 0) goto L_0x0033
            r0 = 1
            if (r1 == r0) goto L_0x01cd
            r0 = 2
            if (r1 == r0) goto L_0x0033
            r0 = 1047(0x417, float:1.467E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = X.002.A0O(r0, r1)
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r0)
            r0 = -1363844165(0xffffffffaeb563bb, float:-8.248643E-11)
            X.AnonymousClass0fD.A0A(r0, r2)
            throw r1
        L_0x0033:
            android.content.Context r3 = r9.A05
            java.lang.Object r6 = r22.getTag()
            r6.getClass()
            X.Hoo r6 = (X.C55867Hoo) r6
            X.2p0 r1 = r9.A04
            X.30x r8 = r9.A01
            X.2sG r7 = r9.A09
            com.instagram.common.session.UserSession r0 = r9.A07
            r21 = r0
            X.0iw r0 = r9.A06
            r20 = r0
            java.lang.String r0 = r9.A0B
            r19 = r0
            java.lang.Integer r0 = r9.A0A
            r18 = r0
            X.2p3 r0 = r9.A08
            r16 = r0
            android.view.View r12 = r6.A02
            int r9 = r5.getPosition()
            r11 = 8
            r10 = 0
            r0 = 0
            if (r9 != 0) goto L_0x0066
            r0 = 8
        L_0x0066:
            r12.setVisibility(r0)
            java.lang.String r9 = r4.A0K
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x0076
            android.widget.TextView r0 = r6.A05
            r0.setText(r9)
        L_0x0076:
            java.lang.String r12 = r4.A0J
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x01c6
            android.widget.TextView r0 = r6.A04
            r0.setVisibility(r10)
            r0.setText(r12)
        L_0x0086:
            boolean r0 = r5.A0A
            if (r0 == 0) goto L_0x008f
            boolean r12 = r5.A0B
            r0 = 1
            if (r12 == 0) goto L_0x0090
        L_0x008f:
            r0 = 0
        L_0x0090:
            android.widget.TextView r12 = r6.A03
            if (r0 == 0) goto L_0x01c0
            r12.setVisibility(r10)
            java.lang.String r13 = r4.A0A
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 == 0) goto L_0x00a6
            r0 = 2131972971(0x7f13536b, float:1.9582965E38)
            java.lang.String r13 = r3.getString(r0)
        L_0x00a6:
            r12.setText(r13)
            X.W9Z r0 = new X.W9Z
            r0.<init>(r4, r1)
            X.AnonymousClass0fU.A00(r0, r12)
            X.1UQ r0 = r4.A05
            if (r0 != 0) goto L_0x00b7
            X.1UQ r0 = X.1UQ.A0v
        L_0x00b7:
            r1.DLK(r0)
        L_0x00ba:
            boolean r0 = r4.A0R
            if (r0 == 0) goto L_0x0185
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r11 = r6.A06
            r11.setVisibility(r10)
            X.IBR r0 = new X.IBR
            r0.<init>(r5, r4, r8)
            X.AnonymousClass0fU.A00(r0, r11)
            boolean r0 = r5.A0A
            if (r0 == 0) goto L_0x011a
            boolean r0 = r5.A0B
            if (r0 != 0) goto L_0x011a
            X.4gb r15 = new X.4gb
            r15.<init>()
            android.view.ViewGroup$LayoutParams r8 = r12.getLayoutParams()
            X.2dQ r8 = (X.C71492dQ) r8
            r0 = -1
            r8.A0M = r0
            r12.setLayoutParams(r8)
            android.view.View r14 = r6.A01
            androidx.constraintlayout.widget.ConstraintLayout r14 = (androidx.constraintlayout.widget.ConstraintLayout) r14
            r15.A0I(r14)
            r13 = 2131436838(0x7f0b2526, float:1.8495558E38)
            r11 = 2131436844(0x7f0b252c, float:1.849557E38)
            r8 = 6
            r0 = 7
            r15.A0D(r13, r8, r11, r0)
            r15.A0G(r14)
            int r11 = r12.getPaddingTop()
            int r8 = r12.getPaddingEnd()
            int r0 = r12.getPaddingBottom()
            r12.setPaddingRelative(r10, r11, r8, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x011a
            android.widget.TextView r8 = r6.A05
            r0 = 2131961000(0x7f1324a8, float:1.9558685E38)
            java.lang.String r0 = r3.getString(r0)
            r8.append(r0)
        L_0x011a:
            com.instagram.ui.recyclerpager.HorizontalRecyclerPager r8 = r6.A07
            r8.A0b()
            X.UAv r0 = new X.UAv
            r0.<init>(r4, r7)
            r8.A15(r0)
            X.HmT r0 = r6.A00
            if (r0 != 0) goto L_0x0134
            X.HmT r7 = new X.HmT
            r0 = r21
            r7.<init>(r0, r8)
            r6.A00 = r7
        L_0x0134:
            X.2Rw r7 = r8.A0A
            X.UAK r7 = (X.UAK) r7
            if (r7 != 0) goto L_0x016c
            X.Ifa r0 = new X.Ifa
            r0.<init>(r6)
            int r17 = r5.getPosition()
            X.UAK r7 = new X.UAK
            r13 = r16
            r14 = r18
            r15 = r0
            r16 = r19
            r9 = r7
            r10 = r3
            r11 = r20
            r12 = r21
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            r7.A02 = r1
            r7.A02(r4)
            r8.setAdapter(r7)
            r5.getPosition()
        L_0x0160:
            int r0 = r5.getPosition()
            r7.A00 = r0
            r0 = r22
            r1.EBq(r0, r4)
            goto L_0x01d6
        L_0x016c:
            boolean r0 = r5.A08
            if (r0 != 0) goto L_0x017a
            X.3UH r0 = r7.A01
            if (r0 != r4) goto L_0x017a
            r7.A02 = r1
            r7.notifyDataSetChanged()
            goto L_0x0160
        L_0x017a:
            r7.A02 = r1
            r7.A02(r4)
            r8.A0o(r10)
            r5.A08 = r10
            goto L_0x0160
        L_0x0185:
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r8 = r6.A06
            r8.setVisibility(r11)
            r0 = 0
            r8.setOnClickListener(r0)
            android.content.res.Resources r8 = r3.getResources()
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            int r11 = r8.getDimensionPixelSize(r0)
            int r9 = r12.getPaddingTop()
            int r8 = r12.getPaddingEnd()
            int r0 = r12.getPaddingBottom()
            r12.setPaddingRelative(r11, r9, r8, r0)
            X.4gb r11 = new X.4gb
            r11.<init>()
            android.view.View r9 = r6.A01
            androidx.constraintlayout.widget.ConstraintLayout r9 = (androidx.constraintlayout.widget.ConstraintLayout) r9
            r11.A0I(r9)
            r8 = 2131436838(0x7f0b2526, float:1.8495558E38)
            r0 = 7
            r11.A0D(r8, r0, r10, r0)
            r11.A0G(r9)
            goto L_0x011a
        L_0x01c0:
            r0 = 4
            r12.setVisibility(r0)
            goto L_0x00ba
        L_0x01c6:
            android.widget.TextView r0 = r6.A04
            r0.setVisibility(r11)
            goto L_0x0086
        L_0x01cd:
            X.33l r3 = r9.A00
            com.instagram.common.session.UserSession r1 = r9.A07
            r0 = r22
            r3.A01(r0, r1, r4, r5)
        L_0x01d6:
            r0 = 1308812146(0x4e02e372, float:5.4898598E8)
            X.AnonymousClass0fD.A0A(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C231742sF.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        AnonymousClass3UH r3 = (AnonymousClass3UH) obj;
        C266934aa r4 = (C266934aa) obj2;
        if (r4.CdP()) {
            r2.A7U(1);
            return;
        }
        r2.A7U(0);
        this.A04.A9R(r3, r4);
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        String str = ((AnonymousClass3UH) obj).A0F;
        if (str == null) {
            str = "";
        }
        return str.hashCode();
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        if (!this.A02) {
            return AnonymousClass972.MUTABLE_FLAG_MASK;
        }
        this.A02 = false;
        return Integer.MAX_VALUE;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        View view;
        int i2;
        int A032 = AnonymousClass0fD.A03(528317780);
        if (i != 0) {
            if (i == 1) {
                view = C2363733m.A00(this.A05, viewGroup, "v1", 2);
                i2 = -964161175;
                AnonymousClass0fD.A0A(i2, A032);
                return view;
            } else if (i != 2) {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException(002.A0O(AnonymousClass000.A00(1047), i));
                AnonymousClass0fD.A0A(-1483927780, A032);
                throw unsupportedOperationException;
            }
        }
        Context context = this.A05;
        LinearLayoutManager linearLayoutManager = this.A03;
        LinearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1 linearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1 = new LinearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1(context, (Boolean) null);
        if (linearLayoutManager != null) {
            linearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1.A1P(linearLayoutManager.A1M());
        }
        this.A03 = linearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1;
        linearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1.A0v(true);
        view = LayoutInflater.from(context).inflate(R.layout.netego_carousel, viewGroup, false);
        C55867Hoo hoo = new C55867Hoo(context, view);
        hoo.A07.setLayoutManager(linearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1);
        view.setTag(hoo);
        i2 = 1693350493;
        AnonymousClass0fD.A0A(i2, A032);
        return view;
    }
}
