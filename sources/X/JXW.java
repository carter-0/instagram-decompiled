package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.base.MediaSession;
import com.instagram.creation.base.PhotoSession;
import com.instagram.creation.base.VideoSession;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class JXW implements MV3, C364888mB {
    public final /* synthetic */ JWH A00;

    /* JADX WARNING: type inference failed for: r0v9, types: [X.AR4, java.lang.Object] */
    public final MVM ALj(String str, String str2) {
        C40437Ac8 ac8;
        VideoSession videoSession;
        JWH jwh = this.A00;
        C267844cJ r7 = jwh.A06;
        if (r7.Ajn().A00 != null) {
            String str3 = str2;
            if (str2 != null) {
                JWE jwe = (JWE) r7.Ajn().A00();
                CreationSession creationSession = jwe.A01;
                UserSession userSession = jwe.A00;
                Iterator it = creationSession.A0E.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        videoSession = null;
                        break;
                    }
                    MediaSession A0Z = JTO.A0Z(it);
                    AnonymousClass3Q2 A03 = 28K.A00(userSession).A03(A0Z.BbR());
                    if (A0Z.Bsu() == AnonymousClass05K.A01 && A03 != null && str3.equals(A03.A33)) {
                        videoSession = (VideoSession) A0Z;
                        break;
                    }
                }
                C343897qz r2 = new C343897qz();
                String obj = r2.toString();
                ? obj2 = new Object();
                C64347LaP laP = new C64347LaP(jwh, 0);
                synchronized (obj2) {
                    obj2.A00 = laP;
                }
                Activity activity = jwh.A02;
                C344207rU A01 = C39823AAu.A01(activity, obj2, r2, jwh.A03, "instagram_feed_post_capture_cover", obj, (LinkedHashMap) null, true, false);
                UserSession CCy = jwh.A04.CCy();
                C65007Llk llk = new C65007Llk(jwh);
                C364798m1 A002 = JWH.A00(jwh, str3, (String) null);
                if (videoSession != null) {
                    ac8 = new C40437Ac8(activity, A01, (C10954S2m) null, CCy, videoSession.A0C, r7.Ajn(), llk, this, obj2, A002, 0, false);
                    ac8.A08 = r2;
                    ac8.A0D = obj;
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        } else {
            ac8 = null;
        }
        jwh.A09.put(str, new C64909Lk9(jwh.A03, ac8));
        return null;
    }

    public final synchronized void AOw() {
        Map map = this.A00.A09;
        Iterator it = Dba.A0e(map).iterator();
        while (it.hasNext()) {
            ((MVM) it.next()).Ddq();
        }
        map.clear();
    }

    public final synchronized void destroy() {
        Map map = this.A00.A0A;
        Iterator it = Dba.A0e(map).iterator();
        while (it.hasNext()) {
            ((C364848m7) it.next()).AOv();
        }
        map.clear();
    }

    public JXW(JWH jwh) {
        this.A00 = jwh;
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [X.AR4, java.lang.Object] */
    public final void AMk(C10954S2m s2m, PhotoSession photoSession, String str) {
        C343897qz r2 = new C343897qz();
        String obj = r2.toString();
        ? obj2 = new Object();
        JWH jwh = this.A00;
        Activity activity = jwh.A02;
        PhotoSession photoSession2 = photoSession;
        String str2 = str;
        C10954S2m s2m2 = s2m;
        C40437Ac8 ac8 = new C40437Ac8(activity, C39823AAu.A01(activity, obj2, r2, jwh.A03, "instagram_feed_post_capture_photo", obj, (LinkedHashMap) null, true, false), s2m2, jwh.A04.CCy(), photoSession2.A05, jwh.A06.Ajn(), new C65007Llk(jwh), this, obj2, JWH.A00(jwh, str2, photoSession2.A09), photoSession2.A0D.getValue(), photoSession2.A0C);
        ac8.A08 = r2;
        ac8.A0D = obj;
        jwh.A0A.put(str2, ac8);
    }

    public final void DTX(CropInfo cropInfo, String str, int i) {
        JWH.A01(cropInfo, this.A00, str, i);
    }
}
