package X;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.widget.DatePicker;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.facebook.react.bridge.WritableNativeMap;

public final class SVG implements DialogInterface.OnDismissListener, DatePickerDialog.OnDateSetListener {
    public boolean A00 = false;
    public final C13904TjR A01;
    public final /* synthetic */ DatePickerDialogModule A02;

    public SVG(DatePickerDialogModule datePickerDialogModule, C13904TjR tjR) {
        this.A02 = datePickerDialogModule;
        this.A01 = tjR;
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        if (!this.A00 && Pxe.A0T(this.A02).A0F()) {
            WritableNativeMap A0U = Pxe.A0U();
            A0U.putString("action", DatePickerDialogModule.ACTION_DATE_SET);
            A0U.putInt("year", i);
            A0U.putInt("month", i2);
            A0U.putInt("day", i3);
            this.A01.resolve(A0U);
            this.A00 = true;
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (!this.A00 && Pxe.A0T(this.A02).A0F()) {
            WritableNativeMap A0U = Pxe.A0U();
            A0U.putString("action", DatePickerDialogModule.ACTION_DISMISSED);
            this.A01.resolve(A0U);
            this.A00 = true;
        }
    }
}
