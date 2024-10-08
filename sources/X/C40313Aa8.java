package X;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: X.Aa8  reason: case insensitive filesystem */
public final class C40313Aa8 implements B2Y {
    public final /* synthetic */ AnonymousClass8XG A00;

    public C40313Aa8(AnonymousClass8XG r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean CWQ(Object obj) {
        return 0qQ.A0K(this.A00.A01, obj);
    }

    public final void DrP(C254673sr r4) {
        String str;
        if (r4 != null) {
            str = r4.A02;
        } else {
            str = null;
        }
        0kD.A0F("GalleryPreviewButtonController", 002.A0R("Draft cover thumbnail path load failed in GalleryPreviewButtonController#onStoryDraftSaved. info: ", str), (Throwable) null);
    }

    public final /* bridge */ /* synthetic */ void DrS(Bitmap bitmap, Object obj) {
        AnonymousClass8XG r2 = this.A00;
        r2.storyDraftThumbnailLoaderListener = null;
        AnonymousClass8XJ r1 = r2.A0B;
        Bitmap bitmap2 = bitmap;
        C348417yP r22 = new C348417yP(r2.A06, bitmap2, (float) r2.A03, (float) r2.A04, r2.A05, 0, r2.A0F);
        r1.A01 = r22;
        C252063oV r0 = r1.A02;
        r0.setVisibility(0);
        ((ImageView) r0.getView()).setImageDrawable(r22);
        2cs r3 = (2cs) AnonymousClass7TE.A14(r1.A04);
        r3.A09(C39618A2i.A01);
        r3.A06 = false;
        r3.A08(0.0d, true);
        r3.A06(0.5d);
    }
}
