package X;

import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.google.common.collect.ImmutableMap;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.HashMap;

/* renamed from: X.LXj  reason: case insensitive filesystem */
public final class C64257LXj implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public C64257LXj(Object obj, Object obj2, Object obj3, String str, String str2, String str3, int i) {
        this.A00 = i;
        this.A01 = obj3;
        this.A03 = obj2;
        this.A02 = obj;
        this.A06 = str;
        this.A04 = str2;
        this.A05 = str3;
    }

    public final void onClick(View view) {
        int A052;
        int i;
        String str;
        if (this.A00 != 0) {
            A052 = AnonymousClass0fD.A05(-2064396560);
            String str2 = this.A04;
            if (str2 != null) {
                String str3 = this.A05;
                UserSession userSession = (UserSession) this.A03;
                AnonymousClass0iw r0 = (AnonymousClass0iw) this.A01;
                String str4 = this.A06;
                if (str3 != null) {
                    0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r0, userSession), C273654mx.A00(308));
                    A0e.AAJ("netego_id", str2);
                    A0e.AAJ(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str3);
                    A0e.AAJ(AnonymousClass000.A00(1900), str4);
                    A0e.A9F(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, AnonymousClass7TE.A10(userSession.A06));
                    A0e.Cgf();
                }
            }
            C51981GAe gAe = (C51981GAe) this.A02;
            if (gAe != null) {
                gAe.A00();
            }
            i = -2021625590;
        } else {
            A052 = AnonymousClass0fD.A05(-1034843814);
            DbX.A14(((View) this.A01).getContext(), AnonymousClass37D.A00);
            K4Q k4q = (K4Q) this.A03;
            C313616gj r12 = k4q.A00;
            if (r12 == null) {
                str = "delegate";
            } else {
                String str5 = k4q.A01;
                if (str5 == null) {
                    str = "broadcastID";
                } else {
                    C2815858p r11 = (C2815858p) this.A02;
                    String str6 = this.A06;
                    String str7 = this.A04;
                    String str8 = this.A05;
                    C51972G9s.A1D(str7, str8);
                    C64102LMw lMw = r12.A07;
                    if (lMw != null) {
                        FragmentActivity fragmentActivity = r12.A0J;
                        1a8 r8 = lMw.A01;
                        UserSession userSession2 = lMw.A02;
                        SHQ A002 = C63357Kve.A00(userSession2);
                        String str9 = lMw.A03;
                        0qQ.A0B(str9, 0);
                        r8.A02(SHQ.A00(A002, str9).A0G(), new M1P(1, lMw, r11, r12));
                        HashMap A0f = Dba.A0f("price", str6);
                        String str10 = r11.A02;
                        String str11 = str10;
                        ((T7R) lMw.A04.getValue()).A02(fragmentActivity, new C7610QOs(RF1.ITEM_TYPE_INAPP, str11, 002.A15("{\"product_id\":\"", str7, "\", \"payee_id\":\"", str8, "\", \"payer_id\":\"", userSession2.A06, "\"}"), str7, str5, ImmutableMap.copyOf(A0f)), (C13713Tfb) null, (C10300Rpy) null);
                    }
                    i = 1742003448;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass0fD.A0C(i, A052);
    }
}
