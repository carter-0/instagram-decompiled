package X;

import com.instagram.realtimeclient.DirectRealtimePayload;

public final class NHZ extends 1XP implements C74353PtT {
    public DirectRealtimePayload A00;

    public final String BJR() {
        DirectRealtimePayload directRealtimePayload = this.A00;
        if (directRealtimePayload != null) {
            String str = directRealtimePayload.itemId;
            0qQ.A06(str);
            return str;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final boolean getCanSeeBroadcastChats() {
        DirectRealtimePayload directRealtimePayload = this.A00;
        if (directRealtimePayload != null) {
            return directRealtimePayload.canSeeBroadcastChats;
        }
        return this.mCanSeeBroadcastChats;
    }

    public final boolean getCanSeeNotes() {
        DirectRealtimePayload directRealtimePayload = this.A00;
        if (directRealtimePayload != null) {
            return directRealtimePayload.canSeeNotes;
        }
        return this.mCanSeeNotes;
    }

    public final String getClientFacingErrorMessage() {
        String str;
        DirectRealtimePayload directRealtimePayload = this.A00;
        if (directRealtimePayload == null || (str = directRealtimePayload.clientFacingErrorMessage) == null) {
            return this.mClientFacingErrorMessage;
        }
        return str;
    }

    public final String getErrorCode() {
        String str;
        DirectRealtimePayload directRealtimePayload = this.A00;
        if (directRealtimePayload == null || (str = directRealtimePayload.errorCode) == null) {
            return this.mErrorCode;
        }
        return str;
    }

    public final String getErrorMessage() {
        String str;
        DirectRealtimePayload directRealtimePayload = this.A00;
        if (directRealtimePayload == null || (str = directRealtimePayload.message) == null) {
            return this.mErrorMessage;
        }
        return str;
    }

    public final boolean isEpdError() {
        DirectRealtimePayload directRealtimePayload = this.A00;
        if (directRealtimePayload != null) {
            return directRealtimePayload.isEpdError;
        }
        return this.mIsEpdError;
    }
}
