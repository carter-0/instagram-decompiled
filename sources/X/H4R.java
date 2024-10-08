package X;

import android.content.Context;
import com.instagram.save.model.SavedCollection;

public final class H4R extends 1P0 {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public H4R(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
        this.A04 = obj4;
        this.A03 = obj3;
        this.A05 = obj2;
    }

    public final void onFail(C268654dm r4) {
        if (this.A00 != 0) {
            H4R.super.onFail(r4);
            return;
        }
        int A0D = AnonymousClass7TG.A0D(r4, 1911625771);
        H4R.super.onFail(r4);
        DbS.A1U(this.A04);
        C59689JTv.A0E((Context) this.A02, "network_error");
        ((1Xj) this.A03).AE7((0lg) this.A05);
        AnonymousClass0fD.A0A(1429261045, A0D);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032;
        int i;
        if (this.A00 != 0) {
            A032 = AnonymousClass0fD.A03(-2135690015);
            int A033 = AnonymousClass0fD.A03(277728140);
            I7Q.A07(((C56561I1p) this.A02).A02, (1Xj) this.A05, (SavedCollection) this.A03, (Integer) this.A04, this.A01);
            AnonymousClass0fD.A0A(1632199265, A033);
            i = -1080267992;
        } else {
            A032 = AnonymousClass0fD.A03(1126277854);
            int A0D = AnonymousClass7TG.A0D(obj, 258046361);
            H4R.super.onSuccess(obj);
            C59689JTv.A07((Context) this.A02, this.A01);
            AnonymousClass0fD.A0A(1658095431, A0D);
            i = 1803246093;
        }
        AnonymousClass0fD.A0A(i, A032);
    }
}
