package org.webrtc;

import X.AnonymousClass7TE;
import X.C51968G9o;
import X.C51973G9u;
import X.Pxg;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.webrtc.DataChannel;
import org.webrtc.MediaStreamTrack;
import org.webrtc.RtpTransceiver;

public class PeerConnection {
    public final List localStreams;
    public final long nativePeerConnection;
    public List receivers;
    public List senders;
    public List transceivers;

    public enum AdapterType {
        UNKNOWN(0),
        ETHERNET(1),
        WIFI(2),
        CELLULAR(4),
        VPN(8),
        LOOPBACK(16),
        ADAPTER_TYPE_ANY(32),
        CELLULAR_2G(64),
        CELLULAR_3G(128),
        CELLULAR_4G(256),
        CELLULAR_5G(512);
        
        public static final Map BY_BITMASK = null;
        public final Integer bitMask;

        /* access modifiers changed from: public */
        static {
            int i;
            BY_BITMASK = AnonymousClass7TE.A1E();
            for (AdapterType adapterType : values()) {
                BY_BITMASK.put(adapterType.bitMask, adapterType);
            }
        }

        public static AdapterType fromNativeIndex(int i) {
            return (AdapterType) C51968G9o.A10(BY_BITMASK, i);
        }

        /* access modifiers changed from: public */
        AdapterType(Integer num) {
            this.bitMask = num;
        }
    }

    public class IceServer {
        public final String hostname;
        public final String password;
        public final List tlsAlpnProtocols;
        public final TlsCertPolicy tlsCertPolicy;
        public final List tlsEllipticCurves;
        @Deprecated
        public final String uri;
        public final List urls;
        public final String username;

        public class Builder {
            public String hostname;
            public String password;
            public List tlsAlpnProtocols;
            public TlsCertPolicy tlsCertPolicy;
            public List tlsEllipticCurves;
            public final List urls;
            public String username;

            public IceServer createIceServer() {
                return new IceServer((String) AnonymousClass7TE.A13(this.urls), this.urls, this.username, this.password, this.tlsCertPolicy, this.hostname, this.tlsAlpnProtocols, this.tlsEllipticCurves);
            }

            public Builder setHostname(String str) {
                this.hostname = str;
                return this;
            }

            public Builder setPassword(String str) {
                this.password = str;
                return this;
            }

            public Builder setTlsAlpnProtocols(List list) {
                this.tlsAlpnProtocols = list;
                return this;
            }

            public Builder setTlsCertPolicy(TlsCertPolicy tlsCertPolicy2) {
                this.tlsCertPolicy = tlsCertPolicy2;
                return this;
            }

            public Builder setTlsEllipticCurves(List list) {
                this.tlsEllipticCurves = list;
                return this;
            }

            public Builder setUsername(String str) {
                this.username = str;
                return this;
            }

