package X;

import android.graphics.drawable.LayerDrawable;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* renamed from: X.7ES  reason: invalid class name */
public final class AnonymousClass7ES implements C328007Db {
    public LayerDrawable A00;
    public LayerDrawable A01;
    public C376679Ix A02;
    public IgSimpleImageView A03;
    public IgSimpleImageView A04;
    public IgdsMediaButton A05;
    public final UserSession A06;
    public final C252063oV A07;
    public final C331847Sp A08;
    public final C332867Wr A09;

    public final void A01(C376679Ix r7) {
        String str;
        if (!0qQ.A0K(this.A02, r7)) {
            this.A02 = r7;
            this.A07.setVisibility(0);
            IgSimpleImageView igSimpleImageView = this.A04;
            if (igSimpleImageView == null) {
                str = "thumbsUpPill";
            } else {
                igSimpleImageView.setVisibility(0);
                IgSimpleImageView igSimpleImageView2 = this.A03;
                if (igSimpleImageView2 == null) {
                    str = "thumbsDownPill";
                } else {
                    igSimpleImageView2.setVisibility(0);
                    IgdsMediaButton igdsMediaButton = this.A05;
                    if (igdsMediaButton != null) {
                        igdsMediaButton.setVisibility(8);
                        IgSimpleImageView igSimpleImageView3 = this.A04;
                        str = "thumbsUpPill";
                        if (igSimpleImageView3 != null) {
                            AnonymousClass0fU.A00(new OiI(r7, this), igSimpleImageView3);
                            IgSimpleImageView igSimpleImageView4 = this.A04;
                            if (igSimpleImageView4 != null) {
                                int i = r7.A01;
                                igSimpleImageView4.setColorFilter(i);
                                LayerDrawable layerDrawable = this.A01;
                                if (layerDrawable == null) {
                                    str = "thumbsUpPillDrawable";
                                } else {
                                    int i2 = r7.A02;
                                    layerDrawable.findDrawableByLayerId(R.id.message_reactions_pill_background_layer).setColorFilter(AnonymousClass37O.A00(i2));
                                    IgSimpleImageView igSimpleImageView5 = this.A03;
                                    str = "thumbsDownPill";
                                    if (igSimpleImageView5 != null) {
                                        AnonymousClass0fU.A00(new C71312OiJ(r7, this), igSimpleImageView5);
                                        IgSimpleImageView igSimpleImageView6 = this.A03;
                                        if (igSimpleImageView6 != null) {
                                            igSimpleImageView6.setColorFilter(i);
                                            LayerDrawable layerDrawable2 = this.A00;
                                            if (layerDrawable2 == null) {
                                                str = "thumbsDownPillDrawable";
                                            } else {
                                                layerDrawable2.findDrawableByLayerId(R.id.message_reactions_pill_background_layer).setColorFilter(AnonymousClass37O.A00(i2));
                                                IgdsMediaButton igdsMediaButton2 = this.A05;
                                                if (igdsMediaButton2 != null) {
                                                    AnonymousClass0fU.A00(new C71313OiK(r7, this), igdsMediaButton2);
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    str = "regenerateButton";
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static final void A00(C376679Ix r2, AnonymousClass7ES r3) {
        String str;
        if (r3.A09.AFj((DirectMessageIdentifier) r2.A03)) {
            IgSimpleImageView igSimpleImageView = r3.A04;
            if (igSimpleImageView == null) {
                str = "thumbsUpPill";
            } else {
                igSimpleImageView.setVisibility(8);
                IgSimpleImageView igSimpleImageView2 = r3.A03;
                if (igSimpleImageView2 == null) {
                    str = "thumbsDownPill";
                } else {
                    igSimpleImageView2.setVisibility(8);
                    IgdsMediaButton igdsMediaButton = r3.A05;
                    if (igdsMediaButton == null) {
                        str = "regenerateButton";
                    } else {
                        igdsMediaButton.setVisibility(0);
                        return;
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        r3.A07.setVisibility(8);
    }

    public final View BJd() {
        return this.A07.getView();
    }

    public AnonymousClass7ES(UserSession userSession, C252063oV r3, C332867Wr r4) {
        this.A07 = r3;
        this.A09 = r4;
        this.A06 = userSession;
        this.A08 = new C331847Sp(userSession);
        r3.EeU(new AnonymousClass7ET(this));
    }
}
