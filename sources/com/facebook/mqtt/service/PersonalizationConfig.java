package com.facebook.mqtt.service;

import X.AnonymousClass0T0;
import X.C249703kE;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikConstants;

public final class PersonalizationConfig extends AnonymousClass0T0 {
    public final boolean connectPersonalizationEnabled;
    public final int highSpeedConnackLatencyInMs;
    public final int highSpeedConnectTimeoutInSeconds;
    public final int highSpeedPingIntervalInSeconds;
    public final int highSpeedPingLatencyInMs;
    public final int highSpeedPingTimeoutInSeconds;
    public final int highSpeedPreemptivePublishTimeoutInSeconds;
    public final int highSpeedPublishTimeoutInSeconds;
    public final int lowSpeedConnackLatencyInMs;
    public final int lowSpeedConnectTimeoutInSeconds;
    public final int lowSpeedPingIntervalInSeconds;
    public final int lowSpeedPingLatencyInMs;
    public final int lowSpeedPingTimeoutInSeconds;
    public final int lowSpeedPreemptivePublishTimeoutInSeconds;
    public final int lowSpeedPublishTimeoutInSeconds;
    public final int midSpeedConnackLatencyInMs;
    public final int midSpeedConnectTimeoutInSeconds;
    public final int midSpeedPingIntervalInSeconds;
    public final int midSpeedPingLatencyInMs;
    public final int midSpeedPingTimeoutInSeconds;
    public final int midSpeedPreemptivePublishTimeoutInSeconds;
    public final int midSpeedPublishTimeoutInSeconds;
    public final boolean personalizationEnabled;
    public final boolean storePersonalizationClassEnabled;

    public final boolean component1() {
        return this.personalizationEnabled;
    }

    public final int component10() {
        return this.highSpeedConnackLatencyInMs;
    }

    public final int component11() {
        return this.midSpeedConnackLatencyInMs;
    }

    public final int component12() {
        return this.lowSpeedConnackLatencyInMs;
    }

    public final int component13() {
        return this.highSpeedPingLatencyInMs;
    }

    public final int component14() {
        return this.midSpeedPingLatencyInMs;
    }

    public final int component15() {
        return this.lowSpeedPingLatencyInMs;
    }

    public final int component16() {
        return this.highSpeedPingIntervalInSeconds;
    }

    public final int component17() {
        return this.midSpeedPingIntervalInSeconds;
    }

    public final int component18() {
        return this.lowSpeedPingIntervalInSeconds;
    }

    public final int component19() {
        return this.highSpeedPingTimeoutInSeconds;
    }

    public final boolean component2() {
        return this.connectPersonalizationEnabled;
    }

    public final int component20() {
        return this.midSpeedPingTimeoutInSeconds;
    }

    public final int component21() {
        return this.lowSpeedPingTimeoutInSeconds;
    }

    public final int component22() {
        return this.highSpeedConnectTimeoutInSeconds;
    }

    public final int component23() {
        return this.midSpeedConnectTimeoutInSeconds;
    }

    public final int component24() {
        return this.lowSpeedConnectTimeoutInSeconds;
    }

    public final boolean component3() {
        return this.storePersonalizationClassEnabled;
    }

    public final int component4() {
        return this.highSpeedPreemptivePublishTimeoutInSeconds;
    }

    public final int component5() {
        return this.midSpeedPreemptivePublishTimeoutInSeconds;
    }

    public final int component6() {
        return this.lowSpeedPreemptivePublishTimeoutInSeconds;
    }

    public final int component7() {
        return this.highSpeedPublishTimeoutInSeconds;
    }

    public final int component8() {
        return this.midSpeedPublishTimeoutInSeconds;
    }

    public final int component9() {
        return this.lowSpeedPublishTimeoutInSeconds;
    }

