package X;

import android.app.Activity;
import android.graphics.Rect;
import android.net.Uri;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.base.PhotoSession;
import java.util.Map;

public final class JWH {
    public Runnable A00;
    public boolean A01;
    public final Activity A02;
    public final UserSession A03;
    public final C267854cK A04;
    public final JWG A05;
    public final C267844cJ A06;
    public final MV3 A07;
    public final MV3 A08;
    public final Map A09 = AnonymousClass7TE.A1E();
    public final Map A0A = AnonymousClass7TE.A1E();

    public final C364848m7 A02(C10954S2m s2m, String str) {
        0qQ.A0B(str, 0);
        Map map = this.A0A;
        if (!map.containsKey(str)) {
            A03(s2m, str);
        }
        Object obj = map.get(str);
        if (obj != null) {
            return (C364848m7) obj;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void A03(C10954S2m s2m, String str) {
        0qQ.A0B(str, 0);
        PhotoSession A032 = JWE.A01(this.A06.Ajn()).A03(str);
        if (A032 == null) {
            0kD.A07("MediaCaptureRenderController_createImageRenderController()", "Null photoSession.", (Throwable) null);
            return;
        }
        if (!this.A0A.containsKey(str)) {
            this.A08.AMk(s2m, A032, str);
        }
        if (A032.A07 == null) {
            A032.A07 = C364978mK.A01(this.A03, A032.A0C);
        }
    }

    public static final C364798m1 A00(JWH jwh, String str, String str2) {
        Uri uri;
        if (str2 != null) {
            uri = 0cp.A03(str2);
        } else {
            uri = null;
        }
        return new C364798m1(JTP.A0B(jwh.A02), DbT.A09(str), uri);
    }

    public static final void A01(CropInfo cropInfo, JWH jwh, String str, int i) {
        String str2 = str;
        PhotoSession A032 = JWE.A01(jwh.A06.Ajn()).A03(str);
        if (A032 != null) {
            CropInfo cropInfo2 = cropInfo;
            int i2 = i;
            if (A032.A05 == null) {
                int i3 = cropInfo2.A01;
                int i4 = cropInfo2.A00;
                Rect rect = cropInfo2.A02;
                0qQ.A0B(rect, 2);
                A032.A05 = new CropInfo(rect, i3, i4);
                ((C64919LkJ) A032.A0D).A00.A01 = i;
            }
            UserSession userSession = jwh.A03;
            C64168LRo A002 = C59953JcJ.A00(userSession);
            Activity activity = jwh.A02;
            A002.A05(activity, str);
            C59953JcJ.A00(userSession).A03(activity, cropInfo2, str2, i2, A032.A0C);
        }
    }

    public JWH(Activity activity, C267854cK r5, JWG jwg, C267844cJ r7) {
        MV3 jYx;
        this.A02 = activity;
        this.A04 = r5;
        this.A05 = jwg;
        this.A06 = r7;
        UserSession CCy = r5.CCy();
        this.A03 = CCy;
        MV3 jwi = new JWI(DbT.A05(activity), CCy, this);
        this.A07 = jwi;
        if (!2Ht.A03(CCy)) {
            if (2Ht.A00) {
                jYx = new JXW(this);
            } else {
                jYx = new C59804JYx(this);
            }
            jwi = jYx;
        }
        this.A08 = jwi;
    }
}
