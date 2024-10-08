package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.modal.ModalActivity;

/* renamed from: X.P3p  reason: case insensitive filesystem */
public final class C72376P3p implements C74499Pvt {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ ContentNoteMetadata A03;
    public final /* synthetic */ C68209N5y A04;
    public final /* synthetic */ O7W A05;
    public final /* synthetic */ AnonymousClass4AD A06;
    public final /* synthetic */ boolean A07;

    public final void Cgc(String str) {
        Bundle bundle;
        0qQ.A0B(str, 0);
        UserSession userSession = this.A02;
        Class<ModalActivity> cls = ModalActivity.class;
        1Wr r0 = 1Wr.A00;
        if (r0 != null) {
            r0.getFragmentFactory();
            bundle = AnonymousClass7TE.A0a();
            bundle.putString(AnonymousClass000.A00(229), str);
        } else {
            bundle = null;
        }
        DbU.A0w(this.A00, bundle, userSession, cls, "location_feed");
    }

    public final void Cqj(String str) {
        0qQ.A0B(str, 0);
        C71110Ocp ocp = C71110Ocp.A00;
        UserSession userSession = this.A02;
        FragmentActivity fragmentActivity = this.A00;
        AnonymousClass0iw r3 = this.A01;
        ContentNoteMetadata contentNoteMetadata = this.A03;
        ocp.A06(fragmentActivity, GPK.REPLY_SHEET, r3, userSession, contentNoteMetadata, str, true);
    }

    public C72376P3p(FragmentActivity fragmentActivity, AnonymousClass0iw r2, UserSession userSession, ContentNoteMetadata contentNoteMetadata, C68209N5y n5y, O7W o7w, AnonymousClass4AD r7, boolean z) {
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A01 = r2;
        this.A04 = n5y;
        this.A03 = contentNoteMetadata;
        this.A07 = z;
        this.A06 = r7;
        this.A05 = o7w;
    }

    public final void CpZ() {
        C71110Ocp.A00.A04(this.A00, this.A01, this.A02, this.A04.A02.getId(), AnonymousClass7TF.A1V(this.A03));
    }

    public final void Cyg() {
        O7W o7w = this.A05;
        if (o7w != null) {
            o7w.A00.A05.Cyg();
        }
    }

    public final boolean DUX() {
        return false;
    }

    public final void DuJ(Bundle bundle) {
        Dbb.A0i(this.A00, bundle, this.A02, ModalActivity.class, "notes_creation");
    }

    public final void E1B(ImageUrl imageUrl, ContentNoteMetadata contentNoteMetadata, NoteAudience noteAudience, String str, String str2, String str3, long j, boolean z) {
        String str4;
        String str5 = str;
        String str6 = str2;
        AnonymousClass7TG.A1U(noteAudience, str5, str6);
        0qQ.A0B(str3, 5);
        C71110Ocp ocp = C71110Ocp.A00;
        UserSession userSession = this.A02;
        FragmentActivity fragmentActivity = this.A00;
        boolean z2 = this.A07;
        AnonymousClass0iw r3 = this.A01;
        AnonymousClass4AD r7 = this.A06;
        ContentNoteMetadata contentNoteMetadata2 = contentNoteMetadata;
        if (contentNoteMetadata != null) {
            str4 = contentNoteMetadata2.A08;
        } else {
            str4 = null;
        }
        ocp.A07(fragmentActivity, r3, userSession, imageUrl, contentNoteMetadata2, r7, (AnonymousClass6ZA) null, str5, str6, j, z2, z, C71147Oe5.A07(userSession, str4));
    }

    public final void FMn() {
        C71110Ocp.A00.A04(this.A00, this.A01, this.A02, this.A04.A02.getId(), AnonymousClass7TF.A1V(this.A03));
    }
}
