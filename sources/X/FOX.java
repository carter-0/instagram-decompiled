package X;

import android.content.Context;
import android.view.View;
import com.instagram.user.model.User;

public final class FOX implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass32K A02;
    public final /* synthetic */ G88 A03;
    public final /* synthetic */ User A04;
    public final /* synthetic */ AnonymousClass3UM A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ CharSequence[] A07;

    public FOX(Context context, AnonymousClass32K r2, G88 g88, User user, AnonymousClass3UM r5, String str, CharSequence[] charSequenceArr, int i) {
        this.A02 = r2;
        this.A01 = context;
        this.A07 = charSequenceArr;
        this.A03 = g88;
        this.A04 = user;
        this.A05 = r5;
        this.A00 = i;
        this.A06 = str;
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0fD.A05(-394334130);
        AnonymousClass32K r1 = this.A02;
        Context context = this.A01;
        C358248ab A0Y = DbS.A0Y(context);
        CharSequence[] charSequenceArr = this.A07;
        A0Y.A0e(new C50007FIs(context, this.A03, this.A04, this.A05, this.A06, charSequenceArr, this.A00), charSequenceArr);
        Dba.A1M(A0Y);
        r1.ALt(A0Y);
        DbT.A1V(A0Y);
        AnonymousClass0fD.A0C(2013562733, A052);
    }
}
