package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ueg  reason: case insensitive filesystem */
public final class C15552Ueg extends C231632rz {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final XC8 A03;
    public final C15683Ugo A04;
    public final Integer A05;
    public final String A06;
    public final boolean A07;

    public C15552Ueg(Context context, AnonymousClass0iw r3, UserSession userSession, XC8 xc8, C15683Ugo ugo, Integer num, String str, boolean z) {
        0qQ.A0B(xc8, 3);
        this.A00 = context;
        this.A01 = r3;
        this.A03 = xc8;
        this.A02 = userSession;
        this.A05 = num;
        this.A06 = str;
        this.A07 = z;
        this.A04 = ugo;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        C19278WSl wSl;
        C14856UCk uCk;
        Object obj3 = obj;
        int A032 = AnonymousClass0fD.A03(-469522685);
        AnonymousClass7TG.A1O(view, obj3);
        if ((obj3 instanceof C19278WSl) && (wSl = (C19278WSl) obj3) != null) {
            Object tag = view.getTag();
            if ((tag instanceof C14856UCk) && (uCk = (C14856UCk) tag) != null) {
                Context context = this.A00;
                UserSession userSession = this.A02;
                C18247VoE.A01(context, this.A01, userSession, uCk, this.A03, this.A04, wSl, this.A05, this.A06, wSl.A03.A00.A00, this.A07);
            }
        }
        AnonymousClass0fD.A0A(1469778586, A032);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0fD.A03(1861697628);
        LinearLayout A002 = C18247VoE.A00(this.A00);
        AnonymousClass0fD.A0A(795109296, A032);
        return A002;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
