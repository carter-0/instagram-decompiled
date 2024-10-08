package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.G0m  reason: case insensitive filesystem */
public final class C51767G0m extends 0Yg implements C62320sa {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ 0rm A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51767G0m(Context context, UserSession userSession, String str, String str2, String str3, 0rm r7, long j, boolean z) {
        super(0);
        this.A04 = str;
        this.A01 = context;
        this.A07 = z;
        this.A06 = r7;
        this.A02 = userSession;
        this.A00 = j;
        this.A03 = str2;
        this.A05 = str3;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        String str = this.A04;
        Context context = this.A01;
        boolean z = this.A07;
        FGT.A02(context, this.A02, str, (String) this.A06.A00, this.A03, this.A05, this.A00, z);
        return C60340gF.A00;
    }
}
