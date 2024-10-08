package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.textureview.MultiListenerTextureView;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.reels.fragment.model.ReelMoreOptionsModel;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8Wi  reason: invalid class name and case insensitive filesystem */
public final class C357068Wi {
    public int A00;
    public boolean A01;
    public final Activity A02;
    public final AnonymousClass4DH A03;
    public final C357058Wh A04;
    public final AnonymousClass847 A05;
    public final UserSession A06;
    public final C357638Yz A07;
    public final AnonymousClass8QA A08;
    public final AnonymousClass8K4 A09;
    public final AnonymousClass8BA A0A;
    public final AnonymousClass8LU A0B;
    public final C3506485o A0C;
    public final C3506485o A0D;
    public final C3499582p A0E;
    public final AnonymousClass817 A0F;
    public final AnonymousClass8WX A0G;
    public final AnonymousClass8E5 A0H;
    public final C3502083s A0I;
    public final AnonymousClass80U A0J;
    public final AnonymousClass8D8 A0K;
    public final C353508Hx A0L;
    public final ClipsCreationViewModel A0M;
    public final AnonymousClass8AA A0N;
    public final AnonymousClass8AE A0O;
    public final C314676if A0P;
    public final C3495780x A0Q;
    public final InteractiveDrawableContainer A0R;
    public final MultiListenerTextureView A0S;
    public final C71662eb A0T;
    public final C3510387i A0U;
    public final C353828Ji A0V;
    public final TargetViewSizeProvider A0W;
    public final AnonymousClass81T A0X;
    public final C356848Vl A0Y;
    public final AnonymousClass842 A0Z;
    public final C353788Jb A0a;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if ((!X.AnonymousClass8BA.A0L(r4)) == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.C357068Wi r24, java.lang.String r25, java.lang.String r26) {
        /*
            r1 = 1
            r8 = 0
            r5 = r24
            X.8QA r0 = r5.A08
            r2 = 0
            r0.A0D(r2)
            X.8BA r4 = r5.A0A
            X.8it r0 = r4.A1q
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x001d
            boolean r0 = X.AnonymousClass8BA.A0L(r4)
            r0 = r0 ^ 1
            r3 = 1
            if (r0 != 0) goto L_0x001e
        L_0x001d:
            r3 = 0
        L_0x001e:
            r4.A0a()
            r4.A0X()
            com.instagram.pendingmedia.model.UserStoryTarget r6 = com.instagram.pendingmedia.model.UserStoryTarget.A01
            com.instagram.common.session.UserSession r0 = r5.A06
            X.27r r0 = X.27p.A01(r0)
            X.29K r0 = r0.A04
            r0.A09()
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.REEL_SHARE
            X.LD4 r7 = new X.LD4
            r7.<init>(r8, r6, r0)
            X.8K4 r15 = r5.A09
            boolean r0 = r15.A0K()
            if (r0 == 0) goto L_0x006a
            X.8nd r0 = X.C365758nd.A04
        L_0x0042:
            int r0 = r0.ordinal()
            r13 = r25
            r14 = r26
            if (r0 == r2) goto L_0x007b
            if (r0 != r1) goto L_0x0073
            X.8LU r6 = r5.A0B
            java.lang.Integer r12 = X.AnonymousClass05K.A00
            java.lang.String r0 = "auto_xpost"
            X.L8M r9 = new X.L8M
            r9.<init>(r0, r8, r3, r2)
            r10 = r8
            r11 = r8
            r15 = r8
            r16 = r8
            r17 = r8
            r18 = r8
            r19 = r1
            r20 = r2
            r6.A0O(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        L_0x006a:
            X.82p r0 = r5.A0E
            X.82o r0 = r0.A02
            X.8nd r0 = r0.A02()
            goto L_0x0042
        L_0x0073:
            java.lang.String r1 = "Unknown media type"
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x007b:
            java.lang.Integer r21 = X.AnonymousClass05K.A00
            java.lang.String r0 = "auto_xpost"
            X.L8M r1 = new X.L8M
            r1.<init>(r0, r8, r3, r2)
            X.8C9 r0 = r4.A1D
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r0 = r0.A03
            boolean r0 = r0.A0G
            r16 = r8
            r17 = r7
            r18 = r8
            r19 = r1
            r20 = r8
            r22 = r13
            r23 = r14
            r24 = r8
            r25 = r2
            r26 = r0
            r15.A0J(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C357068Wi.A02(X.8Wi, java.lang.String, java.lang.String):void");
    }

    public static AnonymousClass3Q2 A00(C357068Wi r7) {
        C357058Wh r2 = r7.A04;
        C3499482o r4 = r7.A0E.A02;
        CameraAREffect A002 = r7.A0a.A00();
        AnonymousClass8BA r1 = r7.A0A;
        return r2.A03(A002, r4, r1.A1D.A03.A00(), r1.A0V(), r1.A0U());
    }

    public static 0t0 A01(C357068Wi r2) {
        C62320sa r1;
        int ordinal = r2.A0E.A02.A01().ordinal();
        if (ordinal == 0) {
            r1 = new AnonymousClass9SK(r2.A09);
        } else if (ordinal != 1) {
            return null;
        } else {
            MultiListenerTextureView multiListenerTextureView = r2.A0S;
            0qQ.A0B(multiListenerTextureView, 0);
            r1 = new MMT(multiListenerTextureView, 27);
        }
        return AnonymousClass0eN.A01(r1);
    }

    private boolean A03() {
        AnonymousClass8C9 r3 = this.A0A.A1D;
        ReelMoreOptionsModel reelMoreOptionsModel = r3.A03;
        if (reelMoreOptionsModel.A0E || (reelMoreOptionsModel.A00() != null && ((BrandedContentTag) r3.A03.A00().get(0)).A04)) {
            return true;
        }
        return false;
    }

    public static boolean A04(DialogInterface.OnClickListener onClickListener, C357068Wi r13) {
        AnonymousClass8BA r3 = r13.A0A;
        AnonymousClass8C9 r1 = r3.A1D;
        if (r1.A03.A0H) {
            return false;
        }
        AnonymousClass847 r4 = r13.A05;
        if (r4.A00) {
            return false;
        }
        UserSession userSession = r13.A06;
        if (!AnonymousClass430.A00(userSession)) {
            return false;
        }
        List A002 = r1.A03.A00();
        ArrayList A0V2 = r3.A0V();
        String A003 = r3.A0Q().A00();
        if (A002 == null) {
            A002 = Collections.emptyList();
        }
        List A022 = r4.A02(userSession, A003, A0V2, A002);
        if (A022.isEmpty()) {
            return false;
        }
        r4.A03(r13.A03.requireContext(), new C39924AJq(r13), onClickListener, userSession, AnonymousClass05K.A00, "story", A022);
        return true;
    }

    public final Bitmap A05() {
        Bitmap bitmap;
        ArrayList A0V2 = this.A0R.A0V(AnonymousClass9X8.class);
        0qQ.A0B(A0V2, 0);
        Object A0J2 = 00k.A0J(A0V2);
        this.A03.getContext();
        AnonymousClass81W r0 = ((NineSixteenLayoutConfigImpl) this.A0W).A0K;
        int width = r0.getWidth();
        int height = r0.getHeight();
        r0.getWidth();
        if (A0J2 != null) {
            C3510387i r4 = this.A0U;
            AnonymousClass9X8 r11 = r4.A09;
            if (r11 != null) {
                bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                0qQ.A07(bitmap);
                Canvas canvas = new Canvas(bitmap);
                float f = (float) width;
                RoundedCornerFrameLayout roundedCornerFrameLayout = r4.A0U;
                float width2 = f / ((float) roundedCornerFrameLayout.getWidth());
                canvas.scale(width2, width2);
                float pivotX = roundedCornerFrameLayout.getPivotX() + roundedCornerFrameLayout.getTranslationX();
                float pivotY = roundedCornerFrameLayout.getPivotY() + roundedCornerFrameLayout.getTranslationY();
                canvas.rotate(roundedCornerFrameLayout.getRotation(), pivotX, pivotY);
                canvas.scale(roundedCornerFrameLayout.getScaleX(), roundedCornerFrameLayout.getScaleY(), pivotX, pivotY);
                canvas.translate(roundedCornerFrameLayout.getTranslationX(), roundedCornerFrameLayout.getTranslationY());
                r11.ANf(canvas, Integer.valueOf((int) (f * roundedCornerFrameLayout.getScaleX())), Integer.valueOf((int) (((float) height) * roundedCornerFrameLayout.getScaleY())), 0);
            } else {
                bitmap = null;
            }
        } else {
            bitmap = null;
        }
        Bitmap A012 = ((C353838Jj) this.A0V.A00.A00()).A01((Bitmap) null, (RectF) null, (B1K) null, 1.0f, 1.0f, -1, true, false, true, true);
        int ordinal = this.A0E.A02.A01().ordinal();
        if (ordinal == 0) {
            return this.A09.A0F(A012, bitmap);
        }
        if (ordinal != 1) {
            return null;
        }
        MultiListenerTextureView multiListenerTextureView = this.A0S;
        0qQ.A0B(multiListenerTextureView, 3);
        try {
            Bitmap bitmap2 = multiListenerTextureView.getBitmap();
            if (bitmap2 == null) {
                return null;
            }
            if (!(A012 == null && bitmap == null)) {
                Canvas canvas2 = new Canvas(bitmap2);
                if (A012 != null) {
                    canvas2.drawBitmap(A012, 0.0f, 0.0f, (Paint) null);
                }
                if (bitmap != null) {
                    canvas2.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                }
            }
            return 1MF.A04(bitmap2);
        } catch (OutOfMemoryError e) {
            0kD.A0I(002.A0R("VideoSendingController", "#getMediaScreenshot_OOM"), e, 0Yt.A0E());
            return null;
        }
    }

    public final void A06() {
        C314676if r4 = this.A0P;
        if (r4 != null && r4.A03) {
            C359318cb r1 = (C359318cb) r4.get();
            if (r1.A0O && r1.A0w == C2801950r.CLIPS) {
                UserSession userSession = this.A06;
                if (182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36321550580327946L)) {
                    ((C359318cb) r4.get()).A0J();
                    return;
                }
            }
        }
        Activity activity = this.A02;
        if (activity instanceof AnonymousClass2ZQ) {
            AnonymousClass4DH r12 = this.A03;
            if (r12 instanceof AnonymousClass4DR) {
                ((AnonymousClass4DR) r12).onBackPressed();
                return;
            }
        }
        activity.onBackPressed();
    }

    public final void A07() {
        if (!this.A0E.A02.A01.A07()) {
            0kD.A01(this.A0X.getModuleName(), "No active captured media");
            C59689JTv.A0B(this.A02, "no_active_captured_media");
            return;
        }
        C39891ADp aDp = C39891ADp.A00;
        aDp.A01("sink", C273654mx.A00(3103));
        aDp.A00();
        if (A04(new C39925AJr(this), this)) {
            return;
        }
        if (A03()) {
            this.A04.A04(A00(this), new C41426Atm(this));
        } else if (A03() || !this.A0A.A1D.A03.A0G) {
            ((AnonymousClass80T) this.A0J).A01.A04(new AnonymousClass8SL());
        } else {
            this.A04.A05(A00(this), new C41425Atl(this));
        }
    }

    public C357068Wi(C357058Wh r3, AnonymousClass847 r4, MultiListenerTextureView multiListenerTextureView, C71662eb r6, C357638Yz r7, C3510387i r8, C353828Ji r9, AnonymousClass8QA r10, AnonymousClass8K4 r11, AnonymousClass8BA r12, AnonymousClass8LU r13, TargetViewSizeProvider targetViewSizeProvider, C3506485o r15, C3506485o r16, C3499582p r17, AnonymousClass80D r18, AnonymousClass81T r19, C356848Vl r20, AnonymousClass817 r21, AnonymousClass8WX r22, AnonymousClass8E5 r23, C3502083s r24, AnonymousClass842 r25, C353788Jb r26, AnonymousClass80U r27, AnonymousClass8D8 r28, C353508Hx r29, ClipsCreationViewModel clipsCreationViewModel, AnonymousClass8AA r31, AnonymousClass8AE r32, C314676if r33, C3495780x r34, InteractiveDrawableContainer interactiveDrawableContainer) {
        AnonymousClass80D r1 = r18;
        this.A06 = r1.A0S;
        this.A02 = r1.A05;
        r1.A0M.getClass();
        this.A03 = r1.A0M;
        this.A0E = r17;
        this.A0X = r19;
        this.A0J = r27;
        this.A0A = r12;
        this.A05 = r4;
        this.A0Z = r25;
        this.A0O = r32;
        this.A0Y = r20;
        this.A08 = r10;
        this.A09 = r11;
        this.A0B = r13;
        this.A0P = r33;
        this.A0G = r22;
        this.A0R = interactiveDrawableContainer;
        this.A0S = multiListenerTextureView;
        this.A0H = r23;
        this.A07 = r7;
        this.A0N = r31;
        this.A0I = r24;
        this.A0C = r15;
        this.A0D = r16;
        this.A0L = r29;
        this.A0K = r28;
        this.A0W = targetViewSizeProvider;
        this.A0U = r8;
        this.A0V = r9;
        this.A0Q = r34;
        this.A0M = clipsCreationViewModel;
        this.A04 = r3;
        this.A0a = r26;
        this.A0T = r6;
        this.A0F = r21;
    }
}
