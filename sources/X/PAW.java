package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class PAW implements AnonymousClass7D2 {
    public final AnonymousClass7DZ A00;

    public final /* bridge */ /* synthetic */ void ADp(C328007Db r2, AnonymousClass7FW r3) {
        this.A00.A02(r2, r3);
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r2) {
        this.A00.A01(r2);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.7XR, java.lang.Object, X.7XX] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PAW(X.AnonymousClass7XR r7, X.AnonymousClass9HC r8) {
        /*
            r6 = this;
            r6.<init>()
            X.76C r1 = new X.76C
            r4 = r7
            r1.<init>(r7)
            X.7DT r2 = new X.7DT
            r2.<init>(r7)
            r5 = r8
            boolean r0 = r8.A1X
            X.7DV r3 = new X.7DV
            r3.<init>(r7, r0)
            X.77l r0 = new X.77l
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            X.7DZ r0 = new X.7DZ
            r0.<init>(r1)
            r6.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PAW.<init>(X.7XR, X.9HC):void");
    }

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        PBP pbp = new PBP(DbT.A0C(layoutInflater, viewGroup, R.layout.direct_like_message));
        this.A00.A00(pbp);
        return pbp;
    }
}
