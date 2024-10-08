package X;

import android.graphics.Bitmap;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Awc  reason: case insensitive filesystem */
public final class C41570Awc extends 0Yg implements C62320sa {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Bitmap A01;
    public final /* synthetic */ Fragment A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ 1Xj A04;
    public final /* synthetic */ C352218Cl A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41570Awc(Bitmap bitmap, Fragment fragment, UserSession userSession, 1Xj r5, C352218Cl r6, int i, boolean z) {
        super(0);
        this.A03 = userSession;
        this.A04 = r5;
        this.A00 = i;
        this.A02 = fragment;
        this.A05 = r6;
        this.A01 = bitmap;
        this.A06 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        if (r2 != null) goto L_0x002f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r10 = this;
            com.instagram.common.session.UserSession r5 = r10.A03
            X.1Xj r2 = r10.A04
            int r1 = r10.A00
            androidx.fragment.app.Fragment r4 = r10.A02
            X.8Cl r7 = r10.A05
            android.graphics.Bitmap r3 = r10.A01
            boolean r9 = r10.A06
            boolean r0 = r2.A5D()
            if (r0 == 0) goto L_0x001d
            X.1Xj r2 = r2.A1c(r1)
            if (r2 != 0) goto L_0x001d
        L_0x001a:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x001d:
            java.lang.String r8 = r2.getId()
            if (r8 == 0) goto L_0x001a
            boolean r0 = r2.A5D()
            if (r0 == 0) goto L_0x003d
            X.1Xj r2 = r2.A1c(r1)
            if (r2 == 0) goto L_0x001a
        L_0x002f:
            android.content.Context r0 = r4.requireContext()
            com.instagram.model.mediasize.ExtendedImageUrl r6 = r2.A1n(r0)
        L_0x0037:
            if (r6 == 0) goto L_0x001a
            X.C56274Hvi.A00(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x001a
        L_0x003d:
            boolean r0 = r2.A5G()
            if (r0 == 0) goto L_0x002f
            com.instagram.common.typedurl.ImageUrl r6 = r2.A1Q()
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41570Awc.invoke():java.lang.Object");
    }
}
