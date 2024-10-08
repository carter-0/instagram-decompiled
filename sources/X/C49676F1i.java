package X;

import com.instagram.android.R;

/* renamed from: X.F1i  reason: case insensitive filesystem */
public final class C49676F1i {
    public final /* synthetic */ C53004Ggv A00;

    public C49676F1i(C53004Ggv ggv) {
        this.A00 = ggv;
    }

    public final void A00(int i) {
        String A0d = DbY.A0d(this.A00.A01.getResources(), i, R.plurals.igd_inbox_thread_batch_deletion_snack_bar_message);
        0qQ.A07(A0d);
        C310336ap A0W = DbV.A0W();
        A0W.A0H = "direct_inbox_thread_deleted";
        A0W.A0D = A0d;
        Dbb.A1Q(A0W);
    }
}
