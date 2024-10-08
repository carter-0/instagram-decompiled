package X;

import java.util.HashMap;

/* renamed from: X.924  reason: invalid class name */
public final class AnonymousClass924 extends 1P0 {
    public final /* synthetic */ AnonymousClass921 A00;

    public AnonymousClass924(AnonymousClass921 r1) {
        this.A00 = r1;
    }

    public final void onFail(C268654dm r4) {
        int A03 = AnonymousClass0fD.A03(1911051230);
        C59689JTv.A0B(this.A00.A01, "something_went_wrong");
        AnonymousClass0fD.A0A(-1573751809, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-517893973);
        int A032 = AnonymousClass0fD.A03(-681852773);
        AnonymousClass921 r6 = this.A00;
        C56029Hrb hrb = new C56029Hrb(r6.A03, r6.A05, r6.A09);
        HashMap hashMap = new HashMap();
        String str = AnonymousClass1QI.A00.A02.A00;
        if (str != null) {
            hashMap.put("nav_chain", str);
        }
        0wc r2 = hrb.A00;
        0Aj A002 = r2.A00(r2.A00, AnonymousClass000.A00(4898));
        A002.AAJ(MYP.A00(), hrb.A01);
        A002.AAJ("step", "turn_off");
        A002.A9H("extra_values", hashMap);
        A002.Cgf();
        C59689JTv.A07(r6.A01, 2131964974);
        AnonymousClass0fD.A0A(-205437721, A032);
        AnonymousClass0fD.A0A(1132827105, A03);
    }
}
