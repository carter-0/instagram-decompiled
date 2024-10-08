package X;

import android.content.Context;
import com.instagram.android.R;

public final class ECA extends 1P0 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass9JH A02;
    public final /* synthetic */ C46521DgO A03;
    public final /* synthetic */ C283155Gi A04;
    public final /* synthetic */ boolean A05;

    public ECA(Context context, AnonymousClass9JH r2, C46521DgO dgO, C283155Gi r4, int i, boolean z) {
        this.A03 = dgO;
        this.A02 = r2;
        this.A04 = r4;
        this.A00 = i;
        this.A01 = context;
        this.A05 = z;
    }

    public final void onFail(C268654dm r9) {
        int A032 = AnonymousClass0fD.A03(-119299305);
        0wb r4 = 0wb.A01;
        Integer num = AnonymousClass05K.A00;
        AnonymousClass9JH r7 = this.A02;
        r4.EFW("NewsfeedInlineSettingsController", num, 002.A0R("inline control network execution failed, action type: ", r7.A02));
        C46521DgO dgO = this.A03;
        if (C46521DgO.A05(dgO)) {
            1xC r5 = 1xC.A01;
            C310336ap A0a = DbS.A0a();
            DbS.A19(this.A01, A0a, 2131968328);
            A0a.A07(R.drawable.instagram_info_pano_outline_24);
            A0a.A02();
            A0a.A06();
            A0a.A02 = 0;
            DbY.A1K(r5, A0a);
        }
        C46529DgW dgW = dgO.A07;
        C283155Gi r2 = this.A04;
        int i = r2.A00;
        String str = r7.A02;
        0qQ.A0B(str, 1);
        dgW.A00.remove(002.A0H(str, ':', i));
        if (this.A05) {
            dgO.A06.CNU(r2, this.A00);
        }
        C46521DgO.A04(dgO, r2, 002.A0R(r7.A02, AnonymousClass000.A00(1064)), this.A00);
        AnonymousClass0fD.A0A(2023972824, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(-1537957251);
        int A033 = AnonymousClass0fD.A03(-14904271);
        C46521DgO.A04(this.A03, this.A04, 002.A0R(this.A02.A02, "_success"), this.A00);
        AnonymousClass0fD.A0A(-329869784, A033);
        AnonymousClass0fD.A0A(-1862058244, A032);
    }
}
