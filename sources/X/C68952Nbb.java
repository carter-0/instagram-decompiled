package X;

import com.instagram.api.schemas.CreatorSegmentation;
import com.instagram.common.session.UserSession;

/* renamed from: X.Nbb  reason: case insensitive filesystem */
public final class C68952Nbb extends AnonymousClass9HT {
    public final C2366634p A00 = A02("cache_rendered");
    public final C2366634p A01 = A02("server_fetch");
    public final C2366634p A02 = A02("server_rendered");

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68952Nbb(UserSession userSession, boolean z, boolean z2) {
        super(userSession, "pending_threads", 31791050, z, z2);
        0qQ.A0B(userSession, 1);
    }

    public final void A05() {
        super.A05();
        AnonymousClass16x AsZ = AnonymousClass0t1.A01.A01(this.A07).A03.AsZ();
        if (AsZ != null) {
            Boolean CQk = AsZ.CQk();
            if (CQk != null) {
                A0K("is_creator", CQk.booleanValue());
            }
            CreatorSegmentation Ase = AsZ.Ase();
            if (Ase != null) {
                A0J("creator_segmentation", Ase.toString());
            }
        }
    }
}
