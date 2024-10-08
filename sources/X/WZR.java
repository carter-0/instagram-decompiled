package X;

import android.content.Context;
import com.instagram.wellbeing.fundraiser.coverphotopicker.FundraiserPhotoPickerPostsTabFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class WZR implements C321636uV {
    public final /* synthetic */ FundraiserPhotoPickerPostsTabFragment A00;

    public final void DQ7(String str, Long l) {
    }

    public WZR(FundraiserPhotoPickerPostsTabFragment fundraiserPhotoPickerPostsTabFragment) {
        this.A00 = fundraiserPhotoPickerPostsTabFragment;
    }

    public final void DQ4(C268654dm r5, C294265mA r6) {
        FundraiserPhotoPickerPostsTabFragment fundraiserPhotoPickerPostsTabFragment = this.A00;
        fundraiserPhotoPickerPostsTabFragment.A02.A00(new C19732WeZ(fundraiserPhotoPickerPostsTabFragment), (List) null);
    }

    public final void DQ6(C294265mA r5) {
        FundraiserPhotoPickerPostsTabFragment fundraiserPhotoPickerPostsTabFragment = this.A00;
        fundraiserPhotoPickerPostsTabFragment.A02.A00(new C19732WeZ(fundraiserPhotoPickerPostsTabFragment), (List) null);
    }

    public final void DQ9(C294265mA r5, boolean z, boolean z2, boolean z3) {
        FundraiserPhotoPickerPostsTabFragment fundraiserPhotoPickerPostsTabFragment = this.A00;
        fundraiserPhotoPickerPostsTabFragment.A02.A00(new C19732WeZ(fundraiserPhotoPickerPostsTabFragment), (List) null);
    }

    public final void DQA(Context context, C61082JwK jwK, C273664mz r9, C294265mA r10, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = r9.A06.iterator();
        while (it.hasNext()) {
            1Xj A0t = C51966G9m.A0t(it);
            if (A0t.A5D()) {
                for (int i = 0; i < A0t.A0o(); i++) {
                    1Xj A1c = A0t.A1c(i);
                    if (A1c != null && A1c.A5p()) {
                        arrayList.add(A1c);
                    }
                }
            }
            if (A0t.A5p()) {
                arrayList.add(A0t);
            }
        }
        FundraiserPhotoPickerPostsTabFragment fundraiserPhotoPickerPostsTabFragment = this.A00;
        fundraiserPhotoPickerPostsTabFragment.A02.A00(new C19732WeZ(fundraiserPhotoPickerPostsTabFragment), arrayList);
    }
}
