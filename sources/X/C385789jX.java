package X;

import com.instagram.common.gallery.Medium;

/* renamed from: X.9jX  reason: invalid class name and case insensitive filesystem */
public final class C385789jX extends 2Cn {
    public final /* synthetic */ C362048hG A00;

    public final void onFail(Exception exc) {
        0qQ.A0B(exc, 0);
        C59689JTv.A01(this.A00.A0N, "gallery_photo_import_failed", 2131962959, 0);
    }

    public C385789jX(C362048hG r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Medium medium = (Medium) obj;
        0qQ.A0B(medium, 0);
        C362048hG r1 = this.A00;
        r1.A0w.A0E(medium, r1, false);
    }
}
