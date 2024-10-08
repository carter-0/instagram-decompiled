package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.io.File;
import java.io.IOException;

public final class KIg extends 0ng {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ LOV A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KIg(Bitmap bitmap, LOV lov) {
        super(15, 3, true, true);
        this.A01 = lov;
        this.A00 = bitmap;
    }

    public final void run() {
        LOV lov = this.A01;
        Context context = lov.A01;
        File A012 = 0qc.A01(".jpg");
        if (A012 != null) {
            1MF.A0M(this.A00, A012);
            String A0Z = JTQ.A0Z();
            0qQ.A0B(A0Z, 0);
            AnonymousClass3Q2 A013 = AnonymousClass9T3.A01(A0Z);
            try {
                A013.A33 = A012.getCanonicalPath();
                A013.A0e(ShareType.NAMETAG_SELFIE);
                1ua r2 = lov.A04;
                r2.A0E(A013);
                28K.A00(lov.A03).A0B(context.getApplicationContext());
                r2.A0B(A013);
            } catch (IOException e) {
                0KC.A0F("SelfiePhotoManager", "Failed to post selfie media.", e);
            }
        } else {
            0KC.A0C("SelfiePhotoManager", "Unable to generate selfie photo file.");
        }
    }
}
