package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.List;

/* renamed from: X.Fki  reason: case insensitive filesystem */
public final class C50903Fki implements G7K {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ 1Xj A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public final void onCancel() {
        throw AnonymousClass00P.createAndThrow();
    }

    public C50903Fki(Activity activity, Fragment fragment, UserSession userSession, 1Xj r4, String str, String str2, boolean z) {
        this.A02 = userSession;
        this.A00 = activity;
        this.A01 = fragment;
        this.A03 = r4;
        this.A06 = z;
        this.A05 = str;
        this.A04 = str2;
    }

    public final void Dje(List list) {
        UserSession userSession = this.A02;
        Activity activity = this.A00;
        Fragment fragment = this.A01;
        1Xj r6 = this.A03;
        boolean z = this.A06;
        String str = this.A05;
        boolean A1a = AnonymousClass7TE.A1a(list.get(0));
        String str2 = this.A04;
        if (!z) {
            SQH.A02(fragment.getParentFragmentManager());
        }
        if (r6.A5v()) {
            C290815g0 A032 = C59730JVo.A03(activity, userSession, C59730JVo.A05(activity, r6, "ReelMemoriesShareHelper", false, A1a));
            A032.A00 = new EHR(activity, fragment, userSession, r6, str, str2);
            1ES.A03(A032);
            return;
        }
        ExtendedImageUrl A1n = r6.A1n(activity);
        String A012 = 2RR.A01();
        int A013 = DbU.A01(activity);
        LTL.A04(activity, A1n, new FZE(activity, fragment, userSession, r6, str, str2), A012, A013, false);
    }
}
