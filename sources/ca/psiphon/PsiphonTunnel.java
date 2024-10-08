package ca.psiphon;

import X.AnonymousClass0fl;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.VpnService;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.intent.IntentModule;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import psi.Psi;
import psi.PsiphonProvider;
import psi.PsiphonProviderFeedbackHandler;
import psi.PsiphonProviderNetwork;
import psi.PsiphonProviderNoticeHandler;

public class PsiphonTunnel {
    public static final int UDPGW_SERVER_PORT = 7300;
    public static final int VPN_INTERFACE_MTU = 1500;
    public static final String VPN_INTERFACE_NETMASK = "255.255.255.0";
    public static PsiphonTunnel mPsiphonTunnel;
    public AtomicReference mActiveNetworkDNSServers;
    public AtomicReference mActiveNetworkType;
    public AtomicReference mClientPlatformPrefix = new AtomicReference("");
    public AtomicReference mClientPlatformSuffix = new AtomicReference("");
    public final HostService mHostService;
    public AtomicBoolean mIsWaitingForNetworkConnectivity = new AtomicBoolean(false);
    public AtomicInteger mLocalSocksProxyPort = new AtomicInteger(0);
    public final NetworkMonitor mNetworkMonitor;
    public PrivateAddress mPrivateAddress;
    public AtomicBoolean mRoutingThroughTunnel = new AtomicBoolean(false);
    public final boolean mShouldRouteThroughTunnelAutomatically;
    public Thread mTun2SocksThread;
    public AtomicReference mTunFd = new AtomicReference();
    public AtomicBoolean mVpnMode = new AtomicBoolean(false);

    public class Exception extends Exception {
        public static final long serialVersionUID = 1;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Exception(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r0 = ": "
                r1.append(r0)
                java.lang.String r0 = r4.getMessage()
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r2.<init>(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ca.psiphon.PsiphonTunnel.Exception.<init>(java.lang.String, java.lang.Throwable):void");
        }

        public Exception(String str) {
            super(str);
        }
    }

    public interface HostFeedbackHandler {
        void sendFeedbackCompleted(Exception exc);

        /* renamed from: ca.psiphon.PsiphonTunnel$HostFeedbackHandler$-CC  reason: invalid class name */
        public abstract /* synthetic */ class CC {
            public static void $default$sendFeedbackCompleted(HostFeedbackHandler hostFeedbackHandler, Exception exc) {
            }
        }
    }

    public interface HostLibraryLoader {
        void loadLibrary(String str);

        /* renamed from: ca.psiphon.PsiphonTunnel$HostLibraryLoader$-CC  reason: invalid class name */
        public abstract /* synthetic */ class CC {
            public static void $default$loadLibrary(HostLibraryLoader hostLibraryLoader, String str) {
                System.loadLibrary(str);
            }
        }
    }

    public interface HostLogger {
        void onDiagnosticMessage(String str);

        /* renamed from: ca.psiphon.PsiphonTunnel$HostLogger$-CC  reason: invalid class name */
        public abstract /* synthetic */ class CC {
            public static void $default$onDiagnosticMessage(HostLogger hostLogger, String str) {
            }
        }
    }

    public interface HostService extends HostLogger, HostLibraryLoader {

        /* renamed from: ca.psiphon.PsiphonTunnel$HostService$-CC  reason: invalid class name */
        public abstract /* synthetic */ class CC {
            public static Object $default$getVpnService(HostService hostService) {
                return null;
            }

            public static Object $default$newVpnServiceBuilder(HostService hostService) {
                return null;
            }

            public static void $default$onClientIsLatestVersion(HostService hostService) {
            }

            public static void $default$onConnected(HostService hostService) {
            }

            public static void $default$onConnecting(HostService hostService) {
            }

            public static void $default$onExiting(HostService hostService) {
            }

            public static void $default$onStartedWaitingForNetworkConnectivity(HostService hostService) {
            }

            public static void $default$onStoppedWaitingForNetworkConnectivity(HostService hostService) {
            }

            public static void $default$onActiveAuthorizationIDs(HostService hostService, List list) {
            }

            public static void $default$onAvailableEgressRegions(HostService hostService, List list) {
            }

            public static void $default$onClientAddress(HostService hostService, String str) {
            }

            public static void $default$onClientRegion(HostService hostService, String str) {
            }

            public static void $default$onClientUpgradeDownloaded(HostService hostService, String str) {
            }

            public static void $default$onHomepage(HostService hostService, String str) {
            }

            public static void $default$onHttpProxyPortInUse(HostService hostService, int i) {
            }

            public static void $default$onListeningHttpProxyPort(HostService hostService, int i) {
            }

            public static void $default$onListeningSocksProxyPort(HostService hostService, int i) {
            }

            public static void $default$onSocksProxyPortInUse(HostService hostService, int i) {
            }

            public static void $default$onSplitTunnelRegions(HostService hostService, List list) {
            }

            public static void $default$onUntunneledAddress(HostService hostService, String str) {
            }

            public static void $default$onUpstreamProxyError(HostService hostService, String str) {
            }

            public static void $default$onApplicationParameter(HostService hostService, String str, Object obj) {
            }

            public static void $default$onBytesTransferred(HostService hostService, long j, long j2) {
            }

            public static void $default$onTrafficRateLimits(HostService hostService, long j, long j2) {
            }

            public static void $default$onServerAlert(HostService hostService, String str, String str2, List list) {
            }
        }

        String getAppName();

        Context getContext();

        String getPsiphonConfig();

        Object getVpnService();

        Object newVpnServiceBuilder();

        void onActiveAuthorizationIDs(List list);

        void onApplicationParameter(String str, Object obj);

        void onAvailableEgressRegions(List list);

        void onBytesTransferred(long j, long j2);

        void onClientAddress(String str);

        void onClientIsLatestVersion();

        void onClientRegion(String str);

        void onClientUpgradeDownloaded(String str);

        void onConnected();

        void onConnecting();

        void onExiting();

        void onHomepage(String str);

        void onHttpProxyPortInUse(int i);

        void onListeningHttpProxyPort(int i);

        void onListeningSocksProxyPort(int i);

