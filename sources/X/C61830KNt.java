package X;

import com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType;

/* renamed from: X.KNt  reason: case insensitive filesystem */
public final class C61830KNt extends C65179Loi {
    public PublishScreenCategoryType A00;
    public final AnonymousClass4DH A01;
    public final KOD A02;

    public final void CsQ() {
        AnonymousClass4DH r0 = this.A01;
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r0.getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C66171MGi(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 2), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61830KNt(AnonymousClass4DH r1, KOD kod, C66576MXh mXh, PublishScreenCategoryType publishScreenCategoryType) {
        super(r1, mXh, publishScreenCategoryType);
        AnonymousClass7TG.A1P(r1, mXh);
        this.A01 = r1;
        this.A00 = publishScreenCategoryType;
        this.A02 = kod;
    }
}
