package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.io.File;

public final class EHR extends 2Cn {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ 1Xj A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        UserSession userSession = this.A02;
        F7J.A00(this.A00, this.A01, userSession, this.A03, (File) obj, this.A05, this.A04);
    }

    public EHR(Activity activity, Fragment fragment, UserSession userSession, 1Xj r4, String str, String str2) {
        this.A02 = userSession;
        this.A00 = activity;
        this.A01 = fragment;
        this.A03 = r4;
        this.A05 = str;
        this.A04 = str2;
    }

    public final void onFail(Exception exc) {
        Activity activity = this.A00;
        SQH.A01(this.A01.mFragmentManager);
        C59689JTv.A0B(activity, "openStoryCreationFlow_something_went_wrong");
    }
}
