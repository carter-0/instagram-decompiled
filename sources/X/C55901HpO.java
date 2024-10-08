package X;

import android.text.Layout;
import java.util.ArrayList;

/* renamed from: X.HpO  reason: case insensitive filesystem */
public final class C55901HpO {
    public final ArrayList A00(Layout layout, Integer num, String str) {
        ArrayList arrayList;
        int i = 0;
        0qQ.A0B(layout, 0);
        int intValue = num.intValue();
        if (intValue == 0) {
            if (str == null) {
                str = layout.getText().toString();
            }
            arrayList = AnonymousClass7TE.A1C();
            int i2 = 0;
            int i3 = 0;
            while (i2 < str.length()) {
                i++;
                if (!11R.A01(str.charAt(i2))) {
                    AnonymousClass7TF.A1I(Integer.valueOf(i3), Integer.valueOf(i), arrayList);
                }
                i2++;
                i3 = i;
            }
        } else if (intValue == 1) {
            if (str == null) {
                str = layout.getText().toString();
            }
            arrayList = AnonymousClass7TE.A1C();
            int length = str.length();
            int i4 = -1;
            while (i < length) {
                if (!11R.A01(str.charAt(i))) {
                    if (i4 == -1) {
                        i4 = i;
                    }
                } else if (i4 != -1) {
                    AnonymousClass7TF.A1I(Integer.valueOf(i4), Integer.valueOf(i), arrayList);
                    i4 = -1;
                }
                i++;
            }
            if (i4 != -1) {
                AnonymousClass7TF.A1I(Integer.valueOf(i4), Integer.valueOf(length), arrayList);
            }
        } else if (intValue == 2) {
            arrayList = AnonymousClass7TE.A1C();
            int lineCount = layout.getLineCount();
            while (i < lineCount) {
                AnonymousClass7TF.A1I(Integer.valueOf(layout.getLineStart(i)), Integer.valueOf(layout.getLineEnd(i)), arrayList);
                i++;
            }
        } else {
            throw AnonymousClass7TE.A1K();
        }
        return arrayList;
    }
}
