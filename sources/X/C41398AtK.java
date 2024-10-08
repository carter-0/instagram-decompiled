package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;

/* renamed from: X.AtK  reason: case insensitive filesystem */
public final class C41398AtK implements AnonymousClass0eL, C62320sa {
    public final int A00;

    public C41398AtK(int i) {
        this.A00 = i;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.instagram.InstagramFilterFactoryProvider, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v11, types: [com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.instagram.InstagramFilterFactoryProvider, java.lang.Object] */
    public final Object invoke() {
        switch (this.A00) {
            case 0:
                C61620nx A002 = C61610nw.A00();
                A002.A01 = "BoomerangCapture";
                return new AnonymousClass0vF(A002);
            case 1:
                ColorFilter colorFilter = new ColorFilter("normal");
                colorFilter.A01 = true;
                C367548rA r2 = new C367548rA(new Object(), colorFilter);
                r2.A00 = false;
                return r2;
            default:
                Integer num = AnonymousClass05K.A0C;
                ValueMapFilterModel A003 = C369418uZ.A00(new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false), "rounded_rect2", (float[]) null, 46);
                A003.A00("topLeftRadius", 0.0f);
                A003.A00("topRightRadius", 0.0f);
                A003.A00("bottomLeftRadius", 0.0f);
                A003.A00("bottomRightRadius", 0.0f);
                return new C369428uk(new Object(), A003);
        }
    }
}
