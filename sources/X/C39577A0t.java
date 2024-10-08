package X;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;

/* renamed from: X.A0t  reason: case insensitive filesystem */
public abstract class C39577A0t {
    public static final int[] A00(Context context, C387339m3 r7) {
        int[] iArr;
        String str = r7.A00.A01;
        if (str != null) {
            try {
                int parseColor = Color.parseColor(str);
                iArr = new int[5];
                for (int i = 0; i < 5; i++) {
                    iArr[i] = parseColor;
                }
            } catch (IllegalArgumentException unused) {
                0wb.A03("GroupMentionStickerStyleUtil", 002.A0R("Failed to parse customColor ", str));
                iArr = null;
            }
            if (iArr != null) {
                return iArr;
            }
        }
        int[] iArr2 = new int[5];
        C267014am.A03(context, (AttributeSet) null, iArr2, ABA.A00(r7.A01));
        return iArr2;
    }
}
