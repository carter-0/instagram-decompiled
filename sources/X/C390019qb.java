package X;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannedString;
import android.widget.EditText;
import com.instagram.ui.text.ConstrainedEditText;

/* renamed from: X.9qb  reason: invalid class name and case insensitive filesystem */
public final class C390019qb extends W7f {
    public static final InputFilter[] A05 = new InputFilter[0];
    public CharSequence A00 = "";
    public final SpannedString A01;
    public final EditText A02;
    public final C379049Sf A03;
    public final InputFilter[] A04;

    public C390019qb(SpannedString spannedString, EditText editText, C379049Sf r4, InputFilter[] inputFilterArr) {
        this.A02 = editText;
        this.A04 = inputFilterArr;
        this.A01 = spannedString;
        this.A03 = r4;
    }

    public final void afterTextChanged(Editable editable) {
        C379049Sf r2;
        int i;
        if (editable.length() > 0) {
            if (editable.charAt(0) != '#') {
                editable.insert(0, "#");
                return;
            } else if (editable.length() > 1) {
                C379049Sf r1 = this.A03;
                if (!A0K.A00(editable)) {
                    r1.A01(this.A00);
                    return;
                }
            }
        }
        if (editable.length() <= 1) {
            EditText editText = this.A02;
            editText.setFilters(A05);
            editable.clear();
            editText.setFilters(this.A04);
            r2 = this.A03;
            SpannedString spannedString = this.A01;
            ConstrainedEditText constrainedEditText = r2.A02;
            constrainedEditText.getClass();
            constrainedEditText.setHint(spannedString);
            r2.A03 = true;
        } else {
            r2 = this.A03;
            if (r2.A03) {
                ConstrainedEditText constrainedEditText2 = r2.A02;
                constrainedEditText2.getClass();
                constrainedEditText2.setHint((CharSequence) null);
                r2.A03 = false;
            }
        }
        CharSequence charSequence = this.A00;
        String charSequence2 = editable.toString();
        Paint paint = r2.A01;
        paint.getClass();
        if (charSequence2 != null) {
            i = charSequence2.length();
        } else {
            i = 0;
        }
        Rect rect = r2.A06;
        paint.getTextBounds(charSequence2, 0, i, rect);
        ConstrainedEditText constrainedEditText3 = r2.A02;
        constrainedEditText3.getClass();
        int A0G = AnonymousClass7TE.A0G(constrainedEditText3.getResources());
        ConstrainedEditText constrainedEditText4 = r2.A02;
        constrainedEditText4.getClass();
        int paddingLeft = constrainedEditText4.getPaddingLeft();
        ConstrainedEditText constrainedEditText5 = r2.A02;
        constrainedEditText5.getClass();
        int paddingRight = paddingLeft + constrainedEditText5.getPaddingRight() + (A0G * 2);
        int width = r2.A09.getWidth();
        int width2 = rect.width() + paddingRight;
        Paint paint2 = r2.A01;
        paint2.getClass();
        float textSize = paint2.getTextSize();
        float f = r2.A04;
        if (width2 <= width) {
            while (true) {
                textSize += f * 0.1f;
                if (textSize > f) {
                    break;
                }
                Paint paint3 = r2.A01;
                paint3.getClass();
                paint3.setTextSize(textSize);
                Paint paint4 = r2.A01;
                paint4.getClass();
                paint4.getTextBounds(charSequence2, 0, i, rect);
                if (rect.width() + paddingRight > width) {
                    Paint paint5 = r2.A01;
                    paint5.getClass();
                    ConstrainedEditText constrainedEditText6 = r2.A02;
                    constrainedEditText6.getClass();
                    paint5.setTextSize(constrainedEditText6.getTextSize());
                    break;
                }
                ConstrainedEditText constrainedEditText7 = r2.A02;
                constrainedEditText7.getClass();
                constrainedEditText7.setTextSize(0, textSize);
            }
        } else {
            while (true) {
                textSize -= f * 0.1f;
                if (textSize < r2.A05) {
                    r2.A01(charSequence);
                    break;
                }
                Paint paint6 = r2.A01;
                paint6.getClass();
                paint6.setTextSize(textSize);
                Paint paint7 = r2.A01;
                paint7.getClass();
                paint7.getTextBounds(charSequence2, 0, i, rect);
                if (rect.width() + paddingRight <= width) {
                    ConstrainedEditText constrainedEditText8 = r2.A02;
                    constrainedEditText8.getClass();
                    constrainedEditText8.setTextSize(0, textSize);
                    break;
                }
            }
        }
        this.A00 = editable.toString();
    }
}
