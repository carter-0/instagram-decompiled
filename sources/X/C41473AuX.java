package X;

import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

/* renamed from: X.AuX  reason: case insensitive filesystem */
public final class C41473AuX implements 0sP {
    public final /* synthetic */ C329067Hl A00;
    public final /* synthetic */ String A01;

    public C41473AuX(C329067Hl r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ViewStub viewStub;
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) obj;
        C329067Hl r2 = this.A00;
        UserSession userSession = r2.A1Z;
        if (!(C331227Qb.A03(userSession) || (viewStub = (ViewStub) r2.A07.findViewById(R.id.meta_ai_nux_disclaimer)) == null || spannableStringBuilder == null)) {
            IgTextView inflate = viewStub.inflate();
            r2.A0G = inflate;
            inflate.setText(spannableStringBuilder);
            r2.A0G.setMovementMethod(LinkMovementMethod.getInstance());
            AnonymousClass7I3 r0 = r2.A0J;
            String A0D = C329067Hl.A0D(r2);
            String str = this.A01;
            1Ln A0J = 1Ln.A0J(r0.A01);
            if (A0J.A00.isSampled()) {
                A0J.A0Y(0);
                A0J.A0Z(19);
                A0J.A0X(1);
                A0J.A0M(XSV.A02, "thread_type");
                A0J.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, A0D);
                A0J.A0R("agent_id", str);
                A0J.A0M(C69503Nml.A0I, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                A0J.Cgf();
            }
            C331227Qb.A01(userSession, true);
        }
        return C60340gF.A00;
    }
}
