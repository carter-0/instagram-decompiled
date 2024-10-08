package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.instagram.android.R;

/* renamed from: X.8Qd  reason: invalid class name and case insensitive filesystem */
public final class C355478Qd implements C355488Qe {
    public FrameLayout A00;
    public FrameLayout A01;
    public B26 A02;
    public boolean A03;
    public boolean A04;
    public final 2cs A05;
    public final 2cs A06;
    public final C252063oV A07;
    public final Animation A08;
    public final Animation A09;
    public final boolean A0A;

    public C355478Qd(ViewStub viewStub, boolean z) {
        0qQ.A0B(viewStub, 1);
        this.A07 = 2b1.A01(viewStub, false, false);
        Context context = viewStub.getContext();
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.item_menu_enter_new);
        0qQ.A07(loadAnimation);
        this.A08 = loadAnimation;
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.item_menu_exit_new);
        0qQ.A07(loadAnimation2);
        this.A09 = loadAnimation2;
        loadAnimation2.setAnimationListener(new C355498Qf(this));
        2cs A022 = C61340me.A00().A02();
        A022.A06 = true;
        A022.A0A(new C355508Qg(this));
        A022.A08(1.0d, true);
        this.A06 = A022;
        2cs A023 = C61340me.A00().A02();
        A023.A06 = true;
        A023.A0A(new C355518Qh(this));
        A023.A08(1.0d, true);
        this.A05 = A023;
        this.A0A = z;
    }

    private final View A00() {
        C252063oV r1 = this.A07;
        boolean CVM = r1.CVM();
        View view = r1.getView();
        if (!CVM) {
            View requireViewById = view.requireViewById(R.id.duplicate_icon);
            0qQ.A07(requireViewById);
            int i = 8;
            if (this.A0A) {
                i = 0;
            }
            requireViewById.setVisibility(i);
            FrameLayout frameLayout = (FrameLayout) requireViewById.requireViewById(R.id.menu_item);
            ((ImageView) frameLayout.requireViewById(R.id.menu_item_icon)).setImageResource(R.drawable.gallery_multi_select_icon);
            AnonymousClass3NG r12 = new AnonymousClass3NG(frameLayout);
            r12.A07 = true;
            r12.A04 = new C386249kI(this);
            Integer num = AnonymousClass05K.A01;
            r12.A05 = num;
            r12.A00();
            this.A00 = frameLayout;
            Context context = view.getContext();
            frameLayout.setContentDescription(context.getString(2131961063));
            View requireViewById2 = view.requireViewById(R.id.trash_icon);
            0qQ.A07(requireViewById2);
            FrameLayout frameLayout2 = (FrameLayout) requireViewById2.requireViewById(R.id.menu_item);
            ((ImageView) frameLayout2.requireViewById(R.id.menu_item_icon)).setImageResource(R.drawable.instagram_delete_pano_outline_24);
            AnonymousClass3NG r13 = new AnonymousClass3NG(frameLayout2);
            r13.A07 = true;
            r13.A04 = new C386259kJ(this);
            r13.A05 = num;
            r13.A00();
            this.A01 = frameLayout2;
            frameLayout2.setContentDescription(context.getString(2131972001));
        }
        return view;
    }

    public final boolean Cc6() {
        if (this.A07.CFV() == 0) {
            return true;
        }
        return false;
    }

    public final boolean CLA() {
        if (!Cc6()) {
            return false;
        }
        A00().startAnimation(this.A09);
        return true;
    }

    public final void Etp(View view, B26 b26, int i, boolean z) {
        if (!Cc6()) {
            this.A02 = b26;
            A00().setVisibility(0);
            A00().startAnimation(this.A08);
        }
    }
}
