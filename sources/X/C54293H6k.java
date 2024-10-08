package X;

import android.app.Application;
import com.instagram.api.schemas.TrackOrOriginalSoundSchema;
import com.instagram.common.session.UserSession;

/* renamed from: X.H6k  reason: case insensitive filesystem */
public final class C54293H6k extends C228042kh {
    public final Application A00;
    public final TrackOrOriginalSoundSchema A01;
    public final UserSession A02;
    public final HM8 A03;
    public final String A04;
    public final String A05;

    public C54293H6k(Application application, TrackOrOriginalSoundSchema trackOrOriginalSoundSchema, UserSession userSession, HM8 hm8, String str, String str2) {
        0qQ.A0B(userSession, 2);
        this.A00 = application;
        this.A02 = userSession;
        this.A05 = str;
        this.A01 = trackOrOriginalSoundSchema;
        this.A03 = hm8;
        this.A04 = str2;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A02;
        0qQ.A0B(userSession, 0);
        Class<C54429HDb> cls = C54429HDb.class;
        C62037KWw A002 = C55122HcV.A00(userSession);
        Application application = this.A00;
        String str = this.A05;
        return new C52963GgG(application, this.A01, (C54429HDb) userSession.A01(cls, new C58710IwJ(userSession, 16)), userSession, A002, this.A03, str, this.A04);
    }
}
