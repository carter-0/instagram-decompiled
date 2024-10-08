package X;

import com.instagram.model.reels.Reel;
import java.util.List;

public final /* synthetic */ class WNQ implements X3D {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C17662Vbs A02;
    public final /* synthetic */ X6E A03;
    public final /* synthetic */ C19517Wb3 A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ boolean A06;

    public /* synthetic */ WNQ(C17662Vbs vbs, X6E x6e, C19517Wb3 wb3, List list, int i, int i2, boolean z) {
        this.A03 = x6e;
        this.A02 = vbs;
        this.A05 = list;
        this.A04 = wb3;
        this.A00 = i;
        this.A01 = i2;
        this.A06 = z;
    }

    public final void DcU() {
        X6E x6e = this.A03;
        C17662Vbs vbs = this.A02;
        List list = this.A05;
        C19517Wb3 wb3 = this.A04;
        int i = this.A00;
        int i2 = this.A01;
        boolean z = this.A06;
        Reel reel = vbs.A03;
        reel.getClass();
        x6e.Cvv(wb3, reel, list, i, i2, vbs.A00, z);
    }
}
