package X;

import android.content.Context;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Locale;

public final /* synthetic */ class PEJ implements B1V {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass7Z6 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public /* synthetic */ PEJ(Context context, AnonymousClass7Z6 r2, String str, String str2, String str3, boolean z) {
        this.A01 = r2;
        this.A02 = str;
        this.A03 = str2;
        this.A00 = context;
        this.A05 = z;
        this.A04 = str3;
    }

    public final 1bp AXP(C70621ODs oDs, DirectThreadKey directThreadKey, Boolean bool, Long l) {
        AnonymousClass7Z6 r8 = this.A01;
        String str = this.A02;
        String str2 = this.A03;
        Context context = this.A00;
        boolean z = this.A05;
        String str3 = this.A04;
        String A012 = OP3.A00().A01(2FW.A19, new OBM(str, new C73476PdJ(str2)));
        String format = String.format(Locale.getDefault(), context.getString(2131959635), new Object[]{str2, A012});
        1bp r6 = new 1bp(C66669Mac.A05(r8.A00, oDs, AnonymousClass1dM.class, str3, z), directThreadKey, l, AnonymousClass7TG.A0H());
        r6.A05 = false;
        r6.A03 = str;
        r6.A04 = str2;
        C45425Cw5 cw5 = new C45425Cw5();
        cw5.A08 = "";
        r6.A01 = cw5;
        r6.A02 = format;
        r6.A05 = false;
        return r6;
    }
}
