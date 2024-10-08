package X;

import android.content.DialogInterface;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;

public final class LUV implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public LUV(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A01 = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C255773uh r2;
        switch (this.A00) {
            case 0:
                JW7 jw7 = (JW7) this.A03;
                GalleryItem galleryItem = (GalleryItem) this.A02;
                JW8 jw8 = jw7.A14;
                jw8.A0F.Ejh(galleryItem, true, true);
                jw8.A0H(galleryItem, AnonymousClass05K.A00);
                jw7.A1K.remove(galleryItem.A0A);
                ((AnonymousClass3Q2) this.A01).A1J = null;
                return;
            case 1:
                2YL A0H = DbS.A0H(((E7P) this.A03).A02);
                Object obj = this.A02;
                AnonymousClass7TE.A1Z(new MHF(obj, A0H, (AnonymousClass4D7) null, 44), C318116oQ.A00(A0H));
                return;
            case 2:
                0hq r5 = (0hq) this.A01;
                if (r5 != null && (r2 = (C255773uh) this.A02) != null) {
                    C61427K7c k7c = (C61427K7c) this.A03;
                    new W01(k7c.requireContext(), r5, AnonymousClass7TE.A0l(k7c.A0H), r2).A03(new LV8(k7c, 16), JTT.A0g(k7c.A0E).A03);
                    return;
                }
                return;
            case 3:
                UserSession userSession = (UserSession) this.A03;
                C64373Lap.A02(C368278sM.OTHER, userSession, (1Xj) this.A02, (String) null);
                LJr.A00(userSession).A01(userSession, "upsell", true);
                C66461MSp mSp = (C66461MSp) this.A01;
                if (mSp != null) {
                    mSp.afterSelection(true);
                    return;
                }
                return;
            default:
                C64373Lap.A02(C368278sM.ACCEPT, (UserSession) this.A03, (1Xj) this.A02, (String) null);
                C66461MSp mSp2 = (C66461MSp) this.A01;
                if (mSp2 != null) {
                    mSp2.afterSelection(false);
                    return;
                }
                return;
        }
    }
}
