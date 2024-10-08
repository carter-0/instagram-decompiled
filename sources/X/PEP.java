package X;

import com.instagram.realtimeclient.DirectRealtimePayload;

public final class PEP implements C74342PtI {
    public final C270214gN AWW(AnonymousClass1XT r11, String str) {
        NHZ nhz;
        DirectRealtimePayload directRealtimePayload;
        int statusCode = r11.getStatusCode();
        String errorMessage = r11.getErrorMessage();
        String clientFacingErrorMessage = r11.getClientFacingErrorMessage();
        boolean isEpdError = r11.isEpdError();
        C254403sQ r1 = null;
        if (!(!(r11 instanceof NHZ) || (nhz = (NHZ) r11) == null || (directRealtimePayload = nhz.A00) == null)) {
            r1 = directRealtimePayload.throttlingType;
        }
        return C71115Od8.A02(r1, "http", errorMessage, clientFacingErrorMessage, r11.getErrorCode(), statusCode, isEpdError, r11.getCanSeeNotes(), r11.getCanSeeBroadcastChats());
    }
}
