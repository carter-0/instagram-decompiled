package com.facebook.react.bridge;

import X.Pxe;
import X.QZK;
import android.app.Activity;

public abstract class ReactContextBaseJavaModule extends BaseJavaModule {
    public final Activity getCurrentActivity() {
        return Pxe.A0T(this).A00();
    }

    public ReactContextBaseJavaModule(QZK qzk) {
        super(qzk);
    }

    public ReactContextBaseJavaModule() {
        super((QZK) null);
    }
}
