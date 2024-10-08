package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.instagram.common.gallery.Draft;

/* renamed from: X.LjP  reason: case insensitive filesystem */
public final class C64863LjP implements C262424Dq {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C64863LjP(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void CyE(Bitmap bitmap) {
        Object obj;
        switch (this.A00) {
            case 0:
                if (bitmap != null) {
                    C60581Jnq jnq = (C60581Jnq) this.A02;
                    C64785Li1 li1 = (C64785Li1) this.A01;
                    int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                    C62150Kb5 kb5 = jnq.A01;
                    kb5.DrR(bitmap, new Draft((Long) null, String.valueOf(li1.A00), (String) null, (String) null, 0, false, true, false, false));
                    LY8.A00(kb5, 11, li1, jnq);
                    return;
                }
                return;
            case 3:
                ((C262364Dk) this.A02).A02(this);
                ((AnonymousClass4D7) this.A01).resumeWith(bitmap);
                return;
            case 4:
                C20565Wui wui = ((C17545VZy) this.A01).A02;
                if (wui != null) {
                    wui.A07(new C20256Wnv(bitmap, this));
                }
                obj = (Drawable) this.A02;
                break;
            default:
                ((C241063Ns) this.A01).A0T(C60340gF.A00);
                obj = this.A02;
                break;
        }
        ((C262364Dk) obj).A02(this);
    }
}
