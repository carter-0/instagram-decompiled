package X;

import android.content.Context;
import com.facebookpay.logging.LoggingContext;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.UserStoryTarget;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* renamed from: X.Ixx  reason: case insensitive filesystem */
public final class C58812Ixx extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        LoggingContext loggingContext;
        0sP r3;
        1Ln r0;
        Object obj2 = obj;
        switch (this.A00) {
            case 1:
                0qQ.A0B(obj, 0);
                HNF hnf = (HNF) this.A02;
                HO3 ho3 = null;
                if (!(hnf == HNF.UNSET_OR_UNRECOGNIZED_ENUM_VALUE || hnf == null)) {
                    String name = hnf.name();
                    Locale locale = Locale.US;
                    0qQ.A08(locale);
                    String upperCase = name.toUpperCase(locale);
                    0qQ.A07(upperCase);
                    ho3 = HO3.valueOf(upperCase);
                }
                String str = this.A05;
                int hashCode = str.hashCode();
                if (hashCode != -1785516855) {
                    if (hashCode != 1996002556) {
                        if (hashCode == 2012838315 && str.equals("DELETE")) {
                            C12411Sto A0g = C51965G9l.A0g();
                            LoggingContext loggingContext2 = (LoggingContext) this.A03;
                            boolean z = this.A07;
                            Object obj3 = this.A01;
                            SEB seb = (SEB) this.A04;
                            LinkedHashMap A1H = AnonymousClass7TE.A1H();
                            if (seb != null) {
                                SUU.A0A(seb, A1H);
                            }
                            A1H.put("error_message", obj);
                            AnonymousClass7TF.A1B(loggingContext2, 0, obj3);
                            C12411Sto.A03(C51965G9l.A0U(C51969G9p.A0d(A0g.A00, "client_remove_fbpayaccountmutation_fail"), 109), loggingContext2, new C58788IxZ(1, loggingContext2, obj3, A1H, ho3, z));
                            break;
                        }
                    } else if (str.equals("CREATE")) {
                        C12411Sto A0g2 = C51965G9l.A0g();
                        loggingContext = (LoggingContext) this.A03;
                        boolean z2 = this.A07;
                        Object obj4 = this.A01;
                        String str2 = this.A06;
                        if (str2 != null) {
                            SEB seb2 = (SEB) this.A04;
                            LinkedHashMap A1H2 = AnonymousClass7TE.A1H();
                            if (seb2 != null) {
                                SUU.A0A(seb2, A1H2);
                            }
                            A1H2.put("error_message", obj);
                            AnonymousClass7TF.A1B(loggingContext, 0, obj4);
                            r0 = C51965G9l.A0U(C51969G9p.A0d(A0g2.A00, "client_add_fbpayaccountmutation_fail"), 21);
                            r3 = new C58801Ixm(loggingContext, obj4, ho3, A1H2, str2, 0, z2);
                        } else {
                            throw AnonymousClass7TE.A0y();
                        }
                    }
                    throw AnonymousClass7TF.A0W(AnonymousClass000.A00(970), str);
                }
                if (str.equals("UPDATE")) {
                    C12411Sto A0g3 = C51965G9l.A0g();
                    loggingContext = (LoggingContext) this.A03;
                    boolean z3 = this.A07;
                    Object obj5 = this.A01;
                    SEB seb3 = (SEB) this.A04;
                    LinkedHashMap A1H3 = AnonymousClass7TE.A1H();
                    if (seb3 != null) {
                        SUU.A0A(seb3, A1H3);
                    }
                    A1H3.put("error_message", obj);
                    AnonymousClass7TF.A1B(loggingContext, 0, obj5);
                    r0 = C51965G9l.A0U(C51969G9p.A0d(A0g3.A00, "client_edit_fbpayaccountmutation_fail"), 30);
                    r3 = new C58788IxZ(0, loggingContext, obj5, A1H3, ho3, z3);
                }
                throw AnonymousClass7TF.A0W(AnonymousClass000.A00(970), str);
                C12411Sto.A03(r0, loggingContext, r3);
                break;
            case 2:
                AnonymousClass5VN r02 = (AnonymousClass5VN) obj2;
                0qQ.A0B(r02, 0);
                if (!this.A07) {
                    C284945Oz r8 = (C284945Oz) this.A04;
                    Object value = r8.getValue();
                    if (value == null) {
                        ((0sP) this.A02).invoke(this.A06);
                        break;
                    } else {
                        ((0sJ) this.A03).invoke(this.A06, value, I2D.A01(r02), new C58719IwS(this.A01, r8, this.A05, 35));
                        break;
                    }
                }
                break;
            case 3:
                if (AnonymousClass7TE.A1a(obj)) {
                    C363008it r1 = ((C61438K7n) this.A04).A05;
                    if (r1 == null) {
                        0qQ.A0F("shareToFBController");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    r1.A04(true);
                }
                C61438K7n.A02((Context) this.A01, (C61438K7n) this.A04, (C61002Juy) this.A02, (UserStoryTarget) this.A03, this.A06, this.A05, this.A07);
                break;
            default:
                C254783t2 r03 = (C254783t2) obj2;
                0qQ.A0B(r03, 0);
                List list = (List) this.A01;
                String str3 = this.A06;
                C18513VtC.A00(new DirectShareTarget(r03, str3, list, AnonymousClass7TF.A1U(0, list, str3)), (C255773uh) this.A02, (C18513VtC) this.A04, (User) this.A03, this.A05, this.A07);
                break;
        }
        return C60340gF.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58812Ixx(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, int i, boolean z) {
        super(1);
        this.A00 = i;
        this.A02 = obj;
        this.A05 = str;
        this.A03 = obj2;
        this.A07 = z;
        this.A01 = obj3;
        this.A06 = str2;
        this.A04 = obj4;
    }
}
