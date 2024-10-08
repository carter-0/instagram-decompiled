package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.shopping.model.productsource.ProductSourceOverrideState;

/* renamed from: X.ViV  reason: case insensitive filesystem */
public final class C17940ViV {
    public Fragment A00;
    public C16581Uxb A01;
    public ProductSourceOverrideState A02;
    public Integer A03;
    public String A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final FragmentActivity A09;
    public final UserSession A0A;
    public final String A0B;

    public final void A00() {
        String str;
        int i;
        String str2;
        UserSession userSession;
        Class<ModalActivity> cls;
        FragmentActivity fragmentActivity;
        boolean z = false;
        if (this.A06 || this.A08 || this.A07) {
            Bundle bundle = new Bundle();
            bundle.putString("prior_module_name", this.A0B);
            if (this.A03 != null) {
                z = true;
            }
            bundle.putBoolean("should_return_result", z);
            bundle.putString("brand_selection_entry_point", this.A04);
            DbS.A1B(bundle, (String) null);
            bundle.putString("waterfall_id", this.A05);
            bundle.putBoolean("show_brands_tab", this.A06);
            bundle.putBoolean("show_collections_tab", this.A08);
            bundle.putBoolean("show_catalogs_tab", this.A07);
            bundle.putParcelable("product_source_override_state", this.A02);
            C16581Uxb uxb = this.A01;
            if (uxb != null) {
                str = uxb.name();
            } else {
                str = null;
            }
            bundle.putString("surface", str);
            boolean z2 = this.A06;
            boolean z3 = this.A08;
            if (!z2) {
                if (!z3) {
                    if (this.A07) {
                        String str3 = this.A05;
                        if (str3 != null) {
                            bundle.putString("waterfall_id", str3);
                        }
                        bundle.putBoolean("is_onboarding", false);
                        userSession = this.A0A;
                        cls = ModalActivity.class;
                        fragmentActivity = this.A09;
                        str2 = C273654mx.A00(3330);
                    }
                } else if (!this.A07) {
                    str2 = "shopping_collection_selection";
                    userSession = this.A0A;
                    cls = ModalActivity.class;
                    fragmentActivity = this.A09;
                }
                i = 3333;
                str2 = C273654mx.A00(i);
                userSession = this.A0A;
                cls = ModalActivity.class;
                fragmentActivity = this.A09;
            } else {
                if (!z3 && !this.A07) {
                    i = 3329;
                    str2 = C273654mx.A00(i);
                    userSession = this.A0A;
                    cls = ModalActivity.class;
                    fragmentActivity = this.A09;
                }
                i = 3333;
                str2 = C273654mx.A00(i);
                userSession = this.A0A;
                cls = ModalActivity.class;
                fragmentActivity = this.A09;
            }
            AnonymousClass6W8 r2 = new AnonymousClass6W8(fragmentActivity, bundle, userSession, cls, str2);
            Integer num = this.A03;
            if (num != null) {
                Fragment fragment = this.A00;
                if (fragment != null) {
                    r2.A0D(fragment, JTP.A09(num));
                    return;
                }
                throw new IllegalArgumentException("At least one of handlingFragment and handlingActivity should be not null!");
            }
            r2.A0C(fragmentActivity);
            return;
        }
        throw new IllegalArgumentException(AnonymousClass000.A00(26));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        if (r1.A01(r4).A1Q() != false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C17940ViV(androidx.fragment.app.FragmentActivity r3, com.instagram.common.session.UserSession r4, java.lang.String r5) {
        /*
            r2 = this;
            r2.<init>()
            r2.A09 = r3
            r2.A0A = r4
            r2.A0B = r5
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = r1.A01(r4)
            boolean r0 = r0.A1R()
            if (r0 != 0) goto L_0x0020
            com.instagram.user.model.User r0 = r1.A01(r4)
            boolean r1 = r0.A1Q()
            r0 = 0
            if (r1 == 0) goto L_0x0021
        L_0x0020:
            r0 = 1
        L_0x0021:
            r2.A06 = r0
            r2.A08 = r0
            boolean r0 = X.C367088qA.A00(r4)
            r2.A07 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17940ViV.<init>(androidx.fragment.app.FragmentActivity, com.instagram.common.session.UserSession, java.lang.String):void");
    }
}
