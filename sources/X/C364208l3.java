package X;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;

/* renamed from: X.8l3  reason: invalid class name and case insensitive filesystem */
public final class C364208l3 implements C364808m2 {
    public Boolean A00;
    public final boolean A01;
    public final byte[] A02;
    public final int A03;
    public final int A04;
    public final String A05;

    public final Bitmap AWY(int i, int i2, boolean z) {
        throw new UnsupportedOperationException();
    }

    public final String AvM() {
        return null;
    }

    public final int Aw4() {
        return 0;
    }

    public final byte[] BG2() {
        return this.A02;
    }

    public final Uri BZF() {
        return null;
    }

    public final boolean CW0() {
        return this.A01;
    }

    public final boolean Cdi() {
        Boolean bool = this.A00;
        if (bool == null && this.A01) {
            bool = Boolean.valueOf(AGx.A00(new InputStreamReader(new ByteArrayInputStream(this.A02))));
            this.A00 = bool;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final int getHeight() {
        return this.A03;
    }

    public final String getTitle() {
        return this.A05;
    }

    public final Uri getUri() {
        throw new UnsupportedOperationException();
    }

    public final int getWidth() {
        return this.A04;
    }

    public C364208l3(String str, byte[] bArr, int i, int i2, boolean z) {
        this.A05 = str;
        this.A04 = i;
        this.A03 = i2;
        this.A02 = bArr;
        this.A01 = z;
    }

    public final /* synthetic */ Bitmap E1R(int i, boolean z) {
        return null;
    }
}
