package X;

import android.graphics.RectF;
import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.Veh  reason: case insensitive filesystem */
public final class C17758Veh {
    public final ArrayList A00(Layout layout, float f, int i, int i2, boolean z) {
        float f2;
        ArrayList arrayList = new ArrayList();
        float f3 = f;
        float f4 = f * 0.05f;
        float f5 = f * 0.2f;
        float f6 = f5 * 2.5f;
        if (z) {
            f2 = 0.1f * f;
        } else {
            f2 = 0.0f;
        }
        Layout layout2 = layout;
        boolean A03 = 0mk.A03(layout2.getText().toString());
        int lineCount = layout2.getLineCount();
        for (int i3 = 0; i3 < lineCount; i3++) {
            int i4 = i;
            int lineForOffset = layout2.getLineForOffset(i4);
            int i5 = i2;
            int lineForOffset2 = layout2.getLineForOffset(i5);
            if (lineForOffset <= i3 && i3 <= lineForOffset2 && !TextUtils.isEmpty(00p.A0g(C13990Tnq.A0a(layout2, i3), "\n", "", false))) {
                int i6 = i3;
                RectF A00 = C18698Vww.A00(layout2, f4, f5, f4, f6, f2, 1.0f, i6, lineForOffset, lineForOffset2, i4, i5, true, A03);
                if (A00.width() > 2.0f * f4) {
                    arrayList.add(new C17901Vhs(A00, 22.25d, f3, A03));
                }
            }
        }
        return arrayList;
    }
}
