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
import com.instagram.business.promote.model.PromoteAudienceInfo;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.UZo  reason: case insensitive filesystem */
public final class C15284UZo extends AnonymousClass4DH implements X3S {
    public static final String __redex_internal_original_name = "PromoteCreateAudienceLocationsRegionalFragment";
    public EditText A00;
    public TextView A01;
    public RecyclerView A02;
    public RecyclerView A03;
    public C14794U9o A04;
    public C14799U9t A05;
    public List A06 = new ArrayList();
    public TextView A07;
    public final TextWatcher A08 = new W7b(this, 5);
    public final X3N A09 = new WOV(this);
    public final X3P A0A = new C19170WOc(this);
    public final C17956Vin A0B = new C17956Vin();
    public final AnonymousClass0eM A0C = C20702WxZ.A00(this, 15);
    public final AnonymousClass0eM A0D = C20702WxZ.A00(this, 16);
    public final AnonymousClass0eM A0E = C20702WxZ.A00(this, 17);
    public final AnonymousClass0eM A0F = C20702WxZ.A00(this, 18);
    public final AnonymousClass0eM A0G = C20702WxZ.A00(this, 19);

    public final void Dab(PromoteState promoteState, Integer num) {
        List list;
        List list2;
        0qQ.A0B(num, 1);
        Integer num2 = AnonymousClass05K.A15;
        if (num == num2) {
            W2W w2w = C17149VKb.A00;
            AnonymousClass0eM r5 = this.A0E;
            if (!W2W.A04(((PromoteData) AnonymousClass7TE.A14(r5)).A0q.A07) && (list2 = this.A06) != null && !list2.isEmpty()) {
                List list3 = ((PromoteData) AnonymousClass7TE.A14(r5)).A0q.A07;
                if (list3 != null) {
                    List list4 = this.A06;
                    if (list4 != null) {
                        list3.removeAll(list4);
                        this.A06 = null;
                        PromoteState A0O = C13990Tnq.A0O(this.A0F);
                        PromoteData promoteData = (PromoteData) AnonymousClass7TE.A14(r5);
                        0qQ.A0B(promoteData, 0);
                        C18578VuU A012 = C18167Vmh.A01(promoteData);
                        A012.A07 = list3;
                        promoteData.A0q = A012.A01();
                        PromoteState.A01(A0O, num2);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            return;
        }
        Integer num3 = AnonymousClass05K.A1F;
        if (num == num3) {
            AnonymousClass0eM r52 = this.A0E;
            List list5 = ((PromoteData) AnonymousClass7TE.A14(r52)).A0p.A07;
            if (list5 != null && !list5.isEmpty()) {
                W2W w2w2 = C17149VKb.A00;
                if (!W2W.A04(list5) && (list = this.A06) != null && !list.isEmpty()) {
                    List list6 = this.A06;
                    if (list6 != null) {
                        list5.removeAll(list6);
                        this.A06 = null;
                        PromoteState A0O2 = C13990Tnq.A0O(this.A0F);
                        PromoteData promoteData2 = (PromoteData) AnonymousClass7TE.A14(r52);
                        0qQ.A0B(promoteData2, 0);
                        PromoteAudienceInfo promoteAudienceInfo = promoteData2.A0p;
                        0qQ.A06(promoteAudienceInfo);
                        C18578VuU A002 = C18167Vmh.A00(promoteAudienceInfo);
                        A002.A07 = list5;
                        promoteData2.A0p = A002.A01();
                        PromoteState.A01(A0O2, num3);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
    }

    public final String getModuleName() {
        return "promote_create_audience_locations_regional";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = DbU.A0E(view, R.id.search_bar_edit_text);
        this.A01 = DbU.A0G(view, R.id.search_empty_state_text_view);
        this.A03 = DbT.A0I(view, R.id.selected_locations_recycler_view);
        this.A02 = DbT.A0I(view, R.id.typeahead_recycler_view);
        C14794U9o u9o = new C14794U9o(this.A09);
        this.A04 = u9o;
        RecyclerView recyclerView = this.A02;
        if (recyclerView == null) {
            str = "locationsTypeaheadRecyclerView";
        } else {
            recyclerView.setAdapter(u9o);
            AnonymousClass0eM r3 = this.A0F;
            PromoteState A0O = C13990Tnq.A0O(r3);
            C14799U9t u9t = new C14799U9t(this.A0A, (PromoteData) AnonymousClass7TE.A14(this.A0E), A0O);
            this.A05 = u9t;
            RecyclerView recyclerView2 = this.A03;
            if (recyclerView2 == null) {
                str = "selectedLocationsRecyclerView";
            } else {
                recyclerView2.setAdapter(u9t);
                EditText editText = this.A00;
                if (editText != null) {
                    editText.setHint(2131970336);
                    EditText editText2 = this.A00;
                    if (editText2 != null) {
                        editText2.addTextChangedListener(this.A08);
                        TextView textView = this.A01;
                        if (textView == null) {
                            str = "searchEmptyStateTextView";
                        } else {
                            textView.setText(2131970335);
                            A01(this, new ArrayList());
                            this.A07 = DbU.A0G(view, R.id.overlapping_location_warning_text);
                            if (this.mUserVisibleHint) {
                                PromoteState.A01(C13990Tnq.A0O(r3), AnonymousClass05K.A1I);
                            }
                            C13990Tnq.A0O(r3).A0A(this);
                            return;
                        }
                    }
                }
                0qQ.A0F("searchEditText");
                throw AnonymousClass00P.createAndThrow();
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r0.isEmpty() != false) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C15284UZo r4) {
        /*
            java.util.List r0 = r4.A06
            r3 = 0
            if (r0 == 0) goto L_0x000c
            boolean r0 = r0.isEmpty()
            r2 = 0
            if (r0 == 0) goto L_0x000d
        L_0x000c:
            r2 = 1
        L_0x000d:
            java.lang.String r0 = "overlappingWarningTextView"
            android.widget.TextView r1 = r4.A07
            if (r2 != 0) goto L_0x0036
            if (r1 == 0) goto L_0x003e
            r1.setVisibility(r3)
            android.widget.TextView r3 = r4.A07
            if (r3 == 0) goto L_0x003e
            r2 = 2131952234(0x7f13026a, float:1.9540905E38)
            X.W2W r0 = X.C17149VKb.A00
            android.content.Context r1 = r4.requireContext()
            java.util.List r0 = r4.A06
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = X.W2W.A02(r1, r0)
            X.DbX.A1F(r3, r4, r0, r2)
            return
        L_0x0031:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0036:
            if (r1 == 0) goto L_0x003e
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x003e:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15284UZo.A00(X.UZo):void");
    }

    public static final void A01(C15284UZo uZo, 0sn r5) {
        String str;
        EditText editText = uZo.A00;
        if (editText == null) {
            str = "searchEditText";
        } else {
            Editable text = editText.getText();
            0qQ.A07(text);
            int i = 0;
            boolean A1Q = AnonymousClass7TF.A1Q(text.length());
            TextView textView = uZo.A01;
            if (textView == null) {
                str = "searchEmptyStateTextView";
            } else {
                textView.setVisibility(C13988Tno.A0E(A1Q));
                RecyclerView recyclerView = uZo.A03;
                if (recyclerView == null) {
                    str = "selectedLocationsRecyclerView";
                } else {
                    if (!A1Q) {
                        i = 8;
                    }
                    recyclerView.setVisibility(i);
                    C14794U9o u9o = uZo.A04;
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

    public final AnonymousClass0wW getSession() {
        return (AnonymousClass0wW) AnonymousClass7TE.A14(this.A0G);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(875642340);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_create_audience_locations_regional_view, viewGroup, false);
        AnonymousClass0fD.A09(-202946310, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(762708562);
        C13990Tnq.A0O(this.A0F).A0B(this);
        super.onDestroyView();
        AnonymousClass0fD.A09(-837946533, A022);
    }

    public final void onSetUserVisibleHint(boolean z, boolean z2) {
        super.onSetUserVisibleHint(z, z2);
        if (z) {
            PromoteState.A01(C13990Tnq.A0O(this.A0F), AnonymousClass05K.A1I);
        }
    }
}
