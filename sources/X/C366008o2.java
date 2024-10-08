package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluConfigHolder;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.TextureLoaderWeakPtr;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.instagram.IgTextureLoader;

/* renamed from: X.8o2  reason: invalid class name and case insensitive filesystem */
public final class C366008o2 implements C366028o4 {
    public C366028o4 A00;
    public boolean A01;

    public final void attach(IgluConfigHolder igluConfigHolder) {
        C366028o4 r1;
        C366028o4 r0 = this.A00;
        if (r0 == null) {
            r0 = new IgTextureLoader();
            this.A00 = r0;
        }
        r0.attach(igluConfigHolder);
        if (this.A01 && (r1 = this.A00) != null && (r1 instanceof IgTextureLoader)) {
            ((IgTextureLoader) r1).tryGPULoading();
        }
    }

    public final void detach() {
        C366028o4 r0 = this.A00;
        if (r0 == null) {
            r0 = new IgTextureLoader();
            this.A00 = r0;
        }
        r0.detach();
        this.A00 = null;
    }

    public final TextureLoaderWeakPtr getTextureLoaderWeakPtr() {
        C366028o4 r0 = this.A00;
        if (r0 == null) {
            r0 = new IgTextureLoader();
            this.A00 = r0;
        }
        TextureLoaderWeakPtr textureLoaderWeakPtr = r0.getTextureLoaderWeakPtr();
        0qQ.A07(textureLoaderWeakPtr);
        return textureLoaderWeakPtr;
    }
}
