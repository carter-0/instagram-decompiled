package X;

import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.List;

/* renamed from: X.PRj  reason: case insensitive filesystem */
public final class C72976PRj implements AnonymousClass4ME {
    public final OUp A00 = OUp.A01;
    public final AnonymousClass4ME A01;
    public final C252323ov A02;

    private final C263844No A00(Object obj) {
        C252323ov r1;
        if (obj == null || (r1 = this.A02) == null) {
            return null;
        }
        return r1.A07(obj);
    }

    public final void EFf(AnonymousClass3WR r2) {
        this.A01.EFf(r2);
    }

    public final void EFo(C263834Nn r8, Object obj, String str, String str2, int i, int i2) {
        this.A01.EFo(r8, obj, str, str2, i, i2);
    }

    public final void EFv(C257183wz r2, Object obj) {
        0qQ.A0B(r2, 1);
        this.A01.EFv(r2, obj);
    }

    public final void EG5(C257183wz r2, Object obj) {
        0qQ.A0B(r2, 1);
        this.A01.EG5(r2, obj);
    }

    public final void EGA(2Yz r2) {
        0qQ.A0B(r2, 0);
        this.A01.EGA(r2);
    }

    public final void EGs(C263834Nn r2, Object obj, int i, boolean z) {
        this.A01.EGs(r2, obj, i, z);
    }

    public final void EGx(Object obj, boolean z) {
        this.A01.EGx(obj, z);
    }

    public final void EGy(C263834Nn r2, Object obj, String str) {
        this.A01.EGy(r2, obj, str);
    }

    public final void EH0(Object obj, int i) {
        this.A01.EH0(obj, i);
    }

    public final void EH2(C263834Nn r8, Object obj, String str, String str2, String str3, String str4) {
        String str5;
        0qQ.A0B(str2, 2);
        this.A01.EH2(r8, obj, str, str2, str3, (String) null);
        C263844No A002 = A00(obj);
        OUp oUp = this.A00;
        if (A002 != null) {
            str5 = A002.A0B;
        } else {
            str5 = null;
        }
        A01(oUp, "player_pause", str5);
    }

    public final void EH3(C263834Nn r2, Object obj, int i) {
        this.A01.EH3(r2, obj, i);
    }

    public final void EH5(C263834Nn r2, Object obj, int i) {
        this.A01.EH5(r2, obj, i);
    }

    public final void EH7(C263834Nn r10, Object obj, String str, long j, boolean z, boolean z2, boolean z3) {
        String str2;
        AnonymousClass3WR r0;
        0qQ.A0B(str, 4);
        this.A01.EH7(r10, obj, str, j, z, z2, z3);
        C263844No A002 = A00(obj);
        OUp oUp = this.A00;
        String str3 = null;
        if (A002 != null) {
            str2 = A002.A0B;
        } else {
            str2 = null;
        }
        if (!(A002 == null || (r0 = A002.A04) == null)) {
            str3 = r0.A04();
        }
        oUp.A00("player_start", str2, "codec", str3);
    }

    public final void EH8(C263834Nn r7, Object obj, int i, int i2, int i3) {
        this.A01.EH8(r7, obj, i, i2, i3);
    }

    public final void EHA(Object obj) {
        this.A01.EHA(obj);
    }

    public final void EHC(C263834Nn r2, Object obj) {
        this.A01.EHC(r2, obj);
    }

    public final void EHD(Object obj, String str, String str2, String str3) {
        String str4;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        AnonymousClass7TG.A1U(str, str2, str3);
        this.A01.EHD(obj, str, str2, str3);
        C263844No A002 = A00(obj);
        OUp oUp = this.A00;
        if (A002 != null) {
            str4 = A002.A0B;
        } else {
            str4 = null;
        }
        oUp.A00("video_warning", str4, "domain", str5, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, str6, "msg", str7);
    }

