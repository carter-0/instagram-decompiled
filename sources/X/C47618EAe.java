package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.FriendshipStatus;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.EAe  reason: case insensitive filesystem */
public final class C47618EAe extends C231632rz {
    public final AnonymousClass07i A00;
    public final C2355930l A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final C51028FnK A04;
    public final C243853aD A05;
    public final String A06;
    public final boolean A07;

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        View.OnClickListener fNn;
        FriendshipStatus B8F;
        Boolean CY1;
        Boolean CY2;
        Object obj3 = obj;
        int A032 = AnonymousClass0fD.A03(-1019981493);
        View view2 = view;
        int A022 = DbW.A02(1, view2, obj3);
        Object tag = view2.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.profile.bindergroup.FollowRelationShipViewBinder.Holder");
        F12 f12 = (F12) tag;
        Context context = view2.getContext();
        User user = (User) obj3;
        UserSession userSession = this.A03;
        C51028FnK fnK = this.A04;
        C243853aD r9 = this.A05;
        C2355930l r11 = this.A01;
        AnonymousClass07i r7 = this.A00;
        AnonymousClass0iw r15 = this.A02;
        String str = this.A06;
        if (this.A07) {
            TextView textView = f12.A08;
            DbT.A1G(textView, userSession, user);
            AnonymousClass0fU.A00(new C56780ICd(r15, context, userSession, fnK, r9, user, (String) null, 1), textView);
            f12.A00.setVisibility(8);
            f12.A01.setVisibility(8);
            f12.A02.setVisibility(8);
            f12.A0A.A03(8);
        } else {
            C49789F6x.A00(context, f12, user.A1z());
            AnonymousClass0fU.A00(new FOW(5, r15, fnK, user, f12, r7, r11, context), f12.A00);
            if (182.A06(0Tu.A06, userSession, 36313888360106265L)) {
                boolean A26 = user.A26();
                C49789F6x.A01(context, f12, A26);
                AnonymousClass0fU.A00(new FOZ(r11, context, f12, user, r15, r7, userSession, A022, A26), f12.A01);
            } else {
                f12.A01.setVisibility(8);
            }
            TextView textView2 = f12.A07;
            textView2.getClass();
            textView2.setText(2131962580);
            FPG.A00(f12.A02, 20, r15, fnK);
            ArrayList A1C = AnonymousClass7TE.A1C();
            if (user.A1s()) {
                DbU.A19(context, A1C, 2131976246);
            }
            if (user.A1u()) {
                DbU.A19(context, A1C, 2131976248);
            }
            FriendshipStatus B8F2 = user.A03.B8F();
            if (!((B8F2 == null || (CY2 = B8F2.CY2()) == null || !CY2.booleanValue()) && ((B8F = user.A03.B8F()) == null || (CY1 = B8F.CY1()) == null || !CY1.booleanValue()))) {
                DbU.A19(context, A1C, 2131976244);
            }
            if (!A1C.isEmpty()) {
                ((TextView) f12.A09.A01()).setText(0mp.A05(", ", A1C));
            }
            if (182.A06(DbS.A0J(userSession, 0), userSession, 2342167841149104529L) && (user.A1X() || user.A03.AaX() == IGAIAgentType.A05)) {
                f12.A0A.A03(8);
            } else if (1YZ.A02 != null) {
                View A012 = f12.A0A.A01();
                TextView A0G = DbU.A0G(A012, R.id.profile_follow_relationship_row_title);
                View requireViewById = A012.requireViewById(R.id.profile_follow_relationship_row_icon);
                if (user.isRestricted()) {
                    requireViewById.setVisibility(8);
                    DbT.A18(context, A0G, 2131975971);
                    fNn = new FPG(21, (Object) fnK, (Object) user);
                } else {
                    requireViewById.setVisibility(0);
                    DbT.A18(context, A0G, 2131972302);
                    fNn = new C50072FNn(fnK, user, str, 8);
                }
                AnonymousClass0fU.A00(fNn, A012);
            }
            TextView textView3 = f12.A08;
            DbT.A1G(textView3, userSession, user);
            AnonymousClass0fU.A00(new C56780ICd(r15, context, userSession, fnK, r9, user, str, 1), textView3);
        }
        AnonymousClass0fD.A0A(278919697, A032);
    }

    public C47618EAe(AnonymousClass07i r1, C2355930l r2, AnonymousClass0iw r3, UserSession userSession, C51028FnK fnK, C243853aD r6, String str, boolean z) {
        this.A04 = fnK;
        this.A05 = r6;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A06 = str;
        this.A03 = userSession;
        this.A07 = z;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A042 = DbX.A04(viewGroup, 1815223260);
        View A0C = DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.layout_profile_relationship_view);
        A0C.setTag(new F12(A0C));
        AnonymousClass0fD.A0A(1639176393, A042);
        return A0C;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
