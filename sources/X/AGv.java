package X;

import android.graphics.Color;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TypedParameterMap;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel;
import java.util.Iterator;
import java.util.List;

public final class AGv {
    public static final AGv A00 = new Object();

    public static final void A00(ValueMapFilterModel valueMapFilterModel, int[] iArr) {
        TypedParameterMap typedParameterMap = valueMapFilterModel.A01;
        Number number = (Number) typedParameterMap.A02.get("numIntervals");
        if (number != null) {
            int floatValue = ((int) number.floatValue()) + 1;
            for (int i = 0; i < floatValue; i++) {
                typedParameterMap.A01.remove(002.A0O("color_", i));
            }
        }
        int length = iArr.length;
        valueMapFilterModel.A00("numIntervals", (float) (length - 1));
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            valueMapFilterModel.A03(002.A0O("color_", i3), new float[]{((float) Color.red(i4)) / 255.0f, ((float) Color.green(i4)) / 255.0f, ((float) Color.blue(i4)) / 255.0f, 1.0f});
            i2++;
            i3++;
        }
    }

    public final void A01(ValueMapFilterModel valueMapFilterModel, List list) {
        AnonymousClass7TG.A1N(valueMapFilterModel, list);
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = AnonymousClass7TG.A0F(it);
            i++;
        }
        A00(valueMapFilterModel, iArr);
    }
}
