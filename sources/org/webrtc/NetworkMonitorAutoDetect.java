package org.webrtc;

import X.002;
import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C10200RoG;
import X.C66580MXl;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.wifi.WifiInfo;
import android.net.wifi.p2p.WifiP2pGroup;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Build;
import com.instagram.react.modules.base.IgReactQEModule;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.webrtc.NetworkChangeDetector;

public class NetworkMonitorAutoDetect extends BroadcastReceiver implements NetworkChangeDetector {
    public static final long INVALID_NET_ID = -1;
    public static final String TAG = "NetworkMonitorAutoDetect";
    public static boolean includeWifiDirect;
    public final ConnectivityManager.NetworkCallback allNetworkCallback;
    public final Set availableNetworks;
    public NetworkChangeDetector.ConnectionType connectionType;
    public ConnectivityManagerDelegate connectivityManagerDelegate;
    public final Context context;
    public final IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    public boolean isRegistered;
    public final ConnectivityManager.NetworkCallback mobileNetworkCallback;
    public final NetworkChangeDetector.Observer observer;
    public WifiDirectManagerDelegate wifiDirectManagerDelegate;
    public WifiManagerDelegate wifiManagerDelegate;
    public String wifiSSID;

    public class ConnectivityManagerDelegate {
        public final Set availableNetworks;
        public final C10200RoG connectivityManager;
        public final boolean getAllNetworksFromCache;
        public final boolean includeOtherUidNetworks;
        public final boolean requestVPN;

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
            r1 = getNetworkState(r11);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public org.webrtc.NetworkChangeDetector.NetworkInformation networkToInfo(android.net.Network r11) {
            /*
                r10 = this;
                r3 = 0
                if (r11 == 0) goto L_0x0043
                X.RoG r0 = r10.connectivityManager
                if (r0 == 0) goto L_0x0043
                android.net.ConnectivityManager r0 = r0.A00
                android.net.LinkProperties r2 = r0.getLinkProperties(r11)
                if (r2 == 0) goto L_0x0044
                java.lang.String r0 = r2.getInterfaceName()
                if (r0 == 0) goto L_0x0044
                org.webrtc.NetworkMonitorAutoDetect$NetworkState r1 = r10.getNetworkState((android.net.Network) r11)
                org.webrtc.NetworkChangeDetector$ConnectionType r5 = org.webrtc.NetworkMonitorAutoDetect.getConnectionType(r1)
                org.webrtc.NetworkChangeDetector$ConnectionType r0 = org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_NONE
                if (r5 == r0) goto L_0x0044
                org.webrtc.NetworkChangeDetector$ConnectionType r0 = org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_UNKNOWN
                if (r5 == r0) goto L_0x0029
                org.webrtc.NetworkChangeDetector$ConnectionType r0 = org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_UNKNOWN_CELLULAR
                if (r5 != r0) goto L_0x002e
            L_0x0029:
                r11.toString()
                boolean r0 = org.webrtc.Logging.loggingEnabled
            L_0x002e:
                org.webrtc.NetworkChangeDetector$ConnectionType r6 = org.webrtc.NetworkMonitorAutoDetect.getUnderlyingConnectionTypeForVpn(r1)
                java.lang.String r4 = r2.getInterfaceName()
                long r7 = r11.getNetworkHandle()
                org.webrtc.NetworkChangeDetector$IPAddress[] r9 = r10.getIPAddresses(r2)
                org.webrtc.NetworkChangeDetector$NetworkInformation r3 = new org.webrtc.NetworkChangeDetector$NetworkInformation
                r3.<init>(r4, r5, r6, r7, r9)
            L_0x0043:
                return r3
            L_0x0044:
                r11.toString()
                boolean r0 = org.webrtc.Logging.loggingEnabled
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.NetworkMonitorAutoDetect.ConnectivityManagerDelegate.networkToInfo(android.net.Network):org.webrtc.NetworkChangeDetector$NetworkInformation");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ConnectivityManagerDelegate(android.content.Context r6, java.util.Set r7, java.lang.String r8) {
            /*
                r5 = this;
                java.lang.String r4 = "NetworkMonitorAutoDetect"
                r0 = 0
                X.0qQ.A0B(r6, r0)
                java.lang.String r0 = "connectivity"
                java.lang.Object r1 = r6.getSystemService(r0)
                boolean r0 = r1 instanceof android.net.ConnectivityManager
                r3 = 0
                if (r0 == 0) goto L_0x001e
                android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
                if (r1 == 0) goto L_0x001e
                X.RoG r3 = new X.RoG
                r3.<init>(r1)
            L_0x001a:
                r5.<init>((X.C10200RoG) r3, (java.util.Set) r7, (java.lang.String) r8)
                return
            L_0x001e:
                java.lang.String r2 = "ConnectivityManagerProxy.Factory(NoOp)"
                java.lang.Object[] r1 = new java.lang.Object[]{r4}
                java.lang.String r0 = "%s: ConnectivityManagerProxy init failed"
                X.0KC.A0O(r2, r0, r1)
                goto L_0x001a
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.NetworkMonitorAutoDetect.ConnectivityManagerDelegate.<init>(android.content.Context, java.util.Set, java.lang.String):void");
        }

        public static boolean checkFieldTrial(String str, String str2, boolean z) {
            if (str.contains(002.A0R(str2, ":true"))) {
                return true;
            }
            if (str.contains(002.A0R(str2, ":false"))) {
                return false;
            }
            return z;
        }

        public NetworkRequest createNetworkRequest() {
            NetworkRequest.Builder addCapability = new NetworkRequest.Builder().addCapability(12);
            if (this.requestVPN) {
                addCapability.removeCapability(15);
            }
            if (Build.VERSION.SDK_INT >= 31 && this.includeOtherUidNetworks) {
                addCapability.setIncludeOtherUidNetworks(true);
            }
            return addCapability.build();
        }

        public List getActiveNetworkList() {
            if (!AnonymousClass7TF.A1V(this.connectivityManager)) {
                return null;
            }
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (Network networkToInfo : getAllNetworks()) {
                NetworkChangeDetector.NetworkInformation networkToInfo2 = networkToInfo(networkToInfo);
                if (networkToInfo2 != null) {
                    A1C.add(networkToInfo2);
                }
            }
            return A1C;
        }

        public Network[] getAllNetworks() {
            Network[] networkArr;
            C10200RoG roG = this.connectivityManager;
            if (roG == null) {
                return new Network[0];
            }
            if (!AnonymousClass7TF.A1V(roG) || !this.getAllNetworksFromCache) {
                return roG.A00.getAllNetworks();
            }
            synchronized (this.availableNetworks) {
                networkArr = (Network[]) this.availableNetworks.toArray(new Network[0]);
            }
            return networkArr;
        }

        public long getDefaultNetId() {
            NetworkInfo activeNetworkInfo;
            NetworkInfo networkInfo;
            if (!AnonymousClass7TF.A1V(this.connectivityManager) || (activeNetworkInfo = this.connectivityManager.A00.getActiveNetworkInfo()) == null) {
                return -1;
            }
            long j = -1;
            for (Network network : getAllNetworks()) {
                if (hasInternetCapability(network) && (networkInfo = this.connectivityManager.A00.getNetworkInfo(network)) != null && networkInfo.getType() == activeNetworkInfo.getType()) {
                    if (j == -1) {
                        j = network.getNetworkHandle();
                    } else {
                        throw AnonymousClass7TE.A15("Multiple connected networks of same type are not supported.");
                    }
                }
            }
            return j;
        }

        public NetworkState getNetworkState(Network network) {
            C10200RoG roG;
            NetworkInfo activeNetworkInfo;
            boolean isConnected;
            int i;
            int type;
            int subtype;
            if (!(network == null || (roG = this.connectivityManager) == null)) {
                NetworkInfo networkInfo = roG.A00.getNetworkInfo(network);
                if (networkInfo == null) {
                    network.toString();
                    boolean z = Logging.loggingEnabled;
                } else {
                    if (networkInfo.getType() != 17) {
                        NetworkCapabilities networkCapabilities = this.connectivityManager.A00.getNetworkCapabilities(network);
                        if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                            isConnected = networkInfo.isConnected();
                            i = -1;
                            type = networkInfo.getType();
                            subtype = networkInfo.getSubtype();
                        }
                        return getNetworkState(networkInfo);
                    }
                    if (networkInfo.getType() == 17) {
                        if (!network.equals(this.connectivityManager.A00.getActiveNetwork()) || (activeNetworkInfo = this.connectivityManager.A00.getActiveNetworkInfo()) == null || activeNetworkInfo.getType() == 17) {
                            return new NetworkState(networkInfo.isConnected(), 17, -1, -1, -1);
                        }
                        isConnected = networkInfo.isConnected();
                        i = -1;
                        type = activeNetworkInfo.getType();
                        subtype = activeNetworkInfo.getSubtype();
                    }
                    return getNetworkState(networkInfo);
                    return new NetworkState(isConnected, 17, i, type, subtype);
                }
            }
            return new NetworkState(false, -1, -1, -1, -1);
        }

        public boolean hasInternetCapability(Network network) {
            NetworkCapabilities networkCapabilities;
            C10200RoG roG = this.connectivityManager;
            if (roG == null || (networkCapabilities = roG.A00.getNetworkCapabilities(network)) == null || !networkCapabilities.hasCapability(12)) {
                return false;
            }
            return true;
        }

        public void registerNetworkCallback(ConnectivityManager.NetworkCallback networkCallback) {
            C10200RoG roG = this.connectivityManager;
            NetworkRequest createNetworkRequest = createNetworkRequest();
            AnonymousClass7TG.A1N(createNetworkRequest, networkCallback);
            roG.A00.registerNetworkCallback(createNetworkRequest, networkCallback);
        }

        public void releaseCallback(ConnectivityManager.NetworkCallback networkCallback) {
            if (AnonymousClass7TF.A1V(this.connectivityManager)) {
                boolean z = Logging.loggingEnabled;
                C10200RoG roG = this.connectivityManager;
                0qQ.A0B(networkCallback, 0);
                roG.A00.unregisterNetworkCallback(networkCallback);
            }
        }

        public void requestMobileNetwork(ConnectivityManager.NetworkCallback networkCallback) {
            NetworkRequest.Builder builder = new NetworkRequest.Builder();
            builder.addCapability(12).addTransportType(0);
            C10200RoG roG = this.connectivityManager;
            NetworkRequest build = builder.build();
            AnonymousClass7TF.A1H(build, networkCallback);
            roG.A00.requestNetwork(build, networkCallback);
        }

        public boolean supportNetworkCallback() {
            return AnonymousClass7TF.A1V(this.connectivityManager);
        }

        public NetworkChangeDetector.IPAddress[] getIPAddresses(LinkProperties linkProperties) {
            NetworkChangeDetector.IPAddress[] iPAddressArr = new NetworkChangeDetector.IPAddress[linkProperties.getLinkAddresses().size()];
            int i = 0;
            for (LinkAddress address : linkProperties.getLinkAddresses()) {
                iPAddressArr[i] = new NetworkChangeDetector.IPAddress(address.getAddress().getAddress());
                i++;
            }
            return iPAddressArr;
        }

        public ConnectivityManagerDelegate(C10200RoG roG, Set set, String str) {
            this.connectivityManager = roG;
            this.availableNetworks = set;
            this.getAllNetworksFromCache = checkFieldTrial(str, "getAllNetworksFromCache", false);
            this.requestVPN = checkFieldTrial(str, "requestVPN", false);
            this.includeOtherUidNetworks = checkFieldTrial(str, "includeOtherUidNetworks", false);
        }

        private NetworkState getNetworkState(NetworkInfo networkInfo) {
            if (networkInfo == null || !networkInfo.isConnected()) {
                return new NetworkState(false, -1, -1, -1, -1);
            }
            return new NetworkState(true, networkInfo.getType(), networkInfo.getSubtype(), -1, -1);
        }

        public NetworkState getNetworkState() {
            C10200RoG roG = this.connectivityManager;
            if (roG == null) {
                return new NetworkState(false, -1, -1, -1, -1);
            }
            return getNetworkState(roG.A00.getActiveNetworkInfo());
        }
    }

    public class NetworkState {
        public final boolean connected;
        public final int subtype;
        public final int type;
        public final int underlyingNetworkSubtypeForVpn;
        public final int underlyingNetworkTypeForVpn;

        public int getNetworkSubType() {
            return this.subtype;
        }

        public int getNetworkType() {
            return this.type;
        }

        public int getUnderlyingNetworkSubtypeForVpn() {
            return this.underlyingNetworkSubtypeForVpn;
        }

        public int getUnderlyingNetworkTypeForVpn() {
            return this.underlyingNetworkTypeForVpn;
        }

        public boolean isConnected() {
            return this.connected;
        }

        public NetworkState(boolean z, int i, int i2, int i3, int i4) {
            this.connected = z;
            this.type = i;
            this.subtype = i2;
            this.underlyingNetworkTypeForVpn = i3;
            this.underlyingNetworkSubtypeForVpn = i4;
        }
    }

    public class SimpleNetworkCallback extends ConnectivityManager.NetworkCallback {
        public final Set availableNetworks;

        public SimpleNetworkCallback(Set set) {
            this.availableNetworks = set;
        }

        private void onNetworkChanged(Network network) {
            NetworkChangeDetector.NetworkInformation access$300 = NetworkMonitorAutoDetect.this.connectivityManagerDelegate.networkToInfo(network);
            if (access$300 != null) {
                NetworkMonitorAutoDetect.this.observer.onNetworkConnect(access$300);
            }
        }

        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            boolean z = Logging.loggingEnabled;
            onNetworkChanged(network);
        }

        public void onAvailable(Network network) {
            network.toString();
            boolean z = Logging.loggingEnabled;
            synchronized (this.availableNetworks) {
                this.availableNetworks.add(network);
            }
            onNetworkChanged(network);
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            networkCapabilities.toString();
            boolean z = Logging.loggingEnabled;
            onNetworkChanged(network);
        }

        public void onLosing(Network network, int i) {
            network.toString();
            boolean z = Logging.loggingEnabled;
        }

        public void onLost(Network network) {
            network.toString();
            boolean z = Logging.loggingEnabled;
            synchronized (this.availableNetworks) {
                this.availableNetworks.remove(network);
            }
            NetworkMonitorAutoDetect.this.observer.onNetworkDisconnect(network.getNetworkHandle());
        }
    }

    public class WifiDirectManagerDelegate extends BroadcastReceiver {
        public static final int WIFI_P2P_NETWORK_HANDLE = 0;
        public final Context context;
        public final NetworkChangeDetector.Observer observer;
        public NetworkChangeDetector.NetworkInformation wifiP2pNetworkInfo;

        private void onWifiP2pStateChange(int i) {
            if (i == 1) {
                this.wifiP2pNetworkInfo = null;
                this.observer.onNetworkDisconnect(0);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: onWifiP2pGroupChange */
        public void m22lambda$new$0$orgwebrtcNetworkMonitorAutoDetect$WifiDirectManagerDelegate(WifiP2pGroup wifiP2pGroup) {
            if (wifiP2pGroup != null && wifiP2pGroup.getInterface() != null) {
                try {
                    ArrayList<T> list = Collections.list(NetworkInterface.getByName(wifiP2pGroup.getInterface()).getInetAddresses());
                    NetworkChangeDetector.IPAddress[] iPAddressArr = new NetworkChangeDetector.IPAddress[list.size()];
                    for (int i = 0; i < list.size(); i++) {
                        iPAddressArr[i] = new NetworkChangeDetector.IPAddress(((InetAddress) list.get(i)).getAddress());
                    }
                    NetworkChangeDetector.NetworkInformation networkInformation = new NetworkChangeDetector.NetworkInformation(wifiP2pGroup.getInterface(), NetworkChangeDetector.ConnectionType.CONNECTION_WIFI, NetworkChangeDetector.ConnectionType.CONNECTION_NONE, 0, iPAddressArr);
                    this.wifiP2pNetworkInfo = networkInformation;
                    this.observer.onNetworkConnect(networkInformation);
                } catch (SocketException e) {
                    boolean z = Logging.loggingEnabled;
                    e.toString();
                    Logging.getStackTraceString(e);
                }
            }
        }

        public List getActiveNetworkList() {
            NetworkChangeDetector.NetworkInformation networkInformation = this.wifiP2pNetworkInfo;
            if (networkInformation != null) {
                return Collections.singletonList(networkInformation);
            }
            return Collections.emptyList();
        }

        public void release() {
            this.context.unregisterReceiver(this);
        }

        public WifiDirectManagerDelegate(NetworkChangeDetector.Observer observer2, Context context2) {
            this.context = context2;
            this.observer = observer2;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.p2p.STATE_CHANGED");
            intentFilter.addAction("android.net.wifi.p2p.CONNECTION_STATE_CHANGE");
            context2.registerReceiver(this, intentFilter);
            if (Build.VERSION.SDK_INT > 28) {
                WifiP2pManager wifiP2pManager = (WifiP2pManager) context2.getSystemService("wifip2p");
                wifiP2pManager.requestGroupInfo(wifiP2pManager.initialize(context2, context2.getMainLooper(), (WifiP2pManager.ChannelListener) null), new NetworkMonitorAutoDetect$WifiDirectManagerDelegate$$ExternalSyntheticLambda0(this));
            }
        }

        public void onReceive(Context context2, Intent intent) {
            int A03 = C66580MXl.A03(this, context2, intent, -637725672);
            if ("android.net.wifi.p2p.CONNECTION_STATE_CHANGE".equals(intent.getAction())) {
                m22lambda$new$0$orgwebrtcNetworkMonitorAutoDetect$WifiDirectManagerDelegate((WifiP2pGroup) intent.getParcelableExtra("p2pGroupInfo"));
            } else if ("android.net.wifi.p2p.STATE_CHANGED".equals(intent.getAction())) {
                onWifiP2pStateChange(intent.getIntExtra("wifi_p2p_state", 0));
            }
            AnonymousClass0fD.A0E(1469359775, A03, intent);
        }
    }

