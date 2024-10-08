package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.reels.ui.views.reelavatar.RecyclerReelAvatarView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.3Nw  reason: invalid class name and case insensitive filesystem */
public final class C241103Nw extends C249703kE implements C241113Nx {
    public int A00;
    public ImageView A01;
    public AnonymousClass3BT A02;
    public AnonymousClass5BD A03;
    public C294545md A04;
    public C316236lK A05;
    public boolean A06 = false;
    public final Context A07;
    public final View A08;
    public final View A09;
    public final ViewStub A0A;
    public final IgTextView A0B;
    public final IgImageView A0C;
    public final C71662eb A0D;
    public final C252063oV A0E;
    public final AnonymousClass3N8 A0F;
    public final AnonymousClass3N6 A0G;
    public final C69058Ndv A0H;
    public final RecyclerReelAvatarView A0I;
    public final RoundedCornerFrameLayout A0J;

    public final boolean EtJ() {
        return true;
    }

    public final AnonymousClass5BD A00() {
        AnonymousClass5BD r1 = this.A03;
        if (r1 != null) {
            return r1;
        }
        AnonymousClass5BD r12 = new AnonymousClass5BD(this.A0A.inflate());
        this.A03 = r12;
        return r12;
    }

    /* renamed from: AeG */
    public final RectF AhX() {
        View AeY;
        AnonymousClass3BT r0 = this.A02;
        if (r0 == null || !r0.A03()) {
            AeY = AeY();
        } else {
            AeY = A00().A02;
        }
        return 0nA.A0F(AeY);
    }

    public final View AeH() {
        return this.A0G.A00();
    }

    public final View AeY() {
        return this.A0I.getHolder().A00();
    }

    public final View B8N() {
        return this.A0J;
    }

    public final RectF BG0() {
        return 0nA.A0F(this.A0J);
    }

    public final View BkN() {
        return this.itemView;
    }

    public final String Bkc() {
        return this.A0G.A01;
    }

    public final GradientSpinner Bkt() {
        return this.A0I.getHolder().A02();
    }

    public final void CI9(float f) {
        float f2 = 1.0f - f;
        this.A0G.A00().setAlpha(f2);
        this.A08.setAlpha(f2);
        this.A0C.setAlpha(0.0f);
    }

    public final void CLE() {
        View AeY;
        AnonymousClass3BT r0 = this.A02;
        if (r0 == null || !r0.A03()) {
            AeY = AeY();
        } else {
            AeY = A00().A02;
        }
        AeY.setVisibility(4);
    }

    public final void Ei5(AnonymousClass6VJ r2) {
        this.A0G.A00 = r2;
    }

    public final void Eu3(AnonymousClass0iw r3) {
        View AeY;
        AnonymousClass3BT r0 = this.A02;
        if (r0 == null || !r0.A03()) {
            AeY = AeY();
        } else {
            AeY = A00().A02;
        }
        AeY.setVisibility(0);
    }

    public C241103Nw(View view, boolean z) {
        super(view);
        Context context = view.getContext();
        this.A07 = context;
        RecyclerReelAvatarView requireViewById = view.requireViewById(R.id.avatar_view);
        this.A0I = requireViewById;
        if (z) {
            C69058Ndv ndv = new C69058Ndv(context, view.getResources(), (ViewStub) view.requireViewById(R.id.story_item_header_stub));
            this.A0H = ndv;
            this.A0F = ndv;
            requireViewById.setVisibility(8);
        } else {
            this.A0F = new AnonymousClass3N7(view);
        }
        this.A0G = new AnonymousClass3N6(view);
        this.A0C = view.requireViewById(R.id.background_content);
        this.A08 = view.requireViewById(R.id.background_content_bottom_black_gradient);
        this.A09 = view.requireViewById(R.id.background_content_top_black_gradient);
        RoundedCornerFrameLayout roundedCornerFrameLayout = (RoundedCornerFrameLayout) view.requireViewById(R.id.in_feed_item_container);
        this.A0J = roundedCornerFrameLayout;
        C71662eb r1 = new C71662eb((ViewStub) view.findViewById(R.id.background_media_gating_view_stub));
        this.A0D = r1;
        r1.A02 = new AnonymousClass4C8(this);
        this.A0A = (ViewStub) view.requireViewById(R.id.livewith_avatar_stub);
        AnonymousClass0fU.A00(new AnonymousClass4C9(this), roundedCornerFrameLayout);
        roundedCornerFrameLayout.setOnLongClickListener(new AnonymousClass4CA(this));
        this.A0B = view.requireViewById(R.id.username);
        this.A0E = 2b1.A01(view.requireViewById(R.id.story_item_like_button_stub), false, false);
    }
}
