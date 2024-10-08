package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.wellbeing.limitedprofile.fragment.LimitedCommentsFragment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.Vzr  reason: case insensitive filesystem */
public final class C18756Vzr {
    public static final Handler A08 = AnonymousClass7TF.A0D();
    public 1Xj A00;
    public final Context A01;
    public final C15490Udf A02;
    public final C56029Hrb A03;
    public final LimitedCommentsFragment A04;
    public final boolean A05;
    public final AnonymousClass0iw A06;
    public final UserSession A07;

    public final void A01(C247733gp r13) {
        int size;
        Integer num;
        String quantityString;
        if (r13 != null) {
            size = 1;
        } else {
            size = C13990Tnq.A0L(this.A02.A06.A00).size();
        }
        boolean z = this.A05;
        if (z) {
            num = AnonymousClass05K.A0N;
        } else {
            num = null;
        }
        Context context = this.A01;
        Resources resources = context.getResources();
        int i = R.plurals.approve_x_comments_dialog_title;
        if (z) {
            i = R.plurals.approve_x_replies_dialog_title;
        }
        Integer valueOf = Integer.valueOf(size);
        String A0v = DbV.A0v(resources, valueOf, i, size);
        0qQ.A0A(A0v);
        if (z) {
            quantityString = context.getString(2131953088);
        } else {
            quantityString = resources.getQuantityString(R.plurals.approve_x_comments_dialog_primary_button, size, new Object[]{valueOf, valueOf});
        }
        0qQ.A0A(quantityString);
        C358248ab r3 = new C358248ab(context);
        r3.A05 = A0v;
        r3.A0Y(new C18833W4v(23, r13, this), C358278ae.BLUE, quantityString, true);
        r3.A0a(new W5R(10, (Object) r13, (Object) num, (Object) this), AnonymousClass7TE.A16(context, 2131954722));
        if (!z) {
            r3.A0q(DbV.A0v(resources, valueOf, R.plurals.approve_x_comments_dialog_body, size));
        }
        DbT.A1V(r3);
    }

    public static final void A00(C18756Vzr vzr, Set set) {
        1Xj r0 = vzr.A00;
        if (r0 != null) {
            UserSession userSession = vzr.A07;
            1NY A0a = AnonymousClass7TG.A0a(userSession);
            A0a.A0K("limited_interactions/%s/comments/approve_limited_comments/", new Object[]{r0.getId()});
            A0a.A0Q(1XP.class, 1XY.class);
            C239023El A002 = C239023El.A00(',');
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C247733gp r02 = (C247733gp) it.next();
                if (r02 != null) {
                    hashSet.add(r02.A0G);
                }
            }
            A0a.A9m("comment_ids", A002.A02(hashSet));
            A0a.A9m("container_module", vzr.A06.getModuleName());
            A0a.A0R = true;
            1OC A0M = A0a.A0M();
            C15619Ufl.A00(A0M, set, vzr, 26);
            C20262Wo1 wo1 = new C20262Wo1(A0M);
            Handler handler = A08;
            ArrayList arrayList = A27.A00;
            handler.postDelayed(wo1, (long) C48775Ejy.A00(userSession));
        }
    }

    public C18756Vzr(Context context, AnonymousClass0iw r3, UserSession userSession, 1Xj r5, C15490Udf udf, LimitedCommentsFragment limitedCommentsFragment, String str, boolean z) {
        C51972G9s.A1C(userSession, udf);
        this.A01 = context;
        this.A07 = userSession;
        this.A00 = r5;
        this.A02 = udf;
        this.A04 = limitedCommentsFragment;
        this.A05 = z;
        this.A06 = r3;
        this.A03 = new C56029Hrb(r3, userSession, str);
    }
}
