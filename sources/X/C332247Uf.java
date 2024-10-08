package X;

import android.view.ContextThemeWrapper;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;

/* renamed from: X.7Uf  reason: invalid class name and case insensitive filesystem */
public final class C332247Uf implements C332257Ug {
    public final AnonymousClass4DH A00;
    public final C273414mX A01 = new C332287Uj(this);
    public final C332277Ui A02 = new C332267Uh(this);
    public final AnonymousClass0eK A03;

    public C332247Uf(AnonymousClass4DH r2, AnonymousClass0eK r3) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
        this.A03 = r3;
    }

    public final void CyY() {
        FragmentActivity activity;
        AnonymousClass4DH r3 = this.A00;
        if (r3.isAdded() && (activity = r3.getActivity()) != null && !activity.isFinishing()) {
            AnonymousClass2uJ.A04(r3.requireActivity(), C242363Tt.A01(new ContextThemeWrapper(r3.requireContext(), ((AnonymousClass7L2) this.A03.get()).A07.A0E), R.attr.backgroundColorSecondary));
        }
    }

    public final void Cyg() {
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            AnonymousClass37D A012 = AnonymousClass37D.A00.A01(activity);
            if (A012 == null || !((AnonymousClass37F) A012).A0g) {
                AnonymousClass2uJ.A04(activity, activity.getColor(R.color.igds_transparent_navigation_bar));
                2db.A02(activity, activity.getColor(R.color.fds_transparent));
            }
        }
    }

    public final void Cyt() {
        FragmentActivity activity;
        AnonymousClass4DH r2 = this.A00;
        if (r2.isAdded() && (activity = r2.getActivity()) != null && !activity.isFinishing()) {
            AnonymousClass2uJ.A04(r2.requireActivity(), ((AnonymousClass7L2) this.A03.get()).A07.A09);
        }
    }
}
