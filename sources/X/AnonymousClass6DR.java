package X;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.Base64;
import com.instagram.common.session.UserSession;

/* renamed from: X.6DR  reason: invalid class name */
public final class AnonymousClass6DR {
    public Bitmap A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final boolean A09;
    public final byte[] A0A;

    public AnonymousClass6DR(UserSession userSession) {
        0Tu r3 = 0Tu.A05;
        this.A09 = 182.A06(r3, userSession, 36322581373462812L);
        this.A0A = Base64.decode(182.A04(r3, userSession, 36885531326284407L), 0);
        int i = 0;
        try {
            i = Color.parseColor(182.A04(r3, userSession, 36885531326349944L));
        } catch (IllegalArgumentException | IndexOutOfBoundsException unused) {
        }
        this.A04 = i;
        int i2 = 0;
        try {
            i2 = Color.parseColor(182.A04(r3, userSession, 36885531326677629L));
        } catch (IllegalArgumentException | IndexOutOfBoundsException unused2) {
        }
        this.A03 = i2;
        int i3 = 0;
        try {
            i3 = Color.parseColor(182.A04(r3, userSession, 36885531326481018L));
        } catch (IllegalArgumentException | IndexOutOfBoundsException unused3) {
        }
        this.A06 = i3;
        int i4 = 0;
        try {
            i4 = Color.parseColor(182.A04(r3, userSession, 36885531326546555L));
        } catch (IllegalArgumentException | IndexOutOfBoundsException unused4) {
        }
        this.A05 = i4;
        int i5 = 0;
        try {
            i5 = Color.parseColor(182.A04(r3, userSession, 36885531326415481L));
        } catch (IllegalArgumentException | IndexOutOfBoundsException unused5) {
        }
        this.A08 = i5;
        int i6 = 0;
        try {
            i6 = Color.parseColor(182.A04(r3, userSession, 36885531326612092L));
        } catch (IllegalArgumentException | IndexOutOfBoundsException unused6) {
        }
        this.A07 = i6;
        this.A01 = (float) 182.A01(r3, userSession, 36604056349381633L);
        this.A02 = (float) 182.A01(r3, userSession, 36604056349447170L);
        182.A04(r3, userSession, 36885531327005313L);
    }
}
