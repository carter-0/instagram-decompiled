package X;

import com.facebook.rsys.callmanager.callclient.gen.CallManagerCallClient;
import com.facebook.rsys.callmanager.callclient.gen.CallManagerCallClientCallbacks;
import com.facebook.rsys.callmanager.gen.CallManagerClient;
import com.facebook.rsys.callmanager.gen.CallManagerConfig;
import com.facebook.rsys.crypto.gen.CryptoContextHolder;
import com.facebook.rsys.devxagent.gen.DevXAgentApi;
import com.facebook.rsys.filelogging.gen.LargeLogUploadProxy;
import com.facebook.rsys.log.gen.LogPersistenceProxy;
import com.facebook.rsys.overlayconfigmanager.OverlayConfigManagerHolder;
import com.facebook.rsys.turnallocation.gen.TurnAllocationProxy;
import com.facebook.xanalytics.XAnalyticsHolder;
import com.instagram.rtc.rsys.proxies.IGRTCCallManager;
import com.instagram.rtc.rsys.proxies.IGRTCSignalingCoordinator;
import com.instagram.rtc.rsys.proxies.LoggingProxy;
import java.util.Map;

public final class OEP {
    public final CallManagerCallClient A00;
    public final IGRTCCallManager A01;
    public final IGRTCSignalingCoordinator A02;

    public OEP(CallManagerCallClientCallbacks callManagerCallClientCallbacks, CallManagerClient callManagerClient, CryptoContextHolder cryptoContextHolder, DevXAgentApi devXAgentApi, LargeLogUploadProxy largeLogUploadProxy, LogPersistenceProxy logPersistenceProxy, OverlayConfigManagerHolder overlayConfigManagerHolder, TurnAllocationProxy turnAllocationProxy, XAnalyticsHolder xAnalyticsHolder, IGRTCSignalingCoordinator iGRTCSignalingCoordinator, LoggingProxy loggingProxy, String str, Map map) {
        AnonymousClass7TG.A1O(callManagerClient, callManagerCallClientCallbacks);
        Map map2 = map;
        0qQ.A0B(map2, 9);
        IGRTCSignalingCoordinator iGRTCSignalingCoordinator2 = iGRTCSignalingCoordinator;
        this.A02 = iGRTCSignalingCoordinator2;
        CallManagerCallClient createCallManager = CallManagerCallClient.CProxy.createCallManager(new CallManagerConfig(), callManagerClient, callManagerCallClientCallbacks, devXAgentApi);
        0qQ.A07(createCallManager);
        this.A00 = createCallManager;
        LogPersistenceProxy logPersistenceProxy2 = logPersistenceProxy;
        LoggingProxy loggingProxy2 = loggingProxy;
        String str2 = str;
        IGRTCCallManager createCallManager2 = IGRTCCallManager.CProxy.createCallManager(createCallManager, iGRTCSignalingCoordinator2, str2, loggingProxy2, logPersistenceProxy2, largeLogUploadProxy, overlayConfigManagerHolder, map2, cryptoContextHolder, turnAllocationProxy, xAnalyticsHolder);
        0qQ.A07(createCallManager2);
        this.A01 = createCallManager2;
    }
}
