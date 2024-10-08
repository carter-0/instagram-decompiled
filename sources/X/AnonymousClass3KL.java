package X;

import android.os.Build;
import java.io.File;

/* renamed from: X.3KL  reason: invalid class name */
public final class AnonymousClass3KL extends 0ng {
    public final /* synthetic */ AnonymousClass3KG A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3KL(AnonymousClass3KG r4) {
        super(58, 3, false, false);
        this.A00 = r4;
    }

    public final void run() {
        AnonymousClass3KG r6 = this.A00;
        if (!r6.A00) {
            r6.A00 = true;
            String[] strArr = AnonymousClass3KJ.A04;
            int i = 0;
            boolean z = false;
            do {
                if (new File(strArr[i]).canRead()) {
                    r6.A06[i].startWatching();
                    z = true;
                }
                i++;
            } while (i < 2);
            AnonymousClass3KH r4 = r6.A01;
            boolean A03 = C2604245p.A03(r4.A00);
            0xI A01 = 0xI.A01("ig_android_story_screenshot_directory", "screenshot_detector");
            A01.A09("screenshot_directory_exists", Boolean.valueOf(z));
            A01.A0C("phone_model", Build.MODEL);
            A01.A09("has_read_external_storage_permission", Boolean.valueOf(A03));
            C60510iO.A00(r4.A01).EFq(A01);
        }
    }
}
