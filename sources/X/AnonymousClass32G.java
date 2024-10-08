package X;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ListView;
import androidx.fragment.app.FragmentActivity;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Deprecated;

@Deprecated(message = "Use IgListFragmentCompat instead!")
/* renamed from: X.32G  reason: invalid class name */
public abstract class AnonymousClass32G extends AnonymousClass32H implements AnonymousClass0iw, AnonymousClass4D6, AnonymousClass4DJ, AnonymousClass4DV, AnonymousClass4DK, C60660ix, AnonymousClass4DL, AnonymousClass4DP, AnonymousClass4DQ {
    public static final String __redex_internal_original_name = "IgListFragment";
    public Rect A00;
    public AnonymousClass378 A01;
    public C238133Ar A02;
    public final AnonymousClass2k1 A03 = new AnonymousClass2k1();
    public final C227622jd A04 = new C227622jd();
    public final C227632je A05 = new C227632je();

    public 0lg A0Y() {
        return (0lg) ((AnonymousClass32F) this).A0f.getValue();
    }

    public final void addFragmentVisibilityListener(C238693Db r2) {
        0qQ.A0B(r2, 0);
        this.A05.addFragmentVisibilityListener(r2);
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return C3253772d.A01(this, i2, z, false);
    }

    public void onSaveInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        Rect rect = this.A00;
        if (rect != null) {
            bundle.putParcelable(AnonymousClass4DH.KEY_CONTENT_INSETS, rect);
        }
        this.A04.A0A(bundle);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Rect rect;
        0qQ.A0B(view, 0);
        AnonymousClass32G.super.onViewCreated(view, bundle);
        C227622jd r3 = this.A04;
        r3.A0D(view, bundle);
        if (!(bundle == null || (rect = (Rect) bundle.getParcelable(AnonymousClass4DH.KEY_CONTENT_INSETS)) == null)) {
            this.A00 = rect;
        }
        A0a();
        if (AnonymousClass1YU.A00 != null) {
            FragmentActivity requireActivity = requireActivity();
            AtomicBoolean atomicBoolean = C238713Dd.A00;
            r3.A0E(new C238733Df(new C238723De(requireActivity)));
        }
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setTransitionGroup(true);
        }
    }

    public final void registerLifecycleListener(C252243on r2) {
        0qQ.A0B(r2, 0);
        this.A04.A0E(r2);
    }

    public final void removeFragmentVisibilityListener(C238693Db r2) {
        0qQ.A0B(r2, 0);
        this.A05.removeFragmentVisibilityListener(r2);
    }

    public final void unregisterLifecycleListener(C252243on r2) {
        0qQ.A0B(r2, 0);
        this.A04.A00.remove(r2);
    }

    public void A0W(Bundle bundle) {
        this.A04.A01();
        0lg A0Y = A0Y();
        if (A0Y != null) {
            2cc A002 = C71342cb.A00(A0Y);
            C3018560i r1 = A002.A01;
            if (r1 != null) {
                r1.A00 = getModuleName();
            }
            AnonymousClass378 r0 = new AnonymousClass378(this);
            r0.A01(A002);
            this.A01 = r0;
        }
    }

    public final ListView A0X() {
        View view;
        View view2 = this.mView;
        if (view2 != null) {
            view = view2.findViewById(16908298);
        } else {
            view = null;
        }
        if (view instanceof ListView) {
            return (ListView) view;
        }
        return null;
    }

    public final void A0a() {
        Rect rect;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View view = this.mView;
        if (view != null && (rect = this.A00) != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMargins(rect.left, rect.top, rect.right, rect.bottom);
            }
        }
    }

    public final void A0b(C227622jd r4) {
        C227622jd r2 = this.A04;
        Iterator it = r4.A00.iterator();
        while (it.hasNext()) {
            r2.A0E((C252243on) it.next());
        }
    }

    public final AnonymousClass378 getFragmentVisibilityDetector() {
        return this.A01;
    }

    public final String getModuleNameV2() {
        return this.A03.A00;
    }

    public final C238133Ar getScrollingViewProxy() {
        C238133Ar r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        0S7.A00(this);
        C238133Ar A002 = C238103Ao.A00(this.A04);
        this.A02 = A002;
        0qQ.A07(A002);
        return A002;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.A04.A08(i, i2, intent);
    }

    public final void onHiddenChanged(boolean z) {
        AnonymousClass378 r0 = this.A01;
        if (r0 != null) {
            r0.A00();
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.07Z, androidx.fragment.app.Fragment, X.32G] */
    public final void schedule(AnonymousClass11X r4) {
        if (r4 != null) {
            Context context = getContext();
            if (context != null) {
                1ES.A00(context, AnonymousClass07i.A00(this), r4);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public void A0Z() {
        requireActivity().getWindow().setBackgroundDrawable(new ColorDrawable(2Yu.A0F(getContext(), 16842801)));
    }

    public final Activity getRootActivity() {
        Context context = getContext();
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            Activity parent = activity.getParent();
            if (parent != null) {
                return parent;
            }
            return activity;
        }
        throw new RuntimeException("Fragment is not attached.");
    }

    public final Animator onCreateAnimator(int i, boolean z, int i2) {
        return C3253772d.A00(this, i2, z);
    }

    public void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-750489433);
        AnonymousClass32G.super.onDestroy();
        C305926Kc.A00(this);
        AnonymousClass0fD.A09(224989863, A022);
    }

    public void onDestroyView() {
        View view;
        int A022 = AnonymousClass0fD.A02(-1794341724);
        AnonymousClass32G.super.onDestroyView();
        this.A02 = null;
        if (A0Y() != null) {
            if (182.A06(0Tu.A05, A0Y(), 36311057974690219L) && (view = this.mView) != null) {
                C305926Kc.A01(view, Collections.singletonMap("endpoint", 002.A0T(getModuleName(), getClass().getName(), ':')));
            }
        }
        AnonymousClass0fD.A09(146603016, A022);
    }

    public void onResume() {
        int A022 = AnonymousClass0fD.A02(-514140793);
        AnonymousClass32G.super.onResume();
        A0Z();
        AnonymousClass0fD.A09(-48478314, A022);
    }

    public final void schedule(AnonymousClass11X r1, int i, int i2, boolean z, boolean z2) {
        schedule(r1);
    }
}
