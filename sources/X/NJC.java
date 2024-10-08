package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

public final class NJC extends AnonymousClass4DH implements AnonymousClass0j6, C74393Pu9 {
    public static final String __redex_internal_original_name = "DirectPollMessageVotingFragment";
    public View A00;
    public View A01;
    public View A02;
    public O75 A03;
    public C71067Oam A04;
    public O76 A05;
    public AnonymousClass2Ep A06;
    public PCP A07;
    public IgdsBottomButtonLayout A08;
    public boolean A09;
    public boolean A0A;
    public LinearLayoutManager A0B;
    public final 1a8 A0C = C66581MXm.A0P();
    public final AnonymousClass0eM A0D = C227642jf.A02(this);

    public final void onViewCreated(View view, Bundle bundle) {
        Long A10;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C71401Ok0.A01(AnonymousClass7TF.A0G(view, R.id.poll_message_cancel), 69, this);
        RecyclerView A0c = JTR.A0c(view, R.id.poll_message_details_recycler_view);
        C71067Oam oam = this.A04;
        String str = "controller";
        if (oam != null) {
            AnonymousClass2t9 r0 = oam.A05.A00;
            if (r0 != null) {
                A0c.setAdapter(r0);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext(), 1, false);
                this.A0B = linearLayoutManager;
                A0c.setLayoutManager(linearLayoutManager);
                IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AnonymousClass7TF.A0F(view, R.id.poll_message_submit_button);
                igdsBottomButtonLayout.setPrimaryButtonEnabled(false);
                igdsBottomButtonLayout.setPrimaryActionOnClickListener(C71401Ok0.A00(this, 70));
                this.A08 = igdsBottomButtonLayout;
                this.A00 = view.requireViewById(R.id.poll_message_progress_bar);
                this.A01 = view.requireViewById(R.id.poll_message_details_content);
                this.A02 = view.requireViewById(R.id.poll_message_spacing_view);
                C71067Oam oam2 = this.A04;
                if (oam2 != null) {
                    oam2.A02 = this;
                    if (this.A0A) {
                        Object value = this.A0D.getValue();
                        C71067Oam oam3 = this.A04;
                        if (oam3 != null) {
                            C254743sy r3 = oam3.A07;
                            0qQ.A0B(value, 0);
                            AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C73902Pld(value, 23));
                            String A0B2 = C66647MaG.A0B(r3);
                            if (A0B2 != null && (A10 = AnonymousClass7TE.A10(A0B2)) != null) {
                                MsysThreadId A0j = C66580MXl.A0j((Long) null, A10.longValue());
                                PU9.A00(C72120Owf.A01(C66581MXm.A0b(A002).A09, A0j, 51).A0L(C72090Ow3.A00), oam2.A04, value, oam2, 6);
                                return;
                            }
                            return;
                        }
                    } else {
                        0lg A0L = AnonymousClass7TF.A0L(this.A0D, 0);
                        String str2 = oam2.A0A;
                        1NY A0b = AnonymousClass7TG.A0b(A0L);
                        A0b.A0A(0mp.A06("direct_v2/group_poll/%s/", new Object[]{str2}));
                        A0b.A0R(NHM.class, C70877OPr.class);
                        A0b.A0R = true;
                        1OC A0M = A0b.A0M();
                        NMI.A00(A0M, oam2, 14);
                        oam2.A01 = A0M;
                        schedule(A0M);
                        return;
                    }
                }
            } else {
                str = "igRecyclerViewAdapter";
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r3 != 61) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.0jB E4x() {
        /*
            r6 = this;
            X.0jB r5 = new X.0jB
            r5.<init>()
            X.2Ep r4 = r6.A06
            if (r4 == 0) goto L_0x001c
            int r3 = r4.C6a()
            r0 = 28
            r2 = 1
            java.lang.String r1 = "thread_id"
            if (r3 == r0) goto L_0x0033
            r0 = 29
            if (r3 == r0) goto L_0x001d
            r0 = 61
            if (r3 == r0) goto L_0x0033
        L_0x001c:
            return r5
        L_0x001d:
            java.lang.String r0 = r4.C6C()
            r5.A0A(r1, r0)
            java.lang.String r0 = "is_broadcast_chat"
            r5.A09(r0, r2)
            int r1 = r4.AdN()
            java.lang.String r0 = "audience_type"
            r5.A09(r0, r1)
            return r5
        L_0x0033:
            java.lang.String r0 = r4.C6C()
            r5.A0A(r1, r0)
            java.lang.String r0 = "is_csc_chat"
            r5.A09(r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NJC.E4x():X.0jB");
    }

    public final String getModuleName() {
        AnonymousClass2Ep r0 = this.A06;
        if (r0 == null) {
            return "direct_poll_message_voting";
        }
        int C6a = r0.C6a();
        if (C6a == 28) {
            return "csc_direct_thread";
        }
        if (C6a == 29) {
            return "broadcast_chat_thread";
        }
        if (C6a == 32) {
            return "discoverable_chat_thread";
        }
        if (C6a == 61) {
            return "csc_direct_thread";
        }
        if (C6a != 62) {
            return "direct_poll_message_voting";
        }
        return "discoverable_chat_thread";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0D);
    }

    public final boolean isScrolledToTop() {
        LinearLayoutManager linearLayoutManager = this.A0B;
        if (linearLayoutManager != null) {
            return C2808154f.A03(linearLayoutManager);
        }
        0qQ.A0F("linearLayoutManager");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
        View view = this.A02;
        if (view != null) {
            C66582MXn.A14(view, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b9, code lost:
        if (r3 == 0) goto L_0x00bb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r17) {
        /*
            r16 = this;
            r0 = 1310523398(0x4e1d0006, float:6.5850611E8)
            int r2 = X.AnonymousClass0fD.A02(r0)
            r7 = r16
            r0 = r17
            X.NJC.super.onCreate(r0)
            android.os.Bundle r6 = r7.requireArguments()
            X.0eM r5 = r7.A0D
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r5)
            X.O76 r0 = new X.O76
            r0.<init>(r7, r1)
            r7.A05 = r0
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r5)
            X.PCP r0 = new X.PCP
            r0.<init>(r1)
            r7.A07 = r0
            java.lang.String r0 = "DirectPollMessageVotingFragment_thread_key"
            android.os.Parcelable r10 = r6.getParcelable(r0)
            if (r10 == 0) goto L_0x00bd
            X.3sy r10 = (X.C254743sy) r10
            java.lang.String r0 = "DirectPollMessageVotingFragment_is_msys"
            r4 = 0
            boolean r0 = r6.getBoolean(r0, r4)
            r7.A0A = r0
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            X.2Dm r3 = X.1bJ.A00(r0)
            java.lang.String r1 = X.C66647MaG.A0B(r10)
            r0 = 0
            if (r1 == 0) goto L_0x0050
            X.3U9 r0 = X.C66580MXl.A0d(r3, r1)
        L_0x0050:
            r7.A06 = r0
            if (r0 == 0) goto L_0x005d
            int r1 = r0.C6a()
            r0 = 29
            if (r1 != r0) goto L_0x005d
            r4 = 1
        L_0x005d:
            r7.A09 = r4
            java.lang.String r1 = "DirectPollMessageVotingFragment_poll_id"
            java.lang.String r0 = ""
            java.lang.String r12 = X.DbT.A0w(r6, r1, r0)
            X.17i r11 = X.JTR.A0u(r5)
            android.content.Context r0 = r7.requireContext()
            X.OBZ r8 = new X.OBZ
            r8.<init>(r0)
            android.content.Context r1 = r7.requireContext()
            r0 = 2131961885(0x7f13281d, float:1.956048E38)
            java.lang.String r13 = X.AnonymousClass7TE.A16(r1, r0)
            X.O76 r9 = r7.A05
            if (r9 != 0) goto L_0x008d
            java.lang.String r0 = "logger"
            X.0qQ.A0F(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x008d:
            boolean r14 = r7.A09
            X.2Ep r4 = r7.A06
            r15 = 0
            if (r4 == 0) goto L_0x00bb
            int r3 = r4.BHS()
            java.util.List r1 = r4.AZs()
            java.lang.String r0 = X.DbU.A0u(r5)
            boolean r1 = r1.contains(r0)
            boolean r0 = r4.Ca9()
            if (r0 == 0) goto L_0x00b9
            r15 = r1
        L_0x00ab:
            X.Oam r6 = new X.Oam
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r7.A04 = r6
            r0 = 1656818193(0x62c10a11, float:1.7804735E21)
            X.AnonymousClass0fD.A09(r0, r2)
            return
        L_0x00b9:
            if (r3 != 0) goto L_0x00ab
        L_0x00bb:
            r15 = 1
            goto L_0x00ab
        L_0x00bd:
            java.lang.String r0 = "thread key can't be null"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass7TE.A0w(r0)
            r0 = -249037175(0xfffffffff127fe89, float:-8.318674E29)
            X.AnonymousClass0fD.A09(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NJC.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2078071726);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_direct_poll_message_voting, viewGroup, false);
        AnonymousClass0fD.A09(-431303269, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-574041923);
        super.onDestroyView();
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        this.A0C.A01();
        C71067Oam oam = this.A04;
        if (oam == null) {
            0qQ.A0F("controller");
            throw AnonymousClass00P.createAndThrow();
        }
        oam.A02 = null;
        oam.A04.A01();
        AnonymousClass0fD.A09(-175751097, A022);
    }
}
