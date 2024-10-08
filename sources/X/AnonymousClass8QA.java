package X;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.SparseArray;
import androidx.fragment.app.FragmentActivity;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import com.instagram.creation.capture.quickcapture.rulesystem.CaptureRuleSystemState;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.music.common.model.MusicDataSource;
import com.instagram.reels.fragment.model.ReelMoreOptionsModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* renamed from: X.8QA  reason: invalid class name */
public final class AnonymousClass8QA implements AnonymousClass8QB, AnonymousClass8QC {
    public C349327zy A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public C366678pU A06;
    public final FragmentActivity A07;
    public final UserSession A08;
    public final AnonymousClass8QF A09;
    public final AnonymousClass8K4 A0A;
    public final AnonymousClass8BA A0B;
    public final AnonymousClass8LU A0C;
    public final AnonymousClass8MC A0D;
    public final TargetViewSizeProvider A0E;
    public final C3499582p A0F;
    public final C354188Kz A0G;
    public final AnonymousClass8QE A0H = new AnonymousClass8QE();
    public final AnonymousClass88Z A0I;
    public final String A0J;
    public final Map A0K = new HashMap();
    public final Map A0L = new HashMap();
    public final Queue A0M = new LinkedList();
    public final Set A0N = new HashSet();
    public final boolean A0O;
    public final C353828Ji A0P;
    public final C3506485o A0Q;
    public final AnonymousClass8E5 A0R;
    public final Integer A0S;

    public AnonymousClass8QA(FragmentActivity fragmentActivity, UserSession userSession, C353828Ji r4, AnonymousClass8K4 r5, AnonymousClass8BA r6, AnonymousClass8LU r7, AnonymousClass8MC r8, TargetViewSizeProvider targetViewSizeProvider, C3506485o r10, C3499582p r11, C354188Kz r12, AnonymousClass8E5 r13, AnonymousClass88Z r14, Integer num, String str, boolean z) {
        0qQ.A0B(r14, 2);
        0qQ.A0B(userSession, 4);
        0qQ.A0B(targetViewSizeProvider, 5);
        this.A0F = r11;
        this.A0I = r14;
        this.A07 = fragmentActivity;
        this.A08 = userSession;
        this.A0E = targetViewSizeProvider;
        this.A0B = r6;
        this.A0A = r5;
        this.A0C = r7;
        this.A0D = r8;
        this.A0R = r13;
        this.A0P = r4;
        this.A0Q = r10;
        this.A0O = z;
        this.A0J = str;
        this.A0G = r12;
        this.A0S = num;
        AnonymousClass8QF r0 = new AnonymousClass8QF(this);
        this.A09 = r0;
        r6.A06 = r0;
    }

    public static final 1GK A00(AnonymousClass8QA r13) {
        AnonymousClass8QA r2 = r13;
        Bitmap bitmap = (Bitmap) r13.A0M.poll();
        if (bitmap == null) {
            bitmap = ((C353838Jj) r13.A0P.A00.A00()).A01((Bitmap) null, (RectF) null, (B1K) null, 1.0f, 1.0f, -1, false, false, false, true);
            if (bitmap == null) {
                throw new IllegalStateException("Decor bitmap should not be null, otherwise we should have returned early");
            }
        } else {
            bitmap.eraseColor(0);
            ((C353838Jj) r13.A0P.A00.A00()).A01(bitmap, (RectF) null, (B1K) null, 1.0f, 1.0f, -1, false, false, false, true);
        }
        return AEI.A01(r2.A07, bitmap, r2.A08, false).A04(new C40273AYo(bitmap, r2), AnonymousClass6OG.A01);
    }

