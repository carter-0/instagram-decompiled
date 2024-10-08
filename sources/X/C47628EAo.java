package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.text.NumberFormat;
import java.util.Locale;

/* renamed from: X.EAo  reason: case insensitive filesystem */
public final class C47628EAo extends C231632rz {
    public final Context A00;
    public final UserSession A01;

    public C47628EAo(Context context, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        return obj.hashCode();
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        return ((C49608EzR) obj).A00;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        String A002;
        int A03 = AnonymousClass0fD.A03(-1736687916);
        AnonymousClass7TG.A1O(view, obj);
        Object tag = view.getTag();
        if (tag != null) {
            C49527Ex7 ex7 = (C49527Ex7) tag;
            C49608EzR ezR = (C49608EzR) obj;
            Resources resources = this.A00.getResources();
            int i2 = ezR.A00;
            boolean z = ezR.A01;
            boolean z2 = ezR.A03;
            boolean z3 = ezR.A02;
            0qQ.A0B(ex7, 0);
            if (!z && !z3) {
                TextView textView = ex7.A00;
                if (z2) {
                    if (resources != null) {
                        A002 = DbY.A0e(resources, NumberFormat.getInstance(Locale.getDefault()).format((long) i2), R.plurals.number_of_reactions, i2);
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else if (resources != null) {
                    A002 = AnonymousClass3f0.A00(resources, i2);
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                textView.setText(A002);
            }
            ex7.A01.setIsCapitalized(!z3);
            AnonymousClass0fD.A0A(870441372, A03);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0A(111381400, A03);
        throw A0y;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, -875738045);
        Context context = this.A00;
        UserSession userSession = this.A01;
        0qQ.A0B(userSession, 2);
        boolean A012 = F8J.A01(userSession);
        int i2 = R.layout.likers_title_row;
        if (A012) {
            i2 = R.layout.consolidation_likers_title_row;
        }
        View A0C = DbT.A0C(LayoutInflater.from(context), viewGroup, i2);
        0qQ.A0A(A0C);
        A0C.setTag(new C49527Ex7(A0C));
        AnonymousClass0fD.A0A(-218239607, A04);
        return A0C;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
