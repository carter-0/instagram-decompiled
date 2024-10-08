package X;

import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.UjB  reason: case insensitive filesystem */
public final class C15828UjB extends 2Cn {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C68112N1a A01;
    public final /* synthetic */ C14437TwL A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public C15828UjB(C68112N1a n1a, C14437TwL twL, String str, String str2, long j, boolean z) {
        this.A02 = twL;
        this.A03 = str;
        this.A00 = j;
        this.A04 = str2;
        this.A05 = z;
        this.A01 = n1a;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AnonymousClass9B2 r13 = (AnonymousClass9B2) obj;
        0qQ.A0B(r13, 0);
        C14437TwL twL = this.A02;
        twL.A00 = r13;
        DirectShareTarget A002 = r13.A00();
        if (A002 != null) {
            String str = this.A03;
            long j = this.A00;
            String str2 = this.A04;
            boolean z = this.A05;
            C68112N1a n1a = this.A01;
            String str3 = null;
            C68112N1a n1a2 = null;
            if (z) {
                str3 = str2;
                n1a2 = n1a;
            }
            C14437TwL.A00(n1a2, A002, twL, str, str2, str3, (String) null, j, true);
        }
    }
}
