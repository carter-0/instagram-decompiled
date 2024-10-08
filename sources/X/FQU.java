package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.RadioGroup;
import androidx.fragment.app.Fragment;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

public final class FQU implements RadioGroup.OnCheckedChangeListener {
    public final int A00;
    public final Object A01;

    public FQU(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        Integer num;
        String str;
        FAR far;
        Integer num2;
        switch (this.A00) {
            case 0:
                E7E e7e = (E7E) this.A01;
                switch (AnonymousClass05K.A00(3)[i].intValue()) {
                    case 1:
                        str = "CALL";
                        break;
                    case 2:
                        str = "TEXT";
                        break;
                    default:
                        str = "UNKNOWN";
                        break;
                }
                e7e.A03 = str;
                if (e7e.A01 != null && !TextUtils.isEmpty(AnonymousClass7TF.A0f(e7e.A02.A01))) {
                    E7E.A00(e7e);
                    if (!e7e.A03.equals(e7e.A04)) {
                        e7e.A05 = true;
                    }
                    e7e.A01.setEnabled(e7e.A05);
                    return;
                }
                return;
            case 1:
                C47534E6x e6x = (C47534E6x) this.A01;
                List list = e6x.A05;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (i == ((View) list.get(i2)).getId()) {
                        e6x.A00 = i2;
                    }
                }
                return;
            case 2:
                E70 e70 = (E70) this.A01;
                Integer[] A002 = AnonymousClass05K.A00(4);
                int length = A002.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length) {
                        num = A002[i3];
                        if (F75.A01(num) != i) {
                            i3++;
                        }
                    } else {
                        num = AnonymousClass05K.A0N;
                    }
                }
                e70.A03 = num;
                IgFormField igFormField = e70.A01;
                if (igFormField != null) {
                    if (num == AnonymousClass05K.A0C) {
                        igFormField.setVisibility(0);
                        igFormField.getMEditText().requestFocus();
                        0nA.A0R(igFormField.getMEditText());
                    } else {
                        igFormField.setVisibility(8);
                        0nA.A0N(igFormField);
                    }
                }
                e70.A05 = true;
                E70.A00(e70);
                return;
            case 3:
                Object obj = C47424E1s.A02.get(Integer.valueOf(i));
                if (obj != null) {
                    Dc9 dc9 = (Dc9) obj;
                    C47424E1s e1s = (C47424E1s) this.A01;
                    AnonymousClass0eM r4 = e1s.A01;
                    UserSession A0l = AnonymousClass7TE.A0l(r4);
                    User user = e1s.A00;
                    if (user != null) {
                        C49807F7u.A00(DbT.A05(e1s.requireContext()), A0l, dc9, user);
                        User user2 = e1s.A00;
                        if (user2 != null) {
                            C313746gw.A00(AnonymousClass7TE.A0l(r4)).A0I(dc9, user2.getId(), false);
                            return;
                        }
                    }
                    0qQ.A0F("displayedUser");
                    throw AnonymousClass00P.createAndThrow();
                }
                throw AnonymousClass7TE.A0y();
            case 4:
                C48029ERs eRs = (C48029ERs) this.A01;
                String valueOf = String.valueOf(i);
                Iterator it = eRs.A00.iterator();
                while (true) {
                    if (it.hasNext()) {
                        far = (FAR) it.next();
                        if (0qQ.A0K(far.A00, valueOf)) {
                        }
                    } else {
                        Context context = eRs.getContext();
                        0qQ.A0A(context);
                        if (AnonymousClass3HA.A00(context)) {
                            far = FAR.A04;
                        } else {
                            far = FAR.A06;
                        }
                    }
                }
                int i4 = far.A02;
                IgFragmentActivity requireActivity = eRs.requireActivity();
                0qQ.A0C(requireActivity, Pxd.A00(9));
                requireActivity.setDefaultNightMode(i4);
                long j = -1;
                if (i4 != -1) {
                    if (i4 != 1) {
                        j = 2;
                    } else {
                        j = 1;
                    }
                }
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01((AnonymousClass0iw) null, DbT.A0X(eRs.A01)), "dark_mode_in_app_toggled");
                if (A0e.isSampled()) {
                    A0e.A9F("in_app_dark_mode_setting", Long.valueOf(j));
                    A0e.Cgf();
                    return;
                }
                return;
            case 5:
                ES7 targetFragment = ((Fragment) this.A01).getTargetFragment();
                if (targetFragment != null) {
                    ES7 es7 = targetFragment;
                    0qQ.A0A(es7);
                    UserSession userSession = es7.A00;
                    if (userSession != null) {
                        0xY A0N = AnonymousClass7TF.A0N(userSession);
                        A0N.E5Z("data_saver_network_resources_quality", i);
                        A0N.apply();
                        return;
                    }
                    throw AnonymousClass7TE.A0y();
                }
                throw AnonymousClass7TE.A0y();
            default:
                if (i == 0) {
                    num2 = AnonymousClass05K.A01;
                } else if (i != 1) {
                    num2 = AnonymousClass05K.A00;
                } else {
                    num2 = AnonymousClass05K.A0C;
                }
                C64986LlP llP = (C64986LlP) this.A01;
                UserSession userSession2 = llP.A0C;
                1Av A003 = 1Au.A00(userSession2);
                String str2 = "anyone";
                String A004 = AnonymousClass000.A00(754);
                String string = A003.A01.getString(A004, str2);
                0qQ.A07(string);
                Integer num3 = AnonymousClass05K.A01;
                if (!str2.equals(string)) {
                    num3 = AnonymousClass05K.A0C;
                    if (!"following".equals(string)) {
                        num3 = AnonymousClass05K.A00;
                    }
                }
                1Av A005 = 1Au.A00(userSession2);
                switch (num2.intValue()) {
                    case 0:
                        str2 = "off";
                        break;
                    case 1:
                        break;
                    default:
                        str2 = "following";
                        break;
                }
                DbX.A1U(A005.A01, A004, str2);
                C47518E6c e6c = llP.A0E;
                1OC A02 = 1NP.A02(userSession2, num2);
                A02.A00 = new C47656EBq(3, this, num3);
                e6c.schedule(A02);
                C64986LlP.A04(llP);
                return;
        }
    }
}
