package com.facebook.assistant.stella.ipc.common.request;

import X.C68378NEe;
import com.google.common.collect.ImmutableMap;

public abstract class IpcRequest {
    public final C68378NEe A00;
    public final ImmutableMap A01;

    public IpcRequest(C68378NEe nEe, ImmutableMap immutableMap) {
        this.A01 = immutableMap;
        this.A00 = nEe;
    }
}
