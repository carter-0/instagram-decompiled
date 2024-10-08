package X;

import android.text.TextUtils;
import android.widget.ImageView;
import com.instagram.android.R;
import java.lang.ref.WeakReference;

/* renamed from: X.77k  reason: invalid class name and case insensitive filesystem */
public final class C3265977k extends AnonymousClass7DT {
    public final /* synthetic */ boolean A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3265977k(AnonymousClass7XR r1, boolean z) {
        super(r1);
        this.A00 = z;
    }

    /* renamed from: A02 */
    public final boolean A01(AnonymousClass7FU r8, C328007Db r9) {
        C300835xz r3;
        Object iaE;
        if (!this.A00) {
            C3263976p r1 = (C3263976p) r9;
            if (r1.Afl() != null) {
                ImageView Afl = r1.Afl();
                String str = r8.BSG().A01;
                String A002 = r8.BSG().A00();
                if (Afl.getTag(R.id.direct_heart_animator) != null) {
                    r3 = (C300835xz) Afl.getTag(R.id.direct_heart_animator);
                } else {
                    r3 = new C300835xz();
                    Afl.setTag(R.id.direct_heart_animator, r3);
                }
                if (Afl.getTag(R.id.direct_heart_animation_listener) != null) {
                    iaE = Afl.getTag(R.id.direct_heart_animation_listener);
                } else {
                    iaE = new C57408IaE(Afl);
                    Afl.setTag(R.id.direct_heart_animation_listener, iaE);
                }
                r3.A00(new WeakReference(iaE));
                if (!TextUtils.isEmpty(str)) {
                    Afl.setTag(R.id.direct_heart_attached_message_id, str);
                }
                if (!TextUtils.isEmpty(A002)) {
                    Afl.setTag(R.id.direct_heart_attached_message_client_context, A002);
                }
                r3.A02(false, true, true);
            }
        }
        return super.A01(r8, r9);
    }
}
