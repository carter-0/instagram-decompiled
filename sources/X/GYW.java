package X;

import android.widget.ImageView;
import com.instagram.common.typedurl.ImageUrl;

public final class GYW extends C243963aQ {
    public final ImageView.ScaleType A00;
    public final AnonymousClass0iw A01;
    public final ImageUrl A02;
    public final ImageUrl A03;
    public final C240963Ni A04;
    public final C226632hb A05;
    public final String A06;
    public final boolean A07;
    public final int A08;
    public final 2WX A09;
    public final boolean A0A;

    public GYW(ImageView.ScaleType scaleType, 2WX r3, AnonymousClass0iw r4, ImageUrl imageUrl, ImageUrl imageUrl2, C240963Ni r7, C226632hb r8, String str, int i, boolean z, boolean z2) {
        DbW.A1N(imageUrl, 1, r4);
        this.A03 = imageUrl;
        this.A00 = scaleType;
        this.A06 = str;
        this.A01 = r4;
        this.A05 = r8;
        this.A04 = r7;
        this.A09 = r3;
        this.A0A = z;
        this.A07 = z2;
        this.A08 = i;
        this.A02 = imageUrl2;
    }

    public final C244523bK A0X(C244463bE r7) {
        0qQ.A0B(r7, 0);
        if (this.A0A) {
            1OO A0J = 1NK.A00().A0J(this.A03, this.A01.getModuleName());
            A0J.A0J = true;
            A0J.A01();
        }
        return C51965G9l.A0W(this.A09, C52575GYa.A00, C51969G9p.A0f(r7, C51967G9n.A0W(GYT.A00, this.A08, false), GYY.A00, new MPB(26, (Object) r7, (Object) this)));
    }
}
