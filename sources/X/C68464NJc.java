package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.avatars.coinflip.AvatarCoinFlipConfig;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.NJc  reason: case insensitive filesystem */
public final class C68464NJc extends AnonymousClass4DH implements AnonymousClass4DR, C268594df, C74332Pt8 {
    public static final String __redex_internal_original_name = "DirectStickerTrayFragment";
    public int A00;
    public int A01;
    public C74511Pw6 A02;
    public C69319NjK A03;
    public AnonymousClass37D A04;
    public String A05;
    public ViewGroup A06;
    public AnonymousClass7L0 A07;
    public OLS A08;
    public C72206OyW A09;
    public DirectThreadKey A0A;
    public String A0B;
    public List A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final AnonymousClass0eM A0G = C227642jf.A02(this);
    public final AnonymousClass06Q A0H = new C71495Olk(this, 0);
    public final String A0I = "direct_sticker_tray_fragment";
    public final boolean A0J = true;
    public final boolean A0K = true;

    public final void ADi(AnonymousClass7L0 r2) {
        0qQ.A0B(r2, 0);
        this.A07 = r2;
        A02();
    }

    public final int AqL() {
        return -1;
    }

    public final float CMx() {
        return 0.8f;
    }

    public final boolean Erf() {
        return true;
    }

    public final void onAttach(Context context) {
        0qQ.A0B(context, 0);
        C68464NJc.super.onAttach(context);
        C394009xO.A00(context, AnonymousClass7TE.A0l(this.A0G));
    }

