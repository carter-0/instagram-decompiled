package X;

import android.graphics.Rect;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager;
import com.instagram.discovery.recyclerview.ui.DiscoveryRecyclerView;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.TpO  reason: case insensitive filesystem */
public final class C14074TpO {
    public Parcelable A00;
    public RecyclerView A01;
    public FlowingGridLayoutManager A02;
    public C14813UAk A03;
    public DiscoveryRecyclerView A04;
    public C3251871j A05;
    public C238133Ar A06;
    public AnonymousClass3AD A07;
    public boolean A08;
    public final int A09;
    public final AnonymousClass4DH A0A;
    public final C231302rO A0B;
    public final UserSession A0C;
    public final C59630JQy A0D;
    public final C14227TsA A0E;
    public final C20907X3y A0F;
    public final C228172ku A0G;
    public final G7A A0H;
    public final AnonymousClass32Q A0I;
    public final AnonymousClass0eM A0J;
    public final C15812Uiv[] A0K;
    public final double A0L;
    public final 2el A0M;
    public final C14313Ttn A0N;
    public final C14387TvG A0O;
    public final C20908X3z A0P;
    public final C52526GWd A0Q;
    public final C20977X7q A0R;
    public final C3252171m A0S;
    public final X48 A0T;
    public final Integer A0U;
    public final Set A0V = new LinkedHashSet();
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;

