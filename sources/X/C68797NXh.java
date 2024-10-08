package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.user.model.User;

/* renamed from: X.NXh  reason: case insensitive filesystem */
public final class C68797NXh extends AnonymousClass7PJ {
    public User A00;
    public final 17i A01;

    public final void A01() {
        this.A00 = null;
        super.A01();
    }

    public final /* bridge */ /* synthetic */ void A03(C331837So r4) {
        C330807Oi r42 = (C330807Oi) r4;
        0qQ.A0B(r42, 0);
        User user = this.A00;
        User A02 = this.A01.A02(r42.A03.A03);
        if (user == null ? A02 == null : user.equals(A02)) {
            if (r42.A04 == null) {
                return;
            }
        }
        this.A00 = A02;
        super.A03(r42);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68797NXh(LayoutInflater layoutInflater, ViewGroup viewGroup, C66894Mec mec, 17i r7) {
        super(new C67977My1(DbT.A0D(layoutInflater, viewGroup, R.layout.thread_message_typing_indicator, false), mec.A02), mec);
        C51972G9s.A1D(mec, r7);
        this.A01 = r7;
    }
}
