package X;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.model.reels.Reel;
import com.instagram.reels.common.ui.StoryTypeSelectorView;
import com.instagram.stickersearch.AvatarStickerInteractor;
import com.instagram.user.model.User;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;

/* renamed from: X.6hr  reason: invalid class name and case insensitive filesystem */
public final class C314226hr implements AnonymousClass6Z1, C267624bv, C314236hs, C314256hu {
    public C255773uh A00;
    public C250973mM A01;
    public C309426Yf A02;
    public C21225XPt A03;
    public Integer A04 = AnonymousClass05K.A0C;
    public String A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final int A09;
    public final Context A0A;
    public final View A0B;
    public final LinearLayout A0C;
    public final AnonymousClass4DH A0D;
    public final AnonymousClass0iw A0E;
    public final UserSession A0F;
    public final C252063oV A0G;
    public final C252063oV A0H;
    public final C314356i4 A0I;
    public final C314346i3 A0J;
    public final C310016aI A0K;
    public final C314206hp A0L;
    public final C314266hv A0M;
    public final C314306hz A0N;
    public final AnonymousClass6ZN A0O;
    public final ArrayList A0P;
    public final ArrayList A0Q = new ArrayList();
    public final ArrayList A0R = new ArrayList();
    public final ArrayList A0S = new ArrayList();
    public final ArrayList A0T = new ArrayList();
    public final ArrayList A0U;
    public final ArrayList A0V;
    public final AnonymousClass0eM A0W;
    public final AnonymousClass0eM A0X;
    public final AnonymousClass0eM A0Y;
    public final AnonymousClass0eM A0Z;
    public final AnonymousClass0eM A0a;
    public final AnonymousClass0eM A0b = AnonymousClass0eN.A01(new AnonymousClass9LS(this, 13));
    public final AnonymousClass0eM A0c;
    public final AnonymousClass0eM A0d = AnonymousClass0eN.A01(new AnonymousClass9LS(this, 15));
    public final AnonymousClass0eM A0e = AnonymousClass0eN.A01(new AnonymousClass9LS(this, 16));
    public final AnonymousClass0eM A0f = AnonymousClass0eN.A01(new AnonymousClass9LS(this, 17));
    public final AnonymousClass0eM A0g = AnonymousClass0eN.A01(new AnonymousClass9LS(this, 18));
    public final AnonymousClass0eM A0h = AnonymousClass0eN.A01(new AnonymousClass9LS(this, 19));
    public final AnonymousClass0eM A0i = AnonymousClass0eN.A01(new AnonymousClass9LS(this, 20));
    public final AnonymousClass0eM A0j = AnonymousClass0eN.A01(new AnonymousClass9LS(this, 21));
    public final AnonymousClass0eM A0k = AnonymousClass0eN.A01(new AnonymousClass9LS(this, 22));
    public final C62320sa A0l;
    public final int A0m;
    public final C273414mX A0n;

