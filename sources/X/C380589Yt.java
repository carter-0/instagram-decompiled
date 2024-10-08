package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.model.shopping.ProductItemWithAR;
import com.instagram.ui.widget.shutterbutton.ShutterButton;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9Yt  reason: invalid class name and case insensitive filesystem */
public final class C380589Yt extends C249703kE {
    public ValueAnimator A00;
    public String A01;
    public 0sK A02;
    public boolean A03 = true;
    public final AnonymousClass2gO A04;
    public final UserSession A05;
    public final RoundedCornerImageView A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final int A0C;

    /* JADX WARNING: type inference failed for: r2v2, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    public C380589Yt(View view, UserSession userSession, int i) {
        super(view);
        this.A05 = userSession;
        this.A0C = i;
        0eO r3 = 0eO.A02;
        this.A09 = AnonymousClass0eN.A00(r3, new MMR(view, 3));
        this.A0A = AnonymousClass0eN.A00(r3, new MMR(this, 5));
        this.A0B = AnonymousClass0eN.A00(r3, new MMR(this, 6));
        this.A08 = AnonymousClass0eN.A00(r3, new C66291MMa(19, view, this));
        this.A07 = AnonymousClass0eN.A00(r3, new C66291MMa(18, view, this));
        this.A04 = new C40058APo(view, 4);
        ? r2 = (RoundedCornerImageView) view.requireViewById(R.id.clips_editor_item_add_transition_button);
        this.A06 = r2;
        Context context = r2.getContext();
        r2.setStrokeColor(AnonymousClass7TE.A0A(context));
        r2.setStrokeWidth((int) 0nA.A00(context, 4.0f));
        r2.setRadius(0nA.A00(context, 6.0f));
    }

    public final void A00() {
        AnonymousClass0eM r13 = this.A09;
        if (!((C252063oV) r13.getValue()).CVM()) {
            View A0Q = AnonymousClass7TG.A0Q(r13);
            int i = this.A0C;
            0nA.A0f(A0Q, i);
            AnonymousClass0eM r12 = this.A0B;
            ((ShutterButton) r12.getValue()).setInnerCircleAlpha(0.0f);
            Context context = this.itemView.getContext();
            0qQ.A0A(context);
            int A002 = AnonymousClass879.A00(context);
            float f = (float) A002;
            float f2 = (float) i;
            C342277oK r14 = new C342277oK(C342257oI.A00(f, f2 / 2.0f, 0nA.A04(context, 4), 0nA.A04(context, 36), 0nA.A04(context, 48)), f, f2, (float) context.getResources().getDimensionPixelSize(R.dimen.avatar_likes_container_width), 0.0f);
            AnonymousClass0eM r9 = this.A07;
            AnonymousClass876 r2 = (AnonymousClass876) r9.getValue();
            List<C391219sX> list = A2K.A00;
            ArrayList A0r = AnonymousClass7TG.A0r(list);
            for (C391219sX r0 : list) {
                AnonymousClass87G r10 = AnonymousClass87G.A0T;
                AnonymousClass87I r19 = AnonymousClass87I.CLIPS_TRANSITION;
                String str = r0.A02;
                A0r.add(new AnonymousClass87G(new AnonymousClass8YE(context.getDrawable(r0.A00), (CameraAREffect) null, r19, (ImageUrl) null, (ProductItemWithAR) null, (AnonymousClass8YF) null, context.getString(r0.A01), str)));
            }
            ArrayList A0U = 00k.A0U(A0r);
            AnonymousClass87G r02 = AnonymousClass87G.A0T;
            0qQ.A08(r02);
            A0U.add(0, r02);
            r2.A06(A0U);
            AnonymousClass8DT r142 = new AnonymousClass8DT(context, this.A05, new C40319AaE(context, new MMR(this, 4)), "clip_transition", false);
            r2.A04 = r142;
            C342277oK r03 = r2.A02;
            if (r03 != null) {
                r03.A00 = r142;
            }
            r2.A03 = new Aa0();
            r2.A02 = r14;
            r14.A00 = r142;
            AnonymousClass0eM r22 = this.A08;
            C3508886t r102 = (C3508886t) r22.getValue();
            r102.A01 = (AnonymousClass876) r9.getValue();
            AnonymousClass0eM r8 = this.A0A;
            r102.A00 = (ReboundViewPager) r8.getValue();
            r102.A05 = true;
            ReboundViewPager reboundViewPager = (ReboundViewPager) r8.getValue();
            if (0mk.A02(context)) {
                reboundViewPager.setLayoutDirection(0);
            }
            reboundViewPager.A0C = A002;
            reboundViewPager.A0M(4, false);
            reboundViewPager.setPageSpacing(0.0f);
            reboundViewPager.setScrollMode(AnonymousClass3TG.WHEEL_OF_FORTUNE);
            ((ReboundViewPager) r8.getValue()).A0J = r14;
            ReboundViewPager reboundViewPager2 = (ReboundViewPager) r8.getValue();
            reboundViewPager2.A0P((AnonymousClass4HF) r22.getValue());
            reboundViewPager2.A0N((AnonymousClass876) r9.getValue(), 0.0f);
            C342377oU r04 = new C342377oU(context, AnonymousClass7TE.A0c(r12), AnonymousClass7TE.A0c(r8), new C40312Aa3());
            AnonymousClass7TG.A0Q(r13).A00(r04.A02, r04.A01);
        }
    }
}
