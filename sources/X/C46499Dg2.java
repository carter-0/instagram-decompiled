package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;

/* renamed from: X.Dg2  reason: case insensitive filesystem */
public final class C46499Dg2 implements 1wn {
    public final C66633Ma2 A00;

    public C46499Dg2(C66633Ma2 ma2) {
        0qQ.A0B(ma2, 1);
        this.A00 = ma2;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1825541481);
        int A032 = AnonymousClass0fD.A03(28988071);
        C66633Ma2 ma2 = this.A00;
        FragmentActivity activity = ma2.A1J.getActivity();
        if (activity != null) {
            String A0d = DbY.A0d(activity.getResources(), 1, R.plurals.igd_inbox_thread_batch_deletion_snack_bar_message);
            0qQ.A07(A0d);
            ma2.A0p();
            02m r2 = 02m.A0p;
            C310336ap A0W = DbV.A0W();
            A0W.A0H = "direct_inbox_thread_deleted";
            A0W.A0D = A0d;
            A0W.A06();
            if (!ma2.A0v().Bk6().isEmpty()) {
                DbW.A0q(activity, A0W, 2131963786);
                A0W.A0L = true;
                FdJ.A00(A0W, this, r2, 6);
            }
            Dbb.A1Q(A0W);
            AnonymousClass0fD.A0A(-1332490647, A032);
            AnonymousClass0fD.A0A(-1696755637, A03);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0A(-678259299, A032);
        throw A0y;
    }
}
