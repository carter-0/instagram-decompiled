package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.Arrays;

/* renamed from: X.Gx2  reason: case insensitive filesystem */
public final class C53958Gx2 extends C243963aQ {
    public final int A00;
    public final Drawable A01;
    public final Drawable A02;
    public final ImageView.ScaleType A03;
    public final C226672hf A04;
    public final C268764dx A05;
    public final AnonymousClass579 A06;
    public final C226662he A07;
    public final 2WX A08;
    public final String A09;

    public C53958Gx2(Drawable drawable, Drawable drawable2, ImageView.ScaleType scaleType, AnonymousClass579 r5, C226672hf r6, C226662he r7, C268764dx r8, 2WX r9, String str, int i) {
        0qQ.A0B(r7, 1);
        this.A07 = r7;
        this.A09 = str;
        this.A03 = scaleType;
        this.A04 = r6;
        this.A02 = drawable;
        this.A01 = drawable2;
        this.A06 = r5;
        this.A05 = r8;
        this.A00 = i;
        this.A08 = r9;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object, X.2WK] */
    public final C244523bK A0X(C244463bE r21) {
        C244463bE r7 = r21;
        0qQ.A0B(r7, 0);
        ImageView.ScaleType scaleType = this.A03;
        Drawable drawable = this.A02;
        C56063HsC hsC = null;
        if (drawable == null) {
            drawable = null;
        }
        C226672hf r2 = this.A04;
        Drawable drawable2 = this.A01;
        if (drawable2 != null) {
            hsC = new C56063HsC(drawable2);
        }
        Object A002 = AnonymousClass3Zw.A00(r7, C58677Ivm.A00(this, 13), Arrays.copyOf(new Object[]{scaleType, drawable, r2, hsC, Integer.valueOf(this.A00)}, 5));
        long A012 = r7.A01();
        C226662he r9 = this.A07;
        String str = this.A09;
        AnonymousClass579 r10 = this.A06;
        0qQ.A0B(r9, 1);
        0qQ.A0B(str, 2);
        return new C244523bK(this.A08, new AnonymousClass2WD(new Object(), new AnonymousClass2WG(C51967G9n.A0W(IJC.A00, 10, true), (C62320sa) null, new C58790Ixb(5, r9, r10, A002, str, (Object) null), A012)));
    }
}
