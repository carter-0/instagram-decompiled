package X;

import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;
import com.instagram.user.model.User;

public final class IR2 implements AnonymousClass4AD {
    public final /* synthetic */ ContentNoteMetadata A00;
    public final /* synthetic */ C55471HiF A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ String A03;

    public final void AMU(long j, String str) {
    }

    public final int BWZ() {
        return 1;
    }

    public final void Cls(String str) {
    }

    public final void Clt(String str, String str2) {
    }

    public final void DUV(String str, String str2) {
    }

    public final void Dah() {
    }

    public final void Dai(long j) {
    }

    public final void EBA(Integer num) {
        0qQ.A0B(num, 0);
        AnonymousClass1Nd.A00(this.A01.A00).A00(new C2370736f(this.A02, false, false, true, false));
    }

    public IR2(ContentNoteMetadata contentNoteMetadata, C55471HiF hiF, User user, String str) {
        this.A01 = hiF;
        this.A00 = contentNoteMetadata;
        this.A03 = str;
        this.A02 = user;
    }

    public final void AOX(long j) {
        UserSession userSession = this.A01.A00;
        ContentNoteMetadata contentNoteMetadata = this.A00;
        String str = contentNoteMetadata.A08;
        String str2 = contentNoteMetadata.A04;
        String str3 = contentNoteMetadata.A0A;
        String str4 = contentNoteMetadata.A06;
        C57127IPq iPq = new C57127IPq(contentNoteMetadata.A05, contentNoteMetadata.A02);
        String str5 = this.A03;
        AnonymousClass7TG.A1Q(str, str2);
        AnonymousClass4JJ.A00(userSession).A04(iPq.Als(), str, String.valueOf(j), str2, str4, str3, iPq.All(), str5);
    }
}
