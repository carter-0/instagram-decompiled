package X;

import com.instagram.api.schemas.MusicNoteResponseInfoIntf;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cao  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44227Cao {
    public static Map A00(MusicNoteResponseInfoIntf musicNoteResponseInfoIntf) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (musicNoteResponseInfoIntf.Can() != null) {
            A1H.put("is_reshare_eligible", musicNoteResponseInfoIntf.Can());
        }
        if (musicNoteResponseInfoIntf.CcP() != null) {
            A1H.put("is_spotify_save_eligible", musicNoteResponseInfoIntf.CcP());
        }
        if (musicNoteResponseInfoIntf.BUr() != null) {
            A1H.put("music_info", musicNoteResponseInfoIntf.BUr().FHC());
        }
        if (musicNoteResponseInfoIntf.BXH() != null) {
            A1H.put("num_spotify_saves", musicNoteResponseInfoIntf.BXH());
        }
        User BYz = musicNoteResponseInfoIntf.BYz();
        if (BYz != null) {
            A1H.put("original_author", BYz.A08());
        }
        if (musicNoteResponseInfoIntf.Brj() != null) {
            A1H.put("selected_lyrics", musicNoteResponseInfoIntf.Brj());
        }
        return 0Yt.A0B(A1H);
    }
}
