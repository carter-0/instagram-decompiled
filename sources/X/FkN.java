package X;

import android.content.Context;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.List;

public final class FkN implements AnonymousClass6VG {
    public final /* synthetic */ Reel A00;
    public final /* synthetic */ AnonymousClass3BQ A01;
    public final /* synthetic */ AnonymousClass32A A02;
    public final /* synthetic */ GradientSpinnerAvatarView A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ List A06;

    public FkN(Reel reel, AnonymousClass3BQ r2, AnonymousClass32A r3, GradientSpinnerAvatarView gradientSpinnerAvatarView, List list, List list2, List list3) {
        this.A02 = r3;
        this.A03 = gradientSpinnerAvatarView;
        this.A00 = reel;
        this.A04 = list;
        this.A06 = list2;
        this.A05 = list3;
        this.A01 = r2;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, X.DfY] */
    public final void CfR(long j, boolean z) {
        GradientSpinnerAvatarView gradientSpinnerAvatarView = this.A03;
        gradientSpinnerAvatarView.A0A();
        AnonymousClass32A r4 = this.A02;
        Reel reel = this.A00;
        List list = this.A04;
        List list2 = this.A06;
        List list3 = this.A05;
        Context context = r4.A0L.getContext();
        ? obj = new Object();
        obj.A02 = gradientSpinnerAvatarView;
        obj.A00 = context;
        AnonymousClass32A.A01(reel, this.A01, r4, obj, (String) null, list, list2, list3, j, z);
    }
}
