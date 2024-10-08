package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.DfD  reason: case insensitive filesystem */
public final class C46450DfD extends C231632rz {
    public String A00;
    public String A01;
    public final Context A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final AnonymousClass32K A05;
    public final G88 A06;
    public final AnonymousClass2f1 A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B = true;

    public C46450DfD(Context context, AnonymousClass0iw r4, UserSession userSession, AnonymousClass32K r6, G88 g88, boolean z, boolean z2, boolean z3) {
        AnonymousClass7TG.A0w(2, userSession, r4, g88);
        this.A02 = context;
        this.A04 = userSession;
        this.A03 = r4;
        this.A06 = g88;
        this.A05 = r6;
        this.A0A = z;
        this.A08 = z2;
        this.A09 = z3;
        this.A07 = AnonymousClass2f1.A00(userSession);
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        return DbU.A0q((AnonymousClass3UM) obj).hashCode();
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        return this.A07.A0N(((AnonymousClass3UM) obj).CCd()).ordinal();
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        Object obj3 = obj;
        int A032 = AnonymousClass0fD.A03(533290030);
        View view2 = view;
        Object obj4 = obj2;
        AnonymousClass7TG.A1U(view2, obj3, obj4);
        Context context = this.A02;
        UserSession userSession = this.A04;
        AnonymousClass0iw r5 = this.A03;
        Object tag = view2.getTag();
        if (tag != null) {
            int A0M = AnonymousClass7TE.A0M(obj4);
            boolean z = this.A0B;
            boolean z2 = this.A0A;
            boolean z3 = this.A08;
            G88 g88 = this.A06;
            boolean z4 = z3;
            C48907Em7.A00(context, r5, userSession, this.A05, (F1A) tag, g88, (AnonymousClass3UM) obj3, this.A00, this.A01, A0M, z, z2, z4, false, false, this.A09);
            AnonymousClass0fD.A0A(-866389461, A032);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0A(68397260, A032);
        throw A0y;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        DbW.A1I(r1);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A042 = DbX.A04(viewGroup, 1412577948);
        View A0A2 = DbU.A0A(DbT.A0B(this.A02), viewGroup, R.layout.row_recommended_user, false);
        A0A2.setTag(new F1A(A0A2));
        A0A2.setId(R.id.recommended_user_row_content_identifier);
        AnonymousClass0fD.A0A(476930172, A042);
        return A0A2;
    }
}
