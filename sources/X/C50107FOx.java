package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.fbusertag.FBUserTag;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.FOx  reason: case insensitive filesystem */
public final class C50107FOx implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    public C50107FOx(AnonymousClass0iw r1, UserSession userSession, C51959G9f g9f, C283155Gi r4, User user, int i, int i2) {
        this.A00 = i2;
        this.A02 = g9f;
        this.A03 = r4;
        if (1 - i2 != 0) {
            this.A01 = i;
            this.A04 = userSession;
            this.A05 = user;
        } else {
            this.A04 = user;
            this.A01 = i;
            this.A05 = userSession;
        }
        this.A06 = r1;
    }

    public final void onClick(View view) {
        int A052;
        int i;
        switch (this.A00) {
            case 0:
                A052 = AnonymousClass0fD.A05(-2036197886);
                int i2 = this.A01 + 1;
                0xY A0p = AnonymousClass7TE.A0p((1Av) this.A04);
                A0p.E5Z(C66579MXk.A00(1211), i2);
                A0p.apply();
                C66633Ma2.A0B((RectF) this.A02, (C74455PvA) this.A05, (C66633Ma2) this.A06, (AnonymousClass2Ep) this.A03);
                i = -1211132632;
                break;
            case 1:
                User user = (User) this.A04;
                int i3 = this.A01;
                AnonymousClass0iw r1 = (AnonymousClass0iw) this.A06;
                ((C51959G9f) this.A02).A73((JV7) null, (C283155Gi) this.A03, user, i3);
                DdQ.A00(r1, (UserSession) this.A05, user.getId(), i3);
                return;
            case 2:
                int i4 = this.A01;
                AnonymousClass0iw r2 = (AnonymousClass0iw) this.A06;
                ((C51959G9f) this.A02).D8G((JV7) null, (C283155Gi) this.A03, i4, false);
                DdQ.A01(r2, (UserSession) this.A04, ((User) this.A05).getId(), i4);
                return;
            case 3:
                A052 = AnonymousClass0fD.A05(-383157897);
                Context context = (Context) this.A03;
                0qQ.A0A(context);
                EUN.A00(context, (UserSession) this.A06, (FBUserTag) this.A05, (C51918G7m) this.A04, (Integer) this.A02);
                i = 1135969907;
                break;
            case 4:
                A052 = AnonymousClass0fD.A05(1982979937);
                Context context2 = (Context) this.A03;
                0qQ.A0A(context2);
                EUN.A00(context2, (UserSession) this.A06, (FBUserTag) this.A05, (C51918G7m) this.A04, (Integer) this.A02);
                i = 602975204;
                break;
            default:
                A052 = AnonymousClass0fD.A05(245732298);
                int i5 = this.A01 + 1;
                0xY A0p2 = AnonymousClass7TE.A0p((1Av) this.A05);
                A0p2.E5Z(C66579MXk.A00(183), i5);
                A0p2.apply();
                C239413Gj r5 = (C239413Gj) this.A06;
                String str = ((C270194gL) this.A02).A0e;
                str.getClass();
                Reel reel = (Reel) this.A03;
                String id = reel.getId();
                0qQ.A07(id);
                C239413Gj.A06(r5, str, id, DbS.A0q(this.A04));
                C239413Gj.A01(reel, AnonymousClass3BQ.IN_APP_NOTIFICATION, r5, (String) null, (String) null);
                i = 808041024;
                break;
        }
        AnonymousClass0fD.A0C(i, A052);
    }

    public C50107FOx(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i2;
        this.A03 = obj;
        this.A05 = obj3;
        this.A01 = i;
        this.A04 = obj4;
        this.A02 = obj5;
        this.A06 = obj2;
    }
}
