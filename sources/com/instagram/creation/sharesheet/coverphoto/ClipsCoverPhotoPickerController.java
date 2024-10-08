package com.instagram.creation.sharesheet.coverphoto;

import X.0Tu;
import X.0nA;
import X.0qQ;
import X.11Z;
import X.182;
import X.AnonymousClass00P;
import X.AnonymousClass07Z;
import X.AnonymousClass0eN;
import X.AnonymousClass3Q2;
import X.AnonymousClass4DH;
import X.C252233om;
import X.C59986Jcv;
import X.C60123Jg4;
import X.C60250Ji7;
import X.C61082JwK;
import X.C61084JwM;
import X.C61383K5b;
import X.C62124Kaa;
import X.C63209KtG;
import X.C64320LZv;
import X.C65235Lpf;
import X.C65894M3j;
import X.C66296MMf;
import X.C66518MUw;
import X.DbT;
import X.G9w;
import X.JTO;
import X.L4H;
import X.LT1;
import X.MP9;
import X.MXH;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.io.File;

public final class ClipsCoverPhotoPickerController extends C252233om implements C66518MUw {
    public C59986Jcv A00;
    public MXH A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Context A06;
    public final AnonymousClass07Z A07;
    public final AnonymousClass4DH A08;
    public final UserSession A09;
    public final C61383K5b A0A;
    public final C60123Jg4 A0B;
    public final AnonymousClass3Q2 A0C;
    public final C60250Ji7 A0D;
    public final String A0E;
    public final boolean A0F;
    public final boolean A0G;
    public View addFromGalleryButton;
    public View addTextView;
    public FrameLayout coverPhotoContainer;
    public FrameLayout coverPhotoContainerVideoPreview;
    public IgImageView currentCoverPhotoImage;
    public LinearLayout filmStripFramesContainer;
    public View playCountContainer;
    public SeekBar seekBar;

