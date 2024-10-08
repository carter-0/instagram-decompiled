package X;

import android.content.Context;
import java.util.Map;

/* renamed from: X.9nM  reason: invalid class name and case insensitive filesystem */
public final class C388149nM extends AnonymousClass8D8 implements C3493580b {
    public final C16143UpU A00;
    public final Map A01;

    public C388149nM(Context context, AnonymousClass8BA r11, AnonymousClass80U r12, C40590Aee aee) {
        super(r11, (AnonymousClass8BH) null, (Integer) null, 111, false, false);
        C16143UpU upU = new C16143UpU(context, aee);
        this.A00 = upU;
        r12.A7w(this);
        this.A01 = AnonymousClass8D8.A00(C317876nz.A1U, upU);
    }

    public final /* bridge */ /* synthetic */ void Dmx(Object obj, Object obj2, Object obj3) {
        if (obj == AnonymousClass80V.CAPTURE && obj2 == AnonymousClass80V.PRE_CAPTURE_AR_EFFECT_TRAY) {
            this.A00.A00.A01();
        }
    }
}
