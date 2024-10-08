package X;

import com.instagram.realtimeclient.DirectRealtimePayload;

public final class NHV extends 1XP {
    public DirectRealtimePayload A00;
    public String A01;

    public final String getClientFacingErrorMessage() {
        DirectRealtimePayload directRealtimePayload = this.A00;
        if (directRealtimePayload != null) {
            return directRealtimePayload.clientFacingErrorMessage;
        }
        return this.mClientFacingErrorMessage;
    }

    public final String getErrorCode() {
        DirectRealtimePayload directRealtimePayload = this.A00;
        if (directRealtimePayload != null) {
            return directRealtimePayload.errorCode;
        }
        return null;
    }

    public final String getErrorMessage() {
        DirectRealtimePayload directRealtimePayload = this.A00;
        if (directRealtimePayload == null) {
            return this.mErrorMessage;
        }
        return directRealtimePayload.message;
    }
}
