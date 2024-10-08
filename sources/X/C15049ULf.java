package X;

import com.facebook.odin.model.Matrix;
import com.facebook.odin.prediction.litennmodelparams.DynamicNNModelParams$Layer$Companion;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.Serializable;

@Serializable
/* renamed from: X.ULf  reason: case insensitive filesystem */
public final class C15049ULf extends AnonymousClass0T0 {
    public static final C255463uA[] A04 = {null, null, new ContextualSerializer(new 0Yh(Matrix.class), new C255463uA[0]), null};
    public static final DynamicNNModelParams$Layer$Companion Companion = new Object();
    public final Matrix A00;
    public final float[] A01;
    public final float[] A02;
    public final float[] A03;

    public C15049ULf(Matrix matrix, float[] fArr, float[] fArr2, float[] fArr3) {
        this.A01 = fArr;
        this.A02 = fArr2;
        this.A00 = matrix;
        this.A03 = fArr3;
    }

    public /* synthetic */ C15049ULf(Matrix matrix, float[] fArr, float[] fArr2, float[] fArr3, int i) {
        if (15 != (i & 15)) {
            VJ6.A00(C20503Wsj.A01, i, 15);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A01 = fArr;
        this.A02 = fArr2;
        this.A00 = matrix;
        this.A03 = fArr3;
    }
}
