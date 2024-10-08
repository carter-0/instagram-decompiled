package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.react.views.textinput.ReactTextInputManager;
import com.google.common.collect.ImmutableList;
import fxcache.model.FxCalAccount;
import fxcache.model.FxCalAccountLinkageInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class FSA implements AnonymousClass2Kv {
    public final /* synthetic */ F0I A00;

    public FSA(F0I f0i) {
        this.A00 = f0i;
    }

    public final void invoke(AnonymousClass3JD r24) {
        ImmutableList immutableList;
        String str;
        String str2;
        String str3;
        FxCalAccount fxCalAccount;
        String str4;
        String str5;
        C250663lr reinterpretIfFulfillsType;
        C250663lr reinterpretIfFulfillsType2;
        C250663lr reinterpretIfFulfillsType3;
        if (r24 != null) {
            C250663lr A0U = C41845B3m.A0U(r24);
            ArrayList A1C = AnonymousClass7TE.A1C();
            if (A0U == null || (immutableList = A0U.A06(C43235Bux.class, AnonymousClass000.A00(4253), 1675643893)) == null) {
                immutableList = 0sn.A00;
            }
            Iterator it = immutableList.iterator();
            while (it.hasNext()) {
                C250663lr A0V = C41845B3m.A0V(it);
                0qQ.A0A(A0V);
                if (A0V.getOptionalStringField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ID) == null) {
                    str = "";
                    fxCalAccount = new FxCalAccount(str, str, str, str, str, str, str, str, 0, 0, 0);
                } else {
                    String optionalStringField = A0V.getOptionalStringField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    str = "";
                    if (optionalStringField == null) {
                        optionalStringField = str;
                    }
                    C48128EWu eWu = (C48128EWu) A0V.getOptionalEnumField(2, "platform", C48128EWu.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    if (eWu == null || (str2 = eWu.name()) == null) {
                        str2 = str;
                    }
                    String A0A = A0V.A0A(Dbq.A03());
                    if (A0A == null) {
                        A0A = str;
                    }
                    C250663lr optionalTreeField = A0V.getOptionalTreeField(7, AnonymousClass000.A00(749), C43234Buw.class, 1438484447);
                    if (optionalTreeField == null || (str3 = optionalTreeField.getOptionalStringField(0, "url")) == null) {
                        str3 = str;
                    }
                    String A08 = A0V.A08(AnonymousClass000.A00(ReactTextInputManager.IME_ACTION_ID));
                    if (A08 == null) {
                        A08 = str;
                    }
                    String A0D = A0V.A0D("instagram_id");
                    if (A0D == null) {
                        A0D = str;
                    }
                    fxCalAccount = new FxCalAccount(optionalStringField, A0D, str2, str, str3, A0A, A08, str, 0, 0, 0);
                }
                C48128EWu eWu2 = (C48128EWu) A0V.getOptionalEnumField(2, "platform", C48128EWu.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                if (eWu2 != null) {
                    str4 = eWu2.name();
                } else {
                    str4 = null;
                }
                if (str4 == null) {
                    str4 = str;
                }
                int hashCode = str4.hashCode();
                if (hashCode == -1479469166 ? !(!str4.equals("INSTAGRAM") || (reinterpretIfFulfillsType = A0V.reinterpretIfFulfillsType(5, AnonymousClass000.A00(2548), C43233Buv.class, 2073139480)) == null || (str5 = reinterpretIfFulfillsType.getOptionalStringField(0, "full_name")) == null) : !(hashCode == 69888 ? !str4.equals("FRL") || (reinterpretIfFulfillsType2 = A0V.reinterpretIfFulfillsType(6, AnonymousClass000.A00(2547), C43232Buu.class, 830488316)) == null || (str5 = reinterpretIfFulfillsType2.getOptionalStringField(0, "display_name")) == null : hashCode != 1279756998 || !str4.equals("FACEBOOK") || (reinterpretIfFulfillsType3 = A0V.reinterpretIfFulfillsType(4, AnonymousClass000.A00(2546), C43231But.class, -999713859)) == null || (str5 = reinterpretIfFulfillsType3.getOptionalStringField(0, "display_name")) == null)) {
                    str = str5;
                }
                fxCalAccount.A06 = str;
                A1C.add(fxCalAccount);
            }
            FxCalAccountLinkageInfo fxCalAccountLinkageInfo = new FxCalAccountLinkageInfo(AnonymousClass05K.A01, A1C, System.currentTimeMillis());
            F0I f0i = this.A00;
            1wM r6 = f0i.A02;
            1wg r5 = r6.A07;
            String str6 = f0i.A04;
            CallerContext callerContext = f0i.A00;
            String str7 = callerContext.A02;
            0qQ.A07(str7);
            r5.A04("manual_fetch_success", str6, (List) null, DbY.A0m("caller_class", str7));
            r6.A0A(callerContext, fxCalAccountLinkageInfo);
            AnonymousClass9EP.A00(r6.A06, f0i.A01, r6.A03, f0i.A05);
            C363768kJ r0 = f0i.A03;
            if (r0 != null) {
                r0.onSuccess();
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
