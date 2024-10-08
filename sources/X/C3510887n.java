package X;

import android.content.Context;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;

/* renamed from: X.87n  reason: invalid class name and case insensitive filesystem */
public final class C3510887n extends AnonymousClass2uL {
    public float A00 = 1.0f;
    public AnonymousClass4M3 A01;
    public int A02;
    public int A03;
    public final AnonymousClass4DH A04;
    public final UserSession A05;

    public final void A03(Context context, C39712A6d a6d, C242423Ua r18) {
        AnonymousClass3OB r1;
        Context context2 = context;
        0qQ.A0B(context2, 0);
        AnonymousClass4M3 r2 = this.A01;
        if (r2 != null) {
            r1 = ((AnonymousClass4M1) r2).A0M;
        } else {
            r1 = null;
        }
        if (r1 != AnonymousClass3OB.STOPPING) {
            C39712A6d a6d2 = a6d;
            this.A02 = a6d2.A01;
            AnonymousClass4M1 r22 = r2;
            if (r2 == null) {
                AnonymousClass4M1 A002 = AnonymousClass4M0.A00(context2, this.A05, (C252323ov) null, this, this.A04.getModuleName());
                A002.Ech(true);
                A002.A0N = this;
                A002.EjF(AnonymousClass4M7.FILL);
                this.A01 = A002;
                r22 = A002;
            }
            r22.EyP("unknown", true);
            if (((AnonymousClass4M1) r22).A0M == AnonymousClass3OB.IDLE) {
                int i = this.A03;
                Medium medium = a6d2.A02;
                C263754Nf r8 = new C263754Nf((Object) medium, i);
                float f = a6d2.A00;
                boolean z = a6d2.A03;
                String moduleName = this.A04.getModuleName();
                0qQ.A0B(moduleName, 6);
                r22.E4H(new C263794Nj(r18, new C263414Lx(false, false, false, false), (AnonymousClass3WR) null, r8, medium.A0X, moduleName, f, -1, i, z));
            }
            this.A03 = 0;
        }
    }

    public final void A05(String str) {
        AnonymousClass4M3 r0;
        if (A00() && (r0 = this.A01) != null) {
            r0.E2q(str, false);
        }
    }

    private final boolean A00() {
        AnonymousClass4M3 r0 = this.A01;
        if (r0 == null) {
            return false;
        }
        AnonymousClass3OB r1 = ((AnonymousClass4M1) r0).A0M;
        if (r1 == null) {
            r1 = AnonymousClass3OB.IDLE;
        }
        if (r1 == AnonymousClass3OB.PAUSED || r1 == AnonymousClass3OB.PREPARED) {
            return true;
        }
        return false;
    }

    public final void A01() {
        AnonymousClass4M3 r1;
        AnonymousClass4M3 r0 = this.A01;
        if (r0 != null) {
            r0.EKy(0, false);
        }
        if (A00() && (r1 = this.A01) != null) {
            r1.E2q("autoplay", true);
        }
    }

    public final void A04(String str) {
        AnonymousClass4M3 r2 = this.A01;
        if (r2 != null) {
            AnonymousClass3OB r1 = ((AnonymousClass4M1) r2).A0M;
            if (r1 == null) {
                r1 = AnonymousClass3OB.IDLE;
            }
            if (r1 == AnonymousClass3OB.PLAYING) {
                r2.E21(str);
            }
        }
    }

    public final void onProgressUpdate(int i, int i2, boolean z) {
        AnonymousClass4M3 r1;
        int i3 = this.A02;
        if (i3 != 0 && i > i3 && (r1 = this.A01) != null) {
            r1.EKy(0, false);
        }
    }

    public C3510887n(AnonymousClass4DH r2, UserSession userSession) {
        this.A04 = r2;
        this.A05 = userSession;
    }

    public final void A02(int i) {
        if (!A00()) {
            this.A03 = i;
        }
        AnonymousClass4M3 r1 = this.A01;
        if (r1 != null) {
            r1.EKy(i, false);
        }
    }
}
