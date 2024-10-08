package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.explore.topiccluster.ExploreTopicCluster;

public final class WWG implements JSr {
    public final C62320sa A00;
    public final Context A01;
    public final FragmentActivity A02;
    public final C227252iu A03;
    public final ExploreTopicCluster A04;
    public final String A05;

    public final void AJ9(C227762js r2, C231302rO r3, C238133Ar r4) {
        0qQ.A0B(r3, 2);
        Context context = r4.getContext();
        0qQ.A07(context);
        r2.A06(r3, r4, AnonymousClass3D4.A00(context));
    }

    public final void D6y(LayoutInflater layoutInflater, ViewGroup viewGroup) {
    }

    public final void DkU() {
    }

    public final void EKZ() {
    }

    public final void configureActionBar(2da r4) {
        r4.Eu4(true);
        r4.ErT(this.A03);
        r4.setTitle(this.A04.A0A);
        String A16 = AnonymousClass7TE.A16(this.A01, 2131968370);
        AnonymousClass3JR r2 = new AnonymousClass3JR();
        r2.A06 = R.drawable.instagram_sliders_pano_outline_24;
        r2.A0M = A16;
        DbX.A19(new WB9((Object) this, 4), r2, r4);
    }

    public final void onDestroyView() {
    }

    public final void onPause() {
    }

    public final void onResume() {
    }

    public final void AJA(C227762js r5, X46 x46) {
        float A002 = (float) AnonymousClass3D4.A00(this.A01);
        r5.A04(2dZ.A0t.A03(this.A02).A0P, new C19151WNj(0), A002);
    }

    public final String ArD() {
        return this.A05;
    }

    public final float C8k() {
        return 0.0f;
    }

    public WWG(Context context, FragmentActivity fragmentActivity, C227252iu r4, ExploreTopicCluster exploreTopicCluster, C62320sa r6) {
        this.A01 = context;
        this.A02 = fragmentActivity;
        this.A04 = exploreTopicCluster;
        this.A03 = r4;
        this.A00 = r6;
        this.A05 = AnonymousClass7TE.A16(context, 2131961860);
    }
}
