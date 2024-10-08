package com.meta.arfx.engine.interfaces;

import android.os.IInterface;
import android.view.Surface;
import com.facebook.cameracore.util.memory.VersionedSharedMemory;
import java.util.List;

public interface IAREngineServiceController extends IInterface {
    void AHJ();

    void APu(List list, int i, int i2, int i3, long j, long j2, boolean z);

    void EFA(IARAnalyticsLoggerHost iARAnalyticsLoggerHost, IARExperimentUtilBinding iARExperimentUtilBinding, IARNetworkClientWorkerHost iARNetworkClientWorkerHost, int i, int i2, boolean z, boolean z2, boolean z3);

    void EFB();

    void EHx();

    void EQO(int i);

    void EQT(int i);

    void EUp(String str, String str2, String str3, String str4, String str5, String str6, List list, int i, int i2, boolean z);

    void Ejz(IAREngineServiceCallback iAREngineServiceCallback);

    void End(Surface surface, int i, int i2);

    void ErQ(VersionedSharedMemory versionedSharedMemory);

    void ErR(int i, int i2, int i3, int i4, boolean z);

    void EyA();

    void FKS(int[] iArr, int[] iArr2, int[] iArr3, float f, float f2, float f3, int i, int i2, int i3, int i4, long j, long j2, long j3, boolean z, boolean z2);
}
