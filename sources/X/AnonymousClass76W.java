package X;

import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.76W  reason: invalid class name */
public final class AnonymousClass76W implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass79H A00;
    public final /* synthetic */ AnonymousClass7EB A01;

    public AnonymousClass76W(AnonymousClass79H r1, AnonymousClass7EB r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onClick(View view) {
        long j;
        int A05 = AnonymousClass0fD.A05(2010601835);
        AnonymousClass79H r3 = this.A00;
        MessageIdentifier messageIdentifier = r3.A0A;
        if (messageIdentifier != null) {
            AnonymousClass7EB r6 = this.A01;
            Long l = r3.A0B;
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            2FW r7 = r3.A09;
            r6.A05(r7, messageIdentifier, "quick_emoji_tray", j, true);
            AnonymousClass7D5 r0 = new AnonymousClass7D5(r3.A04);
            r6.A07 = r0;
            String str = messageIdentifier.A01;
            String str2 = r3.A0G;
            String obj = r7.toString();
            0wc r32 = r0.A00;
            0Aj A002 = r32.A00(r32.A00, "direct_message_reaction_null_state");
            if (A002.isSampled()) {
                A002.AAJ("action", "tap");
                A002.AAJ("message_id", str);
                A002.AAJ("open_thread_id", str2);
                A002.A8M(C69444Nlo.SINGLE, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                A002.AAJ("send_type", obj);
                A002.Cgf();
            }
        }
        AnonymousClass0fD.A0C(-1692533225, A05);
    }
}
