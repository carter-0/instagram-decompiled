package X;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.Fragment;

/* renamed from: X.Fwh  reason: case insensitive filesystem */
public final class C51593Fwh implements AnonymousClass0eL, 0sK {
    public final int A00;
    public final Object A01;

    public C51593Fwh(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.A00) {
            case 0:
                AnonymousClass8ME r0 = (AnonymousClass8ME) ((AnonymousClass8BA) this.A01).A1g.get();
                r0.A1H((Drawable) obj2, (C317876nz) obj3, (C39890ADo) obj);
                return null;
            case 1:
                ((Fragment) this.A01).onActivityResult(AnonymousClass7TE.A0M(obj), AnonymousClass7TE.A0M(obj2), (Intent) obj3);
                return C60340gF.A00;
            default:
                int A0M = AnonymousClass7TE.A0M(obj2);
                return ((AnonymousClass3BV) this.A01).A06(((C250973mM) obj).A0H, (String) obj3, A0M);
        }
    }
}
