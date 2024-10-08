package X;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.ViewGroup;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.textureview.MultiListenerTextureView;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.ui.text.TextColorScheme;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.8K4  reason: invalid class name */
public final class AnonymousClass8K4 implements AnonymousClass0iw, AnonymousClass7TJ, AnonymousClass85Y {
    public static final String __redex_internal_original_name = "PhotoViewController";
    public int A00;
    public int A01;
    public CropInfo A02;
    public FilterGroupModel A03;
    public A6N A04;
    public TextColorScheme A05;
    public Runnable A06;
    public Runnable A07;
    public boolean A08 = false;
    public boolean A09;
    public final Activity A0A;
    public final ViewGroup A0B;
    public final 1a8 A0C = new 1a8(C318146oT.A01);
    public final UserSession A0D;
    public final AnonymousClass80G A0E;
    public final C353828Ji A0F;
    public final AnonymousClass8BA A0G;
    public final TargetViewSizeProvider A0H;
    public final C3499582p A0I;
    public final AnonymousClass80D A0J;
    public final C3503684j A0K;
    public final AnonymousClass8KC A0L;
    public final AnonymousClass8KK A0M;
    public final AnonymousClass8KR A0N;
    public final AnonymousClass8KO A0O;
    public final AnonymousClass8K7 A0P = new AnonymousClass8K6(this);
    public final C354168Kx A0Q;
    public final C353788Jb A0R;
    public final C351958Bc A0S;
    public final C3510287h A0T;
    public final C353918Jw A0U;
    public final C314676if A0V;
    public final C354148Kv A0W;
    public final AnonymousClass8B2 A0X;
    public final AnonymousClass88F A0Y;
    public final C354028Kj A0Z;
    public final C354088Kp A0a;
    public final AnonymousClass8KX A0b;
    public final C354158Kw A0c;
    public final AnonymousClass85s A0d;
    public final String A0e;
    public final String A0f;
    public final String A0g;
    public final String A0h;
    public final AnonymousClass0eK A0i;
    public final AnonymousClass0eK A0j;
    public final AnonymousClass0eM A0k;
    public final AnonymousClass0eM A0l;
    public final boolean A0m;
    public final boolean A0n;
    public final boolean A0o;
    public final C3503284f A0p;
    public final C352888Fl A0q;
    public final AnonymousClass80U A0r;
    public final AnonymousClass869 A0s;
    public final AnonymousClass846 A0t;
    public final C3495780x A0u;
    public final AnonymousClass8KN A0v;
    public final C353858Jp A0w;
    public final AnonymousClass8KA A0x;
    public final C354108Kr A0y;
    public final C354068Kn A0z;
    public final C354118Ks A10;
    public final C3493580b A11;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        if (r8.A0K() != false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        if (r29 == false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        if (r0 != false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        r11 = r21;
        r1 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (A0E(r6) == false) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        if (r4 == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        r0 = r6.A0N.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        if (r0 == null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
        r0.A09 = false;
        r0.A0K.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
        if (r8 != null) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
        r12 = r6.A0F(r11, (android.graphics.Bitmap) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0059, code lost:
        if (r12 != null) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005b, code lost:
        r4 = new java.lang.StringBuilder();
        r4.append("mediaBitmap is null, postCaptureAREffect==null?");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0065, code lost:
        if (r8 == null) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0067, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0068, code lost:
        r4.append(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006b, code lost:
        if (r8 == null) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006d, code lost:
        r4.append(", postCaptureAREffect.getId()=");
        r4.append(r8.A0K);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0077, code lost:
        X.0kD.A01(__redex_internal_original_name, r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0080, code lost:
        r4 = r6.A0W;
        r0 = r6.A03;
        r0.getClass();
        r13 = ((com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl) r0).A02;
        r19 = X.C379509Ue.A00(r6.A0I.A02.A01.A0X);
        r3 = r4.A05;
        r10 = new com.instagram.creation.capture.quickcapture.util.phototovideo.saver.PhotoToVideoSaver$savePhoto$1(r11, r12, r13, r23, r24, r4, r1, (X.AnonymousClass4D7) null, r19, r20, false);
        X.1Eo.A03(X.AnonymousClass05K.A00, X.19B.A00, r10, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b2, code lost:
        r7 = r6.A0A;
        r5 = r1.A09;
        r4 = r1.A06;
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00be, code lost:
        if ((r1.A07 % 180) != 0) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c0, code lost:
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c2, code lost:
        r12 = r7;
        r0 = X.AEW.A02(r12, r6.A0D, r5, r4, r16, X.C343127pi.A00(r7));
        r12 = X.1MF.A0G(r1.A06(), r1.A09, r1.A06, r0.x, r0.y, r1.A07, r1.A13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ef, code lost:
        if (r5 == false) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f1, code lost:
        r1 = r6.A0A;
        r0 = r6.A0E.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f7, code lost:
        if (r0 == null) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f9, code lost:
        r7 = r0.getBitmap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00fd, code lost:
        r7.getClass();
        r5 = new X.MB2(r1, r7, r11, r26, true, r20);
        r1 = 473;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x010e, code lost:
        X.1ES.A03(new X.C290815g0(r5, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0116, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0117, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0119, code lost:
        r3 = r6.A0I.A02;
        r4 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0123, code lost:
        if (r4.A03() == null) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x012b, code lost:
        if (r4.A03().A12 != false) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0133, code lost:
        if (r3.A01() != X.C365758nd.A04) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0135, code lost:
        r0 = r4.A0X;
        r0.getClass();
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0147, code lost:
        if (((java.util.Set) r0.A09.A00).contains(X.C358088aL.A0C) == false) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0149, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x014a, code lost:
        r5 = r6.A0A;
        r4 = r6.A0D;
        r3 = r6.A03;
        r3.getClass();
        r10 = r6.A0v.A00();
        X.0qQ.A0B(r5, 0);
        r6 = r5.getApplicationContext();
        X.0qQ.A07(r6);
        r5 = new X.C41370Asr(r6, r11, r4, r25, r10, r3, r1, r20, r14, r30);
        r1 = 472;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0026, code lost:
        if (r8.A0K() != false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        if (r8 != null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        r0 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(android.graphics.Bitmap r21, X.AnonymousClass8K4 r22, X.C364758lx r23, X.MV5 r24, X.C41818B1y r25, X.MS6 r26, X.C352218Cl r27, boolean r28, boolean r29, boolean r30) {
        /*
            r2 = 0
            r20 = r28
            if (r28 == 0) goto L_0x0016
            X.02m r0 = X.02m.A0p
            r4 = 18948745(0x1212289, float:2.9595808E-38)
            r0.markerStart(r4)
            X.02m r3 = X.02m.A0p
            java.lang.String r1 = "media_type"
            java.lang.String r0 = "photo"
            r3.markerAnnotate(r4, r1, r0)
        L_0x0016:
            r6 = r22
            X.8Jb r0 = r6.A0R
            com.instagram.camera.effect.models.CameraAREffect r8 = r0.A00()
            r3 = 1
            if (r8 == 0) goto L_0x0028
            boolean r0 = r8.A0K()
            r5 = 1
            if (r0 == 0) goto L_0x002b
        L_0x0028:
            r5 = 0
            if (r8 == 0) goto L_0x0032
        L_0x002b:
            boolean r1 = r8.A0K()
            r0 = 1
            if (r1 != 0) goto L_0x0033
        L_0x0032:
            r0 = 0
        L_0x0033:
            if (r29 == 0) goto L_0x0038
            r4 = 1
            if (r0 != 0) goto L_0x0039
        L_0x0038:
            r4 = 0
        L_0x0039:
            boolean r0 = A0E(r6)
            r11 = r21
            r1 = r27
            if (r0 == 0) goto L_0x00ef
            if (r4 == 0) goto L_0x0052
            X.8KR r0 = r6.A0N
            X.8m6 r0 = r0.A02
            if (r0 == 0) goto L_0x0052
            r0.A09 = r2
            X.8mC r0 = r0.A0K
            r0.A00()
        L_0x0052:
            if (r8 != 0) goto L_0x00b2
            r0 = 0
            android.graphics.Bitmap r12 = r6.A0F(r11, r0)
        L_0x0059:
            if (r12 != 0) goto L_0x0080
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "mediaBitmap is null, postCaptureAREffect==null?"
            r4.append(r0)
            if (r8 == 0) goto L_0x0068
            r3 = 0
        L_0x0068:
            r4.append(r3)
            if (r8 == 0) goto L_0x0077
            java.lang.String r0 = ", postCaptureAREffect.getId()="
            r4.append(r0)
            java.lang.String r0 = r8.A0K
            r4.append(r0)
        L_0x0077:
            java.lang.String r3 = r4.toString()
            java.lang.String r0 = "PhotoViewController"
            X.0kD.A01(r0, r3)
        L_0x0080:
            X.8Kv r4 = r6.A0W
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r0 = r6.A03
            r0.getClass()
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r0 = (com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl) r0
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain r13 = r0.A02
            X.82p r0 = r6.A0I
            X.82o r0 = r0.A02
            X.82Y r0 = r0.A01
            X.8Yz r0 = r0.A0X
            boolean r19 = X.C379509Ue.A00(r0)
            X.4Cq r3 = r4.A05
            r18 = 0
            com.instagram.creation.capture.quickcapture.util.phototovideo.saver.PhotoToVideoSaver$savePhoto$1 r10 = new com.instagram.creation.capture.quickcapture.util.phototovideo.saver.PhotoToVideoSaver$savePhoto$1
            r14 = r23
            r15 = r24
            r21 = r2
            r17 = r1
            r16 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.19B r1 = X.19B.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.1Eo.A03(r0, r1, r10, r3)
            return
        L_0x00b2:
            android.app.Activity r7 = r6.A0A
            int r5 = r1.A09
            int r4 = r1.A06
            int r0 = r1.A07
            int r0 = r0 % 180
            r16 = 0
            if (r0 != 0) goto L_0x00c2
            r16 = 1
        L_0x00c2:
            com.instagram.common.session.UserSession r0 = r6.A0D
            boolean r17 = X.C343127pi.A00(r7)
            r13 = r0
            r14 = r5
            r15 = r4
            r12 = r7
            android.graphics.Point r0 = X.AEW.A02(r12, r13, r14, r15, r16, r17)
            java.lang.String r12 = r1.A06()
            int r10 = r1.A09
            int r9 = r1.A06
            int r7 = r0.x
            int r5 = r0.y
            int r4 = r1.A07
            boolean r0 = r1.A13
            r13 = r10
            r14 = r9
            r15 = r7
            r16 = r5
            r17 = r4
            r18 = r0
            android.graphics.Bitmap r12 = X.1MF.A0G(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0059
        L_0x00ef:
            if (r5 == 0) goto L_0x0119
            android.app.Activity r1 = r6.A0A
            X.80G r0 = r6.A0E
            com.instagram.common.ui.widget.textureview.MultiListenerTextureView r0 = r0.A0D
            if (r0 == 0) goto L_0x0117
            android.graphics.Bitmap r7 = r0.getBitmap()
        L_0x00fd:
            r7.getClass()
            X.MB2 r5 = new X.MB2
            r9 = r26
            r6 = r1
            r8 = r11
            r10 = r3
            r11 = r20
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r1 = 473(0x1d9, float:6.63E-43)
        L_0x010e:
            X.5g0 r0 = new X.5g0
            r0.<init>(r5, r1)
            X.1ES.A03(r0)
            return
        L_0x0117:
            r7 = 0
            goto L_0x00fd
        L_0x0119:
            X.82p r0 = r6.A0I
            X.82o r3 = r0.A02
            X.82Y r4 = r3.A01
            X.8Cl r0 = r4.A03()
            if (r0 == 0) goto L_0x0149
            X.8Cl r0 = r4.A03()
            boolean r0 = r0.A12
            if (r0 != 0) goto L_0x0149
            X.8nd r3 = r3.A01()
            X.8nd r0 = X.C365758nd.A04
            if (r3 != r0) goto L_0x0149
            X.8Yz r0 = r4.A0X
            r0.getClass()
            X.80m r0 = r0.A09
            java.lang.Object r3 = r0.A00
            java.util.Set r3 = (java.util.Set) r3
            X.8aL r0 = X.C358088aL.A0C
            boolean r0 = r3.contains(r0)
            r14 = 1
            if (r0 == 0) goto L_0x014a
        L_0x0149:
            r14 = 0
        L_0x014a:
            android.app.Activity r5 = r6.A0A
            com.instagram.common.session.UserSession r4 = r6.A0D
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r3 = r6.A03
            r3.getClass()
            X.8KN r0 = r6.A0v
            X.L83 r10 = r0.A00()
            X.0qQ.A0B(r5, r2)
            android.content.Context r6 = r5.getApplicationContext()
            X.0qQ.A07(r6)
            X.Asr r5 = new X.Asr
            r9 = r25
            r15 = r30
            r7 = r11
            r8 = r4
            r11 = r3
            r12 = r1
            r13 = r20
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = 472(0x1d8, float:6.61E-43)
            goto L_0x010e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8K4.A04(android.graphics.Bitmap, X.8K4, X.8lx, X.MV5, X.B1y, X.MS6, X.8Cl, boolean, boolean, boolean):void");
    }

    public static void A0A(AnonymousClass8K4 r18, LD4 ld4, C381539bv r20, C15023UKc uKc, Boolean bool, String str, String str2) {
        A08(r18, (B1O) null, ld4, r20, (C381779cJ) null, (L8M) null, (AnonymousClass8VT) null, uKc, bool, AnonymousClass05K.A00, str, (String) null, str2, (String) null, (List) null, (List) null, 1, false, false);
    }

    public static Bitmap A00(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, AnonymousClass8K4 r14) {
        if (!(bitmap2 == null && bitmap3 == null)) {
            Canvas canvas = new Canvas(bitmap);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            AnonymousClass80G r1 = r14.A0E;
            int width2 = r1.A05().getWidth();
            int height2 = r1.A05().getHeight();
            if (bitmap3 != null) {
                float width3 = (((float) bitmap3.getWidth()) * 1.0f) / ((float) width2);
                float height3 = (((float) bitmap3.getHeight()) * 1.0f) / ((float) height2);
                canvas.scale(1.0f / width3, 1.0f / height3);
                canvas.drawBitmap(bitmap3, 0.0f, 0.0f, (Paint) null);
                canvas.scale(width3, height3);
            }
            if (!(width == width2 && height == height2)) {
                canvas.scale(((float) width) / ((float) width2), ((float) height) / ((float) height2));
            }
            if (bitmap2 != null) {
                if (bitmap2.isRecycled()) {
                    0kD.A01("PhotoViewController#getMediaScreenshotInternal_decorBitmap_is_null", "DecorBitmap should not be recycled");
                } else {
                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                }
            }
        }
        return 1MF.A04(bitmap);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if (r1 == false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.1GK A01(X.AnonymousClass8K4 r11) {
        /*
            X.8BA r0 = r11.A0G
            X.6if r0 = r0.A1g
            java.lang.Object r1 = r0.get()
            X.8ME r1 = (X.AnonymousClass8ME) r1
            java.lang.Class<X.7w6> r0 = X.C346997w6.class
            android.graphics.drawable.Drawable r0 = X.AnonymousClass8ME.A03(r1, r0)
            X.7w6 r0 = (X.C346997w6) r0
            if (r0 == 0) goto L_0x001f
            com.instagram.reels.musicpick.model.MusicPickStickerModel r0 = r0.A01
            java.lang.String r0 = r0.A02
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            r1 = 0
            if (r0 == 0) goto L_0x0045
            X.8Ji r0 = r11.A0F
            X.81C r0 = r0.A00
            X.81E r0 = r0.A00()
            X.8Jj r0 = (X.C353838Jj) r0
            r7 = 1
            r8 = 0
            r6 = -1
            r4 = 1065353216(0x3f800000, float:1.0)
            r2 = r1
            r3 = r1
            r5 = r4
            r9 = r7
            r10 = r7
            android.graphics.Bitmap r2 = r0.A01(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r2 == 0) goto L_0x0045
            com.instagram.common.session.UserSession r1 = r11.A0D
            android.app.Activity r0 = r11.A0A
            X.1GK r1 = X.AEI.A01(r0, r2, r1, r7)
        L_0x0045:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8K4.A01(X.8K4):X.1GK");
    }

    public static C254743sy A02(AnonymousClass8K4 r4, LD4 ld4) {
        AnonymousClass3U9 C60;
        DirectShareTarget directShareTarget = ld4.A00;
        if (directShareTarget != null) {
            Object obj = directShareTarget.A09;
            obj.getClass();
            if (!(obj instanceof MsysThreadId)) {
                if (obj instanceof C333417Yw) {
                    obj = ((C333417Yw) obj).A01;
                } else if ((obj instanceof C254763t0) && (C60 = 1bJ.A00(r4.A0D).C60(((C254763t0) obj).A00)) != null) {
                    return C60.BJz();
                }
            }
            return (MsysThreadId) obj;
        }
        return null;
    }

    private void A03() {
        if (this.A0r.CZe()) {
            C314676if r1 = this.A0G.A1g;
            if (r1.A03 && ((AnonymousClass8ME) r1.get()).A1R()) {
                return;
            }
        }
        AnonymousClass869 r3 = this.A0s;
        r3.A00 = 0;
        r3.A02 = -1;
        r3.A03 = false;
        r3.A01 = 5000;
    }

    public static void A05(AnonymousClass8K4 r3) {
        AnonymousClass80G r2 = r3.A0E;
        if (r2.A05().getParent() != null) {
            r2.A05().setVisibility(8);
            r3.A0B.removeView(r2.A05());
        }
    }

    public static void A06(AnonymousClass8K4 r4) {
        C353858Jp r0 = r4.A0w;
        if (r0 != null) {
            AnonymousClass0eM r1 = r0.A00;
            if (((C354128Kt) r1.getValue()).A04) {
                C354128Kt r12 = (C354128Kt) r1.getValue();
                if (r12.A04) {
                    2cs r3 = r12.A06;
                    r3.A08(r3.A01, true);
                }
                r4.A0a.DYe();
            }
        }
    }

    public static void A07(AnonymousClass8K4 r6) {
        r6.A0B.removeCallbacks(r6.A07);
        r6.A07 = null;
        AnonymousClass85s r0 = r6.A0d;
        r0.release();
        r0.A00 = false;
        r6.A03();
        AnonymousClass8KR r4 = r6.A0N;
        11Z.A00();
        C364838m6 r02 = r4.A02;
        if (r02 != null) {
            r02.A09 = false;
            C364898mC r03 = r02.A0K;
            r03.A03 = false;
            r03.A00();
            r4.A02 = null;
        }
        r4.A0B.clear();
        Map map = r4.A0C;
        for (Object next : map.values()) {
            AnonymousClass80G r04 = r4.A06;
            0qQ.A0B(next, 0);
            r04.A0E.A00.remove(next);
        }
        map.clear();
        r4.A0A.clear();
        C344207rU r05 = r4.A01;
        if (r05 != null) {
            r05.A04();
        }
        A05(r6);
    }

    public static void A09(AnonymousClass8K4 r5, C39651A3r a3r, C39892ADt aDt, Integer num, AnonymousClass0eM r9, boolean z, boolean z2) {
        1Av A002 = 1Au.A00(r5.A0D);
        A002.A4t.Epx(A002, true, 1Av.A8a[127]);
        r5.A0t.A00().A00();
        r5.A0U.A03(r5, a3r, aDt, num, r9, z, z2);
        if (z) {
            r5.A0r.E3H(new Object());
        }
    }

    public static void A0B(AnonymousClass8K4 r4, C352218Cl r5) {
        if (!r5.A0z) {
            UserSession userSession = r4.A0D;
            0qQ.A0B(userSession, 0);
            if (182.A06(0Tu.A05, userSession, 36322705926072686L)) {
                0nY.A00().ATE(new C363918kZ(r4, r5));
                return;
            }
        }
        A0C(r4, r5);
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.8or, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0129, code lost:
        if (r7.A00 == false) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01c1, code lost:
        if (r10.A0B == false) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01c4, code lost:
        if (r10 != null) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c6, code lost:
        r9 = r10.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01c8, code lost:
        if (r9 < 0) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01d0, code lost:
        if (r9 >= r10.A0A.size()) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01d2, code lost:
        r9 = r10.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01d4, code lost:
        r6 = ((com.instagram.ui.text.TextColorScheme) r10.A0A.get(r9)).A06;
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01df, code lost:
        if (r6 != null) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01e1, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01e2, code lost:
        r11 = r8.A0I;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01e6, code lost:
        if (r8.A0y == false) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01e8, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01eb, code lost:
        if (r8.A19 != false) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ed, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ee, code lost:
        r10 = r3.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01f0, code lost:
        if (r15 == false) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01f2, code lost:
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01f4, code lost:
        if (r9 != false) goto L_0x01f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01f6, code lost:
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01f8, code lost:
        X.C365048mR.A00(r10, r11, r12, r13, r14, r15, r16);
        r3.A01 = X.AnonymousClass8KK.A01(r3, r8);
        r3.A02 = X.AnonymousClass8KK.A01(r3, r8);
        r3.A06();
        r3.A00.A00 = r7.A0E();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0229, code lost:
        r9 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0C(X.AnonymousClass8K4 r26, X.C352218Cl r27) {
        /*
            r0 = r26
            X.8KR r1 = r0.A0N
            X.8m6 r2 = r1.A02
            if (r2 == 0) goto L_0x0011
            X.80D r2 = r0.A0J
            java.lang.Integer r3 = r2.A28
            java.lang.Integer r2 = X.AnonymousClass05K.A02
            if (r3 == r2) goto L_0x0011
            return
        L_0x0011:
            X.8Kx r8 = r0.A0Q
            X.82p r2 = r0.A0I
            X.82o r5 = r2.A02
            X.82Y r2 = r5.A01
            X.8Yz r10 = r2.A0X
            r10.getClass()
            r4 = 0
            java.util.Queue r7 = r8.A06
            r7.clear()
            com.instagram.common.session.UserSession r9 = r8.A03
            X.0Tu r6 = X.0Tu.A05
            r2 = 36319355851840683(0x81084300051cab, double:3.0318451147869624E-306)
            boolean r3 = X.182.A06(r6, r9, r2)
            r2 = r27
            if (r3 == 0) goto L_0x003d
            X.AnN r3 = new X.AnN
            r3.<init>(r8, r2)
            r7.add(r3)
        L_0x003d:
            boolean r3 = X.AnonymousClass8KI.A00(r9)
            if (r3 == 0) goto L_0x0090
            X.80m r3 = r10.A08
            java.lang.Object r6 = r3.A00
            X.9QA r3 = X.AnonymousClass9QA.A00
            if (r6 != r3) goto L_0x0090
            X.80m r3 = r10.A09
            java.lang.Object r6 = r3.A00
            java.util.Set r6 = (java.util.Set) r6
            X.8aL r3 = X.C358088aL.A0C
            boolean r3 = r6.contains(r3)
            if (r3 != 0) goto L_0x0090
            boolean r3 = r2.A0z
            if (r3 == 0) goto L_0x0090
            int r3 = r2.A09
            float r10 = (float) r3
            r6 = 1065353216(0x3f800000, float:1.0)
            float r10 = r10 * r6
            int r3 = r2.A06
            float r3 = (float) r3
            float r10 = r10 / r3
            int r3 = r2.A07
            int r3 = r3 % 180
            if (r3 == 0) goto L_0x006f
            float r10 = r6 / r10
        L_0x006f:
            r3 = 1058013184(0x3f100000, float:0.5625)
            float r10 = r10 - r3
            float r6 = java.lang.Math.abs(r10)
            r3 = 1008981770(0x3c23d70a, float:0.01)
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0090
            X.8Bc r3 = r8.A04
            if (r3 == 0) goto L_0x0090
            X.8Bd r6 = X.C351968Bd.SMART_CROP_FIT
            X.05G r3 = r3.A02
            r3.Epw(r6)
            X.8w5 r3 = new X.8w5
            r3.<init>(r8, r2)
            r7.add(r3)
        L_0x0090:
            boolean r3 = r8.A09
            if (r3 == 0) goto L_0x00ce
            X.83h r3 = com.aiplatform.modelloaders.nativemodelloader.ig.IgVoltronModelLoader.Companion
            com.aiplatform.modelloaders.nativemodelloader.ig.IgVoltronModelLoader r3 = r3.A00(r9)
            java.util.concurrent.atomic.AtomicBoolean r3 = r3.arePytorchLibrariesLoaded
            boolean r3 = r3.get()
            if (r3 == 0) goto L_0x00ce
            X.8Eg r3 = X.AnonymousClass8Eg.BODY_KP_MODEL
            X.8CI r3 = X.C352658Eh.A00(r3)
            java.util.List r6 = java.util.Collections.singletonList(r3)
            X.0qQ.A07(r6)
            X.8CO r3 = new X.8CO
            r3.<init>(r9, r6)
            X.A5r r6 = new X.A5r
            r6.<init>(r3)
            X.9YA r3 = new X.9YA
            r3.<init>(r6)
            r8.A00 = r3
            X.8B2 r3 = r8.A05
            if (r3 == 0) goto L_0x00c6
            r3.A01 = r4
        L_0x00c6:
            X.AnM r3 = new X.AnM
            r3.<init>(r8, r2)
            r7.add(r3)
        L_0x00ce:
            r8.A00()
            X.8B2 r3 = r0.A0X
            if (r3 == 0) goto L_0x00ea
            r9 = 1058013184(0x3f100000, float:0.5625)
            X.05G r8 = r3.A06
            com.instagram.common.gallery.Medium r3 = r2.A0F
            r7 = 1
            if (r3 == 0) goto L_0x0278
            int r3 = r3.A05
            if (r3 != 0) goto L_0x0278
        L_0x00e2:
            r7 = 0
        L_0x00e3:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r7)
            r8.Epw(r3)
        L_0x00ea:
            X.8KK r3 = r0.A0M
            boolean r7 = r5.A0E()
            X.8or r6 = new X.8or
            r6.<init>()
            r6.A00 = r7
            r3.A00 = r6
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r8 = r3.A01
            if (r8 == 0) goto L_0x0108
            r7 = 0
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r6 = r8.A08
            r6.A00 = r7
            r8.A04(r7)
            r8.A05(r7)
        L_0x0108:
            java.lang.String r6 = r2.A0h
            android.app.Activity r7 = r0.A0A
            X.8m2 r23 = X.C364788m0.A00(r7, r2)
            int r7 = r2.A07
            r0.A01 = r7
            int r7 = r2.A01
            r0.A00 = r7
            int r11 = r2.A09
            int r12 = r2.A06
            android.graphics.Rect r9 = r2.A00()
            int r13 = r0.A01
            X.8or r7 = r3.A00
            if (r7 == 0) goto L_0x012b
            boolean r7 = r7.A00
            r14 = 1
            if (r7 != 0) goto L_0x012c
        L_0x012b:
            r14 = 0
        L_0x012c:
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r7 = r0.A0H
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r7 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r7
            X.81W r8 = r7.A0K
            int r7 = r8.getWidth()
            float r10 = (float) r7
            int r7 = r8.getHeight()
            float r7 = (float) r7
            float r10 = r10 / r7
            com.instagram.creation.base.CropInfo r7 = X.C364818m3.A00(r9, r10, r11, r12, r13, r14)
            r0.A02 = r7
            X.7rU r8 = X.AnonymousClass8KR.A00(r1)
            boolean r7 = r8.A08()
            if (r7 != 0) goto L_0x0150
            r8.A03()
        L_0x0150:
            java.util.Map r12 = r1.A0B
            java.lang.Object r7 = r12.get(r6)
            X.8m6 r7 = (X.C364838m6) r7
            if (r7 == 0) goto L_0x022f
            r1.A02 = r7
        L_0x015c:
            X.84f r8 = r0.A0p
            X.8m6 r7 = r1.A02
            if (r7 == 0) goto L_0x0164
            r7.A05 = r8
        L_0x0164:
            java.util.Map r7 = r1.A0A
            java.lang.Object r7 = r7.get(r6)
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r7 = (com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel) r7
            if (r7 != 0) goto L_0x0175
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r7 = X.C364978mK.A00()
            r1.A02(r7, r6)
        L_0x0175:
            r0.A03 = r7
            r1.A02(r7, r6)
            java.util.Map r12 = r1.A0C
            java.lang.Object r7 = r12.get(r6)
            if (r7 != 0) goto L_0x019a
            X.8KS r11 = r1.A09
            X.80G r10 = r1.A06
            android.view.View r9 = r10.A05()
            X.8m6 r8 = r1.A02
            r8.getClass()
            X.8mQ r7 = new X.8mQ
            r7.<init>(r9, r8, r11)
            r12.put(r6, r7)
            r10.A08(r7)
        L_0x019a:
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r13 = r0.A03
            X.8Kf r6 = new X.8Kf
            r6.<init>(r1)
            r3.A03 = r6
            X.8or r6 = r3.A00
            if (r6 == 0) goto L_0x022b
            boolean r6 = r6.A00
            if (r6 == 0) goto L_0x022b
            X.82p r12 = r3.A09
            X.82o r7 = r12.A02
            X.82Y r6 = r7.A01
            X.8Cl r8 = r6.A03()
            r8.getClass()
            X.802 r10 = r6.A02()
            if (r10 == 0) goto L_0x01c3
            boolean r6 = r10.A0B
            r15 = 1
            if (r6 != 0) goto L_0x01c6
        L_0x01c3:
            r15 = 0
            if (r10 == 0) goto L_0x01e1
        L_0x01c6:
            int r9 = r10.A01
            if (r9 < 0) goto L_0x0229
            java.util.List r6 = r10.A0A
            int r6 = r6.size()
            if (r9 >= r6) goto L_0x0229
            int r9 = r10.A01
        L_0x01d4:
            java.util.List r6 = r10.A0A
            java.lang.Object r6 = r6.get(r9)
            com.instagram.ui.text.TextColorScheme r6 = (com.instagram.ui.text.TextColorScheme) r6
            java.lang.String r6 = r6.A06
            r9 = 1
            if (r6 != 0) goto L_0x01e2
        L_0x01e1:
            r9 = 0
        L_0x01e2:
            X.0v6 r11 = r8.A0I
            boolean r6 = r8.A0y
            if (r6 == 0) goto L_0x01ed
            boolean r6 = r8.A19
            r14 = 1
            if (r6 != 0) goto L_0x01ee
        L_0x01ed:
            r14 = 0
        L_0x01ee:
            com.instagram.common.session.UserSession r10 = r3.A08
            if (r15 == 0) goto L_0x01f6
            r16 = 1
            if (r9 != 0) goto L_0x01f8
        L_0x01f6:
            r16 = 0
        L_0x01f8:
            X.C365048mR.A00(r10, r11, r12, r13, r14, r15, r16)
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r6 = X.AnonymousClass8KK.A01(r3, r8)
            r3.A01 = r6
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r6 = X.AnonymousClass8KK.A01(r3, r8)
            r3.A02 = r6
            r3.A06()
            X.8or r6 = r3.A00
            boolean r3 = r7.A0E()
            r6.A00 = r3
        L_0x0212:
            X.8Kp r8 = r0.A0a
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r3 = r0.A03
            X.0qQ.A0B(r3, r4)
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r3 = (com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl) r3
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain r7 = r3.A02
            X.8pJ r6 = new X.8pJ
            r6.<init>(r7)
            X.8pK r3 = new X.8pK
            r3.<init>(r7, r6)
            monitor-enter(r8)
            goto L_0x028d
        L_0x0229:
            r9 = 0
            goto L_0x01d4
        L_0x022b:
            r6 = 0
            r3.A01 = r6
            goto L_0x0212
        L_0x022f:
            X.8KQ r8 = r1.A07
            android.graphics.Bitmap r7 = r2.A0C
            r16 = r7
            r7 = 0
            r2.A0C = r7
            android.content.Context r7 = r1.A04
            r27 = r7
            com.instagram.common.session.UserSession r15 = r1.A05
            X.7rU r17 = X.AnonymousClass8KR.A00(r1)
            X.8m8 r11 = new X.8m8
            r11.<init>(r8)
            X.8K4 r7 = r8.A00
            com.instagram.creation.base.CropInfo r14 = r7.A02
            r14.getClass()
            int r13 = r7.A01
            int r10 = r7.A00
            boolean r9 = r2.A13
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r8 = r1.A08
            X.8mA r22 = new X.8mA
            r22.<init>()
            X.8m6 r7 = new X.8m6
            r24 = r13
            r25 = r10
            r26 = r9
            r19 = r14
            r20 = r8
            r21 = r11
            r18 = r15
            r14 = r7
            r15 = r27
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r1.A02 = r7
            r12.put(r6, r7)
            goto L_0x015c
        L_0x0278:
            int r3 = r2.A09
            float r6 = (float) r3
            int r3 = r2.A06
            float r3 = (float) r3
            float r6 = r6 / r3
            float r6 = r6 - r9
            float r6 = java.lang.Math.abs(r6)
            r3 = 1028443341(0x3d4ccccd, float:0.05)
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00e2
            goto L_0x00e3
        L_0x028d:
            r8.A00 = r3     // Catch:{ all -> 0x031c }
            monitor-exit(r8)
            boolean r3 = r2.A0y
            if (r3 == 0) goto L_0x0298
            boolean r2 = r2.A19
            if (r2 != 0) goto L_0x030b
        L_0x0298:
            boolean r2 = r5.A0I()
            if (r2 != 0) goto L_0x030b
            X.8Kn r3 = r0.A0z
            X.8Kr r2 = r0.A0y
            X.0qQ.A0B(r2, r4)
            java.util.LinkedHashSet r5 = r3.A00
            r5.remove(r2)
        L_0x02aa:
            X.8Ks r3 = r0.A10
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r2 = r0.A03
            X.0qQ.A0B(r2, r4)
            r3.A00 = r2
            r5.add(r3)
            X.80G r4 = r0.A0E
            android.view.View r2 = r4.A05()
            android.view.ViewParent r2 = r2.getParent()
            if (r2 != 0) goto L_0x02d1
            android.view.ViewGroup r2 = r0.A0B
            android.view.View r1 = r4.A05()
            r2.addView(r1)
        L_0x02cb:
            X.85s r1 = r0.A0d
            r0 = 1
            r1.A00 = r0
            return
        L_0x02d1:
            com.instagram.common.ui.widget.textureview.MultiListenerTextureView r2 = r4.A0D
            if (r2 == 0) goto L_0x0309
            boolean r3 = r2.isAvailable()
        L_0x02d9:
            android.view.SurfaceView r2 = r4.A0C
            if (r2 == 0) goto L_0x02eb
            android.view.SurfaceHolder r2 = r2.getHolder()
            android.view.Surface r2 = r2.getSurface()
            if (r2 == 0) goto L_0x02eb
            boolean r3 = r2.isValid()
        L_0x02eb:
            if (r3 == 0) goto L_0x02cb
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r6 = r0.A03
            X.8m6 r5 = r1.A02
            if (r5 == 0) goto L_0x02ff
            X.8KS r4 = r1.A09
            X.80G r2 = r1.A06
            android.view.View r3 = r2.A05()
            r2 = 0
            r5.EoR(r3, r4, r2)
        L_0x02ff:
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r6 = (com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl) r6
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain r2 = r6.A02
            r1.A00 = r2
            r1.A01()
            goto L_0x02cb
        L_0x0309:
            r3 = 0
            goto L_0x02d9
        L_0x030b:
            X.8Kr r3 = r0.A0y
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r2 = r0.A03
            X.0qQ.A0B(r2, r4)
            r3.A00 = r2
            X.8Kn r2 = r0.A0z
            java.util.LinkedHashSet r5 = r2.A00
            r5.add(r3)
            goto L_0x02aa
        L_0x031c:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8K4.A0C(X.8K4, X.8Cl):void");
    }

    public static boolean A0D(AnonymousClass8K4 r2) {
        C357638Yz r0 = r2.A0I.A02.A01.A0X;
        r0.getClass();
        if (r0.A08.A00 == AnonymousClass9QA.A00) {
            return true;
        }
        return false;
    }

    public static boolean A0E(AnonymousClass8K4 r4) {
        CameraAREffect A002 = r4.A0R.A00();
        boolean z = false;
        if (!((AnonymousClass8ME) r4.A0G.A1g.get()).A1A().isEmpty()) {
            z = true;
        }
        if ((A002 == null || !A002.A0K()) && !z) {
            return false;
        }
        return true;
    }

    public final Bitmap A0F(Bitmap bitmap, Bitmap bitmap2) {
        Bitmap bitmap3;
        try {
            MultiListenerTextureView multiListenerTextureView = this.A0E.A0D;
            if (multiListenerTextureView != null) {
                bitmap3 = multiListenerTextureView.getBitmap();
            } else {
                bitmap3 = null;
            }
            if (bitmap3 == null) {
                ViewGroup viewGroup = this.A0B;
                bitmap3 = Bitmap.createBitmap(viewGroup.getWidth(), viewGroup.getHeight(), Bitmap.Config.ARGB_8888);
                0kD.A01("PhotoViewController#getMediaScreenshot_mediaScreen_is_null", "Could not obtain bitmap from TextureView");
            }
            return A00(bitmap3, bitmap, bitmap2, this);
        } catch (OutOfMemoryError e) {
            0kD.A0H("PhotoViewController#getMediaScreenshot_OOM", e);
            return null;
        }
    }

    public final C364758lx A0G() {
        FilterGroupModelImpl filterGroupModelImpl;
        C370178vx r0;
        int i;
        List list;
        A06(this);
        FilterGroupModel filterGroupModel = this.A03;
        if (filterGroupModel != null) {
            filterGroupModelImpl = filterGroupModel.E1g();
        } else {
            filterGroupModelImpl = null;
            0kD.A01("PhotoViewController#saveEdits:filtergroupmodel_is_null", "");
        }
        CropInfo cropInfo = this.A02;
        if (cropInfo == null) {
            AnonymousClass81W r02 = ((NineSixteenLayoutConfigImpl) this.A0H).A0K;
            int width = r02.getWidth();
            int height = r02.getHeight();
            cropInfo = new CropInfo(new Rect(0, 0, width, height), width, height);
        }
        AnonymousClass8KK r3 = this.A0M;
        TransformMatrixConfig transformMatrixConfig = r3.A01;
        if (transformMatrixConfig != null) {
            r0 = new C370178vx(transformMatrixConfig.A08);
        } else {
            Integer num = AnonymousClass05K.A00;
            r0 = new C370178vx(new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false));
        }
        C366668pT r8 = new C366668pT(true, r0);
        C354028Kj r4 = this.A0Z;
        if (r4 != null) {
            i = r4.Au0();
        } else {
            i = 0;
        }
        CameraAREffect A002 = this.A0R.A00();
        AnonymousClass8BA r1 = this.A0G;
        AnonymousClass8PW A003 = AnonymousClass8MD.A00(r1, r4, this.A0T, false);
        TransformMatrixConfig transformMatrixConfig2 = r3.A01;
        LinkedHashMap A1A = ((AnonymousClass8ME) r1.A1g.get()).A1A();
        C354088Kp r12 = this.A0a;
        synchronized (r12) {
            list = r12.A01;
        }
        return new C364758lx(A002, cropInfo, transformMatrixConfig2, r8, A003, filterGroupModelImpl, A1A, list, i, false);
    }

    public final void A0H() {
        this.A0B.removeCallbacks(this.A07);
        this.A07 = null;
        AnonymousClass8KR r5 = this.A0N;
        11Z.A00();
        C364838m6 r0 = r5.A02;
        if (r0 != null) {
            r0.A09 = false;
            C364898mC r02 = r0.A0K;
            r02.A03 = false;
            r02.A00();
            if (r5.A02 != null) {
                Map map = r5.A0B;
                Iterator it = map.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (entry.getValue().equals(r5.A02)) {
                        Object key = entry.getKey();
                        if (key != null) {
                            map.remove(key);
                        }
                    }
                }
            }
            C344207rU r03 = r5.A01;
            if (r03 != null) {
                r03.A04();
                r5.A01 = null;
            }
            r5.A02 = null;
        }
        C366068o8 r04 = this.A0R.A04;
        if (r04 != null) {
            r04.A02();
        }
        AnonymousClass85s r1 = this.A0d;
        r1.release();
        r1.A00 = false;
        A03();
    }

    public final void A0I(AnonymousClass8QA r3) {
        this.A0k.getValue();
        C352218Cl A032 = this.A0I.A02.A01.A03();
        if (A032 != null) {
            C364728lu r1 = new C364728lu(r3, this, A032);
            this.A07 = r1;
            0nA.A0p(this.A0B, r1);
        }
    }

    public final void A0J(B1O b1o, LD4 ld4, C381779cJ r22, L8M l8m, AnonymousClass8VT r24, Integer num, String str, String str2, String str3, boolean z, boolean z2) {
        A08(this, b1o, ld4, (C381539bv) null, r22, l8m, r24, (C15023UKc) null, (Boolean) null, num, str, str2, (String) null, str3, (List) null, (List) null, 1, z, z2);
    }

    public final boolean A0K() {
        C282765Eq r1;
        boolean z = false;
        if (this.A0R.A00() != null) {
            z = true;
        }
        LinkedHashMap A1A = ((AnonymousClass8ME) this.A0G.A1g.get()).A1A();
        UserSession userSession = this.A0D;
        0qQ.A0B(userSession, 2);
        if (!z) {
            Set keySet = A1A.keySet();
            if (!(keySet instanceof Collection) || !keySet.isEmpty()) {
                Iterator it = keySet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (it.next() instanceof C369838vP) {
                        Set keySet2 = A1A.keySet();
                        if (!(keySet2 instanceof Collection) || !keySet2.isEmpty()) {
                            Iterator it2 = keySet2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                Object next = it2.next();
                                if (!(next instanceof C369838vP) && !(next instanceof AnonymousClass9X8) && !(next instanceof AnonymousClass9XI)) {
                                    break;
                                }
                            }
                        }
                        Iterable iterable = (Iterable) 00k.A0A(A1A.values());
                        Float f = null;
                        if (!(iterable == null || (r1 = (C282765Eq) 00k.A0A(iterable)) == null)) {
                            f = Float.valueOf(r1.A09);
                        }
                        if (0qQ.A0I(f, 0.0f)) {
                            return 182.A06(0Tu.A05, userSession, 36323225617116168L);
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void CjC(CharSequence charSequence, boolean z) {
        AnonymousClass8KX r2 = this.A0b;
        String charSequence2 = charSequence.toString();
        0qQ.A0B(charSequence2, 0);
        if (z) {
            r2.A01.A01(charSequence2);
        }
    }

    public final void onResume() {
        C364838m6 r1 = this.A0N.A02;
        if (r1 != null) {
            r1.A09 = true;
            C364898mC r2 = r1.A0K;
            r2.A04 = false;
            if (r2.A03) {
                r2.A02.A00(r2.A01);
            }
        }
        AnonymousClass869 r22 = this.A0s;
        if (r22.A03) {
            r22.A02 = System.currentTimeMillis();
        }
        this.A0d.onResume();
    }

    public final String getModuleName() {
        if (A0D(this)) {
            return "stories_postcapture_camera";
        }
        C357638Yz r0 = this.A0I.A02.A01.A0X;
        r0.getClass();
        if (r0.A08.A00 == C3494180h.A00) {
            return "note_postcapture_camera";
        }
        return "direct_postcapture_camera";
    }

    public final void onPause() {
        A06(this);
        C364838m6 r1 = this.A0N.A02;
        if (r1 != null) {
            r1.A09 = false;
            r1.A0K.A00();
        }
        AnonymousClass869 r12 = this.A0s;
        if (r12.A03) {
            r12.A00 = r12.A00();
        }
        this.A0d.onPause();
        ((Dialog) this.A0l.getValue()).dismiss();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x016a, code lost:
        if (r14.A08 == false) goto L_0x016c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0272, code lost:
        if (r7.A0O != false) goto L_0x0274;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass8K4(android.app.Activity r27, android.view.ViewGroup r28, androidx.fragment.app.Fragment r29, X.C3503284f r30, com.instagram.common.session.UserSession r31, X.C353828Ji r32, X.AnonymousClass8BA r33, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r34, X.C352888Fl r35, X.C3499582p r36, X.AnonymousClass80D r37, X.C3503684j r38, X.AnonymousClass88O r39, X.C353788Jb r40, com.instagram.creation.capture.quickcapture.save.CachingVideoSaver r41, X.AnonymousClass80U r42, X.C3510287h r43, X.AnonymousClass869 r44, X.AnonymousClass846 r45, X.C353918Jw r46, X.C314676if r47, X.C3495780x r48, X.AnonymousClass8B2 r49, X.AnonymousClass88F r50, X.C353858Jp r51, X.AnonymousClass85s r52, X.AnonymousClass0eK r53, X.AnonymousClass0eK r54, boolean r55) {
        /*
            r26 = this;
            r6 = r26
            r11 = r42
            r6.<init>()
            X.4fh r1 = X.C318146oT.A01
            X.1a8 r0 = new X.1a8
            r0.<init>(r1)
            r6.A0C = r0
            r14 = 0
            r6.A08 = r14
            X.8K6 r0 = new X.8K6
            r0.<init>(r6)
            r6.A0P = r0
            X.8K8 r1 = new X.8K8
            r1.<init>(r6)
            r6.A11 = r1
            X.8K9 r10 = new X.8K9
            r10.<init>(r6)
            r6.A0x = r10
            X.8KB r0 = new X.8KB
            r0.<init>(r6)
            r6.A0L = r0
            r0 = r35
            r6.A0q = r0
            r13 = r36
            r6.A0I = r13
            r6.A0r = r11
            r11.A7w(r1)
            r5 = r27
            r6.A0A = r5
            X.8KD r0 = new X.8KD
            r0.<init>(r6)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r6.A0l = r0
            r0 = r55
            r6.A0n = r0
            r0 = 2131437981(0x7f0b299d, float:1.8497876E38)
            r9 = r28
            android.view.View r7 = r9.requireViewById(r0)
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r6.A0B = r7
            r4 = r31
            boolean r0 = X.C3495280s.A01(r4)
            if (r0 == 0) goto L_0x0286
            r0 = 2131429452(0x7f0b084c, float:1.8480577E38)
            android.view.View r0 = r7.requireViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r1 = r0.inflate()
            r0 = 2131429451(0x7f0b084b, float:1.8480575E38)
            android.view.View r0 = r1.requireViewById(r0)
            android.view.SurfaceView r0 = (android.view.SurfaceView) r0
            X.80G r1 = new X.80G
            r1.<init>((android.view.SurfaceView) r0)
        L_0x007f:
            r6.A0E = r1
            r8 = r34
            r6.A0H = r8
            r0 = r53
            r6.A0j = r0
            r0 = r46
            r6.A0U = r0
            r0 = r33
            r6.A0G = r0
            r0 = r50
            r6.A0Y = r0
            r0 = r45
            r6.A0t = r0
            r0 = r52
            r6.A0d = r0
            r0 = r44
            r6.A0s = r0
            r6.A0D = r4
            r12 = r37
            r6.A0J = r12
            r0 = r54
            r6.A0i = r0
            r0 = r5
            androidx.activity.ComponentActivity r0 = (androidx.activity.ComponentActivity) r0
            X.2YN r1 = new X.2YN
            r1.<init>(r0)
            java.lang.Class<X.8Bc> r0 = X.C351958Bc.class
            X.2YL r3 = r1.A00(r0)
            X.8Bc r3 = (X.C351958Bc) r3
            r6.A0S = r3
            boolean r0 = X.AnonymousClass8KI.A00(r4)
            r2 = r29
            if (r0 == 0) goto L_0x00cf
            X.2Fk r1 = r3.A00
            X.8KJ r0 = new X.8KJ
            r0.<init>(r6)
            r1.A06(r2, r0)
        L_0x00cf:
            X.8KK r1 = new X.8KK
            r15 = r1
            r16 = r7
            r17 = r4
            r18 = r8
            r19 = r13
            r20 = r3
            r15.<init>(r16, r17, r18, r19, r20)
            r6.A0M = r1
            java.util.List r7 = r1.A0A
            r15 = r39
            boolean r0 = r7.contains(r15)
            if (r0 != 0) goto L_0x00ee
            r7.add(r15)
        L_0x00ee:
            r0 = r32
            r6.A0F = r0
            r0 = r43
            r6.A0T = r0
            r0 = r30
            r6.A0p = r0
            r0 = r40
            r6.A0R = r0
            r0 = r47
            r6.A0V = r0
            X.82o r0 = r13.A02
            r25 = r0
            X.82Y r7 = r0.A01
            X.82b r0 = r7.A04
            if (r0 == 0) goto L_0x011e
            boolean r0 = X.1NM.A03(r4)
            if (r0 != 0) goto L_0x011e
            X.82b r0 = r7.A04
            X.2Fj r15 = r0.A06
            X.APY r0 = new X.APY
            r0.<init>(r1)
            r15.A06(r2, r0)
        L_0x011e:
            r0 = r38
            r6.A0K = r0
            X.8KN r2 = new X.8KN
            r2.<init>(r8)
            r6.A0v = r2
            android.content.Context r15 = r5.getApplicationContext()
            r16 = 0
            X.28D r0 = r12.A0B
            X.0qQ.A0B(r15, r14)
            r14 = 1
            X.0qQ.A0B(r4, r14)
            r14 = 6
            X.0qQ.A0B(r0, r14)
            android.content.Context r18 = r15.getApplicationContext()
            X.0qQ.A0A(r18)
            X.8KO r14 = new X.8KO
            r17 = r14
            r19 = r0
            r20 = r4
            r21 = r16
            r22 = r13
            r23 = r12
            r24 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r6.A0O = r14
            X.8KP r0 = new X.8KP
            r0.<init>(r6)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r6.A0k = r0
            com.instagram.model.direct.camera.DirectCameraViewModel r14 = r12.A1I
            if (r14 == 0) goto L_0x016c
            boolean r13 = r14.A08
            r0 = 1
            if (r13 != 0) goto L_0x016d
        L_0x016c:
            r0 = 0
        L_0x016d:
            r6.A0m = r0
            java.lang.String r13 = r12.A2q
            java.lang.String r0 = "story_selfie_reply"
            boolean r0 = r0.equals(r13)
            r6.A0o = r0
            java.lang.String r0 = r12.A2l
            r6.A0g = r0
            if (r14 == 0) goto L_0x0283
            java.lang.String r0 = r14.A05
        L_0x0181:
            r6.A0f = r0
            java.lang.String r0 = r12.A2P
            r6.A0e = r0
            r6.A0h = r13
            r0 = r48
            r6.A0u = r0
            android.app.Activity r0 = r6.A0A
            r18 = r0
            com.instagram.common.session.UserSession r15 = r6.A0D
            X.80G r14 = r6.A0E
            X.8KQ r13 = new X.8KQ
            r13.<init>(r6)
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r0 = r6.A0H
            X.8KR r12 = new X.8KR
            r17 = r12
            r19 = r15
            r20 = r14
            r21 = r13
            r22 = r0
            r17.<init>(r18, r19, r20, r21, r22)
            r6.A0N = r12
            X.8KX r0 = X.AnonymousClass8KW.A00(r4)
            r6.A0b = r0
            X.1Yt r13 = X.C353948Ka.A00(r4)
            boolean r0 = A0D(r6)
            r0 = r0 ^ 1
            java.util.List r0 = r13.A02(r0)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r0)
            X.8Kf r13 = new X.8Kf
            r13.<init>(r12)
            X.80T r11 = (X.AnonymousClass80T) r11
            X.80W r15 = r11.A02
            r0 = 2
            X.0qQ.A0B(r15, r0)
            X.28t r11 = X.28t.A05
            X.8Kh r0 = new X.8Kh
            r0.<init>(r11, r4, r15, r14)
            X.8Kj r11 = new X.8Kj
            r11.<init>(r4, r13, r0, r14)
            r6.A0Z = r11
            java.util.ArrayList r0 = r11.A06
            r0.add(r10)
            X.8Kn r13 = new X.8Kn
            r13.<init>()
            r6.A0z = r13
            X.8Kp r10 = new X.8Kp
            r10.<init>(r11)
            r6.A0a = r10
            X.8Kr r0 = new X.8Kr
            r0.<init>(r11)
            r6.A0y = r0
            X.8Ks r0 = new X.8Ks
            r0.<init>(r4, r1)
            r6.A10 = r0
            java.util.LinkedHashSet r0 = r13.A00
            r0.add(r10)
            r12.A03 = r13
            X.0Tu r10 = X.0Tu.A05
            r0 = 36324591416651949(0x810d06000030ad, double:3.0351561070555344E-306)
            boolean r0 = X.182.A06(r10, r4, r0)
            if (r0 == 0) goto L_0x0228
            r0 = 36324591416783023(0x810d06000230af, double:3.035156107138426E-306)
            boolean r0 = X.182.A06(r10, r4, r0)
            if (r0 == 0) goto L_0x0228
            X.A6N r0 = new X.A6N
            r0.<init>(r9, r4)
            r6.A04 = r0
        L_0x0228:
            r0 = r51
            r6.A0w = r0
            if (r51 == 0) goto L_0x0238
            X.0eM r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            X.8Kt r0 = (X.C354128Kt) r0
            r0.A02 = r11
        L_0x0238:
            X.8Kv r0 = new X.8Kv
            r21 = r41
            r17 = r0
            r18 = r5
            r19 = r4
            r20 = r8
            r22 = r2
            r17.<init>(r18, r19, r20, r21, r22)
            r6.A0W = r0
            r0 = 36324591416651949(0x810d06000030ad, double:3.0351561070555344E-306)
            boolean r0 = X.182.A06(r10, r4, r0)
            if (r0 == 0) goto L_0x0280
            X.8Kw r0 = new X.8Kw
            r0.<init>(r4)
        L_0x025b:
            r6.A0c = r0
            r2 = r49
            r6.A0X = r2
            if (r49 == 0) goto L_0x0278
            boolean r0 = r25.A0F()
            if (r0 != 0) goto L_0x0274
            boolean r0 = r25.A0B()
            if (r0 != 0) goto L_0x0274
            boolean r1 = r7.A0O
            r0 = 1
            if (r1 == 0) goto L_0x0275
        L_0x0274:
            r0 = 0
        L_0x0275:
            r2.A00(r0)
        L_0x0278:
            X.8Kx r0 = new X.8Kx
            r0.<init>(r5, r4, r3, r2)
            r6.A0Q = r0
            return
        L_0x0280:
            r0 = r16
            goto L_0x025b
        L_0x0283:
            r0 = 0
            goto L_0x0181
        L_0x0286:
            r0 = 2131429453(0x7f0b084d, float:1.848058E38)
            android.view.View r0 = r9.requireViewById(r0)
            com.instagram.common.ui.widget.textureview.MultiListenerTextureView r0 = (com.instagram.common.ui.widget.textureview.MultiListenerTextureView) r0
            X.80G r1 = new X.80G
            r1.<init>((com.instagram.common.ui.widget.textureview.MultiListenerTextureView) r0)
            goto L_0x007f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8K4.<init>(android.app.Activity, android.view.ViewGroup, androidx.fragment.app.Fragment, X.84f, com.instagram.common.session.UserSession, X.8Ji, X.8BA, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, X.8Fl, X.82p, X.80D, X.84j, X.88O, X.8Jb, com.instagram.creation.capture.quickcapture.save.CachingVideoSaver, X.80U, X.87h, X.869, X.846, X.8Jw, X.6if, X.80x, X.8B2, X.88F, X.8Jp, X.85s, X.0eK, X.0eK, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r24 != null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r7.A02 != com.instagram.pendingmedia.model.constants.ShareType.DIRECT_SHARE) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A08(X.AnonymousClass8K4 r18, X.B1O r19, X.LD4 r20, X.C381539bv r21, X.C381779cJ r22, X.L8M r23, X.AnonymousClass8VT r24, X.C15023UKc r25, java.lang.Boolean r26, java.lang.Integer r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.util.List r32, java.util.List r33, int r34, boolean r35, boolean r36) {
        /*
            r7 = r20
            com.instagram.model.direct.DirectShareTarget r0 = r7.A00
            if (r0 == 0) goto L_0x000d
            com.instagram.pendingmedia.model.constants.ShareType r2 = r7.A02
            com.instagram.pendingmedia.model.constants.ShareType r1 = com.instagram.pendingmedia.model.constants.ShareType.DIRECT_SHARE
            r0 = 1
            if (r2 == r1) goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            r2 = 1
            r10 = r23
            r11 = r24
            if (r0 != 0) goto L_0x001b
            boolean r0 = r7.A00()
            if (r0 == 0) goto L_0x0026
        L_0x001b:
            if (r23 != 0) goto L_0x0020
            r1 = 1
            if (r24 == 0) goto L_0x0021
        L_0x0020:
            r1 = 0
        L_0x0021:
            java.lang.String r0 = "storyXShareParams and highlightsInfo are not valid with Direct shares"
            X.02V.A06(r1, r0)
        L_0x0026:
            r5 = r18
            boolean r0 = r5.A09
            if (r0 != 0) goto L_0x0084
            r5.A09 = r2
            A06(r5)
            X.82p r0 = r5.A0I
            X.82o r0 = r0.A02
            X.82Y r0 = r0.A01
            X.8Cl r13 = r0.A03()
            r13.getClass()
            X.Ar6 r4 = new X.Ar6
            r18 = r30
            r17 = r29
            r16 = r28
            r15 = r27
            r14 = r26
            r12 = r25
            r24 = r36
            r23 = r35
            r9 = r22
            r22 = r34
            r8 = r21
            r21 = r33
            r20 = r32
            r6 = r19
            r19 = r31
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            boolean r0 = r13.A0z
            if (r0 != 0) goto L_0x0085
            com.instagram.common.session.UserSession r3 = r5.A0D
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322705926007149(0x810b4f0000296d, double:3.0339637151795014E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0085
            X.0nO r1 = X.0nY.A00()
            X.9lE r0 = new X.9lE
            r0.<init>(r5, r13, r4)
            r1.ATE(r0)
        L_0x0084:
            return
        L_0x0085:
            r4.run()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8K4.A08(X.8K4, X.B1O, X.LD4, X.9bv, X.9cJ, X.L8M, X.8VT, X.UKc, java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, int, boolean, boolean):void");
    }
}
