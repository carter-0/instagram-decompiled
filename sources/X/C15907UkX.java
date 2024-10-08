package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.List;

/* renamed from: X.UkX  reason: case insensitive filesystem */
public final class C15907UkX extends AnonymousClass5MM {
    public UOC A00;
    public int A01;
    public C18614Vv7 A02;
    public U17 A03;
    public C306576Mr A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final int A08;
    public final Context A09;
    public final Typeface A0A;
    public final Interpolator A0B = new DecelerateInterpolator(2.0f);
    public final C18439Vri A0C;
    public final Integer A0D;
    public final Integer A0E;

    public final void A08(UOC uoc) {
        0qQ.A0B(uoc, 0);
        if (!0qQ.A0K(this.A00, uoc)) {
            this.A00 = uoc;
            A01(uoc.A07);
        }
    }

    public final void A09(C306576Mr r2) {
        0qQ.A0B(r2, 0);
        this.A04 = r2;
        A00();
    }

    public final void draw(Canvas canvas) {
        float f;
        0qQ.A0B(canvas, 0);
        C18614Vv7 vv7 = this.A02;
        String str = "phraseProgressCalculator";
        if (vv7 != null) {
            int i = vv7.A01;
            if (i != -1) {
                Integer num = vv7.A02;
                if (num != null) {
                    if (num == AnonymousClass05K.A01) {
                        f = 0.0f;
                    } else {
                        f = vv7.A00;
                    }
                    float interpolation = this.A0B.getInterpolation(f);
                    U17 u17 = this.A03;
                    str = "scrollableLyricsDrawable";
                    if (u17 != null) {
                        int A032 = u17.A03(i);
                        U17 u172 = this.A03;
                        if (u172 != null) {
                            int A022 = (int) 0mi.A02(interpolation, 0.0f, 1.0f, (float) A032, (float) u172.A03(i + 1));
                            U17 u173 = this.A03;
                            if (u173 != null) {
                                u173.A04(A022);
                                U17 u174 = this.A03;
                                if (u174 != null) {
                                    u174.draw(canvas);
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            } else {
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        U17 u17 = this.A03;
        if (u17 == null) {
            0qQ.A0F("scrollableLyricsDrawable");
            throw AnonymousClass00P.createAndThrow();
        } else {
            u17.setBounds(rect);
        }
    }

    private final void A00() {
        Paint paint;
        U17 u17 = this.A03;
        if (u17 != null) {
            u17.A05(C18789W1r.A01(this.A04, this.A01));
            U17 u172 = this.A03;
            if (u172 != null) {
                Integer A032 = C18789W1r.A03(this.A04, this.A01);
                if (A032 != null) {
                    paint = new Paint();
                    paint.setColor(A032.intValue());
                } else {
                    paint = null;
                }
                u172.A0D = paint;
                u172.invalidateSelf();
                return;
            }
        }
        0qQ.A0F("scrollableLyricsDrawable");
        throw AnonymousClass00P.createAndThrow();
    }

    private final void A01(List list) {
        int A012;
        Paint paint;
        C18439Vri vri = this.A0C;
        AnonymousClass7TG.A1N(list, vri);
        C19497Waj waj = new C19497Waj(vri, list);
        C18614Vv7 vv7 = new C18614Vv7(waj, 0, 0, 750);
        this.A02 = vv7;
        vv7.A02(0);
        U17 u17 = this.A03;
        Rect rect = null;
        if (u17 != null) {
            rect = u17.getBounds();
        }
        float f = this.A05;
        U17 u172 = new U17(waj, f, (int) (0.25f * f));
        this.A03 = u172;
        if (u172.A08 != 3) {
            u172.A08 = 3;
            U17.A01(u172);
        }
        U17 u173 = this.A03;
        if (u173 != null) {
            Typeface typeface = this.A0A;
            TextPaint textPaint = u173.A0I;
            textPaint.setTypeface(typeface);
            textPaint.setFakeBoldText(false);
            u173.A06 = C17039VFn.A00(textPaint);
            u173.invalidateSelf();
            U17 u174 = this.A03;
            if (u174 != null) {
                TextPaint textPaint2 = u174.A0I;
                textPaint2.setTextSize(f);
                u174.A06 = C17039VFn.A00(textPaint2);
                u174.invalidateSelf();
                U17 u175 = this.A03;
                if (u175 != null) {
                    Integer num = this.A0E;
                    if (num != null) {
                        A012 = num.intValue();
                    } else {
                        A012 = C18789W1r.A01(this.A04, this.A01);
                    }
                    u175.A05(A012);
                    U17 u176 = this.A03;
                    if (u176 != null) {
                        Integer num2 = this.A0D;
                        if (num2 == null && (num2 = C18789W1r.A03(this.A04, this.A01)) == null) {
                            paint = null;
                        } else {
                            paint = new Paint();
                            paint.setColor(num2.intValue());
                        }
                        u176.A0D = paint;
                        u176.invalidateSelf();
                        U17 u177 = this.A03;
                        if (u177 != null) {
                            u177.A05 = (int) this.A06;
                            u177.A0C = (int) this.A07;
                            u177.invalidateSelf();
                            U17 u178 = this.A03;
                            if (u178 != null) {
                                u178.A02 = 0.5f;
                                u178.invalidateSelf();
                                U17 u179 = this.A03;
                                if (u179 != null) {
                                    u179.A03 = 0.85f;
                                    u179.invalidateSelf();
                                    if (rect != null) {
                                        U17 u1710 = this.A03;
                                        if (u1710 != null) {
                                            u1710.setBounds(rect);
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F("scrollableLyricsDrawable");
        throw AnonymousClass00P.createAndThrow();
    }

    public final int A04() {
        return this.A01;
    }

    public final UOC A05() {
        return this.A00;
    }

    public final C306576Mr A06() {
        return this.A04;
    }

    public final void A07(int i) {
        this.A01 = i;
        A00();
    }

    public final /* bridge */ /* synthetic */ C2802350v BzV() {
        return this.A00;
    }

    public final void EXC(int i, int i2) {
        C18614Vv7 vv7 = this.A02;
        if (vv7 == null) {
            0qQ.A0F("phraseProgressCalculator");
            throw AnonymousClass00P.createAndThrow();
        }
        vv7.A02(i);
        invalidateSelf();
    }

    public final int getDurationInMs() {
        return this.A00.A01;
    }

    public final int getIntrinsicHeight() {
        U17 u17 = this.A03;
        if (u17 != null) {
            return (u17.A06 * 9) + (u17.A0G * 2) + (((int) this.A07) * 2 * 3);
        }
        0qQ.A0F("scrollableLyricsDrawable");
        throw AnonymousClass00P.createAndThrow();
    }

    public final int getIntrinsicWidth() {
        return this.A08 + ((int) (this.A06 * 2.0f));
    }

    public final void setAlpha(int i) {
        U17 u17 = this.A03;
        if (u17 == null) {
            0qQ.A0F("scrollableLyricsDrawable");
            throw AnonymousClass00P.createAndThrow();
        } else {
            u17.setAlpha(i);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        U17 u17 = this.A03;
        if (u17 == null) {
            0qQ.A0F("scrollableLyricsDrawable");
            throw AnonymousClass00P.createAndThrow();
        } else {
            u17.setColorFilter(colorFilter);
        }
    }

    public C15907UkX(Context context, UOC uoc, C18439Vri vri) {
        int A002;
        int A003;
        this.A09 = context;
        int A004 = (int) 0nA.A00(context, 300.0f);
        this.A08 = A004;
        float A005 = 0nA.A00(context, 29.0f);
        this.A05 = A005;
        this.A07 = 0nA.A00(context, 4.0f);
        this.A06 = 0nA.A00(context, 16.0f);
        Typeface A022 = AnonymousClass0qo.A00(context).A02(0qm.A0z);
        this.A0A = A022;
        this.A04 = uoc.A03;
        this.A01 = uoc.A00;
        this.A0E = uoc.A05;
        this.A0D = uoc.A04;
        if (vri != null) {
            A002 = vri.A00;
            A003 = vri.A01;
        } else {
            A002 = C18789W1r.A00(A022, A005, A004, 3);
            A003 = C18789W1r.A00(A022, A005, A004, 3);
        }
        this.A0C = new C18439Vri(A003, A002);
        A01(uoc.A07);
        this.A00 = uoc;
    }
}
