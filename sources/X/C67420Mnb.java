package X;

import com.instagram.api.schemas.TrackMetadata;
import com.instagram.api.schemas.TrackMetadataImpl;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioType;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Mnb  reason: case insensitive filesystem */
public final class C67420Mnb implements C20998X8v {
    public static final C67420Mnb A00 = new Object();

    public final String ENA(UserSession userSession, List list) {
        0qQ.A0B(list, 1);
        StringWriter A0v = JTO.A0v();
        17W A0K = AnonymousClass7TF.A0K(A0v);
        Iterator A0s = C41845B3m.A0s(A0K, "tracks", list);
        while (A0s.hasNext()) {
            C69159Nfi nfi = (C69159Nfi) A0s.next();
            if (nfi != null) {
                A0K.A0c();
                if (nfi.A01 != null) {
                    A0K.A0q("track");
                    AnonymousClass3UP.A00(A0K, nfi.A01);
                }
                if (nfi.A02 != null) {
                    A0K.A0q("metadata");
                    D0F.A00(A0K, nfi.A02);
                }
                if (nfi.A00 != null) {
                    A0K.A0q("original_sound");
                    1dk.A00(A0K, nfi.A00);
                }
                C66941Mfa.A00(A0K, nfi);
                A0K.A0Z();
            }
        }
        A0K.A0Y();
        String A0k = AnonymousClass7TG.A0k(A0K, A0v);
        0qQ.A07(A0k);
        return A0k;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Nfi, X.Mfb] */
    public final /* bridge */ /* synthetic */ C66942Mfb ALz(UserSession userSession, Object obj, long j) {
        TrackMetadataImpl trackMetadataImpl;
        C66569MWx mWx = (C66569MWx) obj;
        DbY.A1S(userSession, mWx);
        1E5 A002 = 1E4.A00(userSession);
        0qQ.A0B(A002, 3);
        ? mfb = new C66942Mfb(7);
        mfb.A02 = j;
        mfb.A03 = mWx;
        AudioType CAc = mWx.CAc();
        if (CAc == AudioType.MUSIC) {
            JVX jvx = (JVX) mWx;
            0qQ.A0B(jvx, 0);
            mfb.A01 = jvx.A06.FCv();
            TrackMetadata trackMetadata = jvx.A00;
            if (trackMetadata != null) {
                trackMetadataImpl = trackMetadata.FCw();
            } else {
                trackMetadataImpl = null;
            }
            mfb.A02 = trackMetadataImpl;
        } else if (CAc == AudioType.ORIGINAL_AUDIO) {
            DHT dht = (DHT) mWx;
            0qQ.A0B(dht, 0);
            mfb.A00 = dht.A02.F7F(A002);
            return mfb;
        }
        return mfb;
    }

    public final /* bridge */ /* synthetic */ Object AvK(C66942Mfb mfb) {
        C69159Nfi nfi = (C69159Nfi) mfb;
        0qQ.A0B(nfi, 0);
        C66569MWx A06 = nfi.A06();
        if (A06 != null) {
            return A06;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final /* bridge */ /* synthetic */ String BEa(Object obj) {
        C66569MWx mWx = (C66569MWx) obj;
        0qQ.A0B(mWx, 0);
        return mWx.getId();
    }

    public final ArrayList AOm(UserSession userSession, String str) {
        return 00k.A0U(O2W.parseFromJson(16P.A00(str)).A00);
    }
}
