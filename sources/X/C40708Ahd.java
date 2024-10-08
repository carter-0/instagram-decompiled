package X;

import android.os.Bundle;
import com.facebook.cameracore.mediapipeline.services.locale.LocaleDataSource;
import java.util.List;

/* renamed from: X.Ahd  reason: case insensitive filesystem */
public final class C40708Ahd implements B38 {
    public String A00 = "";
    public final List A01 = AnonymousClass7TE.A1C();

    public final void FKT(Bundle bundle) {
    }

    public final Bundle BH4() {
        return AnonymousClass7TG.A0P("locale", this.A00, AnonymousClass7TF.A0x("serviceType", 46));
    }

    public final void CMw(C371698yt r7) {
        String str;
        LocaleDataSource localeDataSource;
        if (r7 != null) {
            C371628yi r1 = C371888zI.A01;
            if (C371698yt.A01(r7, r1)) {
                C371888zI r0 = (C371888zI) r7.A02(r1);
                if (r0 == null || (localeDataSource = r0.A00) == null) {
                    str = null;
                } else {
                    str = localeDataSource.getDeviceLocaleIdentifier();
                }
                String valueOf = String.valueOf(str);
                this.A00 = valueOf;
                0qQ.A0B(valueOf, 0);
                AnonymousClass7TH.A0c("commandType", AnonymousClass05K.A00, this.A01, AnonymousClass7TF.A0x("serviceType", 46), AnonymousClass7TE.A1L("locale", valueOf));
            }
        }
    }

    public final List EzR() {
        List list = this.A01;
        if (list.isEmpty()) {
            return null;
        }
        List A0a = 00k.A0a(list);
        list.clear();
        return A0a;
    }
}
