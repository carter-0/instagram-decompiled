package X;

import android.content.DialogInterface;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;

public final class I8A implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass348 A00;

    public I8A(AnonymousClass348 r1) {
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass348 r0 = this.A00;
        C49805F7r.A01(r0.A00.requireActivity(), 28D.A4A, r0.A01, (PendingRecipient) null, true, true);
    }
}