    public class WifiManagerDelegate {
        public final Context context;

        public String getWifiSSID() {
            WifiInfo wifiInfo;
            String ssid;
            Intent registerReceiver = this.context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.net.wifi.STATE_CHANGE"));
            if (registerReceiver == null || (wifiInfo = (WifiInfo) registerReceiver.getParcelableExtra("wifiInfo")) == null || (ssid = wifiInfo.getSSID()) == null) {
                return "";
            }
            return ssid;
        }

        public WifiManagerDelegate(Context context2) {
            this.context = context2;
        }

        public WifiManagerDelegate() {
            this.context = null;
        }
    }

    public static NetworkChangeDetector.ConnectionType getConnectionType(boolean z, int i, int i2) {
        if (!z) {
            return NetworkChangeDetector.ConnectionType.CONNECTION_NONE;
        }
        if (i == 0) {
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    return NetworkChangeDetector.ConnectionType.CONNECTION_2G;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                case 14:
                case 15:
                case 17:
                    return NetworkChangeDetector.ConnectionType.CONNECTION_3G;
                case 13:
                case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                    break;
                case 20:
                    return NetworkChangeDetector.ConnectionType.CONNECTION_5G;
                default:
                    return NetworkChangeDetector.ConnectionType.CONNECTION_UNKNOWN_CELLULAR;
            }
        } else if (i == 1) {
            return NetworkChangeDetector.ConnectionType.CONNECTION_WIFI;
        } else {
            if (i != 6) {
                if (i == 7) {
                    return NetworkChangeDetector.ConnectionType.CONNECTION_BLUETOOTH;
                }
                if (i == 9) {
                    return NetworkChangeDetector.ConnectionType.CONNECTION_ETHERNET;
                }
                if (i != 17) {
                    return NetworkChangeDetector.ConnectionType.CONNECTION_UNKNOWN;
                }
                return NetworkChangeDetector.ConnectionType.CONNECTION_VPN;
            }
        }
        return NetworkChangeDetector.ConnectionType.CONNECTION_4G;
    }

