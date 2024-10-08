package X;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class NQP extends 2Cn {
    public final /* synthetic */ LT3 A00;
    public final /* synthetic */ boolean A01;

    public NQP(LT3 lt3, boolean z) {
        this.A00 = lt3;
        this.A01 = z;
    }

    public final void onFail(Exception exc) {
        C59689JTv.A0A(this.A00.A04, "SHARE_QR_CODE_error");
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        String str2;
        Uri uri = (Uri) obj;
        0qQ.A0B(uri, 0);
        LT3 lt3 = this.A00;
        boolean z = this.A01;
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", 0cp.A03(lt3.A0F));
        if (z) {
            str = "image/png";
        } else {
            str = "image/jpeg";
        }
        intent.setType(str);
        intent.putExtra(AnonymousClass000.A00(66), uri);
        intent.setFlags(1);
        intent.setClipData(ClipData.newRawUri("QR code", uri));
        Context context = lt3.A04;
        0kR.A0D(context, Intent.createChooser(intent, context.getString(2131973441)));
        C70448O6z o6z = lt3.A09;
        if (o6z != null) {
            NJ7 nj7 = o6z.A00;
            C313756gx A002 = C313746gw.A00(AnonymousClass7TE.A0l(nj7.A0G));
            int A03 = C66583MXo.A03(nj7);
            String A07 = C300965yF.A07(NJ7.A00(nj7));
            String A02 = NJ7.A02(nj7);
            boolean A08 = NJ7.A08(nj7);
            1Ln A0J = DbT.A0J(A002);
            if (DbT.A1Y(A0J)) {
                DbW.A17(A0J, A002);
                DbV.A1M(A0J, "share_qr_code");
                A0J.A0p("share_qr_code_button");
                if (A08) {
                    str2 = "creator_qr_code_sheet";
                } else {
                    str2 = "fan_qr_code_sheet";
                }
                A0J.A0i(DbZ.A0b(A0J, str2, A07, A02, A03));
                A0J.Cgf();
            }
        }
    }
}
