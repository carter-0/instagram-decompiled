package X;

import com.facebook.android.maps.model.LatLng;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.direct.inbox.notes.models.NoteCreationSource;
import com.instagram.direct.inbox.notes.models.NoteStyle;

/* renamed from: X.OJy  reason: case insensitive filesystem */
public final class C70752OJy {
    public final /* synthetic */ C68462NJa A00;

    public C70752OJy(C68462NJa nJa) {
        this.A00 = nJa;
    }

    public final void A00(int i, String str) {
        C68462NJa nJa = this.A00;
        C68462NJa.A03(nJa, i);
        C69028NdD A01 = C68462NJa.A01(nJa);
        C71035OZw oZw = A01.A06;
        Integer num = AnonymousClass05K.A00;
        C53370Gmu gmu = null;
        if (oZw.A02(num).A01) {
            String A12 = DbV.A12(str);
            NoteAudience noteAudience = ((C68280N8r) A01.A0O()).A01.A01;
            LatLng A04 = C69028NdD.A04(A01);
            if (A04 != null) {
                gmu = new C53370Gmu((Boolean) false, (float) A04.A00, (float) A04.A01);
            }
            C68176N3r n3r = new C68176N3r((C61078JwG) null, (C61080JwI) null, gmu, (BBV) null, (BBV) null, (BBV) null, (BBV) null, (JV7) null, (N38) null);
            0sn r18 = 0sn.A00;
            C68176N3r n3r2 = n3r;
            NoteAudience noteAudience2 = noteAudience;
            C69028NdD.A0E(new C53396GnT(noteAudience2, n3r2, NoteCreationSource.INBOX_TRAY, NoteStyle.TEXT, A12, r18), A01, DbV.A12(str), true);
            return;
        }
        A01.A0P(new C72707PGl((String) null));
        C69028NdD.A09((C69486NmU) null, A01, num, C73835PkY.A00);
    }
}
