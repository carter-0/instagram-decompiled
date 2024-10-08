package X;

import android.graphics.Bitmap;
import com.instagram.common.gallery.metadata.ImmersiveMediaFields;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class M7W implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ AnonymousClass7JA A01;

    public M7W(Bitmap bitmap, AnonymousClass7JA r2) {
        this.A00 = bitmap;
        this.A01 = r2;
    }

    public final void run() {
        Bitmap bitmap = this.A00;
        if (bitmap == null) {
            AnonymousClass7JB.A00(this.A01);
            return;
        }
        AnonymousClass7JA r2 = this.A01;
        UserSession userSession = (UserSession) r2.A02.get();
        if (userSession != null) {
            C352218Cl A03 = C39908AIz.A03(bitmap, (C376649Iu) null, userSession, 2RR.A01(), AnonymousClass45F.A04("direct_temp_photo", ".jpg"), 0, false);
            AnonymousClass7IG r22 = (AnonymousClass7IG) r2.A01.get();
            if (r22 != null) {
                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                MediaUploadMetadata mediaUploadMetadata = new MediaUploadMetadata((ImmersiveMediaFields) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false);
                0qQ.A0B(concurrentLinkedQueue, 2);
                A03.A01().A00(mediaUploadMetadata);
                A03.A01();
                11Z.A02(new MAG((C53401GnY) null, r22, (C381779cJ) null, (AnonymousClass3Q2) null, A03, (Long) null, 0, false));
            }
        }
    }
}
