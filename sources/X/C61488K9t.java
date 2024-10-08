package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.Map;

/* renamed from: X.K9t  reason: case insensitive filesystem */
public final class C61488K9t extends C231632rz {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final IngestSessionShim A03;
    public final C65306Lqz A04;
    public final DirectPrivateStoryRecipientController A05;
    public final ELU A06;
    public final C363008it A07;
    public final MTF A08;
    public final Map A09;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C61488K9t(Context context, AnonymousClass0iw r2, UserSession userSession, IngestSessionShim ingestSessionShim, C65306Lqz lqz, DirectPrivateStoryRecipientController directPrivateStoryRecipientController, ELU elu, C363008it r8, MTF mtf, Map map) {
        this.A00 = context;
        this.A02 = userSession;
        this.A04 = lqz;
        this.A08 = mtf;
        this.A03 = ingestSessionShim;
        this.A07 = r8;
        this.A06 = elu;
        this.A01 = r2;
        this.A05 = directPrivateStoryRecipientController;
        this.A09 = map;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        String str;
        String A002;
        int i2;
        int A032 = AnonymousClass0fD.A03(-637401135);
        LAO lao = (LAO) DbT.A0o(view);
        UserSession userSession = this.A02;
        Context context = this.A00;
        C65306Lqz lqz = this.A04;
        AnonymousClass0iw r12 = this.A01;
        MTF mtf = this.A08;
        IngestSessionShim ingestSessionShim = this.A03;
        C363008it r6 = this.A07;
        ELU elu = this.A06;
        C65302Lqv lqv = new C65302Lqv(context, r12, userSession, ingestSessionShim, lqz, this.A05, elu, r6, mtf, this.A09);
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = lqz.A00;
        if (!directPrivateStoryRecipientController.A0h) {
            directPrivateStoryRecipientController.A0h = true;
            UserSession userSession2 = directPrivateStoryRecipientController.A0B;
            JZX.A00(JZY.VIEW, JZZ.STORY, AnonymousClass818.IG_STORY_AFTER_SHARE_SHEET, (C60757Jqo) null, userSession2);
        }
        C299935wF A003 = C363388je.A00(userSession).A00(C64365Lah.A00);
        if (C363388je.A02(A003)) {
            str = A003.A04;
            A002 = C367158qH.A00(context, userSession, A003);
            GradientSpinnerAvatarView gradientSpinnerAvatarView = lao.A06;
            AnonymousClass3YO.A00(context, r12, gradientSpinnerAvatarView, A003.A05);
            i2 = 0;
            gradientSpinnerAvatarView.setVisibility(0);
            lao.A01.setVisibility(8);
            TextView textView = lao.A02;
            int i3 = 2131960144;
            if (182.A06(0Tu.A05, userSession, 36330535651394221L)) {
                i3 = 2131960145;
            }
            textView.setText(i3);
        } else {
            Integer num = A003.A02;
            if (num == AnonymousClass05K.A01 || num == AnonymousClass05K.A0C) {
                str = A003.A04;
                A002 = C367158qH.A00(context, userSession, A003);
                GradientSpinnerAvatarView gradientSpinnerAvatarView2 = lao.A06;
                AnonymousClass3YO.A00(context, r12, gradientSpinnerAvatarView2, A003.A05);
                i2 = 0;
                gradientSpinnerAvatarView2.setVisibility(0);
                lao.A01.setVisibility(8);
            } else {
                lao.A06.setVisibility(8);
                lao.A02.setText(2131960145);
                C64162LRd lRd = lao.A05;
                LRm AXA = mtf.AXA();
                AXA.getClass();
                lRd.A03(AXA.A01(C61002Juy.A08), lqv);
                AnonymousClass0fD.A0A(-16533846, A032);
            }
        }
        TextView textView2 = lao.A04;
        textView2.setVisibility(i2);
        if (A002 != null) {
            str = DbV.A0u(context, str, A002, 2131964456);
        }
        textView2.setText(str);
        C64162LRd lRd2 = lao.A05;
        LRm AXA2 = mtf.AXA();
        AXA2.getClass();
        lRd2.A03(AXA2.A01(C61002Juy.A08), lqv);
        AnonymousClass0fD.A0A(-16533846, A032);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0fD.A03(1234766355);
        UserSession userSession = this.A02;
        FFL.A00(C48152EZu.A0L, userSession, "upsell_impressions");
        Context context = viewGroup.getContext();
        View inflate = LayoutInflater.from(context).inflate(R.layout.recipient_picker_add_to_fb_story, viewGroup, false);
        LAO lao = new LAO(inflate, userSession);
        ImageView imageView = lao.A01;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        Resources resources = viewGroup.getResources();
        Typeface A0N = AnonymousClass7TG.A0N(context);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        layoutParams.width = dimensionPixelSize;
        layoutParams.height = dimensionPixelSize;
        imageView.setLayoutParams(layoutParams);
        lao.A06.setLayoutParams(layoutParams);
        TextView textView = lao.A02;
        textView.setTextSize(0, AnonymousClass7TE.A01(resources, R.dimen.abc_text_size_menu_header_material));
        textView.setTypeface(A0N);
        TextView textView2 = lao.A03;
        textView2.setTextSize(0, AnonymousClass7TE.A01(resources, R.dimen.abc_text_size_menu_header_material));
        textView2.setTypeface(A0N);
        inflate.setTag(lao);
        AnonymousClass0fD.A0A(-79788527, A032);
        return inflate;
    }
}
