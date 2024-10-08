package X;

import android.graphics.Bitmap;
import android.media.ExifInterface;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.io.File;

/* renamed from: X.9jp  reason: invalid class name and case insensitive filesystem */
public final class C385969jp extends 2Cl {
    public Bitmap A00;
    public final UserSession A01;
    public final C3499582p A02;

    public final int getRunnableId() {
        return 548;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C3499482o r6 = this.A02.A02;
        AnonymousClass82Y r0 = r6.A01;
        C352218Cl A03 = r0.A03();
        if (A03 != null) {
            if (r0.A02() == null && !A03.A12) {
                File A032 = A03.A03();
                String parent = A032.getParent();
                if (parent != null) {
                    String name = A032.getName();
                    UserSession userSession = this.A01;
                    0qQ.A0A(name);
                    C364678lo.A04(this.A00, userSession, parent, name, (byte[]) null);
                    this.A00 = null;
                    if (A03.A07 != 0) {
                        ExifInterface exifInterface = new ExifInterface(A032.getAbsolutePath());
                        int i = A03.A07;
                        if (i == 0) {
                            exifInterface.setAttribute("Orientation", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
                        } else if (i == 90) {
                            exifInterface.setAttribute("Orientation", "6");
                        } else if (i == 180) {
                            exifInterface.setAttribute("Orientation", "3");
                        } else if (i == 270) {
                            exifInterface.setAttribute("Orientation", "8");
                        }
                        exifInterface.saveAttributes();
                    }
                }
            }
            C255193tj.A01(this.A01, r6, A03);
        }
        return null;
    }

    public C385969jp(UserSession userSession, C3499582p r4) {
        Bitmap bitmap;
        this.A02 = r4;
        this.A01 = userSession;
        AnonymousClass82Y r1 = r4.A02.A01;
        if (r1.A03() != null) {
            C352218Cl A03 = r1.A03();
            if (A03 != null) {
                bitmap = A03.A0C;
            } else {
                bitmap = null;
            }
            this.A00 = bitmap;
        }
    }

    public final void onFinish() {
        C385969jp.super.onFinish();
    }
}
