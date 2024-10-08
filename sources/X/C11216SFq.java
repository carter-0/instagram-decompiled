package X;

import android.content.Context;
import java.util.HashSet;

/* renamed from: X.SFq  reason: case insensitive filesystem */
public final class C11216SFq {
    public static final HashSet A0A;
    public static final HashSet A0B;
    public static final HashSet A0C;
    public final Context A00;
    public final AnonymousClass0eM A01 = C13346TVt.A00(this, 16);
    public final AnonymousClass0eM A02 = C13346TVt.A00(this, 17);
    public final AnonymousClass0eM A03 = C13346TVt.A00(this, 18);
    public final AnonymousClass0eM A04 = C13346TVt.A00(this, 19);
    public final AnonymousClass0eM A05 = C13346TVt.A00(this, 20);
    public final AnonymousClass0eM A06 = C13346TVt.A00(this, 21);
    public final AnonymousClass0eM A07 = C13346TVt.A00(this, 22);
    public final AnonymousClass0eM A08 = C13346TVt.A00(this, 23);
    public final Throwable A09;

    static {
        HashSet A1F = AnonymousClass7TE.A1F();
        AnonymousClass7TF.A1M(A1F, 5202);
        AnonymousClass7TF.A1M(A1F, 3088003);
        AnonymousClass7TF.A1M(A1F, 3088004);
        A0B = A1F;
        HashSet A1F2 = AnonymousClass7TE.A1F();
        AnonymousClass7TF.A1M(A1F2, 5204);
        AnonymousClass7TF.A1M(A1F2, 3088002);
        AnonymousClass7TF.A1M(A1F2, 3088006);
        A0A = A1F2;
        HashSet A1F3 = AnonymousClass7TE.A1F();
        A1F3.addAll(A1F);
        A1F3.addAll(A1F2);
        A0C = A1F3;
    }

    public C11216SFq(Context context, Throwable th) {
        this.A00 = context;
        this.A09 = th;
    }
}
