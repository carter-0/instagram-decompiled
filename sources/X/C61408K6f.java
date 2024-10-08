package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

/* renamed from: X.K6f  reason: case insensitive filesystem */
public final class C61408K6f extends AnonymousClass4DH implements AnonymousClass8QW, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "PlaylistReelsSelectionFragment";
    public View A00;
    public L17 A01;
    public RecyclerView A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final AnonymousClass0eM A04 = DbS.A0I(new GW6(this, 46), new GW6(this, 47), new C73664Phd(13, this, (Object) null), DbS.A0z(C60200JhJ.class));

    public final /* synthetic */ void D3h(Integer num) {
    }

    public final /* synthetic */ void DBA(int i) {
    }

    public final /* synthetic */ void Dik() {
    }

    public final /* synthetic */ void Du4() {
    }

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131969509);
    }

    public final String getModuleName() {
        return "playlist_reels_selection_fragment";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: X.8QW} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r32, android.os.Bundle r33) {
        /*
            r31 = this;
            r2 = 0
            r3 = r32
            X.0qQ.A0B(r3, r2)
            r8 = r31
            r0 = r33
            super.onViewCreated(r3, r0)
            r0 = 2131437775(0x7f0b28cf, float:1.8497458E38)
            android.view.View r0 = r3.findViewById(r0)
            r8.A00 = r0
            android.content.Context r1 = r8.requireContext()
            X.L17 r0 = new X.L17
            r0.<init>(r1, r8, r8)
            r8.A01 = r0
            r0 = 2131437777(0x7f0b28d1, float:1.8497462E38)
            androidx.recyclerview.widget.RecyclerView r6 = X.DbZ.A0F(r3, r0)
            androidx.fragment.app.FragmentActivity r5 = r8.getActivity()
            r4 = 3
            r1 = 1
            androidx.recyclerview.widget.GridLayoutManager r0 = new androidx.recyclerview.widget.GridLayoutManager
            r0.<init>((android.content.Context) r5, (int) r4, (int) r1, (boolean) r2)
            r6.setLayoutManager(r0)
            android.content.res.Resources r4 = r6.getResources()
            r0 = 2131165200(0x7f070010, float:1.794461E38)
            int r4 = r4.getDimensionPixelOffset(r0)
            r7 = 0
            X.8gZ r0 = new X.8gZ
            r0.<init>(r4, r2)
            r6.A11(r0)
            X.L17 r0 = r8.A01
            if (r0 != 0) goto L_0x0058
            java.lang.String r0 = "gridAdapter"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0058:
            X.2t9 r0 = r0.A00
            r6.setAdapter(r0)
            r8.A02 = r6
            android.content.Context r6 = r8.requireContext()
            X.0eM r0 = r8.A03
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r0)
            r0 = 2131437776(0x7f0b28d0, float:1.849746E38)
            android.view.View r10 = X.AnonymousClass7TE.A0b(r3, r0)
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r10 = (com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout) r10
            X.0eM r4 = r8.A04
            java.lang.Object r0 = r4.getValue()
            X.JhJ r0 = (X.C60200JhJ) r0
            X.7Gd r12 = r0.A00
            android.content.res.Resources r3 = r3.getResources()
            r0 = 2131165232(0x7f070030, float:1.7944675E38)
            int r21 = r3.getDimensionPixelSize(r0)
            r0 = 2131165195(0x7f07000b, float:1.79446E38)
            int r3 = r3.getDimensionPixelSize(r0)
            int r3 = r3 / 2
            r19 = 2131968361(0x7f134169, float:1.9573614E38)
            r18 = 1058013184(0x3f100000, float:0.5625)
            r23 = 2131099798(0x7f060096, float:1.781196E38)
            X.JYJ r16 = X.JYJ.A00
            X.8QY r17 = X.AnonymousClass8QY.A00
            X.8QZ r5 = new X.8QZ
            r11 = r7
            r13 = r8
            r14 = r7
            r15 = r7
            r20 = r2
            r22 = r3
            r24 = r0
            r25 = r2
            r26 = r1
            r27 = r1
            r28 = r2
            r29 = r2
            r30 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            X.0xx r2 = X.DbW.A0E(r8)
            r1 = 6
            X.MFR r0 = new X.MFR
            r0.<init>(r8, r7, r1)
            X.19B r5 = X.19B.A00
            X.1Eo.A05(r5, r0, r2)
            X.0xx r2 = X.DbW.A0E(r8)
            r1 = 7
            X.MFR r0 = new X.MFR
            r0.<init>(r8, r7, r1)
            X.1Eo.A05(r5, r0, r2)
            X.2YL r3 = X.DbS.A0H(r4)
            X.6oS r2 = X.C318116oQ.A00(r3)
            r1 = 8
            X.MFR r0 = new X.MFR
            r0.<init>(r3, r7, r1)
            X.6oS r2 = X.C51967G9n.A0M(r3, r5, r0, r2)
            r1 = 9
            X.MFR r0 = new X.MFR
            r0.<init>(r3, r7, r1)
            X.6oS r2 = X.C51967G9n.A0M(r3, r5, r0, r2)
            r1 = 10
            X.MFR r0 = new X.MFR
            r0.<init>(r3, r7, r1)
            X.1Eo.A05(r5, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61408K6f.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final /* synthetic */ boolean Cdb() {
        return false;
    }

    public final /* synthetic */ boolean EtH() {
        return false;
    }

    public final /* synthetic */ boolean getCanHaveEmptySegments() {
        return false;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final void Du1(C53401GnY gnY) {
        C309516Yo A0N = DbX.A0N(requireActivity(), this.A03);
        A0N.A0D(new C61365K4j());
        A0N.A04();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1439853924);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_playlist_reels_selection, viewGroup, false);
        AnonymousClass0fD.A09(-736013365, A022);
        return inflate;
    }
}
