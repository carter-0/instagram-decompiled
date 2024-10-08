package X;

import android.graphics.Rect;
import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.Vei  reason: case insensitive filesystem */
public final class C17759Vei {
    public final ArrayList A00(Layout layout, float f) {
        ArrayList arrayList = new ArrayList();
        Rect rect = new Rect(-1, -1, -1, -1);
        float f2 = f * 0.4f;
        float f3 = f * 0.15f;
        float f4 = f * 0.05f;
        Layout layout2 = layout;
        int lineCount = layout2.getLineCount();
        for (int i = 0; i < lineCount; i++) {
            int lineLeft = (int) layout2.getLineLeft(i);
            int lineTop = layout2.getLineTop(i);
            int lineRight = (int) layout2.getLineRight(i);
            int lineBottom = layout2.getLineBottom(i);
            Rect rect2 = new Rect(lineLeft, lineTop, lineRight, lineBottom);
            String A0a = C13990Tnq.A0a(layout2, i);
            if (rect2.width() > 0 && !TextUtils.isEmpty(00p.A0g(A0a, "\n", "", false))) {
                rect.bottom = lineBottom;
                if (rect.top == -1) {
                    rect.top = lineTop;
                }
                if (rect.left == -1) {
                    rect.left = lineLeft;
                } else {
                    rect.left = Math.min(lineLeft, rect.left);
                }
                if (rect.right == -1) {
                    rect.right = lineRight;
                } else {
                    rect.right = Math.max(lineRight, rect.right);
                }
            } else if (!(rect.left == -1 || rect.right == -1 || rect.top == -1 || rect.bottom == -1)) {
                rect.inset(-((int) f2), 0);
                rect.bottom += (int) f3;
                arrayList.add(rect);
                rect = new Rect(-1, -1, -1, -1);
            }
        }
        if (!(rect.left == -1 || rect.right == -1 || rect.top == -1 || rect.bottom == -1)) {
            rect.inset(-((int) f2), 0);
            rect.bottom += (int) f3;
            rect.top -= (int) f4;
            arrayList.add(rect);
        }
        return arrayList;
    }
}
