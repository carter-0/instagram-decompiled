package X;

import android.os.Bundle;

public final class OOA {
    public C70636OEh A00;
    public final Bundle A01 = AnonymousClass7TE.A0a();

    public final void A02(String str) {
        0qQ.A0B(str, 0);
        this.A01.putString("DirectReplyModalFragment.content_id", str);
    }

    public final void A03(String str) {
        0qQ.A0B(str, 0);
        this.A01.putString("DirectReplyModalFragment.reel_id", str);
    }

    public final void A04(String str) {
        0qQ.A0B(str, 0);
        this.A01.putString("DirectReplyModalFragment.reel_item_id", str);
    }

    public final void A05(String str) {
        0qQ.A0B(str, 0);
        this.A01.putString("DirectReplyModalFragment.subtitle_string", str);
    }

    public final void A06(String str) {
        0qQ.A0B(str, 0);
        this.A01.putString("DirectReplyModalFragment.viewer_user_id", str);
    }

    public final NK2 A00() {
        NK2 nk2 = new NK2();
        Bundle bundle = this.A01;
        C320236s2.A01(bundle, "IgSessionManager.SESSION_TOKEN_KEY");
        C320236s2.A01(bundle, "DirectReplyModalFragment.entry_point");
        C320236s2.A01(bundle, "DirectReplyModalFragment.source_module_name");
        nk2.setArguments(bundle);
        nk2.A02 = this.A00;
        return nk2;
    }

    public final void A01(String str) {
        this.A01.putString("DirectReplyModalFragment.entry_point", str);
    }

    public final void A07(String str, String str2) {
        AnonymousClass7TG.A1N(str, str2);
        Bundle bundle = this.A01;
        bundle.putString("DirectReplyModalFragment.interactive_sticker_id", str);
        bundle.putString("DirectReplyModalFragment.interactive_sticker_type", str2);
    }
}
