package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import org.webrtc.EglBase14Impl;

/* renamed from: X.8kx  reason: invalid class name and case insensitive filesystem */
public final class C364158kx {
    public Bitmap A00;
    public Rect A01;
    public Rect A02;
    public C363848kR A03;
    public C363858kS A04;
    public Boolean A05;
    public Float A06;
    public Float A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public Integer A0C;
    public Integer A0D;
    public Long A0E;
    public byte[] A0F;
    public byte[] A0G;
    public final int A0H;
    public final int A0I;
    public final Rect A0J;

    public final Object A00(C364178kz r3) {
        int i = r3.A00;
        switch (i) {
            case 0:
                return this.A0F;
            case 1:
                return this.A03;
            case 2:
                return this.A02;
            case 7:
                return this.A0E;
            case 8:
                return this.A0A;
            case 9:
                return this.A06;
            case 10:
                return this.A08;
            case 11:
                return this.A07;
            case 13:
                return null;
            case 14:
                return this.A04;
            case 15:
                return this.A0B;
            case 16:
                return this.A0D;
            case 17:
                return this.A05;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return this.A0C;
            case 19:
                return this.A0G;
            default:
                throw new RuntimeException(002.A0O("Failed to get photo capture value: ", i));
        }
    }

    public final void A01(C364178kz r3, Object obj) {
        int i = r3.A00;
        switch (i) {
            case 0:
                this.A0F = (byte[]) obj;
                return;
            case 1:
                this.A03 = (C363848kR) obj;
                return;
            case 2:
                this.A02 = (Rect) obj;
                return;
            case 7:
                this.A0E = (Long) obj;
                return;
            case 8:
                this.A0A = (Integer) obj;
                return;
            case 9:
                this.A06 = (Float) obj;
                return;
            case 10:
                this.A08 = (Integer) obj;
                return;
            case 11:
                this.A07 = (Float) obj;
                return;
            case 13:
                return;
            case 14:
                this.A04 = (C363858kS) obj;
                return;
            case 15:
                this.A0B = (Integer) obj;
                return;
            case 16:
                this.A0D = (Integer) obj;
                return;
            case 17:
                this.A05 = (Boolean) obj;
                return;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                this.A0C = (Integer) obj;
                return;
            case 19:
                this.A0G = (byte[]) obj;
                return;
            case 20:
                this.A09 = (Integer) obj;
                return;
            case 21:
                this.A00 = (Bitmap) obj;
                return;
            default:
                throw new RuntimeException(002.A0O("Failed to set photo capture value: ", i));
        }
    }

    public C364158kx(C363858kS r2) {
        this.A01 = (Rect) r2.A03(C363858kS.A0M);
        this.A0J = (Rect) r2.A03(C363858kS.A0N);
        this.A0I = ((Number) r2.A03(C363858kS.A0L)).intValue();
        this.A0H = ((Number) r2.A03(C363858kS.A0K)).intValue();
        this.A0F = (byte[]) r2.A04(C363858kS.A0X);
        this.A0G = (byte[]) r2.A04(C363858kS.A0b);
        this.A03 = (C363848kR) r2.A04(C363858kS.A0Y);
        this.A02 = (Rect) r2.A04(C363858kS.A0d);
        this.A0E = (Long) r2.A04(C363858kS.A0T);
        this.A0A = (Integer) r2.A04(C363858kS.A0Z);
        this.A06 = (Float) r2.A04(C363858kS.A0O);
        this.A08 = (Integer) r2.A04(C363858kS.A0P);
        this.A07 = (Float) r2.A04(C363858kS.A0V);
        r2.A04(C363858kS.A0R);
        this.A04 = (C363858kS) r2.A04(C363858kS.A0Q);
        this.A0B = (Integer) r2.A04(C363858kS.A0a);
        this.A0D = (Integer) r2.A04(C363858kS.A0e);
        this.A05 = (Boolean) r2.A04(C363858kS.A0S);
        this.A0C = (Integer) r2.A04(C363858kS.A0c);
        this.A09 = (Integer) r2.A04(C363858kS.A0U);
        this.A00 = (Bitmap) r2.A04(C363858kS.A0W);
    }

    public C364158kx(Rect rect, Rect rect2, int i, int i2) {
        this.A01 = rect;
        this.A0J = rect2;
        this.A0I = i;
        this.A0H = i2;
    }
}
