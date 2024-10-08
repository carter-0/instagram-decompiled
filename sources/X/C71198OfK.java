package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;

/* renamed from: X.OfK  reason: case insensitive filesystem */
public final class C71198OfK implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;

    public C71198OfK(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str, int i) {
        this.A00 = i;
        this.A06 = obj4;
        this.A01 = obj;
        this.A03 = obj3;
        this.A02 = obj2;
        this.A07 = str;
        this.A05 = obj5;
        this.A04 = obj6;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        if (this.A00 != 0) {
            C71093OcF ocF = (C71093OcF) this.A06;
            User user = ocF.A01;
            if (user != null && (str = ocF.A05) != null) {
                if (ocF.A0B == null) {
                    BigInteger bigInteger = null;
                    Long A10 = AnonymousClass7TE.A10(str);
                    if (A10 != null) {
                        1a8 r4 = new 1a8((C269794fh) null);
                        C71077Oaw oaw = (C71077Oaw) this.A02;
                        ImmutableList A0K = DbU.A0K((Collection) this.A05);
                        String str2 = this.A07;
                        String str3 = ocF.A09;
                        String str4 = ocF.A07;
                        if (str4 != null) {
                            bigInteger = 012.A0r(str4);
                        }
                        String str5 = ocF.A08;
                        Long l = ocF.A04;
                        Long BST = user.BST();
                        if (BST != null) {
                            long longValue = BST.longValue();
                            1aU A012 = 1aU.A01(OuT.A00, MYc.A01(oaw.A00, "MsysReportUtil").A01.A0C.A0M(new C72049OvO(A0K, A10, l, BST, str2, str3, str5, bigInteger)), C71077Oaw.A00(oaw, str2, longValue));
                            Object obj = this.A04;
                            r4.A02(A012, new PSW(4, this.A01, this.A03, obj, oaw));
                            return;
                        }
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                C61480nO A002 = 0nY.A00();
                0qQ.A07(A002);
                String str6 = this.A07;
                C71093OcF ocF2 = ocF;
                A002.ATE(new C68668NSa((C307896Rx) this.A01, (C277014uI) this.A04, (C277014uI) this.A03, user, ocF2, (C71077Oaw) this.A02, str6, (List) this.A05));
                return;
            }
            return;
        }
        UserSession userSession = (UserSession) this.A06;
        AnonymousClass818 r2 = (AnonymousClass818) this.A02;
        C63428Kwo.A00((FragmentActivity) this.A01, r2, (AnonymousClass4DH) this.A03, userSession, (C363008it) this.A05, this.A07);
        C64071LLp.A00(r2, C368278sM.ACCEPT, userSession);
        DbS.A1U(this.A04);
    }
}
