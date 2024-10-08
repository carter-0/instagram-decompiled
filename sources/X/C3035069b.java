package X;

import com.instagram.api.schemas.AudioNoteResponseInfo;
import com.instagram.api.schemas.AudioNoteResponseInfoIntf;
import com.instagram.api.schemas.AvatarNoteResponseInfo;
import com.instagram.api.schemas.AvatarNoteResponseInfoImpl;
import com.instagram.api.schemas.GIFNoteResponseInfo;
import com.instagram.api.schemas.GIFNoteResponseInfoImpl;
import com.instagram.api.schemas.ImmutablePandoAudioNoteResponseInfo;
import com.instagram.api.schemas.ImmutablePandoAvatarNoteResponseInfo;
import com.instagram.api.schemas.ImmutablePandoGIFNoteResponseInfo;
import com.instagram.api.schemas.ImmutablePandoListeningNowResponseInfo;
import com.instagram.api.schemas.ImmutablePandoLiveNoteResponseInfo;
import com.instagram.api.schemas.ImmutablePandoLocationNoteResponseInfo;
import com.instagram.api.schemas.ImmutablePandoMusicNoteResponseInfo;
import com.instagram.api.schemas.ImmutablePandoNoteChatResponseInfo;
import com.instagram.api.schemas.ListeningNowResponseInfo;
import com.instagram.api.schemas.ListeningNowResponseInfoIntf;
import com.instagram.api.schemas.LiveNoteResponseInfo;
import com.instagram.api.schemas.LiveNoteResponseInfoIntf;
import com.instagram.api.schemas.LocationNoteResponseInfo;
import com.instagram.api.schemas.LocationNoteResponseInfoImpl;
import com.instagram.api.schemas.MusicNoteResponseInfo;
import com.instagram.api.schemas.MusicNoteResponseInfoIntf;
import com.instagram.api.schemas.NoteChatResponseInfo;
import com.instagram.api.schemas.NoteChatResponseInfoImpl;

/* renamed from: X.69b  reason: invalid class name and case insensitive filesystem */
public final class C3035069b extends 17P implements C300855y3 {
    public final C300845y2 F6x(1E9 r18) {
        AudioNoteResponseInfo audioNoteResponseInfo;
        AvatarNoteResponseInfoImpl avatarNoteResponseInfoImpl;
        GIFNoteResponseInfoImpl gIFNoteResponseInfoImpl;
        C42043BEv bEv;
        ListeningNowResponseInfo listeningNowResponseInfo;
        LiveNoteResponseInfo liveNoteResponseInfo;
        LocationNoteResponseInfoImpl locationNoteResponseInfoImpl;
        MusicNoteResponseInfo musicNoteResponseInfo;
        NoteChatResponseInfoImpl noteChatResponseInfoImpl;
        AnonymousClass60C r13;
        C42065BFs bFs;
        AnonymousClass60F r15;
        AudioNoteResponseInfoIntf audioNoteResponseInfoIntf = (AudioNoteResponseInfoIntf) A05(752630632, ImmutablePandoAudioNoteResponseInfo.class);
        AnonymousClass60H r16 = null;
        if (audioNoteResponseInfoIntf != null) {
            audioNoteResponseInfo = audioNoteResponseInfoIntf.F0g();
        } else {
            audioNoteResponseInfo = null;
        }
        AvatarNoteResponseInfo avatarNoteResponseInfo = (AvatarNoteResponseInfo) A05(-572282619, ImmutablePandoAvatarNoteResponseInfo.class);
        if (avatarNoteResponseInfo != null) {
            avatarNoteResponseInfoImpl = avatarNoteResponseInfo.F0i();
        } else {
            avatarNoteResponseInfoImpl = null;
        }
        GIFNoteResponseInfo gIFNoteResponseInfo = (GIFNoteResponseInfo) A05(914011322, ImmutablePandoGIFNoteResponseInfo.class);
        if (gIFNoteResponseInfo != null) {
            gIFNoteResponseInfoImpl = gIFNoteResponseInfo.F3I();
        } else {
            gIFNoteResponseInfoImpl = null;
        }
        AnonymousClass605 r0 = (AnonymousClass605) A05(2094867999, C3035169f.class);
        1E9 r1 = r18;
        if (r0 != null) {
            bEv = r0.F3V(r1);
        } else {
            bEv = null;
        }
        ListeningNowResponseInfoIntf listeningNowResponseInfoIntf = (ListeningNowResponseInfoIntf) A05(1798408639, ImmutablePandoListeningNowResponseInfo.class);
        if (listeningNowResponseInfoIntf != null) {
            listeningNowResponseInfo = listeningNowResponseInfoIntf.F5U(r1);
        } else {
            listeningNowResponseInfo = null;
        }
        LiveNoteResponseInfoIntf liveNoteResponseInfoIntf = (LiveNoteResponseInfoIntf) A05(1284862610, ImmutablePandoLiveNoteResponseInfo.class);
        if (liveNoteResponseInfoIntf != null) {
            liveNoteResponseInfo = liveNoteResponseInfoIntf.F5W(r1);
        } else {
            liveNoteResponseInfo = null;
        }
        LocationNoteResponseInfo locationNoteResponseInfo = (LocationNoteResponseInfo) A05(22484265, ImmutablePandoLocationNoteResponseInfo.class);
        if (locationNoteResponseInfo != null) {
            locationNoteResponseInfoImpl = locationNoteResponseInfo.F5d();
        } else {
            locationNoteResponseInfoImpl = null;
        }
        MusicNoteResponseInfoIntf musicNoteResponseInfoIntf = (MusicNoteResponseInfoIntf) A05(53399737, ImmutablePandoMusicNoteResponseInfo.class);
        if (musicNoteResponseInfoIntf != null) {
            musicNoteResponseInfo = musicNoteResponseInfoIntf.F6Z(r1);
        } else {
            musicNoteResponseInfo = null;
        }
        NoteChatResponseInfo noteChatResponseInfo = (NoteChatResponseInfo) A05(-838397262, ImmutablePandoNoteChatResponseInfo.class);
        if (noteChatResponseInfo != null) {
            noteChatResponseInfoImpl = noteChatResponseInfo.F6o(r1);
        } else {
            noteChatResponseInfoImpl = null;
        }
        AnonymousClass60D r02 = (AnonymousClass60D) A05(-1090566300, C3035569v.class);
        if (r02 != null) {
            r13 = r02.F6v();
        } else {
            r13 = null;
        }
        AnonymousClass60E r03 = (AnonymousClass60E) A05(947688995, C3035669w.class);
        if (r03 != null) {
            bFs = r03.F7g();
        } else {
            bFs = null;
        }
        AnonymousClass60G r04 = (AnonymousClass60G) A05(-350707174, C3035769x.class);
        if (r04 != null) {
            r15 = r04.F8G(r1);
        } else {
            r15 = null;
        }
        AnonymousClass60I r05 = (AnonymousClass60I) A05(-1552091569, C3035869y.class);
        if (r05 != null) {
            r16 = r05.F8H();
        }
        return new C300845y2(audioNoteResponseInfo, avatarNoteResponseInfoImpl, gIFNoteResponseInfoImpl, bEv, listeningNowResponseInfo, liveNoteResponseInfo, locationNoteResponseInfoImpl, musicNoteResponseInfo, noteChatResponseInfoImpl, r13, bFs, r15, r16);
    }
}
