package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.BGg  reason: case insensitive filesystem */
public final class C42078BGg extends AnonymousClass0T0 implements C46309DUm {
    public final Boolean A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final HashMap A07;

    public final C42078BGg F9d() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42078BGg) {
                C42078BGg bGg = (C42078BGg) obj;
                if (!0qQ.A0K(this.A02, bGg.A02) || !0qQ.A0K(this.A03, bGg.A03) || !0qQ.A0K(this.A04, bGg.A04) || !0qQ.A0K(this.A07, bGg.A07) || !0qQ.A0K(this.A05, bGg.A05) || !0qQ.A0K(this.A06, bGg.A06) || !0qQ.A0K(this.A00, bGg.A00) || !0qQ.A0K(this.A01, bGg.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String AXn() {
        return this.A02;
    }

    public final String AYV() {
        return this.A03;
    }

    public final String AgA() {
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ Map AgL() {
        return this.A07;
    }

    public final String BXf() {
        return this.A06;
    }

    public final Boolean BuN() {
        return this.A00;
    }

    public final Integer Bw4() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTStoryBloksTappableStickerDict", C44382Ce2.A00(this));
    }

    public final String getId() {
        return this.A05;
    }

    public final int hashCode() {
        return (((((((((((((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public C42078BGg(Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5, HashMap hashMap) {
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A07 = hashMap;
        this.A05 = str4;
        this.A06 = str5;
        this.A00 = bool;
        this.A01 = num;
    }
}