    public ClipsCoverPhotoPickerController(Context context, AnonymousClass07Z r7, AnonymousClass4DH r8, UserSession userSession, C61383K5b k5b, C60123Jg4 jg4, AnonymousClass3Q2 r12, C60250Ji7 ji7, String str, boolean z, boolean z2) {
        0qQ.A0B(userSession, 2);
        this.A06 = context;
        this.A09 = userSession;
        this.A0A = k5b;
        this.A0D = ji7;
        this.A0B = jg4;
        this.A07 = r7;
        this.A0G = z;
        this.A08 = r8;
        this.A0C = r12;
        this.A0E = str;
        this.A0F = z2;
        this.A03 = 0nA.A09(context) / 2;
        this.A02 = JTO.A05((float) (0nA.A09(context) / 2), 0.5625f);
        this.A04 = context.getResources().getDimensionPixelOffset(R.dimen.activation_card_icon_container_width);
        Context context2 = this.A06;
        Resources resources = context2.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.audio_page_audio_filter_tooltip_vertical_offset);
        int A062 = 0nA.A06(context2) - (resources.getDimensionPixelOffset(R.dimen.abc_edit_text_inset_top_material) * 2);
        this.A05 = A062 / JTO.A04((float) A062, (float) dimensionPixelOffset);
        ji7.A09.A06(r7, new C64320LZv(new MP9(this, 4), 13));
    }

    public final void Dmc() {
    }

    public final void DnT() {
        A01(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0093, code lost:
        if (X.182.A06(X.0Tu.A05, r9.A09, 36330501291655839L) == false) goto L_0x0095;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r32, android.os.Bundle r33) {
        /*
            r31 = this;
            r2 = 0
            r5 = r32
            X.0qQ.A0B(r5, r2)
            r0 = 2131430890(0x7f0b0dea, float:1.8483494E38)
            android.view.View r0 = r5.requireViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            X.0qQ.A0B(r0, r2)
            r9 = r31
            r9.coverPhotoContainer = r0
            r0 = 2131430893(0x7f0b0ded, float:1.84835E38)
            android.view.View r0 = r5.requireViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            X.0qQ.A0B(r0, r2)
            r9.coverPhotoContainerVideoPreview = r0
            r0 = 2131431150(0x7f0b0eee, float:1.8484021E38)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = X.DbT.A0b(r5, r0)
            X.0qQ.A0B(r0, r2)
            r9.currentCoverPhotoImage = r0
            r0 = 2131432838(0x7f0b1586, float:1.8487445E38)
            android.view.View r0 = r5.requireViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            X.0qQ.A0B(r0, r2)
            r9.filmStripFramesContainer = r0
            r0 = 2131440960(0x7f0b3540, float:1.8503918E38)
            android.view.View r0 = r5.requireViewById(r0)
            android.widget.SeekBar r0 = (android.widget.SeekBar) r0
            X.0qQ.A0B(r0, r2)
            r9.seekBar = r0
            r0 = 2131427702(0x7f0b0176, float:1.8477028E38)
            android.view.View r3 = r5.requireViewById(r0)
            X.0qQ.A0B(r3, r2)
            r9.addFromGalleryButton = r3
            r0 = 147(0x93, float:2.06E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0qQ.A0C(r3, r0)
            com.instagram.igds.components.button.IgdsButton r3 = (com.instagram.igds.components.button.IgdsButton) r3
            android.content.Context r1 = r3.getContext()
            r0 = 2131956803(0x7f131443, float:1.9550172E38)
            java.lang.String r0 = r1.getString(r0)
            r3.setText((java.lang.String) r0)
            r0 = 67
            X.LYF.A01(r3, r0, r9)
            android.widget.FrameLayout r0 = r9.coverPhotoContainer
            if (r0 == 0) goto L_0x0252
            int r15 = r9.A03
            int r14 = r9.A02
            X.0nA.A0g(r0, r15, r14)
            boolean r0 = r9.A0F
            if (r0 != 0) goto L_0x0095
            com.instagram.common.session.UserSession r4 = r9.A09
            X.0Tu r3 = X.0Tu.A05
            r0 = 36330501291655839(0x8112660000429f, double:3.038893535805151E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            r7 = 1
            if (r0 != 0) goto L_0x0096
        L_0x0095:
            r7 = 0
        L_0x0096:
            r6 = r7 ^ 1
            r0 = 2131437757(0x7f0b28bd, float:1.8497422E38)
            android.view.View r1 = r5.requireViewById(r0)
            X.0qQ.A0B(r1, r2)
            r9.playCountContainer = r1
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            X.0nA.A0l(r1, r0, r0, r0, r0)
            r0 = 2131438106(0x7f0b2a1a, float:1.849813E38)
            android.widget.TextView r4 = X.DbU.A0G(r5, r0)
            r3 = 0
            if (r4 == 0) goto L_0x00c2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            android.content.res.Resources r0 = X.DbU.A05(r4)
            java.lang.String r0 = X.C14066TpE.A01(r0, r1, r2)
            r4.setText(r0)
        L_0x00c2:
            android.view.View r0 = r9.playCountContainer
            if (r0 == 0) goto L_0x024f
            if (r6 != 0) goto L_0x00ca
            r3 = 8
        L_0x00ca:
            r0.setVisibility(r3)
            r0 = 2131427753(0x7f0b01a9, float:1.8477131E38)
            android.view.View r1 = r5.requireViewById(r0)
            r0 = 66
            X.LYF.A01(r1, r0, r9)
            int r0 = X.DbW.A01(r7)
            r1.setVisibility(r0)
            r9.addTextView = r1
            int r10 = r9.A04
            android.content.Context r8 = r9.A06
            android.content.res.Resources r0 = r8.getResources()
            r6 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r0 = r0.getDimensionPixelOffset(r6)
            int r4 = r10 + r0
            android.widget.SeekBar r0 = r9.seekBar
            if (r0 == 0) goto L_0x024c
            X.0nA.A0V(r0, r4)
            android.content.res.Resources r0 = r8.getResources()
            X.0qQ.A0A(r0)
            X.Jcv r3 = new X.Jcv
            r3.<init>(r0)
            r0 = 2130969350(0x7f040306, float:1.754738E38)
            r5 = 2131165293(0x7f07006d, float:1.79448E38)
            int r7 = r9.A05
            android.content.res.Resources r1 = r8.getResources()
            int r0 = X.AnonymousClass7TF.A03(r8, r0)
            r3.A04 = r0
            int r0 = r1.getDimensionPixelOffset(r5)
            float r0 = (float) r0
            r3.A01 = r0
            r0 = 1
            r3.A08 = r0
            int r0 = r1.getDimensionPixelOffset(r6)
            float r0 = (float) r0
            r3.A00 = r0
            r3.A06 = r7
            r3.A03 = r4
            r9.A00 = r3
            android.widget.SeekBar r0 = r9.seekBar
            if (r0 == 0) goto L_0x024c
            r0.setThumb(r3)
            android.widget.SeekBar r0 = r9.seekBar
            if (r0 == 0) goto L_0x024c
            r0.setProgress(r2)
            android.widget.SeekBar r2 = r9.seekBar
            if (r2 == 0) goto L_0x024c
            X.Ji7 r6 = r9.A0D
            int r1 = r6.A02
            int r0 = r6.A03
            int r1 = r1 - r0
            r2.setMax(r1)
            android.widget.SeekBar r1 = r9.seekBar
            if (r1 == 0) goto L_0x024c
            X.2Fk r0 = r6.A05
            java.lang.Object r0 = r0.A02()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = X.AnonymousClass7TG.A0A(r0)
            r1.setProgress(r0)
            X.3Q2 r13 = r9.A0C
            r0 = 0
            if (r13 == 0) goto L_0x01c1
            X.51W r3 = r13.A1P
            if (r3 == 0) goto L_0x01c1
            android.widget.LinearLayout r2 = r9.filmStripFramesContainer
            if (r2 == 0) goto L_0x0255
            X.M7I r1 = new X.M7I
            r1.<init>(r9, r3)
            r2.post(r1)
            com.instagram.common.session.UserSession r10 = r9.A09
            android.widget.FrameLayout r7 = r9.coverPhotoContainerVideoPreview
            if (r7 == 0) goto L_0x0249
            android.widget.SeekBar r5 = r9.seekBar
            if (r5 == 0) goto L_0x024c
            X.Jcv r4 = r9.A00
            if (r4 == 0) goto L_0x0246
            X.Jg4 r3 = r9.A0B
            X.07Z r2 = r9.A07
            r1 = 2
            X.MMf r1 = X.C66296MMf.A00(r9, r1)
            X.0t0 r27 = X.AnonymousClass0eN.A01(r1)
            X.LZP r1 = new X.LZP
            r16 = r1
            r17 = r8
            r18 = r7
            r19 = r5
            r20 = r2
            r21 = r10
            r22 = r3
            r23 = r4
            r24 = r13
            r25 = r9
            r26 = r6
            r28 = r15
            r29 = r14
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r9.A01 = r1
        L_0x01af:
            X.2Fk r1 = r6.A09
            java.lang.Object r1 = r1.A02()
            X.JwK r1 = (X.C61082JwK) r1
            if (r1 == 0) goto L_0x01bd
            java.lang.Object r0 = r1.A00
            X.Kno r0 = (X.C62874Kno) r0
        L_0x01bd:
            A00(r9, r0)
            return
        L_0x01c1:
            java.lang.String r11 = "Video frame generator setup failed"
            java.lang.String r5 = "ClipsCoverPhotoPickerController"
            r12 = -1
            X.2Fj r1 = r6.A0A     // Catch:{ IOException | RuntimeException -> 0x01f4 }
            X.JTP.A19(r1, r12)     // Catch:{ IOException | RuntimeException -> 0x01f4 }
            X.LA8 r4 = r6.A0E     // Catch:{ IOException | RuntimeException -> 0x01f4 }
            r1 = 0
            X.0qQ.A0B(r4, r1)     // Catch:{ IOException | RuntimeException -> 0x01f4 }
            java.lang.String r1 = r4.A05     // Catch:{ IOException | RuntimeException -> 0x01f4 }
            r17 = r1
            long r1 = r4.A03     // Catch:{ IOException | RuntimeException -> 0x01f4 }
            int r3 = r4.A02     // Catch:{ IOException | RuntimeException -> 0x01f4 }
            r19 = r3
            int r4 = r4.A01     // Catch:{ IOException | RuntimeException -> 0x01f4 }
            X.LA8 r3 = new X.LA8     // Catch:{ IOException | RuntimeException -> 0x01f4 }
            r16 = r3
            r18 = r0
            r20 = r4
            r21 = r12
            r22 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22)     // Catch:{ IOException | RuntimeException -> 0x01f4 }
            com.instagram.common.session.UserSession r1 = r9.A09     // Catch:{ IOException | RuntimeException -> 0x01f4 }
            X.LP1 r12 = new X.LP1     // Catch:{ IOException | RuntimeException -> 0x01f4 }
            r12.<init>(r1, r3, r7, r10)     // Catch:{ IOException | RuntimeException -> 0x01f4 }
            goto L_0x01f9
        L_0x01f4:
            r1 = move-exception
            X.0kD.A09(r5, r11, r1)
            r12 = r0
        L_0x01f9:
            com.instagram.common.session.UserSession r1 = r9.A09
            r18 = r1
            android.widget.FrameLayout r11 = r9.coverPhotoContainerVideoPreview
            if (r11 == 0) goto L_0x0249
            android.widget.SeekBar r5 = r9.seekBar
            if (r5 == 0) goto L_0x024c
            X.Jcv r4 = r9.A00
            if (r4 == 0) goto L_0x0246
            android.widget.LinearLayout r3 = r9.filmStripFramesContainer
            if (r3 == 0) goto L_0x0255
            r25 = 1058013184(0x3f100000, float:0.5625)
            if (r13 == 0) goto L_0x0243
            float r2 = r13.A02
        L_0x0213:
            X.07Z r13 = r9.A07
            r1 = 2
            X.MMf r1 = X.C66296MMf.A00(r9, r1)
            X.0t0 r24 = X.AnonymousClass0eN.A01(r1)
            java.lang.String r23 = "cover_photo_selector"
            X.LZQ r1 = new X.LZQ
            r22 = r12
            r26 = r2
            r27 = r7
            r28 = r10
            r29 = r15
            r30 = r14
            r14 = r11
            r15 = r3
            r16 = r5
            r17 = r13
            r19 = r4
            r20 = r9
            r21 = r6
            r12 = r1
            r13 = r8
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r9.A01 = r1
            goto L_0x01af
        L_0x0243:
            r2 = 1058013184(0x3f100000, float:0.5625)
            goto L_0x0213
        L_0x0246:
            java.lang.String r0 = "thumb"
            goto L_0x0257
        L_0x0249:
            java.lang.String r0 = "coverPhotoContainerVideoPreview"
            goto L_0x0257
        L_0x024c:
            java.lang.String r0 = "seekBar"
            goto L_0x0257
        L_0x024f:
            java.lang.String r0 = "playCountContainer"
            goto L_0x0257
        L_0x0252:
            java.lang.String r0 = "coverPhotoContainer"
            goto L_0x0257
        L_0x0255:
            java.lang.String r0 = "filmStripFramesContainer"
        L_0x0257:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.sharesheet.coverphoto.ClipsCoverPhotoPickerController.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(com.instagram.creation.sharesheet.coverphoto.ClipsCoverPhotoPickerController r3, X.C62874Kno r4) {
        /*
            boolean r2 = r4 instanceof X.C62122KaY
            if (r2 == 0) goto L_0x0028
            r0 = r4
            X.KaY r0 = (X.C62122KaY) r0
            java.lang.String r0 = r0.A00
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r3.currentCoverPhotoImage
            if (r1 == 0) goto L_0x0039
            android.net.Uri r0 = X.0cp.A03(r0)
            r1.setImageURI(r0)
            r0 = 1
        L_0x0015:
            r3.A01(r0)
        L_0x0018:
            r1 = 1056964608(0x3f000000, float:0.5)
            if (r2 != 0) goto L_0x0020
            boolean r0 = r4 instanceof X.C62124Kaa
            if (r0 == 0) goto L_0x0027
        L_0x0020:
            android.widget.LinearLayout r0 = r3.filmStripFramesContainer
            if (r0 == 0) goto L_0x0036
            r0.setAlpha(r1)
        L_0x0027:
            return
        L_0x0028:
            boolean r0 = r4 instanceof X.C62124Kaa
            if (r0 == 0) goto L_0x0018
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r3.currentCoverPhotoImage
            if (r1 == 0) goto L_0x0039
            r0 = 0
            r1.setImageBitmap(r0)
            r0 = 0
            goto L_0x0015
        L_0x0036:
            java.lang.String r0 = "filmStripFramesContainer"
            goto L_0x003b
        L_0x0039:
            java.lang.String r0 = "currentCoverPhotoImage"
        L_0x003b:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.sharesheet.coverphoto.ClipsCoverPhotoPickerController.A00(com.instagram.creation.sharesheet.coverphoto.ClipsCoverPhotoPickerController, X.Kno):void");
    }

    private final void A01(boolean z) {
        String str;
        if (this.A0F) {
            View view = this.addTextView;
            if (z) {
                if (view != null) {
                    if (view.getVisibility() == 8) {
                        if (182.A06(0Tu.A05, this.A09, 36330501291655839L)) {
                            View view2 = this.addTextView;
                            if (view2 != null) {
                                view2.setVisibility(0);
                                View view3 = this.playCountContainer;
                                if (view3 != null) {
                                    view3.setVisibility(8);
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                str = "addTextView";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            if (view != null) {
                if (view.getVisibility() == 0) {
                    View view4 = this.addTextView;
                    if (view4 != null) {
                        view4.setVisibility(8);
                        View view5 = this.playCountContainer;
                        if (view5 != null) {
                            view5.setVisibility(0);
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            str = "addTextView";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
            str = "playCountContainer";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void A02(boolean z) {
        C60250Ji7 ji7 = this.A0D;
        C61082JwK jwK = (C61082JwK) ji7.A09.A02();
        Object obj = null;
        if (jwK != null) {
            obj = jwK.A00;
        }
        float f = 0.5625f;
        if (obj instanceof C62124Kaa) {
            MXH mxh = this.A01;
            if (mxh == null) {
                0qQ.A0F("scrubberController");
                throw AnonymousClass00P.createAndThrow();
            }
            AnonymousClass3Q2 r0 = this.A0C;
            if (r0 != null) {
                f = r0.A02;
            }
            mxh.EJw(z, f);
        } else {
            C60123Jg4 jg4 = this.A0B;
            if (G9w.A1b(((C61084JwM) jg4.A00.getValue()).A02)) {
                Context context = this.A06;
                UserSession userSession = this.A09;
                Bitmap decodeFile = BitmapFactory.decodeFile((String) ji7.A07.A02());
                Bitmap bitmap = (Bitmap) ((C61084JwM) jg4.A01.getValue()).A00;
                AnonymousClass3Q2 r02 = this.A0C;
                if (r02 != null) {
                    f = r02.A02;
                }
                int i = this.A03;
                int i2 = this.A02;
                LT1.A01(context, decodeFile, bitmap, userSession, new C65235Lpf(this, 0), (File) AnonymousClass0eN.A01(C66296MMf.A00(this, 2)).getValue(), f, i, i2);
            }
            DbT.A1I(this.A0A);
        }
        L4H A002 = C63209KtG.A00(this.A09);
        A002.A01.flowMarkPoint(A002.A00, "COVER_PHOTO_SAVED");
    }

    public final void D6S(String str) {
        11Z.A02(new C65894M3j(this));
    }

    public final void onPause() {
        MXH mxh = this.A01;
        if (mxh == null) {
            0qQ.A0F("scrubberController");
            throw AnonymousClass00P.createAndThrow();
        } else {
            mxh.onPause();
        }
    }

    public final void onResume() {
        MXH mxh = this.A01;
        if (mxh == null) {
            0qQ.A0F("scrubberController");
            throw AnonymousClass00P.createAndThrow();
        } else {
            mxh.onResume();
        }
    }

    public final void onDestroyView() {
        ClipsCoverPhotoPickerControllerLifecycleUtil.cleanupReferences(this);
    }
}
