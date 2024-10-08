package X;

import android.os.Handler;
import androidx.fragment.app.FragmentActivity;
import com.instagram.nux.activity.SignedOutFragmentActivity;

/* renamed from: X.ENi  reason: case insensitive filesystem */
public final class C47931ENi extends EB4 {
    public final /* synthetic */ SignedOutFragmentActivity A00;

    public C47931ENi(FragmentActivity fragmentActivity, AnonymousClass0aP r4, SignedOutFragmentActivity signedOutFragmentActivity) {
        String A002 = Dbj.A00();
        this.A00 = signedOutFragmentActivity;
        this.A01 = r4;
        this.A00 = fragmentActivity;
        this.A03 = true;
        this.A02 = A002;
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(-501039696);
        C47931ENi.super.onFinish();
        AnonymousClass6ST r1 = this.A00.A05;
        if (r1 != null && (r1.getOwnerActivity() == null || !r1.getOwnerActivity().isDestroyed())) {
            r1.cancel();
        }
        AnonymousClass0fD.A0A(-1182319771, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(1542189077);
        C47931ENi.super.onStart();
        AnonymousClass6ST r1 = this.A00.A05;
        if (r1 != null && !r1.isShowing()) {
            AnonymousClass0fN.A00(r1);
            new Handler().postDelayed(new C51231Fqm(this), 10000);
        }
        AnonymousClass0fD.A0A(-1860279756, A03);
    }
}
