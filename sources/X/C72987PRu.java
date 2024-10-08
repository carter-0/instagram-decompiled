package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.PRu  reason: case insensitive filesystem */
public final class C72987PRu implements G83 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ C66965Mfy A02;

    public final /* synthetic */ void onFinish() {
    }

    public final /* synthetic */ void onStart() {
    }

    public C72987PRu(Context context, FragmentActivity fragmentActivity, C66965Mfy mfy) {
        this.A01 = fragmentActivity;
        this.A02 = mfy;
        this.A00 = context;
    }

    public final void DEH(Integer num) {
        C59689JTv.A00(C61190ls.A00(this.A01), this.A00.getString(2131974093), "something_went_wrong", 0);
    }

    public final void onSuccess() {
        C59689JTv.A07(C61190ls.A00(this.A01), 2131952113);
        this.A02.A03.CgA();
    }
}
