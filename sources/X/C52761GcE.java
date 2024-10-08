package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.GcE  reason: case insensitive filesystem */
public final class C52761GcE {
    public int A00;
    public int A01;
    public C252553pI A02;
    public C55889HpA A03;
    public C52758GcB A04;
    public boolean A05;
    public final Context A06;
    public final UserSession A07;
    public final String A08;
    public final IO4 A09 = new IO4((Object) this, 0);
    public final C227762js A0A;
    public final C55486HiU A0B;
    public final boolean A0C;

    public final void A05(C59609JQd jQd, AnonymousClass2xS r10, C238123Aq r11) {
        0qQ.A0B(r11, 0);
        RecyclerView recyclerView = r11.A03;
        0qQ.A07(recyclerView);
        this.A02 = recyclerView.A0D;
        C227762js r6 = this.A0A;
        UserSession userSession = this.A07;
        C52758GcB gcB = new C52758GcB(recyclerView, r6, userSession, this, jQd);
        C55486HiU hiU = this.A0B;
        C55889HpA hpA = new C55889HpA(AnonymousClass7TE.A0S(recyclerView), this, gcB, r11);
        r11.A04.add(hpA.A07);
        C228442lg r1 = recyclerView.A0E;
        if (r1 == null || r1 == r11.A02) {
            recyclerView.A0E = r11.A02;
            recyclerView.A15(hpA.A09);
            recyclerView.A13(hpA.A08);
            if (hiU != null) {
                hiU.A00 = hpA;
            }
            this.A03 = hpA;
            this.A04 = gcB;
            if (r10 != null) {
                r10.A01 = this;
                r10.A0F.A02 = this;
            }
            AnonymousClass1Nd.A00(userSession).A01(this.A09, C57076INq.class);
            return;
        }
        throw AnonymousClass7TE.A0z("RecyclerView should not have fling listeners set directly!");
    }

