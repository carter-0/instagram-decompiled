package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Weg  reason: case insensitive filesystem */
public final class C19739Weg implements C229122ms, C229132mt {
    public final UserSession A00;
    public final C324356z9 A01;
    public final C17836Vgp A02;
    public final String A03;
    public final String A04;

    public final void A00(boolean z) {
        String str;
        String str2 = this.A03;
        if (str2 != null && (str = this.A04) != null) {
            UserSession userSession = this.A00;
            C324356z9 r4 = this.A01;
            String str3 = r4.A03.A07;
            1NY A0O = DbU.A0O(userSession);
            A0O.A0A(String.format("media/%s/%s/story_question_responses/", new Object[]{str2, str}));
            A0O.A9m("max_id", str3);
            r4.A03(DbT.A0S(A0O, C22327Xzc.class, D2D.class), new C15961Uld(4, this, z));
        }
    }

    public final void ACw() {
        if (this.A01.A06()) {
            A00(false);
        }
    }

    public final boolean CJz() {
        return AnonymousClass7TF.A1R(this.A02.A01.A01.size());
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

    /* JADX WARNING: type inference failed for: r2v0, types: [X.07Z, androidx.fragment.app.Fragment, X.4DH] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C19739Weg(X.AnonymousClass4DH r2, com.instagram.common.session.UserSession r3, X.C17836Vgp r4, java.lang.String r5, java.lang.String r6) {
        /*
            r1 = this;
            r1.<init>()
            android.content.Context r0 = r2.requireContext()
            X.6z9 r0 = X.C51970G9q.A0g(r0, r2, r3)
            r1.A01 = r0
            r1.A00 = r3
            r1.A03 = r5
            r1.A04 = r6
            r1.A02 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19739Weg.<init>(X.4DH, com.instagram.common.session.UserSession, X.Vgp, java.lang.String, java.lang.String):void");
    }
}
