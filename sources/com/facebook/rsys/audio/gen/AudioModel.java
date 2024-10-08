package com.facebook.rsys.audio.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C66583MXo;
import X.C66584MXp;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

public class AudioModel {
    public static 2LV CONVERTER = C71546Omh.A00(3);
    public static long sMcfTypeId;
    public final int activeAudioInputRouteIdx;
    public final int activeAudioOutputRouteIdx;
    public final int audioActivationState;
    public final boolean audioBufferingStarted;
    public final ArrayList availableAudioInputRoutes;
    public final ArrayList availableAudioOutputRoutes;
    public final boolean hasUsedBluetoothAudioOutputRoute;
    public final boolean isInitialModel;
    public final boolean micOn;
    public final boolean micOnDesired;
    public final boolean noiseSuppressionOn;
    public final boolean shouldResetNsAecAlgorithms;

    public static native AudioModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioModel)) {
            return false;
        }
        AudioModel audioModel = (AudioModel) obj;
        return this.audioActivationState == audioModel.audioActivationState && this.micOnDesired == audioModel.micOnDesired && this.micOn == audioModel.micOn && this.noiseSuppressionOn == audioModel.noiseSuppressionOn && this.shouldResetNsAecAlgorithms == audioModel.shouldResetNsAecAlgorithms && this.activeAudioInputRouteIdx == audioModel.activeAudioInputRouteIdx && this.availableAudioInputRoutes.equals(audioModel.availableAudioInputRoutes) && this.hasUsedBluetoothAudioOutputRoute == audioModel.hasUsedBluetoothAudioOutputRoute && this.activeAudioOutputRouteIdx == audioModel.activeAudioOutputRouteIdx && this.availableAudioOutputRoutes.equals(audioModel.availableAudioOutputRoutes) && this.audioBufferingStarted == audioModel.audioBufferingStarted && this.isInitialModel == audioModel.isInitialModel;
    }

    public int hashCode() {
        ArrayList arrayList = this.availableAudioInputRoutes;
        return ((AnonymousClass7TF.A07(this.availableAudioOutputRoutes, (((AnonymousClass7TF.A07(arrayList, (((((((((C66583MXo.A01(this.audioActivationState) + (this.micOnDesired ? 1 : 0)) * 31) + (this.micOn ? 1 : 0)) * 31) + (this.noiseSuppressionOn ? 1 : 0)) * 31) + (this.shouldResetNsAecAlgorithms ? 1 : 0)) * 31) + this.activeAudioInputRouteIdx) * 31) + (this.hasUsedBluetoothAudioOutputRoute ? 1 : 0)) * 31) + this.activeAudioOutputRouteIdx) * 31) + (this.audioBufferingStarted ? 1 : 0)) * 31) + (this.isInitialModel ? 1 : 0);
    }

    public AudioModel(int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, ArrayList arrayList, boolean z5, int i3, ArrayList arrayList2, boolean z6, boolean z7) {
        arrayList.getClass();
        arrayList2.getClass();
        this.audioActivationState = i;
        this.micOnDesired = z;
        this.micOn = z2;
        this.noiseSuppressionOn = z3;
        this.shouldResetNsAecAlgorithms = z4;
        this.activeAudioInputRouteIdx = i2;
        this.availableAudioInputRoutes = arrayList;
        this.hasUsedBluetoothAudioOutputRoute = z5;
        this.activeAudioOutputRouteIdx = i3;
        this.availableAudioOutputRoutes = arrayList2;
        this.audioBufferingStarted = z6;
        this.isInitialModel = z7;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AudioModel{audioActivationState=");
        A1A.append(this.audioActivationState);
        A1A.append(",micOnDesired=");
        A1A.append(this.micOnDesired);
        A1A.append(",micOn=");
        A1A.append(this.micOn);
        A1A.append(",noiseSuppressionOn=");
        A1A.append(this.noiseSuppressionOn);
        A1A.append(",shouldResetNsAecAlgorithms=");
        A1A.append(this.shouldResetNsAecAlgorithms);
        A1A.append(",activeAudioInputRouteIdx=");
        A1A.append(this.activeAudioInputRouteIdx);
        A1A.append(",availableAudioInputRoutes=");
        A1A.append(this.availableAudioInputRoutes);
        A1A.append(",hasUsedBluetoothAudioOutputRoute=");
        A1A.append(this.hasUsedBluetoothAudioOutputRoute);
        A1A.append(",activeAudioOutputRouteIdx=");
        A1A.append(this.activeAudioOutputRouteIdx);
        A1A.append(",availableAudioOutputRoutes=");
        A1A.append(this.availableAudioOutputRoutes);
        A1A.append(",audioBufferingStarted=");
        A1A.append(this.audioBufferingStarted);
        A1A.append(",isInitialModel=");
        return C66584MXp.A0b(A1A, this.isInitialModel);
    }
}
