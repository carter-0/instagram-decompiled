package X;

import com.instagram.api.schemas.ClipsMashupType;

/* renamed from: X.Cwa  reason: case insensitive filesystem */
public class C45447Cwa {
    public boolean A00;
    public ClipsMashupType A01;
    public C267284bJ A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Integer A07;
    public Integer A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final C67161s9 A0E;

    public C45447Cwa(C67161s9 r2) {
        this.A0E = r2;
        this.A0A = r2.getCanToggleMashupsAllowed();
        this.A09 = r2.B7i();
        this.A0B = r2.getHasBeenMashedUp();
        this.A03 = r2.BBi();
        this.A0C = r2.isCreatorRequestingMashup();
        this.A04 = r2.CWC();
        this.A05 = r2.CWD();
        this.A0D = r2.isPivotPageAvailable();
        this.A06 = r2.Cav();
        this.A01 = r2.BP2();
        this.A00 = r2.getMashupsAllowed();
        this.A07 = r2.BWT();
        this.A02 = r2.BZ6();
        this.A08 = r2.Bfn();
    }

    public final 1s8 A00() {
        C267274bI r10;
        1E9 A0p = C41847B3o.A0p();
        boolean z = this.A0A;
        String str = this.A09;
        boolean z2 = this.A0B;
        Boolean bool = this.A03;
        boolean z3 = this.A0C;
        Boolean bool2 = this.A04;
        Boolean bool3 = this.A05;
        boolean z4 = this.A0D;
        Boolean bool4 = this.A06;
        ClipsMashupType clipsMashupType = this.A01;
        boolean z5 = this.A00;
        Integer num = this.A07;
        C267284bJ r0 = this.A02;
        if (r0 != null) {
            r10 = r0.FDr(A0p);
        } else {
            r10 = null;
        }
        boolean z6 = z4;
        boolean z7 = z3;
        boolean z8 = z2;
        boolean z9 = z;
        String str2 = str;
        return new 1s8(clipsMashupType, r10, bool, bool2, bool3, bool4, num, this.A08, str2, z9, z8, z7, z6, z5);
    }
}
