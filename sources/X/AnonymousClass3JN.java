package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.3JN  reason: invalid class name */
public final class AnonymousClass3JN implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass354 A00;

    public AnonymousClass3JN(AnonymousClass354 r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        Integer num;
        int A05 = AnonymousClass0fD.A05(-1558893147);
        AnonymousClass354 r0 = this.A00;
        C227802jw A002 = AnonymousClass354.A00(r0);
        if (A002 != null) {
            UserSession userSession = r0.A01;
            FragmentActivity requireActivity = A002.requireActivity();
            AnonymousClass4DU r1 = r0.A02;
            AB2.A01(userSession, r1, "main_overflow");
            C46447Df9.A03();
            E3T A003 = C49079Eox.A00(userSession);
            C323256xC r9 = new C323256xC(requireActivity, A002, userSession, r1);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C319156q8(r9, C273654mx.A00(987), (int) R.drawable.instagram_save_pano_outline_24, 2131972603));
            if (AnonymousClass0t1.A01.A01(userSession).A1P()) {
                num = AnonymousClass05K.A0Y;
            } else {
                num = AnonymousClass05K.A00;
            }
            C319156q8 A004 = C319186qB.A00(r9, num);
            if (A004 != null) {
                arrayList.add(A004);
            }
            C319156q8 r12 = new C319156q8(r9, C273654mx.A00(984), (int) R.drawable.instagram_user_follow_pano_outline_24, 2131973986);
            r9.A02 = true;
            arrayList.add(r12);
            arrayList.add(new C319156q8(r9, C273654mx.A00(3404), (int) R.drawable.instagram_settings_pano_outline_24, 2131973150));
            A003.A03.Epw(arrayList);
            A003.A00(requireActivity, userSession);
        }
        AnonymousClass0fD.A0C(460687321, A05);
    }
}