    public static NetworkChangeDetector.ConnectionType getUnderlyingConnectionTypeForVpn(NetworkState networkState) {
        if (networkState.type != 17) {
            return NetworkChangeDetector.ConnectionType.CONNECTION_NONE;
        }
        return getConnectionType(networkState.connected, networkState.underlyingNetworkTypeForVpn, networkState.underlyingNetworkSubtypeForVpn);
    }

    private void registerReceiver() {
        if (!this.isRegistered) {
            this.isRegistered = true;
            this.context.registerReceiver(this, this.intentFilter);
        }
    }

    public static void setIncludeWifiDirect(boolean z) {
        includeWifiDirect = z;
    }

    private void unregisterReceiver() {
        if (this.isRegistered) {
            this.isRegistered = false;
            this.context.unregisterReceiver(this);
        }
    }

    public void destroy() {
        ConnectivityManager.NetworkCallback networkCallback = this.allNetworkCallback;
        if (networkCallback != null) {
            this.connectivityManagerDelegate.releaseCallback(networkCallback);
        }
        ConnectivityManager.NetworkCallback networkCallback2 = this.mobileNetworkCallback;
        if (networkCallback2 != null) {
            this.connectivityManagerDelegate.releaseCallback(networkCallback2);
        }
        WifiDirectManagerDelegate wifiDirectManagerDelegate2 = this.wifiDirectManagerDelegate;
        if (wifiDirectManagerDelegate2 != null) {
            wifiDirectManagerDelegate2.release();
        }
        unregisterReceiver();
    }

