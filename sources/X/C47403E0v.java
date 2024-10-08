package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.Locale;

/* renamed from: X.E0v  reason: case insensitive filesystem */
public final class C47403E0v extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ContentNotesConsumptionNuxFragment";
    public C45217CsV A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String format;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            str = bundle2.getString(AnonymousClass000.A00(2930));
        } else {
            str = null;
        }
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.title);
        Context context = view.getContext();
        if (str == null) {
            format = context.getString(2131956617);
        } else {
            format = String.format(Locale.getDefault(), context.getString(2131956618), new Object[]{str});
        }
        A0R.setText(format);
        TextView A0R2 = AnonymousClass7TG.A0R(view, R.id.audience_text);
        AnonymousClass0eM r2 = this.A01;
        C48784Ek7.A00(A0R2, AnonymousClass7TE.A0l(r2), DbU.A0m(this, 2131956616));
        0xY A0p = AnonymousClass7TE.A0p(DbX.A0h(r2));
        A0p.E5T(AnonymousClass000.A00(3223), true);
        A0p.apply();
        ((C3021461u) AnonymousClass7TF.A0F(view, R.id.note_action_buttons)).setPrimaryAction(context.getString(2131956615), FP5.A00(this, 48));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1616727456);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.content_notes_nux_landing, viewGroup, false);
        AnonymousClass0fD.A09(425190566, A02);
        return inflate;
    }
}
