package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.UOb  reason: case insensitive filesystem */
public final class C15084UOb extends AnonymousClass0T0 implements XCH {
    public int A00;
    public ULw A01;
    public ULH A02;
    public C15042UKv A03;
    public C15036UKp A04;
    public C16597Uxr A05;
    public Float A06;
    public Float A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public boolean A0F;
    public final String A0G;

    public C15084UOb() {
        this((ULw) null, (ULH) null, (C15042UKv) null, (C15036UKp) null, (C16597Uxr) null, (Float) null, (Float) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (DefaultConstructorMarker) null, 0, 65535, false);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15084UOb) {
                C15084UOb uOb = (C15084UOb) obj;
                if (!0qQ.A0K(this.A0E, uOb.A0E) || this.A05 != uOb.A05 || !0qQ.A0K(this.A03, uOb.A03) || !0qQ.A0K(this.A02, uOb.A02) || !0qQ.A0K(this.A01, uOb.A01) || this.A00 != uOb.A00 || this.A0F != uOb.A0F || !0qQ.A0K(this.A08, uOb.A08) || !0qQ.A0K(this.A06, uOb.A06) || !0qQ.A0K(this.A04, uOb.A04) || !0qQ.A0K(this.A09, uOb.A09) || !0qQ.A0K(this.A0A, uOb.A0A) || !0qQ.A0K(this.A0B, uOb.A0B) || !0qQ.A0K(this.A0C, uOb.A0C) || !0qQ.A0K(this.A07, uOb.A07) || !0qQ.A0K(this.A0D, uOb.A0D)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final ULH Ayy() {
        return this.A02;
    }

    public final C15042UKv Az6() {
        return this.A03;
    }

    public final int Brw() {
        return this.A00;
    }

    public final C16597Uxr Bzo() {
        return this.A05;
    }

    public final ULw C7Q() {
        return this.A01;
    }

    public final String CDC() {
        return this.A0E;
    }

    public final void EUX(ULH ulh) {
        this.A02 = ulh;
    }

    public final void EUZ(C15042UKv uKv) {
        this.A03 = uKv;
    }

    public final void Ejk(int i) {
        this.A00 = i;
    }

    public final void Eoi(ULw uLw) {
        this.A01 = uLw;
    }

    public final String getTypeName() {
        return this.A0G;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A0E);
        boolean z = this.A0F;
        return ((((AnonymousClass7TF.A08(this.A0B, AnonymousClass7TF.A08(this.A0A, AnonymousClass7TF.A08(this.A09, AnonymousClass7TF.A07(this.A04, (((AnonymousClass7TF.A09(z, (((((((AnonymousClass7TF.A07(this.A05, A0O) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + this.A00) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31)))) + AnonymousClass7TG.A0E(this.A0C)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + C41845B3m.A00(this.A0D);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.UKp] */
    public /* synthetic */ C15084UOb(ULw uLw, ULH ulh, C15042UKv uKv, C15036UKp uKp, C16597Uxr uxr, Float f, Float f2, String str, String str2, String str3, String str4, String str5, String str6, String str7, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, boolean z) {
        String A0j = AnonymousClass7TG.A0j();
        C16597Uxr uxr2 = C16597Uxr.UNKNOWN;
        ? obj = new Object();
        obj.A07 = "";
        obj.A09 = "";
        obj.A06 = null;
        obj.A00 = null;
        obj.A08 = null;
        obj.A04 = null;
        obj.A03 = null;
        obj.A05 = null;
        obj.A01 = null;
        obj.A02 = null;
        this.A0E = A0j;
        this.A05 = uxr2;
        this.A03 = null;
        this.A02 = null;
        this.A01 = null;
        this.A00 = 0;
        this.A0F = false;
        this.A08 = null;
        this.A06 = null;
        this.A04 = obj;
        this.A09 = "";
        this.A0A = "";
        this.A0B = "";
        this.A0C = null;
        this.A07 = null;
        this.A0D = null;
        this.A0G = "media_visual_comment_reply_sticker";
    }
}
