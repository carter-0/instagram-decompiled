package X;

import android.content.Context;
import android.content.res.AssetManager;
import android.opengl.GLES20;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluConfigHolder;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluIODescriptor;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.basic.NativeConfigFactory;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.GradientTransformFilter;
import com.facebook.onecamera.components.mediagraph.iglu.nativegraph.IgluFilterNativeGraph;
import java.nio.ByteBuffer;

/* renamed from: X.8rx  reason: invalid class name and case insensitive filesystem */
public final class C368028rx {
    public boolean A00;
    public final AnonymousClass9TV A01;
    public final AnonymousClass9TW A02;

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.8o4] */
    public C368028rx(Context context, AnonymousClass9TW r6, boolean z) {
        0qQ.A0B(context, 1);
        this.A02 = r6;
        AssetManager assets = context.getAssets();
        0qQ.A07(assets);
        this.A01 = new AnonymousClass9TV(new Object(), new C365998o1(assets, true), new C366518pA(false), z);
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluIODescriptor, java.lang.Object] */
    public final void A00(C346337v0 r16) {
        0eP r3;
        IgluFilterNativeGraph igluFilterNativeGraph;
        C366028o4 r5;
        FilterManagerImpl filterManagerImpl;
        C369008tg r2;
        if (!this.A00) {
            try {
                AnonymousClass9TV r7 = this.A01;
                IgluConfigHolder createIgAssetConfig = NativeConfigFactory.createIgAssetConfig(r7.A01.A00, true);
                0qQ.A07(createIgAssetConfig);
                igluFilterNativeGraph = new IgluFilterNativeGraph();
                igluFilterNativeGraph.attach(createIgAssetConfig);
                r5 = r7.A00;
                r5.attach(createIgAssetConfig);
                createIgAssetConfig.release();
                filterManagerImpl = new FilterManagerImpl(r5, (C40136ATc) null);
                r2 = new C369008tg(8, 8);
                C366548pF A002 = r7.A02.A00(new ColorFilter(C366508p8.A01(0)));
                A002.AC0(filterManagerImpl);
                A002.ACC(filterManagerImpl);
                A002.ACB(filterManagerImpl, C366498p3.A00(), C366498p3.A00());
                igluFilterNativeGraph.updateFilter(filterManagerImpl.getFilterWeakPtr());
                C346337v0 r0 = r16;
                int i = r0.A00;
                int i2 = r0.A01;
                C346367v3 r02 = r0.A02;
                igluFilterNativeGraph.setInputTexture(i, i2, r02.A01, r02.A00);
                GLES20.glBindFramebuffer(36160, r2.A00);
                C346337v0 r03 = r2.A03;
                int i3 = r03.A00;
                int i4 = r03.A01;
                int i5 = r2.A02;
                int i6 = r2.A01;
                ? obj = new Object();
                obj.mHybridData = IgluIODescriptor.initHybrid(i3, i4, i5, i6, 0, 14);
                igluFilterNativeGraph.setOutputTexture(obj);
                igluFilterNativeGraph.setClearFramebuffer(true);
                igluFilterNativeGraph.render(002.A0J("[GradientColorsExtractor] outputSize=", 'x', 8, 8));
                ByteBuffer A012 = AnonymousClass9UO.A01(8, 8);
                int capacity = A012.capacity() / 4;
                A012.position(0);
                int i7 = A012.get() & 255;
                int i8 = A012.get() & 255;
                byte b = ((A012.get() & 255) << 24) | (i7 << 16) | (i8 << 8) | (A012.get() & 255);
                A012.position((capacity - 1) * 4);
                int i9 = A012.get() & 255;
                int i10 = A012.get() & 255;
                r3 = new 0eP(Integer.valueOf(b), Integer.valueOf(((A012.get() & 255) << 24) | (i9 << 16) | (i10 << 8) | (A012.get() & 255)));
                GLES20.glBindFramebuffer(36160, 0);
                r2.A01();
                filterManagerImpl.release();
                r5.detach();
                igluFilterNativeGraph.detach();
            } catch (Exception e) {
                0f9 AEf = 0wj.A01.AEf(e.getMessage(), 817903816);
                AEf.ERJ(e);
                AEf.report();
                r3 = new 0eP(-16777216, -16777216);
            } catch (Throwable th) {
                r2.A01();
                filterManagerImpl.release();
                r5.detach();
                igluFilterNativeGraph.detach();
                throw th;
            }
            AnonymousClass9TW r22 = this.A02;
            int intValue = ((Number) r3.A00).intValue();
            int intValue2 = ((Number) r3.A01).intValue();
            FilterModel filterModel = r22.A00;
            if (filterModel instanceof GradientTransformFilter) {
                GradientTransformFilter gradientTransformFilter = (GradientTransformFilter) filterModel;
                gradientTransformFilter.A08 = C366558pG.A00(intValue);
                gradientTransformFilter.A07 = C366558pG.A00(intValue2);
            } else {
                0qQ.A0C(filterModel, "null cannot be cast to non-null type com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel");
                ValueMapFilterModel valueMapFilterModel = (ValueMapFilterModel) filterModel;
                valueMapFilterModel.A03("u_topColor", C369398uX.A00(intValue));
                valueMapFilterModel.A03("u_bottomColor", C369398uX.A00(intValue2));
            }
            this.A00 = true;
        }
    }
}
