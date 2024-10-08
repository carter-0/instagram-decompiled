package X;

import android.os.Bundle;
import com.instagram.user.model.UpcomingEvent;
import java.io.File;

/* renamed from: X.Uv7  reason: case insensitive filesystem */
public final class C16451Uv7 extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelUpcomingEventStickerFragment";
    public 28D A00;
    public UpcomingEvent A01;
    public File A02;
    public final C41837B2s A03 = new WUP(this, 26);

    public final String getModuleName() {
        return "reel_upcoming_event_sticker_fragment";
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(721556874);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A00 = C13991Tnr.A09(bundle2, "ReelUpcomingEventConstants.ARG_KEY_CAMERA_ENTRY_POINT");
            Object obj = bundle2.get("ReelUpcomingEventConstants.ARG_KEY_UPCOMING_EVENT");
            0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.user.model.UpcomingEvent");
            this.A01 = (UpcomingEvent) obj;
            String string = bundle2.getString("ReelUpcomingEventConstants.ARG_KEY_FILE_PATH");
            if (string != null) {
                this.A02 = new File(string);
            }
            AnonymousClass0fD.A09(-777926782, A022);
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(AnonymousClass000.A00(459));
        AnonymousClass0fD.A09(-1402966276, A022);
        throw illegalArgumentException;
    }
}
