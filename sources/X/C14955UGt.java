package X;

import android.graphics.drawable.Drawable;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.UGt  reason: case insensitive filesystem */
public abstract class C14955UGt extends C14957UGv implements Drawable.Callback {
    public String A0J() {
        return ((C16076Uo3) this).A0G;
    }

    public void A0K(ImageUrl imageUrl, String str, String str2) {
        C16076Uo3.A01((Drawable) null, imageUrl, (C16076Uo3) this, str, str2);
    }

    public void A0L(Integer num, boolean z) {
        long j;
        float f;
        C16076Uo3 uo3 = (C16076Uo3) this;
        Integer num2 = uo3.A07;
        if (num != num2) {
            uo3.A07 = num;
            if (z) {
                j = 300;
            } else {
                j = 0;
            }
            U0Z u0z = uo3.A05;
            if (!(u0z instanceof C16077Uo4)) {
                if (u0z instanceof C16078Uo5) {
                    C16078Uo5 uo5 = (C16078Uo5) u0z;
                    if (uo5.A05 != num) {
                        uo5.A05 = num;
                        uo5.A01 = uo5.A00;
                        uo5.A04 = System.currentTimeMillis();
                        uo5.A03 = j;
                        float f2 = 1.2666317f;
                        if (num.intValue() != 0) {
                            f2 = 1.0f;
                        }
                        uo5.A02 = f2;
                        uo5.invalidateSelf();
                    }
                } else {
                    C16079Uo6 uo6 = (C16079Uo6) u0z;
                    uo6.A0D = num;
                    if (C51967G9n.A03(num, 0) != 1) {
                        f = uo6.A01;
                    } else {
                        f = uo6.A00;
                    }
                    if (uo6.A0S && num == AnonymousClass05K.A00) {
                        f *= 1.5f;
                    }
                    float f3 = f + (uo6.A0H * 2.0f);
                    if (f3 != uo6.A02) {
                        uo6.A05 = j;
                        uo6.A02 = f3;
                        uo6.A01 = uo6.A03;
                        if (j == 0) {
                            uo6.A07 = -1;
                            uo6.A03 = f3;
                        } else {
                            uo6.A07 = System.currentTimeMillis();
                        }
                        C16079Uo6.A01(uo6);
                    }
                }
            }
            Integer num3 = uo3.A07;
            Integer num4 = AnonymousClass05K.A0C;
            if (num3 == num4 || num2 == num4) {
                uo3.A01 = System.currentTimeMillis();
                uo3.A05();
            }
        }
    }
}
