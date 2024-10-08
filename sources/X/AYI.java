package X;

import android.graphics.Bitmap;
import com.instagram.common.gallery.Medium;
import java.util.Collections;
import java.util.List;

public final class AYI implements C348257y9 {
    public final /* synthetic */ C362048hG A00;
    public final /* synthetic */ List A01;

    public final boolean CWP(Medium medium) {
        return true;
    }

    public final void DrQ(Bitmap bitmap, Medium medium, boolean z) {
        AnonymousClass7TF.A1B(medium, 0, bitmap);
        C362048hG r2 = this.A00;
        C362048hG.A07(bitmap, r2, medium.A07);
        AnonymousClass8XA r1 = r2.A0w;
        List unmodifiableList = Collections.unmodifiableList(this.A01);
        0qQ.A07(unmodifiableList);
        r1.A0J(r2, unmodifiableList);
    }

    public AYI(C362048hG r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public final void DLY(Medium medium, String str) {
        C362048hG r2 = this.A00;
        AnonymousClass8XA r1 = r2.A0w;
        List unmodifiableList = Collections.unmodifiableList(this.A01);
        0qQ.A07(unmodifiableList);
        r1.A0J(r2, unmodifiableList);
    }
}
