package com.facebook.react;

import X.AnonymousClass7TE;
import X.C13570Tcq;
import X.SFW;
import com.facebook.fbreact.specs.NativeDevMenuSpec;
import com.facebook.fbreact.specs.NativeDevSettingsSpec;
import com.facebook.fbreact.specs.NativeDeviceInfoSpec;
import com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec;
import com.facebook.fbreact.specs.NativePlatformConstantsAndroidSpec;
import com.facebook.fbreact.specs.NativeSourceCodeSpec;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.HashMap;
import java.util.Map;

public class CoreModulesPackage$$ReactModuleInfoProvider implements C13570Tcq {
    public final Map Bjl() {
        HashMap A1E = AnonymousClass7TE.A1E();
        SFW.A00(NativePlatformConstantsAndroidSpec.NAME, "com.facebook.react.modules.systeminfo.AndroidInfoModule", A1E);
        SFW.A00("DeviceEventManager", "com.facebook.react.modules.core.DeviceEventManagerModule", A1E);
        SFW.A00(NativeDeviceInfoSpec.NAME, "com.facebook.react.modules.deviceinfo.DeviceInfoModule", A1E);
        SFW.A00(NativeDevMenuSpec.NAME, "com.facebook.react.modules.debug.DevMenuModule", A1E);
        SFW.A00(NativeDevSettingsSpec.NAME, "com.facebook.react.modules.debug.DevSettingsModule", A1E);
        SFW.A00("ExceptionsManager", "com.facebook.react.modules.core.ExceptionsManagerModule", A1E);
        SFW.A00("LogBox", "com.facebook.react.devsupport.LogBoxModule", A1E);
        SFW.A00(NativeHeadlessJsTaskSupportSpec.NAME, "com.facebook.react.modules.core.HeadlessJsTaskSupportModule", A1E);
        SFW.A00(NativeSourceCodeSpec.NAME, "com.facebook.react.modules.debug.SourceCodeModule", A1E);
        SFW.A00("Timing", "com.facebook.react.modules.core.TimingModule", A1E);
        A1E.put(UIManagerModule.NAME, new SFW(UIManagerModule.NAME, "com.facebook.react.uimanager.UIManagerModule", false, false, false, false));
        return A1E;
    }
}
