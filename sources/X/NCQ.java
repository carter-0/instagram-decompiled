package X;

import com.facebook.rsys.audio.gen.AudioApi;
import com.facebook.rsys.audio.gen.AudioDeviceModule;
import com.facebook.rsys.audio.gen.AudioInputRoute;
import com.facebook.rsys.audio.gen.AudioOutputRoute;
import com.facebook.rsys.audio.gen.AudioProxy;
import java.util.ArrayList;

public final class NCQ extends NCS {
    public final AudioProxy A00;

    public final void setApi(AudioApi audioApi) {
        0qQ.A0B(audioApi, 0);
        this.A00.setApi(audioApi);
    }

    public final void setAudioDeviceModule(AudioDeviceModule audioDeviceModule) {
        0qQ.A0B(audioDeviceModule, 0);
        this.A00.setAudioDeviceModule(audioDeviceModule);
    }

    public final void setAudioInputRoute(AudioInputRoute audioInputRoute) {
        0qQ.A0B(audioInputRoute, 0);
        this.A00.setAudioInputRoute(audioInputRoute);
    }

    public final void setAudioOutputRoute(AudioOutputRoute audioOutputRoute, boolean z, boolean z2) {
        0qQ.A0B(audioOutputRoute, 0);
        this.A00.setAudioOutputRoute(audioOutputRoute, z, z2);
    }

    public final ArrayList createAvailableAudioInputRoutes() {
        ArrayList createAvailableAudioInputRoutes = this.A00.createAvailableAudioInputRoutes();
        0qQ.A07(createAvailableAudioInputRoutes);
        return createAvailableAudioInputRoutes;
    }

    public final ArrayList createAvailableAudioOutputRoutes() {
        ArrayList createAvailableAudioOutputRoutes = this.A00.createAvailableAudioOutputRoutes();
        0qQ.A07(createAvailableAudioOutputRoutes);
        return createAvailableAudioOutputRoutes;
    }

    public final void setAudioOn(boolean z, boolean z2) {
        this.A00.setAudioOn(z, z2);
    }

    public final void setIsCallActive(boolean z) {
        this.A00.setIsCallActive(z);
    }

    public NCQ(AudioProxy audioProxy) {
        this.A00 = audioProxy;
    }
}
