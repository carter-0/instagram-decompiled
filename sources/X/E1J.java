package X;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.Set;

public final class E1J extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "DoNotTranslateBottomSheetFragment";
    public Set A00;
    public Context A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public final String getModuleName() {
        return "do_not_translate_bottomsheet_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewGroup A0I = DbX.A0I(view, R.id.do_not_translate_bottomsheet_layout);
        this.A00 = DbX.A0h(this.A02).A0J(0sc.A06(new String[]{00R.A03(DbT.A10(AnonymousClass1Q2.A02()), 2)}));
        EWL[] values = EWL.values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            EWL ewl = values[i];
            Context context = this.A01;
            String str = "context";
            if (context != null) {
                IgdsListCell igdsListCell = new IgdsListCell(context, (AttributeSet) null);
                Context context2 = this.A01;
                if (context2 != null) {
                    igdsListCell.A0I(AnonymousClass7TE.A16(context2, ewl.A00));
                    C69349Njo njo = C69349Njo.TYPE_CHECKBOX;
                    String A03 = 00R.A03(DbT.A10(AnonymousClass1Q2.A02()), 2);
                    String str2 = ewl.A01;
                    igdsListCell.A0G(njo, !0qQ.A0K(A03, str2));
                    Set set = this.A00;
                    if (set == null) {
                        str = "currentDoNotTranslateLanguages";
                    } else {
                        if (!set.contains(str2)) {
                            z = false;
                            if (!0qQ.A0K(str2, 00R.A03(DbT.A10(AnonymousClass1Q2.A02()), 2))) {
                                igdsListCell.setChecked(z);
                                igdsListCell.A0D(new FQP(2, (Object) igdsListCell, (Object) ewl, (Object) this));
                                A0I.addView(igdsListCell);
                                i++;
                            }
                        }
                        z = true;
                        igdsListCell.setChecked(z);
                        igdsListCell.A0D(new FQP(2, (Object) igdsListCell, (Object) ewl, (Object) this));
                        A0I.addView(igdsListCell);
                        i++;
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(658961838);
        E1J.super.onCreate(bundle);
        this.A01 = requireContext();
        AnonymousClass0fD.A09(138678033, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(583613704);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.do_not_translate_bottomsheet, false);
        AnonymousClass0fD.A09(-346136912, A022);
        return A0D;
    }
}
