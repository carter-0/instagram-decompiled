package X;

/* renamed from: X.9Ul  reason: invalid class name and case insensitive filesystem */
public final class C379579Ul extends 1P0 {
    public final /* synthetic */ 1P2 A00;
    public final /* synthetic */ AnonymousClass1DK A01;
    public final /* synthetic */ 1P0 A02;
    public final /* synthetic */ 1P0 A03;
    public final /* synthetic */ 1OC A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public C379579Ul(1P2 r1, AnonymousClass1DK r2, 1P0 r3, 1P0 r4, 1OC r5, String str, boolean z) {
        this.A02 = r3;
        this.A00 = r1;
        this.A05 = str;
        this.A04 = r5;
        this.A06 = z;
        this.A03 = r4;
        this.A01 = r2;
    }

    public final void onFail(C268654dm r9) {
        int A0D = AnonymousClass7TG.A0D(r9, -81686306);
        C379579Ul.super.onFail(r9);
        1OC r6 = this.A04;
        if (r6 != null && (!this.A06 || this.A00.A02())) {
            1P2 r2 = this.A00;
            String str = this.A05;
            1P2.A01(r2, this.A01, this.A03, this.A02, r6, str);
        }
        AnonymousClass0fD.A0A(210735272, A0D);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(-1759945992);
        1XU r9 = (1XU) obj;
        int A0D = AnonymousClass7TG.A0D(r9, -1514295714);
        C379579Ul.super.onSuccess(r9);
        if (r9.AjP() == -1) {
            0wb.A03("IgApiPrefetchScheduler", "invalid cache responseObject");
        }
        C61480nO A002 = 0nY.A00();
        0qQ.A07(A002);
        this.A00.A00.put(this.A05, new C266474Za(r9, A002, r9.AjP()));
        1P0 r0 = this.A02;
        if (r0 != null) {
            r0.onSuccess(r9);
        }
        AnonymousClass0fD.A0A(685708945, A0D);
        AnonymousClass0fD.A0A(-433550897, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A032 = AnonymousClass0fD.A03(1978442061);
        int A0D = AnonymousClass7TG.A0D(obj, 1061502636);
        1P0 r0 = this.A02;
        if (r0 != null) {
            r0.onSuccessInBackground(obj);
        }
        AnonymousClass0fD.A0A(-186232426, A0D);
        AnonymousClass0fD.A0A(-1622341271, A032);
    }
}
