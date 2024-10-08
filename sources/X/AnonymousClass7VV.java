package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;

/* renamed from: X.7VV  reason: invalid class name */
public final class AnonymousClass7VV implements AnonymousClass7VW {
    public final AnonymousClass4DH A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final AnonymousClass7SN A03;
    public final AnonymousClass4DH A04;
    public final AnonymousClass0iw A05;
    public final UserSession A06;
    public final AnonymousClass7SN A07;
    public final String A08;
    public final AnonymousClass0eK A09;
    public final C62320sa A0A;
    public final boolean A0B;
    public final boolean A0C;

    public final void CfT(ImageUrl imageUrl, MessagingUser messagingUser) {
        int i;
        View.OnClickListener onClickListener;
        0qQ.A0B(messagingUser, 0);
        this.A03.CLU();
        AnonymousClass9B9.A00();
        UserSession userSession = this.A02;
        FragmentActivity requireActivity = this.A00.requireActivity();
        String str = messagingUser.A03;
        0qQ.A07(str);
        AnonymousClass0iw r4 = this.A01;
        C46498Dg1 dg1 = new C46498Dg1(requireActivity, userSession);
        User A022 = 17h.A00(userSession).A02(str);
        if (A022 != null) {
            dg1.A08(A022.B8Q());
        } else {
            dg1.A01(2131960442);
        }
        dg1.A07(imageUrl);
        ODN odn = new ODN(userSession);
        AnonymousClass9B9.A00();
        int intValue = AnonymousClass9BA.A00(userSession).A00().intValue();
        if (intValue == 3) {
            dg1.A04(new C50075FNq(requireActivity, r4, userSession, str), 2131966184);
            i = 2131975301;
            onClickListener = new FMr(userSession, requireActivity);
        } else if (intValue == 1) {
            dg1.A04(new C50074FNp(requireActivity, userSession, odn, str), 2131952577);
            i = 2131975299;
            onClickListener = new FMp(userSession, requireActivity);
        } else if (intValue != 2) {
            if (intValue != 0) {
                throw new RuntimeException();
            }
            dg1.A04(AOS.A00, 2131954722);
            new C49945FFy(dg1).A03(requireActivity);
        } else {
            AOR aor = AOR.A00;
            0qQ.A0B(aor, 1);
            dg1.A09.add(new C67293MlS((View.OnClickListener) aor, 1.0f, 2131952558, 2Yu.A0H(dg1.A00, R.attr.igds_color_primary_text_disabled)));
            i = 2131975299;
            onClickListener = new FMq(userSession, requireActivity);
        }
        dg1.A04(onClickListener, i);
        dg1.A04(AOS.A00, 2131954722);
        new C49945FFy(dg1).A03(requireActivity);
    }

    public final void Cq2(View view, MessagingUser messagingUser) {
        MessagingUser messagingUser2 = messagingUser;
        0qQ.A0B(messagingUser2, 0);
        View view2 = view;
        0qQ.A0B(view2, 1);
        AnonymousClass9B9.A00();
        UserSession userSession = this.A02;
        FragmentActivity requireActivity = this.A00.requireActivity();
        String str = messagingUser2.A03;
        0qQ.A07(str);
        AnonymousClass0iw r2 = this.A01;
        String string = requireActivity.getString(2131966184);
        0qQ.A07(string);
        List singletonList = Collections.singletonList(new C367618rI((Drawable) null, requireActivity.getDrawable(R.drawable.instagram_direct_pano_outline_16), (C15048ULb) null, new PHR(requireActivity, r2, userSession, str), (Integer) null, string, 0, 0, 0, false, false, false, true, false, false, false));
        0qQ.A07(singletonList);
        Context context = view2.getContext();
        0qQ.A07(context);
        C355148Ov r4 = new C355148Ov(context, userSession, (Integer) null, false);
        r4.A02(singletonList);
        1Ln A0J = 1Ln.A0J(new AnonymousClass7I3(userSession).A01);
        if (A0J.A00.isSampled()) {
            A0J.A0Z(41);
            A0J.A0X(1);
            A0J.A0M(C69503Nml.A0G, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0J.A0R("agent_id", str);
            A0J.Cgf();
        }
        r4.getContentView().measure(0, 0);
        r4.showAsDropDown(view2, 0, -(r4.getContentView().getMeasuredHeight() + view2.getMeasuredHeight() + C18092VlM.A00(r4.A00, 12.0f)), 0);
    }

    public final void CqM(MessagingUser messagingUser, String str) {
        MessagingUser messagingUser2 = messagingUser;
        0qQ.A0B(messagingUser, 0);
        String str2 = str;
        0qQ.A0B(str, 1);
        if (((Capabilities) this.A0A.invoke()).A00(C376179Gx.NAVIGATE_TO_USER_PROFILE) && messagingUser.A04) {
            DirectThreadKey A042 = C66647MaG.A04((C254743sy) this.A09.get());
            if (A042 != null) {
                UserSession userSession = this.A06;
                AnonymousClass0iw r2 = this.A05;
                String str3 = A042.A00;
                String str4 = messagingUser.A03;
                0qQ.A07(str4);
                C3265677h.A0K(r2, userSession, str3, str4);
            }
            FragmentActivity requireActivity = this.A04.requireActivity();
            UserSession userSession2 = this.A06;
            C48838El0.A00(requireActivity, this.A05, userSession2, messagingUser2, str2, this.A08, this.A0C, this.A0B);
        }
    }

    public AnonymousClass7VV(AnonymousClass4DH r1, AnonymousClass0iw r2, UserSession userSession, AnonymousClass7SN r4, String str, AnonymousClass0eK r6, C62320sa r7, boolean z, boolean z2) {
        this.A00 = r1;
        this.A02 = userSession;
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = r1;
        this.A06 = userSession;
        this.A05 = r2;
        this.A09 = r6;
        this.A0A = r7;
        this.A07 = r4;
        this.A0C = z;
        this.A08 = str;
        this.A0B = z2;
    }
}
