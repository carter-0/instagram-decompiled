package X;

import com.instagram.common.gallery.Medium;
import java.io.File;

/* renamed from: X.9jY  reason: invalid class name and case insensitive filesystem */
public final class C385799jY extends 2Cn {
    public final /* synthetic */ C3511387s A00;

    public final void onFail(Exception exc) {
        0qQ.A0B(exc, 0);
        C3511387s r2 = this.A00;
        r2.A0P.Epw((Object) null);
        AnonymousClass7TF.A1K(r2, C318116oQ.A00(r2), 48);
    }

    public C385799jY(C3511387s r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        05G r1;
        AnonymousClass883 r0;
        File file = (File) obj;
        0qQ.A0B(file, 0);
        try {
            Medium A03 = C282665Eg.A03(file, 3, (int) Q0Y.A01(file).A02);
            C3511387s r2 = this.A00;
            if (r2.A0H()) {
                r2.A06 = A03;
                r2.A0M.A02(A03);
                AnonymousClass7TF.A1K(r2, C318116oQ.A00(r2), 49);
                r1 = r2.A0S;
                r0 = AnonymousClass883.LANDING_PAGE_PLAYBACK;
            } else {
                r2.A0P.Epw(A03);
                r1 = r2.A0S;
                if (r2.A0M()) {
                    r0 = AnonymousClass883.LANDING_PAGE_PLAYBACK;
                } else {
                    r0 = AnonymousClass883.BUILDER_PLAYBACK;
                }
            }
            r1.Epw(r0);
            AnonymousClass7TF.A1O(r2.A0R, true);
        } catch (IllegalArgumentException unused) {
            C3511387s r22 = this.A00;
            r22.A0P.Epw((Object) null);
            AnonymousClass7TE.A1Z(new MG6(r22, (AnonymousClass4D7) null, 0), C318116oQ.A00(r22));
        }
    }
}
