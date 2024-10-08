package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

public final class IMU implements JSp {
    public final C270754hF A00;
    public final String A01;

    public IMU(C270754hF r2, String str) {
        0qQ.A0B(r2, 2);
        this.A01 = str;
        this.A00 = r2;
    }

    public final 1OC Aez(UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        String str2 = this.A01;
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("clips/direct_thread_clips/");
        A0a.A9m(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
        A0a.A0C("limit", 6);
        return C51973G9u.A0c(A0a, "media_cursor_timestamp_ms", str);
    }

    public final 1OC BCc(UserSession userSession, boolean z) {
        0qQ.A0B(userSession, 0);
        return this.A00.BCc(userSession, z);
    }

    public final 1OC C42(UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        return this.A00.C42(userSession, str);
    }

    public final /* synthetic */ void ES0(GEP gep) {
    }

    public final /* synthetic */ void ESn(Context context) {
    }

    public final /* synthetic */ void EiB(String str) {
    }

    public final /* synthetic */ void Elk(C290515fR r1) {
    }

    public final boolean CTp(boolean z) {
        return this.A00.CTp(z);
    }
}
