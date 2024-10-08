package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import com.instagram.ui.text.TextColors;
import com.instagram.ui.text.TextShadow;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Vkc  reason: case insensitive filesystem */
public final class C18054Vkc {
    public float A00;
    public final int A01;
    public final C17907Vhy A02;
    public final C306576Mr A03;
    public final List A04 = new ArrayList();
    public final int A05;

    public C18054Vkc(Context context, Spannable spannable, TextPaint textPaint, 0rN r12, boolean z) {
        Layout.Alignment alignment;
        int i;
        int i2;
        0qQ.A0B(spannable, 2);
        this.A03 = C358948bj.A00(spannable, 0, spannable.length());
        this.A05 = spannable.length();
        this.A01 = 00p.A0g(spannable.toString(), " ", "", false).length();
        for (C358848bZ r1 : (C358848bZ[]) C263324Kh.A06(spannable, C358848bZ.class)) {
            r1.A01 = 0.0f;
            r1.A00 = 0.0f;
        }
        if (z) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        this.A02 = new C17907Vhy(alignment, new SpannableStringBuilder(spannable), new TextPaint(textPaint), r12);
        C306576Mr r13 = this.A03;
        C306576Mr r4 = C306576Mr.OUTLINED;
        if (r13 == r4 || r13 == C306576Mr.INVERTED_OUTLINED) {
            Object[] A06 = C263324Kh.A06(spannable, AnonymousClass91R.class);
            ArrayList arrayList = new ArrayList();
            AnonymousClass91R r3 = (AnonymousClass91R) 03t.A06(A06, 0);
            if (r3 != null) {
                if (this.A03 == r4) {
                    i = r3.A02;
                } else {
                    i = r3.A01;
                }
                C358928bh r14 = r3.A09;
                arrayList.add(VBG.A00(textPaint, r14.A02, i));
                Float f = r14.A03;
                if (f != null) {
                    float floatValue = f.floatValue();
                    if (this.A03 == r4) {
                        i2 = r3.A01;
                    } else {
                        i2 = r3.A02;
                    }
                    arrayList.add(VBG.A00(textPaint, floatValue, i2));
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    TextPaint textPaint2 = (TextPaint) it.next();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannable);
                    spannableStringBuilder.setSpan(new C358848bZ(context, new TextColors(TextShadow.A03, textPaint2.getColor())), 0, this.A05, 0);
                    this.A04.add(new C17907Vhy(alignment, spannableStringBuilder, textPaint2, r12));
                }
            }
        }
    }

    public final float A00() {
        PathMeasure pathMeasure = new PathMeasure((Path) this.A02.A05.getValue(), false);
        float length = pathMeasure.getLength();
        while (pathMeasure.nextContour()) {
            length += pathMeasure.getLength();
        }
        return length;
    }

    public final float[] A02() {
        float[] fArr;
        Matrix matrix = new Matrix();
        matrix.setTranslate(this.A00, 0.0f);
        C17907Vhy vhy = this.A02;
        Collection collection = (Collection) vhy.A04.getValue();
        if (collection != null) {
            fArr = 00k.A0w(collection);
            if (vhy.A00 != 0.0f) {
                Matrix matrix2 = new Matrix();
                float f = vhy.A00;
                matrix2.setScale(f, f);
                matrix2.mapPoints(fArr);
                matrix.mapPoints(fArr);
                return fArr;
            }
        }
        fArr = new float[0];
        matrix.mapPoints(fArr);
        return fArr;
    }

    public final void A01(Canvas canvas) {
        canvas.save();
        canvas.translate(this.A00, 0.0f);
        for (C17907Vhy vhy : this.A04) {
            vhy.A01.draw(canvas);
        }
        canvas.restore();
    }
}
