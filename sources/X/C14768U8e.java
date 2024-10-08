package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.ProductCollection;

/* renamed from: X.U8e  reason: case insensitive filesystem */
public final class C14768U8e extends 2YL {
    public final 2Fk A00;
    public final AnonymousClass2Fj A01;
    public final C17803VgG A02;
    public final C16227Uqq A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final AnonymousClass0eM A08;
    public final 0V2 A09;
    public final C61770pa A0A;
    public final C19596WcL A0B;

    public final void A00(C18043VkR vkR, ProductCollection productCollection) {
        C17460VWn vWn;
        C17803VgG vgG = this.A02;
        0Aj A0e = AnonymousClass7TE.A0e(vgG.A00, "instagram_shopping_product_collection_picker_collection_select");
        ProductCollection productCollection2 = productCollection;
        if (A0e.isSampled()) {
            C13988Tno.A1C(A0e, vgG.A01);
            String Aoi = productCollection.Aoi();
            if (Aoi == null) {
                Aoi = "";
            }
            A0e.AAJ("product_collection_id", Aoi);
            A0e.Cgf();
        }
        C17381VTi vTi = vkR.A00().A00;
        if (vTi == null || (vWn = vTi.A00) == null) {
            throw AnonymousClass7TE.A0y();
        }
        String str = vWn.A01;
        L5B l5b = vWn.A00;
        AnonymousClass7TE.A1Z(new MH7(productCollection2, vWn, this, l5b, str, (AnonymousClass4D7) null, 21), C318116oQ.A00(this));
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.Uqq, X.Wek] */
    public C14768U8e(UserSession userSession, C17803VgG vgG, String str, String str2, String str3, String str4) {
        AnonymousClass7TG.A1O(userSession, vgG);
        this.A02 = vgG;
        this.A06 = str;
        this.A07 = str2;
        this.A04 = str3;
        this.A05 = str4;
        2Fk r2 = new 2Fk(new ULi());
        this.A01 = r2;
        05D A012 = 10D.A01(AnonymousClass05K.A00, 0, 0);
        this.A09 = A012;
        this.A00 = r2;
        this.A0A = new 0V1((C262204Co) null, A012);
        this.A08 = C13999To1.A00(userSession, 25);
        C19596WcL wcL = new C19596WcL(this, 1);
        this.A0B = wcL;
        this.A03 = new C19743Wek(userSession, wcL);
    }
}
