package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import java.lang.ref.WeakReference;

/* renamed from: X.77j  reason: invalid class name and case insensitive filesystem */
public final class C3265877j implements AnonymousClass7DY {
    public final boolean A00;

    public final C3265977k A00(AnonymousClass7XR r3) {
        return new C3265977k(r3, this.A00);
    }

    public final /* bridge */ /* synthetic */ void Cy2(Object obj, Object obj2) {
        C328007Db r8 = (C328007Db) obj;
        AnonymousClass7FU r9 = (AnonymousClass7FU) obj2;
        if (!this.A00) {
            C3263976p r1 = (C3263976p) r8;
            if (r1.Afl() != null) {
                ImageView Afl = r1.Afl();
                View BJd = r8.BJd();
                String str = r9.BSG().A01;
                String A002 = r9.BSG().A00();
                if (Afl.getTag(R.id.direct_heart_animator) != null && ((TextUtils.isEmpty(str) || Afl.getTag(R.id.direct_heart_attached_message_id) == null || !Afl.getTag(R.id.direct_heart_attached_message_id).equals(str)) && (TextUtils.isEmpty(A002) || Afl.getTag(R.id.direct_heart_attached_message_client_context) == null || !Afl.getTag(R.id.direct_heart_attached_message_client_context).equals(A002)))) {
                    ((C300835xz) Afl.getTag(R.id.direct_heart_animator)).A00((WeakReference) null);
                    Afl.setScaleX(0.0f);
                    Afl.setScaleY(0.0f);
                    Afl.setAlpha(0.0f);
                    Afl.setTag(R.id.direct_heart_attached_message_id, (Object) null);
                    Afl.setTag(R.id.direct_heart_attached_message_client_context, (Object) null);
                }
                BJd.addOnAttachStateChangeListener(new I9y(BJd, Afl));
            }
        }
    }

    public C3265877j(boolean z) {
        this.A00 = z;
    }

    public final /* bridge */ /* synthetic */ void D77(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void DuS(Object obj) {
    }
}
