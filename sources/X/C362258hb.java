package X;

import android.content.Context;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import java.util.List;

/* renamed from: X.8hb  reason: invalid class name and case insensitive filesystem */
public final class C362258hb {
    public final Context A00;
    public final AnonymousClass2t9 A01;
    public final C362218hX A02;
    public final C362228hY A03;
    public final C362238hZ A04;
    public final C362248ha A05;
    public final List A06;

    /* JADX WARNING: type inference failed for: r3v0, types: [X.4AA, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v0, types: [X.4AA, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v1, types: [X.4AA, java.lang.Object] */
    public C362258hb(Context context, C362218hX r6, C362228hY r7, C362238hZ r8, C362248ha r9) {
        this.A00 = context;
        this.A02 = r6;
        this.A03 = r7;
        this.A04 = r8;
        this.A05 = r9;
        List A1P = 0sr.A1P(new AnonymousClass4AA[]{new Object(), new C362278hd((List) null), new Object(), new Object()});
        this.A06 = A1P;
        AnonymousClass2tC A002 = AnonymousClass2t9.A00(this.A00);
        A002.A01(new C362308hg(this.A02));
        A002.A01(new C362318hh(this.A03));
        A002.A01(new C362328hi(this.A04));
        A002.A01(new C362338hj(this.A05));
        AnonymousClass2t9 A003 = A002.A00();
        ViewModelListUpdate viewModelListUpdate = new ViewModelListUpdate();
        viewModelListUpdate.A01(A1P);
        A003.A05(viewModelListUpdate);
        this.A01 = A003;
    }
}
