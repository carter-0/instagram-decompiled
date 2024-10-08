package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;

public final class NJO extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "ThreadDetailsDisappearingMessagesFragment";
    public ODT A00;
    public N4P A01;
    public RecyclerView A02;
    public Capabilities A03;
    public C74449Pv4 A04;
    public C254793t3 A05;
    public C68504NKx A06;
    public final AnonymousClass0eM A07 = C227642jf.A02(this);
    public final 1a8 A08 = C66580MXl.A0O();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: X.3Tu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: java.lang.Integer} */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: type inference failed for: r8v12 */
    /* JADX WARNING: type inference failed for: r8v13 */
    /* JADX WARNING: type inference failed for: r8v14 */
    /* JADX WARNING: type inference failed for: r8v15 */
    /* JADX WARNING: type inference failed for: r8v16 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0096, code lost:
        if (X.C329737Ka.A02(r14, r9.A0D, r7, true, r11, r10, r20, r21).COX(X.AnonymousClass7TE.A0l(r6), r9) != true) goto L_0x0098;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.N4P r25) {
        /*
            r24 = this;
            r5 = 0
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r2 = r25
            X.3Tu r4 = r2.A0D
            r1 = r24
            X.0eM r6 = r1.A07
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r6)
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r6)
            boolean r3 = X.C308556Us.A0V(r2)
            boolean r3 = X.C308556Us.A0L(r7, r4, r3)
            boolean r13 = X.C308556Us.A0L(r8, r4, r3)
            if (r13 == 0) goto L_0x0040
            android.content.Context r7 = r1.requireContext()
            r9 = 2131960963(0x7f132483, float:1.955861E38)
            r8 = 2131964897(0x7f1333e1, float:1.9566589E38)
            r3 = 2131963729(0x7f132f51, float:1.956422E38)
            java.lang.String r7 = X.AnonymousClass7TE.A16(r7, r3)
            X.N3x r3 = new X.N3x
            r3.<init>(r9, r8, r7)
            java.util.List r3 = X.AnonymousClass7TE.A1I(r3)
            r0.addAll(r3)
        L_0x0040:
            X.N4P r9 = r1.A01
            r8 = 1
            if (r9 == 0) goto L_0x0098
            com.instagram.common.session.UserSession r14 = X.DbW.A0S(r6, r5)
            boolean r7 = r9.A0C()
            boolean r11 = X.N4P.A05(r9)
            X.0eM r3 = r9.A0a
            java.util.List r3 = X.JTO.A15(r3)
            boolean r21 = X.C66640Ma9.A06(r3, r7, r11)
            boolean r10 = r9.A0n
            int r7 = r9.A09
            r3 = 1012(0x3f4, float:1.418E-42)
            boolean r20 = X.AnonymousClass7TF.A1S(r7, r3)
            X.0eM r3 = r9.A0c
            java.util.List r3 = X.JTO.A15(r3)
            java.util.ArrayList r7 = X.AnonymousClass7TG.A0r(r3)
            java.util.Iterator r12 = r3.iterator()
        L_0x0073:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L_0x007d
            X.C68303N9q.A00(r7, r12)
            goto L_0x0073
        L_0x007d:
            X.3Tu r3 = r9.A0D
            r15 = r3
            r16 = r7
            r17 = r8
            r18 = r11
            r19 = r10
            X.7Kc r7 = X.C329737Ka.A02(r14, r15, r16, r17, r18, r19, r20, r21)
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r6)
            boolean r3 = r7.COX(r3, r9)
            r22 = 1
            if (r3 == r8) goto L_0x009a
        L_0x0098:
            r22 = 0
        L_0x009a:
            com.instagram.common.session.UserSession r16 = X.AnonymousClass7TE.A0l(r6)
            android.content.Context r15 = r1.requireContext()
            X.3t3 r3 = r2.A0L
            java.lang.String r21 = X.C66580MXl.A0x(r3)
            X.4li r9 = r2.A0H
            X.ODT r11 = r1.A00
            java.lang.Integer r7 = r9.A00
            if (r7 != 0) goto L_0x00b2
            java.lang.Integer r7 = r9.A02
        L_0x00b2:
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r6)
            X.N4P r3 = r1.A01
            r8 = 0
            if (r3 == 0) goto L_0x0213
            X.3Tu r3 = r3.A0D
        L_0x00bd:
            boolean r3 = X.C308556Us.A0E(r10, r3)
            r10 = -1
            if (r11 == 0) goto L_0x01ce
            int r10 = r11.A00
            int r3 = r11.A01
        L_0x00c8:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
        L_0x00cc:
            X.ODT r3 = r1.A00
            if (r3 == 0) goto L_0x01ca
            boolean r3 = r3.A02
        L_0x00d2:
            X.ODT r7 = new X.ODT
            r7.<init>(r8, r10, r3)
            boolean r23 = X.C308556Us.A0V(r2)
            X.P0m r3 = new X.P0m
            r3.<init>(r1, r2)
            X.ONj r14 = new X.ONj
            r17 = r3
            r18 = r7
            r19 = r4
            r20 = r9
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r6)
            X.N4P r3 = r1.A01
            if (r3 == 0) goto L_0x01c7
            X.3Tu r3 = r3.A0D
        L_0x00f7:
            boolean r7 = X.C308556Us.A0E(r7, r3)
            r3 = 2131960971(0x7f13248b, float:1.9558626E38)
            if (r7 == 0) goto L_0x01aa
            r4 = 2131960965(0x7f132485, float:1.9558614E38)
            if (r22 == 0) goto L_0x010b
            r3 = 2131960948(0x7f132474, float:1.955858E38)
            r4 = 2131960964(0x7f132484, float:1.9558612E38)
        L_0x010b:
            r14.A00(r3)
            r14.A02(r5, r5)
            android.content.Context r3 = r1.getContext()
            if (r3 == 0) goto L_0x011a
            r14.A01(r3, r4)
        L_0x011a:
            X.0lg r8 = X.DbT.A0X(r6)
            X.0Tu r7 = X.0Tu.A05
            r3 = 36320317926547734(0x81092300242116, double:3.0324535347056654E-306)
            boolean r3 = X.182.A06(r7, r8, r3)
            if (r3 == 0) goto L_0x0177
            java.lang.String r3 = "[FB-ONLY] Custom Duration"
            X.DfA r8 = new X.DfA
            r8.<init>((java.lang.CharSequence) r3)
            java.lang.String r3 = "Use this to see and set the current DM duration. Can be set to an arbitrary number in Seconds. Press apply to update the setting."
            X.FGF r7 = new X.FGF
            r7.<init>((java.lang.CharSequence) r3)
            X.4li r3 = r14.A07
            if (r3 == 0) goto L_0x01a8
            java.lang.Integer r3 = r3.A02
        L_0x013f:
            java.lang.String r20 = java.lang.String.valueOf(r3)
            X.PR6 r3 = new X.PR6
            r3.<init>(r14)
            X.OlV r16 = X.C71480OlV.A00
            java.lang.Integer r18 = X.C66580MXl.A0q()
            java.lang.String r19 = "enter a value in seconds"
            X.OhI r15 = new X.OhI
            r21 = r5
            r17 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21)
            android.content.Context r9 = r14.A01
            r3 = 49
            X.Ok2 r5 = new X.Ok2
            r5.<init>(r14, r3)
            java.lang.String r3 = "Apply"
            X.MlS r4 = new X.MlS
            r4.<init>((android.content.Context) r9, (android.view.View.OnClickListener) r5, (java.lang.String) r3)
            java.util.List r3 = r14.A09
            r3.add(r8)
            r3.add(r7)
            r3.add(r15)
            r3.add(r4)
        L_0x0177:
            java.util.List r3 = r14.A09
            java.util.List r3 = X.00k.A0a(r3)
            r0.addAll(r3)
            if (r13 == 0) goto L_0x01a0
            r3 = 2131959014(0x7f131ce6, float:1.9554656E38)
            X.C46448DfA.A02(r0, r3)
            android.content.Context r7 = r1.requireContext()
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r6)
            androidx.fragment.app.FragmentActivity r4 = r1.requireActivity()
            X.P2U r3 = new X.P2U
            r3.<init>(r7, r4, r5, r2)
            java.util.List r2 = r3.getItems()
            r0.addAll(r2)
        L_0x01a0:
            X.NKx r1 = r1.A06
            if (r1 == 0) goto L_0x01a7
            r1.setItems(r0)
        L_0x01a7:
            return
        L_0x01a8:
            r3 = 0
            goto L_0x013f
        L_0x01aa:
            r14.A00(r3)
            android.content.Context r5 = r1.getContext()
            if (r5 == 0) goto L_0x0177
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r6)
            boolean r4 = X.C308556Us.A0F(r3, r4)
            r3 = 2131960967(0x7f132487, float:1.9558618E38)
            if (r4 == 0) goto L_0x01c3
            r3 = 2131960968(0x7f132488, float:1.955862E38)
        L_0x01c3:
            r14.A01(r5, r3)
            goto L_0x0177
        L_0x01c7:
            r3 = 0
            goto L_0x00f7
        L_0x01ca:
            boolean r3 = r9.A08
            goto L_0x00d2
        L_0x01ce:
            if (r3 != 0) goto L_0x01d6
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            goto L_0x00cc
        L_0x01d6:
            if (r22 != 0) goto L_0x01f2
            if (r7 == 0) goto L_0x01e0
            int r10 = r7.intValue()
            goto L_0x00cc
        L_0x01e0:
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r6)
            X.N4P r3 = r1.A01
            if (r3 == 0) goto L_0x01f0
            X.3Tu r3 = r3.A0D
        L_0x01ea:
            int r10 = X.C308556Us.A00(r7, r3)
            goto L_0x00cc
        L_0x01f0:
            r3 = r8
            goto L_0x01ea
        L_0x01f2:
            if (r7 == 0) goto L_0x0200
            int r10 = r7.intValue()
            java.lang.Integer r8 = r9.A01
            if (r8 != 0) goto L_0x00cc
            java.lang.Integer r8 = r9.A03
            goto L_0x00cc
        L_0x0200:
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r6)
            X.N4P r3 = r1.A01
            if (r3 == 0) goto L_0x020a
            X.3Tu r8 = r3.A0D
        L_0x020a:
            int r10 = X.C308556Us.A00(r7, r8)
            r3 = 86400(0x15180, float:1.21072E-40)
            goto L_0x00c8
        L_0x0213:
            r3 = r8
            goto L_0x00bd
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NJO.A00(X.N4P):void");
    }

    public final String getModuleName() {
        return "thread_details_disappearing_messages";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = DbZ.A0F(view, R.id.recycler_view);
        C68504NKx nKx = new C68504NKx(requireContext(), (0lg) null, (AnonymousClass0iw) null);
        this.A06 = nKx;
        RecyclerView recyclerView = this.A02;
        if (recyclerView != null) {
            recyclerView.setAdapter(nKx);
        }
        RecyclerView recyclerView2 = this.A02;
        if (recyclerView2 != null) {
            DbU.A15(requireContext(), recyclerView2, 1, false);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
        if (r1 == r6.intValue()) goto L_0x0056;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onBackPressed() {
        /*
            r11 = this;
            X.N4P r4 = r11.A01
            r9 = 0
            if (r4 == 0) goto L_0x0056
            X.4li r2 = r4.A0H
            java.lang.Integer r0 = r2.A00
            if (r0 == 0) goto L_0x0059
            X.0eM r0 = r11.A07
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.N4P r0 = r11.A01
            if (r0 == 0) goto L_0x0057
            X.3Tu r0 = r0.A0D
        L_0x0017:
            boolean r0 = X.C308556Us.A0E(r1, r0)
            if (r0 == 0) goto L_0x0059
            java.lang.Integer r0 = r2.A00
            java.lang.Integer r6 = r2.A01
        L_0x0021:
            X.ODT r5 = r11.A00
            r8 = 1
            if (r5 == 0) goto L_0x0056
            boolean r3 = r5.A02
            boolean r2 = r2.A08
            if (r3 != r2) goto L_0x0040
            int r1 = r5.A00
            if (r0 == 0) goto L_0x0040
            int r0 = r0.intValue()
            if (r1 != r0) goto L_0x0040
            int r1 = r5.A01
            if (r6 == 0) goto L_0x0040
            int r0 = r6.intValue()
            if (r1 == r0) goto L_0x0056
        L_0x0040:
            if (r3 != 0) goto L_0x005e
            if (r2 == 0) goto L_0x0056
            X.0eM r0 = r11.A07
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r0)
            X.3t3 r0 = r4.A0L
            java.lang.String r7 = X.C66580MXl.A0x(r0)
            X.3Tu r6 = r4.A0D
            r10 = r9
            X.C66671Mae.A08(r5, r6, r7, r8, r9, r10)
        L_0x0056:
            return r9
        L_0x0057:
            r0 = 0
            goto L_0x0017
        L_0x0059:
            java.lang.Integer r0 = r2.A02
            java.lang.Integer r6 = r2.A03
            goto L_0x0021
        L_0x005e:
            X.0eM r0 = r11.A07
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            X.3t3 r0 = r4.A0L
            java.lang.String r2 = X.C66580MXl.A0x(r0)
            int r1 = r5.A00
            int r0 = r5.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.C66671Mae.A0H(r3, r0, r2, r8, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NJO.onBackPressed():boolean");
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.Eom(2131960971);
    }

    public final void onCreate(Bundle bundle) {
        IllegalArgumentException illegalArgumentException;
        int i;
        String str;
        int A022 = AnonymousClass0fD.A02(-416406377);
        NJO.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Context requireContext = requireContext();
        C254793t3 A002 = OXL.A00(requireArguments, "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID");
        if (A002 != null) {
            this.A05 = A002;
            Capabilities capabilities = (Capabilities) requireArguments.getParcelable("DirectFragment.DIRECT_FRAGMENT_THREAD_CAPABILITIES");
            if (capabilities != null) {
                this.A03 = capabilities;
                UserSession A0l = AnonymousClass7TE.A0l(this.A07);
                C254793t3 r1 = this.A05;
                if (r1 == null) {
                    str = "threadId";
                } else {
                    Capabilities capabilities2 = this.A03;
                    if (capabilities2 == null) {
                        str = "threadCapabilities";
                    } else {
                        C74449Pv4 A012 = C330397Mp.A01(requireContext, A0l, capabilities2, r1);
                        this.A04 = A012;
                        if (A012 == null) {
                            str = "clientInfra";
                        } else {
                            C74550Pwj.A01(A012);
                            AnonymousClass0fD.A09(-1266949552, A022);
                            return;
                        }
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            illegalArgumentException = AnonymousClass7TE.A0w("threadCapabilities can't be null");
            i = -2001483127;
        } else {
            illegalArgumentException = C66580MXl.A0p();
            i = -1720961318;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalArgumentException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-657599873);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.direct_thread_details_disappearing_messages_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-1995792244, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1266309351);
        super.onDestroyView();
        this.A02 = null;
        this.A06 = null;
        AnonymousClass0fD.A09(-423070678, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(715033093);
        NJO.super.onPause();
        C74449Pv4 pv4 = this.A04;
        if (pv4 == null) {
            0qQ.A0F("clientInfra");
            throw AnonymousClass00P.createAndThrow();
        }
        pv4.BNa().stop();
        this.A08.A01();
        AnonymousClass0fD.A09(-1672591677, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1730009825);
        super.onResume();
        1a8 r3 = this.A08;
        C74449Pv4 pv4 = this.A04;
        if (pv4 != null) {
            PU8.A00(pv4.BNa().APA(), r3, this, 1);
            C74449Pv4 pv42 = this.A04;
            if (pv42 != null) {
                C74550Pwj.A01(pv42);
                C74449Pv4 pv43 = this.A04;
                if (pv43 != null) {
                    C74550Pwj.A00(pv43);
                    AnonymousClass0fD.A09(1745858059, A022);
                    return;
                }
            }
        }
        0qQ.A0F("clientInfra");
        throw AnonymousClass00P.createAndThrow();
    }
}
