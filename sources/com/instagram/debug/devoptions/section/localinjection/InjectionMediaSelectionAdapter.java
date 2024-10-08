package com.instagram.debug.devoptions.section.localinjection;

import X.00k;
import X.01V;
import X.0qQ;
import X.2Rw;
import X.AnonymousClass0fD;
import X.AnonymousClass0fU;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C249703kE;
import X.DbU;
import X.DbX;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.debug.devoptions.section.localinjection.datastore.LocalInjectionUnit;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class InjectionMediaSelectionAdapter extends 2Rw {
    public final Delegate delegate;
    public final List mediaInjectionsList;
    public final Set savedMediaInjections;

    public interface Delegate {
        void onItemSelectionChanged(Set set);
    }

    public final class InjectionMediaViewHolder extends C249703kE {
        public View injectedMediaRow;
        public IgdsSwitch injectedMediaSwitch;
        public TextView injectedMediaText;
        public final /* synthetic */ InjectionMediaSelectionAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public InjectionMediaViewHolder(InjectionMediaSelectionAdapter injectionMediaSelectionAdapter, View view) {
            super(view);
            0qQ.A0B(view, 2);
            this.this$0 = injectionMediaSelectionAdapter;
            this.injectedMediaSwitch = (IgdsSwitch) view.findViewById(R.id.inject_media_toggle_switch);
            this.injectedMediaText = AnonymousClass7TE.A0d(view, R.id.inject_media_toggle_text);
            this.injectedMediaRow = view;
        }

        public final void setInjectedMediaRow(View view) {
            0qQ.A0B(view, 0);
            this.injectedMediaRow = view;
        }

        public final void setInjectedMediaSwitch(IgdsSwitch igdsSwitch) {
            0qQ.A0B(igdsSwitch, 0);
            this.injectedMediaSwitch = igdsSwitch;
        }

        public final void setInjectedMediaText(TextView textView) {
            0qQ.A0B(textView, 0);
            this.injectedMediaText = textView;
        }

        public final void bindView(int i) {
            LocalInjectionUnit localInjectionUnit = (LocalInjectionUnit) this.this$0.mediaInjectionsList.get(i);
            this.injectedMediaText.setText(localInjectionUnit.unitName);
            this.injectedMediaSwitch.setOnCheckedChangeListener(new InjectionMediaSelectionAdapter$InjectionMediaViewHolder$bindView$1(this.this$0, localInjectionUnit));
            this.injectedMediaSwitch.setChecked(this.this$0.savedMediaInjections.contains(localInjectionUnit.unitId));
            AnonymousClass0fU.A00(new InjectionMediaSelectionAdapter$InjectionMediaViewHolder$bindView$2(this), this.injectedMediaRow);
        }

        public final View getInjectedMediaRow() {
            return this.injectedMediaRow;
        }

        public final IgdsSwitch getInjectedMediaSwitch() {
            return this.injectedMediaSwitch;
        }

        public final TextView getInjectedMediaText() {
            return this.injectedMediaText;
        }
    }

    public void onBindViewHolder(InjectionMediaViewHolder injectionMediaViewHolder, int i) {
        0qQ.A0B(injectionMediaViewHolder, 0);
        injectionMediaViewHolder.bindView(i);
    }

    public InjectionMediaViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new InjectionMediaViewHolder(this, DbU.A09(DbX.A0F(viewGroup, 0), viewGroup, R.layout.media_injection_toggle_row, false));
    }

    public final void updateList(List list) {
        0qQ.A0B(list, 0);
        List list2 = this.mediaInjectionsList;
        list2.clear();
        list2.addAll(list);
        01V.A1C(list2);
        notifyDataSetChanged();
    }

    public InjectionMediaSelectionAdapter(Delegate delegate2, List list, Set set) {
        AnonymousClass7TG.A1U(delegate2, list, set);
        this.delegate = delegate2;
        ArrayList arrayList = new ArrayList(list);
        01V.A1C(arrayList);
        this.mediaInjectionsList = arrayList;
        this.savedMediaInjections = 00k.A0j(set);
    }

    public int getItemCount() {
        int A03 = AnonymousClass0fD.A03(526402155);
        int size = this.mediaInjectionsList.size();
        AnonymousClass0fD.A0A(-1454723962, A03);
        return size;
    }

    public final void setMediaInjectionsList(List list, Set set) {
        AnonymousClass7TG.A1N(list, set);
        List list2 = this.mediaInjectionsList;
        list2.clear();
        list2.addAll(list);
        01V.A1C(list2);
        Set set2 = this.savedMediaInjections;
        set2.clear();
        set2.addAll(set);
        notifyDataSetChanged();
    }
}
