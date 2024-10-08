package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.util.Iterator;

public final class H20 extends C273374mT {
    public static final String __redex_internal_original_name = "InformationFragment";
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass62P A03 = AnonymousClass62Q.A04(new N4G("SINGULAR_FACT", 2131956992, 11), new N4G("QUESTION_AND_ANSWER", 2131957021, 11));

    public final String getModuleName() {
        return "creator_ai_information_fragment";
    }

    public H20() {
        0eO r3 = 0eO.A02;
        this.A01 = C51975G9x.A0r(this, "creator_ai_entry_point_extra", r3, 46);
        this.A00 = C51975G9x.A0r(this, "creator_ai_creator_fbid", r3, 47);
        this.A02 = AnonymousClass0eN.A00(r3, new C58719IwS("SINGULAR_FACT", this, "creator_ai_initial_information_tab", 45));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1444265097);
        Iterator it = this.A03.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (0qQ.A0K(((N4G) it.next()).A01, this.A02.getValue())) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        ComposeView A0H = DbV.A0H(this, new JGD(i, 6, this), 1870842010);
        AnonymousClass0fD.A09(611103647, A022);
        return A0H;
    }
}
