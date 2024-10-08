package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.CharacterStyle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Uet  reason: case insensitive filesystem */
public final class C15565Uet extends C231632rz {
    public final Context A00;
    public final UserSession A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        C272024jy A002 = C297825sP.A00((C255773uh) obj);
        A002.getClass();
        return AnonymousClass9OX.A00(A002).hashCode();
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return C297825sP.A02(this.A01, (C255773uh) obj).hashCode();
    }

    public C15565Uet(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }

    public static SpannableString A00(Resources resources, C272014jx r4, int i) {
        String trim = C18687Vwl.A02(r4).toLowerCase(AnonymousClass1Q2.A02()).replace(10, ' ').trim();
        String A0v = DbV.A0v(resources, trim, R.plurals.reel_dashboard_poll_result_option_tally_label, i);
        int indexOf = A0v.indexOf(trim);
        SpannableString spannableString = new SpannableString(A0v);
        spannableString.setSpan(new CharacterStyle(), indexOf, trim.length() + indexOf, 33);
        return spannableString;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-540127957);
        C255773uh r6 = (C255773uh) obj;
        C17859VhC vhC = (C17859VhC) view.getTag();
        if (vhC != null) {
            vhC.A00(this.A01, r6);
        }
        AnonymousClass0fD.A0A(-349655921, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-1389690063);
        View A0C = DbT.A0C(LayoutInflater.from(this.A00), viewGroup, R.layout.reel_dashboard_poll_result);
        A0C.setTag(new C17859VhC(A0C));
        AnonymousClass0fD.A0A(-1454129183, A03);
        return A0C;
    }
}
