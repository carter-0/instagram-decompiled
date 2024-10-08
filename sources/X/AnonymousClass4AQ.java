package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.NotesRepository;

/* renamed from: X.4AQ  reason: invalid class name */
public final class AnonymousClass4AQ extends C232222tE {
    public final UserSession A00;
    public final NotesRepository A01;

    public AnonymousClass4AQ(UserSession userSession, NotesRepository notesRepository) {
        0qQ.A0B(notesRepository, 2);
        this.A00 = userSession;
        this.A01 = notesRepository;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View inflate = layoutInflater.inflate(R.layout.item_chevron, viewGroup, false);
        0qQ.A07(inflate);
        return new C67945MxV(inflate, this);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        C67945MxV mxV = (C67945MxV) r5;
        0qQ.A0B(r4, 0);
        0qQ.A0B(mxV, 1);
        AnonymousClass0fU.A00(new C71294Ohq(mxV.A01), mxV.A00);
    }

    public final Class modelClass() {
        return AnonymousClass4AU.class;
    }
}
