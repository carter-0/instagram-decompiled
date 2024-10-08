package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;

/* renamed from: X.OVy  reason: case insensitive filesystem */
public final class C71001OVy {
    public final AnonymousClass4DH A00;
    public final UserSession A01;
    public final C66633Ma2 A02;

    public C71001OVy(AnonymousClass4DH r2, UserSession userSession, C66633Ma2 ma2) {
        0qQ.A0B(ma2, 2);
        this.A01 = userSession;
        this.A02 = ma2;
        this.A00 = r2;
    }

    public static final C367618rI A00(Drawable drawable, String str, C62320sa r16) {
        return new C367618rI((Drawable) null, drawable, (C15048ULb) null, new PHN(r16, 7), (Integer) null, str, 0, 0, 0, false, false, false, true, false, false, false);
    }

    public final void A01(View view, 28D r11) {
        Context A0C = JTP.A0C(view, 0);
        0qQ.A0A(A0C);
        C355148Ov r4 = new C355148Ov(A0C, this.A01, (Integer) null, false);
        r4.A02(0sr.A1P(new C367618rI[]{A00(A0C.getDrawable(R.drawable.instagram_camera_pano_outline_24), AnonymousClass7TE.A16(A0C, 2131954547), new C73916Plr(26, r11, this)), A00(A0C.getDrawable(R.drawable.instagram_microphone_pano_outline_24), AnonymousClass7TE.A16(A0C, 2131953273), C73765PjQ.A00), A00(A0C.getDrawable(R.drawable.instagram_photo_gen_ai_pano_outline_24), AnonymousClass7TE.A16(A0C, 2131964137), C73924Pm4.A01(this, 47)), A00(A0C.getDrawable(R.drawable.instagram_app_imessage_pano_outline_24), AnonymousClass7TE.A16(A0C, 2131966187), C73924Pm4.A01(this, 48))}));
        if (r11 == 28D.A04) {
            r4.showAtLocation(view, 8388693, 0, 0);
        } else {
            r4.showAsDropDown(view, (int) (((double) (-C51970G9q.A0B(r4.A00()))) / 1.5d), 0);
        }
    }

    public final void A02(28D r7) {
        Bundle A0A = DbY.A0A(r7);
        A0A.putSerializable("DirectConversationStarterCameraFragment.ARG_INBOX_ENTRY_POINT", r7);
        AnonymousClass4DH r2 = this.A00;
        DbU.A1K(r2, AnonymousClass6W8.A02(r2.requireActivity(), A0A, this.A01, TransparentModalActivity.class, C273654mx.A00(2252)));
    }
}
