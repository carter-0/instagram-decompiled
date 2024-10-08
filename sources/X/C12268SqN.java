package X;

import android.content.Context;
import android.os.Bundle;
import java.util.Iterator;

/* renamed from: X.SqN  reason: case insensitive filesystem */
public final class C12268SqN implements C13720Tfl {
    public static final C13720Tfl A01 = new C12268SqN(AnonymousClass05K.A01);
    public static final C13720Tfl A02 = new C12268SqN(AnonymousClass05K.A07);
    public static final C13720Tfl A03 = new C12268SqN(AnonymousClass05K.A0j);
    public final Integer A00;

    public final Bundle APv(Context context, Bundle bundle) {
        AnonymousClass45J A0N = Pxf.A0N(context, ((AnonymousClass3RX) AnonymousClass3RD.A00).A02(), AnonymousClass45C.A00(this.A00));
        Bundle A0a = AnonymousClass7TE.A0a();
        Iterator A0t = Pxf.A0t(bundle);
        while (A0t.hasNext()) {
            String A18 = AnonymousClass7TE.A18(A0t);
            try {
                AnonymousClass3RY r0 = (AnonymousClass3RY) Enum.valueOf(AnonymousClass3RY.class, A18);
                AnonymousClass3RZ r4 = r0.A00;
                String name = r0.name();
                try {
                    r4.A04(new C12236Spq(A0a, r4, name), A0N, (Object) null, r0.A01);
                } catch (ClassCastException e) {
                    0KC.A0F("KeyValueWrapper", "preferencesToBundle got ClassCastException", e);
                }
            } catch (IllegalArgumentException e2) {
                0KC.A0L("PreferencesBasedStateHelper", "aidlBundleKey: %s not exist in FbnsAIDLConstants", e2, new Object[]{A18});
            }
        }
        return A0a;
    }

    public final void AQ1(Context context, Bundle bundle) {
        C13849TiS AR1 = Pxf.A0N(context, ((AnonymousClass3RX) AnonymousClass3RD.A00).A02(), AnonymousClass45C.A00(this.A00)).AR1();
        Iterator A0t = Pxf.A0t(bundle);
        while (A0t.hasNext()) {
            String A18 = AnonymousClass7TE.A18(A0t);
            try {
                AnonymousClass3RY r0 = (AnonymousClass3RY) Enum.valueOf(AnonymousClass3RY.class, A18);
                r0.A00.A01(bundle, AR1, r0.name(), r0.A01);
            } catch (IllegalArgumentException e) {
                0KC.A0L("PreferencesBasedStateHelper", "aidlBundleKey: %s not exist in FbnsAIDLConstants", e, new Object[]{A18});
            }
        }
        AR1.AIR("PreferencesBasedStateHelper", "PreferencesManager failed to commit bundle values");
    }

    public C12268SqN(Integer num) {
        this.A00 = num;
    }
}
