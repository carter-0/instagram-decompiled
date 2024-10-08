package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.fragment.app.Fragment;
import com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel;

/* renamed from: X.JfK  reason: case insensitive filesystem */
public final class C60078JfK extends 02Z {
    public final int A00;
    public final Object A01;

    public C60078JfK(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean A0X(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        IgLiveViewerLikesViewModel igLiveViewerLikesViewModel;
        if (7 - this.A00 == 0) {
            AnonymousClass7TG.A1T(viewGroup, view, accessibilityEvent);
            C60244Ji1 A012 = ((LGN) this.A01).A01();
            if ((A012 instanceof IgLiveViewerLikesViewModel) && (igLiveViewerLikesViewModel = (IgLiveViewerLikesViewModel) A012) != null) {
                IgLiveViewerLikesViewModel.A04(igLiveViewerLikesViewModel);
            }
        }
        return C60078JfK.super.A0X(viewGroup, view, accessibilityEvent);
    }

    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        CharSequence charSequence;
        switch (this.A00) {
            case 0:
                AnonymousClass7TG.A1N(view, accessibilityNodeInfoCompat);
                C60078JfK.super.A0Y(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setRoleDescription(((C353368Hi) this.A01).A01.getString(2131954408));
                return;
            case 1:
                AnonymousClass7TG.A1N(view, accessibilityNodeInfoCompat);
                C60078JfK.super.A0Y(view, accessibilityNodeInfoCompat);
                04x r0 = 04x.A0I;
                charSequence = ((C63955LFb) this.A01).A05.getResources().getString(2131969499);
                break;
            case 2:
                AnonymousClass7TG.A1N(view, accessibilityNodeInfoCompat);
                C60078JfK.super.A0Y(view, accessibilityNodeInfoCompat);
                charSequence = AnonymousClass7TF.A0d(DbV.A05((Fragment) this.A01), 2131967785);
                break;
            case 3:
                AnonymousClass7TG.A1N(view, accessibilityNodeInfoCompat);
                C60078JfK.super.A0Y(view, accessibilityNodeInfoCompat);
                charSequence = ((AnonymousClass9J6) this.A01).A00;
                break;
            case 4:
                C60078JfK.super.A0Y(view, accessibilityNodeInfoCompat);
                2eS.A05(accessibilityNodeInfoCompat, AnonymousClass05K.A01);
                charSequence = view.getResources().getText(2131974964);
                break;
            case 5:
                boolean A1Z = AnonymousClass7TG.A1Z(view, accessibilityNodeInfoCompat);
                C60078JfK.super.A0Y(view, accessibilityNodeInfoCompat);
                boolean z = true;
                accessibilityNodeInfoCompat.mInfo.setCheckable(A1Z);
                PR9 pr9 = (PR9) this.A01;
                accessibilityNodeInfoCompat.mInfo.setChecked(pr9.A0D);
                if (pr9.A0E || pr9.A0F) {
                    z = false;
                }
                accessibilityNodeInfoCompat.setEnabled(z);
                2eS.A05(accessibilityNodeInfoCompat, AnonymousClass05K.A04);
                return;
            case 6:
                AnonymousClass7TG.A1N(view, accessibilityNodeInfoCompat);
                C60078JfK.super.A0Y(view, accessibilityNodeInfoCompat);
                04x r02 = 04x.A0I;
                charSequence = ((C60677JpO) this.A01).A00.getString(2131953594);
                break;
            default:
                C60078JfK.super.A0Y(view, accessibilityNodeInfoCompat);
                return;
        }
        accessibilityNodeInfoCompat.addAction(new 04x(16, charSequence));
    }
}
