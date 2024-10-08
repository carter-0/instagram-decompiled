package X;

import android.content.Context;
import com.instagram.api.schemas.IntentAwareAdsInfo;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.IXo  reason: case insensitive filesystem */
public final class C57331IXo implements C233392ve {
    public int A00;
    public int A01 = -1;
    public int A02 = -1;
    public int A03 = -1;
    public final UserSession A04;
    public final C270414gh A05;
    public final LinkedList A06 = new LinkedList();
    public final Set A07 = AnonymousClass7TE.A1F();
    public final Set A08 = AnonymousClass7TE.A1F();
    public final boolean A09;
    public final Context A0A;
    public final ReelViewerFragment A0B;
    public final boolean A0C;

    /* JADX WARNING: Removed duplicated region for block: B:64:0x010e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer CNL(X.C251373n0 r11, X.1PW r12, int r13) {
        /*
            r10 = this;
            r8 = 0
            X.AnonymousClass7TF.A1B(r11, r8, r12)
            if (r13 >= 0) goto L_0x0009
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            return r0
        L_0x0009:
            X.4gh r7 = r10.A05
            int r0 = r7.getCount()
            if (r13 <= r0) goto L_0x0014
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            return r0
        L_0x0014:
            com.instagram.common.session.UserSession r6 = r10.A04
            java.lang.Object r5 = r11.BTb()
            X.3mM r5 = (X.C250973mM) r5
            boolean r0 = r5.A0N
            boolean r0 = X.C233832wY.A04(r6, r0)
            if (r0 == 0) goto L_0x0027
            java.lang.Integer r0 = X.AnonymousClass05K.A03
            return r0
        L_0x0027:
            com.instagram.model.reels.Reel r4 = r5.A0H
            boolean r0 = r4.A0m()
            r3 = 1
            if (r0 == 0) goto L_0x009b
            java.util.Set r1 = r10.A08
            java.lang.String r0 = r4.A0G()
            X.0qQ.A07(r0)
            r1.add(r0)
            int r0 = r10.A02
            int r0 = java.lang.Math.max(r0, r13)
            r10.A02 = r0
        L_0x0044:
            java.util.LinkedList r0 = r10.A06
            r0.addLast(r11)
            r0 = r7
            X.6bG r0 = (X.C310566bG) r0
            X.6bN r0 = r0.A0B
            r0.A01(r5, r13)
            int r0 = r10.A00
            int r0 = r0 + 1
            r10.A00 = r0
            X.0tS r1 = X.DbT.A0h()
            int r0 = r1.A04()
            if (r0 <= r3) goto L_0x0088
            int r0 = r1.A04()
            X.C309456Yi.A01(r6, r5, r0)
        L_0x0068:
            r7.Cs4()
            int r1 = r10.A03
            r0 = -1
            if (r1 == r0) goto L_0x0074
            r12.A08 = r1
            r10.A03 = r0
        L_0x0074:
            java.lang.Object[] r1 = X.AnonymousClass7TF.A1b(r13)
            java.lang.String r0 = "Inserted ad/netego at position %d"
            java.lang.String r2 = X.0mp.A06(r0, r1)
            com.instagram.debug.log.tags.DLogTag$REEL r1 = com.instagram.debug.log.tags.DLogTag$REEL.INSTANCE
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.instagram.debug.log.DLog.d(r1, r2, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            return r0
        L_0x0088:
            boolean r0 = r4.A17(r6)
            if (r0 == 0) goto L_0x0068
            int r0 = r1.A03()
            if (r0 < 0) goto L_0x0068
            int r0 = r1.A03()
            r4.A00 = r0
            goto L_0x0068
        L_0x009b:
            boolean r0 = r4.CcK()
            if (r0 == 0) goto L_0x0044
            int r1 = r10.A01
            com.instagram.api.schemas.IntentAwareAdsInfo r9 = r4.A0B
            if (r9 == 0) goto L_0x00e7
            java.lang.String r0 = r9.A04
            if (r0 == 0) goto L_0x00e7
            java.lang.Integer r2 = X.C55033Hb4.A00(r0)
        L_0x00af:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r2 != r0) goto L_0x00e9
            if (r9 == 0) goto L_0x00e9
            java.lang.Integer r0 = r9.A03
            if (r0 == 0) goto L_0x00e9
            java.lang.String r2 = r9.A07
            if (r2 == 0) goto L_0x00e9
            int r0 = r0.intValue()
            X.3mM r9 = r7.Bky(r0)
            if (r9 == 0) goto L_0x00e9
            boolean r0 = r9.A0N
            if (r0 != r3) goto L_0x00e9
            com.instagram.model.reels.Reel r0 = r9.A0H
            X.3uh r0 = r0.A0A(r6, r8)
            X.0qQ.A07(r0)
            java.lang.String r0 = r0.A0U(r6)
            if (r0 == 0) goto L_0x00e9
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00e9
            int r0 = r1 + 1
            if (r13 <= r0) goto L_0x00e9
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            return r0
        L_0x00e7:
            r2 = 0
            goto L_0x00af
        L_0x00e9:
            boolean r0 = r4.A13(r6)
            if (r0 == 0) goto L_0x0136
            X.3uh r2 = r4.A0A(r6, r8)
            X.3mL r1 = r2.A0e
            X.3mL r0 = X.C250963mL.BRAND_SURVEY
            if (r1 != r0) goto L_0x0102
            java.lang.String r1 = r2.A0k
        L_0x00fb:
            if (r1 == 0) goto L_0x0102
            java.util.Set r0 = r10.A07
            r0.add(r1)
        L_0x0102:
            int r0 = r10.A01
            int r0 = java.lang.Math.max(r0, r13)
            r10.A01 = r0
            boolean r0 = r10.A0C
            if (r0 == 0) goto L_0x0044
            java.util.List r1 = r4.A0O(r6)
            X.0qQ.A07(r1)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0044
            java.lang.Object r1 = r1.get(r8)
            X.3uh r1 = (X.C255773uh) r1
            boolean r0 = r1.A1m()
            if (r0 == 0) goto L_0x0044
            X.3WR r2 = r1.A0M(r6)
            if (r2 == 0) goto L_0x0044
            android.content.Context r1 = r10.A0A
            java.lang.String r0 = "reel_feed_timeline"
            X.C51973G9u.A0w(r1, r6, r2, r0, r3)
            goto L_0x0044
        L_0x0136:
            X.3IB r0 = r4.A0I
            if (r0 != 0) goto L_0x0102
            X.3uh r0 = r4.A0A(r6, r8)
            java.lang.String r1 = r0.A0U(r6)
            goto L_0x00fb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57331IXo.CNL(X.3n0, X.1PW, int):java.lang.Integer");
    }

    public final void Dpi() {
    }

    public final void E5G(String str, List list, int i, int i2, int i3, int i4) {
    }

    public final /* bridge */ /* synthetic */ void AHP(Object obj) {
        C250973mM r5 = (C250973mM) obj;
        0qQ.A0B(r5, 0);
        if (182.A06(0Tu.A05, this.A04, 36310542583333038L)) {
            r5.A0H.A0X = null;
        }
    }

