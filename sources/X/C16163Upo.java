package X;

import android.app.Activity;
import android.graphics.RectF;
import android.widget.ListView;
import com.instagram.archive.fragment.ArchiveReelFragment;
import com.instagram.model.reels.Reel;

/* renamed from: X.Upo  reason: case insensitive filesystem */
public final class C16163Upo extends C16164Upp {
    public final /* synthetic */ ArchiveReelFragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16163Upo(Activity activity, ListView listView, ArchiveReelFragment archiveReelFragment, C2366034j r4, C230222pE r5) {
        super(activity, listView, r4, r5);
        this.A00 = archiveReelFragment;
    }

    public final AnonymousClass6KT A08(Reel reel, C255773uh r5) {
        WT0 wt0 = this.A00.A01;
        if (!wt0.A00) {
            return super.A08(reel, r5);
        }
        RectF rectF = (RectF) wt0.A02.get(r5.A0j);
        if (rectF != null) {
            return AnonymousClass6KT.A03(rectF);
        }
        return AnonymousClass6KT.A02();
    }

    public final void A0B(Reel reel, C255773uh r5) {
        super.A0B(reel, r5);
        this.A00.A01.A01(r5.A0j, AnonymousClass05K.A01);
    }

    public final void A0C(Reel reel, C255773uh r5) {
        super.A0C(reel, r5);
        if (r5.A11()) {
            this.A00.A01.A02(r5.A0j, AnonymousClass05K.A01);
        }
    }
}
