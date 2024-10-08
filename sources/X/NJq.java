package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.model.direct.DirectThreadKey;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

public final class NJq extends AnonymousClass4DH implements C74332Pt8, C74472PvS {
    public static final String __redex_internal_original_name = "DirectStickerTabPickerFragment";
    public int A00;
    public Bundle A01;
    public View.OnTouchListener A02 = new C71439Oke((Object) this, 3);
    public ViewGroup A03;
    public Fragment A04;
    public UserSession A05;
    public AnonymousClass7IJ A06;
    public O6V A07;
    public C69319NjK A08;
    public OKN A09;
    public IgdsInlineSearchBox A0A;
    public DirectThreadKey A0B;
    public C74586PxZ A0C;
    public OMY A0D;
    public Boolean A0E;
    public String A0F;
    public String A0G;
    public List A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public TouchInterceptorFrameLayout A0W;
    public O60 A0X;
    public OBL A0Y;
    public AnonymousClass7L0 A0Z;
    public boolean A0a;
    public boolean A0b;
    public final C329207Hz A0c = new C72323P1o(this);
    public final AnonymousClass9HB A0d = new AnonymousClass9HB();

    public final void DMt() {
        this.A00 = 0;
        ViewGroup viewGroup = this.A03;
        if (viewGroup != null) {
            viewGroup.setTranslationY(0.0f);
        }
    }

    public final String getModuleName() {
        return "direct_sticker_tab_picker_fragment";
    }

    public final boolean isContainerFragment() {
        return true;
    }

    private PRE A00(List list) {
        if (!this.A0a) {
            return null;
        }
        boolean A1Y = DbY.A1Y(0Tu.A05, this.A05, 36322465407838403L);
        int i = R.drawable.instagram_avatar_selector;
        if (A1Y) {
            i = R.drawable.instagram_avatar_selector_new;
        }
        PRE pre = new PRE("avatar_stickers", new C73459Pd1(this, 4), i, 2131958640);
        list.add(pre);
        return pre;
    }

