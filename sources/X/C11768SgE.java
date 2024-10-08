package X;

import ca.psiphon.PsiphonTunnel;
import com.facebook.proxyservice.observer.ProxyServiceBroadcaster;
import java.util.List;

/* renamed from: X.SgE  reason: case insensitive filesystem */
public abstract class C11768SgE implements PsiphonTunnel.HostService {
    public int A00;
    public int A01;
    public String A02;
    public String A03;
    public final PsiphonTunnel A04 = PsiphonTunnel.newPsiphonTunnel(this);
    public final ProxyServiceBroadcaster A05 = ProxyServiceBroadcaster.instance;
    public final C74588Pxb A06;

    public final /* synthetic */ Object getVpnService() {
        return PsiphonTunnel.HostService.CC.$default$getVpnService(this);
    }

    public final void loadLibrary(String str) {
        0qQ.A0B(str, 0);
        0dV.A0C(str);
    }

    public final /* synthetic */ Object newVpnServiceBuilder() {
        return PsiphonTunnel.HostService.CC.$default$newVpnServiceBuilder(this);
    }

    public final /* synthetic */ void onActiveAuthorizationIDs(List list) {
        PsiphonTunnel.HostService.CC.$default$onActiveAuthorizationIDs(this, list);
    }

    public final /* synthetic */ void onApplicationParameter(String str, Object obj) {
        PsiphonTunnel.HostService.CC.$default$onApplicationParameter(this, str, obj);
    }

    public final /* synthetic */ void onAvailableEgressRegions(List list) {
        PsiphonTunnel.HostService.CC.$default$onAvailableEgressRegions(this, list);
    }

    public final /* synthetic */ void onBytesTransferred(long j, long j2) {
        PsiphonTunnel.HostService.CC.$default$onBytesTransferred(this, j, j2);
    }

    public final void onClientAddress(String str) {
        0qQ.A0B(str, 0);
        A00(new C73670Phj(str, this, 29));
    }

    public final /* synthetic */ void onClientIsLatestVersion() {
        PsiphonTunnel.HostService.CC.$default$onClientIsLatestVersion(this);
    }

    public final void onClientRegion(String str) {
        0qQ.A0B(str, 0);
        A00(new C73670Phj(str, this, 30));
    }

    public final /* synthetic */ void onClientUpgradeDownloaded(String str) {
        PsiphonTunnel.HostService.CC.$default$onClientUpgradeDownloaded(this, str);
    }

    public final /* synthetic */ void onHomepage(String str) {
        PsiphonTunnel.HostService.CC.$default$onHomepage(this, str);
    }

    public final /* synthetic */ void onHttpProxyPortInUse(int i) {
        PsiphonTunnel.HostService.CC.$default$onHttpProxyPortInUse(this, i);
    }

    public final void onListeningHttpProxyPort(int i) {
        A00(new MJ3(i, 4, this));
    }

    public final void onListeningSocksProxyPort(int i) {
        A00(new MJ3(i, 5, this));
    }

    public final /* synthetic */ void onServerAlert(String str, String str2, List list) {
        PsiphonTunnel.HostService.CC.$default$onServerAlert(this, str, str2, list);
    }

    public final /* synthetic */ void onSocksProxyPortInUse(int i) {
        PsiphonTunnel.HostService.CC.$default$onSocksProxyPortInUse(this, i);
    }

    public final /* synthetic */ void onSplitTunnelRegions(List list) {
        PsiphonTunnel.HostService.CC.$default$onSplitTunnelRegions(this, list);
    }

    public final /* synthetic */ void onStartedWaitingForNetworkConnectivity() {
        PsiphonTunnel.HostService.CC.$default$onStartedWaitingForNetworkConnectivity(this);
    }

    public final /* synthetic */ void onStoppedWaitingForNetworkConnectivity() {
        PsiphonTunnel.HostService.CC.$default$onStoppedWaitingForNetworkConnectivity(this);
    }

    public final /* synthetic */ void onTrafficRateLimits(long j, long j2) {
        PsiphonTunnel.HostService.CC.$default$onTrafficRateLimits(this, j, j2);
    }

    public final /* synthetic */ void onUntunneledAddress(String str) {
        PsiphonTunnel.HostService.CC.$default$onUntunneledAddress(this, str);
    }

    public final /* synthetic */ void onUpstreamProxyError(String str) {
        PsiphonTunnel.HostService.CC.$default$onUpstreamProxyError(this, str);
    }

    public final void A00(C62320sa r3) {
        this.A06.execute(new TC6(r3));
    }

    public final void onConnected() {
        A00(new C13348TVv(this, 40));
    }

    public final void onConnecting() {
        A00(new C13348TVv(this, 41));
    }

    public final void onExiting() {
        A00(new C13348TVv(this, 42));
    }

    public C11768SgE(C74588Pxb pxb) {
        this.A06 = pxb;
    }
}
