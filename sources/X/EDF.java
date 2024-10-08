package X;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;

public class EDF extends 1P0 {
    public final Context A00;

    public EDF(Context context) {
        this.A00 = context;
    }

    public void A00(DwE dwE) {
        int A03 = AnonymousClass0fD.A03(1932809641);
        if (!TextUtils.isEmpty(dwE.A04)) {
            C59689JTv.A0G(dwE.A04);
        } else if (TextUtils.isEmpty(dwE.A03) || TextUtils.isEmpty(dwE.A00)) {
            DbZ.A0s(2131969200);
        } else {
            String str = dwE.A03;
            String str2 = dwE.A00;
            C358248ab A0Y = DbS.A0Y(this.A00);
            if (str != null) {
                A0Y.A05 = str;
            }
            A0Y.A0q(str2);
            A0Y.A06();
            A0Y.A0f((DialogInterface.OnDismissListener) null);
            DbT.A1V(A0Y);
        }
        AnonymousClass0fD.A0A(-1370760612, A03);
    }

    public void onFail(C268654dm r4) {
        String string;
        int A03 = AnonymousClass0fD.A03(695581551);
        if (!(r4 instanceof C268674do) || TextUtils.isEmpty(((DwE) ((C268674do) r4).A00).A02)) {
            string = this.A00.getString(2131972232);
        } else {
            string = ((DwE) r4.A00()).A02;
        }
        C59689JTv.A0G(string);
        AnonymousClass0fD.A0A(200770783, A03);
    }

    public void onFinish() {
        int A03 = AnonymousClass0fD.A03(-426021182);
        EDF.super.onFinish();
        AnonymousClass0fD.A0A(377985985, A03);
    }

    public void onStart() {
        int A03 = AnonymousClass0fD.A03(-420231557);
        EDF.super.onStart();
        AnonymousClass0fD.A0A(674034795, A03);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-433924964);
        A00((DwE) obj);
        AnonymousClass0fD.A0A(-300879432, A03);
    }
}
