package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;

/* renamed from: X.OjT  reason: case insensitive filesystem */
public final class C71370OjT implements View.OnClickListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ ContentNoteMetadata A04;
    public final /* synthetic */ AnonymousClass4AD A05;
    public final /* synthetic */ String A06;

    public C71370OjT(FragmentActivity fragmentActivity, AnonymousClass0iw r2, UserSession userSession, ContentNoteMetadata contentNoteMetadata, AnonymousClass4AD r5, String str, long j) {
        this.A03 = userSession;
        this.A01 = fragmentActivity;
        this.A02 = r2;
        this.A04 = contentNoteMetadata;
        this.A00 = j;
        this.A05 = r5;
        this.A06 = str;
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0fD.A05(520495526);
        UserSession userSession = this.A03;
        C71147Oe5.A04(this.A01, this.A02, userSession, this.A05, this.A04.A0A, String.valueOf(this.A00), this.A06);
        AnonymousClass0fD.A0C(1901287638, A052);
    }
}
