package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.textureview.MultiListenerTextureView;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* renamed from: X.8L1  reason: invalid class name */
public final class AnonymousClass8L1 {
    public boolean A00;
    public final Context A01;
    public final UserSession A02;
    public final MultiListenerTextureView A03;
    public final C353828Ji A04;
    public final C3499582p A05;
    public final C3499482o A06;
    public final AnonymousClass8L3 A07;
    public final C353918Jw A08;
    public final C314676if A09;
    public final AnonymousClass8KX A0A;
    public final String A0B;
    public final Handler A0C = new Handler(C64021Cb.A00());
    public final TargetViewSizeProvider A0D;
    public final AnonymousClass80U A0E;
    public final AnonymousClass846 A0F;
    public final boolean A0G;

    public AnonymousClass8L1(Context context, 28D r10, UserSession userSession, MultiListenerTextureView multiListenerTextureView, C353828Ji r13, TargetViewSizeProvider targetViewSizeProvider, C3499582p r15, AnonymousClass80U r16, AnonymousClass846 r17, C353918Jw r18, C314676if r19, AnonymousClass8KX r20, String str, String str2, boolean z) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(context, 2);
        0qQ.A0B(multiListenerTextureView, 7);
        0qQ.A0B(r10, 12);
        0qQ.A0B(targetViewSizeProvider, 14);
        AnonymousClass8KX r1 = r20;
        0qQ.A0B(r1, 15);
        this.A02 = userSession;
        this.A01 = context;
        this.A05 = r15;
        this.A08 = r18;
        this.A0F = r17;
        this.A0E = r16;
        this.A03 = multiListenerTextureView;
        this.A04 = r13;
        this.A09 = r19;
        this.A0B = str;
        this.A0G = z;
        this.A0D = targetViewSizeProvider;
        this.A0A = r1;
        Context applicationContext = context.getApplicationContext();
        0qQ.A0A(applicationContext);
        this.A07 = new AnonymousClass8L3(applicationContext, r10, userSession, (AnonymousClass4D6) null, targetViewSizeProvider, r15, str2);
        this.A06 = r15.A02;
    }

    public static final C349307zv A01(AnonymousClass8L1 r7, AnonymousClass8PW r8) {
        if (r8 != null) {
            boolean A042 = A04(r8);
            boolean A032 = A03(r8);
            AnonymousClass9X8 A002 = A00(r8);
            if ((A042 || A032) && A002 != null) {
                C349307zv r0 = new C349307zv(A002.A0B, A002.getIntrinsicWidth(), A002.getIntrinsicHeight(), 0);
                int i = 4;
                if (A032) {
                    i = 5;
                }
                r0.A0F = i;
                r0.A1C = A042;
                return r0;
            }
        }
        return r7.A06.A01.A04();
    }

    public static final AnonymousClass9X8 A00(AnonymousClass8PW r3) {
        Drawable drawable;
        Set keySet;
        Object obj;
        LinkedHashMap linkedHashMap = r3.A09;
        if (linkedHashMap == null || (keySet = linkedHashMap.keySet()) == null) {
            drawable = null;
        } else {
            Iterator it = keySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (obj instanceof AnonymousClass9X8) {
                    break;
                }
            }
            drawable = (Drawable) obj;
        }
        if (drawable instanceof AnonymousClass9X8) {
            return (AnonymousClass9X8) drawable;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r2v13, types: [com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.AnonymousClass8L1 r22, X.C366688pV r23) {
        /*
            r0 = r23
            X.8PW r2 = r0.A05
            r1 = 0
            if (r2 == 0) goto L_0x0155
            X.9X8 r6 = A00(r2)
            if (r6 == 0) goto L_0x0155
            X.8PW r2 = r0.A05
            if (r2 == 0) goto L_0x0018
            java.util.LinkedHashMap r2 = r2.A09
            if (r2 == 0) goto L_0x0018
            r2.remove(r6)
        L_0x0018:
            X.9Hy r2 = r6.A03
            float r12 = r2.A02
            r4 = r22
            com.instagram.common.session.UserSession r7 = r4.A02
            r13 = 0
            X.0Tu r5 = X.0Tu.A05
            r2 = 36324243525021604(0x810cb5000b2fa4, double:3.034936098987657E-306)
            boolean r3 = X.182.A06(r5, r7, r2)
            int r2 = r6.getIntrinsicHeight()
            if (r3 == 0) goto L_0x0194
            float r11 = (float) r2
            int r2 = r6.getIntrinsicWidth()
            float r10 = (float) r2
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            float[] r8 = X.C369398uX.A00(r2)
            float[] r9 = X.C369398uX.A00(r2)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel r2 = X.C369408uY.A02(r8, r9, r10, r11, r12, r13)
        L_0x0046:
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r2 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel) r2
            X.82p r3 = r4.A05
            X.82o r3 = r3.A02
            X.82Y r3 = r3.A01
            X.8Cl r3 = r3.A03()
            r7 = 1
            if (r3 == 0) goto L_0x0084
            X.0v6 r3 = r3.A0I
            if (r3 == 0) goto L_0x0084
            java.util.List r9 = r3.A02
            if (r9 == 0) goto L_0x0084
            boolean r3 = r2 instanceof com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.GradientTransformFilter
            if (r3 == 0) goto L_0x0164
            r5 = r2
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.GradientTransformFilter r5 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.GradientTransformFilter) r5
            java.lang.Object r3 = r9.get(r13)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            float[] r3 = X.C366558pG.A00(r3)
            r5.A08 = r3
            java.lang.Object r3 = r9.get(r7)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            float[] r3 = X.C366558pG.A00(r3)
            r5.A07 = r3
        L_0x0084:
            X.0qQ.A0B(r2, r13)
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r3 = X.AnonymousClass9TB.A01(r2)
            r0.A06 = r3
            X.8PW r3 = r0.A05
            if (r3 == 0) goto L_0x0161
            java.util.LinkedHashMap r3 = r3.A09
            if (r3 == 0) goto L_0x0161
            java.util.Set r3 = r3.keySet()
            if (r3 == 0) goto L_0x0161
            java.util.Iterator r8 = r3.iterator()
        L_0x009f:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x015e
            java.lang.Object r5 = r8.next()
            boolean r3 = r5 instanceof X.C369838vP
            if (r3 != 0) goto L_0x00b1
            boolean r3 = r5 instanceof X.C386059jz
            if (r3 == 0) goto L_0x009f
        L_0x00b1:
            X.8PW r3 = r0.A05
            if (r3 == 0) goto L_0x00bf
            java.util.Map r3 = r3.A0K
            if (r3 == 0) goto L_0x00bf
            java.lang.Object r1 = r3.get(r5)
            X.8un r1 = (X.C369458un) r1
        L_0x00bf:
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r3 = r4.A0D
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r3 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r3
            X.81W r3 = r3.A0K
            int r14 = r3.getWidth()
            int r15 = r3.getHeight()
            if (r1 == 0) goto L_0x0156
            float r5 = r1.A05
            float r4 = r1.A06
            float r3 = r1.A01
            float r1 = r1.A02
        L_0x00d7:
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r8 = r0.A06
            if (r8 == 0) goto L_0x00ef
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r8 = (com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl) r8
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain r8 = r8.A02
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r9 = r8.A03
            r9.A00 = r5
            r9.A01 = r4
            float r8 = (float) r14
            float r8 = r3 / r8
            r9.A02 = r8
            float r8 = (float) r15
            float r8 = r1 / r8
            r9.A03 = r8
        L_0x00ef:
            int r11 = r6.getIntrinsicWidth()
            int r12 = r6.getIntrinsicHeight()
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = 0
            java.lang.Integer r17 = X.AnonymousClass05K.A00
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r9 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams
            r16 = r9
            r18 = r17
            r21 = r20
            r22 = r20
            r23 = r13
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            java.lang.String r10 = "VideoSendingController"
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r8 = new com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig
            r16 = r13
            r17 = r13
            r19 = r13
            r20 = r7
            r21 = r13
            r18 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r6 = r8.A08
            r6.A01 = r4
            r6.A00 = r5
            r8.A04(r3)
            r8.A05(r1)
            r8.A03()
            float[] r7 = r8.C5o()
            float[] r6 = r2.getTextureTransform()
            r2 = 16
            X.0Yw.A0S(r7, r6, r2)
            X.8pT r0 = r0.A04
            if (r0 == 0) goto L_0x0155
            java.lang.Object r0 = r0.A00()
            X.8vx r0 = (X.C370178vx) r0
            if (r0 == 0) goto L_0x0155
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r2 = r0.A00
            r2.A00 = r5
            r2.A01 = r4
            float r0 = (float) r14
            float r3 = r3 / r0
            r2.A02 = r3
            float r0 = (float) r15
            float r1 = r1 / r0
            r2.A03 = r1
        L_0x0155:
            return
        L_0x0156:
            r5 = 0
            r4 = 1060320051(0x3f333333, float:0.7)
            r3 = 0
            r1 = 0
            goto L_0x00d7
        L_0x015e:
            r5 = r1
            goto L_0x00b1
        L_0x0161:
            r5 = r1
            goto L_0x00b1
        L_0x0164:
            java.lang.String r3 = "null cannot be cast to non-null type com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel"
            X.0qQ.A0C(r2, r3)
            r8 = r2
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel r8 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel) r8
            java.lang.Object r3 = r9.get(r13)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            float[] r5 = X.C369398uX.A00(r3)
            java.lang.String r3 = "u_topColor"
            r8.A03(r3, r5)
            java.lang.Object r3 = r9.get(r7)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            float[] r5 = X.C369398uX.A00(r3)
            java.lang.String r3 = "u_bottomColor"
            r8.A03(r3, r5)
            goto L_0x0084
        L_0x0194:
            float r5 = (float) r2
            int r2 = r6.getIntrinsicWidth()
            float r3 = (float) r2
            r20 = 8079(0x1f8f, float:1.1321E-41)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.GradientTransformFilter r2 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.GradientTransformFilter
            r14 = r2
            r15 = r1
            r16 = r1
            r17 = r3
            r18 = r5
            r19 = r12
            r14.<init>(r15, r16, r17, r18, r19, r20)
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8L1.A02(X.8L1, X.8pV):void");
    }

    public static final boolean A03(AnonymousClass8PW r2) {
        Set keySet;
        LinkedHashMap linkedHashMap = r2.A09;
        if (linkedHashMap != null && (keySet = linkedHashMap.keySet()) != null) {
            Iterator it = keySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next instanceof C386059jz) {
                    if (next == null) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A04(AnonymousClass8PW r2) {
        Set keySet;
        LinkedHashMap linkedHashMap = r2.A09;
        if (linkedHashMap != null && (keySet = linkedHashMap.keySet()) != null) {
            Iterator it = keySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next instanceof C369838vP) {
                    if (next == null) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void A05(Bitmap bitmap, AnonymousClass0iw r16, IngestSessionShim ingestSessionShim, C39651A3r a3r, C39892ADt aDt, Integer num, boolean z) {
        C39651A3r a3r2 = a3r;
        Integer num2 = num;
        0qQ.A0B(num2, 4);
        1Av A002 = 1Au.A00(this.A02);
        A002.A4t.Epx(A002, true, 1Av.A8a[127]);
        this.A0F.A00().A00();
        C353918Jw r3 = this.A08;
        if (a3r == null) {
            IngestSessionShim ingestSessionShim2 = ingestSessionShim;
            if (ingestSessionShim != null) {
                a3r2 = new C39651A3r((String) ingestSessionShim2.A00.get(0));
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        C39892ADt aDt2 = aDt;
        r3.A03(r16, a3r2, aDt2, num2, AnonymousClass0eN.A01(new AnonymousClass9MR(2, aDt2, this, num2, bitmap)), z, this.A0G);
        if (z) {
            this.A0E.E3H(new Object());
        }
    }

    public final void A06(AnonymousClass0iw r35, C366688pV r36, LD4 ld4, AnonymousClass8PW r38, C381539bv r39, FilterGroupModel filterGroupModel, DirectCameraViewModel directCameraViewModel, C381779cJ r42, L8M l8m, AnonymousClass8VT r44, Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5, List list, List list2, int i, boolean z, boolean z2, boolean z3) {
        String str6;
        1GK r10;
        String str7 = str5;
        if (str5 == null) {
            str7 = HZX.A00();
        }
        this.A00 = true;
        C366688pV r12 = r36;
        C349307zv A012 = A01(this, r12.A05);
        if (A012 == null) {
            this.A0A.A01.A02(str7, "Captured video is null");
            return;
        }
        AnonymousClass8PW r14 = r38;
        if (A04(r14) || A03(r14)) {
            A02(this, r12);
        }
        A012.A0V = A012.A0V;
        AnonymousClass9I6 r15 = new AnonymousClass9I6(0, 0, 7, 0, false);
        if (A012.A1G && A012.A07 > 60000) {
            A012.A0H = A012.A0J;
            A012.A06 = A012.A0I;
        }
        if (i == 2) {
            str6 = "share_sheet";
        } else {
            str6 = "post_capture";
        }
        Bitmap A022 = ((C353838Jj) this.A04.A00.A00()).A02(true);
        if (z) {
            UserSession userSession = this.A02;
            Context context = this.A01;
            Bitmap A023 = ((C353838Jj) this.A09.get()).A02(true);
            AnonymousClass7TG.A1N(userSession, context);
            if (A023 != null) {
                r10 = AEI.A01(context, A023, userSession, false);
                AnonymousClass8VT r20 = r44;
                L8M l8m2 = l8m;
                C381779cJ r18 = r42;
                DirectCameraViewModel directCameraViewModel2 = directCameraViewModel;
                FilterGroupModel filterGroupModel2 = filterGroupModel;
                C381539bv r152 = r39;
                LD4 ld42 = ld4;
                List list3 = list2;
                List list4 = list;
                String str8 = str4;
                String str9 = str3;
                String str10 = str2;
                AnonymousClass0iw r9 = r35;
                C349307zv r21 = A012;
                String str11 = str7;
                this.A0C.post(new Ar8(A022, r15, r9, r10, this, r12, ld42, r14, r152, filterGroupModel2, directCameraViewModel2, r18, l8m2, r20, r21, bool, num, str, str6, str10, str9, str8, str11, list4, list3, z2, z3));
            }
        }
        r10 = null;
        AnonymousClass8VT r202 = r44;
        L8M l8m22 = l8m;
        C381779cJ r182 = r42;
        DirectCameraViewModel directCameraViewModel22 = directCameraViewModel;
        FilterGroupModel filterGroupModel22 = filterGroupModel;
        C381539bv r1522 = r39;
        LD4 ld422 = ld4;
        List list32 = list2;
        List list42 = list;
        String str82 = str4;
        String str92 = str3;
        String str102 = str2;
        AnonymousClass0iw r92 = r35;
        C349307zv r212 = A012;
        String str112 = str7;
        this.A0C.post(new Ar8(A022, r15, r92, r10, this, r12, ld422, r14, r1522, filterGroupModel22, directCameraViewModel22, r182, l8m22, r202, r212, bool, num, str, str6, str102, str92, str82, str112, list42, list32, z2, z3));
    }
}