            public Builder(List list) {
                this.username = "";
                this.password = "";
                this.tlsCertPolicy = TlsCertPolicy.TLS_CERT_POLICY_SECURE;
                this.hostname = "";
                if (list == null || list.isEmpty()) {
                    throw C51973G9u.A0g(list, "urls == null || urls.isEmpty(): ", AnonymousClass7TE.A1A());
                }
                this.urls = list;
            }
        }

        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof IceServer)) {
                return false;
            }
            IceServer iceServer = (IceServer) obj;
            return this.uri.equals(iceServer.uri) && this.urls.equals(iceServer.urls) && this.username.equals(iceServer.username) && this.password.equals(iceServer.password) && this.tlsCertPolicy.equals(iceServer.tlsCertPolicy) && this.hostname.equals(iceServer.hostname) && this.tlsAlpnProtocols.equals(iceServer.tlsAlpnProtocols) && this.tlsEllipticCurves.equals(iceServer.tlsEllipticCurves);
        }

        @Deprecated
        public IceServer(String str, String str2, String str3) {
            this(str, str2, str3, TlsCertPolicy.TLS_CERT_POLICY_SECURE);
        }

        public String getHostname() {
            return this.hostname;
        }

        public String getPassword() {
            return this.password;
        }

        public List getTlsAlpnProtocols() {
            return this.tlsAlpnProtocols;
        }

        public TlsCertPolicy getTlsCertPolicy() {
            return this.tlsCertPolicy;
        }

        public List getTlsEllipticCurves() {
            return this.tlsEllipticCurves;
        }

        public List getUrls() {
            return this.urls;
        }

        public String getUsername() {
            return this.username;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.uri, this.urls, this.username, this.password, this.tlsCertPolicy, this.hostname, this.tlsAlpnProtocols, this.tlsEllipticCurves});
        }

        public static Builder builder(String str) {
            return new Builder(Collections.singletonList(str));
        }

        public String toString() {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append(this.urls);
            A1A.append(" [");
            A1A.append(this.username);
            A1A.append(":");
            A1A.append(this.password);
            A1A.append("] [");
            A1A.append(this.tlsCertPolicy);
            A1A.append("] [");
            A1A.append(this.hostname);
            A1A.append("] [");
            A1A.append(this.tlsAlpnProtocols);
            A1A.append("] [");
            return Pxg.A0r(this.tlsEllipticCurves, A1A);
        }

        @Deprecated
        public IceServer(String str, String str2, String str3, TlsCertPolicy tlsCertPolicy2, String str4) {
            this(str, Collections.singletonList(str), str2, str3, tlsCertPolicy2, str4, (List) null, (List) null);
        }

        public static Builder builder(List list) {
            return new Builder(list);
        }

        public IceServer(String str, List list, String str2, String str3, TlsCertPolicy tlsCertPolicy2, String str4, List list2, List list3) {
            if (str == null || list == null || list.isEmpty()) {
                throw AnonymousClass7TE.A0w("uri == null || urls == null || urls.isEmpty()");
            }
            for (Object obj : list) {
                if (obj == null) {
                    throw C51973G9u.A0g(list, "urls element is null: ", AnonymousClass7TE.A1A());
                }
            }
            if (str2 == null) {
                throw AnonymousClass7TE.A0w("username == null");
            } else if (str3 == null) {
                throw AnonymousClass7TE.A0w("password == null");
            } else if (str4 != null) {
                this.uri = str;
                this.urls = list;
                this.username = str2;
                this.password = str3;
                this.tlsCertPolicy = tlsCertPolicy2;
                this.hostname = str4;
                this.tlsAlpnProtocols = list2;
                this.tlsEllipticCurves = list3;
            } else {
                throw AnonymousClass7TE.A0w("hostname == null");
            }
        }

        @Deprecated
        public IceServer(String str, String str2, String str3, TlsCertPolicy tlsCertPolicy2) {
            this(str, str2, str3, tlsCertPolicy2, "");
        }

        @Deprecated
        public IceServer(String str) {
            this(str, "", "");
        }
    }

    public enum TlsCertPolicy {
        TLS_CERT_POLICY_SECURE,
        TLS_CERT_POLICY_INSECURE_NO_CHECK
    }

    public enum BundlePolicy {
        BALANCED,
        MAXBUNDLE,
        MAXCOMPAT
    }

    public enum CandidateNetworkPolicy {
        ALL,
        LOW_COST
    }

    public enum ContinualGatheringPolicy {
        GATHER_ONCE,
        GATHER_CONTINUALLY
    }

    public enum IceTransportsType {
        NONE,
        RELAY,
        NOHOST,
        ALL
    }

    public class IntervalRange {
        public final int max;
        public final int min;

        public int getMax() {
            return this.max;
        }

        public int getMin() {
            return this.min;
        }

        public IntervalRange(int i, int i2) {
            this.min = i;
            this.max = i2;
        }
    }

    public enum KeyType {
        RSA,
        ECDSA
    }

    public enum PortPrunePolicy {
        NO_PRUNE,
        PRUNE_BASED_ON_PRIORITY,
        KEEP_FIRST_READY
    }

    public class RTCConfiguration {
        public boolean activeResetSrtpParams;
        public Boolean allowCodecSwitching;
        public boolean audioJitterBufferFastAccelerate;
        public int audioJitterBufferMaxPackets;
        public BundlePolicy bundlePolicy = BundlePolicy.BALANCED;
        public CandidateNetworkPolicy candidateNetworkPolicy = CandidateNetworkPolicy.ALL;
        public RtcCertificatePem certificate;
        public Boolean combinedAudioVideoBwe;
        public ContinualGatheringPolicy continualGatheringPolicy;
        public CryptoOptions cryptoOptions;
        public boolean disableIPv6OnWifi;
        public boolean disableIpv6;
        public boolean enableCpuOveruseDetection;
        public boolean enableDscp;
        public Boolean enableDtlsSrtp;
        public Boolean enableIceRenomination;
        public boolean enableImplicitRollback;
        public boolean enableRtpDataChannel;
        public int iceBackupCandidatePairPingInterval;
        public int iceCandidatePoolSize;
        public Integer iceCheckIntervalStrongConnectivityMs;
        public Integer iceCheckIntervalWeakConnectivityMs;
        public Integer iceCheckMinInterval;
        public int iceConnectionReceivingTimeout;
        public Integer iceInactiveTimeout;
        public IntervalRange iceRegatherIntervalRange;
        public List iceServers;
        public IceTransportsType iceTransportsType = IceTransportsType.ALL;
        public Integer iceUnwritableMinChecks;
        public Integer iceUnwritableTimeMs;
        public KeyType keyType;
        public int maxIPv6Networks;
        public AdapterType networkPreference;
        public boolean offerExtmapAllowMixed;
        public boolean presumeWritableWhenFullyRelayed;
        @Deprecated
        public boolean pruneTurnPorts;
        public Integer receivingSwitchingDelay;
        public Boolean redetermineRoleOnIceRestart;
        public RtcpMuxPolicy rtcpMuxPolicy = RtcpMuxPolicy.REQUIRE;
        public Integer screencastMinBitrate;
        public SdpSemantics sdpSemantics;
        public Integer stableWritableConnectionPingInterval;
        public Integer stunCandidateKeepaliveIntervalMs;
        public boolean surfaceIceCandidatesOnIceTransportTypeChanged;
        public boolean suspendBelowMinBitrate;
        public TcpCandidatePolicy tcpCandidatePolicy = TcpCandidatePolicy.ENABLED;
        public TurnCustomizer turnCustomizer;
        public String turnLoggingId;
        public PortPrunePolicy turnPortPrunePolicy;

        public boolean getActiveResetSrtpParams() {
            return this.activeResetSrtpParams;
        }

        public Boolean getAllowCodecSwitching() {
            return this.allowCodecSwitching;
        }

        public boolean getAudioJitterBufferFastAccelerate() {
            return this.audioJitterBufferFastAccelerate;
        }

        public int getAudioJitterBufferMaxPackets() {
            return this.audioJitterBufferMaxPackets;
        }

        public BundlePolicy getBundlePolicy() {
            return this.bundlePolicy;
        }

        public CandidateNetworkPolicy getCandidateNetworkPolicy() {
            return this.candidateNetworkPolicy;
        }

        public RtcCertificatePem getCertificate() {
            return this.certificate;
        }

        public Boolean getCombinedAudioVideoBwe() {
            return this.combinedAudioVideoBwe;
        }

        public ContinualGatheringPolicy getContinualGatheringPolicy() {
            return this.continualGatheringPolicy;
        }

        public CryptoOptions getCryptoOptions() {
            return this.cryptoOptions;
        }

        public boolean getDisableIPv6OnWifi() {
            return this.disableIPv6OnWifi;
        }

        public boolean getDisableIpv6() {
            return this.disableIpv6;
        }

        public boolean getEnableCpuOveruseDetection() {
            return this.enableCpuOveruseDetection;
        }

        public boolean getEnableDscp() {
            return this.enableDscp;
        }

        public Boolean getEnableDtlsSrtp() {
            return this.enableDtlsSrtp;
        }

        public Boolean getEnableIceRenomination() {
            return this.enableIceRenomination;
        }

        public boolean getEnableImplicitRollback() {
            return this.enableImplicitRollback;
        }

        public boolean getEnableRtpDataChannel() {
            return this.enableRtpDataChannel;
        }

        public int getIceBackupCandidatePairPingInterval() {
            return this.iceBackupCandidatePairPingInterval;
        }

        public int getIceCandidatePoolSize() {
            return this.iceCandidatePoolSize;
        }

        public Integer getIceCheckIntervalStrongConnectivity() {
            return this.iceCheckIntervalStrongConnectivityMs;
        }

        public Integer getIceCheckIntervalWeakConnectivity() {
            return this.iceCheckIntervalWeakConnectivityMs;
        }

        public Integer getIceCheckMinInterval() {
            return this.iceCheckMinInterval;
        }

        public int getIceConnectionReceivingTimeout() {
            return this.iceConnectionReceivingTimeout;
        }

        public Integer getIceInactiveTimeout() {
            return this.iceInactiveTimeout;
        }

        public IntervalRange getIceRegatherIntervalRange() {
            return this.iceRegatherIntervalRange;
        }

        public List getIceServers() {
            return this.iceServers;
        }

        public IceTransportsType getIceTransportsType() {
            return this.iceTransportsType;
        }

        public Integer getIceUnwritableMinChecks() {
            return this.iceUnwritableMinChecks;
        }

        public Integer getIceUnwritableTimeout() {
            return this.iceUnwritableTimeMs;
        }

        public KeyType getKeyType() {
            return this.keyType;
        }

        public int getMaxIPv6Networks() {
            return this.maxIPv6Networks;
        }

        public AdapterType getNetworkPreference() {
            return this.networkPreference;
        }

        public boolean getOfferExtmapAllowMixed() {
            return this.offerExtmapAllowMixed;
        }

        public boolean getPresumeWritableWhenFullyRelayed() {
            return this.presumeWritableWhenFullyRelayed;
        }

        public boolean getPruneTurnPorts() {
            return this.pruneTurnPorts;
        }

        public Integer getReceivingSwitchingDelay() {
            return this.receivingSwitchingDelay;
        }

        public Boolean getRedetermineRoleOnIceRestart() {
            return this.redetermineRoleOnIceRestart;
        }

        public RtcpMuxPolicy getRtcpMuxPolicy() {
            return this.rtcpMuxPolicy;
        }

        public Integer getScreencastMinBitrate() {
            return this.screencastMinBitrate;
        }

        public SdpSemantics getSdpSemantics() {
            return this.sdpSemantics;
        }

        public Integer getStableWritableConnectionPingIntervalMs() {
            return this.stableWritableConnectionPingInterval;
        }

        public Integer getStunCandidateKeepaliveInterval() {
            return this.stunCandidateKeepaliveIntervalMs;
        }

        public boolean getSurfaceIceCandidatesOnIceTransportTypeChanged() {
            return this.surfaceIceCandidatesOnIceTransportTypeChanged;
        }

        public boolean getSuspendBelowMinBitrate() {
            return this.suspendBelowMinBitrate;
        }

        public TcpCandidatePolicy getTcpCandidatePolicy() {
            return this.tcpCandidatePolicy;
        }

        public TurnCustomizer getTurnCustomizer() {
            return this.turnCustomizer;
        }

        public String getTurnLoggingId() {
            return this.turnLoggingId;
        }

        public PortPrunePolicy getTurnPortPrunePolicy() {
            return this.turnPortPrunePolicy;
        }

        public RTCConfiguration(List list) {
            this.iceServers = list;
            this.audioJitterBufferMaxPackets = 50;
            this.audioJitterBufferFastAccelerate = false;
            this.iceConnectionReceivingTimeout = -1;
            this.iceBackupCandidatePairPingInterval = -1;
            this.keyType = KeyType.ECDSA;
            this.continualGatheringPolicy = ContinualGatheringPolicy.GATHER_ONCE;
            this.iceCandidatePoolSize = 0;
            this.pruneTurnPorts = false;
            this.turnPortPrunePolicy = PortPrunePolicy.NO_PRUNE;
            this.presumeWritableWhenFullyRelayed = false;
            this.surfaceIceCandidatesOnIceTransportTypeChanged = false;
            this.iceCheckIntervalStrongConnectivityMs = null;
            this.iceCheckIntervalWeakConnectivityMs = null;
            this.iceCheckMinInterval = null;
            this.iceUnwritableTimeMs = null;
            this.iceUnwritableMinChecks = null;
            this.stunCandidateKeepaliveIntervalMs = null;
            this.disableIPv6OnWifi = false;
            this.maxIPv6Networks = 5;
            this.iceRegatherIntervalRange = null;
            this.disableIpv6 = false;
            this.enableDscp = false;
            this.enableCpuOveruseDetection = true;
            this.enableRtpDataChannel = false;
            this.suspendBelowMinBitrate = false;
            this.screencastMinBitrate = null;
            this.combinedAudioVideoBwe = null;
            this.enableDtlsSrtp = null;
            this.networkPreference = AdapterType.UNKNOWN;
            this.sdpSemantics = SdpSemantics.PLAN_B;
            this.activeResetSrtpParams = false;
            this.cryptoOptions = null;
            this.turnLoggingId = null;
            this.allowCodecSwitching = null;
            this.enableIceRenomination = null;
            this.redetermineRoleOnIceRestart = null;
            this.iceInactiveTimeout = null;
            this.enableImplicitRollback = false;
            this.offerExtmapAllowMixed = true;
            this.receivingSwitchingDelay = null;
            this.stableWritableConnectionPingInterval = null;
        }
    }

    public enum RtcpMuxPolicy {
        NEGOTIATE,
        REQUIRE
    }

    public enum SdpSemantics {
        PLAN_B,
        UNIFIED_PLAN
    }

    public enum TcpCandidatePolicy {
        ENABLED,
        DISABLED
    }

    private native boolean nativeAddIceCandidate(String str, int i, String str2);

    private native void nativeAddIceCandidateWithObserver(String str, int i, String str2, AddIceObserver addIceObserver);

    private native boolean nativeAddLocalStream(long j);

    private native RtpSender nativeAddTrack(long j, List list);

    private native RtpTransceiver nativeAddTransceiverOfType(MediaStreamTrack.MediaType mediaType, RtpTransceiver.RtpTransceiverInit rtpTransceiverInit);

    private native RtpTransceiver nativeAddTransceiverWithTrack(long j, RtpTransceiver.RtpTransceiverInit rtpTransceiverInit);

    private native void nativeClose();

    private native PeerConnectionState nativeConnectionState();

    private native void nativeCreateAnswer(SdpObserver sdpObserver, MediaConstraints mediaConstraints);

    private native DataChannel nativeCreateDataChannel(String str, DataChannel.Init init);

    private native void nativeCreateOffer(SdpObserver sdpObserver, MediaConstraints mediaConstraints);

    public static native long nativeCreatePeerConnectionObserver(Observer observer);

    private native RtpSender nativeCreateSender(String str, String str2);

    public static native void nativeFreeOwnedPeerConnection(long j);

    private native RtcCertificatePem nativeGetCertificate();

    private native SessionDescription nativeGetLocalDescription();

    private native long nativeGetNativePeerConnection();

    private native List nativeGetReceivers();

    private native SessionDescription nativeGetRemoteDescription();

    private native List nativeGetSenders();

    private native List nativeGetTransceivers();

    private native IceConnectionState nativeIceConnectionState();

    private native IceGatheringState nativeIceGatheringState();

    private native void nativeNewGetStats(RTCStatsCollectorCallback rTCStatsCollectorCallback);

    private native boolean nativeOldGetStats(StatsObserver statsObserver, long j);

    private native boolean nativeRemoveIceCandidates(IceCandidate[] iceCandidateArr);

    private native void nativeRemoveLocalStream(long j);

    private native boolean nativeRemoveTrack(long j);

    private native void nativeSetAudioPlayout(boolean z);

    private native void nativeSetAudioRecording(boolean z);

    private native boolean nativeSetBitrate(Integer num, Integer num2, Integer num3);

    private native boolean nativeSetConfiguration(RTCConfiguration rTCConfiguration);

    private native void nativeSetLocalDescription(SdpObserver sdpObserver, SessionDescription sessionDescription);

    private native void nativeSetRemoteDescription(SdpObserver sdpObserver, SessionDescription sessionDescription);

    private native SignalingState nativeSignalingState();

    private native boolean nativeStartRtcEventLog(int i, int i2);

    private native void nativeStopRtcEventLog();

    public enum IceConnectionState {
        NEW,
        CHECKING,
        CONNECTED,
        COMPLETED,
        FAILED,
        DISCONNECTED,
        CLOSED;

        public static IceConnectionState fromNativeIndex(int i) {
            return values()[i];
        }
    }

    public enum PeerConnectionState {
        NEW,
        CONNECTING,
        CONNECTED,
        DISCONNECTED,
        FAILED,
        CLOSED;

        public static PeerConnectionState fromNativeIndex(int i) {
            return values()[i];
        }
    }

    public enum SignalingState {
        STABLE,
        HAVE_LOCAL_OFFER,
        HAVE_LOCAL_PRANSWER,
        HAVE_REMOTE_OFFER,
        HAVE_REMOTE_PRANSWER,
        CLOSED;

        public static SignalingState fromNativeIndex(int i) {
            return values()[i];
        }
    }

    public enum IceGatheringState {
        NEW,
        GATHERING,
        COMPLETE;

        public static IceGatheringState fromNativeIndex(int i) {
            return values()[i];
        }
    }

    public boolean addIceCandidate(IceCandidate iceCandidate) {
        return nativeAddIceCandidate(iceCandidate.sdpMid, iceCandidate.sdpMLineIndex, iceCandidate.sdp);
    }

    public RtpTransceiver addTransceiver(MediaStreamTrack.MediaType mediaType) {
        return addTransceiver(mediaType, new RtpTransceiver.RtpTransceiverInit());
    }

    public List getReceivers() {
        for (RtpReceiver dispose : this.receivers) {
            dispose.dispose();
        }
        List nativeGetReceivers = nativeGetReceivers();
        this.receivers = nativeGetReceivers;
        return Collections.unmodifiableList(nativeGetReceivers);
    }

    public List getSenders() {
        for (RtpSender dispose : this.senders) {
            dispose.dispose();
        }
        List nativeGetSenders = nativeGetSenders();
        this.senders = nativeGetSenders;
        return Collections.unmodifiableList(nativeGetSenders);
    }

    public List getTransceivers() {
        for (RtpTransceiver dispose : this.transceivers) {
            dispose.dispose();
        }
        List nativeGetTransceivers = nativeGetTransceivers();
        this.transceivers = nativeGetTransceivers;
        return Collections.unmodifiableList(nativeGetTransceivers);
    }

    public boolean removeTrack(RtpSender rtpSender) {
        if (rtpSender != null) {
            return nativeRemoveTrack(rtpSender.getNativeRtpSender());
        }
        throw AnonymousClass7TE.A11("No RtpSender specified for removeTrack.");
    }

    public interface Observer {
        void onAddStream(MediaStream mediaStream);

        void onAddTrack(RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr);

        void onConnectionChange(PeerConnectionState peerConnectionState);

        void onDataChannel(DataChannel dataChannel);

        void onIceCandidate(IceCandidate iceCandidate);

        void onIceCandidateError(IceCandidateErrorEvent iceCandidateErrorEvent);

        void onIceCandidatesRemoved(IceCandidate[] iceCandidateArr);

        void onIceConnectionChange(IceConnectionState iceConnectionState);

        void onIceConnectionReceivingChange(boolean z);

        void onIceGatheringChange(IceGatheringState iceGatheringState);

        void onRemoveStream(MediaStream mediaStream);

        void onRemoveTrack(RtpReceiver rtpReceiver);

        void onRenegotiationNeeded();

        void onSelectedCandidatePairChanged(CandidatePairChangeEvent candidatePairChangeEvent);

        void onSignalingChange(SignalingState signalingState);

        void onStandardizedIceConnectionChange(IceConnectionState iceConnectionState);

        void onTrack(RtpTransceiver rtpTransceiver);

        /* renamed from: org.webrtc.PeerConnection$Observer$-CC  reason: invalid class name */
        public abstract /* synthetic */ class CC {
            public static void $default$onConnectionChange(Observer observer, PeerConnectionState peerConnectionState) {
            }

            public static void $default$onIceCandidateError(Observer observer, IceCandidateErrorEvent iceCandidateErrorEvent) {
            }

            public static void $default$onRemoveTrack(Observer observer, RtpReceiver rtpReceiver) {
            }

            public static void $default$onSelectedCandidatePairChanged(Observer observer, CandidatePairChangeEvent candidatePairChangeEvent) {
            }

            public static void $default$onStandardizedIceConnectionChange(Observer observer, IceConnectionState iceConnectionState) {
            }

            public static void $default$onTrack(Observer observer, RtpTransceiver rtpTransceiver) {
            }

            public static void $default$onAddTrack(Observer observer, RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr) {
            }
        }
    }

    public PeerConnection(long j) {
        this.localStreams = AnonymousClass7TE.A1C();
        this.senders = AnonymousClass7TE.A1C();
        this.receivers = AnonymousClass7TE.A1C();
        this.transceivers = AnonymousClass7TE.A1C();
        this.nativePeerConnection = j;
    }

    public static long createNativePeerConnectionObserver(Observer observer) {
        return nativeCreatePeerConnectionObserver(observer);
    }

    public boolean addStream(MediaStream mediaStream) {
        if (!nativeAddLocalStream(mediaStream.getNativeMediaStream())) {
            return false;
        }
        this.localStreams.add(mediaStream);
        return true;
    }

    public RtpSender addTrack(MediaStreamTrack mediaStreamTrack) {
        return addTrack(mediaStreamTrack, Collections.emptyList());
    }

    public void close() {
        nativeClose();
    }

    public PeerConnectionState connectionState() {
        return nativeConnectionState();
    }

    public DataChannel createDataChannel(String str, DataChannel.Init init) {
        return nativeCreateDataChannel(str, init);
    }

    public RtpSender createSender(String str, String str2) {
        RtpSender nativeCreateSender = nativeCreateSender(str, str2);
        if (nativeCreateSender != null) {
            this.senders.add(nativeCreateSender);
        }
        return nativeCreateSender;
    }

    public void dispose() {
        nativeClose();
        for (MediaStream mediaStream : this.localStreams) {
            nativeRemoveLocalStream(mediaStream.getNativeMediaStream());
            mediaStream.dispose();
        }
        this.localStreams.clear();
        for (RtpSender dispose : this.senders) {
            dispose.dispose();
        }
        this.senders.clear();
        for (RtpReceiver dispose2 : this.receivers) {
            dispose2.dispose();
        }
        for (RtpTransceiver dispose3 : this.transceivers) {
            dispose3.dispose();
        }
        this.transceivers.clear();
        this.receivers.clear();
        nativeFreeOwnedPeerConnection(this.nativePeerConnection);
    }

    public RtcCertificatePem getCertificate() {
        return nativeGetCertificate();
    }

    public SessionDescription getLocalDescription() {
        return nativeGetLocalDescription();
    }

    public long getNativeOwnedPeerConnection() {
        return this.nativePeerConnection;
    }

    public long getNativePeerConnection() {
        return nativeGetNativePeerConnection();
    }

    public SessionDescription getRemoteDescription() {
        return nativeGetRemoteDescription();
    }

    public IceConnectionState iceConnectionState() {
        return nativeIceConnectionState();
    }

    public IceGatheringState iceGatheringState() {
        return nativeIceGatheringState();
    }

    public boolean removeIceCandidates(IceCandidate[] iceCandidateArr) {
        return nativeRemoveIceCandidates(iceCandidateArr);
    }

    public void removeStream(MediaStream mediaStream) {
        nativeRemoveLocalStream(mediaStream.getNativeMediaStream());
        this.localStreams.remove(mediaStream);
    }

    public boolean setBitrate(Integer num, Integer num2, Integer num3) {
        return nativeSetBitrate(num, num2, num3);
    }

    public boolean setConfiguration(RTCConfiguration rTCConfiguration) {
        return nativeSetConfiguration(rTCConfiguration);
    }

    public SignalingState signalingState() {
        return nativeSignalingState();
    }

    public boolean startRtcEventLog(int i, int i2) {
        return nativeStartRtcEventLog(i, i2);
    }

    public void stopRtcEventLog() {
        nativeStopRtcEventLog();
    }

    public void getStats(RTCStatsCollectorCallback rTCStatsCollectorCallback) {
        nativeNewGetStats(rTCStatsCollectorCallback);
    }

    public void setAudioPlayout(boolean z) {
        nativeSetAudioPlayout(z);
    }

    public void setAudioRecording(boolean z) {
        nativeSetAudioRecording(z);
    }

    public void createAnswer(SdpObserver sdpObserver, MediaConstraints mediaConstraints) {
        nativeCreateAnswer(sdpObserver, mediaConstraints);
    }

    public void createOffer(SdpObserver sdpObserver, MediaConstraints mediaConstraints) {
        nativeCreateOffer(sdpObserver, mediaConstraints);
    }

    public void setLocalDescription(SdpObserver sdpObserver, SessionDescription sessionDescription) {
        nativeSetLocalDescription(sdpObserver, sessionDescription);
    }

    public void setRemoteDescription(SdpObserver sdpObserver, SessionDescription sessionDescription) {
        nativeSetRemoteDescription(sdpObserver, sessionDescription);
    }

    public PeerConnection(NativePeerConnectionFactory nativePeerConnectionFactory) {
        this(nativePeerConnectionFactory.createNativePeerConnection());
    }

    public void addIceCandidate(IceCandidate iceCandidate, AddIceObserver addIceObserver) {
        nativeAddIceCandidateWithObserver(iceCandidate.sdpMid, iceCandidate.sdpMLineIndex, iceCandidate.sdp, addIceObserver);
    }

    public RtpSender addTrack(MediaStreamTrack mediaStreamTrack, List list) {
        if (mediaStreamTrack == null || list == null) {
            throw AnonymousClass7TE.A11("No MediaStreamTrack specified in addTrack.");
        }
        RtpSender nativeAddTrack = nativeAddTrack(mediaStreamTrack.getNativeMediaStreamTrack(), list);
        if (nativeAddTrack != null) {
            this.senders.add(nativeAddTrack);
            return nativeAddTrack;
        }
        throw AnonymousClass7TE.A0z("C++ addTrack failed.");
    }

    public RtpTransceiver addTransceiver(MediaStreamTrack.MediaType mediaType, RtpTransceiver.RtpTransceiverInit rtpTransceiverInit) {
        if (mediaType != null) {
            if (rtpTransceiverInit == null) {
                rtpTransceiverInit = new RtpTransceiver.RtpTransceiverInit();
            }
            RtpTransceiver nativeAddTransceiverOfType = nativeAddTransceiverOfType(mediaType, rtpTransceiverInit);
            if (nativeAddTransceiverOfType != null) {
                this.transceivers.add(nativeAddTransceiverOfType);
                return nativeAddTransceiverOfType;
            }
            throw AnonymousClass7TE.A0z("C++ addTransceiver failed.");
        }
        throw AnonymousClass7TE.A11("No MediaType specified for addTransceiver.");
    }

    @Deprecated
    public boolean getStats(StatsObserver statsObserver, MediaStreamTrack mediaStreamTrack) {
        long nativeMediaStreamTrack;
        if (mediaStreamTrack == null) {
            nativeMediaStreamTrack = 0;
        } else {
            nativeMediaStreamTrack = mediaStreamTrack.getNativeMediaStreamTrack();
        }
        return nativeOldGetStats(statsObserver, nativeMediaStreamTrack);
    }

    public RtpTransceiver addTransceiver(MediaStreamTrack mediaStreamTrack, RtpTransceiver.RtpTransceiverInit rtpTransceiverInit) {
        if (mediaStreamTrack != null) {
            if (rtpTransceiverInit == null) {
                rtpTransceiverInit = new RtpTransceiver.RtpTransceiverInit();
            }
            RtpTransceiver nativeAddTransceiverWithTrack = nativeAddTransceiverWithTrack(mediaStreamTrack.getNativeMediaStreamTrack(), rtpTransceiverInit);
            if (nativeAddTransceiverWithTrack != null) {
                this.transceivers.add(nativeAddTransceiverWithTrack);
                return nativeAddTransceiverWithTrack;
            }
            throw AnonymousClass7TE.A0z("C++ addTransceiver failed.");
        }
        throw AnonymousClass7TE.A11("No MediaStreamTrack specified for addTransceiver.");
    }

    public RtpTransceiver addTransceiver(MediaStreamTrack mediaStreamTrack) {
        return addTransceiver(mediaStreamTrack, new RtpTransceiver.RtpTransceiverInit());
    }
}