    public final void onAttachFragment(Fragment fragment) {
        FragmentActivity activity;
        Resources.Theme theme;
        0qQ.A0B(fragment, 0);
        AnonymousClass7L0 r1 = this.A07;
        if (r1 != null && (fragment instanceof C74332Pt8)) {
            ((C74332Pt8) fragment).ADi(r1);
        }
        if (fragment instanceof NJq) {
            ((NJq) fragment).A07 = new O6V(this);
        } else if (fragment instanceof K3S) {
            ((K3S) fragment).A00 = new P0Z(this);
        } else if (fragment instanceof C68469NJh) {
            ((C68469NJh) fragment).A01 = new O6W(this);
        } else if (fragment instanceof K6I) {
            if (!(AnonymousClass1GD.A03() || (activity = getActivity()) == null || (theme = activity.getTheme()) == null)) {
                theme.applyStyle(R.style.MusicCreationLightOverlayTheme, true);
            }
            ((K6I) fragment).A03 = new C65507LuV(this, 3);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle requireArguments = requireArguments();
        this.A06 = DbU.A0C(view, R.id.direct_sticker_tray_root_container);
        boolean z = requireArguments.getBoolean("param_extra_should_hide_drag_handler", false);
        View A0G2 = AnonymousClass7TF.A0G(view, R.id.drag_handle);
        if (z) {
            A0G2.setVisibility(8);
        } else if (2eO.A00(requireContext())) {
            C71401Ok0.A01(A0G2, 34, this);
            2eQ.A06(A0G2, 500);
            DbU.A12(requireContext(), A0G2, 2131956164);
        }
        this.A0E = requireArguments.getBoolean("param_extra_avatar_enabled", false);
        this.A0F = requireArguments.getBoolean("param_extra_is_msys_thread", false);
        this.A0C = requireArguments.getStringArrayList("param_extra_social_stickers_user_ids");
        C69319NjK njK = C69319NjK.values()[requireArguments.getInt("param_extra_entry_point", 0)];
        this.A03 = njK;
        if (njK == null) {
            0qQ.A0F("entryPoint");
            throw AnonymousClass00P.createAndThrow();
        }
        if (njK == C69319NjK.AI_STICKER_NUX) {
            this.A05 = requireArguments.getString("param_extra_bottom_sheet_session_id", "");
            A05(this, "");
        } else {
            A04(this);
        }
        A02();
        ViewGroup viewGroup = this.A06;
        if (viewGroup != null) {
            this.A08 = new OLS(requireContext(), viewGroup);
        }
        getChildFragmentManager().A0s(this.A0H);
    }

    public static final C74472PvS A01(P40 p40) {
        if (!(p40 instanceof C74472PvS)) {
            if (!(p40 instanceof C273494mf)) {
                return null;
            }
            p40 = new P40(p40);
        }
        return p40;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x002e: MOVE  (r1v3 X.Pt8) = (r1v2 X.Pt8)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    private final void A02() {
        /*
            r3 = this;
            X.7L0 r1 = r3.A07
            if (r1 == 0) goto L_0x0019
            android.view.View r0 = r3.mView
            if (r0 == 0) goto L_0x0019
            android.view.ViewGroup r0 = r3.A06
            if (r0 == 0) goto L_0x0019
            android.graphics.drawable.Drawable r2 = r0.getBackground()
            if (r2 == 0) goto L_0x0019
            int r1 = r1.A09
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC
            r2.setColorFilter(r1, r0)
        L_0x0019:
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L_0x0037
            X.0hq r1 = r3.getChildFragmentManager()
            r0 = 2131433135(0x7f0b16af, float:1.8488047E38)
            androidx.fragment.app.Fragment r1 = r1.A0P(r0)
            boolean r0 = r1 instanceof X.C74332Pt8
            if (r0 == 0) goto L_0x0037
            X.Pt8 r1 = (X.C74332Pt8) r1
            if (r1 == 0) goto L_0x0037
            X.7L0 r0 = r3.A07
            r1.ADi(r0)
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68464NJc.A02():void");
    }

    public static final void A03(AvatarCoinFlipConfig avatarCoinFlipConfig, C68464NJc nJc) {
        E1W A002 = C48370EdR.A00(avatarCoinFlipConfig, "ig_direct_thread", 182.A06(0Tu.A05, DbT.A0X(nJc.A0G), 36322340853852243L));
        nJc.A0D = true;
        AnonymousClass37D r1 = nJc.A04;
        if (r1 != null) {
            r1.A0T(AnonymousClass05K.A04);
        }
        C66584MXp.A0k(A002, DbW.A0C(nJc));
        nJc.A0D = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00d3, code lost:
        if (r3 == X.C69319NjK.A0B) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00df, code lost:
        if (r3 == X.C69319NjK.A0B) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x009d, code lost:
        if (r5 == X.C69319NjK.A06) goto L_0x009f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.C68464NJc r46) {
        /*
            r4 = r46
            android.os.Bundle r3 = r4.requireArguments()
            java.lang.String r44 = "param_extra_initial_tab"
            java.lang.String r1 = "stickers"
            r0 = r44
            java.lang.String r43 = r3.getString(r0, r1)
            java.lang.String r2 = "param_extra_initial_search_term"
            java.lang.String r1 = ""
            java.lang.String r0 = r3.getString(r2, r1)
            r4.A0B = r0
            java.lang.String r42 = "param_extra_use_initial_search_term_if_no_query"
            r6 = 1
            r0 = r42
            boolean r41 = r3.getBoolean(r0, r6)
            java.lang.String r40 = "param_extra_hide_initial_search_term"
            r0 = r40
            boolean r39 = r3.getBoolean(r0, r6)
            java.lang.String r0 = "param_extra_show_like_button"
            r5 = 0
            boolean r38 = r3.getBoolean(r0, r5)
            java.lang.String r37 = "param_extra_is_broadcast_thread"
            r0 = r37
            boolean r36 = r3.getBoolean(r0, r5)
            java.lang.String r35 = "param_extra_gif_enabled"
            r0 = r35
            boolean r34 = r3.getBoolean(r0, r6)
            java.lang.String r33 = "param_extra_sticker_enabled"
            r0 = r33
            boolean r32 = r3.getBoolean(r0, r6)
            java.lang.String r31 = "param_extra_is_poll_creation_enabled"
            r0 = r31
            boolean r30 = r3.getBoolean(r0, r5)
            java.lang.String r29 = "param_extra_ai_sticker_enabled"
            r0 = r29
            boolean r28 = r3.getBoolean(r0, r5)
            java.lang.String r27 = "param_extra_imagine_enabled"
            r0 = r27
            boolean r26 = r3.getBoolean(r0, r5)
            java.lang.String r25 = "param_extra_saved_sticker_enabled"
            r0 = r25
            boolean r24 = r3.getBoolean(r0, r5)
            java.lang.String r23 = "param_extra_sticker_packs_enabled"
            r0 = r23
            boolean r22 = r3.getBoolean(r0, r5)
            java.lang.String r13 = "param_extra_is_location_sticker_enabled"
            boolean r9 = r3.getBoolean(r13, r5)
            java.lang.String r12 = "param_extra_is_add_yours_sticker_enabled"
            boolean r21 = r3.getBoolean(r12)
            java.lang.String r11 = "param_extra_is_cutout_sticker_enabled"
            boolean r20 = r3.getBoolean(r11, r5)
            java.lang.String r10 = "param_extra_is_music_sticker_enabled"
            boolean r19 = r3.getBoolean(r10, r5)
            java.lang.String r8 = "param_extra_should_hide_tab_container"
            boolean r18 = r3.getBoolean(r8, r5)
            X.NjK r5 = r4.A03
            java.lang.String r16 = "entryPoint"
            if (r5 == 0) goto L_0x00be
            X.NjK r0 = X.C69319NjK.DIRECT_CREATOR_SEARCH
            if (r5 == r0) goto L_0x009f
            X.NjK r0 = X.C69319NjK.COMMENT_CREATOR_SEARCH
            r14 = 0
            if (r5 != r0) goto L_0x00a0
        L_0x009f:
            r14 = 1
        L_0x00a0:
            java.lang.String r7 = "param_extra_direct_thread_key"
            android.os.Parcelable r0 = r3.getParcelable(r7)
            com.instagram.model.direct.DirectThreadKey r0 = (com.instagram.model.direct.DirectThreadKey) r0
            r4.A0A = r0
            java.lang.String r6 = "param_extra_bottom_sheet_session_id"
            java.lang.String r0 = r3.getString(r6, r1)
            r4.A05 = r0
            X.0eM r0 = r4.A0G
            X.0lg r17 = X.DbT.A0X(r0)
            java.lang.String r15 = r4.A0B
            if (r15 != 0) goto L_0x00c6
            java.lang.String r16 = "searchTerm"
        L_0x00be:
            X.0qQ.A0F(r16)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00c6:
            boolean r0 = r4.A0E
            r46 = r0
            if (r26 == 0) goto L_0x00d5
            X.NjK r3 = r4.A03
            if (r3 == 0) goto L_0x00be
            X.NjK r0 = X.C69319NjK.MESSAGE_LONG_PRESS_ADD_STICKER
            r1 = 1
            if (r3 != r0) goto L_0x00d6
        L_0x00d5:
            r1 = 0
        L_0x00d6:
            if (r9 == 0) goto L_0x00e1
            X.NjK r3 = r4.A03
            if (r3 == 0) goto L_0x00be
            X.NjK r0 = X.C69319NjK.MESSAGE_LONG_PRESS_ADD_STICKER
            r9 = 1
            if (r3 != r0) goto L_0x00e2
        L_0x00e1:
            r9 = 0
        L_0x00e2:
            boolean r0 = r4.A0F
            r45 = r0
            X.NjK r5 = r4.A03
            if (r5 == 0) goto L_0x00be
            com.instagram.model.direct.DirectThreadKey r0 = r4.A0A
            r26 = r0
            java.util.List r0 = r4.A0C
            r16 = r0
            java.lang.String r3 = r4.A05
            if (r3 != 0) goto L_0x00f9
            java.lang.String r16 = "bottomSheetSessionId"
            goto L_0x00be
        L_0x00f9:
            android.os.Bundle r2 = X.DbV.A0C(r2, r15)
            r15 = r42
            r0 = r41
            r2.putBoolean(r15, r0)
            r15 = r39
            r0 = r40
            r2.putBoolean(r0, r15)
            r15 = r44
            r0 = r43
            r2.putString(r15, r0)
            java.lang.String r0 = "param_extra_is_creator_search"
            r2.putBoolean(r0, r14)
            java.lang.String r14 = "param_extra_show_like_sticker"
            r0 = r38
            r2.putBoolean(r14, r0)
            r14 = r37
            r0 = r36
            r2.putBoolean(r14, r0)
            r14 = r31
            r0 = r30
            r2.putBoolean(r14, r0)
            r14 = r35
            r0 = r34
            r2.putBoolean(r14, r0)
            r14 = r33
            r0 = r32
            r2.putBoolean(r14, r0)
            java.lang.String r14 = "param_extra_avatar_enabled"
            r0 = r46
            r2.putBoolean(r14, r0)
            r14 = r29
            r0 = r28
            r2.putBoolean(r14, r0)
            r0 = r27
            r2.putBoolean(r0, r1)
            r1 = r25
            r0 = r24
            r2.putBoolean(r1, r0)
            r1 = r22
            r0 = r23
            r2.putBoolean(r0, r1)
            r2.putBoolean(r13, r9)
            r0 = r21
            r2.putBoolean(r12, r0)
            r0 = r20
            r2.putBoolean(r11, r0)
            r0 = r19
            r2.putBoolean(r10, r0)
            java.lang.String r1 = "param_extra_is_msys_thread"
            r0 = r45
            r2.putBoolean(r1, r0)
            r0 = r18
            r2.putBoolean(r8, r0)
            java.lang.String r0 = "param_extra_sticker_tray_entrypoint"
            r2.putSerializable(r0, r5)
            r0 = r26
            r2.putParcelable(r7, r0)
            r2.putString(r6, r3)
            if (r16 == 0) goto L_0x0191
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r16)
            java.lang.String r0 = "param_extra_social_stickers_user_ids"
            r2.putStringArrayList(r0, r1)
        L_0x0191:
            X.NJq r3 = new X.NJq
            r3.<init>()
            r3.setArguments(r2)
            r0 = r17
            X.AnonymousClass0Dg.A00(r2, r0)
            X.0s1 r1 = X.DbW.A0C(r4)
            r0 = 2131433135(0x7f0b16af, float:1.8488047E38)
            r1.A0A(r3, r0)
            r1.A0K()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68464NJc.A04(X.NJc):void");
    }

    public static final void A05(C68464NJc nJc, String str) {
        String str2;
        AnonymousClass0eM r1 = nJc.A0G;
        if (C395109zE.A00(AnonymousClass7TE.A0l(r1))) {
            C74511Pw6 pw6 = nJc.A02;
            if (pw6 != null) {
                pw6.EuP();
                return;
            }
            return;
        }
        UserSession A0l = AnonymousClass7TE.A0l(r1);
        OJY ojy = new OJY(nJc);
        C69319NjK njK = nJc.A03;
        if (njK == null) {
            str2 = "entryPoint";
        } else {
            String str3 = nJc.A05;
            if (str3 == null) {
                str2 = "bottomSheetSessionId";
            } else {
                Bundle A0A2 = DbY.A0A(A0l);
                NJZ njz = new NJZ();
                DbU.A1D(A0A2, A0l);
                A0A2.putString("param_extra_initial_search_term", str);
                A0A2.putString("param_extra_bottom_sheet_session_id", str3);
                A0A2.putString("param_extra_entry_point", njK.toString());
                njz.setArguments(A0A2);
                njz.A07 = ojy;
                Integer num = AnonymousClass05K.A0j;
                C71048OaQ.A00(C69447Nlr.AI_STICKER, DbS.A0O(NJZ.__redex_internal_original_name), A0l, (C69332NjX) null, (Boolean) null, num, AnonymousClass05K.A00, (Integer) null, (String) null, str3);
                C66584MXp.A0k(njz, DbW.A0C(nJc));
                return;
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ boolean AB6() {
        return false;
    }

    public final /* synthetic */ boolean ANU() {
        return false;
    }

    public final View C4U() {
        return this.mView;
    }

    public final int C8P() {
        return 0;
    }

    public final boolean CPc() {
        return this.A0J;
    }

    public final float Cmb() {
        if (this.A0D) {
            return 0.65f;
        }
        return 1.0f;
    }

    public final String getModuleName() {
        return this.A0I;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0G);
    }

    public final boolean isContainerFragment() {
        return this.A0K;
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        C74472PvS A012 = A01(A00());
        if (A012 != null) {
            A012.onBottomSheetPositionChanged(i, i2);
        }
        OLS ols = this.A08;
        if (ols == null) {
            0qQ.A0F("roundedCornerHelper");
            throw AnonymousClass00P.createAndThrow();
        } else {
            ols.A00(i);
        }
    }

    private final Fragment A00() {
        if (isAdded()) {
            return getChildFragmentManager().A0P(R.id.fragment_container);
        }
        return null;
    }

    public final int AhP(Context context) {
        return Dbb.A02(context);
    }

    public final /* synthetic */ float CoU() {
        return 0.8f;
    }

    public final void DMt() {
        C74472PvS A012 = A01(A00());
        if (A012 != null) {
            A012.DMt();
        }
        this.A00 = 0;
    }

    public final void DMu(int i) {
        C74472PvS A012 = A01(A00());
        if (A012 != null) {
            A012.DMu(i);
        }
        AnonymousClass37D r1 = this.A04;
        if (r1 != null) {
            r1.A0T(AnonymousClass05K.A04);
        }
        this.A00 = i;
    }

    public final boolean isScrolledToTop() {
        C74472PvS A012 = A01(A00());
        if (A012 != null) {
            return A012.isScrolledToTop();
        }
        return true;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Fragment A002;
        super.onActivityResult(i, i2, intent);
        if (getContext() != null && (A002 = A00()) != null) {
            A002.onActivityResult(i, i2, intent);
        }
    }

    public final boolean onBackPressed() {
        String str;
        AnonymousClass4DR A002 = A00();
        if ((A002 instanceof AnonymousClass4DR) && A002.onBackPressed()) {
            return true;
        }
        if (A002 instanceof NJq) {
            NJq nJq = (NJq) A002;
            C74586PxZ pxZ = nJq.A0C;
            if (pxZ != null) {
                str = ((PRE) pxZ).A02;
            } else {
                str = null;
            }
            if ("stickers".equals(str)) {
                AnonymousClass4DR r1 = nJq.A04;
                if ((r1 instanceof AnonymousClass4DR) && r1.onBackPressed()) {
                    return true;
                }
            }
        }
        if (getChildFragmentManager().A0M() <= 0) {
            return false;
        }
        getChildFragmentManager().A0c();
        return true;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0008: MOVE  (r1v1 X.NJq) = (r1v0 X.NJq)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void onBottomSheetClosed() {
        /*
            r3 = this;
            androidx.fragment.app.Fragment r1 = r3.A00()
            boolean r0 = r1 instanceof X.NJq
            if (r0 == 0) goto L_0x0031
            X.NJq r1 = (X.NJq) r1
            if (r1 == 0) goto L_0x0031
            X.PxZ r0 = r1.A0C
            if (r0 == 0) goto L_0x0031
            X.PRE r0 = (X.PRE) r0
            java.lang.String r2 = r0.A02
            X.0eM r0 = r3.A0G
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.1Am r1 = X.1Al.A01(r0)
            X.O6X r0 = new X.O6X
            r0.<init>(r1)
            X.0xa r0 = r0.A00
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "last_used_sticker_tab"
            r1.E5g(r0, r2)
            r1.apply()
        L_0x0031:
            X.Pw6 r0 = r3.A02
            if (r0 == 0) goto L_0x0038
            r0.Du2()
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68464NJc.onBottomSheetClosed():void");
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-362236174);
        C68464NJc.super.onCreate(bundle);
        this.A04 = DbX.A0i(this);
        0lg A0R = DbY.A0R(this.A0G);
        this.A09 = (C72206OyW) A0R.A01(C72206OyW.class, new C73662Phb(A0R, 20));
        AnonymousClass0fD.A09(-998890101, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-528768750);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.fragment_direct_sticker_tray, false);
        AnonymousClass0fD.A09(-732933243, A022);
        return A0D2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(27460493);
        super.onDestroy();
        0hq childFragmentManager = getChildFragmentManager();
        childFragmentManager.A0F.remove(this.A0H);
        AnonymousClass0fD.A09(866773520, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1653033494);
        super.onDestroyView();
        this.A06 = null;
        AnonymousClass0fD.A09(960143085, A022);
    }
}