    public final PersonalizationConfig copy(boolean z, boolean z2, boolean z3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21) {
        return new PersonalizationConfig(z, z2, z3, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PersonalizationConfig(personalizationEnabled=");
        sb.append(this.personalizationEnabled);
        sb.append(", connectPersonalizationEnabled=");
        sb.append(this.connectPersonalizationEnabled);
        sb.append(", storePersonalizationClassEnabled=");
        sb.append(this.storePersonalizationClassEnabled);
        sb.append(", highSpeedPreemptivePublishTimeoutInSeconds=");
        sb.append(this.highSpeedPreemptivePublishTimeoutInSeconds);
        sb.append(", midSpeedPreemptivePublishTimeoutInSeconds=");
        sb.append(this.midSpeedPreemptivePublishTimeoutInSeconds);
        sb.append(", lowSpeedPreemptivePublishTimeoutInSeconds=");
        sb.append(this.lowSpeedPreemptivePublishTimeoutInSeconds);
        sb.append(", highSpeedPublishTimeoutInSeconds=");
        sb.append(this.highSpeedPublishTimeoutInSeconds);
        sb.append(", midSpeedPublishTimeoutInSeconds=");
        sb.append(this.midSpeedPublishTimeoutInSeconds);
        sb.append(", lowSpeedPublishTimeoutInSeconds=");
        sb.append(this.lowSpeedPublishTimeoutInSeconds);
        sb.append(", highSpeedConnackLatencyInMs=");
        sb.append(this.highSpeedConnackLatencyInMs);
        sb.append(", midSpeedConnackLatencyInMs=");
        sb.append(this.midSpeedConnackLatencyInMs);
        sb.append(", lowSpeedConnackLatencyInMs=");
        sb.append(this.lowSpeedConnackLatencyInMs);
        sb.append(", highSpeedPingLatencyInMs=");
        sb.append(this.highSpeedPingLatencyInMs);
        sb.append(", midSpeedPingLatencyInMs=");
        sb.append(this.midSpeedPingLatencyInMs);
        sb.append(", lowSpeedPingLatencyInMs=");
        sb.append(this.lowSpeedPingLatencyInMs);
        sb.append(", highSpeedPingIntervalInSeconds=");
        sb.append(this.highSpeedPingIntervalInSeconds);
        sb.append(", midSpeedPingIntervalInSeconds=");
        sb.append(this.midSpeedPingIntervalInSeconds);
        sb.append(", lowSpeedPingIntervalInSeconds=");
        sb.append(this.lowSpeedPingIntervalInSeconds);
        sb.append(", highSpeedPingTimeoutInSeconds=");
        sb.append(this.highSpeedPingTimeoutInSeconds);
        sb.append(", midSpeedPingTimeoutInSeconds=");
        sb.append(this.midSpeedPingTimeoutInSeconds);
        sb.append(", lowSpeedPingTimeoutInSeconds=");
        sb.append(this.lowSpeedPingTimeoutInSeconds);
        sb.append(", highSpeedConnectTimeoutInSeconds=");
        sb.append(this.highSpeedConnectTimeoutInSeconds);
        sb.append(", midSpeedConnectTimeoutInSeconds=");
        sb.append(this.midSpeedConnectTimeoutInSeconds);
        sb.append(", lowSpeedConnectTimeoutInSeconds=");
        sb.append(this.lowSpeedConnectTimeoutInSeconds);
        sb.append(')');
        return sb.toString();
    }

    public final boolean getConnectPersonalizationEnabled() {
        return this.connectPersonalizationEnabled;
    }

    public final int getHighSpeedConnackLatencyInMs() {
        return this.highSpeedConnackLatencyInMs;
    }

    public final int getHighSpeedConnectTimeoutInSeconds() {
        return this.highSpeedConnectTimeoutInSeconds;
    }

    public final int getHighSpeedPingIntervalInSeconds() {
        return this.highSpeedPingIntervalInSeconds;
    }

    public final int getHighSpeedPingLatencyInMs() {
        return this.highSpeedPingLatencyInMs;
    }

    public final int getHighSpeedPingTimeoutInSeconds() {
        return this.highSpeedPingTimeoutInSeconds;
    }

    public final int getHighSpeedPreemptivePublishTimeoutInSeconds() {
        return this.highSpeedPreemptivePublishTimeoutInSeconds;
    }

    public final int getHighSpeedPublishTimeoutInSeconds() {
        return this.highSpeedPublishTimeoutInSeconds;
    }

    public final int getLowSpeedConnackLatencyInMs() {
        return this.lowSpeedConnackLatencyInMs;
    }

    public final int getLowSpeedConnectTimeoutInSeconds() {
        return this.lowSpeedConnectTimeoutInSeconds;
    }

    public final int getLowSpeedPingIntervalInSeconds() {
        return this.lowSpeedPingIntervalInSeconds;
    }

    public final int getLowSpeedPingLatencyInMs() {
        return this.lowSpeedPingLatencyInMs;
    }

    public final int getLowSpeedPingTimeoutInSeconds() {
        return this.lowSpeedPingTimeoutInSeconds;
    }

    public final int getLowSpeedPreemptivePublishTimeoutInSeconds() {
        return this.lowSpeedPreemptivePublishTimeoutInSeconds;
    }

    public final int getLowSpeedPublishTimeoutInSeconds() {
        return this.lowSpeedPublishTimeoutInSeconds;
    }

    public final int getMidSpeedConnackLatencyInMs() {
        return this.midSpeedConnackLatencyInMs;
    }

    public final int getMidSpeedConnectTimeoutInSeconds() {
        return this.midSpeedConnectTimeoutInSeconds;
    }

    public final int getMidSpeedPingIntervalInSeconds() {
        return this.midSpeedPingIntervalInSeconds;
    }

    public final int getMidSpeedPingLatencyInMs() {
        return this.midSpeedPingLatencyInMs;
    }

    public final int getMidSpeedPingTimeoutInSeconds() {
        return this.midSpeedPingTimeoutInSeconds;
    }

    public final int getMidSpeedPreemptivePublishTimeoutInSeconds() {
        return this.midSpeedPreemptivePublishTimeoutInSeconds;
    }

    public final int getMidSpeedPublishTimeoutInSeconds() {
        return this.midSpeedPublishTimeoutInSeconds;
    }

    public final boolean getPersonalizationEnabled() {
        return this.personalizationEnabled;
    }

    public final boolean getStorePersonalizationClassEnabled() {
        return this.storePersonalizationClassEnabled;
    }

    public PersonalizationConfig(boolean z, boolean z2, boolean z3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21) {
        this.personalizationEnabled = z;
        this.connectPersonalizationEnabled = z2;
        this.storePersonalizationClassEnabled = z3;
        this.highSpeedPreemptivePublishTimeoutInSeconds = i;
        this.midSpeedPreemptivePublishTimeoutInSeconds = i2;
        this.lowSpeedPreemptivePublishTimeoutInSeconds = i3;
        this.highSpeedPublishTimeoutInSeconds = i4;
        this.midSpeedPublishTimeoutInSeconds = i5;
        this.lowSpeedPublishTimeoutInSeconds = i6;
        this.highSpeedConnackLatencyInMs = i7;
        this.midSpeedConnackLatencyInMs = i8;
        this.lowSpeedConnackLatencyInMs = i9;
        this.highSpeedPingLatencyInMs = i10;
        this.midSpeedPingLatencyInMs = i11;
        this.lowSpeedPingLatencyInMs = i12;
        this.highSpeedPingIntervalInSeconds = i13;
        this.midSpeedPingIntervalInSeconds = i14;
        this.lowSpeedPingIntervalInSeconds = i15;
        this.highSpeedPingTimeoutInSeconds = i16;
        this.midSpeedPingTimeoutInSeconds = i17;
        this.lowSpeedPingTimeoutInSeconds = i18;
        this.highSpeedConnectTimeoutInSeconds = i19;
        this.midSpeedConnectTimeoutInSeconds = i20;
        this.lowSpeedConnectTimeoutInSeconds = i21;
    }

    public static /* synthetic */ PersonalizationConfig copy$default(PersonalizationConfig personalizationConfig, boolean z, boolean z2, boolean z3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, Object obj) {
        int i23 = i21;
        int i24 = i20;
        int i25 = i19;
        int i26 = i18;
        int i27 = i17;
        int i28 = i16;
        int i29 = i12;
        int i30 = i22;
        int i31 = i11;
        boolean z4 = z;
        boolean z5 = z2;
        int i32 = i13;
        boolean z6 = z3;
        int i33 = i;
        int i34 = i2;
        int i35 = i3;
        int i36 = i14;
        int i37 = i4;
        int i38 = i5;
        int i39 = i6;
        int i40 = i7;
        int i41 = i15;
        int i42 = i8;
        int i43 = i9;
        int i44 = i10;
        PersonalizationConfig personalizationConfig2 = personalizationConfig;
        if ((i22 & 1) != 0) {
            z4 = personalizationConfig2.personalizationEnabled;
        }
        if ((i22 & 2) != 0) {
            z5 = personalizationConfig2.connectPersonalizationEnabled;
        }
        if ((i22 & 4) != 0) {
            z6 = personalizationConfig2.storePersonalizationClassEnabled;
        }
        if ((i22 & 8) != 0) {
            i33 = personalizationConfig2.highSpeedPreemptivePublishTimeoutInSeconds;
        }
        if ((i22 & 16) != 0) {
            i34 = personalizationConfig2.midSpeedPreemptivePublishTimeoutInSeconds;
        }
        if ((i22 & 32) != 0) {
            i35 = personalizationConfig2.lowSpeedPreemptivePublishTimeoutInSeconds;
        }
        if ((i22 & 64) != 0) {
            i37 = personalizationConfig2.highSpeedPublishTimeoutInSeconds;
        }
        if ((i30 & 128) != 0) {
            i38 = personalizationConfig2.midSpeedPublishTimeoutInSeconds;
        }
        if ((i30 & 256) != 0) {
            i39 = personalizationConfig2.lowSpeedPublishTimeoutInSeconds;
        }
        if ((i30 & 512) != 0) {
            i40 = personalizationConfig2.highSpeedConnackLatencyInMs;
        }
        if ((i30 & 1024) != 0) {
            i42 = personalizationConfig2.midSpeedConnackLatencyInMs;
        }
        if ((i30 & C249703kE.FLAG_MOVED) != 0) {
            i43 = personalizationConfig2.lowSpeedConnackLatencyInMs;
        }
        if ((i30 & 4096) != 0) {
            i44 = personalizationConfig2.highSpeedPingLatencyInMs;
        }
        if ((i30 & 8192) != 0) {
            i31 = personalizationConfig2.midSpeedPingLatencyInMs;
        }
        if ((i30 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            i29 = personalizationConfig2.lowSpeedPingLatencyInMs;
        }
        if ((i22 & Constants.LOAD_RESULT_PGO) != 0) {
            i32 = personalizationConfig2.highSpeedPingIntervalInSeconds;
        }
        if ((i22 & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0) {
            i36 = personalizationConfig2.midSpeedPingIntervalInSeconds;
        }
        if ((i22 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0) {
            i41 = personalizationConfig2.lowSpeedPingIntervalInSeconds;
        }
        if ((i22 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
            i28 = personalizationConfig2.highSpeedPingTimeoutInSeconds;
        }
        if ((i22 & Constants.LOAD_RESULT_WITH_VDEX_ODEX) != 0) {
            i27 = personalizationConfig2.midSpeedPingTimeoutInSeconds;
        }
        if ((i22 & Constants.LOAD_RESULT_NEED_REOPTIMIZATION) != 0) {
            i26 = personalizationConfig2.lowSpeedPingTimeoutInSeconds;
        }
        if ((i22 & 2097152) != 0) {
            i25 = personalizationConfig2.highSpeedConnectTimeoutInSeconds;
        }
        if ((i22 & 4194304) != 0) {
            i24 = personalizationConfig2.midSpeedConnectTimeoutInSeconds;
        }
        if ((i22 & DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE) != 0) {
            i23 = personalizationConfig2.lowSpeedConnectTimeoutInSeconds;
        }
        int i45 = i39;
        int i46 = i40;
        int i47 = i42;
        return new PersonalizationConfig(z4, z5, z6, i33, i34, i35, i37, i38, i45, i46, i47, i43, i44, i31, i29, i32, i36, i41, i28, i27, i26, i25, i24, i23);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PersonalizationConfig(boolean r27, boolean r28, boolean r29, int r30, int r31, int r32, int r33, int r34, int r35, int r36, int r37, int r38, int r39, int r40, int r41, int r42, int r43, int r44, int r45, int r46, int r47, int r48, int r49, int r50, int r51, kotlin.jvm.internal.DefaultConstructorMarker r52) {
        /*
            r26 = this;
            r25 = r50
            r0 = r51
            r24 = r49
            r23 = r48
            r22 = r47
            r21 = r46
            r20 = r45
            r19 = r44
            r18 = r43
            r17 = r42
            r16 = r41
            r2 = r27
            r15 = r40
            r3 = r28
            r4 = r29
            r5 = r30
            r6 = r31
            r8 = r33
            r9 = r34
            r10 = r35
            r11 = r36
            r12 = r37
            r13 = r38
            r14 = r39
            r1 = r51 & 1
            if (r1 == 0) goto L_0x0035
            r2 = 0
        L_0x0035:
            r1 = r51 & 2
            if (r1 == 0) goto L_0x003a
            r3 = 0
        L_0x003a:
            r1 = r51 & 4
            if (r1 == 0) goto L_0x003f
            r4 = 0
        L_0x003f:
            r1 = r51 & 8
            r7 = 4
            if (r1 == 0) goto L_0x0045
            r5 = 4
        L_0x0045:
            r1 = r51 & 16
            if (r1 == 0) goto L_0x004a
            r6 = 4
        L_0x004a:
            r1 = r51 & 32
            if (r1 != 0) goto L_0x0050
            r7 = r32
        L_0x0050:
            r1 = r51 & 64
            if (r1 == 0) goto L_0x0055
            r8 = 0
        L_0x0055:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x005a
            r9 = 0
        L_0x005a:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x005f
            r10 = 0
        L_0x005f:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0064
            r11 = 0
        L_0x0064:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0069
            r12 = 0
        L_0x0069:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x006e
            r13 = 0
        L_0x006e:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0073
            r14 = 0
        L_0x0073:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0078
            r15 = 0
        L_0x0078:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x007e
            r16 = 0
        L_0x007e:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r51 & r1
            if (r1 == 0) goto L_0x0087
            r17 = 0
        L_0x0087:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r51 & r1
            if (r1 == 0) goto L_0x008f
            r18 = 0
        L_0x008f:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r51 & r1
            if (r1 == 0) goto L_0x0097
            r19 = 0
        L_0x0097:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r51 & r1
            if (r1 == 0) goto L_0x009f
            r20 = 0
        L_0x009f:
            r1 = 524288(0x80000, float:7.34684E-40)
            r1 = r51 & r1
            if (r1 == 0) goto L_0x00a7
            r21 = 0
        L_0x00a7:
            r1 = 1048576(0x100000, float:1.469368E-39)
            r1 = r51 & r1
            if (r1 == 0) goto L_0x00af
            r22 = 0
        L_0x00af:
            r1 = 2097152(0x200000, float:2.938736E-39)
            r1 = r51 & r1
            if (r1 == 0) goto L_0x00b7
            r23 = 0
        L_0x00b7:
            r1 = 4194304(0x400000, float:5.877472E-39)
            r1 = r51 & r1
            if (r1 == 0) goto L_0x00bf
            r24 = 0
        L_0x00bf:
            r1 = 8388608(0x800000, float:1.17549435E-38)
            r0 = r51 & r1
            if (r0 == 0) goto L_0x00c7
            r25 = 0
        L_0x00c7:
            r1 = r26
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.PersonalizationConfig.<init>(boolean, boolean, boolean, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public PersonalizationConfig() {
        this(false, false, false, 4, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
    }
}
