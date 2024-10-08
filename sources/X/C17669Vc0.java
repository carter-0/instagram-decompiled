package X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: X.Vc0  reason: case insensitive filesystem */
public final class C17669Vc0 {
    public int A00 = 10;
    public int A01 = 0;
    public int A02 = 10;
    public int A03 = -1;
    public int A04 = 0;
    public Rect A05;
    public final View A06;
    public final String A07;
    public final View[] A08;

    public C17669Vc0(View view, String str, View... viewArr) {
        int length = viewArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (viewArr[i] == null) {
                0wb.A03(002.A0R("BlurDrawable", "_null_source_view"), "sourceViews has null elements");
                break;
            } else {
                i++;
            }
        }
        this.A07 = str;
        this.A06 = view;
        this.A08 = viewArr;
    }
}
