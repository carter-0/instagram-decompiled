package org.webrtc;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C51969G9p;
import X.Pxe;
import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.webrtc.NetworkChangeDetector;

public class NetworkMonitor {
    public static final String TAG = "NetworkMonitor";
    public volatile NetworkChangeDetector.ConnectionType currentConnectionType;
    public final ArrayList nativeNetworkObservers;
    public NetworkChangeDetector networkChangeDetector;
    public NetworkChangeDetectorFactory networkChangeDetectorFactory;
    public final Object networkChangeDetectorLock;
    public final ArrayList networkObservers;
    public int numObservers;

    public class InstanceHolder {
        public static final NetworkMonitor instance = new NetworkMonitor();
    }

    public interface NetworkObserver {
        void onConnectionTypeChanged(NetworkChangeDetector.ConnectionType connectionType);
    }

    @Deprecated
    public static void init(Context context) {
    }

    private native void nativeNotifyConnectionTypeChanged(long j);

    private native void nativeNotifyOfActiveNetworkList(long j, NetworkChangeDetector.NetworkInformation[] networkInformationArr);

    private native void nativeNotifyOfNetworkConnect(long j, NetworkChangeDetector.NetworkInformation networkInformation);

    private native void nativeNotifyOfNetworkDisconnect(long j, long j2);

    private native void nativeNotifyOfNetworkPreference(long j, NetworkChangeDetector.ConnectionType connectionType, int i);

    @Deprecated
    public static void addNetworkObserver(NetworkObserver networkObserver) {
        InstanceHolder.instance.addObserver(networkObserver);
    }

    public static int androidSdkInt() {
        return Build.VERSION.SDK_INT;
    }

    public static void assertIsTrue(boolean z) {
        if (!z) {
            throw Pxe.A0e("Expected to be true");
        }
    }

    public static NetworkMonitorAutoDetect createAndSetAutoDetectForTest(Context context, String str) {
        NetworkMonitor networkMonitor = InstanceHolder.instance;
        NetworkChangeDetector createNetworkChangeDetector = networkMonitor.createNetworkChangeDetector(context, str);
        networkMonitor.networkChangeDetector = createNetworkChangeDetector;
        return (NetworkMonitorAutoDetect) createNetworkChangeDetector;
    }

    private NetworkChangeDetector createNetworkChangeDetector(Context context, final String str) {
        return this.networkChangeDetectorFactory.create(new NetworkChangeDetector.Observer() {
            public String getFieldTrialsString() {
                return str;
            }

            public void onConnectionTypeChanged(NetworkChangeDetector.ConnectionType connectionType) {
                NetworkMonitor.this.updateCurrentConnectionType(connectionType);
            }

            public void onNetworkConnect(NetworkChangeDetector.NetworkInformation networkInformation) {
                NetworkMonitor.this.notifyObserversOfNetworkConnect(networkInformation);
            }

            public void onNetworkDisconnect(long j) {
                NetworkMonitor.this.notifyObserversOfNetworkDisconnect(j);
            }

            public void onNetworkPreference(List list, int i) {
                NetworkMonitor.this.notifyObserversOfNetworkPreference(list, i);
            }
        }, context);
    }

    private NetworkChangeDetector.ConnectionType getCurrentConnectionType() {
        return this.currentConnectionType;
    }

    public static NetworkMonitor getInstance() {
        return InstanceHolder.instance;
    }

