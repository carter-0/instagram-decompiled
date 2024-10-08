package X;

import com.instagram.common.recyclerview.ViewModelListUpdate;
import java.util.List;

/* renamed from: X.8iJ  reason: invalid class name and case insensitive filesystem */
public final class C362678iJ extends 0ng {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C362388ho A01;
    public final /* synthetic */ ViewModelListUpdate A02;
    public final /* synthetic */ AnonymousClass2tB A03;
    public final /* synthetic */ List A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C362678iJ(C362388ho r5, ViewModelListUpdate viewModelListUpdate, AnonymousClass2tB r7, List list, long j) {
        super(55, 2, false, true);
        this.A02 = viewModelListUpdate;
        this.A01 = r5;
        this.A00 = j;
        this.A04 = list;
        this.A03 = r7;
    }

    public final void run() {
        List A0a = 00k.A0a(this.A02.A00);
        C362388ho r3 = this.A01;
        long j = r3.A03.get();
        long j2 = this.A00;
        if (j == j2) {
            r3.A02.execute(new C362748iQ(C232332tX.A00(new AnonymousClass2tV(this.A04, A0a)), r3, this.A03, A0a, j2));
        }
    }
}
