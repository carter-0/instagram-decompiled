package X;

import android.content.Context;
import com.instagram.api.schemas.IntentAwareAdsInfo;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;

@Deprecated(message = "Sync all changes with the Kotlin implementation of @ReelSponsoredContentInjectorKt")
/* renamed from: X.6VO  reason: invalid class name */
public final class AnonymousClass6VO implements C233392ve {
    public int A00 = 0;
    public int A01 = -1;
    public int A02 = -1;
    public int A03 = -1;
    public final UserSession A04;
    public final C270414gh A05;
    public final LinkedList A06 = new LinkedList();
    public final Set A07 = new HashSet();
    public final Set A08 = new HashSet();
    public final boolean A09;
    public final Context A0A;
    public final ReelViewerFragment A0B;
    public final boolean A0C;

    public final void Dpi() {
    }

    public final void E5G(String str, List list, int i, int i2, int i3, int i4) {
    }

    public final List AGf() {
        1Pi r0;
        ArrayList arrayList = new ArrayList();
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
            arrayList.add(r0);
        }
        return arrayList;
    }

    public final /* bridge */ /* synthetic */ void AHP(Object obj) {
        C250973mM r5 = (C250973mM) obj;
        if (182.A06(0Tu.A05, this.A04, 36310542583333038L)) {
            r5.A0H.A0X = null;
        }
    }

    public final List ANR() {
        return new ArrayList();
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
        List unmodifiableList = Collections.unmodifiableList(((C310566bG) this.A05).A0B.A01);
        0qQ.A07(unmodifiableList);
        return unmodifiableList;
    }

    public final int Bdq() {
        return this.A01;
    }

    public final int Bdr() {
        return this.A02;
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer CNL(X.C251373n0 r12, X.1PW r13, int r14) {
        /*
            r11 = this;
            if (r14 >= 0) goto L_0x0005
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            return r0
        L_0x0005:
            X.4gh r8 = r11.A05
            r0 = r8
            X.6bG r0 = (X.C310566bG) r0
            X.6bN r7 = r0.A0B
            int r0 = r7.A00()
            if (r14 <= r0) goto L_0x0015
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            return r0
        L_0x0015:
            com.instagram.common.session.UserSession r6 = r11.A04
            java.lang.Object r5 = r12.BTb()
            X.3mM r5 = (X.C250973mM) r5
            boolean r0 = r5.A0N
            boolean r0 = X.C233832wY.A04(r6, r0)
            if (r0 == 0) goto L_0x0028
            java.lang.Integer r0 = X.AnonymousClass05K.A03
            return r0
        L_0x0028:
            com.instagram.model.reels.Reel r4 = r5.A0H
            boolean r0 = r4.A0m()
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0099
            java.util.Set r1 = r11.A08
            java.lang.String r0 = r4.A0G()
            r1.add(r0)
            int r0 = r11.A02
            int r0 = java.lang.Math.max(r0, r14)
            r11.A02 = r0
        L_0x0043:
            java.util.LinkedList r0 = r11.A06
            r0.addLast(r12)
            r7.A01(r5, r14)
            int r0 = r11.A00
            int r0 = r0 + 1
            r11.A00 = r0
            X.0tS r1 = X.0tS.A00()
            int r0 = r1.A04()
            if (r0 <= r3) goto L_0x0086
            int r0 = r1.A04()
            X.C309456Yi.A01(r6, r5, r0)
        L_0x0062:
            r8.Cs4()
            int r1 = r11.A03
            r0 = -1
            if (r1 == r0) goto L_0x006e
            r13.A08 = r1
            r11.A03 = r0
        L_0x006e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Inserted ad/netego at position %d"
            java.lang.String r3 = X.0mp.A06(r0, r1)
            com.instagram.debug.log.tags.DLogTag$REEL r1 = com.instagram.debug.log.tags.DLogTag$REEL.INSTANCE
            java.lang.Object[] r0 = new java.lang.Object[r2]
            com.instagram.debug.log.DLog.d(r1, r3, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            return r0
        L_0x0086:
            boolean r0 = r4.A17(r6)
            if (r0 == 0) goto L_0x0062
            int r0 = r1.A03()
            if (r0 < 0) goto L_0x0062
            int r0 = r1.A03()
            r4.A00 = r0
            goto L_0x0062
        L_0x0099:
            boolean r0 = r4.CcK()
            if (r0 == 0) goto L_0x0043
            int r1 = r11.A01
            com.instagram.api.schemas.IntentAwareAdsInfo r10 = r4.A0B
            if (r10 == 0) goto L_0x00e2
            java.lang.String r0 = r10.A04
            if (r0 == 0) goto L_0x00e2
            java.lang.Integer r9 = X.C55033Hb4.A00(r0)
        L_0x00ad:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r9 != r0) goto L_0x00e4
            if (r10 == 0) goto L_0x00e4
            java.lang.Integer r0 = r10.A03
            if (r0 == 0) goto L_0x00e4
            java.lang.String r9 = r10.A07
            if (r9 == 0) goto L_0x00e4
            int r0 = r0.intValue()
            X.3mM r10 = r8.Bky(r0)
            if (r10 == 0) goto L_0x00e4
            boolean r0 = r10.A0N
            if (r0 == 0) goto L_0x00e4
            com.instagram.model.reels.Reel r0 = r10.A0H
            X.3uh r0 = r0.A0A(r6, r2)
            java.lang.String r0 = r0.A0U(r6)
            if (r0 == 0) goto L_0x00e4
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x00e4
            int r0 = r1 + 1
            if (r14 <= r0) goto L_0x00e4
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            return r0
        L_0x00e2:
            r9 = 0
            goto L_0x00ad
        L_0x00e4:
            boolean r0 = r4.A13(r6)
            if (r0 == 0) goto L_0x0139
            java.util.Set r9 = r11.A07
            X.3uh r10 = r4.A0A(r6, r2)
            X.3mL r1 = r10.A0e
            X.3mL r0 = X.C250963mL.BRAND_SURVEY
            if (r1 != r0) goto L_0x0137
            java.lang.String r0 = r10.A0k
        L_0x00f8:
            r9.add(r0)
        L_0x00fb:
            int r0 = r11.A01
            int r0 = java.lang.Math.max(r0, r14)
            r11.A01 = r0
            boolean r0 = r11.A0C
            if (r0 == 0) goto L_0x0043
            java.util.List r1 = r4.A0O(r6)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0043
            java.lang.Object r1 = r1.get(r2)
            X.3uh r1 = (X.C255773uh) r1
            boolean r0 = r1.A1m()
            if (r0 == 0) goto L_0x0043
            X.3WR r10 = r1.A0M(r6)
            if (r10 == 0) goto L_0x0043
            android.content.Context r9 = r11.A0A
            java.lang.String r1 = "reel_feed_timeline"
            X.4U8 r0 = new X.4U8
            r0.<init>(r9, r6, r10, r1)
            r0.A02 = r3
            X.4U9 r0 = r0.A00()
            X.AnonymousClass4UA.A00(r0)
            goto L_0x0043
        L_0x0137:
            r0 = 0
            goto L_0x00f8
        L_0x0139:
            X.3IB r0 = r4.A0I
            if (r0 != 0) goto L_0x00fb
            java.util.Set r9 = r11.A07
            X.3uh r0 = r4.A0A(r6, r2)
            java.lang.String r0 = r0.A0U(r6)
            goto L_0x00f8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6VO.CNL(X.3n0, X.1PW, int):java.lang.Integer");
    }

    public final /* bridge */ /* synthetic */ boolean CVS(Object obj) {
        Set set;
        String A0U;
        Reel reel = ((C250973mM) obj).A0H;
        if (reel.A0m()) {
            set = this.A08;
            A0U = reel.A0G();
        } else if (!reel.CcK()) {
            return false;
        } else {
            if (reel.A0I != null) {
                return reel.A13(this.A04);
            }
            set = this.A07;
            UserSession userSession = this.A04;
            A0U = reel.A0A(userSession, 0).A0U(userSession);
        }
        return set.contains(A0U);
    }

    public final C251373n0 Coa() {
        return (C251373n0) this.A06.peekLast();
    }

    public final /* bridge */ /* synthetic */ void E5F(Object obj) {
        C233472vm r1 = ((C250973mM) obj).A0H.A0b;
        if (r1 != null) {
            r1.A0C(this.A09);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0067 A[EDGE_INSN: B:24:0x0067->B:19:0x0067 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ boolean FIZ(java.lang.Object r8, java.lang.String r9, java.util.Map r10) {
        /*
            r7 = this;
            X.3mM r8 = (X.C250973mM) r8
            X.4gh r1 = r7.A05
            int r0 = r1.CMI(r8)
            r6 = 1
            int r0 = r0 + 1
            X.3mM r4 = r1.Bky(r0)
            if (r4 == 0) goto L_0x0075
            com.instagram.model.reels.Reel r5 = r4.A0H
            X.1Xj r0 = r5.A0F
            if (r0 == 0) goto L_0x0075
            if (r9 == 0) goto L_0x0023
            java.lang.String r0 = r0.getId()
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0075
        L_0x0023:
            X.6bG r1 = (X.C310566bG) r1
            X.6bN r0 = r1.A0B
            boolean r0 = r0.A02(r4)
            if (r0 == 0) goto L_0x0032
            int r0 = r7.A00
            int r0 = r0 - r6
            r7.A00 = r0
        L_0x0032:
            java.util.LinkedList r0 = r7.A06
            java.util.Iterator r3 = r0.iterator()
            boolean r0 = r5.CcK()
            if (r0 == 0) goto L_0x0068
            java.util.Set r2 = r7.A07
            com.instagram.common.session.UserSession r1 = r7.A04
            r0 = 0
            X.3uh r0 = r5.A0A(r1, r0)
            java.lang.String r0 = r0.A0U(r1)
        L_0x004b:
            r2.remove(r0)
        L_0x004e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0067
            java.lang.Object r0 = r3.next()
            X.3n0 r0 = (X.C251373n0) r0
            java.lang.Object r0 = r0.BTb()
            boolean r0 = X.2Ob.A00(r0, r4)
            if (r0 == 0) goto L_0x004e
            r3.remove()
        L_0x0067:
            return r6
        L_0x0068:
            boolean r0 = r5.A0m()
            if (r0 == 0) goto L_0x004e
            java.util.Set r2 = r7.A08
            java.lang.String r0 = r5.A0G()
            goto L_0x004b
        L_0x0075:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6VO.FIZ(java.lang.Object, java.lang.String, java.util.Map):boolean");
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
            set.remove(A0U);
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

    public AnonymousClass6VO(Context context, UserSession userSession, C270414gh r6, ReelViewerFragment reelViewerFragment, boolean z, boolean z2) {
        this.A0A = context;
        this.A04 = userSession;
        this.A05 = r6;
        this.A0B = reelViewerFragment;
        this.A09 = z;
        this.A0C = z2;
        if (!182.A06(0Tu.A05, userSession, 36321718083528345L)) {
            182.A06(0Tu.A06, userSession, 36321666543920757L);
        }
    }

    public final List BYp() {
        return Collections.emptyList();
    }

    public final /* bridge */ /* synthetic */ Object BTe(int i) {
        return null;
    }
}
