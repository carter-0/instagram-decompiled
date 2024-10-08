package X;

import android.content.Context;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.GradientTransformFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import com.instagram.filterkit.filter.VideoFilter;

public final class ADO {
    public static final ADO A00 = new Object();

    public final FilterChain A00(Context context, UserSession userSession, AnonymousClass3Q2 r22) {
        ColorFilter colorFilter;
        FilterModel gradientTransformFilter;
        UserSession userSession2 = userSession;
        AnonymousClass3Q2 r5 = r22;
        VideoFilter videoFilter = Ky1.A00(context, userSession2, r5).A00;
        int i = videoFilter.A0O;
        String str = "normal";
        if (i != 0) {
            if (i == 114) {
                str = "GinghamFilter";
            } else if (i == 640) {
                str = "MelbourneFilter";
            } else if (i == 810) {
                str = "ParisFilter";
            } else if (i == 813) {
                str = "LosAngelesFilter";
            } else if (i == 642) {
                str = "RioDeJaneiroFilter";
            } else if (i == 643) {
                str = "OsloFilter";
            } else if (i == 702) {
                str = "DramaticBlackWhiteFilter";
            } else if (i == 703) {
                str = "CinemaRedFilter";
            } else if (i == 709) {
                str = "PastelPinkFilter";
            } else if (i != 710) {
                switch (i) {
                    case 705:
                        str = "CinemaBlueFilter";
                        break;
                    case 706:
                        str = "CrystalClearFilter";
                        break;
                    case 707:
                        str = "VintageFilter";
                        break;
                    default:
                        if (C353958Kb.A00(C353948Ka.A00(userSession2)).get(i) == null) {
                            0wb.A03("LegacyModelConvertUtil.filterIdToOCFilterModel", 002.A0O("Unmapped filter ", i));
                            colorFilter = new ColorFilter(str);
                            break;
                        } else {
                            String str2 = (String) C366508p8.A00.get(Integer.valueOf(i));
                            if (str2 == null) {
                                str2 = str;
                            }
                            colorFilter = new ColorFilter(str2, false);
                            break;
                        }
                }
            } else {
                str = "PastelSkyFilter";
            }
        }
        colorFilter = new ColorFilter(str, false);
        0qQ.A0B(userSession2, 0);
        if (182.A06(0Tu.A05, userSession2, 36324243525021604L)) {
            gradientTransformFilter = C369408uY.A02(C369398uX.A00(-16777216), C369398uX.A00(-16777216), 0.0f, 0.0f, 0.0f, false);
        } else {
            gradientTransformFilter = new GradientTransformFilter((float[]) null, (float[]) null, 0.0f, 0.0f, 0.0f, 8191);
        }
        FilterModel filterModel = gradientTransformFilter;
        FilterChain filterChain = new FilterChain();
        float[] fArr = videoFilter.A0I;
        if (fArr != null) {
            if (filterModel instanceof GradientTransformFilter) {
                ((GradientTransformFilter) filterModel).A08 = AnonymousClass7TF.A1a(fArr);
            } else {
                0qQ.A0C(filterModel, "null cannot be cast to non-null type com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel");
                ((ValueMapFilterModel) filterModel).A03("u_topColor", AnonymousClass7TF.A1a(fArr));
            }
        }
        float[] fArr2 = videoFilter.A0H;
        if (fArr2 != null) {
            if (filterModel instanceof GradientTransformFilter) {
                ((GradientTransformFilter) filterModel).A07 = AnonymousClass7TF.A1a(fArr2);
            } else {
                0qQ.A0C(filterModel, "null cannot be cast to non-null type com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel");
                ((ValueMapFilterModel) filterModel).A03("u_bottomColor", AnonymousClass7TF.A1a(fArr2));
            }
        }
        TransformMatrixConfig A01 = C364738lv.A01(r5.A16, (AD8) null, false, true, true);
        if (A01 != null) {
            if (C366738pa.A00(userSession2)) {
                TransformMatrixParams transformMatrixParams = A01.A08;
                0qQ.A0B(transformMatrixParams, 1);
                TransformMatrixParams transformMatrixParams2 = filterChain.A03;
                transformMatrixParams2.A00(transformMatrixParams);
                transformMatrixParams2.A04 = A01.A08.A04;
            } else {
                C366728pZ.A01(filterModel, A01.C5o());
            }
        }
        filterChain.A01(colorFilter, 17);
        filterChain.A01(filterModel, 8);
        return filterChain;
    }
}
