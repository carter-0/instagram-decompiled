package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;

public final class BZ6 extends C250663lr implements C250673ls {
    public final AnonymousClass4Kx modelSelectionSet() {
        AnonymousClass4L8 r0 = AnonymousClass4L8.A00;
        AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r0, "bit_flags");
        AnonymousClass4Kz r3 = AnonymousClass4Kz.A00;
        AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r3, TraceFieldType.ContentType);
        AnonymousClass69U r2 = AnonymousClass69U.A00;
        AnonymousClass4L7 A0f3 = AnonymousClass7TE.A0f(r2, "created_at");
        AnonymousClass4L7 A0f4 = AnonymousClass7TE.A0f(r2, "created_at_utc");
        AnonymousClass4LF r22 = AnonymousClass4LF.A00;
        return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0f, A0f2, A0f3, A0f4, AnonymousClass7TE.A0f(r22, "did_report_as_spam"), C41845B3m.A0A(AnonymousClass4Ks.A00(), BZ4.class, "fb_mentioned_users", -2146526259), AnonymousClass7TE.A0f(r22, "has_translation"), AnonymousClass7TE.A0f(r22, "is_covered"), AnonymousClass7TE.A0f(r22, "is_ranked_comment"), C41847B3o.A0M(r3), C41846B3n.A0B(r3), AnonymousClass7TE.A0f(r0, "private_reply_status"), AnonymousClass7TE.A0f(r22, "share_enabled"), C41845B3m.A0L(r3), C41846B3n.A0F(r3), C41845B3m.A0H(r0), new C295075nX(C41845B3m.A0C(BZ5.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, -1979225723), C273654mx.A00(684)), C41845B3m.A0M(r3)});
    }

    public BZ6(int i) {
        super(i);
    }

    public BZ6() {
        super(567400688);
    }
}
