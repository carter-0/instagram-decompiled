package X;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Size;
import com.instagram.common.session.UserSession;
import java.io.IOException;

public final class OZ4 {
    public static final OZ4 A00 = new Object();

    public final void A01(Context context, Size size, UserSession userSession, String str, 0sP r14, C262224Cq r15) {
        String str2 = str;
        Context context2 = context;
        Size size2 = size;
        0sP r5 = r14;
        if (182.A06(DbS.A0J(str, 3), userSession, 36328813369507429L)) {
            AnonymousClass7TE.A1Z(new MH6((Object) context2, (Object) size2, (Object) r5, str2, (AnonymousClass4D7) null, 9), r15);
            return;
        }
        Bitmap bitmap = null;
        try {
            bitmap = context.getContentResolver().loadThumbnail(0cp.A03(str), size, (CancellationSignal) null);
        } catch (IOException unused) {
        }
        r14.invoke(bitmap);
    }

    public static final /* synthetic */ Object A00(ContentResolver contentResolver, Uri uri, Size size, AnonymousClass4D7 r7) {
        1IW A0q = C51973G9u.A0q(r7);
        CancellationSignal cancellationSignal = new CancellationSignal();
        A0q.CO0(new C74182PqO(cancellationSignal, 2));
        try {
            Bitmap loadThumbnail = contentResolver.loadThumbnail(uri, size, cancellationSignal);
            0qQ.A07(loadThumbnail);
            A0q.EJ1((0sP) null, loadThumbnail);
        } catch (IOException unused) {
            A0q.EJ1((0sP) null, (Object) null);
        }
        return A0q.A0E();
    }
}
