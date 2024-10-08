package com.instagram.react.modules.base;

import X.0xn;
import X.C13904TjR;
import X.QZK;
import android.content.Context;
import com.facebook.fbreact.specs.NativeIGSharedPreferencesModuleSpec;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "IGSharedPreferencesModule")
public class IgSharedPreferencesModule extends NativeIGSharedPreferencesModuleSpec {
    public static final String MODULE_NAME = "IGSharedPreferencesModule";
    public Context mContext;

    public String getName() {
        return "IGSharedPreferencesModule";
    }

    public void getBoolean(String str, String str2, boolean z, C13904TjR tjR) {
        tjR.resolve(Boolean.valueOf(0xn.A00(this.mContext, str).getBoolean(str2, z)));
    }

    public void getString(String str, String str2, String str3, C13904TjR tjR) {
        tjR.resolve(0xn.A00(this.mContext, str).getString(str2, str3));
    }

    public IgSharedPreferencesModule(QZK qzk) {
        super(qzk);
        this.mContext = qzk.getApplicationContext();
    }
}
