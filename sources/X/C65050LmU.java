package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.instagram.api.schemas.Lyrics;
import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.api.schemas.OriginalSoundConsumptionInfo;
import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.TrackData;
import com.instagram.api.schemas.TrackDataImpl;
import com.instagram.api.schemas.XpostOriginalSoundFBCreatorInfo;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.reels.musicpick.model.MusicPickReelTag;
import com.instagram.reels.musicpick.model.MusicPickStickerModel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.LmU  reason: case insensitive filesystem */
public final class C65050LmU implements B21, B20 {
    public MusicAssetModel A00;
    public MusicPickReelTag A01;
    public MusicPickStickerModel A02;
    public final Context A03;
    public final View A04;
    public final ViewGroup A05;
    public final AnonymousClass4DH A06;
    public final UserSession A07;
    public final C3506685r A08;
    public final AnonymousClass8MF A09;
    public final AnonymousClass6KL A0A;
    public final String A0B;
    public final String A0C = AnonymousClass7TG.A0j();
    public final AnonymousClass0eM A0D = MMU.A00(this, 6);
    public final AnonymousClass0eM A0E = MMU.A00(this, 7);
    public final AnonymousClass0eM A0F = MMU.A00(this, 8);
    public final AnonymousClass0eM A0G = MMU.A00(this, 9);
    public final AnonymousClass0eM A0H = MMU.A00(this, 10);
    public final AnonymousClass0eM A0I = MMU.A00(this, 11);
    public final AnonymousClass0eM A0J = MMU.A00(this, 12);
    public final AnonymousClass0eM A0K = MMU.A00(this, 13);
    public final AnonymousClass0eM A0L = MMU.A00(this, 14);
    public final AnonymousClass0eM A0M = MMU.A00(this, 15);
    public final AnonymousClass0eM A0N = MMU.A00(this, 16);
    public final AnonymousClass0eM A0O = MMU.A00(this, 17);
    public final AnonymousClass0eM A0P = MMU.A00(this, 18);
    public final AnonymousClass0eM A0Q = MMU.A00(this, 19);
    public final AnonymousClass0eM A0R = MMU.A00(this, 20);
    public final AnonymousClass0eM A0S = MMU.A00(this, 21);
    public final boolean A0T;
    public final C354538Mk A0U;

