package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import org.webrtc.EglBase14Impl;

/* renamed from: X.8kS  reason: invalid class name and case insensitive filesystem */
public final class C363858kS {
    public static final C364168ky A0K = new C364168ky(6);
    public static final C364168ky A0L = new C364168ky(5);
    public static final C364168ky A0M = new C364168ky(4);
    public static final C364168ky A0N = new C364168ky(3);
    public static final C364178kz A0O = new C364178kz(9);
    public static final C364178kz A0P = new C364178kz(10);
    public static final C364178kz A0Q = new C364178kz(14);
    public static final C364178kz A0R = new C364178kz(13);
    public static final C364178kz A0S = new C364178kz(17);
    public static final C364178kz A0T = new C364178kz(7);
    public static final C364178kz A0U = new C364178kz(20);
    public static final C364178kz A0V = new C364178kz(11);
    public static final C364178kz A0W = new C364178kz(21);
    public static final C364178kz A0X = new C364178kz(0);
    public static final C364178kz A0Y = new C364178kz(1);
    public static final C364178kz A0Z = new C364178kz(8);
    public static final C364178kz A0a = new C364178kz(15);
    public static final C364178kz A0b = new C364178kz(19);
    public static final C364178kz A0c = new C364178kz(18);
    public static final C364178kz A0d = new C364178kz(2);
    public static final C364178kz A0e = new C364178kz(16);
    public final int A00;
    public final int A01;
    public final Bitmap A02;
    public final Rect A03;
    public final Rect A04;
    public final Rect A05;
    public final C363848kR A06;
    public final C363858kS A07;
    public final Boolean A08;
    public final Float A09;
    public final Float A0A;
    public final Integer A0B;
    public final Integer A0C;
    public final Integer A0D;
    public final Integer A0E;
    public final Integer A0F;
    public final Integer A0G;
    public final Long A0H;
    public final byte[] A0I;
    public final byte[] A0J;

    public static void A01(Rect rect, int i) {
        if (i == 90 || i == 270) {
            rect.set(0, 0, rect.height(), rect.width());
        }
    }

    public final Rect A02(int i) {
        Rect rect = this.A05;
        rect.getClass();
        if (i != 0) {
            A01(this.A04, i);
            A01(this.A03, i);
            A01(rect, i);
        }
        Rect rect2 = this.A04;
        Rect A002 = A00(rect2, ((float) rect.width()) / ((float) rect.height()));
        return A00(A00(this.A03, ((float) rect2.width()) / ((float) rect2.height())), ((float) A002.width()) / ((float) A002.height()));
    }

    public final Object A03(C364168ky r3) {
        int i;
        int i2 = r3.A00;
        if (i2 == 3) {
            return this.A04;
        }
        if (i2 == 4) {
            return this.A03;
        }
        if (i2 != 5) {
            i = this.A00;
        } else {
            i = this.A01;
        }
        return Integer.valueOf(i);
    }

    public final Object A04(C364178kz r3) {
        int i = r3.A00;
        switch (i) {
            case 0:
                return this.A0I;
            case 1:
                return this.A06;
            case 2:
                return this.A05;
            case 3:
                return this.A04;
            case 7:
                return this.A0H;
            case 8:
                return this.A0D;
            case 9:
                return this.A09;
            case 10:
                return this.A0B;
            case 11:
                return this.A0A;
            case 13:
                return null;
            case 14:
                return this.A07;
            case 15:
                return this.A0E;
            case 16:
                return this.A0G;
            case 17:
                return this.A08;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return this.A0F;
            case 19:
                return this.A0J;
            case 20:
                return this.A0C;
            case 21:
                return this.A02;
            default:
                throw new RuntimeException(002.A0O("Invalid photo capture result key: ", i));
        }
    }

    public C363858kS(C364158kx r2) {
        this.A03 = r2.A01;
        this.A04 = r2.A0J;
        this.A01 = r2.A0I;
        this.A00 = r2.A0H;
        this.A0I = r2.A0F;
        this.A0J = r2.A0G;
        this.A06 = r2.A03;
        this.A05 = r2.A02;
        this.A0H = r2.A0E;
        this.A0D = r2.A0A;
        this.A09 = r2.A06;
        this.A0B = r2.A08;
        this.A0A = r2.A07;
        this.A07 = r2.A04;
        this.A0E = r2.A0B;
        this.A0G = r2.A0D;
        this.A08 = r2.A05;
        this.A0F = r2.A0C;
        this.A0C = r2.A09;
        this.A02 = r2.A00;
    }

    public static Rect A00(Rect rect, float f) {
        int round;
        int i;
        int i2;
        int height;
        float width = ((float) rect.width()) / ((float) rect.height());
        if (width < f) {
            height = Math.round((width / f) * ((float) rect.height()));
            round = rect.left;
            i = rect.top + Math.round(((float) (rect.height() - height)) / 2.0f);
            i2 = rect.width() + round;
        } else {
            int round2 = Math.round((f / width) * ((float) rect.width()));
            round = rect.left + Math.round(((float) (rect.width() - round2)) / 2.0f);
            i = rect.top;
            i2 = round2 + round;
            height = rect.height();
        }
        return new Rect(round, i, i2, height + i);
    }
}
