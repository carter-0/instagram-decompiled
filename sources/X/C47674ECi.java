package X;

import android.util.LruCache;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableList;
import com.instagram.business.fragment.CategorySearchFragment;

/* renamed from: X.ECi  reason: case insensitive filesystem */
public final class C47674ECi extends 1P0 {
    public final /* synthetic */ CategorySearchFragment A00;

    public C47674ECi(CategorySearchFragment categorySearchFragment) {
        this.A00 = categorySearchFragment;
    }

    public final void onFail(C268654dm r7) {
        int A0D = AnonymousClass7TG.A0D(r7, -822482520);
        CategorySearchFragment categorySearchFragment = this.A00;
        CallerContext callerContext = CategorySearchFragment.A0U;
        String str = categorySearchFragment.A0D;
        ImmutableList of = ImmutableList.of();
        0qQ.A07(of);
        if (str != null && str.equals(categorySearchFragment.A0D)) {
            categorySearchFragment.A02 = of;
            categorySearchFragment.A0I = true;
            if (categorySearchFragment.A0f()) {
                CategorySearchFragment.A06(categorySearchFragment);
            }
        }
        String A03 = C319126q5.A03(r7, DbZ.A0j(categorySearchFragment));
        0qQ.A07(A03);
        CategorySearchFragment.A0A(categorySearchFragment, "searched_category", A03, "category_search_keyword", categorySearchFragment.A0D);
        AnonymousClass0fD.A0A(-1742460736, A0D);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(-1160131583);
        CategorySearchFragment categorySearchFragment = this.A00;
        CallerContext callerContext = CategorySearchFragment.A0U;
        categorySearchFragment.A0H = false;
        if (categorySearchFragment.getActivity() != null) {
            Dbb.A0u(categorySearchFragment);
        }
        AnonymousClass0fD.A0A(-149553533, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(-1566317790);
        CategorySearchFragment categorySearchFragment = this.A00;
        CallerContext callerContext = CategorySearchFragment.A0U;
        categorySearchFragment.A0H = true;
        if (categorySearchFragment.getActivity() != null) {
            Dbb.A0u(categorySearchFragment);
        }
        AnonymousClass0fD.A0A(-1714638605, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        ImmutableList A02;
        AnonymousClass3FZ r2;
        int A03 = AnonymousClass0fD.A03(773374172);
        AnonymousClass3JC r12 = (AnonymousClass3JC) obj;
        int A0D = AnonymousClass7TG.A0D(r12, -1224091556);
        Object obj2 = r12.A01;
        AnonymousClass3FZ r9 = null;
        if (!(obj2 == null || (r2 = (AnonymousClass3FZ) obj2) == null)) {
            r9 = r2.A00(C47076DqD.class, "ig_business_categories_typeahead");
        }
        CategorySearchFragment categorySearchFragment = this.A00;
        CallerContext callerContext = CategorySearchFragment.A0U;
        String str = categorySearchFragment.A0D;
        LruCache lruCache = FA3.A01;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        if (r9 != null) {
            Class<C47075DqC> cls = C47075DqC.class;
            if (r9.A02(DialogModule.KEY_ITEMS, cls) != null && !r9.A02(DialogModule.KEY_ITEMS, cls).isEmpty()) {
                C249803kO it = r9.A02(DialogModule.KEY_ITEMS, cls).iterator();
                0qQ.A07(it);
                while (it.hasNext()) {
                    AnonymousClass3FZ r1 = (AnonymousClass3FZ) it.next();
                    String A05 = r1.A05(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    String A052 = r1.A05(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                    String A053 = r1.A05("account_type");
                    if (A053 == null) {
                        A053 = "";
                    }
                    if (!(A05 == null || A05.length() == 0 || A052 == null || A052.length() == 0)) {
                        builder.add(new FYO(16U.A01(A053), A05, A052));
                    }
                }
            }
        }
        ImmutableList A0K = DbZ.A0K(builder);
        if (str != null && str.equals(categorySearchFragment.A0D)) {
            categorySearchFragment.A02 = A0K;
            categorySearchFragment.A0I = true;
            if (categorySearchFragment.A0f()) {
                CategorySearchFragment.A06(categorySearchFragment);
            }
        }
        if (r9 == null || (A02 = r9.A02(DialogModule.KEY_ITEMS, C47075DqC.class)) == null) {
            i = 0;
        } else {
            i = A02.size();
        }
        CategorySearchFragment.A09(categorySearchFragment, "searched_category", "category_search_keyword", categorySearchFragment.A0D, i);
        AnonymousClass0fD.A0A(750091908, A0D);
        AnonymousClass0fD.A0A(-640376162, A03);
    }
}
