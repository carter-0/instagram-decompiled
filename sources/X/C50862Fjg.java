package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fjg  reason: case insensitive filesystem */
public final class C50862Fjg implements G6H {
    public final Context A00;
    public final UserSession A01;
    public final AnonymousClass07i A02;

    public final void CI0(Uri uri, Bundle bundle) {
        Context context = this.A00;
        AnonymousClass07i r2 = this.A02;
        1NY A0a = AnonymousClass7TG.A0a(this.A01);
        Dba.A1H(A0a, "archive/reel/schedule_bulk_deletion_for_corrupted_archive_media/");
        1OC A0K = DbW.A0K(A0a);
        C47696EDf.A01(A0K, this, 14);
        1ES.A00(context, r2, A0K);
    }

    public C50862Fjg(Context context, AnonymousClass07i r2, UserSession userSession) {
        this.A00 = context;
        this.A02 = r2;
        this.A01 = userSession;
    }
}
