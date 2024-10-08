package X;

import android.content.Context;
import com.facebook.cameracore.mediapipeline.arclass.common.ARClass;
import com.facebook.cameracore.mediapipeline.arengineservices.igeffectservicehost.IgEffectServiceHost;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHostConfig;
import com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProviderConfig;
import com.facebook.cameracore.mediapipeline.dataproviders.framebrightness.interfaces.FrameBrightnessDataProviderConfig;
import com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.implementation.WorldTrackerSlamFactoryProviderModule;
import com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.WorldTrackerDataProviderConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.8su  reason: invalid class name and case insensitive filesystem */
public final class C368588su implements C368598sv {
    public final Context A00;
    public final C368608sy A01;
    public final AnonymousClass82L A02;
    public final C312546ef A03;
    public final UserSession A04;

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.cameracore.mediapipeline.dataproviders.slam.interfaces.SlamLibraryProvider, java.lang.Object] */
    public final EffectServiceHost AME(Context context) {
        UserSession userSession = this.A04;
        C312566eh r8 = new C312566eh(userSession);
        C368608sy r4 = this.A01;
        r4.A03 = new Object();
        return new IgEffectServiceHost(this.A00, userSession, new EffectServiceHostConfig(r4), r8, new ARClass(Long.valueOf(182.A01(0Tu.A06, userSession, 36593314635449439L)).intValue() + Long.valueOf(182.A01(0Tu.A05, userSession, 36593314635646048L)).intValue()), this.A03, this.A02);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, com.facebook.cameracore.mediapipeline.arengineservices.interfaces.WorldTrackerDataProviderConfigWithSlam] */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.8sy, java.lang.Object] */
    public C368588su(Context context, FaceTrackerDataProviderConfig faceTrackerDataProviderConfig, AnonymousClass82L r6, C312546ef r7, UserSession userSession) {
        this.A00 = context;
        this.A04 = userSession;
        WorldTrackerDataProviderConfig worldTrackerDataProviderConfig = new WorldTrackerDataProviderConfig();
        WorldTrackerSlamFactoryProviderModule worldTrackerSlamFactoryProviderModule = new WorldTrackerSlamFactoryProviderModule();
        ? obj = new Object();
        obj.config = worldTrackerDataProviderConfig;
        obj.isARCoreEnabled = false;
        obj.useFirstframe = false;
        obj.slamFactoryProvider = worldTrackerSlamFactoryProviderModule;
        ? obj2 = new Object();
        obj2.A01 = faceTrackerDataProviderConfig;
        obj2.A00 = obj;
        obj2.A02 = new FrameBrightnessDataProviderConfig();
        this.A01 = obj2;
        this.A02 = r6;
        this.A03 = r7;
    }
}
