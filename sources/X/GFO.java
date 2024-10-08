package X;

import android.content.Context;
import android.util.TypedValue;
import com.instagram.api.schemas.AdFormatType;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import java.util.List;

public abstract class GFO extends GFP {
    public float A00;
    public int A01;
    public 2V5 A02;
    public ReboundViewPager A03;
    public C52643GaH A04;
    public boolean A05;
    public final Context A06;
    public final C249403jg A07;
    public final 2V5 A08;
    public final 2V5 A09;
    public final 2V5 A0A;
    public final 2V5 A0B;
    public final 2V5 A0C;
    public final C267324bN A0D;
    public final C52058GDe A0E;
    public final JRO A0F;
    public final AnonymousClass0iw A0G;
    public final UserSession A0H;
    public final AnonymousClass3W1 A0I;
    public final List A0J;
    public final AnonymousClass0eM A0K;
    public final AnonymousClass0eM A0L;
    public final AnonymousClass0eM A0M;

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 36321254227059911L) == false) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09() {
        /*
            r6 = this;
            r1 = r6
            boolean r0 = r6 instanceof X.HK0
            if (r0 != 0) goto L_0x005a
            boolean r0 = r6 instanceof X.C52670Gai
            if (r0 == 0) goto L_0x005a
            X.Gai r1 = (X.C52670Gai) r1
            X.I02 r0 = r1.A00
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x005a
            X.2V5 r5 = r6.A0B
            java.lang.Object r0 = r5.A00
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 != 0) goto L_0x005a
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r4 = r6.A03
            if (r4 == 0) goto L_0x005a
            X.GaH r0 = r6.A04
            if (r0 != 0) goto L_0x0049
            X.GDe r0 = r6.A0E
            boolean r0 = r0.A0N
            if (r0 != 0) goto L_0x0049
            boolean r0 = r6.A05
            if (r0 == 0) goto L_0x005b
            com.instagram.common.session.UserSession r3 = r6.A0H
            X.0Tu r2 = X.0Tu.A06
            r0 = 36325119697826418(0x810d8100033272, double:3.035490194197486E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0049
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321254227059911(0x8109fd000024c7, double:3.0330456549197457E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x005b
        L_0x0049:
            X.GDe r0 = r6.A0E
            boolean r0 = r0.A0N
            if (r0 == 0) goto L_0x005a
            java.lang.Object r0 = r5.A00
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 != 0) goto L_0x005a
            r6.A08()
        L_0x005a:
            return
        L_0x005b:
            java.lang.Integer r0 = r6.A05()
            if (r0 == 0) goto L_0x007f
            int r0 = r0.intValue()
            long r1 = (long) r0
            X.GaH r0 = new X.GaH
            r0.<init>(r6, r1)
        L_0x006b:
            r6.A04 = r0
            if (r0 == 0) goto L_0x0074
            r0.A01 = r4
            r0.A01()
        L_0x0074:
            X.JRO r2 = r6.A0F
            if (r2 == 0) goto L_0x005a
            X.4bN r1 = r6.A0D
            r0 = 1
            r2.EXx(r1, r0)
            return
        L_0x007f:
            r0 = 0
            goto L_0x006b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GFO.A09():void");
    }

    public void A0A(ReboundViewPager reboundViewPager) {
        float applyDimension;
        this.A03 = reboundViewPager;
        reboundViewPager.A0P(this);
        reboundViewPager.A0K(C51970G9q.A09(this.A0A));
        if (A0D()) {
            reboundViewPager.setScrollMode(AnonymousClass3TG.DISABLED);
            reboundViewPager.setCarouselModeEnabled(true);
            applyDimension = 0.0f;
        } else {
            reboundViewPager.setScrollMode(AnonymousClass3TG.DISCRETE_PAGING);
            reboundViewPager.setCarouselModeEnabled(false);
            reboundViewPager.A0C = -1;
            applyDimension = TypedValue.applyDimension(1, 2.0f, reboundViewPager.getResources().getDisplayMetrics());
        }
        reboundViewPager.setPageSpacing(applyDimension);
    }

    public final int A01() {
        if (this instanceof C52670Gai) {
            return ((C52670Gai) this).A00.A00;
        }
        if ((this instanceof HK0) || (this instanceof C52142GGk)) {
            return 0;
        }
        return (int) ((HK1) this).A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (r1 == 0.0f) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A02() {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.C52670Gai
            if (r0 == 0) goto L_0x000c
            r0 = r5
            X.Gai r0 = (X.C52670Gai) r0
            X.I02 r0 = r0.A00
            int r0 = r0.A00
            return r0
        L_0x000c:
            boolean r0 = r5 instanceof X.HK1
            if (r0 == 0) goto L_0x0031
            r4 = r5
            X.HK1 r4 = (X.HK1) r4
            com.instagram.common.session.UserSession r3 = r4.A0H
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321761033856708(0x810a73000a26c4, double:3.033366161578787E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0029
            float r1 = r4.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x002f
        L_0x0029:
            float r0 = r4.A00
            float r1 = X.HK1.A00(r4, r0)
        L_0x002f:
            int r0 = (int) r1
            return r0
        L_0x0031:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GFO.A02():int");
    }

    public final C59595JPp A04() {
        AnonymousClass0eM r0;
        if (this instanceof HK0) {
            return ((HK0) this).A00;
        }
        if (this instanceof C52670Gai) {
            r0 = ((C52670Gai) this).A01;
        } else if (this instanceof C52142GGk) {
            return ((C52142GGk) this).A00;
        } else {
            r0 = ((HK1) this).A05;
        }
        return (C59595JPp) r0.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0056, code lost:
        if (r0 == false) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer A05() {
        /*
            r9 = this;
            boolean r0 = r9 instanceof X.C52670Gai
            if (r0 == 0) goto L_0x000c
            r0 = r9
            X.Gai r0 = (X.C52670Gai) r0
            X.I02 r0 = r0.A00
            java.lang.Integer r0 = r0.A01
            return r0
        L_0x000c:
            boolean r0 = r9 instanceof X.HK1
            if (r0 == 0) goto L_0x0062
            r6 = r9
            X.HK1 r6 = (X.HK1) r6
            com.instagram.common.session.UserSession r5 = r6.A0H
            X.0Tu r4 = X.0Tu.A05
            r0 = 37166185964437925(0x840a73001101a5, double:3.5673838879046225E-306)
            double r7 = X.182.A00(r4, r5, r0)
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x005f
            r0 = 36321761033856708(0x810a73000a26c4, double:3.033366161578787E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 != 0) goto L_0x005f
            r0 = 36321761033266875(0x810a73000126bb, double:3.0333661612057745E-306)
            boolean r3 = X.182.A06(r4, r5, r0)
            r0 = 36321761033987782(0x810a73000c26c6, double:3.033366161661679E-306)
            boolean r2 = X.182.A06(r4, r5, r0)
            java.util.List r0 = r6.A0G()
            int r1 = r0.size()
            r0 = 6
            boolean r0 = X.C51970G9q.A1W(r1, r0)
            if (r3 == 0) goto L_0x0058
            if (r2 == 0) goto L_0x0058
            r1 = 2500(0x9c4, float:3.503E-42)
            if (r0 != 0) goto L_0x005a
        L_0x0058:
            r1 = 1500(0x5dc, float:2.102E-42)
        L_0x005a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            return r0
        L_0x005f:
            r1 = 2000(0x7d0, float:2.803E-42)
            goto L_0x005a
        L_0x0062:
            boolean r0 = r9 instanceof X.C52142GGk
            if (r0 == 0) goto L_0x0068
            r0 = 0
            return r0
        L_0x0068:
            r1 = 3000(0xbb8, float:4.204E-42)
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GFO.A05():java.lang.Integer");
    }

    public final String A06() {
        if ((this instanceof C52142GGk) || (this instanceof HK0)) {
            return "dots";
        }
        if (this instanceof C52670Gai) {
            return ((C52670Gai) this).A00.A02;
        }
        return "progress_dots";
    }

    public final String A07() {
        C258043yN r0;
        String C71;
        if (!(this instanceof C52142GGk) && (this instanceof C52670Gai)) {
            C52670Gai gai = (C52670Gai) this;
            if (!gai.A0D() || (r0 = gai.A00.A04) == null || (C71 = r0.C71()) == null || C71.length() == 0) {
                return "under_hero";
            }
            return C71;
        }
        return "under_hero";
    }

    public final void A08() {
        if ((this instanceof C52670Gai) && AnonymousClass7TF.A1W(AdFormatType.NATIVE_CAROUSEL, this.A0D.A0E)) {
            this.A0B.A00(AnonymousClass7TE.A0v());
            C52643GaH gaH = this.A04;
            if (gaH != null) {
                gaH.A00();
                gaH.A01 = null;
                gaH.A00();
            }
        }
    }

    public final boolean A0B() {
        if (this instanceof C52142GGk) {
            return false;
        }
        if ((this instanceof C52670Gai) || !(this instanceof HK0)) {
            return this.A0D.A0E();
        }
        return GFN.A00(this.A0D);
    }

    public final boolean A0C() {
        if ((this instanceof C52142GGk) || (this instanceof C52670Gai) || (this instanceof HK0)) {
            return false;
        }
        return true;
    }

    public final boolean A0D() {
        if ((this instanceof C52142GGk) || !(this instanceof C52670Gai)) {
            return false;
        }
        return AnonymousClass7TF.A1W(AdFormatType.H_SCROLL, this.A0D.A0E);
    }

    public final boolean A0E() {
        long j;
        long j2;
        C267324bN r3 = this.A0D;
        boolean A042 = C52076GDw.A04(r3);
        1Xj r0 = (1Xj) this.A09.A00;
        if (r0 != null) {
            j = (long) r0.A0k();
        } else {
            j = 0;
        }
        boolean A032 = C52076GDw.A03(r3);
        if (!A042) {
            return false;
        }
        if (A032) {
            j2 = 10;
        } else {
            j2 = 15;
        }
        if (j >= j2) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002a, code lost:
        if (r0 != null) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GFO(android.content.Context r8, X.C267324bN r9, X.C52058GDe r10, X.JRO r11, X.AnonymousClass0iw r12, com.instagram.common.session.UserSession r13, X.AnonymousClass3W1 r14) {
        /*
            r7 = this;
            r7.<init>()
            r7.A06 = r8
            r7.A0D = r9
            r7.A0H = r13
            r7.A0G = r12
            r7.A0E = r10
            r7.A0I = r14
            r7.A0F = r11
            java.util.List r0 = r9.A0R
            r7.A0J = r0
            boolean r0 = r14.A2X
            r6 = 1
            r2 = -1
            r5 = 0
            if (r0 == 0) goto L_0x00ce
            boolean r0 = r9.A0E()
            if (r0 == 0) goto L_0x00ce
            int r1 = r14.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r1 == r2) goto L_0x00ce
            if (r0 == 0) goto L_0x00ce
        L_0x002c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            X.2V5 r4 = new X.2V5
            r4.<init>(r0)
            r7.A0A = r4
            boolean r0 = r7.A0C()
            if (r0 == 0) goto L_0x003e
            r2 = 0
        L_0x003e:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            X.2V5 r0 = new X.2V5
            r0.<init>(r1)
            r7.A02 = r0
            X.GFQ r3 = new X.GFQ
            r3.<init>(r7)
            int r1 = X.C51970G9q.A09(r4)
            X.GFO r0 = r3.A00
            java.util.List r0 = r0.A0J
            if (r0 == 0) goto L_0x00cc
            java.lang.Object r0 = X.00k.A0O(r0, r1)
        L_0x005c:
            X.GrX r2 = new X.GrX
            r2.<init>(r0)
            X.GFR r1 = new X.GFR
            r1.<init>(r2, r4, r3)
            java.util.Set r0 = r4.A01
            r0.add(r1)
            r7.A09 = r2
            java.lang.Float r1 = X.C51967G9n.A0g()
            X.2V5 r0 = new X.2V5
            r0.<init>(r1)
            r7.A08 = r0
            boolean r0 = r14.A2X
            if (r0 == 0) goto L_0x00ca
            X.4bN r0 = r7.A0D
            boolean r0 = r0.A0E()
            if (r0 == 0) goto L_0x00ca
        L_0x0084:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            X.2V5 r0 = new X.2V5
            r0.<init>(r1)
            r7.A0B = r0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            X.2V5 r0 = new X.2V5
            r0.<init>(r1)
            r7.A0C = r0
            X.GJ3 r0 = X.GJ3.A00
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r7.A0M = r0
            r0 = 24
            X.IwE r0 = X.C58705IwE.A01(r7, r0)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r7.A0K = r0
            X.GJ4 r0 = X.GJ4.A00
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r7.A0L = r0
            int r0 = X.0nA.A09(r8)
            float r0 = (float) r0
            float r0 = X.0nA.A01(r8, r0)
            r7.A00 = r0
            r1 = 7
            X.GiT r0 = new X.GiT
            r0.<init>(r7, r1)
            r7.A07 = r0
            return
        L_0x00ca:
            r6 = 0
            goto L_0x0084
        L_0x00cc:
            r0 = 0
            goto L_0x005c
        L_0x00ce:
            r1 = 0
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GFO.<init>(android.content.Context, X.4bN, X.GDe, X.JRO, X.0iw, com.instagram.common.session.UserSession, X.3W1):void");
    }

    public final int A03() {
        if (A0C()) {
            int A0H2 = C51971G9r.A0H(this.A0J);
            if (182.A06(0Tu.A05, this.A0H, 36321761033987782L)) {
                return (A0H2 / 3) - 1;
            }
            int i = A0H2 % 2;
            if (A0H2 == 0) {
                return 1;
            }
            if (i == 0) {
                return (A0H2 / 2) - 1;
            }
            return A0H2 / 2;
        }
        List list = this.A0J;
        if (list != null) {
            return list.size();
        }
        return 1;
    }
}
