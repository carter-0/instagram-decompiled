package X;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;

public final class QKR extends SlZ {
    public static QKR A01;
    public final C10378RrF A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QKR(Context context, Intent intent, C340027ka r9, C340037kb r10) {
        super(intent, r9, r10);
        Object obj;
        Intent intent2 = intent;
        SHI shi = SHI.A04;
        if (shi != null) {
            obj = shi.A01.A02;
        } else {
            obj = null;
        }
        String valueOf = String.valueOf(obj);
        FragmentActivity activity = r9.getActivity();
        if (activity != null) {
            this.A00 = new S3I(intent2, this.A03, new C11536Sbx(this, 0), activity, valueOf);
            this.A00 = new C10378RrF(context, r9);
            return;
        }
        throw AnonymousClass7TE.A0w("Required value was null.");
    }
}
