package X;

import com.instagram.music.common.model.MusicSearchArtist;
import com.instagram.music.common.model.MusicSearchPlaylist;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.KvS  reason: case insensitive filesystem */
public abstract class C63345KvS {
    public static final void A00(List list, String str) {
        int intValue;
        Iterator A0x = JTP.A0x(list);
        while (A0x.hasNext()) {
            JZC jzc = (JZC) A0x.next();
            Integer num = jzc.A0G;
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            if (intValue == 1) {
                C66569MWx A00 = jzc.A00();
                if (A00 != null) {
                    A00.EOL(str);
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else if (intValue == 5) {
                MusicSearchPlaylist musicSearchPlaylist = jzc.A0E;
                if (musicSearchPlaylist != null) {
                    for (JZC jzc2 : JTO.A15(musicSearchPlaylist.A01)) {
                        if (jzc2.A0G == AnonymousClass05K.A01) {
                            C66569MWx A002 = jzc2.A00();
                            if (A002 != null) {
                                A002.EOL(str);
                            } else {
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                        }
                    }
                    continue;
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else if (intValue == 8) {
                MusicSearchArtist musicSearchArtist = jzc.A0B;
                if (musicSearchArtist != null) {
                    musicSearchArtist.A00 = str;
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else {
                return;
            }
        }
    }
}
