package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.StoryMusicPickTappableDataIntf;
import com.instagram.api.schemas.StoryPromptDisablementState;
import com.instagram.api.schemas.TrackData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.CeX  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44413CeX {
    public static Map A00(StoryMusicPickTappableDataIntf storyMusicPickTappableDataIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (storyMusicPickTappableDataIntf.AdQ() != null) {
            TrackData AdQ = storyMusicPickTappableDataIntf.AdQ();
            if (AdQ != null) {
                treeUpdaterJNI = AdQ.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put(MediaStreamTrack.AUDIO_TRACK_KIND, treeUpdaterJNI);
        }
        if (storyMusicPickTappableDataIntf.Ae0() != null) {
            A1H.put("author_user_pk", storyMusicPickTappableDataIntf.Ae0());
        }
        if (storyMusicPickTappableDataIntf.Axh() != null) {
            StoryPromptDisablementState Axh = storyMusicPickTappableDataIntf.Axh();
            0qQ.A0B(Axh, 0);
            A1H.put("disablement_state", Axh.A00);
        }
        if (storyMusicPickTappableDataIntf.B3f() != null) {
            List B3f = storyMusicPickTappableDataIntf.B3f();
            ArrayList A0r = AnonymousClass7TG.A0r(B3f);
            Iterator it = B3f.iterator();
            while (it.hasNext()) {
                C41846B3n.A1T(A0r, it);
            }
            A1H.put("facepile_top_participants", A0r);
        }
        if (storyMusicPickTappableDataIntf.getId() != null) {
            C41845B3m.A0x(storyMusicPickTappableDataIntf.getId(), A1H);
        }
        if (storyMusicPickTappableDataIntf.getMediaId() != null) {
            C41845B3m.A13(storyMusicPickTappableDataIntf.getMediaId(), A1H);
        }
        if (storyMusicPickTappableDataIntf.BZB() != null) {
            OriginalSoundDataIntf BZB = storyMusicPickTappableDataIntf.BZB();
            if (BZB != null) {
                treeUpdaterJNI2 = BZB.FHC();
            }
            A1H.put("original_sound_info", treeUpdaterJNI2);
        }
        storyMusicPickTappableDataIntf.Bak();
        A1H.put("participant_count", Integer.valueOf(storyMusicPickTappableDataIntf.Bak()));
        if (storyMusicPickTappableDataIntf.Ben() != null) {
            A1H.put("prefilled_music_search_text", storyMusicPickTappableDataIntf.Ben());
        }
        if (storyMusicPickTappableDataIntf.C4X() != null) {
            A1H.put("template_asset", storyMusicPickTappableDataIntf.C4X().FHC());
        }
        return 0Yt.A0B(A1H);
    }
}
