package X;

import com.instagram.business.boost.mediapicker.model.BoostMediaPickerTabType;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public final class L9V {
    public final BoostMediaPickerTabType A00;
    public final UserSession A01;
    public final AnonymousClass0r6 A02;
    public final 05G A03;
    public final 05G A04;
    public final /* synthetic */ C60252Ji9 A05;

    /* JADX WARNING: type inference failed for: r2v1, types: [X.1Xy, java.lang.Object] */
    public L9V(BoostMediaPickerTabType boostMediaPickerTabType, C60252Ji9 ji9, UserSession userSession) {
        this.A05 = ji9;
        this.A01 = userSession;
        this.A00 = boostMediaPickerTabType;
        int i = boostMediaPickerTabType.ordinal() == 3 ? 2 : 1;
        ArrayList A1C = AnonymousClass7TE.A1C();
        int i2 = 0;
        int[] iArr = new int[i];
        do {
            iArr[i2] = i2;
            i2++;
        } while (i2 < i);
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        int i3 = 0;
        do {
            AnonymousClass7TF.A1M(A1C2, iArr[i3]);
            i3++;
        } while (i3 < i);
        02z A10 = DbS.A10(new C61020JvK("0", A1C2, A1C, i, true));
        this.A03 = A10;
        AtomicBoolean atomicBoolean = 1Xj.A0i;
        02z A102 = DbS.A10(new 1Xj(new 1hu((UserSession) null), new Object()));
        this.A04 = A102;
        this.A02 = AnonymousClass10H.A03(new C66192MHi((Object) this, (AnonymousClass4D7) null, 2), JTO.A1I(new MGZ(this, (AnonymousClass4D7) null, 30), A10), A102);
    }
}
