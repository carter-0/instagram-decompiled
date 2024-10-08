package X;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.android.R;
import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.Mec  reason: case insensitive filesystem */
public final class C66894Mec extends C232222tE {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final AnonymousClass7VW A03;
    public final AnonymousClass9HC A04;
    public final AnonymousClass7L2 A05;
    public final AnonymousClass0eM A06 = C73920Pm0.A01(this, 7);

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C67977My1(DbT.A0D(layoutInflater, viewGroup, R.layout.thread_message_typing_indicator, false), this.A02);
    }

    public static final void A00(C67977My1 my1) {
        C70725OHu oHu = (C70725OHu) my1.A01.getValue();
        View findViewById = oHu.A01.findViewById(R.id.ai_agent_layout);
        if (findViewById != null) {
            ((C226472gs) oHu.A06.getValue()).pause();
            ViewPropertyAnimator viewPropertyAnimator = oHu.A00;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
            oHu.A00 = null;
            ((ShimmerFrameLayout) oHu.A05.getValue()).A03();
            findViewById.setVisibility(8);
        }
    }

    public static final void A01(C67977My1 my1) {
        C70720OHp oHp = (C70720OHp) my1.A02.getValue();
        View findViewById = oHp.A01.findViewById(R.id.default_layout);
        if (findViewById != null) {
            AnonymousClass7TE.A0c(oHp.A03).setOnClickListener((View.OnClickListener) null);
            ((Animator) oHp.A02.getValue()).cancel();
            OKO oko = oHp.A00;
            if (oko != null) {
                if (oko instanceof C68883NaL) {
                    ((C68883NaL) oko).A00.stop();
                } else {
                    AnonymousClass61R r0 = ((C68884NaM) oko).A00;
                    if (r0 != null) {
                        r0.stop();
                    }
                }
            }
            findViewById.setVisibility(8);
        }
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r11, C249703kE r12) {
        int i;
        AnonymousClass0eM r0;
        C330807Oi r112 = (C330807Oi) r11;
        C67977My1 my1 = (C67977My1) r12;
        boolean A1U = AnonymousClass7TF.A1U(0, r112, my1);
        boolean z = r112.A06;
        my1.A00 = z;
        Integer num = r112.A04;
        if (num == null) {
            A00(my1);
            C70720OHp oHp = (C70720OHp) my1.A02.getValue();
            View view = oHp.A01;
            DbY.A10(view, R.id.default_layout_stub);
            boolean z2 = false;
            AnonymousClass7TF.A0G(view, R.id.default_layout).setVisibility(0);
            boolean A1W = AnonymousClass7TF.A1W(r112.A03.A01, IGAIAgentType.A04);
            AnonymousClass0eM r02 = this.A04.A0M;
            if (!A1W || !AnonymousClass7TF.A1Z(r02)) {
                r0 = oHp.A06;
            } else {
                r0 = oHp.A07;
            }
            OKO oko = (OKO) r0.getValue();
            oHp.A00 = oko;
            if (oko != null) {
                oko.A00((ImageView) oHp.A05.getValue());
            }
            int i2 = r112.A01;
            if (i2 == 0) {
                z2 = true;
            } else {
                AnonymousClass0eM r1 = oHp.A04;
                if (((Animator) r1.getValue()).isRunning()) {
                    ((Animator) r1.getValue()).cancel();
                    AnonymousClass0eM r2 = oHp.A03;
                    AnonymousClass7TE.A0c(r2).setScaleX(1.0f);
                    AnonymousClass7TE.A0c(r2).setScaleY(1.0f);
                }
            }
            AnonymousClass0eM r22 = oHp.A03;
            View A0c = AnonymousClass7TE.A0c(r22);
            int i3 = 8;
            if (z2) {
                i3 = 0;
            }
            A0c.setVisibility(i3);
            AnonymousClass0eM r4 = oHp.A05;
            View A0c2 = AnonymousClass7TE.A0c(r4);
            Context context = this.A00;
            AnonymousClass7L2 r13 = this.A05;
            Drawable A0D = JTO.A0D(this.A06);
            AnonymousClass7FB.A05(context, A0D, r13, z);
            A0c2.setBackground(A0D);
            if (C66582MXn.A09(r22) == 0) {
                ((Animator) oHp.A02.getValue()).start();
            }
            OKO oko2 = oHp.A00;
            if (oko2 != null) {
                if (oko2 instanceof C68883NaL) {
                    ((C68883NaL) oko2).A00.start();
                } else {
                    AnonymousClass61R r03 = ((C68884NaM) oko2).A00;
                    if (r03 != null) {
                        r03.EFK();
                        r03.E2p();
                    }
                }
            }
            int dimensionPixelSize = DbU.A05(AnonymousClass7TE.A0c(r22)).getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material);
            if (i2 == 0) {
                ImageUrl imageUrl = r112.A02;
                if (imageUrl != null) {
                    C66580MXl.A0R(r22).setUrl(imageUrl, this.A01);
                } else {
                    C66580MXl.A0R(r22).A09();
                }
                C71408Ok7.A00(AnonymousClass7TE.A0c(r22), 39, this, r112);
                0nA.A0d(AnonymousClass7TE.A0c(r22), dimensionPixelSize);
                dimensionPixelSize = DbU.A05(AnonymousClass7TE.A0c(r4)).getDimensionPixelSize(R.dimen.action_button_settings_height);
            }
            0nA.A0d(AnonymousClass7TE.A0c(r4), dimensionPixelSize);
            DbW.A1R(r22, i2);
            return;
        }
        A01(my1);
        C70725OHu oHu = (C70725OHu) my1.A01.getValue();
        View view2 = oHu.A01;
        DbY.A10(view2, R.id.ai_agent_layout_stub);
        Dbb.A0t(view2, R.id.ai_agent_layout, 0);
        AnonymousClass0eM r8 = oHu.A04;
        View A0c3 = AnonymousClass7TE.A0c(r8);
        Context context2 = this.A00;
        AnonymousClass7L2 r23 = this.A05;
        Drawable A0D2 = JTO.A0D(this.A06);
        AnonymousClass7FB.A05(context2, A0D2, r23, z);
        A0c3.setBackground(A0D2);
        0nA.A0d(AnonymousClass7TE.A0c(r8), DbU.A05(AnonymousClass7TE.A0c(r8)).getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material));
        int intValue = num.intValue();
        if (intValue != 2) {
            if (!(intValue == -100 || intValue == A1U || intValue == 3 || intValue == 4)) {
                if (intValue == 5) {
                    i = 2131958551;
                } else if (intValue == 6) {
                    i = 2131958549;
                } else if (intValue == 7) {
                    i = 2131958548;
                }
                Integer valueOf = Integer.valueOf(i);
                if (valueOf != null) {
                    AnonymousClass0eM r3 = oHu.A05;
                    DbW.A1R(r3, 0);
                    AnonymousClass0eM r04 = oHu.A07;
                    DbT.A18(AnonymousClass7TE.A0c(r04).getContext(), JTO.A0I(r04), valueOf.intValue());
                    ((ShimmerFrameLayout) r3.getValue()).A02();
                }
            }
            AnonymousClass0eM r14 = oHu.A05;
            ((ShimmerFrameLayout) r14.getValue()).A03();
            C51969G9p.A1M(r14.getValue());
        }
        AnonymousClass0eM r32 = oHu.A06;
        if (!((C226472gs) r32.getValue()).isPlaying()) {
            AnonymousClass0eM r24 = oHu.A08;
            AnonymousClass7TH.A06(r24).setScaleX(0.0f);
            AnonymousClass7TH.A06(r24).setScaleY(0.0f);
            ViewPropertyAnimator A0E = C66581MXm.A0E(AnonymousClass7TH.A06(r24).animate().setStartDelay(100).setDuration(200), 1.0f);
            oHu.A00 = A0E;
            if (A0E != null) {
                A0E.start();
            }
            ((C226472gs) r32.getValue()).E2p();
        }
        AnonymousClass5D7 r7 = (AnonymousClass5D7) oHu.A03.getValue();
        Collection<C70688OGj> values = r7.A02.values();
        ArrayList A0r = AnonymousClass7TG.A0r(values);
        for (C70688OGj oGj : values) {
            AnonymousClass7TF.A1M(A0r, oGj.A02);
        }
        Iterator it = A0r.iterator();
        while (it.hasNext()) {
            r7.A01.markerPoint(814299525, AnonymousClass7TG.A0F(it), "typing_status_updated", String.valueOf(intValue));
        }
    }

    public final Class modelClass() {
        return C330807Oi.class;
    }

    public final /* bridge */ /* synthetic */ void unbind(C249703kE r2) {
        C67977My1 my1 = (C67977My1) r2;
        0qQ.A0B(my1, 0);
        A01(my1);
        A00(my1);
    }

    public C66894Mec(Context context, AnonymousClass0iw r3, UserSession userSession, AnonymousClass7VW r5, AnonymousClass9HC r6, AnonymousClass7L2 r7) {
        this.A02 = userSession;
        this.A00 = context;
        this.A01 = r3;
        this.A05 = r7;
        this.A04 = r6;
        this.A03 = r5;
    }
}
