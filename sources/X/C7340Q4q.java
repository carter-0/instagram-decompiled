package X;

import java.io.File;
import java.util.List;

/* renamed from: X.Q4q  reason: case insensitive filesystem */
public final class C7340Q4q implements C13834Ti9 {
    public C13835TiA A00;
    public RF9 A01;
    public final /* synthetic */ C11222SFw A02;

    public C7340Q4q(C11222SFw sFw, RF9 rf9, C13835TiA tiA) {
        this.A02 = sFw;
        this.A01 = rf9;
        this.A00 = tiA;
    }

    public final void D0g(SJL sjl) {
        this.A00.D0g(sjl);
    }

    public final void D5E(List list) {
        this.A00.onSuccess();
    }

    public final /* bridge */ /* synthetic */ void DDE(SJL sjl, Object obj) {
        this.A00.DDC((AnonymousClass4ZS) obj, sjl);
    }

    public final void DaK(double d) {
        this.A00.DiX(this.A01, (float) d);
    }

    public final void DiY(File file, long j) {
        C13835TiA tiA;
        int i;
        RF9 rf9 = this.A01;
        RF9 rf92 = RF9.Video;
        if (rf9 == rf92) {
            tiA = this.A00;
            i = this.A02.A02;
        } else {
            rf92 = RF9.Audio;
            if (rf9 == rf92) {
                tiA = this.A00;
                i = this.A02.A00;
            } else {
                rf92 = RF9.Mixed;
                if (rf9 == rf92) {
                    tiA = this.A00;
                    i = this.A02.A01;
                } else {
                    return;
                }
            }
        }
        tiA.DiZ(rf92, file, i, j);
    }

    public final void Dia(SRW srw) {
        RF9 rf9 = this.A01;
        if (rf9 == RF9.Video) {
            C13835TiA tiA = this.A00;
            C11222SFw sFw = this.A02;
            tiA.Dib(srw, rf9, sFw.A02);
            sFw.A02++;
        } else if (rf9 == RF9.Audio) {
            C13835TiA tiA2 = this.A00;
            C11222SFw sFw2 = this.A02;
            tiA2.Dib(srw, rf9, sFw2.A00);
            sFw2.A00++;
        } else if (rf9 == RF9.Mixed) {
            C13835TiA tiA3 = this.A00;
            C11222SFw sFw3 = this.A02;
            tiA3.Dib(srw, rf9, sFw3.A01);
            sFw3.A01++;
        }
    }

    public final void onStart() {
        C11222SFw sFw = this.A02;
        C7334Q4k q4k = sFw.A0A;
        if (q4k != null && (q4k instanceof C7967QeF)) {
            RF9 rf9 = this.A01;
            if (rf9 == RF9.Video) {
                sFw.A02 = 0;
            } else if (rf9 == RF9.Audio) {
                sFw.A00 = 0;
            } else if (rf9 == RF9.Mixed) {
                sFw.A01 = 0;
            }
        }
        this.A00.onStart();
    }
}
