package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.RIXUCtaType;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.rixu.RIXUChainingBehaviorDefinition;
import java.util.List;

public final class ICV implements View.OnClickListener {
    public final /* synthetic */ C231702s8 A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass3Y6 A02;
    public final /* synthetic */ C292795jX A03;
    public final /* synthetic */ AnonymousClass2xS A04;
    public final /* synthetic */ C229332nD A05;

    public ICV(C231702s8 r1, UserSession userSession, AnonymousClass3Y6 r3, C292795jX r4, AnonymousClass2xS r5, C229332nD r6) {
        this.A01 = userSession;
        this.A05 = r6;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r1;
        this.A04 = r5;
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0fD.A05(-952855689);
        UserSession userSession = this.A01;
        C229332nD r8 = this.A05;
        AnonymousClass3Y6 r4 = this.A02;
        C292795jX r1 = this.A03;
        C231702s8 r3 = this.A00;
        AnonymousClass2xS r13 = this.A04;
        RIXUCtaType rIXUCtaType = r4.A08;
        if (rIXUCtaType == null) {
            rIXUCtaType = RIXUCtaType.WATCH_ALL;
        }
        if (rIXUCtaType == RIXUCtaType.VIEW_ALL) {
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, 293.A05);
            Context context = r8.A01;
            DbS.A1X(context);
            C55253Hei.A00((Activity) context, context, A0a, userSession);
        } else if (AnonymousClass7TE.A1b(r4.A0M)) {
            ClipsViewerSource A012 = r4.A01();
            String id = ((C276014sL) r4.A0M.get(0)).A00.getId();
            if (id != null) {
                List A07 = C295325ny.A07(r4.A0M);
                String id2 = r4.getId();
                C276104sZ r10 = r4.A04;
                String str = r4.A0S;
                Integer valueOf = Integer.valueOf(r1.A00);
                boolean z = r4.A0N;
                boolean z2 = r4.A0Q;
                r8.A00(r4.A00(), r10, A012, (C2605946h) null, r13, (C297595s1) null, (RIXUChainingBehaviorDefinition) null, valueOf, r4.A0D, id, id2, str, (String) null, (String) null, A07, z, z2, false);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        if (r4.A0P) {
            0Aj A0e = AnonymousClass7TE.A0e(r3.A01, C273654mx.A00(763));
            if (A0e.isSampled() && r3.A04.add(r4.getId())) {
                A0e.AAJ(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r4.A03.toString());
                DbS.A1J(A0e, C273654mx.A00(645));
                C51969G9p.A1A(A0e, r3.A00);
                A0e.A9F("ig_userid", DbV.A0q(r3.A02.A06));
                A0e.AAJ("netego_id", r4.getId());
                C51965G9l.A1L(A0e, r4.A0F);
                A0e.Cgf();
            }
        }
        AnonymousClass0fD.A0C(-1394398785, A052);
    }
}
