package X;

import com.facebook.react.DebugCorePackage;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.views.debuggingoverlay.DebuggingOverlayManager;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Sp1 implements C13716Tff {
    public final List ANL(QZK qzk) {
        List<SNI> emptyList;
        if (this instanceof DebugCorePackage) {
            DebugCorePackage debugCorePackage = (DebugCorePackage) this;
            Map map = debugCorePackage.A00;
            HashMap hashMap = map;
            if (map == null) {
                HashMap A1E = AnonymousClass7TE.A1E();
                A1E.put(DebuggingOverlayManager.REACT_CLASS, new SNI(new C13182TOo(3)));
                debugCorePackage.A00 = A1E;
                hashMap = A1E;
            }
            emptyList = Dba.A0e(hashMap);
        } else {
            emptyList = Collections.emptyList();
        }
        if (emptyList == null || emptyList.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (SNI sni : emptyList) {
            A1C.add(sni.A01.get());
        }
        return A1C;
    }

    public static void A00(AbstractMap abstractMap, Class[] clsArr, int i) {
        Class cls = clsArr[i];
        ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
        String name = reactModule.name();
        abstractMap.put(name, new SFW(name, cls.getName(), reactModule.canOverrideExistingModule(), reactModule.needsEagerInit(), reactModule.isCxxModule(), TurboModule.class.isAssignableFrom(cls)));
    }

    public final List AMR(QZK qzk) {
        throw AnonymousClass7TE.A1B("createNativeModules method is not supported. Use getModule() method instead.");
    }
}
