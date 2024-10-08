package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.instagram.InstagramFilterFactoryProvider;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.DataDrivenFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.DataDrivenGraphFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ExternalRenderFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterGroup;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.GradientTransformFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SplitScreenFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.detection.DetectionFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapAlphaFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.tiltshift.TiltShiftFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.tiltshift.TiltShiftOverlayFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.BlurTransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.FlareTransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.GlitchTransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.PanFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.SpinTransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.WarpTransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.ZoomTransitionFilter;

/* renamed from: X.8pA  reason: invalid class name and case insensitive filesystem */
public final class C366518pA {
    public final InstagramFilterFactoryProvider A00;
    public final boolean A01;

    public final C366548pF A00(FilterModel filterModel) {
        C366548pF arh;
        0qQ.A0B(filterModel, 0);
        if (filterModel instanceof BlurTransitionFilter) {
            BlurTransitionFilter blurTransitionFilter = (BlurTransitionFilter) filterModel;
            InstagramFilterFactoryProvider instagramFilterFactoryProvider = this.A00;
            0qQ.A0B(blurTransitionFilter, 1);
            0qQ.A0B(instagramFilterFactoryProvider, 2);
            arh = new AnonymousClass9Zz(instagramFilterFactoryProvider, blurTransitionFilter);
        } else if (filterModel instanceof ColorFilter) {
            arh = new C367548rA(this.A00, (ColorFilter) filterModel);
        } else if (filterModel instanceof FilterChain) {
            arh = new C366538pE(this, (FilterChain) filterModel, this.A01);
        } else if (filterModel instanceof FilterGroup) {
            arh = new ARI(this, (FilterGroup) filterModel);
        } else if (filterModel instanceof FlareTransitionFilter) {
            FlareTransitionFilter flareTransitionFilter = (FlareTransitionFilter) filterModel;
            InstagramFilterFactoryProvider instagramFilterFactoryProvider2 = this.A00;
            0qQ.A0B(flareTransitionFilter, 1);
            0qQ.A0B(instagramFilterFactoryProvider2, 2);
            arh = new AnonymousClass9Zz(instagramFilterFactoryProvider2, flareTransitionFilter);
        } else if (filterModel instanceof GainmapFilter) {
            InstagramFilterFactoryProvider instagramFilterFactoryProvider3 = this.A00;
            0qQ.A0B(instagramFilterFactoryProvider3, 2);
            arh = new C367538r5(instagramFilterFactoryProvider3, filterModel);
        } else if (filterModel instanceof GainmapAlphaFilter) {
            InstagramFilterFactoryProvider instagramFilterFactoryProvider4 = this.A00;
            0qQ.A0B(instagramFilterFactoryProvider4, 2);
            arh = new C367538r5(instagramFilterFactoryProvider4, filterModel);
        } else if (filterModel instanceof GlitchTransitionFilter) {
            GlitchTransitionFilter glitchTransitionFilter = (GlitchTransitionFilter) filterModel;
            InstagramFilterFactoryProvider instagramFilterFactoryProvider5 = this.A00;
            0qQ.A0B(glitchTransitionFilter, 1);
            0qQ.A0B(instagramFilterFactoryProvider5, 2);
            arh = new AnonymousClass9Zz(instagramFilterFactoryProvider5, glitchTransitionFilter);
        } else if (filterModel instanceof GradientTransformFilter) {
            arh = new C367528r4(this.A00, (GradientTransformFilter) filterModel);
        } else if (filterModel instanceof PanFilter) {
            arh = new C380819Zr(this.A00, (PanFilter) filterModel);
        } else if (filterModel instanceof SpinTransitionFilter) {
            SpinTransitionFilter spinTransitionFilter = (SpinTransitionFilter) filterModel;
            InstagramFilterFactoryProvider instagramFilterFactoryProvider6 = this.A00;
            0qQ.A0B(spinTransitionFilter, 1);
            0qQ.A0B(instagramFilterFactoryProvider6, 2);
            arh = new AnonymousClass9Zz(instagramFilterFactoryProvider6, spinTransitionFilter);
        } else if (filterModel instanceof SplitScreenFilter) {
            arh = new AnonymousClass8r9(this, (SplitScreenFilter) filterModel);
        } else if (filterModel instanceof SurfaceCropFilterModel) {
            InstagramFilterFactoryProvider instagramFilterFactoryProvider7 = this.A00;
            0qQ.A0B(instagramFilterFactoryProvider7, 2);
            arh = new C367538r5(instagramFilterFactoryProvider7, filterModel);
        } else if (filterModel instanceof TiltShiftFilter) {
            InstagramFilterFactoryProvider instagramFilterFactoryProvider8 = this.A00;
            0qQ.A0B(instagramFilterFactoryProvider8, 2);
            arh = new C367538r5(instagramFilterFactoryProvider8, filterModel);
        } else if (filterModel instanceof TiltShiftOverlayFilter) {
            InstagramFilterFactoryProvider instagramFilterFactoryProvider9 = this.A00;
            0qQ.A0B(instagramFilterFactoryProvider9, 2);
            arh = new C367538r5(instagramFilterFactoryProvider9, filterModel);
        } else if (filterModel instanceof WarpTransitionFilter) {
            WarpTransitionFilter warpTransitionFilter = (WarpTransitionFilter) filterModel;
            InstagramFilterFactoryProvider instagramFilterFactoryProvider10 = this.A00;
            0qQ.A0B(warpTransitionFilter, 1);
            0qQ.A0B(instagramFilterFactoryProvider10, 2);
            arh = new AnonymousClass9Zz(instagramFilterFactoryProvider10, warpTransitionFilter);
        } else if (filterModel instanceof ZoomTransitionFilter) {
            ZoomTransitionFilter zoomTransitionFilter = (ZoomTransitionFilter) filterModel;
            InstagramFilterFactoryProvider instagramFilterFactoryProvider11 = this.A00;
            0qQ.A0B(zoomTransitionFilter, 1);
            0qQ.A0B(instagramFilterFactoryProvider11, 2);
            arh = new AnonymousClass9Zz(instagramFilterFactoryProvider11, zoomTransitionFilter);
        } else if (filterModel instanceof ExternalRenderFilterModel) {
            arh = new C380829Zs(this.A00, (ExternalRenderFilterModel) filterModel);
        } else if (filterModel instanceof DataDrivenFilter) {
            InstagramFilterFactoryProvider instagramFilterFactoryProvider12 = this.A00;
            0qQ.A0B(instagramFilterFactoryProvider12, 2);
            arh = new C367538r5(instagramFilterFactoryProvider12, filterModel);
        } else if (filterModel instanceof DataDrivenGraphFilter) {
            InstagramFilterFactoryProvider instagramFilterFactoryProvider13 = this.A00;
            0qQ.A0B(instagramFilterFactoryProvider13, 2);
            arh = new C367538r5(instagramFilterFactoryProvider13, filterModel);
        } else if (filterModel instanceof ValueMapFilterModel) {
            arh = new C369428uk(this.A00, (ValueMapFilterModel) filterModel);
        } else if (filterModel instanceof DetectionFilterModel) {
            arh = new ARH(this.A00, (DetectionFilterModel) filterModel);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("No FilterUpdater for ");
            sb.append(new 0Yh(filterModel.getClass()));
            throw new IllegalArgumentException(sb.toString());
        }
        return arh;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.instagram.InstagramFilterFactoryProvider, java.lang.Object] */
    public C366518pA(boolean z) {
        this.A01 = z;
        this.A00 = new Object();
    }

    public C366518pA() {
        this(false);
    }
}
