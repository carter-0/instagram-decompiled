package X;

import android.content.Context;
import android.content.Intent;
import com.instagram.rtc.service.OngoingCallServiceWithMic;

public final class OJ9 {
    public final void A00(Context context, Long l, String str, boolean z) {
        Intent A0A = C66580MXl.A0A(context.getApplicationContext(), OngoingCallServiceWithMic.class);
        A0A.putExtra("TITLE", str);
        A0A.putExtra("IS_AUDIO_CALL", z);
        A0A.putExtra("CALL_START_REAL_TIME", l);
        A0A.putExtra("AVATAR_URL", (String) null);
        A0A.setAction("SHOW");
        0kR.A00.A07().A0B(context, A0A);
    }
}
