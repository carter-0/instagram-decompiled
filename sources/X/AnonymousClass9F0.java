package X;

import android.text.SpannableStringBuilder;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteWhatsAppAccountType;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.9F0  reason: invalid class name */
public final class AnonymousClass9F0 {
    public static final C376009Ge A01(AnonymousClass9JK r1, UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return (C376009Ge) ((AnonymousClass9F7) AnonymousClass9F3.A00(userSession).A02.getValue()).Au3(r1);
    }

    public static final void A03(FragmentActivity fragmentActivity, B1D b1d, UserSession userSession, String str, String str2) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(str, 3);
        HashMap hashMap = new HashMap();
        hashMap.put("entrypoint", str2);
        hashMap.put("back_stack_tag", str);
        C46649DiU A04 = C46649DiU.A04(AnonymousClass000.A00(46), hashMap);
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig((0lg) userSession);
        igBloksScreenConfig.A0U = fragmentActivity.getString(2131976852);
        igBloksScreenConfig.A03 = new C384989iD(b1d);
        AnonymousClass3M3 A02 = C49891FBs.A02(igBloksScreenConfig, A04);
        C309516Yo r0 = new C309516Yo(fragmentActivity, userSession);
        r0.A0A = str;
        r0.A08();
        r0.A0D(A02);
        r0.A04();
    }

    public final SpannableStringBuilder A05(FragmentActivity fragmentActivity, PromoteData promoteData, UserSession userSession) {
        String string;
        0qQ.A0B(userSession, 2);
        String string2 = fragmentActivity.getString(2131970381);
        0qQ.A07(string2);
        String string3 = fragmentActivity.getString(2131970388);
        0qQ.A07(string3);
        if (promoteData.A2X) {
            string = fragmentActivity.getString(2131970383, new Object[]{string3});
        } else {
            string = fragmentActivity.getString(2131970385);
        }
        0qQ.A0A(string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (promoteData.A2u) {
            spannableStringBuilder.append("\n");
            spannableStringBuilder.append(string2);
        }
        if (promoteData.A2o) {
            spannableStringBuilder.append("\n");
            spannableStringBuilder.append(string);
            if (promoteData.A2X) {
                A02(spannableStringBuilder, fragmentActivity, userSession, string3, AnonymousClass000.A00(3255));
            }
        }
        return spannableStringBuilder;
    }

    public final SpannableStringBuilder A06(FragmentActivity fragmentActivity, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        String string = fragmentActivity.getString(2131970324);
        0qQ.A07(string);
        String string2 = fragmentActivity.getString(2131970323);
        0qQ.A07(string2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        A02(spannableStringBuilder, fragmentActivity, userSession, string2, "https://www.facebook.com/business/help/128066880933676");
        return spannableStringBuilder;
    }

    public final SpannableStringBuilder A07(FragmentActivity fragmentActivity, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        String string = fragmentActivity.getString(2131970391);
        0qQ.A07(string);
        String string2 = fragmentActivity.getString(2131970392, new Object[]{string});
        0qQ.A07(string2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
        A02(spannableStringBuilder, fragmentActivity, userSession, string, "https://www.facebook.com/privacy/policy");
        return spannableStringBuilder;
    }

    public final SpannableStringBuilder A08(FragmentActivity fragmentActivity, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        String string = fragmentActivity.getString(2131970390);
        0qQ.A07(string);
        String string2 = fragmentActivity.getString(2131970393);
        0qQ.A07(string2);
        String string3 = fragmentActivity.getString(2131970389, new Object[]{string, string2});
        0qQ.A07(string3);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string3);
        A02(spannableStringBuilder, fragmentActivity, userSession, string, AnonymousClass000.A00(157));
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        A02(spannableStringBuilder2, fragmentActivity, userSession, string2, "https://www.whatsapp.com/legal/commerce-policy/");
        return spannableStringBuilder2;
    }

    public final void A09(UserSession userSession, Class cls) {
        0qQ.A0B(userSession, 0);
        AnonymousClass9JK A00 = A00(cls);
        ((AnonymousClass9F7) AnonymousClass9F3.A00(userSession).A02.getValue()).AUs(A00, AnonymousClass9F1.A00, new AnonymousClass9FD(A00, userSession));
    }

    public static final boolean A04(PromoteData promoteData) {
        UserSession userSession = promoteData.A0y;
        0qQ.A06(userSession);
        if (!0eE.A00(userSession).A00().A1d() || !PromoteWhatsAppAccountType.SMB.equals(promoteData.A0x)) {
            return false;
        }
        return true;
    }

    public static final AnonymousClass9JK A00(Class cls) {
        return new AnonymousClass9JK(CallerContext.A00(cls), "ig_android_whatsapp_asset_ig_to_fb_crossposting", PublicKeyCredentialControllerUtility.JSON_KEY_USER, "correctnessTest", "hasWhatsappNumber");
    }

    public static final void A02(SpannableStringBuilder spannableStringBuilder, FragmentActivity fragmentActivity, UserSession userSession, String str, String str2) {
        AnonymousClass7AV.A05(spannableStringBuilder, new C48037ESc(fragmentActivity, userSession, str2, fragmentActivity.getColor(2Yu.A06(fragmentActivity))), str);
    }
}