    public List getActiveNetworkList() {
        List activeNetworkList = this.connectivityManagerDelegate.getActiveNetworkList();
        if (activeNetworkList == null) {
            return null;
        }
        ArrayList A1D = AnonymousClass7TE.A1D(activeNetworkList);
        WifiDirectManagerDelegate wifiDirectManagerDelegate2 = this.wifiDirectManagerDelegate;
        if (wifiDirectManagerDelegate2 == null) {
            return A1D;
        }
        A1D.addAll(wifiDirectManagerDelegate2.getActiveNetworkList());
        return A1D;
    }

    public NetworkChangeDetector.ConnectionType getCurrentConnectionType() {
        return getConnectionType(this.connectivityManagerDelegate.getNetworkState());
    }

    public NetworkState getCurrentNetworkState() {
        return this.connectivityManagerDelegate.getNetworkState();
    }

    public long getDefaultNetId() {
        return this.connectivityManagerDelegate.getDefaultNetId();
    }

    public boolean isReceiverRegisteredForTesting() {
        return this.isRegistered;
    }

    public void setConnectivityManagerDelegateForTests(ConnectivityManagerDelegate connectivityManagerDelegate2) {
        this.connectivityManagerDelegate = connectivityManagerDelegate2;
    }

    public void setWifiManagerDelegateForTests(WifiManagerDelegate wifiManagerDelegate2) {
        this.wifiManagerDelegate = wifiManagerDelegate2;
    }

