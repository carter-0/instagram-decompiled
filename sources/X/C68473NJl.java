package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.NJl  reason: case insensitive filesystem */
public final class C68473NJl extends AnonymousClass4DH implements JPL, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "ThreadDetailsChannelControlsFragment";
    public NL7 A00;
    public N4P A01;
    public C331157Pu A02;
    public C254793t3 A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public C74449Pv4 A0B;
    public final O79 A0C = new O79(this);
    public final O7A A0D = new O7A(this);
    public final O7C A0E = new O7C(this);
    public final O7D A0F = new O7D(this);
    public final AnonymousClass0eM A0G = C73902Pld.A00(this, 33);
    public final AnonymousClass0eM A0H = C73902Pld.A00(this, 34);
    public final AnonymousClass0eM A0I = C227642jf.A02(this);
    public final AnonymousClass0eM A0J = DbS.A0I(new C73902Pld(this, 35), new C73902Pld(this, 36), new C73665Phe(34, this, (Object) null), DbS.A0z(C60189Jh8.class));
    public final 1a8 A0K = new 1a8((C269794fh) null);

    public final void AHB() {
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = new NL7(requireContext(), AnonymousClass7TE.A0l(this.A0I));
        RecyclerView A0c = JTR.A0c(view, R.id.recycler_view);
        NL7 nl7 = this.A00;
        if (nl7 == null) {
            str = "adapter";
        } else {
            A0c.setAdapter(nl7);
            DbU.A15(getContext(), A0c, 1, false);
            1a8 r2 = this.A0K;
            C74449Pv4 pv4 = this.A0B;
            str = "clientInfra";
            if (pv4 != null) {
                PU8.A00(pv4.BNa().APA().A0P(C318146oT.A01), r2, this, 29);
                C74449Pv4 pv42 = this.A0B;
                if (pv42 != null) {
                    C74550Pwj.A00(pv42);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A00(C68473NJl nJl) {
        List list;
        String str;
        int i;
        C254793t3 r0;
        C242243Te r02;
        N4P n4p = nJl.A01;
        if (n4p == null || (r02 = n4p.A0E) == null || (list = r02.A09) == null) {
            list = 0sn.A00;
        }
        AnonymousClass0eM r3 = nJl.A0I;
        UserSession A0l = AnonymousClass7TE.A0l(r3);
        int height = DbV.A0G(nJl).getDecorView().getHeight();
        N4P n4p2 = nJl.A01;
        String str2 = null;
        if (n4p2 == null || (r0 = n4p2.A0L) == null) {
            str = null;
        } else {
            str = C66580MXl.A0x(r0);
        }
        N4P n4p3 = nJl.A01;
        if (n4p3 != null) {
            str2 = n4p3.A0Q;
            i = n4p3.A06();
        } else {
            i = 0;
        }
        O7B o7b = new O7B(nJl);
        0qQ.A0B(A0l, 0);
        NKM A002 = C70139Nxt.A00(A0l, str, str2, list, height, 0, 29, i, true, true);
        A002.A01 = new C72629PDi(o7b, 0);
        C331127Pr A0e = DbX.A0e(AnonymousClass7TF.A0L(r3, 0), true);
        A0e.A03 = 1.0f;
        A0e.A0T = new C72944PQc(A002, 0);
        C331157Pu A003 = A0e.A00();
        nJl.A02 = A003;
        DbU.A1I(nJl, A002, A003);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0I);
    }

    public final void Cfo() {
        FragmentActivity requireActivity = requireActivity();
        if (!C69959Nuz.A00(requireActivity)) {
            requireActivity.finish();
        }
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.Eom(2131958954);
    }

    public final void onCreate(Bundle bundle) {
        IllegalArgumentException illegalArgumentException;
        int i;
        String str;
        int A022 = AnonymousClass0fD.A02(501436971);
        C68473NJl.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        C254793t3 A002 = OXL.A00(requireArguments, "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID");
        if (A002 != null) {
            this.A03 = A002;
            String string = requireArguments.getString("channel_control_entrypoint");
            if (string != null) {
                this.A04 = string;
                Context requireContext = requireContext();
                AnonymousClass0eM r0 = this.A0I;
                UserSession A0l = AnonymousClass7TE.A0l(r0);
                C254793t3 r2 = this.A03;
                if (r2 == null) {
                    str = "threadId";
                } else {
                    r0.getValue();
                    C376169Gw r1 = C376169Gw.A00;
                    0sn r02 = 0sn.A00;
                    C74449Pv4 A012 = C330397Mp.A01(requireContext, A0l, r1.createWithAdditionalCapabilities(r02, r02), r2);
                    this.A0B = A012;
                    if (A012 == null) {
                        str = "clientInfra";
                    } else {
                        C74550Pwj.A01(A012);
                        AnonymousClass0fD.A09(1330912653, A022);
                        return;
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            illegalArgumentException = AnonymousClass7TE.A0w("entryPoint can't be null");
            i = 1770694787;
        } else {
            illegalArgumentException = C66580MXl.A0p();
            i = 963520620;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalArgumentException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(926983391);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.direct_thread_details_channel_controls_fragment, viewGroup, false);
        AnonymousClass0fD.A09(697478902, A022);
        return inflate;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0120, code lost:
        if (X.0qQ.A0K(r1, r0) == false) goto L_0x0122;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDestroyView() {
        /*
            r20 = this;
            r0 = 252112611(0xf06eee3, float:6.652718E-30)
            int r4 = X.AnonymousClass0fD.A02(r0)
            r5 = r20
            super.onDestroyView()
            X.1a8 r0 = r5.A0K
            r0.A01()
            boolean r1 = r5.A05
            boolean r0 = r5.A08
            if (r1 == r0) goto L_0x0095
            X.N4P r2 = r5.A01
            if (r2 == 0) goto L_0x0095
            X.0eM r7 = r5.A0I
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r7)
            X.3t3 r3 = r2.A0L
            X.3t0 r0 = X.C300965yF.A01(r3)
            com.instagram.model.direct.DirectThreadKey r1 = X.C327647Bq.A00(r0)
            boolean r0 = r5.A05
            X.C66671Mae.A0F(r6, r1, r0)
            r0 = 0
            X.0qQ.A0B(r3, r0)
            boolean r0 = r3 instanceof X.C254763t0
            if (r0 == 0) goto L_0x0047
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r7)
            X.4kA r1 = X.AnonymousClass4k9.A00(r0)
            java.lang.String r0 = X.C66580MXl.A0x(r3)
            r1.A05(r0)
        L_0x0047:
            X.0eM r0 = r5.A0H
            X.6gx r8 = X.DbZ.A0R(r0)
            boolean r7 = r5.A05
            int r6 = r2.A06()
            X.3t3 r0 = r5.A03
            if (r0 != 0) goto L_0x0061
            java.lang.String r0 = "threadId"
        L_0x0059:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0061:
            java.lang.String r3 = X.C300965yF.A07(r0)
            java.lang.String r2 = r2.A0Q
            X.1Ln r1 = X.DbT.A0J(r8)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x0095
            X.DbW.A17(r1, r8)
            if (r7 == 0) goto L_0x0150
            r0 = 625(0x271, float:8.76E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
        L_0x007c:
            r1.A0l(r0)
            java.lang.String r0 = "toggle"
            r1.A0k(r0)
            java.lang.String r0 = "comments_toggle"
            r1.A0p(r0)
            java.lang.String r0 = "thread_channel_controls"
            java.lang.Long r0 = X.DbZ.A0b(r1, r0, r3, r2, r6)
            r1.A0i(r0)
            r1.Cgf()
        L_0x0095:
            boolean r1 = r5.A06
            boolean r0 = r5.A09
            if (r1 == r0) goto L_0x00e8
            X.N4P r1 = r5.A01
            if (r1 == 0) goto L_0x00d8
            X.0eM r0 = r5.A0H
            X.6gx r8 = X.DbZ.A0R(r0)
            int r7 = r1.A06()
            boolean r6 = r5.A06
            java.lang.String r3 = X.N4P.A03(r1)
            java.lang.String r2 = r1.A0Q
            X.1Ln r1 = X.DbT.A0J(r8)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x00d8
            X.DbW.A17(r1, r8)
            if (r6 == 0) goto L_0x014c
            java.lang.String r0 = "auto_translation_enabled"
        L_0x00c2:
            r1.A0l(r0)
            java.lang.String r0 = "toggle"
            r1.A0k(r0)
            java.lang.String r0 = "channel_translation_toggle"
            r1.A0p(r0)
            java.lang.String r0 = "thread_channel_controls"
            java.lang.Long r0 = X.DbZ.A0b(r1, r0, r3, r2, r7)
            X.C66582MXn.A1C(r1, r8, r0)
        L_0x00d8:
            X.0eM r0 = r5.A0I
            X.1Ng r2 = X.DbX.A0R(r0)
            boolean r1 = r5.A06
            X.Osj r0 = new X.Osj
            r0.<init>(r1)
            r2.A00(r0)
        L_0x00e8:
            X.N4P r0 = r5.A01
            r9 = 0
            if (r0 == 0) goto L_0x014a
            X.3Te r0 = r0.A0E
            if (r0 == 0) goto L_0x014a
            java.util.List r0 = r0.A0G
            if (r0 == 0) goto L_0x014a
            java.lang.Object r8 = X.00k.A0J(r0)
            X.JwB r8 = (X.C61073JwB) r8
        L_0x00fb:
            X.0eM r7 = r5.A0J
            java.lang.Object r0 = r7.getValue()
            X.Jh8 r0 = (X.C60189Jh8) r0
            X.05G r0 = r0.A04
            java.lang.Object r3 = r0.getValue()
            com.instagram.direct.model.channels.BroadcastChannelXpostingChannelInfo r3 = (com.instagram.direct.model.channels.BroadcastChannelXpostingChannelInfo) r3
            boolean r1 = r5.A07
            boolean r0 = r5.A0A
            r6 = 1
            boolean r2 = X.JTQ.A1O(r1, r0)
            if (r3 == 0) goto L_0x0148
            java.lang.String r1 = r3.A02
            if (r8 == 0) goto L_0x0146
            java.lang.String r0 = r8.A02
        L_0x011c:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0148
        L_0x0122:
            if (r2 != 0) goto L_0x0126
            if (r6 == 0) goto L_0x01bc
        L_0x0126:
            boolean r0 = r5.A07
            if (r0 == 0) goto L_0x0158
            X.N4P r0 = r5.A01
            if (r0 == 0) goto L_0x0132
            X.3sy r9 = r0.A08()
        L_0x0132:
            com.instagram.model.direct.DirectThreadKey r9 = X.C66647MaG.A04(r9)
            if (r9 == 0) goto L_0x01bc
            java.lang.Object r2 = r7.getValue()
            X.Jh8 r2 = (X.C60189Jh8) r2
            java.lang.String r1 = r5.A04
            if (r1 != 0) goto L_0x0185
            java.lang.String r0 = "entryPoint"
            goto L_0x0059
        L_0x0146:
            r0 = r9
            goto L_0x011c
        L_0x0148:
            r6 = 0
            goto L_0x0122
        L_0x014a:
            r8 = r9
            goto L_0x00fb
        L_0x014c:
            java.lang.String r0 = "auto_translation_disabled"
            goto L_0x00c2
        L_0x0150:
            r0 = 141(0x8d, float:1.98E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x007c
        L_0x0158:
            if (r2 == 0) goto L_0x01bc
            X.N4P r0 = r5.A01
            if (r0 == 0) goto L_0x0162
            X.3sy r9 = r0.A08()
        L_0x0162:
            com.instagram.model.direct.DirectThreadKey r6 = X.C66647MaG.A04(r9)
            if (r6 == 0) goto L_0x01bc
            java.lang.Object r0 = r7.getValue()
            X.Jh8 r0 = (X.C60189Jh8) r0
            com.instagram.direct.fragment.channels.xposting.ChannelXpostingRepository r5 = r0.A03
            java.lang.String r0 = r6.A00
            if (r0 == 0) goto L_0x01bc
            X.4Cq r3 = r5.A01
            X.12T r0 = X.AnonymousClass12T.A00
            r1 = 0
            X.0nV r2 = X.DbX.A0c(r0)
            r0 = 9
            X.Pfp r7 = new X.Pfp
            r7.<init>(r6, r5, r1, r0)
            goto L_0x01b9
        L_0x0185:
            java.lang.String r0 = "xposting_nux"
            boolean r13 = r1.equals(r0)
            com.instagram.direct.fragment.channels.xposting.ChannelXpostingRepository r10 = r2.A03
            if (r3 == 0) goto L_0x01bc
            java.lang.String r0 = r9.A00
            if (r0 == 0) goto L_0x01bc
            java.lang.String r2 = r3.A02
            java.lang.String r1 = r3.A03
            java.lang.String r0 = r3.A01
            com.instagram.common.typedurl.ImageUrl r15 = r3.A00
            r19 = 11
            X.JwB r8 = new X.JwB
            r14 = r8
            r16 = r0
            r17 = r1
            r18 = r2
            r14.<init>((java.lang.Object) r15, (java.lang.String) r16, (java.lang.String) r17, (java.lang.String) r18, (int) r19)
            X.4Cq r3 = r10.A01
            X.12T r0 = X.AnonymousClass12T.A00
            r11 = 0
            X.0nV r2 = X.DbX.A0c(r0)
            r12 = 8
            X.JTf r7 = new X.JTf
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x01b9:
            X.1Eo.A05(r2, r7, r3)
        L_0x01bc:
            r0 = 709300421(0x2a4710c5, float:1.7680569E-13)
            X.AnonymousClass0fD.A09(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68473NJl.onDestroyView():void");
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1508299255);
        super.onResume();
        View decorView = DbV.A0G(this).getDecorView();
        0qQ.A07(decorView);
        decorView.getViewTreeObserver().addOnGlobalLayoutListener(new C71448Okn(1, decorView, this));
        AnonymousClass0fD.A09(-2065708334, A022);
    }
}
