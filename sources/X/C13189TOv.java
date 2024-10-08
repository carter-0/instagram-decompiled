package X;

import com.facebook.fbreact.specs.NativeDevMenuSpec;
import com.facebook.fbreact.specs.NativeDevSettingsSpec;
import com.facebook.fbreact.specs.NativeDeviceInfoSpec;
import com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec;
import com.facebook.fbreact.specs.NativeJSCHeapCaptureSpec;
import com.facebook.fbreact.specs.NativePlatformConstantsAndroidSpec;
import com.facebook.fbreact.specs.NativeSourceCodeSpec;
import com.facebook.react.CoreModulesPackage;
import com.facebook.react.DebugCorePackage;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.devsupport.JSCHeapCapture;
import com.facebook.react.devsupport.LogBoxModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ExceptionsManagerModule;
import com.facebook.react.modules.core.TimingModule;
import com.facebook.react.modules.debug.DevMenuModule;
import com.facebook.react.modules.debug.DevSettingsModule;
import com.facebook.react.modules.debug.SourceCodeModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.TOv  reason: case insensitive filesystem */
public final class C13189TOv implements AnonymousClass0eK {
    public final QZK A00;
    public final String A01;
    public final /* synthetic */ Sp1 A02;

    public C13189TOv(Sp1 sp1, QZK qzk, String str) {
        this.A02 = sp1;
        this.A01 = str;
        this.A00 = qzk;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        ArrayList arrayList;
        int i;
        Sp1 sp1 = this.A02;
        String str = this.A01;
        QZK qzk = this.A00;
        if (!(sp1 instanceof DebugCorePackage)) {
            CoreModulesPackage coreModulesPackage = (CoreModulesPackage) sp1;
            switch (str.hashCode()) {
                case -2013505529:
                    if (str.equals("LogBox")) {
                        return new LogBoxModule(qzk, coreModulesPackage.A01.A0A);
                    }
                    break;
                case -1789797270:
                    if (str.equals("Timing")) {
                        return new TimingModule(qzk, coreModulesPackage.A01.A0A);
                    }
                    break;
                case -1633589448:
                    if (str.equals(NativeDevSettingsSpec.NAME)) {
                        return new DevSettingsModule(qzk, coreModulesPackage.A01.A0A);
                    }
                    break;
                case -1520650172:
                    if (str.equals(NativeDeviceInfoSpec.NAME)) {
                        return new DeviceInfoModule(qzk);
                    }
                    break;
                case -1071344908:
                    if (str.equals(NativeDevMenuSpec.NAME)) {
                        return new DevMenuModule(qzk, coreModulesPackage.A01.A0A);
                    }
                    break;
                case -1037217463:
                    if (str.equals("DeviceEventManager")) {
                        return new DeviceEventManagerModule(qzk, coreModulesPackage.A02);
                    }
                    break;
                case -790603268:
                    if (str.equals(NativePlatformConstantsAndroidSpec.NAME)) {
                        return new BaseJavaModule(qzk);
                    }
                    break;
                case 512434409:
                    if (str.equals("ExceptionsManager")) {
                        return new ExceptionsManagerModule(coreModulesPackage.A01.A0A);
                    }
                    break;
                case 881516744:
                    if (str.equals(NativeSourceCodeSpec.NAME)) {
                        return new SourceCodeModule(qzk);
                    }
                    break;
                case 1256514152:
                    if (str.equals(NativeHeadlessJsTaskSupportSpec.NAME)) {
                        return new BaseJavaModule(qzk);
                    }
                    break;
                case 1861242489:
                    if (str.equals(UIManagerModule.NAME)) {
                        ReactMarker.logMarker(RH1.A0T);
                        0fc.A01(8192, "createUIManagerModule", -1318039336);
                        try {
                            SSW ssw = coreModulesPackage.A01;
                            ReactMarker.logMarker(RH1.A0V);
                            0fc.A01(8192, "createAllViewManagers", -1925276048);
                            try {
                                if (ssw.A04 == null) {
                                    List<C13716Tff> list = ssw.A0E;
                                    synchronized (list) {
                                        if (ssw.A04 == null) {
                                            ArrayList A1C = AnonymousClass7TE.A1C();
                                            for (C13716Tff ANL : list) {
                                                A1C.addAll(ANL.ANL(qzk));
                                            }
                                            ssw.A04 = A1C;
                                            i = 976339579;
                                            arrayList = A1C;
                                        }
                                    }
                                    0fc.A00(8192, i);
                                    ReactMarker.logMarker(RH1.A0U);
                                    UIManagerModule uIManagerModule = new UIManagerModule(qzk, arrayList, coreModulesPackage.A00);
                                    0fc.A00(8192, 1656188881);
                                    ReactMarker.logMarker(RH1.A0S);
                                    return uIManagerModule;
                                }
                                i = -1670965249;
                                arrayList = ssw.A04;
                                0fc.A00(8192, i);
                                ReactMarker.logMarker(RH1.A0U);
                                UIManagerModule uIManagerModule2 = new UIManagerModule(qzk, arrayList, coreModulesPackage.A00);
                                0fc.A00(8192, 1656188881);
                                ReactMarker.logMarker(RH1.A0S);
                                return uIManagerModule2;
                            } catch (Throwable th) {
                                0fc.A00(8192, 142818296);
                                ReactMarker.logMarker(RH1.A0U);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            0fc.A00(8192, 1283444191);
                            ReactMarker.logMarker(RH1.A0S);
                            throw th2;
                        }
                    }
                    break;
            }
            throw AnonymousClass7TF.A0W("In CoreModulesPackage, could not find Native module for ", str);
        } else if (!str.equals(NativeJSCHeapCaptureSpec.NAME)) {
            return null;
        } else {
            return new JSCHeapCapture(qzk);
        }
    }
}
