package X;

import com.instagram.brandedcontent.disclosure.BrandedContentDisclosureBaseViewModel;

/* renamed from: X.LdU  reason: case insensitive filesystem */
public final class C64527LdU implements G5Q {
    public final /* synthetic */ K82 A00;
    public final /* synthetic */ BrandedContentDisclosureBaseViewModel A01;

    public C64527LdU(K82 k82, BrandedContentDisclosureBaseViewModel brandedContentDisclosureBaseViewModel) {
        this.A01 = brandedContentDisclosureBaseViewModel;
        this.A00 = k82;
    }

    public final void Dwt() {
        BrandedContentDisclosureBaseViewModel brandedContentDisclosureBaseViewModel = this.A01;
        K82 k82 = this.A00;
        String str = k82.A00;
        if (str != null) {
            brandedContentDisclosureBaseViewModel.A07(k82, str);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
