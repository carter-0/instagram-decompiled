package X;

import android.graphics.PointF;
import android.graphics.Rect;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterGroup;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SplitScreenFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.tiltshift.TiltShiftFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.tiltshift.TiltShiftOverlayFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import com.instagram.common.session.UserSession;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* renamed from: X.8mK  reason: invalid class name and case insensitive filesystem */
public abstract class C364978mK {
    public static boolean A05(FilterGroupModel filterGroupModel) {
        TiltShiftFilter tiltShiftFilter;
        if (filterGroupModel == null) {
            0qQ.A0B("filterGroupModel is null", 1);
            0kD.A0C("FilterGroupUtil_hasUserChanges", "filterGroupModel is null", (Throwable) null);
        } else {
            if (!filterGroupModel.CTc(9) && ((tiltShiftFilter = (TiltShiftFilter) filterGroupModel.B5u(19)) == null || tiltShiftFilter.A05 == AnonymousClass05K.A00)) {
                SurfaceCropFilter A00 = C395019z4.A00(filterGroupModel, "FilterGroupUtil_hasUserChanges()");
                if (A00 != null) {
                    SurfaceCropFilterModel.FullTransform fullTransform = A00.A00.A06;
                    if (!(fullTransform.A03 == 0.0f && fullTransform.A04 == 0.0f && fullTransform.A05 == 0.0f)) {
                        return true;
                    }
                }
                if (!LPU.A01(filterGroupModel.B5u(13)) && !LPU.A00(filterGroupModel.B5u(13))) {
                    PhotoFilter A002 = C394999z2.A00(filterGroupModel, "FilterGroupUtil_hasUserChanges()");
                    return (A002 == null || A002.A08 == 0 || ((int) (A002.A03.A00 * 100.0f)) == 0) ? false : true;
                }
            }
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0071, code lost:
        if (X.0qQ.A0K(r2, r0) == false) goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A06(com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r8, com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r9) {
        /*
            r7 = 0
            if (r9 != 0) goto L_0x0010
            java.lang.String r2 = "FilterGroupUtil"
            java.lang.String r1 = "Tried to compare filter group with null other filter group."
            r0 = 1
            X.0qQ.A0B(r1, r0)
            r0 = 0
            X.0kD.A0C(r2, r1, r0)
        L_0x000f:
            return r7
        L_0x0010:
            r0 = 9
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r1 = r8.B5u(r0)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r0 = r9.B5u(r0)
            r2 = 0
            if (r1 == 0) goto L_0x002c
            if (r0 == 0) goto L_0x002c
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter r1 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter) r1
            float r1 = r1.A00
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter r0 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter) r0
            float r0 = r0.A00
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x002c
            r2 = 1
        L_0x002c:
            r5 = 1
            if (r2 != 0) goto L_0x0073
            r0 = 19
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r4 = r8.B5u(r0)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.tiltshift.TiltShiftFilter r4 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.tiltshift.TiltShiftFilter) r4
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r3 = r9.B5u(r0)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.tiltshift.TiltShiftFilter r3 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.tiltshift.TiltShiftFilter) r3
            if (r4 == 0) goto L_0x0080
            if (r3 == 0) goto L_0x0080
            java.lang.Integer r2 = r4.A05
            java.lang.Integer r0 = r3.A05
            if (r2 != r0) goto L_0x0073
            float r1 = r4.A00
            float r0 = r3.A00
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0073
            float r1 = r4.A01
            float r0 = r3.A01
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0073
            int r1 = r2.intValue()
            if (r1 == r5) goto L_0x007d
            r0 = 2
            if (r1 == r0) goto L_0x007a
            r2 = 0
        L_0x0061:
            java.lang.Integer r0 = r3.A05
            int r1 = r0.intValue()
            if (r1 == r5) goto L_0x0077
            r0 = 2
            if (r1 == r0) goto L_0x0074
            r0 = 0
        L_0x006d:
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 != 0) goto L_0x0080
        L_0x0073:
            return r5
        L_0x0074:
            android.graphics.PointF r0 = r3.A03
            goto L_0x006d
        L_0x0077:
            android.graphics.PointF r0 = r3.A04
            goto L_0x006d
        L_0x007a:
            android.graphics.PointF r2 = r4.A03
            goto L_0x0061
        L_0x007d:
            android.graphics.PointF r2 = r4.A04
            goto L_0x0061
        L_0x0080:
            java.lang.String r3 = "FilterGroupUtil_hasUnsavedChanges()_mainFilter"
            com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter r0 = X.C395019z4.A00(r8, r3)
            java.lang.String r4 = "FilterGroupUtil_hasUnsavedChanges()_otherFilter"
            com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter r2 = X.C395019z4.A00(r9, r4)
            if (r0 == 0) goto L_0x00df
            if (r2 == 0) goto L_0x00df
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel r0 = r0.A00
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FullTransform r6 = r0.A06
            float r1 = r6.A03
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel r0 = r2.A00
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FullTransform r2 = r0.A06
            float r0 = r2.A03
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0073
            float r1 = r6.A04
            float r0 = r2.A04
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0073
            float r1 = r6.A05
            float r0 = r2.A05
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0073
            float r1 = r6.A06
            float r0 = r2.A06
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0073
            float r1 = r6.A01
            float r0 = r2.A01
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0073
            float r1 = r6.A02
            float r0 = r2.A02
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0073
            int r1 = r6.A07
            int r0 = r2.A07
            if (r1 != r0) goto L_0x0073
            float r1 = r6.A00
            float r0 = r2.A00
            float r1 = r1 - r0
            float r1 = java.lang.Math.abs(r1)
            r0 = 981668463(0x3a83126f, float:0.001)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00df
            return r5
        L_0x00df:
            r2 = 13
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r1 = r8.B5u(r2)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r0 = r9.B5u(r2)
            if (r1 == 0) goto L_0x00f6
            if (r0 == 0) goto L_0x00f6
            boolean r0 = r1.equals(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00f6
            return r5
        L_0x00f6:
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r0 = r8.B5u(r2)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel r0 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel) r0
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r1 = r9.B5u(r2)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel r1 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel) r1
            if (r0 == 0) goto L_0x014b
            if (r1 == 0) goto L_0x014b
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TypedParameterMap r0 = r0.A01
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TypedParameterMap r2 = r1.A01
            java.util.Map r6 = r0.A02
            java.lang.String r0 = "highlights"
            java.lang.Object r1 = r6.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            java.util.Map r2 = r2.A02
            java.lang.Object r0 = r2.get(r0)
            java.lang.Float r0 = (java.lang.Float) r0
            boolean r0 = X.0qQ.A0J(r1, r0)
            if (r0 == 0) goto L_0x0073
            java.lang.String r0 = "shadows"
            java.lang.Object r1 = r6.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            java.lang.Object r0 = r2.get(r0)
            java.lang.Float r0 = (java.lang.Float) r0
            boolean r0 = X.0qQ.A0J(r1, r0)
            if (r0 == 0) goto L_0x0073
            java.lang.String r0 = "sharpen"
            java.lang.Object r1 = r6.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            java.lang.Object r0 = r2.get(r0)
            java.lang.Float r0 = (java.lang.Float) r0
            boolean r0 = X.0qQ.A0J(r1, r0)
            if (r0 != 0) goto L_0x014b
            return r5
        L_0x014b:
            com.instagram.creation.photo.edit.effectfilter.PhotoFilter r3 = X.C394999z2.A00(r8, r3)
            com.instagram.creation.photo.edit.effectfilter.PhotoFilter r2 = X.C394999z2.A00(r9, r4)
            if (r3 == 0) goto L_0x000f
            if (r2 == 0) goto L_0x000f
            int r1 = r3.A08
            int r0 = r2.A08
            if (r1 != r0) goto L_0x0169
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter r0 = r3.A03
            float r1 = r0.A00
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter r0 = r2.A03
            float r0 = r0.A00
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x000f
        L_0x0169:
            r7 = 1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C364978mK.A06(com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel, com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel):boolean");
    }

    public static FilterGroupModelImpl A00() {
        FilterGroupModelImpl filterGroupModelImpl = new FilterGroupModelImpl(new FilterChain(), (PhotoFilter) null, AnonymousClass05K.A01, -1, true);
        FilterChain filterChain = filterGroupModelImpl.A02;
        SplitScreenFilter splitScreenFilter = new SplitScreenFilter();
        ColorFilter colorFilter = new ColorFilter(C366508p8.A01(0), true);
        splitScreenFilter.A01 = colorFilter;
        splitScreenFilter.A02 = colorFilter;
        splitScreenFilter.A00 = 1.0f;
        filterChain.A01(splitScreenFilter, 17);
        return filterGroupModelImpl;
    }

    public static FilterGroupModelImpl A01(UserSession userSession, boolean z) {
        boolean z2 = 2Ht.A00;
        Integer num = AnonymousClass05K.A00;
        UserSession userSession2 = userSession;
        PhotoFilter photoFilter = new PhotoFilter(userSession2, C353948Ka.A00(userSession2).A02, num);
        FilterGroupModelImpl filterGroupModelImpl = new FilterGroupModelImpl(new FilterChain(), (PhotoFilter) null, num, -1, z2);
        ColorFilter colorFilter = new ColorFilter(AnonymousClass000.A00(4035));
        colorFilter.A00 = -1.0f;
        filterGroupModelImpl.EWj(colorFilter, 9);
        filterGroupModelImpl.EWl(9, false);
        if (2Ht.A06(userSession2) || 2Ht.A03(userSession2)) {
            filterGroupModelImpl.EWj(new GainmapFilter((String) null, (float[]) null, (float[]) null, 0.0f, 63), 28);
            filterGroupModelImpl.EWl(28, false);
        }
        filterGroupModelImpl.EWj(new TiltShiftOverlayFilter(new PointF(0.5f, 0.5f), new PointF(0.5f, 0.5f), new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false), num, "tilt_shift_overlay", C366498p3.A00(), C366498p3.A00(), 0.0f, 0.5f, 0.5f, 0.0f, true), 21);
        filterGroupModelImpl.EWl(21, false);
        PointF pointF = new PointF(0.5f, 0.5f);
        PointF pointF2 = new PointF(0.5f, 0.5f);
        PointF pointF3 = pointF;
        PointF pointF4 = pointF2;
        filterGroupModelImpl.EWj(new TiltShiftFilter(pointF3, pointF4, new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false), num, "tilt_shift", C366498p3.A00(), C366498p3.A00(), 0.5f, 0.5f, 0.0f, true), 19);
        filterGroupModelImpl.EWl(19, false);
        SurfaceCropFilter surfaceCropFilter = new SurfaceCropFilter(false);
        surfaceCropFilter.A0P(z);
        filterGroupModelImpl.EWk(surfaceCropFilter, 3);
        ColorFilter colorFilter2 = new ColorFilter(AnonymousClass000.A00(3520));
        colorFilter2.A00 = 0.0f;
        filterGroupModelImpl.EWj(colorFilter2, 10);
        filterGroupModelImpl.EWl(10, false);
        filterGroupModelImpl.EWj(C63201Kt8.A00(), 13);
        filterGroupModelImpl.EWl(13, false);
        filterGroupModelImpl.EWk(photoFilter, 17);
        filterGroupModelImpl.EWl(3, true);
        return filterGroupModelImpl;
    }

    public static void A02(Rect rect, FilterGroupModel filterGroupModel, int i, int i2, int i3) {
        SurfaceCropFilter A00 = C395019z4.A00(filterGroupModel, "FilterGroupUtil_initialiseRestoredFilterGroup()");
        if (A00 != null && A00.A00.A0F) {
            A00.A0K(rect, i, i2, i3, false);
        }
        filterGroupModel.EWl(3, true);
    }

    public static void A04(FilterGroupModel filterGroupModel, String str, float f, boolean z, boolean z2, boolean z3) {
        if (f != 0.5625f) {
            String A0N = 002.A0N("Overlay aspect ratio=", f);
            0qQ.A0B(A0N, 1);
            0kD.A0C("FilterGroupUtil_overlay_aspect_ratio_not_9_16", A0N, (Throwable) null);
        }
        if (str == null) {
            return;
        }
        if ((!z && !z2) || z3) {
            FilterModel B5u = filterGroupModel.B5u(17);
            B5u.getClass();
            SplitScreenFilter splitScreenFilter = (SplitScreenFilter) B5u;
            FilterGroup filterGroup = new FilterGroup();
            FilterModel B5u2 = filterGroupModel.B5u(8);
            if (B5u2 != null) {
                String filterName = B5u2.getFilterName();
                if ((filterName.equals("multi_color_gradient_v2") || filterName.equals("multi_color_gradient")) && !splitScreenFilter.A05) {
                    filterGroup.A00(B5u2, 8);
                    filterGroupModel.EWj((FilterModel) null, 8);
                    filterGroup.A00(C369408uY.A00(str), 22);
                    filterGroupModel.EWj(filterGroup, 17);
                }
            }
            filterGroup.A00(splitScreenFilter, 17);
            filterGroup.A00(C369408uY.A00(str), 22);
            filterGroupModel.EWj(filterGroup, 17);
        }
    }

    public static void A03(UserSession userSession, FilterGroupModel filterGroupModel, String str) {
        FilterGroup filterGroup;
        int i;
        if (C59961JcU.A00(userSession)) {
            boolean z = 2Ht.A00;
            ValueMapFilterModel A00 = C369408uY.A00(str);
            ColorFilter colorFilter = new ColorFilter(C366508p8.A01(0));
            if (z) {
                filterGroup = new FilterGroup();
                filterGroup.A00(colorFilter, 17);
                filterGroup.A00(A00, 22);
                i = 26;
            } else if (2Ht.A03(userSession)) {
                filterGroup = new FilterGroup();
                filterGroup.A00(colorFilter, 17);
                i = 26;
                filterGroup.A00(A00, 26);
            } else {
                filterGroupModel.EWj(A00, 26);
                return;
            }
            filterGroupModel.EWj(filterGroup, i);
        }
    }
}