    public boolean supportNetworkCallback() {
        return AnonymousClass7TF.A1V(this.connectivityManagerDelegate.connectivityManager);
    }

    public NetworkMonitorAutoDetect(NetworkChangeDetector.Observer observer2, Context context2) {
        HashSet A1F = AnonymousClass7TE.A1F();
        this.availableNetworks = A1F;
        this.observer = observer2;
        this.context = context2;
        ConnectivityManagerDelegate connectivityManagerDelegate2 = new ConnectivityManagerDelegate(context2, (Set) A1F, str);
        this.connectivityManagerDelegate = connectivityManagerDelegate2;
        this.wifiManagerDelegate = new WifiManagerDelegate(context2);
        NetworkState networkState = connectivityManagerDelegate2.getNetworkState();
        this.connectionType = getConnectionType(networkState);
        this.wifiSSID = getWifiSSID(networkState);
        if (includeWifiDirect) {
            this.wifiDirectManagerDelegate = new WifiDirectManagerDelegate(observer2, context2);
        }
        registerReceiver();
        ConnectivityManager.NetworkCallback networkCallback = null;
        if (AnonymousClass7TF.A1V(this.connectivityManagerDelegate.connectivityManager)) {
            ConnectivityManager.NetworkCallback networkCallback2 = new ConnectivityManager.NetworkCallback();
            try {
                this.connectivityManagerDelegate.requestMobileNetwork(networkCallback2);
                networkCallback = networkCallback2;
            } catch (SecurityException unused) {
                boolean z = Logging.loggingEnabled;
            }
            this.mobileNetworkCallback = networkCallback;
            SimpleNetworkCallback simpleNetworkCallback = new SimpleNetworkCallback(this.availableNetworks);
            this.allNetworkCallback = simpleNetworkCallback;
            this.connectivityManagerDelegate.registerNetworkCallback(simpleNetworkCallback);
            return;
        }
        this.mobileNetworkCallback = null;
        this.allNetworkCallback = null;
    }