    public C65050LmU(View view, ViewGroup viewGroup, AnonymousClass4DH r9, UserSession userSession, C354538Mk r11, C3506685r r12, AnonymousClass8MF r13, String str) {
        C51972G9s.A1C(viewGroup, str);
        0qQ.A0B(r11, 6);
        0qQ.A0B(r12, 7);
        this.A04 = view;
        this.A05 = viewGroup;
        this.A07 = userSession;
        this.A0B = str;
        this.A06 = r9;
        this.A0U = r11;
        this.A08 = r12;
        this.A09 = r13;
        Context context = view.getContext();
        this.A03 = context;
        this.A0T = AnonymousClass7TF.A1Y(DbT.A0j(userSession).A0K(), true);
        0qQ.A07(context);
        this.A0A = AER.A00(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x014a, code lost:
        if (X.182.A06(X.0Tu.A05, r10.A07, 36323302926462007L) != false) goto L_0x014c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DCS(java.lang.Object r11) {
        /*
            r10 = this;
            r3 = 0
            X.0qQ.A0B(r11, r3)
            X.8Ul r11 = (X.C356588Ul) r11
            com.instagram.reels.musicpick.model.MusicPickStickerModel r1 = r11.A01
            if (r1 != 0) goto L_0x001b
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = r10.A07
            com.instagram.user.model.User r0 = r1.A01(r0)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            com.instagram.reels.musicpick.model.MusicPickStickerModel r1 = new com.instagram.reels.musicpick.model.MusicPickStickerModel
            r1.<init>((java.util.List) r0)
        L_0x001b:
            r10.A02 = r1
            com.instagram.reels.musicpick.model.MusicPickReelTag r1 = r11.A00
            if (r1 == 0) goto L_0x0028
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.reels.musicpick.model.MusicPickReelTag"
            X.0qQ.A0C(r1, r0)
            r10.A01 = r1
        L_0x0028:
            X.0eM r4 = r10.A0L
            java.lang.Object r0 = r4.getValue()
            X.3oV r0 = (X.C252063oV) r0
            boolean r0 = r0.CVM()
            if (r0 != 0) goto L_0x0098
            X.0eM r0 = r10.A0K
            android.view.View r1 = X.AnonymousClass7TH.A06(r0)
            r0 = 56
            X.LY0.A00(r1, r0, r10)
            X.0eM r0 = r10.A0G
            android.widget.ImageView r6 = X.JTR.A0Z(r0)
            android.content.Context r5 = X.AnonymousClass7TE.A0S(r6)
            java.lang.String r2 = r10.A0B
            com.instagram.reels.musicpick.model.MusicPickStickerModel r1 = r10.A02
            java.lang.String r0 = "model"
            if (r1 != 0) goto L_0x005b
            X.0qQ.A0F(r0)
        L_0x0056:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x005b:
            com.instagram.api.schemas.StoryMusicPickTappableData r0 = r1.A00
            java.util.List r1 = r0.A09
            int r0 = r0.A00
            X.7jB r0 = X.AER.A01(r5, r2, r1, r0)
            r6.setImageDrawable(r0)
            android.view.View r1 = X.AnonymousClass7TG.A0Q(r4)
            r0 = 2131436696(0x7f0b2498, float:1.849527E38)
            android.view.View r9 = r1.requireViewById(r0)
            r8 = r9
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            android.content.Context r7 = X.AnonymousClass7TE.A0S(r8)
            r6 = 2131165251(0x7f070043, float:1.7944714E38)
            r5 = 2131099936(0x7f060120, float:1.781224E38)
            r2 = 2131165207(0x7f070017, float:1.7944625E38)
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131970878(0x7f134b3e, float:1.957872E38)
            java.lang.String r0 = X.AnonymousClass7TF.A0d(r1, r0)
            X.6Ly r0 = X.AER.A02(r7, r0, r6, r5, r2)
            r8.setImageDrawable(r0)
            X.0qQ.A07(r9)
        L_0x0098:
            com.instagram.reels.musicpick.model.MusicPickReelTag r5 = r10.A01
            com.instagram.music.common.model.MusicAssetModel r0 = r10.A00
            if (r0 != 0) goto L_0x00dd
            X.0eM r0 = r10.A0J
            java.lang.Object r6 = X.AnonymousClass7TE.A14(r0)
            com.instagram.common.ui.base.IgTextView r6 = (com.instagram.common.ui.base.IgTextView) r6
            r6.setVisibility(r3)
            android.content.Context r2 = r10.A03
            com.instagram.reels.musicpick.model.MusicPickReelTag r0 = r10.A01
            if (r0 == 0) goto L_0x018e
            r1 = 2131967835(0x7f133f5b, float:1.9572548E38)
        L_0x00b2:
            java.lang.String r0 = X.AnonymousClass7TE.A16(r2, r1)
            r6.setText(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r6.setAlpha(r0)
            r6.clearAnimation()
            android.view.ViewPropertyAnimator r2 = X.C51972G9s.A0I(r6)
            r0 = 5000(0x1388, double:2.4703E-320)
            android.view.ViewPropertyAnimator r2 = r2.setStartDelay(r0)
            r0 = 250(0xfa, double:1.235E-321)
            android.view.ViewPropertyAnimator r1 = r2.setDuration(r0)
            X.M2j r0 = new X.M2j
            r0.<init>(r6)
            android.view.ViewPropertyAnimator r0 = r1.withEndAction(r0)
            r0.start()
        L_0x00dd:
            java.lang.String r7 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            if (r5 == 0) goto L_0x016e
            android.view.View r6 = X.AnonymousClass7TG.A0Q(r4)
            android.view.ViewGroup$LayoutParams r2 = r6.getLayoutParams()
            if (r2 == 0) goto L_0x019f
            android.view.ViewGroup r1 = r10.A05
            int r0 = r1.getWidth()
            r2.width = r0
            int r0 = r1.getHeight()
            r2.height = r0
            r6.setLayoutParams(r2)
            android.view.View r1 = X.AnonymousClass7TG.A0Q(r4)
            X.M6g r0 = new X.M6g
            r0.<init>(r10, r5)
            X.0nA.A0q(r1, r0)
        L_0x0108:
            com.instagram.reels.musicpick.model.MusicPickStickerModel r0 = r10.A02
            java.lang.String r2 = "model"
            if (r0 == 0) goto L_0x019a
            com.instagram.api.schemas.StoryMusicPickTappableData r1 = r0.A00
            com.instagram.api.schemas.TrackData r0 = r1.A04
            if (r0 != 0) goto L_0x011b
            com.instagram.api.schemas.OriginalSoundData r0 = r1.A01
            if (r0 != 0) goto L_0x011b
            A00(r10)
        L_0x011b:
            com.instagram.reels.musicpick.model.MusicPickStickerModel r0 = r10.A02
            if (r0 == 0) goto L_0x019a
            java.lang.String r0 = r0.A02
            if (r0 == 0) goto L_0x0129
            int r0 = r0.length()
            if (r0 != 0) goto L_0x012e
        L_0x0129:
            X.0eM r0 = r10.A0I
            X.JTS.A1W(r0, r3)
        L_0x012e:
            com.instagram.reels.musicpick.model.MusicPickStickerModel r0 = r10.A02
            if (r0 == 0) goto L_0x019a
            java.lang.String r0 = r0.A02
            if (r0 == 0) goto L_0x013c
            int r0 = r0.length()
            if (r0 != 0) goto L_0x014c
        L_0x013c:
            com.instagram.common.session.UserSession r3 = r10.A07
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323302926462007(0x810bda00002c37, double:3.0343412606710815E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r3 = 1
            if (r0 == 0) goto L_0x014d
        L_0x014c:
            r3 = 0
        L_0x014d:
            X.0eM r0 = r10.A0E
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            android.view.View r0 = X.AnonymousClass7TG.A0Q(r4)
            android.view.View[] r0 = new android.view.View[]{r1, r0}
            r2 = 0
            X.C294975nL.A04(r2, r0, r3)
            X.8Mk r1 = r10.A0U
            r0 = 168(0xa8, float:2.35E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r1.DnE(r0)
            A01(r10, r2)
            return
        L_0x016e:
            X.0eM r0 = r10.A0M
            android.view.View r2 = X.AnonymousClass7TH.A06(r0)
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            if (r1 == 0) goto L_0x01a4
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            r0 = 17
            r1.gravity = r0
            r2.setLayoutParams(r1)
            android.view.View r1 = X.AnonymousClass7TG.A0Q(r4)
            r0 = 57
            X.LY0.A00(r1, r0, r10)
            goto L_0x0108
        L_0x018e:
            boolean r0 = r10.A0T
            r1 = 2131967834(0x7f133f5a, float:1.9572546E38)
            if (r0 == 0) goto L_0x00b2
            r1 = 2131967833(0x7f133f59, float:1.9572544E38)
            goto L_0x00b2
        L_0x019a:
            X.0qQ.A0F(r2)
            goto L_0x0056
        L_0x019f:
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r7)
            throw r0
        L_0x01a4:
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65050LmU.DCS(java.lang.Object):void");
    }

    public static final void A00(C65050LmU lmU) {
        C51969G9p.A1M(AnonymousClass7TE.A14(lmU.A0D));
        AnonymousClass7TH.A06(lmU.A0K).setVisibility(0);
        lmU.A00 = null;
        lmU.A08.A02().pause();
        A01(lmU, (Boolean) null);
    }

    public static final void A01(C65050LmU lmU, Boolean bool) {
        boolean A1V;
        AnonymousClass0eM r3 = lmU.A0F;
        View A0c = AnonymousClass7TE.A0c(r3);
        boolean z = true;
        if (bool != null) {
            A1V = bool.booleanValue();
        } else {
            A1V = AnonymousClass7TF.A1V(lmU.A00);
        }
        A0c.setEnabled(A1V);
        View A0c2 = AnonymousClass7TE.A0c(r3);
        if (bool != null) {
            z = bool.booleanValue();
        } else if (lmU.A00 == null) {
            z = false;
        }
        C18708VyZ.A01(A0c2, z);
    }

    public final View Azx() {
        return AnonymousClass7TH.A06(this.A0N);
    }

    public final Class Bza() {
        return C346997w6.class;
    }

    public final void DDW() {
        TrackDataImpl trackDataImpl;
        ViewGroup viewGroup;
        OriginalSoundData originalSoundData;
        MusicAssetModel musicAssetModel = this.A00;
        boolean z = true;
        if (musicAssetModel == null || !musicAssetModel.A0U) {
            z = false;
        }
        MusicPickStickerModel musicPickStickerModel = this.A02;
        if (z) {
            if (musicPickStickerModel != null) {
                if (musicAssetModel != null) {
                    String str = "";
                    OriginalSoundConsumptionInfo originalSoundConsumptionInfo = new OriginalSoundConsumptionInfo((MusicMuteAudioReason) null, (String) null, str, musicAssetModel.A0P, false);
                    String str2 = musicAssetModel.A0E;
                    ArrayList A15 = DbV.A15(str2);
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    boolean z2 = musicAssetModel.A0M;
                    boolean z3 = musicAssetModel.A0N;
                    String str3 = musicAssetModel.A0C;
                    0qQ.A07(str3);
                    int i = musicAssetModel.A00;
                    User user = musicAssetModel.A06;
                    if (user == null) {
                        originalSoundData = null;
                    } else {
                        Boolean bool = musicAssetModel.A07;
                        0qQ.A07(bool);
                        boolean booleanValue = bool.booleanValue();
                        boolean z4 = musicAssetModel.A0S;
                        OriginalAudioSubtype originalAudioSubtype = OriginalAudioSubtype.A07;
                        if (musicAssetModel.A0U) {
                            str = musicAssetModel.A0I;
                        }
                        0qQ.A0A(str);
                        String str4 = musicAssetModel.A0G;
                        if (str4 == null) {
                            originalSoundData = null;
                        } else {
                            String str5 = musicAssetModel.A0H;
                            0qQ.A07(str5);
                            User user2 = user;
                            originalSoundData = new OriginalSoundData(originalAudioSubtype, originalSoundConsumptionInfo, (XpostOriginalSoundFBCreatorInfo) null, user2, Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(musicAssetModel.A0Q), Boolean.valueOf(musicAssetModel.A0R), false, (Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, Integer.valueOf(i), (Integer) null, (Integer) null, (Integer) null, (Integer) null, str2, str3, (String) null, (String) null, str, str4, str5, (List) null, A15, A1C, false, false, booleanValue, z4, false);
                        }
                    }
                } else {
                    originalSoundData = null;
                }
                musicPickStickerModel.A01(originalSoundData);
                MusicPickStickerModel musicPickStickerModel2 = this.A02;
                if (musicPickStickerModel2 != null) {
                    musicPickStickerModel2.A02((TrackData) null);
                }
            }
            0qQ.A0F("model");
            throw AnonymousClass00P.createAndThrow();
        }
        if (musicPickStickerModel != null) {
            if (musicAssetModel != null) {
                String str6 = musicAssetModel.A0E;
                0qQ.A07(str6);
                String str7 = musicAssetModel.A0B;
                String str8 = musicAssetModel.A0H;
                String str9 = musicAssetModel.A0C;
                List list = musicAssetModel.A0J;
                String str10 = musicAssetModel.A0I;
                String str11 = musicAssetModel.A0D;
                ImageUrl imageUrl = musicAssetModel.A02;
                0qQ.A07(imageUrl);
                ImageUrl imageUrl2 = musicAssetModel.A03;
                int i2 = musicAssetModel.A00;
                boolean z5 = musicAssetModel.A0S;
                boolean z6 = musicAssetModel.A0O;
                boolean z7 = musicAssetModel.A0L;
                ImageUrl imageUrl3 = imageUrl2;
                ImageUrl imageUrl4 = imageUrl;
                trackDataImpl = new TrackDataImpl((Lyrics) null, imageUrl3, imageUrl4, Boolean.valueOf(z6), (Boolean) null, (Boolean) null, Integer.valueOf(i2), musicAssetModel.A0A, (String) null, str7, (String) null, str9, str11, musicAssetModel.A0H, str6, (String) null, str8, (String) null, (String) null, (String) null, str10, (String) null, list, z7, z5);
            } else {
                trackDataImpl = null;
            }
            musicPickStickerModel.A02(trackDataImpl);
            MusicPickStickerModel musicPickStickerModel3 = this.A02;
            if (musicPickStickerModel3 != null) {
                musicPickStickerModel3.A01((OriginalSoundData) null);
            }
        }
        0qQ.A0F("model");
        throw AnonymousClass00P.createAndThrow();
        AnonymousClass0eM r3 = this.A0J;
        ViewParent parent = AnonymousClass7TH.A06(r3).getParent();
        if ((parent instanceof IgLinearLayout) && (viewGroup = (ViewGroup) parent) != null) {
            viewGroup.removeView(AnonymousClass7TH.A06(r3));
        }
        A01(this, true);
        AnonymousClass0eM r32 = this.A0L;
        if (((C252063oV) r32.getValue()).CVM()) {
            C294975nL.A05(new View[]{AnonymousClass7TE.A0c(this.A0E), AnonymousClass7TG.A0Q(r32)}, true);
        }
        AnonymousClass8MF r2 = this.A09;
        MusicPickStickerModel musicPickStickerModel4 = this.A02;
        if (musicPickStickerModel4 != null) {
            r2.Dn8(musicPickStickerModel4, C273654mx.A00(168));
            return;
        }
        0qQ.A0F("model");
        throw AnonymousClass00P.createAndThrow();
    }
}
