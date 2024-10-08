package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

public final class KRP extends NK3 {
    public static final String __redex_internal_original_name = "FeedPostExistingThreadSheetFragment";
    public C62030KWg A00;
    public C74461PvG A01 = new C65295Lqo(this);
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final boolean A04 = true;

    public final String getModuleName() {
        return "feed_post_existing_thread_sheet_fragment";
    }

    public final UserSession A01() {
        return AnonymousClass7TE.A0l(this.A03);
    }

    public final C62030KWg A02() {
        C62030KWg kWg = this.A00;
        if (kWg != null) {
            return kWg;
        }
        0qQ.A0F("repository");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C74461PvG A03() {
        return this.A01;
    }

    public final boolean A04() {
        return this.A04;
    }

    public final boolean A05() {
        return false;
    }

    public final boolean A06() {
        return false;
    }

    public KRP() {
        0Yh A0z = DbS.A0z(C60304Jj3.class);
        this.A02 = DbS.A0I(MMQ.A00(this, 15), MMQ.A00(this, 16), C66291MMa.A00((Object) null, this, 36), A0z);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-732990337);
        KRP.super.onCreate(bundle);
        this.A04 = requireArguments().getString(AnonymousClass000.A00(477));
        AnonymousClass0fD.A09(1880348568, A022);
    }
}
