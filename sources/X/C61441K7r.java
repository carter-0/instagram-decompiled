package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.actionbar.ActionButton;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.K7r  reason: case insensitive filesystem */
public final class C61441K7r extends AnonymousClass32G implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AccessibilitySettingsFragment";
    public UserSession A00;
    public C60049JeH A01;
    public C60405Jky A02;
    public boolean A03 = false;
    public boolean A04 = false;
    public final LinkedHashMap A05 = AnonymousClass7TE.A1H();

    public final String getModuleName() {
        return "accessibility_settings";
    }

    public final /* bridge */ /* synthetic */ 0lg A0Y() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Jbl, java.lang.Object] */
    public final void configureActionBar(2da r4) {
        ? obj = new Object();
        C59922Jbl.A02(DbV.A05(this), obj, 2131952938);
        ActionButton A002 = C59904JbT.A00(new LYB(this, 51), r4, obj);
        A002.setVisibility(0);
        r4.setIsLoading(false);
        A002.setEnabled(true);
    }

    public final boolean onBackPressed() {
        AnonymousClass37D A0i = DbT.A0i(getActivity());
        if (A0i == null || !A0i.A0X()) {
            return false;
        }
        return true;
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        int A022 = AnonymousClass0fD.A02(-1894914980);
        C61441K7r.super.onCreate(bundle);
        ArrayList A1C = AnonymousClass7TE.A1C();
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        LinkedHashMap A1H2 = AnonymousClass7TE.A1H();
        Bundle requireArguments = requireArguments();
        this.A00 = DbX.A0U(this);
        this.A03 = requireArguments.getBoolean("is_edit_flow");
        boolean z3 = requireArguments.getBoolean("should_load_media_from_path");
        this.A04 = z3;
        if (this.A03 || z3) {
            linkedHashMap2 = (LinkedHashMap) requireArguments.getSerializable("media_key_to_alt");
            linkedHashMap = (LinkedHashMap) requireArguments.getSerializable("media_key_to_path");
            if (!(linkedHashMap2 == null || linkedHashMap == null)) {
                z2 = true;
                z = this.A04;
            }
            A0V(this.A01);
            AnonymousClass0fD.A09(-182834597, A022);
        }
        FragmentActivity activity = getActivity();
        if ((activity instanceof C267854cK) && (activity instanceof C267834cI)) {
            C3499682q r1 = ((C267844cJ) activity).Ajn().A00;
            C267834cI r5 = (C267834cI) activity;
            if (!(r1 == null || r5 == null)) {
                Iterator A0w = JTP.A0w(r1);
                while (A0w.hasNext()) {
                    String BbR = JTO.A0Z(A0w).BbR();
                    AnonymousClass3Q2 BbQ = r5.BbQ(BbR);
                    if (BbQ != null && !BbQ.A12()) {
                        A1C.add(BbQ.A33);
                        this.A05.put(BbR, BbQ.A2j);
                        A1H2.put(BbQ.A33, BbR);
                        JTP.A1Q(BbQ.A33, A1H, BbQ.A01());
                    }
                }
            }
            if (A1C.size() > 1) {
                this.A02 = new C60405Jky(activity, this.A00, A1H, this.A05, A1H2, A1C);
            }
            linkedHashMap2 = this.A05;
            z2 = this.A03;
            z = this.A04;
            linkedHashMap = null;
        }
        A0V(this.A01);
        AnonymousClass0fD.A09(-182834597, A022);
        this.A01 = new C60049JeH(this, this.A00, linkedHashMap2, linkedHashMap, z2, z);
        A0V(this.A01);
        AnonymousClass0fD.A09(-182834597, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1965773359);
        if (getRootActivity() instanceof AnonymousClass2ZP) {
            ((AnonymousClass2ZP) getRootActivity()).Enj(8);
        }
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.fragment_alt_text);
        AnonymousClass0fD.A09(-1679375197, A022);
        return A0C;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1400807151);
        super.onDestroyView();
        if (getRootActivity() instanceof AnonymousClass2ZP) {
            ((AnonymousClass2ZP) getRootActivity()).Enj(0);
        }
        AnonymousClass0fD.A09(1768741370, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1865034031);
        C61441K7r.super.onPause();
        FragmentActivity activity = getActivity();
        if (!(activity == null || activity.getWindow() == null)) {
            activity.getWindow().setSoftInputMode(48);
        }
        AnonymousClass0fD.A09(1361410417, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-686550858);
        super.onResume();
        FragmentActivity activity = getActivity();
        if (!(activity == null || activity.getWindow() == null)) {
            activity.getWindow().setSoftInputMode(16);
        }
        AnonymousClass0fD.A09(744954672, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View A002;
        super.onViewCreated(view, bundle);
        0S7.A00(this);
        ListView listView = this.A04;
        if (listView != null) {
            listView.setRecyclerListener(new LZG(this));
            if (!this.A03 && !this.A04) {
                TextView A0G = DbU.A0G(view, R.id.alt_text_info_text_view);
                A0G.setVisibility(0);
                Resources A052 = DbV.A05(this);
                int i = 1;
                if (this.A02 != null) {
                    i = 2;
                }
                A0G.setText(A052.getQuantityString(R.plurals.alt_text_popup_description, i));
                TextView A0G2 = DbU.A0G(view, R.id.alt_text_link_text_view);
                String string = getString(2131952935);
                SpannableStringBuilder A0C = DbS.A0C(string);
                AnonymousClass7AV.A05(A0C, new C62146Kaz(this, DbV.A0n(requireContext(), 2Yu.A0D(requireContext()))), string);
                A0G2.setMovementMethod(AnonymousClass6LK.A00);
                A0G2.setVisibility(0);
                A0G2.setText(A0C);
                if (2eO.A00(getContext())) {
                    AnonymousClass0fU.A00(new LYB(this, 49), A0G2);
                }
            }
            C60405Jky jky = this.A02;
            if (jky != null) {
                listView.setVisibility(8);
                RecyclerView A0I = DbT.A0I(view, R.id.alt_text_carousel_view);
                A0I.setVisibility(0);
                A0I.setAdapter(jky);
            }
        }
        if (this.A03) {
            listView.addHeaderView(DbV.A0E(this).inflate(R.layout.header_row_alt_text, listView, false));
        } else if (!this.A04 && (A002 = JWN.A00(requireActivity(), new LYB(this, 50), AnonymousClass05K.A01, true)) != null) {
            DbT.A1A(DbV.A05(this), A002, 2131972502);
        }
    }
}
