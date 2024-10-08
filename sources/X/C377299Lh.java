package X;

import java.util.Locale;

/* renamed from: X.9Lh  reason: invalid class name and case insensitive filesystem */
public final class C377299Lh extends 0Yg implements 0sP {
    public final int A00;
    public final long A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377299Lh(long j, Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = j;
        this.A02 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A00 != 0) {
            AnonymousClass3LP r7 = (AnonymousClass3LP) obj;
            0qQ.A0B(r7, 0);
            boolean z = false;
            if (this.A01 - r7.A00 >= ((long) ((AnonymousClass3LN) this.A02).A03)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        C390959s7 r72 = (C390959s7) obj;
        0qQ.A0B(r72, 0);
        C3500983f r4 = ((C3500883e) this.A02).A03;
        long j = this.A01;
        String lowerCase = r72.name().toLowerCase(Locale.ROOT);
        0qQ.A07(lowerCase);
        r4.A03(j, lowerCase);
        return C60340gF.A00;
    }
}
