package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapFilter;

/* renamed from: X.Ajs  reason: case insensitive filesystem */
public final /* synthetic */ class C40822Ajs implements Runnable {
    public final /* synthetic */ C40437Ac8 A00;

    public /* synthetic */ C40822Ajs(C40437Ac8 ac8) {
        this.A00 = ac8;
    }

    public final void run() {
        GainmapFilter gainmapFilter;
        C40437Ac8 ac8 = this.A00;
        if (!ac8.A0E && ac8.A07 != null && C40437Ac8.A00(ac8).A04 != null) {
            if (ac8.A0P && (gainmapFilter = ac8.A04) != null) {
                float f = 1.0f;
                if (ac8.A00 > 1.0f) {
                    f = ac8.A01;
                }
                gainmapFilter.A00(f);
            }
            try {
                C365398n2 r1 = ac8.A07;
                C365358my r0 = ac8.A0C;
                r0.getClass();
                r1.A02(r0.getTexture());
            } catch (IllegalStateException | InterruptedException e) {
                C40437Ac8.A00(ac8).A0D("OneCameraImageRenderController SharedTextureVideoInput onFrameAvailable exception", "OneCameraImageRenderController", e);
                0kD.A0H("OneCameraImageRenderController SharedTextureVideoInput onFrameAvailable exception", e);
            }
        }
    }
}
