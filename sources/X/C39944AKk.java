package X;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.AKk  reason: case insensitive filesystem */
public final class C39944AKk implements DialogInterface.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C3726291q A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public C39944AKk(FragmentActivity fragmentActivity, UserSession userSession, C3726291q r3, String str, String str2) {
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = r3;
        this.A04 = str;
        this.A03 = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Bundle A002 = Q21.A00(AnonymousClass7TE.A1L("origin", "BROADCAST_CHANNEL"));
        FragmentActivity fragmentActivity = this.A00;
        new AnonymousClass6W8(fragmentActivity, A002, this.A01, ModalActivity.class, C273654mx.A00(281)).A0C(fragmentActivity);
        this.A02.A01(C391519tD.BUTTON_TAPPED, this.A04, this.A03);
    }
}
