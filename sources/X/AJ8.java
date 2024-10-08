package X;

import android.graphics.drawable.Drawable;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SplitScreenFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.Iterator;
import java.util.Set;

public abstract class AJ8 {
    public static final int A00(CameraAREffect cameraAREffect, UserSession userSession, Set set, double d) {
        int i;
        long j;
        int i2;
        int i3 = (int) d;
        Iterator it = set.iterator();
        boolean z = false;
        while (true) {
            i = 15000;
            if (!it.hasNext()) {
                break;
            }
            Drawable A0Z = AnonymousClass7TE.A0Z(it);
            C321056tV A00 = AnonymousClass9SF.A00(A0Z);
            if (A00 != null) {
                j = A00.AzG();
            } else {
                AnonymousClass5MJ A02 = AnonymousClass9SF.A02(A0Z);
                if (A02 != null) {
                    i2 = A02.getDurationInMs();
                } else {
                    AnonymousClass9X8 A01 = AnonymousClass9SF.A01(A0Z);
                    if (A01 != null) {
                        i2 = A01.A08;
                    } else if (AnonymousClass9SF.A03(A0Z)) {
                        j = LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
                    } else {
                        j = 0;
                    }
                }
                j = (long) i2;
            }
            int i4 = (int) j;
            i3 = Math.max(i3, i4);
            AnonymousClass9X8 A012 = AnonymousClass9SF.A01(A0Z);
            if (A012 != null) {
                i3 = Math.min(A012.A08, Integer.MAX_VALUE);
            }
            if ((A0Z instanceof C369838vP) && i4 > 15000) {
                z = true;
            }
        }
        if (cameraAREffect != null && cameraAREffect.A0K()) {
            i3 = Math.max(i3, 5000);
        }
        if (z) {
            i = 1KU.A00(userSession);
        }
        return Math.min(Integer.MAX_VALUE, Math.min(i3, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        if (X.182.A06(r2, r15, r0) != false) goto L_0x006e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.LinkedHashSet A02(com.instagram.common.session.UserSession r15, java.util.Map r16, boolean r17, boolean r18) {
        /*
            r4 = 1
            r0 = 3
            X.0qQ.A0B(r15, r0)
            r14 = 0
            if (r17 != 0) goto L_0x0205
            if (r18 != 0) goto L_0x0205
            java.util.LinkedHashMap r8 = X.AnonymousClass7TE.A1H()
            java.util.Iterator r6 = X.AnonymousClass7TF.A0u(r16)
        L_0x0012:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00a6
            java.util.Map$Entry r5 = X.AnonymousClass7TE.A1J(r6)
            java.lang.Object r1 = r5.getKey()
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            boolean r0 = r1 instanceof X.C389679q1
            r3 = 1
            if (r0 != 0) goto L_0x0093
            boolean r0 = r1 instanceof X.C389689q2
            if (r0 != 0) goto L_0x0093
            boolean r0 = r1 instanceof X.C347017w8
            if (r0 == 0) goto L_0x0091
            X.7w8 r1 = (X.C347017w8) r1
            android.graphics.drawable.Drawable r2 = r1.A04()
            X.0qQ.A07(r2)
            boolean r0 = r2 instanceof X.C321016tR
            if (r0 == 0) goto L_0x0091
            X.6tR r2 = (X.C321016tR) r2
            X.6oG r1 = r2.A0d
            X.6oG r0 = X.C318046oG.GIF
            if (r1 != r0) goto L_0x0091
            java.lang.String r1 = r2.A0E
            if (r1 != 0) goto L_0x004a
            java.lang.String r1 = r2.A0l
        L_0x004a:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.String r0 = "giphy.com"
            boolean r0 = X.00l.A0d(r1, r0, r4)
            if (r0 != r4) goto L_0x0091
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323229912280081(0x810bc900042c11, double:3.034295086208427E-306)
            boolean r0 = X.182.A06(r2, r15, r0)
            if (r0 != 0) goto L_0x006e
            r0 = 36320992234382340(0x8109c000052404, double:3.03287996969549E-306)
        L_0x0068:
            boolean r0 = X.182.A06(r2, r15, r0)
            if (r0 == 0) goto L_0x0091
        L_0x006e:
            java.lang.Object r1 = r5.getKey()
            if (r3 == 0) goto L_0x007c
            java.lang.Object r0 = r5.getValue()
            r8.put(r1, r0)
            goto L_0x0012
        L_0x007c:
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            boolean r0 = X.AnonymousClass9SF.A04(r1)
            if (r0 != 0) goto L_0x0205
            java.lang.Object r0 = r5.getKey()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            X.9X8 r0 = X.AnonymousClass9SF.A01(r0)
            if (r0 == 0) goto L_0x0012
            return r14
        L_0x0091:
            r3 = 0
            goto L_0x006e
        L_0x0093:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323229912214544(0x810bc900032c10, double:3.034295086166981E-306)
            boolean r0 = X.182.A06(r2, r15, r0)
            if (r0 != 0) goto L_0x006e
            r0 = 36320992234316803(0x8109c000042403, double:3.032879969654044E-306)
            goto L_0x0068
        L_0x00a6:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0205
            java.util.LinkedHashMap r10 = X.AnonymousClass7TE.A1H()
            java.util.Iterator r13 = X.AnonymousClass7TF.A0s(r8)
        L_0x00b4:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x014d
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r13)
            java.lang.Object r5 = r0.getKey()
            android.graphics.drawable.Drawable r5 = (android.graphics.drawable.Drawable) r5
            java.lang.Object r1 = r0.getValue()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r0 = r5 instanceof X.B3e
            if (r0 == 0) goto L_0x0133
            r0 = r5
            X.B3e r0 = (X.B3e) r0
            if (r0 == 0) goto L_0x0205
            java.lang.Object r12 = X.00k.A0A(r1)
            X.5Eq r12 = (X.C282765Eq) r12
            if (r12 == 0) goto L_0x0205
            X.9cA r1 = r0.Bxe()
            float r11 = r12.A0A
            int r0 = X.AnonymousClass7TF.A06(r5)
            float r0 = (float) r0
            float r11 = r11 / r0
            float r6 = r1.A03
            float r6 = r6 * r11
            float r9 = r12.A00
            float r0 = r1.A00
            float r7 = r9 - r0
            float r2 = r12.A01
            float r0 = r1.A01
            float r3 = r2 + r0
            float r0 = r12.A09
            android.graphics.Matrix r1 = X.AnonymousClass7TE.A0U()
            r1.postScale(r11, r11, r9, r2)
            r1.postRotate(r0, r9, r2)
            r0 = 2
            float[] r2 = new float[r0]
            r0 = 0
            r2[r0] = r7
            r2[r4] = r3
            r1.mapPoints(r2)
            r0 = r2[r0]
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            r0 = r2[r4]
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            float r9 = r1.floatValue()
            float r2 = r0.floatValue()
            r0 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r0
            float r3 = r9 - r6
            float r1 = r2 - r6
            float r9 = r9 + r6
        L_0x0129:
            float r2 = r2 + r6
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r3, r1, r9, r2)
            r10.put(r5, r0)
            goto L_0x00b4
        L_0x0133:
            java.lang.Object r1 = X.00k.A0A(r1)
            X.5Eq r1 = (X.C282765Eq) r1
            if (r1 == 0) goto L_0x0205
            float r9 = r1.A00
            float r7 = r1.A0A
            r0 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 / r0
            float r3 = r9 - r7
            float r2 = r1.A01
            float r6 = r1.A02
            float r6 = r6 / r0
            float r1 = r2 - r6
            float r9 = r9 + r7
            goto L_0x0129
        L_0x014d:
            java.util.Iterator r13 = X.AnonymousClass7TF.A0u(r16)
        L_0x0151:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x01cd
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r13)
            java.lang.Object r9 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r7 = X.00k.A0A(r0)
            X.5Eq r7 = (X.C282765Eq) r7
            java.util.Iterator r12 = X.AnonymousClass7TF.A0s(r8)
        L_0x016f:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0151
            java.util.Map$Entry r2 = X.AnonymousClass7TE.A1J(r12)
            java.lang.Object r1 = r2.getKey()
            boolean r0 = X.0qQ.A0K(r9, r1)
            if (r0 != 0) goto L_0x016f
            boolean r0 = r9 instanceof X.B3e
            if (r0 != 0) goto L_0x0191
            java.util.Set r0 = r8.keySet()
            boolean r0 = r0.contains(r9)
            if (r0 != 0) goto L_0x016f
        L_0x0191:
            java.lang.Object r0 = r2.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r0 = X.00k.A0A(r0)
            X.5Eq r0 = (X.C282765Eq) r0
            if (r0 == 0) goto L_0x0205
            java.lang.Object r11 = r10.get(r1)
            android.graphics.RectF r11 = (android.graphics.RectF) r11
            if (r11 == 0) goto L_0x0205
            if (r7 == 0) goto L_0x016f
            int r1 = r7.A0B
            int r0 = r0.A0B
            if (r1 <= r0) goto L_0x016f
            float r6 = r7.A00
            float r5 = r7.A0A
            r1 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r1
            float r3 = r6 - r5
            float r2 = r7.A01
            float r0 = r7.A02
            float r0 = r0 / r1
            float r1 = r2 - r0
            float r6 = r6 + r5
            float r2 = r2 + r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r3, r1, r6, r2)
            boolean r0 = r11.intersect(r0)
            if (r0 == 0) goto L_0x016f
            return r14
        L_0x01cd:
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            java.util.Set r0 = r8.keySet()
            java.util.Iterator r2 = r0.iterator()
        L_0x01da:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0204
            android.graphics.drawable.Drawable r1 = X.AnonymousClass7TE.A0Z(r2)
            boolean r0 = r1 instanceof X.C347017w8
            if (r0 == 0) goto L_0x01ee
            X.7w8 r1 = (X.C347017w8) r1
            android.graphics.drawable.Drawable r1 = r1.A04()
        L_0x01ee:
            X.0qQ.A09(r1)
            boolean r0 = r1 instanceof X.C321046tU
            if (r0 == 0) goto L_0x01da
            X.6tU r1 = (X.C321046tU) r1
            if (r1 == 0) goto L_0x01da
            r1.Ejy(r4)
            X.9sm r0 = r1.Bsf()
            r3.add(r0)
            goto L_0x01da
        L_0x0204:
            return r3
        L_0x0205:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AJ8.A02(com.instagram.common.session.UserSession, java.util.Map, boolean, boolean):java.util.LinkedHashSet");
    }

    public static final boolean A07(UserSession userSession, AnonymousClass3Q2 r7) {
        0Tu r2;
        long j;
        if (r7.A5r) {
            0Tu r22 = 0Tu.A05;
            if (182.A06(r22, userSession, 36323229912214544L) || 182.A06(r22, userSession, 36320992234316803L)) {
                return true;
            }
            return false;
        }
        if (C379909Vu.A07(r7)) {
            for (ADJ adj : r7.A4t) {
                String str = adj.A0K;
                if (0qQ.A0K(str, C391369sm.MUSIC_SOUNDWAVE.A00)) {
                    r2 = 0Tu.A05;
                    if (!182.A06(r2, userSession, 36323229912214544L)) {
                        j = 36320992234316803L;
                    } else {
                        continue;
                    }
                } else if (0qQ.A0K(str, C391369sm.GIPHY.A00)) {
                    r2 = 0Tu.A05;
                    if (!182.A06(r2, userSession, 36323229912280081L)) {
                        j = 36320992234382340L;
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
                if (!Boolean.valueOf(182.A06(r2, userSession, j)).booleanValue()) {
                }
            }
            return true;
        }
        return false;
    }

    public static final void A03(FilterModel filterModel, AnonymousClass3Q2 r4, boolean z) {
        r4.A1K = new C266864aT(filterModel);
        r4.A60 = z;
        if (!z) {
            0kD.A07("PhotoToVideoUtil", "useOcTranscode is false", (Throwable) null);
        }
    }

    public static final void A04(FilterChain filterChain) {
        FilterModel filterModel = (FilterModel) filterChain.A01.get(17);
        if (filterModel != null) {
            SplitScreenFilter splitScreenFilter = (SplitScreenFilter) filterModel;
            FilterModel A00 = splitScreenFilter.A00();
            0qQ.A0C(A00, "null cannot be cast to non-null type com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter");
            ColorFilter colorFilter = (ColorFilter) A00;
            if (!0qQ.A0K(colorFilter.A04, "normal")) {
                float[] fArr = colorFilter.A07;
                float[] fArr2 = colorFilter.A06;
                float f = colorFilter.A00;
                boolean z = colorFilter.A01;
                boolean z2 = colorFilter.A02;
                Integer num = AnonymousClass05K.A00;
                ColorFilter colorFilter2 = new ColorFilter(new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false), "normal", fArr, fArr2, f, z, z2, true);
                splitScreenFilter.A00 = 1.0f;
                splitScreenFilter.A01 = colorFilter2;
                splitScreenFilter.A02 = colorFilter2;
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        if (X.0qQ.A0K(r1, "multi_color_gradient_v2") != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain r9) {
        /*
            r4 = 8
            android.util.SparseArray r6 = r9.A01
            java.lang.Object r5 = r6.get(r4)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r5 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel) r5
            r3 = 0
            if (r5 == 0) goto L_0x0065
            java.lang.String r1 = r5.getFilterName()
        L_0x0011:
            java.lang.String r0 = "multi_color_gradient"
            boolean r0 = X.0qQ.A0K(r1, r0)
            java.lang.String r2 = "Required value was null."
            if (r0 != 0) goto L_0x0029
            if (r5 == 0) goto L_0x0063
            java.lang.String r1 = r5.getFilterName()
        L_0x0021:
            java.lang.String r0 = "multi_color_gradient_v2"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0037
        L_0x0029:
            r0 = 17
            java.lang.Object r1 = r6.get(r0)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r1 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel) r1
            if (r1 == 0) goto L_0x0072
            r0 = 1
            r1.setEnabled(r0)
        L_0x0037:
            r0 = 17
            java.lang.Object r0 = r6.get(r0)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r0 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel) r0
            if (r0 == 0) goto L_0x006d
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x0067
            r9.A01(r3, r4)
            A04(r9)
            float[] r0 = A09()
            r8 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r1 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams
            r3 = r2
            r6 = r5
            r7 = r5
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            X.C366708pX.A01(r9, r1, r0)
            return
        L_0x0063:
            r1 = r3
            goto L_0x0021
        L_0x0065:
            r1 = r3
            goto L_0x0011
        L_0x0067:
            X.AvG r0 = new X.AvG
            r0.<init>()
            throw r0
        L_0x006d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x0072:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AJ8.A05(com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain):void");
    }

    public static final void A06(TransformMatrixConfig transformMatrixConfig, L83 l83, AnonymousClass3Q2 r6, C352218Cl r7, int i) {
        C59794JYn jYn = new C59794JYn(r6);
        AnonymousClass3QG r0 = new AnonymousClass3QG();
        r0.A01 = i;
        AnonymousClass3Q2 r3 = jYn.A01;
        r3.A1i = r0;
        if (transformMatrixConfig != null) {
            r6.A16 = transformMatrixConfig;
        }
        BackgroundGradientColors A00 = 0oY.A00(r7.A0I);
        if (A00 != null) {
            BackgroundGradientColors backgroundGradientColors = new BackgroundGradientColors(A00.A01, A00.A00);
            int i2 = r7.A07;
            if (i2 == 180 || i2 == 270) {
                int i3 = backgroundGradientColors.A01;
                backgroundGradientColors.A01 = backgroundGradientColors.A00;
                backgroundGradientColors.A00 = i3;
            }
            r6.A14 = backgroundGradientColors;
        }
        ClipInfo clipInfo = new ClipInfo((String) null, 16777215);
        int i4 = l83.A01;
        int i5 = l83.A00;
        clipInfo.A09 = i4;
        clipInfo.A06 = i5;
        clipInfo.A00 = ((float) i4) / ((float) i5);
        r3.A1N = clipInfo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0079, code lost:
        if (X.0qQ.A0K(r1, X.AnonymousClass6KJ.MUSIC_OVERLAY_SIMPLE.A02) != false) goto L_0x007b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A08(com.instagram.common.session.UserSession r5, X.AnonymousClass3Q2 r6) {
        /*
            X.1iA r1 = r6.A1G
            X.1iA r0 = X.1iA.A0Q
            r4 = 0
            if (r1 != r0) goto L_0x002a
            com.instagram.camera.effect.models.CameraAREffect r0 = r6.A10
            if (r0 != 0) goto L_0x002a
            java.util.EnumSet r0 = com.instagram.pendingmedia.model.constants.ShareType.A02
            boolean r0 = r6.A15(r0)
            if (r0 == 0) goto L_0x002a
            boolean r0 = r6.A5q
            if (r0 == 0) goto L_0x002b
            java.util.List r0 = r6.A4P
            if (r0 != 0) goto L_0x002b
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323225617116168(0x810bc800012c08, double:3.034292369929473E-306)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r2, r5, r0)
        L_0x0026:
            boolean r4 = r0.booleanValue()
        L_0x002a:
            return r4
        L_0x002b:
            boolean r0 = r6.A57
            if (r0 != 0) goto L_0x0056
            java.util.List r1 = r6.A4b
            X.3WT r0 = X.AnonymousClass3WT.MUSIC_OVERLAY
            X.3ui r0 = X.AnonymousClass497.A00(r0, r1)
            if (r0 == 0) goto L_0x0054
            java.lang.String r1 = r0.A1g
        L_0x003b:
            X.6KJ r0 = X.AnonymousClass6KJ.MUSIC_ONLY
            java.lang.String r0 = r0.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0056
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323229912083471(0x810bc900012c0f, double:3.03429508608409E-306)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r2, r5, r0)
            X.0qQ.A0A(r0)
            goto L_0x0026
        L_0x0054:
            r1 = 0
            goto L_0x003b
        L_0x0056:
            java.util.List r1 = r6.A4b
            X.3WT r0 = X.AnonymousClass3WT.MUSIC_OVERLAY
            X.3ui r3 = X.AnonymousClass497.A00(r0, r1)
            r1 = 0
            if (r3 == 0) goto L_0x0099
            java.lang.String r2 = r3.A1g
        L_0x0063:
            X.6KJ r0 = X.AnonymousClass6KJ.MUSIC_OVERLAY_ALBUM_ART
            java.lang.String r0 = r0.A02
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 != 0) goto L_0x007b
            if (r3 == 0) goto L_0x0071
            java.lang.String r1 = r3.A1g
        L_0x0071:
            X.6KJ r0 = X.AnonymousClass6KJ.MUSIC_OVERLAY_SIMPLE
            java.lang.String r0 = r0.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x009b
        L_0x007b:
            boolean r0 = r6.A57
            if (r0 != 0) goto L_0x009b
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323229912017934(0x810bc900002c0e, double:3.034295086042644E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 != 0) goto L_0x0097
            r0 = 36320992234251266(0x8109c000032402, double:3.032879969612598E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x002a
        L_0x0097:
            r4 = 1
            return r4
        L_0x0099:
            r2 = r1
            goto L_0x0063
        L_0x009b:
            boolean r0 = X.C379909Vu.A07(r6)
            if (r0 == 0) goto L_0x002a
            boolean r4 = A07(r5, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AJ8.A08(com.instagram.common.session.UserSession, X.3Q2):boolean");
    }

    public static final float[] A09() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static final int A01(AnonymousClass3Q2 r4) {
        Integer num;
        if (C379909Vu.A05(r4) || C379909Vu.A06(r4)) {
            ClipInfo clipInfo = r4.A1N;
            return clipInfo.A05 - clipInfo.A07;
        }
        int i = r4.A0F;
        MusicOverlayStickerModel A02 = C59923Jbm.A00.A02(r4.A4b);
        if (A02 != null) {
            num = A02.A0O;
        } else {
            num = null;
        }
        boolean A1V = AnonymousClass7TF.A1V(r4.A10);
        boolean A0m = r4.A0m();
        int i2 = i;
        if (num != null) {
            i = num.intValue();
        }
        if (A0m) {
            return i2;
        }
        if (A1V) {
            return Math.max(i, 5000);
        }
        return i;
    }
}
