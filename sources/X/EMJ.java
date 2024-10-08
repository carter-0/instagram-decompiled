package X;

import android.app.Activity;
import android.net.Uri;

public final class EMJ extends C47695EDe {
    public final int A00 = 1;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EMJ(Activity activity, AnonymousClass0iw r16, AnonymousClass0aP r17, G8H g8h, C48259Ebe ebe, E3X e3x, C46634DiE diE, Integer num, String str, String str2, String str3) {
        super(activity, (Uri) null, r16, r17, g8h, ebe, diE, num, str, str2, str3, (EWC) null);
        this.A01 = e3x;
    }

    public final void onFail(C268654dm r19) {
        String str;
        C268654dm r2 = r19;
        if (2 - this.A00 != 0) {
            EMJ.super.onFail(r2);
            return;
        }
        int A03 = AnonymousClass0fD.A03(-568692903);
        KHI khi = (KHI) this.A01;
        C11032S6k s6k = LQc.A07;
        Object A002 = r2.A00();
        1XP r5 = (1XP) A002;
        if (r5 == null || r5.getErrorMessage() == null || !r5.getErrorMessage().equals("Invalid nonce from autoconf authentication")) {
            AnonymousClass0aP r7 = khi.A03;
            String str2 = khi.A06.A01;
            String str3 = khi.A08;
            if (A002 != null) {
                str = r5.getErrorMessage();
            } else {
                str = null;
            }
            String A003 = AnonymousClass000.A00(2789);
            AnonymousClass7TF.A1H(r7, str2);
            C49944FFx.A00(r7, false, str2, A003, "authentication error message received from server", str3, "ar_code_sms", str, (String) null, (String) null, (String) null);
            super.onFail(r2);
        } else {
            AnonymousClass0aP r52 = khi.A03;
            String str4 = khi.A06.A01;
            String str5 = khi.A08;
            AnonymousClass7TF.A1H(r52, str4);
            C49944FFx.A00(r52, false, str4, "client_auth_failed_error_message_from_server", "authentication error message received from server", str5, "ar_code_sms", (String) null, (String) null, "Invalid nonce from autoconf authentication", (String) null);
            khi.A04.A00();
        }
        AnonymousClass0fD.A0A(-1837836367, A03);
    }

    public final void onFinish() {
        int i;
        int i2;
        switch (this.A00) {
            case 1:
                i = AnonymousClass0fD.A03(-868126771);
                EMJ.super.onFinish();
                ((C47500E5f) this.A01).A03.A00();
                i2 = -1911339712;
                break;
            case 2:
                i = AnonymousClass0fD.A03(-728523258);
                AnonymousClass7TH.A0R(((KHI) this.A01).A00);
                EMJ.super.onFinish();
                i2 = -1006149861;
                break;
            case 3:
                i = AnonymousClass0fD.A03(1060694625);
                EMJ.super.onFinish();
                EEK eek = ((E3X) this.A01).A07;
                if (eek != null) {
                    eek.A00();
                }
                i2 = -680682036;
                break;
            default:
                EMJ.super.onFinish();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void onStart() {
        int i;
        int i2;
        switch (this.A00) {
            case 1:
                i = AnonymousClass0fD.A03(346016846);
                EMJ.super.onStart();
                ((C47500E5f) this.A01).A03.A01();
                i2 = 5395291;
                break;
            case 2:
                i = AnonymousClass0fD.A03(1765715444);
                AnonymousClass7TF.A16(((KHI) this.A01).A00);
                EMJ.super.onStart();
                i2 = -790984164;
                break;
            case 3:
                i = AnonymousClass0fD.A03(-1857643806);
                EMJ.super.onStart();
                EEK eek = ((E3X) this.A01).A07;
                if (eek != null) {
                    eek.A01();
                }
                i2 = 1761765487;
                break;
            default:
                EMJ.super.onStart();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EMJ(Activity activity, AnonymousClass0iw r16, AnonymousClass0aP r17, G8H g8h, KHI khi, C46634DiE diE, Integer num, String str) {
        super(activity, (Uri) null, r16, r17, g8h, (C48259Ebe) null, diE, num, str, "111111", (String) null, (EWC) null);
        this.A01 = khi;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EMJ(Activity activity, AnonymousClass0iw r12, AnonymousClass0aP r13, G8H g8h, EMP emp, C46634DiE diE, Integer num, String str) {
        super(activity, (Uri) null, r12, r13, g8h, diE, num, str);
        this.A01 = emp;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EMJ(Activity activity, Uri uri, AnonymousClass0iw r13, AnonymousClass0aP r14, EDD edd, C46634DiE diE, Integer num) {
        super(activity, uri, r13, r14, (G8H) null, diE, num, (String) null);
        this.A01 = edd;
    }
}
