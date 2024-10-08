package X;

import com.google.android.gms.auth.blockstore.StoreBytesData;
import com.google.android.gms.common.Feature;

public final class Sm1 implements C74290PsI {
    public final /* synthetic */ C71087ObS A00;
    public final /* synthetic */ C3024463i A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ byte[] A04;

    public Sm1(C71087ObS obS, C3024463i r2, String str, byte[] bArr, boolean z) {
        this.A03 = z;
        this.A04 = bArr;
        this.A02 = str;
        this.A01 = r2;
        this.A00 = obS;
    }

    public final /* bridge */ /* synthetic */ void run(Object obj) {
        boolean z = true;
        if (!AnonymousClass7TF.A1Y(obj, true) || !this.A03) {
            z = false;
        }
        byte[] bArr = this.A04;
        String str = this.A02;
        AnonymousClass3Qk.A06(str, "key cannot be null or empty");
        StoreBytesData storeBytesData = new StoreBytesData(str, bArr, z);
        C3024463i r6 = this.A01;
        AnonymousClass63D r5 = (AnonymousClass63D) r6.A01;
        SHO A002 = SFC.A00();
        A002.A03 = new Feature[]{C301135ya.A03, C301135ya.A05};
        A002.A01 = new SxT(storeBytesData, r5);
        A002.A00 = 1645;
        A002.A02 = false;
        AnonymousClass63E.A00(r5, A002.A01(), 1).A03(new C12600Syz(0, this.A00, r6));
    }
}
