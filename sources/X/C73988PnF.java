package X;

import android.content.res.Resources;

/* renamed from: X.PnF  reason: case insensitive filesystem */
public final class C73988PnF extends 0Yg implements 0sP {
    public static final C73988PnF A00 = new C73988PnF();

    public C73988PnF() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Resources resources = (Resources) obj;
        0qQ.A0B(resources, 0);
        return Boolean.valueOf(AnonymousClass7TF.A1S(resources.getConfiguration().uiMode & 48, 32));
    }
}
