package X;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Calendar;

/* renamed from: X.Vtr  reason: case insensitive filesystem */
public final class C18539Vtr {
    public static boolean A00;
    public static final C18539Vtr A01 = new Object();

    /* JADX WARNING: type inference failed for: r13v0, types: [java.lang.Object, X.0rk] */
    /* JADX WARNING: type inference failed for: r14v0, types: [java.lang.Object, X.0rk] */
    public final void A00(Context context, Integer num, Integer num2, C62320sa r29, 0sL r30) {
        if (!A00) {
            Context context2 = context;
            C358248ab r3 = new C358248ab(context2);
            View A0D = DbT.A0D(LayoutInflater.from(context2), (ViewGroup) null, R.layout.school_graduation_date_picker_dialog, false);
            r3.A0k(A0D);
            int A06 = DbZ.A06(Calendar.getInstance()) + 1;
            int i = Calendar.getInstance().get(1);
            int i2 = 1;
            int i3 = Calendar.getInstance().get(1);
            ArrayList A1M = 0sr.A1M(new Integer[]{Integer.valueOf(i3)});
            do {
                AnonymousClass7TF.A1M(A1M, i3 + i2);
                i2++;
            } while (i2 < 5);
            Integer[] numArr = (Integer[]) A1M.toArray(new Integer[0]);
            View requireViewById = A0D.requireViewById(R.id.year_picker);
            NumberPicker numberPicker = (NumberPicker) requireViewById;
            numberPicker.setMaxValue(r9 - 1);
            numberPicker.setMinValue(0);
            ArrayList arrayList = new ArrayList(r9);
            for (Integer intValue : numArr) {
                arrayList.add(String.valueOf(intValue.intValue()));
            }
            numberPicker.setDisplayedValues(DbU.A1b(arrayList, 0));
            numberPicker.setWrapSelectorWheel(false);
            Integer num3 = num2;
            if (num2 != null) {
                numberPicker.setValue(03t.A02(numArr, num3));
            }
            0qQ.A07(requireViewById);
            View requireViewById2 = A0D.requireViewById(R.id.month_picker);
            NumberPicker numberPicker2 = (NumberPicker) requireViewById2;
            String[] stringArray = context2.getResources().getStringArray(R.array.graduation_date_picker_months);
            0qQ.A07(stringArray);
            numberPicker2.setMaxValue(stringArray.length);
            numberPicker2.setMinValue(1);
            numberPicker2.setDisplayedValues(stringArray);
            numberPicker2.setWrapSelectorWheel(false);
            if (num != null) {
                numberPicker2.setValue(num.intValue());
            } else {
                numberPicker2.setValue(A06);
            }
            0qQ.A07(requireViewById2);
            ? obj = new Object();
            ? obj2 = new Object();
            numberPicker.setOnScrollListener(new WD1(numberPicker, numberPicker2, obj, obj2, numArr, i, A06));
            numberPicker2.setOnScrollListener(new WD2(numberPicker, numberPicker2, obj2, obj, numArr, i, A06));
            int i4 = A06;
            numberPicker.setOnValueChangedListener(new WD4(numberPicker, numberPicker2, obj, obj2, numArr, i, i4, 0));
            numberPicker2.setOnValueChangedListener(new WD4(numberPicker, numberPicker2, obj, obj2, numArr, i, i4, 1));
            C18835W4z w4z = new C18835W4z(3, numberPicker2, r30, numArr, numberPicker);
            W5U w5u = new W5U(r29, 42);
            r3.A0I(w4z, 2131972502);
            r3.A0C(w5u);
            r3.A02();
            Dialog A02 = r3.A02();
            A00 = true;
            AnonymousClass0fN.A00(A02);
        }
    }
}
