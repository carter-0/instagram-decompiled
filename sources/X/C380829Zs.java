package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterWeakPtr;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluExternalRenderDelegateHolder;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluExternalRenderDelegateWrapper;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.instagram.InstagramFilterFactoryProvider;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ExternalRenderFilterModel;

/* renamed from: X.9Zs  reason: invalid class name and case insensitive filesystem */
public final class C380829Zs extends C367538r5 {
    public IgluExternalRenderDelegateHolder A00;
    public final IgluExternalRenderDelegateWrapper A01 = new IgluExternalRenderDelegateWrapper();

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluExternalRenderDelegateHolder] */
    public final void AC0(FilterManagerImpl filterManagerImpl) {
        0qQ.A0B(filterManagerImpl, 0);
        super.AC0(filterManagerImpl);
        FilterWeakPtr filterWeakPtr = filterManagerImpl.getFilterWeakPtr();
        IgluExternalRenderDelegateWrapper igluExternalRenderDelegateWrapper = this.A01;
        igluExternalRenderDelegateWrapper.key = ((ExternalRenderFilterModel) this.A00).A02;
        C392509uv r0 = IgluExternalRenderDelegateHolder.Companion;
        0qQ.A0A(filterWeakPtr);
        0qQ.A0B(filterWeakPtr, 1);
        ? obj = new Object();
        obj.mHybridData = IgluExternalRenderDelegateHolder.initHybrid(filterWeakPtr, igluExternalRenderDelegateWrapper);
        this.A00 = obj;
    }

    public final void ACB(FilterManagerImpl filterManagerImpl, float[] fArr, float[] fArr2) {
    }

    public final void ACC(FilterManagerImpl filterManagerImpl) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C380829Zs(InstagramFilterFactoryProvider instagramFilterFactoryProvider, ExternalRenderFilterModel externalRenderFilterModel) {
        super(instagramFilterFactoryProvider, externalRenderFilterModel);
        AnonymousClass7TG.A1O(externalRenderFilterModel, instagramFilterFactoryProvider);
    }
}
