package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.List;

/* renamed from: X.SIi  reason: case insensitive filesystem */
public final class C11271SIi {
    public int A00;
    public int A01;
    public int A02;
    public Bitmap A03;
    public QHN A04;
    public QHP A05;
    public QHP A06;
    public QHP A07;
    public boolean A08;
    public boolean A09;
    public C13916TlI A0A;
    public boolean A0B;
    public final Handler A0C;
    public final Sk4 A0D;
    public final C11264SHy A0E;
    public final C13813Thg A0F;
    public final List A0G = AnonymousClass7TE.A1C();

    public final void A02(QHP qhp) {
        int i;
        this.A0B = false;
        if (this.A08) {
            Pxe.A1N(this.A0C, qhp, 2);
        } else if (!this.A09) {
            this.A07 = qhp;
        } else {
            if (qhp.A00 != null) {
                Bitmap bitmap = this.A03;
                if (bitmap != null) {
                    this.A0F.E5H(bitmap);
                    this.A03 = null;
                }
                QHP qhp2 = this.A05;
                this.A05 = qhp;
                List list = this.A0G;
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    Q6Z q6z = (Q6Z) ((TZp) list.get(size));
                    Drawable.Callback callback = q6z.getCallback();
                    while (callback instanceof Drawable) {
                        callback = ((Drawable) callback).getCallback();
                    }
                    if (callback == null) {
                        q6z.stop();
                        q6z.invalidateSelf();
                    } else {
                        q6z.invalidateSelf();
                        C11271SIi sIi = q6z.A09.A00;
                        QHP qhp3 = sIi.A05;
                        if (qhp3 != null) {
                            i = qhp3.A01;
                        } else {
                            i = -1;
                        }
                        if (i == sIi.A0E.A07.A02 - 1) {
                            q6z.A00++;
                        }
                        int i2 = q6z.A01;
                        if (i2 != -1 && q6z.A00 >= i2) {
                            q6z.stop();
                        }
                    }
                }
                if (qhp2 != null) {
                    Pxe.A1N(this.A0C, qhp2, 2);
                }
            }
            A00(this);
        }
    }

    public C11271SIi(Bitmap bitmap, SUv sUv, C11264SHy sHy, C13916TlI tlI, int i, int i2) {
        C13813Thg thg = sUv.A01;
        Q6I q6i = sUv.A00;
        Sk4 A012 = SUv.A01(q6i.getBaseContext());
        Sk4 A013 = SUv.A01(q6i.getBaseContext());
        SUv sUv2 = A013.A02;
        QHN A0M = new QHN(A013.A01, sUv2, A013, Bitmap.class).A0I(Sk4.A0A).A0I(new TA3().A0E(C10112Rmo.A02).A04().A03().A05(i, i2));
        this.A0D = A012;
        Handler handler = new Handler(Looper.getMainLooper(), new C11454SVs(this));
        this.A0F = thg;
        this.A0C = handler;
        this.A04 = A0M;
        this.A0E = sHy;
        A01(bitmap, tlI);
    }

    public static void A00(C11271SIi sIi) {
        int i;
        int i2;
        if (sIi.A09 && !sIi.A0B) {
            QHP qhp = sIi.A07;
            if (qhp != null) {
                sIi.A07 = null;
                sIi.A02(qhp);
                return;
            }
            sIi.A0B = true;
            C11264SHy sHy = sIi.A0E;
            C10829Ryp ryp = sHy.A07;
            int i3 = ryp.A02;
            if (i3 <= 0 || (i2 = sHy.A02) < 0) {
                i = 0;
            } else if (i2 < i3) {
                i = ((C10828Ryo) ryp.A0A.get(i2)).A01;
            } else {
                i = -1;
            }
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) i);
            int i4 = (sHy.A02 + 1) % sHy.A07.A02;
            sHy.A02 = i4;
            sIi.A06 = new QHP(sIi.A0C, i4, uptimeMillis);
            QHN A002 = QHN.A00(sIi.A04.A0I(new TA3().A08(new C11853Shf(Double.valueOf(Math.random())))), sHy);
            QHN.A02(A002, A002, sIi.A06, C10061Rly.A01);
        }
    }

    public final void A01(Bitmap bitmap, C13916TlI tlI) {
        C9217RTu.A00(tlI);
        this.A0A = tlI;
        C9217RTu.A00(bitmap);
        this.A03 = bitmap;
        this.A04 = this.A04.A0I(new TA3().A0D(tlI, true));
        this.A00 = C11424STg.A01(bitmap);
        this.A02 = bitmap.getWidth();
        this.A01 = bitmap.getHeight();
    }
}
