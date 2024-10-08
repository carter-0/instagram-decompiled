package com.facebook.cameracore.mediapipeline.services.audio.implementation;

import X.ASJ;
import X.ASM;
import X.C10772Rxq;
import X.C344997sl;
import X.C371718yv;
import com.facebook.cameracore.audiograph.AudioGraphClientProvider;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.musiceffect.AudioServiceConfigurationAnnouncer;
import com.facebook.cameracore.util.Reference;
import com.facebook.jni.HybridData;
import java.lang.ref.WeakReference;

public class AudioServiceConfigurationHybrid extends ServiceConfiguration {
    public final C371718yv mConfiguration;
    public final C344997sl mPlatformReleaser = new ASM(this);

    private native HybridData initHybrid(boolean z);

    public Reference createAudioPlatform() {
        AudioPlatformComponentHostImpl audioPlatformComponentHostImpl = new AudioPlatformComponentHostImpl(this.mConfiguration.A06, (C10772Rxq) null);
        C371718yv r1 = this.mConfiguration;
        audioPlatformComponentHostImpl.setMuted(r1.A05);
        audioPlatformComponentHostImpl.mExternalAudioProvider = r1.A01;
        audioPlatformComponentHostImpl.mAudioLogger = r1.A03;
        r1.A04 = new WeakReference(audioPlatformComponentHostImpl);
        return new ASJ(this.mPlatformReleaser, audioPlatformComponentHostImpl);
    }

    public AudioGraphClientProvider getAudioGraphClientProvider() {
        return this.mConfiguration.A00;
    }

    public AudioServiceConfigurationAnnouncer getAudioServiceConfigurationAnnouncer() {
        return this.mConfiguration.A02;
    }

    public AudioServiceConfigurationHybrid(C371718yv r2) {
        this.mHybridData = initHybrid(r2.A07);
        this.mConfiguration = r2;
    }
}
