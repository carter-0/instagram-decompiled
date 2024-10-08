package X;

import com.facebookpay.form.cell.logging.FormCellFocusEvents;
import com.facebookpay.form.cell.logging.FormCellLoggingEvents;

/* renamed from: X.S9c  reason: case insensitive filesystem */
public abstract class C11082S9c {
    public static 0eP A01(Object obj, String str) {
        return new 0eP(obj, new FormCellLoggingEvents(new FormCellFocusEvents("client_add_credentialdetails_atomic", "client_add_credentialdetails_fail", "client_add_credentialdetails_success", str)));
    }

    public static 0eP A00(Object obj, String str) {
        return new 0eP(obj, new FormCellLoggingEvents(new FormCellFocusEvents("user_click_shippingaddressdetails_atomic", "client_add_shippingaddressdetails_fail", "client_add_shippingaddressdetails_success", str)));
    }
}
