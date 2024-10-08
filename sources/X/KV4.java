package X;

import com.instagram.music.common.model.MusicSearchPlaylist;
import java.util.List;

public abstract class KV4 extends L25 {
    public final boolean A00(C66569MWx mWx) {
        MusicSearchPlaylist musicSearchPlaylist;
        JZC jzc = ((KV3) this).A00;
        if (!mWx.equals(jzc.A00())) {
            if (jzc.A0G != AnonymousClass05K.A0j || (musicSearchPlaylist = jzc.A0E) == null) {
                return false;
            }
            List A15 = JTO.A15(musicSearchPlaylist.A01);
            int size = A15.size();
            int i = 0;
            while (i < size) {
                JZC jzc2 = (JZC) A15.get(i);
                if (jzc2.A0G != AnonymousClass05K.A01 || !0qQ.A0K(jzc2.A00(), mWx)) {
                    i++;
                }
            }
            return false;
        }
        return true;
    }
}
