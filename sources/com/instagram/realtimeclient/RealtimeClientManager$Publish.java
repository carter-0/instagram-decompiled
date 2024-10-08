package com.instagram.realtimeclient;

import X.AnonymousClass46Y;
import X.C13775Tgq;

public class RealtimeClientManager$Publish {
    public final C13775Tgq mCompletionCallacks;
    public final byte[] mPayload;
    public final AnonymousClass46Y mQos;
    public final String mTopicName;

    public RealtimeClientManager$Publish(String str, byte[] bArr, AnonymousClass46Y r3, C13775Tgq tgq) {
        this.mTopicName = str;
        this.mPayload = bArr;
        this.mQos = r3;
        this.mCompletionCallacks = tgq;
    }
}
