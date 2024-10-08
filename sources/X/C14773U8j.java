package X;

import com.instagram.realtimeclient.RealtimeConstants;
import java.util.Collection;

/* renamed from: X.U8j  reason: case insensitive filesystem */
public abstract class C14773U8j extends 2YL {
    public String A00 = "0";
    public boolean A01;
    public boolean A02;
    public final 2Fk A03;
    public final 2Fk A04;
    public final 2Fk A05;
    public final 2Fk A06;
    public final 2Fk A07;
    public final 2Fk A08;
    public final 2Fk A09;
    public final C249513ju A0A;
    public final AnonymousClass0r6 A0B;
    public final 05G A0C;
    public final 05G A0D;
    public final 05G A0E;
    public final 05G A0F;
    public final 05G A0G;
    public final 05G A0H;
    public final 05G A0I;

    public final String A00() {
        if (this instanceof C16058Unl) {
            return ((C16058Unl) this).A05;
        }
        if (!(this instanceof C16057Unk)) {
            return ((C16056Unj) this).A04;
        }
        C15027UKg uKg = (C15027UKg) this.A0G.getValue();
        if (uKg != null) {
            return uKg.A06;
        }
        return null;
    }

    public final void A01() {
        String str;
        String str2;
        if (this instanceof C16058Unl) {
            C16058Unl unl = (C16058Unl) this;
            boolean z = unl.A06;
            WYZ wyz = unl.A02;
            Long l = unl.A03;
            String str3 = unl.A04;
            if (z) {
                wyz.A0A(l, str3, false);
            } else {
                wyz.A09(l, str3, false);
            }
        } else if (!(this instanceof C16057Unk)) {
            C16056Unj unj = (C16056Unj) this;
            boolean z2 = unj.A05;
            WYX wyx = unj.A01;
            Long l2 = unj.A03;
            if (z2) {
                str = "lead_gen_review_form";
                str2 = "review_lead_gen_form_tos_query";
            } else {
                str = "lead_gen_preview_form";
                str2 = "preview_lead_gen_form_tos_query";
            }
            WYX.A00(wyx, l2, str, str2, RealtimeConstants.SEND_FAIL).Cgf();
        }
    }

    public final void A02() {
        String str;
        String str2;
        if (this instanceof C16058Unl) {
            C16058Unl unl = (C16058Unl) this;
            boolean z = unl.A06;
            WYZ wyz = unl.A02;
            Long l = unl.A03;
            String str3 = unl.A04;
            if (z) {
                wyz.A0A(l, str3, true);
            } else {
                wyz.A09(l, str3, true);
            }
        } else if (!(this instanceof C16057Unk)) {
            C16056Unj unj = (C16056Unj) this;
            boolean z2 = unj.A05;
            WYX wyx = unj.A01;
            Long l2 = unj.A03;
            if (z2) {
                str = "lead_gen_review_form";
                str2 = "review_lead_gen_form_tos_query";
            } else {
                str = "lead_gen_preview_form";
                str2 = "preview_lead_gen_form_tos_query";
            }
            WYX.A00(wyx, l2, str, str2, RealtimeConstants.SEND_SUCCESS).Cgf();
        }
    }

    public final boolean A03() {
        if (!(this instanceof C16057Unk) || A05() || !(!((Collection) this.A0C.getValue()).isEmpty())) {
            return false;
        }
        return true;
    }

    public final boolean A04() {
        if (this instanceof C16058Unl) {
            return ((C16058Unl) this).A07;
        }
        if (this instanceof C16057Unk) {
            return false;
        }
        return true;
    }

    public final boolean A05() {
        if (this instanceof C16057Unk) {
            return C13991Tnr.A1X(((C16057Unk) this).A01, "args_is_sub_page");
        }
        return false;
    }

    public C14773U8j() {
        1HR A0f = C13990Tnq.A0f();
        this.A0A = A0f;
        this.A0B = 0u9.A04(A0f);
        0sn r1 = 0sn.A00;
        02z A012 = 106.A01(r1);
        this.A0C = A012;
        19B r2 = 19B.A00;
        this.A03 = C226292g8.A00(r2, A012);
        02z A013 = 106.A01(r1);
        this.A0D = A013;
        this.A04 = C226292g8.A00(r2, A013);
        02z A014 = 106.A01((Object) null);
        this.A0G = A014;
        this.A07 = C226292g8.A00(r2, A014);
        02z A015 = 106.A01((Object) null);
        this.A0E = A015;
        this.A05 = C226292g8.A00(r2, A015);
        Boolean A0u = AnonymousClass7TE.A0u();
        02z r0 = new 02z(A0u);
        this.A0H = r0;
        this.A08 = C226292g8.A00(r2, r0);
        02z A016 = 106.A01((Object) null);
        this.A0I = A016;
        this.A09 = C226292g8.A00(r2, A016);
        02z r02 = new 02z(A0u);
        this.A0F = r02;
        this.A06 = C226292g8.A00(r2, r02);
    }
}
