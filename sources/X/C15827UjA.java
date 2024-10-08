package X;

import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.UjA  reason: case insensitive filesystem */
public final class C15827UjA extends 2Cn {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C14437TwL A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public C15827UjA(C14437TwL twL, String str, String str2, String str3, String str4, long j) {
        this.A01 = twL;
        this.A02 = str;
        this.A00 = j;
        this.A04 = str2;
        this.A05 = str3;
        this.A03 = str4;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AnonymousClass9B2 r11 = (AnonymousClass9B2) obj;
        0qQ.A0B(r11, 0);
        C14437TwL twL = this.A01;
        twL.A00 = r11;
        DirectShareTarget A002 = r11.A00();
        if (A002 != null) {
            C14437TwL.A00((C68112N1a) null, A002, twL, this.A02, this.A04, this.A05, this.A03, this.A00, false);
        }
    }
}
