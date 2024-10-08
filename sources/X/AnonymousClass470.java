package X;

import java.lang.ref.WeakReference;

/* renamed from: X.470  reason: invalid class name */
public final /* synthetic */ class AnonymousClass470 implements 0sP {
    public final /* synthetic */ C250583lh A00;

    public /* synthetic */ AnonymousClass470(C250583lh r1) {
        this.A00 = r1;
    }

    public final Object invoke(Object obj) {
        boolean z;
        C308836Vu r2;
        C250583lh r1 = this.A00;
        1yX r8 = (1yX) obj;
        C242693Vo r22 = r8.A01;
        AnonymousClass3WR r0 = r22.A01;
        if (r0 != null && r0.A0U) {
            AnonymousClass41D Bef = r1.A05.Bef(r22.A02);
            if (Bef != null) {
                WeakReference weakReference = r8.A00;
                if (weakReference != null) {
                    r2 = (C308836Vu) weakReference.get();
                } else {
                    r2 = null;
                }
                if (Bef.A01 > 2) {
                    if (r2 != null) {
                        r2.A00(true);
                        r8.A00 = null;
                    }
                } else if (Bef.A02 >= 512) {
                    if (r2 != null) {
                        r2.A00(true);
                        r8.A00 = null;
                    }
                } else if (Bef.A03 > 0) {
                    if (r2 != null) {
                        r2.A00(false);
                        r8.A00 = null;
                    }
                }
            }
            z = true;
            return Boolean.valueOf(z);
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
