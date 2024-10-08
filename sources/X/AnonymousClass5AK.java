package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.direct.inbox.notes.ui.NoteAvatarView;

/* renamed from: X.5AK  reason: invalid class name */
public final class AnonymousClass5AK extends C249703kE {
    public AnonymousClass4AS A00;
    public final View A01;
    public final View A02;
    public final IgTextView A03;
    public final NoteAvatarView A04;
    public final /* synthetic */ AnonymousClass4AK A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5AK(View view, AnonymousClass4AK r5) {
        super(view);
        0qQ.A0B(view, 2);
        this.A05 = r5;
        this.A01 = view;
        this.A02 = view.findViewById(R.id.pog_root_view);
        View findViewById = view.findViewById(R.id.pog_avatar_view);
        0qQ.A07(findViewById);
        NoteAvatarView noteAvatarView = (NoteAvatarView) findViewById;
        this.A04 = noteAvatarView;
        this.A03 = view.findViewById(R.id.pog_name);
        noteAvatarView.A0F(r5.A01);
        AnonymousClass0fU.A00(new C67525MpK(this, r5), noteAvatarView.A0H);
        AnonymousClass0fU.A00(new C67526MpL(this, r5), noteAvatarView.getNoteBubbleView());
    }
}
