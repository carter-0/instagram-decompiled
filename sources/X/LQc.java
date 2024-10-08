package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.View;

public final class LQc {
    public static final C11032S6k A07 = C11032S6k.A00.A00();
    public Context A00;
    public C11239SGz A01 = new C11239SGz(this.A00, this.A04);
    public LQW A02;
    public ContentResolver A03;
    public PackageManager A04;
    public AnonymousClass1Tr A05;
    public 1To A06;

    public static void A00(AnonymousClass4DH r19, 1P0 r20, AnonymousClass0aP r21, LQc lQc, C46634DiE diE, String str, String str2, boolean z) {
        C46634DiE diE2 = diE;
        AnonymousClass0aP r5 = r21;
        C49944FFx.A00.A03(r5, diE2.A01, "client_start_request_query_verifier", "client sends start message to server to query verifier after auth failed");
        LQc lQc2 = lQc;
        boolean z2 = z;
        String str3 = str;
        String str4 = str2;
        1OC A002 = FHA.A00(lQc2.A00, r5, true, Boolean.valueOf(z2), str4, str3, true, false);
        A002.A00 = new EDB((View) null, r19, r20, r5, lQc2, diE2, str3, str4, z2);
        1ES.A03(A002);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.1Tr, java.lang.Object] */
    public LQc(Context context) {
        this.A00 = context;
        this.A03 = context.getApplicationContext().getContentResolver();
        C64428Lbj lbj = new C64428Lbj(this, 3);
        this.A06 = lbj;
        ? obj = new Object();
        obj.A00 = lbj;
        this.A05 = obj;
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        this.A04 = packageManager;
        this.A02 = new LQW(this.A03, RW4.A00(packageManager), this.A05, this.A06);
    }
}
