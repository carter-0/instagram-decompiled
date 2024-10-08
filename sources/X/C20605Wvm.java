package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.Wvm  reason: case insensitive filesystem */
public final /* synthetic */ class C20605Wvm extends 03J implements 0sJ {
    public static final C20605Wvm A00 = new C20605Wvm();

    public C20605Wvm() {
        super(4, C16699V2c.class, "genMessageComposerPlaceholderState", "genMessageComposerPlaceholderState(Lcom/instagram/common/session/UserSession;Lcom/instagram/model/reels/Reel;Lcom/instagram/model/reels/ReelItem;Lcom/instagram/stories/common/data/StoriesViewerParameters;)Lcom/instagram/stories/messagecomposer/domain/StoriesMessageComposerViewModel$UiState$ComposerInactive;", 1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        C20851X1d x1d;
        String str;
        Integer num;
        UOF uof;
        String id;
        UserSession userSession = (UserSession) obj;
        Reel reel = (Reel) obj2;
        C255773uh r4 = (C255773uh) obj3;
        C311716d8 r7 = (C311716d8) obj4;
        C51974G9v.A1O(userSession, reel, r4, r7);
        C18389Vqp vqp = C18389Vqp.A00;
        1as r2 = 1as.A04;
        0qQ.A07(r2);
        C17278VPf vPf = new C17278VPf(new C17510VYo(userSession, C18371VqX.A00, r2, vqp));
        C17805VgI vgI = new C17805VgI(userSession);
        MP8 mp8 = new MP8(userSession, 8);
        MP8 mp82 = new MP8(userSession, 9);
        C15021UKa uKa = new C15021UKa(0.0f, 0, 0, 0, 0, 0, false);
        if (r4.A0e == C250963mL.MEDIA) {
            x1d = new UOF(reel, r4, uKa);
        } else {
            x1d = C19661WdP.A00;
        }
        C20851X1d x1d2 = x1d;
        1Xj r0 = r4.A0b;
        if (r0 == null || (id = r0.getId()) == null) {
            str = null;
        } else {
            str = (String) mp8.invoke(id);
        }
        0qQ.A0B(x1d2, 0);
        boolean A01 = W2B.A01(x1d2);
        C20851X1d x1d3 = x1d2;
        boolean z = x1d2 instanceof UOF;
        if (!z) {
            num = AnonymousClass05K.A00;
        } else {
            User A002 = C17103VHz.A00((UOF) x1d3);
            if (A002 != null) {
                C17510VYo vYo = vPf.A00;
                if (vYo.A01.A0H(vYo.A00, AnonymousClass6UD.A00(A002, false)) || AnonymousClass7TE.A1a(mp82.invoke(A002))) {
                    num = AnonymousClass05K.A0C;
                }
            }
            if (182.A06(0Tu.A05, vgI.A00, 36320725946082081L)) {
                num = AnonymousClass05K.A0N;
            } else {
                num = AnonymousClass05K.A01;
            }
        }
        User user = null;
        if (z && (uof = (UOF) x1d2) != null) {
            user = C17103VHz.A00(uof);
        }
        return new UOL(W2B.A00(r7, vPf, user, str, vgI.A00(), false), num, A01);
    }
}
