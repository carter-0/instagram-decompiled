package X;

import android.content.Context;

/* renamed from: X.6zZ  reason: invalid class name and case insensitive filesystem */
public final class C324586zZ extends C324596za {
    public final C321636uV A00;
    public final Context A01;
    public final AnonymousClass2mA A02;
    public final C294265mA A03;
    public final boolean A04;
    public final boolean A05;

    public C324586zZ(Context context, AnonymousClass2mA r2, C321636uV r3, C294265mA r4, boolean z, boolean z2) {
        this.A01 = context;
        this.A04 = z;
        this.A05 = z2;
        this.A02 = r2;
        this.A00 = r3;
        this.A03 = r4;
    }

    public final void A00(C273664mz r10) {
        AnonymousClass2mA r0;
        int A032 = AnonymousClass0fD.A03(-1849636095);
        0qQ.A0B(r10, 0);
        C321636uV r2 = this.A00;
        r2.DQ7("profile_on_data", (Long) null);
        boolean z = this.A04;
        boolean z2 = this.A05;
        C294265mA r6 = this.A03;
        r2.DQA(this.A01, (C61082JwK) null, r10, r6, z, z2);
        if (!z && (r0 = this.A02) != null) {
            r0.A02();
        }
        AnonymousClass0fD.A0A(1616937165, A032);
    }

    public final void onFail(C268654dm r4) {
        AnonymousClass2mA r0;
        int A032 = AnonymousClass0fD.A03(-1428237257);
        0qQ.A0B(r4, 0);
        this.A00.DQ4(r4, this.A03);
        if (!this.A04 && (r0 = this.A02) != null) {
            r0.A00();
        }
        AnonymousClass0fD.A0A(-2061084339, A032);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(923492935);
        this.A00.DQ6(this.A03);
        AnonymousClass0fD.A0A(-1266964834, A032);
    }

    public final void onStart() {
        AnonymousClass2mA r0;
        int A032 = AnonymousClass0fD.A03(-179922914);
        C321636uV r4 = this.A00;
        boolean z = this.A04;
        r4.DQ9(this.A03, z, this.A05, false);
        if (!z && (r0 = this.A02) != null) {
            r0.A01();
        }
        AnonymousClass0fD.A0A(-2100027232, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(795939274);
        A00((C273664mz) obj);
        AnonymousClass0fD.A0A(-2049814875, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A032 = AnonymousClass0fD.A03(228403958);
        int A033 = AnonymousClass0fD.A03(782351942);
        this.A00.DQ7("profile_on_data_bg", (Long) null);
        AnonymousClass0fD.A0A(-1062407190, A033);
        AnonymousClass0fD.A0A(-114629957, A032);
    }
}
