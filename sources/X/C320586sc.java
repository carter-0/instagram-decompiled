package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.6sc  reason: invalid class name and case insensitive filesystem */
public final class C320586sc extends C232222tE {
    public int A00;
    public int A01;
    public final C320606se A02;
    public final C320486sS A03;
    public final C320326sC A04;
    public final C320556sZ A05;
    public final C320496sT A06;
    public final AnonymousClass0iw A07;
    public final UserSession A08;
    public final C294875nB A09;
    public final String A0A;
    public final String A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final C320596sd A0E;

    public C320586sc(C321686ua r8, C320486sS r9, C320326sC r10, C320556sZ r11, C320496sT r12, AnonymousClass0iw r13, UserSession userSession, C294875nB r15, String str, String str2, int i, int i2, boolean z, boolean z2) {
        0qQ.A0B(r11, 5);
        0qQ.A0B(r9, 6);
        this.A08 = userSession;
        this.A07 = r13;
        C320326sC r4 = r10;
        this.A04 = r10;
        this.A05 = r11;
        this.A03 = r9;
        this.A00 = i;
        this.A01 = i2;
        this.A06 = r12;
        this.A0D = z;
        this.A09 = r15;
        this.A0C = z2;
        this.A0B = str;
        this.A0A = str2;
        C320596sd r2 = new C320596sd(userSession);
        this.A0E = r2;
        C321686ua r1 = r8;
        this.A02 = new C320606se(r1, r2, r9, r4, r13, userSession);
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        AnonymousClass0YZ[] r0 = C66970Mg3.A0E;
        View inflate = layoutInflater.inflate(R.layout.layout_clips_grid_item, viewGroup, false);
        0qQ.A07(inflate);
        return new C66970Mg3(inflate);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0106, code lost:
        if (r14 == false) goto L_0x00e9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0150  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r23, X.C249703kE r24) {
        /*
            r22 = this;
            r0 = r24
            r4 = r23
            X.6sp r4 = (X.C320716sp) r4
            X.Mg3 r0 = (X.C66970Mg3) r0
            r1 = 0
            X.0qQ.A0B(r4, r1)
            r11 = 1
            X.0qQ.A0B(r0, r11)
            android.view.View r3 = r0.itemView
            X.0qQ.A06(r3)
            r10 = r22
            int r2 = r10.A01
            X.0nA.A0f(r3, r2)
            android.view.View r3 = r0.itemView
            X.0qQ.A06(r3)
            int r2 = r10.A00
            X.0nA.A0V(r3, r2)
            X.6sC r3 = r10.A04
            X.4bN r9 = r4.A03
            X.0iw r2 = r10.A07
            com.instagram.common.session.UserSession r8 = r10.A08
            X.0qQ.A0B(r3, r1)
            r7 = 2
            X.0qQ.A0B(r2, r7)
            r6 = 3
            X.0qQ.A0B(r8, r6)
            X.Ts8 r5 = new X.Ts8
            r5.<init>(r3, r9, r2, r8)
            X.6sS r14 = r10.A03
            boolean r13 = r4.A01
            X.HsR r12 = r4.A04
            boolean r4 = r10.A0C
            java.lang.String r3 = r10.A0B
            java.lang.String r2 = r10.A0A
            r16 = r12
            r17 = r8
            r18 = r3
            r19 = r2
            r20 = r13
            r21 = r4
            r15 = r9
            X.GNm r12 = X.GPO.A00(r14, r15, r16, r17, r18, r19, r20, r21)
            if (r12 == 0) goto L_0x0097
            X.6sZ r2 = r10.A05
            boolean r2 = r2.A01
            X.6se r4 = r10.A02
            if (r2 == 0) goto L_0x009a
            r11 = r4
            r13 = r0
            r14 = r9
            r15 = r5
            r16 = r1
            X.C320606se.A00(r11, r12, r13, r14, r15, r16)
            boolean r4 = r12.A0D
            X.2eb r3 = r0.A06
            if (r4 == 0) goto L_0x0098
            android.view.View r1 = r0.itemView
            android.content.Context r2 = r1.getContext()
            r1 = 2131099669(0x7f060015, float:1.7811698E38)
            int r2 = r2.getColor(r1)
        L_0x0081:
            android.view.View r1 = r3.A01()
            r1.setBackgroundColor(r2)
            X.0w6 r2 = r0.A0C
            X.0YZ[] r1 = X.C66970Mg3.A0E
            r1 = r1[r7]
            java.lang.Object r0 = r2.CDM(r0, r1)
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            r0.setChecked(r4)
        L_0x0097:
            return
        L_0x0098:
            r2 = 0
            goto L_0x0081
        L_0x009a:
            boolean r2 = r10.A0D
            r16 = 1
            if (r2 == 0) goto L_0x00e9
            int r15 = r0.getAbsoluteAdapterPosition()
            X.0Tu r13 = X.0Tu.A05
            r2 = 36595745587661046(0x8203a3000b08f6, double:3.206635096651896E-306)
            long r2 = X.182.A01(r13, r8, r2)
            int r13 = (int) r2
            java.util.Map r3 = X.C62553Khj.A01
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            java.lang.Object r3 = r3.get(r2)
            X.Khj r3 = (X.C62553Khj) r3
            if (r3 != 0) goto L_0x00c0
            X.Khj r3 = X.C62553Khj.ALL
        L_0x00c0:
            int r2 = r0.getAbsoluteAdapterPosition()
            r14 = 0
            if (r2 != 0) goto L_0x00c8
            r14 = 1
        L_0x00c8:
            int r3 = r3.ordinal()
            if (r3 == r1) goto L_0x0108
            r13 = 2
            if (r3 == r11) goto L_0x00ec
            r2 = 4
            if (r3 == r7) goto L_0x00dc
            if (r3 == r6) goto L_0x0106
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00dc:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer[] r3 = new java.lang.Integer[]{r3, r2}
            goto L_0x00fb
        L_0x00e9:
            r16 = 0
            goto L_0x0108
        L_0x00ec:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r2 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer[] r3 = new java.lang.Integer[]{r3, r2}
            r13 = 0
        L_0x00fb:
            int r15 = r15 - r13
            int r2 = r15 % 12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r14 = X.03t.A0O(r2, r3)
        L_0x0106:
            if (r14 == 0) goto L_0x00e9
        L_0x0108:
            r11 = r4
            r13 = r0
            r14 = r9
            r15 = r5
            X.C320606se.A00(r11, r12, r13, r14, r15, r16)
            X.2eb r3 = r0.A06
            r2 = 8
            r3.A03(r2)
            X.5nB r6 = r10.A09
            if (r6 == 0) goto L_0x0150
            X.1Xj r5 = r9.A02
            java.util.List r2 = r9.A08
            java.lang.Integer r4 = r9.A04
            java.lang.Integer r3 = r9.A05
            if (r5 == 0) goto L_0x0097
            if (r2 == 0) goto L_0x0097
            if (r4 == 0) goto L_0x0097
            if (r3 == 0) goto L_0x0097
            java.util.Set r2 = X.00k.A0k(r2)
            com.instagram.model.direct.DirectSearchResharedContent r9 = new com.instagram.model.direct.DirectSearchResharedContent
            r9.<init>(r8, r5, r2)
            int r11 = r4.intValue()
            int r12 = r0.getAbsoluteAdapterPosition()
            int r13 = r0.getAbsoluteAdapterPosition()
            int r14 = r3.intValue()
            android.view.View r7 = r0.itemView
            X.0qQ.A06(r7)
            r8 = 0
            java.lang.String r10 = "inbox_search"
            r15 = r1
            r6.DpB(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        L_0x0150:
            X.6sT r6 = r10.A06
            android.view.View r5 = r0.itemView
            int r8 = r0.getAbsoluteAdapterPosition()
            X.1Xj r7 = r9.A02
            if (r7 == 0) goto L_0x0097
            java.lang.String r2 = "thumb_"
            java.lang.String r0 = r7.getId()
            java.lang.String r4 = X.002.A0R(r2, r0)
            java.lang.String r2 = r6.A03
            X.1Xj r0 = r9.A02
            r13 = 0
            if (r0 == 0) goto L_0x019e
            X.1Xy r0 = r0.A0C
            java.lang.Integer r11 = r0.Bd0()
        L_0x0173:
            X.6sU r0 = r6.A00
            if (r0 == 0) goto L_0x017b
            java.lang.String r13 = r0.getSessionId()
        L_0x017b:
            X.Trb r3 = new X.Trb
            r9 = r3
            r10 = r7
            r12 = r2
            r14 = r1
            r9.<init>(r10, r11, r12, r13, r14)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            X.30Y r0 = X.AnonymousClass30Y.A07
            X.30a r2 = new X.30a
            r2.<init>(r3, r1, r4)
            X.32R r0 = r6.A02
            r2.A00(r0)
            X.2el r1 = r6.A01
            X.30Y r0 = r2.A01()
            r1.A05(r5, r0)
            return
        L_0x019e:
            r11 = r13
            goto L_0x0173
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C320586sc.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return C320716sp.class;
    }
}
