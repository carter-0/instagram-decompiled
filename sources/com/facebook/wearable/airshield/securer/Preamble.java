package com.facebook.wearable.airshield.securer;

import X.0dV;
import X.0qQ;
import X.C16798V6f;
import X.V6U;
import X.V6V;
import com.facebook.jni.HybridData;
import com.facebook.wearable.airshield.security.Hash;
import com.facebook.wearable.datax.Connection;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class Preamble {
    public static final V6U Companion = new Object();
    public Connection connection;
    public final Object connectionLock;
    public final HybridData mHybridData;

    private final native void acceptAuthenticationNative(byte[] bArr, boolean z);

    private final native boolean asMainNative();

    private final native long connectionNative();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    private final native void rejectAuthenticationNative(int i);

    private final native byte[] rxChallengeNative();

    private final native int streamIdNative();

    private final native byte[] txChallengeNative();

    public final void acceptAuthentication(byte[] bArr, boolean z) {
        0qQ.A0B(bArr, 0);
        acceptAuthenticationNative(bArr, z);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.V6U, java.lang.Object] */
    static {
        0dV.A0C("airshield_light_mbed_jni");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Preamble(HybridData hybridData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : hybridData);
    }

    private final Connection createConnection() {
        C16798V6f v6f = Connection.Companion;
        return new Connection(connectionNative());
    }

    public final Connection getConnection() {
        Connection connection2;
        synchronized (this.connectionLock) {
            connection2 = this.connection;
            if (connection2 == null) {
                connection2 = createConnection();
                this.connection = connection2;
            }
        }
        return connection2;
    }

    public final Hash getRxChallenge() {
        V6V v6v = Hash.Companion;
        byte[] rxChallengeNative = rxChallengeNative();
        0qQ.A0B(rxChallengeNative, 0);
        Hash hash = new Hash((HybridData) null);
        hash.setRaw(rxChallengeNative);
        return hash;
    }

    public final Hash getTxChallenge() {
        V6V v6v = Hash.Companion;
        byte[] txChallengeNative = txChallengeNative();
        0qQ.A0B(txChallengeNative, 0);
        Hash hash = new Hash((HybridData) null);
        hash.setRaw(txChallengeNative);
        return hash;
    }

    public final boolean getAsMain() {
        return asMainNative();
    }

    public final int getStreamId() {
        return streamIdNative();
    }

    public final void rejectAuthentication(int i) {
        rejectAuthenticationNative(i);
    }

    public Preamble(HybridData hybridData) {
        this.connectionLock = new Object();
        this.mHybridData = hybridData == null ? initHybrid() : hybridData;
    }
}