    public final void A07(AnonymousClass2xS r7, C238123Aq r8) {
        0qQ.A0B(r8, 0);
        if (r7 != null) {
            r7.A01 = null;
            r7.A0F.A02 = null;
        }
        C55889HpA hpA = this.A03;
        if (hpA != null) {
            C55486HiU hiU = this.A0B;
            RecyclerView recyclerView = r8.A03;
            0qQ.A07(recyclerView);
            C228442lg r1 = hpA.A07;
            List list = r8.A04;
            list.remove(r1);
            if (list.isEmpty()) {
                recyclerView.A0E = null;
            }
            recyclerView.A16(hpA.A09);
            recyclerView.A14(hpA.A08);
            if (hiU != null) {
                hiU.A00 = null;
            }
            this.A03 = null;
            this.A02 = null;
            this.A04 = null;
            AnonymousClass1Nd.A00(this.A07).A02(this.A09, C57076INq.class);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A00(C52761GcE gcE) {
        C252553pI r4;
        C52758GcB gcB = gcE.A04;
        if (gcB != null && (r4 = gcE.A02) != null) {
            int A002 = C240113Jq.A00(r4);
            C227762js r2 = gcE.A0A;
            if (r2.A01 < 2.0f && gcB.A02(gcB.A00) == A002) {
                C240113Jq.A05(r4, A002, (int) (r2.A00 - r2.A01));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.52R, X.52T, X.52S] */
    public static final void A01(C52761GcE gcE, float f, int i, boolean z) {
        C252553pI r7;
        int i2;
        C52758GcB gcB = gcE.A04;
        if (gcB != null && (r7 = gcE.A02) != null) {
            Set AZN = gcB.A04.AZN();
            Integer valueOf = Integer.valueOf(i);
            boolean contains = AZN.contains(valueOf);
            C59609JQd jQd = gcB.A04;
            boolean containsKey = jQd.C8M().containsKey(valueOf);
            if (z) {
                i2 = gcE.A00;
            } else {
                i2 = gcE.A01;
            }
            Iterator it = AnonymousClass7TE.A1F().iterator();
            int i3 = 0;
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (intValue < i) {
                    i3 += gcB.A01(intValue);
                }
            }
            int i4 = i2 + i3;
            if (contains) {
                i4 = Math.max(i4, ((r7.A00 - gcB.A01(i)) - i4) / 2);
            } else if (containsKey) {
                i4 += AnonymousClass7TG.A0A((Number) jQd.C8M().get(valueOf));
            }
            C252553pI r2 = gcE.A02;
            if (r2 != null && i != -1) {
                ? r1 = new AnonymousClass52S(gcE.A06);
                r1.A00 = -1.0f;
                r1.A00 = i;
                r1.A01 = i4;
                r1.A00 = f;
                r2.A0t(r1);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [X.Muj, X.52S] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0076, code lost:
        if (X.0qQ.A0K(r1, "feed_contextual_keyword") != false) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A02(X.C52761GcE r10, boolean r11) {
        /*
            X.GcB r3 = r10.A04
            r6 = 0
            r5 = 1
            if (r3 == 0) goto L_0x00d7
            int r0 = r3.A00
            int r1 = r0 + 1
            X.JQd r0 = r3.A04
            java.util.List r0 = r0.AZO()
            int r0 = r0.size()
            if (r1 >= r0) goto L_0x00d7
            int r0 = r3.A00
            r3.A02(r0)
            int r0 = r3.A00
            int r0 = r0 + 1
            int r4 = r3.A02(r0)
            int r0 = r3.A00
            int r0 = r0 + 1
            int r2 = r3.A02(r0)
            X.3pI r9 = r3.A02
            int r8 = X.C240113Jq.A02(r9)
            if (r2 <= r8) goto L_0x004a
            int r1 = r2 - r8
            r0 = 2
            if (r1 > r0) goto L_0x007e
            X.JQd r0 = r3.A04
            java.util.Set r1 = r0.B5K()
            int r0 = r3.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x007e
        L_0x004a:
            int r0 = r3.A00
            int r0 = r0 + 1
            r3.A00 = r0
            r2 = 1
            int r1 = r0 + 1
            X.JQd r0 = r3.A04
            java.util.List r0 = r0.AZO()
            int r0 = r0.size()
            if (r1 < r0) goto L_0x0060
            r2 = 0
        L_0x0060:
            r0 = r2 ^ 1
            r3.A01 = r0
            java.lang.String r1 = r10.A08
            java.lang.String r0 = "feed_contextual_chain"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0078
            java.lang.String r0 = "feed_contextual_keyword"
            boolean r1 = X.0qQ.A0K(r1, r0)
            r0 = 1085276160(0x40b00000, float:5.5)
            if (r1 == 0) goto L_0x007a
        L_0x0078:
            r0 = 1090781184(0x41040000, float:8.25)
        L_0x007a:
            A01(r10, r0, r4, r5)
        L_0x007d:
            return r5
        L_0x007e:
            X.0qQ.A0B(r9, r6)
            int r7 = r9.A00
            int r0 = r9.Ba8()
            int r7 = r7 - r0
            int r0 = r9.BaC()
            int r7 = r7 - r0
            int r2 = X.C52758GcB.A00(r3, r8, r2, r6)
            int r0 = r8 + 1
            int r1 = X.C52758GcB.A00(r3, r8, r0, r5)
            r0 = -1
            if (r2 == r0) goto L_0x00a6
            int r2 = r2 - r1
            float r2 = (float) r2
            float r1 = (float) r7
            r0 = 1028443341(0x3d4ccccd, float:0.05)
            float r1 = r1 * r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a6
            goto L_0x004a
        L_0x00a6:
            if (r11 != 0) goto L_0x004a
            X.3pI r3 = r10.A02
            if (r3 == 0) goto L_0x007d
            java.lang.String r1 = r10.A08
            java.lang.String r0 = "feed_contextual_chain"
            boolean r0 = X.0qQ.A0K(r1, r0)
            android.content.Context r1 = r10.A06
            if (r0 == 0) goto L_0x00c5
            int r0 = r10.A01
            X.Mur r2 = new X.Mur
            r2.<init>(r1, r0)
        L_0x00bf:
            r2.A00 = r4
            r3.A0t(r2)
            return r5
        L_0x00c5:
            X.Muj r2 = new X.Muj
            r2.<init>(r1)
            r2.A01 = r6
            r2.A03 = r5
            int r1 = r10.A00
            int r0 = r10.A01
            r2.A00 = r1
            r2.A02 = r0
            goto L_0x00bf
        L_0x00d7:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52761GcE.A02(X.GcE, boolean):boolean");
    }

    public final int A03() {
        C252553pI r1;
        AnonymousClass52T r0;
        int scrollState;
        C52758GcB gcB = this.A04;
        if (gcB == null || (r1 = this.A02) == null) {
            return 0;
        }
        int A022 = gcB.A02(gcB.A00 + 1);
        int A023 = C240113Jq.A02(r1);
        C52758GcB gcB2 = this.A04;
        if ((gcB2 == null || (((r0 = gcB2.A02.A06) == null || !r0.A05) && (scrollState = gcB2.A03.getScrollState()) != 1 && scrollState != 2)) && A022 != -1 && A022 <= A023) {
            return A022;
        }
        return A023;
    }

    public final int A04() {
        C252553pI r1;
        AnonymousClass52T r0;
        int scrollState;
        C52758GcB gcB = this.A04;
        if (gcB == null || (r1 = this.A02) == null) {
            return 0;
        }
        int A022 = gcB.A02(gcB.A00);
        int A012 = C240113Jq.A01(r1);
        C52758GcB gcB2 = this.A04;
        if ((gcB2 == null || (((r0 = gcB2.A02.A06) == null || !r0.A05) && (scrollState = gcB2.A03.getScrollState()) != 1 && scrollState != 2)) && A022 != -1 && A022 >= A012) {
            return A022;
        }
        return A012;
    }

    public final void A06(1Xj r8, AnonymousClass3W1 r9) {
        C55889HpA hpA = this.A03;
        if (this.A0C && hpA != null && !hpA.A01 && !hpA.A00 && !this.A05 && r8 != null && !r8.A5D()) {
            r8.A3q();
            Integer num = null;
            C250513lZ A0w = C51966G9m.A0w(r8);
            if (!(A0w == null || A0w.BF5() == null)) {
                UserSession userSession = this.A07;
                0Tu r4 = 0Tu.A05;
                if (!182.A06(r4, userSession, 36327181282064603L)) {
                    if (r9 != null) {
                        num = r9.A13;
                    }
                    if (num == AnonymousClass05K.A00 && 182.A06(r4, userSession, 36327181282130140L)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            hpA.A01 = true;
            A02(this, true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0037, code lost:
        if (X.0qQ.A0K(r1, "feed_contextual_keyword") != false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A08() {
        /*
            r6 = this;
            X.GcB r5 = r6.A04
            r2 = 1
            r4 = 0
            if (r5 == 0) goto L_0x0053
            int r0 = r5.A00
            if (r0 <= 0) goto L_0x0053
            int r0 = r0 - r2
            int r3 = r5.A02(r0)
            int r0 = r5.A00
            int r1 = r5.A02(r0)
            X.3pI r0 = r5.A02
            int r0 = X.C240113Jq.A01(r0)
            if (r1 <= r0) goto L_0x003f
            int r0 = r5.A00
            int r0 = r0 + -1
            r5.A00 = r0
            r5.A01 = r4
            java.lang.String r1 = r6.A08
            java.lang.String r0 = "feed_contextual_chain"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = "feed_contextual_keyword"
            boolean r1 = X.0qQ.A0K(r1, r0)
            r0 = 1085276160(0x40b00000, float:5.5)
            if (r1 == 0) goto L_0x003b
        L_0x0039:
            r0 = 1090781184(0x41040000, float:8.25)
        L_0x003b:
            A01(r6, r0, r3, r4)
        L_0x003e:
            return r2
        L_0x003f:
            int r0 = r5.A00
            int r1 = r5.A02(r0)
            X.3pI r0 = r6.A02
            if (r0 == 0) goto L_0x003e
            X.GcB r0 = r6.A04
            if (r0 == 0) goto L_0x003e
            r0 = 1085276160(0x40b00000, float:5.5)
            A01(r6, r0, r1, r2)
            return r2
        L_0x0053:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52761GcE.A08():boolean");
    }

    public C52761GcE(Context context, C227762js r4, UserSession userSession, C55486HiU hiU, String str, int i, int i2, boolean z) {
        this.A07 = userSession;
        this.A06 = context;
        this.A0A = r4;
        this.A08 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A0C = z;
        this.A0B = hiU;
    }
}
