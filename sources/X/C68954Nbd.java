package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;

/* renamed from: X.Nbd  reason: case insensitive filesystem */
public final class C68954Nbd extends NKK {
    public static final String __redex_internal_original_name = "DirectEmojiReactionsListFragment";
    public View A00;
    public AnonymousClass2t9 A01;
    public Capabilities A02;
    public C60227Jhk A03;
    public boolean A04;
    public boolean A05;
    public RecyclerView A06;
    public final AnonymousClass9HB A07 = new AnonymousClass9HB();

    /* JADX WARNING: type inference failed for: r0v10, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0049, code lost:
        if (r1.A00(X.C376179Gx.REACTIONS) != false) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r13, android.os.Bundle r14) {
        /*
            r12 = this;
            r11 = 0
            X.0qQ.A0B(r13, r11)
            r7 = r12
            super.onViewCreated(r13, r14)
            r12.A00 = r13
            android.content.Context r2 = r12.requireContext()
            android.content.Context r1 = r12.requireContext()
            r0 = 2130969921(0x7f040541, float:1.7548538E38)
            int r0 = X.2Yu.A0H(r1, r0)
            r2.getColor(r0)
            android.content.Context r1 = r12.requireContext()
            android.content.Context r0 = r12.getContext()
            int r0 = X.2Yu.A0B(r0)
            r1.getColor(r0)
            android.view.View r1 = r12.A00
            if (r1 == 0) goto L_0x0148
            r0 = 2131433850(0x7f0b197a, float:1.8489497E38)
            android.widget.TextView r2 = X.AnonymousClass7TE.A0d(r1, r0)
            if (r2 == 0) goto L_0x0148
            boolean r0 = r12.A09
            if (r0 != 0) goto L_0x004b
            com.instagram.direct.capabilities.Capabilities r1 = r12.A02
            if (r1 == 0) goto L_0x013e
            X.9Gx r0 = X.C376179Gx.REACTIONS
            boolean r1 = r1.A00(r0)
            r0 = 2131959227(0x7f131dbb, float:1.9555088E38)
            if (r1 == 0) goto L_0x004e
        L_0x004b:
            r0 = 2131959226(0x7f131dba, float:1.9555086E38)
        L_0x004e:
            X.DbU.A1G(r2, r12, r0)
            X.0eM r2 = r12.A0A
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            X.OGl r9 = new X.OGl
            r9.<init>(r0)
            X.2tC r1 = X.DbV.A0S(r12)
            X.PDp r10 = new X.PDp
            r10.<init>(r12)
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r2)
            X.NOl r6 = new X.NOl
            r6.<init>(r7, r8, r9, r10, r11)
            r1.A01(r6)
            X.KF6 r0 = new X.KF6
            r0.<init>()
            X.2t9 r0 = X.DbU.A0U(r1, r0)
            r12.A01 = r0
            android.content.Context r0 = r12.requireContext()
            r4 = 1
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            r1.<init>(r0, r4, r11)
            androidx.recyclerview.widget.RecyclerView r0 = X.DbX.A0K(r13)
            r12.A06 = r0
            java.lang.String r6 = "recyclerView"
            if (r0 == 0) goto L_0x0136
            r0.setLayoutManager(r1)
            androidx.recyclerview.widget.RecyclerView r1 = r12.A06
            if (r1 == 0) goto L_0x0136
            X.2t9 r0 = r12.A01
            java.lang.String r2 = "igRecyclerViewAdapter"
            if (r0 == 0) goto L_0x0140
            r1.setAdapter(r0)
            boolean r0 = r12.A09
            java.lang.String r5 = "Required value was null."
            if (r0 == 0) goto L_0x011e
            X.Jhk r0 = r12.A03
            if (r0 == 0) goto L_0x011b
            X.2Fk r3 = r0.A00
            X.07Z r2 = r12.getViewLifecycleOwner()
            r0 = 45
            X.PqK r1 = X.C74178PqK.A00(r12, r0)
            r0 = 52
            X.Dba.A15(r2, r3, r1, r0)
            java.lang.String r0 = r12.A07
            if (r0 != 0) goto L_0x00de
            X.O7j r0 = r12.A03
            if (r0 == 0) goto L_0x00de
            java.lang.String r4 = "DirectMessage.id is null"
        L_0x00c5:
            X.P9s r3 = r0.A00
            android.app.Activity r2 = r3.A03
            r1 = 2131960632(0x7f132338, float:1.9557938E38)
            java.lang.String r0 = "direct_unknown_error"
            X.C59689JTv.A01(r2, r0, r1, r11)
            java.lang.String r0 = "DirectEmojiReactionsListNavigator.openReactionBottomsheet"
            X.0wb.A03(r4, r0)
            X.7Pu r0 = r3.A02
            if (r0 == 0) goto L_0x00dd
            r0.A07()
        L_0x00dd:
            return
        L_0x00de:
            X.3sy r0 = r12.A05
            if (r0 == 0) goto L_0x00e8
            java.lang.String r0 = X.C66647MaG.A0B(r0)
            if (r0 != 0) goto L_0x00ef
        L_0x00e8:
            X.O7j r0 = r12.A03
            if (r0 == 0) goto L_0x00ef
            java.lang.String r4 = "threadId is null"
            goto L_0x00c5
        L_0x00ef:
            java.lang.String r0 = r12.A06
            if (r0 != 0) goto L_0x00fa
            X.O7j r0 = r12.A03
            if (r0 == 0) goto L_0x00fa
            java.lang.String r4 = "clientContext is null"
            goto L_0x00c5
        L_0x00fa:
            androidx.recyclerview.widget.RecyclerView r3 = r12.A06
            if (r3 == 0) goto L_0x0136
            r0 = 8
            X.PFx r2 = new X.PFx
            r2.<init>(r12, r0)
            X.71i r1 = X.C3251771i.A0A
            X.3pI r0 = r3.A0D
            if (r0 == 0) goto L_0x0116
            X.JTQ.A0y(r0, r3, r2, r1)
            X.Jhk r0 = r12.A03
            if (r0 == 0) goto L_0x011b
            r0.A00(r4)
            return
        L_0x0116:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r5)
            throw r0
        L_0x011b:
            java.lang.String r2 = "emojiReactionsListViewModel"
            goto L_0x0140
        L_0x011e:
            com.instagram.common.recyclerview.ViewModelListUpdate r1 = X.DbS.A0R()
            java.util.List r0 = r12.A08
            if (r0 == 0) goto L_0x0131
            r1.A01(r0)
            X.2t9 r0 = r12.A01
            if (r0 == 0) goto L_0x0140
            r0.A05(r1)
            return
        L_0x0131:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r5)
            throw r0
        L_0x0136:
            X.0qQ.A0F(r6)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x013e:
            java.lang.String r2 = "capabilities"
        L_0x0140:
            X.0qQ.A0F(r2)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0148:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68954Nbd.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = this.A06;
        if (recyclerView != null) {
            return C2808154f.A05(recyclerView);
        }
        C66580MXl.A19();
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.Nbd, X.NKK, X.07g, androidx.fragment.app.Fragment] */
    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        String A0B;
        int A022 = AnonymousClass0fD.A02(1363558298);
        super.onCreate(bundle);
        Parcelable parcelable = requireArguments().getParcelable("DirectFragment.DIRECT_FRAGMENT_THREAD_CAPABILITIES");
        if (parcelable != null) {
            Capabilities capabilities = (Capabilities) parcelable;
            0qQ.A0B(capabilities, 0);
            this.A02 = capabilities;
            UserSession A0l = AnonymousClass7TE.A0l(this.A0A);
            C254743sy r0 = this.A05;
            if (r0 == null || (A0B = C66647MaG.A0B(r0)) == null) {
                illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                i = 1070846680;
            } else {
                String str = this.A07;
                if (str != null) {
                    this.A03 = new 2YN(new C61593KDu(A0l, A0B, str, this.A06), this).A00(KRI.class);
                    AnonymousClass0fD.A09(1311296058, A022);
                    return;
                }
                illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                i = 952327024;
            }
        } else {
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = 204007889;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2972550);
        LayoutInflater A09 = C66583MXo.A09(layoutInflater, this);
        this.A07.A02(viewGroup);
        View inflate = A09.inflate(R.layout.fragment_emoji_reactions_list, viewGroup, false);
        AnonymousClass0fD.A09(358063830, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(121147524);
        this.A07.A01();
        super.onDestroyView();
        this.A00 = null;
        AnonymousClass0fD.A09(1873739066, A022);
    }
}
