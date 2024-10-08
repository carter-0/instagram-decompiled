package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;

public class AE5 {
    public View A00;
    public View A01;
    public ViewGroup A02;
    public ViewGroup A03;
    public ViewGroup A04;
    public IgTextView A05;
    public IgTextView A06;
    public C41840B2v A07;
    public IgdsButton A08;
    public IgdsButton A09;
    public final Context A0A;
    public final View A0B;
    public final UserSession A0C;
    public final boolean A0D;

    public static final void A00(View view, CharSequence charSequence) {
        if (charSequence != null) {
            view.setVisibility(0);
            if (view instanceof IgdsButton) {
                ((IgdsButton) view).setText(charSequence.toString());
            } else if (view instanceof IgTextView) {
                ((TextView) view).setText(charSequence);
            }
        } else {
            view.setVisibility(8);
        }
    }

    public final ViewGroup A01() {
        ViewGroup viewGroup = this.A02;
        if (viewGroup != null) {
            return viewGroup;
        }
        0qQ.A0F("bannerContainer");
        throw AnonymousClass00P.createAndThrow();
    }

    public final ViewGroup A02() {
        ViewGroup viewGroup = this.A03;
        if (viewGroup != null) {
            return viewGroup;
        }
        0qQ.A0F("ctaButtonContainer");
        throw AnonymousClass00P.createAndThrow();
    }

    public final ViewGroup A03() {
        ViewGroup viewGroup = this.A04;
        if (viewGroup != null) {
            return viewGroup;
        }
        0qQ.A0F("disabledComposerContainer");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A04() {
        if (this instanceof C388809oQ) {
            C388809oQ r4 = (C388809oQ) this;
            r4.A05();
            r4.A00 = (ViewStub) r4.A02().requireViewById(R.id.broadcast_chat_composer_social_context_stub);
            r4.A01 = new C70824OMw(r4.A02, AnonymousClass7TF.A0G(r4.A04, R.id.broadcast_channel_daily_prompts_persistence_banner), r4.A08);
            r4.A05.setAnimationListener(r4.A07);
            return;
        }
        A05();
    }

    public final void A05() {
        View view = this.A0B;
        ViewGroup viewGroup = (ViewGroup) view.requireViewById(R.id.broadcast_chat_banner_container);
        0qQ.A0B(viewGroup, 0);
        this.A02 = viewGroup;
        ViewGroup viewGroup2 = (ViewGroup) view.requireViewById(R.id.broadcast_chat_disabled_composer_container);
        0qQ.A0B(viewGroup2, 0);
        this.A04 = viewGroup2;
        IgTextView requireViewById = A03().requireViewById(R.id.broadcast_chat_disabled_composer_text);
        0qQ.A0B(requireViewById, 0);
        this.A05 = requireViewById;
        IgTextView requireViewById2 = view.requireViewById(R.id.broadcast_chat_footnote);
        0qQ.A0B(requireViewById2, 0);
        this.A06 = requireViewById2;
        ViewGroup viewGroup3 = (ViewGroup) view.requireViewById(R.id.broadcast_chat_cta_button_container);
        0qQ.A0B(viewGroup3, 0);
        this.A03 = viewGroup3;
        ViewGroup A022 = A02();
        boolean z = this.A0D;
        int i = R.id.broadcast_chat_composer_buttons_vertical_stub;
        if (z) {
            i = R.id.broadcast_chat_composer_buttons_horizontal_stub;
        }
        ((ViewStub) A022.requireViewById(i)).inflate();
        IgdsButton igdsButton = (IgdsButton) A02().requireViewById(R.id.broadcast_chat_cta_button);
        0qQ.A0B(igdsButton, 0);
        this.A08 = igdsButton;
        IgdsButton igdsButton2 = (IgdsButton) A02().requireViewById(R.id.broadcast_chat_secondary_button);
        0qQ.A0B(igdsButton2, 0);
        this.A09 = igdsButton2;
        View requireViewById3 = view.requireViewById(R.id.broadcast_chat_disabled_composer_divider);
        0qQ.A0B(requireViewById3, 0);
        this.A01 = requireViewById3;
        View requireViewById4 = view.requireViewById(R.id.broadcast_chat_composer_container_divider);
        0qQ.A0B(requireViewById4, 0);
        this.A00 = requireViewById4;
    }

    public final void A06(C41840B2v b2v) {
        String str;
        this.A07 = b2v;
        IgdsButton igdsButton = this.A08;
        if (igdsButton != null) {
            A00(igdsButton, b2v.AtC());
            IgdsButton igdsButton2 = this.A09;
            if (igdsButton2 != null) {
                A00(igdsButton2, b2v.BqX());
                IgTextView igTextView = this.A06;
                if (igTextView != null) {
                    A00(igTextView, b2v.B7G());
                    IgTextView igTextView2 = this.A05;
                    if (igTextView2 != null) {
                        A00(igTextView2, b2v.Axd());
                        IgdsButton igdsButton3 = this.A08;
                        if (igdsButton3 != null) {
                            AnonymousClass0fU.A00(new C71403Ok2(b2v, 48), igdsButton3);
                            IgdsButton igdsButton4 = this.A09;
                            if (igdsButton4 != null) {
                                AOX.A00(igdsButton4, 26, b2v);
                                return;
                            }
                        }
                    } else {
                        str = "disableComposerText";
                    }
                } else {
                    str = "footnote";
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            str = "secondaryButton";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        str = "ctaButton";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public void A07(AnonymousClass7L0 r3) {
        String str;
        View view = this.A01;
        if (view != null) {
            int i = r3.A08;
            view.setBackgroundColor(i);
            View view2 = this.A00;
            if (view2 != null) {
                view2.setBackgroundColor(i);
                IgTextView igTextView = this.A05;
                if (igTextView != null) {
                    int i2 = r3.A00;
                    igTextView.setTextColor(i2);
                    IgTextView igTextView2 = this.A06;
                    if (igTextView2 != null) {
                        igTextView2.setTextColor(i2);
                        return;
                    }
                    str = "footnote";
                } else {
                    str = "disableComposerText";
                }
            } else {
                str = "ctaButtonContainerRowDivider";
            }
        } else {
            str = "divider";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public AE5(Context context, View view, UserSession userSession, boolean z) {
        this.A0A = context;
        this.A0C = userSession;
        this.A0B = view;
        this.A0D = z;
    }
}
