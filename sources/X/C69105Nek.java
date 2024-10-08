package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Nek  reason: case insensitive filesystem */
public final class C69105Nek extends C71135OdY {
    public int A00;
    public C72836PLy A01 = new C72836PLy((ImageUrl) null, 0, 50, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
    public boolean A02;
    public boolean A03;
    public boolean A04 = true;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final View A09;
    public final ONT A0A;
    public final UserSession A0B;
    public final OKY A0C;
    public final C71111Ocu A0D;
    public final C70753OJz A0E;
    public final C70510O9j A0F;
    public final PMT A0G;
    public final Runnable A0H = new PX2(this);
    public final AnonymousClass0eM A0I = C73895PlW.A00(this, 38);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C69105Nek(View view, UserSession userSession, OKY oky, C71111Ocu ocu, PMT pmt) {
        super(DbS.A0z(C72836PLy.class));
        UserSession userSession2 = userSession;
        C70753OJz oJz = new C70753OJz(userSession2);
        ONT ont = new ONT(userSession2);
        View view2 = view;
        C70510O9j o9j = new C70510O9j(AnonymousClass7TE.A0S(view2));
        OKY oky2 = oky;
        C71111Ocu ocu2 = ocu;
        AnonymousClass7TG.A1R(ocu2, oky2);
        this.A09 = view2;
        this.A0B = userSession2;
        PMT pmt2 = pmt;
        this.A0G = pmt2;
        this.A0D = ocu2;
        this.A0C = oky2;
        this.A0E = oJz;
        this.A0A = ont;
        this.A0F = o9j;
        pmt2.A00 = new C70511O9k(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0055, code lost:
        if (r8 != false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0061, code lost:
        if (r8 == false) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0071, code lost:
        if (A02(r7) != false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0082, code lost:
        if (A02(r7) == false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0093, code lost:
        if (A02(r7) == false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a1, code lost:
        if (A02(r7) == false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0043, code lost:
        if (r0 == false) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Map A00(X.C69105Nek r22, X.C72836PLy r23, boolean r24) {
        /*
            r7 = r22
            X.OJz r0 = r7.A0E
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317659339560366(0x8106b8000215ae, double:3.0307722335895833E-306)
            boolean r11 = X.182.A06(r2, r3, r0)
            r0 = 36317113878647588(0x81063900011324, double:3.030427281911948E-306)
            boolean r10 = X.182.A06(r2, r3, r0)
            r0 = 36317659339494829(0x8106b8000115ad, double:3.0307722335481375E-306)
            boolean r8 = X.182.A06(r2, r3, r0)
            r0 = r23
            boolean r5 = r0.A06
            r6 = r5 ^ 1
            boolean r0 = r0.A0B
            r4 = 0
            if (r0 == 0) goto L_0x0045
            r0 = 36316985029563109(0x81061b000012e5, double:3.0303457972320896E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0045
            r0 = 36316985029890793(0x81061b000512e9, double:3.030345797439318E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r3 = 1
            if (r0 != 0) goto L_0x0046
        L_0x0045:
            r3 = 0
        L_0x0046:
            X.NjI r0 = X.C69317NjI.EFFECTS
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            X.0eP r12 = X.AnonymousClass7TE.A1L(r0, r1)
            X.NjI r2 = X.C69317NjI.FILTERS
            if (r6 == 0) goto L_0x0057
            r0 = 1
            if (r8 == 0) goto L_0x0058
        L_0x0057:
            r0 = 0
        L_0x0058:
            X.0eP r13 = X.C66581MXm.A14(r2, r0)
            X.NjI r2 = X.C69317NjI.FILTERS_NEW
            if (r6 == 0) goto L_0x0063
            r0 = 1
            if (r8 != 0) goto L_0x0064
        L_0x0063:
            r0 = 0
        L_0x0064:
            X.0eP r14 = X.C66581MXm.A14(r2, r0)
            X.NjI r6 = X.C69317NjI.AVATARS
            if (r5 != 0) goto L_0x0073
            boolean r2 = A02(r7)
            r0 = 0
            if (r2 == 0) goto L_0x0074
        L_0x0073:
            r0 = 1
        L_0x0074:
            X.0eP r15 = X.C66581MXm.A14(r6, r0)
            r6 = 3
            X.NjI r8 = X.C69317NjI.AVATAR_THUMBNAIL
            if (r5 == 0) goto L_0x0084
            boolean r2 = A02(r7)
            r0 = 1
            if (r2 != 0) goto L_0x0085
        L_0x0084:
            r0 = 0
        L_0x0085:
            X.0eP r16 = X.C66581MXm.A14(r8, r0)
            r2 = 4
            X.NjI r8 = X.C69317NjI.AVATAR_BACKGROUNDS
            if (r5 == 0) goto L_0x0095
            boolean r9 = A02(r7)
            r0 = 1
            if (r9 != 0) goto L_0x0096
        L_0x0095:
            r0 = 0
        L_0x0096:
            X.0eP r17 = X.C66581MXm.A14(r8, r0)
            if (r5 == 0) goto L_0x00a3
            boolean r9 = A02(r7)
            r0 = 1
            if (r9 != 0) goto L_0x00a4
        L_0x00a3:
            r0 = 0
        L_0x00a4:
            X.0eP r18 = X.C66581MXm.A14(r8, r0)
            X.NjI r0 = X.C69317NjI.TOUCH_UP
            X.0eP r19 = X.AnonymousClass7TE.A1L(r0, r1)
            X.NjI r0 = X.C69317NjI.PHOTOBOOTH
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            X.0eP r20 = X.AnonymousClass7TE.A1L(r0, r1)
            X.NjI r0 = X.C69317NjI.SOLO_BACKGROUNDS
            if (r10 == 0) goto L_0x00bf
            if (r5 != 0) goto L_0x00bf
            r4 = 1
        L_0x00bf:
            X.0eP r21 = X.C66581MXm.A14(r0, r4)
            X.NjI r0 = X.C69317NjI.DUAL_CAMERA
            X.0eP r22 = X.C66581MXm.A14(r0, r3)
            X.NjI r0 = X.C69317NjI.WEARABLE_CAMERA
            X.0eP r23 = X.AnonymousClass7TE.A1L(r0, r1)
            X.0eP[] r0 = new X.0eP[]{r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23}
            java.util.LinkedHashMap r5 = X.0Yt.A06(r0)
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0112
            r3 = 0
        L_0x00de:
            r7.A00 = r3
            if (r11 == 0) goto L_0x012b
            if (r3 <= r2) goto L_0x012b
            java.util.LinkedHashMap r4 = X.C51975G9x.A0o(r5)
            java.util.Iterator r3 = X.AnonymousClass7TF.A0s(r5)
            r2 = 0
        L_0x00ed:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x012a
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r3)
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r2 < r6) goto L_0x0107
            if (r24 == 0) goto L_0x0110
        L_0x0107:
            if (r0 == 0) goto L_0x0110
            r0 = 1
            int r2 = r2 + 1
        L_0x010c:
            X.JTP.A1R(r1, r4, r0)
            goto L_0x00ed
        L_0x0110:
            r0 = 0
            goto L_0x010c
        L_0x0112:
            java.util.Iterator r1 = X.AnonymousClass7TF.A0s(r5)
            r3 = 0
        L_0x0117:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00de
            java.lang.Object r0 = X.C51971G9r.A0p(r1)
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x0117
            int r3 = r3 + 1
            goto L_0x0117
        L_0x012a:
            return r4
        L_0x012b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69105Nek.A00(X.Nek, X.PLy, boolean):java.util.Map");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        if (r1 != true) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0083, code lost:
        if (r2.A0A.A02() == false) goto L_0x0085;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0163  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C69105Nek r45, boolean r46, boolean r47) {
        /*
            r2 = r45
            if (r46 == 0) goto L_0x001e
            boolean r0 = A03(r2)
            if (r0 == 0) goto L_0x001e
            X.PLy r1 = r2.A01
            boolean r0 = r1.A0G
            if (r0 == 0) goto L_0x001e
            X.Pry r0 = r2.A01
            X.N9d r0 = (X.C68290N9d) r0
            if (r0 == 0) goto L_0x0166
            boolean r0 = r0.A0V
            if (r0 == 0) goto L_0x0166
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x0166
        L_0x001e:
            r17 = 0
        L_0x0020:
            X.Pry r0 = r2.A01
            X.N9d r0 = (X.C68290N9d) r0
            r3 = 1
            if (r0 == 0) goto L_0x002c
            boolean r1 = r0.A09
            r0 = 1
            if (r1 == r3) goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            if (r47 == 0) goto L_0x0163
            r3 = 0
            if (r0 != 0) goto L_0x0033
            r3 = 1
        L_0x0033:
            X.PLy r0 = r2.A01
            java.util.Map r1 = A00(r2, r0, r3)
            X.Pry r0 = r2.A01
            X.N9d r0 = (X.C68290N9d) r0
            if (r0 == 0) goto L_0x0161
            boolean r16 = A03(r2)
            boolean r4 = r2.A06
            r44 = r4 ^ 1
            if (r17 == 0) goto L_0x015d
            X.PLy r4 = r2.A01
            boolean r4 = r4.A06
            if (r4 == 0) goto L_0x0055
            boolean r4 = A02(r2)
            if (r4 != 0) goto L_0x015d
        L_0x0055:
            r18 = 1
        L_0x0057:
            X.NjI r4 = X.C69317NjI.EFFECTS
            boolean r25 = X.C71135OdY.A0H(r4, r1)
            X.NjI r4 = X.C69317NjI.FILTERS
            boolean r28 = X.C71135OdY.A0H(r4, r1)
            X.NjI r4 = X.C69317NjI.AVATARS
            boolean r30 = X.C71135OdY.A0H(r4, r1)
            X.NjI r4 = X.C69317NjI.AVATAR_THUMBNAIL
            boolean r31 = X.C71135OdY.A0H(r4, r1)
            X.PLy r4 = r2.A01
            boolean r4 = r4.A06
            if (r4 == 0) goto L_0x0085
            boolean r4 = A02(r2)
            if (r4 == 0) goto L_0x0085
            X.ONT r4 = r2.A0A
            boolean r4 = r4.A02()
            r43 = 1
            if (r4 != 0) goto L_0x0087
        L_0x0085:
            r43 = 0
        L_0x0087:
            X.NjI r4 = X.C69317NjI.AVATAR_BACKGROUNDS
            boolean r32 = X.C71135OdY.A0H(r4, r1)
            X.NjI r4 = X.C69317NjI.TOUCH_UP
            boolean r33 = X.C71135OdY.A0H(r4, r1)
            X.NjI r4 = X.C69317NjI.SOLO_BACKGROUNDS
            boolean r27 = X.C71135OdY.A0H(r4, r1)
            X.NjI r4 = X.C69317NjI.DUAL_CAMERA
            boolean r37 = X.C71135OdY.A0H(r4, r1)
            X.NjI r4 = X.C69317NjI.WEARABLE_CAMERA
            boolean r38 = X.C71135OdY.A0H(r4, r1)
            X.PLy r1 = r2.A01
            java.lang.Integer r1 = r1.A02
            r47 = r1
            boolean r1 = r0.A0X
            r46 = r1
            int r1 = r0.A00
            r45 = r1
            boolean r1 = r0.A07
            r19 = r1
            boolean r15 = r0.A0A
            boolean r14 = r0.A08
            boolean r13 = r0.A0B
            boolean r12 = r0.A05
            boolean r11 = r0.A04
            boolean r10 = r0.A0S
            boolean r9 = r0.A0Q
            r34 = 0
            boolean r8 = r0.A0L
            boolean r7 = r0.A0C
            int r6 = r0.A01
            boolean r5 = r0.A0J
            com.instagram.common.typedurl.ImageUrl r4 = r0.A02
            boolean r1 = r0.A06
            X.N9d r0 = new X.N9d
            r26 = r10
            r29 = r9
            r35 = r34
            r36 = r8
            r39 = r7
            r40 = r3
            r41 = r5
            r42 = r1
            r20 = r15
            r21 = r14
            r22 = r13
            r23 = r12
            r24 = r11
            r12 = r47
            r13 = r45
            r14 = r6
            r15 = r46
            r10 = r0
            r11 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
        L_0x00fb:
            r2.A0J(r0)
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x0108
            boolean r0 = A03(r2)
            r2.A07 = r0
        L_0x0108:
            android.view.View r5 = r2.A09
            java.lang.Runnable r4 = r2.A0H
            r5.removeCallbacks(r4)
            if (r17 == 0) goto L_0x0116
            r0 = 3000(0xbb8, double:1.482E-320)
            r5.postDelayed(r4, r0)
        L_0x0116:
            X.PMT r0 = r2.A0G
            X.0eM r6 = r0.A0D
            com.instagram.rtc.presentation.arsidebar.ArSidebarButton r0 = X.C66580MXl.A0m(r6)
            r4 = 0
            if (r3 == 0) goto L_0x0123
            r4 = 1127481344(0x43340000, float:180.0)
        L_0x0123:
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r0.A03
            java.lang.String r0 = "iconView"
            if (r1 == 0) goto L_0x0155
            X.5nL r2 = X.JTP.A0b(r1)
            float r0 = r1.getRotation()
            r2.A0O(r0, r4)
            r4 = 4617315517961601024(0x4014000000000000, double:5.0)
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            X.2co r0 = X.C71392co.A03(r4, r0)
            X.5nL r0 = r2.A0E(r0)
            r0.A0H()
            r2 = 2131976420(0x7f1360e4, float:1.958996E38)
            if (r3 == 0) goto L_0x014b
            r2 = 2131976419(0x7f1360e3, float:1.9589958E38)
        L_0x014b:
            com.instagram.rtc.presentation.arsidebar.ArSidebarButton r1 = X.C66580MXl.A0m(r6)
            com.instagram.common.ui.base.IgTextView r0 = r1.A02
            if (r0 != 0) goto L_0x016a
            java.lang.String r0 = "labelView"
        L_0x0155:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x015d:
            r18 = 0
            goto L_0x0057
        L_0x0161:
            r0 = 0
            goto L_0x00fb
        L_0x0163:
            r3 = r0
            goto L_0x0033
        L_0x0166:
            r17 = 1
            goto L_0x0020
        L_0x016a:
            r0.setText(r2)
            android.content.Context r0 = r1.getContext()
            X.DbU.A12(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69105Nek.A01(X.Nek, boolean, boolean):void");
    }

    public static final boolean A02(C69105Nek nek) {
        if (!nek.A01.A07) {
            return false;
        }
        ONT ont = nek.A0A;
        if ((!(ont.A00() instanceof C69146NfV) || !nek.A01.A03) && !(ont.A00() instanceof C69147NfW)) {
            return false;
        }
        return true;
    }

    public static final boolean A03(C69105Nek nek) {
        if (!nek.A01.A0I || nek.A06 || nek.A05) {
            return false;
        }
        if (nek.A02) {
            if (!nek.A07 || nek.A04) {
                return false;
            }
        } else if (!nek.A04) {
            return false;
        }
        if (!nek.A03) {
            return true;
        }
        return false;
    }
}
