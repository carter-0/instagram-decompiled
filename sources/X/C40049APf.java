package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.APf  reason: case insensitive filesystem */
public final class C40049APf implements AnonymousClass2gO {
    public final /* synthetic */ C359318cb A00;

    public C40049APf(C359318cb r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        C359318cb r1 = this.A00;
        r1.A0G();
        FragmentActivity fragmentActivity = r1.A0X;
        C59689JTv.A0B(fragmentActivity, "fetch_media_failed");
        r1.A0A.A02 = true;
        fragmentActivity.finish();
    }
}
