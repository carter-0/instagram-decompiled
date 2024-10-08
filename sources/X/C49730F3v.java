package X;

import android.os.Bundle;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.business.fragment.SupportServiceEditUrlFragment;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.leadgen.core.model.LeadGenBaseFormList;
import com.instagram.leadgen.organic.model.LeadGenFormData;
import com.instagram.model.business.Address;
import java.util.List;

/* renamed from: X.F3v  reason: case insensitive filesystem */
public final class C49730F3v {
    public final Fragment A00(Bundle bundle, SparseArray sparseArray, C319586qr r10, UserSession userSession) {
        String str;
        0qQ.A0B(userSession, 1);
        boolean z = bundle.getBoolean(AnonymousClass000.A00(865), false);
        boolean A01 = FRZ.A01(userSession, true);
        FCT.A01((AnonymousClass0iw) null, userSession, "igwb", "safety_step_entered", (String) null);
        if (A01) {
            boolean A2I = AnonymousClass7TF.A0Q(userSession).A2I();
            boolean A1X = AnonymousClass7TG.A1X(DbX.A0m(userSession).CUd());
            String A0l = DbS.A0l(bundle);
            if (A0l == null) {
                A0l = "";
            }
            0eP A1L = AnonymousClass7TE.A1L("entrypoint", A0l);
            0eP A1L2 = AnonymousClass7TE.A1L("should_show_hide_messages_toggle", String.valueOf(!A2I));
            0eP A1L3 = AnonymousClass7TE.A1L("should_show_hide_comments_toggle", String.valueOf(!A1X));
            if (r10 == C319586qr.INTEREST_ACCOUNT_CONVERSION) {
                str = "interest_account_conversion";
            } else {
                str = "interest_account_signup";
            }
            C46649DiU A04 = C46649DiU.A04("com.instagram.bullying.pro_account.safety_step", 0Yt.A02(AnonymousClass7TH.A0h("logger_flow", str, A1L, A1L2, A1L3)));
            A04.A02 = sparseArray;
            IgBloksScreenConfig A0N = DbS.A0N(userSession);
            A0N.A0U = "";
            A0N.A0j = z;
            return C49891FBs.A02(A0N, A04);
        }
        E3R e3r = new E3R();
        e3r.setArguments(bundle);
        return e3r;
    }

    public final Fragment A04(UserSession userSession, LeadGenFormData leadGenFormData) {
        Fragment umq;
        Bundle A0B = DbV.A0B(userSession, 1);
        A0B.putParcelable("args_form_data", leadGenFormData);
        if (VES.A00(userSession)) {
            umq = new C15306UaD();
        } else {
            umq = new C16009Umq();
        }
        Fragment fragment = umq;
        fragment.setArguments(A0B);
        return fragment;
    }

    public final SupportServiceEditUrlFragment A06(SMBPartnerType sMBPartnerType, String str, String str2, String str3, String str4, String str5, String str6) {
        DbW.A1N(str, 0, str6);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("APP_ID", str2);
        A0a.putString("PARTNER_NAME", str3);
        A0a.putString("PLACEHOLDER_URL", str4);
        A0a.putString("AUTOFILL_URL", str5);
        Dba.A0v(A0a, str6, str);
        A0a.putSerializable("args_service_type", sMBPartnerType);
        SupportServiceEditUrlFragment supportServiceEditUrlFragment = new SupportServiceEditUrlFragment();
        supportServiceEditUrlFragment.setArguments(A0a);
        return supportServiceEditUrlFragment;
    }

    public final SupportServiceEditUrlFragment A07(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        0qQ.A0B(str, 0);
        AnonymousClass7TG.A1S(str6, str7);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("APP_ID", str2);
        A0a.putString("PARTNER_NAME", str3);
        A0a.putString("PLACEHOLDER_URL", str4);
        A0a.putString("AUTOFILL_URL", str5);
        Dba.A0v(A0a, str6, str);
        A0a.putString("args_category_type", str7);
        SupportServiceEditUrlFragment supportServiceEditUrlFragment = new SupportServiceEditUrlFragment();
        supportServiceEditUrlFragment.setArguments(A0a);
        return supportServiceEditUrlFragment;
    }

    public final Fragment A01(UserSession userSession, ImageUrl imageUrl, String str, String str2, List list, boolean z) {
        Fragment umn;
        Bundle A0a = AnonymousClass7TE.A0a();
        if (str != null) {
            A0a.putString(AnonymousClass000.A00(2650), str);
        }
        if (imageUrl != null) {
            A0a.putParcelable("args_cover_photo_media_id", imageUrl);
        }
        A0a.putParcelableArrayList("args_form_data", AnonymousClass7TE.A1D(list));
        A0a.putString("args_entry_point", str2);
        A0a.putBoolean(AnonymousClass000.A00(1106), z);
        if (VES.A00(userSession)) {
            umn = new UZQ();
        } else {
            umn = new C16006Umn();
        }
        Fragment fragment = umn;
        fragment.setArguments(A0a);
        return fragment;
    }

    public final Fragment A02(UserSession userSession, LeadGenBaseFormList leadGenBaseFormList, LeadGenFormData leadGenFormData, boolean z) {
        Fragment umh;
        AnonymousClass7TG.A1N(leadGenFormData, leadGenBaseFormList);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putParcelable("args_form_data", leadGenFormData);
        A0a.putParcelable("args_form_list_data", leadGenBaseFormList);
        A0a.putBoolean(AnonymousClass000.A00(1108), z);
        if (VES.A00(userSession)) {
            umh = new C15307UaE();
        } else {
            umh = new C16000Umh();
        }
        Fragment fragment = umh;
        fragment.setArguments(A0a);
        return fragment;
    }

    public final Fragment A03(UserSession userSession, LeadGenBaseFormList leadGenBaseFormList, String str) {
        Fragment uaM;
        DbY.A1S(userSession, leadGenBaseFormList);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("args_entry_point", str);
        A0a.putParcelable("args_form_list_data", leadGenBaseFormList);
        if (VES.A00(userSession)) {
            uaM = new C15311UaI();
        } else {
            uaM = new UaM();
        }
        Fragment fragment = uaM;
        fragment.setArguments(A0a);
        return fragment;
    }

    public final C47479E4e A05(Address address, Integer num, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Bundle A0B = DbX.A0B(str);
        A0B.putParcelable(C47492E4w.A0H, address);
        A0B.putString("BusinessLocationFragment.EXTRA_ADDITIONAL_ADDRESS_ID", str2);
        A0B.putBoolean("BusinessLocationFragment.EXTRA_SHOULD_SHOW_IN_MODAL", z);
        A0B.putBoolean("BusinessLocationFragment.EXTRA_IS_MV4B_VERIFIED", z2);
        if (num != null) {
            A0B.putInt("BusinessLocationFragment.NUM_EDITS_LEFT_BEFORE_REACHING_MULTIPLE_ADDRESSES_LIMIT", num.intValue());
        }
        A0B.putBoolean("BusinessLocationFragment.EXTRA_IS_REMOVE_LOCKED_FOR_MULTIPLE_ADDRESSES", z3);
        A0B.putBoolean("BusinessLocationFragment.EXTRA_IS_ADDING_NEW_ADDRESS", z4);
        A0B.putBoolean("BusinessLocationFragment.EXTRA_SHOULD_HIDE_PRIMARY_LOCATION_HEADER", z5);
        Fragment r0 = new AnonymousClass4DH();
        r0.setArguments(A0B);
        return r0;
    }
}
