package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.model.direct.DirectThreadKey;
import java.io.Serializable;

/* renamed from: X.NJi  reason: case insensitive filesystem */
public final class C68470NJi extends AnonymousClass4DH implements C74568PxH {
    public static final String __redex_internal_original_name = "DirectThreadGifsTabFragment";
    public C329207Hz A00;
    public DirectThreadKey A01;
    public C71020OYv A02;
    public C69319NjK A03;
    public String A04 = "";
    public boolean A05;
    public boolean A06;
    public final AnonymousClass0eM A07 = C227642jf.A02(this);

    public final void ADi(AnonymousClass7L0 r1) {
    }

    public final void Dhu(String str) {
        String str2;
        String str3;
        0qQ.A0B(str, 0);
        C71020OYv oYv = this.A02;
        if (oYv == null) {
            str2 = "directThreadGifsTrayController";
        } else {
            boolean equals = str.equals("");
            str2 = "directGifCategoriesTabsManager";
            if (!equals || !AnonymousClass7TF.A1Z(oYv.A0F)) {
                oYv.A08.A00(C69286Nim.SEARCH, str);
            } else {
                if (oYv.A0H) {
                    str3 = oYv.A0C;
                } else {
                    C70677OFy oFy = oYv.A03;
                    if (oFy != null) {
                        str3 = ((N4H) oFy.A03.get(oFy.A00)).A05;
                    }
                }
                OLZ olz = oYv.A08;
                C70677OFy oFy2 = oYv.A03;
                if (oFy2 != null) {
                    olz.A00((C69286Nim) ((N4H) oFy2.A03.get(oFy2.A00)).A04, str3);
                    C70677OFy oFy3 = oYv.A03;
                    if (oFy3 != null) {
                        oFy3.A02.A01(oFy3.A00, true);
                    }
                }
            }
            if (AnonymousClass7TF.A1Z(oYv.A0F)) {
                C70677OFy oFy4 = oYv.A03;
                if (oFy4 != null) {
                    oFy4.A02.setVisibility(DbW.A01(equals ? 1 : 0));
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return "direct_gif_tray_fragment";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r0 == 1) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r21, android.os.Bundle r22) {
        /*
            r20 = this;
            r3 = 0
            r4 = r21
            X.0qQ.A0B(r4, r3)
            r9 = r20
            r0 = r22
            super.onViewCreated(r4, r0)
            X.NjK r0 = r9.A03
            if (r0 != 0) goto L_0x00aa
            r0 = -1
        L_0x0012:
            r2 = 1
            r1 = 3
            if (r0 == r1) goto L_0x001b
            if (r0 == r3) goto L_0x001b
            r5 = 0
            if (r0 != r2) goto L_0x001c
        L_0x001b:
            r5 = 1
        L_0x001c:
            X.0eM r6 = r9.A07
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r6)
            com.instagram.model.direct.DirectThreadKey r15 = r9.A01
            r0 = 2131431812(0x7f0b1184, float:1.8485364E38)
            X.3oV r12 = X.DbU.A0Y(r4, r0)
            android.content.Context r7 = r9.requireContext()
            X.7Hz r13 = r9.A00
            X.NjK r1 = r9.A03
            X.NjK r0 = X.C69319NjK.COMMENT_COMPOSER
            if (r1 != r0) goto L_0x00a7
            com.instagram.api.schemas.GiphyRequestSurface r8 = com.instagram.api.schemas.GiphyRequestSurface.COMMENT
        L_0x0039:
            boolean r4 = r9.A05
            if (r5 == 0) goto L_0x004f
            com.instagram.model.direct.DirectThreadKey r5 = r9.A01
            if (r5 == 0) goto L_0x0050
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r6)
            java.lang.Integer r0 = X.AnonymousClass05K.A06
            X.797 r1 = X.AnonymousClass796.A03(r1, r5, r0)
            X.797 r0 = X.AnonymousClass797.OPEN_ONLY
            if (r1 == r0) goto L_0x0050
        L_0x004f:
            r2 = 0
        L_0x0050:
            java.lang.String r1 = r9.A04
            boolean r0 = r9.A06
            X.NjK r14 = r9.A03
            if (r14 != 0) goto L_0x005a
            X.NjK r14 = X.C69319NjK.UNKNOWN
        L_0x005a:
            X.OYv r6 = new X.OYv
            r11 = r9
            r17 = r4
            r18 = r2
            r19 = r0
            r16 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r9.A02 = r6
            X.NjK r1 = r9.A03
            X.NjK r0 = X.C69319NjK.DIRECT_SAVED_STICKER
            java.lang.String r5 = "directThreadGifsTrayController"
            if (r1 != r0) goto L_0x00b9
            X.NjK r2 = X.C69319NjK.DIRECT_COMPOSER_STICKER_BUTTON
            r9.A03 = r2
            android.os.Bundle r1 = r9.mArguments
            if (r1 == 0) goto L_0x007f
            java.lang.String r0 = "param_extra_sticker_tray_entrypoint"
            r1.putSerializable(r0, r2)
        L_0x007f:
            X.OYv r4 = r9.A02
            if (r4 == 0) goto L_0x009f
            X.3oV r0 = r4.A07
            r0.setVisibility(r3)
            X.0eM r0 = r4.A0F
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x00ca
            X.OLZ r2 = r4.A08
            X.Nim r1 = X.C69286Nim.SAVED
            java.lang.String r0 = ""
            r2.A00(r1, r0)
            X.OFy r2 = r4.A03
            if (r2 != 0) goto L_0x00b0
            java.lang.String r5 = "directGifCategoriesTabsManager"
        L_0x009f:
            X.0qQ.A0F(r5)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00a7:
            com.instagram.api.schemas.GiphyRequestSurface r8 = com.instagram.api.schemas.GiphyRequestSurface.DIRECT
            goto L_0x0039
        L_0x00aa:
            int r0 = r0.ordinal()
            goto L_0x0012
        L_0x00b0:
            X.Jec r1 = r2.A02
            r0 = 1
            r1.A01(r0, r0)
            r2.A00 = r0
            return
        L_0x00b9:
            java.lang.String r2 = r9.A04
            X.0qQ.A0B(r2, r3)
            X.3oV r0 = r6.A07
            r0.setVisibility(r3)
            X.OLZ r1 = r6.A08
            X.Nim r0 = X.C69286Nim.SEARCH
            r1.A00(r0, r2)
        L_0x00ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68470NJi.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    public final boolean isScrolledToTop() {
        C71020OYv oYv = this.A02;
        if (oYv == null) {
            0qQ.A0F("directThreadGifsTrayController");
            throw AnonymousClass00P.createAndThrow();
        }
        RecyclerView recyclerView = oYv.A01;
        if (recyclerView != null && recyclerView.getChildCount() == 0) {
            return true;
        }
        RecyclerView recyclerView2 = oYv.A01;
        if (recyclerView2 == null || recyclerView2.computeVerticalScrollOffset() != 0) {
            return false;
        }
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(505332704);
        C68470NJi.super.onCreate(bundle);
        this.A01 = (DirectThreadKey) requireArguments().getParcelable("param_extra_direct_thread_key");
        this.A04 = requireArguments().getString("param_extra_initial_search_term", "");
        this.A06 = requireArguments().getBoolean("param_extra_use_initial_search_term_if_no_query", false);
        this.A05 = requireArguments().getBoolean("param_extra_is_msys_thread", false);
        Serializable serializable = requireArguments().getSerializable("param_extra_sticker_tray_entrypoint");
        if (serializable instanceof C69319NjK) {
            this.A03 = (C69319NjK) serializable;
        }
        AnonymousClass0fD.A09(-380239687, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1388076711);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_direct_gifs_tray, viewGroup, false);
        AnonymousClass0fD.A09(752071267, A022);
        return inflate;
    }
}
