package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData;
import com.facebook.android.instantexperiences.autofill.model.EmailAutofillData;
import com.facebook.android.instantexperiences.autofill.model.FbAutofillData;
import com.facebook.android.instantexperiences.autofill.model.NameAutofillData;
import com.facebook.android.instantexperiences.autofill.model.TelephoneAutofillData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

public final class T0S implements 2IR {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public T0S(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public final void onFailure(Throwable th) {
        switch (this.A00) {
            case 0:
                0qQ.A0B(th, 0);
                ((1K2) this.A01).setException(th);
                return;
            case 1:
                0qQ.A0B(th, 0);
                ((00W) this.A01).Cti(new ActivityResult(0, DbS.A09().putExtra("result_type", "refresh_token")));
                SRE sre = SRE.A00;
                Integer num = AnonymousClass05K.A1I;
                Pxk.A0Q((Bundle) this.A02, (C58840Ae) this.A03, sre, num, th);
                return;
            case 2:
                0qQ.A0B(th, 0);
                S7S s7s = ((C11329SNi) this.A03).A04;
                s7s.A04((String) null);
                s7s.A00();
                RHJ rhj = RHJ.A07;
                RuntimeException runtimeException = new RuntimeException("Unable to get nonce from provider", th);
                00k.A0S(AnonymousClass7TE.A1I(rhj), (Collection) this.A02);
                ((C10321RqJ) this.A01).A00.setException(runtimeException);
                return;
            default:
                0qQ.A0B(th, 0);
                if (th instanceof CancellationException) {
                    ((Q2X) this.A02).DeE();
                } else if (!((AnonymousClass6OE) this.A03).A02.A02) {
                    ((Q2X) this.A02).DeO(th);
                }
                ((XFY) this.A01).A00.A01(th);
                return;
        }
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        SRE sre;
        C58840Ae r3;
        Integer num;
        Bundle bundle;
        String str2;
        C13937Tlf tlf;
        C13936Tle tle;
        switch (this.A00) {
            case 0:
                Map map = (Map) obj;
                0qQ.A0B(map, 0);
                C11238SGy sGy = ((C10662Rvw) this.A03).A01;
                Map map2 = (Map) this.A02;
                ArrayList A0q = AnonymousClass7TF.A0q(map2, 0);
                SI1 si1 = C11238SGy.A02;
                A0q.addAll(si1.A02(map2));
                A0q.addAll(sGy.A00(map2));
                A0q.addAll(si1.A01(map2));
                A0q.addAll(SI1.A00(map2));
                ArrayList A1C = AnonymousClass7TE.A1C();
                Iterator it = A0q.iterator();
                while (it.hasNext()) {
                    BrowserExtensionsAutofillData browserExtensionsAutofillData = (BrowserExtensionsAutofillData) it.next();
                    ArrayList A1C2 = AnonymousClass7TE.A1C();
                    if (browserExtensionsAutofillData instanceof TelephoneAutofillData) {
                        str = "telephone-autofill-data";
                    } else if (browserExtensionsAutofillData instanceof NameAutofillData) {
                        str = "name-autofill-data";
                    } else if (browserExtensionsAutofillData instanceof EmailAutofillData) {
                        str = "email-autofill-data";
                    } else {
                        str = "address-autofill-data";
                    }
                    Collection collection = (Collection) map.get(str);
                    if (collection != null) {
                        A1C2.addAll(collection);
                    }
                    if (!(A1C2 instanceof Collection) || !A1C2.isEmpty()) {
                        Iterator it2 = A1C2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (browserExtensionsAutofillData.Ccl((FbAutofillData) it2.next())) {
                                }
                            }
                        }
                    }
                    if (!A1C2.contains(browserExtensionsAutofillData)) {
                        JTR.A1S(browserExtensionsAutofillData, A1C);
                    }
                }
                ((1K2) this.A01).set(A1C);
                return;
            case 1:
                AnonymousClass3JD r8 = (AnonymousClass3JD) obj;
                if (!(r8 == null || (tlf = (C13937Tlf) r8.Bny()) == null || (tle = (C13936Tle) ((C250663lr) tlf).getOptionalTreeField(0, "xfb_amazon_bwp_refresh_access_token(extra_data:$extra_data)", C7631QQx.class, -1052618405)) == null)) {
                    C250663lr r1 = (C250663lr) tle;
                    String optionalStringField = r1.getOptionalStringField(0, "access_token");
                    int coercedIntField = r1.getCoercedIntField(1, "expiry_time");
                    Integer valueOf = Integer.valueOf(coercedIntField);
                    if (!(optionalStringField == null || valueOf == null || coercedIntField == 0)) {
                        Intent putExtra = DbS.A09().putExtra("result_type", "refresh_token").putExtra("access_token", optionalStringField).putExtra("expiry_time", coercedIntField);
                        0qQ.A07(putExtra);
                        ((00W) this.A01).Cti(new ActivityResult(-1, putExtra));
                        sre = SRE.A00;
                        r3 = (C58840Ae) this.A03;
                        num = AnonymousClass05K.A15;
                        bundle = (Bundle) this.A02;
                        str2 = null;
                        sre.A02(bundle, r3, num, str2);
                        return;
                    }
                }
                sre = SRE.A00;
                r3 = (C58840Ae) this.A03;
                num = AnonymousClass05K.A1I;
                bundle = (Bundle) this.A02;
                str2 = "null access token";
                sre.A02(bundle, r3, num, str2);
                return;
            case 2:
                String str3 = (String) obj;
                C11329SNi sNi = (C11329SNi) this.A03;
                sNi.A04.A04(str3);
                C10321RqJ rqJ = (C10321RqJ) this.A01;
                List list = (List) this.A02;
                if (str3 != null) {
                    C11329SNi.A00(sNi, rqJ, str3, list);
                    return;
                }
                return;
            default:
                XFY xfy = (XFY) this.A01;
                if (obj == null) {
                    0qQ.A0B("Keyframes drawable is null", 1);
                    xfy.A00.A01(new Exception("Keyframes drawable is null", (Throwable) null));
                    return;
                }
                xfy.A00.A00(obj);
                return;
        }
    }
}
