package com.facebook.wearable.datax.util;

import X.002;
import X.DbT;

public final class MessageInfo {
    public final int channelId;
    public final boolean complete;
    public final int errorId;
    public final boolean hasError;
    public final boolean hasExtension;
    public final boolean isClosed;
    public final int len;
    public final int messageType;
    public final int serviceId;
    public final boolean setService;
    public final boolean setType;
    public final boolean valid;

    public final int getChannelId() {
        return this.channelId;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final int getErrorId() {
        return this.errorId;
    }

    public final boolean getHasError() {
        return this.hasError;
    }

    public final boolean getHasExtension() {
        return this.hasExtension;
    }

    public final int getLen() {
        return this.len;
    }

    public final int getMessageType() {
        return this.messageType;
    }

    public final int getServiceId() {
        return this.serviceId;
    }

    public final boolean getSetService() {
        return this.setService;
    }

    public final boolean getSetType() {
        return this.setType;
    }

    public final boolean getValid() {
        return this.valid;
    }

    public final boolean isClosed() {
        return this.isClosed;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(10);
        sb.append(002.A1D("\tValid: ", this.valid));
        sb.append(10);
        sb.append(002.A1D("\tComplete: ", this.complete));
        sb.append(10);
        sb.append(002.A1D("\tClosed: ", this.isClosed));
        sb.append(10);
        sb.append(002.A0O("\tChannel Id: ", this.channelId));
        sb.append(10);
        sb.append(002.A0O("\tService: ", this.serviceId));
        sb.append(10);
        if (this.hasError) {
            sb.append(002.A0O("\tError Id: ", this.errorId));
            sb.append(10);
        }
        sb.append(002.A0O("\tMessage Type: ", this.messageType));
        sb.append(10);
        sb.append(002.A0O("\tLength: ", this.len));
        sb.append(10);
        return DbT.A10(sb);
    }

    public MessageInfo(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, int i2, int i3, int i4, int i5) {
        this.valid = z;
        this.complete = z2;
        this.hasExtension = z3;
        this.setService = z4;
        this.setType = z5;
        this.hasError = z6;
        this.isClosed = z7;
        this.len = i;
        this.channelId = i2;
        this.serviceId = i3;
        this.messageType = i4;
        this.errorId = i5;
    }
}
