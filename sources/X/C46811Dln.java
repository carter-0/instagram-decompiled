package X;

import android.content.Context;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.Dln  reason: case insensitive filesystem */
public final class C46811Dln extends C322136vJ {
    public final C49400Ev2 A00;

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C46924Dne(DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.content_language_locale_item, false));
    }

    public C46811Dln(C49400Ev2 ev2) {
        super((C252303ot) C46802Dle.A00);
        this.A00 = ev2;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.0rm, java.lang.Object] */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r5, int i) {
        C46924Dne dne = (C46924Dne) r5;
        0qQ.A0B(dne, 0);
        ? obj = new Object();
        Object item = getItem(i);
        obj.A00 = item;
        Context A07 = DbS.A07(dne);
        String A16 = AnonymousClass7TE.A16(A07, ((C47271Dtz) ((C61082JwK) item).A00).A01);
        String A162 = AnonymousClass7TE.A16(A07, ((C47271Dtz) ((C61082JwK) obj.A00).A00).A00);
        IgdsListCell igdsListCell = dne.A00;
        igdsListCell.A0I(A16);
        igdsListCell.A0H(A162);
        igdsListCell.setTextCellType(C69349Njo.TYPE_SWITCH);
        igdsListCell.setChecked(((C61082JwK) obj.A00).A01);
        igdsListCell.A0E(new FdN(this, obj, i));
    }

    public final long getItemId(int i) {
        int A03 = AnonymousClass0fD.A03(-2121347804);
        long j = (long) ((C47271Dtz) ((C61082JwK) getItem(i)).A00).A00;
        AnonymousClass0fD.A0A(-1380351127, A03);
        return j;
    }
}