    public final void ADi(AnonymousClass7L0 r4) {
        this.A0Z = r4;
        if (this.mView != null) {
            ViewGroup viewGroup = this.A03;
            if (viewGroup != null) {
                viewGroup.setBackgroundColor(r4.A09);
                OMY omy = this.A0D;
                int i = r4.A0C;
                Iterator it = omy.A01.A04.iterator();
                while (it.hasNext()) {
                    C66581MXm.A1C(((C70596OCt) it.next()).A00, i);
                }
            }
            IgdsInlineSearchBox igdsInlineSearchBox = this.A0A;
            igdsInlineSearchBox.getClass();
            igdsInlineSearchBox.A05(r4.A0E);
            C74332Pt8 A002 = PRE.A00(this);
            AnonymousClass7L0 r1 = this.A0Z;
            if ((A002 instanceof C74332Pt8) && r1 != null) {
                A002.ADi(r1);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DMu(int r5) {
        /*
            r4 = this;
            r4.A00 = r5
            android.view.ViewGroup r1 = r4.A03
            if (r1 == 0) goto L_0x000b
            int r0 = -r5
            float r0 = (float) r0
            r1.setTranslationY(r0)
        L_0x000b:
            X.PxZ r0 = r4.A0C
            if (r0 == 0) goto L_0x0076
            X.PRE r0 = (X.PRE) r0
            java.lang.String r2 = r0.A02
            int r1 = r2.hashCode()
            r0 = -1735392516(0xffffffff989002fc, float:-3.722614E-24)
            if (r1 == r0) goto L_0x006b
            r0 = 3172655(0x30692f, float:4.445837E-39)
            if (r1 == r0) goto L_0x0060
            r0 = 1531715286(0x5b4c1ed6, float:5.74548E16)
            if (r1 != r0) goto L_0x0076
            java.lang.String r0 = "stickers"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0076
            java.lang.Integer r3 = X.AnonymousClass05K.A01
        L_0x0030:
            X.O60 r1 = r4.A0X
            com.instagram.model.direct.DirectThreadKey r0 = r4.A0B
            java.lang.String r2 = X.C67003Mgb.A01(r0)
            X.0wc r1 = r1.A00
            java.lang.String r0 = "direct_composer_tap_search_field"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0057
            X.C66580MXl.A1K(r1, r2)
            if (r3 == 0) goto L_0x005e
            int r0 = r3.intValue()
            switch(r0) {
                case 1: goto L_0x0058;
                case 2: goto L_0x005b;
                default: goto L_0x0052;
            }
        L_0x0052:
            java.lang.String r0 = "avatar"
        L_0x0054:
            X.DbV.A1J(r1, r0)
        L_0x0057:
            return
        L_0x0058:
            java.lang.String r0 = "sticker"
            goto L_0x0054
        L_0x005b:
            java.lang.String r0 = "gif"
            goto L_0x0054
        L_0x005e:
            r0 = 0
            goto L_0x0054
        L_0x0060:
            java.lang.String r0 = "gifs"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0076
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            goto L_0x0030
        L_0x006b:
            java.lang.String r0 = "avatar_stickers"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0076
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            goto L_0x0030
        L_0x0076:
            r3 = 0
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NJq.DMu(int):void");
    }

    public final AnonymousClass0wW getSession() {
        return this.A05;
    }

    public final void onAttachFragment(Fragment fragment) {
        String str = fragment.mTag;
        if ("gifs".equals(str)) {
            C329207Hz r1 = this.A0c;
            0qQ.A0B(r1, 0);
            ((C68470NJi) fragment).A00 = r1;
        } else if ("stickers".equals(str) || "recents".equals(str)) {
            ((NJX) fragment).A00 = new C70983OUx(this);
        }
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
        C66582MXn.A15(this.A03, i, i2);
        C268594df A002 = PRE.A00(this);
        if (A002 instanceof C268594df) {
            A002.onBottomSheetPositionChanged(i, i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0077, code lost:
        r1.setHint(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        X.0wb.A03("direct_sticker_tab_picker_fragment", "Unhandled tab for search hint");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        if (X.182.A06(X.DbS.A0J(r3, 0), r3, 36317732355577321L) != false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.NJq r5, java.lang.String r6) {
        /*
            int r0 = r6.hashCode()
            r4 = 0
            switch(r0) {
                case -1735392516: goto L_0x005d;
                case 3172655: goto L_0x0044;
                case 1531715286: goto L_0x0010;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.String r1 = "direct_sticker_tab_picker_fragment"
            java.lang.String r0 = "Unhandled tab for search hint"
            X.0wb.A03(r1, r0)
            return
        L_0x0010:
            java.lang.String r0 = "stickers"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0008
            boolean r0 = r5.A0J
            if (r0 == 0) goto L_0x0030
            com.instagram.common.session.UserSession r3 = r5.A05
            X.0Tu r2 = X.DbS.A0J(r3, r4)
            r0 = 36317732355577321(0x8106c9001a15e9, double:3.0308184092127176E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r1 = 2131960284(0x7f1321dc, float:1.9557232E38)
            if (r0 == 0) goto L_0x0033
        L_0x0030:
            r1 = 2131960280(0x7f1321d8, float:1.9557224E38)
        L_0x0033:
            com.instagram.igds.components.search.IgdsInlineSearchBox r0 = r5.A0A
            r0.getClass()
            r0.setVisibility(r4)
            com.instagram.igds.components.search.IgdsInlineSearchBox r0 = r5.A0A
            r0.getClass()
            r0.setHint((int) r1)
            return
        L_0x0044:
            java.lang.String r0 = "gifs"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0008
            com.instagram.igds.components.search.IgdsInlineSearchBox r0 = r5.A0A
            r0.getClass()
            r0.setVisibility(r4)
            com.instagram.igds.components.search.IgdsInlineSearchBox r1 = r5.A0A
            r1.getClass()
            r0 = 2131960279(0x7f1321d7, float:1.9557222E38)
            goto L_0x0077
        L_0x005d:
            java.lang.String r0 = "avatar_stickers"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0008
            com.instagram.igds.components.search.IgdsInlineSearchBox r1 = r5.A0A
            r1.getClass()
            r0 = 8
            r1.setVisibility(r0)
            com.instagram.igds.components.search.IgdsInlineSearchBox r1 = r5.A0A
            r1.getClass()
            r0 = 2131960275(0x7f1321d3, float:1.9557214E38)
        L_0x0077:
            r1.setHint((int) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NJq.A01(X.NJq, java.lang.String):void");
    }

    public final boolean isScrolledToTop() {
        C74568PxH A002 = PRE.A00(this);
        if (A002 instanceof C74568PxH) {
            return A002.isScrolledToTop();
        }
        return false;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Fragment A002 = PRE.A00(this);
        if (A002 != null) {
            A002.onActivityResult(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(259344042);
        NJq.super.onCreate(bundle);
        this.A01 = requireArguments();
        this.A05 = DbX.A0U(this);
        this.A0V = this.A01.getBoolean("param_extra_show_like_sticker");
        this.A0K = this.A01.getBoolean("param_extra_is_broadcast_thread");
        this.A0R = this.A01.getBoolean("param_extra_is_poll_creation_enabled");
        this.A0M = this.A01.getBoolean("param_extra_gif_enabled");
        this.A0T = this.A01.getBoolean("param_extra_sticker_enabled");
        this.A0a = this.A01.getBoolean("param_extra_avatar_enabled");
        this.A0J = this.A01.getBoolean("param_extra_ai_sticker_enabled");
        this.A0N = this.A01.getBoolean("param_extra_imagine_enabled");
        this.A0S = this.A01.getBoolean("param_extra_saved_sticker_enabled");
        this.A0U = this.A01.getBoolean("param_extra_sticker_packs_enabled");
        this.A0O = this.A01.getBoolean("param_extra_is_location_sticker_enabled");
        this.A0I = this.A01.getBoolean("param_extra_is_add_yours_sticker_enabled");
        this.A0L = this.A01.getBoolean("param_extra_is_cutout_sticker_enabled");
        this.A0Q = this.A01.getBoolean("param_extra_is_music_sticker_enabled");
        this.A0P = this.A01.getBoolean("param_extra_is_msys_thread");
        this.A0b = this.A01.getBoolean("param_extra_should_hide_tab_container");
        Serializable serializable = this.A01.getSerializable("param_extra_sticker_tray_entrypoint");
        if (serializable instanceof C69319NjK) {
            this.A08 = (C69319NjK) serializable;
        }
        this.A06 = new AnonymousClass7IJ(this.A05);
        this.A0B = (DirectThreadKey) this.A01.getParcelable("param_extra_direct_thread_key");
        this.A0H = this.A01.getStringArrayList("param_extra_social_stickers_user_ids");
        this.A0F = this.A01.getString("param_extra_bottom_sheet_session_id");
        AnonymousClass0fD.A09(399594303, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1385513711);
        this.A0d.A02(viewGroup);
        View A0C2 = DbT.A0C(layoutInflater, viewGroup, R.layout.fragment_direct_sticker_picker);
        AnonymousClass0fD.A09(863015584, A022);
        return A0C2;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1203538808);
        this.A0d.A01();
        super.onDestroyView();
        this.A0A = null;
        this.A0W = null;
        this.A03 = null;
        AnonymousClass0fD.A09(462790686, A022);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x017d, code lost:
        X.0wb.A03("direct_sticker_tab_picker_fragment", "Unhandled initial tab");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0184, code lost:
        r0 = r10.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0186, code lost:
        if (r0 != null) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x018c, code lost:
        if (r4.isEmpty() != false) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x018e, code lost:
        r0 = (X.C74586PxZ) r4.get(0);
        r10.A0C = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0196, code lost:
        A01(r10, ((X.PRE) r0).A02);
        r1 = r10.A0D;
        r0 = r10.A0C;
        r0.getClass();
        r1.A01(r0, r4);
        r10.A04 = r10.A0D.A00(getChildFragmentManager(), r10.A0C);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01b5, code lost:
        r0 = r10.A0Z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01b7, code lost:
        if (r0 == null) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01b9, code lost:
        ADi(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01bc, code lost:
        X.0nA.A0r(r10.A03, new X.PVE(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01c6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01c7, code lost:
        X.0wb.A03("direct_sticker_tab_picker_fragment", "Trying to open sticker tray with no tabs enabled");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01d3, code lost:
        if (r1.equals(r7) == false) goto L_0x017d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01ec, code lost:
        r10.A0C = r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r11, android.os.Bundle r12) {
        /*
            r10 = this;
            super.onViewCreated(r11, r12)
            android.content.Context r2 = r11.getContext()
            com.instagram.common.session.UserSession r1 = r10.A05
            X.OKN r0 = new X.OKN
            r0.<init>(r2, r1)
            r10.A09 = r0
            r0 = 2131442405(0x7f0b3ae5, float:1.8506849E38)
            android.view.ViewGroup r1 = X.DbU.A0C(r11, r0)
            r10.A03 = r1
            boolean r0 = r10.A0b
            if (r0 == 0) goto L_0x0022
            r0 = 8
            r1.setVisibility(r0)
        L_0x0022:
            r0 = 2131440786(0x7f0b3492, float:1.8503565E38)
            android.view.View r0 = r11.requireViewById(r0)
            com.instagram.igds.components.search.IgdsInlineSearchBox r0 = (com.instagram.igds.components.search.IgdsInlineSearchBox) r0
            r10.A0A = r0
            r0 = 2131433139(0x7f0b16b3, float:1.8488055E38)
            android.view.View r1 = r11.requireViewById(r0)
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r1 = (com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout) r1
            r10.A0W = r1
            android.view.View$OnTouchListener r0 = r10.A02
            r1.CNi(r0)
            android.os.Bundle r1 = r10.A01
            java.lang.String r0 = "param_extra_initial_search_term"
            java.lang.String r2 = ""
            java.lang.String r0 = r1.getString(r0, r2)
            r10.A0G = r0
            android.os.Bundle r1 = r10.A01
            java.lang.String r0 = "param_extra_use_initial_search_term_if_no_query"
            r5 = 0
            boolean r0 = r1.getBoolean(r0, r5)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r10.A0E = r0
            java.lang.String r0 = r10.A0G
            boolean r0 = X.AnonymousClass5He.A00(r0)
            if (r0 != 0) goto L_0x0074
            android.os.Bundle r1 = r10.A01
            java.lang.String r0 = "param_extra_is_creator_search"
            boolean r0 = r1.getBoolean(r0, r5)
            if (r0 == 0) goto L_0x0074
            java.lang.String r1 = "@"
            java.lang.String r0 = r10.A0G
            java.lang.String r0 = X.002.A0R(r1, r0)
            r10.A0G = r0
        L_0x0074:
            android.os.Bundle r1 = r10.A01
            java.lang.String r0 = "param_extra_hide_initial_search_term"
            boolean r1 = r1.getBoolean(r0, r5)
            com.instagram.igds.components.search.IgdsInlineSearchBox r0 = r10.A0A
            if (r1 != 0) goto L_0x0082
            java.lang.String r2 = r10.A0G
        L_0x0082:
            com.instagram.ui.text.backinterceptedittext.BackInterceptEditText r0 = r0.A0E
            r0.setText(r2)
            com.instagram.igds.components.search.IgdsInlineSearchBox r1 = r10.A0A
            r3 = 0
            X.PHc r0 = new X.PHc
            r0.<init>(r10, r5)
            r1.A02 = r0
            com.instagram.common.session.UserSession r4 = r10.A05
            android.view.ViewGroup r2 = r10.A03
            X.PRF r1 = new X.PRF
            r1.<init>(r10)
            X.OMY r0 = new X.OMY
            r0.<init>(r2, r4, r1)
            r10.A0D = r0
            com.instagram.igds.components.search.IgdsInlineSearchBox r1 = r10.A0A
            X.OkA r0 = new X.OkA
            r0.<init>(r10, r5)
            r1.A00 = r0
            com.instagram.common.session.UserSession r2 = r10.A05
            boolean r0 = r10.A0P
            if (r0 != 0) goto L_0x00b8
            com.instagram.model.direct.DirectThreadKey r0 = r10.A0B
            boolean r0 = X.C63227KtY.A00(r2, r0)
            if (r0 == 0) goto L_0x00b9
        L_0x00b8:
            r5 = 1
        L_0x00b9:
            X.OBL r1 = new X.OBL
            r1.<init>(r2, r5)
            r10.A0Y = r1
            java.lang.String r4 = r10.A0F
            if (r4 == 0) goto L_0x00d1
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x00d1
            X.LBr r2 = r1.A00
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r2.A00(r1, r0, r4)
        L_0x00d1:
            com.instagram.common.session.UserSession r1 = r10.A05
            X.O60 r0 = new X.O60
            r0.<init>(r10, r1)
            r10.A0X = r0
            com.instagram.common.session.UserSession r8 = r10.A05
            r0 = 1
            X.0qQ.A0B(r8, r0)
            java.lang.String r0 = "ig_direct_expression_tray"
            X.0wc r2 = X.DbW.A0J(r8, r0)
            com.instagram.model.direct.DirectThreadKey r0 = r10.A0B
            java.lang.String r7 = X.C67003Mgb.A01(r0)
            X.NjK r6 = r10.A08
            X.0Tu r5 = X.0Tu.A05
            r0 = 36328328039382254(0x81106c00123cee, double:3.037519162316351E-306)
            boolean r0 = X.182.A06(r5, r8, r0)
            if (r0 == 0) goto L_0x0123
            java.lang.String r0 = "direct_expression_tray_launch"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r2, r0)
            r0 = 143(0x8f, float:2.0E-43)
            X.1Ln r2 = new X.1Ln
            r2.<init>(r1, r0)
            boolean r0 = X.DbT.A1Y(r2)
            if (r0 == 0) goto L_0x0123
            java.lang.String r0 = "open_thread_id"
            r2.A0R(r0, r7)
            if (r6 != 0) goto L_0x020f
            r1 = 0
        L_0x0116:
            java.lang.String r0 = "entry_point"
            r2.A0M(r1, r0)
            java.lang.String r0 = "bottom_sheet_session_id"
            r2.A0R(r0, r4)
            r2.Cgf()
        L_0x0123:
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            X.7IJ r0 = r10.A06
            com.instagram.common.session.UserSession r2 = r0.A00
            r0 = 36320386643730817(0x81093300012181, double:3.032496991728949E-306)
            boolean r0 = X.182.A06(r5, r2, r0)
            if (r0 == 0) goto L_0x01ef
            r0 = 5
            X.Pd1 r2 = new X.Pd1
            r2.<init>(r10, r0)
            java.lang.String r7 = "stickers"
            r1 = 2131238851(0x7f081fc3, float:1.8093992E38)
            r0 = 2131960378(0x7f13223a, float:1.9557423E38)
            X.PRE r6 = new X.PRE
            r6.<init>(r7, r2, r1, r0)
            boolean r0 = r10.A0T
            if (r0 == 0) goto L_0x0150
            r4.add(r6)
        L_0x0150:
            X.PRE r5 = r10.A00(r4)
        L_0x0154:
            r0 = 3
            X.Pd1 r9 = new X.Pd1
            r9.<init>(r10, r0)
            java.lang.String r8 = "gifs"
            r1 = 2131238322(0x7f081db2, float:1.809292E38)
            r0 = 2131959407(0x7f131e6f, float:1.9555454E38)
            X.PRE r2 = new X.PRE
            r2.<init>(r8, r9, r1, r0)
            boolean r0 = r10.A0M
            if (r0 == 0) goto L_0x016e
            r4.add(r2)
        L_0x016e:
            android.os.Bundle r1 = r10.A01
            java.lang.String r0 = "param_extra_initial_tab"
            java.lang.String r1 = r1.getString(r0, r7)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1735392516: goto L_0x01df;
                case 3172655: goto L_0x01d6;
                case 1531715286: goto L_0x01cf;
                default: goto L_0x017d;
            }
        L_0x017d:
            java.lang.String r1 = "direct_sticker_tab_picker_fragment"
            java.lang.String r0 = "Unhandled initial tab"
            X.0wb.A03(r1, r0)
        L_0x0184:
            X.PxZ r0 = r10.A0C
            if (r0 != 0) goto L_0x0196
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x01c7
            java.lang.Object r0 = r4.get(r3)
            X.PxZ r0 = (X.C74586PxZ) r0
            r10.A0C = r0
        L_0x0196:
            X.PRE r0 = (X.PRE) r0
            java.lang.String r0 = r0.A02
            A01(r10, r0)
            X.OMY r1 = r10.A0D
            X.PxZ r0 = r10.A0C
            r0.getClass()
            r1.A01(r0, r4)
            X.OMY r2 = r10.A0D
            X.0hq r1 = r10.getChildFragmentManager()
            X.PxZ r0 = r10.A0C
            androidx.fragment.app.Fragment r0 = r2.A00(r1, r0)
            r10.A04 = r0
        L_0x01b5:
            X.7L0 r0 = r10.A0Z
            if (r0 == 0) goto L_0x01bc
            r10.ADi(r0)
        L_0x01bc:
            android.view.ViewGroup r1 = r10.A03
            X.PVE r0 = new X.PVE
            r0.<init>(r10)
            X.0nA.A0r(r1, r0)
            return
        L_0x01c7:
            java.lang.String r1 = "direct_sticker_tab_picker_fragment"
            java.lang.String r0 = "Trying to open sticker tray with no tabs enabled"
            X.0wb.A03(r1, r0)
            goto L_0x01b5
        L_0x01cf:
            boolean r0 = r1.equals(r7)
            if (r0 != 0) goto L_0x01ec
            goto L_0x017d
        L_0x01d6:
            boolean r0 = r1.equals(r8)
            if (r0 == 0) goto L_0x017d
            r10.A0C = r2
            goto L_0x0184
        L_0x01df:
            java.lang.String r0 = "avatar_stickers"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x017d
            if (r5 == 0) goto L_0x01ec
            r10.A0C = r5
            goto L_0x0184
        L_0x01ec:
            r10.A0C = r6
            goto L_0x0184
        L_0x01ef:
            X.PRE r5 = r10.A00(r4)
            r0 = 5
            X.Pd1 r2 = new X.Pd1
            r2.<init>(r10, r0)
            java.lang.String r7 = "stickers"
            r1 = 2131238851(0x7f081fc3, float:1.8093992E38)
            r0 = 2131960378(0x7f13223a, float:1.9557423E38)
            X.PRE r6 = new X.PRE
            r6.<init>(r7, r2, r1, r0)
            boolean r0 = r10.A0T
            if (r0 == 0) goto L_0x0154
            r4.add(r6)
            goto L_0x0154
        L_0x020f:
            int r0 = r6.ordinal()
            switch(r0) {
                case 0: goto L_0x026f;
                case 1: goto L_0x026b;
                case 2: goto L_0x0267;
                case 3: goto L_0x0263;
                case 4: goto L_0x025f;
                case 5: goto L_0x025b;
                case 6: goto L_0x0257;
                case 7: goto L_0x0253;
                case 8: goto L_0x024f;
                case 9: goto L_0x024b;
                case 10: goto L_0x0247;
                case 11: goto L_0x0243;
                case 12: goto L_0x023f;
                case 13: goto L_0x023b;
                case 14: goto L_0x0237;
                case 15: goto L_0x0233;
                case 16: goto L_0x022f;
                case 17: goto L_0x022b;
                case 18: goto L_0x0227;
                case 19: goto L_0x0223;
                case 20: goto L_0x021f;
                case 21: goto L_0x021b;
                default: goto L_0x0216;
            }
        L_0x0216:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x021b:
            X.Nmg r1 = X.C69498Nmg.UNKNOWN
            goto L_0x0116
        L_0x021f:
            X.Nmg r1 = X.C69498Nmg.MESSAGE_LONG_PRESS_VIEW_STICKER_PACK
            goto L_0x0116
        L_0x0223:
            X.Nmg r1 = X.C69498Nmg.MESSAGE_LONG_PRESS_ADD_STICKER
            goto L_0x0116
        L_0x0227:
            X.Nmg r1 = X.C69498Nmg.AI_STICKER_NUX
            goto L_0x0116
        L_0x022b:
            X.Nmg r1 = X.C69498Nmg.REOPEN_AI_STICKER_TRAY
            goto L_0x0116
        L_0x022f:
            X.Nmg r1 = X.C69498Nmg.WALL_COMPOSER
            goto L_0x0116
        L_0x0233:
            X.Nmg r1 = X.C69498Nmg.STICKER_SUGGESTIONS
            goto L_0x0116
        L_0x0237:
            X.Nmg r1 = X.C69498Nmg.REELS_STACKED_TIMELINE
            goto L_0x0116
        L_0x023b:
            X.Nmg r1 = X.C69498Nmg.REELS_GREEN_SCREEN
            goto L_0x0116
        L_0x023f:
            X.Nmg r1 = X.C69498Nmg.AVATAR_STICKER_TAP
            goto L_0x0116
        L_0x0243:
            X.Nmg r1 = X.C69498Nmg.UPSELL_TRAY
            goto L_0x0116
        L_0x0247:
            X.Nmg r1 = X.C69498Nmg.COMMENT_CREATOR_SEARCH
            goto L_0x0116
        L_0x024b:
            X.Nmg r1 = X.C69498Nmg.COMMENT_COMPOSER
            goto L_0x0116
        L_0x024f:
            X.Nmg r1 = X.C69498Nmg.CANVAS_GIF_TOOL
            goto L_0x0116
        L_0x0253:
            X.Nmg r1 = X.C69498Nmg.STORY_VIEWER_STICKER_BUTTON
            goto L_0x0116
        L_0x0257:
            X.Nmg r1 = X.C69498Nmg.STORY_VIEWER_GIF_BUTTON
            goto L_0x0116
        L_0x025b:
            X.Nmg r1 = X.C69498Nmg.NOTES_CREATION_GIF_BUTTON
            goto L_0x0116
        L_0x025f:
            X.Nmg r1 = X.C69498Nmg.NOTES_QUICK_REPLY_STICKER_BUTTON
            goto L_0x0116
        L_0x0263:
            X.Nmg r1 = X.C69498Nmg.DIRECT_SAVED_STICKER
            goto L_0x0116
        L_0x0267:
            X.Nmg r1 = X.C69498Nmg.DIRECT_CREATOR_SEARCH
            goto L_0x0116
        L_0x026b:
            X.Nmg r1 = X.C69498Nmg.DIRECT_COMPOSER_STICKER_SHORTCUT
            goto L_0x0116
        L_0x026f:
            X.Nmg r1 = X.C69498Nmg.DIRECT_COMPOSER_STICKER_BUTTON
            goto L_0x0116
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NJq.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
