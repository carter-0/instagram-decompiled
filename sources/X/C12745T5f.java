package X;

import android.os.Handler;
import com.facebook.smartcapture.logging.AuthenticityUploadMedium;
import com.instagram.authenticity.uploader.AuthenticityMediaServiceUploader$upload$2;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.T5f  reason: case insensitive filesystem */
public final class C12745T5f implements C13664TeV {
    public boolean A00;
    public final Handler A01 = AnonymousClass7TF.A0D();
    public final UserSession A02;
    public final Map A03 = AnonymousClass7TE.A1H();

    public C12745T5f(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
    }

    public final void FMX(C11002S4w s4w, Long l, String str, String str2, List list) {
        1iA r7;
        int i;
        String str3 = str;
        boolean A1X = DbW.A1X(str3);
        this.A03.clear();
        this.A00 = A1X;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass59G r0 = (AnonymousClass59G) it.next();
            String str4 = (String) r0.A00;
            File file = (File) r0.A01;
            String str5 = (String) r0.A02;
            int size = list.size();
            if (0qQ.A0K(str5, AuthenticityUploadMedium.SELFIE_VIDEO_NATIVE.getValue())) {
                r7 = 1iA.A0I;
            } else if (0qQ.A0K(str5, AuthenticityUploadMedium.SELFIE_PHOTO_NATIVE.getValue())) {
                r7 = 1iA.A0J;
            } else {
                r7 = 1iA.A0H;
            }
            String A0Z = JTQ.A0Z();
            String A022 = AnonymousClass6SR.A02();
            0qQ.A07(A022);
            C12075SmU A0e = JTR.A0e(this.A02);
            if (0qQ.A0K(str5, AuthenticityUploadMedium.SELFIE_VIDEO_NATIVE.getValue())) {
                i = 655;
            } else {
                i = 677;
                if (0qQ.A0K(str5, AuthenticityUploadMedium.SELFIE_PHOTO_NATIVE.getValue())) {
                    i = 1164305889;
                }
            }
            AnonymousClass7TE.A1Z(new AuthenticityMediaServiceUploader$upload$2(A0e, this, s4w, r7, file, A0Z, str3, str5, A022, str4, (AnonymousClass4D7) null, size), AnonymousClass1HX.A01(i, 3));
        }
    }
}
