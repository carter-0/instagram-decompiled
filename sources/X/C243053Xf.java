package X;

import java.util.HashMap;
import kotlin.Deprecated;

/* renamed from: X.3Xf  reason: invalid class name and case insensitive filesystem */
public final class C243053Xf extends C243063Xg {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C251263mp A04;
    public final 2V1 A05;
    public final 2TR A06;
    public final AnonymousClass3XI A07;
    public final String A08;
    public final boolean A09;
    public final int A0A;

    public final String A04() {
        return "resolve";
    }

    public static final HashMap A00(C243053Xf r3) {
        HashMap hashMap = new HashMap();
        hashMap.put("root", r3.A04.A0J());
        hashMap.put("version", Integer.valueOf(r3.A01));
        hashMap.put("source", C392969vg.A00(r3.A0A));
        hashMap.put("attribution", r3.A08);
        return hashMap;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass2T6 A03() {
        Integer A012 = 2SN.A01("Litho.ComponentTree.Resolve");
        if (A012 != null) {
            2SN.A05("Litho.ComponentTree.Resolve", String.valueOf(this.A00), A00(this), A012.intValue());
        }
        try {
            2V1 r5 = this.A05;
            return C243123Xm.A00(this.A04, r5, this.A06, this, this.A07, this.A08, this.A01, this.A00);
        } finally {
            if (A012 != null) {
                2SN.A03(A012.intValue(), 0Yt.A0E());
            }
        }
    }

    @Deprecated(message = "Refactor sync render logic to remove sizes from resolved tree future")
    public C243053Xf(C251263mp r2, 2V1 r3, 2TR r4, AnonymousClass3XI r5, String str, int i, int i2, int i3, int i4, int i5, boolean z) {
        super(i4, z);
        this.A05 = r3;
        this.A04 = r2;
        this.A07 = r5;
        this.A06 = r4;
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
        this.A08 = str;
        this.A0A = i5;
        this.A09 = r3.A02.A01.A0I;
    }
}
