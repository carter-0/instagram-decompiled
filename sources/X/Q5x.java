package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;

public final class Q5x extends BroadcastReceiver {
    public RSQ A00;

    public final void onReceive(Context context, Intent intent) {
        Uri uri;
        int A03 = C66580MXl.A03(this, context, intent, -1035343889);
        Bundle extras = intent.getExtras();
        if (!(this.A00 == null || extras == null)) {
            if (extras.containsKey("extra_error") && extras.getSerializable("extra_error") != null) {
                extras.getSerializable("extra_error");
            } else if (!(!extras.containsKey("extra_uri") || extras.getParcelable("extra_uri") == null || (uri = (Uri) extras.getParcelable("extra_uri")) == null)) {
                SOG.A06.A00 = uri;
                Bitmap bitmap = SCW.A00;
                if (bitmap == null) {
                    C7375Q9j q9j = SCW.A01;
                    if (q9j != null) {
                        q9j.setImageURI(uri);
                        SCW.A01.invalidate();
                    }
                } else {
                    SCW.A00(context, bitmap);
                }
            }
        }
        AnonymousClass0fD.A0E(522721513, A03, intent);
    }
}
