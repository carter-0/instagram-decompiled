package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;

public abstract class W10 {
    public static final Rect A00 = new Rect();

    public static final void A01(Canvas canvas, Paint paint, C17944ViZ viZ, Integer num, List list, float f, float f2, int i) {
        float f3;
        int i2;
        AnonymousClass7TF.A1B(list, 1, viZ);
        Canvas canvas2 = canvas;
        canvas.save();
        if (i > 0 && (i2 = i - 1) < list.size()) {
            ((C17944ViZ) list.get(i2)).A00(canvas, num);
        }
        viZ.A00(canvas, num);
        if (paint != null) {
            String str = viZ.A06;
            0qQ.A0B(str, 0);
            if (00p.A0g(str, "\n", "", false).length() > 0) {
                float f4 = viZ.A01;
                if (viZ.A07) {
                    f3 = (viZ.A04 - f2) - f;
                } else {
                    f3 = viZ.A05 + f2;
                }
                canvas2.translate(viZ.A00, 0.0f);
                float f5 = viZ.A03;
                canvas2.drawRect(f3, f5, f3 + f, f4 + C51967G9n.A00(viZ.A02, f4), paint);
            }
        }
        canvas2.restore();
    }

    public static final void A02(Spanned spanned, TextPaint textPaint) {
        AnonymousClass91V r0 = (AnonymousClass91V) C263324Kh.A00(spanned, AnonymousClass91V.class);
        if (r0 != null) {
            r0.A00(textPaint);
        }
        CharacterStyle characterStyle = (CharacterStyle) C263324Kh.A00(spanned, C358848bZ.class);
        if (characterStyle != null) {
            characterStyle.updateDrawState(textPaint);
        }
    }

    public static final ArrayList A00(Layout.Alignment alignment, Layout layout, Spannable spannable, TextPaint textPaint, 0rN r24) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        ArrayList arrayList = new ArrayList();
        Layout layout2 = layout;
        int lineCount = layout2.getLineCount();
        for (int i = 0; i < lineCount; i++) {
            int lineStart = layout2.getLineStart(i);
            Spannable spannable2 = spannable;
            String A0c = C13988Tno.A0c(spannable2, lineStart, layout2.getLineEnd(i));
            if (TextUtils.isEmpty(A0c)) {
                break;
            }
            characterInstance.setText(A0c);
            while (true) {
                int next = characterInstance.next();
                if (next == -1) {
                    break;
                }
                float lineBottom = (float) layout2.getLineBottom(i);
                float lineTop = (float) layout2.getLineTop(i);
                float lineLeft = layout2.getLineLeft(i);
                float lineRight = layout2.getLineRight(i);
                float lineBaseline = (float) layout2.getLineBaseline(i);
                arrayList.add(new C17944ViZ(alignment, spannable2, textPaint, r24, lineBottom, lineTop, lineLeft, lineRight, lineBaseline, lineStart, lineStart + next, 0));
            }
        }
        return arrayList;
    }
}
