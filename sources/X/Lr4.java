package X;

import androidx.fragment.app.FragmentActivity;

public final class Lr4 implements C66487MTq {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ JYH A01;
    public final /* synthetic */ boolean A02;

    public Lr4(FragmentActivity fragmentActivity, JYH jyh, boolean z) {
        this.A02 = z;
        this.A01 = jyh;
        this.A00 = fragmentActivity;
    }

    public final void onFailure() {
    }

    public final void onSuccess() {
        FragmentActivity fragmentActivity;
        Runnable m4k;
        if (this.A02) {
            new LNv(this.A01.A00).A00("igd_nudity_detection_model_loading_nux");
            fragmentActivity = this.A00;
            m4k = new M4J(fragmentActivity);
        } else {
            fragmentActivity = this.A00;
            m4k = new M4K(fragmentActivity);
        }
        fragmentActivity.runOnUiThread(m4k);
    }
}
