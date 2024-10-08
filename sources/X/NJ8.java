package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.litho.LithoView;
import com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.base.IgView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.meta.metaai.components.animation.ui.view.ListeningIndicatorView;
import com.meta.metaai.components.animation.ui.view.SpeechIndicatorView;
import com.meta.metaai.components.voice.animation.transrcipt.widget.DisabledHorizontalScrollView;
import com.meta.metaai.components.voice.animation.transrcipt.widget.UserInputTextView;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class NJ8 extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "MetaAiVoiceFragment";
    public View A00;
    public LithoView A01;
    public IgTextView A02;
    public IgTextView A03;
    public IgTextView A04;
    public IgView A05;
    public IgImageView A06;
    public IgImageView A07;
    public C331157Pu A08;
    public ListeningIndicatorView A09;
    public SpeechIndicatorView A0A;
    public C70973OTu A0B;
    public OZP A0C;
    public I4Z A0D;
    public boolean A0E;
    public boolean A0F = true;
    public 2dZ A0G;
    public DisabledHorizontalScrollView A0H;
    public UUID A0I;
    public boolean A0J = true;
    public final 02m A0K = 02m.A0p;
    public final AnonymousClass0eM A0L = AnonymousClass1YB.A00(new C73655PhU(this, 40));
    public final AnonymousClass0eM A0M;
    public final AnonymousClass0eM A0N;
    public final AnonymousClass0eM A0O = AnonymousClass1YB.A00(new C73655PhU(this, 45));
    public final AnonymousClass0eM A0P = AnonymousClass1YB.A00(new C73655PhU(this, 46));
    public final AnonymousClass0eM A0Q;
    public final AnonymousClass0eM A0R = AnonymousClass1YB.A00(new C73655PhU(this, 47));
    public final AnonymousClass0eM A0S = AnonymousClass1YB.A00(new C73655PhU(this, 48));
    public final ViewTreeObserver.OnGlobalLayoutListener A0T;
    public final String A0U;

    public final void configureActionBar(2da r26) {
        View view;
        AnonymousClass3U9 B32;
        String C6C;
        MessagingUser A002;
        2da r1 = r26;
        0qQ.A0B(r1, 0);
        C331157Pu r2 = this.A08;
        if (r2 != null) {
            r2.A03.A0T(0);
        }
        AnonymousClass0eM r8 = this.A0Q;
        View ETj = r1.ETj(AnonymousClass7TE.A0l(r8), R.layout.direct_thread_action_bar_left_aligned, 0, 0);
        GradientSpinnerAvatarView A0j = DbX.A0j(ETj, R.id.avatar_container);
        C252063oV A012 = 2b1.A01(ETj.requireViewById(R.id.group_photo_faceswarm_stub), false, false);
        0nA.A0d(A0j, JTR.A05(getThemedContext()));
        DirectShareTarget A022 = A02(this);
        if (!(A022 == null || (B32 = 2L2.A00(AnonymousClass7TE.A0l(r8)).B32(A022)) == null || (C6C = B32.C6C()) == null)) {
            UserSession A0l = AnonymousClass7TE.A0l(r8);
            C72330P1v p1v = new C72330P1v(requireActivity(), A0l, C376169Gw.A00(AnonymousClass7TE.A0l(r8), B32.C6a()), C66580MXl.A0g(C6C), B32.C6a(), A0E(this));
            C330087Lj r5 = new C330087Lj(A012, A0j);
            List BRZ = B32.BRZ();
            r5.Eu3(this);
            UserSession A0l2 = AnonymousClass7TE.A0l(r8);
            AnonymousClass34S A003 = AnonymousClass48N.A00(AnonymousClass7TE.A0l(r8), B32);
            ArrayList A042 = AnonymousClass3UE.A04(DbX.A0l(AnonymousClass0t1.A01, r8), BRZ);
            UserSession A0l3 = AnonymousClass7TE.A0l(r8);
            Reel A013 = C66650MaJ.A01(A0l3, C66650MaJ.A00(A0l3, B32));
            boolean A0C2 = AnonymousClass48N.A0C(B32);
            int C6a = B32.C6a();
            if (BRZ.isEmpty()) {
                A002 = null;
            } else {
                A002 = MessagingUser.A00(DbS.A0g(B32.BRZ(), 0));
            }
            r5.A00(A003, this, A0l2, p1v, A002, A013, A042, C6a, 0, A0C2, true);
            C71138Odg.A01(getThemedContext(), r1, p1v);
            Context themedContext = getThemedContext();
            0qQ.A0B(themedContext, 0);
            int i = R.drawable.instagram_sliders_pano_outline_24;
            int A0H2 = 2Yu.A0H(themedContext, R.attr.voiceSelectionButtonIcon);
            if (A0H2 != 0) {
                i = A0H2;
            }
            AnonymousClass3JS r3 = new AnonymousClass3JS(themedContext, i);
            AnonymousClass3JR A0K2 = DbS.A0K();
            A0K2.A0F = r3;
            A0K2.A05 = 2131976717;
            A0K2.A0G = C71401Ok0.A00(p1v, 43);
            0qQ.A0C(C51970G9q.A0P(A0K2, r1), "null cannot be cast to non-null type android.widget.ImageView");
        }
        TextView A0R2 = AnonymousClass7TG.A0R(ETj, R.id.thread_title);
        Context context = ETj.getContext();
        C46334Dcc.A00(A0R2, (C61066Jw4) null, AnonymousClass7TE.A16(context, 2131966424), true);
        TextView A0d = AnonymousClass7TE.A0d(ETj, R.id.thread_presence_digest);
        if (C3262475z.A01(AnonymousClass7TE.A0l(r8)) != null) {
            if (A0d != null) {
                A0d.setText(C3262475z.A01(AnonymousClass7TE.A0l(r8)));
            }
            DbT.A17(context, A0d, 2Yu.A08(getThemedContext()));
            A0d.setVisibility(0);
        }
        r1.ENd(new ColorDrawable(0));
        r1.Eu4(!A0E(this));
        r1.ErJ(new AnonymousClass57Z((Resources.Theme) null, (ColorFilter) null, (ColorFilter) null, (Drawable) null, (Drawable) null, (View.OnClickListener) null, AnonymousClass05K.A00, -2, 0, -2, -2, -2, -2, -2, 2Yu.A0L(getContext(), 16844000, true)));
        C331157Pu r0 = this.A08;
        if (r0 != null && (view = r0.A03.mView) != null) {
            view.post(new C12921TDk(this));
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2;
        Window window;
        View view3 = view;
        0qQ.A0B(view3, 0);
        super.onViewCreated(view3, bundle);
        if (!A0E(this)) {
            2dZ r3 = this.A0G;
            if (r3 != null) {
                r3.A0X(this);
            }
        } else {
            C331157Pu r32 = this.A08;
            if (r32 != null) {
                r32.A03.A0O();
            }
        }
        this.A0A = (SpeechIndicatorView) view3.findViewById(R.id.speech_indicator_view);
        this.A09 = (ListeningIndicatorView) view3.findViewById(R.id.listening_indicator_view);
        View findViewById = view3.findViewById(R.id.keyboard_button);
        0qQ.A0C(findViewById, C273654mx.A00(10));
        C71401Ok0.A01(findViewById, 62, this);
        this.A00 = view3.findViewById(R.id.bot_content_layout);
        this.A03 = JTO.A0X(view3, R.id.bot_instruction_text);
        IgTextView A0X = JTO.A0X(view3, R.id.bot_transcription_text);
        this.A02 = A0X;
        if (A0X != null) {
            AnonymousClass0eM r7 = this.A0Q;
            0lg A0L2 = AnonymousClass7TF.A0L(r7, 0);
            0Tu r6 = 0Tu.A05;
            A0X.setLines(DbS.A04(r6, A0L2, 36608922547132173L));
            TextPaint paint = A0X.getPaint();
            0qQ.A07(paint);
            OZP ozp = new OZP(new C70836ONi(paint, A0X.getLineSpacingExtra(), A0X.getLineSpacingMultiplier(), A0X.getWidth(), A0X.getCompoundPaddingLeft(), A0X.getCompoundPaddingRight(), A0X.getMaxLines(), 182.A01(r6, AnonymousClass7TF.A0L(r7, 0), 36608922546870028L), A0X.getIncludeFontPadding()));
            this.A0C = ozp;
            ozp.A02 = new O70(A0X);
        }
        DisabledHorizontalScrollView disabledHorizontalScrollView = (DisabledHorizontalScrollView) view3.findViewById(R.id.user_transcription_text_parent);
        this.A0H = disabledHorizontalScrollView;
        UserInputTextView userInputTextView = (UserInputTextView) view3.findViewById(R.id.user_transcription_text);
        if (!(disabledHorizontalScrollView == null || userInputTextView == null)) {
            Context requireContext = requireContext();
            this.A0B = new C70973OTu(disabledHorizontalScrollView, userInputTextView, 0nA.A00(requireContext, 16.0f), 0nA.A00(requireContext, 10.0f), 0nA.A00(requireContext, 120.0f) / 1000.0f, 0nA.A00(requireContext, 12.0f) / 1000.0f, 0nA.A00(requireContext, 12.0f) / 1000.0f);
        }
        this.A04 = JTO.A0X(view3, R.id.status_text);
        IgImageView A0Y = JTO.A0Y(view3, R.id.mute_button);
        this.A06 = A0Y;
        if (A0Y != null) {
            C71401Ok0.A01(A0Y, 63, this);
        }
        IgImageView A0Y2 = JTO.A0Y(view3, R.id.speaker_button);
        this.A07 = A0Y2;
        if (A0Y2 != null) {
            C71401Ok0.A01(A0Y2, 64, this);
        }
        LithoView findViewById2 = view3.findViewById(R.id.xma_attachment);
        this.A01 = findViewById2;
        AnonymousClass7TH.A0R(findViewById2);
        LithoView lithoView = this.A01;
        if (lithoView != null) {
            lithoView.setComponent(new C53636Grp((C53033GhO) this.A0N.getValue()));
        }
        this.A05 = (IgView) view3.findViewById(R.id.dummy_search_plugin_xma);
        FragmentActivity activity = getActivity();
        if (!(activity == null || (window = activity.getWindow()) == null)) {
            window.addFlags(128);
        }
        07U r62 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass0xx A002 = AnonymousClass07a.A00(viewLifecycleOwner);
        MHI mhi = new MHI(viewLifecycleOwner, r62, this, (AnonymousClass4D7) null, 6);
        19B r33 = 19B.A00;
        AnonymousClass07Z A0I2 = JTP.A0I(this, r33, mhi, A002);
        1Eo.A05(r33, new MHI(A0I2, r62, this, (AnonymousClass4D7) null, 7), AnonymousClass07a.A00(A0I2));
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            view2 = activity2.findViewById(R.id.layout_container_parent);
        } else {
            view2 = null;
        }
        if (view2 instanceof CoordinatorLayout) {
            ((CoordinatorLayout) view2).setStatusBarBackground((Drawable) null);
        }
        A04(1);
        if (this.A0J) {
            this.A0J = false;
            A0C(this, false);
        }
    }

    public static final long A00(NJ8 nj8) {
        return Long.parseLong(182.A04(0Tu.A05, DbY.A0R(nj8.A0Q), 36882348756763071L));
    }

    private final C69503Nml A01() {
        C69287Nin nin;
        Bundle bundle = this.mArguments;
        if (bundle == null || (nin = (C69287Nin) 2Yc.A00(bundle)) == null) {
            nin = C69287Nin.UNKNOWN;
        }
        int ordinal = nin.ordinal();
        if (ordinal == 2) {
            return C69503Nml.A0I;
        }
        if (ordinal == 0) {
            return C69503Nml.A09;
        }
        if (ordinal == 1) {
            return C69503Nml.A04;
        }
        if (ordinal == 3) {
            return C69503Nml.A0J;
        }
        throw AnonymousClass7TE.A1K();
    }

    public static final DirectShareTarget A02(NJ8 nj8) {
        Bundle bundle = nj8.mArguments;
        if (bundle != null) {
            return (DirectShareTarget) 2Yc.A01(bundle, DirectShareTarget.class, "arg_meta_ai_share_target");
        }
        return null;
    }

    public static final Object A03(NJ8 nj8, AnonymousClass4D7 r6) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = 1IW.A02;
        1IW r3 = new 1IW(1, 1Ey.A02(r6));
        r3.A0I();
        FragmentActivity activity = nj8.getActivity();
        if (activity == null) {
            r3.resumeWith(false);
        } else {
            JTP.A11(activity, new C19253WRm(r3, 1), "android.permission.RECORD_AUDIO");
        }
        return r3.A0E();
    }

    private final void A04(int i) {
        String str;
        0wc r1 = (0wc) this.A0M.getValue();
        C69503Nml A012 = A01();
        UUID uuid = this.A0I;
        boolean z = !A0E(this);
        DirectShareTarget A022 = A02(this);
        if (A022 != null) {
            str = A022.A08();
        } else {
            str = null;
        }
        0qQ.A0B(r1, 0);
        AnonymousClass7TF.A1C(A012, 2, uuid);
        C48798EkM.A00(r1, new C73961Pmf(uuid, A012, str, i, z ? 1 : 0, 2));
    }

    public static final void A06(NJ8 nj8) {
        View view;
        AnonymousClass0eM r3 = nj8.A0N;
        if (C70353O3f.A00(C66584MXp.A0Q(r3).A01)) {
            if (Build.VERSION.SDK_INT >= 30 && (view = nj8.mView) != null) {
                view.performHapticFeedback(16);
            }
            boolean z = C66584MXp.A0Q(r3).A0A;
            MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession = ((C53033GhO) r3.getValue()).A00;
            if (metaAiRsysSdkRealTimeSession != null) {
                metaAiRsysSdkRealTimeSession.A02(z);
            }
        }
    }

    public static final void A07(NJ8 nj8) {
        View view;
        AnonymousClass0eM r3 = nj8.A0N;
        if (C70353O3f.A00(C66584MXp.A0Q(r3).A01)) {
            if (Build.VERSION.SDK_INT >= 30 && (view = nj8.mView) != null) {
                view.performHapticFeedback(16);
            }
            boolean z = C66584MXp.A0Q(r3).A08;
            MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession = ((C53033GhO) r3.getValue()).A00;
            if (metaAiRsysSdkRealTimeSession != null) {
                metaAiRsysSdkRealTimeSession.A01(z);
            }
        }
    }

    public static final void A08(NJ8 nj8) {
        View view;
        if (Build.VERSION.SDK_INT >= 30 && (view = nj8.mView) != null) {
            view.performHapticFeedback(16);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0071, code lost:
        if (r4 != null) goto L_0x004c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0A(X.NJ8 r5) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 0
            r0 = 30
            if (r1 < r0) goto L_0x0074
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            if (r0 == 0) goto L_0x0074
            android.view.WindowManager r0 = r0.getWindowManager()
            if (r0 == 0) goto L_0x0074
            android.view.WindowMetrics r0 = r0.getCurrentWindowMetrics()
            if (r0 == 0) goto L_0x0074
            android.view.WindowInsets r1 = r0.getWindowInsets()
            if (r1 == 0) goto L_0x0074
            int r0 = android.view.WindowInsets.Type.systemBars()
            android.graphics.Insets r0 = r1.getInsetsIgnoringVisibility(r0)
            if (r0 == 0) goto L_0x0074
            int r2 = r0.top
        L_0x002b:
            android.view.View r1 = r5.mView
            if (r1 == 0) goto L_0x0036
            r0 = 2131442695(0x7f0b3c07, float:1.8507437E38)
            android.view.View r4 = r1.findViewById(r0)
        L_0x0036:
            boolean r0 = A0E(r5)
            r3 = 0
            if (r0 != 0) goto L_0x0071
            if (r4 == 0) goto L_0x0057
            X.2dZ r0 = r5.A0G
            if (r0 == 0) goto L_0x006f
            int r0 = r0.AYI()
        L_0x0047:
            int r0 = r0 + r2
            int r0 = -r0
            r4.setTop(r0)
        L_0x004c:
            android.content.Context r0 = r5.requireContext()
            int r0 = X.0nA.A05(r0)
            r4.setBottom(r0)
        L_0x0057:
            com.meta.metaai.components.animation.ui.view.ListeningIndicatorView r2 = r5.A09
            if (r2 == 0) goto L_0x0069
            android.view.View r0 = r5.mView
            if (r0 == 0) goto L_0x006d
            int r1 = r0.getBottom()
        L_0x0063:
            int r0 = X.AnonymousClass2uJ.A00
            int r1 = r1 + r0
            r2.setBottom(r1)
        L_0x0069:
            r5.A0D(r3)
            return
        L_0x006d:
            r1 = 0
            goto L_0x0063
        L_0x006f:
            r0 = 0
            goto L_0x0047
        L_0x0071:
            if (r4 == 0) goto L_0x0057
            goto L_0x004c
        L_0x0074:
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            int r2 = X.2db.A01(r0)
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NJ8.A0A(X.NJ8):void");
    }

    public static final void A0B(NJ8 nj8, Integer num) {
        String str;
        0wc r1 = (0wc) nj8.A0M.getValue();
        C69503Nml A012 = nj8.A01();
        UUID uuid = nj8.A0I;
        boolean z = !A0E(nj8);
        DirectShareTarget A022 = A02(nj8);
        if (A022 != null) {
            str = A022.A08();
        } else {
            str = null;
        }
        C51973G9u.A1E(r1, A012, uuid);
        C48798EkM.A00(r1, new C73962Pmg(num, uuid, A012, str, z ? 1 : 0, 0));
    }

    public static final void A0C(NJ8 nj8, boolean z) {
        C69287Nin nin;
        String str;
        String str2;
        Bundle bundle = nj8.mArguments;
        if (bundle == null || (nin = (C69287Nin) 2Yc.A00(bundle)) == null) {
            nin = C69287Nin.UNKNOWN;
        }
        int ordinal = nin.ordinal();
        if (ordinal == 2 || ordinal == 0) {
            str = "meta_ai_inbox_search_bar";
        } else if (ordinal != 1) {
            str = null;
        } else {
            Bundle bundle2 = nj8.mArguments;
            if (bundle2 != null) {
                str2 = bundle2.getString("DirectFragment.ENTRY_POINT");
            } else {
                str2 = null;
            }
            str = 002.A0R("meta_ai_", str2);
        }
        nj8.A0F = true;
        nj8.A0I = AnonymousClass0HM.A00();
        ((C53033GhO) nj8.A0N.getValue()).A02(nj8.requireContext(), nj8.getViewLifecycleOwner(), DbT.A10(nj8.A0I), str, C66580MXl.A14(nj8, 12), A00(nj8), false, z);
        02m r2 = nj8.A0K;
        r2.markerStart(894512288);
        r2.markerAnnotate(894512288, "entrypoint", str);
    }

    private final void A0D(boolean z) {
        ViewGroup viewGroup;
        Object obj = this.mView;
        while ((obj instanceof ViewGroup) && (viewGroup = (ViewGroup) obj) != null) {
            viewGroup.setClipChildren(z);
            viewGroup.setClipToPadding(z);
            obj = viewGroup.getParent();
        }
    }

    public static final boolean A0E(NJ8 nj8) {
        Bundle bundle = nj8.mArguments;
        if (bundle != null) {
            return bundle.getBoolean("arg_is_bottom_sheet", true);
        }
        return true;
    }

    public final String getModuleName() {
        return this.A0U;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0Q);
    }

    public NJ8() {
        C73655PhU phU = new C73655PhU(this, 44);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C73902Pld(new C73655PhU(this, 49), 0));
        this.A0N = DbS.A0I(new C73902Pld(A002, 1), phU, new C73665Phe(15, A002, (Object) null), DbS.A0z(C53033GhO.class));
        this.A0M = AnonymousClass1YB.A00(new C73655PhU(this, 41));
        UUID A003 = AnonymousClass0HM.A00();
        0qQ.A07(A003);
        this.A0I = A003;
        this.A0T = new C71444Okj(this, 0);
        this.A0U = __redex_internal_original_name;
        this.A0Q = C227642jf.A02(this);
    }

    public static final void A05(NJ8 nj8) {
        if (A0E(nj8)) {
            FragmentActivity activity = nj8.getActivity();
            AnonymousClass37D r1 = null;
            if (activity != null) {
                r1 = DbT.A0i(activity);
            }
            if ((r1 instanceof AnonymousClass37F) && r1 != null) {
                r1.A0T(AnonymousClass05K.A02);
            }
        }
    }

    public static final void A09(NJ8 nj8) {
        FragmentActivity activity = nj8.getActivity();
        if (activity == null) {
            return;
        }
        if (0qQ.A0K(Looper.myLooper(), Looper.getMainLooper())) {
            A08(nj8);
        } else {
            AnonymousClass7TF.A0D().post(new C73201PYf(activity, nj8));
        }
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.07Z, X.NJ8, androidx.fragment.app.Fragment, java.lang.Object] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1249627068);
        0qQ.A0B(layoutInflater, 0);
        this.A08 = C66582MXn.A0f(this);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            AnonymousClass0eM r3 = this.A0Q;
            new C55964HqV(activity, AnonymousClass7TE.A0l(r3), new P31(this)).A00(182.A04(0Tu.A05, DbT.A0X(r3), 36887781889147660L), false);
        }
        if (!A0E(this)) {
            this.A0G = 2dZ.A0t.A05(this);
        }
        this.A0N.getValue();
        C73565Pfm.A02(this, DbW.A0E(this), 13);
        View inflate = layoutInflater.inflate(R.layout.meta_ai_voice_sheet, viewGroup, false);
        AnonymousClass0fD.A09(1927400536, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1800369224);
        super.onDestroy();
        A04(14);
        AnonymousClass0fD.A09(1202625140, A022);
    }

    public final void onDestroyView() {
        Window window;
        int A022 = AnonymousClass0fD.A02(186110188);
        super.onDestroyView();
        this.A00 = null;
        this.A03 = null;
        this.A02 = null;
        this.A0B = null;
        this.A0C = null;
        this.A05 = null;
        this.A06 = null;
        this.A07 = null;
        2dZ r0 = this.A0G;
        if (r0 != null) {
            r0.setTitle((String) null);
        }
        2dZ r02 = this.A0G;
        if (r02 != null) {
            r02.EnO((CharSequence) null);
        }
        this.A0A = null;
        this.A09 = null;
        this.A04 = null;
        FragmentActivity activity = getActivity();
        if (!(activity == null || (window = activity.getWindow()) == null)) {
            window.clearFlags(128);
        }
        AnonymousClass0fD.A09(1949745019, A022);
    }

    public final void onPause() {
        ViewTreeObserver viewTreeObserver;
        int A022 = AnonymousClass0fD.A02(789616974);
        NJ8.super.onPause();
        boolean z = true;
        A0D(true);
        View view = this.mView;
        if (!(view == null || (viewTreeObserver = view.getViewTreeObserver()) == null)) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.A0T);
        }
        A09(this);
        02m r3 = this.A0K;
        r3.markerPoint(894512288, "on_stop");
        r3.markerEnd(894512288, 4);
        AnonymousClass0eM r32 = this.A0N;
        if (C66584MXp.A0Q(r32).A01 == HMJ.FAILED || C66584MXp.A0Q(r32).A01 == HMJ.ENDED) {
            z = false;
        }
        this.A0F = z;
        ((C53033GhO) r32.getValue()).A03(requireContext(), getViewLifecycleOwner(), C66580MXl.A14(this, 13), A00(this));
        ((C53033GhO) r32.getValue()).A01();
        AnonymousClass0fD.A09(-1451463298, A022);
    }

    public final void onResume() {
        ViewTreeObserver viewTreeObserver;
        int A022 = AnonymousClass0fD.A02(-202112452);
        super.onResume();
        A0D(false);
        View view = this.mView;
        if (!(view == null || (viewTreeObserver = view.getViewTreeObserver()) == null)) {
            viewTreeObserver.addOnGlobalLayoutListener(this.A0T);
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            AnonymousClass2uJ.A04(activity, activity.getColor(R.color.igds_transparent_navigation_bar));
        }
        AnonymousClass0fD.A09(-1752082552, A022);
    }
}
