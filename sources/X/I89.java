package X;

import android.content.DialogInterface;

public final class I89 implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass32L A00;

    public I89(AnonymousClass32L r1) {
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass32L r2 = this.A00;
        GX8 gx8 = r2.A08;
        if (gx8 == null) {
            0qQ.A0F("exploreMultiHideLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        C51975G9x.A18(AnonymousClass7TE.A0e(gx8.A00, "discover_media_chaining_alt_topic_nudge"), "ig_explore_controls_multi_hide_unsaved_changes_ignored");
        C321536uL.A00 = false;
        C321536uL.A00(r2.getSession());
        DbX.A1J(r2);
    }
}