    public final void A04(int i, int i2) {
        FlowingGridLayoutManager flowingGridLayoutManager = this.A02;
        if (flowingGridLayoutManager != null) {
            C14323Tu0 tu0 = flowingGridLayoutManager.A06;
            int i3 = 0;
            Rect A002 = tu0.A00(0);
            if (A002 != null) {
                A002.bottom = A002.top + i;
                List list = tu0.A07;
                list.set(0, A002);
                int i4 = i2 - i;
                while (true) {
                    i3++;
                    if (i3 < list.size()) {
                        Rect A003 = tu0.A00(i3);
                        if (A003 != null) {
                            A003.top -= i4;
                            A003.bottom -= i4;
                            list.set(i3, A003);
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v38, resolved type: X.3AD} */
    /* JADX WARNING: type inference failed for: r0v15, types: [X.3AD] */
    /* JADX WARNING: type inference failed for: r0v37 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(android.view.View r15, boolean r16) {
        /*
            r14 = this;
            r0 = 0
            X.0qQ.A0B(r15, r0)
            X.TsA r7 = r14.A0E
            X.4DH r4 = r14.A0A
            android.content.res.Resources r1 = X.DbV.A05(r4)
            int r0 = r14.A09
            int r0 = r1.getDimensionPixelSize(r0)
            r3 = 1
            com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager r1 = new com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager
            r1.<init>(r7, r0)
            android.os.Parcelable r0 = r14.A00
            if (r0 == 0) goto L_0x001f
            r1.A1P(r0)
        L_0x001f:
            r2 = 0
            r14.A00 = r2
            r1.A0w(r3)
            r14.A02 = r1
            com.instagram.common.session.UserSession r8 = r14.A0C
            java.lang.Integer r5 = X.AnonymousClass05K.A0j
            android.view.View r1 = X.AnonymousClass2xO.A00(r15, r8, r5)
            r0 = 2131439344(0x7f0b2ef0, float:1.850064E38)
            android.view.View r6 = r1.requireViewById(r0)
            com.instagram.discovery.recyclerview.ui.DiscoveryRecyclerView r6 = (com.instagram.discovery.recyclerview.ui.DiscoveryRecyclerView) r6
            com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager r0 = r14.A02
            r6.setLayoutManager(r0)
            X.8hs r0 = r7.A0B
            X.2t9 r0 = r0.A01
            r6.setAdapter(r0)
            double r0 = r14.A0L
            r6.A00 = r0
            X.3Ar r0 = X.C238103Ao.A00(r6)
            r14.A06 = r0
            r14.A04 = r6
            boolean r0 = r14.A0X
            if (r0 == 0) goto L_0x0077
            android.content.Context r7 = X.AnonymousClass7TE.A0S(r6)
            X.TvG r9 = r14.A0O
            X.X3z r10 = r14.A0P
            boolean r12 = r14.A0Z
            boolean r13 = r14.A0Y
            java.util.Set r11 = r14.A0V
            X.UAk r6 = new X.UAk
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            com.instagram.discovery.recyclerview.ui.DiscoveryRecyclerView r0 = r14.A04
            if (r0 == 0) goto L_0x006e
            r0.A11(r6)
        L_0x006e:
            com.instagram.discovery.recyclerview.ui.DiscoveryRecyclerView r0 = r14.A04
            if (r0 == 0) goto L_0x0075
            r0.A13(r6)
        L_0x0075:
            r14.A03 = r6
        L_0x0077:
            r0 = 2131436284(0x7f0b22fc, float:1.8494434E38)
            androidx.recyclerview.widget.RecyclerView r0 = X.DbZ.A0F(r15, r0)
            r14.A01 = r0
            boolean r0 = r14.A08
            if (r0 == 0) goto L_0x00fa
            r1 = 3
            X.Wf1 r0 = new X.Wf1
            r0.<init>(r14, r1)
            X.3AD r0 = X.C3253672c.A02(r15, r8, r0, r5)
        L_0x008e:
            r14.A07 = r0
            X.3Ar r6 = r14.A06
            boolean r0 = r6 instanceof X.C238143As
            if (r0 == 0) goto L_0x00ee
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.migration.scrollingviewproxy.RefreshableScrollingViewProxy<*>"
            X.0qQ.A0C(r6, r0)
            X.3As r6 = (X.C238143As) r6
            boolean r0 = r14.A08
            if (r0 == 0) goto L_0x00e2
            X.0Tu r5 = X.0Tu.A05
            r0 = 36315318582316169(0x81049700010c89, double:3.02929192928288E-306)
            boolean r0 = X.182.A06(r5, r8, r0)
            if (r0 == 0) goto L_0x00d9
            X.3AD r0 = r14.A07
            X.Wf4 r0 = (X.C19763Wf4) r0
            r6.setUpPTRSpinner(r0)
        L_0x00b5:
            r0 = r16
            A00(r14, r0, r3)
            com.instagram.discovery.recyclerview.ui.DiscoveryRecyclerView r1 = r14.A04
            if (r1 == 0) goto L_0x00d8
            r0 = 9
            X.WBX.A00(r1, r0, r14)
            boolean r0 = r14.A0W
            if (r0 == 0) goto L_0x00ca
            r1.setItemAnimator(r2)
        L_0x00ca:
            X.2ku r0 = r14.A0G
            r1.A15(r0)
            X.Ttn r0 = r14.A0N
            r0.A00 = r1
            X.2el r0 = r14.A0M
            X.Dba.A0z(r1, r0, r4)
        L_0x00d8:
            return
        L_0x00d9:
            X.TuT r0 = new X.TuT
            r0.<init>(r14)
            r6.ErF(r0)
            goto L_0x00b5
        L_0x00e2:
            X.3AD r0 = r14.A07
            X.0qQ.A0A(r0)
            r0.APL()
            r6.APL()
            goto L_0x00b5
        L_0x00ee:
            boolean r0 = r14.A08
            if (r0 == 0) goto L_0x00b5
            java.lang.String r1 = "DiscoveryRecyclerGrid"
            java.lang.String r0 = "PTR is enabled on a non-refreshable parent"
            X.0wb.A03(r1, r0)
            goto L_0x00b5
        L_0x00fa:
            X.Wf2 r0 = new X.Wf2
            r0.<init>()
            goto L_0x008e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14074TpO.A05(android.view.View, boolean):void");
    }

    public final void A06(C229132mt r9) {
        int A072;
        C229132mt r4 = r9;
        0qQ.A0B(r9, 0);
        FlowingGridLayoutManager flowingGridLayoutManager = this.A02;
        if (flowingGridLayoutManager != null) {
            C3251871j r2 = new C3251871j(flowingGridLayoutManager, r4, C3251771i.A07, false, false);
            Integer num = this.A0U;
            if (num != null) {
                A072 = num.intValue();
            } else {
                A072 = DbX.A07(this.A0J);
            }
            r2.A01 = new C3252071l(r2, A072);
            C3252171m r0 = this.A0S;
            if (r0 != null) {
                r2.A01 = r0;
            }
            X48 x48 = this.A0T;
            if (x48 != null) {
                r2.A02 = x48;
            }
            C20977X7q x7q = this.A0R;
            if (x7q != null) {
                r2.A00 = x7q;
            }
            this.A0G.A02(r2);
            this.A05 = r2;
        }
    }

    public final void A09(C249403jg... r5) {
        for (C249403jg A022 : r5) {
            this.A0G.A02(A022);
        }
    }

    /* JADX WARNING: type inference failed for: r0v37, types: [X.JQy, java.lang.Object] */
    public C14074TpO(C14385TvE tvE) {
        Object obj;
        C59630JQy wes;
        C14393TvM tvM;
        C14385TvE tvE2 = tvE;
        C20907X3y x3y = tvE2.A07;
        0qQ.A0A(x3y);
        this.A0F = x3y;
        C14227TsA tsA = tvE2.A06;
        0qQ.A0A(tsA);
        this.A0E = tsA;
        AnonymousClass4DH r8 = tvE2.A04;
        0qQ.A0A(r8);
        this.A0A = r8;
        AnonymousClass32Q r0 = tvE2.A0G;
        0qQ.A0A(r0);
        this.A0I = r0;
        C228172ku r2 = new C228172ku();
        this.A0G = r2;
        C14313Ttn ttn = new C14313Ttn(tsA);
        this.A0N = ttn;
        UserSession userSession = tvE2.A0Q;
        this.A0C = userSession;
        2el r02 = tvE2.A05;
        0qQ.A0A(r02);
        this.A0M = r02;
        this.A09 = tvE2.A01;
        this.A0L = tvE2.A00;
        this.A0W = tvE2.A0I;
        this.A0X = tvE2.A0K;
        this.A0Z = tvE2.A0M;
        this.A0Y = tvE2.A0L;
        this.A08 = tvE2.A0N;
        this.A0K = tvE2.A0P;
        this.A0S = tvE2.A0D;
        this.A0T = tvE2.A0E;
        this.A0R = tvE2.A0C;
        this.A0P = tvE2.A09;
        this.A0H = tvE2.A0F;
        boolean z = tvE2.A0J;
        this.A0U = tvE2.A0H;
        C52526GWd gWd = tvE2.A0B;
        this.A0Q = gWd;
        this.A0J = AnonymousClass1YB.A00(new C58675Ivk(this, 0));
        if (C238173Av.A02(userSession, "ig_olympus_disable_video_autoplay")) {
            this.A0D = new Object();
        } else {
            X9Q x9q = tvE2.A0A;
            if (x9q instanceof C14393TvM) {
                C14358Tun tun = tvE2.A03;
                if (tun != null) {
                    AnonymousClass7TF.A1B(r8, 0, tsA);
                    C14077TpR A002 = tun.A00(userSession);
                    if (!(A002 == null || (tvM = tun.A01) == null)) {
                        obj = new C14316Ttq(r8, A002, A002.A01, userSession, ttn, tsA, tvM, gWd);
                        JTR.A1T(obj, ((C14321Ttw) tun.A03.getValue()).A00);
                    }
                }
                obj = new Object();
            } else if (x9q instanceof WWE) {
                WWE wwe = (WWE) x9q;
                if (tvE2.A0O) {
                    if (wwe != null) {
                        wes = new WET(r8, userSession, ttn, tsA, wwe, gWd);
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else if (wwe != null) {
                    wes = new WES(r8, userSession, ttn, tsA, wwe, gWd, z);
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
                this.A0D = wes;
            } else {
                if (x9q instanceof C14322Ttx) {
                    C14322Ttx ttx = (C14322Ttx) x9q;
                    if (ttx != null) {
                        obj = new C14317Ttr(r8, userSession, ttn, tsA, ttx, gWd);
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                obj = new Object();
            }
            wes = (C59630JQy) obj;
            this.A0D = wes;
        }
        r2.A02(new UAx(1, this, tvE2));
        this.A0B = new C14116TqB(this);
        this.A0O = new C14387TvG(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        if (r2.CaA() != false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C14074TpO r4, boolean r5, boolean r6) {
        /*
            X.4DH r0 = r4.A0A
            android.view.View r0 = r0.mView
            if (r0 == 0) goto L_0x004c
            X.3Ar r2 = r4.A06
            r3 = 0
            if (r2 == 0) goto L_0x0029
            boolean r0 = r2 instanceof X.C238143As
            if (r0 == 0) goto L_0x0029
            if (r6 == 0) goto L_0x0029
            X.3As r2 = (X.C238143As) r2
            r2.EaP(r5)
            boolean r0 = r4.A08
            if (r5 == 0) goto L_0x005a
            if (r0 != 0) goto L_0x0023
            boolean r1 = r2.CaA()
            r0 = 0
            if (r1 == 0) goto L_0x0024
        L_0x0023:
            r0 = 1
        L_0x0024:
            r4.A08 = r0
            r2.APL()
        L_0x0029:
            X.TsA r2 = r4.A0E
            X.Uiv[] r1 = r4.A0K
            r2.A07 = r1
            boolean r0 = r4.A0A()
            if (r0 == 0) goto L_0x004d
            X.Tuy r0 = r2.A0E
            if (r0 == 0) goto L_0x003f
            X.GXD r1 = r0.A01
            java.lang.String r0 = "success"
            r1.A00 = r0
        L_0x003f:
            r0 = 0
            r2.A06 = r0
            X.C14227TsA.A00(r2)
            X.3AD r0 = r4.A07
            if (r0 == 0) goto L_0x004c
            r0.EaL(r5, r6)
        L_0x004c:
            return
        L_0x004d:
            r2.A06 = r1
            X.C14227TsA.A00(r2)
            X.3AD r0 = r4.A07
            if (r0 == 0) goto L_0x004c
            r0.EaL(r3, r6)
            return
        L_0x005a:
            if (r0 == 0) goto L_0x0029
            r2.ARa()
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14074TpO.A00(X.TpO, boolean, boolean):void");
    }

    public final void A01() {
        DiscoveryRecyclerView discoveryRecyclerView = this.A04;
        if (discoveryRecyclerView != null) {
            discoveryRecyclerView.setAdapter((2Rw) null);
        }
        this.A04 = null;
        this.A06 = null;
        this.A0N.A00 = null;
        this.A03 = null;
        FlowingGridLayoutManager flowingGridLayoutManager = this.A02;
        if (flowingGridLayoutManager != null) {
            this.A00 = flowingGridLayoutManager.A1M();
        }
        this.A02 = null;
        C3251871j r1 = this.A05;
        if (r1 != null) {
            this.A0G.A01.remove(r1);
        }
        this.A05 = null;
        this.A07 = null;
    }

    public final void A02() {
        DiscoveryRecyclerView discoveryRecyclerView = this.A04;
        if (discoveryRecyclerView != null) {
            discoveryRecyclerView.post(new C20018Wje(this));
        }
    }

    public final void A03() {
        FlowingGridLayoutManager flowingGridLayoutManager;
        DiscoveryRecyclerView discoveryRecyclerView = this.A04;
        if (discoveryRecyclerView != null && discoveryRecyclerView.getHeight() != 0 && (flowingGridLayoutManager = this.A02) != null) {
            if (flowingGridLayoutManager.A1b() >= 24) {
                flowingGridLayoutManager.A1O(0);
            }
            flowingGridLayoutManager.A1f(discoveryRecyclerView, 0);
        }
    }

    public final void A07(User user, boolean z) {
        1Xj BPf;
        String str;
        int A002;
        C14227TsA tsA = this.A0E;
        Iterator A032 = tsA.A0D.A03();
        0qQ.A07(A032);
        while (A032.hasNext()) {
            C232262tL r1 = (C232262tL) A032.next();
            if ((r1 instanceof C296965qw) && (BPf = ((C296965qw) r1).BPf()) != null) {
                UserSession userSession = tsA.A0A;
                User A2A = BPf.A2A(userSession);
                String str2 = null;
                if (A2A != null) {
                    str2 = A2A.getId();
                }
                if (!00p.A0j(str2, user.getId(), false)) {
                    continue;
                } else {
                    if (!1sd.A00(userSession).A05(BPf)) {
                        if (!z) {
                            continue;
                        } else {
                            1se A003 = 1sd.A00(userSession);
                            if (A003 != null) {
                                A003.A02(BPf, true);
                                A003.A01(BPf, 21);
                            }
                            str = BPf.getId();
                            if (str == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                    } else if (!z && ((A002 = 1sd.A00(userSession).A00(BPf)) == -1 || A002 == 22 || A002 == 21)) {
                        1se A004 = 1sd.A00(userSession);
                        if (A004 != null) {
                            A004.A02(BPf, false);
                            A004.A01(BPf, 22);
                        }
                        str = BPf.getId();
                        if (str == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    tsA.A03(str);
                }
            }
        }
    }

    public final void A08(String str) {
        this.A0E.A03(str);
    }

    public final boolean A0A() {
        return AnonymousClass7TF.A1R(this.A0E.getCount());
    }
}
