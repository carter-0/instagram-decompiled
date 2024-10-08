package X;

import android.graphics.Bitmap;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.pytorch.IValue;
import org.pytorch.Tensor;

public final class AGy {
    public static final AGy A00 = new Object();
    public static final List A01 = 0sr.A1P(new String[]{"ROT", "blurry", "motion_blur", "DOF", "col_harmony", "col_vivid", "light", "rating"});
    public static final List A02 = 0sr.A1P(new String[]{"dog", "pet", "cat"});
    public static final List A03 = AnonymousClass7TE.A1I("foodstuff");
    public static final List A04 = 0sr.A1P(new String[]{"child", "face", "smiling", "people"});
    public static final List A05 = 0sr.A1P(new String[]{"violence", "nudity"});
    public static final float[] A06 = {0.485f, 0.456f, 0.406f};
    public static final float[] A07 = {0.229f, 0.224f, 0.225f};

    public static final Tensor A00(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        int i = height * width;
        int[] iArr = new int[i];
        bitmap2.getPixels(iArr, 0, width, 0, 0, width, height);
        int i2 = i * 2;
        FloatBuffer allocateFloatBuffer = Tensor.allocateFloatBuffer(width * 3 * height);
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = iArr[i3];
            float[] fArr = A06;
            float[] fArr2 = A07;
            allocateFloatBuffer.put(i3, ((((float) ((i4 >> 16) & 255)) / 255.0f) - fArr[0]) / fArr2[0]);
            allocateFloatBuffer.put(i + i3, ((((float) ((i4 >> 8) & 255)) / 255.0f) - fArr[1]) / fArr2[1]);
            allocateFloatBuffer.put(i2 + i3, ((((float) (i4 & 255)) / 255.0f) - fArr[2]) / fArr2[2]);
        }
        return Tensor.fromBlob(allocateFloatBuffer, new long[]{1, 3, (long) height, (long) width}, XF6.CONTIGUOUS);
    }

    public final ArrayList A01(C353698Is r18, List list, IValue[] iValueArr) {
        List A002;
        IValue[] iValueArr2 = iValueArr;
        0qQ.A0B(iValueArr2, 1);
        C353698Is r15 = r18;
        ArrayList A0q = AnonymousClass7TF.A0q(r15, 2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C353728Iv r9 = (C353728Iv) it.next();
            if (r9 != C353728Iv.EMBEDDINGS || iValueArr2.length <= 3) {
                int ordinal = r9.ordinal();
                if (ordinal == 0) {
                    A002 = r15.A00();
                } else if (ordinal == 1) {
                    A002 = A01;
                } else if (ordinal == 2) {
                    A002 = A05;
                }
                ArrayList A1C = AnonymousClass7TE.A1C();
                char c = 2;
                if (ordinal == 0) {
                    c = 0;
                } else if (ordinal == 1) {
                    c = 1;
                }
                float[] dataAsFloatArray = iValueArr[c].toTensor().getDataAsFloatArray();
                if (A002.size() == dataAsFloatArray.length) {
                    int size = A002.size();
                    for (int i = 0; i < size; i++) {
                        if (r9 != C353728Iv.CONCEPT_SCORES || dataAsFloatArray[i] >= 0.9f) {
                            A1C.add(new AHB(r9, Float.valueOf(dataAsFloatArray[i]), (String) A002.get(i), (float[]) null));
                        }
                    }
                }
                A0q.addAll(A1C);
            } else {
                A0q.add(new AHB(r9, (Float) null, (String) null, iValueArr[3].toTensor().getDataAsFloatArray()));
            }
        }
        return A0q;
    }
}
