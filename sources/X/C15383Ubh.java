package X;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.sponsored.analytics.SourceModelInfoParams;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.ui.widget.refresh.RefreshableListView;
import com.instagram.user.model.User;

/* renamed from: X.Ubh  reason: case insensitive filesystem */
public final class C15383Ubh extends AnonymousClass32G implements AbsListView.OnScrollListener, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "PBIAProxyProfileFragment";
    public int A00;
    public int A01;
    public View A02;
    public ViewGroup A03;
    public ViewGroup A04;
    public 2da A05;
    public 1Xl A06;
    public C324466zK A07;
    public C15466UdH A08;
    public C17832Vgl A09;
    public VYF A0A;
    public C19376WWr A0B;
    public EmptyStateView A0C;
    public RefreshableListView A0D;
    public C249763kK A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public boolean A0I;
    public boolean A0J;
    public AnonymousClass332 A0K;
    public SourceModelInfoParams A0L;
    public final AnonymousClass4DU A0M;
    public final AnonymousClass0eM A0N = C227642jf.A02(this);
    public final C228172ku A0O = new C228172ku();
    public final AnonymousClass4DU A0P;

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        this.A05 = r4;
        A02(this);
        r4.Eu4(true);
        AnonymousClass3JR r2 = new AnonymousClass3JR();
        r2.A0A = R.layout.navbar_overflow_button;
        r2.A05 = 2131966173;
        r2.A0G = new FPD((Object) this, 55);
        r4.AA5(new AnonymousClass3Jb(r2));
    }

    public final String getModuleName() {
        return Pxd.A00(15);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        RefreshableListView refreshableListView;
        String str;
        KeyEvent.Callback callback;
        String str2;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        0S7.A00(this);
        ListView listView = this.A04;
        EmptyStateView emptyStateView = null;
        if (listView instanceof RefreshableListView) {
            refreshableListView = (RefreshableListView) listView;
        } else {
            refreshableListView = null;
        }
        this.A0D = refreshableListView;
        if (refreshableListView != null) {
            refreshableListView.setIsLoading(true);
            refreshableListView.setOnScrollListener(this);
        }
        C17832Vgl vgl = this.A09;
        if (vgl == null) {
            str2 = "dataFetcher";
        } else {
            String str3 = this.A0F;
            if (str3 == null) {
                str2 = "adId";
            } else {
                if (this.A06 == null) {
                    str = this.A0G;
                } else {
                    str = null;
                }
                vgl.A00(str3, str, this.A0H);
                RefreshableListView refreshableListView2 = this.A0D;
                if (refreshableListView2 != null) {
                    callback = refreshableListView2.getEmptyView();
                } else {
                    callback = null;
                }
                if (callback instanceof EmptyStateView) {
                    emptyStateView = (EmptyStateView) callback;
                }
                this.A0C = emptyStateView;
                if (emptyStateView != null) {
                    emptyStateView.A0N(new WBD(0, (Object) this, (Object) emptyStateView), C320156rr.ERROR);
                    emptyStateView.A0L();
                }
                C238833Dp.A00(AnonymousClass7TE.A0l(this.A0N)).A05(view, C238863Ds.PBIA_PROFILE);
                return;
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final UserSession A01(C15383Ubh ubh) {
        return AnonymousClass7TE.A0l(ubh.A0N);
    }

    public static final void A02(C15383Ubh ubh) {
        2da r3;
        String A0G2;
        1Xj BPf;
        User A29;
        1Xl r0 = ubh.A06;
        if (r0 == null || (BPf = r0.BPf()) == null || (A29 = BPf.A29()) == null || ubh.A0H == null || !0qQ.A0K(A29.getId(), ubh.A0H)) {
            1Xl r2 = ubh.A06;
            if (r2 != null && (r3 = ubh.A05) != null) {
                A0G2 = C231122qu.A0G(AnonymousClass7TE.A0l(ubh.A0N), r2.BPf());
            } else {
                return;
            }
        } else {
            r3 = ubh.A05;
            if (r3 != null) {
                A0G2 = A29.getFullName();
            } else {
                return;
            }
        }
        r3.setTitle(A0G2);
    }

    public static final void A03(C15383Ubh ubh, int i) {
        1Xl r1;
        TextView A0d;
        ViewGroup viewGroup = ubh.A04;
        if (viewGroup != null && (r1 = ubh.A06) != null) {
            AnonymousClass0eM r4 = ubh.A0N;
            C324046yW.A00(AnonymousClass7TE.A0l(r4)).A02(r1.BPf().A2A(AnonymousClass7TE.A0l(r4)), i);
            if (viewGroup.findViewById(R.id.profile_tombstone) == null) {
                viewGroup.addView(ubh.A02);
                View view = ubh.A02;
                if (!(view == null || (A0d = AnonymousClass7TE.A0d(view, R.id.tombstone_feedback_text)) == null)) {
                    int i2 = 2131975457;
                    if (i == 1) {
                        i2 = 2131975458;
                    }
                    A0d.setText(i2);
                }
                AnonymousClass7TF.A16(ubh.A02);
                View view2 = ubh.A02;
                if (view2 != null) {
                    view2.bringToFront();
                }
                viewGroup.invalidate();
            }
        }
    }

    public final /* bridge */ /* synthetic */ 0lg A0Y() {
        return AnonymousClass7TE.A0l(this.A0N);
    }

    public C15383Ubh() {
        String A002 = Pxd.A00(15);
        this.A0P = C227942kP.A01(A002, true, false);
        this.A0M = C227942kP.A01(A002, true, true);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [X.07Z, X.0S7, androidx.fragment.app.Fragment, X.Ubh, X.32G] */
    /* JADX WARNING: type inference failed for: r0v27, types: [X.32y, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            r0 = -1109002706(0xffffffffbde5f62e, float:-0.11228596)
            int r4 = X.AnonymousClass0fD.A02(r0)
            r11 = r17
            r0 = r18
            X.C15383Ubh.super.onCreate(r0)
            android.os.Bundle r2 = r11.requireArguments()
            android.content.Context r1 = r11.requireContext()
            X.0gy r0 = X.AnonymousClass07i.A00(r11)
            r6 = 0
            X.2lw r3 = new X.2lw
            r3.<init>(r1, r0, r6)
            X.0eM r5 = r11.A0N
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r5)
            X.Vgl r0 = new X.Vgl
            r0.<init>(r3, r1, r11)
            r11.A09 = r0
            r0 = 2395(0x95b, float:3.356E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = X.C320236s2.A01(r2, r0)
            r11.A0F = r0
            java.lang.Class<com.instagram.sponsored.analytics.SourceModelInfoParams> r1 = com.instagram.sponsored.analytics.SourceModelInfoParams.class
            r0 = 2399(0x95f, float:3.362E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.os.Parcelable r1 = X.C320236s2.A00(r2, r1, r0)
            com.instagram.sponsored.analytics.SourceModelInfoParams r1 = (com.instagram.sponsored.analytics.SourceModelInfoParams) r1
            r11.A0L = r1
            java.lang.String r10 = "sourceModelInfoParams"
            if (r1 == 0) goto L_0x0093
            java.lang.String r0 = r1.A06
            r11.A0G = r0
            java.lang.String r0 = r1.A08
            r11.A0H = r0
            int r0 = r1.A02
            r11.A01 = r0
            int r0 = r1.A00
            r11.A00 = r0
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r5)
            r0 = 2396(0x95c, float:3.358E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r3 = r2.getString(r0)
            java.lang.String r1 = r11.A0G
            r2 = 0
            X.0qQ.A0B(r7, r2)
            r0 = 0
            if (r1 == 0) goto L_0x0078
            X.1Xl r0 = X.C324666zh.A00(r7, r3, r1)
        L_0x0078:
            r11.A06 = r0
            if (r0 != 0) goto L_0x00a7
            X.0wj r3 = X.0wj.A01
            r1 = 817903741(0x30c0387d, float:1.3985894E-9)
            java.lang.String r0 = "PBIAProxyProfileFragment#media is null from media cache"
            X.0f9 r8 = r3.AEf(r0, r1)
            java.lang.String r7 = "Media Id: "
            java.lang.String r3 = r11.A0G
            java.lang.String r1 = ", Ad Id: "
            java.lang.String r0 = r11.A0F
            if (r0 != 0) goto L_0x009b
            java.lang.String r10 = "adId"
        L_0x0093:
            X.0qQ.A0F(r10)
        L_0x0096:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x009b:
            java.lang.String r1 = X.002.A0u(r7, r3, r1, r0)
            java.lang.String r0 = "message"
            r8.ABQ(r0, r1)
            r8.report()
        L_0x00a7:
            X.1L1 r0 = X.1L2.A00()
            r11.A0E = r0
            com.instagram.common.session.UserSession r12 = X.AnonymousClass7TE.A0l(r5)
            X.4DU r13 = r11.A0P
            X.4DU r14 = r11.A0M
            com.instagram.sponsored.analytics.SourceModelInfoParams r15 = r11.A0L
            if (r15 == 0) goto L_0x0093
            X.3kK r0 = r11.A0E
            java.lang.String r9 = "sessionIdProvider"
            if (r0 == 0) goto L_0x0156
            X.WWr r10 = new X.WWr
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r11.A0B = r10
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r5)
            android.content.Context r0 = r11.requireContext()
            X.2kR r8 = new X.2kR
            r8.<init>(r0, r1, r13)
            androidx.fragment.app.FragmentActivity r3 = r11.requireActivity()
            X.WWr r1 = r11.A0B
            java.lang.String r10 = "delegate"
            if (r1 == 0) goto L_0x0093
            X.UdH r0 = new X.UdH
            r0.<init>(r3, r8, r1, r1)
            r11.A08 = r0
            r11.A0V(r0)
            int r0 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            android.content.Context r0 = r11.requireContext()
            X.2js r0 = X.C227752jr.A00(r0, r6, r2)
            X.UdH r7 = r11.A08
            java.lang.String r10 = "adapter"
            if (r7 == 0) goto L_0x0093
            X.2ku r6 = r11.A0O
            X.2xD r3 = new X.2xD
            r3.<init>(r11, r0, r6, r7)
            X.0hq r0 = r11.mFragmentManager
            X.32x r1 = new X.32x
            r1.<init>(r11, r0, r7, r8)
            X.3kK r0 = r11.A0E
            if (r0 == 0) goto L_0x0156
            r1.A0R = r0
            r1.A0C = r3
            X.32y r0 = new X.32y
            r0.<init>()
            r1.A0B = r0
            X.332 r0 = r1.A00()
            r11.A0K = r0
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r5)
            X.UdH r0 = r11.A08
            if (r0 == 0) goto L_0x0093
            X.36D r3 = new X.36D
            r3.<init>(r1, r0, r2, r2)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            X.2wt r2 = new X.2wt
            r2.<init>(r11, r0, r14)
            r3.A01()
            X.332 r0 = r11.A0K
            if (r0 == 0) goto L_0x013c
            r6.A01(r0)
        L_0x013c:
            X.2jd r1 = new X.2jd
            r1.<init>()
            X.332 r0 = r11.A0K
            r1.A0E(r0)
            r1.A0E(r3)
            r1.A0E(r2)
            r11.A0b(r1)
            r0 = -1629118300(0xffffffff9ee5a0a4, float:-2.4312758E-20)
            X.AnonymousClass0fD.A09(r0, r4)
            return
        L_0x0156:
            X.0qQ.A0F(r9)
            goto L_0x0096
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15383Ubh.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [android.view.ViewGroup] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r6, android.view.ViewGroup r7, android.os.Bundle r8) {
        /*
            r5 = this;
            r0 = 1431932206(0x55598d2e, float:1.49500241E13)
            int r3 = X.AnonymousClass0fD.A02(r0)
            r2 = 0
            X.0qQ.A0B(r6, r2)
            r0 = 2131626665(0x7f0e0aa9, float:1.8880573E38)
            android.view.View r1 = r6.inflate(r0, r7, r2)
            boolean r0 = r1 instanceof android.view.ViewGroup
            r4 = 0
            if (r0 == 0) goto L_0x006c
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L_0x006c
            r5.A03 = r1
            r0 = 2131435238(0x7f0b1ee6, float:1.8492313E38)
            android.view.View r1 = r1.findViewById(r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r5.A04 = r1
            r0 = 2131627109(0x7f0e0c65, float:1.8881473E38)
            android.view.View r1 = r6.inflate(r0, r1, r2)
            r5.A02 = r1
            if (r1 == 0) goto L_0x003a
            r0 = 2131442968(0x7f0b3d18, float:1.850799E38)
            android.widget.TextView r4 = X.AnonymousClass7TE.A0d(r1, r0)
        L_0x003a:
            r2 = 1
            if (r4 == 0) goto L_0x0046
            android.text.TextPaint r0 = r4.getPaint()
            if (r0 == 0) goto L_0x0046
            r0.setFakeBoldText(r2)
        L_0x0046:
            android.view.View r1 = r5.A02
            if (r1 == 0) goto L_0x005c
            r0 = 2131442960(0x7f0b3d10, float:1.8507975E38)
            android.widget.TextView r0 = X.AnonymousClass7TE.A0d(r1, r0)
            if (r0 == 0) goto L_0x005c
            android.text.TextPaint r0 = r0.getPaint()
            if (r0 == 0) goto L_0x005c
            r0.setFakeBoldText(r2)
        L_0x005c:
            if (r4 == 0) goto L_0x0063
            r0 = 56
            X.WBA.A00(r4, r0, r5)
        L_0x0063:
            android.view.ViewGroup r4 = r5.A03
            r0 = -2031277506(0xffffffff86ed2a3e, float:-8.921156E-35)
        L_0x0068:
            X.AnonymousClass0fD.A09(r0, r3)
            return r4
        L_0x006c:
            r0 = 302533539(0x12084ba3, float:4.3007263E-28)
            goto L_0x0068
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15383Ubh.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1390205026);
        super.onDestroy();
        C228172ku r0 = this.A0O;
        r0.A00.remove(this.A0K);
        this.A0K = null;
        this.A07 = null;
        AnonymousClass0fD.A09(-240367692, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1339973487);
        super.onDestroyView();
        this.A03 = null;
        this.A04 = null;
        this.A02 = null;
        this.A0D = null;
        this.A0C = null;
        AnonymousClass0fD.A09(1758039539, A022);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A032 = AnonymousClass0fD.A03(-238428632);
        0qQ.A0B(absListView, 0);
        C15466UdH udH = this.A08;
        if (udH != null) {
            if (udH.A02) {
                if (W11.A01()) {
                    AnonymousClass7TF.A0D().postDelayed(new C20051WkB(this), 0);
                } else if (W11.A02(absListView)) {
                    C15466UdH udH2 = this.A08;
                    if (udH2 != null) {
                        udH2.A02 = false;
                    }
                }
                AnonymousClass0fD.A0A(1566644051, A032);
                return;
            }
            this.A0O.onScroll(absListView, i, i2, i3);
            AnonymousClass0fD.A0A(1566644051, A032);
            return;
        }
        0qQ.A0F("adapter");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A0D2 = AnonymousClass7TG.A0D(absListView, -367900843);
        C15466UdH udH = this.A08;
        if (udH == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        }
        if (!udH.A02) {
            this.A0O.onScrollStateChanged(absListView, i);
        }
        AnonymousClass0fD.A0A(1717719102, A0D2);
    }
}
