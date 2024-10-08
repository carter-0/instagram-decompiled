package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.io.File;
import java.io.IOException;

public final class KIf extends 0ng {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ C64126LOx A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KIf(Bitmap bitmap, C64126LOx lOx) {
        super(15, 3, true, true);
        this.A01 = lOx;
        this.A00 = bitmap;
    }

    public final void run() {
        C64126LOx lOx = this.A01;
        Context context = lOx.A03;
        File A012 = 0qc.A01(".jpg");
        if (A012 != null) {
            Bitmap bitmap = this.A00;
            if (bitmap != null) {
                1MF.A0M(bitmap, A012);
            }
            AnonymousClass3Q2 A013 = AnonymousClass9T3.A01(JTQ.A0Z());
            try {
                A013.A33 = A012.getCanonicalPath();
                A013.A0e(ShareType.NAMETAG_BACKGROUND_IMAGE);
                1ua r2 = lOx.A06;
                r2.A0E(A013);
                28K.A00(lOx.A05).A0B(DbT.A05(context));
                r2.A0B(A013);
            } catch (IOException e) {
                0KC.A0F("BackgroundImageManager", "Failed to post background image media.", e);
            }
        } else {
            0KC.A0C("BackgroundImageManager", "Unable to generate background image file.");
        }
    }
}
