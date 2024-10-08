package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextSwitcher;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.6j6  reason: invalid class name and case insensitive filesystem */
public final class C314946j6 implements C314016hW {
    public final UserSession A00;
    public final C273384mU A01;

    public C314946j6(UserSession userSession, C273384mU r3) {
        0qQ.A0B(userSession, 2);
        this.A01 = r3;
        this.A00 = userSession;
    }

    public final boolean Cn1(C255773uh r2, C250973mM r3, C309426Yf r4, float f) {
        return false;
    }

    public final void DaV(C255773uh r17, C250973mM r18, C309426Yf r19, float f) {
        C316006kx r1;
        C316136lA r10;
        View view;
        Handler handler;
        Runnable frZ;
        long j;
        View view2;
        C309426Yf r6 = r19;
        0qQ.A0B(r6, 2);
        if (((double) f) >= 0.02d && !r6.A15) {
            UserSession userSession = this.A00;
            if (AnonymousClass6YV.A00(userSession)) {
                r6.A15 = true;
                C313056fm r0 = ((ReelViewerFragment) this.A01).mViewPager;
                Object obj = null;
                if (!(r0 == null || (view2 = ((C313046fl) r0).A04.A0F) == null)) {
                    obj = view2.getTag();
                }
                if ((obj instanceof C316006kx) && (r1 = (C316006kx) obj) != null && (r10 = r1.A1e) != null) {
                    C252063oV r2 = r10.A1b;
                    C252063oV r12 = r10.A1d;
                    if (r2.CVM()) {
                        view = r2.getView();
                    } else if (r12.CVM()) {
                        view = r12.getView();
                    } else {
                        return;
                    }
                    if (view != null) {
                        Context context = view.getContext();
                        0qQ.A07(context);
                        0Tu r8 = 0Tu.A05;
                        int i = 0;
                        if (((int) 182.A01(r8, userSession, 36609296208762715L)) == 1) {
                            IgTextView requireViewById = r10.A0x.requireViewById(R.id.composer_text);
                            0qQ.A07(requireViewById);
                            IgTextView igTextView = requireViewById;
                            View requireViewById2 = view.requireViewById(R.id.composer_reaction_animation_text);
                            0qQ.A07(requireViewById2);
                            TextSwitcher textSwitcher = (TextSwitcher) requireViewById2;
                            CharSequence text = igTextView.getText();
                            textSwitcher.setInAnimation(context, R.anim.text_none);
                            textSwitcher.setOutAnimation(context, R.anim.text_none);
                            textSwitcher.setText(text);
                            textSwitcher.setVisibility(0);
                            igTextView.setVisibility(8);
                            new Handler(Looper.getMainLooper()).postDelayed(new C51406Ftc(context, textSwitcher), 700);
                            do {
                                new Handler(Looper.getMainLooper()).postDelayed(new C51484Fus(context, textSwitcher, i), (((long) i) * 700) + 1000);
                                i++;
                            } while (i < 3);
                            new Handler(Looper.getMainLooper()).postDelayed(new C51485Fut(context, textSwitcher, text), 3100);
                            handler = new Handler(Looper.getMainLooper());
                            frZ = new C51407Ftd(textSwitcher, igTextView);
                            j = 3600;
                        } else {
                            if (((int) 182.A01(r8, userSession, 36609296208762715L)) == 2) {
                                View requireViewById3 = view.requireViewById(R.id.reaction_animation_above_toolbar_text);
                                0qQ.A07(requireViewById3);
                                TextSwitcher textSwitcher2 = (TextSwitcher) requireViewById3;
                                textSwitcher2.setVisibility(0);
                                new Handler(Looper.getMainLooper()).postDelayed(new C51279FrY(textSwitcher2), 500);
                                handler = new Handler(Looper.getMainLooper());
                                frZ = new C51280FrZ(textSwitcher2);
                                j = 1800;
                            }
                            0xa r3 = 1Au.A00(userSession).A01;
                            int i2 = r3.getInt("composer_reaction_animation_seen_count", 0) + 1;
                            0xY AR4 = r3.AR4();
                            AR4.E5Z("composer_reaction_animation_seen_count", i2);
                            AR4.apply();
                        }
                        handler.postDelayed(frZ, j);
                        0xa r32 = 1Au.A00(userSession).A01;
                        int i22 = r32.getInt("composer_reaction_animation_seen_count", 0) + 1;
                        0xY AR42 = r32.AR4();
                        AR42.E5Z("composer_reaction_animation_seen_count", i22);
                        AR42.apply();
                    }
                }
            }
        }
    }
}