        void onServerAlert(String str, String str2, List list);

        void onSocksProxyPortInUse(int i);

        void onSplitTunnelRegions(List list);

        void onStartedWaitingForNetworkConnectivity();

        void onStoppedWaitingForNetworkConnectivity();

        void onTrafficRateLimits(long j, long j2);

        void onUntunneledAddress(String str);

        void onUpstreamProxyError(String str);
    }

    public class NetworkMonitor {
        public AtomicReference activeNetworkDNSServers;
        public AtomicReference activeNetworkType;
        public final NetworkChangeListener listener;
        public HostLogger logger;
        public ConnectivityManager.NetworkCallback networkCallback;

        public interface NetworkChangeListener {
            void onChanged();
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
            r3 = (android.net.ConnectivityManager) r5.getSystemService("connectivity");
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void start(android.content.Context r5) {
            /*
                r4 = this;
                int r1 = android.os.Build.VERSION.SDK_INT
                r0 = 21
                if (r1 >= r0) goto L_0x0007
                return
            L_0x0007:
                java.lang.String r0 = "connectivity"
                java.lang.Object r3 = r5.getSystemService(r0)
                android.net.ConnectivityManager r3 = (android.net.ConnectivityManager) r3
                if (r3 != 0) goto L_0x0012
                return
            L_0x0012:
                ca.psiphon.PsiphonTunnel$NetworkMonitor$1 r0 = new ca.psiphon.PsiphonTunnel$NetworkMonitor$1
                r0.<init>(r3)
                r4.networkCallback = r0
                android.net.NetworkRequest$Builder r1 = new android.net.NetworkRequest$Builder     // Catch:{ RuntimeException -> 0x0045 }
                r1.<init>()     // Catch:{ RuntimeException -> 0x0045 }
                r0 = 12
                android.net.NetworkRequest$Builder r2 = r1.addCapability(r0)     // Catch:{ RuntimeException -> 0x0045 }
                ca.psiphon.PsiphonTunnel r0 = ca.psiphon.PsiphonTunnel.mPsiphonTunnel     // Catch:{ RuntimeException -> 0x0045 }
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.mVpnMode     // Catch:{ RuntimeException -> 0x0045 }
                boolean r1 = r0.get()     // Catch:{ RuntimeException -> 0x0045 }
                r0 = 15
                if (r1 == 0) goto L_0x0041
                r2.addCapability(r0)     // Catch:{ RuntimeException -> 0x0045 }
            L_0x0037:
                android.net.NetworkRequest r1 = r2.build()     // Catch:{ RuntimeException -> 0x0045 }
                android.net.ConnectivityManager$NetworkCallback r0 = r4.networkCallback     // Catch:{ RuntimeException -> 0x0045 }
                r3.requestNetwork(r1, r0)     // Catch:{ RuntimeException -> 0x0045 }
                goto L_0x0048
            L_0x0041:
                r2.removeCapability(r0)     // Catch:{ RuntimeException -> 0x0045 }
                goto L_0x0037
            L_0x0045:
                r0 = 0
                r4.networkCallback = r0
            L_0x0048:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ca.psiphon.PsiphonTunnel.NetworkMonitor.start(android.content.Context):void");
        }

        /* access modifiers changed from: private */
        public void stop(Context context) {
            ConnectivityManager connectivityManager;
            if (this.networkCallback != null && Build.VERSION.SDK_INT >= 21 && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
                try {
                    connectivityManager.unregisterNetworkCallback(this.networkCallback);
                } catch (RuntimeException unused) {
                }
                this.networkCallback = null;
            }
        }

        public NetworkMonitor(NetworkChangeListener networkChangeListener, AtomicReference atomicReference, AtomicReference atomicReference2, HostLogger hostLogger) {
            this.listener = networkChangeListener;
            this.activeNetworkType = atomicReference;
            this.activeNetworkDNSServers = atomicReference2;
            this.logger = hostLogger;
        }
    }

    public class PsiphonProviderShim implements PsiphonProvider {
        public PsiphonTunnel mPsiphonTunnel;

        public PsiphonProviderShim(PsiphonTunnel psiphonTunnel) {
            this.mPsiphonTunnel = psiphonTunnel;
        }

        public String bindToDevice(long j) {
            return this.mPsiphonTunnel.bindToDevice(j);
        }

        public String getDNSServersAsString() {
            return this.mPsiphonTunnel.getDNSServers(PsiphonTunnel.this.mHostService.getContext(), PsiphonTunnel.this.mHostService);
        }

        public String getNetworkID() {
            return PsiphonTunnel.getNetworkID(PsiphonTunnel.this.mHostService.getContext());
        }

        public long hasIPv6Route() {
            return PsiphonTunnel.hasIPv6Route(PsiphonTunnel.this.mHostService.getContext(), PsiphonTunnel.this.mHostService);
        }

        public long hasNetworkConnectivity() {
            return this.mPsiphonTunnel.hasNetworkConnectivity();
        }

        public void notice(String str) {
            this.mPsiphonTunnel.notice(str);
        }

        public String iPv6Synthesize(String str) {
            return PsiphonTunnel.iPv6Synthesize(str);
        }
    }

    public class PsiphonTunnelFeedback {
        public final ExecutorService callbackQueue = Executors.newSingleThreadExecutor();
        public final ExecutorService workQueue = Executors.newSingleThreadExecutor();

