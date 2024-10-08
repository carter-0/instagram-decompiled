package X;

/* renamed from: X.6rT  reason: invalid class name and case insensitive filesystem */
public final class C319936rT extends 1P0 {
    public final C54252H4v A00;
    public final C324596za A01;
    public final C324366zA A02;
    public final AnonymousClass11X A03;

    public C319936rT(AnonymousClass11X r2, C54252H4v h4v, C324596za r4, C324366zA r5) {
        0qQ.A0B(r5, 2);
        this.A03 = r2;
        this.A02 = r5;
        this.A01 = r4;
        this.A00 = h4v;
    }

    public final void onFail(C268654dm r4) {
        C54252H4v h4v;
        int A032 = AnonymousClass0fD.A03(156255411);
        0qQ.A0B(r4, 0);
        C324366zA r1 = this.A02;
        r1.A01 = null;
        if ((r4 instanceof C268674do) || (h4v = this.A00) == null) {
            r1.A00(AnonymousClass05K.A01);
            this.A01.onFail(r4);
        } else {
            h4v.A00();
        }
        AnonymousClass0fD.A0A(-1075615216, A032);
    }

    public final void onFailInBackground(C268654dm r3) {
        int A032 = AnonymousClass0fD.A03(1218018086);
        0qQ.A0B(r3, 0);
        this.A01.onFailInBackground(r3);
        AnonymousClass0fD.A0A(-977278426, A032);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(82605428);
        this.A01.onFinish();
        AnonymousClass0fD.A0A(1077665167, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(1333899859);
        C324366zA r1 = this.A02;
        r1.A00(AnonymousClass05K.A00);
        r1.A01 = this.A03;
        this.A01.onStart();
        AnonymousClass0fD.A0A(-1790581588, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(2076331760);
        AnonymousClass1XV r6 = (AnonymousClass1XV) obj;
        int A033 = AnonymousClass0fD.A03(-781205827);
        0qQ.A0B(r6, 0);
        C54252H4v h4v = this.A00;
        if (h4v != null) {
            h4v.A05.removeCallbacksAndMessages((Object) null);
        }
        C324366zA r4 = this.A02;
        r4.A01 = null;
        r4.A00(AnonymousClass05K.A0C);
        r4.A07 = r6.getNextMaxId();
        r4.A0A = r6.CP6();
        if (r6 instanceof C273664mz) {
            C273664mz r1 = (C273664mz) r6;
            r4.A09 = r1.A02;
            r4.A08 = r1.A01;
        }
        if (r6 instanceof C298815u5) {
            r4.A02 = ((C298815u5) r6).A01;
        }
        this.A01.onSuccess(r6);
        AnonymousClass0fD.A0A(2061711964, A033);
        AnonymousClass0fD.A0A(-1281226672, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A032 = AnonymousClass0fD.A03(243528279);
        int A033 = AnonymousClass0fD.A03(1422299308);
        0qQ.A0B(obj, 0);
        this.A01.onSuccessInBackground(obj);
        AnonymousClass0fD.A0A(-1749577797, A033);
        AnonymousClass0fD.A0A(-144543128, A032);
    }
}
