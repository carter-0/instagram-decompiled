package X;

import android.content.Context;
import com.facebook.cameracore.mediapipeline.arclass.common.ARClass;
import com.facebook.cameracore.mediapipeline.arengineservices.igsandboxeffectservicehost.IgSandboxEffectServiceHost;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHostConfig;
import com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProviderConfig;
import com.facebook.cameracore.mediapipeline.dataproviders.framebrightness.interfaces.FrameBrightnessDataProviderConfig;
import com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.implementation.WorldTrackerSlamFactoryProviderModule;
import com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.WorldTrackerDataProviderConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ARW implements C368598sv {
    public final Context A00;
    public final C368608sy A01 = new Object();
    public final AnonymousClass82L A02;
    public final C312546ef A03;
    public final C312576ei A04;
    public final C41794B0z A05;

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, com.facebook.cameracore.mediapipeline.arengineservices.interfaces.WorldTrackerDataProviderConfigWithSlam] */
    /* JADX WARNING: type inference failed for: r0v2, types: [com.facebook.cameracore.mediapipeline.dataproviders.slam.interfaces.SlamLibraryProvider, java.lang.Object] */
    public final EffectServiceHost AME(Context context) {
        0qQ.A0B(context, 0);
        ARClass aRClass = new ARClass(0);
        WorldTrackerDataProviderConfig worldTrackerDataProviderConfig = new WorldTrackerDataProviderConfig();
        WorldTrackerSlamFactoryProviderModule worldTrackerSlamFactoryProviderModule = new WorldTrackerSlamFactoryProviderModule();
        ? obj = new Object();
        obj.config = worldTrackerDataProviderConfig;
        obj.isARCoreEnabled = false;
        obj.useFirstframe = false;
        obj.slamFactoryProvider = worldTrackerSlamFactoryProviderModule;
        C368608sy r1 = this.A01;
        r1.A01 = new FaceTrackerDataProviderConfig();
        r1.A00 = obj;
        r1.A02 = new FrameBrightnessDataProviderConfig(0, 0, 0, 7, (DefaultConstructorMarker) null);
        r1.A03 = new Object();
        return new IgSandboxEffectServiceHost(context, new EffectServiceHostConfig(r1), this.A04, aRClass, this.A03, this.A02, this.A05);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.8sy, java.lang.Object] */
    public ARW(Context context, AnonymousClass82L r3, C312546ef r4, C312576ei r5, C41794B0z b0z) {
        this.A00 = context;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = b0z;
    }
}
