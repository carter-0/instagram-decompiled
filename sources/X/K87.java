package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.instagram.android.R;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.BrandedContentTag;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class K87 extends MYR implements AnonymousClass4DR, C66531MVj {
    public static final String __redex_internal_original_name = "MediaAudienceRestrictionsFragment";
    public String A00 = "feed";
    public boolean A01;
    public boolean A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final AnonymousClass0eM A04;

    public final boolean Cts(boolean z) {
        return false;
    }

    public final void Cu0() {
    }

    public final void Cu1() {
    }

    public final boolean CuC(boolean z) {
        return false;
    }

    public final boolean Cv5(boolean z) {
        return false;
    }

    public final boolean Dil() {
        return false;
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = requireArguments.getString("ARGUMENT_MEDIA_TYPE", "feed");
        this.A02 = requireArguments.getBoolean("ARGUMENT_IS_EDITING", false);
        this.A01 = requireArguments.getBoolean("entered_from_disclosure_menu", false);
        View A0C = JTS.A0C(view, R.id.action_bar);
        DbU.A1G(AnonymousClass7TG.A0R(A0C, R.id.action_bar_title), this, 2131954142);
        LYC.A00(AnonymousClass7TF.A0G(A0C, R.id.action_bar_button_back), 63, this);
        AnonymousClass0eM r4 = this.A04;
        Dba.A16(getViewLifecycleOwner(), ((C60240Jhx) r4.getValue()).A04, new C58728Iwb(this, 15), 42);
        DbZ.A1C(this, new MGZ(this, (AnonymousClass4D7) null, 27), ((C60240Jhx) r4.getValue()).A07);
        BrandedContentGatingInfo brandedContentGatingInfo = (BrandedContentGatingInfo) requireArguments.getParcelable("BRANDED_CONTENT_GATING_INFO");
        if (brandedContentGatingInfo == null) {
            brandedContentGatingInfo = new BrandedContentGatingInfo((Integer) null, (String) null, (HashMap) null, (List) null, (List) null);
        }
        C60240Jhx jhx = (C60240Jhx) r4.getValue();
        String str2 = "";
        if (C63982LHa.A00(brandedContentGatingInfo)) {
            str = getString(2131968777);
        } else {
            str = str2;
        }
        0qQ.A0A(str);
        if (C63982LHa.A01(brandedContentGatingInfo)) {
            str2 = C49946FGa.A03(requireContext(), brandedContentGatingInfo);
        }
        jhx.A00(brandedContentGatingInfo, str, str2);
    }

    public final Collection getDefinitions() {
        return JTT.A0s(new KFC(this), new EG1(this, AnonymousClass7TE.A0l(this.A03)));
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(C66318MNb.A00);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final boolean onBackPressed() {
        if (!0qQ.A0K(this.A00, "feed") || this.A02 || this.A01) {
            DbT.A1I(this);
            return true;
        }
        C59888JbD.A02(this.A03);
        return true;
    }

    public K87() {
        MMG A002 = MMG.A00(this, 10);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(0eO.A02, MMG.A00(MMG.A00(this, 7), 8));
        this.A04 = DbS.A0I(MMG.A00(A003, 9), A002, new C58716IwP(35, (Object) null, (Object) A003), DbS.A0z(C60240Jhx.class));
    }

    public final void DOk(View view) {
        String str;
        Context A0B = JTT.A0B(this, view);
        UserSession A0l = AnonymousClass7TE.A0l(this.A03);
        List list = ((C60240Jhx) this.A04.getValue()).A00.A04;
        if (list != null) {
            str = C51970G9q.A0k(list);
            0qQ.A0A(str);
        } else {
            str = "";
        }
        Map singletonMap = Collections.singletonMap("blocked_countries_str", str);
        0qQ.A07(singletonMap);
        LHX.A01(A0B, view, this, A0l, singletonMap);
    }

    public final void DS8(View view) {
        Context A0B = JTT.A0B(this, view);
        UserSession A0l = AnonymousClass7TE.A0l(this.A03);
        BrandedContentGatingInfo brandedContentGatingInfo = ((C60240Jhx) this.A04.getValue()).A00;
        HashMap A1E = AnonymousClass7TE.A1E();
        Integer num = brandedContentGatingInfo.A00;
        if (num != null) {
            A1E.put(AnonymousClass000.A00(1268), num);
        }
        HashMap hashMap = brandedContentGatingInfo.A02;
        if (hashMap != null) {
            A1E.putAll(hashMap);
        }
        Map singletonMap = Collections.singletonMap("countries_and_ages_str", DbT.A10(new JSONObject(A1E)));
        0qQ.A07(singletonMap);
        LHX.A00(A0B, view, this, A0l, singletonMap);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        HashMap hashMap;
        String str;
        super.onActivityResult(i, i2, intent);
        if (i == 32779 && i2 == -1) {
            String A002 = AnonymousClass000.A00(131);
            if (intent != null && intent.hasExtra(A002)) {
                AnonymousClass0eM r4 = this.A04;
                C60240Jhx jhx = (C60240Jhx) r4.getValue();
                UserSession A0l = AnonymousClass7TE.A0l(this.A03);
                BrandedContentGatingInfo brandedContentGatingInfo = ((C60240Jhx) r4.getValue()).A00;
                Serializable serializableExtra = intent.getSerializableExtra(A002);
                if (serializableExtra instanceof HashMap) {
                    hashMap = (HashMap) serializableExtra;
                } else {
                    hashMap = null;
                }
                jhx.A00 = C347037wA.A00(brandedContentGatingInfo, this, A0l, (BrandedContentTag) null, hashMap);
                C60240Jhx jhx2 = (C60240Jhx) r4.getValue();
                BrandedContentGatingInfo brandedContentGatingInfo2 = ((C60240Jhx) r4.getValue()).A00;
                String str2 = "";
                if (C63982LHa.A00(((C60240Jhx) r4.getValue()).A00)) {
                    str = getString(2131968777);
                } else {
                    str = str2;
                }
                0qQ.A0A(str);
                if (C63982LHa.A01(((C60240Jhx) r4.getValue()).A00)) {
                    str2 = C49946FGa.A03(requireContext(), ((C60240Jhx) r4.getValue()).A00);
                }
                jhx2.A00(brandedContentGatingInfo2, str, str2);
                getParentFragmentManager().A0z("request_key_audience_restrictions", DbY.A0B("bundle_key_gating_info", ((C60240Jhx) r4.getValue()).A00));
            }
        }
    }
}
