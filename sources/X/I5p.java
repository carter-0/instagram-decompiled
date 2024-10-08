package X;

import android.content.Context;
import com.instagram.api.schemas.ACRType;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class I5p {
    public static final void A04(Context context, UserSession userSession, AudioOverlayTrack audioOverlayTrack, String str, int i, int i2) {
        C353638Im r1 = new C353638Im(context, userSession, new AnonymousClass8Zq(), 0);
        MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
        if (musicAssetModel != null) {
            r1.A04(musicAssetModel, new C65497LuL(audioOverlayTrack, 1), str, i, i2, false);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final int A00(ACRType aCRType, String str, int i) {
        if (aCRType != null) {
            switch (aCRType.ordinal()) {
                case -1:
                case 0:
                case 6:
                    return i;
                case 1:
                    return 52;
                case 2:
                    return 51;
                case 3:
                    return 40;
                case 4:
                    break;
                case 5:
                    return 30;
                default:
                    throw AnonymousClass7TE.A1K();
            }
        } else if (str == null) {
            return i;
        } else {
            if (!00p.A0k(str, "highlight:", false)) {
                if (00p.A0k(str, "smartReel:", false)) {
                    return 30;
                }
                if (00p.A0k(str, "carousel:", false)) {
                    return 40;
                }
                return i;
            }
        }
        return 29;
    }

    public static final Integer A01(List list) {
        if (list == null) {
            return null;
        }
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C56077HsQ hsQ = (C56077HsQ) it.next();
            AnonymousClass7TF.A1M(A0r, hsQ.A00 - hsQ.A01);
        }
        return Integer.valueOf(00k.A02(A0r));
    }

    public static final String A02(String str, String str2) {
        StringBuilder A1A;
        String str3;
        if (00p.A0k(str, AnonymousClass000.A00(3245), false)) {
            A1A = AnonymousClass7TE.A1A();
            str3 = "highlight:";
        } else if (!00p.A0k(str, AnonymousClass000.A00(4015), false)) {
            return str;
        } else {
            A1A = AnonymousClass7TE.A1A();
            str3 = "smartReel:";
        }
        A1A.append(str3);
        return AnonymousClass7TF.A0l(str2, A1A);
    }

    public static final ArrayList A03(C53465Gox gox) {
        List<DSO> list;
        if (gox == null || (list = gox.A02) == null) {
            return null;
        }
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (DSO dso : list) {
            A0r.add(new C56077HsQ(dso.Bys(), dso.B1h()));
        }
        return 00k.A0U(A0r);
    }
}