    public static boolean isOnline() {
        return C51969G9p.A1a(InstanceHolder.instance.currentConnectionType, NetworkChangeDetector.ConnectionType.CONNECTION_NONE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
        if (r1 == false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean networkBindingSupported() {
        /*
            r3 = this;
            java.lang.Object r2 = r3.networkChangeDetectorLock
            monitor-enter(r2)
            org.webrtc.NetworkChangeDetector r0 = r3.networkChangeDetector     // Catch:{ all -> 0x0011 }
            if (r0 == 0) goto L_0x000e
            boolean r1 = r0.supportNetworkCallback()     // Catch:{ all -> 0x0011 }
            r0 = 1
            if (r1 != 0) goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            monitor-exit(r2)     // Catch:{ all -> 0x0011 }
            return r0
        L_0x0011:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0011 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.NetworkMonitor.networkBindingSupported():boolean");
    }

    private void notifyObserversOfConnectionTypeChange(NetworkChangeDetector.ConnectionType connectionType) {
        ArrayList A1D;
        synchronized (this.nativeNetworkObservers) {
            Iterator it = this.nativeNetworkObservers.iterator();
            while (it.hasNext()) {
                nativeNotifyConnectionTypeChanged(((Long) it.next()).longValue());
            }
        }
        synchronized (this.networkObservers) {
            A1D = AnonymousClass7TE.A1D(this.networkObservers);
        }
        Iterator it2 = A1D.iterator();
        while (it2.hasNext()) {
            ((NetworkObserver) it2.next()).onConnectionTypeChanged(connectionType);
        }
    }

    /* access modifiers changed from: private */
    public void notifyObserversOfNetworkConnect(NetworkChangeDetector.NetworkInformation networkInformation) {
        synchronized (this.nativeNetworkObservers) {
            Iterator it = this.nativeNetworkObservers.iterator();
            while (it.hasNext()) {
                nativeNotifyOfNetworkConnect(((Long) it.next()).longValue(), networkInformation);
            }
        }
    }

    /* access modifiers changed from: private */
    public void notifyObserversOfNetworkDisconnect(long j) {
        synchronized (this.nativeNetworkObservers) {
            Iterator it = this.nativeNetworkObservers.iterator();
            while (it.hasNext()) {
                nativeNotifyOfNetworkDisconnect(((Long) it.next()).longValue(), j);
            }
        }
    }

    /* access modifiers changed from: private */
    public void notifyObserversOfNetworkPreference(List list, int i) {
        synchronized (this.nativeNetworkObservers) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                NetworkChangeDetector.ConnectionType connectionType = (NetworkChangeDetector.ConnectionType) it.next();
                Iterator it2 = this.nativeNetworkObservers.iterator();
                while (it2.hasNext()) {
                    nativeNotifyOfNetworkPreference(((Long) it2.next()).longValue(), connectionType, i);
                }
            }
        }
    }

    @Deprecated
    public static void removeNetworkObserver(NetworkObserver networkObserver) {
        InstanceHolder.instance.removeObserver(networkObserver);
    }

    private void startMonitoring(Context context, long j, String str) {
        boolean z = Logging.loggingEnabled;
        if (context == null) {
            context = ContextUtils.applicationContext;
        }
        startMonitoring(context, str);
        synchronized (this.nativeNetworkObservers) {
            AnonymousClass7TE.A1Y(this.nativeNetworkObservers, j);
        }
        updateObserverActiveNetworkList(j);
        notifyObserversOfConnectionTypeChange(this.currentConnectionType);
    }

    private void stopMonitoring(long j) {
        boolean z = Logging.loggingEnabled;
        stopMonitoring();
        synchronized (this.nativeNetworkObservers) {
            this.nativeNetworkObservers.remove(Long.valueOf(j));
        }
    }

    /* access modifiers changed from: private */
    public void updateCurrentConnectionType(NetworkChangeDetector.ConnectionType connectionType) {
        this.currentConnectionType = connectionType;
        notifyObserversOfConnectionTypeChange(connectionType);
    }

    private void updateObserverActiveNetworkList(long j) {
        List list;
        synchronized (this.networkChangeDetectorLock) {
            NetworkChangeDetector networkChangeDetector2 = this.networkChangeDetector;
            if (networkChangeDetector2 == null) {
                list = null;
            } else {
                list = networkChangeDetector2.getActiveNetworkList();
            }
        }
        if (list != null) {
            nativeNotifyOfActiveNetworkList(j, (NetworkChangeDetector.NetworkInformation[]) list.toArray(new NetworkChangeDetector.NetworkInformation[list.size()]));
        }
    }

    public void addObserver(NetworkObserver networkObserver) {
        synchronized (this.networkObservers) {
            this.networkObservers.add(networkObserver);
        }
    }

    public NetworkChangeDetector getNetworkChangeDetector() {
        NetworkChangeDetector networkChangeDetector2;
        synchronized (this.networkChangeDetectorLock) {
            networkChangeDetector2 = this.networkChangeDetector;
        }
        return networkChangeDetector2;
    }

    public int getNumObservers() {
        int i;
        synchronized (this.networkChangeDetectorLock) {
            i = this.numObservers;
        }
        return i;
    }

    public void removeObserver(NetworkObserver networkObserver) {
        synchronized (this.networkObservers) {
            this.networkObservers.remove(networkObserver);
        }
    }

    public void setNetworkChangeDetectorFactory(NetworkChangeDetectorFactory networkChangeDetectorFactory2) {
        assertIsTrue(AnonymousClass7TF.A1Q(this.numObservers));
        this.networkChangeDetectorFactory = networkChangeDetectorFactory2;
    }

    public NetworkMonitor() {
        this.networkChangeDetectorFactory = new NetworkChangeDetectorFactory() {
            public NetworkChangeDetector create(NetworkChangeDetector.Observer observer, Context context) {
                return new NetworkMonitorAutoDetect(observer, context);
            }
        };
        this.networkChangeDetectorLock = Pxe.A0p();
        this.nativeNetworkObservers = AnonymousClass7TE.A1C();
        this.networkObservers = AnonymousClass7TE.A1C();
        this.numObservers = 0;
        this.currentConnectionType = NetworkChangeDetector.ConnectionType.CONNECTION_UNKNOWN;
    }

    public void startMonitoring(Context context, String str) {
        synchronized (this.networkChangeDetectorLock) {
            this.numObservers++;
            NetworkChangeDetector networkChangeDetector2 = this.networkChangeDetector;
            if (networkChangeDetector2 == null) {
                networkChangeDetector2 = createNetworkChangeDetector(context, str);
                this.networkChangeDetector = networkChangeDetector2;
            }
            this.currentConnectionType = networkChangeDetector2.getCurrentConnectionType();
        }
    }

    public void stopMonitoring() {
        synchronized (this.networkChangeDetectorLock) {
            int i = this.numObservers - 1;
            this.numObservers = i;
            if (i == 0) {
                this.networkChangeDetector.destroy();
                this.networkChangeDetector = null;
            }
        }
    }

    @Deprecated
    public void startMonitoring(Context context) {
        startMonitoring(context, "");
    }

    @Deprecated
    public void startMonitoring() {
        startMonitoring(ContextUtils.applicationContext, "");
    }
}
