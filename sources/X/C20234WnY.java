package X;

import android.app.Activity;
import android.net.Uri;
import java.io.File;

/* renamed from: X.WnY  reason: case insensitive filesystem */
public final /* synthetic */ class C20234WnY implements Runnable {
    public final /* synthetic */ AnonymousClass35K A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ C20234WnY(AnonymousClass35K r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void run() {
        int i;
        AnonymousClass35K r5 = this.A00;
        String str = this.A01;
        Activity activity = r5.A00;
        if (activity instanceof AnonymousClass2ZQ) {
            i = ((AnonymousClass2ZQ) activity).BGs(C226412gl.A00(r5.A01).A00());
        } else {
            i = -1;
        }
        r5.A02.ExY(activity, Uri.fromFile(new File(str)), i);
    }
}