    public final AnonymousClass34S A03(C370018vh r14, C365798nh r15, AnonymousClass8BE r16, List list, boolean z) {
        C366678pU r1;
        boolean z2;
        C370018vh r5 = r14;
        if (r14 != null) {
            ADR adr = ADR.A00;
            FragmentActivity fragmentActivity = this.A07;
            UserSession userSession = this.A08;
            AnonymousClass81W r0 = ((NineSixteenLayoutConfigImpl) this.A0E).A0K;
            int width = r0.getWidth();
            int height = r0.getHeight();
            0eP A002 = adr.A00(fragmentActivity, userSession, A01(this), r5, this, r16, this.A0J, list, width, height, z);
            r1 = (C366678pU) A002.A00;
            z2 = ((Boolean) A002.A01).booleanValue();
        } else {
            r1 = null;
            z2 = false;
        }
        return new AnonymousClass34S(A06(r1, r15), Boolean.valueOf(z2));
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Object, X.8vz] */
    /* JADX WARNING: type inference failed for: r4v23, types: [com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
        if (r4.A0R != false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01a1, code lost:
        if (r1.A1D != false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01b0, code lost:
        if (X.C14245TsS.A01(r4) == false) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01cc, code lost:
        if (r1.A1D != false) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0277, code lost:
        if ((!r0.isEmpty()) != true) goto L_0x0279;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C366678pU A06(X.C366678pU r37, X.C365798nh r38) {
        /*
            r36 = this;
            r9 = 0
            r0 = r36
            X.7zy r2 = r0.A00
            if (r2 != 0) goto L_0x001f
            X.8BA r1 = r0.A0B
            X.7zy r2 = r1.A09
            r0.A00 = r2
            if (r2 != 0) goto L_0x0015
            X.7zy r2 = r0.A08()
            r0.A00 = r2
        L_0x0015:
            if (r2 != 0) goto L_0x001f
            java.lang.String r1 = "Must be in post-capture, where mPreCaptureMediaEdits should always be non-null"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x001f:
            r6 = r38
            X.8nd r1 = r6.A05
            int r1 = r1.ordinal()
            java.lang.String r3 = "Required value was null."
            r5 = r37
            if (r1 == r9) goto L_0x022a
            r17 = 1
            androidx.fragment.app.FragmentActivity r8 = r0.A07
            com.instagram.common.session.UserSession r7 = r0.A08
            X.82v r1 = new X.82v
            r1.<init>(r7, r8)
            X.2YN r4 = new X.2YN
            r4.<init>(r1, r8)
            java.lang.Class<com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel> r1 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel.class
            X.2YL r1 = r4.A00(r1)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel) r1
            boolean r15 = r1.A0n()
            X.8Kz r13 = r0.A0G
            X.7zv r1 = r6.A03
            if (r1 == 0) goto L_0x02d2
            X.C305756Jk.A00(r8)
            X.82p r3 = r13.A0E
            X.82o r3 = r3.A02
            X.82Y r4 = r3.A01
            boolean r3 = r4.A0S
            if (r3 != 0) goto L_0x0065
            boolean r3 = r4.A0T
            if (r3 != 0) goto L_0x0065
            boolean r3 = r4.A0R
            r10 = 0
            if (r3 == 0) goto L_0x0066
        L_0x0065:
            r10 = 1
        L_0x0066:
            android.view.ViewGroup r3 = r13.A0B
            android.content.Context r3 = r3.getContext()
            X.0qQ.A07(r3)
            com.instagram.common.session.UserSession r11 = r13.A0C
            int r14 = r1.A0K
            int r6 = r1.A08
            int r4 = r1.A09
            if (r10 == 0) goto L_0x021a
            r24 = r14
            r25 = r6
        L_0x007d:
            int r12 = r1.A0K
            int r10 = r1.A08
            int r3 = r1.A09
            float r3 = X.C354188Kz.A01(r13, r12, r10, r3)
            java.lang.String r12 = r1.A0f
            java.lang.String r10 = "front"
            boolean r26 = r10.equals(r12)
            X.C305756Jk.A01(r11)
            r31 = 1065353216(0x3f800000, float:1.0)
            r32 = 0
            java.lang.Integer r29 = X.AnonymousClass05K.A00
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r19 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams
            r28 = r19
            r30 = r29
            r33 = r32
            r34 = r32
            r35 = r9
            r28.<init>(r29, r30, r31, r32, r33, r34, r35)
            java.lang.String r20 = "video"
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r16 = new com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig
            r27 = r9
            r28 = r17
            r29 = r9
            r30 = r17
            r31 = r9
            r18 = r16
            r21 = r14
            r22 = r6
            r23 = r4
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r4 = r16
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r4 = r4.A08
            r4.A01 = r3
            X.82p r11 = r0.A0F
            X.82o r6 = r11.A02
            X.82Y r3 = r6.A01
            r14 = r3
            X.0Tu r10 = X.0Tu.A05
            r3 = 36324243525021604(0x810cb5000b2fa4, double:3.034936098987657E-306)
            boolean r3 = X.182.A06(r10, r7, r3)
            if (r3 == 0) goto L_0x0205
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            float[] r30 = X.C369398uX.A00(r3)
            float[] r31 = X.C369398uX.A00(r3)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel r4 = X.C369408uY.A02(r30, r31, r32, r33, r34, r35)
        L_0x00e8:
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r4 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel) r4
            X.0qQ.A0B(r4, r9)
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r10 = X.AnonymousClass9TB.A01(r4)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain r12 = r10.A02
            float[] r3 = r16.C5o()
            X.C366708pX.A02(r12, r3)
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L_0x011e
            X.0v6 r3 = r1.A0U
            com.instagram.common.util.gradient.BackgroundGradientColors r13 = X.0oY.A00(r3)
            if (r13 == 0) goto L_0x011e
            boolean r3 = r4 instanceof com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.GradientTransformFilter
            if (r3 == 0) goto L_0x01eb
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.GradientTransformFilter r4 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.GradientTransformFilter) r4
            int r3 = r13.A01
            float[] r3 = X.C366558pG.A00(r3)
            r4.A08 = r3
            int r3 = r13.A00
            float[] r3 = X.C366558pG.A00(r3)
            r4.A07 = r3
        L_0x011e:
            X.85o r3 = r0.A0Q
            boolean r3 = r3.A00
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r4 = r0.A0E
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r4 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r4
            X.81W r4 = r4.A0K
            int r28 = r4.getWidth()
            int r29 = r4.getHeight()
            X.4yO r4 = A01(r0)
            java.lang.String r13 = r0.A0J
            r0 = 11
            X.0qQ.A0B(r4, r0)
            X.8pM r18 = X.C366588pL.A01
            X.8pL r12 = r2.A01
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = r1.A0V
            r21 = 0
            if (r0 == 0) goto L_0x0147
            r21 = 1
        L_0x0147:
            r19 = r6
            r20 = r12
            r22 = r9
            r23 = r9
            X.8pL r34 = r18.A00(r19, r20, r21, r22, r23)
            r0 = 0
            if (r37 == 0) goto L_0x01e8
            X.8pR r12 = r5.A01
        L_0x0158:
            com.instagram.music.common.model.MusicOverlayStickerModel r6 = r1.A0V
            X.802 r25 = r14.A02()
            com.instagram.common.gallery.metadata.MediaUploadMetadata r19 = r1.A02()
            r18 = r8
            r20 = r7
            r21 = r4
            r22 = r11
            r23 = r12
            r24 = r2
            r26 = r6
            r27 = r13
            r30 = r17
            X.8pR r31 = X.C366658pS.A00(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r2 = 0
            if (r37 == 0) goto L_0x018b
            X.8pV r11 = r5.A03
            if (r11 == 0) goto L_0x018b
        L_0x017f:
            X.8pU r30 = new X.8pU
            r35 = r9
            r32 = r2
            r33 = r11
            r30.<init>(r31, r32, r33, r34, r35)
            return r30
        L_0x018b:
            X.3QG r4 = X.C366688pV.A0D
            X.8vv r6 = new X.8vv
            r6.<init>(r15)
            r13 = 0
            X.8pT r7 = new X.8pT
            r7.<init>(r9, r0)
            com.instagram.music.common.model.MusicOverlayStickerModel r5 = r1.A0V
            boolean r12 = r1.A1H
            if (r12 == 0) goto L_0x01a3
            boolean r4 = r1.A1D
            r11 = 0
            if (r4 == 0) goto L_0x01a4
        L_0x01a3:
            r11 = 1
        L_0x01a4:
            if (r5 == 0) goto L_0x01b2
            r13 = 1
            com.instagram.api.schemas.MusicProduct r4 = r5.A02
            if (r4 == 0) goto L_0x01b2
            boolean r4 = X.C14245TsS.A01(r4)
            r8 = 1
            if (r4 != 0) goto L_0x01b3
        L_0x01b2:
            r8 = 0
        L_0x01b3:
            X.8vz r5 = new X.8vz
            r5.<init>()
            r4 = r17
            r5.A04 = r4
            r5.A05 = r11
            r5.A00 = r3
            r5.A02 = r13
            r5.A03 = r8
            X.3QG r20 = X.C366688pV.A0D
            if (r12 == 0) goto L_0x01ce
            boolean r1 = r1.A1D
            r21 = 0
            if (r1 == 0) goto L_0x01d0
        L_0x01ce:
            r21 = 1
        L_0x01d0:
            X.3QS r19 = new X.3QS
            r19.<init>()
            X.8pV r11 = new X.8pV
            r12 = r0
            r13 = r16
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r0
            r18 = r10
            r22 = r9
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x017f
        L_0x01e8:
            r12 = r0
            goto L_0x0158
        L_0x01eb:
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel r4 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel) r4
            int r3 = r13.A01
            float[] r12 = X.C369398uX.A00(r3)
            java.lang.String r3 = "u_topColor"
            r4.A03(r3, r12)
            int r3 = r13.A00
            float[] r12 = X.C369398uX.A00(r3)
            java.lang.String r3 = "u_bottomColor"
            r4.A03(r3, r12)
            goto L_0x011e
        L_0x0205:
            r19 = 0
            r24 = 8191(0x1fff, float:1.1478E-41)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.GradientTransformFilter r4 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.GradientTransformFilter
            r20 = r19
            r21 = r32
            r22 = r32
            r23 = r32
            r18 = r4
            r18.<init>(r19, r20, r21, r22, r23, r24)
            goto L_0x00e8
        L_0x021a:
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r3 = r13.A0D
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r3 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r3
            X.81W r3 = r3.A0K
            int r24 = r3.getWidth()
            int r25 = r3.getHeight()
            goto L_0x007d
        L_0x022a:
            androidx.fragment.app.FragmentActivity r10 = r0.A07
            com.instagram.common.session.UserSession r12 = r0.A08
            X.8Cl r1 = r6.A02
            X.82p r14 = r0.A0F
            X.8K4 r4 = r0.A0A
            X.8KK r4 = r4.A0M
            if (r1 == 0) goto L_0x02d8
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r23 = r4.A05(r1)
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r3 = r0.A0E
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r3 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r3
            X.81W r3 = r3.A0K
            int r20 = r3.getWidth()
            int r21 = r3.getHeight()
            X.4yO r13 = A01(r0)
            java.lang.String r8 = r0.A0J
            r3 = 1
            r0 = 3
            X.0qQ.A0B(r14, r0)
            r0 = 9
            X.0qQ.A0B(r13, r0)
            X.8pM r24 = X.C366588pL.A01
            X.82o r4 = r14.A02
            X.8pL r7 = r2.A01
            r6 = 0
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = r1.A0J
            r27 = 0
            if (r0 == 0) goto L_0x0269
            r27 = 1
        L_0x0269:
            java.util.List r0 = r1.A0A()
            if (r0 == 0) goto L_0x0279
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            r28 = 1
            if (r0 == r3) goto L_0x027b
        L_0x0279:
            r28 = 0
        L_0x027b:
            boolean r0 = r1.A0E()
            r29 = 0
            if (r0 != r3) goto L_0x0285
            r29 = 1
        L_0x0285:
            r25 = r4
            r26 = r7
            X.8pL r34 = r24.A00(r25, r26, r27, r28, r29)
            if (r37 == 0) goto L_0x02d0
            X.8pR r3 = r5.A01
        L_0x0291:
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = r1.A0J
            X.82Y r4 = r4.A01
            X.802 r17 = r4.A02()
            com.instagram.common.gallery.metadata.MediaUploadMetadata r11 = r1.A01()
            r15 = r3
            r16 = r2
            r18 = r0
            r19 = r8
            r22 = r9
            X.8pR r31 = X.C366658pS.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            if (r37 == 0) goto L_0x02b1
            X.8lx r2 = r5.A02
        L_0x02ae:
            r11 = 0
            goto L_0x017f
        L_0x02b1:
            X.8pT r0 = new X.8pT
            r0.<init>(r9, r6)
            X.8lx r2 = new X.8lx
            r20 = r2
            r21 = r6
            r22 = r6
            r24 = r0
            r25 = r6
            r26 = r6
            r27 = r6
            r28 = r6
            r29 = r9
            r30 = r9
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            goto L_0x02ae
        L_0x02d0:
            r3 = r6
            goto L_0x0291
        L_0x02d2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x02d8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8QA.A06(X.8pU, X.8nh):X.8pU");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0099, code lost:
        if (r4 == null) goto L_0x0078;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C366678pU A07(X.C365798nh r10) {
        /*
            r9 = this;
            r0 = 0
            X.0qQ.A0B(r10, r0)
            java.lang.String r8 = r10.A06
            X.0qQ.A07(r8)
            X.8QE r0 = r9.A0H
            java.util.HashMap r3 = r0.A00
            boolean r0 = r3.containsKey(r8)
            r7 = 0
            if (r0 == 0) goto L_0x0022
            java.lang.Object r6 = r3.get(r8)
            if (r6 != 0) goto L_0x005c
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0022:
            com.instagram.common.session.UserSession r2 = r9.A08
            X.2jG r0 = new X.2jG
            r0.<init>(r2)
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x009c
            java.lang.Integer r1 = r9.A0S
            if (r1 == 0) goto L_0x009c
            X.8Cl r0 = r10.A02
            if (r0 == 0) goto L_0x009c
            java.lang.String r0 = r0.A06()
            if (r0 == 0) goto L_0x009c
            X.A7x r0 = X.C395099zD.A00(r2)
            int r4 = r1.intValue()
            java.util.List r2 = r0.A03
            int r0 = r2.size()
            if (r0 > r4) goto L_0x0058
            r0 = 2368(0x940, float:3.318E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "Attempting to get index out of bounds mediaEdits"
            X.0wb.A03(r1, r0)
        L_0x0058:
            java.lang.Object r6 = X.00k.A0O(r2, r4)
        L_0x005c:
            X.8pU r6 = (X.C366678pU) r6
        L_0x005e:
            r5 = 1
            if (r6 == 0) goto L_0x0069
            X.8pV r0 = r6.A03
            if (r0 == 0) goto L_0x00b9
            boolean r0 = r6.A00
            if (r0 != 0) goto L_0x00b9
        L_0x0069:
            X.7zv r1 = r10.A03
            if (r1 == 0) goto L_0x00b9
            com.instagram.camera.effect.models.CameraAREffect r4 = r1.A0P
            if (r4 == 0) goto L_0x0097
            boolean r0 = r4.A0H()
            if (r0 != 0) goto L_0x0097
            r4 = r7
        L_0x0078:
            java.util.List r0 = r1.A0u
            if (r0 == 0) goto L_0x00ba
            java.util.Iterator r2 = r0.iterator()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.MutableIterator<com.instagram.camera.effect.models.CameraAREffect>"
            X.0qQ.A0C(r2, r0)
            boolean r0 = r2 instanceof X.C62650uo
            if (r0 == 0) goto L_0x009e
            boolean r0 = r2 instanceof X.AnonymousClass0s4
            if (r0 != 0) goto L_0x009e
            java.lang.String r0 = "kotlin.collections.MutableIterator"
            X.0u4.A06(r2, r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0097:
            r1.A0P = r7
            if (r4 != 0) goto L_0x00ba
            goto L_0x0078
        L_0x009c:
            r6 = r7
            goto L_0x005e
        L_0x009e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00ba
            java.lang.Object r1 = r2.next()
            com.instagram.camera.effect.models.CameraAREffect r1 = (com.instagram.camera.effect.models.CameraAREffect) r1
            if (r1 == 0) goto L_0x009e
            boolean r0 = r1.A0H()
            if (r0 != r5) goto L_0x009e
            if (r4 != 0) goto L_0x00b5
            r4 = r1
        L_0x00b5:
            r2.remove()
            goto L_0x009e
        L_0x00b9:
            r4 = r7
        L_0x00ba:
            if (r6 != 0) goto L_0x00e7
            X.8pU r6 = r9.A06(r7, r10)
            X.0qQ.A0B(r6, r5)
            r3.put(r8, r6)
            com.instagram.common.session.UserSession r3 = r9.A08
            X.8Cl r0 = r10.A02
            if (r0 == 0) goto L_0x00d0
            com.instagram.common.gallery.metadata.MediaUploadMetadata r7 = r0.A01()
        L_0x00d0:
            X.4yO r2 = A01(r9)
            X.82p r0 = r9.A0F
            X.82o r0 = r0.A02
            boolean r1 = r0.A0D()
            X.8pR r0 = r6.A01
            X.8pQ r0 = r0.A02
            if (r0 == 0) goto L_0x00f6
            boolean r0 = r0.A00
        L_0x00e4:
            X.C366698pW.A00(r7, r3, r2, r1, r0)
        L_0x00e7:
            X.8pV r1 = r6.A03
            if (r1 == 0) goto L_0x00f5
            boolean r0 = r6.A00
            if (r0 != 0) goto L_0x00f5
            r6.A00 = r5
            if (r4 == 0) goto L_0x00f5
            r1.A00 = r4
        L_0x00f5:
            return r6
        L_0x00f6:
            r0 = 0
            goto L_0x00e4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8QA.A07(X.8nh):X.8pU");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        if (r6 != null) goto L_0x0056;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(X.C366678pU r14) {
        /*
            r13 = this;
            r11 = 0
            X.0qQ.A0B(r14, r11)
            X.82p r0 = r13.A0F
            X.82o r0 = r0.A02
            X.8nd r0 = r0.A01()
            int r0 = r0.ordinal()
            java.lang.String r2 = "Required value was null."
            r5 = 0
            if (r0 == r11) goto L_0x0104
            r10 = 1
            if (r0 != r10) goto L_0x0147
            X.8MC r9 = r13.A0D
            X.8pV r8 = r14.A03
            if (r8 == 0) goto L_0x0141
            X.8MB r0 = r9.A04
            X.80R r0 = r0.A00
            X.8LU r7 = r0.A0g
            X.3QG r3 = r8.A08
            r3.getClass()
            int r1 = r3.A01
            X.3Q2 r0 = r7.A0D
            if (r0 == 0) goto L_0x0031
            r0.A1i = r3
        L_0x0031:
            X.8Kk r0 = r7.A0A
            if (r0 == 0) goto L_0x0038
            r0.ETV(r1)
        L_0x0038:
            com.instagram.common.session.UserSession r0 = r7.A0c
            boolean r0 = X.C305756Jk.A01(r0)
            if (r0 == 0) goto L_0x0073
            com.instagram.camera.effect.models.CameraAREffect r6 = r8.A00
            if (r6 != 0) goto L_0x0056
            X.87w r12 = r7.A0a
            X.05G r1 = r12.A06
            java.lang.Object r0 = r1.getValue()
            if (r0 == 0) goto L_0x00da
            java.lang.Object r6 = r1.getValue()
            com.instagram.camera.effect.models.CameraAREffect r6 = (com.instagram.camera.effect.models.CameraAREffect) r6
            if (r6 == 0) goto L_0x00db
        L_0x0056:
            X.Amv r0 = new X.Amv
            r0.<init>(r6, r7)
            r7.A0E = r0
        L_0x005d:
            boolean r0 = r7.A0O
            if (r0 == 0) goto L_0x006a
            java.lang.Runnable r0 = r7.A0E
            if (r0 == 0) goto L_0x006a
            r0.run()
            r7.A0E = r5
        L_0x006a:
            X.3Q2 r0 = r7.A0D
            if (r0 == 0) goto L_0x0070
            r0.A10 = r6
        L_0x0070:
            X.AnonymousClass8LU.A06(r6, r7)
        L_0x0073:
            X.8vz r4 = r8.A02
            if (r4 == 0) goto L_0x0097
            X.85o r3 = r9.A03
            boolean r0 = r4.A04
            r3.A09 = r0
            boolean r0 = r4.A05
            r3.A0A = r0
            boolean r0 = r4.A00
            r3.A00 = r0
            boolean r1 = r4.A02
            boolean r0 = r3.A03
            if (r0 == r1) goto L_0x0090
            r3.A03 = r1
            X.C3506485o.A00(r3, r11)
        L_0x0090:
            boolean r0 = r4.A03
            r3.A08 = r0
            X.C3506485o.A00(r3, r11)
        L_0x0097:
            X.8pT r1 = r8.A04
            if (r1 == 0) goto L_0x00c0
            X.8Kz r3 = r9.A05
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x00c0
            X.8or r0 = r3.A04
            if (r0 == 0) goto L_0x00c0
            boolean r0 = r0.A00
            if (r0 != r10) goto L_0x00c0
            java.lang.Object r1 = r1.A00()
            X.0qQ.A07(r1)
            X.8vx r1 = (X.C370178vx) r1
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r0 = r3.A05
            if (r0 == 0) goto L_0x00c0
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r1 = r1.A00
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r0 = r0.A08
            r0.A00(r1)
            X.C354188Kz.A03(r3)
        L_0x00c0:
            X.8vv r1 = r8.A03
            if (r1 == 0) goto L_0x00c9
            X.89Z r0 = r9.A06
            r0.A03(r1)
        L_0x00c9:
            X.88Z r1 = r13.A0I
            X.8pL r0 = r14.A04
            if (r0 == 0) goto L_0x013b
            r1.EIp(r0, r5)
            X.8BA r1 = r13.A0B
            X.8pR r0 = r14.A01
            r1.A0j(r0, r13)
            return
        L_0x00da:
            r6 = r5
        L_0x00db:
            java.util.concurrent.atomic.AtomicBoolean r1 = r12.A00
            boolean r0 = r1.get()
            if (r0 == 0) goto L_0x005d
            X.A3e r4 = new X.A3e
            r4.<init>(r7)
            boolean r0 = r12.A01
            if (r0 == 0) goto L_0x005d
            boolean r0 = r1.get()
            if (r0 == 0) goto L_0x005d
            X.6oS r3 = X.C318116oQ.A00(r12)
            r0 = 14
            X.MGz r1 = new X.MGz
            r1.<init>((java.lang.Object) r4, (java.lang.Object) r12, (X.AnonymousClass4D7) r5, (int) r0)
            X.19B r0 = X.19B.A00
            X.1Eo.A05(r0, r1, r3)
            goto L_0x005d
        L_0x0104:
            X.8K4 r6 = r13.A0A
            X.8lx r4 = r14.A02
            if (r4 == 0) goto L_0x014f
            X.8Kj r3 = r6.A0Z
            if (r3 == 0) goto L_0x012a
            int r1 = r4.A00
            r0 = 1112(0x458, float:1.558E-42)
            if (r1 != r0) goto L_0x0135
            java.util.List r0 = r4.A08
            if (r0 == 0) goto L_0x0135
            int r1 = r0.size()
            r0 = 9
            if (r1 != r0) goto L_0x0135
            r3.A00()
            X.8Kp r1 = r6.A0a
            java.util.List r0 = r4.A08
            r1.A00(r0)
        L_0x012a:
            X.8KK r1 = r6.A0M
            X.8pT r0 = r4.A04
            r0.getClass()
            r1.A08(r0)
            goto L_0x00c9
        L_0x0135:
            int r0 = r4.A00
            r3.ETV(r0)
            goto L_0x012a
        L_0x013b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0141:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0147:
            java.lang.String r1 = "Unknown captured media type"
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x014f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8QA.A0B(X.8pU):void");
    }

    public final void A0C(C366678pU r2, String str) {
        0qQ.A0B(str, 0);
        0qQ.A0B(r2, 1);
        this.A0H.A00.put(str, r2);
    }

    public final boolean A0F(C365798nh r11) {
        C349307zv r4;
        String str;
        C365758nd r0 = r11.A05;
        C365758nd r5 = C365758nd.A07;
        if (!(r0 != r5 || (r4 = r11.A03) == null || (str = r4.A0p) == null || str.length() == 0)) {
            for (C365798nh r7 : this.A0F.A02.A05()) {
                if (r7.A05 == r5 && r7 != r11) {
                    C349307zv r6 = r7.A03;
                    String str2 = null;
                    String str3 = r4.A0p;
                    if (str3 != null) {
                        if (r6 != null) {
                            str2 = r6.A0p;
                        }
                        if (!str3.equals(str2)) {
                            continue;
                        } else {
                            C366688pV r02 = A07(r7).A03;
                            if (r02 != null) {
                                AnonymousClass8PW r03 = r02.A05;
                                if (r03 != null && ((Set) r03.A0M.getValue()).contains(C391429sz.A0P)) {
                                    return true;
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if ((r11 instanceof X.C369948va) == false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C378669Qs AMG(android.content.Context r10, android.graphics.drawable.Drawable r11, X.C310416b1 r12, int r13) {
        /*
            r9 = this;
            r0 = 0
            r4 = r11
            X.0qQ.A0B(r11, r0)
            X.8BA r0 = r9.A0B
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r1 = r0.A1s
            com.instagram.common.session.UserSession r5 = r0.A0v
            boolean r7 = X.C306406Ma.A0A(r11)
            X.82o r0 = r0.A14
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L_0x001c
            boolean r0 = r11 instanceof X.C369948va
            r8 = 1
            if (r0 != 0) goto L_0x001d
        L_0x001c:
            r8 = 0
        L_0x001d:
            r0 = 2
            X.0qQ.A0B(r5, r0)
            X.9Qs r2 = new X.9Qs
            r3 = r10
            r6 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8)
            X.8jG r1 = r1.A0q
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r2.A0C = r1
            X.AEV.A00(r12, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8QA.AMG(android.content.Context, android.graphics.drawable.Drawable, X.6b1, int):X.9Qs");
    }

    public static final C279284yO A01(AnonymousClass8QA r1) {
        C357638Yz r0 = r1.A0F.A02.A01.A0X;
        if (r0 != null) {
            return (C279284yO) r0.A08.A00;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A02(AnonymousClass8QA r5) {
        int ordinal = r5.A0F.A02.A01().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                AnonymousClass8MC r2 = r5.A0D;
                ClipsAudioStore clipsAudioStore = r2.A07.A0K;
                clipsAudioStore.A0C.clear();
                clipsAudioStore.A0S.Epw(0sn.A00);
                AnonymousClass8LU r3 = r2.A04.A00.A0g;
                AnonymousClass3QG r22 = new AnonymousClass3QG();
                int i = r22.A01;
                AnonymousClass3Q2 r0 = r3.A0D;
                if (r0 != null) {
                    r0.A1i = r22;
                }
                C354038Kk r02 = r3.A0A;
                if (r02 != null) {
                    r02.ETV(i);
                }
            } else {
                throw new UnsupportedOperationException("Unknown captured media type");
            }
        }
        r5.A0B.A0k(r5, true);
        r5.A0I.AHb((Void) null);
    }

    public final C366678pU A04() {
        int ordinal = this.A0F.A02.A01().ordinal();
        if (ordinal == 0) {
            return AnonymousClass9U9.A00(this.A0B.A0P(), this.A0A.A0G(), this.A0I.EK0());
        } else if (ordinal == 1) {
            return new C366678pU(this.A0B.A0P(), (C364758lx) null, this.A0D.A00(), this.A0I.EK0(), true);
        } else {
            throw new UnsupportedOperationException("Unknown captured media type");
        }
    }

    public final C366678pU A05() {
        return A07(this.A0F.A02.A00());
    }

    public final C349327zy A08() {
        return new C349327zy(this.A0B.A0P(), this.A0I.EK0(), this.A0R.A00().AN5());
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [java.lang.Object, X.8pP] */
    /* JADX WARNING: type inference failed for: r0v23, types: [java.lang.Object, X.8pQ] */
    /* JADX WARNING: type inference failed for: r1v13, types: [X.50z, java.lang.Object] */
    public final void A0A() {
        C366588pL r16;
        ArrayList arrayList;
        HashMap hashMap;
        ReelMoreOptionsModel reelMoreOptionsModel;
        AnonymousClass802 r34;
        C2802550x r3;
        C366638pQ r0;
        C364758lx r17;
        ReelMoreOptionsModel reelMoreOptionsModel2;
        if (this.A05) {
            this.A05 = false;
            A02(this);
        }
        C366678pU A052 = A05();
        A0B(A052);
        C366588pL r02 = A052.A04;
        C366688pV r65 = null;
        if (r02 != null) {
            CaptureRuleSystemState captureRuleSystemState = r02.A00;
            AnonymousClass89U r14 = captureRuleSystemState.A04;
            C318046oG r70 = captureRuleSystemState.A03;
            boolean z = captureRuleSystemState.A0T;
            boolean z2 = captureRuleSystemState.A0p;
            boolean z3 = captureRuleSystemState.A0I;
            boolean z4 = captureRuleSystemState.A0Z;
            boolean z5 = captureRuleSystemState.A0K;
            boolean z6 = captureRuleSystemState.A08;
            boolean z7 = captureRuleSystemState.A0d;
            boolean z8 = captureRuleSystemState.A0r;
            boolean z9 = captureRuleSystemState.A06;
            int i = captureRuleSystemState.A00;
            boolean z10 = captureRuleSystemState.A0C;
            boolean z11 = captureRuleSystemState.A0A;
            Boolean bool = captureRuleSystemState.A05;
            boolean z12 = captureRuleSystemState.A0B;
            boolean z13 = captureRuleSystemState.A0a;
            boolean z14 = captureRuleSystemState.A0Y;
            boolean z15 = captureRuleSystemState.A0q;
            boolean z16 = captureRuleSystemState.A0F;
            boolean z17 = captureRuleSystemState.A0n;
            boolean z18 = captureRuleSystemState.A0o;
            boolean z19 = captureRuleSystemState.A0s;
            boolean z20 = captureRuleSystemState.A0f;
            boolean z21 = captureRuleSystemState.A0m;
            boolean z22 = captureRuleSystemState.A0k;
            boolean z23 = captureRuleSystemState.A0l;
            boolean z24 = captureRuleSystemState.A0j;
            boolean z25 = captureRuleSystemState.A0D;
            boolean z26 = captureRuleSystemState.A0P;
            boolean z27 = captureRuleSystemState.A0H;
            boolean z28 = captureRuleSystemState.A0c;
            int i2 = captureRuleSystemState.A02;
            boolean z29 = captureRuleSystemState.A0J;
            boolean z30 = captureRuleSystemState.A0t;
            boolean z31 = captureRuleSystemState.A0b;
            boolean z32 = captureRuleSystemState.A09;
            boolean z33 = captureRuleSystemState.A0i;
            boolean z34 = captureRuleSystemState.A0g;
            boolean z35 = captureRuleSystemState.A0h;
            boolean z36 = captureRuleSystemState.A0Q;
            boolean z37 = captureRuleSystemState.A0R;
            boolean z38 = captureRuleSystemState.A07;
            boolean z39 = captureRuleSystemState.A0E;
            boolean z40 = captureRuleSystemState.A0G;
            boolean z41 = captureRuleSystemState.A0X;
            boolean z42 = captureRuleSystemState.A0W;
            boolean z43 = captureRuleSystemState.A0e;
            boolean z44 = captureRuleSystemState.A0V;
            boolean z45 = captureRuleSystemState.A0U;
            boolean z46 = captureRuleSystemState.A0S;
            boolean z47 = captureRuleSystemState.A0O;
            boolean z48 = captureRuleSystemState.A0M;
            boolean z49 = captureRuleSystemState.A0N;
            boolean z50 = captureRuleSystemState.A0L;
            int i3 = captureRuleSystemState.A01;
            0qQ.A0B(r14, 0);
            r16 = new C366588pL(new CaptureRuleSystemState(r70, r14, bool, i, i2, i3, z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16, z17, z18, z19, z20, z21, z22, z23, z24, z25, z26, z27, z28, z29, z30, z31, z32, z33, z34, z35, z36, z37, z38, z39, z40, z41, z42, z43, z44, z45, z46, z47, z48, z49, z50));
        } else {
            r16 = null;
        }
        C366648pR r10 = A052.A01;
        C366608pN r32 = r10.A04;
        List list = r32.A04;
        C366618pO r172 = null;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(list);
        }
        SparseArray sparseArray = r32.A02;
        SparseArray sparseArray2 = new SparseArray();
        C366608pN.A01(sparseArray2, sparseArray);
        Map map = r32.A05;
        if (map == null) {
            hashMap = null;
        } else {
            hashMap = new HashMap(map);
        }
        int i4 = r32.A00;
        C366618pO r2 = r32.A03;
        if (r2 != null) {
            int i5 = r2.A02;
            int i6 = r2.A01;
            int i7 = r2.A00;
            C306576Mr r11 = r2.A03;
            List list2 = r2.A07;
            Integer num = r2.A04;
            List list3 = r2.A08;
            HashMap hashMap2 = r2.A09;
            Integer num2 = r2.A05;
            String str = r2.A06;
            0qQ.A0B(r11, 3);
            0qQ.A0B(list2, 4);
            0qQ.A0B(list3, 6);
            0qQ.A0B(hashMap2, 7);
            0qQ.A0B(str, 9);
            r172 = new C366618pO(r11, num, num2, str, hashMap2, list2, list3, i5, i6, i7);
        }
        C366608pN r18 = new C366608pN(sparseArray2, r172, arrayList, hashMap, i4);
        C354988Od r03 = r10.A01;
        if (r03 != null) {
            C354988Od r9 = new C354988Od(r03.A00);
            AnonymousClass9IE r04 = r10.A00;
            if (r04 == null || (reelMoreOptionsModel2 = (ReelMoreOptionsModel) r04.A00) == null) {
                reelMoreOptionsModel = null;
            } else {
                reelMoreOptionsModel = new AnonymousClass8CB(reelMoreOptionsModel2).A01();
            }
            AnonymousClass9IE r8 = new AnonymousClass9IE((Object) reelMoreOptionsModel, 6);
            C366628pP r12 = r10.A03;
            if (r12 != null) {
                String str2 = r12.A03;
                MusicDataSource musicDataSource = r12.A02;
                MusicDataSource musicDataSource2 = null;
                if (musicDataSource != null) {
                    try {
                        musicDataSource2 = new MusicDataSource(musicDataSource.A00, musicDataSource.A01, musicDataSource.A05, musicDataSource.A04, musicDataSource.A03, musicDataSource.A02);
                    } catch (IllegalStateException unused) {
                    }
                }
                int i8 = r12.A01;
                int i9 = r12.A00;
                ? obj = new Object();
                obj.A03 = str2;
                obj.A02 = musicDataSource2;
                obj.A01 = i8;
                obj.A00 = i9;
                AnonymousClass802 r05 = r10.A05;
                if (r05 != null) {
                    r34 = r05.A05();
                } else {
                    r34 = null;
                }
                C2802550x r1 = r10.A06;
                if (r1 != null) {
                    r3 = new C2802550x(r1.A00);
                    for (C2802650z r06 : r1.A01) {
                        int i10 = r06.A02;
                        int i11 = r06.A00;
                        int i12 = r06.A01;
                        Integer A002 = r06.A00();
                        String str3 = r06.A04;
                        if (str3 != null) {
                            ? obj2 = new Object();
                            obj2.A02 = i10;
                            obj2.A00 = i11;
                            obj2.A01 = i12;
                            obj2.A03 = A002;
                            obj2.A04 = str3;
                            r3.A01.add(obj2);
                        } else {
                            0qQ.A0F("metadataModelJson");
                            throw AnonymousClass00P.createAndThrow();
                        }
                    }
                } else {
                    r3 = null;
                }
                C366638pQ r07 = r10.A02;
                if (r07 != null) {
                    boolean z51 = r07.A00;
                    ? obj3 = new Object();
                    obj3.A00 = z51;
                    r0 = obj3;
                } else {
                    r0 = null;
                }
                C366648pR r28 = new C366648pR(r8, r9, r0, obj, r18, r34, r3);
                C364758lx r08 = A052.A02;
                if (r08 == null) {
                    r17 = null;
                } else {
                    C366668pT r112 = r08.A04;
                    int i13 = r08.A00;
                    CameraAREffect cameraAREffect = r08.A01;
                    FilterGroupModel filterGroupModel = r08.A06;
                    AnonymousClass8PW r5 = r08.A05;
                    r17 = new C364758lx(cameraAREffect, r08.A02, r08.A03, r112, r5, filterGroupModel, r08.A07, r08.A08, i13, r08.A0A);
                }
                C366688pV r113 = A052.A03;
                if (r113 != null) {
                    AnonymousClass3QG r09 = C366688pV.A0D;
                    C366668pT r15 = r113.A04;
                    C370198vz r142 = r113.A02;
                    AnonymousClass3QG r13 = r113.A08;
                    boolean z52 = r113.A0B;
                    CameraAREffect cameraAREffect2 = r113.A00;
                    AnonymousClass8PW r82 = r113.A05;
                    TransformMatrixConfig transformMatrixConfig = r113.A01;
                    boolean z53 = r113.A0C;
                    AnonymousClass3QS r010 = r113.A07;
                    float f = r010.A00;
                    List list4 = r010.A03;
                    boolean z54 = r010.A04;
                    r65 = new C366688pV(cameraAREffect2, transformMatrixConfig, r142, r113.A03, r15, r82, r113.A06, new AnonymousClass3QS(r010.A01, r010.A02, list4, f, z54), r13, z52, z53);
                }
                this.A06 = new C366678pU(r28, r17, r65, r16, A052.A05);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r2.A07() == false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0D(boolean r4) {
        /*
            r3 = this;
            X.82p r0 = r3.A0F
            X.82o r0 = r0.A02
            X.82Y r2 = r0.A01
            java.lang.Integer r1 = r2.A0B
            X.0qQ.A07(r1)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x0017
            X.4yO r0 = A01(r3)
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x0024
        L_0x0017:
            if (r4 == 0) goto L_0x0020
            boolean r1 = r2.A07()
            r0 = 1
            if (r1 != 0) goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            r3.A0E(r0)
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8QA.A0D(boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0059, code lost:
        if (X.182.A06(X.0Tu.A05, r10.A08, 36324372373450799L) == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        if (X.182.A06(X.0Tu.A05, r10.A08, 36324372373319725L) != false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006a, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0037, code lost:
        if (r7.A04.A05 != null) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E(boolean r11) {
        /*
            r10 = this;
            boolean r0 = r10.A03
            if (r0 != 0) goto L_0x0007
            if (r11 != 0) goto L_0x0007
        L_0x0006:
            return
        L_0x0007:
            X.82p r0 = r10.A0F
            X.82o r4 = r0.A02
            X.8nh r0 = r4.A00()
            java.lang.String r6 = r0.A06
            X.0qQ.A07(r6)
            X.8pU r2 = r10.A05()
            X.8pU r3 = r10.A04()
            X.8QE r1 = r10.A0H
            r0 = 1
            X.0qQ.A0B(r3, r0)
            java.util.HashMap r0 = r1.A00
            r0.put(r6, r3)
            X.8pR r7 = r3.A01
            X.8Od r0 = r7.A01
            if (r0 == 0) goto L_0x0139
            X.8Oe r5 = r0.A00
            r9 = 0
            if (r5 != 0) goto L_0x0039
            X.8pN r0 = r7.A04
            java.util.Map r0 = r0.A05
            r8 = 0
            if (r0 == 0) goto L_0x003a
        L_0x0039:
            r8 = 1
        L_0x003a:
            X.8nh r0 = r4.A00()
            X.8nd r1 = r0.A05
            X.8nd r0 = X.C365758nd.A07
            if (r1 != r0) goto L_0x006b
            X.4yO r0 = A01(r10)
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x005b
            com.instagram.common.session.UserSession r4 = r10.A08
            X.0Tu r3 = X.0Tu.A05
            r0 = 36324372373450799(0x810cd30002302f, double:3.035017583253111E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 != 0) goto L_0x006a
        L_0x005b:
            com.instagram.common.session.UserSession r4 = r10.A08
            X.0Tu r3 = X.0Tu.A05
            r0 = 36324372373319725(0x810cd30000302d, double:3.035017583170219E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x006b
        L_0x006a:
            r9 = 1
        L_0x006b:
            if (r8 == 0) goto L_0x008a
            X.8pR r3 = r2.A01
            r1 = 0
            X.8Od r0 = r3.A01
            if (r0 == 0) goto L_0x0076
            X.8Oe r1 = r0.A00
        L_0x0076:
            boolean r0 = X.0qQ.A0K(r5, r1)
            if (r0 == 0) goto L_0x0095
            X.8pN r0 = r7.A04
            java.util.Map r1 = r0.A05
            X.8pN r0 = r3.A04
            java.util.Map r0 = r0.A05
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0095
        L_0x008a:
            X.8pR r0 = r2.A01
            r1 = 0
            if (r5 != 0) goto L_0x00b1
            java.util.Map r0 = r10.A0K
            r0.remove(r6)
            return
        L_0x0095:
            X.8Ji r0 = r10.A0P
            X.81C r0 = r0.A00
            X.81E r0 = r0.A00()
            X.8Jj r0 = (X.C353838Jj) r0
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x008a
            if (r9 != 0) goto L_0x008a
            java.util.Map r1 = r10.A0L
            X.1GK r0 = A00(r10)
            r1.put(r6, r0)
            goto L_0x008a
        L_0x00b1:
            X.8Od r0 = r0.A01
            if (r0 == 0) goto L_0x00b7
            X.8Oe r1 = r0.A00
        L_0x00b7:
            boolean r0 = r5.equals(r1)
            if (r0 != 0) goto L_0x0006
            java.util.Queue r0 = r10.A0M
            java.lang.Object r4 = r0.poll()
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            r0 = 0
            if (r4 != 0) goto L_0x00e7
            X.8BA r0 = r10.A0B
            X.6if r0 = r0.A1c
            java.lang.Object r0 = r0.get()
            X.8O4 r0 = (X.AnonymousClass8O4) r0
            X.A56 r0 = X.AnonymousClass8O4.A00(r0)
            com.instagram.ui.widget.drawing.gl.GLDrawingView r0 = r0.A00
            android.graphics.Bitmap r4 = r0.getBitmap()
        L_0x00dc:
            java.lang.String r7 = "Required value was null."
            if (r4 == 0) goto L_0x0133
            com.instagram.common.session.UserSession r8 = r10.A08
            java.io.File r1 = X.AnonymousClass45F.A00()
            goto L_0x00fe
        L_0x00e7:
            r4.eraseColor(r0)
            X.8BA r0 = r10.A0B
            X.6if r0 = r0.A1c
            java.lang.Object r0 = r0.get()
            X.8O4 r0 = (X.AnonymousClass8O4) r0
            X.A56 r0 = X.AnonymousClass8O4.A00(r0)
            com.instagram.ui.widget.drawing.gl.GLDrawingView r0 = r0.A00
            r0.getBitmap(r4)
            goto L_0x00dc
        L_0x00fe:
            java.lang.String r3 = r1.getCanonicalPath()     // Catch:{ IOException -> 0x0103 }
            goto L_0x0107
        L_0x0103:
            java.lang.String r3 = r1.getAbsolutePath()
        L_0x0107:
            r0 = 2
            X.Ase r2 = new X.Ase
            r2.<init>(r0, r4, r8, r1)
            X.0nO r1 = X.0nY.A00()
            r0 = 637(0x27d, float:8.93E-43)
            X.4dM r1 = X.OX4.A00(r1, r2, r0)
            X.34S r0 = new X.34S
            r0.<init>(r3, r1)
            java.lang.Object r2 = r0.A01
            if (r2 == 0) goto L_0x012d
            X.1GK r2 = (X.1GK) r2
            X.AYq r1 = new X.AYq
            r1.<init>(r4, r10, r5, r6)
            java.util.concurrent.Executor r0 = X.AnonymousClass6OG.A01
            r2.A04(r1, r0)
            return
        L_0x012d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x0133:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x0139:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8QA.A0E(boolean):void");
    }

    public final int Ayz() {
        return this.A0B.A1s.getHeight();
    }

    public final int Az0() {
        return this.A0B.A1s.getWidth();
    }

    public final void DAx() {
        for (AnonymousClass8QD DAx : this.A0N) {
            DAx.DAx();
        }
    }

    public final void DAy() {
        for (AnonymousClass8QD DAy : this.A0N) {
            DAy.DAy();
        }
    }

    public final void DSu() {
        this.A0I.DSt();
    }

    /* JADX WARNING: type inference failed for: r1v37, types: [X.07Z, X.4DH] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x010f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09() {
        /*
            r13 = this;
            X.8pU r0 = r13.A05()
            X.8BA r3 = r13.A0B
            X.8pR r9 = r0.A01
            boolean r0 = r3.A24
            if (r0 == 0) goto L_0x00ae
            X.8C9 r2 = r3.A1D
            X.9IE r0 = r9.A00
            r4 = 0
            r0.getClass()
            java.lang.Object r1 = r0.A00
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r1 = (com.instagram.reels.fragment.model.ReelMoreOptionsModel) r1
            r1.getClass()
            X.8CB r0 = new X.8CB
            r0.<init>(r1)
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r0 = r0.A01()
            r2.A02(r0)
            X.85r r5 = r3.A1E
            X.85s r8 = r5.A05
            boolean r0 = r8.A00
            if (r0 == 0) goto L_0x0032
            r8.E2p()
        L_0x0032:
            X.8Od r0 = r9.A01
            r0.getClass()
            X.8Oe r0 = r0.A00
            if (r0 == 0) goto L_0x004e
            java.util.List r0 = r0.A00
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x004e
            X.6if r0 = r3.A1c
            java.lang.Object r0 = r0.get()
            X.8O4 r0 = (X.AnonymousClass8O4) r0
            X.AnonymousClass8O4.A00(r0)
        L_0x004e:
            X.8Cj r2 = r3.A1C
            X.82o r6 = r3.A14
            X.82Y r7 = r6.A01
            X.8Cl r1 = r7.A03()
            X.05G r0 = r2.A07
            r0.Epw(r1)
            X.8pQ r0 = r9.A02
            X.05G r1 = r2.A09
            if (r0 == 0) goto L_0x0390
            boolean r0 = r0.A00
        L_0x0065:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.Epw(r0)
            X.80U r1 = r3.A1M
            X.80V r0 = X.AnonymousClass80V.MEDIA_EDIT
            boolean r0 = r1.CQ0(r0)
            if (r0 != 0) goto L_0x0082
            X.80V r0 = X.AnonymousClass80V.CLIPS_EDITOR
            boolean r0 = r1.CQ0(r0)
            if (r0 != 0) goto L_0x0082
            boolean r0 = r3.A20
            if (r0 == 0) goto L_0x0085
        L_0x0082:
            r3.A0b()
        L_0x0085:
            java.lang.Integer r0 = r7.A0B
            X.0qQ.A07(r0)
            int r1 = r0.intValue()
            r0 = 1
            if (r1 == r0) goto L_0x00af
            r0 = 2
            if (r1 != r0) goto L_0x00aa
            com.instagram.user.model.User r0 = r7.A0A
            if (r0 == 0) goto L_0x00aa
            X.8nd r1 = r6.A01()
            X.8nd r0 = X.C365758nd.A07
            if (r1 != r0) goto L_0x00aa
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r1 = r3.A1s
            X.Aj9 r0 = new X.Aj9
            r0.<init>(r3)
            X.0nA.A0p(r1, r0)
        L_0x00aa:
            r0 = 0
            X.AnonymousClass8BA.A0G(r3, r0, r0)
        L_0x00ae:
            return
        L_0x00af:
            X.0eK r2 = r3.A1v
            java.lang.Object r11 = r2.get()
            X.8Wi r11 = (X.C357068Wi) r11
            X.80D r12 = r3.A18
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = r12.A1R
            if (r0 == 0) goto L_0x011a
            com.instagram.common.session.UserSession r10 = r3.A0v
            X.0Tu r9 = X.0Tu.A05
            r0 = 36326163374683714(0x810e7400003642, double:3.0361502196445895E-306)
            boolean r0 = X.182.A06(r9, r10, r0)
            if (r0 == 0) goto L_0x011a
            com.instagram.music.common.model.MusicOverlayStickerModel r9 = r12.A1R
            X.8D8 r1 = r11.A0K
            if (r1 == 0) goto L_0x02fc
            boolean r0 = r1 instanceof X.C388079nF
            if (r0 == 0) goto L_0x02d9
            java.util.Map r0 = r1.A06()
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r1 = r0.iterator()
        L_0x00e2:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02f9
            java.lang.Object r10 = r1.next()
            boolean r0 = r10 instanceof X.B3d
            if (r0 == 0) goto L_0x00e2
        L_0x00f0:
            android.graphics.drawable.Drawable r10 = (android.graphics.drawable.Drawable) r10
        L_0x00f2:
            X.B3d r10 = (X.B3d) r10
            X.85q r0 = r8.A06
            int r0 = r0.BV1()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r1 = 0
            X.0qQ.A0B(r9, r1)
            X.A9I r0 = new X.A9I
            r0.<init>(r9)
            r0.A0O = r8
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = r0.A00()
            if (r10 == 0) goto L_0x011a
            r10.DT8(r0)
            android.graphics.drawable.Drawable r10 = (android.graphics.drawable.Drawable) r10
            X.0qQ.A0B(r10, r1)
            X.C3506685r.A00(r10, r5)
        L_0x011a:
            com.instagram.user.model.User r0 = r7.A0A
            if (r0 == 0) goto L_0x0130
            X.8nd r1 = r6.A01()
            X.8nd r0 = X.C365758nd.A07
            if (r1 != r0) goto L_0x0130
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r1 = r3.A1s
            X.Aj9 r0 = new X.Aj9
            r0.<init>(r3)
            X.0nA.A0p(r1, r0)
        L_0x0130:
            X.82a r8 = r7.A0Z
            if (r8 == 0) goto L_0x013e
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r1 = r3.A1s
            X.Amg r0 = new X.Amg
            r0.<init>(r3, r8)
            X.0nA.A0p(r1, r0)
        L_0x013e:
            X.82b r1 = r7.A04
            if (r1 == 0) goto L_0x016b
            com.instagram.common.session.UserSession r0 = r3.A0v
            boolean r0 = X.1NM.A03(r0)
            if (r0 != 0) goto L_0x016b
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r9 = r3.A1s
            X.Amn r0 = new X.Amn
            r0.<init>(r3, r1)
            X.0nA.A0p(r9, r0)
            X.2Fj r8 = r1.A05
            X.4DH r1 = r3.A0s
            X.APZ r0 = new X.APZ
            r0.<init>(r3)
            r8.A06(r1, r0)
            X.846 r0 = r3.A1X
            X.7zw r1 = r0.A00()
            X.8pz r0 = X.C366978pz.A0H
            r1.A01(r9, r9, r0)
        L_0x016b:
            X.82c r8 = r7.A07
            if (r8 == 0) goto L_0x0179
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r1 = r3.A1s
            X.Amr r0 = new X.Amr
            r0.<init>(r3, r8)
            X.0nA.A0p(r1, r0)
        L_0x0179:
            X.82d r8 = r7.A0Y
            if (r8 == 0) goto L_0x0187
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r1 = r3.A1s
            X.Ams r0 = new X.Ams
            r0.<init>(r3, r8)
            X.0nA.A0p(r1, r0)
        L_0x0187:
            X.82f r10 = r7.A0f
            com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel r9 = r7.A0e
            if (r10 == 0) goto L_0x01aa
            com.instagram.common.session.UserSession r11 = r3.A0v
            r0 = 0
            X.0qQ.A0B(r11, r0)
            X.0Tu r8 = X.0Tu.A05
            r0 = 36323225617050631(0x810bc800002c07, double:3.0342923698880273E-306)
            boolean r0 = X.182.A06(r8, r11, r0)
            if (r0 != 0) goto L_0x01aa
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r1 = r3.A1s
            X.Aov r0 = new X.Aov
            r0.<init>(r3, r9, r10)
            X.0nA.A0p(r1, r0)
        L_0x01aa:
            X.82e r8 = r7.A0d
            if (r8 == 0) goto L_0x01b8
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r1 = r3.A1s
            X.Amt r0 = new X.Amt
            r0.<init>(r3, r8)
            X.0nA.A0p(r1, r0)
        L_0x01b8:
            X.1Xj r8 = r3.A0F
            if (r8 == 0) goto L_0x01c8
            r3.A0F = r4
            android.view.View r1 = r3.A0o
            X.Aow r0 = new X.Aow
            r0.<init>(r3, r9, r8)
            r1.post(r0)
        L_0x01c8:
            X.82g r0 = r7.A0c
            if (r0 == 0) goto L_0x01d6
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r1 = r3.A1s
            X.Aj6 r0 = new X.Aj6
            r0.<init>(r3)
            X.0nA.A0p(r1, r0)
        L_0x01d6:
            X.82m r0 = r7.A0a
            if (r0 == 0) goto L_0x01e4
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r1 = r3.A1s
            X.Aj7 r0 = new X.Aj7
            r0.<init>(r3)
            X.0nA.A0p(r1, r0)
        L_0x01e4:
            com.instagram.common.gallery.Medium r8 = r3.A04
            if (r8 == 0) goto L_0x01f8
            r3.A04 = r4
            java.util.HashMap r7 = r3.A0Y
            r3.A0Y = r4
            android.view.View r1 = r3.A0o
            X.Aou r0 = new X.Aou
            r0.<init>(r8, r3, r7)
            r1.post(r0)
        L_0x01f8:
            com.instagram.user.model.Product r7 = r3.A0N
            if (r7 == 0) goto L_0x020a
            r3.A0N = r4
            r3.A0I = r4
            android.view.View r1 = r3.A0o
            X.Amh r0 = new X.Amh
            r0.<init>(r3, r7)
            r1.post(r0)
        L_0x020a:
            com.instagram.shopping.model.collection.ProductCollectionShareInfo r0 = r3.A0L
            if (r0 == 0) goto L_0x0218
            android.view.View r1 = r3.A0o
            X.Aj2 r0 = new X.Aj2
            r0.<init>(r3)
            r1.post(r0)
        L_0x0218:
            com.instagram.shopping.model.share.ShopShareInfo r0 = r3.A0M
            if (r0 == 0) goto L_0x0226
            android.view.View r1 = r3.A0o
            X.Aj3 r0 = new X.Aj3
            r0.<init>(r3)
            r1.post(r0)
        L_0x0226:
            boolean r0 = r3.A0f
            if (r0 == 0) goto L_0x0237
            r0 = 0
            r3.A0f = r0
            android.view.View r1 = r3.A0o
            X.Aj4 r0 = new X.Aj4
            r0.<init>(r3)
            r1.post(r0)
        L_0x0237:
            com.instagram.infocenter.intf.InfoCenterShareInfoIntf r7 = r3.A0H
            if (r7 == 0) goto L_0x0247
            r3.A0H = r4
            android.view.View r1 = r3.A0o
            X.Ami r0 = new X.Ami
            r0.<init>(r3, r7)
            r1.post(r0)
        L_0x0247:
            com.instagram.infocenter.intf.InfoCenterFactShareInfoIntf r7 = r3.A0G
            if (r7 == 0) goto L_0x0257
            r3.A0G = r4
            android.view.View r1 = r3.A0o
            X.Amj r0 = new X.Amj
            r0.<init>(r3, r7)
            r1.post(r0)
        L_0x0257:
            X.A6f r0 = r3.A0A
            if (r0 == 0) goto L_0x0280
            X.1Xj r8 = r0.A03
            boolean r0 = r8.A5v()
            if (r0 == 0) goto L_0x02ce
            com.instagram.common.session.UserSession r9 = r3.A0v
            r0 = 0
            X.0qQ.A0B(r9, r0)
            X.0Tu r7 = X.0Tu.A05
            r0 = 36327748217813667(0x810fe500033aa3, double:3.037152480821623E-306)
            boolean r0 = X.182.A06(r7, r9, r0)
            if (r0 != 0) goto L_0x0280
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r1 = r3.A1s
            X.Amk r0 = new X.Amk
            r0.<init>(r3, r8)
            X.0nA.A0p(r1, r0)
        L_0x0280:
            X.8nh r6 = r6.A00()
            X.8nd r0 = r6.A05
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x02c6
            X.7zv r0 = r6.A03
            r0.getClass()
            com.instagram.music.common.model.MusicOverlayStickerModel r6 = r0.A0V
        L_0x0294:
            if (r6 == 0) goto L_0x033e
            X.6if r0 = r3.A1g
            java.lang.Object r0 = r0.get()
            X.8ME r0 = (X.AnonymousClass8ME) r0
            android.graphics.drawable.Drawable r7 = r0.A11()
            if (r7 == 0) goto L_0x02ff
            com.instagram.api.schemas.MusicProduct r1 = r6.A02
            com.instagram.api.schemas.MusicProduct r0 = com.instagram.api.schemas.MusicProduct.QUESTION_RESPONSE_RESHARE
            if (r1 != r0) goto L_0x02ff
            X.7w8 r7 = (X.C347017w8) r7
            java.lang.Class<X.B3c> r0 = X.B3c.class
            java.util.ArrayList r0 = r7.A06(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x02b6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0339
            java.lang.Object r0 = r1.next()
            X.B3c r0 = (X.B3c) r0
            r0.Edm(r6)
            goto L_0x02b6
        L_0x02c6:
            X.8Cl r0 = r6.A02
            r0.getClass()
            com.instagram.music.common.model.MusicOverlayStickerModel r6 = r0.A0J
            goto L_0x0294
        L_0x02ce:
            android.view.View r1 = r3.A0o
            X.Aml r0 = new X.Aml
            r0.<init>(r3, r8)
            r1.post(r0)
            goto L_0x0280
        L_0x02d9:
            boolean r0 = r1 instanceof X.C388099nH
            if (r0 == 0) goto L_0x02fc
            X.9nH r1 = (X.C388099nH) r1
            java.util.Map r0 = r1.A02
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r1 = r0.iterator()
        L_0x02e9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02f9
            java.lang.Object r10 = r1.next()
            boolean r0 = r10 instanceof X.B3d
            if (r0 == 0) goto L_0x02e9
            goto L_0x00f0
        L_0x02f9:
            r10 = 0
            goto L_0x00f0
        L_0x02fc:
            r10 = 0
            goto L_0x00f2
        L_0x02ff:
            java.lang.Object r0 = r2.get()
            X.8Wi r0 = (X.C357068Wi) r0
            if (r0 == 0) goto L_0x033e
            X.8D8 r1 = r0.A0K
            if (r1 == 0) goto L_0x033e
            boolean r0 = r1 instanceof X.C352598Dz
            if (r0 == 0) goto L_0x033e
            X.8Dz r1 = (X.C352598Dz) r1
            java.util.Map r0 = r1.A01
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r2 = r0.iterator()
        L_0x031b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x038e
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.B3d
            if (r0 == 0) goto L_0x031b
        L_0x0329:
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            if (r1 == 0) goto L_0x033e
            X.B3d r0 = X.C271404in.A09(r1)
            if (r0 == 0) goto L_0x033e
            r0.DT8(r6)
            X.C3506685r.A00(r1, r5)
        L_0x0339:
            X.88Z r0 = r3.A1J
            r0.Cvm()
        L_0x033e:
            X.82j r2 = r3.A0Q
            if (r2 == 0) goto L_0x034e
            r3.A0Q = r4
            android.view.View r1 = r3.A0o
            X.Amm r0 = new X.Amm
            r0.<init>(r3, r2)
            r1.post(r0)
        L_0x034e:
            X.8D5 r2 = r3.A0P
            if (r2 == 0) goto L_0x035e
            r3.A0P = r4
            android.view.View r1 = r3.A0o
            X.Amo r0 = new X.Amo
            r0.<init>(r3, r2)
            r1.post(r0)
        L_0x035e:
            X.8D6 r2 = r3.A0J
            if (r2 == 0) goto L_0x036e
            r3.A0J = r4
            android.view.View r1 = r3.A0o
            X.Amp r0 = new X.Amp
            r0.<init>(r3, r2)
            r1.post(r0)
        L_0x036e:
            X.8D7 r2 = r3.A0K
            if (r2 == 0) goto L_0x037e
            r3.A0K = r4
            android.view.View r1 = r3.A0o
            X.Amq r0 = new X.Amq
            r0.<init>(r3, r2)
            r1.post(r0)
        L_0x037e:
            X.KLG r2 = r3.A08
            if (r2 == 0) goto L_0x00aa
            android.view.View r1 = r3.A0o
            X.Aj5 r0 = new X.Aj5
            r0.<init>(r2)
            r1.post(r0)
            goto L_0x00aa
        L_0x038e:
            r1 = 0
            goto L_0x0329
        L_0x0390:
            r0 = 0
            goto L_0x0065
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8QA.A09():void");
    }
}
