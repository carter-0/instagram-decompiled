package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import org.webrtc.MediaStreamTrack;

public final class EQK extends C47647EBh {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Uri A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ 1Xj A03;
    public final /* synthetic */ AnonymousClass4DU A04;
    public final /* synthetic */ Runnable A05;
    public final /* synthetic */ String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EQK(Context context, Context context2, Uri uri, 0hq r4, UserSession userSession, 1Xj r6, AnonymousClass4DU r7, Runnable runnable, String str) {
        super(context, r4);
        this.A03 = r6;
        this.A02 = userSession;
        this.A01 = uri;
        this.A00 = context2;
        this.A06 = str;
        this.A04 = r7;
        this.A05 = runnable;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        AnonymousClass4DU r12;
        int A032 = AnonymousClass0fD.A03(-1008398442);
        int A033 = AnonymousClass0fD.A03(1437357016);
        String str2 = ((DvJ) obj).A00;
        Bundle A0a = AnonymousClass7TE.A0a();
        1Xj r14 = this.A03;
        UserSession userSession = this.A02;
        A0a.putString("android.intent.extra.TEXT", C46395DeI.A01(userSession, r14, str2));
        Uri uri = this.A01;
        if (uri != null) {
            Context context = this.A00;
            str = this.A06;
            r12 = this.A04;
            HashMap A0w = DbX.A0w(str2);
            Dbc.A0u(userSession, r14, str, A0w);
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(Pxd.A00(105));
            intent.putExtra(AnonymousClass000.A00(66), uri);
            intent.setFlags(1);
            if (!A0a.isEmpty()) {
                intent.putExtras(A0a);
            }
            if (0kR.A0D(context, C46395DeI.A00(context, intent, userSession, r12.getModuleName(), A0w))) {
                "share_to_system_sheet".getClass();
                0xI A012 = 0xI.A01("share_to_system_sheet", (String) null);
                A012.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, MediaStreamTrack.VIDEO_TRACK_KIND);
                DbU.A1R(A012, userSession);
            } else {
                0wb.A03("share_to_system_sheet", "Can't find intent handler for content");
            }
        } else {
            Context context2 = this.A00;
            str = this.A06;
            r12 = this.A04;
            C46395DeI.A0O(context2, (Uri) null, A0a, r12, userSession, r14, (String) null, "share_to_system_sheet", str2, str, true, false);
        }
        if (!AnonymousClass7TF.A0R(0Tu.A05, userSession, 36323942876589693L).booleanValue()) {
            String id = r14.getId();
            String A0x = DbT.A0x(r14);
            DbY.A1S(userSession, id);
            C22031Xty.A0K(r12, userSession, id, str, "system_share_sheet", str2, (String) null, A0x, (String) null);
        }
        Runnable runnable = this.A05;
        if (runnable != null) {
            runnable.run();
        }
        AnonymousClass0fD.A0A(-554465325, A033);
        AnonymousClass0fD.A0A(-609061953, A032);
    }

    public final void onFail(C268654dm r10) {
        int A032 = AnonymousClass0fD.A03(-895872617);
        super.onFail(r10);
        UserSession userSession = this.A02;
        AnonymousClass4DU r3 = this.A04;
        1Xj r1 = this.A03;
        String str = this.A06;
        Throwable A012 = r10.A01();
        Runnable runnable = this.A05;
        String id = r1.getId();
        id.getClass();
        C22031Xty.A0H(r3, userSession, id, str, "system_share_sheet", A012);
        if (runnable != null) {
            runnable.run();
        }
        AnonymousClass0fD.A0A(-936891425, A032);
    }
}
