package X;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.module.annotations.ReactModule;

public final class SNI {
    public final String A00;
    public final AnonymousClass0eK A01;

    public static SNI A00(Class cls, AnonymousClass0eK r4) {
        String name;
        ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
        if (reactModule == null) {
            0I1.A04("ModuleSpec", 002.A0g("Could not find @ReactModule annotation on ", cls.getName(), ". So creating the module eagerly to get the name. Consider adding an annotation to make this Lazy"));
            name = ((NativeModule) r4.get()).getName();
        } else {
            name = reactModule.name();
        }
        return new SNI(name, r4);
    }

    public SNI(String str, AnonymousClass0eK r2) {
        this.A01 = r2;
        this.A00 = str;
    }

    public SNI(AnonymousClass0eK r2) {
        this.A01 = r2;
        this.A00 = null;
    }
}
