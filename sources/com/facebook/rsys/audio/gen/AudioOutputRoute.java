package com.facebook.rsys.audio.gen;

import X.002;
import X.2LV;
import X.C41845B3m;
import X.C66583MXo;
import X.C71546Omh;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.djinni.msys.infra.McfReference;

public class AudioOutputRoute {
    public static final AudioOutputRoute BLUETOOTH = new AudioOutputRoute("bluetooth_device", NetInfoModule.CONNECTION_TYPE_BLUETOOTH);
    public static final AudioOutputRoute BLUETOOTH_A2DP = new AudioOutputRoute("bluetooth_device", "BluetoothA2DPOutput");
    public static final AudioOutputRoute BLUETOOTH_HFP = new AudioOutputRoute("bluetooth_device", "BluetoothHFP");
    public static final AudioOutputRoute BLUETOOTH_LE = new AudioOutputRoute("bluetooth_device", "BluetoothLE");
    public static 2LV CONVERTER = C71546Omh.A00(4);
    public static final AudioOutputRoute EARPIECE = new AudioOutputRoute("earpiece_device", "earpiece");
    public static final AudioOutputRoute HEADSET = new AudioOutputRoute("headset_device", "headset");
    public static final AudioOutputRoute SPEAKER = new AudioOutputRoute("speaker_device", "speaker");
    public static final AudioOutputRoute UNKNOWN = new AudioOutputRoute("unknown_device", "unknown");
    public static long sMcfTypeId;
    public final String identifier;
    public final String name;

    public static native AudioOutputRoute createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioOutputRoute)) {
            return false;
        }
        AudioOutputRoute audioOutputRoute = (AudioOutputRoute) obj;
        return this.identifier.equals(audioOutputRoute.identifier) && this.name.equals(audioOutputRoute.name);
    }

    public int hashCode() {
        return C41845B3m.A01(this.name, C66583MXo.A06(this.identifier));
    }

    public String toString() {
        return 002.A11("AudioOutputRoute{identifier=", this.identifier, ",name=", this.name, "}");
    }

    public AudioOutputRoute(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.identifier = str;
        this.name = str2;
    }
}
