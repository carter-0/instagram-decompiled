package X;

import android.view.View;
import com.instagram.direct.inbox.notes.ui.NoteAvatarView;

/* renamed from: X.MpL  reason: case insensitive filesystem */
public final class C67526MpL implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass5AK A00;
    public final /* synthetic */ AnonymousClass4AK A01;

    public C67526MpL(AnonymousClass5AK r1, AnonymousClass4AK r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1905663081);
        AnonymousClass5AK r1 = this.A00;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        AnonymousClass4AS r4 = r1.A00;
        if (r4 != null) {
            AnonymousClass4AF r3 = this.A01.A02;
            C319726r6 r2 = C319726r6.NOTE_BUBBLE;
            NoteAvatarView noteAvatarView = r1.A04;
            r3.A00(noteAvatarView.A0H, noteAvatarView.getNoteBubbleView(), r2, r4);
        }
        AnonymousClass0fD.A0C(-33815960, A05);
    }
}
