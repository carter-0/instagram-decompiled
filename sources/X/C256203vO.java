package X;

import com.facebook.common.dextricks.Constants;
import java.lang.ref.WeakReference;

/* renamed from: X.3vO  reason: invalid class name and case insensitive filesystem */
public final class C256203vO {
    public int A00;
    public int A01 = -1;
    public int A02 = Constants.LOAD_RESULT_WITH_VDEX_ODEX;
    public WeakReference A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final AnonymousClass3WR A07;
    public final String A08;

    public C256203vO(AnonymousClass3WR r2, String str) {
        0qQ.A0B(r2, 1);
        0qQ.A0B(str, 2);
        this.A07 = r2;
        this.A08 = str;
    }

    public final C256223vQ A00() {
        WeakReference weakReference = this.A03;
        if (weakReference != null) {
            return (C256223vQ) weakReference.get();
        }
        return null;
    }

    public final void A01(C256223vQ r2, int i) {
        this.A03 = new WeakReference(r2);
        this.A00 = i;
    }
}