    public final List ANR() {
        return 0sn.A00;
    }

    public final boolean ARN() {
        return 182.A06(0Tu.A05, this.A04, 36330879248778047L);
    }

    public final float AuH() {
        C313056fm r0 = this.A0B.mViewPager;
        if (r0 == null) {
            return 0.0f;
        }
        return (float) ((C313046fl) r0).A04.A08;
    }

    public final List BYj() {
        return 00k.A0X(C51966G9m.A1J(((C310566bG) this.A05).A0B.A01));
    }

    public final int Bdq() {
        return this.A01;
    }

    public final int Bdr() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ boolean CVS(Object obj) {
        C250973mM r6 = (C250973mM) obj;
        0qQ.A0B(r6, 0);
        Reel reel = r6.A0H;
        if (reel.A0m()) {
            return this.A08.contains(reel.A0G());
        }
        if (!reel.CcK()) {
            return false;
        }
        if (reel.A0I != null) {
            return reel.A13(this.A04);
        }
        Set set = this.A07;
        UserSession userSession = this.A04;
        return 00k.A0u(set, reel.A0A(userSession, 0).A0U(userSession));
    }

    public final C251373n0 Coa() {
        return (C251373n0) this.A06.peekLast();
    }

    public final /* bridge */ /* synthetic */ void E5F(Object obj) {
        C250973mM r3 = (C250973mM) obj;
        0qQ.A0B(r3, 0);
        C233472vm r1 = r3.A0H.A0b;
        if (r1 != null) {
            r1.A0C(this.A09);
        }
    }

