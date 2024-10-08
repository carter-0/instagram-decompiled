package X;

import android.widget.ImageView;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.GxS  reason: case insensitive filesystem */
public final class C53984GxS extends C243963aQ {
    public static final 2WU A09 = G9t.A17(C56959IJd.A00);
    public final float A00;
    public final int A01;
    public final int A02;
    public final ImageView.ScaleType A03;
    public final AnonymousClass0iw A04;
    public final ImageUrl A05;
    public final boolean A06;
    public final 2WX A07;
    public final boolean A08;

    public final C244523bK A0X(C244463bE r6) {
        0qQ.A0B(r6, 0);
        if (this.A08) {
            1OO A0J = 1NK.A00().A0J(this.A05, this.A04.getModuleName());
            A0J.A0I = false;
            A0J.A0J = true;
            A0J.A01();
        }
        return C51965G9l.A0W(this.A07, IKX.A00, C51969G9p.A0f(r6, A09, C58445Is2.A00, new MPB(28, (Object) r6, (Object) this)));
    }

    public C53984GxS(ImageView.ScaleType scaleType, 2WX r2, AnonymousClass0iw r3, ImageUrl imageUrl, float f, int i, int i2, boolean z, boolean z2) {
        AnonymousClass7TG.A1O(imageUrl, r3);
        this.A05 = imageUrl;
        this.A04 = r3;
        this.A00 = f;
        this.A02 = i;
        this.A01 = i2;
        this.A03 = scaleType;
        this.A07 = r2;
        this.A06 = z;
        this.A08 = z2;
    }
}
