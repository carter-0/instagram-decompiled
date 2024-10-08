package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.PDn  reason: case insensitive filesystem */
public final class C72634PDn implements C74482Pvc {
    public final /* synthetic */ C71085Ob8 A00;

    public final void DBp(String str, int i) {
        String str2;
        C71085Ob8 ob8 = this.A00;
        if (ob8.A0B) {
            C71091OcD ocD = ob8.A08;
            if (ocD == null) {
                0qQ.A0F("reactionsTrayController");
                throw AnonymousClass00P.createAndThrow();
            }
            ocD.A06(i);
            IgTextView igTextView = ob8.A06;
            if (i == 0) {
                if (igTextView != null) {
                    igTextView.setVisibility(0);
                }
                C71085Ob8.A02(ob8, str);
            } else {
                AnonymousClass7TH.A0R(igTextView);
            }
            DirectThreadKey A04 = C66647MaG.A04(ob8.A0T);
            if (ob8.A0H == 29 && A04 != null) {
                C313756gx A002 = C313746gw.A00(ob8.A0Q);
                int i2 = ob8.A0E;
                String str3 = A04.A00;
                String str4 = A04.A01;
                boolean A1Q = AnonymousClass7TF.A1Q(i);
                1Ln A0J = DbT.A0J(A002);
                if (DbT.A1Y(A0J)) {
                    DbW.A17(A0J, A002);
                    DbV.A1M(A0J, "reaction_selected");
                    A0J.A0p("reaction_list");
                    A0J.A0i(DbZ.A0b(A0J, "reaction_sheet", str3, str4, i2));
                    if (A1Q) {
                        str2 = "True";
                    } else {
                        str2 = "False";
                    }
                    A0J.A0w(AnonymousClass7TF.A0w("is_double_tap", str2));
                    A0J.A0v(A002.A01);
                    A0J.Cgf();
                    return;
                }
                return;
            }
            return;
        }
        ob8.A0S.A00(str, NetInfoModule.CONNECTION_TYPE_NONE, "emoji_tray");
    }

