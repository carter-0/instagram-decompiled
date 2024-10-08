package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Spannable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import java.util.ArrayList;

/* renamed from: X.Aaj  reason: case insensitive filesystem */
public final class C40350Aaj implements C355038Oi {
    public final ViewGroup A00;
    public final ImageView A01;
    public final TextView A02;
    public final CircularImageView A03;

    public final void D19(boolean z) {
    }

    public final /* synthetic */ void DKK(boolean z) {
    }

    public final void EI2() {
    }

    public final /* synthetic */ void EIG() {
    }

    public final /* synthetic */ void EPT(boolean z) {
    }

    public final void ESI(GradientDrawable.Orientation orientation, int[] iArr, int i) {
    }

    public final void ESJ(String str) {
    }

    public final /* synthetic */ void Eck(boolean z) {
    }

    public final /* synthetic */ void Ef3(String str, Integer num) {
    }

    public final void En3(boolean z) {
    }

    public final void FJo(Spannable spannable, C3499582p r6, AnonymousClass80V r7, AnonymousClass80X r8, Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        boolean A1U = AnonymousClass7TF.A1U(0, r7, r8);
        AnonymousClass7TG.A1Q(num, r6);
        boolean A08 = C355098Oo.A08(r7, r8);
        View[] viewArr = {this.A01};
        if (A08) {
            C355098Oo.A05(viewArr, false);
            C355098Oo.A03(this.A00, false);
            return;
        }
        C355098Oo.A05(viewArr, A1U);
        C355098Oo.A03(this.A00, A1U);
    }

    public final /* synthetic */ C351988Bf AuL() {
        return null;
    }

    public final /* synthetic */ int Bt9() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView, android.view.View] */
    public C40350Aaj(ViewStub viewStub, UserSession userSession, C351978Be r9) {
        String string;
        viewStub.setLayoutResource(R.layout.layout_post_capture_button_video_pog_in_note_selfie);
        View inflate = viewStub.inflate();
        ImageView imageView = (ImageView) inflate.findViewById(R.id.cancel_button);
        if (imageView != null) {
            Context context = inflate.getContext();
            imageView.setImageDrawable(context.getDrawable(R.drawable.instagram_arrow_back_24));
            imageView.setColorFilter(context.getColor(2Yu.A07(context)));
            AnonymousClass3NG A0m = AnonymousClass7TE.A0m(imageView);
            A0m.A04 = new C61686KHu(4, userSession, r9);
            A0m.A00();
        } else {
            imageView = null;
        }
        this.A01 = imageView;
        TextView textView = (TextView) inflate.requireViewById(R.id.video_pog_in_note_post_capture_education_text_view);
        this.A02 = textView;
        boolean A0D = AnonymousClass4AJ.A0D(userSession);
        Context context2 = inflate.getContext();
        if (A0D) {
            string = context2.getString(2131954561);
        } else {
            string = context2.getString(2131976503);
        }
        textView.setText(string);
        ViewGroup viewGroup = (ViewGroup) inflate.requireViewById(R.id.video_pog_in_note_post_capture_bottom_layout);
        this.A00 = viewGroup;
        AnonymousClass0fU.A00(new LY8(62, r9, userSession), viewGroup.findViewById(R.id.trash_button));
        ? r2 = (CircularImageView) viewGroup.findViewById(R.id.video_pog_in_note_confirmation_button);
        this.A03 = r2;
        AnonymousClass0fU.A00(new LY8(63, r9, userSession), r2);
        r2.setImageTintList(1QE.A0C(context2, (1QG) null));
        r2.setBackground(new ColorDrawable(1QE.A0B(context2, (1QG) null).getDefaultColor()));
    }

    public final /* synthetic */ ArrayList CFd() {
        return AnonymousClass7TE.A1C();
    }

    public final /* synthetic */ boolean D79(View view, MotionEvent motionEvent) {
        return false;
    }

    public final /* synthetic */ boolean Esi(float f, float f2) {
        return false;
    }
}
