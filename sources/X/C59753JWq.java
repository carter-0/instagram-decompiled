package X;

import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;

/* renamed from: X.JWq  reason: case insensitive filesystem */
public final class C59753JWq {
    public final /* synthetic */ JW8 A00;

    public C59753JWq(JW8 jw8) {
        this.A00 = jw8;
    }

    public final void A00(String str, String str2) {
        JW8 jw8 = this.A00;
        UserSession userSession = jw8.A0E;
        AnonymousClass4DH r5 = jw8.A0D;
        String str3 = "";
        0eP A1L = AnonymousClass7TE.A1L("uri", str);
        if (str2 != null) {
            str3 = str2;
        }
        AnonymousClass9PQ.A08(r5, userSession, AnonymousClass000.A00(4746), "posts", 0Yt.A06(AnonymousClass7TH.A0h("is_network", "network", A1L, AnonymousClass7TE.A1L("error_message", str3), AnonymousClass7TE.A1L("error_type", "thumbnail_load"))));
    }

    public final boolean A01(GalleryItem galleryItem) {
        JW8 jw8 = this.A00;
        JWM jwm = jw8.A0F;
        if (jwm.A07 || JW8.A06(galleryItem, jw8) || !jw8.A0M()) {
            return false;
        }
        Integer num = galleryItem.A09;
        Integer num2 = AnonymousClass05K.A01;
        if (num == num2 && galleryItem.A01()) {
            return false;
        }
        jwm.Ejh(galleryItem, true, true);
        jw8.A0H(galleryItem, num2);
        jw8.A0L(true, true);
        JW7 jw7 = jw8.A0H.A00;
        JW7.A0D(AnonymousClass514.SQUARE, jw7, true);
        JW7.A0J(jw7);
        jw7.A0y.A05(new C59933Jbx(1, true));
        AnonymousClass6SR.A01().A0I = true;
        return true;
    }
}
