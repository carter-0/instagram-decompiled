package X;

import android.content.Context;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.Df0  reason: case insensitive filesystem */
public final class C46438Df0 implements AnonymousClass6VG {
    public final /* synthetic */ Reel A00;
    public final /* synthetic */ AnonymousClass3BQ A01;
    public final /* synthetic */ AnonymousClass32A A02;
    public final /* synthetic */ AnonymousClass3N3 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ List A07;

    public C46438Df0(Reel reel, AnonymousClass3BQ r2, AnonymousClass32A r3, AnonymousClass3N3 r4, String str, List list, List list2, List list3) {
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = reel;
        this.A05 = list;
        this.A07 = list2;
        this.A06 = list3;
        this.A01 = r2;
        this.A04 = str;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, X.DfY] */
    public final void CfR(long j, boolean z) {
        AnonymousClass3N3 r1 = this.A03;
        if (r1 != null) {
            r1.Bkt().A08();
        }
        AnonymousClass32A r4 = this.A02;
        Reel reel = this.A00;
        List list = this.A05;
        List list2 = this.A07;
        List list3 = this.A06;
        Context context = r4.A0L.getContext();
        ? obj = new Object();
        obj.A01 = r1;
        obj.A00 = context;
        AnonymousClass32A.A01(reel, this.A01, r4, obj, this.A04, list, list2, list3, j, z);
    }
}
