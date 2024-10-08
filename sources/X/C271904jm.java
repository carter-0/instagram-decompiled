package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.4jm  reason: invalid class name and case insensitive filesystem */
public final class C271904jm extends C233422vh {
    public final long A00;
    public final JSx A01;
    public final UserSession A02;
    public final C233372vc A03;
    public final C228812mN A04;
    public final C54575HJk A05;
    public final C54575HJk A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final C249863kU A0E;

    public static final String A02(C271904jm r4, int i) {
        if (i < 0) {
            return null;
        }
        C54575HJk hJk = r4.A05;
        if (i >= hJk.A0A()) {
            return null;
        }
        C267324bN A0E2 = hJk.A0E(i);
        if (A0E2.A01 == C295365o2.MIDCARD) {
            return A0E2.getId();
        }
        1Xj r0 = A0E2.A02;
        if (r0 != null) {
            return r0.getId();
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ 1PW A0G(C251373n0 r20, Integer num, Object obj, int i, int i2, int i3) {
        int i4 = 0;
        Integer num2 = num;
        0qQ.A0B(num2, 2);
        C251373n0 r6 = r20;
        C376489Ie r4 = (C376489Ie) r6.BTb();
        Object obj2 = obj;
        int i5 = i;
        int i6 = i3;
        if (A03(r4, this)) {
            int A002 = A00(this);
            if (A002 == -1) {
                num2 = AnonymousClass05K.A00;
            } else {
                i4 = A002;
            }
            return super.A0G(r6, num2, obj2, i5, i4, i6);
        }
        Integer num3 = num2;
        1PW A0G = super.A0G(r6, num3, obj2, i5, i2, i6);
        if (!this.A0B) {
            return A0G;
        }
        0qQ.A0B(r4, 0);
        C233462vl r1 = (C233462vl) r4.A04;
        if (r1 == null) {
            return A0G;
        }
        int A062 = A06(r6, r1, num2, A05(r6, r1));
        if (r6.Bo5() || A03(r4, this) || A0G.A0C != AnonymousClass05K.A00 || A0G.A0B == AnonymousClass05K.A0N || A0G.A03 != A062) {
            return A0G;
        }
        1PW r3 = new 1PW(AnonymousClass05K.A0C);
        r3.A0B = AnonymousClass05K.A15;
        return r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (r1 == com.instagram.api.schemas.IntentAwareAdsFormatType.A0B) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0H(X.C376489Ie r4) {
        /*
            r3 = this;
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.Object r2 = r4.A03
            X.4bN r2 = (X.C267324bN) r2
            X.0qQ.A0B(r2, r0)
            X.1Xj r1 = r2.A02
            if (r1 == 0) goto L_0x0017
            com.instagram.common.session.UserSession r0 = r3.A02
            boolean r0 = X.C271854jh.A00(r0, r1)
            if (r0 != 0) goto L_0x0027
        L_0x0017:
            boolean r0 = r2.A0F()
            if (r0 == 0) goto L_0x0029
            X.ILx r0 = r2.A03()
            int r1 = r0.A00
            r0 = 9
            if (r1 != r0) goto L_0x0029
        L_0x0027:
            r1 = 1
        L_0x0028:
            return r1
        L_0x0029:
            X.5o2 r0 = r2.A01
            boolean r0 = X.GDZ.A01(r0)
            if (r0 == 0) goto L_0x004a
            X.3OA r0 = r2.A06()
            com.instagram.api.schemas.IntentAwareAdsInfoIntf r0 = r0.A0C
            if (r0 == 0) goto L_0x0048
            com.instagram.api.schemas.IntentAwareAdsFormatInfo r0 = r0.B7S()
            if (r0 == 0) goto L_0x0048
            com.instagram.api.schemas.IntentAwareAdsFormatType r1 = r0.B7R()
        L_0x0043:
            com.instagram.api.schemas.IntentAwareAdsFormatType r0 = com.instagram.api.schemas.IntentAwareAdsFormatType.SINGLE_AD
            if (r1 != r0) goto L_0x004a
            goto L_0x0027
        L_0x0048:
            r1 = 0
            goto L_0x0043
        L_0x004a:
            X.HJk r0 = r3.A06
            X.GAg r0 = (X.C51983GAg) r0
            com.instagram.clips.intf.ClipsViewerSource r0 = r0.A02
            boolean r0 = r0.A00()
            r1 = 0
            if (r0 == 0) goto L_0x0028
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C271904jm.A0H(X.9Ie):boolean");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C271904jm(X.JSx r17, com.instagram.common.session.UserSession r18, X.C233372vc r19, X.C228812mN r20, X.C249863kU r21, X.C54575HJk r22, X.C54575HJk r23, boolean r24, boolean r25) {
        /*
            r16 = this;
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318556988774648(0x810789001218f8, double:3.0313399105672385E-306)
            r3 = r18
            boolean r7 = X.182.A06(r2, r3, r0)
            r0 = 36318556990281997(0x8107890029190d, double:3.031339911520492E-306)
            boolean r8 = X.182.A06(r2, r3, r0)
            r0 = 36318556988184815(0x810789000918ef, double:3.031339910194226E-306)
            boolean r12 = X.182.A06(r2, r3, r0)
            r0 = 36318556988774648(0x810789001218f8, double:3.0313399105672385E-306)
            boolean r13 = X.182.A06(r2, r3, r0)
            r0 = 36318556990085386(0x8107890026190a, double:3.0313399113961545E-306)
            boolean r9 = X.182.A06(r2, r3, r0)
            r0 = 36318556990150923(0x8107890027190b, double:3.0313399114376004E-306)
            boolean r15 = X.182.A06(r2, r3, r0)
            r11 = 0
            r4 = r16
            r5 = r20
            r6 = r21
            r10 = r24
            r14 = r25
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r4.A02 = r3
            r4.A0E = r6
            r4.A04 = r5
            r0 = r22
            r4.A05 = r0
            r0 = r19
            r4.A03 = r0
            r0 = r23
            r4.A06 = r0
            r0 = r17
            r4.A01 = r0
            r4.A07 = r10
            r4.A0B = r14
            r0 = 36322894904568476(0x810b7b00002a9c, double:3.03408322598264E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r4.A08 = r0
            r0 = 36318556989757702(0x81078900211906, double:3.031339911188926E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r4.A0D = r0
            r0 = 36318556989823239(0x81078900221907, double:3.031339911230372E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r4.A0C = r0
            r0 = 36600031966662314(0x82078900240eaa, double:3.2093458199921605E-306)
            long r0 = X.182.A01(r2, r3, r0)
            r4.A00 = r0
            r0 = 36318556988774648(0x810789001218f8, double:3.0313399105672385E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r4.A0A = r0
            r0 = 36315614935256500(0x8104dc00040db4, double:3.029479344075663E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r4.A09 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C271904jm.<init>(X.JSx, com.instagram.common.session.UserSession, X.2vc, X.2mN, X.3kU, X.HJk, X.HJk, boolean, boolean):void");
    }

    public static final int A00(C271904jm r1) {
        List A0I = r1.A05.A0I();
        ListIterator listIterator = A0I.listIterator(A0I.size());
        while (listIterator.hasPrevious()) {
            if (((C267324bN) listIterator.previous()).A07() != null) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public static final Integer A01(C271904jm r2, int i) {
        if (i < 0) {
            return null;
        }
        C54575HJk hJk = r2.A05;
        if (i >= hJk.A0A()) {
            return null;
        }
        C267324bN A0E2 = hJk.A0E(i);
        if (A0E2.A01 == C295365o2.MIDCARD) {
            return A0E2.A01().A00;
        }
        1Xj r0 = A0E2.A02;
        if (r0 != null) {
            return r0.A2I();
        }
        return null;
    }

    public static final boolean A03(C376489Ie r2, C271904jm r3) {
        C267324bN r1 = (C267324bN) r2.A03;
        if (GDZ.A01(r1.A01) && r1.A06().A0x) {
            if (!182.A06(0Tu.A06, r3.A02, 36315133898656771L)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
