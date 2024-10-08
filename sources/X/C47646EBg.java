package X;

import com.instagram.common.session.UserSession;
import com.instagram.music.profile.musiconprofile.MusicOnProfileProvider;

/* renamed from: X.EBg  reason: case insensitive filesystem */
public final class C47646EBg extends 1P0 {
    public final /* synthetic */ C46379Ddw A00;
    public final /* synthetic */ C322346vg A01;

    public C47646EBg(C46379Ddw ddw, C322346vg r2) {
        this.A00 = ddw;
        this.A01 = r2;
    }

    public final void onFail(C268654dm r6) {
        int A0D = AnonymousClass7TG.A0D(r6, -1049335315);
        C47646EBg.super.onFail(r6);
        C322346vg r3 = this.A00.A02;
        C322326ve r1 = r3.A01;
        if (r1 != null) {
            r1.A08(r3.A04.A06, "fetch_profile_music_error");
        }
        C322326ve r12 = r3.A01;
        if (r12 != null) {
            r12.A07(r3.A04.A06, "fetch_profile_music_error");
        }
        r3.A02 = true;
        AnonymousClass0fD.A0A(-635507661, A0D);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-662045626);
        C43805CDx cDx = (C43805CDx) obj;
        int A032 = AnonymousClass0fD.A03(1197811763);
        0qQ.A0B(cDx, 0);
        C47646EBg.super.onSuccess(cDx);
        C46379Ddw ddw = this.A00;
        JVM A002 = MusicOnProfileProvider.A00(cDx);
        C322346vg r3 = ddw.A02;
        if (r3.A08) {
            C322326ve r2 = r3.A01;
            if (r2 != null) {
                r2.A08(r3.A04.A06, "fetch_profile_music_successful");
            }
            C322326ve r1 = r3.A01;
            if (r1 != null) {
                r1.A03(r3.A04.A06);
            }
            MusicOnProfileProvider musicOnProfileProvider = r3.A06;
            musicOnProfileProvider.A00 = true;
            musicOnProfileProvider.A01.A0A(A002);
        } else {
            C322486vu r12 = ddw.A01.A00;
            if (r12 != null) {
                if (r12.A0B != A002) {
                    r12.A0B = A002;
                }
                UserSession userSession = r3.A04;
                0qQ.A0B(userSession, 0);
                ((C46390DeC) userSession.A01(C46390DeC.class, new C51796G2f(userSession, 27))).A00(ddw.A00, ddw.A03, A002.A02.A0B);
            } else {
                0qQ.A0F("headerAdapter");
                throw AnonymousClass00P.createAndThrow();
            }
        }
        AnonymousClass0fD.A0A(-2052150882, A032);
        AnonymousClass0fD.A0A(1569830322, A03);
    }
}
