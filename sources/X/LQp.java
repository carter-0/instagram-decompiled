package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.AudioBrowserPlaylistType;
import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.TrackData;
import com.instagram.api.schemas.TrackDataImpl;
import com.instagram.api.schemas.TrackMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicModelEffectPair;
import com.instagram.music.common.model.MusicSearchPlaylist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class LQp {
    public static final C66564MWs A00(C66569MWx mWx) {
        UserSession userSession;
        boolean z;
        int i;
        L7Z l7z;
        UserSession userSession2;
        if (mWx instanceof JVX) {
            userSession = null;
            z = false;
            i = 6;
            new 1E9(new 1hu((UserSession) null), 6, false);
            l7z = new L7Z(new C61112JxO((OriginalSoundData) null, (TrackData) null, (TrackMetadata) null));
            l7z.A01 = ((JVX) mWx).A05;
        } else if (mWx instanceof DHT) {
            userSession = null;
            z = false;
            i = 6;
            new 1E9(new 1hu((UserSession) null), 6, false);
            l7z = new L7Z(new C61112JxO((OriginalSoundData) null, (TrackData) null, (TrackMetadata) null));
            l7z.A00 = ((DHT) mWx).A02;
        } else {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Unsupported audioSearchTrack type: ");
            throw AnonymousClass7TE.A0w(AnonymousClass7TF.A0i(mWx.CAc(), A1A));
        }
        new 1E9(new 1hu(userSession), i, z);
        TrackDataImpl trackDataImpl = null;
        1E9 r2 = new 1E9(new 1hu(userSession), i, z);
        TrackMetadata trackMetadata = l7z.A02;
        if (trackMetadata != null) {
            userSession2 = trackMetadata.FCw();
        } else {
            userSession2 = userSession;
        }
        OriginalSoundDataIntf originalSoundDataIntf = l7z.A00;
        if (originalSoundDataIntf != null) {
            userSession = originalSoundDataIntf.F7E(r2);
        }
        TrackData trackData = l7z.A01;
        if (trackData != null) {
            trackDataImpl = trackData.FCv();
        }
        return new C61112JxO(userSession, trackDataImpl, userSession2);
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [X.JZC, java.lang.Object] */
    public static final JZC A01(Context context, String str, String str2, List list, int i) {
        String A16 = AnonymousClass7TE.A16(context, i);
        new 1E9(new 1hu((UserSession) null), 6, false);
        new 1E9(new 1hu((UserSession) null), 6, false);
        1E9 r2 = new 1E9(new 1hu((UserSession) null), 6, false);
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0r.add(((C66564MWs) it.next()).F7h(r2));
        }
        C61111JxN jxN = new C61111JxN((AudioBrowserPlaylistType) null, (ImageUrl) null, (ImageUrl) null, str2, str, (String) null, A16, A0r);
        ? obj = new Object();
        obj.A0E = new MusicSearchPlaylist(jxN);
        obj.A02();
        return obj;
    }

    public final JZC A02(Context context, ImmutableList immutableList) {
        List A15;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = immutableList.iterator();
        while (it.hasNext()) {
            MusicAssetModel musicAssetModel = ((MusicModelEffectPair) it.next()).A01;
            if (musicAssetModel != null) {
                A1C.add(JVW.A00(musicAssetModel));
            }
        }
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        Iterator it2 = A1C.iterator();
        while (it2.hasNext()) {
            A1C2.add(A00((C66569MWx) it2.next()));
        }
        JZC A01 = A01(context, "PLAYLIST_ID.IN_THIS_REEL", (String) null, A1C2, 2131967808);
        A01.A0G = AnonymousClass05K.A0j;
        MusicSearchPlaylist musicSearchPlaylist = A01.A0E;
        if (!(musicSearchPlaylist == null || (A15 = JTO.A15(musicSearchPlaylist.A01)) == null)) {
            Iterator it3 = 00k.A0R(A15, immutableList).iterator();
            while (it3.hasNext()) {
                0eP A1A = JTO.A1A(it3);
                C66569MWx A00 = ((JZC) A1A.A00).A00();
                if (A00 != null) {
                    A00.EP7(((MusicModelEffectPair) A1A.A01).A00);
                }
            }
        }
        return A01;
    }
}
