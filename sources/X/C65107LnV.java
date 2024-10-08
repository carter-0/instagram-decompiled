package X;

import android.graphics.drawable.Drawable;
import android.text.Spannable;

/* renamed from: X.LnV  reason: case insensitive filesystem */
public final class C65107LnV implements AnonymousClass5MI {
    public C376699Iz A00;
    public final int A01;
    public final int A02;
    public final Drawable A03;
    public final Spannable A04;
    public final C62529KhL A05;
    public final Integer A06;
    public final String A07;

    public C65107LnV(AnonymousClass5MI r2) {
        0qQ.A0B(r2, 1);
        this.A07 = r2.getId();
        this.A03 = r2.AfT();
        this.A02 = r2.Byn();
        this.A01 = r2.B1e();
        this.A04 = r2.C4k();
        this.A00 = r2.CAA();
        this.A05 = r2.CAX();
        this.A06 = r2.Azv();
    }

    public final void Eog(int i, int i2) {
    }

    public final Drawable AfT() {
        return this.A03;
    }

    public final Integer Azv() {
        return this.A06;
    }

    public final int B1e() {
        return this.A01;
    }

    public final int Byn() {
        return this.A02;
    }

    public final Spannable C4k() {
        return this.A04;
    }

    public final C376699Iz CAA() {
        return this.A00;
    }

    public final C62529KhL CAX() {
        return this.A05;
    }

    public final String getId() {
        return this.A07;
    }

    public final void EpP(C376699Iz r1) {
        this.A00 = r1;
    }
}