    private void connectionTypeChanged(NetworkState networkState) {
        NetworkChangeDetector.ConnectionType connectionType2 = getConnectionType(networkState);
        String wifiSSID2 = getWifiSSID(networkState);
        if (connectionType2 != this.connectionType || !wifiSSID2.equals(this.wifiSSID)) {
            this.connectionType = connectionType2;
            this.wifiSSID = wifiSSID2;
            boolean z = Logging.loggingEnabled;
            this.observer.onConnectionTypeChanged(connectionType2);
        }
    }

    private String getWifiSSID(NetworkState networkState) {
        if (getConnectionType(networkState) != NetworkChangeDetector.ConnectionType.CONNECTION_WIFI) {
            return "";
        }
        return this.wifiManagerDelegate.getWifiSSID();
    }

    public static long networkToNetId(Network network) {
        return network.getNetworkHandle();
    }

    public void onReceive(Context context2, Intent intent) {
        int A03 = C66580MXl.A03(this, context2, intent, -1282974911);
        NetworkState networkState = this.connectivityManagerDelegate.getNetworkState();
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            connectionTypeChanged(networkState);
        }
        AnonymousClass0fD.A0E(1231747851, A03, intent);
    }

    public static NetworkChangeDetector.ConnectionType getConnectionType(NetworkState networkState) {
        return getConnectionType(networkState.connected, networkState.type, networkState.subtype);
    }
}
