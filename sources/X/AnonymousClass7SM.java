package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.7SM  reason: invalid class name */
public final class AnonymousClass7SM implements AnonymousClass7SN, AnonymousClass7SO {
    public final /* synthetic */ AnonymousClass9H7 A00;

    public AnonymousClass7SM(AnonymousClass9H7 r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001d, code lost:
        r5 = r3.A1Z;
        r1 = r3.A1R;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r13 = this;
            X.9H7 r0 = r13.A00
            X.7Hl r3 = X.AnonymousClass9H7.A06(r0)
            X.7KY r1 = X.C329067Hl.A08(r3)
            X.794 r0 = new X.794
            r0.<init>(r1)
            X.0eM r0 = r0.A01
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0066
            com.instagram.common.session.UserSession r5 = r3.A1Z
            android.content.Context r1 = r3.A1R
            X.37D r0 = X.AnonymousClass7ON.A01(r1, r5)
            if (r0 == 0) goto L_0x0066
            X.P0a r7 = new X.P0a
            r7.<init>(r3, r0)
            X.1as r0 = X.1as.A04
            X.1ap r4 = r0.A02
            com.instagram.direct.avatar.stickers.intf.DirectAvatarTrayFragmentConfig$StandaloneTray r6 = com.instagram.direct.avatar.stickers.intf.DirectAvatarTrayFragmentConfig.StandaloneTray.A00
            X.NjK r8 = X.C69319NjK.AVATAR_STICKER_TAP
            java.util.ArrayList r11 = X.C329067Hl.A0G(r3)
            X.3t2 r2 = r3.A1z
            r0 = 0
            X.0qQ.A0B(r2, r0)
            boolean r12 = r2 instanceof X.AnonymousClass9HR
            com.instagram.model.direct.DirectThreadKey r9 = X.C329067Hl.A09(r3)
            r10 = 0
            X.K3S r2 = r4.A01(r5, r6, r7, r8, r9, r10, r11, r12)
            r3.A19()
            X.7L0 r0 = r3.A0U
            if (r0 == 0) goto L_0x0053
            r2.ADi(r0)
        L_0x0053:
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            java.lang.Object r1 = X.0mE.A00(r1, r0)
            android.app.Activity r1 = (android.app.Activity) r1
            if (r1 == 0) goto L_0x0066
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.PEh r0 = X.C329067Hl.A06(r1, r3, r0)
            X.AnonymousClass7ON.A02(r2, r0)
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7SM.A00():void");
    }

