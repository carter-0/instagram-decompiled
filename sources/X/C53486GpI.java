package X;

import com.instagram.api.schemas.MediaNoticeIcon;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.GpI  reason: case insensitive filesystem */
public final class C53486GpI extends AnonymousClass0T0 implements C299575vQ {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public C53486GpI(AnonymousClass9IC r2, C299505vJ r3, ImageUrl imageUrl, String str, String str2, String str3, String str4) {
        this.A03 = r3;
        this.A02 = r2;
        this.A06 = str;
        this.A07 = str2;
        this.A05 = str3;
        this.A04 = str4;
        this.A01 = imageUrl;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof C53486GpI) || ((C53486GpI) obj).A00 != i) {
            return false;
        }
        return true;
    }

    public final String BK1() {
        if (this.A00 != 0) {
            return C299615vU.A01(this, "SearchTopicPreviewModel", ((C299505vJ) this.A03).A03);
        }
        return this.A04;
    }

    public final C299505vJ Be5() {
        return (C299505vJ) this.A03;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!A00(1, obj)) {
                return false;
            }
            C53486GpI gpI = (C53486GpI) obj;
            if (!0qQ.A0K(this.A03, gpI.A03) || !0qQ.A0K(this.A02, gpI.A02) || !0qQ.A0K(this.A06, gpI.A06) || !0qQ.A0K(this.A07, gpI.A07) || !0qQ.A0K(this.A05, gpI.A05) || !0qQ.A0K(this.A04, gpI.A04)) {
                return false;
            }
            obj2 = this.A01;
            obj3 = gpI.A01;
        } else if (this == obj) {
            return true;
        } else {
            if (!A00(0, obj)) {
                return false;
            }
            C53486GpI gpI2 = (C53486GpI) obj;
            if (!0qQ.A0K(this.A03, gpI2.A03) || !0qQ.A0K(this.A02, gpI2.A02) || this.A01 != gpI2.A01 || !0qQ.A0K(this.A07, gpI2.A07) || !0qQ.A0K(this.A06, gpI2.A06)) {
                return false;
            }
            obj2 = this.A05;
            obj3 = gpI2.A05;
        }
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A00;
        int A072 = AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0K(this.A03));
        if (i != 0) {
            return ((((AnonymousClass7TF.A08(this.A07, (A072 + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A01);
        }
        return C41845B3m.A01(this.A05, AnonymousClass7TF.A08(this.A06, AnonymousClass7TF.A08(this.A07, AnonymousClass7TF.A07(this.A01, A072))));
    }

    public final /* synthetic */ C61082JwK CFL() {
        return C299615vU.A00();
    }

    public C53486GpI(C299505vJ r10, ImageUrl imageUrl, String str, String str2, String str3, String str4) {
        this(G9w.A0O(), r10, imageUrl, str, str2, str3, str4);
    }

    public C53486GpI(AnonymousClass9IC r3, MediaNoticeIcon mediaNoticeIcon, C299505vJ r5, String str, String str2, String str3) {
        this.A03 = r5;
        this.A02 = r3;
        this.A01 = mediaNoticeIcon;
        this.A07 = str;
        this.A06 = str2;
        this.A05 = str3;
        this.A04 = C299615vU.A01(this, "medianotice", r5.A03);
    }

    public C53486GpI(MediaNoticeIcon mediaNoticeIcon, C299505vJ r10, String str, String str2, String str3) {
        this(G9w.A0O(), mediaNoticeIcon, r10, str, str2, str3);
    }
}
