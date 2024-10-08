package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.ESd  reason: case insensitive filesystem */
public final class C48038ESd extends AnonymousClass7AK {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ 2EG A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48038ESd(Context context, UserSession userSession, 2EG r4, Integer num, String str, String str2, String str3, String str4, int i) {
        super(Integer.valueOf(i));
        this.A03 = num;
        this.A01 = userSession;
        this.A06 = str;
        this.A07 = str2;
        this.A04 = str3;
        this.A00 = context;
        this.A05 = str4;
        this.A02 = r4;
    }

    public final void onClick(View view) {
        Integer num = this.A03;
        if (num == AnonymousClass05K.A00) {
            new AnonymousClass7I3(this.A01).A09(this.A06);
        } else if (num == AnonymousClass05K.A01) {
            new AnonymousClass7I3(this.A01).A0A(this.A07, this.A04, this.A06);
        }
        Dbb.A0k(this.A00, this.A01, this.A02, this.A05);
    }
}
