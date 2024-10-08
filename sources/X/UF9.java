package X;

import android.view.animation.AnimationUtils;
import java.util.ArrayList;

public final class UF9 extends C14285TtJ implements C20992X8o, AnonymousClass3K5 {
    public boolean A00;
    public int A01 = 0;
    public long A02 = -1;
    public C14090Tph A03;
    public Runnable A04;
    public boolean A05;
    public final VUL A06 = new VUL();
    public final /* synthetic */ C14284TtI A07;

    public final void A02() {
        this.A00 = true;
        int i = this.A01;
        if (i == 1) {
            this.A01 = 0;
            ABI();
        } else if (i == 2) {
            this.A01 = 0;
            ABJ(this.A04);
        }
    }

    public final void Dtl(C14284TtI ttI) {
        this.A05 = true;
    }

    public UF9(C14284TtI ttI) {
        this.A07 = ttI;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Tph, X.To3] */
    private void A00() {
        float signum;
        float f;
        if (this.A03 == null) {
            VUL vul = this.A06;
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float f2 = (float) this.A02;
            int i = (vul.A00 + 1) % 20;
            vul.A00 = i;
            long[] jArr = vul.A02;
            jArr[i] = currentAnimationTimeMillis;
            float[] fArr = vul.A01;
            fArr[i] = f2;
            ? to3 = new C14001To3(new AnonymousClass3K3());
            to3.A01 = null;
            to3.A00 = Float.MAX_VALUE;
            to3.A02 = false;
            this.A03 = to3;
            C14002To4 to4 = new C14002To4();
            to4.A01(1.0f);
            to4.A02(200.0f);
            to3.A01 = to4;
            to3.A03 = f2;
            to3.A07 = true;
            to3.A06(this);
            C14090Tph tph = this.A03;
            int i2 = vul.A00;
            int i3 = i2;
            if (!(i2 == 0 && jArr[i2] == Long.MIN_VALUE)) {
                long j = jArr[i2];
                int i4 = 0;
                long j2 = j;
                while (true) {
                    long j3 = jArr[i2];
                    if (j3 == Long.MIN_VALUE) {
                        break;
                    }
                    float f3 = (float) (j - j3);
                    float abs = (float) Math.abs(j3 - j2);
                    if (f3 > 100.0f || abs > 40.0f) {
                        break;
                    }
                    if (i2 == 0) {
                        i2 = 20;
                    }
                    i2--;
                    i4++;
                    if (i4 >= 20) {
                        break;
                    }
                    j2 = j3;
                }
                if (i4 >= 2) {
                    if (i4 == 2) {
                        int i5 = i3 - 1;
                        if (i3 == 0) {
                            i5 = 19;
                        }
                        float f4 = (float) (j - jArr[i5]);
                        if (f4 != 0.0f) {
                            signum = (fArr[i3] - fArr[i5]) / f4;
                        }
                    } else {
                        int i6 = (((i3 - i4) + 20) + 1) % 20;
                        int i7 = ((i3 + 1) + 20) % 20;
                        long j4 = jArr[i6];
                        float f5 = fArr[i6];
                        int i8 = i6 + 1;
                        float f6 = 0.0f;
                        for (int i9 = i8 % 20; i9 != i7; i9 = (i9 + 1) % 20) {
                            long j5 = jArr[i9];
                            float f7 = (float) (j5 - j4);
                            if (f7 != 0.0f) {
                                float f8 = fArr[i9];
                                float f9 = (f8 - f5) / f7;
                                f6 += (f9 - ((float) (((double) Math.signum(f6)) * Math.sqrt((double) (Math.abs(f6) * 2.0f))))) * Math.abs(f9);
                                if (i9 == i8) {
                                    f6 *= 0.5f;
                                }
                                f5 = f8;
                                j4 = j5;
                            }
                        }
                        signum = (float) (((double) Math.signum(f6)) * Math.sqrt((double) (Math.abs(f6) * 2.0f)));
                    }
                    f = signum * 1000.0f;
                    tph.A04 = f;
                    tph.A00 = (float) (this.A07.A04 + 1);
                    tph.A01 = -1.0f;
                    tph.A02 = 4.0f;
                    tph.A03(4.0f * 0.75f);
                    tph.A05(new C18944WDx(this));
                }
            }
            f = 0.0f;
            tph.A04 = f;
            tph.A00 = (float) (this.A07.A04 + 1);
            tph.A01 = -1.0f;
            tph.A02 = 4.0f;
            tph.A03(4.0f * 0.75f);
            tph.A05(new C18944WDx(this));
        }
    }

    public final void A01() {
        C14284TtI ttI = this.A07;
        long j = 0;
        if (ttI.A04 == 0) {
            j = 1;
        }
        ttI.A0M(j, this.A02);
        this.A02 = j;
    }

    public final /* synthetic */ void A03(boolean z, float f) {
        C14284TtI ttI;
        XA8 xa8;
        boolean z2;
        C14284TtI ttI2;
        if (!z) {
            if (f < 1.0f) {
                C14284TtI ttI3 = this.A07;
                long j = ttI3.A04;
                ArrayList arrayList = ((UF5) ttI3).A02;
                if (0 >= arrayList.size()) {
                    ttI2 = null;
                } else {
                    ttI2 = (C14284TtI) arrayList.get(0);
                }
                ttI = ttI2.A09;
                ttI2.A09 = null;
                ttI3.A0M(-1, this.A02);
                ttI3.A0M(j, -1);
                this.A02 = j;
                Runnable runnable = this.A04;
                if (runnable != null) {
                    runnable.run();
                }
                ttI3.A0E.clear();
                if (ttI != null) {
                    xa8 = XA8.A01;
                    z2 = true;
                } else {
                    return;
                }
            } else {
                ttI = this.A07;
                xa8 = XA8.A01;
                z2 = false;
            }
            C14284TtI.A04(xa8, ttI, ttI, z2);
        }
    }

    public final void ABI() {
        if (!this.A00) {
            this.A01 = 1;
            this.A04 = null;
            return;
        }
        A00();
        this.A03.A09((float) (this.A07.A04 + 1));
    }

    public final void ABJ(Runnable runnable) {
        this.A04 = runnable;
        if (!this.A00) {
            this.A01 = 2;
            return;
        }
        A00();
        this.A03.A09(0.0f);
    }

    public final long AzM() {
        return this.A07.A04;
    }

    public final boolean CaO() {
        return this.A00;
    }

    public final void CvP(C14001To3 to3, float f, float f2) {
        C14284TtI ttI = this.A07;
        long max = Math.max(-1, Math.min(ttI.A04 + 1, Math.round((double) f)));
        ttI.A0M(max, this.A02);
        this.A02 = max;
    }

    public final void ETa(long j) {
        if (this.A03 == null) {
            long j2 = this.A02;
            if (j != j2 && this.A00) {
                if (!this.A05) {
                    if (j != 0 || j2 <= 0) {
                        long j3 = this.A07.A04;
                        if (j == j3 && j2 < j3) {
                            j = j3 + 1;
                        }
                    } else {
                        j = -1;
                    }
                    if (j != j2) {
                        this.A07.A0M(j, j2);
                        this.A02 = j;
                    }
                }
                VUL vul = this.A06;
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                int i = (vul.A00 + 1) % 20;
                vul.A00 = i;
                vul.A02[i] = currentAnimationTimeMillis;
                vul.A01[i] = (float) j;
                return;
            }
            return;
        }
        throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
    }
}
