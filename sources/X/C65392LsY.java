package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.LsY  reason: case insensitive filesystem */
public final class C65392LsY implements MSS, C66399MQf {
    public static final C65392LsY A00 = new Object();

    public final Fragment B7q(Object obj) {
        C62465KgF kgF = C62465KgF.PICK_UPLOAD_VIDEO;
        C61424K6y k6y = new C61424K6y();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putSerializable("igtv_upload_gallery_fragment_mode_arg", kgF);
        k6y.setArguments(A0a);
        return k6y;
    }
}
