package X;

import com.instagram.api.schemas.GenAIToolInfoDict;
import com.instagram.camera.effect.models.CameraAREffect;

/* renamed from: X.AyE  reason: case insensitive filesystem */
public final class C41662AyE extends 0Yg implements 0sP {
    public final /* synthetic */ AnonymousClass8XA A00;
    public final /* synthetic */ C362058hH A01;
    public final /* synthetic */ C352218Cl A02;
    public final /* synthetic */ boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41662AyE(AnonymousClass8XA r2, C362058hH r3, C352218Cl r4, boolean z) {
        super(1);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = z;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        GenAIToolInfoDict genAIToolInfoDict;
        C352218Cl r11 = (C352218Cl) obj;
        0qQ.A0B(r11, 0);
        AnonymousClass8XA r4 = this.A00;
        r4.A0Y.A00().Cme(r11);
        C362058hH r7 = this.A01;
        if (r7.CV4()) {
            CameraAREffect cameraAREffect = r4.A0C.A00().A05.A09;
            if (!(cameraAREffect == null || cameraAREffect.A0Z.get("galleryPicker") == null)) {
                C264044Oj.A00(r4.A0F).Chn(r4.A0P.A00.A01, 28t.A05, cameraAREffect.A0K, cameraAREffect.A0M);
                r4.A0T.A01(r11.A07, r11.A06(), true);
            }
            r7.EZk(false);
        } else if (!r7.CV5() || (genAIToolInfoDict = r4.A0O.A0I) == null || genAIToolInfoDict.A00 == null) {
            r4.A0Q.A03(r11, this.A03);
        } else {
            r4.A0Q.A02(r4.A0i, this.A02);
        }
        r4.A0M(true);
        return C60340gF.A00;
    }
}
