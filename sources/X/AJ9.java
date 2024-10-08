package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceDataSource;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class AJ9 {
    public int A00 = 1;
    public int A01;
    public ValueAnimator A02;
    public ImageView A03;
    public IgTextView A04;
    public C347017w8 A05;
    public C347017w8 A06;
    public C317876nz A07;
    public MusicAssetModel A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public String A0E;
    public final View A0F;
    public final ViewGroup A0G;
    public final AnonymousClass07Z A0H;
    public final UserSession A0I;
    public final C357918a4 A0J;
    public final C357788Zr A0K;
    public final C357898a2 A0L;
    public final C387649mY A0M;
    public final A6O A0N;
    public final 1Av A0O;
    public final WeakReference A0P;
    public final AnonymousClass0eM A0Q = AnonymousClass0eN.A01(new MMS(this, 20));
    public final AnonymousClass0eM A0R = AnonymousClass0eN.A01(new MMS(this, 21));
    public final AnonymousClass0eM A0S = AnonymousClass0eN.A01(new MMS(this, 22));
    public final AnonymousClass0eM A0T = AnonymousClass0eN.A00(0eO.A02, new MMS(this, 23));
    public final ViewGroup A0U;
    public final AnonymousClass0iw A0V;

    public AJ9(ViewGroup viewGroup, AnonymousClass07Z r26, AnonymousClass0iw r27, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, C357918a4 r30, C357898a2 r31, WeakReference weakReference) {
        C317846nw r7;
        UserSession userSession2 = userSession;
        this.A0I = userSession2;
        this.A0P = weakReference;
        AnonymousClass07Z r10 = r26;
        this.A0H = r10;
        ViewGroup viewGroup2 = viewGroup;
        this.A0U = viewGroup2;
        C357898a2 r5 = r31;
        this.A0L = r5;
        AnonymousClass0iw r6 = r27;
        this.A0V = r6;
        this.A0J = r30;
        ViewGroup viewGroup3 = (ViewGroup) AnonymousClass7TF.A0G(viewGroup2, R.id.sticker_edit_container);
        this.A0G = viewGroup3;
        View A0G2 = AnonymousClass7TF.A0G(viewGroup3, R.id.sticker_preview_view);
        this.A0F = A0G2;
        this.A0O = 1Au.A00(userSession2);
        this.A0N = new A6O(A0G2, new A4K(this));
        Context context = viewGroup3.getContext();
        ArrayList arrayList = C357788Zr.A02;
        0qQ.A0A(context);
        this.A0K = new C357788Zr(context);
        0qQ.A07(context);
        ViewGroup viewGroup4 = viewGroup3;
        AnonymousClass0iw r16 = r6;
        C387649mY r13 = new C387649mY(context, viewGroup4, r16, new AnonymousClass8AL(context, viewGroup3.requireViewById(R.id.sticker_picker_container_stub), r10, (GalleryPickerServiceDataSource) null, userSession2, (C357638Yz) null, targetViewSizeProvider, (AnonymousClass8AH) null, (X3Z) null, (AnonymousClass8AK) null, (C3504884v) null, (AnonymousClass825) null, R.drawable.floating_button_background, false, true, false), new A4J(this));
        this.A0M = r13;
        r13.A01(false);
        if (r5.CPG()) {
            AnonymousClass07Z r4 = this.A0H;
            07U r72 = 07U.A05;
            AnonymousClass0xx A002 = AnonymousClass07a.A00(r4);
            C66170MGh mGh = new C66170MGh(r4, r72, this, (AnonymousClass4D7) null, 27);
            19B r42 = 19B.A00;
            1Eo.A05(r42, mGh, A002);
            AnonymousClass07Z r52 = this.A0H;
            1Eo.A05(r42, new C66170MGh(r52, r72, this, (AnonymousClass4D7) null, 26), AnonymousClass07a.A00(r52));
            if (0qQ.A0K(25x.A00(userSession2).A01.A00, C299715vi.A00)) {
                C60286Jii jii = (C60286Jii) this.A0S.getValue();
                if (jii != null) {
                    if (jii.A02.intValue() == 0) {
                        C317866ny r62 = C317866ny.STORIES;
                        UserSession userSession3 = jii.A00;
                        if (182.A06(AnonymousClass7TF.A0H(userSession3), userSession3, 36315898403098270L)) {
                            r7 = C317846nw.MUSIC_AVATAR_STICKERS_ANIMATED_DEFAULT_STICKER;
                        } else {
                            r7 = C317846nw.MUSIC_AVATAR_STICKERS_DEFAULT_STICKER;
                        }
                        1Eo.A05(r42, new C59845JaL(r62, r7, jii, (AnonymousClass4D7) null, 22), C318116oQ.A00(jii));
                    } else {
                        throw AnonymousClass7TE.A1K();
                    }
                }
                C60286Jii jii2 = (C60286Jii) this.A0S.getValue();
                if (jii2 != null) {
                    jii2.A02();
                }
            }
        }
    }

    public static final void A06(AJ9 aj9) {
        Context context;
        Resources resources;
        int i = 0;
        aj9.A0B = false;
        ImageView imageView = aj9.A03;
        if (imageView != null) {
            Context A0S2 = AnonymousClass7TE.A0S(aj9.A0G);
            C61028JvS jvS = new C61028JvS((String) null, 0, false, false, false);
            UserSession userSession = aj9.A0I;
            ImageView imageView2 = aj9.A03;
            if (!(imageView2 == null || (context = imageView2.getContext()) == null || (resources = context.getResources()) == null)) {
                i = resources.getDimensionPixelSize(R.dimen.accent_edge_thickness);
            }
            imageView.setImageDrawable(new C60002JdB(A0S2, jvS, userSession, i));
        }
        ImageView imageView3 = aj9.A03;
        if (imageView3 != null) {
            imageView3.invalidate();
        }
        A03(aj9);
    }

    public static final C347017w8 A00(C317876nz r6, AJ9 aj9) {
        aj9.A0E = ((C317966o8) r6.A0O.get(0)).A0M;
        Context context = aj9.A0G.getContext();
        UserSession userSession = aj9.A0I;
        C317966o8 r1 = (C317966o8) 00k.A0O(r6.A0O, 0);
        if (r1 != null) {
            r1.A0c = C273654mx.A00(502);
        }
        return C347017w8.A00(context, (Resources.Theme) null, (AnonymousClass9V0) null, userSession, r6, (C321086tY) null);
    }

    public static final B3d A01(Drawable drawable) {
        if (drawable instanceof AnonymousClass5MI) {
            drawable = ((AnonymousClass5MI) drawable).AfT();
        }
        if (drawable instanceof B3d) {
            return (B3d) drawable;
        }
        throw AnonymousClass7TE.A0z("Check failed.");
    }

    public static final void A02(AJ9 aj9) {
        0Aj A0e;
        int i;
        C60002JdB jdB;
        ImageView imageView = aj9.A03;
        Drawable drawable = null;
        if (imageView != null) {
            drawable = imageView.getDrawable();
        }
        if ((drawable instanceof C60002JdB) && (jdB = (C60002JdB) drawable) != null) {
            boolean z = aj9.A0B;
            C61028JvS jvS = jdB.A01;
            if (z != jvS.A04) {
                jdB.A01 = new C61028JvS(jvS.A01, 0, jvS.A03, jvS.A02, z);
                jdB.invalidateSelf();
            }
        }
        27r A012 = 27p.A01(aj9.A0I);
        boolean z2 = aj9.A0B;
        AnonymousClass2AM r0 = A012.A05;
        ArrayList A1C = AnonymousClass7TE.A1C();
        0wc r1 = r0.A01;
        if (z2) {
            A0e = AnonymousClass7TE.A0e(r1, "toggle_avatar_on_event");
            i = 379;
        } else {
            A0e = AnonymousClass7TE.A0e(r1, "toggle_avatar_off_event");
            i = 378;
        }
        1Ln r12 = new 1Ln(A0e, i);
        if (r12.A00.isSampled()) {
            r12.A0R(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "music_sticker");
            r12.A0S("recipient_ids", A1C);
            r12.Cgf();
        }
    }

    public static final void A03(AJ9 aj9) {
        AnonymousClass7TE.A0c(aj9.A0R).setVisibility(8);
        IgTextView igTextView = aj9.A04;
        if (igTextView != null) {
            igTextView.setVisibility(8);
        }
    }

    public static final void A04(AJ9 aj9) {
        boolean A002 = C318076oL.A00(aj9.A0I);
        AnonymousClass0eM r0 = aj9.A0S;
        C60286Jii jii = (C60286Jii) r0.getValue();
        if (!A002) {
            if (jii != null) {
                jii.A02();
            }
            C60286Jii jii2 = (C60286Jii) r0.getValue();
            if (jii2 != null) {
                jii2.A01();
            }
        } else if (jii != null) {
            AnonymousClass7TE.A1Z(new C66168MGf(jii, (AnonymousClass4D7) null, 49), C318116oQ.A00(jii));
        }
    }

    public static final void A05(AJ9 aj9) {
        AnonymousClass9XK r1;
        C347017w8 r0 = aj9.A06;
        if (r0 != null) {
            B3d A092 = C271404in.A09(r0);
            if ((A092 instanceof AnonymousClass9XK) && (r1 = (AnonymousClass9XK) A092) != null) {
                MusicOverlayStickerModel BUu = aj9.A0L.BUu();
                if (BUu != null) {
                    r1.DT8(BUu);
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
        }
    }

    public static final void A07(AJ9 aj9) {
        AnonymousClass0eM r5 = aj9.A0R;
        AnonymousClass7TE.A0c(r5).setVisibility(0);
        aj9.A00 = C271404in.A00((IgSimpleImageView) r5.getValue(), aj9.A04, C271404in.A08(aj9.A0O, aj9.A0A), aj9.A0B);
        ((ImageView) r5.getValue()).setImageDrawable(aj9.A05);
        View A0c = AnonymousClass7TE.A0c(r5);
        String str = aj9.A0E;
        if (str == null) {
            str = AnonymousClass7TE.A16(AnonymousClass7TE.A0c(r5).getContext(), 2131967757);
        }
        A0c.setContentDescription(str);
        if (!aj9.A0D) {
            IgTextView findViewById = aj9.A0G.findViewById(R.id.avatar_sticker_preview_view_helper);
            aj9.A04 = findViewById;
            if (findViewById != null) {
                findViewById.setVisibility(0);
                findViewById.setAlpha(1.0f);
                aj9.A0D = true;
                findViewById.postDelayed(new C41088AoA(findViewById, aj9), 3000);
            }
        }
    }

    public static final void A08(AJ9 aj9) {
        AnonymousClass9XK r2;
        C347017w8 r0 = aj9.A06;
        if (r0 != null) {
            int i = aj9.A01;
            B3d A092 = C271404in.A09(r0);
            if ((A092 instanceof AnonymousClass9XK) && (r2 = (AnonymousClass9XK) A092) != null) {
                MusicOverlayStickerModel musicOverlayStickerModel = r2.A01;
                int A0A2 = i - AnonymousClass7TG.A0A(musicOverlayStickerModel.A0K);
                Integer num = musicOverlayStickerModel.A0O;
                if (num != null) {
                    num.intValue();
                }
                r2.A00 = A0A2;
                r2.invalidateSelf();
            }
        }
    }
}