        public void startSendFeedback(Context context, HostFeedbackHandler hostFeedbackHandler, HostLogger hostLogger, String str, String str2, String str3, String str4, String str5) {
            final Context context2 = context;
            final HostFeedbackHandler hostFeedbackHandler2 = hostFeedbackHandler;
            final HostLogger hostLogger2 = hostLogger;
            final String str6 = str;
            final String str7 = str2;
            final String str8 = str3;
            final String str9 = str4;
            final String str10 = str5;
            this.workQueue.submit(new Runnable() {
                public void run() {
                    try {
                        Psi.startSendFeedback(PsiphonTunnel.buildPsiphonConfig(context2, hostLogger2, str6, str9, str10, false, 0), str7, str8, new PsiphonProviderFeedbackHandler() {
                            public void sendFeedbackCompleted(final Exception exc) {
                                PsiphonTunnelFeedback.this.callbackQueue.submit(new Runnable() {
                                    public void run() {
                                        hostFeedbackHandler2.sendFeedbackCompleted(exc);
                                    }
                                });
                            }
                        }, new PsiphonProviderNetwork() {
                            public String getNetworkID() {
                                return PsiphonTunnel.getNetworkID(context2);
                            }

                            public long hasIPv6Route() {
                                return PsiphonTunnel.hasIPv6Route(context2, hostLogger2);
                            }

                            public long hasNetworkConnectivity() {
                                if (PsiphonTunnel.hasNetworkConnectivity(context2)) {
                                    return 1;
                                }
                                return 0;
                            }

                            public String iPv6Synthesize(String str) {
                                return PsiphonTunnel.iPv6Synthesize(str);
                            }
                        }, new PsiphonProviderNoticeHandler() {
                            public void notice(String str) {
                                JSONObject jSONObject;
                                try {
                                    JSONObject jSONObject2 = new JSONObject(str);
                                    String string = jSONObject2.getString("noticeType");
                                    if (string != null && (jSONObject = jSONObject2.getJSONObject("data")) != null) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(string);
                                        sb.append(": ");
                                        sb.append(jSONObject.toString());
                                        final String obj = sb.toString();
                                        PsiphonTunnelFeedback.this.callbackQueue.submit(new Runnable() {
                                            public void run() {
                                                hostLogger2.onDiagnosticMessage(obj);
                                            }
                                        });
                                    }
                                } catch (Exception e) {
                                    PsiphonTunnelFeedback.this.callbackQueue.submit(new Runnable() {
                                        public void run() {
                                            HostLogger hostLogger = hostLogger2;
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("Error handling notice ");
                                            sb.append(e.toString());
                                            hostLogger.onDiagnosticMessage(sb.toString());
                                        }
                                    });
                                }
                            }
                        }, false, true);
                    } catch (Exception e) {
                        PsiphonTunnelFeedback.this.callbackQueue.submit(new Runnable() {
                            public void run() {
                                hostFeedbackHandler2.sendFeedbackCompleted(new Exception("Error sending feedback", e));
                            }
                        });
                    }
                }
            });
        }

        public void finalize() {
            shutdownAndAwaitTermination(this.callbackQueue);
            shutdownAndAwaitTermination(this.workQueue);
            super.finalize();
        }

        public void shutdownAndAwaitTermination(ExecutorService executorService) {
            try {
                if (!executorService.awaitTermination(5, TimeUnit.SECONDS)) {
                    executorService.shutdownNow();
                    if (!executorService.awaitTermination(5, TimeUnit.SECONDS)) {
                        System.err.println("PsiphonTunnelFeedback: pool did not terminate");
                    }
                }
            } catch (InterruptedException unused) {
                executorService.shutdownNow();
                Thread.currentThread().interrupt();
            }
        }

        public Future stopSendFeedback() {
            return this.workQueue.submit(new Runnable() {
                public void run() {
                    Psi.stopSendFeedback();
                }
            }, (Object) null);
        }
    }

    public static native int disableUdpGwKeepalive();

    public static native int enableUdpGwKeepalive();

    public static String iPv6Synthesize(String str) {
        return str;
    }

    public static native int runTun2Socks(int i, int i2, String str, String str2, String str3, String str4, int i3);

    private void startTun2Socks(ParcelFileDescriptor parcelFileDescriptor, int i, String str, String str2, String str3, String str4, boolean z) {
        if (this.mTun2SocksThread == null) {
            final ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptor;
            final int i2 = i;
            final String str5 = str;
            final String str6 = str2;
            final String str7 = str3;
            final String str8 = str4;
            final boolean z2 = z;
            Thread thread = new Thread(new Runnable() {
                public void run() {
                    int unused = PsiphonTunnel.runTun2Socks(parcelFileDescriptor2.detachFd(), i2, str5, str6, str7, str8, z2 ? 1 : 0);
                }
            });
            this.mTun2SocksThread = thread;
            thread.start();
            this.mHostService.onDiagnosticMessage("tun2socks started");
        }
    }

    public static native int terminateTun2Socks();

    public synchronized void reconnectPsiphon() {
        Psi.reconnectTunnel();
    }

    public synchronized void restartPsiphon() {
        stopPsiphon();
        startPsiphon("");
    }

    public synchronized boolean startRouting() {
        this.mHostService.loadLibrary("tun2socks");
        return startVpn();
    }

    public synchronized void startTunneling(String str) {
        startPsiphon(str);
    }

    public synchronized void stop() {
        stopVpn();
        stopPsiphon();
        this.mVpnMode.set(false);
        this.mLocalSocksProxyPort.set(0);
    }

    public void writeRuntimeProfiles(String str, int i, int i2) {
        Psi.writeRuntimeProfiles(str, (long) i, (long) i2);
    }

    public class PrivateAddress {
        public final String mIpAddress;
        public final int mPrefixLength;
        public final String mRouter;
        public final String mSubnet;

        public PrivateAddress(String str, String str2, int i, String str3) {
            this.mIpAddress = str;
            this.mSubnet = str2;
            this.mPrefixLength = i;
            this.mRouter = str3;
        }
    }

    /* access modifiers changed from: private */
    public String bindToDevice(long j) {
        if (((VpnService) this.mHostService.getVpnService()).protect((int) j)) {
            return "";
        }
        throw new Exception("protect socket failed");
    }

