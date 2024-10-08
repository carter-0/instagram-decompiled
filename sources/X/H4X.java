package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.save.model.SavedCollection;

public final class H4X extends 1P0 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Fragment A03;
    public final /* synthetic */ 1Xj A04;
    public final /* synthetic */ C56561I1p A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(618237224);
        SavedCollection savedCollection = (SavedCollection) obj;
        int A033 = AnonymousClass0fD.A03(-695971953);
        C56561I1p i1p = this.A05;
        C57078INs.A00(i1p.A01, savedCollection);
        i1p.A02(this.A03, this.A04, savedCollection, (String) null, this.A00, this.A01);
        AnonymousClass4DU r3 = i1p.A03;
        r3.getClass();
        I6U.A03(r3, i1p.A02, savedCollection, this.A07, this.A02);
        AnonymousClass0fD.A0A(-895490198, A033);
        AnonymousClass0fD.A0A(1610280275, A032);
    }

    public H4X(Fragment fragment, 1Xj r2, C56561I1p i1p, String str, String str2, int i, int i2, int i3) {
        this.A05 = i1p;
        this.A04 = r2;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = fragment;
        this.A07 = str;
        this.A02 = i3;
        this.A06 = str2;
    }

    public final void onFail(C268654dm r7) {
        int A032 = AnonymousClass0fD.A03(1436802516);
        C56561I1p i1p = this.A05;
        String str = this.A06;
        FragmentActivity fragmentActivity = i1p.A00;
        C59689JTv.A00(fragmentActivity, AnonymousClass7TF.A0e(fragmentActivity.getResources(), str, 2131956854), "create_collection_failure_notification", 1);
        AnonymousClass0fD.A0A(1405036630, A032);
    }
}
