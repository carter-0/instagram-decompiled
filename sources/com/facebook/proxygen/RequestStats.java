package com.facebook.proxygen;

import X.002;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C21053XCe;
import X.DbS;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class RequestStats {
    public static final Map mFlowTimeMap = Collections.unmodifiableMap(new HashMap<String, List<String>>() {
        {
            String[] strArr = new String[42];
            System.arraycopy(new String[]{"uri", TraceFieldType.IsSecure, TraceFieldType.StatusCode, TraceFieldType.StatusMessage, TraceFieldType.ContentType, TraceFieldType.ClientPublicAddr, TraceFieldType.ServerCluster, TraceFieldType.ServerHostEnc, TraceFieldType.ServerDatetime, TraceFieldType.LocalPort, TraceFieldType.ReqHeaderSize, TraceFieldType.ReqHeaderCompSize, TraceFieldType.ReqBodySize, TraceFieldType.RspHeaderSize, TraceFieldType.RspHeaderCompSize, TraceFieldType.RedirectLocation, TraceFieldType.NumRedirects, TraceFieldType.Protocol, TraceFieldType.FirstBodyByteFlushedRatio, TraceFieldType.LastBodyByteFlushedRatio, TraceFieldType.SecurityProtocol, TraceFieldType.FlowControlPauses, TraceFieldType.ReplaySafe, TraceFieldType.HTTPMethod, TraceFieldType.RangeRequest, TraceFieldType.RequestSendTime, TraceFieldType.TraceStringId}, 0, strArr, 0, 27);
            System.arraycopy(new String[]{TraceFieldType.TransportReplaySafe, TraceFieldType.EvbAvgLoopTime, TraceFieldType.TripId, TraceFieldType.TimeSinceFirstHTTPClientInit, TraceFieldType.TimeSinceHTTPClientInit, TraceFieldType.NumberHTTPClientInits, TraceFieldType.PreviousNetworkType, TraceFieldType.NetworkType, TraceFieldType.HTTPResponsePriority, TraceFieldType.H3PriorityChanges, TraceFieldType.UsingManualProxy, TraceFieldType.HTTPStreamId, TraceFieldType.FirstBodyByteFlushed, TraceFieldType.LastBodyByteFlushed, TraceFieldType.ConnectionAcquisitionEnd}, 0, strArr, 27, 15);
            put(TraceEventType.RequestExchange, Arrays.asList(strArr));
            put(TraceEventType.ResponseBodyRead, Arrays.asList(new String[]{TraceFieldType.RspIntvlAvg, TraceFieldType.RspIntvlStdDev, TraceFieldType.RspNumOnBody, TraceFieldType.ServerQuality, TraceFieldType.RecvToAck, TraceFieldType.RspBodyBytesTime, TraceFieldType.ServerRtx, TraceFieldType.ServerCwnd, TraceFieldType.ServerUpstreamLatency, TraceFieldType.ServerUploadLatency, TraceFieldType.ServerTotalPackets, TraceFieldType.ServerTotalPacketsLost}));
            put(TraceEventType.TotalConnect, Arrays.asList(new String[0]));
            put(TraceEventType.PreConnect, Arrays.asList(new String[]{TraceFieldType.NewConnection, TraceFieldType.IsWaitingForNewConn, TraceFieldType.NewConnTimeout, TraceFieldType.InFlightConns, TraceFieldType.CachedSessions, TraceFieldType.CachedActiveSessions, TraceFieldType.ConnRoutingStale, TraceFieldType.StartedQuicAsync, TraceFieldType.ConnsStarted, TraceFieldType.RequestsWaited, TraceFieldType.TotalConnsStarted, TraceFieldType.TotalRequestsWaited, TraceFieldType.SessionCacheHitType, TraceFieldType.PerDomainLimit, TraceFieldType.DynamicDomainLimitRatio, TraceFieldType.LoadBalancing, TraceFieldType.MaxConnectionRetryCount, TraceFieldType.MaxIdleHTTPSessions, TraceFieldType.MaxIdleHTTP2Sessions, TraceFieldType.StartedExtraTcp, TraceFieldType.InflightQuicConns, TraceFieldType.QuicEnabled, TraceFieldType.NewConnectionType, TraceFieldType.ConnectionAcquisitionStart}));
            put(TraceEventType.DnsConnect, Arrays.asList(new String[0]));
            String str = TraceFieldType.NumberAnswers;
            put(TraceEventType.DnsResolution, Arrays.asList(new String[]{TraceFieldType.HostName, TraceFieldType.IpAddr, TraceFieldType.Port, TraceFieldType.CanonicalName, TraceFieldType.CNameRedirects, TraceFieldType.NumberResolvers, TraceFieldType.ResolversSerialized, TraceFieldType.RequestFamily, TraceFieldType.NumberAnswers, TraceFieldType.TXT, TraceFieldType.DNSProtocol, TraceFieldType.ResolvedIpAddresses}));
            put(TraceEventType.DnsCache, Arrays.asList(new String[]{TraceFieldType.HostName, TraceFieldType.IpAddr, TraceFieldType.Port, TraceFieldType.CanonicalName, TraceFieldType.CNameRedirects, TraceFieldType.NumberResolvers, TraceFieldType.RequestFamily, str, TraceFieldType.DNSCacheHit, TraceFieldType.DNSCacheHitV4, TraceFieldType.DNSCacheHitV6, TraceFieldType.DNSCacheStale, TraceFieldType.DNSCacheStaleV4, TraceFieldType.DNSCacheStaleV6, TraceFieldType.DNSCacheAgeSecs, TraceFieldType.ResolvedIpAddresses, TraceFieldType.DnsResolutionStart, TraceFieldType.DnsResolutionEnd}));
            put(TraceEventType.RetryingDnsResolution, Arrays.asList(new String[]{TraceFieldType.NumberDNSRetries, TraceFieldType.ResolvedSuccess}));
            put(TraceEventType.TcpConnect, Arrays.asList(new String[]{TraceFieldType.CachedFamily, TraceFieldType.CachedFamilyStatus, TraceFieldType.HEDrivenDns, TraceFieldType.HESerializedEvents, TraceFieldType.TcpConnectStart, TraceFieldType.TcpConnectEnd}));
            put(TraceEventType.TlsSetup, Arrays.asList(new String[]{TraceFieldType.TLSReused, TraceFieldType.TLSCacheHit, TraceFieldType.CipherName, TraceFieldType.TLSVersion, TraceFieldType.OpenSSLVersion, TraceFieldType.TLSCachePersistence}));
            put(TraceEventType.ProxyConnect, Arrays.asList(new String[]{TraceFieldType.ProxyHost, TraceFieldType.ProxyPort}));
            put(TraceEventType.PostConnect, Arrays.asList(new String[]{TraceFieldType.NewSession, TraceFieldType.NumWaiting, TraceFieldType.TransportType, TraceFieldType.LocalAddr, TraceFieldType.LocalPort}));
            put(TraceEventType.SessionTransactions, Arrays.asList(new String[]{TraceFieldType.CurrentTransactions, TraceFieldType.HistoricalMaximumTransactions, TraceFieldType.NumberTransactionsServed, TraceFieldType.StreamLimitExceeded}));
            put(TraceEventType.TransportInfo, Arrays.asList(new String[]{TraceFieldType.Cwnd, TraceFieldType.CwndBytes, TraceFieldType.TotalRetx, TraceFieldType.InflightPacketLoss, TraceFieldType.RTO, TraceFieldType.MSS, TraceFieldType.MTU, TraceFieldType.RcvWnd, TraceFieldType.UpstreamCapacity, TraceFieldType.QuicClientCID, TraceFieldType.RTOCount, TraceFieldType.TotalRTOCount, TraceFieldType.TotalPackets, TraceFieldType.TotalPacketsLost, TraceFieldType.QuicTransportSent, TraceFieldType.QuicTransportRecvd}));
            put(TraceEventType.PostTransactionTransportInfo, Arrays.asList(new String[]{TraceFieldType.RTT, TraceFieldType.RTTVar, TraceFieldType.QuicServerCID, TraceFieldType.StreamLossCount, TraceFieldType.StreamBytesSent, TraceFieldType.StreamBytesReceived}));
            put(TraceEventType.ConnInfo, Arrays.asList(new String[]{TraceFieldType.ConnLifeSpan, TraceFieldType.EgressBuffered, TraceFieldType.SessionType, TraceFieldType.IsConnectionPreconnected}));
            put(TraceEventType.Decompression, Arrays.asList(new String[]{TraceFieldType.RspBodySize, TraceFieldType.RspBodyCompSize, TraceFieldType.CompressionType, TraceFieldType.RspBodyDecompressionTime}));
            put(TraceEventType.ReplaySafety, Arrays.asList(new String[0]));
            put(TraceEventType.Push, Arrays.asList(new String[]{TraceFieldType.IsPushRequest, TraceFieldType.PushConnectedInFlight, TraceFieldType.PushOrphaned}));
            put(TraceEventType.CertVerification, Arrays.asList(new String[]{TraceFieldType.VerificationImpl, TraceFieldType.CertificateVerifyStart, TraceFieldType.CertificateVerifyEnd}));
            String str2 = TraceFieldType.FizzECHRetryUsed;
            put(TraceEventType.FizzConnect, Arrays.asList(new String[]{TraceFieldType.FizzHandshakeSuccess, TraceFieldType.FizzProtocolVersion, TraceFieldType.FizzNamedGroup, TraceFieldType.FizzPskType, TraceFieldType.FizzEarlyDataType, TraceFieldType.FizzECHConfigId, TraceFieldType.FizzECHDisposition, TraceFieldType.FizzECHRetryUsed, TraceFieldType.FizzECHSNI, TraceFieldType.PskUses}));
            put(TraceEventType.QuicConnect, Arrays.asList(new String[]{TraceFieldType.QuicClientCID, TraceFieldType.QuicDNSAddrs, TraceFieldType.QuicEarlyDataEnabled, TraceFieldType.PskUses, TraceFieldType.FizzHandshakeSuccess, TraceFieldType.FizzProtocolVersion, TraceFieldType.FizzNamedGroup, TraceFieldType.FizzPskType, TraceFieldType.FizzEarlyDataType, TraceFieldType.FizzECHConfigId, TraceFieldType.FizzECHDisposition, TraceFieldType.FizzECHSNI, str2, TraceFieldType.Error, TraceFieldType.QuicConnectStartTime, TraceFieldType.QuicConnectEndTime}));
            put(TraceEventType.ConnSelector, C21053XCe.A0k(TraceFieldType.QuicResult));
            put(TraceEventType.NetworkChange, C21053XCe.A0k(TraceFieldType.NetworkChangeDetail));
            put(TraceEventType.DnsFallback, Arrays.asList(new String[]{TraceFieldType.DNSFallbackOutcome, TraceFieldType.DNSFallbackReason}));
            put(TraceEventType.TotalRequest, Arrays.asList(new String[]{TraceFieldType.TTFB, TraceFieldType.TTLB}));
        }
    });
    public TraceEvent[] mEvents;

    public static boolean isValidCodecProtocolStr(String str) {
        if (str.equals("http/1.1") || str.equals("http/2")) {
            return true;
        }
        return false;
    }

    public RequestStats(TraceEvent[] traceEventArr) {
        this.mEvents = traceEventArr;
    }

    public static Map getFlowTimeFieldsMap() {
        return mFlowTimeMap;
    }

    public static void joinMetaFields(Map map, Map map2, String str) {
        Object obj;
        if (map.containsKey(str)) {
            if (map2.containsKey(str)) {
                obj = 002.A0g((String) map2.get(str), ";", (String) map.get(str));
            } else {
                obj = map.get(str);
            }
            map2.put(str, obj);
        }
    }

    public static boolean readBooleanMeta(Map map, String str, boolean z) {
        if (!map.containsKey(str)) {
            return z;
        }
        if (Boolean.parseBoolean((String) map.get(str)) || ((String) map.get(str)).equals(RealtimeSubscription.GRAPHQL_MQTT_VERSION)) {
            return true;
        }
        return false;
    }

    public static int readIntMeta(Map map, String str, int i) {
        if (!map.containsKey(str)) {
            return i;
        }
        try {
            return Integer.parseInt((String) map.get(str));
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static long readLongMeta(Map map, String str, long j) {
        if (!map.containsKey(str)) {
            return j;
        }
        try {
            return Long.parseLong((String) map.get(str));
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static String readStrMeta(Map map, String str, String str2) {
        if (map.containsKey(str)) {
            return (String) map.get(str);
        }
        return str2;
    }

    public Map getCertificateVerificationData() {
        String str;
        String str2;
        HashMap A1E = AnonymousClass7TE.A1E();
        boolean z = false;
        for (TraceEvent traceEvent : this.mEvents) {
            if (traceEvent.mName.equals(TraceEventType.CertVerification)) {
                Iterator A0u = AnonymousClass7TF.A0u(traceEvent.getMetaData());
                while (A0u.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                    A1E.put(A1J.getKey(), A1J.getValue());
                }
                z = true;
            } else {
                if (traceEvent.mName.equals(TraceEventType.QuicConnect) || traceEvent.mName.equals(TraceEventType.TcpConnect) || traceEvent.mName.equals(TraceEventType.PostConnect)) {
                    Map metaData = traceEvent.getMetaData();
                    String readStrMeta = readStrMeta(metaData, TraceFieldType.ServerAddr, "");
                    int readIntMeta = readIntMeta(metaData, TraceFieldType.ServerPort, 0);
                    if (!readStrMeta.equals("") && readIntMeta > 0) {
                        str = 002.A0g(readStrMeta, ":", String.valueOf(readIntMeta));
                        str2 = TraceFieldType.VerifiedServerAddress;
                    }
                } else if (traceEvent.mName.equals(TraceEventType.TlsSetup)) {
                    Map metaData2 = traceEvent.getMetaData();
                    String readStrMeta2 = readStrMeta(metaData2, TraceFieldType.CipherName, "");
                    int readIntMeta2 = readIntMeta(metaData2, TraceFieldType.TLSVersion, 0);
                    long readIntMeta3 = (long) readIntMeta(metaData2, TraceFieldType.OpenSSLVersion, 0);
                    if (!readStrMeta2.equals("")) {
                        A1E.put(TraceFieldType.CipherName, readStrMeta2);
                    }
                    if (readIntMeta2 != 0) {
                        A1E.put(TraceFieldType.TLSVersion, String.valueOf(readIntMeta2));
                    }
                    if (readIntMeta3 != 0) {
                        A1E.put(TraceFieldType.OpenSSLVersion, String.valueOf(readIntMeta3));
                    }
                } else if (traceEvent.mName.equals(TraceEventType.ProxyConnect)) {
                    Map metaData3 = traceEvent.getMetaData();
                    String readStrMeta3 = readStrMeta(metaData3, TraceFieldType.ProxyHost, "");
                    int readIntMeta4 = readIntMeta(metaData3, TraceFieldType.ProxyPort, 0);
                    if (!readStrMeta3.equals("") && readIntMeta4 > 0) {
                        str = 002.A0g(readStrMeta3, ":", String.valueOf(readIntMeta4));
                        str2 = TraceFieldType.VerifiedProxyAddress;
                    }
                }
                A1E.put(str2, str);
            }
        }
        if (!z) {
            return C21053XCe.A0h(0);
        }
        return A1E;
    }

    public Map getFlowTimeData() {
        String valueOf;
        String str;
        String str2;
        HashMap A1E = AnonymousClass7TE.A1E();
        for (TraceEvent traceEvent : this.mEvents) {
            Map map = mFlowTimeMap;
            if (map.containsKey(traceEvent.mName)) {
                Map metaData = traceEvent.getMetaData();
                long j = traceEvent.mStart;
                if (j != 0) {
                    long j2 = traceEvent.mEnd;
                    if (j2 != 0 && j < j2) {
                        A1E.put(traceEvent.mName, String.valueOf(j2 - j));
                    }
                }
                for (Object next : (List) map.get(traceEvent.mName)) {
                    if (metaData.containsKey(next)) {
                        A1E.put(next, metaData.get(next));
                    }
                }
                if (metaData.containsKey(TraceFieldType.ServerAddr)) {
                    A1E.put(TraceFieldType.ServerAddr, metaData.get(TraceFieldType.ServerAddr));
                    A1E.put(TraceFieldType.ServerPort, metaData.get(TraceFieldType.ServerPort));
                }
                if (metaData.containsKey(TraceFieldType.Error)) {
                    if (A1E.containsKey(TraceFieldType.ErrorStage)) {
                        str2 = 002.A0g(DbS.A0r(TraceFieldType.ErrorStage, A1E), ";", traceEvent.mName);
                    } else {
                        str2 = traceEvent.mName;
                    }
                    A1E.put(TraceFieldType.ErrorStage, str2);
                    joinMetaFields(metaData, A1E, TraceFieldType.Error);
                    joinMetaFields(metaData, A1E, TraceFieldType.DirectionError);
                    joinMetaFields(metaData, A1E, TraceFieldType.ProxygenError);
                    joinMetaFields(metaData, A1E, TraceFieldType.CodecError);
                }
            }
            String str3 = traceEvent.mName;
            if (TraceEventType.DnsCache.equals(str3)) {
                A1E.put(TraceFieldType.DnsResolutionStart, String.valueOf(traceEvent.mStart));
                valueOf = String.valueOf(traceEvent.mEnd);
                str = TraceFieldType.DnsResolutionEnd;
            } else if (TraceEventType.TcpConnect.equals(str3)) {
                A1E.put(TraceFieldType.TcpConnectStart, String.valueOf(traceEvent.mStart));
                valueOf = String.valueOf(traceEvent.mEnd);
                str = TraceFieldType.TcpConnectEnd;
            } else if (TraceEventType.CertVerification.equals(str3)) {
                A1E.put(TraceFieldType.CertificateVerifyStart, String.valueOf(traceEvent.mStart));
                valueOf = String.valueOf(traceEvent.mEnd);
                str = TraceFieldType.CertificateVerifyEnd;
            } else if (TraceEventType.ResponseBodyRead.equals(str3)) {
                valueOf = String.valueOf(traceEvent.mEnd - traceEvent.mStart);
                str = TraceFieldType.RspBodyBytesTime;
            } else if (TraceEventType.QuicConnect.equals(str3)) {
                A1E.put(TraceFieldType.QuicConnectStartTime, String.valueOf(traceEvent.mStart));
                valueOf = String.valueOf(traceEvent.mEnd);
                str = TraceFieldType.QuicConnectEndTime;
            }
            A1E.put(str, valueOf);
        }
        return A1E;
    }

    public TraceEvent[] getTraceEvents() {
        return this.mEvents;
    }
}
