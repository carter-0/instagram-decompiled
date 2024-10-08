package X;

import android.app.Activity;
import android.graphics.RectF;
import com.instagram.archive.fragment.ArchiveReelMapFragment;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.model.venue.Venue;

/* renamed from: X.Upj  reason: case insensitive filesystem */
public final class C16158Upj extends AnonymousClass6UX {
    public C255773uh A00;
    public final /* synthetic */ RectF A01;
    public final /* synthetic */ ArchiveReelMapFragment A02;
    public final /* synthetic */ C16076Uo3 A03;

    public final void A09(Reel reel) {
    }

    public final void A0A(Reel reel, C255773uh r2) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16158Upj(RectF rectF, ArchiveReelMapFragment archiveReelMapFragment, C16076Uo3 uo3) {
        super((Activity) null, (C230222pE) null);
        this.A02 = archiveReelMapFragment;
        this.A03 = uo3;
        this.A01 = rectF;
    }

    public final AnonymousClass6KT A08(Reel reel, C255773uh r5) {
        RectF rectF;
        WT0 wt0 = this.A02.A01;
        if (wt0.A00) {
            rectF = (RectF) wt0.A02.get(r5.A0j);
            if (rectF == null) {
                return AnonymousClass6KT.A02();
            }
        } else {
            rectF = this.A01;
        }
        return AnonymousClass6KT.A03(rectF);
    }

    public final void A0B(Reel reel, C255773uh r5) {
        WT0 wt0 = this.A02.A01;
        if (wt0.A00) {
            wt0.A01(r5.A0j, AnonymousClass05K.A00);
        }
    }

    public final void A0C(Reel reel, C255773uh r8) {
        1Xj r5;
        String name;
        if (this.A00 != r8 && r8 != null && (r5 = r8.A0b) != null) {
            this.A00 = r8;
            Venue A24 = r5.A24();
            A24.getClass();
            C16076Uo3 uo3 = this.A03;
            String id = r5.getId();
            ImageUrl A1Q = r5.A1Q();
            if (A24.A00.getShortName() != null) {
                name = A24.A00.getShortName();
            } else {
                name = A24.A00.getName();
            }
            uo3.A0K(A1Q, id, name);
            WT0 wt0 = this.A02.A01;
            String id2 = r5.getId();
            id2.getClass();
            wt0.A02(id2, AnonymousClass05K.A00);
        }
    }
}
