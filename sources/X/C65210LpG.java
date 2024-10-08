package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.LpG  reason: case insensitive filesystem */
public final class C65210LpG implements MVS {
    public View A00;
    public ImageView A01;
    public TextView A02;
    public TextView A03;
    public final AnonymousClass4DH A04;
    public final UserSession A05;
    public final KOY A06;
    public final AnonymousClass80P A07 = AnonymousClass80P.TEMP_CAMERA_TOOL;

    public final /* synthetic */ void ADm() {
    }

    public final View ANH() {
        String str;
        int i;
        AnonymousClass4DH r3 = this.A04;
        View A08 = DbU.A08(DbV.A0E(r3), R.layout.layout_share_to_reels_informational);
        this.A01 = DbU.A0F(A08, R.id.share_to_reels_icon);
        this.A03 = DbU.A0G(A08, R.id.share_to_reels_text);
        this.A02 = DbU.A0G(A08, R.id.share_to_reels_subtext);
        this.A00 = A08.requireViewById(R.id.share_to_reels_title);
        UserSession userSession = this.A05;
        Integer num = C226412gl.A00(userSession).A00;
        Integer num2 = AnonymousClass05K.A01;
        if (num == num2) {
            ImageView imageView = this.A01;
            if (imageView == null) {
                str = "shareToReelsIcon";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            imageView.setImageResource(R.drawable.instagram_circle_play_pano_outline_24);
        }
        if (JTR.A0w(userSession) != num2 || this.A06.A04) {
            View view = this.A00;
            if (view == null) {
                str = "shareToReelsTitle";
            } else {
                LIi.A01(view, false);
                int dimensionPixelSize = DbV.A05(r3).getDimensionPixelSize(R.dimen.share_option_horizontal_padding);
                int A022 = DbZ.A02(r3);
                TextView textView = this.A02;
                if (textView == null) {
                    str = "shareToReelsSubtext";
                } else {
                    0nA.A0j(textView, dimensionPixelSize, A022, dimensionPixelSize, A022);
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        TextView textView2 = this.A03;
        if (textView2 == null) {
            str = "shareToReelsText";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        int intValue = C226412gl.A00(userSession).A00.intValue();
        if (intValue != 1) {
            i = 2131973668;
            if (intValue != 2) {
                i = 2131973667;
            }
        } else {
            i = 2131973669;
        }
        textView2.setText(i);
        return A08;
    }

    public final C62674Kka B1s() {
        return null;
    }

    public final AnonymousClass80P BHl() {
        return this.A07;
    }

    public final void CsQ() {
        AnonymousClass4DH r0 = this.A04;
        07U r4 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r0.getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(MHO.A03(viewLifecycleOwner, r4, this, (AnonymousClass4D7) null, 38), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public C65210LpG(AnonymousClass4DH r2, UserSession userSession, KOY koy) {
        AnonymousClass7TG.A1O(r2, userSession);
        this.A04 = r2;
        this.A05 = userSession;
        this.A06 = koy;
    }
}
