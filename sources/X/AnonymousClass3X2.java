package X;

import android.content.Context;
import com.facebook.litho.ComponentTree;

/* renamed from: X.3X2  reason: invalid class name */
public final class AnonymousClass3X2 {
    public int A00;
    public ComponentTree A01;
    public final AnonymousClass07Z A02;
    public final 2Sa A03;
    public final 2Sd A04;
    public final boolean A05;

    public AnonymousClass3X2(Context context, AnonymousClass07Z r27, 2Sa r28, 2Sd r29, boolean z) {
        AnonymousClass3X7 r5;
        this.A03 = r28;
        this.A02 = r27;
        this.A05 = z;
        this.A04 = r29;
        AnonymousClass3X6 r2 = new AnonymousClass3X6(new 2V1(context));
        2Sa r4 = this.A03;
        r4 = r4 == null ? 2Sa.defaultInstance : r4;
        if (this.A05) {
            r5 = AnonymousClass3X7.A00;
        } else {
            r5 = null;
        }
        2Sd r6 = this.A04;
        r2.A06 = 2Sa.A03(r4, r5, r6 == null ? 2Sa.defaultInstance.A03 : r6, (Integer) null, (Integer) null, -801, 15, false, false, false, false, false, true, false, false, false, false, false, false, false, false);
        AnonymousClass07Z r1 = this.A02;
        if (r1 != null) {
            r2.A03 = new AnonymousClass3X8(r1);
        }
        this.A01 = r2.A00();
    }
}
