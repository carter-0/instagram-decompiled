package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.LxG  reason: case insensitive filesystem */
public final class C65639LxG implements MUE {
    public final /* synthetic */ C62052KYa A00;

    public C65639LxG(C62052KYa kYa) {
        this.A00 = kYa;
    }

    public final void D0c() {
        C62052KYa kYa = this.A00;
        C66461MSp mSp = kYa.A06;
        if (mSp != null) {
            mSp.afterSelection(false);
        }
        C66462MSq mSq = kYa.A07;
        if (mSq != null) {
            mSq.E1P(AnonymousClass05K.A01);
        }
        kYa.A0B = true;
    }

    public final void D5Z() {
        C62052KYa kYa = this.A00;
        CallerContext callerContext = C62052KYa.A02;
        switch (kYa.A00.ordinal()) {
            case 14:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
            case 31:
            case 34:
                kYa.A03();
                break;
            case 15:
            case 30:
            case 32:
            case 33:
                kYa.A04();
                break;
            case 37:
                UserSession userSession = kYa.A0E;
                if (!AnonymousClass8PU.A04(userSession)) {
                    kYa.A03();
                    kYa.A04();
                    if (C367288qV.A04((BBV) null, userSession)) {
                        C367288qV.A01.A0C(userSession, "UPSELL", true, true);
                        break;
                    }
                } else {
                    new C64369Lal(userSession).A01(0sr.A1P(new C39876ACx[]{new C39876ACx("FEED", true), new C39876ACx("STORY", true), new C39876ACx("REELS", true)}), C66276MLl.A00, C66277MLm.A00);
                    break;
                }
                break;
            case 39:
                break;
            default:
                kYa.A02();
                break;
        }
        C66461MSp mSp = kYa.A06;
        if (mSp != null) {
            mSp.afterSelection(true);
        }
        C66462MSq mSq = kYa.A07;
        if (mSq != null) {
            mSq.E1P(AnonymousClass05K.A00);
        }
        kYa.A0B = true;
    }
}
