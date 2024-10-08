package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.71a  reason: invalid class name and case insensitive filesystem */
public final class C3250971a extends C231632rz {
    public final int A00;
    public final Context A01;
    public final UserSession A02;
    public final C267614bu A03;

    public final int getViewTypeCount() {
        return 2;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r3, Object obj, Object obj2) {
        C66954Mfn mfn = (C66954Mfn) obj;
        0qQ.A0B(r3, 0);
        if (mfn != null) {
            if (mfn.A03) {
                r3.A7U(0);
            }
            r3.A7U(1);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C3250971a(Context context, UserSession userSession, C267614bu r3, int i) {
        this.A01 = context;
        this.A02 = userSession;
        this.A00 = i;
        this.A03 = r3;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A032 = AnonymousClass0fD.A03(-1906217142);
        0qQ.A0B(view, 1);
        0qQ.A0B(obj, 2);
        C66954Mfn mfn = (C66954Mfn) obj;
        if (i == 0) {
            Context context = this.A01;
            UserSession userSession = this.A02;
            String str = mfn.A00;
            List<C74507Pw2> list = mfn.A01;
            0qQ.A0B(context, 0);
            0qQ.A0B(userSession, 1);
            Object tag = view.getTag();
            0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.user.recommended.activationcards.ActivationCardsProgressRowViewBinder.Holder");
            Q0D q0d = (Q0D) tag;
            q0d.A01.setText(str);
            int i2 = 0;
            for (C74507Pw2 pw2 : list) {
                if (pw2.Esw(context, userSession)) {
                    i2 += pw2.CQM(userSession, (User) null) ? 1 : 0;
                }
            }
            Integer valueOf = Integer.valueOf(i2);
            int i3 = 0;
            for (C74507Pw2 Esw : list) {
                i3 += Esw.Esw(context, userSession) ? 1 : 0;
            }
            String string = context.getString(2131952185, new Object[]{valueOf, Integer.valueOf(i3)});
            0qQ.A07(string);
            String string2 = context.getString(2131952184);
            0qQ.A07(string2);
            String string3 = context.getString(2131952183, new Object[]{string, string2});
            0qQ.A07(string3);
            SpannableString spannableString = new SpannableString(string3);
            int A08 = 00l.A08(string3, string, 0, false);
            if (A08 != -1) {
                spannableString.setSpan(new ForegroundColorSpan(context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_icon))), A08, string.length() + A08, 17);
            }
            q0d.A00.setText(spannableString);
        } else if (i == 1) {
            Context context2 = this.A01;
            UserSession userSession2 = this.A02;
            Object tag2 = view.getTag();
            0qQ.A0C(tag2, "null cannot be cast to non-null type com.instagram.user.recommended.activationcards.ActivationCardsRowViewBinder.Holder");
            List list2 = mfn.A01;
            boolean z = mfn.A02;
            C66981MgF.A00(context2, userSession2, this.A03, (C66983MgH) tag2, list2, z);
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid view type supplied");
            AnonymousClass0fD.A0A(-1224306151, A032);
            throw illegalArgumentException;
        }
        AnonymousClass0fD.A0A(-855767956, A032);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        View inflate;
        int A032 = AnonymousClass0fD.A03(1596381225);
        0qQ.A0B(viewGroup, 1);
        if (i == 0) {
            inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.find_people_activation_cards_progress_row, viewGroup, false);
            View findViewById = inflate.findViewById(R.id.title);
            0qQ.A07(findViewById);
            View findViewById2 = inflate.findViewById(R.id.progress);
            0qQ.A07(findViewById2);
            inflate.setTag(new Q0D((TextView) findViewById, (TextView) findViewById2));
            inflate.setBackgroundResource(this.A00);
        } else if (i == 1) {
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            0qQ.A07(from);
            int i2 = this.A00;
            inflate = from.inflate(R.layout.find_people_activation_cards_row, viewGroup, false);
            inflate.setBackgroundResource(i2);
            inflate.setTag(new C66983MgH(inflate, false));
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid view type supplied");
            AnonymousClass0fD.A0A(1650329894, A032);
            throw illegalArgumentException;
        }
        AnonymousClass0fD.A0A(-2123078516, A032);
        return inflate;
    }
}