    public C314226hr(View view, AnonymousClass4DH r16, AnonymousClass0iw r17, UserSession userSession, C310016aI r19, C314206hp r20, C273414mX r21, AnonymousClass6ZN r22, C62320sa r23) {
        AnonymousClass6ZN r1 = r22;
        0qQ.A0B(r1, 2);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 3);
        C310016aI r4 = r19;
        0qQ.A0B(r4, 6);
        C314206hp r2 = r20;
        0qQ.A0B(r2, 7);
        C273414mX r0 = r21;
        0qQ.A0B(r0, 9);
        this.A0O = r1;
        this.A0F = userSession2;
        this.A0E = r17;
        this.A0K = r4;
        this.A0L = r2;
        this.A0D = r16;
        this.A0n = r0;
        this.A0l = r23;
        View requireViewById = view.requireViewById(R.id.reel_reaction_toolbar_title);
        0qQ.A07(requireViewById);
        this.A0B = requireViewById;
        View requireViewById2 = view.requireViewById(R.id.reel_reaction_toolbar);
        0qQ.A07(requireViewById2);
        LinearLayout linearLayout = (LinearLayout) requireViewById2;
        this.A0C = linearLayout;
        C314346i3 r6 = null;
        this.A0G = 2b1.A01(view.requireViewById(R.id.reel_viewer_avatar_convergence_footer_text_stub), !1NM.A00(userSession2).A01(), false);
        Context context = linearLayout.getContext();
        this.A0A = context;
        this.A0M = new C314266hv(userSession2);
        this.A0N = new C314306hz(context, userSession2);
        this.A0Z = AnonymousClass0eN.A01(new AnonymousClass9LS(this, 11));
        this.A0a = AnonymousClass0eN.A01(new AnonymousClass9LS(this, 12));
        Object value = this.A0d.getValue();
        0qQ.A07(value);
        int i = ((Boolean) value).booleanValue() ? 7 : 6;
        this.A0m = i;
        Object value2 = this.A0d.getValue();
        0qQ.A07(value2);
        this.A09 = ((Boolean) value2).booleanValue() ? i + 1 : i;
        this.A0P = new ArrayList();
        AnonymousClass4DH r12 = this.A0D;
        AnonymousClass9LS r10 = new AnonymousClass9LS(this, 14);
        AnonymousClass9LS r24 = new AnonymousClass9LS(r12, 23);
        0eO r7 = 0eO.A02;
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r7, new AnonymousClass9LS(r24, 24));
        this.A0c = new C227862kA(new AnonymousClass9LS(A002, 25), r10, new AnonymousClass9M1(14, (Object) null, A002), new 0Yh(C314326i1.class));
        AnonymousClass4DH r13 = this.A0D;
        AnonymousClass9LS r102 = new AnonymousClass9LS(this, 8);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(r7, new AnonymousClass9LS(new AnonymousClass9LS(r13, 26), 27));
        this.A0W = new C227862kA(new AnonymousClass9LS(A003, 28), r102, new AnonymousClass9M1(15, (Object) null, A003), new 0Yh(C314336i2.class));
        this.A0H = 2b1.A01(view.requireViewById(R.id.create_avatar_viewstub), false, false);
        this.A0X = AnonymousClass0eN.A01(new AnonymousClass9LS(this, 9));
        this.A0Y = AnonymousClass0eN.A01(new AnonymousClass9LS(this, 10));
        this.A0U = new ArrayList();
        this.A0V = new ArrayList();
        this.A0J = 182.A06(0Tu.A05, userSession2, 36326442547558153L) ? new C314346i3(02m.A0p, C317846nw.A01.A00(A01(this), C317866ny.AQR, userSession2, false), i) : r6;
        this.A0I = new C314356i4(AnonymousClass0kN.A02(userSession2), userSession2);
        ((AvatarStore) this.A0b.getValue()).A04(new AnonymousClass9LT(this, 44));
    }

    public static final void A02(View view, C250973mM r13, C314226hr r14) {
        Fragment fragment;
        FragmentActivity activity;
        C250973mM r10 = r13;
        if (r13 != null) {
            AnonymousClass6ZN r3 = r14.A0O;
            RectF A0F2 = 0nA.A0F(view);
            C273384mU r2 = r3.A0F;
            ReelViewerFragment reelViewerFragment = (ReelViewerFragment) r2;
            if (!reelViewerFragment.A2q && (fragment = (Fragment) r3.A0H.get()) != null && (activity = fragment.getActivity()) != null) {
                C273434mZ r8 = r3.A0E;
                DirectCameraViewModel A012 = AnonymousClass3PQ.A01(r13, "story_selfie_reply");
                UserSession userSession = r3.A01;
                if (userSession == null) {
                    0qQ.A0F("userSession");
                    throw AnonymousClass00P.createAndThrow();
                }
                boolean z = reelViewerFragment.A2X;
                C70354O3g.A00(activity, A0F2, 28D.A52, userSession, r8, A012, r10, 60575, "story_selfie_reply", (float) r2.BS0(), z);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.07Z, X.4DH] */
    private final void A03(C317846nw r10, boolean z) {
        AnonymousClass0xx A002 = AnonymousClass07a.A00(this.A0D);
        AnonymousClass9K9 r3 = new AnonymousClass9K9(this, r10, (AnonymousClass4D7) null, 2, z);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r3, A002);
    }

    public static final void A05(C314226hr r13) {
        C317466nJ r132;
        LND lnd;
        UserSession userSession;
        AnonymousClass0iw r8;
        C314226hr r11 = r13;
        ArrayList arrayList = r13.A0R;
        if (!arrayList.isEmpty()) {
            if (!0qQ.A0K(((AvatarStore) r13.A0b.getValue()).A01.A00, C297385rf.A00)) {
                ArrayList arrayList2 = r13.A0P;
                boolean z = false;
                if (arrayList2.size() >= r13.A0m) {
                    z = true;
                }
                int i = r13.A09;
                for (int i2 = 0; i2 < i; i2++) {
                    Object tag = ((View) arrayList.get(i2)).getTag();
                    0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.AssetGridRowItemViewBinder.Holder");
                    LN9 ln9 = (LN9) tag;
                    Object value = r11.A0d.getValue();
                    0qQ.A07(value);
                    if (!((Boolean) value).booleanValue() || i2 != i - 1) {
                        if (z) {
                            r132 = (C317466nJ) arrayList2.get(i2);
                        } else {
                            r132 = C317446nH.A01;
                        }
                        0qQ.A0A(r132);
                        if (!0qQ.A0K(r132, ln9.A02)) {
                            lnd = C63517KyS.A00;
                            userSession = r11.A0F;
                            r8 = r11.A0E;
                        }
                    } else {
                        lnd = C63517KyS.A00;
                        userSession = r11.A0F;
                        r8 = r11.A0E;
                        r132 = new C317456nI();
                    }
                    lnd.A01(r8, userSession, (C357638Yz) null, r11, ln9, r132);
                }
                C21225XPt xPt = r11.A03;
                if (xPt != null) {
                    xPt.A01 = true;
                }
                if (z) {
                    C314206hp r0 = r11.A0L;
                    r0.A01.flowEndSuccess(r0.A00);
                }
            } else if (r13.A04.intValue() == 1) {
                C21225XPt xPt2 = r13.A03;
                if (xPt2 != null) {
                    XR4 xr4 = XR4.Emoji;
                    r13.DuK(xr4);
                    xPt2.setSelectedQuickReactionsType(xr4);
                    xPt2.A01 = false;
                    r13.A0H.setVisibility(8);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    public final boolean CZu(boolean z) {
        return false;
    }

    public final void Cw1(View view, C317466nJ r2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0290, code lost:
        if (X.182.A06(X.0Tu.A05, r2, 2342156773019420908L) != false) goto L_0x0292;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x030a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x026d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cw2(android.graphics.drawable.Drawable r29, android.view.View r30, X.C317466nJ r31) {
        /*
            r28 = this;
            r8 = 0
            r27 = r31
            r0 = r27
            X.0qQ.A0B(r0, r8)
            X.6nz r0 = r27.BzU()
            r4 = 0
            if (r0 == 0) goto L_0x02f9
            X.6oG r1 = r0.A00()
        L_0x0013:
            X.6oG r0 = X.C318046oG.PLACEHOLDER_STICKER
            r9 = r28
            if (r1 == r0) goto L_0x01c6
            X.6ZN r11 = r9.A0O
            r1 = 13
            X.MMg r0 = new X.MMg
            r0.<init>(r9, r1)
            r11.A07 = r0
            android.content.Context r2 = r9.A0A
            X.0qQ.A06(r2)
            X.3uh r10 = r9.A00
            if (r10 == 0) goto L_0x02fc
            r7 = 1
            X.6nK r1 = r27.CAW()
            X.6nK r0 = X.C317476nK.PLUS_BUTTON
            java.lang.String r18 = "balloonsAnimationController"
            java.lang.String r13 = "reelMessageHelper"
            r26 = 1
            java.lang.String r17 = "userSession"
            if (r1 != r0) goto L_0x00bc
            X.0iw r0 = r11.A0D
            java.lang.String r3 = r0.getModuleName()
            X.K3O r5 = new X.K3O
            r5.<init>()
            java.lang.String r1 = "args_previous_module_name"
            X.0eP r0 = new X.0eP
            r0.<init>(r1, r3)
            X.0eP[] r0 = new X.0eP[]{r0}
            android.os.Bundle r0 = X.Q21.A00(r0)
            r5.setArguments(r0)
            r11.A05 = r5
            X.6cn r1 = r11.A06
            if (r1 == 0) goto L_0x02f4
            X.4mU r3 = r11.A0F
            X.6hg r0 = r11.A03
            if (r0 == 0) goto L_0x02ef
            r5.A04 = r1
            r5.A01 = r10
            r5.A02 = r3
            r5.A03 = r0
            X.0sa r0 = r11.A07
            r5.A05 = r0
            com.instagram.common.session.UserSession r0 = r11.A01
            if (r0 == 0) goto L_0x008b
            X.7Pr r1 = new X.7Pr
            r1.<init>(r0)
            r0 = 2131099778(0x7f060082, float:1.7811919E38)
            int r0 = r2.getColor(r0)
            r1.A06 = r0
            X.4mX r0 = r11.A02
            if (r0 != 0) goto L_0x0093
            java.lang.String r17 = "avatarQRMoreOptionsBottomSheetListener"
        L_0x008b:
            X.0qQ.A0F(r17)
        L_0x008e:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0093:
            r1.A0U = r0
            X.7Pu r2 = r1.A00()
            java.lang.ref.WeakReference r0 = r11.A0H
            java.lang.Object r0 = r0.get()
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r0 == 0) goto L_0x00e0
            androidx.fragment.app.FragmentActivity r1 = r0.getActivity()
            if (r1 == 0) goto L_0x00e0
            r3.Eqe(r7)
            r11.A09 = r7
            X.0nA.A0J(r1)
            X.K3O r0 = r11.A05
            if (r0 == 0) goto L_0x00b9
            r2.A02(r1, r0)
            goto L_0x00e0
        L_0x00b9:
            java.lang.String r17 = "avatarQRMoreOptionsBottomSheetFragment"
            goto L_0x008b
        L_0x00bc:
            boolean r0 = r10.CcK()
            if (r0 == 0) goto L_0x00c8
            boolean r0 = X.AnonymousClass6ZN.A00(r2, r10, r11)
            if (r0 == 0) goto L_0x00e0
        L_0x00c8:
            X.6mk r6 = r11.A0G
            r6.Etq()
            boolean r0 = r6.ARh()
            java.lang.String r5 = ""
            if (r0 == 0) goto L_0x0225
            com.instagram.user.model.User r0 = r10.A0i
            if (r0 == 0) goto L_0x00dd
            java.lang.String r5 = r0.getUsername()
        L_0x00dd:
            r6.EvK(r5)
        L_0x00e0:
            X.6i4 r5 = r9.A0I
            X.6nz r0 = r27.BzU()
            if (r0 == 0) goto L_0x0222
            java.util.ArrayList r0 = r0.A02()
            java.lang.Object r7 = X.00k.A0J(r0)
            java.lang.String r7 = (java.lang.String) r7
        L_0x00f2:
            java.util.ArrayList r1 = r9.A0P
            r0 = r27
            int r2 = r1.indexOf(r0)
            X.6nz r0 = r27.BzU()
            if (r0 == 0) goto L_0x021f
            X.6oG r1 = r0.A00()
        L_0x0104:
            X.6oG r0 = X.C318046oG.AVATAR_ANIMATED
            if (r1 != r0) goto L_0x021b
            java.lang.Integer r12 = X.AnonymousClass05K.A00
        L_0x010a:
            X.3uh r0 = r9.A00
            if (r0 == 0) goto L_0x0110
            java.lang.String r4 = r0.A0k
        L_0x0110:
            X.0wc r3 = r5.A03
            java.lang.String r1 = "avatar_stickers_measurement_avatar_sticker_tray_send"
            X.0kJ r0 = r3.A00
            X.0Aj r3 = r3.A00(r0, r1)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x01c6
            X.Jqa r6 = new X.Jqa
            r6.<init>()
            r10 = 0
            if (r7 == 0) goto L_0x0217
            r0 = 10
            java.lang.Long r0 = X.00y.A0n(r0, r7)
            if (r0 == 0) goto L_0x0217
            long r0 = r0.longValue()
        L_0x0135:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = 193(0xc1, float:2.7E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.A05(r0, r1)
            int r0 = r12.intValue()
            if (r0 == r8) goto L_0x0213
            java.lang.String r1 = "static"
        L_0x014a:
            java.lang.String r0 = "sticker_type"
            r6.A06(r0, r1)
            long r0 = (long) r2
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "sticker_rank"
            r6.A05(r0, r1)
            java.lang.String r0 = "sticker_page_index"
            r6.A05(r0, r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            java.lang.String r0 = "page_number"
            r6.A05(r0, r1)
            r0 = 1
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "total_pages"
            r6.A05(r0, r1)
            java.lang.String r1 = "quick_reaction"
            java.lang.String r0 = "referrer_surface"
            r6.A06(r0, r1)
            java.lang.String r0 = "sticker_usage_type"
            r6.A06(r0, r1)
            if (r4 == 0) goto L_0x018c
            r0 = 10
            java.lang.Long r0 = X.00y.A0n(r0, r4)
            if (r0 == 0) goto L_0x018c
            long r10 = r0.longValue()
        L_0x018c:
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            java.lang.String r0 = "sticker_usage_id"
            r6.A05(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
            java.lang.String r0 = "is_social_sticker"
            r6.A03(r0, r1)
            r1 = 0
            java.lang.String r2 = "sticker_template_name"
            r6.A06(r2, r1)
            java.lang.String r0 = "event_data"
            r3.AAK(r6, r0)
            java.lang.String r2 = r5.A01
            java.lang.String r0 = "avatar_session_id"
            r3.AAJ(r0, r2)
            X.K1h r0 = r5.A00
            if (r0 == 0) goto L_0x01be
            java.lang.String r2 = r0.A03
            if (r2 == 0) goto L_0x01be
            r0 = 10
            java.lang.Long r1 = X.00y.A0n(r0, r2)
        L_0x01be:
            java.lang.String r0 = "avatar_id"
            r3.A9F(r0, r1)
            r3.Cgf()
        L_0x01c6:
            X.6nK r1 = r27.CAW()
            X.6nK r0 = X.C317476nK.PLUS_BUTTON
            if (r1 != r0) goto L_0x0212
            X.6aI r0 = r9.A0K
            X.6nw r4 = A01(r9)
            X.0qQ.A0B(r4, r8)
            com.instagram.common.session.UserSession r1 = r0.A06
            X.6aJ r0 = r0.A0A
            X.0wc r3 = X.AnonymousClass0kN.A01(r0, r1)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.lang.String r1 = r4.toString()
            java.lang.String r0 = "sticker_pack_id"
            r2.put(r0, r1)
            java.lang.String r1 = "aqr_tap_on_plus_icon"
            X.0kJ r0 = r3.A00
            X.0Aj r1 = r3.A00(r0, r1)
            java.lang.String r0 = "extra_client_data"
            r1.A9H(r0, r2)
            r1.Cgf()
            com.instagram.common.session.UserSession r0 = r9.A0F
            X.26t r0 = X.26G.A00(r0)
            r2 = 3
            X.0xa r0 = r0.A00
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "key_avatar_quick_reactions_more_options_plus_button_animation_count"
            r1.E5Z(r0, r2)
            r1.apply()
        L_0x0212:
            return
        L_0x0213:
            java.lang.String r1 = "animated_sticker"
            goto L_0x014a
        L_0x0217:
            r0 = 0
            goto L_0x0135
        L_0x021b:
            java.lang.Integer r12 = X.AnonymousClass05K.A01
            goto L_0x010a
        L_0x021f:
            r1 = r4
            goto L_0x0104
        L_0x0222:
            r7 = r4
            goto L_0x00f2
        L_0x0225:
            X.6nz r0 = r27.BzU()
            if (r0 == 0) goto L_0x02ec
            java.util.List r0 = r0.A0O
            java.lang.Object r12 = X.00k.A0J(r0)
            X.6o8 r12 = (X.C317966o8) r12
        L_0x0233:
            X.6cn r15 = r11.A06
            if (r15 == 0) goto L_0x02f4
            X.6nz r0 = r27.BzU()
            if (r0 == 0) goto L_0x02e9
            java.lang.String r3 = r0.A0Z
        L_0x023f:
            if (r12 == 0) goto L_0x02e1
            java.lang.String r2 = r12.A0a
            com.instagram.common.typedurl.ImageUrl r0 = r12.A0H
            if (r0 == 0) goto L_0x02e2
            com.instagram.model.mediasize.ExtendedImageUrl r1 = new com.instagram.model.mediasize.ExtendedImageUrl
            r1.<init>(r0)
        L_0x024c:
            java.lang.Integer r0 = r12.A04()
            java.lang.String r25 = X.C394159xd.A00(r0)
        L_0x0254:
            X.LOD r19 = new X.LOD
            r22 = r4
            r23 = r3
            r24 = r2
            r20 = r1
            r21 = r5
            r19.<init>(r20, r21, r22, r23, r24, r25)
            X.4mU r3 = r11.A0F
            instagram.features.stories.fragment.ReelViewerFragment r3 = (instagram.features.stories.fragment.ReelViewerFragment) r3
            X.3mM r14 = r3.A0a
            java.lang.String r12 = "Required value was null."
            if (r14 == 0) goto L_0x030a
            X.0iw r0 = r11.A0D
            java.lang.String r25 = r0.getModuleName()
            X.6Uf r2 = X.C308426Uf.A00
            com.instagram.user.model.User r1 = r10.A0i
            com.instagram.common.session.UserSession r0 = r11.A01
            if (r0 == 0) goto L_0x008b
            boolean r0 = r2.A00(r0, r1)
            if (r0 == 0) goto L_0x02de
            com.instagram.common.session.UserSession r2 = r11.A01
            if (r2 == 0) goto L_0x008b
            X.0Tu r13 = X.0Tu.A05
            r0 = 2342156773019420908(0x2081032d001908ec, double:4.0602981164953554E-152)
            boolean r0 = X.182.A06(r13, r2, r0)
            if (r0 == 0) goto L_0x02de
        L_0x0292:
            r21 = r15
            r22 = r10
            r23 = r14
            r24 = r19
            r21.A01(r22, r23, r24, r25, r26)
            X.6hg r2 = r11.A03
            if (r2 == 0) goto L_0x02ef
            com.instagram.common.typedurl.ImageUrl r1 = r27.CCI()
            if (r1 == 0) goto L_0x0304
            X.LzT r0 = new X.LzT
            r0.<init>(r11)
            r2.A01(r1, r0)
            com.instagram.common.session.UserSession r0 = r11.A01
            if (r0 == 0) goto L_0x008b
            X.Vgm r0 = X.C70302O1g.A00(r0)
            X.1QP r10 = r0.A01
            long r0 = r0.A00
            java.lang.String r2 = "reply_with_avatar_quick_reaction"
            r10.flowMarkPoint(r0, r2, r5)
            X.6SY r0 = r3.mBackwardsCompatibilityViewModel
            if (r0 == 0) goto L_0x02c7
            r0.A00()
        L_0x02c7:
            X.6Z5 r6 = (X.AnonymousClass6Z5) r6
            X.6i2 r0 = r6.A04
            if (r0 == 0) goto L_0x00e0
            boolean r0 = r0.A08()
            if (r0 != r7) goto L_0x00e0
            X.6i2 r1 = r6.A04
            if (r1 == 0) goto L_0x00e0
            X.6nw r0 = X.C317846nw.CONVERGENCE_2_UPSELL_BANNER_STICKER_PACK
            r1.A02(r0)
            goto L_0x00e0
        L_0x02de:
            r26 = 0
            goto L_0x0292
        L_0x02e1:
            r2 = r4
        L_0x02e2:
            r1 = r4
            if (r12 != 0) goto L_0x024c
            java.lang.String r25 = "null"
            goto L_0x0254
        L_0x02e9:
            r3 = r5
            goto L_0x023f
        L_0x02ec:
            r12 = r4
            goto L_0x0233
        L_0x02ef:
            X.0qQ.A0F(r18)
            goto L_0x008e
        L_0x02f4:
            X.0qQ.A0F(r13)
            goto L_0x008e
        L_0x02f9:
            r1 = r4
            goto L_0x0013
        L_0x02fc:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0304:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r12)
            throw r0
        L_0x030a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C314226hr.Cw2(android.graphics.drawable.Drawable, android.view.View, X.6nJ):void");
    }

    public final void CxD() {
        AnonymousClass0eM r2 = this.A0c;
        if (((C314326i1) r2.getValue()).A02()) {
            AnonymousClass4DH r0 = this.A0D;
            07U r4 = 07U.A05;
            AnonymousClass07Z viewLifecycleOwner = r0.getViewLifecycleOwner();
            AnonymousClass0xx A002 = AnonymousClass07a.A00(viewLifecycleOwner);
            1Eo.A05(19B.A00, new MH5(r4, this, viewLifecycleOwner, (AnonymousClass4D7) null, 26), A002);
            ((C314326i1) r2.getValue()).A00();
            return;
        }
        A0D(this);
        this.A0B.postDelayed(new C65919M4i(this), 500);
    }

    public final /* synthetic */ void CxG() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0046, code lost:
        if (r5.CcK() != false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0048, code lost:
        r0 = r4.A0j.getValue();
        X.0qQ.A07(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0057, code lost:
        if (((java.lang.Boolean) r0).booleanValue() != false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0059, code lost:
        r1 = X.C308426Uf.A00;
        r0 = r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005d, code lost:
        if (r0 == null) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0069, code lost:
        if (r1.A00(r3, r0.A0H.A0D()) == false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0076, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 2342156773019420908L) == false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0078, code lost:
        r0 = X.AnonymousClass05K.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007a, code lost:
        r4.A04 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007c, code lost:
        r4.A08 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0080, code lost:
        r0 = X.AnonymousClass05K.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0083, code lost:
        r0 = X.AnonymousClass05K.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008b, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (r0.A5f() != false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        if (r5.A12() != false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        r4.A01 = r6;
        r4.A02 = r8;
        r4.A00 = r5;
        r3 = r4.A0F;
        r0 = r5.A0b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002f, code lost:
        if (r0 == null) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0040, code lost:
        if (X.0qQ.A0K(r0.A0C.C3C(), true) == false) goto L_0x0083;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D7Q(X.C255773uh r5, X.C250973mM r6, X.C316026kz r7, X.C309426Yf r8) {
        /*
            r4 = this;
            r0 = 1
            X.0qQ.A0B(r5, r0)
            r0 = 2
            X.0qQ.A0B(r8, r0)
            r0 = 3
            X.0qQ.A0B(r6, r0)
            boolean r0 = r5.CWu()
            if (r0 == 0) goto L_0x001d
            X.1Xj r0 = r5.A0b
            r0.getClass()
            boolean r0 = r0.A5f()
            if (r0 == 0) goto L_0x0023
        L_0x001d:
            boolean r0 = r5.A12()
            if (r0 == 0) goto L_0x007c
        L_0x0023:
            r4.A01 = r6
            r4.A02 = r8
            r4.A00 = r5
            com.instagram.common.session.UserSession r3 = r4.A0F
            java.lang.String r2 = "Required value was null."
            X.1Xj r0 = r5.A0b
            if (r0 == 0) goto L_0x0083
            X.1Xy r0 = r0.A0C
            java.lang.Boolean r1 = r0.C3C()
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0083
            boolean r0 = r5.CcK()
            if (r0 != 0) goto L_0x0083
            X.0eM r0 = r4.A0j
            java.lang.Object r0 = r0.getValue()
            X.0qQ.A07(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0080
            X.6Uf r1 = X.C308426Uf.A00
            X.3mM r0 = r4.A01
            if (r0 == 0) goto L_0x0086
            com.instagram.model.reels.Reel r0 = r0.A0H
            com.instagram.user.model.User r0 = r0.A0D()
            boolean r0 = r1.A00(r3, r0)
            if (r0 == 0) goto L_0x0078
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342156773019420908(0x2081032d001908ec, double:4.0602981164953554E-152)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0080
        L_0x0078:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x007a:
            r4.A04 = r0
        L_0x007c:
            r0 = 0
            r4.A08 = r0
            return
        L_0x0080:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x007a
        L_0x0083:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x007a
        L_0x0086:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C314226hr.D7Q(X.3uh, X.3mM, X.6kz, X.6Yf):void");
    }

    public final /* synthetic */ void DLs(Reel reel) {
    }

    public final /* synthetic */ void DMq(int i) {
    }

    public final /* synthetic */ void DNx() {
    }

    public final /* synthetic */ void DNy() {
    }

    public final /* synthetic */ void DVL() {
    }

    public final /* synthetic */ void DWT(String str) {
    }

    public final /* synthetic */ void Dfe() {
    }

    public final /* synthetic */ void DiL(int i) {
    }

    public final /* synthetic */ void DiM(int i, int i2) {
    }

    public final /* synthetic */ void DiO(int i, int i2) {
    }

    public final /* synthetic */ void DiP() {
    }

    public final void DuK(XR4 xr4) {
        String str;
        0xY AR4 = ((0xa) this.A0k.getValue()).AR4();
        AR4.E5g("STORY_QUICK_REACTION_LAST_USED_TYPE", xr4.A00);
        AR4.apply();
        A0G(this, xr4, true, false);
        A0F(this, xr4);
        C310016aI r4 = this.A0K;
        C250973mM r3 = this.A01;
        C309426Yf r2 = this.A02;
        int ordinal = xr4.ordinal();
        if (ordinal == 0) {
            str = "emoji";
        } else if (ordinal == 1) {
            str = "avatar";
        } else {
            throw new RuntimeException();
        }
        r4.A0L(r3, r2, "selector_click", str);
    }

    public final /* synthetic */ void DxL() {
    }

    public final /* synthetic */ void DxN() {
    }

    public final /* synthetic */ void DxU() {
    }

    public final /* synthetic */ void DyN(C255773uh r1, C316036l0 r2) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onDestroyView() {
    }

    public static final int A00(C314226hr r2) {
        if (r2.A04 == AnonymousClass05K.A00 || ((Boolean) r2.A0g.getValue()).booleanValue()) {
            return 8;
        }
        return 6;
    }

    public static final C317846nw A01(C314226hr r1) {
        Object value = r1.A0d.getValue();
        0qQ.A07(value);
        if (((Boolean) value).booleanValue()) {
            return C317846nw.AVATAR_QR_ANIMATED_MAIN_STICKERS;
        }
        Object value2 = r1.A0e.getValue();
        0qQ.A07(value2);
        if (((Boolean) value2).booleanValue()) {
            return C317846nw.AVATAR_QR_ANIMATED_STICKERS;
        }
        return C317846nw.AVATAR_QR_STATIC_V2_STICKERS;
    }

    public static final void A04(AnonymousClass27H r1, C314226hr r2) {
        if (0qQ.A0K(r1, C299715vi.A00)) {
            C317446nH.A03.set(true);
            r2.A03(A01(r2), true);
            if (A01(r2) == C317846nw.AVATAR_QR_ANIMATED_MAIN_STICKERS) {
                r2.A03(C317846nw.AVATAR_QR_ANIMATED_MORE_OPTIONS_STICKERS, false);
                return;
            }
            return;
        }
        0xY AR4 = ((0xa) r2.A0k.getValue()).AR4();
        AR4.E5g("STORY_QUICK_REACTION_LAST_USED_TYPE", (String) null);
        AR4.apply();
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [android.widget.ImageView, android.view.View, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    /* JADX WARNING: type inference failed for: r4v2, types: [android.widget.ImageView, android.view.View, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0050, code lost:
        r12 = X.C254853tA.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ca, code lost:
        if (r9 != (r11 - 1)) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00dc, code lost:
        if (r9 != (r11 - 1)) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004d, code lost:
        if (r12 != null) goto L_0x005f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02db A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0104  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(X.C314226hr r29) {
        /*
            r13 = r29
            X.6hv r9 = r13.A0M
            com.instagram.common.session.UserSession r3 = r13.A0F
            r4 = 0
            java.util.ArrayList r12 = X.C314266hv.A00(r9)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318496858052757(0x81077b00001895, double:3.0313018836565877E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0049
            java.util.ArrayList r0 = r9.A02()
            int r0 = r0.size()
            r8 = 7
            if (r0 >= r8) goto L_0x0053
            X.6hy r0 = X.C314266hv.A03
            r0.A00(r3)
            com.google.common.collect.ImmutableList r7 = X.C254853tA.A06
            r6 = 0
            int r5 = r7.size()
        L_0x002f:
            if (r6 >= r5) goto L_0x0053
            java.lang.Object r0 = r7.get(r6)
            X.3tA r0 = (X.C254853tA) r0
            java.lang.String r0 = r0.A02
            X.6nL r3 = X.C336957fS.A01(r0)
            long r1 = (long) r6
            X.AZg r0 = new X.AZg
            r0.<init>(r3, r1)
            r9.A04(r0)
            int r6 = r6 + 1
            goto L_0x002f
        L_0x0049:
            boolean r0 = r9.A00
            if (r0 == 0) goto L_0x0050
            if (r12 == 0) goto L_0x0050
            goto L_0x005f
        L_0x0050:
            com.google.common.collect.ImmutableList r12 = X.C254853tA.A05
            goto L_0x005f
        L_0x0053:
            java.util.ArrayList r0 = r9.A02()
            int r0 = r0.size()
            if (r0 >= r8) goto L_0x0373
            com.google.common.collect.ImmutableList r12 = X.C254853tA.A06
        L_0x005f:
            int r3 = r12.size()
            X.0eM r0 = r13.A0g
            r29 = r0
            java.lang.Object r0 = r29.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0368
            r2 = 7
        L_0x0074:
            java.lang.String r25 = "story_reactions"
            if (r3 >= r2) goto L_0x0096
            java.lang.String r5 = "Mismatched reactions/emojis size, num reactions: "
            int r4 = r12.size()
            java.lang.String r3 = ", getNumOfEmojis: "
            java.lang.Object r0 = r29.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x035d
            r2 = 7
        L_0x008d:
            java.lang.String r1 = X.002.A02(r4, r2, r5, r3)
            r0 = r25
            X.0wb.A03(r0, r1)
        L_0x0096:
            java.util.ArrayList r0 = r13.A0T
            r28 = r0
            int r1 = r28.size()
            int r0 = A00(r13)
            if (r1 >= r0) goto L_0x0357
            java.lang.String r3 = "Mismatched emojiViews size, num emojiViews: "
            int r2 = r28.size()
            java.lang.String r1 = ", getNumOfEmojiViews: "
            int r0 = A00(r13)
            java.lang.String r1 = X.002.A02(r2, r0, r3, r1)
            r0 = r25
            X.0wb.A03(r0, r1)
            int r11 = r28.size()
        L_0x00bd:
            boolean r24 = r13.A0K()
            r10 = 0
            r9 = 0
        L_0x00c3:
            if (r9 >= r11) goto L_0x03a1
            if (r24 == 0) goto L_0x00cc
            int r0 = r11 + -1
            r3 = 1
            if (r9 == r0) goto L_0x00cd
        L_0x00cc:
            r3 = 0
        L_0x00cd:
            java.lang.Object r0 = r29.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00de
            int r0 = r11 + -1
            r8 = 1
            if (r9 == r0) goto L_0x00df
        L_0x00de:
            r8 = 0
        L_0x00df:
            java.lang.String r23 = ""
            if (r8 == 0) goto L_0x02df
            r2 = 2131971080(0x7f134c08, float:1.957913E38)
            java.lang.String r1 = "plus_button"
        L_0x00e8:
            X.3tA r7 = new X.3tA
            r0 = r23
            r7.<init>(r1, r0, r2)
        L_0x00ef:
            r0 = r28
            java.lang.Object r6 = r0.get(r9)
            X.0qQ.A07(r6)
            com.instagram.common.ui.widget.imageview.ConstrainedImageView r6 = (com.instagram.common.ui.widget.imageview.ConstrainedImageView) r6
            java.lang.Object r0 = r6.getTag()
            boolean r0 = X.0qQ.A0K(r7, r0)
            if (r0 != 0) goto L_0x02db
            if (r3 == 0) goto L_0x010f
            r0 = 2131239768(0x7f082358, float:1.8095852E38)
            r6.setImageResource(r0)
            r2 = 1
            goto L_0x0294
        L_0x010f:
            if (r8 == 0) goto L_0x0266
            java.util.ArrayList r0 = r13.A0U
            r27 = r0
            r27.clear()
            java.util.ArrayList r0 = r13.A0V
            r26 = r0
            r26.clear()
            r0 = 2131240016(0x7f082450, float:1.8096355E38)
            r6.setImageResource(r0)
            android.view.ViewParent r5 = r6.getParent()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.ui.base.IgFrameLayout"
            X.0qQ.A0C(r5, r0)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r3 = 1135869952(0x43b40000, float:360.0)
            com.google.common.collect.ImmutableList r22 = X.C254853tA.A07
            int r0 = r22.size()
            float r0 = (float) r0
            float r3 = r3 / r0
            int r0 = r22.size()
            X.2HY r1 = X.C229632nm.A0C(r10, r0)
            r0 = 10
            int r0 = X.0Yv.A1E(r1, r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x0151:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0168
            r0 = r1
            X.0sh r0 = (X.0sh) r0
            int r0 = r0.A00()
            float r0 = (float) r0
            float r0 = r0 * r3
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2.add(r0)
            goto L_0x0151
        L_0x0168:
            java.util.Iterator r21 = r2.iterator()
            r15 = 0
        L_0x016d:
            boolean r0 = r21.hasNext()
            if (r0 == 0) goto L_0x0264
            java.lang.Object r0 = r21.next()
            int r20 = r15 + 1
            if (r15 >= 0) goto L_0x0183
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0183:
            java.lang.Number r0 = (java.lang.Number) r0
            float r1 = r0.floatValue()
            android.content.Context r14 = r13.A0A
            X.0qQ.A06(r14)
            com.instagram.common.ui.widget.imageview.ConstrainedImageView r4 = new com.instagram.common.ui.widget.imageview.ConstrainedImageView
            r4.<init>(r14)
            r0 = r22
            java.lang.Object r0 = r0.get(r15)
            X.3tA r0 = (X.C254853tA) r0
            android.content.res.Resources r3 = r14.getResources()
            r2 = 2131165243(0x7f07003b, float:1.7944698E38)
            int r3 = r3.getDimensionPixelSize(r2)
            X.8vV r2 = new X.8vV
            r2.<init>(r14, r3)
            java.lang.String r0 = r0.A02
            r2.A0M(r0)
            float r14 = (float) r3
            r2.A0A(r14)
            r4.setImageDrawable(r2)
            r0 = 1050253722(0x3e99999a, float:0.3)
            r4.setScaleX(r0)
            r4.setScaleY(r0)
            double r0 = (double) r1
            double r0 = java.lang.Math.toRadians(r0)
            float r3 = (float) r0
            r19 = 2
            r0 = r19
            float[] r1 = new float[r0]
            r18 = 0
            r1[r10] = r18
            r0 = 1075838976(0x40200000, float:2.5)
            float r14 = r14 * r0
            r17 = 1
            r1[r17] = r14
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r1)
            android.view.animation.OvershootInterpolator r0 = new android.view.animation.OvershootInterpolator
            r0.<init>()
            r2.setInterpolator(r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.setDuration(r0)
            java.util.List r16 = X.C317446nH.A02
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r0 = r16
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0261
            r0 = 450(0x1c2, double:2.223E-321)
        L_0x01f8:
            r2.setStartDelay(r0)
            X.W4E r0 = new X.W4E
            r0.<init>(r4, r3)
            r2.addUpdateListener(r0)
            X.W4F r0 = new X.W4F
            r0.<init>(r4, r3)
            r2.addUpdateListener(r0)
            r0 = r19
            float[] r0 = new float[r0]
            r0[r10] = r14
            r0[r17] = r18
            android.animation.ValueAnimator r14 = android.animation.ValueAnimator.ofFloat(r0)
            android.view.animation.OvershootInterpolator r0 = new android.view.animation.OvershootInterpolator
            r0.<init>()
            r14.setInterpolator(r0)
            r0 = 500(0x1f4, double:2.47E-321)
            r14.setDuration(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r0 = r16
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x025e
            r0 = 200(0xc8, double:9.9E-322)
        L_0x0232:
            r14.setStartDelay(r0)
            X.W4G r0 = new X.W4G
            r0.<init>(r4, r3)
            r14.addUpdateListener(r0)
            X.W4H r0 = new X.W4H
            r0.<init>(r4, r3)
            r14.addUpdateListener(r0)
            r0 = r27
            r0.add(r2)
            r0 = r26
            r0.add(r14)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.setTranslationZ(r0)
            r5.addView(r4)
            r5.setClipChildren(r10)
            r15 = r20
            goto L_0x016d
        L_0x025e:
            r0 = 120(0x78, double:5.93E-322)
            goto L_0x0232
        L_0x0261:
            r0 = 370(0x172, double:1.83E-321)
            goto L_0x01f8
        L_0x0264:
            r2 = 0
            goto L_0x0294
        L_0x0266:
            r2 = 0
            android.content.Context r4 = r13.A0A
            android.content.res.Resources r3 = r4.getResources()
            java.lang.Object r0 = r29.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            r0 = 2131165266(0x7f070052, float:1.7944744E38)
            if (r1 == 0) goto L_0x027f
            r0 = 2131165250(0x7f070042, float:1.7944712E38)
        L_0x027f:
            int r3 = r3.getDimensionPixelSize(r0)
            X.8vV r1 = new X.8vV
            r1.<init>(r4, r3)
            java.lang.String r0 = r7.A02
            r1.A0M(r0)
            float r0 = (float) r3
            r1.A0A(r0)
            r6.setImageDrawable(r1)
        L_0x0294:
            android.content.Context r0 = r13.A0A     // Catch:{ NotFoundException -> 0x02ac }
            boolean r0 = X.2eO.A00(r0)     // Catch:{ NotFoundException -> 0x02ac }
            if (r0 == 0) goto L_0x02be
            int r1 = r7.A00     // Catch:{ NotFoundException -> 0x02ac }
            if (r1 == 0) goto L_0x02be
            android.content.Context r0 = r6.getContext()     // Catch:{ NotFoundException -> 0x02ac }
            java.lang.String r0 = r0.getString(r1)     // Catch:{ NotFoundException -> 0x02ac }
            r6.setContentDescription(r0)     // Catch:{ NotFoundException -> 0x02ac }
            goto L_0x02be
        L_0x02ac:
            java.lang.String r1 = "Failed to find string resource for resource id: "
            int r0 = r7.A00
            java.lang.String r1 = X.002.A0O(r1, r0)
            r0 = r25
            X.0wb.A03(r0, r1)
            r0 = r23
            r6.setContentDescription(r0)
        L_0x02be:
            X.Oj7 r0 = new X.Oj7
            r0.<init>(r7, r13, r2, r8)
            X.AnonymousClass0fU.A00(r0, r6)
            X.OkM r0 = new X.OkM
            r14 = r0
            r15 = r6
            r16 = r7
            r17 = r13
            r18 = r2
            r19 = r8
            r14.<init>(r15, r16, r17, r18, r19)
            r6.setOnLongClickListener(r0)
            r6.setTag(r7)
        L_0x02db:
            int r9 = r9 + 1
            goto L_0x00c3
        L_0x02df:
            java.lang.Object r0 = r12.get(r9)
            X.3tA r0 = (X.C254853tA) r0
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "heart_on_fire"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x030b
            java.lang.Object r0 = r12.get(r9)
            X.3tA r0 = (X.C254853tA) r0
            java.lang.String r0 = r0.A02
            boolean r0 = X.C336957fS.A03(r0)
            if (r0 != 0) goto L_0x030b
            r2 = 2131971068(0x7f134bfc, float:1.9579105E38)
            java.lang.String r1 = "fire"
            java.lang.String r0 = "🔥"
        L_0x0304:
            X.3tA r7 = new X.3tA
            r7.<init>(r1, r0, r2)
            goto L_0x00ef
        L_0x030b:
            java.lang.Object r0 = r12.get(r9)
            X.3tA r0 = (X.C254853tA) r0
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "heart_hands"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0331
            java.lang.Object r0 = r12.get(r9)
            X.3tA r0 = (X.C254853tA) r0
            java.lang.String r0 = r0.A02
            boolean r0 = X.C336957fS.A03(r0)
            if (r0 != 0) goto L_0x0331
            r2 = 2131971069(0x7f134bfd, float:1.9579107E38)
            java.lang.String r1 = "growing_heart"
            java.lang.String r0 = "💗\""
            goto L_0x0304
        L_0x0331:
            java.lang.Object r0 = r12.get(r9)
            X.3tA r0 = (X.C254853tA) r0
            java.lang.String r0 = r0.A02
            boolean r0 = X.C336957fS.A03(r0)
            if (r0 != 0) goto L_0x0349
            com.google.common.collect.ImmutableList r0 = X.C254853tA.A05
            java.lang.Object r7 = r0.get(r9)
        L_0x0345:
            X.3tA r7 = (X.C254853tA) r7
            goto L_0x00ef
        L_0x0349:
            if (r3 == 0) goto L_0x0352
            r2 = 2131971081(0x7f134c09, float:1.9579131E38)
            java.lang.String r1 = "selfie_reply"
            goto L_0x00e8
        L_0x0352:
            java.lang.Object r7 = r12.get(r9)
            goto L_0x0345
        L_0x0357:
            int r11 = A00(r13)
            goto L_0x00bd
        L_0x035d:
            java.lang.Integer r1 = r13.A04
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r2 = 6
            if (r1 != r0) goto L_0x008d
            r2 = 8
            goto L_0x008d
        L_0x0368:
            java.lang.Integer r1 = r13.A04
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r2 = 6
            if (r1 != r0) goto L_0x0074
            r2 = 8
            goto L_0x0074
        L_0x0373:
            java.util.ArrayList r0 = r9.A02()
            java.util.List r0 = r0.subList(r4, r8)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r3 = r0.iterator()
        L_0x0384:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x005f
            java.lang.Object r0 = r3.next()
            X.AZg r0 = (X.C40291AZg) r0
            X.6nL r0 = r0.A04
            if (r0 == 0) goto L_0x0384
            java.lang.String r2 = r0.A01
            java.lang.String r1 = r0.A02
            X.3tA r0 = new X.3tA
            r0.<init>(r2, r1, r4)
            r12.add(r4, r0)
            goto L_0x0384
        L_0x03a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C314226hr.A06(X.6hr):void");
    }

    public static final void A07(C314226hr r14) {
        ArrayList arrayList = r14.A0T;
        if (!arrayList.isEmpty()) {
            if (arrayList.size() != A00(r14)) {
                ArrayList arrayList2 = r14.A0S;
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    r14.A0C.removeView((View) it.next());
                }
                arrayList2.clear();
                arrayList.clear();
            }
            A06(r14);
        }
        r14.A0M.A00 = true;
        Context context = r14.A0A;
        LayoutInflater from = LayoutInflater.from(context);
        for (int i = 0; i < 2; i++) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            linearLayout.setClipChildren(false);
            int A002 = A00(r14) / 2;
            for (int i2 = 0; i2 < A002; i2++) {
                0qQ.A06(context);
                FrameLayout frameLayout = new FrameLayout(context);
                View inflate = from.inflate(R.layout.reel_emoji_reaction, linearLayout, false);
                0qQ.A0C(inflate, "null cannot be cast to non-null type com.instagram.common.ui.widget.imageview.ConstrainedImageView");
                inflate.setId(R.id.story_reactions_emoji);
                frameLayout.addView(inflate);
                linearLayout.addView(frameLayout);
                if (r14.A04 == AnonymousClass05K.A01) {
                    int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.action_button_min_width);
                    Resources resources = context.getResources();
                    boolean booleanValue = ((Boolean) r14.A0g.getValue()).booleanValue();
                    int i3 = R.dimen.abc_button_padding_horizontal_material;
                    if (booleanValue) {
                        i3 = R.dimen.abc_action_bar_elevation_material;
                    }
                    int dimensionPixelSize2 = resources.getDimensionPixelSize(i3);
                    int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
                    ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
                    0qQ.A0C(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.width = dimensionPixelSize;
                    marginLayoutParams.height = dimensionPixelSize;
                    marginLayoutParams.setMargins(dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize2, dimensionPixelSize3);
                }
                arrayList.add(inflate);
            }
            r14.A0S.add(linearLayout);
            r14.A0C.addView(linearLayout);
        }
        A06(r14);
    }

    public static final void A08(C314226hr r2) {
        r2.A0B.setVisibility(8);
        r2.A0C.setVisibility(8);
        r2.A0H.setVisibility(8);
        if (!1NM.A00(r2.A0F).A01() || r2.A0G.CVM()) {
            r2.A0G.getView().setVisibility(8);
        }
    }

    public static final void A09(C314226hr r8) {
        FragmentActivity activity;
        AnonymousClass6ZN r3 = r8.A0O;
        Fragment fragment = (Fragment) r3.A0H.get();
        if (!(fragment == null || (activity = fragment.getActivity()) == null)) {
            r3.A0F.Eqe(true);
            r3.A0A = true;
            0nA.A0J(activity);
        }
        Activity rootActivity = r8.A0D.getRootActivity();
        0qQ.A0A(rootActivity);
        K6T k6t = new K6T();
        C314266hv r1 = r8.A0M;
        0qQ.A0B(r1, 0);
        k6t.A02 = r1;
        k6t.A01 = new C72281Ozq(r8);
        C331127Pr r2 = new C331127Pr(r8.A0F);
        r2.A06 = r8.A0A.getColor(R.color.black_70_transparent);
        r2.A0T = k6t;
        r2.A0U = r8.A0n;
        r2.A03 = 0.6f;
        r2.A0k = true;
        r2.A0a = true;
        r2.A00().A02(rootActivity, k6t);
        C309426Yf r0 = r8.A02;
        if (r0 != null) {
            C310016aI r22 = r8.A0K;
            C250973mM r32 = r8.A01;
            if (r32 != null) {
                r22.A0Q(r32, (String) null, "emoji_qr_plus_button", r0.A0B, r0.A0A);
                0xY AR4 = ((0xa) r8.A0k.getValue()).AR4();
                AR4.E5Z("emoji_more_options_button_animation_count", 3);
                AR4.apply();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A0A(C314226hr r8) {
        C314306hz r4 = r8.A0N;
        ArrayList arrayList = r8.A0T;
        1Av r6 = r4.A05;
        0s0 r1 = r6.A4f;
        AnonymousClass0YZ[] r5 = 1Av.A8a;
        if (!((Boolean) r1.CDM(r6, r5[304])).booleanValue()) {
            0s0 r2 = r6.A6k;
            if (r2.CDM(r6, r5[305]) != null) {
                String str = (String) r2.CDM(r6, r5[305]);
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    View view = (View) it.next();
                    C254853tA r0 = (C254853tA) view.getTag();
                    if (str != null && r0 != null && str.equals(r0.A02)) {
                        C234222xL r62 = r4.A01;
                        if (r62 == null) {
                            r62 = new C72740PHx(r4);
                            r4.A01 = r62;
                        }
                        AnonymousClass5Gt r12 = new AnonymousClass5Gt((Activity) view.getRootView().requireViewById(16908290).getContext(), new C315476jx((CharSequence) r4.A02.getResources().getString(2131971082)));
                        r12.A01();
                        r12.A07(C283255Gu.A07);
                        r12.A08(C283255Gu.A06);
                        r12.A0A = false;
                        r12.A04 = r62;
                        r12.A0F = true;
                        r12.A03(view);
                        r4.A00 = r12.A00();
                        Handler handler = r4.A03;
                        Runnable runnable = r4.A06;
                        handler.removeCallbacks(runnable);
                        handler.post(runnable);
                    }
                }
            }
        }
        if (r8.A0K()) {
            UserSession userSession = r8.A0F;
            boolean A062 = 182.A06(0Tu.A06, userSession, 36315009345391556L);
            0qQ.A0A(Boolean.valueOf(A062));
            if (!A062) {
                AnonymousClass0iw r02 = r8.A0E;
                Context context = r8.A0A;
                0qQ.A06(context);
                C314496iM r52 = new C314496iM(context, r02, userSession);
                Activity activity = (Activity) context;
                DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
                RectF rectF = 0nA.A01;
                r52.A02(activity, new AnonymousClass9UE((View) 00k.A0K(arrayList), 0, (int) TypedValue.applyDimension(1, 30.0f, displayMetrics), true), "story_selfie_reply", false);
            }
        }
    }

    public static final void A0B(C314226hr r3) {
        Iterator it = r3.A0S.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(8);
        }
        Iterator it2 = r3.A0Q.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).setVisibility(0);
        }
        Iterator it3 = r3.A0R.iterator();
        while (it3.hasNext()) {
            View view = (View) it3.next();
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
    }

    public static final void A0C(C314226hr r3) {
        Iterator it = r3.A0S.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(0);
        }
        Iterator it2 = r3.A0T.iterator();
        while (it2.hasNext()) {
            View view = (View) it2.next();
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        Iterator it3 = r3.A0Q.iterator();
        while (it3.hasNext()) {
            ((View) it3.next()).setVisibility(8);
        }
        r3.A0H.setVisibility(8);
    }

    public static final void A0D(C314226hr r2) {
        C21225XPt xPt = r2.A03;
        if (xPt != null) {
            r2.A0C.removeView(xPt);
            r2.A03 = null;
            A0I(r2, AnonymousClass05K.A01);
        }
        C317446nH.A03.set(true);
        A0H(r2, false, false);
        r2.A0H.setVisibility(8);
        r2.DuK(XR4.Avatar);
    }

    public static final void A0E(C314226hr r10, int i) {
        C317876nz BzU;
        C317966o8 r0;
        C318046oG r1;
        Integer num;
        long j;
        String str;
        Long A0n2;
        C317466nJ r12 = (C317466nJ) 00k.A0O(r10.A0P, i);
        if (r12 != null && (BzU = r12.BzU()) != null && (r0 = (C317966o8) 00k.A0O(BzU.A0O, 0)) != null) {
            C314356i4 r4 = r10.A0I;
            String str2 = r0.A0a;
            String str3 = r0.A0b;
            C317876nz BzU2 = r12.BzU();
            if (BzU2 != null) {
                r1 = BzU2.A00();
            } else {
                r1 = null;
            }
            if (r1 == C318046oG.AVATAR_ANIMATED) {
                num = AnonymousClass05K.A00;
            } else {
                num = AnonymousClass05K.A01;
            }
            HashSet hashSet = r4.A04;
            if (!00k.A0u(hashSet, str2)) {
                0wc r2 = r4.A03;
                0Aj A002 = r2.A00(r2.A00, "avatar_stickers_measurement_avatar_sticker_tray_impression");
                if (A002.isSampled()) {
                    if (str2 != null) {
                        hashSet.add(str2);
                    }
                    0bb r3 = new 0bb();
                    if (str2 == null || (A0n2 = 00y.A0n(10, str2)) == null) {
                        j = 0;
                    } else {
                        j = A0n2.longValue();
                    }
                    r3.A05(AnonymousClass000.A00(193), Long.valueOf(j));
                    r3.A05("page_number", 0L);
                    r3.A05("total_pages", 1L);
                    if (num.intValue() != 0) {
                        str = "static";
                    } else {
                        str = "animated_sticker";
                    }
                    r3.A06("sticker_type", str);
                    Long valueOf = Long.valueOf((long) i);
                    r3.A05("sticker_rank", valueOf);
                    r3.A05("sticker_page_index", valueOf);
                    r3.A05("result_size", 6L);
                    r3.A06("referrer_surface", "quick_reaction");
                    r3.A03("is_social_sticker", false);
                    r3.A06("sticker_template_name", str3);
                    A002.AAK(r3, "event_data");
                    A002.AAJ("avatar_session_id", r4.A01);
                    A002.Cgf();
                }
            }
        }
    }

    public static final void A0F(C314226hr r11, XR4 xr4) {
        if (xr4 == XR4.Avatar) {
            AnonymousClass0eM r6 = r11.A0W;
            C317936o5 r2 = ((C314336i2) r6.getValue()).A01;
            AvatarStore avatarStore = r2.A01;
            if (!C317936o5.A02(avatarStore) && C314866iy.A00(r2.A02) && C317936o5.A01(avatarStore) && !r2.A00.A00.A00.getBoolean("key_has_seen_any_avatar_convergence_auto_migration_upsell", false)) {
                C252063oV r7 = r11.A0G;
                Context context = r11.A0A;
                0qQ.A06(context);
                String string = 02K.A01(context).getString(2131956715);
                0qQ.A07(string);
                C66297MMg mMg = new C66297MMg(r11, 12);
                String string2 = 02K.A01(context).getString(2131956726);
                0qQ.A07(string2);
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(' ');
                sb.append(string2);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
                AnonymousClass7AV.A05(spannableStringBuilder, new C46680Dj9(context, mMg), string2);
                ((TextView) r7.getView()).setText(spannableStringBuilder);
                ((TextView) r7.getView()).setMovementMethod(LinkMovementMethod.getInstance());
                r7.getView().setVisibility(0);
                C314336i2 r22 = (C314336i2) r6.getValue();
                0xY AR4 = r22.A00.A00.A00.AR4();
                AR4.E5T("key_has_seen_any_avatar_convergence_auto_migration_upsell", true);
                AR4.apply();
                r22.A01();
                return;
            }
        }
        if (!1NM.A00(r11.A0F).A01() || r11.A0G.CVM()) {
            r11.A0G.getView().setVisibility(8);
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.07Z, X.4DH] */
    public static final void A0H(C314226hr r9, Boolean bool, boolean z) {
        AnonymousClass11O.A03(AnonymousClass07a.A00(r9.A0D), new C61860pz(new AnonymousClass9K0(r9, (AnonymousClass4D7) null), ((AvatarStickerInteractor) r9.A0Z.getValue()).A03((C61082JwK) null, A01(r9), C317866ny.AQR, (Integer) null, (Integer) null, (String) null, bool.booleanValue(), z)));
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.XPt, android.view.View, com.instagram.reels.common.ui.StoryTypeSelectorView] */
    public static final void A0I(C314226hr r14, Integer num) {
        C21225XPt xPt;
        IgImageView secondOptionImageView;
        if (r14.A03 == null) {
            Context context = r14.A0A;
            0qQ.A06(context);
            UserSession userSession = r14.A0F;
            Integer num2 = AnonymousClass05K.A00;
            boolean z = false;
            if (num == num2) {
                z = true;
            }
            String string = context.getString(2131961602);
            0qQ.A07(string);
            String string2 = context.getString(2131953488);
            0qQ.A07(string2);
            ? storyTypeSelectorView = new StoryTypeSelectorView(context, (AttributeSet) null, 0, z, userSession, string, string2);
            storyTypeSelectorView.setOnClickListener(new C22047XuW(userSession, storyTypeSelectorView));
            storyTypeSelectorView.A00 = r14;
            r14.A0C.addView(storyTypeSelectorView, 0);
            0nA.A0T(storyTypeSelectorView, (int) 0nA.A04(context, 14));
            ViewGroup.LayoutParams layoutParams = storyTypeSelectorView.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            r14.A03 = storyTypeSelectorView;
            if (num == num2) {
                storyTypeSelectorView.setBackgroundDrawable(R.drawable.reel_pill_switcher_background_visual_toggle);
                storyTypeSelectorView.setHighlightDrawable(R.drawable.reel_pill_switcher_highlight_background_visual_toggle);
                Spannable spannable = C306386Ly.A0d;
                Context context2 = storyTypeSelectorView.getContext();
                0qQ.A07(context2);
                C306386Ly r1 = new C306386Ly(context2, context2.getResources().getDimensionPixelSize(R.dimen.ai_agent_share_profile_sticker_padding));
                r1.A0M("😍");
                storyTypeSelectorView.setFirstOptionDrawable(r1);
                if (0qQ.A0K(((AvatarStore) r14.A0b.getValue()).A01.A00, C297385rf.A00)) {
                    AnonymousClass0eM r6 = r14.A0f;
                    Object value = r6.getValue();
                    0qQ.A07(value);
                    boolean booleanValue = ((Boolean) value).booleanValue();
                    int i = R.drawable.instagram_facebook_avatars_filled_44;
                    if (booleanValue) {
                        i = R.drawable.instagram_avatars_filled_44;
                    }
                    Drawable drawable = context.getDrawable(i);
                    Resources resources = context.getResources();
                    Object value2 = r6.getValue();
                    0qQ.A07(value2);
                    boolean booleanValue2 = ((Boolean) value2).booleanValue();
                    int i2 = R.dimen.abc_action_bar_elevation_material;
                    if (booleanValue2) {
                        i2 = R.dimen.action_bar_item_spacing_left;
                    }
                    int dimensionPixelSize = resources.getDimensionPixelSize(i2);
                    Resources resources2 = context.getResources();
                    Object value3 = r6.getValue();
                    0qQ.A07(value3);
                    boolean booleanValue3 = ((Boolean) value3).booleanValue();
                    int i3 = R.dimen.abc_action_bar_elevation_material;
                    if (booleanValue3) {
                        i3 = R.dimen.action_bar_item_spacing_left;
                    }
                    int dimensionPixelSize2 = resources2.getDimensionPixelSize(i3);
                    Resources resources3 = context.getResources();
                    Object value4 = r6.getValue();
                    0qQ.A07(value4);
                    boolean booleanValue4 = ((Boolean) value4).booleanValue();
                    int i4 = R.dimen.action_bar_item_spacing_left;
                    if (booleanValue4) {
                        i4 = R.dimen.challenge_winner_v2_3_winner2_submission_margin_top;
                    }
                    int dimensionPixelSize3 = resources3.getDimensionPixelSize(i4);
                    if (drawable != null) {
                        drawable.setTint(context.getColor(R.color.design_dark_default_color_on_background));
                        C21225XPt xPt2 = r14.A03;
                        if (xPt2 != null && (secondOptionImageView = xPt2.getSecondOptionImageView()) != null) {
                            secondOptionImageView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize3);
                            secondOptionImageView.setImageDrawable(drawable);
                        }
                    }
                }
            } else if (182.A06(0Tu.A05, userSession, 36320725946082081L) && (xPt = r14.A03) != null) {
                xPt.setBackgroundDrawable(R.drawable.reel_pill_switcher_background_modernized);
            }
        }
    }

    private final void A0J(boolean z) {
        if (182.A06(0Tu.A05, this.A0F, 36320987939087360L)) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat.setInterpolator(new OvershootInterpolator());
            ofFloat.setDuration(500);
            ofFloat.addUpdateListener(new C56680I7l(this));
            ofFloat.addListener(new I7Y(this, z));
            ofFloat.start();
        }
    }

    private final boolean A0K() {
        C250973mM r0 = this.A01;
        if (r0 != null) {
            Reel reel = r0.A0H;
            if (reel.A1T) {
                return false;
            }
            User A0D2 = reel.A0D();
            if (A0D2 != null && C308426Uf.A00.A00(this.A0F, A0D2)) {
                return false;
            }
        }
        if (((Boolean) this.A0g.getValue()).booleanValue()) {
            return false;
        }
        boolean A062 = 182.A06(0Tu.A05, this.A0F, 36315009345457093L);
        0qQ.A0A(Boolean.valueOf(A062));
        return A062;
    }

    public static final boolean A0L(C314226hr r2) {
        Object value = r2.A0i.getValue();
        0qQ.A07(value);
        if (!((Boolean) value).booleanValue() || !26G.A00(r2.A0F).A00.getBoolean("key_is_eligible_for_aqr_override_default", true)) {
            return false;
        }
        return true;
    }

    public final void A0M(boolean z) {
        this.A06 = z;
        if (z) {
            int intValue = this.A04.intValue();
            if (intValue == 1) {
                this.A0C.setVisibility(0);
                C21225XPt xPt = this.A03;
                if (xPt != null) {
                    A0G(this, xPt.getSelectedQuickReactionsType(), false, false);
                }
                this.A0B.setVisibility(8);
                C21225XPt xPt2 = this.A03;
                if (xPt2 != null) {
                    xPt2.setVisibility(0);
                    return;
                }
                return;
            } else if (intValue == 0) {
                this.A0C.setVisibility(0);
                A0G(this, XR4.Emoji, false, false);
                this.A0B.setVisibility(0);
                C21225XPt xPt3 = this.A03;
                if (xPt3 != null) {
                    xPt3.setVisibility(8);
                    return;
                }
                return;
            } else if (intValue != 2) {
                throw new RuntimeException();
            }
        }
        A08(this);
    }

    public final long AyD() {
        return 0;
    }

    public final /* synthetic */ boolean BVb() {
        return false;
    }

    public final AnonymousClass4DH BZy() {
        return this.A0D;
    }

    public final /* synthetic */ int BrB() {
        return 0;
    }

    public final /* synthetic */ boolean Bu3() {
        return false;
    }

    public final boolean CWK() {
        return false;
    }

    public final boolean CXD() {
        return false;
    }

    public final boolean CXt() {
        return false;
    }

    public final /* synthetic */ boolean Cau() {
        return false;
    }

    public final boolean Cc2() {
        return false;
    }

    public final void CxF() {
        this.A0P.clear();
        C21225XPt xPt = this.A03;
        if (xPt != null) {
            this.A0C.removeView(xPt);
            this.A03 = null;
            if (0qQ.A0K(((AvatarStore) this.A0b.getValue()).A01.A00, C297385rf.A00)) {
                A0I(this, AnonymousClass05K.A00);
            }
        }
        A05(this);
    }

    public final void CxR() {
        C317446nH.A03.set(true);
        A0H(this, false, false);
        this.A0H.setVisibility(8);
    }

    public final /* synthetic */ boolean Dpr() {
        return false;
    }

    public final /* synthetic */ boolean Dq0() {
        return false;
    }

    public final /* synthetic */ boolean Dqd() {
        return false;
    }

    public final void Etz() {
        Drawable A022;
        ImageView imageView = (ImageView) this.A0Y.getValue();
        Context context = this.A0A;
        0qQ.A06(context);
        UserSession userSession = this.A0F;
        boolean A062 = 182.A06(0Tu.A06, userSession, 36314927740357534L);
        0Tu r6 = 0Tu.A05;
        if (!182.A06(r6, userSession, 36325351626716061L) || !A062) {
            if (182.A06(r6, userSession, 36325351626716061L)) {
                if (!A062) {
                    A022 = context.getDrawable(R.drawable.ig_avatars_style_2_ig_3static_style2);
                    if (A022 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            } else if (!A062) {
                A022 = context.getDrawable(R.drawable.ig_avatar_assets_aqr_group_static_standard);
                if (A022 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            A022 = C320996tP.A02(context, userSession, "https://static.xx.fbcdn.net/assets/?set=ig_avatar_assets&name=aqr-nux-group-animated-standard&density=2", context.getResources().getDimensionPixelSize(R.dimen.action_button_min_width), context.getResources().getDimensionPixelSize(R.dimen.music_pick_empty_aggregation_text_width), C63282KuR.A00(userSession));
        } else {
            String A012 = AnonymousClass2dd.A01(context.getResources(), R.drawable.ig_avatars_style_2_ig_3anim_style2);
            if (A012 == null) {
                A012 = "";
            }
            String valueOf = String.valueOf(R.drawable.ig_avatars_style_2_ig_3anim_style2);
            A022 = new C321016tR(context, userSession, new C321076tX(context.getResources().getDimensionPixelSize(R.dimen.music_pick_empty_aggregation_text_width), context.getResources().getDimensionPixelSize(R.dimen.music_pick_empty_aggregation_text_width), context.getResources().getDimensionPixelSize(R.dimen.action_button_min_width)), AnonymousClass05K.A00, A012, valueOf, (String) null, 1.0f, context.getColor(R.color.fds_white_alpha60), context.getColor(R.color.cds_white_a20), false);
        }
        imageView.setImageDrawable(A022);
        this.A0H.setVisibility(0);
        AnonymousClass0fU.A00(new C64245LWx(this), (View) this.A0X.getValue());
        Iterator it = this.A0S.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(8);
        }
    }

    public static final void A0G(C314226hr r10, XR4 xr4, boolean z, boolean z2) {
        C347017w8 r7;
        Drawable drawable;
        C268684dp r8;
        String str;
        Drawable drawable2;
        int ordinal = xr4.ordinal();
        if (ordinal == 0) {
            r10.A0J(true);
            if (0qQ.A0K(((AvatarStore) r10.A0b.getValue()).A01.A00, C299715vi.A00)) {
                C314356i4 r1 = r10.A0I;
                String obj = UUID.randomUUID().toString();
                0qQ.A07(obj);
                r1.A01 = obj;
                r1.A02 = false;
                r1.A04.clear();
                C21225XPt xPt = r10.A03;
                if (xPt != null) {
                    Context context = r10.A0A;
                    0qQ.A06(context);
                    0nA.A0T(xPt, (int) 0nA.A04(context, 14));
                }
            }
            if (z) {
                C317446nH.A00(new HG4(r10), r10.A0R);
            } else {
                A0C(r10);
            }
            if (z2) {
                AnonymousClass0eM r5 = r10.A0k;
                int i = ((0xa) r5.getValue()).getInt("emoji_more_options_button_animation_count", 0);
                if (((Boolean) r10.A0g.getValue()).booleanValue() && i < 3) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.9f, 1.2f, 1.0f});
                    ofFloat.setDuration(1000);
                    ofFloat.setStartDelay(250);
                    ofFloat.setInterpolator(C317446nH.A00);
                    ofFloat.addUpdateListener(new C56681I7m(r10));
                    ofFloat.start();
                    0xY AR4 = ((0xa) r5.getValue()).AR4();
                    AR4.E5Z("emoji_more_options_button_animation_count", i + 1);
                    AR4.apply();
                }
            }
        } else if (ordinal == 1) {
            r10.A0J(false);
            C21225XPt xPt2 = r10.A03;
            if (xPt2 != null) {
                Context context2 = r10.A0A;
                0qQ.A06(context2);
                0nA.A0T(xPt2, (int) 0nA.A04(context2, 0));
            }
            String str2 = null;
            if (0qQ.A0K(((AvatarStore) r10.A0b.getValue()).A01.A00, C297385rf.A00)) {
                r10.A0I.A00((String) null);
                r10.Etz();
                return;
            }
            C314346i3 r52 = r10.A0J;
            if (r52 != null) {
                if (!r52.A02) {
                    02m r72 = r52.A04;
                    r72.markerStart(129898941);
                    r72.markerAnnotate(129898941, "surface", "AVATAR_QUICK_REACTIONS");
                    r72.markerAnnotate(129898941, "num_expected_stickers", r52.A03);
                    r72.markerAnnotate(129898941, "sticker_pack_id", r52.A06);
                    r72.markerAnnotate(129898941, "avatar_session_id", r52.A05);
                    C392059u8 r12 = r52.A00;
                    if (r12 != null && (r12 instanceof C389479ph)) {
                        C314346i3.A00(r52);
                    }
                }
                r52.A02 = true;
            }
            C314356i4 r2 = r10.A0I;
            C61294K1h k1h = r2.A00;
            if (k1h != null) {
                str2 = k1h.A03;
            }
            r2.A00(str2);
            r10.A0H.setVisibility(8);
            if (z) {
                C317446nH.A00(new HG3(r10), r10.A0T);
            } else {
                A0B(r10);
            }
            if (r52 != null) {
                ArrayList arrayList = r10.A0R;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Drawable drawable3 = ((ImageView) ((View) arrayList.get(i2)).findViewById(R.id.asset_item)).getDrawable();
                    Boolean bool = null;
                    if (drawable3 instanceof C347017w8) {
                        r7 = (C347017w8) drawable3;
                        if (r7 != null) {
                            drawable = r7.A04();
                        }
                        drawable = null;
                    } else {
                        r7 = null;
                        drawable = null;
                    }
                    if (!(drawable instanceof C321006tQ) || (r8 = (C321006tQ) drawable) == null) {
                        if (r7 != null) {
                            drawable2 = r7.A04();
                        } else {
                            drawable2 = null;
                        }
                        if (drawable2 instanceof C369768vI) {
                            r8 = (C369768vI) drawable2;
                        } else {
                            r8 = null;
                        }
                    }
                    if (r8 instanceof C321006tQ) {
                        str = ((C321016tR) r8).A0k;
                    } else if (r8 instanceof C369768vI) {
                        str = ((C369768vI) r8).A0L.A0S;
                    } else {
                        str = null;
                    }
                    if (r8 != null) {
                        bool = Boolean.valueOf(r8.isLoading());
                    }
                    if (0qQ.A0K(bool, true)) {
                        r8.A9D(new AZ0(r10, str, i2));
                    } else if (0qQ.A0K(bool, false) && str != null) {
                        r52.A01(str);
                        A0E(r10, i2);
                    }
                }
            }
        } else {
            throw new RuntimeException();
        }
    }
}
