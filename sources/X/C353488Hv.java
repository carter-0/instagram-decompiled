package X;

import android.graphics.Matrix;
import com.instagram.common.session.UserSession;

/* renamed from: X.8Hv  reason: invalid class name and case insensitive filesystem */
public final class C353488Hv extends 2YL {
    public float A00;
    public float A01;
    public float A02 = 1.0f;
    public float A03 = 1.0f;
    public float A04;
    public float A05;
    public int A06;
    public int A07;
    public int A08 = 1920;
    public int A09 = 1080;
    public Matrix A0A;
    public boolean A0B;
    public boolean A0C;
    public final 2Fk A0D;
    public final AnonymousClass2Fj A0E;
    public final UserSession A0F;

    public final void A00() {
        this.A0A = new Matrix();
        this.A00 = 1.0f;
        this.A01 = 1.0f;
        this.A02 = 1.0f;
        this.A03 = 1.0f;
        this.A04 = 1.0f;
        this.A05 = 1.0f;
        this.A0C = false;
    }

    public final void A01(int i, int i2, int i3, int i4) {
        this.A09 = i;
        this.A08 = i2;
        this.A07 = i3;
        this.A06 = i4;
        this.A00 = 1.0f;
        this.A01 = 1.0f;
        this.A02 = 1.0f;
        this.A03 = 1.0f;
        this.A04 = 1.0f;
        this.A05 = 1.0f;
        this.A0C = false;
    }

    public C353488Hv(UserSession userSession) {
        this.A0F = userSession;
        2Fk r0 = new 2Fk((Object) null);
        this.A0E = r0;
        this.A0D = r0;
        this.A0A = new Matrix();
        this.A00 = 1.0f;
        this.A01 = 1.0f;
        this.A04 = 1.0f;
        this.A05 = 1.0f;
    }
}
