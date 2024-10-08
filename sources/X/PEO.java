package X;

import com.instagram.realtimeclient.DirectRealtimePayload;

public final class PEO implements C74342PtI {
    public final C270214gN AWW(AnonymousClass1XT r18, String str) {
        C254403sQ r3;
        DirectRealtimePayload directRealtimePayload;
        AnonymousClass1XT r2 = r18;
        int statusCode = r2.getStatusCode();
        String errorMessage = r2.getErrorMessage();
        String clientFacingErrorMessage = r2.getClientFacingErrorMessage();
        boolean isEpdError = r2.isEpdError();
        if (!(r2 instanceof NHZ) || (directRealtimePayload = ((NHZ) r2).A00) == null) {
            r3 = null;
        } else {
            r3 = directRealtimePayload.throttlingType;
        }
        String errorCode = r2.getErrorCode();
        boolean canSeeNotes = r2.getCanSeeNotes();
        boolean canSeeBroadcastChats = r2.getCanSeeBroadcastChats();
        if (statusCode == 403) {
            return new C270214gN(r3, C69414Nku.A0D, String.valueOf(statusCode), errorCode, "http", (String) null, errorMessage, clientFacingErrorMessage, false, false, isEpdError, canSeeNotes, canSeeBroadcastChats, false);
        }
        return C71115Od8.A02(r3, "http", errorMessage, clientFacingErrorMessage, errorCode, statusCode, isEpdError, canSeeNotes, canSeeBroadcastChats);
    }
}
