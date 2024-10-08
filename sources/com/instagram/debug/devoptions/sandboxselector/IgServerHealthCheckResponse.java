package com.instagram.debug.devoptions.sandboxselector;

import X.1XP;

public final class IgServerHealthCheckResponse extends 1XP {
    public boolean isOk() {
        return true;
    }

    public IgServerHealthCheckResponse(int i) {
        this.mStatusCode = i;
    }
}
