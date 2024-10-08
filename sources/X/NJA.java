package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.List;

public final class NJA extends AnonymousClass4DH implements C227272iw {
    public static final String __redex_internal_original_name = "MessageSearchScrimScreenFragment";
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public List A06;
    public SearchEditText A07;
    public boolean A08;
    public final AnonymousClass0eM A09 = AnonymousClass0eN.A01(new C67570Mq4(this, 42));
    public final AnonymousClass0eM A0A = C227642jf.A02(this);

    public final void configureActionBar(2da r6) {
        0qQ.A0B(r6, 0);
        r6.Eu4(true);
        F3V f3v = new F3V(AnonymousClass05K.A00);
        f3v.A0A = C71401Ok0.A00(this, 30);
        if (this.A08) {
            f3v.A04 = 0;
            f3v.A0B = 2Yu.A0L(requireContext(), 16844000, true);
        }
        r6.ErJ(f3v.A00());
        SearchEditText ErO = r6.ErO();
        ErO.setSearchIconEnabled(false);
        ErO.requestFocus();
        ErO.A06();
        ErO.setHint("Search");
        ErO.A0C = new PRP(this, 1);
        this.A07 = ErO;
    }

    public final String getModuleName() {
        return "message_search_scrim_screen_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (this.A08) {
            View requireViewById = view.requireViewById(R.id.search_in_chat_scrim_action_bar);
            ViewGroup viewGroup = (ViewGroup) requireViewById;
            viewGroup.setVisibility(0);
            0qQ.A07(requireViewById);
            new 2dZ(C71401Ok0.A00(this, 31), viewGroup).A0X(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        if (r0 != null) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r5 = this;
            X.37E r0 = X.AnonymousClass37D.A00
            X.37D r3 = X.DbV.A0g(r5, r0)
            X.7Pu r2 = X.C48943Emh.A00(r3)
            r1 = 1
            if (r2 == 0) goto L_0x002e
            boolean r0 = r2.A0S()
            if (r0 == 0) goto L_0x002e
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r0 = r2.A03
            androidx.fragment.app.Fragment r0 = r0.A0M()
            if (r0 == 0) goto L_0x002e
            boolean r0 = r0.equals(r5)
            if (r0 != r1) goto L_0x002e
            if (r3 == 0) goto L_0x0026
            r3.A0X()
        L_0x0026:
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r5.A07
            if (r0 == 0) goto L_0x002d
            r0.A04()
        L_0x002d:
            return
        L_0x002e:
            X.0eM r4 = r5.A0A
            X.0lg r2 = X.DbT.A0X(r4)
            X.0Tu r3 = X.0Tu.A05
            r0 = 36311569076126302(0x81012e0005025e, double:3.026920726470359E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            if (r0 != 0) goto L_0x0060
            X.0lg r2 = X.DbT.A0X(r4)
            r0 = 36311569077109357(0x81012e0014026d, double:3.026920727092047E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            if (r0 != 0) goto L_0x0060
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            if (r0 == 0) goto L_0x0026
            X.0hq r0 = r0.getSupportFragmentManager()
            if (r0 == 0) goto L_0x0026
        L_0x005c:
            r0.A0c()
            goto L_0x0026
        L_0x0060:
            X.0hq r0 = r5.getParentFragmentManager()
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NJA.A00():void");
    }

    public final boolean COC() {
        return this.A08;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0A);
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = AnonymousClass0fD.A02(1301698269);
        NJA.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID");
        if (string != null) {
            this.A03 = string;
            String string2 = requireArguments.getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_NAME");
            if (string2 != null) {
                this.A04 = string2;
                String string3 = requireArguments.getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_TYPE");
                if (string3 != null) {
                    this.A05 = string3;
                    this.A08 = requireArguments.getBoolean("FRAGMENT_ARGUMENT_SHOULD_RENDER_ACTION_BAR", false);
                    String string4 = requireArguments.getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_CATEGORY");
                    if (string4 != null) {
                        this.A01 = string4;
                        this.A00 = requireArguments.getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_CUTOVER_OPEN_THREAD_ID", (String) null);
                        this.A06 = requireArguments.getParcelableArrayList("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_PENDING_RECIPIENTS");
                        this.A02 = requireArguments.getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_FBID", (String) null);
                        AnonymousClass0fD.A09(-529533182, A022);
                        return;
                    }
                    illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                    i = -1951376686;
                } else {
                    illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                    i = 1663870124;
                }
            } else {
                illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                i = 2030786519;
            }
        } else {
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = -2086583198;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1850996508);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.search_in_chat_scrim_screen, viewGroup, false);
        AnonymousClass0fD.A09(614393050, A022);
        return inflate;
    }
}
