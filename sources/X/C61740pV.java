package X;

import android.app.Application;
import com.facebook.endtoend.EndToEnd;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.0pV  reason: invalid class name and case insensitive filesystem */
public final class C61740pV implements AnonymousClass0NA {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C61740pV(AnonymousClass025 r2, AnonymousClass0A7 r3) {
        this.A00 = 9;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final /* bridge */ /* synthetic */ Object ALF(0NJ r18) {
        long j;
        long j2;
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                return new 0JI((Application) this.A01, (AnonymousClass0dB) this.A02, A00(r18));
            case 1:
                return new 0JI((Application) this.A01, (AnonymousClass0dB) this.A02, A00(r18));
            case 2:
                return new 0JI((Application) this.A01, (AnonymousClass0dB) this.A02, A00(r18));
            case 3:
                0Pd A05 = r18.A05();
                return new 0Tm((Application) this.A01, r18.A04(), A05, (AnonymousClass0eK) this.A02);
            case 4:
                return new 0JI((Application) this.A01, (AnonymousClass0dB) this.A02, A00(r18));
            case 5:
                return new 0JI((Application) this.A01, (AnonymousClass0dB) this.A02, A00(r18));
            case 6:
                return new 0JI((Application) this.A01, (AnonymousClass0dB) this.A02, A00(r18));
            case 7:
                return new 0JI((Application) this.A01, (AnonymousClass0dB) this.A02, A00(r18));
            case 8:
                return new 0JI((Application) this.A01, (AnonymousClass0dB) this.A02, A00(r18));
            case 9:
                0Pd A052 = r18.A05();
                0Lb A04 = r18.A04();
                if (EndToEnd.A05()) {
                    j = 12000;
                    j2 = 1;
                    i = 1;
                    i2 = Integer.MAX_VALUE;
                } else {
                    j = 120000;
                    j2 = 1000;
                    i = 50;
                    i2 = 10;
                }
                return new AnonymousClass0Cc(A04, (AnonymousClass025) this.A01, new AnonymousClass0TF(i, i2, j, j2), (AnonymousClass0A7) this.A02, A052);
            case 10:
                return new 0JI((Application) this.A01, (AnonymousClass0dB) this.A02, A00(r18));
            case 11:
                return new AnonymousClass05R((Application) this.A02, r18.A04(), r18.A05(), (AnonymousClass0eK) this.A01);
            default:
                return new 0JI((Application) this.A01, (AnonymousClass0dB) this.A02, A00(r18));
        }
    }

    public static 0PJ A00(0NJ r0) {
        return (0PJ) r0.A06().get();
    }

    public C61740pV(Application application, AnonymousClass0eK r2, int i) {
        this.A00 = i;
        if (3 - i != 0) {
            this.A02 = application;
            this.A01 = r2;
            return;
        }
        this.A01 = application;
        this.A02 = r2;
    }

    public C61740pV(Application application, AnonymousClass0dB r2, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 1:
            case 7:
            case 8:
            case 10:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                this.A01 = application;
                this.A02 = r2;
                return;
            default:
                this.A01 = application;
                this.A02 = r2;
                return;
        }
    }
}
