package com.instagram.debug.devoptions.direct.burner;

import X.0sP;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C46498Dg1;
import X.C49945FFy;
import X.C50989Fmc;
import X.C68504NKx;
import android.view.View;

public final class BurnerSendSettingsFragment$createMultiChoiceMenuItem$onClickListener$1 implements View.OnClickListener {
    public final /* synthetic */ String[] $displayValues;
    public final /* synthetic */ C68504NKx $itemsListAdapter;
    public final /* synthetic */ C50989Fmc $menuItem;
    public final /* synthetic */ 0sP $selectionCallback;
    public final /* synthetic */ CharSequence $title;
    public final /* synthetic */ Object[] $values;
    public final /* synthetic */ BurnerSendSettingsFragment this$0;

    public BurnerSendSettingsFragment$createMultiChoiceMenuItem$onClickListener$1(BurnerSendSettingsFragment burnerSendSettingsFragment, String[] strArr, 0sP r3, Object[] objArr, C50989Fmc fmc, CharSequence charSequence, C68504NKx nKx) {
        this.this$0 = burnerSendSettingsFragment;
        this.$displayValues = strArr;
        this.$selectionCallback = r3;
        this.$values = objArr;
        this.$menuItem = fmc;
        this.$title = charSequence;
        this.$itemsListAdapter = nKx;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1179909337);
        C46498Dg1 dg1 = new C46498Dg1(this.this$0.requireContext(), AnonymousClass7TE.A0l(this.this$0.session$delegate));
        int length = this.$displayValues.length;
        for (final int i = 0; i < length; i++) {
            final String str = this.$displayValues[i];
            final 0sP r5 = this.$selectionCallback;
            final Object[] objArr = this.$values;
            final C50989Fmc fmc = this.$menuItem;
            final CharSequence charSequence = this.$title;
            final C68504NKx nKx = this.$itemsListAdapter;
            dg1.A0C(str, new View.OnClickListener() {
                public final void onClick(View view) {
                    int A05 = AnonymousClass0fD.A05(1929446192);
                    r5.invoke(objArr[i]);
                    C50989Fmc fmc = fmc;
                    StringBuilder A1A = AnonymousClass7TE.A1A();
                    A1A.append(charSequence);
                    A1A.append(" : ");
                    fmc.A08 = AnonymousClass7TF.A0l(str, A1A);
                    C68504NKx nKx = nKx;
                    if (nKx != null) {
                        nKx.notifyDataSetChanged();
                    }
                    AnonymousClass0fD.A0C(-687680134, A05);
                }
            });
        }
        new C49945FFy(dg1).A05(this.this$0.requireContext());
        AnonymousClass0fD.A0C(-1524821874, A05);
    }
}
