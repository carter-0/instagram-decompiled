package X;

import android.app.Activity;

/* renamed from: X.Lb5  reason: case insensitive filesystem */
public final class C64388Lb5 implements 2Kw {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C64388Lb5(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
    }

    public final void invoke(Throwable th) {
        C62320sa r0;
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
                ((WGU) obj).A0I((C16678UzE) this.A02, "whatapp_link_detection_fetch", "Fail to fetch WA link detection");
                ((AnonymousClass2hV) this.A03).apply(AnonymousClass7TE.A0u());
                return;
            case 1:
                LPO.A01((Activity) obj, "Sticker save failed", C66579MXk.A00(236), (C62320sa) null, 2131968772);
                r0 = (C62320sa) this.A02;
                if (r0 == null) {
                    return;
                }
                break;
            default:
                LPO.A01((Activity) obj, "Sticker save failed", C66579MXk.A00(236), (C62320sa) null, 2131968772);
                r0 = (C62320sa) this.A02;
                break;
        }
        r0.invoke();
    }
}
