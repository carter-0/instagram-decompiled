package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.8MC  reason: invalid class name */
public final class AnonymousClass8MC {
    public Point A00;
    public final C357638Yz A01;
    public final TargetViewSizeProvider A02;
    public final C3506485o A03;
    public final AnonymousClass8MB A04;
    public final C354188Kz A05;
    public final AnonymousClass89Z A06;
    public final ClipsCreationViewModel A07;
    public final Activity A08;
    public final UserSession A09;
    public final AnonymousClass8BA A0A;
    public final C3499482o A0B;
    public final C354048Kl A0C;
    public final AnonymousClass8L3 A0D;
    public final AnonymousClass8PW A0E = A01();
    public final C2801950r A0F;
    public final C3510287h A0G;

    public AnonymousClass8MC(Activity activity, 28D r12, UserSession userSession, C357638Yz r14, AnonymousClass8BA r15, TargetViewSizeProvider targetViewSizeProvider, C3506485o r17, C3499582p r18, AnonymousClass8MB r19, C354188Kz r20, C354048Kl r21, C2801950r r22, C3510287h r23) {
        0qQ.A0B(activity, 1);
        0qQ.A0B(userSession, 2);
        TargetViewSizeProvider targetViewSizeProvider2 = targetViewSizeProvider;
        0qQ.A0B(targetViewSizeProvider2, 10);
        0qQ.A0B(r12, 11);
        C2801950r r1 = r22;
        0qQ.A0B(r1, 12);
        0qQ.A0B(r14, 13);
        this.A08 = activity;
        this.A09 = userSession;
        this.A03 = r17;
        this.A05 = r20;
        this.A0A = r15;
        this.A0G = r23;
        this.A04 = r19;
        this.A0C = r21;
        this.A02 = targetViewSizeProvider2;
        this.A0F = r1;
        this.A01 = r14;
        C3499582p r8 = r18;
        this.A0B = r8.A02;
        AnonymousClass07g r3 = (AnonymousClass07g) activity;
        FragmentActivity fragmentActivity = (FragmentActivity) activity;
        this.A07 = new 2YN(new C3500182v(userSession, fragmentActivity), r3).A00(ClipsCreationViewModel.class);
        this.A06 = new 2YN(new AnonymousClass8IG(userSession, fragmentActivity), r3).A00(AnonymousClass89Z.class);
        Context applicationContext = activity.getApplicationContext();
        0qQ.A0A(applicationContext);
        this.A0D = new AnonymousClass8L3(applicationContext, r12, userSession, (AnonymousClass4D6) null, targetViewSizeProvider2, r8, (String) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl} */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r6v21, types: [java.lang.Object, X.8vv] */
    /* JADX WARNING: type inference failed for: r15v2, types: [java.lang.Object, X.8vz] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C366688pV A00() {
        /*
            r24 = this;
            r2 = r24
            X.8MB r0 = r2.A04
            X.80R r0 = r0.A00
            X.8LU r1 = r0.A0g
            X.3Q2 r0 = r1.A0D
            r9 = 0
            if (r0 == 0) goto L_0x01dd
            com.instagram.camera.effect.models.CameraAREffect r3 = r0.A10
        L_0x000f:
            r7 = 1
            r6 = 0
            if (r3 == 0) goto L_0x0014
            r6 = 1
        L_0x0014:
            X.8Jb r4 = r1.A0q
            com.instagram.camera.effect.models.CameraAREffect r3 = r4.A00()
            if (r3 != 0) goto L_0x001d
            r7 = 0
        L_0x001d:
            if (r6 == r7) goto L_0x002c
            java.lang.String r5 = "pendingMediaForMetadataOnlyHasArEffect="
            java.lang.String r3 = " videoVideoViewControllerHasArEffect="
            java.lang.String r5 = X.002.A1C(r5, r3, r6, r7)
            java.lang.String r3 = "VideoViewEditsController_invalid_post_capture_ar_effect_setup"
            X.0kD.A07(r3, r5, r9)
        L_0x002c:
            X.8BA r3 = r2.A0A
            r6 = 1
            X.6if r3 = r3.A1g
            java.lang.Object r3 = r3.get()
            X.8ME r3 = (X.AnonymousClass8ME) r3
            java.util.LinkedHashMap r3 = r3.A1A()
            java.util.Set r3 = r3.keySet()
            X.0qQ.A07(r3)
            boolean r3 = X.AnonymousClass9SF.A05(r3)
            r23 = 0
            if (r3 == 0) goto L_0x004c
            r23 = 1
        L_0x004c:
            com.instagram.camera.effect.models.CameraAREffect r3 = r4.A00()
            if (r3 == 0) goto L_0x01c8
            boolean r3 = r3.A0H()
            if (r3 != 0) goto L_0x01c8
        L_0x0058:
            com.instagram.camera.effect.models.CameraAREffect r13 = r4.A00()
        L_0x005c:
            if (r0 == 0) goto L_0x01c5
            com.instagram.camera.effect.models.CameraAREffect r3 = r0.A10
            if (r3 == 0) goto L_0x01b9
            boolean r3 = r3.A0H()
            if (r3 != r6) goto L_0x01b9
            boolean r3 = r0.A59
            if (r3 == 0) goto L_0x01b9
        L_0x006c:
            android.app.Activity r3 = r2.A08
            boolean r5 = X.C305756Jk.A00(r3)
            X.8Kz r4 = r2.A05
            X.8Bd r10 = r4.A08()
            android.graphics.Point r8 = r2.A00
            r20 = 0
            if (r8 == 0) goto L_0x01b3
            int r3 = r8.x
            java.lang.Integer r17 = java.lang.Integer.valueOf(r3)
            int r3 = r8.y
            java.lang.Integer r18 = java.lang.Integer.valueOf(r3)
        L_0x008a:
            r3 = 1
            if (r8 == 0) goto L_0x01ae
            X.8Bd r7 = X.C351968Bd.FIT
            if (r10 != r7) goto L_0x01aa
            r7 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r16 = java.lang.Float.valueOf(r7)
        L_0x0097:
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r3)
        L_0x009b:
            X.8Yz r7 = r2.A01
            X.80m r7 = r7.A08
            java.lang.Object r7 = r7.A00
            boolean r7 = r7 instanceof X.AnonymousClass80O
            if (r7 == 0) goto L_0x01a6
            if (r8 != 0) goto L_0x01a6
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r7 = r2.A02
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r7 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r7
            X.81W r7 = r7.A0K
            int r8 = r7.getWidth()
            java.lang.Integer r19 = java.lang.Integer.valueOf(r8)
            int r7 = r7.getHeight()
            java.lang.Integer r20 = java.lang.Integer.valueOf(r7)
        L_0x00bd:
            X.AD8 r14 = new X.AD8
            r14.<init>(r15, r16, r17, r18, r19, r20)
            X.8Yz r7 = r1.A0d
            boolean r7 = X.C379509Ue.A00(r7)
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r14 = r4.A06(r14, r7, r5, r6)
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r5 = r1.A0C
            if (r5 == 0) goto L_0x0104
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r5 = (com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl) r5
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain r5 = r5.A02
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain r7 = r5.deepCopy()
            if (r14 == 0) goto L_0x00ec
            float[] r6 = r14.C5o()
            java.lang.String r5 = "VideoViewEditsController#saveEdits"
            X.AEQ.A02(r7, r5, r6)
            float[] r6 = r14.C5o()
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r5 = r14.A08
            X.C366708pX.A01(r7, r5, r6)
        L_0x00ec:
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r5 = r1.A0C
            if (r5 == 0) goto L_0x01e0
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r5 = (com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl) r5
            java.lang.Integer r6 = r5.A03
            r19 = -1
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r5 = new com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl
            r15 = r5
            r16 = r7
            r17 = r9
            r18 = r6
            r20 = r3
            r15.<init>(r16, r17, r18, r19, r20)
        L_0x0104:
            X.89Z r7 = r2.A06
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r6 = r7.A04
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r6 = r6.A0K
            X.05G r6 = r6.A0S
            java.lang.Object r12 = r6.getValue()
            java.util.List r12 = (java.util.List) r12
            X.85x r6 = r7.A03
            float r11 = r6.A0E()
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r7 = r6.A01
            X.0Ud r6 = r7.A0W
            java.lang.Object r6 = r6.getValue()
            java.lang.Number r6 = (java.lang.Number) r6
            float r10 = r6.floatValue()
            X.0Ud r6 = r7.A0n
            java.lang.Object r6 = r6.getValue()
            java.lang.Number r6 = (java.lang.Number) r6
            float r9 = r6.floatValue()
            X.0Ud r6 = r7.A0g
            java.lang.Object r6 = r6.getValue()
            java.lang.Number r6 = (java.lang.Number) r6
            float r8 = r6.floatValue()
            X.0Ud r6 = r7.A0i
            java.lang.Object r6 = r6.getValue()
            java.lang.Number r6 = (java.lang.Number) r6
            float r7 = r6.floatValue()
            X.0qQ.A0B(r12, r3)
            X.8vv r6 = new X.8vv
            r6.<init>()
            r6.A05 = r12
            r6.A03 = r11
            r6.A00 = r10
            r6.A04 = r9
            r6.A01 = r8
            r6.A02 = r7
            X.3QG r3 = X.C366688pV.A0D
            X.8pT r17 = r4.A07()
            X.85o r3 = r2.A03
            boolean r9 = r3.A09
            boolean r8 = r3.A0A
            boolean r7 = r3.A00
            boolean r4 = r3.A03
            boolean r3 = r3.A08
            X.8vz r15 = new X.8vz
            r15.<init>()
            r15.A04 = r9
            r15.A05 = r8
            r15.A00 = r7
            r15.A02 = r4
            r15.A03 = r3
            if (r0 == 0) goto L_0x0185
            X.3QG r3 = r0.A1i
            if (r3 != 0) goto L_0x01a3
        L_0x0185:
            X.3QG r3 = new X.3QG
            r3.<init>()
            if (r0 != 0) goto L_0x01a3
            r0 = 0
        L_0x018d:
            X.8PW r18 = r2.A01()
            X.3QS r20 = r1.A0H()
            X.8pV r12 = new X.8pV
            r19 = r5
            r21 = r3
            r22 = r0
            r16 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r12
        L_0x01a3:
            boolean r0 = r0.A5F
            goto L_0x018d
        L_0x01a6:
            r19 = r9
            goto L_0x00bd
        L_0x01aa:
            r16 = r9
            goto L_0x0097
        L_0x01ae:
            r16 = r9
            r15 = r9
            goto L_0x009b
        L_0x01b3:
            r17 = r9
            r18 = r9
            goto L_0x008a
        L_0x01b9:
            com.instagram.camera.effect.models.CameraAREffect r3 = r0.A10
            if (r3 == 0) goto L_0x01c5
            boolean r3 = r3.A0H()
            if (r3 != 0) goto L_0x01c5
            goto L_0x006c
        L_0x01c5:
            r6 = 0
            goto L_0x006c
        L_0x01c8:
            if (r0 == 0) goto L_0x01da
            com.instagram.camera.effect.models.CameraAREffect r3 = r0.A10
            if (r3 == 0) goto L_0x01da
            boolean r3 = r3.A0H()
            if (r3 != r6) goto L_0x01da
            boolean r3 = r0.A59
            if (r3 == 0) goto L_0x01da
            goto L_0x0058
        L_0x01da:
            r13 = r9
            goto L_0x005c
        L_0x01dd:
            r3 = r9
            goto L_0x000f
        L_0x01e0:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8MC.A00():X.8pV");
    }

    public final AnonymousClass8PW A01() {
        boolean z;
        AnonymousClass8BA r3 = this.A0A;
        C3510287h r2 = this.A0G;
        C354048Kl r1 = this.A0C;
        AnonymousClass3Q2 r0 = this.A04.A00.A0g.A0D;
        if (r0 != null) {
            z = r0.A5F;
        } else {
            z = false;
        }
        return AnonymousClass8MD.A00(r3, r1, r2, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (X.182.A06(X.0Tu.A05, r8.A09, 36328761829899849L) != false) goto L_0x0017;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass3Q2 A02() {
        /*
            r8 = this;
            X.50r r1 = r8.A0F
            X.50r r0 = X.C2801950r.FEED_POST
            r4 = 0
            r5 = 0
            if (r1 == r0) goto L_0x0017
            com.instagram.common.session.UserSession r3 = r8.A09
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328761829899849(0x8110d100003e49, double:3.0377934931864126E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x008b
        L_0x0017:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r2 = r8.A07
            X.831 r0 = r2.A0G()
            java.util.List r0 = r0.A01
            int r1 = r0.size()
            r0 = 1
            if (r1 != r0) goto L_0x008b
            X.831 r0 = r2.A0G()
            X.51O r0 = r0.A03(r4)
            boolean r0 = r0 instanceof X.AnonymousClass51M
            if (r0 == 0) goto L_0x008b
            X.82o r0 = r8.A0B
            X.82Y r0 = r0.A01
            X.7zv r3 = r0.A04()
            if (r3 == 0) goto L_0x008b
            com.instagram.common.session.UserSession r2 = r8.A09
            X.8PW r1 = r8.A01()
            X.8pV r0 = r8.A00()
            android.graphics.Point r0 = X.AEJ.A00(r2, r0, r1, r3)
        L_0x004a:
            r8.A00 = r0
            if (r0 != 0) goto L_0x005c
            X.82o r0 = r8.A0B
            X.82Y r0 = r0.A01
            X.7zv r0 = r0.A04()
            if (r0 == 0) goto L_0x005c
            r0.A0B = r4
            r0.A0A = r4
        L_0x005c:
            r8.A00 = r5
            X.8Yz r0 = r8.A01
            boolean r0 = X.C379509Ue.A00(r0)
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x0093
            X.8L3 r2 = r8.A0D
            X.82o r0 = r8.A0B
            X.82Y r0 = r0.A01
            X.7zv r6 = r0.A04()
            if (r6 == 0) goto L_0x008d
            X.8pV r4 = r8.A00()
            X.8BA r0 = r8.A0A
            X.8Cl r0 = r0.A0O
            if (r0 == 0) goto L_0x0089
            java.lang.String r7 = r0.A06()
        L_0x0082:
            android.graphics.Point r3 = r8.A00
            X.3Q2 r0 = r2.A03(r3, r4, r5, r6, r7)
            return r0
        L_0x0089:
            r7 = 0
            goto L_0x0082
        L_0x008b:
            r0 = r5
            goto L_0x004a
        L_0x008d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0093:
            X.8L3 r2 = r8.A0D
            X.82o r0 = r8.A0B
            X.82Y r0 = r0.A01
            X.7zv r6 = r0.A04()
            if (r6 == 0) goto L_0x00b6
            X.8pV r4 = r8.A00()
            X.8BA r0 = r8.A0A
            X.8Cl r0 = r0.A0O
            if (r0 == 0) goto L_0x00b4
            java.lang.String r7 = r0.A06()
        L_0x00ad:
            android.graphics.Point r3 = r8.A00
            X.3Q2 r0 = r2.A03(r3, r4, r5, r6, r7)
            return r0
        L_0x00b4:
            r7 = 0
            goto L_0x00ad
        L_0x00b6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8MC.A02():X.3Q2");
    }
}
