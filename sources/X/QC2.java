package X;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.instagram.android.R;

public abstract class QC2 extends 0SM {
    public C13552TcO A00;
    public C11508SbV A01;

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0019 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0G() {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.QKQ
            if (r0 == 0) goto L_0x001b
            android.os.Bundle r1 = r4.mArguments
            r3 = 0
            if (r1 == 0) goto L_0x001a
            java.lang.String r0 = "contact_info"
            android.os.Parcelable r2 = r1.getParcelable(r0)
            java.lang.Class<com.facebook.browser.lite.extensions.autofill.model.AutofillData> r1 = com.facebook.browser.lite.extensions.autofill.model.AutofillData.class
            android.os.Parcelable$Creator r0 = com.facebook.browser.lite.extensions.autofill.model.AutofillData.CREATOR
            java.lang.Object r0 = X.0B0.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x001a
        L_0x0019:
            r3 = 1
        L_0x001a:
            return r3
        L_0x001b:
            boolean r0 = r4 instanceof X.QKI
            if (r0 == 0) goto L_0x0033
            android.os.Bundle r1 = r4.mArguments
            r3 = 0
            if (r1 == 0) goto L_0x001a
            java.lang.String r0 = "contact_entries"
            java.util.ArrayList r0 = r1.getParcelableArrayList(r0)
            if (r0 == 0) goto L_0x001a
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x001a
            goto L_0x0019
        L_0x0033:
            boolean r0 = r4 instanceof X.QKK
            if (r0 != 0) goto L_0x0019
            boolean r0 = r4 instanceof X.QKC
            if (r0 != 0) goto L_0x0019
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QC2.A0G():boolean");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1774957017);
        Window window = this.A01.getWindow();
        window.setBackgroundDrawableResource(R.drawable.bottom_sheet_background);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 80;
        attributes.windowAnimations = R.style.bottom_sheet_animation;
        window.setAttributes(attributes);
        View onCreateView = QC2.super.onCreateView(layoutInflater, viewGroup, bundle);
        AnonymousClass0fD.A09(385776366, A02);
        return onCreateView;
    }

    public void onStart() {
        int A02 = AnonymousClass0fD.A02(-292906859);
        QC2.super.onStart();
        C13552TcO tcO = this.A00;
        if (tcO != null) {
            tcO.D8h();
            this.A00 = null;
        }
        Dialog dialog = this.A01;
        if (dialog != null) {
            dialog.getWindow().setLayout(-1, -2);
        }
        AnonymousClass0fD.A09(514735181, A02);
    }
}
