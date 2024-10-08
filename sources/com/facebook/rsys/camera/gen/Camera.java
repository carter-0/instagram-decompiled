package com.facebook.rsys.camera.gen;

import X.002;
import X.2LV;
import X.C41845B3m;
import X.C66583MXo;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;

public class Camera {
    public static final Camera BACK_FACING_CAMERA = new Camera("generic_back_facing", "Back facing camera");
    public static 2LV CONVERTER = C71546Omh.A00(23);
    public static final Camera DUAL_CAMERA = new Camera("generic_dual_camera", "Dual camera");
    public static final Camera FRONT_FACING_CAMERA = new Camera("generic_front_facing", "Front facing camera");
    public static long sMcfTypeId;
    public final String identifier;
    public final String name;

    public static native Camera createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Camera)) {
            return false;
        }
        Camera camera = (Camera) obj;
        return this.identifier.equals(camera.identifier) && this.name.equals(camera.name);
    }

    public int hashCode() {
        return C41845B3m.A01(this.name, C66583MXo.A06(this.identifier));
    }

    public String toString() {
        return 002.A11("Camera{identifier=", this.identifier, ",name=", this.name, "}");
    }

    public Camera(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.identifier = str;
        this.name = str2;
    }
}
