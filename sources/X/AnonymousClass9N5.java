package X;

import android.util.SparseIntArray;

/* renamed from: X.9N5  reason: invalid class name */
public final class AnonymousClass9N5 extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9N5(Object obj, String str, String str2, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
        this.A03 = str2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.A00) {
            case 0:
                C333867aH r6 = (C333867aH) obj;
                0qQ.A0B(r6, 0);
                return C335067cK.A07(r6, this.A03, this.A02, new J6O(this.A01, 19));
            case 1:
                long longValue = ((Number) obj).longValue();
                SparseIntArray sparseIntArray = 2bq.A02;
                ((2bq) this.A01).A01.flowAnnotate(longValue, this.A02, this.A03);
                break;
            default:
                String str = (String) obj;
                0qQ.A0B(str, 0);
                ((C249813kP) this.A01).A05(str, this.A02, this.A03);
                break;
        }
        return C60340gF.A00;
    }
}
