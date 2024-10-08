package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* renamed from: X.DiS  reason: case insensitive filesystem */
public final class C46647DiS extends C14097Tpp {
    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        0qQ.A0B(context, 0);
        return new IgdsSwitch(context, (AttributeSet) null, 0);
    }

    public final /* bridge */ /* synthetic */ Object A0K(View view, C307786Rm r8, C276544tV r9, Object obj) {
        IgdsSwitch igdsSwitch = (IgdsSwitch) view;
        0qQ.A0B(igdsSwitch, 0);
        AnonymousClass7TF.A1B(r8, 1, r9);
        String A0F = r9.A0F();
        boolean z = true;
        boolean A0T = r9.A0T(true);
        if (A0F == null || !A0F.equals("on")) {
            z = false;
        }
        igdsSwitch.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        igdsSwitch.setChecked(z);
        C277014uI A0A = r9.A0A(40);
        if (A0A != null) {
            igdsSwitch.A07 = new FdP(r8, r9, A0A, A0F);
        }
        igdsSwitch.setOnCheckedChangeListener(new FQ1(1, r8, r9));
        igdsSwitch.setEnabled(A0T);
        return null;
    }

    public final /* bridge */ /* synthetic */ void A0M(View view, C307786Rm r4, C276544tV r5, Object obj, Object obj2) {
        IgdsSwitch igdsSwitch = (IgdsSwitch) view;
        0qQ.A0B(igdsSwitch, 0);
        igdsSwitch.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        igdsSwitch.A07 = null;
    }

    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw AnonymousClass00P.createAndThrow();
    }

    public C46647DiS(C307786Rm r1, C276544tV r2) {
        super(r1, r2);
    }
}
