package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.model.direct.DirectThreadKey;
import java.io.Serializable;

public final class NJX extends AnonymousClass4DH implements AnonymousClass4DR, C74568PxH {
    public static final String __redex_internal_original_name = "DirectStickerTabFragment";
    public C70983OUx A00;
    public String A01;
    public P3E A02;
    public C69319NjK A03;
    public AnonymousClass7L0 A04;
    public DirectThreadKey A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I = true;
    public final AnonymousClass0eM A0J = C227642jf.A02(this);

    public final void ADi(AnonymousClass7L0 r2) {
        0qQ.A0B(r2, 0);
        this.A04 = r2;
        P3E p3e = this.A02;
        if (p3e != null) {
            p3e.A0A = r2;
            p3e.A0K.A00.notifyDataSetChanged();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        if (r1 != r0) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dhu(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            X.0qQ.A0B(r6, r0)
            X.P3E r4 = r5.A02
            if (r4 == 0) goto L_0x0028
            int r2 = r6.length()
            if (r2 != 0) goto L_0x0029
            X.N40 r3 = r4.A09
            java.lang.Integer r1 = r3.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            boolean r0 = X.AnonymousClass7TF.A1W(r1, r0)
            if (r0 != 0) goto L_0x0029
            java.lang.Integer r0 = X.AnonymousClass05K.A00
        L_0x001c:
            java.util.List r2 = r3.A02
            java.util.List r1 = r3.A04
            X.P3E.A03(r4, r3, r0, r2, r1)
        L_0x0023:
            X.OO0 r0 = r4.A0R
            r0.A03(r6)
        L_0x0028:
            return
        L_0x0029:
            if (r2 <= 0) goto L_0x0023
            X.N40 r3 = r4.A09
            java.lang.Integer r1 = r3.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x001c
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NJX.Dhu(java.lang.String):void");
    }

    public final String getModuleName() {
        return "direct_sticker_tab_tray_fragment";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: X.4D6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: X.0iw} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r42, android.os.Bundle r43) {
        /*
            r41 = this;
            r9 = 0
            r1 = r42
            X.0qQ.A0B(r1, r9)
            r10 = r41
            r0 = r43
            super.onViewCreated(r1, r0)
            X.0eM r0 = r10.A0J
            com.instagram.common.session.UserSession r21 = X.AnonymousClass7TE.A0l(r0)
            r0 = 2131431789(0x7f0b116d, float:1.8485317E38)
            X.3oV r23 = X.DbV.A0T(r1, r0, r9)
            android.content.Context r18 = r10.requireContext()
            X.AnonymousClass07a.A00(r10)
            X.O6U r8 = new X.O6U
            r8.<init>(r10)
            boolean r0 = r10.A0I
            r24 = r0
            boolean r0 = r10.A0F
            r20 = r0
            boolean r0 = r10.A08
            r17 = r0
            boolean r15 = r10.A0B
            boolean r14 = r10.A0G
            boolean r13 = r10.A0H
            boolean r12 = r10.A0C
            boolean r11 = r10.A07
            boolean r7 = r10.A0A
            boolean r6 = r10.A0E
            boolean r5 = r10.A0D
            X.NjK r4 = r10.A03
            X.NjK r0 = X.C69319NjK.COMMENT_COMPOSER
            if (r4 != r0) goto L_0x00c5
            com.instagram.api.schemas.GiphyRequestSurface r19 = com.instagram.api.schemas.GiphyRequestSurface.COMMENT
        L_0x004a:
            java.lang.String r3 = r10.A01
            if (r3 != 0) goto L_0x0058
            java.lang.String r16 = "bottomSheetSessionId"
        L_0x0050:
            X.0qQ.A0F(r16)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0058:
            androidx.fragment.app.FragmentActivity r0 = r10.getActivity()
            if (r0 == 0) goto L_0x00c2
            X.37D r27 = X.DbT.A0i(r0)
        L_0x0062:
            java.lang.String r2 = r10.A06
            java.lang.String r16 = "initialSearchTerm"
            if (r2 == 0) goto L_0x0050
            com.instagram.model.direct.DirectThreadKey r1 = r10.A05
            X.P3E r0 = new X.P3E
            r22 = r10
            r28 = r3
            r29 = r2
            r30 = r24
            r31 = r20
            r32 = r17
            r33 = r15
            r34 = r14
            r35 = r13
            r36 = r12
            r37 = r11
            r38 = r7
            r39 = r6
            r40 = r5
            r20 = r10
            r24 = r8
            r25 = r4
            r26 = r1
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r10.A02 = r0
            X.7L0 r1 = r10.A04
            r0.A0A = r1
            X.OHJ r0 = r0.A0K
            X.2t9 r0 = r0.A00
            r0.notifyDataSetChanged()
            X.P3E r2 = r10.A02
            if (r2 == 0) goto L_0x00b4
            java.lang.String r1 = r10.A06
            if (r1 == 0) goto L_0x0050
            X.3oV r0 = r2.A0H
            r0.setVisibility(r9)
            X.OO0 r0 = r2.A0R
            r0.A03(r1)
        L_0x00b4:
            X.NjK r1 = r10.A03
            X.NjK r0 = X.C69319NjK.REOPEN_AI_STICKER_TRAY
            if (r1 != r0) goto L_0x00c1
            X.OUx r0 = r10.A00
            if (r0 == 0) goto L_0x00c1
            r0.A01()
        L_0x00c1:
            return
        L_0x00c2:
            r27 = 0
            goto L_0x0062
        L_0x00c5:
            com.instagram.api.schemas.GiphyRequestSurface r19 = com.instagram.api.schemas.GiphyRequestSurface.DIRECT
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NJX.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0J);
    }

    public final boolean isScrolledToTop() {
        P3E p3e = this.A02;
        if (p3e == null || C2808154f.A03(p3e.A0E)) {
            return true;
        }
        return false;
    }

    public final boolean onBackPressed() {
        P3E p3e = this.A02;
        if (p3e == null) {
            return false;
        }
        N40 n40 = p3e.A09;
        if (!n40.A01()) {
            return false;
        }
        P3E.A03(p3e, n40, AnonymousClass05K.A00, n40.A02, n40.A04);
        return true;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        P3E p3e;
        super.onActivityResult(i, i2, intent);
        if (i == 1109 && i2 == -1 && (p3e = this.A02) != null) {
            OO0 oo0 = p3e.A0R;
            if (oo0 instanceof C68746NVg) {
                oo0.A04("");
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1016385388);
        NJX.super.onCreate(bundle);
        this.A06 = requireArguments().getString("param_extra_initial_search_term", "");
        this.A01 = requireArguments().getString("param_extra_bottom_sheet_session_id", "");
        this.A0I = requireArguments().getBoolean("param_extra_show_like_sticker", true);
        this.A09 = requireArguments().getBoolean("param_extra_is_broadcast_thread", false);
        this.A0F = requireArguments().getBoolean("param_extra_is_poll_enabled", false);
        this.A08 = requireArguments().getBoolean("param_extra_ai_sticker_enabled", false);
        this.A0B = requireArguments().getBoolean("param_extra_imagine_enabled", false);
        this.A0G = requireArguments().getBoolean("param_extra_saved_sticker_enabled", false);
        this.A0H = requireArguments().getBoolean("param_extra_sticker_packs_enabled", false);
        this.A0C = requireArguments().getBoolean("param_extra_is_location_sticker_enabled", false);
        this.A07 = requireArguments().getBoolean("param_extra_is_add_yours_sticker_enabled", false);
        this.A0A = requireArguments().getBoolean("param_extra_is_cutout_sticker_enabled", false);
        this.A0E = requireArguments().getBoolean("param_extra_is_music_sticker_enabled", false);
        this.A0D = requireArguments().getBoolean("param_extra_is_msys_thread", false);
        this.A05 = (DirectThreadKey) requireArguments().getParcelable("param_extra_direct_thread_key");
        Serializable serializable = requireArguments().getSerializable("param_extra_sticker_tray_entrypoint");
        if (serializable instanceof C69319NjK) {
            this.A03 = (C69319NjK) serializable;
        }
        AnonymousClass0fD.A09(1552354072, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(594082672);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.fragment_direct_sticker_tab_tray, false);
        AnonymousClass0fD.A09(-26991330, A022);
        return A0D2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1657547180);
        super.onDestroy();
        this.A00 = null;
        AnonymousClass0fD.A09(1216349639, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-802209643);
        super.onDestroyView();
        this.A02 = null;
        AnonymousClass0fD.A09(1497456760, A022);
    }
}
