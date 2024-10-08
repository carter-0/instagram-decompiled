package X;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class UOS extends AnonymousClass0T0 implements XCH {
    public int A00;
    public int A01;
    public ULw A02;
    public ULH A03;
    public C15042UKv A04;
    public ULm A05;
    public C16585Uxf A06;
    public C16597Uxr A07;
    public String A08;
    public List A09;
    public final String A0A;

    public UOS() {
        this((ULw) null, (ULH) null, (C15042UKv) null, (ULm) null, (C16585Uxf) null, (C16597Uxr) null, (String) null, (List) null, (DefaultConstructorMarker) null, 0, 0, 1023);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UOS) {
                UOS uos = (UOS) obj;
                if (!0qQ.A0K(this.A08, uos.A08) || this.A07 != uos.A07 || !0qQ.A0K(this.A04, uos.A04) || !0qQ.A0K(this.A03, uos.A03) || !0qQ.A0K(this.A02, uos.A02) || this.A00 != uos.A00 || this.A06 != uos.A06 || !0qQ.A0K(this.A05, uos.A05) || !0qQ.A0K(this.A09, uos.A09) || this.A01 != uos.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final ULH Ayy() {
        return this.A03;
    }

    public final C15042UKv Az6() {
        return this.A04;
    }

    public final int Brw() {
        return this.A00;
    }

    public final C16597Uxr Bzo() {
        return this.A07;
    }

    public final ULw C7Q() {
        return this.A02;
    }

    public final String CDC() {
        return this.A08;
    }

    public final void EUX(ULH ulh) {
        this.A03 = ulh;
    }

    public final void EUZ(C15042UKv uKv) {
        this.A04 = uKv;
    }

    public final void Ejk(int i) {
        this.A00 = i;
    }

    public final void Eoi(ULw uLw) {
        this.A02 = uLw;
    }

    public final String getTypeName() {
        return this.A0A;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A08);
        return AnonymousClass7TF.A07(this.A09, AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A07(this.A06, (((((((AnonymousClass7TF.A07(this.A07, A0O) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A02)) * 31) + this.A00) * 31))) + this.A01;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.ULm] */
    public /* synthetic */ UOS(ULw uLw, ULH ulh, C15042UKv uKv, ULm uLm, C16585Uxf uxf, C16597Uxr uxr, String str, List list, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, int i3) {
        String A0j = AnonymousClass7TG.A0j();
        C16597Uxr uxr2 = C16597Uxr.UNKNOWN;
        C16585Uxf uxf2 = C16585Uxf.UNKNOWN;
        ? obj = new Object();
        obj.A0M = null;
        obj.A04 = null;
        obj.A0p = false;
        obj.A0N = null;
        obj.A0O = null;
        obj.A0G = null;
        obj.A0H = null;
        obj.A0P = null;
        obj.A0m = null;
        obj.A00 = null;
        ULm.A01(obj);
        obj.A0I = null;
        obj.A0W = null;
        obj.A0n = null;
        obj.A0J = null;
        obj.A0X = null;
        obj.A0Y = null;
        obj.A05 = null;
        obj.A06 = null;
        obj.A0o = null;
        obj.A0Z = "";
        obj.A01 = null;
        obj.A0a = null;
        ULm.A00(obj);
        obj.A0b = null;
        obj.A03 = null;
        obj.A0c = null;
        obj.A0K = null;
        obj.A0D = null;
        obj.A0d = "";
        obj.A0e = null;
        obj.A0f = null;
        obj.A0g = null;
        obj.A0E = null;
        obj.A0r = false;
        obj.A0h = "";
        obj.A02 = null;
        obj.A0F = null;
        obj.A0i = null;
        obj.A0j = null;
        obj.A0k = null;
        obj.A0L = null;
        obj.A0l = null;
        0sn r1 = 0sn.A00;
        0qQ.A0B(r1, 9);
        this.A08 = A0j;
        this.A07 = uxr2;
        this.A04 = null;
        this.A03 = null;
        this.A02 = null;
        this.A00 = 0;
        this.A06 = uxf2;
        this.A05 = obj;
        this.A09 = r1;
        this.A01 = 0;
        this.A0A = "media_lyrics_sticker";
    }
}
