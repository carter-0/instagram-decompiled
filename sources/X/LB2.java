package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.instagram.common.session.UserSession;

public final class LB2 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Bitmap A04;
    public final Sr2 A05 = new Sr2((Uri) null, new C64442Lbx(this));
    public final C65026Lm4 A06;
    public final C65025Lm3 A07;
    public final AnonymousClass0eM A08;

    public LB2(AnonymousClass4DH r11, UserSession userSession, A96 a96, C65026Lm4 lm4, C65025Lm3 lm3) {
        boolean A1Y = DbW.A1Y(userSession);
        this.A06 = lm4;
        this.A07 = lm3;
        C66305MMo mMo = new C66305MMo(userSession, A1Y);
        AnonymousClass0eM A002 = C66298MMh.A00(C66298MMh.A01(r11, 48), 0eO.A02, 49);
        this.A08 = DbS.A0I(new C66305MMo(A002, 0), mMo, new MJ6(12, (Object) null, A002), DbS.A0z(C60210JhT.class));
        Bitmap createBitmap = Bitmap.createBitmap(A1Y ? 1 : 0, A1Y, Bitmap.Config.ARGB_8888);
        0qQ.A07(createBitmap);
        this.A04 = createBitmap;
        07U r5 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r11.getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MHL(viewLifecycleOwner, r5, a96, this, (AnonymousClass4D7) null, 41), AnonymousClass07a.A00(viewLifecycleOwner));
        DbZ.A1C(r11, MHB.A01(this, (AnonymousClass4D7) null, 15), ((C60210JhT) this.A08.getValue()).A04);
    }
}
