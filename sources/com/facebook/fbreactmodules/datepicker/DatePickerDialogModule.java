package com.facebook.fbreactmodules.datepicker;

import X.0SM;
import X.0hq;
import X.AnonymousClass7TE;
import X.C13046TJc;
import X.C13904TjR;
import X.Pxe;
import X.Pxi;
import X.Pxk;
import X.QZK;
import X.RLW;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.fbreact.specs.NativeDatePickerAndroidSpec;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "DatePickerAndroid")
public class DatePickerDialogModule extends NativeDatePickerAndroidSpec {
    public static final String ACTION_DATE_SET = "dateSetAction";
    public static final String ACTION_DISMISSED = "dismissedAction";
    public static final String ARG_DATE = "date";
    public static final String ARG_MAXDATE = "maxDate";
    public static final String ARG_MINDATE = "minDate";
    public static final String ARG_MODE = "mode";
    public static final String ERROR_NO_ACTIVITY = "E_NO_ACTIVITY";
    public static final String FRAGMENT_TAG = "DatePickerAndroid";
    public RLW _UL_mInjectionContext;

    /* access modifiers changed from: private */
    public Bundle createFragmentArguments(ReadableMap readableMap) {
        Bundle A0a = AnonymousClass7TE.A0a();
        Pxk.A0P(A0a, readableMap, ARG_DATE);
        Pxk.A0P(A0a, readableMap, ARG_MINDATE);
        Pxk.A0P(A0a, readableMap, ARG_MAXDATE);
        if (readableMap.hasKey(ARG_MODE) && !readableMap.isNull(ARG_MODE)) {
            A0a.putString(ARG_MODE, readableMap.getString(ARG_MODE));
        }
        return A0a;
    }

    public void open(ReadableMap readableMap, C13904TjR tjR) {
        FragmentActivity A00 = Pxe.A0T(this).A00();
        if (A00 == null || !(A00 instanceof FragmentActivity)) {
            Pxi.A1K(ERROR_NO_ACTIVITY, tjR, "Tried to open a DatePicker dialog while not attached to a FragmentActivity");
            return;
        }
        FragmentActivity fragmentActivity = A00;
        0hq supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        0SM A0R = supportFragmentManager.A0R("DatePickerAndroid");
        if (A0R != null) {
            A0R.A07();
        }
        fragmentActivity.runOnUiThread(new C13046TJc(supportFragmentManager, this, tjR, readableMap));
    }

    public DatePickerDialogModule(QZK qzk) {
        super(qzk);
    }
}
