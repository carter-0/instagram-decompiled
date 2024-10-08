package X;

import android.content.Context;
import com.instagram.profile.fragment.UserDetailFragment;
import java.util.Collections;
import java.util.List;

/* renamed from: X.UpK  reason: case insensitive filesystem */
public final class C16133UpK extends C47795EHg {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C294265mA A01;
    public final /* synthetic */ C321626uU A02;
    public final /* synthetic */ List A03;

    public final void run() {
        UserDetailFragment userDetailFragment = this.A02.A00;
        List unmodifiableList = Collections.unmodifiableList(this.A03);
        UserDetailFragment.A0K(this.A00, this.A01, userDetailFragment, unmodifiableList, false, true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16133UpK(Context context, C294265mA r6, C321626uU r7, List list) {
        super(368025586, 2, false, true);
        this.A02 = r7;
        this.A03 = list;
        this.A01 = r6;
        this.A00 = context;
    }
}
