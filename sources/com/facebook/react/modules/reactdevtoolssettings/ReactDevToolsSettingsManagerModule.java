package com.facebook.react.modules.reactdevtoolssettings;

import X.0qQ;
import X.C9542Rcf;
import X.Pxe;
import X.Pxf;
import X.QZK;
import android.content.SharedPreferences;
import com.facebook.fbreact.specs.NativeReactDevToolsSettingsManagerSpec;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "ReactDevToolsSettingsManager")
public final class ReactDevToolsSettingsManagerModule extends NativeReactDevToolsSettingsManagerSpec {
    public static final C9542Rcf Companion = new Object();
    public static final String KEY_HOOK_SETTINGS = "HookSettings";
    public static final String SHARED_PREFERENCES_PREFIX = "ReactNative__DevToolsSettings";
    public final SharedPreferences sharedPreferences;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReactDevToolsSettingsManagerModule(QZK qzk) {
        super(qzk);
        0qQ.A0B(qzk, 1);
        SharedPreferences A0H = Pxe.A0H(qzk, SHARED_PREFERENCES_PREFIX);
        0qQ.A07(A0H);
        this.sharedPreferences = A0H;
    }

    public void setGlobalHookSettings(String str) {
        0qQ.A0B(str, 0);
        Pxf.A13(this.sharedPreferences.edit(), KEY_HOOK_SETTINGS, str);
    }

    public String getGlobalHookSettings() {
        return this.sharedPreferences.getString(KEY_HOOK_SETTINGS, (String) null);
    }
}