    public final /* bridge */ /* synthetic */ boolean FIZ(Object obj, String str, Map map) {
        Reel reel;
        1Xj r0;
        C250973mM r8 = (C250973mM) obj;
        0qQ.A0B(r8, 0);
        C270414gh r2 = this.A05;
        C250973mM Bky = r2.Bky(r2.CMI(r8) + 1);
        if (Bky == null || (r0 = reel.A0F) == null) {
            return false;
        }
        if (str != null && !str.equals(r0.getId())) {
            return false;
        }
        if (((C310566bG) r2).A0B.A02(Bky)) {
            this.A00--;
        }
        Iterator A1G = AnonymousClass7TE.A1G(this.A06);
        if ((reel = Bky.A0H).CcK()) {
            Set set = this.A07;
            UserSession userSession = this.A04;
            0u4.A00(set).remove(reel.A0A(userSession, 0).A0U(userSession));
        } else if (reel.A0m()) {
            this.A08.remove(reel.A0G());
        }
        while (A1G.hasNext()) {
            if (0qQ.A0K(((C251373n0) AnonymousClass7TF.A0a(A1G)).BTb(), Bky)) {
                A1G.remove();
                return true;
            }
        }
        return true;
    }

    public final C251373n0 FIa() {
        C251373n0 r4;
        int i;
        Set set;
        String A0U;
        LinkedList linkedList = this.A06;
        if (linkedList.isEmpty() || (r4 = (C251373n0) linkedList.pollLast()) == null) {
            return null;
        }
        C250973mM r2 = (C250973mM) r4.BTb();
        C270414gh r1 = this.A05;
        if (r1.CMI(r2) < 0) {
            return null;
        }
        0qQ.A0B(r2, 0);
        if (((C310566bG) r1).A0B.A02(r2)) {
            this.A00--;
        }
        r1.Cs4();
        Reel reel = r2.A0H;
        if (reel.CcK()) {
            UserSession userSession = this.A04;
            if (reel.A13(userSession)) {
                set = this.A07;
                C255773uh A0A2 = reel.A0A(userSession, 0);
                if (A0A2.A0e == C250963mL.BRAND_SURVEY) {
                    A0U = A0A2.A0k;
                } else {
                    A0U = null;
                }
            } else {
                if (reel.A0I == null) {
                    set = this.A07;
                    A0U = reel.A0A(userSession, 0).A0U(userSession);
                }
                i = this.A01;
            }
            0u4.A00(set).remove(A0U);
            i = this.A01;
        } else {
            if (reel.A0m()) {
                this.A08.remove(reel.A0G());
                i = this.A02;
            }
            return r4;
        }
        this.A03 = i;
        return r4;
    }

    public C57331IXo(Context context, UserSession userSession, C270414gh r5, ReelViewerFragment reelViewerFragment, boolean z, boolean z2) {
        this.A0A = context;
        this.A04 = userSession;
        this.A05 = r5;
        this.A0B = reelViewerFragment;
        this.A09 = z;
        this.A0C = z2;
    }

    public final List AGf() {
        1Pi r0;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (C250973mM r02 : ((C310566bG) this.A05).A0B.A02) {
            Reel reel = r02.A0H;
            IntentAwareAdsInfo intentAwareAdsInfo = reel.A0B;
            if (intentAwareAdsInfo != null && intentAwareAdsInfo.A04 != null) {
                r0 = 1Pi.A02;
            } else if (reel.CcK() || reel.A0m()) {
                r0 = 1Pi.A04;
            } else {
                r0 = 1Pi.A03;
            }
            A1C.add(r0);
        }
        return A1C;
    }

    public final List BYp() {
        List emptyList = Collections.emptyList();
        0qQ.A07(emptyList);
        return emptyList;
    }

    public final /* bridge */ /* synthetic */ Object BTe(int i) {
        return null;
    }
}
