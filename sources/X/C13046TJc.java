package X;

import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.ultralight.UL;

/* renamed from: X.TJc  reason: case insensitive filesystem */
public final class C13046TJc implements Runnable {
    public final /* synthetic */ 0hq A00;
    public final /* synthetic */ DatePickerDialogModule A01;
    public final /* synthetic */ C13904TjR A02;
    public final /* synthetic */ ReadableMap A03;

    public C13046TJc(0hq r1, DatePickerDialogModule datePickerDialogModule, C13904TjR tjR, ReadableMap readableMap) {
        this.A01 = datePickerDialogModule;
        this.A03 = readableMap;
        this.A02 = tjR;
        this.A00 = r1;
    }

    public final void run() {
        0SM r3 = new 0SM();
        ReadableMap readableMap = this.A03;
        if (readableMap != null) {
            r3.setArguments(this.A01.createFragmentArguments(readableMap));
        }
        try {
            SVG svg = new SVG(this.A01, this.A02);
            r3.A01 = svg;
            r3.A00 = svg;
            r3.A0B(this.A00, "DatePickerAndroid");
        } catch (IllegalStateException e) {
            ((0Gb) Xr6.A00(UL.id._UL__ULSEP_com_facebook_common_errorreporting_FbErrorReporter_ULSEP_BINDING_ID)).Ew0("DatePickerAndroid", AnonymousClass7TF.A0m("Error trying to show dialog: ", e));
        }
    }
}
