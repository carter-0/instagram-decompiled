package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;

/* renamed from: X.OjD  reason: case insensitive filesystem */
public final class C71358OjD implements View.OnClickListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ ContentNoteMetadata A04;

    public C71358OjD(FragmentActivity fragmentActivity, AnonymousClass0iw r2, UserSession userSession, ContentNoteMetadata contentNoteMetadata, long j) {
        this.A04 = contentNoteMetadata;
        this.A03 = userSession;
        this.A01 = fragmentActivity;
        this.A02 = r2;
        this.A00 = j;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-483712799);
        ContentNoteMetadata contentNoteMetadata = this.A04;
        UserSession userSession = this.A03;
        if (contentNoteMetadata != null) {
            FragmentActivity fragmentActivity = this.A01;
            AnonymousClass0iw r10 = this.A02;
            String str = contentNoteMetadata.A06;
            GPK gpk = GPK.NOTE_THREE_DOT;
            String str2 = contentNoteMetadata.A05;
            Integer num = contentNoteMetadata.A02;
            long j = this.A00;
            C71147Oe5.A03(fragmentActivity, r10, userSession, j, false);
            GPJ.A00.A03(gpk, userSession, num, r10.getModuleName(), str, String.valueOf(j), str2);
        } else {
            C71147Oe5.A03(this.A01, this.A02, userSession, this.A00, false);
        }
        AnonymousClass0fD.A0C(-143670828, A05);
    }
}