    public static String buildPsiphonConfig(Context context, HostLogger hostLogger, String str, String str2, String str3, boolean z, Integer num) {
        JSONObject jSONObject = new JSONObject(str);
        if (!jSONObject.has("DataRootDirectory")) {
            File defaultDataRootDirectory = defaultDataRootDirectory(context);
            if (defaultDataRootDirectory.exists() || defaultDataRootDirectory.mkdir()) {
                jSONObject.put("DataRootDirectory", defaultDataRootDirectory(context));
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("failed to create data root directory: ");
                sb.append(defaultDataRootDirectory.getPath());
                throw new Exception(sb.toString());
            }
        }
        if (!jSONObject.has("DataStoreDirectory")) {
            jSONObject.put("MigrateDataStoreDirectory", context.getFilesDir());
        }
        if (!jSONObject.has("RemoteServerListDownloadFilename")) {
            jSONObject.put("MigrateRemoteServerListDownloadFilename", new File(context.getFilesDir(), "remote_server_list").getAbsolutePath());
        }
        jSONObject.put("MigrateObfuscatedServerListDownloadDirectory", new File(context.getFilesDir(), "osl").getAbsolutePath());
        if (!jSONObject.has("EstablishTunnelTimeoutSeconds")) {
            jSONObject.put("EstablishTunnelTimeoutSeconds", 0);
        }
        jSONObject.put("EmitBytesTransferred", true);
        if (num.intValue() != 0 && (!jSONObject.has("LocalSocksProxyPort") || jSONObject.getInt("LocalSocksProxyPort") == 0)) {
            jSONObject.put("LocalSocksProxyPort", num);
        }
        if (Build.VERSION.SDK_INT < 14) {
            try {
                jSONObject.put("TrustedCACertificatesFilename", setupTrustedCertificates(context, hostLogger));
            } catch (Exception e) {
                hostLogger.onDiagnosticMessage(e.getMessage());
            }
        }
        jSONObject.put("DeviceRegion", getDeviceRegion(context));
        StringBuilder sb2 = new StringBuilder();
        if (str2.length() > 0) {
            sb2.append(str2);
        }
        sb2.append("Android_");
        sb2.append(Build.VERSION.RELEASE);
        sb2.append("_");
        sb2.append(context.getPackageName());
        if (str3.length() > 0) {
            sb2.append(str3);
        }
        jSONObject.put("ClientPlatform", sb2.toString().replaceAll("[^\\w\\-\\.]", "_"));
        return jSONObject.toString();
    }

    public static File defaultDataRootDirectory(Context context) {
        return context.getFileStreamPath("ca.psiphon.PsiphonTunnel.tunnel-core");
    }