    public final void A01(C70726OHv oHv) {
        C329797Kg r5;
        String str;
        Object obj;
        AnonymousClass78R r2;
        C3260875i createCommandData;
        AnonymousClass78Z r1;
        IgProgressImageView igProgressImageView;
        C329067Hl r6 = this.A00.A0R;
        if (r6 != null && (r5 = r6.A0c) != null) {
            AnonymousClass7L0 r0 = r6.A0U;
            AnonymousClass7L0 r18 = r0;
            if (r0 != null) {
                ViewGroup viewGroup = r5.A03;
                if (viewGroup == null) {
                    viewGroup = (ViewGroup) r5.A0E.inflate();
                    r5.A03 = viewGroup;
                }
                Context context = viewGroup.getContext();
                Resources resources = context.getResources();
                r5.A03.setPadding(0, 0, 0, resources.getDimensionPixelOffset(R.dimen.abc_edit_text_inset_top_material) - resources.getDimensionPixelOffset(R.dimen.abc_button_inset_vertical_material));
                r5.A05 = (TextView) r5.A03.requireViewById(R.id.quoted_message_info);
                r5.A06 = (TextView) r5.A03.requireViewById(R.id.quoted_message_subtitle);
                r5.A08 = (IgSimpleImageView) r5.A03.requireViewById(R.id.quoted_voice_message_indicator);
                r5.A04 = (FrameLayout) r5.A03.requireViewById(R.id.attachment_container);
                r5.A00 = r5.A03.requireViewById(R.id.progress_bar);
                Drawable drawable = r5.A08.getDrawable();
                drawable.getClass();
                Drawable findDrawableByLayerId = ((LayerDrawable) drawable).findDrawableByLayerId(R.id.reply_bar_voice_message_icon);
                findDrawableByLayerId.getClass();
                findDrawableByLayerId.setColorFilter(AnonymousClass37O.A00(2Yu.A0F(context, R.attr.glyphColorPrimary)));
                r5.A01 = r5.A03.requireViewById(R.id.close_reply_bar_icon);
                r5.A02 = r5.A03.requireViewById(R.id.reply_bar_divider);
                C329817Ki r11 = r5.A0A;
                r11.A01 = (IgProgressImageView) r5.A03.requireViewById(R.id.quoted_media_message_thumbnail);
                C70726OHv oHv2 = oHv;
                AnonymousClass0fU.A00(new C71320OiR(oHv2, r5), r5.A01);
                C329797Kg.A00(r5);
                TextView textView = r5.A05;
                textView.getClass();
                textView.setText(oHv2.A06);
                C70566OBo oBo = oHv2.A02;
                TextView textView2 = r5.A06;
                textView2.getClass();
                CharSequence charSequence = oHv2.A04;
                int i = 0;
                if (charSequence == null) {
                    i = 8;
                }
                textView2.setVisibility(i);
                boolean z = oHv2.A08;
                TextView textView3 = r5.A06;
                int i2 = 1;
                if (z) {
                    i2 = Integer.MAX_VALUE;
                }
                textView3.setMaxLines(i2);
                TextView textView4 = r5.A06;
                textView4.getClass();
                textView4.setText(charSequence);
                boolean z2 = oHv2.A07;
                ImageUrl imageUrl = oHv2.A01;
                if (z2) {
                    long j = oHv2.A00;
                    r11.A01(imageUrl, j);
                    Integer num = oHv2.A05;
                    if (!(num == null || (igProgressImageView = r11.A01) == null)) {
                        Resources resources2 = igProgressImageView.getResources();
                        0qQ.A07(resources2);
                        try {
                            float dimension = resources2.getDimension(R.dimen.abc_action_bar_elevation_material);
                            if (Float.valueOf(dimension) != null) {
                                igProgressImageView.setVisibility(0);
                                IgImageView igImageView = igProgressImageView.getIgImageView();
                                Context context2 = igProgressImageView.getContext();
                                igImageView.setColorFilter(context2.getColor(2Yu.A0H(context2, R.attr.igds_color_secondary_button_on_media_panavision_updated)), PorterDuff.Mode.SRC_OVER);
                                C242553Us r12 = new C242553Us();
                                r12.A06(dimension);
                                C3265577g.A04(r12, igProgressImageView.getIgImageView());
                                igProgressImageView.A0A(new C40523AdW(r11, igProgressImageView, num), R.id.listener_id_for_direct_gated_media_item_viewer_image_binding);
                                if (imageUrl != null) {
                                    igProgressImageView.setExpiration(j);
                                    if (num == AnonymousClass05K.A0C) {
                                        AnonymousClass75B.A00(igProgressImageView.getIgImageView(), 1);
                                        C329817Ki.A00(imageUrl, r11);
                                    } else {
                                        igProgressImageView.setMiniPreviewBlurRadius(6);
                                        C329817Ki.A00(new SimpleImageUrl(002.A0R("preview:/", imageUrl.getUrl())), r11);
                                    }
                                }
                            }
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                } else {
                    r11.A01(imageUrl, oHv2.A00);
                }
                FrameLayout frameLayout = r5.A04;
                frameLayout.getClass();
                frameLayout.setVisibility(8);
                View view = r5.A00;
                view.getClass();
                view.setVisibility(8);
                r5.A0B = z;
                C70566OBo oBo2 = oBo;
                C254933tI r3 = oBo2.A01;
                C329087Hn r13 = r5.A0G;
                C69347Njm njm = oBo2.A00;
                C329067Hl r9 = r13.A00;
                AnonymousClass7H1 r14 = r9.A1w;
                if (r14 instanceof AnonymousClass7H0) {
                    AnonymousClass7H0 r15 = (AnonymousClass7H0) r14;
                    0qQ.A0B(njm, 0);
                    AnonymousClass7H4 r22 = r15.A0E;
                    2Er r112 = r15.A02;
                    if (njm == C69347Njm.IMAGINE_ANIMATE && r112 != null) {
                        UserSession userSession = r22.A01;
                        if (AnonymousClass78W.A00.A00(r112, 1012) && AnonymousClass9B8.A08(userSession) && AnonymousClass9B8.A07(userSession) && 182.A06(0Tu.A05, userSession, 36319398805183739L)) {
                            ComposerAutoCompleteTextView composerAutoCompleteTextView = r9.A0b.A0S;
                            composerAutoCompleteTextView.setSelection(0);
                            composerAutoCompleteTextView.A04("animate this");
                            composerAutoCompleteTextView.setSelection(composerAutoCompleteTextView.length());
                        }
                    }
                    User A02 = 17h.A00(r9.A1Z).A02(r3.A0U);
                    if (A02 != null) {
                        str = AnonymousClass50n.A08(A02);
                    } else {
                        str = "";
                    }
                    0qQ.A0B(str, 0);
                    Iterator it = r22.A00.iterator();
                    while (true) {
                        obj = null;
                        if (!it.hasNext()) {
                            break;
                        }
                        obj = it.next();
                        AnonymousClass78N r16 = (AnonymousClass78N) obj;
                        if ((r16 instanceof AnonymousClass78Z) && (r1 = (AnonymousClass78Z) r16) != null && r1.shouldPrependOnReply(str, njm)) {
                            break;
                        }
                    }
                    if (!(!(obj instanceof AnonymousClass78R) || (r2 = (AnonymousClass78R) obj) == null || (createCommandData = r2.createCommandData()) == null)) {
                        createCommandData.A00 = true;
                        r9.A0b.A05(createCommandData);
                    }
                }
                r5.A09 = oHv2;
                r5.A03.setVisibility(0);
                r5.A03.measure(View.MeasureSpec.makeMeasureSpec(0nA.A09(context), SN3.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(0, 0));
                r5.A01(r18);
                C294975nL A01 = C294975nL.A01(r5.A03, 0);
                A01.A0G();
                C294975nL A0F = A01.A0F(true);
                A0F.A0T((float) r5.A03.getMeasuredHeight(), 0.0f);
                A0F.A04 = 0;
                A0F.A0H();
                C329067Hl.A0Z(r6);
            }
        }
    }

    public final void A02(MessageIdentifier messageIdentifier) {
        C329067Hl A06 = AnonymousClass9H7.A06(this.A00);
        DirectThreadKey A09 = C329067Hl.A09(A06);
        if (A09 != null) {
            1NY A04 = C71151OeJ.A04(A06.A1Z, A09, messageIdentifier, HZX.A00(), new ArrayList());
            A04.A0R(NHZ.class, OQJ.class);
            1ES.A03(A04.A0M());
            C310336ap r2 = new C310336ap();
            r2.A0D = A06.A1R.getString(2131973637);
            r2.A06();
            1xC.A01.A00(new AnonymousClass3GP(r2.A00()));
        }
    }

    public final void ABG() {
        C329067Hl A06 = AnonymousClass9H7.A06(this.A00);
        A06.A1G = A06.A1U();
        C294975nL A002 = C294975nL.A00(A06.A07);
        A002.A0G();
        A002.A0T(0.0f, (float) A06.A07.getHeight());
        C294975nL A0A = A002.A0A();
        A0A.A05 = new Ag1(A06);
        A0A.A0H();
    }

    public final void CLU() {
        AnonymousClass9H7.A06(this.A00).A16();
    }

    public final boolean CW1() {
        return AnonymousClass9H7.A06(this.A00).A15;
    }

    public final void Euf() {
        AnonymousClass9H7.A06(this.A00).A1D();
    }
}
