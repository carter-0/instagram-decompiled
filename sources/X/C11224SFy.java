package X;

import java.util.Map;

/* renamed from: X.SFy  reason: case insensitive filesystem */
public final class C11224SFy {
    public boolean A00;
    public final long A01;
    public final C11180SEg A02;
    public final C62637KjI A03;
    public final C11181SEh A04;
    public final S16 A05;
    public final C10542Rtw A06;
    public final C10543Rtx A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final Map A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    public C11224SFy(C11180SEg sEg, C62637KjI kjI, C11181SEh sEh, S16 s16, C10542Rtw rtw, C10543Rtx rtx, String str, String str2, String str3, Map map, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A03 = kjI;
        this.A0B = map;
        this.A04 = sEh;
        this.A07 = rtx;
        this.A02 = sEg;
        this.A05 = s16;
        this.A09 = str2;
        this.A0A = str3;
        this.A00 = z3;
        this.A0F = z4;
        this.A0E = z2;
        this.A0C = z5;
        this.A06 = rtw;
        this.A01 = j;
        this.A08 = str;
        this.A0D = z;
    }

    public C11224SFy(C11348SOh sOh) {
        this.A03 = sOh.A01;
        this.A0B = sOh.A07;
        this.A04 = sOh.A02;
        this.A07 = sOh.A04;
        this.A02 = sOh.A00;
        this.A05 = sOh.A03;
        this.A09 = sOh.A06;
        this.A0A = null;
        this.A00 = false;
        this.A0F = false;
        this.A0E = false;
        this.A0C = sOh.A09;
        this.A06 = null;
        this.A01 = 0;
        this.A08 = sOh.A05;
        this.A0D = sOh.A08;
    }
}
