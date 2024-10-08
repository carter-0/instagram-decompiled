package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CompoundButton;
import com.instagram.android.R;

/* renamed from: X.7DK  reason: invalid class name */
public final class AnonymousClass7DK implements AnonymousClass7D2 {
    public final C333097Xq A00;

    /* renamed from: A00 */
    public final void ADp(AnonymousClass7EU r4, AnonymousClass7AE r5) {
        0qQ.A0B(r4, 0);
        if (r5 != null) {
            C71662eb r2 = r4.A00;
            r2.A03(r5.A00);
            boolean z = r5.A02;
            ((CompoundButton) r2.A01()).setChecked(z);
            r2.A01().setSelected(z);
            AnonymousClass0fU.A00(new C66772McI(this, r5), r4.BJd());
        }
    }

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.bulk_selector_stub, viewGroup, false);
        0qQ.A0C(inflate, "null cannot be cast to non-null type android.view.ViewStub");
        return new AnonymousClass7EU(new C71662eb((ViewStub) inflate));
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r2) {
        AnonymousClass7EU r22 = (AnonymousClass7EU) r2;
        if (r22 != null) {
            r22.A00.A02();
        }
    }

    public AnonymousClass7DK(C333097Xq r1) {
        this.A00 = r1;
    }
}
