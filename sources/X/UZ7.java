package X;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import java.util.ArrayList;

public final class UZ7 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "PromoteCreateAudienceLocationsRegionalFragmentV2";
    public EditText A00;
    public TextView A01;
    public RecyclerView A02;
    public TextView A03;
    public RecyclerView A04;
    public C14794U9o A05;
    public final X3P A06 = new C19171WOd(this);
    public final C17956Vin A07 = new C17956Vin();
    public final AnonymousClass0eM A08 = C20702WxZ.A00(this, 20);
    public final AnonymousClass0eM A09 = C20702WxZ.A00(this, 21);
    public final AnonymousClass0eM A0A = C227642jf.A02(this);
    public final AnonymousClass0eM A0B = new C227862kA(new C20702WxZ(this, 22), new C20702WxZ(this, 23), new C41566AwY(24, (Object) null, this), new 0Yh(U92.class));
    public final TextWatcher A0C = new W7b(this, 6);
    public final X3N A0D = new WOW(this);

    public final String getModuleName() {
        return "promote_create_audience_locations_regional";
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.07Z, X.UZ7, java.lang.Object, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = DbU.A0E(view, R.id.search_bar_edit_text);
        this.A03 = DbU.A0G(view, R.id.search_empty_state_text_view);
        this.A04 = DbT.A0I(view, R.id.selected_locations_recycler_view);
        this.A02 = DbT.A0I(view, R.id.typeahead_recycler_view);
        C14794U9o u9o = new C14794U9o(this.A0D);
        this.A05 = u9o;
        RecyclerView recyclerView = this.A02;
        if (recyclerView == null) {
            str = "locationsTypeaheadRecyclerView";
        } else {
            recyclerView.setAdapter(u9o);
            U9m u9m = new U9m(this, 0);
            RecyclerView recyclerView2 = this.A04;
            if (recyclerView2 == null) {
                str = "selectedLocationsRecyclerView";
            } else {
                recyclerView2.setAdapter(u9m);
                EditText editText = this.A00;
                str = "searchEditText";
                if (editText != null) {
                    editText.setHint(2131970336);
                    EditText editText2 = this.A00;
                    if (editText2 != null) {
                        editText2.addTextChangedListener(this.A0C);
                        TextView textView = this.A03;
                        if (textView == null) {
                            str = "searchEmptyStateTextView";
                        } else {
                            textView.setText(2131970335);
                            A00(this, new ArrayList());
                            this.A01 = DbU.A0G(view, R.id.overlapping_location_warning_text);
                            AnonymousClass7TE.A1Z(new C66188MGz((Object) u9m, (Object) this, (AnonymousClass4D7) null, 2), AnonymousClass07a.A00(this));
                            return;
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A00(UZ7 uz7, 0sn r5) {
        String str;
        EditText editText = uz7.A00;
        if (editText == null) {
            str = "searchEditText";
        } else {
            Editable text = editText.getText();
            0qQ.A07(text);
            int i = 0;
            boolean A1Q = AnonymousClass7TF.A1Q(text.length());
            TextView textView = uz7.A03;
            if (textView == null) {
                str = "searchEmptyStateTextView";
            } else {
                textView.setVisibility(C13988Tno.A0E(A1Q));
                RecyclerView recyclerView = uz7.A04;
                if (recyclerView == null) {
                    str = "selectedLocationsRecyclerView";
                } else {
                    if (!A1Q) {
                        i = 8;
                    }
                    recyclerView.setVisibility(i);
                    C14794U9o u9o = uz7.A05;
                    if (u9o == null) {
                        str = "locationTypeaheadAdapter";
                    } else {
                        if (A1Q) {
                            r5 = 0sn.A00;
                        }
                        u9o.A00 = r5;
                        u9o.notifyDataSetChanged();
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0A);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1860162213);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_create_audience_locations_regional_view, viewGroup, false);
        AnonymousClass0fD.A09(-1852370027, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-400661503);
        super.onDestroyView();
        AnonymousClass0fD.A09(1307784664, A022);
    }
}
