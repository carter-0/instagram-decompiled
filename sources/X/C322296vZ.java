package X;

import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.profile.musiconprofile.MusicOnProfileProvider;

/* renamed from: X.6vZ  reason: invalid class name and case insensitive filesystem */
public final class C322296vZ extends 2YL {
    public final 2Fk A00;
    public final 2Fk A01;
    public final MusicOnProfileProvider A02;
    public final C249513ju A03;
    public final AnonymousClass0r6 A04;
    public final 05G A05;
    public final UserSession A06;

    public C322296vZ(UserSession userSession, MusicOnProfileProvider musicOnProfileProvider) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(musicOnProfileProvider, 2);
        this.A06 = userSession;
        this.A02 = musicOnProfileProvider;
        02z A012 = 106.A01((Object) null);
        this.A05 = A012;
        this.A00 = musicOnProfileProvider.A01;
        this.A01 = C226292g8.A00(19B.A00, new C322336vf(this, A012));
        1HR r0 = new 1HR(0);
        this.A03 = r0;
        this.A04 = 0u9.A04(r0);
    }

    public final void A00() {
        AudioOverlayTrack audioOverlayTrack;
        JVM jvm = (JVM) this.A00.A02();
        if (jvm != null) {
            audioOverlayTrack = new AudioOverlayTrack(jvm.A02, jvm.A01, jvm.A00);
        } else {
            audioOverlayTrack = null;
        }
        this.A05.Epw(audioOverlayTrack);
    }
}
