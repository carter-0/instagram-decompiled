package X;

import com.instagram.common.session.UserSession;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;

public final class KEW extends C228042kh {
    public final UserSession A00;
    public final C63775L6h A01;
    public final C64147LQk A02;
    public final LF3 A03;
    public final C63652L1o A04;
    public final String A05;
    public final String A06;

    public KEW(UserSession userSession, C63775L6h l6h, C64147LQk lQk, LF3 lf3, C63652L1o l1o, String str, String str2) {
        0qQ.A0B(str, 1);
        this.A05 = str;
        this.A00 = userSession;
        this.A02 = lQk;
        this.A04 = l1o;
        this.A01 = l6h;
        this.A03 = lf3;
        this.A06 = str2;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.Kul, java.lang.Object] */
    public final /* bridge */ /* synthetic */ 2YL create() {
        String str = this.A05;
        UserSession userSession = this.A00;
        return new IGTVUploadViewModel(userSession, this.A01, this.A02, this.A03, this.A04, new Object(), 1Au.A00(userSession), str);
    }
}
