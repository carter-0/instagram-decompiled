package X;

import com.facebook.rsys.audiomixerholder.gen.AudioMixerHolder;
import com.facebook.rsys.audiomodule.gen.AudioModule;
import com.facebook.rsys.callmanager.gen.CallManagerClient;
import com.facebook.rsys.environmentvariables.gen.EnvironmentVariablesProxy;
import com.facebook.rsys.execution.gen.TaskExecutor;

/* renamed from: X.NCh  reason: case insensitive filesystem */
public final class C68366NCh extends CallManagerClient {
    public final /* synthetic */ C71143Odx A00;

    public final AudioMixerHolder getAudioMixerHolder() {
        return null;
    }

    public final TaskExecutor getTaskExecutor() {
        return null;
    }

    public C68366NCh(C71143Odx odx) {
        this.A00 = odx;
    }

    public final AudioModule getAudioModule() {
        return this.A00.A03;
    }

    public final EnvironmentVariablesProxy getEnvironmentVariables() {
        return this.A00.A0N;
    }
}
