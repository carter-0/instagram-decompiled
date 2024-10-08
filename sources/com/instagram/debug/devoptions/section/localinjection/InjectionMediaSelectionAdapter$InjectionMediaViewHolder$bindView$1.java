package com.instagram.debug.devoptions.section.localinjection;

import android.widget.CompoundButton;
import com.instagram.debug.devoptions.section.localinjection.datastore.LocalInjectionUnit;
import java.util.Set;

public final class InjectionMediaSelectionAdapter$InjectionMediaViewHolder$bindView$1 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ LocalInjectionUnit $injectedMedia;
    public final /* synthetic */ InjectionMediaSelectionAdapter this$0;

    public InjectionMediaSelectionAdapter$InjectionMediaViewHolder$bindView$1(InjectionMediaSelectionAdapter injectionMediaSelectionAdapter, LocalInjectionUnit localInjectionUnit) {
        this.this$0 = injectionMediaSelectionAdapter;
        this.$injectedMedia = localInjectionUnit;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Set set = this.this$0.savedMediaInjections;
        String str = this.$injectedMedia.unitId;
        if (z) {
            set.add(str);
        } else {
            set.remove(str);
        }
        InjectionMediaSelectionAdapter injectionMediaSelectionAdapter = this.this$0;
        injectionMediaSelectionAdapter.delegate.onItemSelectionChanged(injectionMediaSelectionAdapter.savedMediaInjections);
    }
}
