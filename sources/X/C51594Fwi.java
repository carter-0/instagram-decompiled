package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;

/* renamed from: X.Fwi  reason: case insensitive filesystem */
public final class C51594Fwi implements AnonymousClass0eL, 0sJ {
    public final int A00;
    public final Object A01;

    public C51594Fwi(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.A00) {
            case 0:
                AnonymousClass8BA r0 = (AnonymousClass8BA) this.A01;
                C39890ADo aDo = (C39890ADo) obj;
                Drawable drawable = (Drawable) obj2;
                C317876nz r5 = (C317876nz) obj3;
                if (aDo == null || drawable == null || r5 == null) {
                    return null;
                }
                ((AnonymousClass8ME) r0.A1g.get()).A1H(drawable, r5, aDo);
                return null;
            case 1:
                DirectShareSheetFragment directShareSheetFragment = (DirectShareSheetFragment) this.A01;
                DirectShareSheetFragment.A0A((Bitmap) obj4, directShareSheetFragment, directShareSheetFragment.A0k.A0I);
                return null;
            default:
                Boolean bool = (Boolean) obj;
                String str = (String) obj2;
                String str2 = (String) obj3;
                String str3 = (String) obj4;
                DdZ ddZ = ((C46656Dib) this.A01).A0h;
                if (ddZ != null) {
                    ddZ.A04(bool.booleanValue(), str, str2, str3);
                }
                return C60340gF.A00;
        }
    }
}
