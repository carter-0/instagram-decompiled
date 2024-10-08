package X;

import android.content.Context;
import android.text.ClipboardManager;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class EQJ extends C47647EBh {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ 1Xj A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EQJ(FragmentActivity fragmentActivity, 0hq r2, AnonymousClass0iw r3, UserSession userSession, 1Xj r5, String str, String str2) {
        super(fragmentActivity, r2);
        this.A01 = userSession;
        this.A03 = str;
        this.A00 = r3;
        this.A04 = str2;
        this.A02 = r5;
    }

    public final void onFail(C268654dm r9) {
        int A0D = AnonymousClass7TG.A0D(r9, 1961194078);
        super.onFail(r9);
        C22031Xty.A0H(this.A00, this.A01, this.A03, this.A04, "copy_link", r9.A01());
        AnonymousClass0fD.A0A(943056849, A0D);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(-1498473537);
        DvJ dvJ = (DvJ) obj;
        int A033 = AnonymousClass0fD.A03(173117566);
        0qQ.A0B(dvJ, 0);
        int A034 = AnonymousClass0fD.A03(1143412954);
        Context context = this.A00;
        Object A0e = DbZ.A0e(context);
        A0e.getClass();
        ((ClipboardManager) A0e).setText(dvJ.A00);
        C49118Eph.A00(context, (View) null, (String) null, false);
        AnonymousClass0fD.A0A(1057081563, A034);
        C22031Xty.A0K(this.A00, this.A01, this.A03, this.A04, "copy_link", dvJ.A00, "copy_link", DbT.A0x(this.A02), (String) null);
        AnonymousClass0fD.A0A(-949137156, A033);
        AnonymousClass0fD.A0A(2118073028, A032);
    }
}