    public static Collection getActiveNetworkDNSServerAddresses(Context context, boolean z) {
        final ArrayList arrayList = new ArrayList();
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            try {
                Class<?> cls = Class.forName("android.net.LinkProperties");
                Object invoke = ConnectivityManager.class.getMethod("getActiveLinkProperties", new Class[0]).invoke(connectivityManager, new Object[0]);
                if (invoke != null) {
                    if (Build.VERSION.SDK_INT < 21) {
                        for (InetAddress add : (Collection) cls.getMethod("getDnses", new Class[0]).invoke(invoke, new Object[0])) {
                            arrayList.add(add);
                        }
                    } else {
                        for (InetAddress add2 : ((LinkProperties) invoke).getDnsServers()) {
                            arrayList.add(add2);
                        }
                    }
                }
            } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | NullPointerException | InvocationTargetException unused) {
            }
            if (arrayList.isEmpty() && Build.VERSION.SDK_INT >= 21) {
                NetworkRequest.Builder addCapability = new NetworkRequest.Builder().addCapability(12);
                if (z) {
                    addCapability.addCapability(15);
                }
                NetworkRequest build = addCapability.build();
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                try {
                    AnonymousClass3 r3 = new ConnectivityManager.NetworkCallback() {
                        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
                            arrayList.addAll(linkProperties.getDnsServers());
                            countDownLatch.countDown();
                        }
                    };
                    connectivityManager.registerNetworkCallback(build, r3);
                    countDownLatch.await(1, TimeUnit.SECONDS);
                    connectivityManager.unregisterNetworkCallback(r3);
                } catch (RuntimeException unused2) {
                } catch (InterruptedException unused3) {
                    Thread.currentThread().interrupt();
                }
            }
            return arrayList;
        }
        throw new Exception("getActiveNetworkDNSServerAddresses failed", new Throwable("couldn't get ConnectivityManager system service"));
    }

    public static Collection getActiveNetworkDNSServers(Context context, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (InetAddress obj : getActiveNetworkDNSServerAddresses(context, z)) {
            String obj2 = obj.toString();
            if (obj2.startsWith("/")) {
                obj2 = obj2.substring(1);
            }
            arrayList.add(obj2);
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new Exception("no active network DNS resolver");
    }

    /* access modifiers changed from: private */
    public String getDNSServers(Context context, HostLogger hostLogger) {
        String str = (String) this.mActiveNetworkDNSServers.get();
        if (str != "") {
            return str;
        }
        try {
            str = TextUtils.join(",", getActiveNetworkDNSServers(context, this.mVpnMode.get()));
            return str;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("failed to get active network DNS resolver: ");
            sb.append(e.getMessage());
            hostLogger.onDiagnosticMessage(sb.toString());
            return str;
        }
    }

    public static String getNetworkID(Context context) {
        NetworkInfo networkInfo;
        String str;
        try {
            networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Exception unused) {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.getType() == 1) {
            str = "WIFI";
            try {
                WifiInfo A00 = AnonymousClass0fl.A00((WifiManager) context.getSystemService(NetInfoModule.CONNECTION_TYPE_WIFI));
                if (A00 == null) {
                    return str;
                }
                String bssid = A00.getBSSID();
                if (bssid.equals("02:00:00:00:00:00")) {
                    bssid = String.valueOf(A00.getIpAddress());
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("-");
                sb.append(bssid);
                return sb.toString();
            } catch (Exception unused2) {
                return str;
            }
        } else if (networkInfo == null || networkInfo.getType() != 0) {
            return "UNKNOWN";
        } else {
            str = "MOBILE";
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return str;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("-");
            sb2.append(telephonyManager.getNetworkOperator());
            return sb2.toString();
        }
    }

    private void handlePsiphonNotice(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("noticeType");
            boolean z = true;
            int i = 0;
            if (string.equals("Tunnels")) {
                int i2 = jSONObject.getJSONObject("data").getInt("count");
                if (i2 == 0) {
                    this.mHostService.onConnecting();
                } else if (i2 == 1) {
                    if (isVpnMode() && this.mShouldRouteThroughTunnelAutomatically) {
                        routeThroughTunnel();
                    }
                    this.mHostService.onConnected();
                }
            } else if (string.equals("AvailableEgressRegions")) {
                JSONArray jSONArray = jSONObject.getJSONObject("data").getJSONArray("regions");
                ArrayList arrayList = new ArrayList();
                while (i < jSONArray.length()) {
                    arrayList.add(jSONArray.getString(i));
                    i++;
                }
                this.mHostService.onAvailableEgressRegions(arrayList);
            } else if (string.equals("SocksProxyPortInUse")) {
                this.mHostService.onSocksProxyPortInUse(jSONObject.getJSONObject("data").getInt(TraceFieldType.Port));
            } else if (string.equals("HttpProxyPortInUse")) {
                this.mHostService.onHttpProxyPortInUse(jSONObject.getJSONObject("data").getInt(TraceFieldType.Port));
            } else if (string.equals("ListeningSocksProxyPort")) {
                int i3 = jSONObject.getJSONObject("data").getInt(TraceFieldType.Port);
                setLocalSocksProxyPort(i3);
                this.mHostService.onListeningSocksProxyPort(i3);
            } else if (string.equals("ListeningHttpProxyPort")) {
                this.mHostService.onListeningHttpProxyPort(jSONObject.getJSONObject("data").getInt(TraceFieldType.Port));
            } else {
                if (string.equals("UpstreamProxyError")) {
                    this.mHostService.onUpstreamProxyError(jSONObject.getJSONObject("data").getString(DialogModule.KEY_MESSAGE));
                } else if (string.equals("ClientUpgradeDownloaded")) {
                    this.mHostService.onClientUpgradeDownloaded(jSONObject.getJSONObject("data").getString("filename"));
                } else if (string.equals("ClientIsLatestVersion")) {
                    this.mHostService.onClientIsLatestVersion();
                } else if (string.equals("Homepage")) {
                    this.mHostService.onHomepage(jSONObject.getJSONObject("data").getString("url"));
                } else if (string.equals("ClientRegion")) {
                    this.mHostService.onClientRegion(jSONObject.getJSONObject("data").getString(ServerW3CShippingAddressConstants.REGION));
                } else if (string.equals("ClientAddress")) {
                    this.mHostService.onClientAddress(jSONObject.getJSONObject("data").getString("address"));
                } else if (string.equals("SplitTunnelRegions")) {
                    JSONArray jSONArray2 = jSONObject.getJSONObject("data").getJSONArray("regions");
                    ArrayList arrayList2 = new ArrayList();
                    while (i < jSONArray2.length()) {
                        arrayList2.add(jSONArray2.getString(i));
                        i++;
                    }
                    this.mHostService.onSplitTunnelRegions(arrayList2);
                } else if (string.equals("Untunneled")) {
                    this.mHostService.onUntunneledAddress(jSONObject.getJSONObject("data").getString("address"));
                } else if (string.equals("BytesTransferred")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    this.mHostService.onBytesTransferred(jSONObject2.getLong("sent"), jSONObject2.getLong("received"));
                } else if (string.equals("ActiveAuthorizationIDs")) {
                    JSONArray jSONArray3 = jSONObject.getJSONObject("data").getJSONArray("IDs");
                    ArrayList arrayList3 = new ArrayList();
                    while (i < jSONArray3.length()) {
                        arrayList3.add(jSONArray3.getString(i));
                        i++;
                    }
                    this.mHostService.onActiveAuthorizationIDs(arrayList3);
                } else if (string.equals("TrafficRateLimits")) {
                    JSONObject jSONObject3 = jSONObject.getJSONObject("data");
                    this.mHostService.onTrafficRateLimits(jSONObject3.getLong("upstreamBytesPerSecond"), jSONObject3.getLong("downstreamBytesPerSecond"));
                } else if (string.equals("Exiting")) {
                    this.mHostService.onExiting();
                } else if (string.equals("ActiveTunnel")) {
                    if (isVpnMode()) {
                        if (jSONObject.getJSONObject("data").getBoolean("isTCS")) {
                            disableUdpGwKeepalive();
                        } else {
                            enableUdpGwKeepalive();
                        }
                    }
                } else if (string.equals("ApplicationParameter")) {
                    this.mHostService.onApplicationParameter(jSONObject.getJSONObject("data").getString("key"), jSONObject.getJSONObject("data").get(IntentModule.EXTRA_MAP_KEY_FOR_VALUE));
                } else if (string.equals("ServerAlert")) {
                    JSONArray jSONArray4 = jSONObject.getJSONObject("data").getJSONArray("actionURLs");
                    ArrayList arrayList4 = new ArrayList();
                    while (i < jSONArray4.length()) {
                        arrayList4.add(jSONArray4.getString(i));
                        i++;
                    }
                    this.mHostService.onServerAlert(jSONObject.getJSONObject("data").getString("reason"), jSONObject.getJSONObject("data").getString("subject"), arrayList4);
                }
                z = false;
            }
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(": ");
                sb.append(jSONObject.getJSONObject("data").toString());
                this.mHostService.onDiagnosticMessage(sb.toString());
            }
        } catch (JSONException unused) {
        }
    }

    public static boolean hasNetworkConnectivity(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    private boolean isVpnMode() {
        return this.mVpnMode.get();
    }

    private String loadPsiphonConfig(Context context) {
        HostService hostService = this.mHostService;
        return buildPsiphonConfig(context, hostService, hostService.getPsiphonConfig(), (String) this.mClientPlatformPrefix.get(), (String) this.mClientPlatformSuffix.get(), isVpnMode(), Integer.valueOf(this.mLocalSocksProxyPort.get()));
    }

    public static void logTun2Socks(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append("tun2socks: ");
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append("): ");
        sb.append(str3);
        mPsiphonTunnel.mHostService.onDiagnosticMessage(sb.toString());
    }

    public static synchronized PsiphonTunnel newPsiphonTunnel(HostService hostService, boolean z) {
        PsiphonTunnel newPsiphonTunnelImpl;
        synchronized (PsiphonTunnel.class) {
            newPsiphonTunnelImpl = newPsiphonTunnelImpl(hostService, z);
        }
        return newPsiphonTunnelImpl;
    }

    public static PsiphonTunnel newPsiphonTunnelImpl(HostService hostService, boolean z) {
        PsiphonTunnel psiphonTunnel = mPsiphonTunnel;
        if (psiphonTunnel != null) {
            psiphonTunnel.stop();
        }
        hostService.loadLibrary("gojni");
        PsiphonTunnel psiphonTunnel2 = new PsiphonTunnel(hostService, z);
        mPsiphonTunnel = psiphonTunnel2;
        return psiphonTunnel2;
    }

    public static PrivateAddress selectPrivateAddress() {
        HashMap hashMap = new HashMap();
        hashMap.put("10", new PrivateAddress("10.0.0.1", "10.0.0.0", 8, "10.0.0.2"));
        hashMap.put("172", new PrivateAddress("172.16.0.1", "172.16.0.0", 12, "172.16.0.2"));
        hashMap.put("192", new PrivateAddress("192.168.0.1", "192.168.0.0", 16, "192.168.0.2"));
        hashMap.put("169", new PrivateAddress("169.254.1.1", "169.254.1.0", 24, "169.254.1.2"));
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces != null) {
                Iterator<T> it = Collections.list(networkInterfaces).iterator();
                while (it.hasNext()) {
                    Iterator<T> it2 = Collections.list(((NetworkInterface) it.next()).getInetAddresses()).iterator();
                    while (it2.hasNext()) {
                        InetAddress inetAddress = (InetAddress) it2.next();
                        if (inetAddress instanceof Inet4Address) {
                            String hostAddress = inetAddress.getHostAddress();
                            if (hostAddress.startsWith("10.")) {
                                hashMap.remove("10");
                            } else if (hostAddress.length() >= 6 && hostAddress.substring(0, 6).compareTo("172.16") >= 0 && hostAddress.substring(0, 6).compareTo("172.31") <= 0) {
                                hashMap.remove("172");
                            } else if (hostAddress.startsWith("192.168")) {
                                hashMap.remove("192");
                            }
                        }
                    }
                }
                if (hashMap.size() > 0) {
                    return (PrivateAddress) hashMap.values().iterator().next();
                }
                throw new Exception("no private address available");
            }
            throw new Exception("no network interfaces found");
        } catch (SocketException e) {
            throw new Exception("selectPrivateAddress failed", e);
        }
    }

    private void setLocalSocksProxyPort(int i) {
        this.mLocalSocksProxyPort.set(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ab A[SYNTHETIC, Splitter:B:35:0x00ab] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String setupTrustedCertificates(android.content.Context r8, ca.psiphon.PsiphonTunnel.HostLogger r9) {
        /*
            java.lang.String r2 = "copy AndroidCAStore failed"
            java.lang.String r1 = "PsiphonCAStore"
            r0 = 0
            java.io.File r1 = r8.getDir(r1, r0)
            java.io.File r4 = new java.io.File     // Catch:{ KeyStoreException -> 0x00c4, NoSuchAlgorithmException -> 0x00bd, CertificateException -> 0x00b6, IOException -> 0x00af }
            java.lang.String r0 = "certs.dat"
            r4.<init>(r1, r0)     // Catch:{ KeyStoreException -> 0x00c4, NoSuchAlgorithmException -> 0x00bd, CertificateException -> 0x00b6, IOException -> 0x00af }
            r4.delete()     // Catch:{ KeyStoreException -> 0x00c4, NoSuchAlgorithmException -> 0x00bd, CertificateException -> 0x00b6, IOException -> 0x00af }
            r5 = 0
            java.io.PrintStream r3 = new java.io.PrintStream     // Catch:{ all -> 0x00a7 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ all -> 0x00a7 }
            r0.<init>(r4)     // Catch:{ all -> 0x00a7 }
            r3.<init>(r0)     // Catch:{ all -> 0x00a7 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00a5 }
            r0 = 14
            if (r1 < r0) goto L_0x0078
            java.lang.String r0 = "AndroidCAStore"
            java.security.KeyStore r6 = java.security.KeyStore.getInstance(r0)     // Catch:{ all -> 0x00a5 }
            r6.load(r5, r5)     // Catch:{ all -> 0x00a5 }
        L_0x002d:
            java.util.Enumeration r8 = r6.aliases()     // Catch:{ all -> 0x00a5 }
        L_0x0031:
            boolean r0 = r8.hasMoreElements()     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x0092
            java.lang.Object r0 = r8.nextElement()     // Catch:{ all -> 0x00a5 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x00a5 }
            java.security.cert.Certificate r1 = r6.getCertificate(r0)     // Catch:{ all -> 0x00a5 }
            java.security.cert.X509Certificate r1 = (java.security.cert.X509Certificate) r1     // Catch:{ all -> 0x00a5 }
            java.lang.String r0 = "-----BEGIN CERTIFICATE-----"
            r3.println(r0)     // Catch:{ all -> 0x00a5 }
            java.lang.String r7 = new java.lang.String     // Catch:{ all -> 0x00a5 }
            byte[] r1 = r1.getEncoded()     // Catch:{ all -> 0x00a5 }
            r0 = 2
            byte[] r1 = android.util.Base64.encode(r1, r0)     // Catch:{ all -> 0x00a5 }
            java.lang.String r0 = "UTF-8"
            r7.<init>(r1, r0)     // Catch:{ all -> 0x00a5 }
            r5 = 0
        L_0x0059:
            int r0 = r7.length()     // Catch:{ all -> 0x00a5 }
            if (r5 >= r0) goto L_0x0072
            int r1 = r5 + 64
            int r0 = r7.length()     // Catch:{ all -> 0x00a5 }
            int r0 = java.lang.Math.min(r1, r0)     // Catch:{ all -> 0x00a5 }
            java.lang.String r0 = r7.substring(r5, r0)     // Catch:{ all -> 0x00a5 }
            r3.println(r0)     // Catch:{ all -> 0x00a5 }
            r5 = r1
            goto L_0x0059
        L_0x0072:
            java.lang.String r0 = "-----END CERTIFICATE-----"
            r3.println(r0)     // Catch:{ all -> 0x00a5 }
            goto L_0x0031
        L_0x0078:
            java.lang.String r0 = "BKS"
            java.security.KeyStore r6 = java.security.KeyStore.getInstance(r0)     // Catch:{ all -> 0x00a5 }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x00a5 }
            java.lang.String r0 = "/etc/security/cacerts.bks"
            r1.<init>(r0)     // Catch:{ all -> 0x00a5 }
            java.lang.String r0 = "changeit"
            char[] r0 = r0.toCharArray()     // Catch:{ all -> 0x00a0 }
            r6.load(r1, r0)     // Catch:{ all -> 0x00a0 }
            r1.close()     // Catch:{ all -> 0x00a5 }
            goto L_0x002d
        L_0x0092:
            java.lang.String r0 = "prepared PsiphonCAStore"
            r9.onDiagnosticMessage(r0)     // Catch:{ all -> 0x00a5 }
            java.lang.String r0 = r4.getAbsolutePath()     // Catch:{ all -> 0x00a5 }
            r3.close()     // Catch:{ KeyStoreException -> 0x00c4, NoSuchAlgorithmException -> 0x00bd, CertificateException -> 0x00b6, IOException -> 0x00af }
            return r0
        L_0x00a0:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x00a5 }
            throw r0     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r0 = move-exception
            goto L_0x00a9
        L_0x00a7:
            r0 = move-exception
            r3 = r5
        L_0x00a9:
            if (r3 == 0) goto L_0x00ae
            r3.close()     // Catch:{ KeyStoreException -> 0x00c4, NoSuchAlgorithmException -> 0x00bd, CertificateException -> 0x00b6, IOException -> 0x00af }
        L_0x00ae:
            throw r0     // Catch:{ KeyStoreException -> 0x00c4, NoSuchAlgorithmException -> 0x00bd, CertificateException -> 0x00b6, IOException -> 0x00af }
        L_0x00af:
            r1 = move-exception
            ca.psiphon.PsiphonTunnel$Exception r0 = new ca.psiphon.PsiphonTunnel$Exception
            r0.<init>(r2, r1)
            throw r0
        L_0x00b6:
            r1 = move-exception
            ca.psiphon.PsiphonTunnel$Exception r0 = new ca.psiphon.PsiphonTunnel$Exception
            r0.<init>(r2, r1)
            throw r0
        L_0x00bd:
            r1 = move-exception
            ca.psiphon.PsiphonTunnel$Exception r0 = new ca.psiphon.PsiphonTunnel$Exception
            r0.<init>(r2, r1)
            throw r0
        L_0x00c4:
            r1 = move-exception
            ca.psiphon.PsiphonTunnel$Exception r0 = new ca.psiphon.PsiphonTunnel$Exception
            r0.<init>(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ca.psiphon.PsiphonTunnel.setupTrustedCertificates(android.content.Context, ca.psiphon.PsiphonTunnel$HostLogger):java.lang.String");
    }

    private void stopPsiphon() {
        this.mHostService.onDiagnosticMessage("stopping Psiphon library");
        this.mNetworkMonitor.stop(this.mHostService.getContext());
        Psi.stop();
        this.mHostService.onDiagnosticMessage("Psiphon library stopped");
    }

    private void stopTun2Socks() {
        if (this.mTun2SocksThread != null) {
            try {
                terminateTun2Socks();
                this.mTun2SocksThread.join();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            this.mTun2SocksThread = null;
            this.mHostService.onDiagnosticMessage("tun2socks stopped");
        }
    }

    public Object clone() {
        throw new CloneNotSupportedException();
    }

    public void routeThroughTunnel() {
        ParcelFileDescriptor parcelFileDescriptor;
        if (this.mRoutingThroughTunnel.compareAndSet(false, true) && (parcelFileDescriptor = (ParcelFileDescriptor) this.mTunFd.getAndSet((Object) null)) != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("127.0.0.1:");
            sb.append(Integer.toString(this.mLocalSocksProxyPort.get()));
            String obj = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("127.0.0.1:");
            sb2.append(Integer.toString(UDPGW_SERVER_PORT));
            startTun2Socks(parcelFileDescriptor, VPN_INTERFACE_MTU, this.mPrivateAddress.mRouter, VPN_INTERFACE_NETMASK, obj, sb2.toString(), true);
            this.mHostService.onDiagnosticMessage("routing through tunnel");
        }
    }

    public void setClientPlatformAffixes(String str, String str2) {
        this.mClientPlatformPrefix.set(str);
        this.mClientPlatformSuffix.set(str2);
    }

    public PsiphonTunnel(HostService hostService, boolean z) {
        this.mHostService = hostService;
        this.mShouldRouteThroughTunnelAutomatically = z;
        this.mActiveNetworkType = new AtomicReference("");
        this.mActiveNetworkDNSServers = new AtomicReference("");
        this.mNetworkMonitor = new NetworkMonitor(new NetworkMonitor.NetworkChangeListener() {
            public void onChanged() {
                try {
                    PsiphonTunnel.this.reconnectPsiphon();
                } catch (Exception e) {
                    HostService access$000 = PsiphonTunnel.this.mHostService;
                    StringBuilder sb = new StringBuilder();
                    sb.append("reconnect error: ");
                    sb.append(e);
                    access$000.onDiagnosticMessage(sb.toString());
                }
            }
        }, this.mActiveNetworkType, this.mActiveNetworkDNSServers, hostService);
    }

    public static String getDefaultUpgradeDownloadFilePath(Context context) {
        return Psi.upgradeDownloadFilePath(defaultDataRootDirectory(context).getAbsolutePath());
    }

    public static String getDeviceRegion(Context context) {
        Locale locale;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        String str = "";
        if (telephonyManager != null) {
            String simCountryIso = telephonyManager.getSimCountryIso();
            if (simCountryIso == null) {
                simCountryIso = str;
            }
            if (simCountryIso.length() != 0 || telephonyManager.getPhoneType() == 2) {
                str = simCountryIso;
            } else {
                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                if (networkCountryIso != null) {
                    str = networkCountryIso;
                }
            }
        }
        if (str.length() == 0 && (locale = Locale.getDefault()) != null) {
            str = locale.getCountry();
        }
        return str.toUpperCase(Locale.US);
    }

    public static String getUpgradeDownloadFilePath(String str) {
        return Psi.upgradeDownloadFilePath(str);
    }

    public static long hasIPv6Route(Context context, HostLogger hostLogger) {
        boolean z;
        try {
            z = hasIPv6Route(context);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("failed to check IPv6 route: ");
            sb.append(e.getMessage());
            hostLogger.onDiagnosticMessage(sb.toString());
            z = false;
        }
        if (z) {
            return 1;
        }
        return 0;
    }

    private ParcelFileDescriptor startDummyVpn(VpnService.Builder builder) {
        PrivateAddress selectPrivateAddress = selectPrivateAddress();
        Locale locale = Locale.getDefault();
        try {
            Locale.setDefault(new Locale("en"));
            ParcelFileDescriptor establish = builder.setSession(this.mHostService.getAppName()).setMtu(VPN_INTERFACE_MTU).addAddress(selectPrivateAddress.mIpAddress, selectPrivateAddress.mPrefixLength).addRoute("0.0.0.0", 0).addRoute(selectPrivateAddress.mSubnet, selectPrivateAddress.mPrefixLength).addDnsServer(selectPrivateAddress.mRouter).establish();
            Locale.setDefault(locale);
            return establish;
        } catch (IllegalArgumentException e) {
            throw new Exception("startDummyVpn failed", e);
        } catch (IllegalStateException e2) {
            throw new Exception("startDummyVpn failed", e2);
        } catch (SecurityException e3) {
            throw new Exception("startDummyVpn failed", e3);
        } catch (Throwable th) {
            Locale.setDefault(locale);
            throw th;
        }
    }

    private void startPsiphon(String str) {
        stopPsiphon();
        this.mIsWaitingForNetworkConnectivity.set(false);
        this.mHostService.onDiagnosticMessage("starting Psiphon library");
        try {
            Psi.start(loadPsiphonConfig(this.mHostService.getContext()), str, "", new PsiphonProviderShim(this), isVpnMode(), false, true);
            this.mNetworkMonitor.start(this.mHostService.getContext());
            this.mHostService.onDiagnosticMessage("Psiphon library started");
        } catch (Exception e) {
            throw new Exception("failed to start Psiphon library", e);
        }
    }

    private boolean startVpn() {
        this.mVpnMode.set(true);
        this.mPrivateAddress = selectPrivateAddress();
        Locale locale = Locale.getDefault();
        try {
            Locale.setDefault(new Locale("en"));
            ParcelFileDescriptor establish = ((VpnService.Builder) this.mHostService.newVpnServiceBuilder()).setSession(this.mHostService.getAppName()).setMtu(VPN_INTERFACE_MTU).addAddress(this.mPrivateAddress.mIpAddress, this.mPrivateAddress.mPrefixLength).addRoute("0.0.0.0", 0).addRoute(this.mPrivateAddress.mSubnet, this.mPrivateAddress.mPrefixLength).addDnsServer(this.mPrivateAddress.mRouter).establish();
            if (establish == null) {
                Locale.setDefault(locale);
                return false;
            }
            this.mTunFd.set(establish);
            this.mRoutingThroughTunnel.set(false);
            this.mHostService.onDiagnosticMessage("VPN established");
            Locale.setDefault(locale);
            return true;
        } catch (IllegalArgumentException e) {
            throw new Exception("startVpn failed", e);
        } catch (IllegalStateException e2) {
            throw new Exception("startVpn failed", e2);
        } catch (SecurityException e3) {
            throw new Exception("startVpn failed", e3);
        } catch (Throwable th) {
            Locale.setDefault(locale);
            throw th;
        }
    }

    private void stopVpn() {
        stopTun2Socks();
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) this.mTunFd.getAndSet((Object) null);
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
        this.mRoutingThroughTunnel.set(false);
    }

    public String exportExchangePayload() {
        return Psi.exportExchangePayload();
    }

    public boolean importExchangePayload(String str) {
        return Psi.importExchangePayload(str);
    }

    /* access modifiers changed from: private */
    public void notice(String str) {
        handlePsiphonNotice(str);
    }

    public static boolean hasIPv6Route(Context context) {
        try {
            Iterator<T> it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            while (it.hasNext()) {
                NetworkInterface networkInterface = (NetworkInterface) it.next();
                if (networkInterface.isUp() && !networkInterface.isLoopback() && !networkInterface.isPointToPoint()) {
                    Iterator<T> it2 = Collections.list(networkInterface.getInetAddresses()).iterator();
                    while (it2.hasNext()) {
                        InetAddress inetAddress = (InetAddress) it2.next();
                        if ((inetAddress instanceof Inet6Address) && !inetAddress.isLinkLocalAddress() && !inetAddress.isSiteLocalAddress() && !inetAddress.isMulticastAddress()) {
                            return true;
                        }
                    }
                    continue;
                }
            }
            return false;
        } catch (SocketException e) {
            throw new Exception("hasIPv6Route failed", e);
        }
    }

    /* access modifiers changed from: private */
    public long hasNetworkConnectivity() {
        boolean hasNetworkConnectivity = hasNetworkConnectivity(this.mHostService.getContext());
        boolean andSet = this.mIsWaitingForNetworkConnectivity.getAndSet(!hasNetworkConnectivity);
        if (!hasNetworkConnectivity && !andSet) {
            this.mHostService.onStartedWaitingForNetworkConnectivity();
        } else if (hasNetworkConnectivity && andSet) {
            this.mHostService.onStoppedWaitingForNetworkConnectivity();
        }
        if (hasNetworkConnectivity) {
            return 1;
        }
        return 0;
    }

    public static synchronized PsiphonTunnel newPsiphonTunnel(HostService hostService) {
        PsiphonTunnel newPsiphonTunnelImpl;
        synchronized (PsiphonTunnel.class) {
            newPsiphonTunnelImpl = newPsiphonTunnelImpl(hostService, true);
        }
        return newPsiphonTunnelImpl;
    }
}
