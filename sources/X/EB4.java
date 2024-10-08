package X;

import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import androidx.fragment.app.FragmentActivity;
import com.facebook.proxygen.TraceFieldType;
import java.util.ArrayList;
import java.util.regex.Pattern;

public abstract class EB4 extends 1P0 {
    public FragmentActivity A00;
    public AnonymousClass0aP A01;
    public String A02;
    public boolean A03;

    public final void onFail(C268654dm r6) {
        int i;
        int A032 = AnonymousClass0fD.A03(1520443802);
        EB4.super.onFail(r6);
        FragmentActivity fragmentActivity = this.A00;
        if (fragmentActivity == null || fragmentActivity.isFinishing() || fragmentActivity.isDestroyed()) {
            i = 113174387;
        } else {
            0wb.A03("Show error message when fail to validate link's token for shared phone recovery flow on unvetted devices", "Fail to validate token in SMS Link");
            C358248ab A0X = DbS.A0X(fragmentActivity);
            A0X.A09(2131975551);
            A0X.A08(2131972232);
            A0X.A06();
            AnonymousClass7TH.A0a(A0X, true);
            02m.A0p.markerAnnotate(725095506, TraceFieldType.FailureReason, "network_error");
            02m.A0p.markerEnd(725095506, 3);
            i = -1355300295;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int A032 = AnonymousClass0fD.A03(-1973092632);
        C47360Dvu dvu = (C47360Dvu) obj;
        int A033 = AnonymousClass0fD.A03(-1494460276);
        EB4.super.onSuccess(dvu);
        FragmentActivity fragmentActivity = this.A00;
        if (fragmentActivity == null || fragmentActivity.isFinishing() || fragmentActivity.isDestroyed()) {
            i = 943397175;
        } else {
            AnonymousClass0aP r5 = this.A01;
            02m.A0p.markerPoint(725095506, AnonymousClass000.A00(1611));
            String str = dvu.A01;
            String str2 = this.A02;
            if (Dbj.A00().equals(str2)) {
                String formatNumber = PhoneNumberUtils.formatNumber(str.replace("+", ""));
                Pattern pattern = 0mp.A01;
                if (formatNumber == null) {
                    formatNumber = "";
                }
                str = Dbc.A0F(fragmentActivity, formatNumber).toString();
            }
            DbT.A15();
            ArrayList arrayList = dvu.A02;
            String str3 = dvu.A00;
            boolean z = this.A03;
            Bundle A0a = AnonymousClass7TE.A0a();
            AnonymousClass4DH r2 = new AnonymousClass4DH();
            Bundle A0C = DbX.A0C("IgSessionManager.LOGGED_OUT_TOKEN");
            A0C.putParcelableArrayList("lookup_users", arrayList);
            A0C.putString("login_nonce", str3);
            A0C.putString("recovery_handle_type", str2);
            A0C.putString("recovery_handle", str);
            A0C.putBoolean("is_shared_phone_recovery_via_link", z);
            A0C.putAll(A0a);
            r2.setArguments(A0C);
            Dbb.A14(r2, fragmentActivity, r5);
            i = -2044462089;
        }
        AnonymousClass0fD.A0A(i, A033);
        AnonymousClass0fD.A0A(-97425919, A032);
    }
}
