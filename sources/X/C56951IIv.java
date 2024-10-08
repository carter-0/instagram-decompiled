package X;

import android.animation.StateListAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.facebook.litho.ComponentHost;

/* renamed from: X.IIv  reason: case insensitive filesystem */
public final class C56951IIv implements C253183qL {
    public final boolean Ete(Object obj, Object obj2, Object obj3, Object obj4) {
        return false;
    }

    public final /* synthetic */ String getDescription() {
        return V6I.A00(this);
    }

    public final /* bridge */ /* synthetic */ void FIN(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        ComponentHost componentHost = (C70682Ty) obj;
        0qQ.A0B(componentHost, 1);
        boolean z = componentHost instanceof ComponentHost;
        if (z) {
            componentHost.A0J = true;
        }
        componentHost.setVisibility(0);
        C244723be r0 = 2Uu.A0f;
        componentHost.setOnClickListener((View.OnClickListener) null);
        componentHost.setClickable(false);
        r0.A02(componentHost);
        r0.A01(componentHost);
        r0.A03(componentHost);
        ComponentHost componentHost2 = componentHost;
        if (z) {
            componentHost2.A0A = null;
        }
        componentHost.setId(-1);
        componentHost.setTag((Object) null);
        if (z) {
            componentHost2.A02 = null;
        }
        if (componentHost.getStateListAnimator() != null) {
            componentHost.getStateListAnimator().jumpToCurrentState();
            componentHost.setStateListAnimator((StateListAnimator) null);
        }
        componentHost.setElevation(0.0f);
        componentHost.setOutlineAmbientShadowColor(-16777216);
        componentHost.setOutlineSpotShadowColor(-16777216);
        componentHost.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        componentHost.setClipToOutline(false);
        componentHost.setClipChildren(true);
        componentHost.setContentDescription((CharSequence) null);
        componentHost.setTooltipText((CharSequence) null);
        componentHost.setScaleX(1.0f);
        componentHost.setScaleY(1.0f);
        componentHost.setAlpha(1.0f);
        componentHost.setRotation(0.0f);
        componentHost.setRotationX(0.0f);
        componentHost.setRotationY(0.0f);
        componentHost.setClickable(true);
        componentHost.setLongClickable(true);
        componentHost.setFocusable(false);
        componentHost.setEnabled(true);
        componentHost.setSelected(false);
        componentHost.setKeyboardNavigationCluster(false);
        componentHost.setImportantForAccessibility(0);
        C244723be.A00(componentHost);
        componentHost.setBackground((Drawable) null);
        componentHost.setForeground((Drawable) null);
        componentHost.setLayoutDirection(2);
        componentHost.setLayerType(0, (Paint) null);
        03v.A0H(componentHost, 0sn.A00);
        if (z) {
            ComponentHost componentHost3 = componentHost;
            componentHost3.A0J = false;
            componentHost3.A0M.A05();
            componentHost3.A0N.A05();
            componentHost3.A0L.A05();
            componentHost3.A05 = null;
            componentHost3.A04 = null;
            componentHost3.A03 = null;
            componentHost3.A0C = null;
            componentHost3.A02 = null;
            componentHost3.A0K = new int[0];
            componentHost3.A0H = false;
            componentHost3.A0G = false;
            componentHost3.A0E = false;
            componentHost3.A06 = null;
            componentHost3.A0I = false;
            componentHost3.A08 = null;
            componentHost3.A0A = null;
            componentHost3.A00 = Float.MIN_VALUE;
            componentHost3.A01 = Float.MIN_VALUE;
            componentHost3.A0F = false;
            componentHost3.A0J = false;
            componentHost3.setComponentTouchListener((AnonymousClass2Vf) null);
            componentHost3.A0B = null;
        }
    }

    public final /* synthetic */ Class CAe() {
        return getClass();
    }

    public final /* bridge */ /* synthetic */ Object ADM(Context context, Object obj, Object obj2, Object obj3) {
        return null;
    }
}
