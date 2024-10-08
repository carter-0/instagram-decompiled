package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import java.util.HashSet;

public final class NM0 extends 1P0 {
    public final /* synthetic */ C2367735a A00;
    public final /* synthetic */ 1Xj A01;
    public final /* synthetic */ C62320sa A02;

    public NM0(C2367735a r1, 1Xj r2, C62320sa r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(49624791);
        NHY nhy = (NHY) obj;
        int A032 = AnonymousClass0fD.A03(1670590663);
        0qQ.A0B(nhy, 0);
        C2367735a r2 = this.A00;
        1Xj r1 = this.A01;
        nhy.A03 = r1.A1Q();
        if (!(nhy.A05 == null || nhy.A06 == null || nhy.A04 == null)) {
            C74381Ptw A002 = r2.A00(nhy, r1);
            HashSet hashSet = C2367735a.A04;
            if (!00k.A0u(hashSet, nhy.A06)) {
                C2367935c r9 = r2.A02;
                boolean A012 = r2.A01();
                C2367835b r11 = r2.A01;
                Context context = r2.A00;
                0qQ.A0B(r11, 2);
                View A0D = DbT.A0D(LayoutInflater.from(context), (ViewGroup) null, R.layout.celebration_fullscreen_dialog, false);
                View findViewById = A0D.findViewById(R.id.outer_content_container_view);
                View findViewById2 = A0D.findViewById(R.id.inner_content_container_view);
                IgImageView findViewById3 = A0D.findViewById(R.id.reel_preview_image_view);
                TextView textView = (TextView) A0D.findViewById(R.id.text);
                IgdsMediaButton igdsMediaButton = (IgdsMediaButton) A0D.findViewById(R.id.share_button);
                TextView textView2 = (TextView) A0D.findViewById(R.id.dismiss_button);
                ImageView imageView = (ImageView) A0D.findViewById(R.id.animation_view);
                Dialog dialog = new Dialog(context, 16973841);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setColor(context.getColor(R.color.share_background));
                gradientDrawable.setCornerRadius(500.0f);
                igdsMediaButton.setBackground(gradientDrawable);
                textView.setText(nhy.A05);
                textView2.setText(nhy.A04);
                Dialog dialog2 = dialog;
                NHY nhy2 = nhy;
                C2367835b r28 = r11;
                AnonymousClass0fU.A00(new C71400Ojz(dialog2, nhy2, r28, A002, 2), textView2);
                if (nhy.A07 != null) {
                    igdsMediaButton.setVisibility(0);
                    igdsMediaButton.setLabel(nhy.A07);
                    AnonymousClass0fU.A00(new C71400Ojz(dialog2, nhy2, r28, A002, 3), igdsMediaButton);
                } else {
                    igdsMediaButton.setVisibility(8);
                }
                dialog.addContentView(A0D, new ViewGroup.LayoutParams(-1, -1));
                ImageUrl imageUrl = nhy.A03;
                if (imageUrl != null) {
                    findViewById3.setUrl(imageUrl, r11);
                    if (A012) {
                        findViewById3.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        if (!findViewById3.getClipToOutline()) {
                            findViewById3.setClipToOutline(true);
                        }
                    }
                    findViewById3.setVisibility(0);
                }
                0qQ.A0A(findViewById);
                if (!findViewById.isLaidOut() || findViewById.isLayoutRequested()) {
                    findViewById.addOnLayoutChangeListener(new C40032AOo(0, context, findViewById2, findViewById, textView, nhy2, r9, findViewById3));
                } else {
                    ImageUrl imageUrl2 = nhy.A03;
                    if (imageUrl2 != null) {
                        0qQ.A0A(findViewById3);
                        C2367935c.A00(context, findViewById, textView, findViewById3, imageUrl2);
                    }
                    findViewById2.requestLayout();
                }
                A0D.setAlpha(0.0f);
                igdsMediaButton.setAlpha(0.0f);
                textView2.setAlpha(0.0f);
                textView.setTranslationY(300.0f);
                textView.setAlpha(0.0f);
                findViewById3.setTranslationY(600.0f);
                findViewById3.setAlpha(0.0f);
                Handler A0D2 = AnonymousClass7TF.A0D();
                A0D.animate().alpha(1.0f).setDuration(300);
                C66581MXm.A0C(igdsMediaButton, 1.0f).setDuration(300);
                C66581MXm.A0C(textView2, 1.0f).setDuration(300);
                A0D2.postDelayed(new C20291Wog(textView, r9, findViewById3), 300);
                A0D2.postDelayed(new C73350Pb9(context, imageView, nhy, r9), 1200);
                AnonymousClass0fN.A00(dialog);
                String str = nhy.A06;
                if (str != null) {
                    hashSet.add(str);
                }
                if (nhy.A06 == null) {
                    0wb.A03("brand_experiences_reel_celebration", "promotionId was null when attempting to log");
                }
                AnonymousClass0fD.A0A(414388880, A032);
                AnonymousClass0fD.A0A(1502771441, A03);
            }
        }
        this.A02.invoke();
        AnonymousClass0fD.A0A(414388880, A032);
        AnonymousClass0fD.A0A(1502771441, A03);
    }

    public final void onFail(C268654dm r4) {
        int A0D = AnonymousClass7TG.A0D(r4, -326785161);
        Throwable A012 = r4.A01();
        if (A012 == null) {
            A012 = AnonymousClass7TE.A15("Http Request Failed");
        }
        0wb.A07("brand_experiences_reel_celebration", A012);
        this.A02.invoke();
        AnonymousClass0fD.A0A(-203411804, A0D);
    }
}
