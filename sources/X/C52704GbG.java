package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.GbG  reason: case insensitive filesystem */
public final class C52704GbG implements AnonymousClass2WK {
    public final C52703GbF A00;
    public final CharSequence A01;

    public final 2WL Cfk(2WI r11, long j) {
        TextView textView;
        Integer num;
        int measuredWidth;
        int intValue;
        0qQ.A0B(r11, 0);
        int A012 = C245063cG.A01(j);
        int A002 = C245063cG.A00(j);
        CharSequence charSequence = this.A01;
        Context context = r11.A00.A04;
        try {
            textView = new EditText(context, (AttributeSet) null);
            textView.setBackgroundResource(17170445);
        } catch (NullPointerException e) {
            String message = e.getMessage();
            if (message == null || !00l.A0d(message, "ConstantState.newDrawable", false)) {
                throw e;
            }
            View inflate = LayoutInflater.from(context).inflate(R.layout.fallback_text_input_view_for_measure, (ViewGroup) null, false);
            0qQ.A0C(inflate, "null cannot be cast to non-null type com.facebook.primitive.textinput.TextInputViewForMeasure");
            textView = (TextView) inflate;
        }
        C52703GbF gbF = this.A00;
        Integer num2 = gbF.A0J;
        if (num2 != null && (intValue = num2.intValue()) > -1) {
            textView.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(intValue)});
        }
        if (charSequence == null) {
            charSequence = gbF.A09;
        }
        textView.setText(charSequence);
        textView.setHint(gbF.A08);
        Integer num3 = gbF.A0F;
        if (num3 != null) {
            textView.setGravity(num3.intValue());
        }
        Rect rect = gbF.A00;
        if (rect != null) {
            textView.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        }
        C52705GbH gbH = gbF.A07;
        if (gbH != null) {
            textView.setTextSize(gbH.A01, gbH.A00);
        }
        Float f = gbF.A0B;
        Float f2 = gbF.A0A;
        float lineSpacingExtra = textView.getLineSpacingExtra();
        float lineSpacingMultiplier = textView.getLineSpacingMultiplier();
        if (f != null) {
            float floatValue = f.floatValue();
            float fontMetrics = textView.getPaint().getFontMetrics((Paint.FontMetrics) null);
            if (floatValue == fontMetrics) {
                lineSpacingExtra = 0.0f;
            } else {
                lineSpacingExtra = floatValue - fontMetrics;
            }
        }
        if (f2 != null) {
            lineSpacingMultiplier = f2.floatValue();
        }
        textView.setLineSpacing(lineSpacingExtra, lineSpacingMultiplier);
        Float f3 = gbF.A0C;
        if (f3 != null) {
            textView.setLetterSpacing(f3.floatValue());
        }
        C52701GbD gbD = gbF.A06;
        if (gbD != null) {
            num = Integer.valueOf(gbD.A00());
        } else {
            num = null;
        }
        C52715GbS gbS = gbF.A04;
        boolean z = gbF.A0R;
        int A003 = C52699GbB.A00(gbS, num, z);
        textView.setInputType(A003);
        Integer num4 = gbF.A0H;
        if (num4 != null) {
            textView.setMaxLines(num4.intValue());
        }
        if (z && !C52700GbC.A02(A003)) {
            textView.setSingleLine(true);
        }
        Typeface typeface = gbF.A01;
        if (typeface != null) {
            textView.setTypeface(typeface);
        }
        textView.measure(A012, A002);
        if (View.MeasureSpec.getMode(A012) == Integer.MIN_VALUE) {
            measuredWidth = View.MeasureSpec.getSize(A012);
        } else {
            measuredWidth = textView.getMeasuredWidth();
        }
        return new 2WL(C245133cN.A00(measuredWidth, textView.getMeasuredHeight()), (Object) null);
    }

    public C52704GbG(C52703GbF gbF, CharSequence charSequence) {
        this.A00 = gbF;
        this.A01 = charSequence;
    }

    public final /* bridge */ /* synthetic */ boolean CSo(Object obj) {
        return C51975G9x.A1Y(obj, this);
    }
}
