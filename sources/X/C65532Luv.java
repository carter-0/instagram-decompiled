package X;

import com.instagram.common.session.UserSession;
import com.instagram.reels.question.constants.QuestionStickerType;

/* renamed from: X.Luv  reason: case insensitive filesystem */
public final class C65532Luv implements AnonymousClass2sT {
    public final /* synthetic */ int A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass3Q2 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ C62320sa A06;

    public final void DaJ(AnonymousClass3Q2 r19) {
        AnonymousClass3Q2 r2 = r19;
        0qQ.A0B(r2, 0);
        if (r2.A1f == AnonymousClass3QD.CONFIGURED) {
            r2.A0Z(this);
            UserSession userSession = this.A01;
            String str = this.A04;
            String str2 = this.A03;
            AnonymousClass3Q2 r22 = this.A02;
            String str3 = this.A05;
            int i = this.A00;
            String str4 = QuestionStickerType.PICS_PLEASE.A00;
            String str5 = r22.A3t;
            int i2 = 1;
            if (r22.A12()) {
                i2 = 2;
            }
            1NY A002 = C18238Vo5.A00(userSession, str, str2, str4, "", "", K7H.__redex_internal_original_name, "", str3, i, false);
            A002.A9m("upload_id", str5);
            A002.A0C("media_type", i2);
            1OC A0T = DbT.A0T(A002, AnonymousClass000.A00(768), "media");
            1ES.A05(A0T, A0T.A04.runnableId, 2, true, false);
            this.A06.invoke();
        }
    }

    public C65532Luv(UserSession userSession, AnonymousClass3Q2 r2, String str, String str2, String str3, C62320sa r6, int i) {
        this.A01 = userSession;
        this.A04 = str;
        this.A03 = str2;
        this.A02 = r2;
        this.A05 = str3;
        this.A00 = i;
        this.A06 = r6;
    }
}