    public final void EHE(C263834Nn r2, Object obj, int i) {
        this.A01.EHE(r2, obj, i);
    }

    public final void EFa(C291485hN r9) {
        this.A01.EFa(r9);
        this.A00.A00("abr_decision", r9.A0Q, "reason", r9.A0K, "detail", r9.A0J);
    }

    public final void EGt(C263834Nn r4, Object obj, int i) {
        String str;
        this.A01.EGt(r4, obj, i);
        C263844No A002 = A00(obj);
        OUp oUp = this.A00;
        if (A002 != null) {
            str = A002.A0B;
        } else {
            str = null;
        }
        A01(oUp, "buffering_finish", str);
    }

    public final void EGu(C263834Nn r4, Object obj, List list) {
        String str;
        this.A01.EGu(r4, obj, list);
        C263844No A002 = A00(obj);
        OUp oUp = this.A00;
        if (A002 != null) {
            str = A002.A0B;
        } else {
            str = null;
        }
        A01(oUp, "buffering_start", str);
    }

    public final void EGv(C263834Nn r17, Object obj, String str, String str2, String str3) {
        String str4;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        AnonymousClass7TG.A1U(str5, str6, str7);
        Object obj2 = obj;
        this.A01.EGv(r17, obj2, str5, str6, str7);
        C263844No A002 = A00(obj2);
        OUp oUp = this.A00;
        if (A002 != null) {
            str4 = A002.A0B;
        } else {
            str4 = null;
        }
        oUp.A00("video_error", str4, "domain", str5, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, str6, "msg", str7);
    }

    public final void EGz(C263834Nn r4, Object obj) {
        String str;
        this.A01.EGz(r4, obj);
        C263844No A002 = A00(obj);
        OUp oUp = this.A00;
        if (A002 != null) {
            str = A002.A0B;
        } else {
            str = null;
        }
        A01(oUp, "prepare_start", str);
    }

    public final void EH1(Object obj) {
        String str;
        this.A01.EH1(obj);
        C263844No A002 = A00(obj);
        OUp oUp = this.A00;
        if (A002 != null) {
            str = A002.A0B;
        } else {
            str = null;
        }
        A01(oUp, "player_exit", str);
    }

    public final void EH4(C263834Nn r4, Object obj, String str) {
        String str2;
        this.A01.EH4(r4, obj, str);
        C263844No A002 = A00(obj);
        OUp oUp = this.A00;
        if (A002 != null) {
            str2 = A002.A0B;
        } else {
            str2 = null;
        }
        A01(oUp, "player_resume", str2);
    }

    public final void EH6(C263834Nn r4, Object obj, String str, int i) {
        String str2;
        this.A01.EH6(r4, obj, str, i);
        C263844No A002 = A00(obj);
        OUp oUp = this.A00;
        if (A002 != null) {
            str2 = A002.A0B;
        } else {
            str2 = null;
        }
        A01(oUp, "should_start", str2);
    }

    public final void EH9(Object obj, String str, String str2, int i, long j) {
        String str3;
        this.A01.EH9(obj, str, str2, i, j);
        C263844No A002 = A00(obj);
        OUp oUp = this.A00;
        if (A002 != null) {
            str3 = A002.A0B;
        } else {
            str3 = null;
        }
        A01(oUp, "video_rendered", str3);
    }

    public final void EHB(C263834Nn r4, Object obj) {
        String str;
        this.A01.EHB(r4, obj);
        C263844No A002 = A00(obj);
        OUp oUp = this.A00;
        if (A002 != null) {
            str = A002.A0B;
        } else {
            str = null;
        }
        A01(oUp, "size_change", str);
    }

    public C72976PRj(AnonymousClass4ME r2, C252323ov r3) {
        this.A02 = r3;
        this.A01 = r2;
    }

    public static void A01(OUp oUp, Object obj, Object obj2) {
        oUp.A00(obj, obj2);
    }
}