    public final void DsT(View view) {
        C71085Ob8 ob8 = this.A00;
        if (ob8.A0C) {
            ob8.A0C = false;
            AnimatorSet animatorSet = ob8.A03;
            if (animatorSet != null) {
                animatorSet.cancel();
                ob8.A0K.cancel();
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator duration = ObjectAnimator.ofFloat(view, "translationY", new float[]{0.0f}).setDuration(200);
                0qQ.A07(duration);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleY", new float[]{view.getScaleY(), 1.0f});
                ofFloat.setDuration(200);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleX", new float[]{view.getScaleX(), 1.0f});
                ofFloat2.setDuration(200);
                view.setRotation(0.0f);
                animatorSet2.playTogether(new Animator[]{duration, ofFloat2, ofFloat});
                animatorSet2.start();
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void Dsf(String str, View view) {
        C71085Ob8 ob8 = this.A00;
        if (!ob8.A0C && !ob8.A0B) {
            View view2 = view;
            if (view2.getParent() != null) {
                C70140Nxu.A00(C3019160o.A00(view2));
            }
            ob8.A03 = new AnimatorSet();
            ObjectAnimator duration = ObjectAnimator.ofFloat(view2, "translationY", new float[]{(float) (-ob8.A0N.requireViewById(R.id.emoji_reaction_container).getHeight())}).setDuration(200);
            0qQ.A07(duration);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "rotation", new float[]{-4.0f, 4.0f});
            ofFloat.setStartDelay(200);
            ofFloat.setDuration(100);
            int i = ob8.A0F;
            ofFloat.setRepeatCount(i / 100);
            ofFloat.setRepeatMode(2);
            ofFloat.addListener(new C71158OeX(view2, ob8, str, 1));
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, "scaleY", new float[]{1.0f, 1.2f});
            ofFloat2.setDuration(200);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view2, "scaleX", new float[]{1.0f, 1.2f});
            ofFloat3.setDuration(200);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view2, "scaleY", new float[]{1.2f, 1.5f});
            ofFloat4.setStartDelay(200);
            long j = (long) i;
            ofFloat4.setDuration(j);
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view2, "scaleX", new float[]{1.2f, 1.5f});
            ofFloat5.setStartDelay(200);
            ofFloat5.setDuration(j);
            AnimatorSet animatorSet = ob8.A03;
            if (animatorSet != null) {
                animatorSet.playTogether(new Animator[]{duration, ofFloat3, ofFloat2, ofFloat, ofFloat5, ofFloat4});
            }
            AnimatorSet animatorSet2 = ob8.A03;
            if (animatorSet2 != null) {
                animatorSet2.setStartDelay(200);
            }
            AnimatorSet animatorSet3 = ob8.A03;
            if (animatorSet3 != null) {
                animatorSet3.start();
            }
            ob8.A0C = true;
        }
    }

    public C72634PDn(C71085Ob8 ob8) {
        this.A00 = ob8;
    }

    public final void D7W() {
        int height;
        String str;
        C71085Ob8 ob8 = this.A00;
        FrameLayout frameLayout = ob8.A0N;
        ob8.A00 = frameLayout.getTranslationY();
        UserSession userSession = ob8.A0Q;
        boolean A06 = 182.A06(0Tu.A05, userSession, 36326816209713136L);
        float f = 0.2f;
        if (A06) {
            f = 0.15f;
        }
        FrameLayout frameLayout2 = ob8.A0M;
        ob8.A01 = ((float) (frameLayout2.getHeight() - AnonymousClass2uJ.A00)) * f;
        View view = ob8.A04;
        if (view == null) {
            view = LayoutInflater.from(ob8.A0I).inflate(R.layout.customize_reactions_label_container, frameLayout2, false);
            ob8.A06 = DbT.A0a(view, R.id.double_tap_label);
            frameLayout2.addView(view);
            ob8.A04 = view;
        }
        view.setAlpha(0.0f);
        IgTextView igTextView = ob8.A06;
        if (igTextView != null) {
            igTextView.setVisibility(0);
        }
        C71091OcD ocD = ob8.A08;
        if (ocD == null) {
            0qQ.A0F("reactionsTrayController");
            throw AnonymousClass00P.createAndThrow();
        }
        C71085Ob8.A02(ob8, AnonymousClass7TE.A19(ocD.A03(), 0));
        C252063oV r7 = ob8.A0R;
        boolean CVM = r7.CVM();
        View view2 = r7.getView();
        r7.setVisibility(0);
        if (!CVM) {
            ImageView A0J = DbX.A0J(view2, R.id.reset_icon);
            Context context = ob8.A0I;
            A0J.setColorFilter(2Yu.A0F(context, R.attr.textColorOnMedia));
            C71397Ojw.A00(A0J, 69, ob8);
            ImageView A0J2 = DbX.A0J(view2, R.id.save_icon);
            A0J2.setColorFilter(2Yu.A0F(context, R.attr.textColorOnMedia));
            C71397Ojw.A00(A0J2, 70, ob8);
        }
        View view3 = ob8.A0L;
        view3.setVisibility(0);
        ob8.A0D = false;
        ViewGroup viewGroup = ob8.A05;
        if (viewGroup != null) {
            C71085Ob8.A01(viewGroup, ob8, 0);
        }
        String str2 = null;
        ocD.A06(0);
        C71870OsD osD = ob8.A0S.A00;
        C74501Pvv pvv = osD.A0E;
        if (pvv != null) {
            pvv.DCK();
            PopupWindow popupWindow = osD.A0C;
            if (!(popupWindow == null || popupWindow.getContentView() == null)) {
                popupWindow.getContentView().setVisibility(4);
                popupWindow.setTouchable(false);
                popupWindow.update();
            }
        }
        DirectThreadKey A04 = C66647MaG.A04(ob8.A0T);
        if (A06) {
            height = -2;
        } else {
            height = ((int) (((float) frameLayout2.getHeight()) * 0.55f)) - AnonymousClass2uJ.A00;
        }
        int i = ob8.A0G;
        int i2 = ob8.A0H;
        if (A04 != null) {
            str = A04.A00;
            str2 = A04.A01;
        } else {
            str = null;
        }
        int i3 = ob8.A0E;
        List list = ob8.A0V;
        if (list == null) {
            list = AnonymousClass7TE.A1C();
        }
        NKM A002 = C70139Nxt.A00(userSession, str, str2, list, height, i, i2, i3, false, false);
        View view4 = ob8.A04;
        if (view4 != null) {
            view4.setVisibility(8);
            r7.setVisibility(8);
            C331127Pr A0e = DbX.A0e(userSession, A06);
            A0e.A1O = false;
            A0e.A0k = false;
            A0e.A0q = true;
            A0e.A0X = new NgD(ob8, 2);
            A0e.A0T = new C72942PQa(ob8, A002);
            Context context2 = ob8.A0I;
            A0e.A06 = 2Yu.A0F(context2, R.attr.igds_color_elevated_background);
            if (A06) {
                A0e.A03 = 0.65f;
            }
            ob8.A09 = A0e.A00();
            A002.A01 = new C72629PDi(ob8, 2);
            view3.setAlpha(1.0f);
            C71402Ok1.A00(view3, 0, ob8);
            C331157Pu r1 = ob8.A09;
            if (r1 != null) {
                C331157Pu.A00(context2, context2, A002, r1, ob8.A0U);
            }
            if (pvv != null) {
                pvv.DVv();
            }
            frameLayout.setVisibility(8);
            if (i2 == 29 && A04 != null) {
                C313746gw.A00(userSession).A0B(i3, A04.A00, A04.A01);
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void onDismiss() {
        C71870OsD.A03(this.A00.A0S.A00);
    }
}
