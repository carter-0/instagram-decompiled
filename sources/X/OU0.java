package X;

import android.graphics.drawable.Drawable;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.common.typedurl.ImageUrl;

public final class OU0 {
    public final long A00;
    public final Drawable A01;
    public final Drawable A02;
    public final PushChannelType A03;
    public final ImageUrl A04;
    public final ImageUrl A05;
    public final ImageUrl A06;
    public final N3K A07;
    public final C66491MTu A08;
    public final C74422Puc A09;
    public final Integer A0A;
    public final Long A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final boolean A0K;

    public OU0(OIS ois) {
        this.A0E = ois.A0J;
        this.A0I = ois.A0K;
        String str = ois.A0G;
        this.A0H = str == null ? "unknown_type" : str;
        this.A04 = ois.A04;
        this.A05 = ois.A05;
        this.A01 = ois.A01;
        this.A0A = ois.A0A;
        this.A06 = ois.A06;
        this.A02 = ois.A02;
        this.A0J = ois.A0H;
        this.A0F = ois.A0E;
        this.A0C = ois.A0C;
        this.A0K = ois.A0I;
        this.A08 = ois.A08;
        this.A00 = ois.A00;
        this.A09 = ois.A09;
        this.A0G = ois.A0F;
        this.A0D = ois.A0D;
        this.A03 = ois.A03;
        this.A0B = ois.A0B;
        this.A07 = ois.A07;
    }

    public static OIS A00(String str) {
        return new OIS(AnonymousClass7TF.A0b(), str);
    }
}
