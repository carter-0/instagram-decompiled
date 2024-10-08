package X;

import android.graphics.drawable.Drawable;
import ca.psiphon.PsiphonTunnel;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Hr6  reason: case insensitive filesystem */
public final class C56000Hr6 {
    public int A00 = PsiphonTunnel.VPN_INTERFACE_MTU;
    public Drawable A01;
    public ImageUrl A02;
    public C74474PvU A03;
    public CharSequence A04;
    public String A05;
    public String A06;
    public String A07;

    public final C55866Hon A00() {
        if (this.A04 == null) {
            throw AnonymousClass7TE.A0z("Required value was null.");
        } else if (this.A03 == null) {
            throw AnonymousClass7TE.A0z("Required value was null.");
        } else if (this.A06 == null) {
            throw AnonymousClass7TE.A0z("Required value was null.");
        } else if (this.A07 != null) {
            return new C55866Hon(this);
        } else {
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }
}
