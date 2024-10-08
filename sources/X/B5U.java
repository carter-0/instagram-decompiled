package X;

import com.instagram.api.schemas.AudioNoteResponseInfo;
import com.instagram.api.schemas.AvatarNoteResponseInfoImpl;
import com.instagram.api.schemas.GIFNoteResponseInfoImpl;
import com.instagram.api.schemas.ListeningNowResponseInfo;
import com.instagram.api.schemas.LiveNoteResponseInfo;
import com.instagram.api.schemas.LocationNoteResponseInfoImpl;
import com.instagram.api.schemas.MusicNoteResponseInfo;
import com.instagram.api.schemas.NoteChatResponseInfoImpl;
import java.io.IOException;

public abstract class B5U {
    public static C300845y2 parseFromJson(16F r16) {
        16F r1 = r16;
        0qQ.A0B(r1, 0);
        try {
            if (r1.A11() != 16L.A0D) {
                r1.A0z();
                return null;
            }
            AudioNoteResponseInfo audioNoteResponseInfo = null;
            AvatarNoteResponseInfoImpl avatarNoteResponseInfoImpl = null;
            GIFNoteResponseInfoImpl gIFNoteResponseInfoImpl = null;
            C42043BEv bEv = null;
            ListeningNowResponseInfo listeningNowResponseInfo = null;
            LiveNoteResponseInfo liveNoteResponseInfo = null;
            LocationNoteResponseInfoImpl locationNoteResponseInfoImpl = null;
            MusicNoteResponseInfo musicNoteResponseInfo = null;
            NoteChatResponseInfoImpl noteChatResponseInfoImpl = null;
            AnonymousClass60C r13 = null;
            C42065BFs bFs = null;
            AnonymousClass60F r15 = null;
            AnonymousClass60H r162 = null;
            while (r1.A1J() != 16L.A09) {
                String A0q = r1.A0q();
                r1.A1J();
                if ("audio_note_response_info".equals(A0q)) {
                    audioNoteResponseInfo = C44067CUk.parseFromJson(r1);
                } else if ("avatar_note_response_info".equals(A0q)) {
                    avatarNoteResponseInfoImpl = C44069CUm.parseFromJson(r1);
                } else if ("gif_note_response_info".equals(A0q)) {
                    gIFNoteResponseInfoImpl = C44158CXx.parseFromJson(r1);
                } else if ("group_note_response_info".equals(A0q)) {
                    bEv = CYF.parseFromJson(r1);
                } else if ("listening_now_response_info".equals(A0q)) {
                    listeningNowResponseInfo = C44208CZv.parseFromJson(r1);
                } else if ("live_note_response_info".equals(A0q)) {
                    liveNoteResponseInfo = C44211CZy.parseFromJson(r1);
                } else if ("location_note_response_info".equals(A0q)) {
                    locationNoteResponseInfoImpl = Ca1.parseFromJson(r1);
                } else if ("music_note_response_info".equals(A0q)) {
                    musicNoteResponseInfo = C41889B5j.parseFromJson(r1);
                } else if ("note_chat_response_info".equals(A0q)) {
                    noteChatResponseInfoImpl = C44236Cax.parseFromJson(r1);
                } else if ("note_pog_video_response_info".equals(A0q)) {
                    r13 = Cb1.parseFromJson(r1);
                } else if ("presence_note_response_info".equals(A0q)) {
                    bFs = C44246Cbh.parseFromJson(r1);
                } else if ("prompt_pog_response_info".equals(A0q)) {
                    r15 = C44288CcW.parseFromJson(r1);
                } else if ("prompt_reply_note_response_info".equals(A0q)) {
                    r162 = C44289CcX.parseFromJson(r1);
                }
                r1.A0z();
            }
            return new C300845y2(audioNoteResponseInfo, avatarNoteResponseInfoImpl, gIFNoteResponseInfoImpl, bEv, listeningNowResponseInfo, liveNoteResponseInfo, locationNoteResponseInfoImpl, musicNoteResponseInfo, noteChatResponseInfoImpl, r13, bFs, r15, r162);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
