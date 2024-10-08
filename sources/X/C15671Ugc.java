package X;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.NumberPicker;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

/* renamed from: X.Ugc  reason: case insensitive filesystem */
public final class C15671Ugc extends C14097Tpp {
    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        0qQ.A0B(context, 0);
        return new NumberPicker(context);
    }

    public final /* bridge */ /* synthetic */ Object A0K(View view, C307786Rm r21, C276544tV r22, Object obj) {
        WD3 wd3;
        NumberPicker numberPicker = (NumberPicker) view;
        C307786Rm r6 = r21;
        C276544tV r2 = r22;
        boolean A1b = C51973G9u.A1b(numberPicker, r6, r2);
        Month month = Month.JANUARY;
        TextStyle textStyle = TextStyle.FULL;
        month.getDisplayName(textStyle, Locale.getDefault());
        String[] strArr = {A00(month, textStyle), A00(Month.FEBRUARY, textStyle), A00(Month.MARCH, textStyle), A00(Month.APRIL, textStyle), A00(Month.MAY, textStyle), A00(Month.JUNE, textStyle), A00(Month.JULY, textStyle), A00(Month.AUGUST, textStyle), A00(Month.SEPTEMBER, textStyle), A00(Month.OCTOBER, textStyle), A00(Month.NOVEMBER, textStyle), A00(Month.DECEMBER, textStyle)};
        C277014uI A08 = r2.A08();
        if (A08 != null) {
            wd3 = new WD3(0, r2, r6, A08);
        } else {
            wd3 = null;
        }
        numberPicker.setOnValueChangedListener(wd3);
        numberPicker.setDisplayedValues(strArr);
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(11);
        if (r6.hashCode() != VKU.A01) {
            VKU.A01 = r6.hashCode();
            int A03 = r2.A03(35, VKU.A00) - A1b;
            VKU.A00 = A03;
            numberPicker.setValue(A03);
        } else {
            numberPicker.setValue(VKU.A00);
        }
        numberPicker.setWrapSelectorWheel(false);
        C51968G9o.A1D(numberPicker, -1);
        if (Build.VERSION.SDK_INT >= 29) {
            numberPicker.setSelectionDividerHeight(A1b ? 1 : 0);
        }
        0kx r23 = new 0kx(numberPicker);
        while (r23.hasNext()) {
            ((View) r23.next()).setFocusable(0);
        }
        return null;
    }

    public C15671Ugc(C307786Rm r1, C276544tV r2) {
        super(r1, r2);
    }

    public static String A00(Month month, TextStyle textStyle) {
        String displayName = month.getDisplayName(textStyle, Locale.getDefault());
        0qQ.A07(displayName);
        return VKU.A00(displayName);
    }
}
