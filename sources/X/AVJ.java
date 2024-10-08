package X;

import android.content.Context;
import android.graphics.Rect;

public abstract class AVJ implements C252203oj {
    public final Context A00;
    public final 1Xj A01;
    public final C279284yO A02;

    public final void DmD(2cs r1) {
    }

    public final void DmE(2cs r1) {
    }

    public final C39718A6j A00(Rect rect, AnonymousClass804 r18, C369458un r19, C369458un r20, int i, int i2) {
        float f;
        AD5 ad5;
        AD5 ad52;
        AD5 ad53;
        AnonymousClass804 r8 = r18;
        C369458un r7 = r20;
        if (r8 instanceof C339987kV) {
            C369458un r9 = r19;
            if (this instanceof C388679oD) {
                float f2 = ((C339987kV) r8).A00;
                if (r19 == null || r20 == null) {
                    ad53 = new AD5(0.0f, 0.0f, 1.0f, 0.0f);
                } else {
                    ad53 = new AD5(rect.exactCenterX(), rect.exactCenterY(), f2, C39822AAt.A00(r7.A05, r9.A05));
                }
                return new C39718A6j(new ADA(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 207, true, true), ad53, (int) 0nA.A04(this.A00, 12), 0);
            } else if (r19 == null || r20 == null) {
                return null;
            } else {
                return new C39718A6j(new ADA(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 207, true, true), new AD5(r9.A01 + rect.exactCenterX(), r9.A02 + rect.exactCenterY(), r9.A06, C39822AAt.A00(r7.A05, r9.A05)), (int) 0nA.A04(this.A00, 12), 0);
            }
        } else {
            int i3 = i;
            int i4 = i2;
            if (r8 instanceof AnonymousClass803) {
                int ordinal = ((AnonymousClass803) r8).A00.ordinal();
                if (ordinal == 0) {
                    C279284yO r5 = this.A02;
                    if (r20 == null) {
                        ad5 = new AD5(0.0f, 0.0f, 1.0f, 0.0f);
                    } else {
                        ad5 = new AD5(r7.A03, r7.A04, 1.0f, C39822AAt.A00(r7.A05, 0.0f));
                    }
                    ADA ada = new ADA(((float) i3) / 4.0f, 0.0f, 0.5f, 0.5f, 0.0f, 242, false, false);
                    int i5 = 255;
                    if (r5 instanceof AnonymousClass80O) {
                        i5 = 0;
                    }
                    return new C39718A6j(ada, ad5, 0, i5);
                } else if (ordinal == 1) {
                    1Xj r6 = this.A01;
                    if (r20 == null) {
                        ad52 = new AD5(0.0f, 0.0f, 1.0f, 0.0f);
                    } else {
                        ad52 = new AD5(r7.A03, r7.A04, 1.0f, C39822AAt.A00(r7.A05, 0.0f));
                    }
                    return new C39718A6j(C394899ys.A00(r6, i4), ad52, 0, 0);
                } else {
                    throw AnonymousClass7TE.A1K();
                }
            } else if (r8 instanceof C340007kX) {
                C339997kW r0 = ((C340007kX) r8).A00;
                AD5 ad54 = new AD5(0.0f, 0.0f, 0.0f, 0.0f);
                if (r0.ordinal() == 0) {
                    return new C39718A6j(new ADA(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 207, true, true), ad54, 0, 0);
                }
                throw AnonymousClass7TE.A1K();
            } else if (!(r8 instanceof C365058mS)) {
                return null;
            } else {
                Context context = this.A00;
                C365058mS r82 = (C365058mS) r8;
                if (r20 == null) {
                    return null;
                }
                float f3 = (float) i4;
                float f4 = (r82.A00 * f3) / ((float) r7.A07);
                float f5 = (float) r7.A0A;
                float f6 = f4 * f5;
                float f7 = (float) i3;
                if (r82.A02) {
                    f = r82.A01;
                } else {
                    f = 1.0f;
                }
                if (f6 > f * f7) {
                    f4 = (r82.A01 * f7) / f5;
                }
                return new C39718A6j(new ADA(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 255, false, false), new AD5(f7 / 2.0f, f3 / 2.0f, f4, C39822AAt.A00(r7.A05, 0.0f)), (int) 0nA.A04(context, 12), 255);
            }
        }
    }

    public final void DmB(2cs r3) {
        if (this instanceof C388679oD) {
            ((C388679oD) this).A05 = true;
        }
    }

    public final void DmC(2cs r3) {
        if (this instanceof C388679oD) {
            ((C388679oD) this).A05 = false;
        }
    }

    public AVJ(Context context, C279284yO r2, 1Xj r3) {
        this.A00 = context;
        this.A01 = r3;
        this.A02 = r2;
    }
}
