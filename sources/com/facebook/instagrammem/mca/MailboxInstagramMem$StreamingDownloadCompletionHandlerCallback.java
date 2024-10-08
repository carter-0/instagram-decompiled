package com.facebook.instagrammem.mca;

import X.0KC;
import X.AnonymousClass7TF;
import X.N2E;
import X.N2F;
import android.net.Uri;
import com.facebook.msys.mcf.MsysError;

public abstract class MailboxInstagramMem$StreamingDownloadCompletionHandlerCallback {
    private void callbackJNI(Uri uri, MsysError msysError) {
        N2E n2e = ((N2F) this).A00;
        if (msysError == null) {
            synchronized (n2e) {
                n2e.A04 = true;
            }
            return;
        }
        0KC.A0C("ArmadilloExpressStreamableDownloadResponse", AnonymousClass7TF.A0m("Closing due to error: ", msysError));
        N2E.A00(n2e);
    }
}
