package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.api.schemas.ProductVariantPossibleValueDictIntf;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductItemWithAR;
import com.instagram.model.shopping.ShoppingCameraSurveyMetadata;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.List;

public final class UZy extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "ShoppingCameraFragment";
    public 28D A00;
    public AnonymousClass80Q A01;
    public AnonymousClass80C A02;
    public ProductItemWithAR A03;
    public ShoppingCameraSurveyMetadata A04;
    public C3504784u A05;
    public String A06;
    public long A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public final C41837B2s A0F = new WUP(this, 10);
    public final AnonymousClass0eM A0G = C227642jf.A02(this);

    public final String getModuleName() {
        return "instagram_shopping_camera";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewGroup A0E2 = DbS.A0E(view, R.id.shopping_camera_container);
        AnonymousClass80C r0 = new AnonymousClass80C();
        registerLifecycleListener(r0);
        this.A02 = r0;
        C249713kF r3 = C249713kF.A00;
        UserSession A0l = AnonymousClass7TE.A0l(this.A0G);
        String str2 = this.A0B;
        if (str2 == null) {
            str = "shoppingSessionId";
        } else {
            String str3 = this.A0E;
            ProductItemWithAR productItemWithAR = this.A03;
            if (productItemWithAR == null) {
                str = "productItemWithAR";
            } else {
                C3504784u A062 = r3.A06(this, A0l, productItemWithAR, str2, str3);
                28D r02 = this.A00;
                if (r02 == null) {
                    str = "entryPoint";
                } else {
                    A062.A00 = r02;
                    String str4 = this.A0A;
                    String str5 = "";
                    if (str4 == null) {
                        str4 = str5;
                    }
                    A062.A06 = str4;
                    String str6 = this.A08;
                    if (str6 != null) {
                        str5 = str6;
                    }
                    A062.A03 = str5;
                    A062.A07 = this.A0C;
                    A062.A08 = this.A06;
                    A062.A04 = this.A09;
                    ShoppingCameraSurveyMetadata shoppingCameraSurveyMetadata = this.A04;
                    if (shoppingCameraSurveyMetadata == null) {
                        str = "surveyMetadata";
                    } else {
                        A062.A02 = shoppingCameraSurveyMetadata;
                        A062.A09 = this.A0D;
                        this.A05 = A062;
                        AnonymousClass7TF.A17(this, new C20251Wnq(A0E2, this));
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0G);
    }

    public final boolean onBackPressed() {
        String str;
        Product A042;
        C3504784u r0;
        C3504784u r02;
        Product A043;
        List list;
        ShoppingCameraSurveyMetadata shoppingCameraSurveyMetadata = this.A04;
        if (shoppingCameraSurveyMetadata != null) {
            shoppingCameraSurveyMetadata.A01 = SystemClock.elapsedRealtime() - this.A07;
            AnonymousClass80Q r03 = this.A01;
            if (r03 != null && r03.A06()) {
                return true;
            }
            28D r1 = this.A00;
            str = "entryPoint";
            if (r1 != null) {
                if (r1 == 28D.A4I || r1 == 28D.A4J) {
                    FragmentActivity requireActivity = requireActivity();
                    Intent intent = new Intent();
                    C3504784u r2 = this.A05;
                    if (!(r2 == null || (A042 = r2.A04()) == null || 0qQ.A0K(A042.A0H, r2.A01.A01.A0h) || (r0 = this.A05) == null || r0.A04() == null || (r02 = this.A05) == null || (A043 = r02.A04()) == null || (list = A043.A0O) == null || list.isEmpty())) {
                        intent.putExtra("variant_dimension_id", this.mFragmentId);
                        intent.putExtra(C66579MXk.A00(179), ((ProductVariantPossibleValueDictIntf) list.get(0)).getValue());
                    }
                    ShoppingCameraSurveyMetadata shoppingCameraSurveyMetadata2 = this.A04;
                    if (shoppingCameraSurveyMetadata2 != null) {
                        intent.putExtra("shopping_camera_survey_metadata", shoppingCameraSurveyMetadata2);
                        Dba.A0k(requireActivity, intent);
                    }
                }
                return false;
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        str = "surveyMetadata";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(-967037942);
        UZy.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A0E = bundle2.getString("viewer_session_id");
            this.A03 = (ProductItemWithAR) C320236s2.A00(bundle2, ProductItemWithAR.class, C66579MXk.A00(695));
            this.A00 = AnonymousClass7TH.A07(bundle2, "camera_entry_point");
            this.A0A = bundle2.getString("prior_module_name");
            this.A0B = C228022kf.A00(bundle2);
            this.A08 = bundle2.getString("checkout_session_id");
            this.A0C = bundle2.getString("source_media_id");
            this.A06 = bundle2.getString("ch");
            this.A09 = bundle2.getString(C66579MXk.A00(734));
            this.A0D = bundle2.getString(C66579MXk.A00(402));
            ProductItemWithAR productItemWithAR = this.A03;
            if (productItemWithAR == null) {
                str = "productItemWithAR";
            } else {
                Product A002 = C14502TxO.A00(productItemWithAR.A01);
                String str2 = A002.A0H;
                User user = A002.A0B;
                String str3 = this.A0B;
                if (str3 == null) {
                    str = "shoppingSessionId";
                } else {
                    28D r4 = this.A00;
                    if (r4 == null) {
                        str = "entryPoint";
                    } else {
                        this.A04 = new ShoppingCameraSurveyMetadata(r4, user, str2, str3, 0, 0);
                        AnonymousClass0fD.A09(-1379263649, A022);
                        return;
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(232924851, A022);
        throw A0y;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1658902588);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.shopping_camera_fragment_layout, viewGroup, false);
        AnonymousClass0fD.A09(-1170063803, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(295456488);
        super.onDestroyView();
        this.A01 = null;
        this.A05 = null;
        AnonymousClass80C r0 = this.A02;
        if (r0 != null) {
            unregisterLifecycleListener(r0);
        }
        AnonymousClass80C r02 = this.A02;
        if (r02 != null) {
            r02.onDestroyView();
        }
        this.A02 = null;
        AnonymousClass0fD.A09(-512154493, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1504379531);
        super.onResume();
        C13991Tnr.A1C(this, 8);
        Activity A032 = DbT.A03(this);
        this.A0G.getValue();
        C357628Yy.A00(A032);
        this.A07 = SystemClock.elapsedRealtime();
        AnonymousClass0fD.A09(1835103321, A022);
    }

    public final void onStop() {
        Window window;
        int A022 = AnonymousClass0fD.A02(56367929);
        UZy.super.onStop();
        C13991Tnr.A1C(this, 0);
        Activity rootActivity = getRootActivity();
        if (!(rootActivity == null || (window = rootActivity.getWindow()) == null)) {
            2db.A07(window.getDecorView(), window, true);
        }
        AnonymousClass0fD.A09(-2141030459, A022);
    }
}
