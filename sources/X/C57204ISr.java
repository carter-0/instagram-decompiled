package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.user.model.User;

/* renamed from: X.ISr  reason: case insensitive filesystem */
public final class C57204ISr implements G73 {
    public final /* synthetic */ C52971GgO A00;
    public final /* synthetic */ String A01;

    public final void DoN(1Xj r7) {
        Long l;
        0qQ.A0B(r7, 0);
        C52971GgO ggO = this.A00;
        C270634h3 A0i = C51965G9l.A0i(ClipsViewerSource.VISUAL_REPLY, ggO.A0E);
        A0i.A1C = this.A01;
        ClipsViewerConfig A002 = A0i.A00();
        0Aj A0e = AnonymousClass7TE.A0e(ggO.A0C.A01, C273654mx.A00(80));
        User A11 = C51966G9m.A11(r7);
        String str = null;
        if (A11 != null) {
            l = C51972G9s.A0h(A11);
        } else {
            l = null;
        }
        A0e.A9F("entity_id", l);
        User A112 = C51966G9m.A11(r7);
        if (A112 != null) {
            str = A112.getUsername();
        }
        A0e.AAJ("entity_name", str);
        G9t.A1I(A0e, r7, PublicKeyCredentialControllerUtility.JSON_KEY_ID, r7.getId());
        String A2n = r7.A2n();
        if (A2n != null) {
            C51965G9l.A1E(A0e, AnonymousClass7TE.A10(A2n));
            G9t.A1H(A0e, r7);
            DbX.A1L(A0e);
            ggO.A0O.Epw(new AnonymousClass9IK((Object) A002, 6));
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public C57204ISr(C52971GgO ggO, String str) {
        this.A00 = ggO;
        this.A01 = str;
    }

    public final void onFail(String str) {
        0wb.A03("CommentListViewModel", 002.A0R("Failed to fetch visual reply media: ", str));
    }
}
