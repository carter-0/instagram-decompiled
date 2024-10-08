package com.facebook.mqtt.service;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass972;
import X.C249703kE;
import X.C273654mx;
import X.SN3;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikConstants;
import com.facebook.mqttbypass.IMqttBypassClientHolder;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public final class ConnectionConfig extends AnonymousClass0T0 {
    public final String appId;
    public final Map appSpecificInfo;
    public final Map assetIds;
    public final boolean autoSubscribeOnReconnect;
    public final String cacheDir;
    public final Executor callbackExecutor;
    public final long capabilities;
    public final boolean chatOnEnabled;
    public final int clientKeepAliveBackgroundInSeconds;
    public final int clientKeepAliveInSeconds;
    public final int clientKeepAliveTimeoutInSeconds;
    public final String clientType;
    public final int connectTimeoutInSeconds;
    public final String deviceId;
    public final boolean enableDeferredDisconnect;
    public final boolean enableDeferredDisconnectOnEmptyRcv;
    public final long endpointCapabilities;
    public final String fallbackHost;
    public final boolean highPriPendingPublishQueueEnabled;
    public final String host;
    public final boolean improvedStateReportEnabled;
    public int initialNetworkState;
    public final double initialReconnectBackoffInSeconds;
    public boolean isAppInBackground;
    public final double maxReconnectBackoffInSeconds;
    public final int maxServerUnavailableBeforeBackoff;
    public final IMqttBypassClientHolder mqttBypassClientHolder;
    public final Integer msysThreadPriority;
    public final boolean networkInterfaceHandlingCellularToWifiEnabled;
    public final boolean networkInterfaceHandlingWifiToCellularEnabled;
    public final int numFailuresForFallback;
    public final String password;
    public final PersonalizationConfig personalizationConfig;
    public final String phpOverride;
    public final int port;
    public final int preemptivePublishTimeoutInSeconds;
    public final int publishTimeoutInSeconds;
    public final boolean qplEnabled;
    public String regionHint;
    public final Set subscribeTopics;
    public final String userAgent;
    public final String userId;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ConnectionConfig(java.lang.String r56, java.lang.String r57, java.lang.String r58, int r59, java.lang.String r60, java.lang.String r61, java.lang.String r62, java.lang.String r63, java.lang.String r64, int r65, long r66, long r68, java.lang.String r70, boolean r71, boolean r72, boolean r73, java.util.Set r74, java.util.Map r75, java.lang.String r76, java.util.concurrent.Executor r77, java.lang.Integer r78) {
        /*
            r55 = this;
            r0 = 1
            r6 = r56
            X.0qQ.A0B(r6, r0)
            r0 = 3
            r8 = r58
            X.0qQ.A0B(r8, r0)
            r0 = 17
            r4 = r74
            X.0qQ.A0B(r4, r0)
            r0 = 18
            r3 = r75
            X.0qQ.A0B(r3, r0)
            r0 = 19
            r2 = r76
            X.0qQ.A0B(r2, r0)
            r0 = 20
            r1 = r77
            X.0qQ.A0B(r1, r0)
            r29 = 0
            r39 = 0
            r48 = 0
            r52 = -2097152(0xffffffffffe00000, float:NaN)
            r53 = 1023(0x3ff, float:1.434E-42)
            r16 = r66
            r15 = r65
            r14 = r64
            r13 = r63
            r12 = r62
            r11 = r61
            r10 = r60
            r9 = r59
            r28 = r78
            r23 = r73
            r22 = r72
            r21 = r71
            r20 = r70
            r7 = r57
            r5 = r55
            r18 = r68
            r24 = r4
            r25 = r3
            r26 = r2
            r27 = r1
            r30 = r29
            r31 = r29
            r32 = r29
            r33 = r29
            r34 = r29
            r35 = r29
            r36 = r29
            r37 = r29
            r38 = r29
            r40 = r29
            r41 = r29
            r42 = r39
            r43 = r29
            r44 = r39
            r45 = r39
            r46 = r29
            r47 = r29
            r50 = r48
            r54 = r39
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r50, r52, r53, r54)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.ConnectionConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, boolean, boolean, boolean, java.util.Set, java.util.Map, java.lang.String, java.util.concurrent.Executor, java.lang.Integer):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ConnectionConfig(java.lang.String r56, java.lang.String r57, java.lang.String r58, int r59, java.lang.String r60, java.lang.String r61, java.lang.String r62, java.lang.String r63, java.lang.String r64, int r65, long r66, long r68, java.lang.String r70, boolean r71, boolean r72, boolean r73, java.util.Set r74, java.util.Map r75, java.lang.String r76, java.util.concurrent.Executor r77, java.lang.Integer r78, int r79) {
        /*
            r55 = this;
            r0 = 1
            r6 = r56
            X.0qQ.A0B(r6, r0)
            r0 = 3
            r8 = r58
            X.0qQ.A0B(r8, r0)
            r0 = 17
            r4 = r74
            X.0qQ.A0B(r4, r0)
            r0 = 18
            r3 = r75
            X.0qQ.A0B(r3, r0)
            r0 = 19
            r2 = r76
            X.0qQ.A0B(r2, r0)
            r0 = 20
            r1 = r77
            X.0qQ.A0B(r1, r0)
            r30 = 0
            r39 = 0
            r48 = 0
            r52 = -4194304(0xffffffffffc00000, float:NaN)
            r53 = 1023(0x3ff, float:1.434E-42)
            r16 = r66
            r15 = r65
            r14 = r64
            r13 = r63
            r12 = r62
            r11 = r61
            r10 = r60
            r9 = r59
            r7 = r57
            r29 = r79
            r28 = r78
            r23 = r73
            r22 = r72
            r21 = r71
            r20 = r70
            r5 = r55
            r18 = r68
            r24 = r4
            r25 = r3
            r26 = r2
            r27 = r1
            r31 = r30
            r32 = r30
            r33 = r30
            r34 = r30
            r35 = r30
            r36 = r30
            r37 = r30
            r38 = r30
            r40 = r30
            r41 = r30
            r42 = r39
            r43 = r30
            r44 = r39
            r45 = r39
            r46 = r30
            r47 = r30
            r50 = r48
            r54 = r39
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r50, r52, r53, r54)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.ConnectionConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, boolean, boolean, boolean, java.util.Set, java.util.Map, java.lang.String, java.util.concurrent.Executor, java.lang.Integer, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ConnectionConfig(java.lang.String r56, java.lang.String r57, java.lang.String r58, int r59, java.lang.String r60, java.lang.String r61, java.lang.String r62, java.lang.String r63, java.lang.String r64, int r65, long r66, long r68, java.lang.String r70, boolean r71, boolean r72, boolean r73, java.util.Set r74, java.util.Map r75, java.lang.String r76, java.util.concurrent.Executor r77, java.lang.Integer r78, int r79, int r80) {
        /*
            r55 = this;
            r0 = 1
            r6 = r56
            X.0qQ.A0B(r6, r0)
            r0 = 3
            r8 = r58
            X.0qQ.A0B(r8, r0)
            r0 = 17
            r4 = r74
            X.0qQ.A0B(r4, r0)
            r0 = 18
            r3 = r75
            X.0qQ.A0B(r3, r0)
            r0 = 19
            r2 = r76
            X.0qQ.A0B(r2, r0)
            r0 = 20
            r1 = r77
            X.0qQ.A0B(r1, r0)
            r31 = 0
            r39 = 0
            r48 = 0
            r52 = -8388608(0xffffffffff800000, float:-Infinity)
            r53 = 1023(0x3ff, float:1.434E-42)
            r16 = r66
            r15 = r65
            r14 = r64
            r13 = r63
            r12 = r62
            r11 = r61
            r10 = r60
            r9 = r59
            r7 = r57
            r30 = r80
            r29 = r79
            r28 = r78
            r23 = r73
            r22 = r72
            r21 = r71
            r20 = r70
            r5 = r55
            r18 = r68
            r24 = r4
            r25 = r3
            r26 = r2
            r27 = r1
            r32 = r31
            r33 = r31
            r34 = r31
            r35 = r31
            r36 = r31
            r37 = r31
            r38 = r31
            r40 = r31
            r41 = r31
            r42 = r39
            r43 = r31
            r44 = r39
            r45 = r39
            r46 = r31
            r47 = r31
            r50 = r48
            r54 = r39
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r50, r52, r53, r54)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.ConnectionConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, boolean, boolean, boolean, java.util.Set, java.util.Map, java.lang.String, java.util.concurrent.Executor, java.lang.Integer, int, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ConnectionConfig(java.lang.String r56, java.lang.String r57, java.lang.String r58, int r59, java.lang.String r60, java.lang.String r61, java.lang.String r62, java.lang.String r63, java.lang.String r64, int r65, long r66, long r68, java.lang.String r70, boolean r71, boolean r72, boolean r73, java.util.Set r74, java.util.Map r75, java.lang.String r76, java.util.concurrent.Executor r77, java.lang.Integer r78, int r79, int r80, int r81) {
        /*
            r55 = this;
            r0 = 1
            r6 = r56
            X.0qQ.A0B(r6, r0)
            r0 = 3
            r8 = r58
            X.0qQ.A0B(r8, r0)
            r0 = 17
            r4 = r74
            X.0qQ.A0B(r4, r0)
            r0 = 18
            r3 = r75
            X.0qQ.A0B(r3, r0)
            r0 = 19
            r2 = r76
            X.0qQ.A0B(r2, r0)
            r0 = 20
            r1 = r77
            X.0qQ.A0B(r1, r0)
            r32 = 0
            r39 = 0
            r48 = 0
            r52 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r53 = 1023(0x3ff, float:1.434E-42)
            r16 = r66
            r15 = r65
            r14 = r64
            r13 = r63
            r12 = r62
            r11 = r61
            r10 = r60
            r9 = r59
            r7 = r57
            r18 = r68
            r31 = r81
            r5 = r55
            r30 = r80
            r29 = r79
            r28 = r78
            r23 = r73
            r22 = r72
            r21 = r71
            r20 = r70
            r24 = r4
            r25 = r3
            r26 = r2
            r27 = r1
            r33 = r32
            r34 = r32
            r35 = r32
            r36 = r32
            r37 = r32
            r38 = r32
            r40 = r32
            r41 = r32
            r42 = r39
            r43 = r32
            r44 = r39
            r45 = r39
            r46 = r32
            r47 = r32
            r50 = r48
            r54 = r39
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r50, r52, r53, r54)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.ConnectionConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, boolean, boolean, boolean, java.util.Set, java.util.Map, java.lang.String, java.util.concurrent.Executor, java.lang.Integer, int, int, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ConnectionConfig(java.lang.String r56, java.lang.String r57, java.lang.String r58, int r59, java.lang.String r60, java.lang.String r61, java.lang.String r62, java.lang.String r63, java.lang.String r64, int r65, long r66, long r68, java.lang.String r70, boolean r71, boolean r72, boolean r73, java.util.Set r74, java.util.Map r75, java.lang.String r76, java.util.concurrent.Executor r77, java.lang.Integer r78, int r79, int r80, int r81, int r82) {
        /*
            r55 = this;
            r0 = 1
            r6 = r56
            X.0qQ.A0B(r6, r0)
            r0 = 3
            r8 = r58
            X.0qQ.A0B(r8, r0)
            r0 = 17
            r4 = r74
            X.0qQ.A0B(r4, r0)
            r0 = 18
            r3 = r75
            X.0qQ.A0B(r3, r0)
            r0 = 19
            r2 = r76
            X.0qQ.A0B(r2, r0)
            r0 = 20
            r1 = r77
            X.0qQ.A0B(r1, r0)
            r33 = 0
            r39 = 0
            r48 = 0
            r52 = -33554432(0xfffffffffe000000, float:-4.2535296E37)
            r53 = 1023(0x3ff, float:1.434E-42)
            r16 = r66
            r15 = r65
            r14 = r64
            r13 = r63
            r12 = r62
            r11 = r61
            r10 = r60
            r9 = r59
            r7 = r57
            r18 = r68
            r5 = r55
            r32 = r82
            r31 = r81
            r30 = r80
            r29 = r79
            r28 = r78
            r23 = r73
            r22 = r72
            r21 = r71
            r20 = r70
            r24 = r4
            r25 = r3
            r26 = r2
            r27 = r1
            r34 = r33
            r35 = r33
            r36 = r33
            r37 = r33
            r38 = r33
            r40 = r33
            r41 = r33
            r42 = r39
            r43 = r33
            r44 = r39
            r45 = r39
            r46 = r33
            r47 = r33
            r50 = r48
            r54 = r39
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r50, r52, r53, r54)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.ConnectionConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, boolean, boolean, boolean, java.util.Set, java.util.Map, java.lang.String, java.util.concurrent.Executor, java.lang.Integer, int, int, int, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ConnectionConfig(java.lang.String r56, java.lang.String r57, java.lang.String r58, int r59, java.lang.String r60, java.lang.String r61, java.lang.String r62, java.lang.String r63, java.lang.String r64, int r65, long r66, long r68, java.lang.String r70, boolean r71, boolean r72, boolean r73, java.util.Set r74, java.util.Map r75, java.lang.String r76, java.util.concurrent.Executor r77, java.lang.Integer r78, int r79, int r80, int r81, int r82, int r83, int r84, int r85, boolean r86, boolean r87, boolean r88, com.facebook.mqtt.service.PersonalizationConfig r89, boolean r90, boolean r91, com.facebook.mqttbypass.IMqttBypassClientHolder r92) {
        /*
            r55 = this;
            r0 = 1
            r6 = r56
            X.0qQ.A0B(r6, r0)
            r0 = 3
            r8 = r58
            X.0qQ.A0B(r8, r0)
            r0 = 17
            r4 = r74
            X.0qQ.A0B(r4, r0)
            r0 = 18
            r3 = r75
            X.0qQ.A0B(r3, r0)
            r0 = 19
            r2 = r76
            X.0qQ.A0B(r2, r0)
            r0 = 20
            r1 = r77
            X.0qQ.A0B(r1, r0)
            r43 = 0
            r44 = 0
            r48 = 0
            r53 = 1016(0x3f8, float:1.424E-42)
            r33 = r83
            r32 = r82
            r31 = r81
            r30 = r80
            r29 = r79
            r28 = r78
            r36 = r86
            r7 = r57
            r11 = r61
            r40 = r90
            r37 = r87
            r12 = r62
            r41 = r91
            r38 = r88
            r9 = r59
            r13 = r63
            r42 = r92
            r39 = r89
            r10 = r60
            r14 = r64
            r15 = r65
            r16 = r66
            r35 = r85
            r18 = r68
            r5 = r55
            r34 = r84
            r20 = r70
            r21 = r71
            r22 = r72
            r23 = r73
            r24 = r4
            r25 = r3
            r26 = r2
            r27 = r1
            r45 = r44
            r46 = r43
            r47 = r43
            r50 = r48
            r52 = r43
            r54 = r44
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r50, r52, r53, r54)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.ConnectionConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, boolean, boolean, boolean, java.util.Set, java.util.Map, java.lang.String, java.util.concurrent.Executor, java.lang.Integer, int, int, int, int, int, int, int, boolean, boolean, boolean, com.facebook.mqtt.service.PersonalizationConfig, boolean, boolean, com.facebook.mqttbypass.IMqttBypassClientHolder):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ConnectionConfig(java.lang.String r56, java.lang.String r57, java.lang.String r58, int r59, java.lang.String r60, java.lang.String r61, java.lang.String r62, java.lang.String r63, java.lang.String r64, int r65, long r66, long r68, java.lang.String r70, boolean r71, boolean r72, boolean r73, java.util.Set r74, java.util.Map r75, java.lang.String r76, java.util.concurrent.Executor r77, java.lang.Integer r78, int r79, int r80, int r81, int r82, int r83, int r84, int r85, boolean r86, boolean r87, boolean r88, com.facebook.mqtt.service.PersonalizationConfig r89, boolean r90, boolean r91, com.facebook.mqttbypass.IMqttBypassClientHolder r92, boolean r93) {
        /*
            r55 = this;
            r0 = 1
            r6 = r56
            X.0qQ.A0B(r6, r0)
            r0 = 3
            r8 = r58
            X.0qQ.A0B(r8, r0)
            r0 = 17
            r4 = r74
            X.0qQ.A0B(r4, r0)
            r0 = 18
            r3 = r75
            X.0qQ.A0B(r3, r0)
            r0 = 19
            r2 = r76
            X.0qQ.A0B(r2, r0)
            r0 = 20
            r1 = r77
            X.0qQ.A0B(r1, r0)
            r44 = 0
            r46 = 0
            r48 = 0
            r53 = 1008(0x3f0, float:1.413E-42)
            r33 = r83
            r32 = r82
            r31 = r81
            r30 = r80
            r29 = r79
            r28 = r78
            r36 = r86
            r7 = r57
            r37 = r87
            r12 = r62
            r41 = r91
            r38 = r88
            r9 = r59
            r13 = r63
            r42 = r92
            r39 = r89
            r10 = r60
            r14 = r64
            r43 = r93
            r40 = r90
            r11 = r61
            r15 = r65
            r16 = r66
            r35 = r85
            r18 = r68
            r5 = r55
            r34 = r84
            r20 = r70
            r21 = r71
            r22 = r72
            r23 = r73
            r24 = r4
            r25 = r3
            r26 = r2
            r27 = r1
            r45 = r44
            r47 = r46
            r50 = r48
            r52 = r46
            r54 = r44
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r50, r52, r53, r54)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.ConnectionConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, boolean, boolean, boolean, java.util.Set, java.util.Map, java.lang.String, java.util.concurrent.Executor, java.lang.Integer, int, int, int, int, int, int, int, boolean, boolean, boolean, com.facebook.mqtt.service.PersonalizationConfig, boolean, boolean, com.facebook.mqttbypass.IMqttBypassClientHolder, boolean):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ConnectionConfig(java.lang.String r56, java.lang.String r57, java.lang.String r58, int r59, java.lang.String r60, java.lang.String r61, java.lang.String r62, java.lang.String r63, java.lang.String r64, int r65, long r66, long r68, java.lang.String r70, boolean r71, boolean r72, boolean r73, java.util.Set r74, java.util.Map r75, java.lang.String r76, java.util.concurrent.Executor r77, java.lang.Integer r78, int r79, int r80, int r81, int r82, int r83, int r84, int r85, boolean r86, boolean r87, boolean r88, com.facebook.mqtt.service.PersonalizationConfig r89, boolean r90, boolean r91, com.facebook.mqttbypass.IMqttBypassClientHolder r92, boolean r93, java.util.Map r94) {
        /*
            r55 = this;
            r0 = 1
            r6 = r56
            X.0qQ.A0B(r6, r0)
            r0 = 3
            r8 = r58
            X.0qQ.A0B(r8, r0)
            r0 = 17
            r4 = r74
            X.0qQ.A0B(r4, r0)
            r0 = 18
            r3 = r75
            X.0qQ.A0B(r3, r0)
            r0 = 19
            r2 = r76
            X.0qQ.A0B(r2, r0)
            r0 = 20
            r1 = r77
            X.0qQ.A0B(r1, r0)
            r45 = 0
            r46 = 0
            r48 = 0
            r53 = 992(0x3e0, float:1.39E-42)
            r33 = r83
            r32 = r82
            r31 = r81
            r30 = r80
            r29 = r79
            r28 = r78
            r36 = r86
            r7 = r57
            r37 = r87
            r38 = r88
            r9 = r59
            r13 = r63
            r42 = r92
            r39 = r89
            r10 = r60
            r14 = r64
            r43 = r93
            r40 = r90
            r11 = r61
            r15 = r65
            r44 = r94
            r41 = r91
            r12 = r62
            r16 = r66
            r35 = r85
            r18 = r68
            r5 = r55
            r34 = r84
            r20 = r70
            r21 = r71
            r22 = r72
            r23 = r73
            r24 = r4
            r25 = r3
            r26 = r2
            r27 = r1
            r47 = r46
            r50 = r48
            r52 = r46
            r54 = r45
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r50, r52, r53, r54)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.ConnectionConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, boolean, boolean, boolean, java.util.Set, java.util.Map, java.lang.String, java.util.concurrent.Executor, java.lang.Integer, int, int, int, int, int, int, int, boolean, boolean, boolean, com.facebook.mqtt.service.PersonalizationConfig, boolean, boolean, com.facebook.mqttbypass.IMqttBypassClientHolder, boolean, java.util.Map):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ConnectionConfig(java.lang.String r56, java.lang.String r57, java.lang.String r58, int r59, java.lang.String r60, java.lang.String r61, java.lang.String r62, java.lang.String r63, java.lang.String r64, int r65, long r66, long r68, java.lang.String r70, boolean r71, boolean r72, boolean r73, java.util.Set r74, java.util.Map r75, java.lang.String r76, java.util.concurrent.Executor r77, java.lang.Integer r78, int r79, int r80, int r81, int r82, int r83, int r84, int r85, boolean r86, boolean r87, boolean r88, com.facebook.mqtt.service.PersonalizationConfig r89, boolean r90, boolean r91, com.facebook.mqttbypass.IMqttBypassClientHolder r92, boolean r93, java.util.Map r94, java.lang.String r95) {
        /*
            r55 = this;
            r0 = 1
            r6 = r56
            X.0qQ.A0B(r6, r0)
            r0 = 3
            r8 = r58
            X.0qQ.A0B(r8, r0)
            r0 = 17
            r4 = r74
            X.0qQ.A0B(r4, r0)
            r0 = 18
            r3 = r75
            X.0qQ.A0B(r3, r0)
            r0 = 19
            r2 = r76
            X.0qQ.A0B(r2, r0)
            r0 = 20
            r1 = r77
            X.0qQ.A0B(r1, r0)
            r46 = 0
            r48 = 0
            r53 = 960(0x3c0, float:1.345E-42)
            r54 = 0
            r33 = r83
            r32 = r82
            r31 = r81
            r30 = r80
            r29 = r79
            r28 = r78
            r36 = r86
            r7 = r57
            r37 = r87
            r38 = r88
            r9 = r59
            r39 = r89
            r10 = r60
            r14 = r64
            r43 = r93
            r40 = r90
            r11 = r61
            r15 = r65
            r44 = r94
            r41 = r91
            r12 = r62
            r16 = r66
            r45 = r95
            r42 = r92
            r13 = r63
            r35 = r85
            r18 = r68
            r5 = r55
            r34 = r84
            r20 = r70
            r21 = r71
            r22 = r72
            r23 = r73
            r24 = r4
            r25 = r3
            r26 = r2
            r27 = r1
            r47 = r46
            r50 = r48
            r52 = r46
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r50, r52, r53, r54)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.ConnectionConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, boolean, boolean, boolean, java.util.Set, java.util.Map, java.lang.String, java.util.concurrent.Executor, java.lang.Integer, int, int, int, int, int, int, int, boolean, boolean, boolean, com.facebook.mqtt.service.PersonalizationConfig, boolean, boolean, com.facebook.mqttbypass.IMqttBypassClientHolder, boolean, java.util.Map, java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ConnectionConfig(java.lang.String r56, java.lang.String r57, java.lang.String r58, int r59, java.lang.String r60, java.lang.String r61, java.lang.String r62, java.lang.String r63, java.lang.String r64, int r65, long r66, long r68, java.lang.String r70, boolean r71, boolean r72, boolean r73, java.util.Set r74, java.util.Map r75, java.lang.String r76, java.util.concurrent.Executor r77, java.lang.Integer r78, int r79, int r80, int r81, int r82, int r83, int r84, int r85, boolean r86, boolean r87, boolean r88, com.facebook.mqtt.service.PersonalizationConfig r89, boolean r90, boolean r91, com.facebook.mqttbypass.IMqttBypassClientHolder r92, boolean r93, java.util.Map r94, java.lang.String r95, int r96) {
        /*
            r55 = this;
            r0 = 1
            r6 = r56
            X.0qQ.A0B(r6, r0)
            r0 = 3
            r8 = r58
            X.0qQ.A0B(r8, r0)
            r0 = 17
            r4 = r74
            X.0qQ.A0B(r4, r0)
            r0 = 18
            r3 = r75
            X.0qQ.A0B(r3, r0)
            r0 = 19
            r2 = r76
            X.0qQ.A0B(r2, r0)
            r0 = 20
            r1 = r77
            X.0qQ.A0B(r1, r0)
            r47 = 0
            r48 = 0
            r53 = 896(0x380, float:1.256E-42)
            r54 = 0
            r33 = r83
            r32 = r82
            r31 = r81
            r30 = r80
            r29 = r79
            r28 = r78
            r23 = r73
            r36 = r86
            r7 = r57
            r37 = r87
            r38 = r88
            r9 = r59
            r39 = r89
            r10 = r60
            r40 = r90
            r11 = r61
            r15 = r65
            r44 = r94
            r41 = r91
            r12 = r62
            r16 = r66
            r45 = r95
            r42 = r92
            r13 = r63
            r43 = r93
            r14 = r64
            r46 = r96
            r35 = r85
            r18 = r68
            r5 = r55
            r34 = r84
            r20 = r70
            r21 = r71
            r22 = r72
            r24 = r4
            r25 = r3
            r26 = r2
            r27 = r1
            r50 = r48
            r52 = r47
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r50, r52, r53, r54)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.ConnectionConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, boolean, boolean, boolean, java.util.Set, java.util.Map, java.lang.String, java.util.concurrent.Executor, java.lang.Integer, int, int, int, int, int, int, int, boolean, boolean, boolean, com.facebook.mqtt.service.PersonalizationConfig, boolean, boolean, com.facebook.mqttbypass.IMqttBypassClientHolder, boolean, java.util.Map, java.lang.String, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ConnectionConfig(java.lang.String r56, java.lang.String r57, java.lang.String r58, int r59, java.lang.String r60, java.lang.String r61, java.lang.String r62, java.lang.String r63, java.lang.String r64, int r65, long r66, long r68, java.lang.String r70, boolean r71, boolean r72, boolean r73, java.util.Set r74, java.util.Map r75, java.lang.String r76, java.util.concurrent.Executor r77, java.lang.Integer r78, int r79, int r80, int r81, int r82, int r83, int r84, int r85, boolean r86, boolean r87, boolean r88, com.facebook.mqtt.service.PersonalizationConfig r89, boolean r90, boolean r91, com.facebook.mqttbypass.IMqttBypassClientHolder r92, boolean r93, java.util.Map r94, java.lang.String r95, int r96, boolean r97) {
        /*
            r55 = this;
            r0 = 1
            r6 = r56
            X.0qQ.A0B(r6, r0)
            r0 = 3
            r8 = r58
            X.0qQ.A0B(r8, r0)
            r0 = 17
            r4 = r74
            X.0qQ.A0B(r4, r0)
            r0 = 18
            r3 = r75
            X.0qQ.A0B(r3, r0)
            r0 = 19
            r2 = r76
            X.0qQ.A0B(r2, r0)
            r0 = 20
            r1 = r77
            X.0qQ.A0B(r1, r0)
            r48 = 0
            r52 = 0
            r53 = 768(0x300, float:1.076E-42)
            r54 = 0
            r33 = r83
            r32 = r82
            r31 = r81
            r30 = r80
            r29 = r79
            r28 = r78
            r23 = r73
            r22 = r72
            r36 = r86
            r7 = r57
            r37 = r87
            r38 = r88
            r9 = r59
            r39 = r89
            r10 = r60
            r40 = r90
            r11 = r61
            r41 = r91
            r12 = r62
            r16 = r66
            r45 = r95
            r42 = r92
            r13 = r63
            r43 = r93
            r14 = r64
            r44 = r94
            r15 = r65
            r46 = r96
            r47 = r97
            r18 = r68
            r35 = r85
            r5 = r55
            r34 = r84
            r20 = r70
            r21 = r71
            r24 = r4
            r25 = r3
            r26 = r2
            r27 = r1
            r50 = r48
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r50, r52, r53, r54)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.ConnectionConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, boolean, boolean, boolean, java.util.Set, java.util.Map, java.lang.String, java.util.concurrent.Executor, java.lang.Integer, int, int, int, int, int, int, int, boolean, boolean, boolean, com.facebook.mqtt.service.PersonalizationConfig, boolean, boolean, com.facebook.mqttbypass.IMqttBypassClientHolder, boolean, java.util.Map, java.lang.String, int, boolean):void");
    }

    public static /* synthetic */ ConnectionConfig copy$default(ConnectionConfig connectionConfig, String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, int i2, long j, long j2, String str9, boolean z, boolean z2, boolean z3, Set set, Map map, String str10, Executor executor, Integer num, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z4, boolean z5, boolean z6, PersonalizationConfig personalizationConfig2, boolean z7, boolean z8, IMqttBypassClientHolder iMqttBypassClientHolder, boolean z9, Map map2, String str11, int i10, boolean z10, double d, double d2, int i11, int i12, Object obj) {
        long j3 = j2;
        long j4 = j;
        int i13 = i2;
        String str12 = str8;
        String str13 = str7;
        String str14 = str6;
        String str15 = str5;
        String str16 = str4;
        int i14 = i;
        String str17 = str3;
        String str18 = str2;
        String str19 = str;
        double d3 = d2;
        double d4 = d;
        int i15 = i6;
        int i16 = i4;
        int i17 = i3;
        Integer num2 = num;
        int i18 = i10;
        boolean z11 = z8;
        Map map3 = map;
        IMqttBypassClientHolder iMqttBypassClientHolder2 = iMqttBypassClientHolder;
        boolean z12 = z6;
        boolean z13 = z3;
        int i19 = i8;
        boolean z14 = z2;
        int i20 = i5;
        Set set2 = set;
        boolean z15 = z5;
        boolean z16 = z;
        Executor executor2 = executor;
        String str20 = str9;
        int i21 = i7;
        String str21 = str10;
        String str22 = str11;
        boolean z17 = z7;
        int i22 = i9;
        boolean z18 = z4;
        int i23 = i11;
        PersonalizationConfig personalizationConfig3 = personalizationConfig2;
        boolean z19 = z9;
        Map map4 = map2;
        boolean z20 = z10;
        ConnectionConfig connectionConfig2 = connectionConfig;
        if ((i11 & 1) != 0) {
            str19 = connectionConfig2.userId;
        }
        if ((i11 & 2) != 0) {
            str18 = connectionConfig2.password;
        }
        if ((i11 & 4) != 0) {
            str17 = connectionConfig2.host;
        }
        if ((i11 & 8) != 0) {
            i14 = connectionConfig2.port;
        }
        if ((i11 & 16) != 0) {
            str16 = connectionConfig2.userAgent;
        }
        if ((i11 & 32) != 0) {
            str15 = connectionConfig2.deviceId;
        }
        if ((i11 & 64) != 0) {
            str14 = connectionConfig2.clientType;
        }
        if ((i23 & 128) != 0) {
            str13 = connectionConfig2.phpOverride;
        }
        if ((i23 & 256) != 0) {
            str12 = connectionConfig2.appId;
        }
        if ((i23 & 512) != 0) {
            i13 = connectionConfig2.initialNetworkState;
        }
        if ((i23 & 1024) != 0) {
            j4 = connectionConfig2.capabilities;
        }
        if ((i23 & C249703kE.FLAG_MOVED) != 0) {
            j3 = connectionConfig2.endpointCapabilities;
        }
        if ((i23 & 4096) != 0) {
            str20 = connectionConfig2.regionHint;
        }
        if ((i23 & 8192) != 0) {
            z16 = connectionConfig2.qplEnabled;
        }
        if ((i23 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            z14 = connectionConfig2.chatOnEnabled;
        }
        if ((i11 & Constants.LOAD_RESULT_PGO) != 0) {
            z13 = connectionConfig2.isAppInBackground;
        }
        if ((i11 & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0) {
            set2 = connectionConfig2.subscribeTopics;
        }
        if ((i11 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0) {
            map3 = connectionConfig2.appSpecificInfo;
        }
        if ((i11 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
            str21 = connectionConfig2.cacheDir;
        }
        if ((i11 & Constants.LOAD_RESULT_WITH_VDEX_ODEX) != 0) {
            executor2 = connectionConfig2.callbackExecutor;
        }
        if ((i11 & Constants.LOAD_RESULT_NEED_REOPTIMIZATION) != 0) {
            num2 = connectionConfig2.msysThreadPriority;
        }
        if ((i11 & 2097152) != 0) {
            i17 = connectionConfig2.clientKeepAliveInSeconds;
        }
        if ((i11 & 4194304) != 0) {
            i16 = connectionConfig2.clientKeepAliveBackgroundInSeconds;
        }
        if ((i11 & DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE) != 0) {
            i20 = connectionConfig2.clientKeepAliveTimeoutInSeconds;
        }
        if ((i11 & 16777216) != 0) {
            i15 = connectionConfig2.connectTimeoutInSeconds;
        }
        if ((i11 & 33554432) != 0) {
            i21 = connectionConfig2.publishTimeoutInSeconds;
        }
        if ((i11 & 67108864) != 0) {
            i19 = connectionConfig2.preemptivePublishTimeoutInSeconds;
        }
        if ((i11 & 134217728) != 0) {
            i22 = connectionConfig2.maxServerUnavailableBeforeBackoff;
        }
        if ((i11 & 268435456) != 0) {
            z18 = connectionConfig2.networkInterfaceHandlingCellularToWifiEnabled;
        }
        if ((i11 & 536870912) != 0) {
            z15 = connectionConfig2.networkInterfaceHandlingWifiToCellularEnabled;
        }
        if ((i11 & SN3.MAX_SIGNED_POWER_OF_TWO) != 0) {
            z12 = connectionConfig2.improvedStateReportEnabled;
        }
        if ((i11 & AnonymousClass972.MUTABLE_FLAG_MASK) != 0) {
            personalizationConfig3 = connectionConfig2.personalizationConfig;
        }
        int i24 = i12;
        if ((i12 & 1) != 0) {
            z17 = connectionConfig2.enableDeferredDisconnect;
        }
        if ((i12 & 2) != 0) {
            z11 = connectionConfig2.enableDeferredDisconnectOnEmptyRcv;
        }
        if ((i12 & 4) != 0) {
            iMqttBypassClientHolder2 = connectionConfig2.mqttBypassClientHolder;
        }
        if ((i12 & 8) != 0) {
            z19 = connectionConfig2.autoSubscribeOnReconnect;
        }
        if ((i12 & 16) != 0) {
            map4 = connectionConfig2.assetIds;
        }
        if ((i12 & 32) != 0) {
            str22 = connectionConfig2.fallbackHost;
        }
        if ((i12 & 64) != 0) {
            i18 = connectionConfig2.numFailuresForFallback;
        }
        if ((i24 & 128) != 0) {
            z20 = connectionConfig2.highPriPendingPublishQueueEnabled;
        }
        if ((i24 & 256) != 0) {
            d4 = connectionConfig2.initialReconnectBackoffInSeconds;
        }
        if ((i24 & 512) != 0) {
            d3 = connectionConfig2.maxReconnectBackoffInSeconds;
        }
        return connectionConfig2.copy(str19, str18, str17, i14, str16, str15, str14, str13, str12, i13, j4, j3, str20, z16, z14, z13, set2, map3, str21, executor2, num2, i17, i16, i20, i15, i21, i19, i22, z18, z15, z12, personalizationConfig3, z17, z11, iMqttBypassClientHolder2, z19, map4, str22, i18, z20, d4, d3);
    }

    public final String component1() {
        return this.userId;
    }

    public final int component10() {
        return this.initialNetworkState;
    }

    public final long component11() {
        return this.capabilities;
    }

    public final long component12() {
        return this.endpointCapabilities;
    }

    public final String component13() {
        return this.regionHint;
    }

    public final boolean component14() {
        return this.qplEnabled;
    }

    public final boolean component15() {
        return this.chatOnEnabled;
    }

    public final boolean component16() {
        return this.isAppInBackground;
    }

    public final Set component17() {
        return this.subscribeTopics;
    }

    public final Map component18() {
        return this.appSpecificInfo;
    }

    public final String component19() {
        return this.cacheDir;
    }

    public final String component2() {
        return this.password;
    }

    public final Executor component20() {
        return this.callbackExecutor;
    }

    public final Integer component21() {
        return this.msysThreadPriority;
    }

    public final int component22() {
        return this.clientKeepAliveInSeconds;
    }

    public final int component23() {
        return this.clientKeepAliveBackgroundInSeconds;
    }

    public final int component24() {
        return this.clientKeepAliveTimeoutInSeconds;
    }

    public final int component25() {
        return this.connectTimeoutInSeconds;
    }

    public final int component26() {
        return this.publishTimeoutInSeconds;
    }

    public final int component27() {
        return this.preemptivePublishTimeoutInSeconds;
    }

    public final int component28() {
        return this.maxServerUnavailableBeforeBackoff;
    }

    public final boolean component29() {
        return this.networkInterfaceHandlingCellularToWifiEnabled;
    }

    public final String component3() {
        return this.host;
    }

    public final boolean component30() {
        return this.networkInterfaceHandlingWifiToCellularEnabled;
    }

    public final boolean component31() {
        return this.improvedStateReportEnabled;
    }

    public final PersonalizationConfig component32() {
        return this.personalizationConfig;
    }

    public final boolean component33() {
        return this.enableDeferredDisconnect;
    }

    public final boolean component34() {
        return this.enableDeferredDisconnectOnEmptyRcv;
    }

    public final IMqttBypassClientHolder component35() {
        return this.mqttBypassClientHolder;
    }

    public final boolean component36() {
        return this.autoSubscribeOnReconnect;
    }

    public final Map component37() {
        return this.assetIds;
    }

    public final String component38() {
        return this.fallbackHost;
    }

    public final int component39() {
        return this.numFailuresForFallback;
    }

    public final int component4() {
        return this.port;
    }

    public final boolean component40() {
        return this.highPriPendingPublishQueueEnabled;
    }

    public final double component41() {
        return this.initialReconnectBackoffInSeconds;
    }

    public final double component42() {
        return this.maxReconnectBackoffInSeconds;
    }

    public final String component5() {
        return this.userAgent;
    }

    public final String component6() {
        return this.deviceId;
    }

    public final String component7() {
        return this.clientType;
    }

    public final String component8() {
        return this.phpOverride;
    }

    public final String component9() {
        return this.appId;
    }

    public final ConnectionConfig copy(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, int i2, long j, long j2, String str9, boolean z, boolean z2, boolean z3, Set set, Map map, String str10, Executor executor, Integer num, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z4, boolean z5, boolean z6, PersonalizationConfig personalizationConfig2, boolean z7, boolean z8, IMqttBypassClientHolder iMqttBypassClientHolder, boolean z9, Map map2, String str11, int i10, boolean z10, double d, double d2) {
        String str12 = str;
        0qQ.A0B(str12, 0);
        String str13 = str3;
        0qQ.A0B(str13, 2);
        Set set2 = set;
        0qQ.A0B(set2, 16);
        Map map3 = map;
        0qQ.A0B(map3, 17);
        String str14 = str10;
        0qQ.A0B(str14, 18);
        Executor executor2 = executor;
        0qQ.A0B(executor2, 19);
        return new ConnectionConfig(str12, str2, str13, i, str4, str5, str6, str7, str8, i2, j, j2, str9, z, z2, z3, set2, map3, str14, executor2, num, i3, i4, i5, i6, i7, i8, i9, z4, z5, z6, personalizationConfig2, z7, z8, iMqttBypassClientHolder, z9, map2, str11, i10, z10, d, d2);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public final String getAppId() {
        return this.appId;
    }

    public final Map getAppSpecificInfo() {
        return this.appSpecificInfo;
    }

    public final Map getAssetIds() {
        return this.assetIds;
    }

    public final boolean getAutoSubscribeOnReconnect() {
        return this.autoSubscribeOnReconnect;
    }

    public final String getCacheDir() {
        return this.cacheDir;
    }

    public final Executor getCallbackExecutor() {
        return this.callbackExecutor;
    }

    public final long getCapabilities() {
        return this.capabilities;
    }

    public final boolean getChatOnEnabled() {
        return this.chatOnEnabled;
    }

    public final int getClientKeepAliveBackgroundInSeconds() {
        return this.clientKeepAliveBackgroundInSeconds;
    }

    public final int getClientKeepAliveInSeconds() {
        return this.clientKeepAliveInSeconds;
    }

    public final int getClientKeepAliveTimeoutInSeconds() {
        return this.clientKeepAliveTimeoutInSeconds;
    }

    public final String getClientType() {
        return this.clientType;
    }

    public final int getConnectTimeoutInSeconds() {
        return this.connectTimeoutInSeconds;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final boolean getEnableDeferredDisconnect() {
        return this.enableDeferredDisconnect;
    }

    public final boolean getEnableDeferredDisconnectOnEmptyRcv() {
        return this.enableDeferredDisconnectOnEmptyRcv;
    }

    public final long getEndpointCapabilities() {
        return this.endpointCapabilities;
    }

    public final String getFallbackHost() {
        return this.fallbackHost;
    }

    public final boolean getHighPriPendingPublishQueueEnabled() {
        return this.highPriPendingPublishQueueEnabled;
    }

    public final String getHost() {
        return this.host;
    }

    public final boolean getImprovedStateReportEnabled() {
        return this.improvedStateReportEnabled;
    }

    public final int getInitialNetworkState() {
        return this.initialNetworkState;
    }

    public final double getInitialReconnectBackoffInSeconds() {
        return this.initialReconnectBackoffInSeconds;
    }

    public final double getMaxReconnectBackoffInSeconds() {
        return this.maxReconnectBackoffInSeconds;
    }

    public final int getMaxServerUnavailableBeforeBackoff() {
        return this.maxServerUnavailableBeforeBackoff;
    }

    public final IMqttBypassClientHolder getMqttBypassClientHolder() {
        return this.mqttBypassClientHolder;
    }

    public final Integer getMsysThreadPriority() {
        return this.msysThreadPriority;
    }

    public final boolean getNetworkInterfaceHandlingCellularToWifiEnabled() {
        return this.networkInterfaceHandlingCellularToWifiEnabled;
    }

    public final boolean getNetworkInterfaceHandlingWifiToCellularEnabled() {
        return this.networkInterfaceHandlingWifiToCellularEnabled;
    }

    public final int getNumFailuresForFallback() {
        return this.numFailuresForFallback;
    }

    public final String getPassword() {
        return this.password;
    }

    public final PersonalizationConfig getPersonalizationConfig() {
        return this.personalizationConfig;
    }

    public final String getPhpOverride() {
        return this.phpOverride;
    }

    public final int getPort() {
        return this.port;
    }

    public final int getPreemptivePublishTimeoutInSeconds() {
        return this.preemptivePublishTimeoutInSeconds;
    }

    public final int getPublishTimeoutInSeconds() {
        return this.publishTimeoutInSeconds;
    }

    public final boolean getQplEnabled() {
        return this.qplEnabled;
    }

    public final String getRegionHint() {
        return this.regionHint;
    }

    public final Set getSubscribeTopics() {
        return this.subscribeTopics;
    }

    public final String getUserAgent() {
        return this.userAgent;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final boolean isAppInBackground() {
        return this.isAppInBackground;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Config host:");
        sb.append(this.host);
        sb.append(", fallbackHost:");
        sb.append(this.fallbackHost);
        sb.append(", port:");
        sb.append(this.port);
        sb.append(", user:");
        sb.append(this.userId);
        sb.append(", agent:");
        sb.append(this.userAgent);
        sb.append(", deviceId:");
        sb.append(this.deviceId);
        sb.append(", client:");
        sb.append(this.clientType);
        sb.append(", phpOverride:");
        sb.append(this.phpOverride);
        sb.append(", app:");
        sb.append(this.appId);
        sb.append(", capabilities:");
        sb.append(this.capabilities);
        sb.append(", endpointCapabilities:");
        sb.append(this.endpointCapabilities);
        sb.append(C273654mx.A00(1131));
        sb.append(this.regionHint);
        sb.append(", appInfo:");
        sb.append(this.appSpecificInfo);
        sb.append(", initialTopics:");
        sb.append(this.subscribeTopics);
        sb.append(", qpl:");
        sb.append(this.qplEnabled);
        sb.append(", cacheDir:");
        sb.append(this.cacheDir);
        sb.append(", chatOn:");
        sb.append(this.chatOnEnabled);
        sb.append(", isBackground:");
        sb.append(this.isAppInBackground);
        sb.append(", clientKeepAliveInSeconds:");
        sb.append(this.clientKeepAliveInSeconds);
        sb.append(", clientKeepAliveBackgroundInSeconds:");
        sb.append(this.clientKeepAliveBackgroundInSeconds);
        sb.append(", clientKeepAliveTimeoutInSeconds:");
        sb.append(this.clientKeepAliveTimeoutInSeconds);
        sb.append(", connectTimeoutInSeconds:");
        sb.append(this.connectTimeoutInSeconds);
        sb.append(",publishTimeoutInSeconds:");
        sb.append(this.publishTimeoutInSeconds);
        sb.append(", preemptivePublishTimeoutInSeconds:");
        sb.append(this.preemptivePublishTimeoutInSeconds);
        sb.append(", personalizationConfig:");
        sb.append(this.personalizationConfig);
        sb.append(", networkInterfaceHandlingCellularToWifiEnabled:");
        sb.append(this.networkInterfaceHandlingCellularToWifiEnabled);
        sb.append(", networkInterfaceHandlingWifiToCellularEnabled:");
        sb.append(this.networkInterfaceHandlingWifiToCellularEnabled);
        sb.append(", enableDeferredDisconnect:");
        sb.append(this.enableDeferredDisconnect);
        sb.append(", enableDeferredDisconnectOnEmptyRcv:");
        sb.append(this.enableDeferredDisconnectOnEmptyRcv);
        sb.append(", mqttBypassClientHolder:");
        sb.append(this.mqttBypassClientHolder);
        sb.append(", autoSubscribeOnReconnect:");
        sb.append(this.autoSubscribeOnReconnect);
        sb.append(", numFailuresForFallback:");
        sb.append(this.numFailuresForFallback);
        sb.append(", highPriPendingPublishQueueEnabled:");
        sb.append(this.highPriPendingPublishQueueEnabled);
        sb.append(", initialReconnectBackoffInSeconds:");
        sb.append(this.initialReconnectBackoffInSeconds);
        sb.append(", maxReconnectBackoffInSeconds:");
        sb.append(this.maxReconnectBackoffInSeconds);
        sb.append(", ");
        return sb.toString();
    }

    public final void setAppInBackground(boolean z) {
        this.isAppInBackground = z;
    }

    public final void setInitialNetworkState(int i) {
        this.initialNetworkState = i;
    }

    public final void setRegionHint(String str) {
        this.regionHint = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ConnectionConfig(java.lang.String r53, java.lang.String r54, java.lang.String r55, int r56, java.lang.String r57, java.lang.String r58, java.lang.String r59, java.lang.String r60, java.lang.String r61, int r62, long r63, long r65, java.lang.String r67, boolean r68, boolean r69, boolean r70, java.util.Set r71, java.util.Map r72, java.lang.String r73, java.util.concurrent.Executor r74, java.lang.Integer r75, int r76, int r77, int r78, int r79, int r80) {
        /*
            r52 = this;
            r0 = 1
            r6 = r53
            X.0qQ.A0B(r6, r0)
            r0 = 3
            r8 = r55
            X.0qQ.A0B(r8, r0)
            r0 = 17
            r3 = r71
            X.0qQ.A0B(r3, r0)
            r0 = 18
            r4 = r72
            X.0qQ.A0B(r4, r0)
            r0 = 19
            r2 = r73
            X.0qQ.A0B(r2, r0)
            r0 = 20
            r1 = r74
            X.0qQ.A0B(r1, r0)
            r39 = 0
            r34 = 0
            r35 = 10
            r48 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            r50 = 4629137466983448576(0x403e000000000000, double:30.0)
            r16 = r63
            r15 = r62
            r14 = r61
            r13 = r60
            r12 = r59
            r11 = r58
            r10 = r57
            r9 = r56
            r7 = r54
            r18 = r65
            r5 = r52
            r20 = r67
            r33 = r80
            r32 = r79
            r31 = r78
            r30 = r77
            r29 = r76
            r28 = r75
            r23 = r70
            r22 = r69
            r21 = r68
            r24 = r3
            r25 = r4
            r26 = r2
            r27 = r1
            r36 = r34
            r37 = r34
            r38 = r34
            r40 = r34
            r41 = r34
            r42 = r39
            r43 = r34
            r44 = r39
            r45 = r39
            r46 = r34
            r47 = r34
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r50)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.ConnectionConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, boolean, boolean, boolean, java.util.Set, java.util.Map, java.lang.String, java.util.concurrent.Executor, java.lang.Integer, int, int, int, int, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ConnectionConfig(java.lang.String r53, java.lang.String r54, java.lang.String r55, int r56, java.lang.String r57, java.lang.String r58, java.lang.String r59, java.lang.String r60, java.lang.String r61, int r62, long r63, long r65, java.lang.String r67, boolean r68, boolean r69, boolean r70, java.util.Set r71, java.util.Map r72, java.lang.String r73, java.util.concurrent.Executor r74, java.lang.Integer r75, int r76, int r77, int r78, int r79, int r80, int r81) {
        /*
            r52 = this;
            r0 = 1
            r6 = r53
            X.0qQ.A0B(r6, r0)
            r0 = 3
            r8 = r55
            X.0qQ.A0B(r8, r0)
            r0 = 17
            r3 = r71
            X.0qQ.A0B(r3, r0)
            r0 = 18
            r4 = r72
            X.0qQ.A0B(r4, r0)
            r0 = 19
            r2 = r73
            X.0qQ.A0B(r2, r0)
            r0 = 20
            r1 = r74
            X.0qQ.A0B(r1, r0)
            r39 = 0
            r35 = 10
            r36 = 0
            r48 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            r50 = 4629137466983448576(0x403e000000000000, double:30.0)
            r16 = r63
            r15 = r62
            r14 = r61
            r13 = r60
            r12 = r59
            r11 = r58
            r10 = r57
            r9 = r56
            r7 = r54
            r18 = r65
            r5 = r52
            r34 = r81
            r20 = r67
            r33 = r80
            r32 = r79
            r31 = r78
            r30 = r77
            r29 = r76
            r28 = r75
            r23 = r70
            r22 = r69
            r21 = r68
            r24 = r3
            r25 = r4
            r26 = r2
            r27 = r1
            r37 = r36
            r38 = r36
            r40 = r36
            r41 = r36
            r42 = r39
            r43 = r36
            r44 = r39
            r45 = r39
            r46 = r36
            r47 = r36
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r50)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.ConnectionConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, boolean, boolean, boolean, java.util.Set, java.util.Map, java.lang.String, java.util.concurrent.Executor, java.lang.Integer, int, int, int, int, int, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ConnectionConfig(java.lang.String r53, java.lang.String r54, java.lang.String r55, int r56, java.lang.String r57, java.lang.String r58, java.lang.String r59, java.lang.String r60, java.lang.String r61, int r62, long r63, long r65, java.lang.String r67, boolean r68, boolean r69, boolean r70, java.util.Set r71, java.util.Map r72, java.lang.String r73, java.util.concurrent.Executor r74, java.lang.Integer r75, int r76, int r77, int r78, int r79, int r80, int r81, int r82) {
        /*
            r52 = this;
            r0 = 1
            r6 = r53
            X.0qQ.A0B(r6, r0)
            r0 = 3
            r8 = r55
            X.0qQ.A0B(r8, r0)
            r0 = 17
            r4 = r71
            X.0qQ.A0B(r4, r0)
            r0 = 18
            r3 = r72
            X.0qQ.A0B(r3, r0)
            r0 = 19
            r2 = r73
            X.0qQ.A0B(r2, r0)
            r0 = 20
            r1 = r74
            X.0qQ.A0B(r1, r0)
            r39 = 0
            r36 = 0
            r48 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            r50 = 4629137466983448576(0x403e000000000000, double:30.0)
            r16 = r63
            r15 = r62
            r14 = r61
            r13 = r60
            r12 = r59
            r11 = r58
            r10 = r57
            r9 = r56
            r7 = r54
            r35 = r82
            r18 = r65
            r5 = r52
            r34 = r81
            r20 = r67
            r33 = r80
            r32 = r79
            r31 = r78
            r30 = r77
            r29 = r76
            r28 = r75
            r23 = r70
            r22 = r69
            r21 = r68
            r24 = r4
            r25 = r3
            r26 = r2
            r27 = r1
            r37 = r36
            r38 = r36
            r40 = r36
            r41 = r36
            r42 = r39
            r43 = r36
            r44 = r39
            r45 = r39
            r46 = r36
            r47 = r36
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r50)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.ConnectionConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, boolean, boolean, boolean, java.util.Set, java.util.Map, java.lang.String, java.util.concurrent.Executor, java.lang.Integer, int, int, int, int, int, int, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ConnectionConfig(java.lang.String r53, java.lang.String r54, java.lang.String r55, int r56, java.lang.String r57, java.lang.String r58, java.lang.String r59, java.lang.String r60, java.lang.String r61, int r62, long r63, long r65, java.lang.String r67, boolean r68, boolean r69, boolean r70, java.util.Set r71, java.util.Map r72, java.lang.String r73, java.util.concurrent.Executor r74, java.lang.Integer r75, int r76, int r77, int r78, int r79, int r80, int r81, int r82, boolean r83) {
        /*
            r52 = this;
            r0 = 1
            r6 = r53
            X.0qQ.A0B(r6, r0)
            r0 = 3
            r8 = r55
            X.0qQ.A0B(r8, r0)
            r0 = 17
            r4 = r71
            X.0qQ.A0B(r4, r0)
            r0 = 18
            r3 = r72
            X.0qQ.A0B(r3, r0)
            r0 = 19
            r2 = r73
            X.0qQ.A0B(r2, r0)
            r0 = 20
            r1 = r74
            X.0qQ.A0B(r1, r0)
            r39 = 0
            r37 = 0
            r48 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            r50 = 4629137466983448576(0x403e000000000000, double:30.0)
            r33 = r80
            r35 = r82
            r7 = r54
            r36 = r83
            r9 = r56
            r11 = r58
            r12 = r59
            r13 = r60
            r14 = r61
            r15 = r62
            r16 = r63
            r10 = r57
            r18 = r65
            r5 = r52
            r34 = r81
            r20 = r67
            r21 = r68
            r22 = r69
            r23 = r70
            r28 = r75
            r29 = r76
            r30 = r77
            r31 = r78
            r32 = r79
            r24 = r4
            r25 = r3
            r26 = r2
            r27 = r1
            r38 = r37
            r40 = r37
            r41 = r37
            r42 = r39
            r43 = r37
            r44 = r39
            r45 = r39
            r46 = r37
            r47 = r37
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r50)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.ConnectionConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, boolean, boolean, boolean, java.util.Set, java.util.Map, java.lang.String, java.util.concurrent.Executor, java.lang.Integer, int, int, int, int, int, int, int, boolean):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ConnectionConfig(java.lang.String r53, java.lang.String r54, java.lang.String r55, int r56, java.lang.String r57, java.lang.String r58, java.lang.String r59, java.lang.String r60, java.lang.String r61, int r62, long r63, long r65, java.lang.String r67, boolean r68, boolean r69, boolean r70, java.util.Set r71, java.util.Map r72, java.lang.String r73, java.util.concurrent.Executor r74, java.lang.Integer r75, int r76, int r77, int r78, int r79, int r80, int r81, int r82, boolean r83, boolean r84) {
        /*
            r52 = this;
            r0 = 1
            r6 = r53
            X.0qQ.A0B(r6, r0)
            r0 = 3
            r8 = r55
            X.0qQ.A0B(r8, r0)
            r0 = 17
            r4 = r71
            X.0qQ.A0B(r4, r0)
            r0 = 18
            r3 = r72
            X.0qQ.A0B(r3, r0)
            r0 = 19
            r2 = r73
            X.0qQ.A0B(r2, r0)
            r0 = 20
            r1 = r74
            X.0qQ.A0B(r1, r0)
            r39 = 0
            r38 = 0
            r48 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            r50 = 4629137466983448576(0x403e000000000000, double:30.0)
            r33 = r80
            r32 = r79
            r35 = r82
            r7 = r54
            r36 = r83
            r37 = r84
            r9 = r56
            r12 = r59
            r13 = r60
            r14 = r61
            r15 = r62
            r16 = r63
            r10 = r57
            r11 = r58
            r18 = r65
            r5 = r52
            r34 = r81
            r20 = r67
            r21 = r68
            r22 = r69
            r23 = r70
            r28 = r75
            r29 = r76
            r30 = r77
            r31 = r78
            r24 = r4
            r25 = r3
            r26 = r2
            r27 = r1
            r40 = r38
            r41 = r38
            r42 = r39
            r43 = r38
            r44 = r39
            r45 = r39
            r46 = r38
            r47 = r38
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r50)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.ConnectionConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, boolean, boolean, boolean, java.util.Set, java.util.Map, java.lang.String, java.util.concurrent.Executor, java.lang.Integer, int, int, int, int, int, int, int, boolean, boolean):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ConnectionConfig(java.lang.String r53, java.lang.String r54, java.lang.String r55, int r56, java.lang.String r57, java.lang.String r58, java.lang.String r59, java.lang.String r60, java.lang.String r61, int r62, long r63, long r65, java.lang.String r67, boolean r68, boolean r69, boolean r70, java.util.Set r71, java.util.Map r72, java.lang.String r73, java.util.concurrent.Executor r74, java.lang.Integer r75, int r76, int r77, int r78, int r79, int r80, int r81, int r82, boolean r83, boolean r84, boolean r85) {
        /*
            r52 = this;
            r0 = 1
            r6 = r53
            X.0qQ.A0B(r6, r0)
            r0 = 3
            r8 = r55
            X.0qQ.A0B(r8, r0)
            r0 = 17
            r4 = r71
            X.0qQ.A0B(r4, r0)
            r0 = 18
            r3 = r72
            X.0qQ.A0B(r3, r0)
            r0 = 19
            r2 = r73
            X.0qQ.A0B(r2, r0)
            r0 = 20
            r1 = r74
            X.0qQ.A0B(r1, r0)
            r39 = 0
            r40 = 0
            r48 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            r50 = 4629137466983448576(0x403e000000000000, double:30.0)
            r33 = r80
            r32 = r79
            r31 = r78
            r7 = r54
            r36 = r83
            r37 = r84
            r9 = r56
            r38 = r85
            r13 = r60
            r14 = r61
            r15 = r62
            r16 = r63
            r10 = r57
            r11 = r58
            r12 = r59
            r35 = r82
            r18 = r65
            r5 = r52
            r34 = r81
            r20 = r67
            r21 = r68
            r22 = r69
            r23 = r70
            r28 = r75
            r29 = r76
            r30 = r77
            r24 = r4
            r25 = r3
            r26 = r2
            r27 = r1
            r41 = r40
            r42 = r39
            r43 = r40
            r44 = r39
            r45 = r39
            r46 = r40
            r47 = r40
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r50)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.ConnectionConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, boolean, boolean, boolean, java.util.Set, java.util.Map, java.lang.String, java.util.concurrent.Executor, java.lang.Integer, int, int, int, int, int, int, int, boolean, boolean, boolean):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ConnectionConfig(java.lang.String r53, java.lang.String r54, java.lang.String r55, int r56, java.lang.String r57, java.lang.String r58, java.lang.String r59, java.lang.String r60, java.lang.String r61, int r62, long r63, long r65, java.lang.String r67, boolean r68, boolean r69, boolean r70, java.util.Set r71, java.util.Map r72, java.lang.String r73, java.util.concurrent.Executor r74, java.lang.Integer r75, int r76, int r77, int r78, int r79, int r80, int r81, int r82, boolean r83, boolean r84, boolean r85, com.facebook.mqtt.service.PersonalizationConfig r86) {
        /*
            r52 = this;
            r0 = 1
            r6 = r53
            X.0qQ.A0B(r6, r0)
            r0 = 3
            r8 = r55
            X.0qQ.A0B(r8, r0)
            r0 = 17
            r4 = r71
            X.0qQ.A0B(r4, r0)
            r0 = 18
            r3 = r72
            X.0qQ.A0B(r3, r0)
            r0 = 19
            r2 = r73
            X.0qQ.A0B(r2, r0)
            r0 = 20
            r1 = r74
            X.0qQ.A0B(r1, r0)
            r42 = 0
            r40 = 0
            r48 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            r50 = 4629137466983448576(0x403e000000000000, double:30.0)
            r33 = r80
            r32 = r79
            r31 = r78
            r30 = r77
            r37 = r84
            r9 = r56
            r38 = r85
            r14 = r61
            r15 = r62
            r16 = r63
            r10 = r57
            r39 = r86
            r36 = r83
            r7 = r54
            r11 = r58
            r12 = r59
            r13 = r60
            r35 = r82
            r18 = r65
            r5 = r52
            r34 = r81
            r20 = r67
            r21 = r68
            r22 = r69
            r23 = r70
            r28 = r75
            r29 = r76
            r24 = r4
            r25 = r3
            r26 = r2
            r27 = r1
            r41 = r40
            r43 = r40
            r44 = r42
            r45 = r42
            r46 = r40
            r47 = r40
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r50)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.ConnectionConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, boolean, boolean, boolean, java.util.Set, java.util.Map, java.lang.String, java.util.concurrent.Executor, java.lang.Integer, int, int, int, int, int, int, int, boolean, boolean, boolean, com.facebook.mqtt.service.PersonalizationConfig):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ConnectionConfig(java.lang.String r53, java.lang.String r54, java.lang.String r55, int r56, java.lang.String r57, java.lang.String r58, java.lang.String r59, java.lang.String r60, java.lang.String r61, int r62, long r63, long r65, java.lang.String r67, boolean r68, boolean r69, boolean r70, java.util.Set r71, java.util.Map r72, java.lang.String r73, java.util.concurrent.Executor r74, java.lang.Integer r75, int r76, int r77, int r78, int r79, int r80, int r81, int r82, boolean r83, boolean r84, boolean r85, com.facebook.mqtt.service.PersonalizationConfig r86, boolean r87) {
        /*
            r52 = this;
            r0 = 1
            r6 = r53
            X.0qQ.A0B(r6, r0)
            r0 = 3
            r8 = r55
            X.0qQ.A0B(r8, r0)
            r0 = 17
            r4 = r71
            X.0qQ.A0B(r4, r0)
            r0 = 18
            r3 = r72
            X.0qQ.A0B(r3, r0)
            r0 = 19
            r2 = r73
            X.0qQ.A0B(r2, r0)
            r0 = 20
            r1 = r74
            X.0qQ.A0B(r1, r0)
            r42 = 0
            r41 = 0
            r48 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            r50 = 4629137466983448576(0x403e000000000000, double:30.0)
            r33 = r80
            r32 = r79
            r31 = r78
            r30 = r77
            r29 = r76
            r9 = r56
            r38 = r85
            r15 = r62
            r16 = r63
            r10 = r57
            r39 = r86
            r36 = r83
            r7 = r54
            r11 = r58
            r40 = r87
            r37 = r84
            r12 = r59
            r13 = r60
            r14 = r61
            r35 = r82
            r18 = r65
            r5 = r52
            r34 = r81
            r20 = r67
            r21 = r68
            r22 = r69
            r23 = r70
            r28 = r75
            r24 = r4
            r25 = r3
            r26 = r2
            r27 = r1
            r43 = r41
            r44 = r42
            r45 = r42
            r46 = r41
            r47 = r41
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r50)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.ConnectionConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, boolean, boolean, boolean, java.util.Set, java.util.Map, java.lang.String, java.util.concurrent.Executor, java.lang.Integer, int, int, int, int, int, int, int, boolean, boolean, boolean, com.facebook.mqtt.service.PersonalizationConfig, boolean):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ConnectionConfig(java.lang.String r53, java.lang.String r54, java.lang.String r55, int r56, java.lang.String r57, java.lang.String r58, java.lang.String r59, java.lang.String r60, java.lang.String r61, int r62, long r63, long r65, java.lang.String r67, boolean r68, boolean r69, boolean r70, java.util.Set r71, java.util.Map r72, java.lang.String r73, java.util.concurrent.Executor r74, java.lang.Integer r75, int r76, int r77, int r78, int r79, int r80, int r81, int r82, boolean r83, boolean r84, boolean r85, com.facebook.mqtt.service.PersonalizationConfig r86, boolean r87, boolean r88) {
        /*
            r52 = this;
            r0 = 1
            r6 = r53
            X.0qQ.A0B(r6, r0)
            r0 = 3
            r8 = r55
            X.0qQ.A0B(r8, r0)
            r0 = 17
            r4 = r71
            X.0qQ.A0B(r4, r0)
            r0 = 18
            r3 = r72
            X.0qQ.A0B(r3, r0)
            r0 = 19
            r2 = r73
            X.0qQ.A0B(r2, r0)
            r0 = 20
            r1 = r74
            X.0qQ.A0B(r1, r0)
            r42 = 0
            r43 = 0
            r48 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            r50 = 4629137466983448576(0x403e000000000000, double:30.0)
            r33 = r80
            r32 = r79
            r31 = r78
            r30 = r77
            r29 = r76
            r28 = r75
            r16 = r63
            r10 = r57
            r39 = r86
            r36 = r83
            r7 = r54
            r11 = r58
            r40 = r87
            r37 = r84
            r12 = r59
            r41 = r88
            r38 = r85
            r9 = r56
            r13 = r60
            r14 = r61
            r15 = r62
            r35 = r82
            r18 = r65
            r5 = r52
            r34 = r81
            r20 = r67
            r21 = r68
            r22 = r69
            r23 = r70
            r24 = r4
            r25 = r3
            r26 = r2
            r27 = r1
            r44 = r42
            r45 = r42
            r46 = r43
            r47 = r43
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r50)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.ConnectionConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, boolean, boolean, boolean, java.util.Set, java.util.Map, java.lang.String, java.util.concurrent.Executor, java.lang.Integer, int, int, int, int, int, int, int, boolean, boolean, boolean, com.facebook.mqtt.service.PersonalizationConfig, boolean, boolean):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ConnectionConfig(java.lang.String r53, java.lang.String r54, java.lang.String r55, int r56, java.lang.String r57, java.lang.String r58, java.lang.String r59, java.lang.String r60, java.lang.String r61, int r62, long r63, long r65, java.lang.String r67, boolean r68, boolean r69, boolean r70, java.util.Set r71, java.util.Map r72, java.lang.String r73, java.util.concurrent.Executor r74, java.lang.Integer r75, int r76, int r77, int r78, int r79, int r80, int r81, int r82, boolean r83, boolean r84, boolean r85, com.facebook.mqtt.service.PersonalizationConfig r86, boolean r87, boolean r88, com.facebook.mqttbypass.IMqttBypassClientHolder r89, boolean r90, java.util.Map r91, java.lang.String r92, int r93, boolean r94, double r95) {
        /*
            r52 = this;
            r0 = 1
            r6 = r53
            X.0qQ.A0B(r6, r0)
            r0 = 3
            r8 = r55
            X.0qQ.A0B(r8, r0)
            r0 = 17
            r4 = r71
            X.0qQ.A0B(r4, r0)
            r0 = 18
            r3 = r72
            X.0qQ.A0B(r3, r0)
            r0 = 19
            r2 = r73
            X.0qQ.A0B(r2, r0)
            r0 = 20
            r1 = r74
            X.0qQ.A0B(r1, r0)
            r50 = 4629137466983448576(0x403e000000000000, double:30.0)
            r33 = r80
            r32 = r79
            r31 = r78
            r30 = r77
            r29 = r76
            r28 = r75
            r23 = r70
            r22 = r69
            r21 = r68
            r36 = r83
            r7 = r54
            r37 = r84
            r38 = r85
            r9 = r56
            r39 = r86
            r10 = r57
            r40 = r87
            r11 = r58
            r41 = r88
            r12 = r59
            r42 = r89
            r13 = r60
            r43 = r90
            r14 = r61
            r44 = r91
            r15 = r62
            r45 = r92
            r16 = r63
            r46 = r93
            r47 = r94
            r18 = r65
            r48 = r95
            r35 = r82
            r5 = r52
            r34 = r81
            r20 = r67
            r24 = r4
            r25 = r3
            r26 = r2
            r27 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r50)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.ConnectionConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, boolean, boolean, boolean, java.util.Set, java.util.Map, java.lang.String, java.util.concurrent.Executor, java.lang.Integer, int, int, int, int, int, int, int, boolean, boolean, boolean, com.facebook.mqtt.service.PersonalizationConfig, boolean, boolean, com.facebook.mqttbypass.IMqttBypassClientHolder, boolean, java.util.Map, java.lang.String, int, boolean, double):void");
    }

    public ConnectionConfig(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, int i2, long j, long j2, String str9, boolean z, boolean z2, boolean z3, Set set, Map map, String str10, Executor executor, Integer num, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z4, boolean z5, boolean z6, PersonalizationConfig personalizationConfig2, boolean z7, boolean z8, IMqttBypassClientHolder iMqttBypassClientHolder, boolean z9, Map map2, String str11, int i10, boolean z10, double d, double d2) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str3, 3);
        Set set2 = set;
        0qQ.A0B(set2, 17);
        Map map3 = map;
        0qQ.A0B(map3, 18);
        String str12 = str10;
        0qQ.A0B(str12, 19);
        Executor executor2 = executor;
        0qQ.A0B(executor2, 20);
        this.userId = str;
        this.password = str2;
        this.host = str3;
        this.port = i;
        this.userAgent = str4;
        this.deviceId = str5;
        this.clientType = str6;
        this.phpOverride = str7;
        this.appId = str8;
        this.initialNetworkState = i2;
        this.capabilities = j;
        this.endpointCapabilities = j2;
        this.regionHint = str9;
        this.qplEnabled = z;
        this.chatOnEnabled = z2;
        this.isAppInBackground = z3;
        this.subscribeTopics = set2;
        this.appSpecificInfo = map3;
        this.cacheDir = str12;
        this.callbackExecutor = executor2;
        this.msysThreadPriority = num;
        this.clientKeepAliveInSeconds = i3;
        this.clientKeepAliveBackgroundInSeconds = i4;
        this.clientKeepAliveTimeoutInSeconds = i5;
        this.connectTimeoutInSeconds = i6;
        this.publishTimeoutInSeconds = i7;
        this.preemptivePublishTimeoutInSeconds = i8;
        this.maxServerUnavailableBeforeBackoff = i9;
        this.networkInterfaceHandlingCellularToWifiEnabled = z4;
        this.networkInterfaceHandlingWifiToCellularEnabled = z5;
        this.improvedStateReportEnabled = z6;
        this.personalizationConfig = personalizationConfig2;
        this.enableDeferredDisconnect = z7;
        this.enableDeferredDisconnectOnEmptyRcv = z8;
        this.mqttBypassClientHolder = iMqttBypassClientHolder;
        this.autoSubscribeOnReconnect = z9;
        this.assetIds = map2;
        this.fallbackHost = str11;
        this.numFailuresForFallback = i10;
        this.highPriPendingPublishQueueEnabled = z10;
        this.initialReconnectBackoffInSeconds = d;
        this.maxReconnectBackoffInSeconds = d2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ConnectionConfig(java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, int r13, long r14, long r16, java.lang.String r18, boolean r19, boolean r20, boolean r21, java.util.Set r22, java.util.Map r23, java.lang.String r24, java.util.concurrent.Executor r25, java.lang.Integer r26, int r27, int r28, int r29, int r30, int r31, int r32, int r33, boolean r34, boolean r35, boolean r36, com.facebook.mqtt.service.PersonalizationConfig r37, boolean r38, boolean r39, com.facebook.mqttbypass.IMqttBypassClientHolder r40, boolean r41, java.util.Map r42, java.lang.String r43, int r44, boolean r45, double r46, double r48, int r50, int r51, kotlin.jvm.internal.DefaultConstructorMarker r52) {
        /*
            r3 = this;
            r0 = 2097152(0x200000, float:2.938736E-39)
            r0 = r50 & r0
            if (r0 == 0) goto L_0x0008
            r27 = 60
        L_0x0008:
            r0 = 4194304(0x400000, float:5.877472E-39)
            r0 = r50 & r0
            if (r0 == 0) goto L_0x0010
            r28 = 284(0x11c, float:3.98E-43)
        L_0x0010:
            r0 = 8388608(0x800000, float:1.17549435E-38)
            r0 = r50 & r0
            if (r0 == 0) goto L_0x0018
            r29 = 6
        L_0x0018:
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r0 = r50 & r0
            if (r0 == 0) goto L_0x0020
            r30 = 10
        L_0x0020:
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r0 = r50 & r0
            if (r0 == 0) goto L_0x0028
            r31 = 10
        L_0x0028:
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r0 = r50 & r0
            if (r0 == 0) goto L_0x0030
            r32 = 0
        L_0x0030:
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r0 = r50 & r0
            if (r0 == 0) goto L_0x0038
            r33 = 10
        L_0x0038:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r0 = r50 & r0
            if (r0 == 0) goto L_0x0040
            r34 = 0
        L_0x0040:
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r50 & r0
            if (r0 == 0) goto L_0x0048
            r35 = 0
        L_0x0048:
            r0 = 1073741824(0x40000000, float:2.0)
            r0 = r50 & r0
            if (r0 == 0) goto L_0x0050
            r36 = 0
        L_0x0050:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r50 = r50 & r0
            r2 = 0
            if (r50 == 0) goto L_0x0059
            r37 = r2
        L_0x0059:
            r0 = r51
            r1 = r51 & 1
            if (r1 == 0) goto L_0x0061
            r38 = 0
        L_0x0061:
            r1 = r51 & 2
            if (r1 == 0) goto L_0x0067
            r39 = 0
        L_0x0067:
            r1 = r51 & 4
            if (r1 == 0) goto L_0x006d
            r40 = r2
        L_0x006d:
            r1 = r51 & 8
            if (r1 == 0) goto L_0x0073
            r41 = 0
        L_0x0073:
            r1 = r51 & 16
            if (r1 == 0) goto L_0x0079
            r42 = r2
        L_0x0079:
            r1 = r51 & 32
            if (r1 == 0) goto L_0x007f
            r43 = r2
        L_0x007f:
            r1 = r51 & 64
            if (r1 == 0) goto L_0x0085
            r44 = 0
        L_0x0085:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x008b
            r45 = 0
        L_0x008b:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0094
            r46 = 4596373779694328218(0x3fc999999999999a, double:0.2)
        L_0x0094:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x009a
            r48 = 4629137466983448576(0x403e000000000000, double:30.0)
        L_0x009a:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r48)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.ConnectionConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, boolean, boolean, boolean, java.util.Set, java.util.Map, java.lang.String, java.util.concurrent.Executor, java.lang.Integer, int, int, int, int, int, int, int, boolean, boolean, boolean, com.facebook.mqtt.service.PersonalizationConfig, boolean, boolean, com.facebook.mqttbypass.IMqttBypassClientHolder, boolean, java.util.Map, java.lang.String, int, boolean, double, double, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
