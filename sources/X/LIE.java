package X;

import com.instagram.api.schemas.TrackData;
import com.instagram.music.common.model.MusicSearchPlaylist;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class LIE {
    public static K1T parseFromJson(16F r10) {
        ArrayList arrayList;
        List A15;
        ArrayList arrayList2;
        C61111JxN jxN;
        List<C61112JxO> list;
        0qQ.A0B(r10, 0);
        try {
            K1T k1t = new K1T();
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if ("category".equals(A17)) {
                    k1t.A00 = Ci5.parseFromJson(r10);
                } else if ("default_playlist".equals(A17)) {
                    k1t.A01 = CbU.parseFromJson(r10);
                } else {
                    1XY.A01(r10, k1t, A17);
                }
                r10.A0z();
            }
            C61062Jw0 jw0 = k1t.A00;
            if (jw0 == null || (A15 = JTO.A15((AnonymousClass0eM) jw0.A00)) == null || A15.isEmpty()) {
                arrayList = 0sn.A00;
            } else {
                arrayList = AnonymousClass7TG.A0r(A15);
                int i = 0;
                for (Object next : A15) {
                    int i2 = i + 1;
                    if (i < 0) {
                        0sr.A1T();
                        throw AnonymousClass00P.createAndThrow();
                    }
                    MusicSearchPlaylist musicSearchPlaylist = (MusicSearchPlaylist) next;
                    String A0s = JTP.A0s(musicSearchPlaylist);
                    String A0b = JTQ.A0b(musicSearchPlaylist);
                    if (i != 0 || (jxN = k1t.A01) == null || (list = jxN.A07) == null) {
                        arrayList2 = 0sn.A00;
                    } else {
                        arrayList2 = AnonymousClass7TE.A1C();
                        for (C61112JxO jxO : list) {
                            TrackData trackData = jxO.A01;
                            if (trackData != null) {
                                JVX jvx = new JVX(trackData);
                                jvx.A00 = jxO.A02;
                                arrayList2.add(jvx);
                            }
                        }
                    }
                    arrayList.add(new JV7(16, A0s, A0b, (List) arrayList2));
                    i = i2;
                }
            }
            k1t.A02 = arrayList;
            return k1t;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
