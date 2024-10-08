package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Weh  reason: case insensitive filesystem */
public final class C19740Weh implements C229122ms, C229132mt {
    public final UserSession A00;
    public final C324356z9 A01;
    public final WUH A02;
    public final Context A03;
    public final AnonymousClass07i A04;

    public final void A00(boolean z) {
        String str;
        if (z) {
            str = null;
        } else {
            str = this.A01.A03.A07;
        }
        1NY A0b = AnonymousClass7TG.A0b(this.A00);
        A0b.A0A("upcoming_events/list_story_taggable_events/");
        A0b.A0Q(C342577op.class, C342587oq.class);
        if (str != null) {
            A0b.A9m("max_id", str);
        }
        this.A01.A03(A0b.A0M(), new C15961Uld(5, this, z));
    }

    public final void ACw() {
        if (this.A01.A05()) {
            A00(false);
        }
    }

    public final boolean CJz() {
        UA9 ua9 = this.A02.A00;
        if (ua9 != null) {
            return AnonymousClass7TE.A1b(ua9.A00);
        }
        return false;
    }

    public final boolean CKB() {
        return this.A01.A05();
    }

    public final boolean CT5() {
        return C51973G9u.A1Y(this.A01);
    }

    public final boolean CWV() {
        C324356z9 r1 = this.A01;
        if (C51973G9u.A1Y(r1) || C51973G9u.A1X(r1) || !CJz()) {
            return true;
        }
        return false;
    }

    public final void CgO() {
        A00(DbW.A1a(this.A01.A03.A07));
    }

    public final boolean isLoading() {
        return C51973G9u.A1X(this.A01);
    }

    public C19740Weh(Context context, AnonymousClass07i r3, UserSession userSession, WUH wuh) {
        this.A03 = context;
        this.A04 = r3;
        this.A00 = userSession;
        this.A02 = wuh;
        this.A01 = new C324356z9(context, r3, userSession);
    }
}
