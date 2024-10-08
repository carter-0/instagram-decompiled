package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Map;

/* renamed from: X.Dh4  reason: case insensitive filesystem */
public final class C46562Dh4 extends C232232tF {
    public final Context A00;
    public final Fragment A01;
    public final UserSession A02;
    public final C14140Tqa A03;

    /* JADX WARNING: type inference failed for: r12v0, types: [java.lang.Object, X.32K] */
    public final /* bridge */ /* synthetic */ void bind(C232262tL r26, C249703kE r27) {
        C16196UqL uqL = (C16196UqL) r26;
        C47024DpG dpG = (C47024DpG) r27;
        boolean A1U = AnonymousClass7TF.A1U(0, uqL, dpG);
        FUQ fuq = C49297Esg.A00;
        UserSession userSession = this.A02;
        Context context = this.A00;
        Fragment fragment = this.A01;
        C14140Tqa tqa = this.A03;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(context, A1U ? 1 : 0);
        AnonymousClass7TG.A1R(fragment, tqa);
        FPH.A00(dpG.A00, tqa, uqL, fragment, 58);
        FPG.A00(dpG.A01, 48, tqa, uqL);
        int i = 0;
        for (Object next : dpG.A02) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            ViewGroup viewGroup = (ViewGroup) next;
            0qQ.A0B(viewGroup, A1U);
            View A0A = DbU.A0A(LayoutInflater.from(context), viewGroup, R.layout.row_recommended_user, false);
            A0A.setTag(new F1A(A0A));
            A0A.setId(R.id.recommended_user_row_content_identifier);
            viewGroup.removeAllViews();
            viewGroup.addView(A0A);
            Object tag = A0A.getTag();
            0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.follow.chaining.binder.RecommendedUserRowViewBinder.Holder");
            F1A f1a = (F1A) tag;
            User user = (User) 00k.A0O(uqL.A01, i);
            if (user == null) {
                viewGroup.setVisibility(8);
            } else {
                viewGroup.setVisibility(0);
                Map map = C51038FnU.A03;
                Object obj = map.get(user);
                if (obj == null) {
                    obj = new C51038FnU(user);
                    map.put(user, obj);
                }
                C48907Em7.A00(context, fuq, userSession, new Object(), f1a, tqa, (C51038FnU) obj, "search_typeahead", "search_typeahead", i, A1U, A1U, A1U, A1U, A1U, false);
            }
            i = i2;
        }
    }

    public final Class modelClass() {
        return C16196UqL.class;
    }

    public C46562Dh4(Context context, Fragment fragment, UserSession userSession, C14140Tqa tqa) {
        this.A02 = userSession;
        this.A00 = context;
        this.A03 = tqa;
        this.A01 = fragment;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C47024DpG(DbT.A0D(layoutInflater, viewGroup, R.layout.follow_chaining_search_unit, false));
    }
}
