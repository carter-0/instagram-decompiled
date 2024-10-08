package X;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.FIp  reason: case insensitive filesystem */
public final class C50004FIp implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;

    public C50004FIp(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, int i) {
        this.A00 = i;
        this.A03 = obj2;
        this.A04 = obj4;
        this.A01 = obj;
        this.A06 = str;
        this.A05 = str2;
        this.A02 = obj3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.A00 != 0) {
            FragmentActivity fragmentActivity = (FragmentActivity) this.A01;
            fragmentActivity.onBackPressed();
            AnonymousClass4DU r6 = (AnonymousClass4DU) this.A02;
            String str = this.A06;
            String moduleName = r6.getModuleName();
            String str2 = this.A05;
            User user = (User) this.A03;
            String username = user.A03.getUsername();
            C249713kF.A00.A0N(fragmentActivity, user.A03.BsB(), (UserSession) this.A04, r6, str, moduleName, "incentive", str2, username).A05();
            return;
        }
        DialogInterface.OnClickListener onClickListener = (DialogInterface.OnClickListener) this.A03;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, i);
        }
        Activity activity = (Activity) this.A01;
        String str3 = this.A06;
        String str4 = this.A05;
        C63556Kz5.A01.A01(activity, (C267624bv) this.A02, (UserSession) this.A04, str3, str4);
    }
}
